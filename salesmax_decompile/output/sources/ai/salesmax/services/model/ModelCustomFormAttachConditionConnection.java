package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.customFormAttachCondition;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public class ModelCustomFormAttachConditionConnection {
    private final List<customFormAttachCondition> items;
    private final String nextToken;

    public interface BuildStep {
        ModelCustomFormAttachConditionConnection build();

        BuildStep items(List<customFormAttachCondition> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<customFormAttachCondition> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.BuildStep
        public ModelCustomFormAttachConditionConnection build() {
            return new ModelCustomFormAttachConditionConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.BuildStep
        public BuildStep items(List<customFormAttachCondition> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.Builder, ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<customFormAttachCondition>) list);
        }

        private CopyOfBuilder(List<customFormAttachCondition> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.Builder, ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.BuildStep
        public CopyOfBuilder items(List<customFormAttachCondition> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.Builder, ai.salesmax.services.model.ModelCustomFormAttachConditionConnection.BuildStep
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelCustomFormAttachConditionConnection modelCustomFormAttachConditionConnection = (ModelCustomFormAttachConditionConnection) obj;
        return s6c.m47909a(getItems(), modelCustomFormAttachConditionConnection.getItems()) && s6c.m47909a(getNextToken(), modelCustomFormAttachConditionConnection.getNextToken());
    }

    public List<customFormAttachCondition> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelCustomFormAttachConditionConnection(List<customFormAttachCondition> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
