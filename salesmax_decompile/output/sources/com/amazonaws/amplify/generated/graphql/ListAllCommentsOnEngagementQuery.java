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
import type.C19081x7db5aaa6;
import type.CustomType;
import type.ModelCommentFilterInput;
import type.ModelSortDirection;

/* loaded from: classes8.dex */
public final class ListAllCommentsOnEngagementQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListAllCommentsOnEngagement($engagementId: ID, $ownerIdUpdatedAt: ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCommentFilterInput, $limit: Int, $nextToken: String) {\n  listAllCommentsOnEngagement(engagementId: $engagementId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      ownerId\n      body\n      engagementId\n      activityId\n      parentEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListAllCommentsOnEngagement";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListAllCommentsOnEngagement($engagementId: ID, $ownerIdUpdatedAt: ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCommentFilterInput, $limit: Int, $nextToken: String) {\n  listAllCommentsOnEngagement(engagementId: $engagementId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      ownerId\n      body\n      engagementId\n      activityId\n      parentEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String engagementId;
        private ModelCommentFilterInput filter;
        private Integer limit;
        private String nextToken;
        private C19081x7db5aaa6 ownerIdUpdatedAt;
        private ModelSortDirection sortDirection;

        public ListAllCommentsOnEngagementQuery build() {
            return new ListAllCommentsOnEngagementQuery(this.engagementId, this.ownerIdUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder engagementId(String str) {
            this.engagementId = str;
            return this;
        }

        public Builder filter(ModelCommentFilterInput modelCommentFilterInput) {
            this.filter = modelCommentFilterInput;
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

        public Builder ownerIdUpdatedAt(C19081x7db5aaa6 c19081x7db5aaa6) {
            this.ownerIdUpdatedAt = c19081x7db5aaa6;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listAllCommentsOnEngagement", "listAllCommentsOnEngagement", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("ownerIdUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "ownerIdUpdatedAt").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("engagementId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "engagementId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListAllCommentsOnEngagement listAllCommentsOnEngagement;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListAllCommentsOnEngagement.Mapper listAllCommentsOnEngagementFieldMapper = new ListAllCommentsOnEngagement.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListAllCommentsOnEngagement) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListAllCommentsOnEngagement>() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListAllCommentsOnEngagement read(ResponseReader responseReader2) {
                        return Mapper.this.listAllCommentsOnEngagementFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListAllCommentsOnEngagement listAllCommentsOnEngagement) {
            this.listAllCommentsOnEngagement = listAllCommentsOnEngagement;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListAllCommentsOnEngagement listAllCommentsOnEngagement = this.listAllCommentsOnEngagement;
            ListAllCommentsOnEngagement listAllCommentsOnEngagement2 = ((Data) obj).listAllCommentsOnEngagement;
            return listAllCommentsOnEngagement == null ? listAllCommentsOnEngagement2 == null : listAllCommentsOnEngagement.equals(listAllCommentsOnEngagement2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListAllCommentsOnEngagement listAllCommentsOnEngagement = this.listAllCommentsOnEngagement;
                this.$hashCode = (listAllCommentsOnEngagement == null ? 0 : listAllCommentsOnEngagement.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListAllCommentsOnEngagement listAllCommentsOnEngagement() {
            return this.listAllCommentsOnEngagement;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListAllCommentsOnEngagement listAllCommentsOnEngagement = Data.this.listAllCommentsOnEngagement;
                    responseWriter.writeObject(responseField, listAllCommentsOnEngagement != null ? listAllCommentsOnEngagement.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listAllCommentsOnEngagement=" + this.listAllCommentsOnEngagement + "}";
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
        final String activityId;
        final String body;
        final String createdAt;
        final String engagementId;
        final String id;
        final String ownerId;
        final String parentEngagementId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("body", "body", null, false, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityId", "activityId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("parentEngagementId", "parentEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str4, "ownerId == null");
            this.body = (String) Utils.checkNotNull(str5, "body == null");
            this.engagementId = str6;
            this.activityId = str7;
            this.parentEngagementId = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String activityId() {
            return this.activityId;
        }

        public String body() {
            return this.body;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String engagementId() {
            return this.engagementId;
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
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.ownerId.equals(item.ownerId) && this.body.equals(item.body) && ((str = this.engagementId) != null ? str.equals(item.engagementId) : item.engagementId == null) && ((str2 = this.activityId) != null ? str2.equals(item.activityId) : item.activityId == null) && ((str3 = this.parentEngagementId) != null ? str3.equals(item.parentEngagementId) : item.parentEngagementId == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
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

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003) ^ this.body.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.activityId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.parentEngagementId;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.ownerId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.body);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.activityId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String parentEngagementId() {
            return this.parentEngagementId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", body=" + this.body + ", engagementId=" + this.engagementId + ", activityId=" + this.activityId + ", parentEngagementId=" + this.parentEngagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListAllCommentsOnEngagement {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListAllCommentsOnEngagement> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListAllCommentsOnEngagement map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListAllCommentsOnEngagement.$responseFields;
                return new ListAllCommentsOnEngagement(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.ListAllCommentsOnEngagement.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.ListAllCommentsOnEngagement.Mapper.1.1
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

        public ListAllCommentsOnEngagement(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListAllCommentsOnEngagement)) {
                return false;
            }
            ListAllCommentsOnEngagement listAllCommentsOnEngagement = (ListAllCommentsOnEngagement) obj;
            if (this.__typename.equals(listAllCommentsOnEngagement.__typename) && this.items.equals(listAllCommentsOnEngagement.items)) {
                String str = this.nextToken;
                String str2 = listAllCommentsOnEngagement.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.ListAllCommentsOnEngagement.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListAllCommentsOnEngagement.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListAllCommentsOnEngagement.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListAllCommentsOnEngagement.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.ListAllCommentsOnEngagement.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListAllCommentsOnEngagement.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListAllCommentsOnEngagement{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String engagementId;
        private final ModelCommentFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final C19081x7db5aaa6 ownerIdUpdatedAt;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, C19081x7db5aaa6 c19081x7db5aaa6, ModelSortDirection modelSortDirection, ModelCommentFilterInput modelCommentFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.engagementId = str;
            this.ownerIdUpdatedAt = c19081x7db5aaa6;
            this.sortDirection = modelSortDirection;
            this.filter = modelCommentFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("engagementId", str);
            linkedHashMap.put("ownerIdUpdatedAt", c19081x7db5aaa6);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCommentFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String engagementId() {
            return this.engagementId;
        }

        public ModelCommentFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAllCommentsOnEngagementQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("engagementId", Variables.this.engagementId);
                    inputFieldWriter.writeObject("ownerIdUpdatedAt", Variables.this.ownerIdUpdatedAt != null ? Variables.this.ownerIdUpdatedAt.marshaller() : null);
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

        public C19081x7db5aaa6 ownerIdUpdatedAt() {
            return this.ownerIdUpdatedAt;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListAllCommentsOnEngagementQuery(String str, C19081x7db5aaa6 c19081x7db5aaa6, ModelSortDirection modelSortDirection, ModelCommentFilterInput modelCommentFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, c19081x7db5aaa6, modelSortDirection, modelCommentFilterInput, num, str2);
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
        return "537d9090619f9882faf0fde9cd198190851976e8cf7b0b7ebe51057cdd444aa4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListAllCommentsOnEngagement($engagementId: ID, $ownerIdUpdatedAt: ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCommentFilterInput, $limit: Int, $nextToken: String) {\n  listAllCommentsOnEngagement(engagementId: $engagementId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      ownerId\n      body\n      engagementId\n      activityId\n      parentEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
