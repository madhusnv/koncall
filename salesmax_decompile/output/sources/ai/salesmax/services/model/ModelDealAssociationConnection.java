package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.DealAssociation;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelDealAssociationConnection {
    private final List<DealAssociation> items;
    private final String nextToken;

    public interface BuildStep {
        ModelDealAssociationConnection build();

        BuildStep items(List<DealAssociation> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<DealAssociation> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelDealAssociationConnection.BuildStep
        public ModelDealAssociationConnection build() {
            return new ModelDealAssociationConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelDealAssociationConnection.BuildStep
        public BuildStep items(List<DealAssociation> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelDealAssociationConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelDealAssociationConnection.Builder, ai.salesmax.services.model.ModelDealAssociationConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<DealAssociation>) list);
        }

        private CopyOfBuilder(List<DealAssociation> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelDealAssociationConnection.Builder, ai.salesmax.services.model.ModelDealAssociationConnection.BuildStep
        public CopyOfBuilder items(List<DealAssociation> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelDealAssociationConnection.Builder, ai.salesmax.services.model.ModelDealAssociationConnection.BuildStep
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
        if (obj == null || ModelDealAssociationConnection.class != obj.getClass()) {
            return false;
        }
        ModelDealAssociationConnection modelDealAssociationConnection = (ModelDealAssociationConnection) obj;
        return s6c.m47909a(getItems(), modelDealAssociationConnection.getItems()) && s6c.m47909a(getNextToken(), modelDealAssociationConnection.getNextToken());
    }

    public List<DealAssociation> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelDealAssociationConnection(List<DealAssociation> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
