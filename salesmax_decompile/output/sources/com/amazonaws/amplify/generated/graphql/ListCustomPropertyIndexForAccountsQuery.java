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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelCustomPropertyIndexForAccountFilterInput;
import type.ModelSortDirection;

/* loaded from: classes4.dex */
public final class ListCustomPropertyIndexForAccountsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListCustomPropertyIndexForAccounts($accountId: ID, $filter: ModelCustomPropertyIndexForAccountFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listCustomPropertyIndexForAccounts(accountId: $accountId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      textIndex\n      numIndex\n      boolIndex\n      textIndexUser\n      numIndexUser\n      boolIndexUser\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListCustomPropertyIndexForAccounts";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListCustomPropertyIndexForAccounts($accountId: ID, $filter: ModelCustomPropertyIndexForAccountFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listCustomPropertyIndexForAccounts(accountId: $accountId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      textIndex\n      numIndex\n      boolIndex\n      textIndexUser\n      numIndexUser\n      boolIndexUser\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelCustomPropertyIndexForAccountFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ListCustomPropertyIndexForAccountsQuery build() {
            return new ListCustomPropertyIndexForAccountsQuery(this.accountId, this.filter, this.limit, this.nextToken, this.sortDirection);
        }

        public Builder filter(ModelCustomPropertyIndexForAccountFilterInput modelCustomPropertyIndexForAccountFilterInput) {
            this.filter = modelCustomPropertyIndexForAccountFilterInput;
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

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listCustomPropertyIndexForAccounts", "listCustomPropertyIndexForAccounts", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListCustomPropertyIndexForAccounts.Mapper listCustomPropertyIndexForAccountsFieldMapper = new ListCustomPropertyIndexForAccounts.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListCustomPropertyIndexForAccounts) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListCustomPropertyIndexForAccounts>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListCustomPropertyIndexForAccounts read(ResponseReader responseReader2) {
                        return Mapper.this.listCustomPropertyIndexForAccountsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts) {
            this.listCustomPropertyIndexForAccounts = listCustomPropertyIndexForAccounts;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts = this.listCustomPropertyIndexForAccounts;
            ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts2 = ((Data) obj).listCustomPropertyIndexForAccounts;
            return listCustomPropertyIndexForAccounts == null ? listCustomPropertyIndexForAccounts2 == null : listCustomPropertyIndexForAccounts.equals(listCustomPropertyIndexForAccounts2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts = this.listCustomPropertyIndexForAccounts;
                this.$hashCode = (listCustomPropertyIndexForAccounts == null ? 0 : listCustomPropertyIndexForAccounts.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts() {
            return this.listCustomPropertyIndexForAccounts;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts = Data.this.listCustomPropertyIndexForAccounts;
                    responseWriter.writeObject(responseField, listCustomPropertyIndexForAccounts != null ? listCustomPropertyIndexForAccounts.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listCustomPropertyIndexForAccounts=" + this.listCustomPropertyIndexForAccounts + "}";
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
        final Integer boolIndex;
        final Integer boolIndexUser;
        final String createdAt;
        final Integer numIndex;
        final Integer numIndexUser;
        final Integer textIndex;
        final Integer textIndexUser;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readInt(responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, CustomType.ID, Collections.emptyList()), ResponseField.forInt("textIndex", "textIndex", null, true, Collections.emptyList()), ResponseField.forInt("numIndex", "numIndex", null, true, Collections.emptyList()), ResponseField.forInt("boolIndex", "boolIndex", null, true, Collections.emptyList()), ResponseField.forInt("textIndexUser", "textIndexUser", null, true, Collections.emptyList()), ResponseField.forInt("numIndexUser", "numIndexUser", null, true, Collections.emptyList()), ResponseField.forInt("boolIndexUser", "boolIndexUser", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.textIndex = num;
            this.numIndex = num2;
            this.boolIndex = num3;
            this.textIndexUser = num4;
            this.numIndexUser = num5;
            this.boolIndexUser = num6;
            this.createdAt = str3;
            this.updatedAt = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer boolIndex() {
            return this.boolIndex;
        }

        public Integer boolIndexUser() {
            return this.boolIndexUser;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && ((num = this.textIndex) != null ? num.equals(item.textIndex) : item.textIndex == null) && ((num2 = this.numIndex) != null ? num2.equals(item.numIndex) : item.numIndex == null) && ((num3 = this.boolIndex) != null ? num3.equals(item.boolIndex) : item.boolIndex == null) && ((num4 = this.textIndexUser) != null ? num4.equals(item.textIndexUser) : item.textIndexUser == null) && ((num5 = this.numIndexUser) != null ? num5.equals(item.numIndexUser) : item.numIndexUser == null) && ((num6 = this.boolIndexUser) != null ? num6.equals(item.boolIndexUser) : item.boolIndexUser == null) && ((str = this.createdAt) != null ? str.equals(item.createdAt) : item.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = item.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                Integer num = this.textIndex;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.numIndex;
                int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.boolIndex;
                int iHashCode4 = (iHashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.textIndexUser;
                int iHashCode5 = (iHashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.numIndexUser;
                int iHashCode6 = (iHashCode5 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.boolIndexUser;
                int iHashCode7 = (iHashCode6 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeInt(responseFieldArr[2], Item.this.textIndex);
                    responseWriter.writeInt(responseFieldArr[3], Item.this.numIndex);
                    responseWriter.writeInt(responseFieldArr[4], Item.this.boolIndex);
                    responseWriter.writeInt(responseFieldArr[5], Item.this.textIndexUser);
                    responseWriter.writeInt(responseFieldArr[6], Item.this.numIndexUser);
                    responseWriter.writeInt(responseFieldArr[7], Item.this.boolIndexUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public Integer numIndex() {
            return this.numIndex;
        }

        public Integer numIndexUser() {
            return this.numIndexUser;
        }

        public Integer textIndex() {
            return this.textIndex;
        }

        public Integer textIndexUser() {
            return this.textIndexUser;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", textIndex=" + this.textIndex + ", numIndex=" + this.numIndex + ", boolIndex=" + this.boolIndex + ", textIndexUser=" + this.textIndexUser + ", numIndexUser=" + this.numIndexUser + ", boolIndexUser=" + this.boolIndexUser + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListCustomPropertyIndexForAccounts {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListCustomPropertyIndexForAccounts> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListCustomPropertyIndexForAccounts map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListCustomPropertyIndexForAccounts.$responseFields;
                return new ListCustomPropertyIndexForAccounts(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.ListCustomPropertyIndexForAccounts.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.ListCustomPropertyIndexForAccounts.Mapper.1.1
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

        public ListCustomPropertyIndexForAccounts(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListCustomPropertyIndexForAccounts)) {
                return false;
            }
            ListCustomPropertyIndexForAccounts listCustomPropertyIndexForAccounts = (ListCustomPropertyIndexForAccounts) obj;
            if (this.__typename.equals(listCustomPropertyIndexForAccounts.__typename) && this.items.equals(listCustomPropertyIndexForAccounts.items)) {
                String str = this.nextToken;
                String str2 = listCustomPropertyIndexForAccounts.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.ListCustomPropertyIndexForAccounts.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListCustomPropertyIndexForAccounts.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListCustomPropertyIndexForAccounts.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListCustomPropertyIndexForAccounts.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.ListCustomPropertyIndexForAccounts.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListCustomPropertyIndexForAccounts.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListCustomPropertyIndexForAccounts{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelCustomPropertyIndexForAccountFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelCustomPropertyIndexForAccountFilterInput modelCustomPropertyIndexForAccountFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.filter = modelCustomPropertyIndexForAccountFilterInput;
            this.limit = num;
            this.nextToken = str2;
            this.sortDirection = modelSortDirection;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("filter", modelCustomPropertyIndexForAccountFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
            linkedHashMap.put("sortDirection", modelSortDirection);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelCustomPropertyIndexForAccountFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomPropertyIndexForAccountsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListCustomPropertyIndexForAccountsQuery(String str, ModelCustomPropertyIndexForAccountFilterInput modelCustomPropertyIndexForAccountFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
        this.variables = new Variables(str, modelCustomPropertyIndexForAccountFilterInput, num, str2, modelSortDirection);
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
        return "9b412c6151b77819ed6cccc0a5e6c8eed2fb367f873433fed7a5a499e7c6109e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListCustomPropertyIndexForAccounts($accountId: ID, $filter: ModelCustomPropertyIndexForAccountFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listCustomPropertyIndexForAccounts(accountId: $accountId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      textIndex\n      numIndex\n      boolIndex\n      textIndexUser\n      numIndexUser\n      boolIndexUser\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
