package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.CloudTelephonyAccount;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelCloudTelephonyAccountConnection {
    private final List<CloudTelephonyAccount> items;
    private final String nextToken;

    public interface BuildStep {
        ModelCloudTelephonyAccountConnection build();

        BuildStep items(List<CloudTelephonyAccount> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<CloudTelephonyAccount> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.BuildStep
        public ModelCloudTelephonyAccountConnection build() {
            return new ModelCloudTelephonyAccountConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.BuildStep
        public BuildStep items(List<CloudTelephonyAccount> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.Builder, ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<CloudTelephonyAccount>) list);
        }

        private CopyOfBuilder(List<CloudTelephonyAccount> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.Builder, ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.BuildStep
        public CopyOfBuilder items(List<CloudTelephonyAccount> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.Builder, ai.salesmax.services.model.ModelCloudTelephonyAccountConnection.BuildStep
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
        if (obj == null || ModelCloudTelephonyAccountConnection.class != obj.getClass()) {
            return false;
        }
        ModelCloudTelephonyAccountConnection modelCloudTelephonyAccountConnection = (ModelCloudTelephonyAccountConnection) obj;
        return s6c.m47909a(getItems(), modelCloudTelephonyAccountConnection.getItems()) && s6c.m47909a(getNextToken(), modelCloudTelephonyAccountConnection.getNextToken());
    }

    public List<CloudTelephonyAccount> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelCloudTelephonyAccountConnection(List<CloudTelephonyAccount> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
