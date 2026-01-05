package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CustomPropertyIndexForAccounts")
/* loaded from: classes5.dex */
public final class CustomPropertyIndexForAccount implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Int")
    private final Integer boolIndex;

    @ModelField(targetType = "Int")
    private final Integer boolIndexUser;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer numIndex;

    @ModelField(targetType = "Int")
    private final Integer numIndexUser;

    @ModelField(targetType = "Int")
    private final Integer textIndex;

    @ModelField(targetType = "Int")
    private final Integer textIndexUser;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CustomPropertyIndexForAccount", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CustomPropertyIndexForAccount", "accountId");
    public static final QueryField TEXT_INDEX = QueryField.field("CustomPropertyIndexForAccount", "textIndex");
    public static final QueryField NUM_INDEX = QueryField.field("CustomPropertyIndexForAccount", "numIndex");
    public static final QueryField BOOL_INDEX = QueryField.field("CustomPropertyIndexForAccount", "boolIndex");
    public static final QueryField TEXT_INDEX_USER = QueryField.field("CustomPropertyIndexForAccount", "textIndexUser");
    public static final QueryField NUM_INDEX_USER = QueryField.field("CustomPropertyIndexForAccount", "numIndexUser");
    public static final QueryField BOOL_INDEX_USER = QueryField.field("CustomPropertyIndexForAccount", "boolIndexUser");
    public static final QueryField CREATED_AT = QueryField.field("CustomPropertyIndexForAccount", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CustomPropertyIndexForAccount", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep boolIndex(Integer num);

        BuildStep boolIndexUser(Integer num);

        CustomPropertyIndexForAccount build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep numIndex(Integer num);

        BuildStep numIndexUser(Integer num);

        BuildStep textIndex(Integer num);

        BuildStep textIndexUser(Integer num);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Integer boolIndex;
        private Integer boolIndexUser;
        private Temporal.DateTime createdAt;
        private String id;
        private Integer numIndex;
        private Integer numIndexUser;
        private Integer textIndex;
        private Integer textIndexUser;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep boolIndex(Integer num) {
            this.boolIndex = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep boolIndexUser(Integer num) {
            this.boolIndexUser = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CustomPropertyIndexForAccount build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CustomPropertyIndexForAccount(string, this.accountId, this.textIndex, this.numIndex, this.boolIndex, this.textIndexUser, this.numIndexUser, this.boolIndexUser, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep numIndex(Integer num) {
            this.numIndex = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep numIndexUser(Integer num) {
            this.numIndexUser = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep textIndex(Integer num) {
            this.textIndex = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep textIndexUser(Integer num) {
            this.textIndexUser = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.textIndex = num;
            this.numIndex = num2;
            this.boolIndex = num3;
            this.textIndexUser = num4;
            this.numIndexUser = num5;
            this.boolIndexUser = num6;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, num, num2, num3, num4, num5, num6, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder boolIndex(Integer num) {
            return (CopyOfBuilder) super.boolIndex(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder boolIndexUser(Integer num) {
            return (CopyOfBuilder) super.boolIndexUser(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder numIndex(Integer num) {
            return (CopyOfBuilder) super.numIndex(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder numIndexUser(Integer num) {
            return (CopyOfBuilder) super.numIndexUser(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder textIndex(Integer num) {
            return (CopyOfBuilder) super.textIndex(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder textIndexUser(Integer num) {
            return (CopyOfBuilder) super.textIndexUser(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyIndexForAccount.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CustomPropertyIndexForAccount justId(String str) {
        return new CustomPropertyIndexForAccount(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.textIndex, this.numIndex, this.boolIndex, this.textIndexUser, this.numIndexUser, this.boolIndexUser, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomPropertyIndexForAccount.class != obj.getClass()) {
            return false;
        }
        CustomPropertyIndexForAccount customPropertyIndexForAccount = (CustomPropertyIndexForAccount) obj;
        return s6c.m47909a(getId(), customPropertyIndexForAccount.getId()) && s6c.m47909a(getAccountId(), customPropertyIndexForAccount.getAccountId()) && s6c.m47909a(getTextIndex(), customPropertyIndexForAccount.getTextIndex()) && s6c.m47909a(getNumIndex(), customPropertyIndexForAccount.getNumIndex()) && s6c.m47909a(getBoolIndex(), customPropertyIndexForAccount.getBoolIndex()) && s6c.m47909a(getTextIndexUser(), customPropertyIndexForAccount.getTextIndexUser()) && s6c.m47909a(getNumIndexUser(), customPropertyIndexForAccount.getNumIndexUser()) && s6c.m47909a(getBoolIndexUser(), customPropertyIndexForAccount.getBoolIndexUser()) && s6c.m47909a(getCreatedAt(), customPropertyIndexForAccount.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), customPropertyIndexForAccount.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Integer getBoolIndex() {
        return this.boolIndex;
    }

    public Integer getBoolIndexUser() {
        return this.boolIndexUser;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public Integer getNumIndex() {
        return this.numIndex;
    }

    public Integer getNumIndexUser() {
        return this.numIndexUser;
    }

    public Integer getTextIndex() {
        return this.textIndex;
    }

    public Integer getTextIndexUser() {
        return this.textIndexUser;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getTextIndex() + getNumIndex() + getBoolIndex() + getTextIndexUser() + getNumIndexUser() + getBoolIndexUser() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomPropertyIndexForAccount {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("textIndex=" + String.valueOf(getTextIndex()) + ", ");
        sb.append("numIndex=" + String.valueOf(getNumIndex()) + ", ");
        sb.append("boolIndex=" + String.valueOf(getBoolIndex()) + ", ");
        sb.append("textIndexUser=" + String.valueOf(getTextIndexUser()) + ", ");
        sb.append("numIndexUser=" + String.valueOf(getNumIndexUser()) + ", ");
        sb.append("boolIndexUser=" + String.valueOf(getBoolIndexUser()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CustomPropertyIndexForAccount(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.textIndex = num;
        this.numIndex = num2;
        this.boolIndex = num3;
        this.textIndexUser = num4;
        this.numIndexUser = num5;
        this.boolIndexUser = num6;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
