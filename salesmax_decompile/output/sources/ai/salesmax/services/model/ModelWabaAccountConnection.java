package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.WabaAccount;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelWabaAccountConnection {
    private final List<WabaAccount> items;
    private final String nextToken;

    public interface BuildStep {
        ModelWabaAccountConnection build();

        BuildStep items(List<WabaAccount> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<WabaAccount> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelWabaAccountConnection.BuildStep
        public ModelWabaAccountConnection build() {
            return new ModelWabaAccountConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelWabaAccountConnection.BuildStep
        public BuildStep items(List<WabaAccount> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelWabaAccountConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelWabaAccountConnection.Builder, ai.salesmax.services.model.ModelWabaAccountConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<WabaAccount>) list);
        }

        private CopyOfBuilder(List<WabaAccount> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelWabaAccountConnection.Builder, ai.salesmax.services.model.ModelWabaAccountConnection.BuildStep
        public CopyOfBuilder items(List<WabaAccount> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelWabaAccountConnection.Builder, ai.salesmax.services.model.ModelWabaAccountConnection.BuildStep
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
        if (obj == null || ModelWabaAccountConnection.class != obj.getClass()) {
            return false;
        }
        ModelWabaAccountConnection modelWabaAccountConnection = (ModelWabaAccountConnection) obj;
        return s6c.m47909a(getItems(), modelWabaAccountConnection.getItems()) && s6c.m47909a(getNextToken(), modelWabaAccountConnection.getNextToken());
    }

    public List<WabaAccount> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelWabaAccountConnection(List<WabaAccount> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
