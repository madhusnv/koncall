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
import type.DeleteWabaWebhookEventInput;
import type.ModelWabaWebhookEventConditionInput;

/* loaded from: classes7.dex */
public final class DeleteWabaWebhookEventMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteWabaWebhookEvent($input: DeleteWabaWebhookEventInput!, $condition: ModelWabaWebhookEventConditionInput) {\n  deleteWabaWebhookEvent(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaWebhookEventMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteWabaWebhookEvent";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteWabaWebhookEvent($input: DeleteWabaWebhookEventInput!, $condition: ModelWabaWebhookEventConditionInput) {\n  deleteWabaWebhookEvent(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaWebhookEventConditionInput condition;
        private DeleteWabaWebhookEventInput input;

        public DeleteWabaWebhookEventMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteWabaWebhookEventMutation(this.input, this.condition);
        }

        public Builder condition(ModelWabaWebhookEventConditionInput modelWabaWebhookEventConditionInput) {
            this.condition = modelWabaWebhookEventConditionInput;
            return this;
        }

        public Builder input(DeleteWabaWebhookEventInput deleteWabaWebhookEventInput) {
            this.input = deleteWabaWebhookEventInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteWabaWebhookEvent", "deleteWabaWebhookEvent", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteWabaWebhookEvent deleteWabaWebhookEvent;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteWabaWebhookEvent.Mapper deleteWabaWebhookEventFieldMapper = new DeleteWabaWebhookEvent.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteWabaWebhookEvent) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteWabaWebhookEvent>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaWebhookEventMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteWabaWebhookEvent read(ResponseReader responseReader2) {
                        return Mapper.this.deleteWabaWebhookEventFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteWabaWebhookEvent deleteWabaWebhookEvent) {
            this.deleteWabaWebhookEvent = deleteWabaWebhookEvent;
        }

        public DeleteWabaWebhookEvent deleteWabaWebhookEvent() {
            return this.deleteWabaWebhookEvent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteWabaWebhookEvent deleteWabaWebhookEvent = this.deleteWabaWebhookEvent;
            DeleteWabaWebhookEvent deleteWabaWebhookEvent2 = ((Data) obj).deleteWabaWebhookEvent;
            return deleteWabaWebhookEvent == null ? deleteWabaWebhookEvent2 == null : deleteWabaWebhookEvent.equals(deleteWabaWebhookEvent2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteWabaWebhookEvent deleteWabaWebhookEvent = this.deleteWabaWebhookEvent;
                this.$hashCode = (deleteWabaWebhookEvent == null ? 0 : deleteWabaWebhookEvent.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaWebhookEventMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteWabaWebhookEvent deleteWabaWebhookEvent = Data.this.deleteWabaWebhookEvent;
                    responseWriter.writeObject(responseField, deleteWabaWebhookEvent != null ? deleteWabaWebhookEvent.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteWabaWebhookEvent=" + this.deleteWabaWebhookEvent + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteWabaWebhookEvent {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String displayPhoneNumber;
        final String field;
        final String id;
        final String payload;
        final String phoneNumberId;
        final String updatedAt;
        final String wabaAccountId;

        public static final class Mapper implements ResponseFieldMapper<DeleteWabaWebhookEvent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteWabaWebhookEvent map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteWabaWebhookEvent.$responseFields;
                return new DeleteWabaWebhookEvent(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("displayPhoneNumber", "displayPhoneNumber", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forString("field", "field", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public DeleteWabaWebhookEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = str3;
            this.wabaAccountId = str4;
            this.displayPhoneNumber = str5;
            this.phoneNumberId = str6;
            this.field = str7;
            this.payload = str8;
            this.createdAt = str9;
            this.updatedAt = (String) Utils.checkNotNull(str10, "updatedAt == null");
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

        public String displayPhoneNumber() {
            return this.displayPhoneNumber;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteWabaWebhookEvent)) {
                return false;
            }
            DeleteWabaWebhookEvent deleteWabaWebhookEvent = (DeleteWabaWebhookEvent) obj;
            return this.__typename.equals(deleteWabaWebhookEvent.__typename) && this.id.equals(deleteWabaWebhookEvent.id) && ((str = this.accountId) != null ? str.equals(deleteWabaWebhookEvent.accountId) : deleteWabaWebhookEvent.accountId == null) && ((str2 = this.wabaAccountId) != null ? str2.equals(deleteWabaWebhookEvent.wabaAccountId) : deleteWabaWebhookEvent.wabaAccountId == null) && ((str3 = this.displayPhoneNumber) != null ? str3.equals(deleteWabaWebhookEvent.displayPhoneNumber) : deleteWabaWebhookEvent.displayPhoneNumber == null) && ((str4 = this.phoneNumberId) != null ? str4.equals(deleteWabaWebhookEvent.phoneNumberId) : deleteWabaWebhookEvent.phoneNumberId == null) && ((str5 = this.field) != null ? str5.equals(deleteWabaWebhookEvent.field) : deleteWabaWebhookEvent.field == null) && ((str6 = this.payload) != null ? str6.equals(deleteWabaWebhookEvent.payload) : deleteWabaWebhookEvent.payload == null) && ((str7 = this.createdAt) != null ? str7.equals(deleteWabaWebhookEvent.createdAt) : deleteWabaWebhookEvent.createdAt == null) && this.updatedAt.equals(deleteWabaWebhookEvent.updatedAt);
        }

        public String field() {
            return this.field;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.accountId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wabaAccountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.displayPhoneNumber;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.phoneNumberId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.field;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.payload;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                this.$hashCode = ((iHashCode7 ^ (str7 != null ? str7.hashCode() : 0)) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaWebhookEventMutation.DeleteWabaWebhookEvent.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteWabaWebhookEvent.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteWabaWebhookEvent.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteWabaWebhookEvent.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteWabaWebhookEvent.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteWabaWebhookEvent.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteWabaWebhookEvent.this.displayPhoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteWabaWebhookEvent.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[6], DeleteWabaWebhookEvent.this.field);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteWabaWebhookEvent.this.payload);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], DeleteWabaWebhookEvent.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], DeleteWabaWebhookEvent.this.updatedAt);
                }
            };
        }

        public String payload() {
            return this.payload;
        }

        public String phoneNumberId() {
            return this.phoneNumberId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteWabaWebhookEvent{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaAccountId=" + this.wabaAccountId + ", displayPhoneNumber=" + this.displayPhoneNumber + ", phoneNumberId=" + this.phoneNumberId + ", field=" + this.field + ", payload=" + this.payload + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String wabaAccountId() {
            return this.wabaAccountId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWabaWebhookEventConditionInput condition;
        private final DeleteWabaWebhookEventInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteWabaWebhookEventInput deleteWabaWebhookEventInput, ModelWabaWebhookEventConditionInput modelWabaWebhookEventConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteWabaWebhookEventInput;
            this.condition = modelWabaWebhookEventConditionInput;
            linkedHashMap.put("input", deleteWabaWebhookEventInput);
            linkedHashMap.put("condition", modelWabaWebhookEventConditionInput);
        }

        public ModelWabaWebhookEventConditionInput condition() {
            return this.condition;
        }

        public DeleteWabaWebhookEventInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteWabaWebhookEventMutation.Variables.1
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

    public DeleteWabaWebhookEventMutation(DeleteWabaWebhookEventInput deleteWabaWebhookEventInput, ModelWabaWebhookEventConditionInput modelWabaWebhookEventConditionInput) {
        Utils.checkNotNull(deleteWabaWebhookEventInput, "input == null");
        this.variables = new Variables(deleteWabaWebhookEventInput, modelWabaWebhookEventConditionInput);
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
        return "be8d2faac40d5b8cb4da1013f77b1c8eff58aee9aac55b9c08e5f213f18b289b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteWabaWebhookEvent($input: DeleteWabaWebhookEventInput!, $condition: ModelWabaWebhookEventConditionInput) {\n  deleteWabaWebhookEvent(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
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
