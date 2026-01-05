package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public class ModelWabaPhoneNumberUserConnection {
    private final List<WabaPhoneNumberUser> items;
    private final String nextToken;

    public interface BuildStep {
        ModelWabaPhoneNumberUserConnection build();

        BuildStep items(List<WabaPhoneNumberUser> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<WabaPhoneNumberUser> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.BuildStep
        public ModelWabaPhoneNumberUserConnection build() {
            return new ModelWabaPhoneNumberUserConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.BuildStep
        public BuildStep items(List<WabaPhoneNumberUser> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.Builder, ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<WabaPhoneNumberUser>) list);
        }

        private CopyOfBuilder(List<WabaPhoneNumberUser> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.Builder, ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.BuildStep
        public CopyOfBuilder items(List<WabaPhoneNumberUser> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.Builder, ai.salesmax.services.model.ModelWabaPhoneNumberUserConnection.BuildStep
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
        ModelWabaPhoneNumberUserConnection modelWabaPhoneNumberUserConnection = (ModelWabaPhoneNumberUserConnection) obj;
        return s6c.m47909a(getItems(), modelWabaPhoneNumberUserConnection.getItems()) && s6c.m47909a(getNextToken(), modelWabaPhoneNumberUserConnection.getNextToken());
    }

    public List<WabaPhoneNumberUser> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelWabaPhoneNumberUserConnection(List<WabaPhoneNumberUser> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
