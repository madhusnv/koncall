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
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.SearchablefileObjectRelationshipFilterInput;
import type.SearchablefileObjectRelationshipSortInput;

/* loaded from: classes4.dex */
public final class SearchFileObjectRelationshipsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchFileObjectRelationships($filter: SearchablefileObjectRelationshipFilterInput, $sort: SearchablefileObjectRelationshipSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchFileObjectRelationships(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      fileId\n      fileUrl\n      contactId\n      engagementId\n      businessId\n      dealId\n      productId\n      createdAt\n      updatedAt\n      parentObjectId\n      parentObjectType\n      fieldName\n      inputContext\n      transcription\n      translatedTranscription\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchFileObjectRelationships";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchFileObjectRelationships($filter: SearchablefileObjectRelationshipFilterInput, $sort: SearchablefileObjectRelationshipSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchFileObjectRelationships(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      fileId\n      fileUrl\n      contactId\n      engagementId\n      businessId\n      dealId\n      productId\n      createdAt\n      updatedAt\n      parentObjectId\n      parentObjectType\n      fieldName\n      inputContext\n      transcription\n      translatedTranscription\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchablefileObjectRelationshipFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchablefileObjectRelationshipSortInput sort;

        public SearchFileObjectRelationshipsQuery build() {
            return new SearchFileObjectRelationshipsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchablefileObjectRelationshipFilterInput searchablefileObjectRelationshipFilterInput) {
            this.filter = searchablefileObjectRelationshipFilterInput;
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

        public Builder sort(SearchablefileObjectRelationshipSortInput searchablefileObjectRelationshipSortInput) {
            this.sort = searchablefileObjectRelationshipSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchFileObjectRelationships", "searchFileObjectRelationships", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchFileObjectRelationships searchFileObjectRelationships;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchFileObjectRelationships.Mapper searchFileObjectRelationshipsFieldMapper = new SearchFileObjectRelationships.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchFileObjectRelationships) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchFileObjectRelationships>() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchFileObjectRelationships read(ResponseReader responseReader2) {
                        return Mapper.this.searchFileObjectRelationshipsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchFileObjectRelationships searchFileObjectRelationships) {
            this.searchFileObjectRelationships = searchFileObjectRelationships;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchFileObjectRelationships searchFileObjectRelationships = this.searchFileObjectRelationships;
            SearchFileObjectRelationships searchFileObjectRelationships2 = ((Data) obj).searchFileObjectRelationships;
            return searchFileObjectRelationships == null ? searchFileObjectRelationships2 == null : searchFileObjectRelationships.equals(searchFileObjectRelationships2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchFileObjectRelationships searchFileObjectRelationships = this.searchFileObjectRelationships;
                this.$hashCode = (searchFileObjectRelationships == null ? 0 : searchFileObjectRelationships.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchFileObjectRelationships searchFileObjectRelationships = Data.this.searchFileObjectRelationships;
                    responseWriter.writeObject(responseField, searchFileObjectRelationships != null ? searchFileObjectRelationships.marshaller() : null);
                }
            };
        }

        public SearchFileObjectRelationships searchFileObjectRelationships() {
            return this.searchFileObjectRelationships;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchFileObjectRelationships=" + this.searchFileObjectRelationships + "}";
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
        final String businessId;
        final String contactId;
        final String createdAt;
        final String dealId;
        final String engagementId;
        final String fieldName;
        final String fileId;
        final String fileUrl;
        final String id;
        final String inputContext;
        final String parentObjectId;
        final String parentObjectType;
        final String productId;
        final String transcription;
        final String translatedTranscription;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("fileId", "fileId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("businessId", "businessId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("dealId", "dealId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("parentObjectId", "parentObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("parentObjectType", "parentObjectType", null, true, Collections.emptyList()), ResponseField.forString("fieldName", "fieldName", null, true, Collections.emptyList()), ResponseField.forCustomType("inputContext", "inputContext", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("transcription", "transcription", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("translatedTranscription", "translatedTranscription", null, true, customType3, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.fileId = (String) Utils.checkNotNull(str4, "fileId == null");
            this.fileUrl = str5;
            this.contactId = str6;
            this.engagementId = str7;
            this.businessId = str8;
            this.dealId = str9;
            this.productId = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.parentObjectId = str13;
            this.parentObjectType = str14;
            this.fieldName = str15;
            this.inputContext = str16;
            this.transcription = str17;
            this.translatedTranscription = str18;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String businessId() {
            return this.businessId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String dealId() {
            return this.dealId;
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
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.fileId.equals(item.fileId) && ((str = this.fileUrl) != null ? str.equals(item.fileUrl) : item.fileUrl == null) && ((str2 = this.contactId) != null ? str2.equals(item.contactId) : item.contactId == null) && ((str3 = this.engagementId) != null ? str3.equals(item.engagementId) : item.engagementId == null) && ((str4 = this.businessId) != null ? str4.equals(item.businessId) : item.businessId == null) && ((str5 = this.dealId) != null ? str5.equals(item.dealId) : item.dealId == null) && ((str6 = this.productId) != null ? str6.equals(item.productId) : item.productId == null) && ((str7 = this.createdAt) != null ? str7.equals(item.createdAt) : item.createdAt == null) && ((str8 = this.updatedAt) != null ? str8.equals(item.updatedAt) : item.updatedAt == null) && ((str9 = this.parentObjectId) != null ? str9.equals(item.parentObjectId) : item.parentObjectId == null) && ((str10 = this.parentObjectType) != null ? str10.equals(item.parentObjectType) : item.parentObjectType == null) && ((str11 = this.fieldName) != null ? str11.equals(item.fieldName) : item.fieldName == null) && ((str12 = this.inputContext) != null ? str12.equals(item.inputContext) : item.inputContext == null) && ((str13 = this.transcription) != null ? str13.equals(item.transcription) : item.transcription == null)) {
                String str14 = this.translatedTranscription;
                String str15 = item.translatedTranscription;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
                    return true;
                }
            }
            return false;
        }

        public String fieldName() {
            return this.fieldName;
        }

        public String fileId() {
            return this.fileId;
        }

        public String fileUrl() {
            return this.fileUrl;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.fileId.hashCode()) * 1000003;
                String str = this.fileUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.contactId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.engagementId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.businessId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.dealId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.productId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.parentObjectId;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.parentObjectType;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.fieldName;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.inputContext;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.transcription;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.translatedTranscription;
                this.$hashCode = iHashCode14 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String inputContext() {
            return this.inputContext;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.fileId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.fileUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.businessId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.dealId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.productId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.parentObjectId);
                    responseWriter.writeString(responseFieldArr[13], Item.this.parentObjectType);
                    responseWriter.writeString(responseFieldArr[14], Item.this.fieldName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.inputContext);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.transcription);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.translatedTranscription);
                }
            };
        }

        public String parentObjectId() {
            return this.parentObjectId;
        }

        public String parentObjectType() {
            return this.parentObjectType;
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileId=" + this.fileId + ", fileUrl=" + this.fileUrl + ", contactId=" + this.contactId + ", engagementId=" + this.engagementId + ", businessId=" + this.businessId + ", dealId=" + this.dealId + ", productId=" + this.productId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", parentObjectId=" + this.parentObjectId + ", parentObjectType=" + this.parentObjectType + ", fieldName=" + this.fieldName + ", inputContext=" + this.inputContext + ", transcription=" + this.transcription + ", translatedTranscription=" + this.translatedTranscription + "}";
            }
            return this.$toString;
        }

        public String transcription() {
            return this.transcription;
        }

        public String translatedTranscription() {
            return this.translatedTranscription;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchFileObjectRelationships {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchFileObjectRelationships> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchFileObjectRelationships map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchFileObjectRelationships.$responseFields;
                return new SearchFileObjectRelationships(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.SearchFileObjectRelationships.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.SearchFileObjectRelationships.Mapper.1.1
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

        public SearchFileObjectRelationships(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchFileObjectRelationships)) {
                return false;
            }
            SearchFileObjectRelationships searchFileObjectRelationships = (SearchFileObjectRelationships) obj;
            if (this.__typename.equals(searchFileObjectRelationships.__typename) && this.items.equals(searchFileObjectRelationships.items) && ((str = this.nextToken) != null ? str.equals(searchFileObjectRelationships.nextToken) : searchFileObjectRelationships.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchFileObjectRelationships.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.SearchFileObjectRelationships.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchFileObjectRelationships.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchFileObjectRelationships.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchFileObjectRelationships.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.SearchFileObjectRelationships.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchFileObjectRelationships.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchFileObjectRelationships.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchFileObjectRelationships{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchablefileObjectRelationshipFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchablefileObjectRelationshipSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchablefileObjectRelationshipFilterInput searchablefileObjectRelationshipFilterInput, SearchablefileObjectRelationshipSortInput searchablefileObjectRelationshipSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchablefileObjectRelationshipFilterInput;
            this.sort = searchablefileObjectRelationshipSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchablefileObjectRelationshipFilterInput);
            linkedHashMap.put("sort", searchablefileObjectRelationshipSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchablefileObjectRelationshipFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchFileObjectRelationshipsQuery.Variables.1
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

        public SearchablefileObjectRelationshipSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchFileObjectRelationshipsQuery(SearchablefileObjectRelationshipFilterInput searchablefileObjectRelationshipFilterInput, SearchablefileObjectRelationshipSortInput searchablefileObjectRelationshipSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchablefileObjectRelationshipFilterInput, searchablefileObjectRelationshipSortInput, num, str, num2);
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
        return "55d0db33b1d4caffa227adb521bcb274ddf663c06bd2d5d4e5e5b97247632616";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchFileObjectRelationships($filter: SearchablefileObjectRelationshipFilterInput, $sort: SearchablefileObjectRelationshipSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchFileObjectRelationships(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      fileId\n      fileUrl\n      contactId\n      engagementId\n      businessId\n      dealId\n      productId\n      createdAt\n      updatedAt\n      parentObjectId\n      parentObjectType\n      fieldName\n      inputContext\n      transcription\n      translatedTranscription\n    }\n    nextToken\n    total\n  }\n}";
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
