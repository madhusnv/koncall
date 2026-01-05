package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelPaymentDataFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetPaymentDataByPaymentLinkIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetPaymentDataByPaymentLinkId($paymentLinkId: ID, $sortDirection: ModelSortDirection, $filter: ModelPaymentDataFilterInput, $limit: Int, $nextToken: String) {\n  getPaymentDataByPaymentLinkId(paymentLinkId: $paymentLinkId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetPaymentDataByPaymentLinkId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetPaymentDataByPaymentLinkId($paymentLinkId: ID, $sortDirection: ModelSortDirection, $filter: ModelPaymentDataFilterInput, $limit: Int, $nextToken: String) {\n  getPaymentDataByPaymentLinkId(paymentLinkId: $paymentLinkId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelPaymentDataFilterInput filter;
        private Integer limit;
        private String nextToken;
        private String paymentLinkId;
        private ModelSortDirection sortDirection;

        public GetPaymentDataByPaymentLinkIdQuery build() {
            return new GetPaymentDataByPaymentLinkIdQuery(this.paymentLinkId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelPaymentDataFilterInput modelPaymentDataFilterInput) {
            this.filter = modelPaymentDataFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder paymentLinkId(String str) {
            this.paymentLinkId = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getPaymentDataByPaymentLinkId", "getPaymentDataByPaymentLinkId", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("paymentLinkId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "paymentLinkId").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetPaymentDataByPaymentLinkId.Mapper getPaymentDataByPaymentLinkIdFieldMapper = new GetPaymentDataByPaymentLinkId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetPaymentDataByPaymentLinkId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetPaymentDataByPaymentLinkId>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetPaymentDataByPaymentLinkId read(ResponseReader responseReader2) {
                        return Mapper.this.getPaymentDataByPaymentLinkIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId) {
            this.getPaymentDataByPaymentLinkId = getPaymentDataByPaymentLinkId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId = this.getPaymentDataByPaymentLinkId;
            GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId2 = ((Data) obj).getPaymentDataByPaymentLinkId;
            return getPaymentDataByPaymentLinkId == null ? getPaymentDataByPaymentLinkId2 == null : getPaymentDataByPaymentLinkId.equals(getPaymentDataByPaymentLinkId2);
        }

        public GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId() {
            return this.getPaymentDataByPaymentLinkId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId = this.getPaymentDataByPaymentLinkId;
                this.$hashCode = (getPaymentDataByPaymentLinkId == null ? 0 : getPaymentDataByPaymentLinkId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId = Data.this.getPaymentDataByPaymentLinkId;
                    responseWriter.writeObject(responseField, getPaymentDataByPaymentLinkId != null ? getPaymentDataByPaymentLinkId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getPaymentDataByPaymentLinkId=" + this.getPaymentDataByPaymentLinkId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetPaymentDataByPaymentLinkId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetPaymentDataByPaymentLinkId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetPaymentDataByPaymentLinkId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetPaymentDataByPaymentLinkId.$responseFields;
                return new GetPaymentDataByPaymentLinkId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.GetPaymentDataByPaymentLinkId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.GetPaymentDataByPaymentLinkId.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]));
            }
        }

        public GetPaymentDataByPaymentLinkId(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPaymentDataByPaymentLinkId)) {
                return false;
            }
            GetPaymentDataByPaymentLinkId getPaymentDataByPaymentLinkId = (GetPaymentDataByPaymentLinkId) obj;
            if (this.__typename.equals(getPaymentDataByPaymentLinkId.__typename) && this.items.equals(getPaymentDataByPaymentLinkId.items)) {
                String str = this.nextToken;
                String str2 = getPaymentDataByPaymentLinkId.nextToken;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.GetPaymentDataByPaymentLinkId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetPaymentDataByPaymentLinkId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetPaymentDataByPaymentLinkId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetPaymentDataByPaymentLinkId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.GetPaymentDataByPaymentLinkId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetPaymentDataByPaymentLinkId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetPaymentDataByPaymentLinkId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Item {
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
        final String customPaymentData;
        final String engagementId;
        final String finalPaymentDate;
        final String id;
        final String lastPaymentStatus;
        final String note;
        final String orderId;
        final String orderIdInPaymentProvider;
        final List<String> paidByContactIds;
        final String paymentLinkId;
        final String paymentLinkUrl;
        final String paymentProvider;
        final String paymentRequestType;
        final String status;
        final List<String> transactionId;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentRequestType", "paymentRequestType", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("orderIdInPaymentProvider", "orderIdInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forCustomType("orderId", "orderId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("paymentLinkId", "paymentLinkId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentLinkUrl", "paymentLinkUrl", null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("finalPaymentDate", "finalPaymentDate", null, true, customType2, Collections.emptyList()), ResponseField.forList("paidByContactIds", "paidByContactIds", null, true, Collections.emptyList()), ResponseField.forList("transactionId", "transactionId", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("customPaymentData", "customPaymentData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, String str15, List<String> list, List<String> list2, String str16, String str17, String str18, String str19, String str20, String str21) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = str4;
            this.paymentRequestType = str5;
            this.engagementId = str6;
            this.paymentProvider = str7;
            this.orderIdInPaymentProvider = str8;
            this.orderId = str9;
            this.paymentLinkId = str10;
            this.paymentLinkUrl = str11;
            this.amount = num;
            this.amountPaid = num2;
            this.currency = str12;
            this.status = str13;
            this.lastPaymentStatus = str14;
            this.finalPaymentDate = str15;
            this.paidByContactIds = list;
            this.transactionId = list2;
            this.note = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
            this.customPaymentData = str19;
            this.createdById = str20;
            this.updatedById = str21;
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

        public String customPaymentData() {
            return this.customPaymentData;
        }

        public String engagementId() {
            return this.engagementId;
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
            Integer num;
            Integer num2;
            String str9;
            String str10;
            String str11;
            String str12;
            List<String> list;
            List<String> list2;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.contactId) != null ? str.equals(item.contactId) : item.contactId == null) && ((str2 = this.paymentRequestType) != null ? str2.equals(item.paymentRequestType) : item.paymentRequestType == null) && ((str3 = this.engagementId) != null ? str3.equals(item.engagementId) : item.engagementId == null) && ((str4 = this.paymentProvider) != null ? str4.equals(item.paymentProvider) : item.paymentProvider == null) && ((str5 = this.orderIdInPaymentProvider) != null ? str5.equals(item.orderIdInPaymentProvider) : item.orderIdInPaymentProvider == null) && ((str6 = this.orderId) != null ? str6.equals(item.orderId) : item.orderId == null) && ((str7 = this.paymentLinkId) != null ? str7.equals(item.paymentLinkId) : item.paymentLinkId == null) && ((str8 = this.paymentLinkUrl) != null ? str8.equals(item.paymentLinkUrl) : item.paymentLinkUrl == null) && ((num = this.amount) != null ? num.equals(item.amount) : item.amount == null) && ((num2 = this.amountPaid) != null ? num2.equals(item.amountPaid) : item.amountPaid == null) && ((str9 = this.currency) != null ? str9.equals(item.currency) : item.currency == null) && ((str10 = this.status) != null ? str10.equals(item.status) : item.status == null) && ((str11 = this.lastPaymentStatus) != null ? str11.equals(item.lastPaymentStatus) : item.lastPaymentStatus == null) && ((str12 = this.finalPaymentDate) != null ? str12.equals(item.finalPaymentDate) : item.finalPaymentDate == null) && ((list = this.paidByContactIds) != null ? list.equals(item.paidByContactIds) : item.paidByContactIds == null) && ((list2 = this.transactionId) != null ? list2.equals(item.transactionId) : item.transactionId == null) && ((str13 = this.note) != null ? str13.equals(item.note) : item.note == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(item.updatedAt) : item.updatedAt == null) && ((str16 = this.customPaymentData) != null ? str16.equals(item.customPaymentData) : item.customPaymentData == null) && ((str17 = this.createdById) != null ? str17.equals(item.createdById) : item.createdById == null)) {
                String str18 = this.updatedById;
                String str19 = item.updatedById;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public String finalPaymentDate() {
            return this.finalPaymentDate;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.paymentRequestType;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.engagementId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.paymentProvider;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.orderIdInPaymentProvider;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.orderId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.paymentLinkId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.paymentLinkUrl;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Integer num = this.amount;
                int iHashCode10 = (iHashCode9 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.amountPaid;
                int iHashCode11 = (iHashCode10 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str9 = this.currency;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.status;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.lastPaymentStatus;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.finalPaymentDate;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.paidByContactIds;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.transactionId;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str13 = this.note;
                int iHashCode18 = (iHashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode20 = (iHashCode19 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.customPaymentData;
                int iHashCode21 = (iHashCode20 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedById;
                this.$hashCode = iHashCode22 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastPaymentStatus() {
            return this.lastPaymentStatus;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.paymentRequestType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.engagementId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[7], Item.this.orderIdInPaymentProvider);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.orderId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.paymentLinkId);
                    responseWriter.writeString(responseFieldArr[10], Item.this.paymentLinkUrl);
                    responseWriter.writeInt(responseFieldArr[11], Item.this.amount);
                    responseWriter.writeInt(responseFieldArr[12], Item.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[13], Item.this.currency);
                    responseWriter.writeString(responseFieldArr[14], Item.this.status);
                    responseWriter.writeString(responseFieldArr[15], Item.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.finalPaymentDate);
                    responseWriter.writeList(responseFieldArr[17], Item.this.paidByContactIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[18], Item.this.transactionId, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[19], Item.this.note);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.customPaymentData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.updatedById);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String orderId() {
            return this.orderId;
        }

        public String orderIdInPaymentProvider() {
            return this.orderIdInPaymentProvider;
        }

        public List<String> paidByContactIds() {
            return this.paidByContactIds;
        }

        public String paymentLinkId() {
            return this.paymentLinkId;
        }

        public String paymentLinkUrl() {
            return this.paymentLinkUrl;
        }

        public String paymentProvider() {
            return this.paymentProvider;
        }

        public String paymentRequestType() {
            return this.paymentRequestType;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentRequestType=" + this.paymentRequestType + ", engagementId=" + this.engagementId + ", paymentProvider=" + this.paymentProvider + ", orderIdInPaymentProvider=" + this.orderIdInPaymentProvider + ", orderId=" + this.orderId + ", paymentLinkId=" + this.paymentLinkId + ", paymentLinkUrl=" + this.paymentLinkUrl + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", currency=" + this.currency + ", status=" + this.status + ", lastPaymentStatus=" + this.lastPaymentStatus + ", finalPaymentDate=" + this.finalPaymentDate + ", paidByContactIds=" + this.paidByContactIds + ", transactionId=" + this.transactionId + ", note=" + this.note + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", customPaymentData=" + this.customPaymentData + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public List<String> transactionId() {
            return this.transactionId;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelPaymentDataFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final String paymentLinkId;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelSortDirection modelSortDirection, ModelPaymentDataFilterInput modelPaymentDataFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.paymentLinkId = str;
            this.sortDirection = modelSortDirection;
            this.filter = modelPaymentDataFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("paymentLinkId", str);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelPaymentDataFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelPaymentDataFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentDataByPaymentLinkIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("paymentLinkId", Variables.this.paymentLinkId);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String paymentLinkId() {
            return this.paymentLinkId;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetPaymentDataByPaymentLinkIdQuery(String str, ModelSortDirection modelSortDirection, ModelPaymentDataFilterInput modelPaymentDataFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelSortDirection, modelPaymentDataFilterInput, num, str2);
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
        return "36490bce6534f3e3b6d51bf700023db320cb2bbb68e7a9978bbf626a2c1a6d3e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetPaymentDataByPaymentLinkId($paymentLinkId: ID, $sortDirection: ModelSortDirection, $filter: ModelPaymentDataFilterInput, $limit: Int, $nextToken: String) {\n  getPaymentDataByPaymentLinkId(paymentLinkId: $paymentLinkId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
