package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.SavedTableViews;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelSavedTableViewsConnection {
    private final List<SavedTableViews> items;
    private final String nextToken;

    public interface BuildStep {
        ModelSavedTableViewsConnection build();

        BuildStep items(List<SavedTableViews> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<SavedTableViews> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelSavedTableViewsConnection.BuildStep
        public ModelSavedTableViewsConnection build() {
            return new ModelSavedTableViewsConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelSavedTableViewsConnection.BuildStep
        public BuildStep items(List<SavedTableViews> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelSavedTableViewsConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelSavedTableViewsConnection.Builder, ai.salesmax.services.model.ModelSavedTableViewsConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<SavedTableViews>) list);
        }

        private CopyOfBuilder(List<SavedTableViews> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelSavedTableViewsConnection.Builder, ai.salesmax.services.model.ModelSavedTableViewsConnection.BuildStep
        public CopyOfBuilder items(List<SavedTableViews> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelSavedTableViewsConnection.Builder, ai.salesmax.services.model.ModelSavedTableViewsConnection.BuildStep
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
        if (obj == null || ModelSavedTableViewsConnection.class != obj.getClass()) {
            return false;
        }
        ModelSavedTableViewsConnection modelSavedTableViewsConnection = (ModelSavedTableViewsConnection) obj;
        return s6c.m47909a(getItems(), modelSavedTableViewsConnection.getItems()) && s6c.m47909a(getNextToken(), modelSavedTableViewsConnection.getNextToken());
    }

    public List<SavedTableViews> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelSavedTableViewsConnection(List<SavedTableViews> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
