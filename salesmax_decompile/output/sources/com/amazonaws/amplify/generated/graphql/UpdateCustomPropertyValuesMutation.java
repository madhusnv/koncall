package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomDataType;
import type.CustomType;
import type.ModelCustomPropertyValuesConditionInput;
import type.UpdateCustomPropertyValuesInput;

/* loaded from: classes4.dex */
public final class UpdateCustomPropertyValuesMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateCustomPropertyValues($input: UpdateCustomPropertyValuesInput!, $condition: ModelCustomPropertyValuesConditionInput) {\n  updateCustomPropertyValues(input: $input, condition: $condition) {\n    __typename\n    id\n    propertyDefinitionId\n    accountId\n    parentObjectId\n    parentObject\n    value\n    createSourceId\n    createSourceType\n    createdAt\n    updatedAt\n    propertyDefinition {\n      __typename\n      id\n      accountId\n      propertyName\n      displayName\n      description\n      scalarType\n      dataType\n      isMultiple\n      parentObjectType\n      isSystemProperty\n      isArchived\n      displayOrder\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateCustomPropertyValues";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateCustomPropertyValues($input: UpdateCustomPropertyValuesInput!, $condition: ModelCustomPropertyValuesConditionInput) {\n  updateCustomPropertyValues(input: $input, condition: $condition) {\n    __typename\n    id\n    propertyDefinitionId\n    accountId\n    parentObjectId\n    parentObject\n    value\n    createSourceId\n    createSourceType\n    createdAt\n    updatedAt\n    propertyDefinition {\n      __typename\n      id\n      accountId\n      propertyName\n      displayName\n      description\n      scalarType\n      dataType\n      isMultiple\n      parentObjectType\n      isSystemProperty\n      isArchived\n      displayOrder\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelCustomPropertyValuesConditionInput condition;
        private UpdateCustomPropertyValuesInput input;

        public UpdateCustomPropertyValuesMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateCustomPropertyValuesMutation(this.input, this.condition);
        }

        public Builder condition(ModelCustomPropertyValuesConditionInput modelCustomPropertyValuesConditionInput) {
            this.condition = modelCustomPropertyValuesConditionInput;
            return this;
        }

        public Builder input(UpdateCustomPropertyValuesInput updateCustomPropertyValuesInput) {
            this.input = updateCustomPropertyValuesInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateCustomPropertyValues", "updateCustomPropertyValues", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateCustomPropertyValues updateCustomPropertyValues;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateCustomPropertyValues.Mapper updateCustomPropertyValuesFieldMapper = new UpdateCustomPropertyValues.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateCustomPropertyValues) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateCustomPropertyValues>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateCustomPropertyValues read(ResponseReader responseReader2) {
                        return Mapper.this.updateCustomPropertyValuesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateCustomPropertyValues updateCustomPropertyValues) {
            this.updateCustomPropertyValues = updateCustomPropertyValues;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateCustomPropertyValues updateCustomPropertyValues = this.updateCustomPropertyValues;
            UpdateCustomPropertyValues updateCustomPropertyValues2 = ((Data) obj).updateCustomPropertyValues;
            return updateCustomPropertyValues == null ? updateCustomPropertyValues2 == null : updateCustomPropertyValues.equals(updateCustomPropertyValues2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateCustomPropertyValues updateCustomPropertyValues = this.updateCustomPropertyValues;
                this.$hashCode = (updateCustomPropertyValues == null ? 0 : updateCustomPropertyValues.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateCustomPropertyValues updateCustomPropertyValues = Data.this.updateCustomPropertyValues;
                    responseWriter.writeObject(responseField, updateCustomPropertyValues != null ? updateCustomPropertyValues.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateCustomPropertyValues=" + this.updateCustomPropertyValues + "}";
            }
            return this.$toString;
        }

        public UpdateCustomPropertyValues updateCustomPropertyValues() {
            return this.updateCustomPropertyValues;
        }
    }

    public static class PropertyDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final CustomDataType dataType;
        final String description;
        final String displayName;
        final Integer displayOrder;
        final String id;
        final Boolean isArchived;
        final Boolean isMultiple;
        final boolean isSystemProperty;
        final String parentObjectType;
        final String propertyName;
        final String scalarType;
        final String updaedById;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<PropertyDefinition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public PropertyDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = PropertyDefinition.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                return new PropertyDefinition(string, str, str2, string2, string3, string4, string5, string6 != null ? CustomDataType.valueOf(string6) : null, responseReader.readBoolean(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]).booleanValue(), responseReader.readBoolean(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("propertyName", "propertyName", null, false, Collections.emptyList()), ResponseField.forString("displayName", "displayName", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("scalarType", "scalarType", null, false, Collections.emptyList()), ResponseField.forString("dataType", "dataType", null, true, Collections.emptyList()), ResponseField.forBoolean("isMultiple", "isMultiple", null, true, Collections.emptyList()), ResponseField.forString("parentObjectType", "parentObjectType", null, false, Collections.emptyList()), ResponseField.forBoolean("isSystemProperty", "isSystemProperty", null, false, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forInt("displayOrder", "displayOrder", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updaedById", "updaedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public PropertyDefinition(String str, String str2, String str3, String str4, String str5, String str6, String str7, CustomDataType customDataType, Boolean bool, String str8, boolean z, Boolean bool2, Integer num, String str9, String str10, String str11, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.propertyName = (String) Utils.checkNotNull(str4, "propertyName == null");
            this.displayName = (String) Utils.checkNotNull(str5, "displayName == null");
            this.description = str6;
            this.scalarType = (String) Utils.checkNotNull(str7, "scalarType == null");
            this.dataType = customDataType;
            this.isMultiple = bool;
            this.parentObjectType = (String) Utils.checkNotNull(str8, "parentObjectType == null");
            this.isSystemProperty = z;
            this.isArchived = bool2;
            this.displayOrder = num;
            this.createdById = str9;
            this.updaedById = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public CustomDataType dataType() {
            return this.dataType;
        }

        public String description() {
            return this.description;
        }

        public String displayName() {
            return this.displayName;
        }

        public Integer displayOrder() {
            return this.displayOrder;
        }

        public boolean equals(Object obj) {
            String str;
            CustomDataType customDataType;
            Boolean bool;
            Boolean bool2;
            Integer num;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PropertyDefinition)) {
                return false;
            }
            PropertyDefinition propertyDefinition = (PropertyDefinition) obj;
            if (this.__typename.equals(propertyDefinition.__typename) && this.id.equals(propertyDefinition.id) && this.accountId.equals(propertyDefinition.accountId) && this.propertyName.equals(propertyDefinition.propertyName) && this.displayName.equals(propertyDefinition.displayName) && ((str = this.description) != null ? str.equals(propertyDefinition.description) : propertyDefinition.description == null) && this.scalarType.equals(propertyDefinition.scalarType) && ((customDataType = this.dataType) != null ? customDataType.equals(propertyDefinition.dataType) : propertyDefinition.dataType == null) && ((bool = this.isMultiple) != null ? bool.equals(propertyDefinition.isMultiple) : propertyDefinition.isMultiple == null) && this.parentObjectType.equals(propertyDefinition.parentObjectType) && this.isSystemProperty == propertyDefinition.isSystemProperty && ((bool2 = this.isArchived) != null ? bool2.equals(propertyDefinition.isArchived) : propertyDefinition.isArchived == null) && ((num = this.displayOrder) != null ? num.equals(propertyDefinition.displayOrder) : propertyDefinition.displayOrder == null) && ((str2 = this.createdById) != null ? str2.equals(propertyDefinition.createdById) : propertyDefinition.createdById == null) && ((str3 = this.updaedById) != null ? str3.equals(propertyDefinition.updaedById) : propertyDefinition.updaedById == null) && ((str4 = this.createdAt) != null ? str4.equals(propertyDefinition.createdAt) : propertyDefinition.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = propertyDefinition.updatedAt;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.propertyName.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003;
                String str = this.description;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.scalarType.hashCode()) * 1000003;
                CustomDataType customDataType = this.dataType;
                int iHashCode3 = (iHashCode2 ^ (customDataType == null ? 0 : customDataType.hashCode())) * 1000003;
                Boolean bool = this.isMultiple;
                int iHashCode4 = (((((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.parentObjectType.hashCode()) * 1000003) ^ Boolean.valueOf(this.isSystemProperty).hashCode()) * 1000003;
                Boolean bool2 = this.isArchived;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num = this.displayOrder;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str2 = this.createdById;
                int iHashCode7 = (iHashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updaedById;
                int iHashCode8 = (iHashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode9 = (iHashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode9 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public Boolean isMultiple() {
            return this.isMultiple;
        }

        public boolean isSystemProperty() {
            return this.isSystemProperty;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.PropertyDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = PropertyDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], PropertyDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], PropertyDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], PropertyDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], PropertyDefinition.this.propertyName);
                    responseWriter.writeString(responseFieldArr[4], PropertyDefinition.this.displayName);
                    responseWriter.writeString(responseFieldArr[5], PropertyDefinition.this.description);
                    responseWriter.writeString(responseFieldArr[6], PropertyDefinition.this.scalarType);
                    ResponseField responseField = responseFieldArr[7];
                    CustomDataType customDataType = PropertyDefinition.this.dataType;
                    responseWriter.writeString(responseField, customDataType != null ? customDataType.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[8], PropertyDefinition.this.isMultiple);
                    responseWriter.writeString(responseFieldArr[9], PropertyDefinition.this.parentObjectType);
                    responseWriter.writeBoolean(responseFieldArr[10], Boolean.valueOf(PropertyDefinition.this.isSystemProperty));
                    responseWriter.writeBoolean(responseFieldArr[11], PropertyDefinition.this.isArchived);
                    responseWriter.writeInt(responseFieldArr[12], PropertyDefinition.this.displayOrder);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], PropertyDefinition.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], PropertyDefinition.this.updaedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], PropertyDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], PropertyDefinition.this.updatedAt);
                }
            };
        }

        public String parentObjectType() {
            return this.parentObjectType;
        }

        public String propertyName() {
            return this.propertyName;
        }

        public String scalarType() {
            return this.scalarType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PropertyDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", propertyName=" + this.propertyName + ", displayName=" + this.displayName + ", description=" + this.description + ", scalarType=" + this.scalarType + ", dataType=" + this.dataType + ", isMultiple=" + this.isMultiple + ", parentObjectType=" + this.parentObjectType + ", isSystemProperty=" + this.isSystemProperty + ", isArchived=" + this.isArchived + ", displayOrder=" + this.displayOrder + ", createdById=" + this.createdById + ", updaedById=" + this.updaedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updaedById() {
            return this.updaedById;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class UpdateCustomPropertyValues {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createSourceId;
        final String createSourceType;
        final String createdAt;
        final String id;
        final String parentObject;
        final String parentObjectId;
        final PropertyDefinition propertyDefinition;
        final String propertyDefinitionId;
        final String updatedAt;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<UpdateCustomPropertyValues> {
            final PropertyDefinition.Mapper propertyDefinitionFieldMapper = new PropertyDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateCustomPropertyValues map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateCustomPropertyValues.$responseFields;
                return new UpdateCustomPropertyValues(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (PropertyDefinition) responseReader.readObject(responseFieldArr[11], new ResponseReader.ObjectReader<PropertyDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.UpdateCustomPropertyValues.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PropertyDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.propertyDefinitionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("propertyDefinitionId", "propertyDefinitionId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObjectId", "parentObjectId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObject", "parentObject", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("value", "value", null, false, Collections.emptyList()), ResponseField.forCustomType("createSourceId", "createSourceId", null, true, customType, Collections.emptyList()), ResponseField.forString("createSourceType", "createSourceType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("propertyDefinition", "propertyDefinition", null, true, Collections.emptyList())};
        }

        public UpdateCustomPropertyValues(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PropertyDefinition propertyDefinition) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.propertyDefinitionId = (String) Utils.checkNotNull(str3, "propertyDefinitionId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.parentObjectId = (String) Utils.checkNotNull(str5, "parentObjectId == null");
            this.parentObject = str6;
            this.value = (String) Utils.checkNotNull(str7, "value == null");
            this.createSourceId = str8;
            this.createSourceType = str9;
            this.createdAt = str10;
            this.updatedAt = str11;
            this.propertyDefinition = propertyDefinition;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createSourceId() {
            return this.createSourceId;
        }

        public String createSourceType() {
            return this.createSourceType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateCustomPropertyValues)) {
                return false;
            }
            UpdateCustomPropertyValues updateCustomPropertyValues = (UpdateCustomPropertyValues) obj;
            if (this.__typename.equals(updateCustomPropertyValues.__typename) && this.id.equals(updateCustomPropertyValues.id) && this.propertyDefinitionId.equals(updateCustomPropertyValues.propertyDefinitionId) && this.accountId.equals(updateCustomPropertyValues.accountId) && this.parentObjectId.equals(updateCustomPropertyValues.parentObjectId) && ((str = this.parentObject) != null ? str.equals(updateCustomPropertyValues.parentObject) : updateCustomPropertyValues.parentObject == null) && this.value.equals(updateCustomPropertyValues.value) && ((str2 = this.createSourceId) != null ? str2.equals(updateCustomPropertyValues.createSourceId) : updateCustomPropertyValues.createSourceId == null) && ((str3 = this.createSourceType) != null ? str3.equals(updateCustomPropertyValues.createSourceType) : updateCustomPropertyValues.createSourceType == null) && ((str4 = this.createdAt) != null ? str4.equals(updateCustomPropertyValues.createdAt) : updateCustomPropertyValues.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(updateCustomPropertyValues.updatedAt) : updateCustomPropertyValues.updatedAt == null)) {
                PropertyDefinition propertyDefinition = this.propertyDefinition;
                PropertyDefinition propertyDefinition2 = updateCustomPropertyValues.propertyDefinition;
                if (propertyDefinition == null) {
                    if (propertyDefinition2 == null) {
                        return true;
                    }
                } else if (propertyDefinition.equals(propertyDefinition2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.propertyDefinitionId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.parentObjectId.hashCode()) * 1000003;
                String str = this.parentObject;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.value.hashCode()) * 1000003;
                String str2 = this.createSourceId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.createSourceType;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                PropertyDefinition propertyDefinition = this.propertyDefinition;
                this.$hashCode = iHashCode6 ^ (propertyDefinition != null ? propertyDefinition.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.UpdateCustomPropertyValues.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateCustomPropertyValues.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateCustomPropertyValues.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateCustomPropertyValues.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateCustomPropertyValues.this.propertyDefinitionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateCustomPropertyValues.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateCustomPropertyValues.this.parentObjectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateCustomPropertyValues.this.parentObject);
                    responseWriter.writeString(responseFieldArr[6], UpdateCustomPropertyValues.this.value);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateCustomPropertyValues.this.createSourceId);
                    responseWriter.writeString(responseFieldArr[8], UpdateCustomPropertyValues.this.createSourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateCustomPropertyValues.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateCustomPropertyValues.this.updatedAt);
                    ResponseField responseField = responseFieldArr[11];
                    PropertyDefinition propertyDefinition = UpdateCustomPropertyValues.this.propertyDefinition;
                    responseWriter.writeObject(responseField, propertyDefinition != null ? propertyDefinition.marshaller() : null);
                }
            };
        }

        public String parentObject() {
            return this.parentObject;
        }

        public String parentObjectId() {
            return this.parentObjectId;
        }

        public PropertyDefinition propertyDefinition() {
            return this.propertyDefinition;
        }

        public String propertyDefinitionId() {
            return this.propertyDefinitionId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateCustomPropertyValues{__typename=" + this.__typename + ", id=" + this.id + ", propertyDefinitionId=" + this.propertyDefinitionId + ", accountId=" + this.accountId + ", parentObjectId=" + this.parentObjectId + ", parentObject=" + this.parentObject + ", value=" + this.value + ", createSourceId=" + this.createSourceId + ", createSourceType=" + this.createSourceType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", propertyDefinition=" + this.propertyDefinition + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String value() {
            return this.value;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelCustomPropertyValuesConditionInput condition;
        private final UpdateCustomPropertyValuesInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateCustomPropertyValuesInput updateCustomPropertyValuesInput, ModelCustomPropertyValuesConditionInput modelCustomPropertyValuesConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateCustomPropertyValuesInput;
            this.condition = modelCustomPropertyValuesConditionInput;
            linkedHashMap.put("input", updateCustomPropertyValuesInput);
            linkedHashMap.put("condition", modelCustomPropertyValuesConditionInput);
        }

        public ModelCustomPropertyValuesConditionInput condition() {
            return this.condition;
        }

        public UpdateCustomPropertyValuesInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyValuesMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public UpdateCustomPropertyValuesMutation(UpdateCustomPropertyValuesInput updateCustomPropertyValuesInput, ModelCustomPropertyValuesConditionInput modelCustomPropertyValuesConditionInput) {
        Utils.checkNotNull(updateCustomPropertyValuesInput, "input == null");
        this.variables = new Variables(updateCustomPropertyValuesInput, modelCustomPropertyValuesConditionInput);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "1fb5ddda0d2ade8ac0a5951f34946c7735737f76cd216da7802a0cd7ecb8e9ac";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateCustomPropertyValues($input: UpdateCustomPropertyValuesInput!, $condition: ModelCustomPropertyValuesConditionInput) {\n  updateCustomPropertyValues(input: $input, condition: $condition) {\n    __typename\n    id\n    propertyDefinitionId\n    accountId\n    parentObjectId\n    parentObject\n    value\n    createSourceId\n    createSourceType\n    createdAt\n    updatedAt\n    propertyDefinition {\n      __typename\n      id\n      accountId\n      propertyName\n      displayName\n      description\n      scalarType\n      dataType\n      isMultiple\n      parentObjectType\n      isSystemProperty\n      isArchived\n      displayOrder\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Variables variables() {
        return this.variables;
    }
}
