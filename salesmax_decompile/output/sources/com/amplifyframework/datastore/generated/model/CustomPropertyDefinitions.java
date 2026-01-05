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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "parentObjectType"}, name = "propertiesByAccountAndType")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CustomPropertyDefinitions")
/* loaded from: classes5.dex */
public final class CustomPropertyDefinitions implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "CustomDataType")
    private final CustomDataType dataType;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(isRequired = true, targetType = "String")
    private final String displayName;

    @ModelField(targetType = "Int")
    private final Integer displayOrder;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isArchived;

    @ModelField(targetType = "Boolean")
    private final Boolean isMultiple;

    @ModelField(isRequired = true, targetType = "Boolean")
    private final Boolean isSystemProperty;

    @ModelField(isRequired = true, targetType = "String")
    private final String parentObjectType;

    @ModelField(isRequired = true, targetType = "CustomPropertyOptions")
    private final List<CustomPropertyOptions> possibleValues;

    @ModelField(isRequired = true, targetType = "String")
    private final String propertyName;

    @ModelField(isRequired = true, targetType = "String")
    private final String scalarType;

    @ModelField(targetType = "ID")
    private final String updaedById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CustomPropertyDefinitions", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CustomPropertyDefinitions", "accountId");
    public static final QueryField PROPERTY_NAME = QueryField.field("CustomPropertyDefinitions", "propertyName");
    public static final QueryField DISPLAY_NAME = QueryField.field("CustomPropertyDefinitions", "displayName");
    public static final QueryField DESCRIPTION = QueryField.field("CustomPropertyDefinitions", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField SCALAR_TYPE = QueryField.field("CustomPropertyDefinitions", "scalarType");
    public static final QueryField DATA_TYPE = QueryField.field("CustomPropertyDefinitions", "dataType");
    public static final QueryField IS_MULTIPLE = QueryField.field("CustomPropertyDefinitions", "isMultiple");
    public static final QueryField PARENT_OBJECT_TYPE = QueryField.field("CustomPropertyDefinitions", "parentObjectType");
    public static final QueryField IS_SYSTEM_PROPERTY = QueryField.field("CustomPropertyDefinitions", "isSystemProperty");
    public static final QueryField POSSIBLE_VALUES = QueryField.field("CustomPropertyDefinitions", "possibleValues");
    public static final QueryField IS_ARCHIVED = QueryField.field("CustomPropertyDefinitions", "isArchived");
    public static final QueryField DISPLAY_ORDER = QueryField.field("CustomPropertyDefinitions", "displayOrder");
    public static final QueryField CREATED_BY_ID = QueryField.field("CustomPropertyDefinitions", "createdById");
    public static final QueryField UPDAED_BY_ID = QueryField.field("CustomPropertyDefinitions", "updaedById");
    public static final QueryField CREATED_AT = QueryField.field("CustomPropertyDefinitions", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CustomPropertyDefinitions", "updatedAt");

    public interface AccountIdStep {
        PropertyNameStep accountId(String str);
    }

    public interface BuildStep {
        CustomPropertyDefinitions build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep dataType(CustomDataType customDataType);

        BuildStep description(String str);

        BuildStep displayOrder(Integer num);

        BuildStep id(String str);

        BuildStep isArchived(Boolean bool);

        BuildStep isMultiple(Boolean bool);

        BuildStep updaedById(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, PropertyNameStep, DisplayNameStep, ScalarTypeStep, ParentObjectTypeStep, IsSystemPropertyStep, PossibleValuesStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private CustomDataType dataType;
        private String description;
        private String displayName;
        private Integer displayOrder;
        private String id;
        private Boolean isArchived;
        private Boolean isMultiple;
        private Boolean isSystemProperty;
        private String parentObjectType;
        private List<CustomPropertyOptions> possibleValues;
        private String propertyName;
        private String scalarType;
        private String updaedById;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.AccountIdStep
        public PropertyNameStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CustomPropertyDefinitions build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CustomPropertyDefinitions(string, this.accountId, this.propertyName, this.displayName, this.description, this.scalarType, this.dataType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.possibleValues, this.isArchived, this.displayOrder, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep dataType(CustomDataType customDataType) {
            this.dataType = customDataType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.DisplayNameStep
        public ScalarTypeStep displayName(String str) {
            Objects.requireNonNull(str);
            this.displayName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep displayOrder(Integer num) {
            this.displayOrder = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep isArchived(Boolean bool) {
            this.isArchived = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep isMultiple(Boolean bool) {
            this.isMultiple = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.IsSystemPropertyStep
        public PossibleValuesStep isSystemProperty(Boolean bool) {
            Objects.requireNonNull(bool);
            this.isSystemProperty = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.ParentObjectTypeStep
        public IsSystemPropertyStep parentObjectType(String str) {
            Objects.requireNonNull(str);
            this.parentObjectType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.PossibleValuesStep
        public BuildStep possibleValues(List<CustomPropertyOptions> list) {
            Objects.requireNonNull(list);
            this.possibleValues = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.PropertyNameStep
        public DisplayNameStep propertyName(String str) {
            Objects.requireNonNull(str);
            this.propertyName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.ScalarTypeStep
        public ParentObjectTypeStep scalarType(String str) {
            Objects.requireNonNull(str);
            this.scalarType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep updaedById(String str) {
            this.updaedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, CustomDataType customDataType, Boolean bool, String str7, Boolean bool2, List<CustomPropertyOptions> list, Boolean bool3, Integer num, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.propertyName = str3;
            this.displayName = str4;
            this.description = str5;
            this.scalarType = str6;
            this.dataType = customDataType;
            this.isMultiple = bool;
            this.parentObjectType = str7;
            this.isSystemProperty = bool2;
            this.possibleValues = list;
            this.isArchived = bool3;
            this.displayOrder = num;
            this.createdById = str8;
            this.updaedById = str9;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.PossibleValuesStep
        public /* bridge */ /* synthetic */ BuildStep possibleValues(List list) {
            return possibleValues((List<CustomPropertyOptions>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, CustomDataType customDataType, Boolean bool, String str7, Boolean bool2, List<CustomPropertyOptions> list, Boolean bool3, Integer num, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, customDataType, bool, str7, bool2, list, bool3, num, str8, str9, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str6);
            Objects.requireNonNull(str7);
            Objects.requireNonNull(bool2);
            Objects.requireNonNull(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder dataType(CustomDataType customDataType) {
            return (CopyOfBuilder) super.dataType(customDataType);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.DisplayNameStep
        public CopyOfBuilder displayName(String str) {
            return (CopyOfBuilder) super.displayName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder displayOrder(Integer num) {
            return (CopyOfBuilder) super.displayOrder(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder isArchived(Boolean bool) {
            return (CopyOfBuilder) super.isArchived(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder isMultiple(Boolean bool) {
            return (CopyOfBuilder) super.isMultiple(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.IsSystemPropertyStep
        public CopyOfBuilder isSystemProperty(Boolean bool) {
            return (CopyOfBuilder) super.isSystemProperty(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.ParentObjectTypeStep
        public CopyOfBuilder parentObjectType(String str) {
            return (CopyOfBuilder) super.parentObjectType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.PossibleValuesStep
        public CopyOfBuilder possibleValues(List<CustomPropertyOptions> list) {
            return (CopyOfBuilder) super.possibleValues(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.PropertyNameStep
        public CopyOfBuilder propertyName(String str) {
            return (CopyOfBuilder) super.propertyName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.ScalarTypeStep
        public CopyOfBuilder scalarType(String str) {
            return (CopyOfBuilder) super.scalarType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder updaedById(String str) {
            return (CopyOfBuilder) super.updaedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.Builder, com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface DisplayNameStep {
        ScalarTypeStep displayName(String str);
    }

    public interface IsSystemPropertyStep {
        PossibleValuesStep isSystemProperty(Boolean bool);
    }

    public interface ParentObjectTypeStep {
        IsSystemPropertyStep parentObjectType(String str);
    }

    public interface PossibleValuesStep {
        BuildStep possibleValues(List<CustomPropertyOptions> list);
    }

    public interface PropertyNameStep {
        DisplayNameStep propertyName(String str);
    }

    public interface ScalarTypeStep {
        ParentObjectTypeStep scalarType(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CustomPropertyDefinitions justId(String str) {
        return new CustomPropertyDefinitions(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.propertyName, this.displayName, this.description, this.scalarType, this.dataType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.possibleValues, this.isArchived, this.displayOrder, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomPropertyDefinitions.class != obj.getClass()) {
            return false;
        }
        CustomPropertyDefinitions customPropertyDefinitions = (CustomPropertyDefinitions) obj;
        return s6c.m47909a(getId(), customPropertyDefinitions.getId()) && s6c.m47909a(getAccountId(), customPropertyDefinitions.getAccountId()) && s6c.m47909a(getPropertyName(), customPropertyDefinitions.getPropertyName()) && s6c.m47909a(getDisplayName(), customPropertyDefinitions.getDisplayName()) && s6c.m47909a(getDescription(), customPropertyDefinitions.getDescription()) && s6c.m47909a(getScalarType(), customPropertyDefinitions.getScalarType()) && s6c.m47909a(getDataType(), customPropertyDefinitions.getDataType()) && s6c.m47909a(getIsMultiple(), customPropertyDefinitions.getIsMultiple()) && s6c.m47909a(getParentObjectType(), customPropertyDefinitions.getParentObjectType()) && s6c.m47909a(getIsSystemProperty(), customPropertyDefinitions.getIsSystemProperty()) && s6c.m47909a(getPossibleValues(), customPropertyDefinitions.getPossibleValues()) && s6c.m47909a(getIsArchived(), customPropertyDefinitions.getIsArchived()) && s6c.m47909a(getDisplayOrder(), customPropertyDefinitions.getDisplayOrder()) && s6c.m47909a(getCreatedById(), customPropertyDefinitions.getCreatedById()) && s6c.m47909a(getUpdaedById(), customPropertyDefinitions.getUpdaedById()) && s6c.m47909a(getCreatedAt(), customPropertyDefinitions.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), customPropertyDefinitions.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public CustomDataType getDataType() {
        return this.dataType;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    public Boolean getIsMultiple() {
        return this.isMultiple;
    }

    public Boolean getIsSystemProperty() {
        return this.isSystemProperty;
    }

    public String getParentObjectType() {
        return this.parentObjectType;
    }

    public List<CustomPropertyOptions> getPossibleValues() {
        return this.possibleValues;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public String getScalarType() {
        return this.scalarType;
    }

    public String getUpdaedById() {
        return this.updaedById;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getPropertyName() + getDisplayName() + getDescription() + getScalarType() + getDataType() + getIsMultiple() + getParentObjectType() + getIsSystemProperty() + getPossibleValues() + getIsArchived() + getDisplayOrder() + getCreatedById() + getUpdaedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomPropertyDefinitions {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("propertyName=" + String.valueOf(getPropertyName()) + ", ");
        sb.append("displayName=" + String.valueOf(getDisplayName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("scalarType=" + String.valueOf(getScalarType()) + ", ");
        sb.append("dataType=" + String.valueOf(getDataType()) + ", ");
        sb.append("isMultiple=" + String.valueOf(getIsMultiple()) + ", ");
        sb.append("parentObjectType=" + String.valueOf(getParentObjectType()) + ", ");
        sb.append("isSystemProperty=" + String.valueOf(getIsSystemProperty()) + ", ");
        sb.append("possibleValues=" + String.valueOf(getPossibleValues()) + ", ");
        sb.append("isArchived=" + String.valueOf(getIsArchived()) + ", ");
        sb.append("displayOrder=" + String.valueOf(getDisplayOrder()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("updaedById=" + String.valueOf(getUpdaedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CustomPropertyDefinitions(String str, String str2, String str3, String str4, String str5, String str6, CustomDataType customDataType, Boolean bool, String str7, Boolean bool2, List<CustomPropertyOptions> list, Boolean bool3, Integer num, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.propertyName = str3;
        this.displayName = str4;
        this.description = str5;
        this.scalarType = str6;
        this.dataType = customDataType;
        this.isMultiple = bool;
        this.parentObjectType = str7;
        this.isSystemProperty = bool2;
        this.possibleValues = list;
        this.isArchived = bool3;
        this.displayOrder = num;
        this.createdById = str8;
        this.updaedById = str9;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
