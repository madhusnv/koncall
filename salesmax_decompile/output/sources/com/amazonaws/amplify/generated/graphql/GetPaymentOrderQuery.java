package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
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
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetPaymentOrderQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetPaymentOrder($id: ID!) {\n  getPaymentOrder(id: $id) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    amountPaid\n    status\n    note\n    receipt\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentOrderQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetPaymentOrder";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetPaymentOrder($id: ID!) {\n  getPaymentOrder(id: $id) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    amountPaid\n    status\n    note\n    receipt\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetPaymentOrderQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetPaymentOrderQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getPaymentOrder", "getPaymentOrder", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetPaymentOrder getPaymentOrder;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetPaymentOrder.Mapper getPaymentOrderFieldMapper = new GetPaymentOrder.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetPaymentOrder) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetPaymentOrder>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentOrderQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetPaymentOrder read(ResponseReader responseReader2) {
                        return Mapper.this.getPaymentOrderFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetPaymentOrder getPaymentOrder) {
            this.getPaymentOrder = getPaymentOrder;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetPaymentOrder getPaymentOrder = this.getPaymentOrder;
            GetPaymentOrder getPaymentOrder2 = ((Data) obj).getPaymentOrder;
            return getPaymentOrder == null ? getPaymentOrder2 == null : getPaymentOrder.equals(getPaymentOrder2);
        }

        public GetPaymentOrder getPaymentOrder() {
            return this.getPaymentOrder;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetPaymentOrder getPaymentOrder = this.getPaymentOrder;
                this.$hashCode = (getPaymentOrder == null ? 0 : getPaymentOrder.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentOrderQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetPaymentOrder getPaymentOrder = Data.this.getPaymentOrder;
                    responseWriter.writeObject(responseField, getPaymentOrder != null ? getPaymentOrder.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getPaymentOrder=" + this.getPaymentOrder + "}";
            }
            return this.$toString;
        }
    }

    public static class GetPaymentOrder {
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

        public static final class Mapper implements ResponseFieldMapper<GetPaymentOrder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetPaymentOrder map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetPaymentOrder.$responseFields;
                return new GetPaymentOrder(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("idInPaymentProvider", "idInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forString("receipt", "receipt", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public GetPaymentOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
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
            if (!(obj instanceof GetPaymentOrder)) {
                return false;
            }
            GetPaymentOrder getPaymentOrder = (GetPaymentOrder) obj;
            if (this.__typename.equals(getPaymentOrder.__typename) && this.id.equals(getPaymentOrder.id) && this.accountId.equals(getPaymentOrder.accountId) && ((str = this.contactId) != null ? str.equals(getPaymentOrder.contactId) : getPaymentOrder.contactId == null) && ((str2 = this.paymentProvider) != null ? str2.equals(getPaymentOrder.paymentProvider) : getPaymentOrder.paymentProvider == null) && ((str3 = this.idInPaymentProvider) != null ? str3.equals(getPaymentOrder.idInPaymentProvider) : getPaymentOrder.idInPaymentProvider == null) && ((str4 = this.currency) != null ? str4.equals(getPaymentOrder.currency) : getPaymentOrder.currency == null) && ((num = this.amount) != null ? num.equals(getPaymentOrder.amount) : getPaymentOrder.amount == null) && ((num2 = this.amountPaid) != null ? num2.equals(getPaymentOrder.amountPaid) : getPaymentOrder.amountPaid == null) && ((str5 = this.status) != null ? str5.equals(getPaymentOrder.status) : getPaymentOrder.status == null) && ((str6 = this.note) != null ? str6.equals(getPaymentOrder.note) : getPaymentOrder.note == null) && ((str7 = this.receipt) != null ? str7.equals(getPaymentOrder.receipt) : getPaymentOrder.receipt == null) && ((str8 = this.createdAt) != null ? str8.equals(getPaymentOrder.createdAt) : getPaymentOrder.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(getPaymentOrder.updatedAt) : getPaymentOrder.updatedAt == null) && ((str10 = this.createdById) != null ? str10.equals(getPaymentOrder.createdById) : getPaymentOrder.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = getPaymentOrder.updatedById;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentOrderQuery.GetPaymentOrder.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetPaymentOrder.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetPaymentOrder.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetPaymentOrder.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetPaymentOrder.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetPaymentOrder.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], GetPaymentOrder.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[5], GetPaymentOrder.this.idInPaymentProvider);
                    responseWriter.writeString(responseFieldArr[6], GetPaymentOrder.this.currency);
                    responseWriter.writeInt(responseFieldArr[7], GetPaymentOrder.this.amount);
                    responseWriter.writeInt(responseFieldArr[8], GetPaymentOrder.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[9], GetPaymentOrder.this.status);
                    responseWriter.writeString(responseFieldArr[10], GetPaymentOrder.this.note);
                    responseWriter.writeString(responseFieldArr[11], GetPaymentOrder.this.receipt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], GetPaymentOrder.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], GetPaymentOrder.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], GetPaymentOrder.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], GetPaymentOrder.this.updatedById);
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
                this.$toString = "GetPaymentOrder{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", currency=" + this.currency + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", status=" + this.status + ", note=" + this.note + ", receipt=" + this.receipt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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

    public static final class Variables extends Operation.Variables {
        private final String id;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.id = str;
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }

        public String id() {
            return this.id;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentOrderQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, Variables.this.id);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetPaymentOrderQuery(String str) {
        Utils.checkNotNull(str, "id == null");
        this.variables = new Variables(str);
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
        return "4a2dd850d410de2e13cd77d3b252cfcc0b526aacaf9c3ef539266994572ff896";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetPaymentOrder($id: ID!) {\n  getPaymentOrder(id: $id) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    currency\n    amount\n    amountPaid\n    status\n    note\n    receipt\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
