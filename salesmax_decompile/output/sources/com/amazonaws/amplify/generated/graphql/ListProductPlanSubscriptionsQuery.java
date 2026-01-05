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
import type.ModelProductPlanSubscriptionFilterInput;

/* loaded from: classes4.dex */
public final class ListProductPlanSubscriptionsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListProductPlanSubscriptions($filter: ModelProductPlanSubscriptionFilterInput, $limit: Int, $nextToken: String) {\n  listProductPlanSubscriptions(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      addedById\n      productAccountId\n      productPlanId\n      planDescription\n      planStatus\n      planFeePerUnit\n      planFeeProRataPerUnit\n      period\n      amount\n      currency\n      status\n      numberOfUnits\n      numberOfFreeUnits\n      unitType\n      subscriptionPaymentStatus\n      subscriptionStartDate\n      subscriptionEndDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListProductPlanSubscriptions";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListProductPlanSubscriptions($filter: ModelProductPlanSubscriptionFilterInput, $limit: Int, $nextToken: String) {\n  listProductPlanSubscriptions(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      addedById\n      productAccountId\n      productPlanId\n      planDescription\n      planStatus\n      planFeePerUnit\n      planFeeProRataPerUnit\n      period\n      amount\n      currency\n      status\n      numberOfUnits\n      numberOfFreeUnits\n      unitType\n      subscriptionPaymentStatus\n      subscriptionStartDate\n      subscriptionEndDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelProductPlanSubscriptionFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListProductPlanSubscriptionsQuery build() {
            return new ListProductPlanSubscriptionsQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelProductPlanSubscriptionFilterInput modelProductPlanSubscriptionFilterInput) {
            this.filter = modelProductPlanSubscriptionFilterInput;
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
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listProductPlanSubscriptions", "listProductPlanSubscriptions", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListProductPlanSubscriptions listProductPlanSubscriptions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListProductPlanSubscriptions.Mapper listProductPlanSubscriptionsFieldMapper = new ListProductPlanSubscriptions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListProductPlanSubscriptions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListProductPlanSubscriptions>() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListProductPlanSubscriptions read(ResponseReader responseReader2) {
                        return Mapper.this.listProductPlanSubscriptionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListProductPlanSubscriptions listProductPlanSubscriptions) {
            this.listProductPlanSubscriptions = listProductPlanSubscriptions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListProductPlanSubscriptions listProductPlanSubscriptions = this.listProductPlanSubscriptions;
            ListProductPlanSubscriptions listProductPlanSubscriptions2 = ((Data) obj).listProductPlanSubscriptions;
            return listProductPlanSubscriptions == null ? listProductPlanSubscriptions2 == null : listProductPlanSubscriptions.equals(listProductPlanSubscriptions2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListProductPlanSubscriptions listProductPlanSubscriptions = this.listProductPlanSubscriptions;
                this.$hashCode = (listProductPlanSubscriptions == null ? 0 : listProductPlanSubscriptions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListProductPlanSubscriptions listProductPlanSubscriptions() {
            return this.listProductPlanSubscriptions;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListProductPlanSubscriptions listProductPlanSubscriptions = Data.this.listProductPlanSubscriptions;
                    responseWriter.writeObject(responseField, listProductPlanSubscriptions != null ? listProductPlanSubscriptions.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listProductPlanSubscriptions=" + this.listProductPlanSubscriptions + "}";
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
        final String addedById;
        final Integer amount;
        final String createdAt;
        final String currency;
        final String id;
        final Integer numberOfFreeUnits;
        final Integer numberOfUnits;
        final String period;
        final String planDescription;
        final Integer planFeePerUnit;
        final Integer planFeeProRataPerUnit;
        final String planStatus;
        final String productAccountId;
        final String productPlanId;
        final String status;
        final String subscriptionEndDate;
        final String subscriptionPaymentStatus;
        final String subscriptionStartDate;
        final String unitType;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readInt(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("productPlanId", "productPlanId", null, false, customType, Collections.emptyList()), ResponseField.forString("planDescription", "planDescription", null, true, Collections.emptyList()), ResponseField.forString("planStatus", "planStatus", null, true, Collections.emptyList()), ResponseField.forInt("planFeePerUnit", "planFeePerUnit", null, true, Collections.emptyList()), ResponseField.forInt("planFeeProRataPerUnit", "planFeeProRataPerUnit", null, true, Collections.emptyList()), ResponseField.forString("period", "period", null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forInt("numberOfUnits", "numberOfUnits", null, true, Collections.emptyList()), ResponseField.forInt("numberOfFreeUnits", "numberOfFreeUnits", null, true, Collections.emptyList()), ResponseField.forString("unitType", "unitType", null, true, Collections.emptyList()), ResponseField.forString("subscriptionPaymentStatus", "subscriptionPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("subscriptionStartDate", "subscriptionStartDate", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("subscriptionEndDate", "subscriptionEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, Integer num3, String str10, String str11, Integer num4, Integer num5, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.addedById = (String) Utils.checkNotNull(str4, "addedById == null");
            this.productAccountId = str5;
            this.productPlanId = (String) Utils.checkNotNull(str6, "productPlanId == null");
            this.planDescription = str7;
            this.planStatus = str8;
            this.planFeePerUnit = num;
            this.planFeeProRataPerUnit = num2;
            this.period = str9;
            this.amount = num3;
            this.currency = str10;
            this.status = str11;
            this.numberOfUnits = num4;
            this.numberOfFreeUnits = num5;
            this.unitType = str12;
            this.subscriptionPaymentStatus = str13;
            this.subscriptionStartDate = (String) Utils.checkNotNull(str14, "subscriptionStartDate == null");
            this.subscriptionEndDate = str15;
            this.createdAt = (String) Utils.checkNotNull(str16, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str17, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String addedById() {
            return this.addedById;
        }

        public Integer amount() {
            return this.amount;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Integer num;
            Integer num2;
            String str4;
            Integer num3;
            String str5;
            String str6;
            Integer num4;
            Integer num5;
            String str7;
            String str8;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.addedById.equals(item.addedById) && ((str = this.productAccountId) != null ? str.equals(item.productAccountId) : item.productAccountId == null) && this.productPlanId.equals(item.productPlanId) && ((str2 = this.planDescription) != null ? str2.equals(item.planDescription) : item.planDescription == null) && ((str3 = this.planStatus) != null ? str3.equals(item.planStatus) : item.planStatus == null) && ((num = this.planFeePerUnit) != null ? num.equals(item.planFeePerUnit) : item.planFeePerUnit == null) && ((num2 = this.planFeeProRataPerUnit) != null ? num2.equals(item.planFeeProRataPerUnit) : item.planFeeProRataPerUnit == null) && ((str4 = this.period) != null ? str4.equals(item.period) : item.period == null) && ((num3 = this.amount) != null ? num3.equals(item.amount) : item.amount == null) && ((str5 = this.currency) != null ? str5.equals(item.currency) : item.currency == null) && ((str6 = this.status) != null ? str6.equals(item.status) : item.status == null) && ((num4 = this.numberOfUnits) != null ? num4.equals(item.numberOfUnits) : item.numberOfUnits == null) && ((num5 = this.numberOfFreeUnits) != null ? num5.equals(item.numberOfFreeUnits) : item.numberOfFreeUnits == null) && ((str7 = this.unitType) != null ? str7.equals(item.unitType) : item.unitType == null) && ((str8 = this.subscriptionPaymentStatus) != null ? str8.equals(item.subscriptionPaymentStatus) : item.subscriptionPaymentStatus == null) && this.subscriptionStartDate.equals(item.subscriptionStartDate) && ((str9 = this.subscriptionEndDate) != null ? str9.equals(item.subscriptionEndDate) : item.subscriptionEndDate == null) && this.createdAt.equals(item.createdAt) && this.updatedAt.equals(item.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.addedById.hashCode()) * 1000003;
                String str = this.productAccountId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.productPlanId.hashCode()) * 1000003;
                String str2 = this.planDescription;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.planStatus;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.planFeePerUnit;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.planFeeProRataPerUnit;
                int iHashCode6 = (iHashCode5 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str4 = this.period;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Integer num3 = this.amount;
                int iHashCode8 = (iHashCode7 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str5 = this.currency;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.status;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num4 = this.numberOfUnits;
                int iHashCode11 = (iHashCode10 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.numberOfFreeUnits;
                int iHashCode12 = (iHashCode11 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                String str7 = this.unitType;
                int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.subscriptionPaymentStatus;
                int iHashCode14 = (((iHashCode13 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.subscriptionStartDate.hashCode()) * 1000003;
                String str9 = this.subscriptionEndDate;
                this.$hashCode = ((((iHashCode14 ^ (str9 != null ? str9.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.productPlanId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.planDescription);
                    responseWriter.writeString(responseFieldArr[7], Item.this.planStatus);
                    responseWriter.writeInt(responseFieldArr[8], Item.this.planFeePerUnit);
                    responseWriter.writeInt(responseFieldArr[9], Item.this.planFeeProRataPerUnit);
                    responseWriter.writeString(responseFieldArr[10], Item.this.period);
                    responseWriter.writeInt(responseFieldArr[11], Item.this.amount);
                    responseWriter.writeString(responseFieldArr[12], Item.this.currency);
                    responseWriter.writeString(responseFieldArr[13], Item.this.status);
                    responseWriter.writeInt(responseFieldArr[14], Item.this.numberOfUnits);
                    responseWriter.writeInt(responseFieldArr[15], Item.this.numberOfFreeUnits);
                    responseWriter.writeString(responseFieldArr[16], Item.this.unitType);
                    responseWriter.writeString(responseFieldArr[17], Item.this.subscriptionPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.subscriptionStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.subscriptionEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.updatedAt);
                }
            };
        }

        public Integer numberOfFreeUnits() {
            return this.numberOfFreeUnits;
        }

        public Integer numberOfUnits() {
            return this.numberOfUnits;
        }

        public String period() {
            return this.period;
        }

        public String planDescription() {
            return this.planDescription;
        }

        public Integer planFeePerUnit() {
            return this.planFeePerUnit;
        }

        public Integer planFeeProRataPerUnit() {
            return this.planFeeProRataPerUnit;
        }

        public String planStatus() {
            return this.planStatus;
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public String productPlanId() {
            return this.productPlanId;
        }

        public String status() {
            return this.status;
        }

        public String subscriptionEndDate() {
            return this.subscriptionEndDate;
        }

        public String subscriptionPaymentStatus() {
            return this.subscriptionPaymentStatus;
        }

        public String subscriptionStartDate() {
            return this.subscriptionStartDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", addedById=" + this.addedById + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", planDescription=" + this.planDescription + ", planStatus=" + this.planStatus + ", planFeePerUnit=" + this.planFeePerUnit + ", planFeeProRataPerUnit=" + this.planFeeProRataPerUnit + ", period=" + this.period + ", amount=" + this.amount + ", currency=" + this.currency + ", status=" + this.status + ", numberOfUnits=" + this.numberOfUnits + ", numberOfFreeUnits=" + this.numberOfFreeUnits + ", unitType=" + this.unitType + ", subscriptionPaymentStatus=" + this.subscriptionPaymentStatus + ", subscriptionStartDate=" + this.subscriptionStartDate + ", subscriptionEndDate=" + this.subscriptionEndDate + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String unitType() {
            return this.unitType;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListProductPlanSubscriptions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListProductPlanSubscriptions> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListProductPlanSubscriptions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListProductPlanSubscriptions.$responseFields;
                return new ListProductPlanSubscriptions(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.ListProductPlanSubscriptions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.ListProductPlanSubscriptions.Mapper.1.1
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

        public ListProductPlanSubscriptions(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListProductPlanSubscriptions)) {
                return false;
            }
            ListProductPlanSubscriptions listProductPlanSubscriptions = (ListProductPlanSubscriptions) obj;
            if (this.__typename.equals(listProductPlanSubscriptions.__typename) && this.items.equals(listProductPlanSubscriptions.items)) {
                String str = this.nextToken;
                String str2 = listProductPlanSubscriptions.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.ListProductPlanSubscriptions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListProductPlanSubscriptions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListProductPlanSubscriptions.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListProductPlanSubscriptions.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.ListProductPlanSubscriptions.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListProductPlanSubscriptions.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListProductPlanSubscriptions{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelProductPlanSubscriptionFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelProductPlanSubscriptionFilterInput modelProductPlanSubscriptionFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelProductPlanSubscriptionFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelProductPlanSubscriptionFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelProductPlanSubscriptionFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListProductPlanSubscriptionsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListProductPlanSubscriptionsQuery(ModelProductPlanSubscriptionFilterInput modelProductPlanSubscriptionFilterInput, Integer num, String str) {
        this.variables = new Variables(modelProductPlanSubscriptionFilterInput, num, str);
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
        return "1276ee12d1c40c0053fda7ca92bb455e7caf564d7c06faa0fb4d736b86153027";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListProductPlanSubscriptions($filter: ModelProductPlanSubscriptionFilterInput, $limit: Int, $nextToken: String) {\n  listProductPlanSubscriptions(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      addedById\n      productAccountId\n      productPlanId\n      planDescription\n      planStatus\n      planFeePerUnit\n      planFeeProRataPerUnit\n      period\n      amount\n      currency\n      status\n      numberOfUnits\n      numberOfFreeUnits\n      unitType\n      subscriptionPaymentStatus\n      subscriptionStartDate\n      subscriptionEndDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
