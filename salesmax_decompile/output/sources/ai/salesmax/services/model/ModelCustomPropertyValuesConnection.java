package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.CustomPropertyValues;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public class ModelCustomPropertyValuesConnection {
    private final List<CustomPropertyValues> items;
    private final String nextToken;

    public interface BuildStep {
        ModelCustomPropertyValuesConnection build();

        BuildStep items(List<CustomPropertyValues> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<CustomPropertyValues> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelCustomPropertyValuesConnection.BuildStep
        public ModelCustomPropertyValuesConnection build() {
            return new ModelCustomPropertyValuesConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelCustomPropertyValuesConnection.BuildStep
        public BuildStep items(List<CustomPropertyValues> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelCustomPropertyValuesConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelCustomPropertyValuesConnection.Builder, ai.salesmax.services.model.ModelCustomPropertyValuesConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<CustomPropertyValues>) list);
        }

        private CopyOfBuilder(List<CustomPropertyValues> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelCustomPropertyValuesConnection.Builder, ai.salesmax.services.model.ModelCustomPropertyValuesConnection.BuildStep
        public CopyOfBuilder items(List<CustomPropertyValues> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelCustomPropertyValuesConnection.Builder, ai.salesmax.services.model.ModelCustomPropertyValuesConnection.BuildStep
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
        ModelCustomPropertyValuesConnection modelCustomPropertyValuesConnection = (ModelCustomPropertyValuesConnection) obj;
        return s6c.m47909a(getItems(), modelCustomPropertyValuesConnection.getItems()) && s6c.m47909a(getNextToken(), modelCustomPropertyValuesConnection.getNextToken());
    }

    public List<CustomPropertyValues> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelCustomPropertyValuesConnection(List<CustomPropertyValues> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
