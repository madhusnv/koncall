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
import type.ProductServiceType;
import type.SearchableProductServiceFilterInput;
import type.SearchableProductServiceSortInput;

/* loaded from: classes4.dex */
public final class SearchProductServicesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchProductServices($filter: SearchableProductServiceFilterInput, $sort: SearchableProductServiceSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchProductServices(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchProductServices";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchProductServices($filter: SearchableProductServiceFilterInput, $sort: SearchableProductServiceSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchProductServices(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableProductServiceFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableProductServiceSortInput sort;

        public SearchProductServicesQuery build() {
            return new SearchProductServicesQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableProductServiceFilterInput searchableProductServiceFilterInput) {
            this.filter = searchableProductServiceFilterInput;
            return this;
        }

        public Builder from(Integer num) {
            this.from = num;
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

        public Builder sort(SearchableProductServiceSortInput searchableProductServiceSortInput) {
            this.sort = searchableProductServiceSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchProductServices", "searchProductServices", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchProductServices searchProductServices;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchProductServices.Mapper searchProductServicesFieldMapper = new SearchProductServices.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchProductServices) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchProductServices>() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchProductServices read(ResponseReader responseReader2) {
                        return Mapper.this.searchProductServicesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchProductServices searchProductServices) {
            this.searchProductServices = searchProductServices;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchProductServices searchProductServices = this.searchProductServices;
            SearchProductServices searchProductServices2 = ((Data) obj).searchProductServices;
            return searchProductServices == null ? searchProductServices2 == null : searchProductServices.equals(searchProductServices2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchProductServices searchProductServices = this.searchProductServices;
                this.$hashCode = (searchProductServices == null ? 0 : searchProductServices.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchProductServices searchProductServices = Data.this.searchProductServices;
                    responseWriter.writeObject(responseField, searchProductServices != null ? searchProductServices.marshaller() : null);
                }
            };
        }

        public SearchProductServices searchProductServices() {
            return this.searchProductServices;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchProductServices=" + this.searchProductServices + "}";
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
        final String createdAt;
        final String createdBy;
        final String currency;
        final String description;
        final String endDate;
        final String hsCode;
        final String id;
        final Integer incrementBy;
        final Boolean isArchived;
        final String measurementUnit;
        final String name;
        final String parentProductId;
        final String productPicture;
        final String skuCode;
        final String standardPricePerUnit;
        final String startDate;

        /* renamed from: type, reason: collision with root package name */
        final ProductServiceType f58078type;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                return new Item(string, str, str2, string2, string3, string4 != null ? ProductServiceType.valueOf(string4) : null, responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), responseReader.readBoolean(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("measurementUnit", "measurementUnit", null, true, Collections.emptyList()), ResponseField.forInt("incrementBy", "incrementBy", null, true, Collections.emptyList()), ResponseField.forString("hsCode", "hsCode", null, true, Collections.emptyList()), ResponseField.forString("skuCode", "skuCode", null, true, Collections.emptyList()), ResponseField.forString("standardPricePerUnit", "standardPricePerUnit", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("parentProductId", "parentProductId", null, true, customType, Collections.emptyList()), ResponseField.forString("productPicture", "productPicture", null, true, Collections.emptyList()), ResponseField.forCustomType("startDate", "startDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDate", "endDate", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, ProductServiceType productServiceType, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.f58078type = productServiceType;
            this.measurementUnit = str6;
            this.incrementBy = num;
            this.hsCode = str7;
            this.skuCode = str8;
            this.standardPricePerUnit = str9;
            this.currency = str10;
            this.parentProductId = str11;
            this.productPicture = str12;
            this.startDate = str13;
            this.endDate = str14;
            this.isArchived = bool;
            this.createdBy = str15;
            this.updatedBy = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
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

        public String createdBy() {
            return this.createdBy;
        }

        public String currency() {
            return this.currency;
        }

        public String description() {
            return this.description;
        }

        public String endDate() {
            return this.endDate;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            ProductServiceType productServiceType;
            String str3;
            Integer num;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.name) != null ? str.equals(item.name) : item.name == null) && ((str2 = this.description) != null ? str2.equals(item.description) : item.description == null) && ((productServiceType = this.f58078type) != null ? productServiceType.equals(item.f58078type) : item.f58078type == null) && ((str3 = this.measurementUnit) != null ? str3.equals(item.measurementUnit) : item.measurementUnit == null) && ((num = this.incrementBy) != null ? num.equals(item.incrementBy) : item.incrementBy == null) && ((str4 = this.hsCode) != null ? str4.equals(item.hsCode) : item.hsCode == null) && ((str5 = this.skuCode) != null ? str5.equals(item.skuCode) : item.skuCode == null) && ((str6 = this.standardPricePerUnit) != null ? str6.equals(item.standardPricePerUnit) : item.standardPricePerUnit == null) && ((str7 = this.currency) != null ? str7.equals(item.currency) : item.currency == null) && ((str8 = this.parentProductId) != null ? str8.equals(item.parentProductId) : item.parentProductId == null) && ((str9 = this.productPicture) != null ? str9.equals(item.productPicture) : item.productPicture == null) && ((str10 = this.startDate) != null ? str10.equals(item.startDate) : item.startDate == null) && ((str11 = this.endDate) != null ? str11.equals(item.endDate) : item.endDate == null) && ((bool = this.isArchived) != null ? bool.equals(item.isArchived) : item.isArchived == null) && ((str12 = this.createdBy) != null ? str12.equals(item.createdBy) : item.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(item.updatedBy) : item.updatedBy == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null)) {
                String str15 = this.updatedAt;
                String str16 = item.updatedAt;
                if (str15 == null) {
                    if (str16 == null) {
                        return true;
                    }
                } else if (str15.equals(str16)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                ProductServiceType productServiceType = this.f58078type;
                int iHashCode4 = (iHashCode3 ^ (productServiceType == null ? 0 : productServiceType.hashCode())) * 1000003;
                String str3 = this.measurementUnit;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.incrementBy;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.hsCode;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.skuCode;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.standardPricePerUnit;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.parentProductId;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.productPicture;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.startDate;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.endDate;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.isArchived;
                int iHashCode15 = (iHashCode14 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str12 = this.createdBy;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedBy;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode18 ^ (str15 != null ? str15.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String hsCode() {
            return this.hsCode;
        }

        public String id() {
            return this.id;
        }

        public Integer incrementBy() {
            return this.incrementBy;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.description);
                    ResponseField responseField = responseFieldArr[5];
                    ProductServiceType productServiceType = Item.this.f58078type;
                    responseWriter.writeString(responseField, productServiceType != null ? productServiceType.name() : null);
                    responseWriter.writeString(responseFieldArr[6], Item.this.measurementUnit);
                    responseWriter.writeInt(responseFieldArr[7], Item.this.incrementBy);
                    responseWriter.writeString(responseFieldArr[8], Item.this.hsCode);
                    responseWriter.writeString(responseFieldArr[9], Item.this.skuCode);
                    responseWriter.writeString(responseFieldArr[10], Item.this.standardPricePerUnit);
                    responseWriter.writeString(responseFieldArr[11], Item.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.parentProductId);
                    responseWriter.writeString(responseFieldArr[13], Item.this.productPicture);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.endDate);
                    responseWriter.writeBoolean(responseFieldArr[16], Item.this.isArchived);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.updatedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.updatedAt);
                }
            };
        }

        public String measurementUnit() {
            return this.measurementUnit;
        }

        public String name() {
            return this.name;
        }

        public String parentProductId() {
            return this.parentProductId;
        }

        public String productPicture() {
            return this.productPicture;
        }

        public String skuCode() {
            return this.skuCode;
        }

        public String standardPricePerUnit() {
            return this.standardPricePerUnit;
        }

        public String startDate() {
            return this.startDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58078type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isArchived=" + this.isArchived + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public ProductServiceType type() {
            return this.f58078type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static class SearchProductServices {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchProductServices> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchProductServices map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchProductServices.$responseFields;
                return new SearchProductServices(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.SearchProductServices.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.SearchProductServices.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]));
            }
        }

        public SearchProductServices(String str, List<Item> list, String str2, Integer num) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
            this.total = num;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SearchProductServices)) {
                return false;
            }
            SearchProductServices searchProductServices = (SearchProductServices) obj;
            if (this.__typename.equals(searchProductServices.__typename) && this.items.equals(searchProductServices.items) && ((str = this.nextToken) != null ? str.equals(searchProductServices.nextToken) : searchProductServices.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchProductServices.total;
                if (num == null) {
                    if (num2 == null) {
                        return true;
                    }
                } else if (num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Integer num = this.total;
                this.$hashCode = iHashCode2 ^ (num != null ? num.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.SearchProductServices.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchProductServices.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchProductServices.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchProductServices.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.SearchProductServices.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchProductServices.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchProductServices.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchProductServices{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableProductServiceFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableProductServiceSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableProductServiceFilterInput searchableProductServiceFilterInput, SearchableProductServiceSortInput searchableProductServiceSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableProductServiceFilterInput;
            this.sort = searchableProductServiceSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableProductServiceFilterInput);
            linkedHashMap.put("sort", searchableProductServiceSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableProductServiceFilterInput filter() {
            return this.filter;
        }

        public Integer from() {
            return this.from;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchProductServicesQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeObject("sort", Variables.this.sort != null ? Variables.this.sort.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                    inputFieldWriter.writeInt(Constants.MessagePayloadKeys.FROM, Variables.this.from);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public SearchableProductServiceSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchProductServicesQuery(SearchableProductServiceFilterInput searchableProductServiceFilterInput, SearchableProductServiceSortInput searchableProductServiceSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableProductServiceFilterInput, searchableProductServiceSortInput, num, str, num2);
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
        return "c6846d0b5cc74ad0edb1541bcd2036d6e428e17ffca7f6e6547735af46325fb1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchProductServices($filter: SearchableProductServiceFilterInput, $sort: SearchableProductServiceSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchProductServices(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
