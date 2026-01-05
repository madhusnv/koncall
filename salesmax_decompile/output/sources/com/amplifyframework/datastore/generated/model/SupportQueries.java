package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "SupportQueries")
/* loaded from: classes5.dex */
public final class SupportQueries implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String category;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String query;

    @ModelField(targetType = "String")
    private final String queryType;

    @ModelField(targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("SupportQueries", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("SupportQueries", "accountId");
    public static final QueryField USER_ID = QueryField.field("SupportQueries", "userId");
    public static final QueryField QUERY = QueryField.field("SupportQueries", SearchIntents.EXTRA_QUERY);
    public static final QueryField CATEGORY = QueryField.field("SupportQueries", "category");
    public static final QueryField QUERY_TYPE = QueryField.field("SupportQueries", "queryType");
    public static final QueryField CREATED_AT = QueryField.field("SupportQueries", "createdAt");

    public interface BuildStep {
        BuildStep accountId(String str);

        SupportQueries build();

        BuildStep category(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep query(String str);

        BuildStep queryType(String str);

        BuildStep userId(String str);
    }

    public static class Builder implements BuildStep {
        private String accountId;
        private String category;
        private Temporal.DateTime createdAt;
        private String id;
        private String query;
        private String queryType;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public SupportQueries build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new SupportQueries(string, this.accountId, this.userId, this.query, this.category, this.queryType, this.createdAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep category(String str) {
            this.category = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep query(String str) {
            this.query = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep queryType(String str) {
            this.queryType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public BuildStep userId(String str) {
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Temporal.DateTime dateTime) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.query = str4;
            this.category = str5;
            this.queryType = str6;
            this.createdAt = dateTime;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Temporal.DateTime dateTime) {
            super(str, str2, str3, str4, str5, str6, dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.Builder, com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.Builder, com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public CopyOfBuilder category(String str) {
            return (CopyOfBuilder) super.category(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.Builder, com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.Builder, com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public CopyOfBuilder query(String str) {
            return (CopyOfBuilder) super.query(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.Builder, com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public CopyOfBuilder queryType(String str) {
            return (CopyOfBuilder) super.queryType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SupportQueries.Builder, com.amplifyframework.datastore.generated.model.SupportQueries.BuildStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static SupportQueries justId(String str) {
        return new SupportQueries(str, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.query, this.category, this.queryType, this.createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SupportQueries.class != obj.getClass()) {
            return false;
        }
        SupportQueries supportQueries = (SupportQueries) obj;
        return s6c.m47909a(getId(), supportQueries.getId()) && s6c.m47909a(getAccountId(), supportQueries.getAccountId()) && s6c.m47909a(getUserId(), supportQueries.getUserId()) && s6c.m47909a(getQuery(), supportQueries.getQuery()) && s6c.m47909a(getCategory(), supportQueries.getCategory()) && s6c.m47909a(getQueryType(), supportQueries.getQueryType()) && s6c.m47909a(getCreatedAt(), supportQueries.getCreatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCategory() {
        return this.category;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public String getQuery() {
        return this.query;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getQuery() + getCategory() + getQueryType() + getCreatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SupportQueries {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("query=" + String.valueOf(getQuery()) + ", ");
        sb.append("category=" + String.valueOf(getCategory()) + ", ");
        sb.append("queryType=" + String.valueOf(getQueryType()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createdAt=");
        sb2.append(String.valueOf(getCreatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private SupportQueries(String str, String str2, String str3, String str4, String str5, String str6, Temporal.DateTime dateTime) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.query = str4;
        this.category = str5;
        this.queryType = str6;
        this.createdAt = dateTime;
    }
}
