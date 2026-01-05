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
import type.CreateSubmittedFormValueInput;
import type.CustomType;
import type.ModelSubmittedFormValueConditionInput;

/* loaded from: classes6.dex */
public final class CreateSubmittedFormValueMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateSubmittedFormValue($input: CreateSubmittedFormValueInput!, $condition: ModelSubmittedFormValueConditionInput) {\n  createSubmittedFormValue(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formId\n    value\n    extensionOfProperty\n    extensionOfObject\n    objectId\n    contactId\n    submittedBy\n    submittedByIdType\n    createdAt\n    updatedAt\n    formDefinition {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateSubmittedFormValue";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateSubmittedFormValue($input: CreateSubmittedFormValueInput!, $condition: ModelSubmittedFormValueConditionInput) {\n  createSubmittedFormValue(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formId\n    value\n    extensionOfProperty\n    extensionOfObject\n    objectId\n    contactId\n    submittedBy\n    submittedByIdType\n    createdAt\n    updatedAt\n    formDefinition {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelSubmittedFormValueConditionInput condition;
        private CreateSubmittedFormValueInput input;

        public CreateSubmittedFormValueMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateSubmittedFormValueMutation(this.input, this.condition);
        }

        public Builder condition(ModelSubmittedFormValueConditionInput modelSubmittedFormValueConditionInput) {
            this.condition = modelSubmittedFormValueConditionInput;
            return this;
        }

        public Builder input(CreateSubmittedFormValueInput createSubmittedFormValueInput) {
            this.input = createSubmittedFormValueInput;
            return this;
        }
    }

    public static class CreateSubmittedFormValue {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String contactId;
        final String createdAt;
        final String extensionOfObject;
        final String extensionOfProperty;
        final FormDefinition formDefinition;
        final String formId;
        final String id;
        final String objectId;
        final String submittedBy;
        final String submittedByIdType;
        final String updatedAt;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<CreateSubmittedFormValue> {
            final FormDefinition.Mapper formDefinitionFieldMapper = new FormDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateSubmittedFormValue map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateSubmittedFormValue.$responseFields;
                return new CreateSubmittedFormValue(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (FormDefinition) responseReader.readObject(responseFieldArr[13], new ResponseReader.ObjectReader<FormDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.CreateSubmittedFormValue.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public FormDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.formDefinitionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("formId", "formId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("value", "value", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("extensionOfProperty", "extensionOfProperty", null, true, Collections.emptyList()), ResponseField.forString("extensionOfObject", "extensionOfObject", null, true, Collections.emptyList()), ResponseField.forCustomType("objectId", "objectId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("submittedBy", "submittedBy", null, true, customType, Collections.emptyList()), ResponseField.forString("submittedByIdType", "submittedByIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("formDefinition", "formDefinition", null, true, Collections.emptyList())};
        }

        public CreateSubmittedFormValue(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, FormDefinition formDefinition) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formId = (String) Utils.checkNotNull(str4, "formId == null");
            this.value = str5;
            this.extensionOfProperty = str6;
            this.extensionOfObject = str7;
            this.objectId = str8;
            this.contactId = str9;
            this.submittedBy = str10;
            this.submittedByIdType = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
            this.formDefinition = formDefinition;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
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
            String str6;
            String str7;
            String str8;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateSubmittedFormValue)) {
                return false;
            }
            CreateSubmittedFormValue createSubmittedFormValue = (CreateSubmittedFormValue) obj;
            if (this.__typename.equals(createSubmittedFormValue.__typename) && this.id.equals(createSubmittedFormValue.id) && this.accountId.equals(createSubmittedFormValue.accountId) && this.formId.equals(createSubmittedFormValue.formId) && ((str = this.value) != null ? str.equals(createSubmittedFormValue.value) : createSubmittedFormValue.value == null) && ((str2 = this.extensionOfProperty) != null ? str2.equals(createSubmittedFormValue.extensionOfProperty) : createSubmittedFormValue.extensionOfProperty == null) && ((str3 = this.extensionOfObject) != null ? str3.equals(createSubmittedFormValue.extensionOfObject) : createSubmittedFormValue.extensionOfObject == null) && ((str4 = this.objectId) != null ? str4.equals(createSubmittedFormValue.objectId) : createSubmittedFormValue.objectId == null) && ((str5 = this.contactId) != null ? str5.equals(createSubmittedFormValue.contactId) : createSubmittedFormValue.contactId == null) && ((str6 = this.submittedBy) != null ? str6.equals(createSubmittedFormValue.submittedBy) : createSubmittedFormValue.submittedBy == null) && ((str7 = this.submittedByIdType) != null ? str7.equals(createSubmittedFormValue.submittedByIdType) : createSubmittedFormValue.submittedByIdType == null) && ((str8 = this.createdAt) != null ? str8.equals(createSubmittedFormValue.createdAt) : createSubmittedFormValue.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(createSubmittedFormValue.updatedAt) : createSubmittedFormValue.updatedAt == null)) {
                FormDefinition formDefinition = this.formDefinition;
                FormDefinition formDefinition2 = createSubmittedFormValue.formDefinition;
                if (formDefinition == null) {
                    if (formDefinition2 == null) {
                        return true;
                    }
                } else if (formDefinition.equals(formDefinition2)) {
                    return true;
                }
            }
            return false;
        }

        public String extensionOfObject() {
            return this.extensionOfObject;
        }

        public String extensionOfProperty() {
            return this.extensionOfProperty;
        }

        public FormDefinition formDefinition() {
            return this.formDefinition;
        }

        public String formId() {
            return this.formId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formId.hashCode()) * 1000003;
                String str = this.value;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.extensionOfProperty;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.extensionOfObject;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.objectId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.submittedBy;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.submittedByIdType;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                FormDefinition formDefinition = this.formDefinition;
                this.$hashCode = iHashCode10 ^ (formDefinition != null ? formDefinition.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.CreateSubmittedFormValue.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateSubmittedFormValue.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateSubmittedFormValue.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateSubmittedFormValue.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateSubmittedFormValue.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateSubmittedFormValue.this.formId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreateSubmittedFormValue.this.value);
                    responseWriter.writeString(responseFieldArr[5], CreateSubmittedFormValue.this.extensionOfProperty);
                    responseWriter.writeString(responseFieldArr[6], CreateSubmittedFormValue.this.extensionOfObject);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreateSubmittedFormValue.this.objectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateSubmittedFormValue.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateSubmittedFormValue.this.submittedBy);
                    responseWriter.writeString(responseFieldArr[10], CreateSubmittedFormValue.this.submittedByIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateSubmittedFormValue.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreateSubmittedFormValue.this.updatedAt);
                    ResponseField responseField = responseFieldArr[13];
                    FormDefinition formDefinition = CreateSubmittedFormValue.this.formDefinition;
                    responseWriter.writeObject(responseField, formDefinition != null ? formDefinition.marshaller() : null);
                }
            };
        }

        public String objectId() {
            return this.objectId;
        }

        public String submittedBy() {
            return this.submittedBy;
        }

        public String submittedByIdType() {
            return this.submittedByIdType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateSubmittedFormValue{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formId=" + this.formId + ", value=" + this.value + ", extensionOfProperty=" + this.extensionOfProperty + ", extensionOfObject=" + this.extensionOfObject + ", objectId=" + this.objectId + ", contactId=" + this.contactId + ", submittedBy=" + this.submittedBy + ", submittedByIdType=" + this.submittedByIdType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", formDefinition=" + this.formDefinition + "}";
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

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createSubmittedFormValue", "createSubmittedFormValue", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateSubmittedFormValue createSubmittedFormValue;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateSubmittedFormValue.Mapper createSubmittedFormValueFieldMapper = new CreateSubmittedFormValue.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateSubmittedFormValue) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateSubmittedFormValue>() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateSubmittedFormValue read(ResponseReader responseReader2) {
                        return Mapper.this.createSubmittedFormValueFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateSubmittedFormValue createSubmittedFormValue) {
            this.createSubmittedFormValue = createSubmittedFormValue;
        }

        public CreateSubmittedFormValue createSubmittedFormValue() {
            return this.createSubmittedFormValue;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateSubmittedFormValue createSubmittedFormValue = this.createSubmittedFormValue;
            CreateSubmittedFormValue createSubmittedFormValue2 = ((Data) obj).createSubmittedFormValue;
            return createSubmittedFormValue == null ? createSubmittedFormValue2 == null : createSubmittedFormValue.equals(createSubmittedFormValue2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateSubmittedFormValue createSubmittedFormValue = this.createSubmittedFormValue;
                this.$hashCode = (createSubmittedFormValue == null ? 0 : createSubmittedFormValue.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateSubmittedFormValue createSubmittedFormValue = Data.this.createSubmittedFormValue;
                    responseWriter.writeObject(responseField, createSubmittedFormValue != null ? createSubmittedFormValue.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createSubmittedFormValue=" + this.createSubmittedFormValue + "}";
            }
            return this.$toString;
        }
    }

    public static class FormDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String displayName;
        final String formName;
        final String formTitle;
        final String id;
        final String updaedById;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<FormDefinition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public FormDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = FormDefinition.$responseFields;
                return new FormDefinition(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("formName", "formName", null, false, Collections.emptyList()), ResponseField.forString("displayName", "displayName", null, false, Collections.emptyList()), ResponseField.forString("formTitle", "formTitle", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updaedById", "updaedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public FormDefinition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formName = (String) Utils.checkNotNull(str4, "formName == null");
            this.displayName = (String) Utils.checkNotNull(str5, "displayName == null");
            this.formTitle = str6;
            this.createdById = str7;
            this.updaedById = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
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

        public String displayName() {
            return this.displayName;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FormDefinition)) {
                return false;
            }
            FormDefinition formDefinition = (FormDefinition) obj;
            if (this.__typename.equals(formDefinition.__typename) && this.id.equals(formDefinition.id) && this.accountId.equals(formDefinition.accountId) && this.formName.equals(formDefinition.formName) && this.displayName.equals(formDefinition.displayName) && ((str = this.formTitle) != null ? str.equals(formDefinition.formTitle) : formDefinition.formTitle == null) && ((str2 = this.createdById) != null ? str2.equals(formDefinition.createdById) : formDefinition.createdById == null) && ((str3 = this.updaedById) != null ? str3.equals(formDefinition.updaedById) : formDefinition.updaedById == null) && ((str4 = this.createdAt) != null ? str4.equals(formDefinition.createdAt) : formDefinition.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = formDefinition.updatedAt;
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

        public String formName() {
            return this.formName;
        }

        public String formTitle() {
            return this.formTitle;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formName.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003;
                String str = this.formTitle;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.createdById;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updaedById;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.FormDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = FormDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], FormDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], FormDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], FormDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], FormDefinition.this.formName);
                    responseWriter.writeString(responseFieldArr[4], FormDefinition.this.displayName);
                    responseWriter.writeString(responseFieldArr[5], FormDefinition.this.formTitle);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], FormDefinition.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], FormDefinition.this.updaedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], FormDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], FormDefinition.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FormDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formName=" + this.formName + ", displayName=" + this.displayName + ", formTitle=" + this.formTitle + ", createdById=" + this.createdById + ", updaedById=" + this.updaedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static final class Variables extends Operation.Variables {
        private final ModelSubmittedFormValueConditionInput condition;
        private final CreateSubmittedFormValueInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateSubmittedFormValueInput createSubmittedFormValueInput, ModelSubmittedFormValueConditionInput modelSubmittedFormValueConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createSubmittedFormValueInput;
            this.condition = modelSubmittedFormValueConditionInput;
            linkedHashMap.put("input", createSubmittedFormValueInput);
            linkedHashMap.put("condition", modelSubmittedFormValueConditionInput);
        }

        public ModelSubmittedFormValueConditionInput condition() {
            return this.condition;
        }

        public CreateSubmittedFormValueInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation.Variables.1
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

    public CreateSubmittedFormValueMutation(CreateSubmittedFormValueInput createSubmittedFormValueInput, ModelSubmittedFormValueConditionInput modelSubmittedFormValueConditionInput) {
        Utils.checkNotNull(createSubmittedFormValueInput, "input == null");
        this.variables = new Variables(createSubmittedFormValueInput, modelSubmittedFormValueConditionInput);
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
        return "b479222ba8ec24c44f01099089a6412b03e9ac59c19df77210875bca50d59b9b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateSubmittedFormValue($input: CreateSubmittedFormValueInput!, $condition: ModelSubmittedFormValueConditionInput) {\n  createSubmittedFormValue(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formId\n    value\n    extensionOfProperty\n    extensionOfObject\n    objectId\n    contactId\n    submittedBy\n    submittedByIdType\n    createdAt\n    updatedAt\n    formDefinition {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
