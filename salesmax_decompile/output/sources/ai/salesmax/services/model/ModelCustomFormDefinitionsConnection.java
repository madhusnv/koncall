package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.CustomFormDefinitions;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public class ModelCustomFormDefinitionsConnection {
    private final List<CustomFormDefinitions> items;
    private final String nextToken;

    public interface BuildStep {
        ModelCustomFormDefinitionsConnection build();

        BuildStep items(List<CustomFormDefinitions> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<CustomFormDefinitions> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.BuildStep
        public ModelCustomFormDefinitionsConnection build() {
            return new ModelCustomFormDefinitionsConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.BuildStep
        public BuildStep items(List<CustomFormDefinitions> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.Builder, ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<CustomFormDefinitions>) list);
        }

        private CopyOfBuilder(List<CustomFormDefinitions> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.Builder, ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.BuildStep
        public CopyOfBuilder items(List<CustomFormDefinitions> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.Builder, ai.salesmax.services.model.ModelCustomFormDefinitionsConnection.BuildStep
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
        ModelCustomFormDefinitionsConnection modelCustomFormDefinitionsConnection = (ModelCustomFormDefinitionsConnection) obj;
        return s6c.m47909a(getItems(), modelCustomFormDefinitionsConnection.getItems()) && s6c.m47909a(getNextToken(), modelCustomFormDefinitionsConnection.getNextToken());
    }

    public List<CustomFormDefinitions> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelCustomFormDefinitionsConnection(List<CustomFormDefinitions> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
