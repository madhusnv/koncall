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
import type.ContactNumberType;
import type.CustomType;
import type.SearchableContactNumberFilterInput;
import type.SearchableContactNumberSortInput;

/* loaded from: classes4.dex */
public final class SearchContactNumbersQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchContactNumbers($filter: SearchableContactNumberFilterInput, $sort: SearchableContactNumberSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchContactNumbers(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      contactId\n      accountId\n      contactNumberType\n      isPrimary\n      isValid\n      isVerified\n      isWhatsappNumber\n      isWrongNumber\n      isSpam\n      doNotTrack\n      doNotTrackSetBy\n      phoneNumber\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchContactNumbers";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchContactNumbers($filter: SearchableContactNumberFilterInput, $sort: SearchableContactNumberSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchContactNumbers(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      contactId\n      accountId\n      contactNumberType\n      isPrimary\n      isValid\n      isVerified\n      isWhatsappNumber\n      isWrongNumber\n      isSpam\n      doNotTrack\n      doNotTrackSetBy\n      phoneNumber\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableContactNumberFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableContactNumberSortInput sort;

        public SearchContactNumbersQuery build() {
            return new SearchContactNumbersQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableContactNumberFilterInput searchableContactNumberFilterInput) {
            this.filter = searchableContactNumberFilterInput;
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

        public Builder sort(SearchableContactNumberSortInput searchableContactNumberSortInput) {
            this.sort = searchableContactNumberSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchContactNumbers", "searchContactNumbers", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchContactNumbers searchContactNumbers;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchContactNumbers.Mapper searchContactNumbersFieldMapper = new SearchContactNumbers.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchContactNumbers) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchContactNumbers>() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchContactNumbers read(ResponseReader responseReader2) {
                        return Mapper.this.searchContactNumbersFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchContactNumbers searchContactNumbers) {
            this.searchContactNumbers = searchContactNumbers;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchContactNumbers searchContactNumbers = this.searchContactNumbers;
            SearchContactNumbers searchContactNumbers2 = ((Data) obj).searchContactNumbers;
            return searchContactNumbers == null ? searchContactNumbers2 == null : searchContactNumbers.equals(searchContactNumbers2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchContactNumbers searchContactNumbers = this.searchContactNumbers;
                this.$hashCode = (searchContactNumbers == null ? 0 : searchContactNumbers.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchContactNumbers searchContactNumbers = Data.this.searchContactNumbers;
                    responseWriter.writeObject(responseField, searchContactNumbers != null ? searchContactNumbers.marshaller() : null);
                }
            };
        }

        public SearchContactNumbers searchContactNumbers() {
            return this.searchContactNumbers;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchContactNumbers=" + this.searchContactNumbers + "}";
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
        final String contactId;
        final ContactNumberType contactNumberType;
        final String createdAt;
        final Boolean doNotTrack;
        final String doNotTrackSetBy;
        final String id;
        final Boolean isPrimary;
        final Boolean isSpam;
        final Boolean isValid;
        final Boolean isVerified;
        final Boolean isWhatsappNumber;
        final Boolean isWrongNumber;
        final String phoneNumber;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                return new Item(string, str, str2, str3, string2 != null ? ContactNumberType.valueOf(string2) : null, responseReader.readBoolean(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), responseReader.readBoolean(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]), responseReader.readBoolean(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactNumberType", "contactNumberType", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrimary", "isPrimary", null, true, Collections.emptyList()), ResponseField.forBoolean("isValid", "isValid", null, true, Collections.emptyList()), ResponseField.forBoolean("isVerified", "isVerified", null, true, Collections.emptyList()), ResponseField.forBoolean("isWhatsappNumber", "isWhatsappNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("isWrongNumber", "isWrongNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("isSpam", "isSpam", null, true, Collections.emptyList()), ResponseField.forBoolean("doNotTrack", "doNotTrack", null, true, Collections.emptyList()), ResponseField.forCustomType("doNotTrackSetBy", "doNotTrackSetBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumber", "phoneNumber", null, false, CustomType.AWSPHONE, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.contactId = str3;
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.contactNumberType = contactNumberType;
            this.isPrimary = bool;
            this.isValid = bool2;
            this.isVerified = bool3;
            this.isWhatsappNumber = bool4;
            this.isWrongNumber = bool5;
            this.isSpam = bool6;
            this.doNotTrack = bool7;
            this.doNotTrackSetBy = str5;
            this.phoneNumber = (String) Utils.checkNotNull(str6, "phoneNumber == null");
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
        }

        public ContactNumberType contactNumberType() {
            return this.contactNumberType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Boolean doNotTrack() {
            return this.doNotTrack;
        }

        public String doNotTrackSetBy() {
            return this.doNotTrackSetBy;
        }

        public boolean equals(Object obj) {
            String str;
            ContactNumberType contactNumberType;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.contactId) != null ? str.equals(item.contactId) : item.contactId == null) && this.accountId.equals(item.accountId) && ((contactNumberType = this.contactNumberType) != null ? contactNumberType.equals(item.contactNumberType) : item.contactNumberType == null) && ((bool = this.isPrimary) != null ? bool.equals(item.isPrimary) : item.isPrimary == null) && ((bool2 = this.isValid) != null ? bool2.equals(item.isValid) : item.isValid == null) && ((bool3 = this.isVerified) != null ? bool3.equals(item.isVerified) : item.isVerified == null) && ((bool4 = this.isWhatsappNumber) != null ? bool4.equals(item.isWhatsappNumber) : item.isWhatsappNumber == null) && ((bool5 = this.isWrongNumber) != null ? bool5.equals(item.isWrongNumber) : item.isWrongNumber == null) && ((bool6 = this.isSpam) != null ? bool6.equals(item.isSpam) : item.isSpam == null) && ((bool7 = this.doNotTrack) != null ? bool7.equals(item.doNotTrack) : item.doNotTrack == null) && ((str2 = this.doNotTrackSetBy) != null ? str2.equals(item.doNotTrackSetBy) : item.doNotTrackSetBy == null) && this.phoneNumber.equals(item.phoneNumber) && ((str3 = this.createdAt) != null ? str3.equals(item.createdAt) : item.createdAt == null)) {
                String str4 = this.updatedAt;
                String str5 = item.updatedAt;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                ContactNumberType contactNumberType = this.contactNumberType;
                int iHashCode3 = (iHashCode2 ^ (contactNumberType == null ? 0 : contactNumberType.hashCode())) * 1000003;
                Boolean bool = this.isPrimary;
                int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isValid;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isVerified;
                int iHashCode6 = (iHashCode5 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isWhatsappNumber;
                int iHashCode7 = (iHashCode6 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.isWrongNumber;
                int iHashCode8 = (iHashCode7 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.isSpam;
                int iHashCode9 = (iHashCode8 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                Boolean bool7 = this.doNotTrack;
                int iHashCode10 = (iHashCode9 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                String str2 = this.doNotTrackSetBy;
                int iHashCode11 = (((iHashCode10 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.phoneNumber.hashCode()) * 1000003;
                String str3 = this.createdAt;
                int iHashCode12 = (iHashCode11 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedAt;
                this.$hashCode = iHashCode12 ^ (str4 != null ? str4.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isPrimary() {
            return this.isPrimary;
        }

        public Boolean isSpam() {
            return this.isSpam;
        }

        public Boolean isValid() {
            return this.isValid;
        }

        public Boolean isVerified() {
            return this.isVerified;
        }

        public Boolean isWhatsappNumber() {
            return this.isWhatsappNumber;
        }

        public Boolean isWrongNumber() {
            return this.isWrongNumber;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactNumberType contactNumberType = Item.this.contactNumberType;
                    responseWriter.writeString(responseField, contactNumberType != null ? contactNumberType.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[5], Item.this.isPrimary);
                    responseWriter.writeBoolean(responseFieldArr[6], Item.this.isValid);
                    responseWriter.writeBoolean(responseFieldArr[7], Item.this.isVerified);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.isWhatsappNumber);
                    responseWriter.writeBoolean(responseFieldArr[9], Item.this.isWrongNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], Item.this.isSpam);
                    responseWriter.writeBoolean(responseFieldArr[11], Item.this.doNotTrack);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.doNotTrackSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.phoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedAt);
                }
            };
        }

        public String phoneNumber() {
            return this.phoneNumber;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", contactId=" + this.contactId + ", accountId=" + this.accountId + ", contactNumberType=" + this.contactNumberType + ", isPrimary=" + this.isPrimary + ", isValid=" + this.isValid + ", isVerified=" + this.isVerified + ", isWhatsappNumber=" + this.isWhatsappNumber + ", isWrongNumber=" + this.isWrongNumber + ", isSpam=" + this.isSpam + ", doNotTrack=" + this.doNotTrack + ", doNotTrackSetBy=" + this.doNotTrackSetBy + ", phoneNumber=" + this.phoneNumber + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchContactNumbers {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchContactNumbers> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchContactNumbers map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchContactNumbers.$responseFields;
                return new SearchContactNumbers(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.SearchContactNumbers.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.SearchContactNumbers.Mapper.1.1
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

        public SearchContactNumbers(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchContactNumbers)) {
                return false;
            }
            SearchContactNumbers searchContactNumbers = (SearchContactNumbers) obj;
            if (this.__typename.equals(searchContactNumbers.__typename) && this.items.equals(searchContactNumbers.items) && ((str = this.nextToken) != null ? str.equals(searchContactNumbers.nextToken) : searchContactNumbers.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchContactNumbers.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.SearchContactNumbers.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchContactNumbers.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchContactNumbers.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchContactNumbers.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.SearchContactNumbers.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchContactNumbers.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchContactNumbers.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchContactNumbers{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableContactNumberFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableContactNumberSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableContactNumberFilterInput searchableContactNumberFilterInput, SearchableContactNumberSortInput searchableContactNumberSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableContactNumberFilterInput;
            this.sort = searchableContactNumberSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableContactNumberFilterInput);
            linkedHashMap.put("sort", searchableContactNumberSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableContactNumberFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchContactNumbersQuery.Variables.1
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

        public SearchableContactNumberSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchContactNumbersQuery(SearchableContactNumberFilterInput searchableContactNumberFilterInput, SearchableContactNumberSortInput searchableContactNumberSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableContactNumberFilterInput, searchableContactNumberSortInput, num, str, num2);
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
        return "3e768642a2b9b9dfd2eb4bef2991c6dfaac9b7c8679198b00ab75c967f9bfffd";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchContactNumbers($filter: SearchableContactNumberFilterInput, $sort: SearchableContactNumberSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchContactNumbers(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      contactId\n      accountId\n      contactNumberType\n      isPrimary\n      isValid\n      isVerified\n      isWhatsappNumber\n      isWrongNumber\n      isSpam\n      doNotTrack\n      doNotTrackSetBy\n      phoneNumber\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
