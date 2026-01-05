package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelAccountMembershipConnection {
    private final List<AccountMembership> items;
    private final String nextToken;

    public interface BuildStep {
        ModelAccountMembershipConnection build();

        BuildStep items(List<AccountMembership> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<AccountMembership> items;
        private String nextToken;

        @Override // com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.BuildStep
        public ModelAccountMembershipConnection build() {
            return new ModelAccountMembershipConnection(this.items, this.nextToken);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.BuildStep
        public BuildStep items(List<AccountMembership> list) {
            this.items = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.Builder, com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<AccountMembership>) list);
        }

        private CopyOfBuilder(List<AccountMembership> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.Builder, com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.BuildStep
        public CopyOfBuilder items(List<AccountMembership> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.Builder, com.amplifyframework.datastore.generated.model.ModelAccountMembershipConnection.BuildStep
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
        if (obj == null || ModelAccountMembershipConnection.class != obj.getClass()) {
            return false;
        }
        ModelAccountMembershipConnection modelAccountMembershipConnection = (ModelAccountMembershipConnection) obj;
        return s6c.m47909a(getItems(), modelAccountMembershipConnection.getItems()) && s6c.m47909a(getNextToken(), modelAccountMembershipConnection.getNextToken());
    }

    public List<AccountMembership> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelAccountMembershipConnection(List<AccountMembership> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
