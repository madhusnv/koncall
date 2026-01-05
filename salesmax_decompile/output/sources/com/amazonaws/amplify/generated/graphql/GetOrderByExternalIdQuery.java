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
import type.ModelPaymentOrderFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetOrderByExternalIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetOrderByExternalId($idInPaymentProvider: String, $paymentProvider: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelPaymentOrderFilterInput, $limit: Int, $nextToken: String) {\n  getOrderByExternalId(idInPaymentProvider: $idInPaymentProvider, paymentProvider: $paymentProvider, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      paymentProvider\n      idInPaymentProvider\n      currency\n      amount\n      amountPaid\n      status\n      note\n      receipt\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetOrderByExternalId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetOrderByExternalId($idInPaymentProvider: String, $paymentProvider: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelPaymentOrderFilterInput, $limit: Int, $nextToken: String) {\n  getOrderByExternalId(idInPaymentProvider: $idInPaymentProvider, paymentProvider: $paymentProvider, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      paymentProvider\n      idInPaymentProvider\n      currency\n      amount\n      amountPaid\n      status\n      note\n      receipt\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelPaymentOrderFilterInput filter;
        private String idInPaymentProvider;
        private Integer limit;
        private String nextToken;
        private ModelStringKeyConditionInput paymentProvider;
        private ModelSortDirection sortDirection;

        public GetOrderByExternalIdQuery build() {
            return new GetOrderByExternalIdQuery(this.idInPaymentProvider, this.paymentProvider, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelPaymentOrderFilterInput modelPaymentOrderFilterInput) {
            this.filter = modelPaymentOrderFilterInput;
            return this;
        }

        public Builder idInPaymentProvider(String str) {
            this.idInPaymentProvider = str;
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

        public Builder paymentProvider(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.paymentProvider = modelStringKeyConditionInput;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getOrderByExternalId", "getOrderByExternalId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("paymentProvider", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "paymentProvider").build()).put("idInPaymentProvider", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "idInPaymentProvider").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetOrderByExternalId getOrderByExternalId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetOrderByExternalId.Mapper getOrderByExternalIdFieldMapper = new GetOrderByExternalId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetOrderByExternalId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetOrderByExternalId>() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetOrderByExternalId read(ResponseReader responseReader2) {
                        return Mapper.this.getOrderByExternalIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetOrderByExternalId getOrderByExternalId) {
            this.getOrderByExternalId = getOrderByExternalId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetOrderByExternalId getOrderByExternalId = this.getOrderByExternalId;
            GetOrderByExternalId getOrderByExternalId2 = ((Data) obj).getOrderByExternalId;
            return getOrderByExternalId == null ? getOrderByExternalId2 == null : getOrderByExternalId.equals(getOrderByExternalId2);
        }

        public GetOrderByExternalId getOrderByExternalId() {
            return this.getOrderByExternalId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetOrderByExternalId getOrderByExternalId = this.getOrderByExternalId;
                this.$hashCode = (getOrderByExternalId == null ? 0 : getOrderByExternalId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetOrderByExternalId getOrderByExternalId = Data.this.getOrderByExternalId;
                    responseWriter.writeObject(responseField, getOrderByExternalId != null ? getOrderByExternalId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getOrderByExternalId=" + this.getOrderByExternalId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetOrderByExternalId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetOrderByExternalId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetOrderByExternalId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetOrderByExternalId.$responseFields;
                return new GetOrderByExternalId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.GetOrderByExternalId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.GetOrderByExternalId.Mapper.1.1
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

        public GetOrderByExternalId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetOrderByExternalId)) {
                return false;
            }
            GetOrderByExternalId getOrderByExternalId = (GetOrderByExternalId) obj;
            if (this.__typename.equals(getOrderByExternalId.__typename) && this.items.equals(getOrderByExternalId.items)) {
                String str = this.nextToken;
                String str2 = getOrderByExternalId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.GetOrderByExternalId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetOrderByExternalId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetOrderByExternalId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetOrderByExternalId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.GetOrderByExternalId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetOrderByExternalId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetOrderByExternalId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String id;
        final String idInPaymentProvider;
        final String note;
        final String paymentProvider;
        final String receipt;
        final String status;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("idInPaymentProvider", "idInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forString("receipt", "receipt", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
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
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.contactId) != null ? str.equals(item.contactId) : item.contactId == null) && ((str2 = this.paymentProvider) != null ? str2.equals(item.paymentProvider) : item.paymentProvider == null) && ((str3 = this.idInPaymentProvider) != null ? str3.equals(item.idInPaymentProvider) : item.idInPaymentProvider == null) && ((str4 = this.currency) != null ? str4.equals(item.currency) : item.currency == null) && ((num = this.amount) != null ? num.equals(item.amount) : item.amount == null) && ((num2 = this.amountPaid) != null ? num2.equals(item.amountPaid) : item.amountPaid == null) && ((str5 = this.status) != null ? str5.equals(item.status) : item.status == null) && ((str6 = this.note) != null ? str6.equals(item.note) : item.note == null) && ((str7 = this.receipt) != null ? str7.equals(item.receipt) : item.receipt == null) && ((str8 = this.createdAt) != null ? str8.equals(item.createdAt) : item.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(item.updatedAt) : item.updatedAt == null) && ((str10 = this.createdById) != null ? str10.equals(item.createdById) : item.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = item.updatedById;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[5], Item.this.idInPaymentProvider);
                    responseWriter.writeString(responseFieldArr[6], Item.this.currency);
                    responseWriter.writeInt(responseFieldArr[7], Item.this.amount);
                    responseWriter.writeInt(responseFieldArr[8], Item.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[9], Item.this.status);
                    responseWriter.writeString(responseFieldArr[10], Item.this.note);
                    responseWriter.writeString(responseFieldArr[11], Item.this.receipt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedById);
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
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", currency=" + this.currency + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", status=" + this.status + ", note=" + this.note + ", receipt=" + this.receipt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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
        private final ModelPaymentOrderFilterInput filter;
        private final String idInPaymentProvider;
        private final Integer limit;
        private final String nextToken;
        private final ModelStringKeyConditionInput paymentProvider;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelPaymentOrderFilterInput modelPaymentOrderFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.idInPaymentProvider = str;
            this.paymentProvider = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelPaymentOrderFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("idInPaymentProvider", str);
            linkedHashMap.put("paymentProvider", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelPaymentOrderFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelPaymentOrderFilterInput filter() {
            return this.filter;
        }

        public String idInPaymentProvider() {
            return this.idInPaymentProvider;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOrderByExternalIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("idInPaymentProvider", Variables.this.idInPaymentProvider);
                    inputFieldWriter.writeObject("paymentProvider", Variables.this.paymentProvider != null ? Variables.this.paymentProvider.marshaller() : null);
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

        public ModelStringKeyConditionInput paymentProvider() {
            return this.paymentProvider;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetOrderByExternalIdQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelPaymentOrderFilterInput modelPaymentOrderFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelPaymentOrderFilterInput, num, str2);
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
        return "7b96743e5be08137f2019fb69930079a95e2abe8ca4bd658107af6d8c3e52656";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetOrderByExternalId($idInPaymentProvider: String, $paymentProvider: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelPaymentOrderFilterInput, $limit: Int, $nextToken: String) {\n  getOrderByExternalId(idInPaymentProvider: $idInPaymentProvider, paymentProvider: $paymentProvider, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      paymentProvider\n      idInPaymentProvider\n      currency\n      amount\n      amountPaid\n      status\n      note\n      receipt\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
