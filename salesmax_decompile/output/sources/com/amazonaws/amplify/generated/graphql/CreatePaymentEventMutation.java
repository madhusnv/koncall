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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreatePaymentEventInput;
import type.CustomType;
import type.ModelPaymentEventConditionInput;

/* loaded from: classes6.dex */
public final class CreatePaymentEventMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreatePaymentEvent($input: CreatePaymentEventInput!, $condition: ModelPaymentEventConditionInput) {\n  createPaymentEvent(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    orderId\n    externalOrderId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    status\n    note\n    description\n    method\n    international\n    refundStatus\n    amountRefunded\n    error\n    acquirerData\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentEventMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreatePaymentEvent";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreatePaymentEvent($input: CreatePaymentEventInput!, $condition: ModelPaymentEventConditionInput) {\n  createPaymentEvent(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    orderId\n    externalOrderId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    status\n    note\n    description\n    method\n    international\n    refundStatus\n    amountRefunded\n    error\n    acquirerData\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelPaymentEventConditionInput condition;
        private CreatePaymentEventInput input;

        public CreatePaymentEventMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreatePaymentEventMutation(this.input, this.condition);
        }

        public Builder condition(ModelPaymentEventConditionInput modelPaymentEventConditionInput) {
            this.condition = modelPaymentEventConditionInput;
            return this;
        }

        public Builder input(CreatePaymentEventInput createPaymentEventInput) {
            this.input = createPaymentEventInput;
            return this;
        }
    }

    public static class CreatePaymentEvent {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String acquirerData;
        final Integer amount;
        final Integer amountRefunded;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String currency;
        final String description;
        final String error;
        final String externalOrderId;
        final String id;
        final String idInPaymentProvider;
        final Boolean international;
        final String method;
        final String note;
        final String orderId;
        final String paymentProvider;
        final String refundStatus;
        final String status;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<CreatePaymentEvent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreatePaymentEvent map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreatePaymentEvent.$responseFields;
                return new CreatePaymentEvent(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readInt(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readBoolean(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("orderId", "orderId", null, true, customType, Collections.emptyList()), ResponseField.forString("externalOrderId", "externalOrderId", null, true, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("idInPaymentProvider", "idInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.METHOD, FirebaseAnalytics.Param.METHOD, null, true, Collections.emptyList()), ResponseField.forBoolean("international", "international", null, true, Collections.emptyList()), ResponseField.forString("refundStatus", "refundStatus", null, true, Collections.emptyList()), ResponseField.forInt("amountRefunded", "amountRefunded", null, true, Collections.emptyList()), ResponseField.forCustomType(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("acquirerData", "acquirerData", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public CreatePaymentEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, Boolean bool, String str14, Integer num2, String str15, String str16, String str17, String str18, String str19, String str20) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = str4;
            this.orderId = str5;
            this.externalOrderId = str6;
            this.paymentProvider = str7;
            this.idInPaymentProvider = str8;
            this.currency = str9;
            this.amount = num;
            this.status = str10;
            this.note = str11;
            this.description = str12;
            this.method = str13;
            this.international = bool;
            this.refundStatus = str14;
            this.amountRefunded = num2;
            this.error = str15;
            this.acquirerData = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
            this.createdById = str19;
            this.updatedById = str20;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String acquirerData() {
            return this.acquirerData;
        }

        public Integer amount() {
            return this.amount;
        }

        public Integer amountRefunded() {
            return this.amountRefunded;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String currency() {
            return this.currency;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Integer num;
            String str7;
            String str8;
            String str9;
            String str10;
            Boolean bool;
            String str11;
            Integer num2;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreatePaymentEvent)) {
                return false;
            }
            CreatePaymentEvent createPaymentEvent = (CreatePaymentEvent) obj;
            if (this.__typename.equals(createPaymentEvent.__typename) && this.id.equals(createPaymentEvent.id) && this.accountId.equals(createPaymentEvent.accountId) && ((str = this.contactId) != null ? str.equals(createPaymentEvent.contactId) : createPaymentEvent.contactId == null) && ((str2 = this.orderId) != null ? str2.equals(createPaymentEvent.orderId) : createPaymentEvent.orderId == null) && ((str3 = this.externalOrderId) != null ? str3.equals(createPaymentEvent.externalOrderId) : createPaymentEvent.externalOrderId == null) && ((str4 = this.paymentProvider) != null ? str4.equals(createPaymentEvent.paymentProvider) : createPaymentEvent.paymentProvider == null) && ((str5 = this.idInPaymentProvider) != null ? str5.equals(createPaymentEvent.idInPaymentProvider) : createPaymentEvent.idInPaymentProvider == null) && ((str6 = this.currency) != null ? str6.equals(createPaymentEvent.currency) : createPaymentEvent.currency == null) && ((num = this.amount) != null ? num.equals(createPaymentEvent.amount) : createPaymentEvent.amount == null) && ((str7 = this.status) != null ? str7.equals(createPaymentEvent.status) : createPaymentEvent.status == null) && ((str8 = this.note) != null ? str8.equals(createPaymentEvent.note) : createPaymentEvent.note == null) && ((str9 = this.description) != null ? str9.equals(createPaymentEvent.description) : createPaymentEvent.description == null) && ((str10 = this.method) != null ? str10.equals(createPaymentEvent.method) : createPaymentEvent.method == null) && ((bool = this.international) != null ? bool.equals(createPaymentEvent.international) : createPaymentEvent.international == null) && ((str11 = this.refundStatus) != null ? str11.equals(createPaymentEvent.refundStatus) : createPaymentEvent.refundStatus == null) && ((num2 = this.amountRefunded) != null ? num2.equals(createPaymentEvent.amountRefunded) : createPaymentEvent.amountRefunded == null) && ((str12 = this.error) != null ? str12.equals(createPaymentEvent.error) : createPaymentEvent.error == null) && ((str13 = this.acquirerData) != null ? str13.equals(createPaymentEvent.acquirerData) : createPaymentEvent.acquirerData == null) && ((str14 = this.createdAt) != null ? str14.equals(createPaymentEvent.createdAt) : createPaymentEvent.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(createPaymentEvent.updatedAt) : createPaymentEvent.updatedAt == null) && ((str16 = this.createdById) != null ? str16.equals(createPaymentEvent.createdById) : createPaymentEvent.createdById == null)) {
                String str17 = this.updatedById;
                String str18 = createPaymentEvent.updatedById;
                if (str17 == null) {
                    if (str18 == null) {
                        return true;
                    }
                } else if (str17.equals(str18)) {
                    return true;
                }
            }
            return false;
        }

        public String error() {
            return this.error;
        }

        public String externalOrderId() {
            return this.externalOrderId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.orderId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.externalOrderId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.paymentProvider;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.idInPaymentProvider;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.currency;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num = this.amount;
                int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str7 = this.status;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.note;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.description;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.method;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Boolean bool = this.international;
                int iHashCode13 = (iHashCode12 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str11 = this.refundStatus;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Integer num2 = this.amountRefunded;
                int iHashCode15 = (iHashCode14 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str12 = this.error;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.acquirerData;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode19 = (iHashCode18 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.createdById;
                int iHashCode20 = (iHashCode19 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.updatedById;
                this.$hashCode = iHashCode20 ^ (str17 != null ? str17.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String idInPaymentProvider() {
            return this.idInPaymentProvider;
        }

        public Boolean international() {
            return this.international;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentEventMutation.CreatePaymentEvent.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreatePaymentEvent.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreatePaymentEvent.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreatePaymentEvent.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreatePaymentEvent.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreatePaymentEvent.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreatePaymentEvent.this.orderId);
                    responseWriter.writeString(responseFieldArr[5], CreatePaymentEvent.this.externalOrderId);
                    responseWriter.writeString(responseFieldArr[6], CreatePaymentEvent.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[7], CreatePaymentEvent.this.idInPaymentProvider);
                    responseWriter.writeString(responseFieldArr[8], CreatePaymentEvent.this.currency);
                    responseWriter.writeInt(responseFieldArr[9], CreatePaymentEvent.this.amount);
                    responseWriter.writeString(responseFieldArr[10], CreatePaymentEvent.this.status);
                    responseWriter.writeString(responseFieldArr[11], CreatePaymentEvent.this.note);
                    responseWriter.writeString(responseFieldArr[12], CreatePaymentEvent.this.description);
                    responseWriter.writeString(responseFieldArr[13], CreatePaymentEvent.this.method);
                    responseWriter.writeBoolean(responseFieldArr[14], CreatePaymentEvent.this.international);
                    responseWriter.writeString(responseFieldArr[15], CreatePaymentEvent.this.refundStatus);
                    responseWriter.writeInt(responseFieldArr[16], CreatePaymentEvent.this.amountRefunded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], CreatePaymentEvent.this.error);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CreatePaymentEvent.this.acquirerData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CreatePaymentEvent.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], CreatePaymentEvent.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], CreatePaymentEvent.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], CreatePaymentEvent.this.updatedById);
                }
            };
        }

        public String method() {
            return this.method;
        }

        public String note() {
            return this.note;
        }

        public String orderId() {
            return this.orderId;
        }

        public String paymentProvider() {
            return this.paymentProvider;
        }

        public String refundStatus() {
            return this.refundStatus;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreatePaymentEvent{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", orderId=" + this.orderId + ", externalOrderId=" + this.externalOrderId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", currency=" + this.currency + ", amount=" + this.amount + ", status=" + this.status + ", note=" + this.note + ", description=" + this.description + ", method=" + this.method + ", international=" + this.international + ", refundStatus=" + this.refundStatus + ", amountRefunded=" + this.amountRefunded + ", error=" + this.error + ", acquirerData=" + this.acquirerData + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createPaymentEvent", "createPaymentEvent", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreatePaymentEvent createPaymentEvent;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreatePaymentEvent.Mapper createPaymentEventFieldMapper = new CreatePaymentEvent.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreatePaymentEvent) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreatePaymentEvent>() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentEventMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreatePaymentEvent read(ResponseReader responseReader2) {
                        return Mapper.this.createPaymentEventFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreatePaymentEvent createPaymentEvent) {
            this.createPaymentEvent = createPaymentEvent;
        }

        public CreatePaymentEvent createPaymentEvent() {
            return this.createPaymentEvent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreatePaymentEvent createPaymentEvent = this.createPaymentEvent;
            CreatePaymentEvent createPaymentEvent2 = ((Data) obj).createPaymentEvent;
            return createPaymentEvent == null ? createPaymentEvent2 == null : createPaymentEvent.equals(createPaymentEvent2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreatePaymentEvent createPaymentEvent = this.createPaymentEvent;
                this.$hashCode = (createPaymentEvent == null ? 0 : createPaymentEvent.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentEventMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreatePaymentEvent createPaymentEvent = Data.this.createPaymentEvent;
                    responseWriter.writeObject(responseField, createPaymentEvent != null ? createPaymentEvent.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createPaymentEvent=" + this.createPaymentEvent + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelPaymentEventConditionInput condition;
        private final CreatePaymentEventInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreatePaymentEventInput createPaymentEventInput, ModelPaymentEventConditionInput modelPaymentEventConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createPaymentEventInput;
            this.condition = modelPaymentEventConditionInput;
            linkedHashMap.put("input", createPaymentEventInput);
            linkedHashMap.put("condition", modelPaymentEventConditionInput);
        }

        public ModelPaymentEventConditionInput condition() {
            return this.condition;
        }

        public CreatePaymentEventInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentEventMutation.Variables.1
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

    public CreatePaymentEventMutation(CreatePaymentEventInput createPaymentEventInput, ModelPaymentEventConditionInput modelPaymentEventConditionInput) {
        Utils.checkNotNull(createPaymentEventInput, "input == null");
        this.variables = new Variables(createPaymentEventInput, modelPaymentEventConditionInput);
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
        return "2c60c86b449091ceebab08f4de7f5c0fe17ad0873db99de4a8aa7d12e344a70b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreatePaymentEvent($input: CreatePaymentEventInput!, $condition: ModelPaymentEventConditionInput) {\n  createPaymentEvent(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    orderId\n    externalOrderId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    status\n    note\n    description\n    method\n    international\n    refundStatus\n    amountRefunded\n    error\n    acquirerData\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
