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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelCustomFormDefinitionsFilterInput;

/* loaded from: classes4.dex */
public final class ListCustomFormDefinitionssQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListCustomFormDefinitionss($filter: ModelCustomFormDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  listCustomFormDefinitionss(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListCustomFormDefinitionss";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListCustomFormDefinitionss($filter: ModelCustomFormDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  listCustomFormDefinitionss(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelCustomFormDefinitionsFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListCustomFormDefinitionssQuery build() {
            return new ListCustomFormDefinitionssQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelCustomFormDefinitionsFilterInput modelCustomFormDefinitionsFilterInput) {
            this.filter = modelCustomFormDefinitionsFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listCustomFormDefinitionss", "listCustomFormDefinitionss", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListCustomFormDefinitionss listCustomFormDefinitionss;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListCustomFormDefinitionss.Mapper listCustomFormDefinitionssFieldMapper = new ListCustomFormDefinitionss.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListCustomFormDefinitionss) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListCustomFormDefinitionss>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListCustomFormDefinitionss read(ResponseReader responseReader2) {
                        return Mapper.this.listCustomFormDefinitionssFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListCustomFormDefinitionss listCustomFormDefinitionss) {
            this.listCustomFormDefinitionss = listCustomFormDefinitionss;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListCustomFormDefinitionss listCustomFormDefinitionss = this.listCustomFormDefinitionss;
            ListCustomFormDefinitionss listCustomFormDefinitionss2 = ((Data) obj).listCustomFormDefinitionss;
            return listCustomFormDefinitionss == null ? listCustomFormDefinitionss2 == null : listCustomFormDefinitionss.equals(listCustomFormDefinitionss2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListCustomFormDefinitionss listCustomFormDefinitionss = this.listCustomFormDefinitionss;
                this.$hashCode = (listCustomFormDefinitionss == null ? 0 : listCustomFormDefinitionss.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListCustomFormDefinitionss listCustomFormDefinitionss() {
            return this.listCustomFormDefinitionss;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListCustomFormDefinitionss listCustomFormDefinitionss = Data.this.listCustomFormDefinitionss;
                    responseWriter.writeObject(responseField, listCustomFormDefinitionss != null ? listCustomFormDefinitionss.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listCustomFormDefinitionss=" + this.listCustomFormDefinitionss + "}";
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
        final String createdById;
        final String displayName;
        final String formName;
        final String formTitle;
        final String id;
        final String updaedById;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("formName", "formName", null, false, Collections.emptyList()), ResponseField.forString("displayName", "displayName", null, false, Collections.emptyList()), ResponseField.forString("formTitle", "formTitle", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updaedById", "updaedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formName = (String) Utils.checkNotNull(str4, "formName == null");
            this.displayName = (String) Utils.checkNotNull(str5, "displayName == null");
            this.formTitle = str6;
            this.createdById = str7;
            this.updaedById = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
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

        public String createdById() {
            return this.createdById;
        }

        public String displayName() {
            return this.displayName;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.formName.equals(item.formName) && this.displayName.equals(item.displayName) && ((str = this.formTitle) != null ? str.equals(item.formTitle) : item.formTitle == null) && ((str2 = this.createdById) != null ? str2.equals(item.createdById) : item.createdById == null) && ((str3 = this.updaedById) != null ? str3.equals(item.updaedById) : item.updaedById == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = item.updatedAt;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public String formName() {
            return this.formName;
        }

        public String formTitle() {
            return this.formTitle;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formName.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003;
                String str = this.formTitle;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.createdById;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updaedById;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.formName);
                    responseWriter.writeString(responseFieldArr[4], Item.this.displayName);
                    responseWriter.writeString(responseFieldArr[5], Item.this.formTitle);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.updaedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formName=" + this.formName + ", displayName=" + this.displayName + ", formTitle=" + this.formTitle + ", createdById=" + this.createdById + ", updaedById=" + this.updaedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updaedById() {
            return this.updaedById;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListCustomFormDefinitionss {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListCustomFormDefinitionss> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListCustomFormDefinitionss map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListCustomFormDefinitionss.$responseFields;
                return new ListCustomFormDefinitionss(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.ListCustomFormDefinitionss.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.ListCustomFormDefinitionss.Mapper.1.1
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

        public ListCustomFormDefinitionss(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListCustomFormDefinitionss)) {
                return false;
            }
            ListCustomFormDefinitionss listCustomFormDefinitionss = (ListCustomFormDefinitionss) obj;
            if (this.__typename.equals(listCustomFormDefinitionss.__typename) && this.items.equals(listCustomFormDefinitionss.items)) {
                String str = this.nextToken;
                String str2 = listCustomFormDefinitionss.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.ListCustomFormDefinitionss.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListCustomFormDefinitionss.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListCustomFormDefinitionss.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListCustomFormDefinitionss.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.ListCustomFormDefinitionss.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListCustomFormDefinitionss.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListCustomFormDefinitionss{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelCustomFormDefinitionsFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelCustomFormDefinitionsFilterInput modelCustomFormDefinitionsFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelCustomFormDefinitionsFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelCustomFormDefinitionsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelCustomFormDefinitionsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormDefinitionssQuery.Variables.1
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

    public ListCustomFormDefinitionssQuery(ModelCustomFormDefinitionsFilterInput modelCustomFormDefinitionsFilterInput, Integer num, String str) {
        this.variables = new Variables(modelCustomFormDefinitionsFilterInput, num, str);
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
        return "f1bd4c202d019c7c475f849b13a3affa672ef1cc4335c7de3835e2a39a322212";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListCustomFormDefinitionss($filter: ModelCustomFormDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  listCustomFormDefinitionss(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formName\n      displayName\n      formTitle\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
