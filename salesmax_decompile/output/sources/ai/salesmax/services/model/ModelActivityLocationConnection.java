package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.ActivityLocation;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelActivityLocationConnection {
    private final List<ActivityLocation> items;
    private final String nextToken;

    public interface BuildStep {
        ModelActivityLocationConnection build();

        BuildStep items(List<ActivityLocation> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ActivityLocation> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelActivityLocationConnection.BuildStep
        public ModelActivityLocationConnection build() {
            return new ModelActivityLocationConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelActivityLocationConnection.BuildStep
        public BuildStep items(List<ActivityLocation> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelActivityLocationConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelActivityLocationConnection.Builder, ai.salesmax.services.model.ModelActivityLocationConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ActivityLocation>) list);
        }

        private CopyOfBuilder(List<ActivityLocation> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelActivityLocationConnection.Builder, ai.salesmax.services.model.ModelActivityLocationConnection.BuildStep
        public CopyOfBuilder items(List<ActivityLocation> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelActivityLocationConnection.Builder, ai.salesmax.services.model.ModelActivityLocationConnection.BuildStep
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
        if (obj == null || ModelActivityLocationConnection.class != obj.getClass()) {
            return false;
        }
        ModelActivityLocationConnection modelActivityLocationConnection = (ModelActivityLocationConnection) obj;
        return s6c.m47909a(getItems(), modelActivityLocationConnection.getItems()) && s6c.m47909a(getNextToken(), modelActivityLocationConnection.getNextToken());
    }

    public List<ActivityLocation> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelActivityLocationConnection(List<ActivityLocation> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
