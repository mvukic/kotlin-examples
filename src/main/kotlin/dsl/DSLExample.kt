package dsl

import java.util.*

@DslMarker
annotation class ProductDsl

data class Product(
    val productNumber: String,
    val productFamily: String,
    val stakeholder: String,
    val revisions: List<Revision>
)
data class Revision(
    val revisionNumber: String,
    val modified: Date
)

fun product(block: ProductBuilder.() -> Unit): Product = ProductBuilder().apply(block).build()

@ProductDsl
class ProductBuilder {
    var productNumber: String = ""
    var productFamily: String = ""
    var stakeholder: String = ""
    private val revisions = mutableListOf<Revision>()

    fun revisions(block: REVISIONS.() -> Unit) {
        revisions.addAll(REVISIONS().apply(block))
    }

    fun build(): Product = Product(productNumber, productFamily, stakeholder, revisions)
}

@ProductDsl
class RevisionBuilder {
    var revisionNumber: String = ""
    var modified: Date = Date()

    fun build(): Revision = Revision(revisionNumber, modified)
}

@ProductDsl
class REVISIONS: ArrayList<Revision>() {
    fun revision(block: RevisionBuilder.() -> Unit) {
        add(RevisionBuilder().apply(block).build())
    }
}

fun main() {
    val product = product {
        productNumber = "FAP12345"
        productFamily = "product family name"
        stakeholder = "Stakeholder name"
        revisions {
            revision {
                modified = Date()
                revisionNumber = "1.0"
            }
            revision {
                modified = Date()
                revisionNumber = "1.2"
            }
        }
    }

}