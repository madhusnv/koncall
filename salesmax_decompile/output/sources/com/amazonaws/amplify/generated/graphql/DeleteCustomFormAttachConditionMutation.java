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
import type.DeleteCustomFormAttachConditionInput;
import type.ModelcustomFormAttachConditionConditionInput;

/* loaded from: classes6.dex */
public final class DeleteCustomFormAttachConditionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteCustomFormAttachCondition($input: DeleteCustomFormAttachConditionInput!, $condition: ModelcustomFormAttachConditionConditionInput) {\n  deleteCustomFormAttachCondition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formId\n    formType\n    callOutcome\n    visitOutcome\n    taskInputType\n    taskType\n    taskOutcomeType\n    dealStage\n    paymentStatus\n    documentCategory\n    documentSubCategory\n    isDefaultFormForType\n    hideDefaultNote\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n    formDefinition {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteCustomFormAttachCondition";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteCustomFormAttachCondition($input: DeleteCustomFormAttachConditionInput!, $condition: ModelcustomFormAttachConditionConditionInput) {\n  deleteCustomFormAttachCondition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formId\n    formType\n    callOutcome\n    visitOutcome\n    taskInputType\n    taskType\n    taskOutcomeType\n    dealStage\n    paymentStatus\n    documentCategory\n    documentSubCategory\n    isDefaultFormForType\n    hideDefaultNote\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n    formDefinition {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelcustomFormAttachConditionConditionInput condition;
        private DeleteCustomFormAttachConditionInput input;

        public DeleteCustomFormAttachConditionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteCustomFormAttachConditionMutation(this.input, this.condition);
        }

        public Builder condition(ModelcustomFormAttachConditionConditionInput modelcustomFormAttachConditionConditionInput) {
            this.condition = modelcustomFormAttachConditionConditionInput;
            return this;
        }

        public Builder input(DeleteCustomFormAttachConditionInput deleteCustomFormAttachConditionInput) {
            this.input = deleteCustomFormAttachConditionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteCustomFormAttachCondition", "deleteCustomFormAttachCondition", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteCustomFormAttachCondition deleteCustomFormAttachCondition;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteCustomFormAttachCondition.Mapper deleteCustomFormAttachConditionFieldMapper = new DeleteCustomFormAttachCondition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteCustomFormAttachCondition) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteCustomFormAttachCondition>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteCustomFormAttachCondition read(ResponseReader responseReader2) {
                        return Mapper.this.deleteCustomFormAttachConditionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteCustomFormAttachCondition deleteCustomFormAttachCondition) {
            this.deleteCustomFormAttachCondition = deleteCustomFormAttachCondition;
        }

        public DeleteCustomFormAttachCondition deleteCustomFormAttachCondition() {
            return this.deleteCustomFormAttachCondition;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteCustomFormAttachCondition deleteCustomFormAttachCondition = this.deleteCustomFormAttachCondition;
            DeleteCustomFormAttachCondition deleteCustomFormAttachCondition2 = ((Data) obj).deleteCustomFormAttachCondition;
            return deleteCustomFormAttachCondition == null ? deleteCustomFormAttachCondition2 == null : deleteCustomFormAttachCondition.equals(deleteCustomFormAttachCondition2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteCustomFormAttachCondition deleteCustomFormAttachCondition = this.deleteCustomFormAttachCondition;
                this.$hashCode = (deleteCustomFormAttachCondition == null ? 0 : deleteCustomFormAttachCondition.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteCustomFormAttachCondition deleteCustomFormAttachCondition = Data.this.deleteCustomFormAttachCondition;
                    responseWriter.writeObject(responseField, deleteCustomFormAttachCondition != null ? deleteCustomFormAttachCondition.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteCustomFormAttachCondition=" + this.deleteCustomFormAttachCondition + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteCustomFormAttachCondition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String callOutcome;
        final String createdAt;
        final String createdById;
        final String dealStage;
        final String documentCategory;
        final String documentSubCategory;
        final FormDefinition formDefinition;
        final String formId;
        final String formType;
        final Boolean hideDefaultNote;
        final String id;
        final String isDefaultFormForType;
        final String paymentStatus;
        final String taskInputType;
        final String taskOutcomeType;
        final String taskType;
        final String updatedAt;
        final String updatedById;
        final String visitOutcome;

        public static final class Mapper implements ResponseFieldMapper<DeleteCustomFormAttachCondition> {
            final FormDefinition.Mapper formDefinitionFieldMapper = new FormDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteCustomFormAttachCondition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteCustomFormAttachCondition.$responseFields;
                return new DeleteCustomFormAttachCondition(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readBoolean(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (FormDefinition) responseReader.readObject(responseFieldArr[20], new ResponseReader.ObjectReader<FormDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.DeleteCustomFormAttachCondition.Mapper.1
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
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("formId", "formId", null, false, customType, Collections.emptyList()), ResponseField.forString("formType", "formType", null, true, Collections.emptyList()), ResponseField.forString("callOutcome", "callOutcome", null, true, Collections.emptyList()), ResponseField.forString("visitOutcome", "visitOutcome", null, true, Collections.emptyList()), ResponseField.forString("taskInputType", "taskInputType", null, true, Collections.emptyList()), ResponseField.forString("taskType", "taskType", null, true, Collections.emptyList()), ResponseField.forString("taskOutcomeType", "taskOutcomeType", null, true, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forString("paymentStatus", "paymentStatus", null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forString("isDefaultFormForType", "isDefaultFormForType", null, true, Collections.emptyList()), ResponseField.forBoolean("hideDefaultNote", "hideDefaultNote", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("formDefinition", "formDefinition", null, true, Collections.emptyList())};
        }

        public DeleteCustomFormAttachCondition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19, FormDefinition formDefinition) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formId = (String) Utils.checkNotNull(str4, "formId == null");
            this.formType = str5;
            this.callOutcome = str6;
            this.visitOutcome = str7;
            this.taskInputType = str8;
            this.taskType = str9;
            this.taskOutcomeType = str10;
            this.dealStage = str11;
            this.paymentStatus = str12;
            this.documentCategory = str13;
            this.documentSubCategory = str14;
            this.isDefaultFormForType = str15;
            this.hideDefaultNote = bool;
            this.createdById = str16;
            this.updatedById = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
            this.formDefinition = formDefinition;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callOutcome() {
            return this.callOutcome;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public String documentCategory() {
            return this.documentCategory;
        }

        public String documentSubCategory() {
            return this.documentSubCategory;
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
            String str10;
            String str11;
            Boolean bool;
            String str12;
            String str13;
            String str14;
            String str15;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteCustomFormAttachCondition)) {
                return false;
            }
            DeleteCustomFormAttachCondition deleteCustomFormAttachCondition = (DeleteCustomFormAttachCondition) obj;
            if (this.__typename.equals(deleteCustomFormAttachCondition.__typename) && this.id.equals(deleteCustomFormAttachCondition.id) && this.accountId.equals(deleteCustomFormAttachCondition.accountId) && this.formId.equals(deleteCustomFormAttachCondition.formId) && ((str = this.formType) != null ? str.equals(deleteCustomFormAttachCondition.formType) : deleteCustomFormAttachCondition.formType == null) && ((str2 = this.callOutcome) != null ? str2.equals(deleteCustomFormAttachCondition.callOutcome) : deleteCustomFormAttachCondition.callOutcome == null) && ((str3 = this.visitOutcome) != null ? str3.equals(deleteCustomFormAttachCondition.visitOutcome) : deleteCustomFormAttachCondition.visitOutcome == null) && ((str4 = this.taskInputType) != null ? str4.equals(deleteCustomFormAttachCondition.taskInputType) : deleteCustomFormAttachCondition.taskInputType == null) && ((str5 = this.taskType) != null ? str5.equals(deleteCustomFormAttachCondition.taskType) : deleteCustomFormAttachCondition.taskType == null) && ((str6 = this.taskOutcomeType) != null ? str6.equals(deleteCustomFormAttachCondition.taskOutcomeType) : deleteCustomFormAttachCondition.taskOutcomeType == null) && ((str7 = this.dealStage) != null ? str7.equals(deleteCustomFormAttachCondition.dealStage) : deleteCustomFormAttachCondition.dealStage == null) && ((str8 = this.paymentStatus) != null ? str8.equals(deleteCustomFormAttachCondition.paymentStatus) : deleteCustomFormAttachCondition.paymentStatus == null) && ((str9 = this.documentCategory) != null ? str9.equals(deleteCustomFormAttachCondition.documentCategory) : deleteCustomFormAttachCondition.documentCategory == null) && ((str10 = this.documentSubCategory) != null ? str10.equals(deleteCustomFormAttachCondition.documentSubCategory) : deleteCustomFormAttachCondition.documentSubCategory == null) && ((str11 = this.isDefaultFormForType) != null ? str11.equals(deleteCustomFormAttachCondition.isDefaultFormForType) : deleteCustomFormAttachCondition.isDefaultFormForType == null) && ((bool = this.hideDefaultNote) != null ? bool.equals(deleteCustomFormAttachCondition.hideDefaultNote) : deleteCustomFormAttachCondition.hideDefaultNote == null) && ((str12 = this.createdById) != null ? str12.equals(deleteCustomFormAttachCondition.createdById) : deleteCustomFormAttachCondition.createdById == null) && ((str13 = this.updatedById) != null ? str13.equals(deleteCustomFormAttachCondition.updatedById) : deleteCustomFormAttachCondition.updatedById == null) && ((str14 = this.createdAt) != null ? str14.equals(deleteCustomFormAttachCondition.createdAt) : deleteCustomFormAttachCondition.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(deleteCustomFormAttachCondition.updatedAt) : deleteCustomFormAttachCondition.updatedAt == null)) {
                FormDefinition formDefinition = this.formDefinition;
                FormDefinition formDefinition2 = deleteCustomFormAttachCondition.formDefinition;
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

        public FormDefinition formDefinition() {
            return this.formDefinition;
        }

        public String formId() {
            return this.formId;
        }

        public String formType() {
            return this.formType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formId.hashCode()) * 1000003;
                String str = this.formType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.callOutcome;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.visitOutcome;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.taskInputType;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.taskType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.taskOutcomeType;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.dealStage;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.paymentStatus;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.documentCategory;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.documentSubCategory;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.isDefaultFormForType;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.hideDefaultNote;
                int iHashCode13 = (iHashCode12 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str12 = this.createdById;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedById;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                FormDefinition formDefinition = this.formDefinition;
                this.$hashCode = iHashCode17 ^ (formDefinition != null ? formDefinition.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean hideDefaultNote() {
            return this.hideDefaultNote;
        }

        public String id() {
            return this.id;
        }

        public String isDefaultFormForType() {
            return this.isDefaultFormForType;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.DeleteCustomFormAttachCondition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteCustomFormAttachCondition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteCustomFormAttachCondition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteCustomFormAttachCondition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteCustomFormAttachCondition.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteCustomFormAttachCondition.this.formId);
                    responseWriter.writeString(responseFieldArr[4], DeleteCustomFormAttachCondition.this.formType);
                    responseWriter.writeString(responseFieldArr[5], DeleteCustomFormAttachCondition.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[6], DeleteCustomFormAttachCondition.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[7], DeleteCustomFormAttachCondition.this.taskInputType);
                    responseWriter.writeString(responseFieldArr[8], DeleteCustomFormAttachCondition.this.taskType);
                    responseWriter.writeString(responseFieldArr[9], DeleteCustomFormAttachCondition.this.taskOutcomeType);
                    responseWriter.writeString(responseFieldArr[10], DeleteCustomFormAttachCondition.this.dealStage);
                    responseWriter.writeString(responseFieldArr[11], DeleteCustomFormAttachCondition.this.paymentStatus);
                    responseWriter.writeString(responseFieldArr[12], DeleteCustomFormAttachCondition.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[13], DeleteCustomFormAttachCondition.this.documentSubCategory);
                    responseWriter.writeString(responseFieldArr[14], DeleteCustomFormAttachCondition.this.isDefaultFormForType);
                    responseWriter.writeBoolean(responseFieldArr[15], DeleteCustomFormAttachCondition.this.hideDefaultNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], DeleteCustomFormAttachCondition.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], DeleteCustomFormAttachCondition.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], DeleteCustomFormAttachCondition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeleteCustomFormAttachCondition.this.updatedAt);
                    ResponseField responseField = responseFieldArr[20];
                    FormDefinition formDefinition = DeleteCustomFormAttachCondition.this.formDefinition;
                    responseWriter.writeObject(responseField, formDefinition != null ? formDefinition.marshaller() : null);
                }
            };
        }

        public String paymentStatus() {
            return this.paymentStatus;
        }

        public String taskInputType() {
            return this.taskInputType;
        }

        public String taskOutcomeType() {
            return this.taskOutcomeType;
        }

        public String taskType() {
            return this.taskType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteCustomFormAttachCondition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formId=" + this.formId + ", formType=" + this.formType + ", callOutcome=" + this.callOutcome + ", visitOutcome=" + this.visitOutcome + ", taskInputType=" + this.taskInputType + ", taskType=" + this.taskType + ", taskOutcomeType=" + this.taskOutcomeType + ", dealStage=" + this.dealStage + ", paymentStatus=" + this.paymentStatus + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", isDefaultFormForType=" + this.isDefaultFormForType + ", hideDefaultNote=" + this.hideDefaultNote + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", formDefinition=" + this.formDefinition + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String visitOutcome() {
            return this.visitOutcome;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.FormDefinition.1
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
        private final ModelcustomFormAttachConditionConditionInput condition;
        private final DeleteCustomFormAttachConditionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteCustomFormAttachConditionInput deleteCustomFormAttachConditionInput, ModelcustomFormAttachConditionConditionInput modelcustomFormAttachConditionConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteCustomFormAttachConditionInput;
            this.condition = modelcustomFormAttachConditionConditionInput;
            linkedHashMap.put("input", deleteCustomFormAttachConditionInput);
            linkedHashMap.put("condition", modelcustomFormAttachConditionConditionInput);
        }

        public ModelcustomFormAttachConditionConditionInput condition() {
            return this.condition;
        }

        public DeleteCustomFormAttachConditionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteCustomFormAttachConditionMutation.Variables.1
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

    public DeleteCustomFormAttachConditionMutation(DeleteCustomFormAttachConditionInput deleteCustomFormAttachConditionInput, ModelcustomFormAttachConditionConditionInput modelcustomFormAttachConditionConditionInput) {
        Utils.checkNotNull(deleteCustomFormAttachConditionInput, "input == null");
        this.variables = new Variables(deleteCustomFormAttachConditionInput, modelcustomFormAttachConditionConditionInput);
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
        return "a98a52e71311ae11cf5526b7bd9812b9bf80dafb28224d3159b64beb1777867b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteCustomFormAttachCondition($input: DeleteCustomFormAttachConditionInput!, $condition: ModelcustomFormAttachConditionConditionInput) {\n  deleteCustomFormAttachCondition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formId\n    formType\n    callOutcome\n    visitOutcome\n    taskInputType\n    taskType\n    taskOutcomeType\n    dealStage\n    paymentStatus\n    documentCategory\n    documentSubCategory\n    isDefaultFormForType\n    hideDefaultNote\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n    formDefinition {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
