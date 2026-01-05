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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreatePaymentOrderInput;
import type.CustomType;
import type.ModelPaymentOrderConditionInput;

/* loaded from: classes6.dex */
public final class CreatePaymentOrderMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreatePaymentOrder($input: CreatePaymentOrderInput!, $condition: ModelPaymentOrderConditionInput) {\n  createPaymentOrder(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    amountPaid\n    status\n    note\n    receipt\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentOrderMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreatePaymentOrder";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreatePaymentOrder($input: CreatePaymentOrderInput!, $condition: ModelPaymentOrderConditionInput) {\n  createPaymentOrder(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    amountPaid\n    status\n    note\n    receipt\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelPaymentOrderConditionInput condition;
        private CreatePaymentOrderInput input;

        public CreatePaymentOrderMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreatePaymentOrderMutation(this.input, this.condition);
        }

        public Builder condition(ModelPaymentOrderConditionInput modelPaymentOrderConditionInput) {
            this.condition = modelPaymentOrderConditionInput;
            return this;
        }

        public Builder input(CreatePaymentOrderInput createPaymentOrderInput) {
            this.input = createPaymentOrderInput;
            return this;
        }
    }

    public static class CreatePaymentOrder {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Integer amount;
        final Integer amountPaid;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String currency;
        final String id;
        final String idInPaymentProvider;
        final String note;
        final String paymentProvider;
        final String receipt;
        final String status;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<CreatePaymentOrder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreatePaymentOrder map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreatePaymentOrder.$responseFields;
                return new CreatePaymentOrder(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("idInPaymentProvider", "idInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forString("receipt", "receipt", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public CreatePaymentOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = str4;
            this.paymentProvider = str5;
            this.idInPaymentProvider = str6;
            this.currency = str7;
            this.amount = num;
            this.amountPaid = num2;
            this.status = str8;
            this.note = str9;
            this.receipt = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.createdById = str13;
            this.updatedById = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer amount() {
            return this.amount;
        }

        public Integer amountPaid() {
            return this.amountPaid;
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

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            Integer num2;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreatePaymentOrder)) {
                return false;
            }
            CreatePaymentOrder createPaymentOrder = (CreatePaymentOrder) obj;
            if (this.__typename.equals(createPaymentOrder.__typename) && this.id.equals(createPaymentOrder.id) && this.accountId.equals(createPaymentOrder.accountId) && ((str = this.contactId) != null ? str.equals(createPaymentOrder.contactId) : createPaymentOrder.contactId == null) && ((str2 = this.paymentProvider) != null ? str2.equals(createPaymentOrder.paymentProvider) : createPaymentOrder.paymentProvider == null) && ((str3 = this.idInPaymentProvider) != null ? str3.equals(createPaymentOrder.idInPaymentProvider) : createPaymentOrder.idInPaymentProvider == null) && ((str4 = this.currency) != null ? str4.equals(createPaymentOrder.currency) : createPaymentOrder.currency == null) && ((num = this.amount) != null ? num.equals(createPaymentOrder.amount) : createPaymentOrder.amount == null) && ((num2 = this.amountPaid) != null ? num2.equals(createPaymentOrder.amountPaid) : createPaymentOrder.amountPaid == null) && ((str5 = this.status) != null ? str5.equals(createPaymentOrder.status) : createPaymentOrder.status == null) && ((str6 = this.note) != null ? str6.equals(createPaymentOrder.note) : createPaymentOrder.note == null) && ((str7 = this.receipt) != null ? str7.equals(createPaymentOrder.receipt) : createPaymentOrder.receipt == null) && ((str8 = this.createdAt) != null ? str8.equals(createPaymentOrder.createdAt) : createPaymentOrder.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(createPaymentOrder.updatedAt) : createPaymentOrder.updatedAt == null) && ((str10 = this.createdById) != null ? str10.equals(createPaymentOrder.createdById) : createPaymentOrder.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = createPaymentOrder.updatedById;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.paymentProvider;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.idInPaymentProvider;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.currency;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Integer num = this.amount;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.amountPaid;
                int iHashCode7 = (iHashCode6 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str5 = this.status;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.note;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.receipt;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdById;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedById;
                this.$hashCode = iHashCode13 ^ (str11 != null ? str11.hashCode() : 0);
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

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentOrderMutation.CreatePaymentOrder.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreatePaymentOrder.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreatePaymentOrder.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreatePaymentOrder.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreatePaymentOrder.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreatePaymentOrder.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], CreatePaymentOrder.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[5], CreatePaymentOrder.this.idInPaymentProvider);
                    responseWriter.writeString(responseFieldArr[6], CreatePaymentOrder.this.currency);
                    responseWriter.writeInt(responseFieldArr[7], CreatePaymentOrder.this.amount);
                    responseWriter.writeInt(responseFieldArr[8], CreatePaymentOrder.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[9], CreatePaymentOrder.this.status);
                    responseWriter.writeString(responseFieldArr[10], CreatePaymentOrder.this.note);
                    responseWriter.writeString(responseFieldArr[11], CreatePaymentOrder.this.receipt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreatePaymentOrder.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], CreatePaymentOrder.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], CreatePaymentOrder.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], CreatePaymentOrder.this.updatedById);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String paymentProvider() {
            return this.paymentProvider;
        }

        public String receipt() {
            return this.receipt;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreatePaymentOrder{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", currency=" + this.currency + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", status=" + this.status + ", note=" + this.note + ", receipt=" + this.receipt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("createPaymentOrder", "createPaymentOrder", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreatePaymentOrder createPaymentOrder;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreatePaymentOrder.Mapper createPaymentOrderFieldMapper = new CreatePaymentOrder.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreatePaymentOrder) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreatePaymentOrder>() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentOrderMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreatePaymentOrder read(ResponseReader responseReader2) {
                        return Mapper.this.createPaymentOrderFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreatePaymentOrder createPaymentOrder) {
            this.createPaymentOrder = createPaymentOrder;
        }

        public CreatePaymentOrder createPaymentOrder() {
            return this.createPaymentOrder;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreatePaymentOrder createPaymentOrder = this.createPaymentOrder;
            CreatePaymentOrder createPaymentOrder2 = ((Data) obj).createPaymentOrder;
            return createPaymentOrder == null ? createPaymentOrder2 == null : createPaymentOrder.equals(createPaymentOrder2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreatePaymentOrder createPaymentOrder = this.createPaymentOrder;
                this.$hashCode = (createPaymentOrder == null ? 0 : createPaymentOrder.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentOrderMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreatePaymentOrder createPaymentOrder = Data.this.createPaymentOrder;
                    responseWriter.writeObject(responseField, createPaymentOrder != null ? createPaymentOrder.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createPaymentOrder=" + this.createPaymentOrder + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelPaymentOrderConditionInput condition;
        private final CreatePaymentOrderInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreatePaymentOrderInput createPaymentOrderInput, ModelPaymentOrderConditionInput modelPaymentOrderConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createPaymentOrderInput;
            this.condition = modelPaymentOrderConditionInput;
            linkedHashMap.put("input", createPaymentOrderInput);
            linkedHashMap.put("condition", modelPaymentOrderConditionInput);
        }

        public ModelPaymentOrderConditionInput condition() {
            return this.condition;
        }

        public CreatePaymentOrderInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreatePaymentOrderMutation.Variables.1
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

    public CreatePaymentOrderMutation(CreatePaymentOrderInput createPaymentOrderInput, ModelPaymentOrderConditionInput modelPaymentOrderConditionInput) {
        Utils.checkNotNull(createPaymentOrderInput, "input == null");
        this.variables = new Variables(createPaymentOrderInput, modelPaymentOrderConditionInput);
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
        return "b600850d6fab16017b30a8e2ef1d31b4a3c663a66c3c791e553a803f9a545b50";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreatePaymentOrder($input: CreatePaymentOrderInput!, $condition: ModelPaymentOrderConditionInput) {\n  createPaymentOrder(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    amountPaid\n    status\n    note\n    receipt\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
