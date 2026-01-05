package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.ProductService;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelProductServiceConnection {
    private final List<ProductService> items;
    private final String nextToken;

    public interface BuildStep {
        ModelProductServiceConnection build();

        BuildStep items(List<ProductService> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ProductService> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelProductServiceConnection.BuildStep
        public ModelProductServiceConnection build() {
            return new ModelProductServiceConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelProductServiceConnection.BuildStep
        public BuildStep items(List<ProductService> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelProductServiceConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelProductServiceConnection.Builder, ai.salesmax.services.model.ModelProductServiceConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ProductService>) list);
        }

        private CopyOfBuilder(List<ProductService> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelProductServiceConnection.Builder, ai.salesmax.services.model.ModelProductServiceConnection.BuildStep
        public CopyOfBuilder items(List<ProductService> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelProductServiceConnection.Builder, ai.salesmax.services.model.ModelProductServiceConnection.BuildStep
        public CopyOfBuilder nextToken(String str) {
            return (CopyOfBuilder) super.nextToken(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.items, this.nextToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelProductServiceConnection.class != obj.getClass()) {
            return false;
        }
        ModelProductServiceConnection modelProductServiceConnection = (ModelProductServiceConnection) obj;
        return s6c.m47909a(getItems(), modelProductServiceConnection.getItems()) && s6c.m47909a(getNextToken(), modelProductServiceConnection.getNextToken());
    }

    public List<ProductService> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelProductServiceConnection(List<ProductService> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
