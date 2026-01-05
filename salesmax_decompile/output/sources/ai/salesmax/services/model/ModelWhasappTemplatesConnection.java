package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.WhasappTemplates;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelWhasappTemplatesConnection {
    private final List<WhasappTemplates> items;
    private final String nextToken;

    public interface BuildStep {
        ModelWhasappTemplatesConnection build();

        BuildStep items(List<WhasappTemplates> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<WhasappTemplates> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelWhasappTemplatesConnection.BuildStep
        public ModelWhasappTemplatesConnection build() {
            return new ModelWhasappTemplatesConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelWhasappTemplatesConnection.BuildStep
        public BuildStep items(List<WhasappTemplates> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelWhasappTemplatesConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelWhasappTemplatesConnection.Builder, ai.salesmax.services.model.ModelWhasappTemplatesConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<WhasappTemplates>) list);
        }

        private CopyOfBuilder(List<WhasappTemplates> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelWhasappTemplatesConnection.Builder, ai.salesmax.services.model.ModelWhasappTemplatesConnection.BuildStep
        public CopyOfBuilder items(List<WhasappTemplates> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelWhasappTemplatesConnection.Builder, ai.salesmax.services.model.ModelWhasappTemplatesConnection.BuildStep
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
        if (obj == null || ModelWhasappTemplatesConnection.class != obj.getClass()) {
            return false;
        }
        ModelWhasappTemplatesConnection modelWhasappTemplatesConnection = (ModelWhasappTemplatesConnection) obj;
        return s6c.m47909a(getItems(), modelWhasappTemplatesConnection.getItems()) && s6c.m47909a(getNextToken(), modelWhasappTemplatesConnection.getNextToken());
    }

    public List<WhasappTemplates> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelWhasappTemplatesConnection(List<WhasappTemplates> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
