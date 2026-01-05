package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.EntityList;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelEntityListConnection {
    private final List<EntityList> items;
    private final String nextToken;

    public interface BuildStep {
        ModelEntityListConnection build();

        BuildStep items(List<EntityList> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<EntityList> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelEntityListConnection.BuildStep
        public ModelEntityListConnection build() {
            return new ModelEntityListConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelEntityListConnection.BuildStep
        public BuildStep items(List<EntityList> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelEntityListConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelEntityListConnection.Builder, ai.salesmax.services.model.ModelEntityListConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<EntityList>) list);
        }

        private CopyOfBuilder(List<EntityList> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelEntityListConnection.Builder, ai.salesmax.services.model.ModelEntityListConnection.BuildStep
        public CopyOfBuilder items(List<EntityList> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelEntityListConnection.Builder, ai.salesmax.services.model.ModelEntityListConnection.BuildStep
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
        if (obj == null || ModelEntityListConnection.class != obj.getClass()) {
            return false;
        }
        ModelEntityListConnection modelEntityListConnection = (ModelEntityListConnection) obj;
        return s6c.m47909a(getItems(), modelEntityListConnection.getItems()) && s6c.m47909a(getNextToken(), modelEntityListConnection.getNextToken());
    }

    public List<EntityList> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelEntityListConnection(List<EntityList> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
