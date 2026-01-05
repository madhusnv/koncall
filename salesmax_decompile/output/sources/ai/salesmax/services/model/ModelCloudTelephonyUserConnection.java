package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelCloudTelephonyUserConnection {
    private final List<CloudTelephonyUser> items;
    private final String nextToken;

    public interface BuildStep {
        ModelCloudTelephonyUserConnection build();

        BuildStep items(List<CloudTelephonyUser> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<CloudTelephonyUser> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelCloudTelephonyUserConnection.BuildStep
        public ModelCloudTelephonyUserConnection build() {
            return new ModelCloudTelephonyUserConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyUserConnection.BuildStep
        public BuildStep items(List<CloudTelephonyUser> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyUserConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelCloudTelephonyUserConnection.Builder, ai.salesmax.services.model.ModelCloudTelephonyUserConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<CloudTelephonyUser>) list);
        }

        private CopyOfBuilder(List<CloudTelephonyUser> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyUserConnection.Builder, ai.salesmax.services.model.ModelCloudTelephonyUserConnection.BuildStep
        public CopyOfBuilder items(List<CloudTelephonyUser> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelCloudTelephonyUserConnection.Builder, ai.salesmax.services.model.ModelCloudTelephonyUserConnection.BuildStep
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
        if (obj == null || ModelCloudTelephonyUserConnection.class != obj.getClass()) {
            return false;
        }
        ModelCloudTelephonyUserConnection modelCloudTelephonyUserConnection = (ModelCloudTelephonyUserConnection) obj;
        return s6c.m47909a(getItems(), modelCloudTelephonyUserConnection.getItems()) && s6c.m47909a(getNextToken(), modelCloudTelephonyUserConnection.getNextToken());
    }

    public List<CloudTelephonyUser> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelCloudTelephonyUserConnection(List<CloudTelephonyUser> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
