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
import type.ActionType;
import type.CustomType;
import type.EntityType;
import type.ModelAccountUpdatesFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetAccountChangesByAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetAccountChangesByAccount($accountId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountUpdatesFilterInput, $limit: Int, $nextToken: String) {\n  getAccountChangesByAccount(accountId: $accountId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      entityType\n      entityId\n      actionType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetAccountChangesByAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetAccountChangesByAccount($accountId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountUpdatesFilterInput, $limit: Int, $nextToken: String) {\n  getAccountChangesByAccount(accountId: $accountId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      entityType\n      entityId\n      actionType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelAccountUpdatesFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelStringKeyConditionInput updatedAt;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetAccountChangesByAccountQuery build() {
            return new GetAccountChangesByAccountQuery(this.accountId, this.updatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelAccountUpdatesFilterInput modelAccountUpdatesFilterInput) {
            this.filter = modelAccountUpdatesFilterInput;
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

        public Builder updatedAt(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.updatedAt = modelStringKeyConditionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getAccountChangesByAccount", "getAccountChangesByAccount", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("updatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "updatedAt").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetAccountChangesByAccount getAccountChangesByAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetAccountChangesByAccount.Mapper getAccountChangesByAccountFieldMapper = new GetAccountChangesByAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetAccountChangesByAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetAccountChangesByAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetAccountChangesByAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getAccountChangesByAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetAccountChangesByAccount getAccountChangesByAccount) {
            this.getAccountChangesByAccount = getAccountChangesByAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetAccountChangesByAccount getAccountChangesByAccount = this.getAccountChangesByAccount;
            GetAccountChangesByAccount getAccountChangesByAccount2 = ((Data) obj).getAccountChangesByAccount;
            return getAccountChangesByAccount == null ? getAccountChangesByAccount2 == null : getAccountChangesByAccount.equals(getAccountChangesByAccount2);
        }

        public GetAccountChangesByAccount getAccountChangesByAccount() {
            return this.getAccountChangesByAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetAccountChangesByAccount getAccountChangesByAccount = this.getAccountChangesByAccount;
                this.$hashCode = (getAccountChangesByAccount == null ? 0 : getAccountChangesByAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetAccountChangesByAccount getAccountChangesByAccount = Data.this.getAccountChangesByAccount;
                    responseWriter.writeObject(responseField, getAccountChangesByAccount != null ? getAccountChangesByAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getAccountChangesByAccount=" + this.getAccountChangesByAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetAccountChangesByAccount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetAccountChangesByAccount> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetAccountChangesByAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetAccountChangesByAccount.$responseFields;
                return new GetAccountChangesByAccount(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.GetAccountChangesByAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.GetAccountChangesByAccount.Mapper.1.1
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

        public GetAccountChangesByAccount(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetAccountChangesByAccount)) {
                return false;
            }
            GetAccountChangesByAccount getAccountChangesByAccount = (GetAccountChangesByAccount) obj;
            if (this.__typename.equals(getAccountChangesByAccount.__typename) && this.items.equals(getAccountChangesByAccount.items)) {
                String str = this.nextToken;
                String str2 = getAccountChangesByAccount.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.GetAccountChangesByAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetAccountChangesByAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetAccountChangesByAccount.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetAccountChangesByAccount.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.GetAccountChangesByAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetAccountChangesByAccount.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetAccountChangesByAccount{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final ActionType actionType;
        final String createdAt;
        final String entityId;
        final EntityType entityType;
        final String id;
        final String updatedAt;
        final String userId;

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
                EntityType entityTypeValueOf = string2 != null ? EntityType.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                return new Item(string, str, str2, str3, entityTypeValueOf, str4, string3 != null ? ActionType.valueOf(string3) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("entityType", "entityType", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("actionType", "actionType", null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, EntityType entityType, String str5, ActionType actionType, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.entityType = (EntityType) Utils.checkNotNull(entityType, "entityType == null");
            this.entityId = (String) Utils.checkNotNull(str5, "entityId == null");
            this.actionType = (ActionType) Utils.checkNotNull(actionType, "actionType == null");
            this.createdAt = (String) Utils.checkNotNull(str6, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str7, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActionType actionType() {
            return this.actionType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String entityId() {
            return this.entityId;
        }

        public EntityType entityType() {
            return this.entityType;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.userId.equals(item.userId) && this.entityType.equals(item.entityType) && this.entityId.equals(item.entityId) && this.actionType.equals(item.actionType) && this.createdAt.equals(item.createdAt) && this.updatedAt.equals(item.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = ((((((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.entityType.hashCode()) * 1000003) ^ this.entityId.hashCode()) * 1000003) ^ this.actionType.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.userId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.entityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.entityId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.actionType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ", actionType=" + this.actionType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelAccountUpdatesFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelStringKeyConditionInput updatedAt;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelAccountUpdatesFilterInput modelAccountUpdatesFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.updatedAt = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelAccountUpdatesFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("updatedAt", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelAccountUpdatesFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelAccountUpdatesFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountChangesByAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("updatedAt", Variables.this.updatedAt != null ? Variables.this.updatedAt.marshaller() : null);
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

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        public ModelStringKeyConditionInput updatedAt() {
            return this.updatedAt;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetAccountChangesByAccountQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelAccountUpdatesFilterInput modelAccountUpdatesFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelAccountUpdatesFilterInput, num, str2);
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
        return "bf9e2c746dc3c8e683e752c34f21baa5281965b30274bf831267a89f01027238";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetAccountChangesByAccount($accountId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountUpdatesFilterInput, $limit: Int, $nextToken: String) {\n  getAccountChangesByAccount(accountId: $accountId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      entityType\n      entityId\n      actionType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
