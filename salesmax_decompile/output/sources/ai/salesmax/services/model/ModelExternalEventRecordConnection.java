package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.ExternalEventRecord;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelExternalEventRecordConnection {
    private final List<ExternalEventRecord> items;
    private final String nextToken;

    public interface BuildStep {
        ModelExternalEventRecordConnection build();

        BuildStep items(List<ExternalEventRecord> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ExternalEventRecord> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelExternalEventRecordConnection.BuildStep
        public ModelExternalEventRecordConnection build() {
            return new ModelExternalEventRecordConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelExternalEventRecordConnection.BuildStep
        public BuildStep items(List<ExternalEventRecord> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelExternalEventRecordConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelExternalEventRecordConnection.Builder, ai.salesmax.services.model.ModelExternalEventRecordConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ExternalEventRecord>) list);
        }

        private CopyOfBuilder(List<ExternalEventRecord> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelExternalEventRecordConnection.Builder, ai.salesmax.services.model.ModelExternalEventRecordConnection.BuildStep
        public CopyOfBuilder items(List<ExternalEventRecord> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelExternalEventRecordConnection.Builder, ai.salesmax.services.model.ModelExternalEventRecordConnection.BuildStep
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
        if (obj == null || ModelExternalEventRecordConnection.class != obj.getClass()) {
            return false;
        }
        ModelExternalEventRecordConnection modelExternalEventRecordConnection = (ModelExternalEventRecordConnection) obj;
        return s6c.m47909a(getItems(), modelExternalEventRecordConnection.getItems()) && s6c.m47909a(getNextToken(), modelExternalEventRecordConnection.getNextToken());
    }

    public List<ExternalEventRecord> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelExternalEventRecordConnection(List<ExternalEventRecord> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
