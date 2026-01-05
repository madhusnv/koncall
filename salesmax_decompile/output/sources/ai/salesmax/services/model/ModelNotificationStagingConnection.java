package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.NotificationStaging;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelNotificationStagingConnection {
    private final List<NotificationStaging> items;
    private final String nextToken;

    public interface BuildStep {
        ModelNotificationStagingConnection build();

        BuildStep items(List<NotificationStaging> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<NotificationStaging> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelNotificationStagingConnection.BuildStep
        public ModelNotificationStagingConnection build() {
            return new ModelNotificationStagingConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelNotificationStagingConnection.BuildStep
        public BuildStep items(List<NotificationStaging> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelNotificationStagingConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelNotificationStagingConnection.Builder, ai.salesmax.services.model.ModelNotificationStagingConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<NotificationStaging>) list);
        }

        private CopyOfBuilder(List<NotificationStaging> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelNotificationStagingConnection.Builder, ai.salesmax.services.model.ModelNotificationStagingConnection.BuildStep
        public CopyOfBuilder items(List<NotificationStaging> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelNotificationStagingConnection.Builder, ai.salesmax.services.model.ModelNotificationStagingConnection.BuildStep
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
        if (obj == null || ModelNotificationStagingConnection.class != obj.getClass()) {
            return false;
        }
        ModelNotificationStagingConnection modelNotificationStagingConnection = (ModelNotificationStagingConnection) obj;
        return s6c.m47909a(getItems(), modelNotificationStagingConnection.getItems()) && s6c.m47909a(getNextToken(), modelNotificationStagingConnection.getNextToken());
    }

    public List<NotificationStaging> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelNotificationStagingConnection(List<NotificationStaging> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
