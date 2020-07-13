package dsl.concrete;

import java.util.ArrayList;
import java.util.List;

public class JavaUsage {

    public static void main(String[] args) {
        List<String> packageNumbers = new ArrayList<>();
        packageNumbers.add("FAP12345");

        List<ProductReleaseDataModel.Revision> revisions = new ArrayList<>();
        ProductReleaseDataModel.Revision revision = ProductReleaseDataModel.Revision
                .builder()
                .build();
        revisions.add(revision);

        List<ProductReleaseDataModel.Product> products = new ArrayList<>();
        ProductReleaseDataModel.Product product = ProductReleaseDataModel.Product
                .builder()
                .name("Name")
                .packageNumber("FAP12345")
                .portfolio("Portfolio")
                .version("1.2.3")
                .stakeholder("Stakeholder")
                .shortName("Short name")
                .revisions(revisions)
                .build();
        products.add(product);

        ProductReleaseDataModel productReleaseDataModel = ProductReleaseDataModel
                .builder()
                .metadata(ProductReleaseDataModel.Metadata
                        .builder()
                        .requested(ProductReleaseDataModel.Requested
                                .builder()
                                .packageNumbers(packageNumbers)
                                .build()
                        )
                        .build()
                )
                .data(ProductReleaseDataModel.Data
                        .builder()
                        .products(products)
                        .build()
                )
                .build();
        System.out.println(productReleaseDataModel);
    }

}
