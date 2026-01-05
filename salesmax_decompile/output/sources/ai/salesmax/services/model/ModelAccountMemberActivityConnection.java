package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public class ModelAccountMemberActivityConnection {
    private final List<AccountMemberActivity> items;
    private final String nextToken;

    public interface BuildStep {
        ModelAccountMemberActivityConnection build();

        BuildStep items(List<AccountMemberActivity> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<AccountMemberActivity> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelAccountMemberActivityConnection.BuildStep
        public ModelAccountMemberActivityConnection build() {
            return new ModelAccountMemberActivityConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelAccountMemberActivityConnection.BuildStep
        public BuildStep items(List<AccountMemberActivity> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelAccountMemberActivityConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelAccountMemberActivityConnection.Builder, ai.salesmax.services.model.ModelAccountMemberActivityConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<AccountMemberActivity>) list);
        }

        private CopyOfBuilder(List<AccountMemberActivity> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelAccountMemberActivityConnection.Builder, ai.salesmax.services.model.ModelAccountMemberActivityConnection.BuildStep
        public CopyOfBuilder items(List<AccountMemberActivity> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelAccountMemberActivityConnection.Builder, ai.salesmax.services.model.ModelAccountMemberActivityConnection.BuildStep
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
        ModelAccountMemberActivityConnection modelAccountMemberActivityConnection = (ModelAccountMemberActivityConnection) obj;
        return s6c.m47909a(getItems(), modelAccountMemberActivityConnection.getItems()) && s6c.m47909a(getNextToken(), modelAccountMemberActivityConnection.getNextToken());
    }

    public List<AccountMemberActivity> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelAccountMemberActivityConnection(List<AccountMemberActivity> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
