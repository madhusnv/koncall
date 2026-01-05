package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.EngagementUpdate;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelEngagementUpdateConnection {
    private final List<EngagementUpdate> items;
    private final String nextToken;

    public interface BuildStep {
        ModelEngagementUpdateConnection build();

        BuildStep items(List<EngagementUpdate> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<EngagementUpdate> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelEngagementUpdateConnection.BuildStep
        public ModelEngagementUpdateConnection build() {
            return new ModelEngagementUpdateConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelEngagementUpdateConnection.BuildStep
        public BuildStep items(List<EngagementUpdate> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelEngagementUpdateConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelEngagementUpdateConnection.Builder, ai.salesmax.services.model.ModelEngagementUpdateConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<EngagementUpdate>) list);
        }

        private CopyOfBuilder(List<EngagementUpdate> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelEngagementUpdateConnection.Builder, ai.salesmax.services.model.ModelEngagementUpdateConnection.BuildStep
        public CopyOfBuilder items(List<EngagementUpdate> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelEngagementUpdateConnection.Builder, ai.salesmax.services.model.ModelEngagementUpdateConnection.BuildStep
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
        if (obj == null || ModelEngagementUpdateConnection.class != obj.getClass()) {
            return false;
        }
        ModelEngagementUpdateConnection modelEngagementUpdateConnection = (ModelEngagementUpdateConnection) obj;
        return s6c.m47909a(getItems(), modelEngagementUpdateConnection.getItems()) && s6c.m47909a(getNextToken(), modelEngagementUpdateConnection.getNextToken());
    }

    public List<EngagementUpdate> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelEngagementUpdateConnection(List<EngagementUpdate> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
