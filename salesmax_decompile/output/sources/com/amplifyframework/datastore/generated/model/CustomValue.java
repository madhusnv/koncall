package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "parentObjectId", "propertyDefinitionId"}, name = SQLiteCommandFactory.UNDEFINED), @Index(fields = {"createSourceId", "createSourceType"}, name = "valueBySource")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CustomValues")
/* loaded from: classes5.dex */
public final class CustomValue implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String createSourceId;

    @ModelField(targetType = "String")
    private final String createSourceType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "ID")
    private final String parentObjectId;

    @ModelField(targetType = "String")
    private final String parentObjectType;

    @ModelField(targetType = "CustomPropertyDefinitions")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = CustomPropertyDefinitions.class)
    private final CustomPropertyDefinitions propertyDefinition;

    @ModelField(isRequired = true, targetType = "ID")
    private final String propertyDefinitionId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "String")
    private final String value;
    public static final QueryField ID = QueryField.field("CustomValue", OutcomeConstants.OUTCOME_ID);
    public static final QueryField PROPERTY_DEFINITION_ID = QueryField.field("CustomValue", "propertyDefinitionId");
    public static final QueryField ACCOUNT_ID = QueryField.field("CustomValue", "accountId");
    public static final QueryField PARENT_OBJECT_ID = QueryField.field("CustomValue", "parentObjectId");
    public static final QueryField PARENT_OBJECT_TYPE = QueryField.field("CustomValue", "parentObjectType");
    public static final QueryField VALUE = QueryField.field("CustomValue", "value");
    public static final QueryField CREATE_SOURCE_ID = QueryField.field("CustomValue", "createSourceId");
    public static final QueryField CREATE_SOURCE_TYPE = QueryField.field("CustomValue", "createSourceType");
    public static final QueryField CREATED_AT = QueryField.field("CustomValue", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CustomValue", "updatedAt");

    public interface AccountIdStep {
        ParentObjectIdStep accountId(String str);
    }

    public interface BuildStep {
        CustomValue build();

        BuildStep createSourceId(String str);

        BuildStep createSourceType(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep parentObjectType(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements PropertyDefinitionIdStep, AccountIdStep, ParentObjectIdStep, ValueStep, BuildStep {
        private String accountId;
        private String createSourceId;
        private String createSourceType;
        private Temporal.DateTime createdAt;
        private String id;
        private String parentObjectId;
        private String parentObjectType;
        private String propertyDefinitionId;
        private Temporal.DateTime updatedAt;
        private String value;

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.AccountIdStep
        public ParentObjectIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public CustomValue build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CustomValue(string, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public BuildStep createSourceId(String str) {
            this.createSourceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public BuildStep createSourceType(String str) {
            this.createSourceType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.ParentObjectIdStep
        public ValueStep parentObjectId(String str) {
            Objects.requireNonNull(str);
            this.parentObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public BuildStep parentObjectType(String str) {
            this.parentObjectType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.PropertyDefinitionIdStep
        public AccountIdStep propertyDefinitionId(String str) {
            Objects.requireNonNull(str);
            this.propertyDefinitionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.ValueStep
        public BuildStep value(String str) {
            Objects.requireNonNull(str);
            this.value = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.propertyDefinitionId = str2;
            this.accountId = str3;
            this.parentObjectId = str4;
            this.parentObjectType = str5;
            this.value = str6;
            this.createSourceId = str7;
            this.createSourceType = str8;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, str7, str8, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str6);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public CopyOfBuilder createSourceId(String str) {
            return (CopyOfBuilder) super.createSourceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public CopyOfBuilder createSourceType(String str) {
            return (CopyOfBuilder) super.createSourceType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.ParentObjectIdStep
        public CopyOfBuilder parentObjectId(String str) {
            return (CopyOfBuilder) super.parentObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public CopyOfBuilder parentObjectType(String str) {
            return (CopyOfBuilder) super.parentObjectType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.PropertyDefinitionIdStep
        public CopyOfBuilder propertyDefinitionId(String str) {
            return (CopyOfBuilder) super.propertyDefinitionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomValue.Builder, com.amplifyframework.datastore.generated.model.CustomValue.ValueStep
        public CopyOfBuilder value(String str) {
            return (CopyOfBuilder) super.value(str);
        }
    }

    public interface ParentObjectIdStep {
        ValueStep parentObjectId(String str);
    }

    public interface PropertyDefinitionIdStep {
        AccountIdStep propertyDefinitionId(String str);
    }

    public interface ValueStep {
        BuildStep value(String str);
    }

    public static PropertyDefinitionIdStep builder() {
        return new Builder();
    }

    public static CustomValue justId(String str) {
        return new CustomValue(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomValue.class != obj.getClass()) {
            return false;
        }
        CustomValue customValue = (CustomValue) obj;
        return s6c.m47909a(getId(), customValue.getId()) && s6c.m47909a(getPropertyDefinitionId(), customValue.getPropertyDefinitionId()) && s6c.m47909a(getAccountId(), customValue.getAccountId()) && s6c.m47909a(getParentObjectId(), customValue.getParentObjectId()) && s6c.m47909a(getParentObjectType(), customValue.getParentObjectType()) && s6c.m47909a(getValue(), customValue.getValue()) && s6c.m47909a(getCreateSourceId(), customValue.getCreateSourceId()) && s6c.m47909a(getCreateSourceType(), customValue.getCreateSourceType()) && s6c.m47909a(getCreatedAt(), customValue.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), customValue.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCreateSourceId() {
        return this.createSourceId;
    }

    public String getCreateSourceType() {
        return this.createSourceType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public String getParentObjectId() {
        return this.parentObjectId;
    }

    public String getParentObjectType() {
        return this.parentObjectType;
    }

    public CustomPropertyDefinitions getPropertyDefinition() {
        return this.propertyDefinition;
    }

    public String getPropertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getId() + getPropertyDefinitionId() + getAccountId() + getParentObjectId() + getParentObjectType() + getValue() + getCreateSourceId() + getCreateSourceType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomValue {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("propertyDefinitionId=" + String.valueOf(getPropertyDefinitionId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("parentObjectId=" + String.valueOf(getParentObjectId()) + ", ");
        sb.append("parentObjectType=" + String.valueOf(getParentObjectType()) + ", ");
        sb.append("value=" + String.valueOf(getValue()) + ", ");
        sb.append("createSourceId=" + String.valueOf(getCreateSourceId()) + ", ");
        sb.append("createSourceType=" + String.valueOf(getCreateSourceType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CustomValue(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.propertyDefinition = null;
        this.id = str;
        this.propertyDefinitionId = str2;
        this.accountId = str3;
        this.parentObjectId = str4;
        this.parentObjectType = str5;
        this.value = str6;
        this.createSourceId = str7;
        this.createSourceType = str8;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
