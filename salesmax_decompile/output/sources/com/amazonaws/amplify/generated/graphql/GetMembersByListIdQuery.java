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
import type.ModelEntityListMembershipByListIdCompositeKeyConditionInput;
import type.ModelEntityListMembershipFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetMembersByListIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetMembersByListId($accountId: ID, $entityListIdUpdatedAt: ModelEntityListMembershipByListIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelEntityListMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getMembersByListId(accountId: $accountId, entityListIdUpdatedAt: $entityListIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      associatedObjectId\n      associatedObjectType\n      entityListId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetMembersByListId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetMembersByListId($accountId: ID, $entityListIdUpdatedAt: ModelEntityListMembershipByListIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelEntityListMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getMembersByListId(accountId: $accountId, entityListIdUpdatedAt: $entityListIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      associatedObjectId\n      associatedObjectType\n      entityListId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelEntityListMembershipByListIdCompositeKeyConditionInput entityListIdUpdatedAt;
        private ModelEntityListMembershipFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetMembersByListIdQuery build() {
            return new GetMembersByListIdQuery(this.accountId, this.entityListIdUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder entityListIdUpdatedAt(ModelEntityListMembershipByListIdCompositeKeyConditionInput modelEntityListMembershipByListIdCompositeKeyConditionInput) {
            this.entityListIdUpdatedAt = modelEntityListMembershipByListIdCompositeKeyConditionInput;
            return this;
        }

        public Builder filter(ModelEntityListMembershipFilterInput modelEntityListMembershipFilterInput) {
            this.filter = modelEntityListMembershipFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getMembersByListId", "getMembersByListId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("entityListIdUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "entityListIdUpdatedAt").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetMembersByListId getMembersByListId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetMembersByListId.Mapper getMembersByListIdFieldMapper = new GetMembersByListId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetMembersByListId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetMembersByListId>() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetMembersByListId read(ResponseReader responseReader2) {
                        return Mapper.this.getMembersByListIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetMembersByListId getMembersByListId) {
            this.getMembersByListId = getMembersByListId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetMembersByListId getMembersByListId = this.getMembersByListId;
            GetMembersByListId getMembersByListId2 = ((Data) obj).getMembersByListId;
            return getMembersByListId == null ? getMembersByListId2 == null : getMembersByListId.equals(getMembersByListId2);
        }

        public GetMembersByListId getMembersByListId() {
            return this.getMembersByListId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetMembersByListId getMembersByListId = this.getMembersByListId;
                this.$hashCode = (getMembersByListId == null ? 0 : getMembersByListId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetMembersByListId getMembersByListId = Data.this.getMembersByListId;
                    responseWriter.writeObject(responseField, getMembersByListId != null ? getMembersByListId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getMembersByListId=" + this.getMembersByListId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetMembersByListId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetMembersByListId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetMembersByListId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetMembersByListId.$responseFields;
                return new GetMembersByListId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.GetMembersByListId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.GetMembersByListId.Mapper.1.1
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

        public GetMembersByListId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetMembersByListId)) {
                return false;
            }
            GetMembersByListId getMembersByListId = (GetMembersByListId) obj;
            if (this.__typename.equals(getMembersByListId.__typename) && this.items.equals(getMembersByListId.items)) {
                String str = this.nextToken;
                String str2 = getMembersByListId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.GetMembersByListId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetMembersByListId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetMembersByListId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetMembersByListId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.GetMembersByListId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetMembersByListId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetMembersByListId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String associatedObjectId;
        final String associatedObjectType;
        final String contactId;
        final String createdAt;
        final String entityListId;
        final String id;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("associatedObjectId", "associatedObjectId", null, true, customType, Collections.emptyList()), ResponseField.forString("associatedObjectType", "associatedObjectType", null, true, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = (String) Utils.checkNotNull(str4, "contactId == null");
            this.associatedObjectId = str5;
            this.associatedObjectType = str6;
            this.entityListId = (String) Utils.checkNotNull(str7, "entityListId == null");
            this.createdAt = str8;
            this.updatedAt = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String associatedObjectId() {
            return this.associatedObjectId;
        }

        public String associatedObjectType() {
            return this.associatedObjectType;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String entityListId() {
            return this.entityListId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.contactId.equals(item.contactId) && ((str = this.associatedObjectId) != null ? str.equals(item.associatedObjectId) : item.associatedObjectId == null) && ((str2 = this.associatedObjectType) != null ? str2.equals(item.associatedObjectType) : item.associatedObjectType == null) && this.entityListId.equals(item.entityListId) && ((str3 = this.createdAt) != null ? str3.equals(item.createdAt) : item.createdAt == null)) {
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
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str = this.associatedObjectId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.associatedObjectType;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.entityListId.hashCode()) * 1000003;
                String str3 = this.createdAt;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedAt;
                this.$hashCode = iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.associatedObjectId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.associatedObjectType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", associatedObjectId=" + this.associatedObjectId + ", associatedObjectType=" + this.associatedObjectType + ", entityListId=" + this.entityListId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelEntityListMembershipByListIdCompositeKeyConditionInput entityListIdUpdatedAt;
        private final ModelEntityListMembershipFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelEntityListMembershipByListIdCompositeKeyConditionInput modelEntityListMembershipByListIdCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelEntityListMembershipFilterInput modelEntityListMembershipFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.entityListIdUpdatedAt = modelEntityListMembershipByListIdCompositeKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelEntityListMembershipFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("entityListIdUpdatedAt", modelEntityListMembershipByListIdCompositeKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelEntityListMembershipFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelEntityListMembershipByListIdCompositeKeyConditionInput entityListIdUpdatedAt() {
            return this.entityListIdUpdatedAt;
        }

        public ModelEntityListMembershipFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMembersByListIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("entityListIdUpdatedAt", Variables.this.entityListIdUpdatedAt != null ? Variables.this.entityListIdUpdatedAt.marshaller() : null);
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

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetMembersByListIdQuery(String str, ModelEntityListMembershipByListIdCompositeKeyConditionInput modelEntityListMembershipByListIdCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelEntityListMembershipFilterInput modelEntityListMembershipFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelEntityListMembershipByListIdCompositeKeyConditionInput, modelSortDirection, modelEntityListMembershipFilterInput, num, str2);
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
        return "b7cf8413daac7145632fc3c1fb371f423ca49efc8245c7b4e8d55bff59619bd8";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetMembersByListId($accountId: ID, $entityListIdUpdatedAt: ModelEntityListMembershipByListIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelEntityListMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getMembersByListId(accountId: $accountId, entityListIdUpdatedAt: $entityListIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      associatedObjectId\n      associatedObjectType\n      entityListId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
