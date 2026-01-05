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
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelPaymentEventFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetPaymentByExternalIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetPaymentByExternalId($idInPaymentProvider: String, $paymentProvider: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelPaymentEventFilterInput, $limit: Int, $nextToken: String) {\n  getPaymentByExternalId(idInPaymentProvider: $idInPaymentProvider, paymentProvider: $paymentProvider, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      orderId\n      externalOrderId\n      paymentProvider\n      idInPaymentProvider\n      currency\n      amount\n      status\n      note\n      description\n      method\n      international\n      refundStatus\n      amountRefunded\n      error\n      acquirerData\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetPaymentByExternalId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetPaymentByExternalId($idInPaymentProvider: String, $paymentProvider: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelPaymentEventFilterInput, $limit: Int, $nextToken: String) {\n  getPaymentByExternalId(idInPaymentProvider: $idInPaymentProvider, paymentProvider: $paymentProvider, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      orderId\n      externalOrderId\n      paymentProvider\n      idInPaymentProvider\n      currency\n      amount\n      status\n      note\n      description\n      method\n      international\n      refundStatus\n      amountRefunded\n      error\n      acquirerData\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelPaymentEventFilterInput filter;
        private String idInPaymentProvider;
        private Integer limit;
        private String nextToken;
        private ModelStringKeyConditionInput paymentProvider;
        private ModelSortDirection sortDirection;

        public GetPaymentByExternalIdQuery build() {
            return new GetPaymentByExternalIdQuery(this.idInPaymentProvider, this.paymentProvider, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelPaymentEventFilterInput modelPaymentEventFilterInput) {
            this.filter = modelPaymentEventFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getPaymentByExternalId", "getPaymentByExternalId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("paymentProvider", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "paymentProvider").build()).put("idInPaymentProvider", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "idInPaymentProvider").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetPaymentByExternalId getPaymentByExternalId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetPaymentByExternalId.Mapper getPaymentByExternalIdFieldMapper = new GetPaymentByExternalId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetPaymentByExternalId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetPaymentByExternalId>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetPaymentByExternalId read(ResponseReader responseReader2) {
                        return Mapper.this.getPaymentByExternalIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetPaymentByExternalId getPaymentByExternalId) {
            this.getPaymentByExternalId = getPaymentByExternalId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetPaymentByExternalId getPaymentByExternalId = this.getPaymentByExternalId;
            GetPaymentByExternalId getPaymentByExternalId2 = ((Data) obj).getPaymentByExternalId;
            return getPaymentByExternalId == null ? getPaymentByExternalId2 == null : getPaymentByExternalId.equals(getPaymentByExternalId2);
        }

        public GetPaymentByExternalId getPaymentByExternalId() {
            return this.getPaymentByExternalId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetPaymentByExternalId getPaymentByExternalId = this.getPaymentByExternalId;
                this.$hashCode = (getPaymentByExternalId == null ? 0 : getPaymentByExternalId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetPaymentByExternalId getPaymentByExternalId = Data.this.getPaymentByExternalId;
                    responseWriter.writeObject(responseField, getPaymentByExternalId != null ? getPaymentByExternalId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getPaymentByExternalId=" + this.getPaymentByExternalId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetPaymentByExternalId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetPaymentByExternalId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetPaymentByExternalId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetPaymentByExternalId.$responseFields;
                return new GetPaymentByExternalId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.GetPaymentByExternalId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.GetPaymentByExternalId.Mapper.1.1
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

        public GetPaymentByExternalId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetPaymentByExternalId)) {
                return false;
            }
            GetPaymentByExternalId getPaymentByExternalId = (GetPaymentByExternalId) obj;
            if (this.__typename.equals(getPaymentByExternalId.__typename) && this.items.equals(getPaymentByExternalId.items)) {
                String str = this.nextToken;
                String str2 = getPaymentByExternalId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.GetPaymentByExternalId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetPaymentByExternalId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetPaymentByExternalId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetPaymentByExternalId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.GetPaymentByExternalId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetPaymentByExternalId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetPaymentByExternalId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readInt(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readBoolean(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("orderId", "orderId", null, true, customType, Collections.emptyList()), ResponseField.forString("externalOrderId", "externalOrderId", null, true, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("idInPaymentProvider", "idInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.METHOD, FirebaseAnalytics.Param.METHOD, null, true, Collections.emptyList()), ResponseField.forBoolean("international", "international", null, true, Collections.emptyList()), ResponseField.forString("refundStatus", "refundStatus", null, true, Collections.emptyList()), ResponseField.forInt("amountRefunded", "amountRefunded", null, true, Collections.emptyList()), ResponseField.forCustomType(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("acquirerData", "acquirerData", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, Boolean bool, String str14, Integer num2, String str15, String str16, String str17, String str18, String str19, String str20) {
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
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.contactId) != null ? str.equals(item.contactId) : item.contactId == null) && ((str2 = this.orderId) != null ? str2.equals(item.orderId) : item.orderId == null) && ((str3 = this.externalOrderId) != null ? str3.equals(item.externalOrderId) : item.externalOrderId == null) && ((str4 = this.paymentProvider) != null ? str4.equals(item.paymentProvider) : item.paymentProvider == null) && ((str5 = this.idInPaymentProvider) != null ? str5.equals(item.idInPaymentProvider) : item.idInPaymentProvider == null) && ((str6 = this.currency) != null ? str6.equals(item.currency) : item.currency == null) && ((num = this.amount) != null ? num.equals(item.amount) : item.amount == null) && ((str7 = this.status) != null ? str7.equals(item.status) : item.status == null) && ((str8 = this.note) != null ? str8.equals(item.note) : item.note == null) && ((str9 = this.description) != null ? str9.equals(item.description) : item.description == null) && ((str10 = this.method) != null ? str10.equals(item.method) : item.method == null) && ((bool = this.international) != null ? bool.equals(item.international) : item.international == null) && ((str11 = this.refundStatus) != null ? str11.equals(item.refundStatus) : item.refundStatus == null) && ((num2 = this.amountRefunded) != null ? num2.equals(item.amountRefunded) : item.amountRefunded == null) && ((str12 = this.error) != null ? str12.equals(item.error) : item.error == null) && ((str13 = this.acquirerData) != null ? str13.equals(item.acquirerData) : item.acquirerData == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(item.updatedAt) : item.updatedAt == null) && ((str16 = this.createdById) != null ? str16.equals(item.createdById) : item.createdById == null)) {
                String str17 = this.updatedById;
                String str18 = item.updatedById;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.orderId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.externalOrderId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[7], Item.this.idInPaymentProvider);
                    responseWriter.writeString(responseFieldArr[8], Item.this.currency);
                    responseWriter.writeInt(responseFieldArr[9], Item.this.amount);
                    responseWriter.writeString(responseFieldArr[10], Item.this.status);
                    responseWriter.writeString(responseFieldArr[11], Item.this.note);
                    responseWriter.writeString(responseFieldArr[12], Item.this.description);
                    responseWriter.writeString(responseFieldArr[13], Item.this.method);
                    responseWriter.writeBoolean(responseFieldArr[14], Item.this.international);
                    responseWriter.writeString(responseFieldArr[15], Item.this.refundStatus);
                    responseWriter.writeInt(responseFieldArr[16], Item.this.amountRefunded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.error);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.acquirerData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.updatedById);
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
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", orderId=" + this.orderId + ", externalOrderId=" + this.externalOrderId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", currency=" + this.currency + ", amount=" + this.amount + ", status=" + this.status + ", note=" + this.note + ", description=" + this.description + ", method=" + this.method + ", international=" + this.international + ", refundStatus=" + this.refundStatus + ", amountRefunded=" + this.amountRefunded + ", error=" + this.error + ", acquirerData=" + this.acquirerData + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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
        private final ModelPaymentEventFilterInput filter;
        private final String idInPaymentProvider;
        private final Integer limit;
        private final String nextToken;
        private final ModelStringKeyConditionInput paymentProvider;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelPaymentEventFilterInput modelPaymentEventFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.idInPaymentProvider = str;
            this.paymentProvider = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelPaymentEventFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("idInPaymentProvider", str);
            linkedHashMap.put("paymentProvider", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelPaymentEventFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelPaymentEventFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPaymentByExternalIdQuery.Variables.1
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

    public GetPaymentByExternalIdQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelPaymentEventFilterInput modelPaymentEventFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelPaymentEventFilterInput, num, str2);
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
        return "ba538d8d2adf5707b65fc5b8047d96822a34094bceb774063880b210006ee3be";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetPaymentByExternalId($idInPaymentProvider: String, $paymentProvider: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelPaymentEventFilterInput, $limit: Int, $nextToken: String) {\n  getPaymentByExternalId(idInPaymentProvider: $idInPaymentProvider, paymentProvider: $paymentProvider, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      orderId\n      externalOrderId\n      paymentProvider\n      idInPaymentProvider\n      currency\n      amount\n      status\n      note\n      description\n      method\n      international\n      refundStatus\n      amountRefunded\n      error\n      acquirerData\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
