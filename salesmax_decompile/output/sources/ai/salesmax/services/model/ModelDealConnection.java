package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.Deal;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelDealConnection {
    private final List<Deal> items;
    private final String nextToken;

    public interface BuildStep {
        ModelDealConnection build();

        BuildStep items(List<Deal> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<Deal> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelDealConnection.BuildStep
        public ModelDealConnection build() {
            return new ModelDealConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelDealConnection.BuildStep
        public BuildStep items(List<Deal> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelDealConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelDealConnection.Builder, ai.salesmax.services.model.ModelDealConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Deal>) list);
        }

        private CopyOfBuilder(List<Deal> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelDealConnection.Builder, ai.salesmax.services.model.ModelDealConnection.BuildStep
        public CopyOfBuilder items(List<Deal> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelDealConnection.Builder, ai.salesmax.services.model.ModelDealConnection.BuildStep
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
        if (obj == null || ModelDealConnection.class != obj.getClass()) {
            return false;
        }
        ModelDealConnection modelDealConnection = (ModelDealConnection) obj;
        return s6c.m47909a(getItems(), modelDealConnection.getItems()) && s6c.m47909a(getNextToken(), modelDealConnection.getNextToken());
    }

    public List<Deal> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelDealConnection(List<Deal> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
