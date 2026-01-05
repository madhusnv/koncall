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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.ModelCustomFormValuesConditionInput;
import type.UpdateCustomFormValuesInput;

/* loaded from: classes4.dex */
public final class UpdateCustomFormValuesMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateCustomFormValues($input: UpdateCustomFormValuesInput!, $condition: ModelCustomFormValuesConditionInput) {\n  updateCustomFormValues(input: $input, condition: $condition) {\n    __typename\n    id\n    propertyDefinitionId\n    accountId\n    parentObjectId\n    parentObject\n    value\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomFormValuesMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateCustomFormValues";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateCustomFormValues($input: UpdateCustomFormValuesInput!, $condition: ModelCustomFormValuesConditionInput) {\n  updateCustomFormValues(input: $input, condition: $condition) {\n    __typename\n    id\n    propertyDefinitionId\n    accountId\n    parentObjectId\n    parentObject\n    value\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelCustomFormValuesConditionInput condition;
        private UpdateCustomFormValuesInput input;

        public UpdateCustomFormValuesMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateCustomFormValuesMutation(this.input, this.condition);
        }

        public Builder condition(ModelCustomFormValuesConditionInput modelCustomFormValuesConditionInput) {
            this.condition = modelCustomFormValuesConditionInput;
            return this;
        }

        public Builder input(UpdateCustomFormValuesInput updateCustomFormValuesInput) {
            this.input = updateCustomFormValuesInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateCustomFormValues", "updateCustomFormValues", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateCustomFormValues updateCustomFormValues;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateCustomFormValues.Mapper updateCustomFormValuesFieldMapper = new UpdateCustomFormValues.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateCustomFormValues) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateCustomFormValues>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomFormValuesMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateCustomFormValues read(ResponseReader responseReader2) {
                        return Mapper.this.updateCustomFormValuesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateCustomFormValues updateCustomFormValues) {
            this.updateCustomFormValues = updateCustomFormValues;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateCustomFormValues updateCustomFormValues = this.updateCustomFormValues;
            UpdateCustomFormValues updateCustomFormValues2 = ((Data) obj).updateCustomFormValues;
            return updateCustomFormValues == null ? updateCustomFormValues2 == null : updateCustomFormValues.equals(updateCustomFormValues2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateCustomFormValues updateCustomFormValues = this.updateCustomFormValues;
                this.$hashCode = (updateCustomFormValues == null ? 0 : updateCustomFormValues.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomFormValuesMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateCustomFormValues updateCustomFormValues = Data.this.updateCustomFormValues;
                    responseWriter.writeObject(responseField, updateCustomFormValues != null ? updateCustomFormValues.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateCustomFormValues=" + this.updateCustomFormValues + "}";
            }
            return this.$toString;
        }

        public UpdateCustomFormValues updateCustomFormValues() {
            return this.updateCustomFormValues;
        }
    }

    public static class UpdateCustomFormValues {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String id;
        final String parentObject;
        final String parentObjectId;
        final String propertyDefinitionId;
        final String updatedAt;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<UpdateCustomFormValues> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateCustomFormValues map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateCustomFormValues.$responseFields;
                return new UpdateCustomFormValues(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("propertyDefinitionId", "propertyDefinitionId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObjectId", "parentObjectId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObject", "parentObject", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("value", "value", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType3, Collections.emptyList())};
        }

        public UpdateCustomFormValues(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.propertyDefinitionId = (String) Utils.checkNotNull(str3, "propertyDefinitionId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.parentObjectId = (String) Utils.checkNotNull(str5, "parentObjectId == null");
            this.parentObject = str6;
            this.value = str7;
            this.createdAt = (String) Utils.checkNotNull(str8, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str9, "updatedAt == null");
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

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateCustomFormValues)) {
                return false;
            }
            UpdateCustomFormValues updateCustomFormValues = (UpdateCustomFormValues) obj;
            return this.__typename.equals(updateCustomFormValues.__typename) && this.id.equals(updateCustomFormValues.id) && this.propertyDefinitionId.equals(updateCustomFormValues.propertyDefinitionId) && this.accountId.equals(updateCustomFormValues.accountId) && this.parentObjectId.equals(updateCustomFormValues.parentObjectId) && ((str = this.parentObject) != null ? str.equals(updateCustomFormValues.parentObject) : updateCustomFormValues.parentObject == null) && ((str2 = this.value) != null ? str2.equals(updateCustomFormValues.value) : updateCustomFormValues.value == null) && this.createdAt.equals(updateCustomFormValues.createdAt) && this.updatedAt.equals(updateCustomFormValues.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.propertyDefinitionId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.parentObjectId.hashCode()) * 1000003;
                String str = this.parentObject;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.value;
                this.$hashCode = ((((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomFormValuesMutation.UpdateCustomFormValues.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateCustomFormValues.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateCustomFormValues.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateCustomFormValues.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateCustomFormValues.this.propertyDefinitionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateCustomFormValues.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateCustomFormValues.this.parentObjectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateCustomFormValues.this.parentObject);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateCustomFormValues.this.value);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateCustomFormValues.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateCustomFormValues.this.updatedAt);
                }
            };
        }

        public String parentObject() {
            return this.parentObject;
        }

        public String parentObjectId() {
            return this.parentObjectId;
        }

        public String propertyDefinitionId() {
            return this.propertyDefinitionId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateCustomFormValues{__typename=" + this.__typename + ", id=" + this.id + ", propertyDefinitionId=" + this.propertyDefinitionId + ", accountId=" + this.accountId + ", parentObjectId=" + this.parentObjectId + ", parentObject=" + this.parentObject + ", value=" + this.value + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final ModelCustomFormValuesConditionInput condition;
        private final UpdateCustomFormValuesInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateCustomFormValuesInput updateCustomFormValuesInput, ModelCustomFormValuesConditionInput modelCustomFormValuesConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateCustomFormValuesInput;
            this.condition = modelCustomFormValuesConditionInput;
            linkedHashMap.put("input", updateCustomFormValuesInput);
            linkedHashMap.put("condition", modelCustomFormValuesConditionInput);
        }

        public ModelCustomFormValuesConditionInput condition() {
            return this.condition;
        }

        public UpdateCustomFormValuesInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCustomFormValuesMutation.Variables.1
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

    public UpdateCustomFormValuesMutation(UpdateCustomFormValuesInput updateCustomFormValuesInput, ModelCustomFormValuesConditionInput modelCustomFormValuesConditionInput) {
        Utils.checkNotNull(updateCustomFormValuesInput, "input == null");
        this.variables = new Variables(updateCustomFormValuesInput, modelCustomFormValuesConditionInput);
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
        return "8e96a25d15671070a1621fd657929f57f16f159ec6ce53729f549131b35a770a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateCustomFormValues($input: UpdateCustomFormValuesInput!, $condition: ModelCustomFormValuesConditionInput) {\n  updateCustomFormValues(input: $input, condition: $condition) {\n    __typename\n    id\n    propertyDefinitionId\n    accountId\n    parentObjectId\n    parentObject\n    value\n    createdAt\n    updatedAt\n  }\n}";
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
