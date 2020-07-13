package dsl.concrete;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
public class ProductReleaseDataModel {

    @Builder
    @NoArgsConstructor
    public final static class Requested {
        @Builder.Default
        public List<String> packageNumbers = new ArrayList<>();
    }

    @Builder
    @NoArgsConstructor
    public final static class Metadata {
        @Builder.Default
        public Requested requested = new Requested();
    }

    @Builder
    @NoArgsConstructor
    public final static class Revision {
        @Builder.Default
        public Integer revisionId = -1;
        @Builder.Default
        public String releaseUuid = "";
        @Builder.Default
        public String revState = "";
        @Builder.Default
        public String modified = "";
        @Builder.Default
        public String modifiedBy = "";
    }

    @Builder
    @NoArgsConstructor
    public final static class Product {
        @Builder.Default
        public String portfolio = "";
        @Builder.Default
        public String stakeholder = "";
        @Builder.Default
        public String name = "";
        @Builder.Default
        public String shortName = "";
        @Builder.Default
        public String version = "";
        @Builder.Default
        public String packageNumber = "";
        @Builder.Default
        public List<Revision> revisions = new ArrayList<>();
    }

    @Builder
    @NoArgsConstructor
    public final static class Data {
        @Builder.Default
        public List<Product> products = new ArrayList<>();
    }

    public Metadata metadata = new Metadata();
    public Data data = new Data();

}
