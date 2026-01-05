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
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;
import type.ModelWabaPhoneNumberUserFilterInput;

/* loaded from: classes7.dex */
public final class GetWabaPhoneNumbersByUserQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetWabaPhoneNumbersByUser($accountId: ID, $userId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelWabaPhoneNumberUserFilterInput, $limit: Int, $nextToken: String) {\n  getWabaPhoneNumbersByUser(accountId: $accountId, userId: $userId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaPhoneNumberId\n      isDefault\n      userId\n      teamId\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetWabaPhoneNumbersByUser";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetWabaPhoneNumbersByUser($accountId: ID, $userId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelWabaPhoneNumberUserFilterInput, $limit: Int, $nextToken: String) {\n  getWabaPhoneNumbersByUser(accountId: $accountId, userId: $userId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaPhoneNumberId\n      isDefault\n      userId\n      teamId\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelWabaPhoneNumberUserFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelIDKeyConditionInput userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetWabaPhoneNumbersByUserQuery build() {
            return new GetWabaPhoneNumbersByUserQuery(this.accountId, this.userId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelWabaPhoneNumberUserFilterInput modelWabaPhoneNumberUserFilterInput) {
            this.filter = modelWabaPhoneNumberUserFilterInput;
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

        public Builder userId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.userId = modelIDKeyConditionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getWabaPhoneNumbersByUser", "getWabaPhoneNumbersByUser", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetWabaPhoneNumbersByUser.Mapper getWabaPhoneNumbersByUserFieldMapper = new GetWabaPhoneNumbersByUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetWabaPhoneNumbersByUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetWabaPhoneNumbersByUser>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetWabaPhoneNumbersByUser read(ResponseReader responseReader2) {
                        return Mapper.this.getWabaPhoneNumbersByUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser) {
            this.getWabaPhoneNumbersByUser = getWabaPhoneNumbersByUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser = this.getWabaPhoneNumbersByUser;
            GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser2 = ((Data) obj).getWabaPhoneNumbersByUser;
            return getWabaPhoneNumbersByUser == null ? getWabaPhoneNumbersByUser2 == null : getWabaPhoneNumbersByUser.equals(getWabaPhoneNumbersByUser2);
        }

        public GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser() {
            return this.getWabaPhoneNumbersByUser;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser = this.getWabaPhoneNumbersByUser;
                this.$hashCode = (getWabaPhoneNumbersByUser == null ? 0 : getWabaPhoneNumbersByUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser = Data.this.getWabaPhoneNumbersByUser;
                    responseWriter.writeObject(responseField, getWabaPhoneNumbersByUser != null ? getWabaPhoneNumbersByUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getWabaPhoneNumbersByUser=" + this.getWabaPhoneNumbersByUser + "}";
            }
            return this.$toString;
        }
    }

    public static class GetWabaPhoneNumbersByUser {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetWabaPhoneNumbersByUser> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetWabaPhoneNumbersByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetWabaPhoneNumbersByUser.$responseFields;
                return new GetWabaPhoneNumbersByUser(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.GetWabaPhoneNumbersByUser.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.GetWabaPhoneNumbersByUser.Mapper.1.1
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

        public GetWabaPhoneNumbersByUser(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetWabaPhoneNumbersByUser)) {
                return false;
            }
            GetWabaPhoneNumbersByUser getWabaPhoneNumbersByUser = (GetWabaPhoneNumbersByUser) obj;
            if (this.__typename.equals(getWabaPhoneNumbersByUser.__typename) && this.items.equals(getWabaPhoneNumbersByUser.items)) {
                String str = this.nextToken;
                String str2 = getWabaPhoneNumbersByUser.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.GetWabaPhoneNumbersByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetWabaPhoneNumbersByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetWabaPhoneNumbersByUser.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetWabaPhoneNumbersByUser.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.GetWabaPhoneNumbersByUser.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetWabaPhoneNumbersByUser.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetWabaPhoneNumbersByUser{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String id;
        final Boolean isDefault;
        final String teamId;
        final String updatedAt;
        final String updatedById;
        final String userId;
        final String wabaPhoneNumberId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaPhoneNumberId", "wabaPhoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("isDefault", "isDefault", null, true, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.wabaPhoneNumberId = str4;
            this.isDefault = bool;
            this.userId = str5;
            this.teamId = str6;
            this.createdAt = str7;
            this.updatedAt = str8;
            this.createdById = str9;
            this.updatedById = str10;
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

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.wabaPhoneNumberId) != null ? str.equals(item.wabaPhoneNumberId) : item.wabaPhoneNumberId == null) && ((bool = this.isDefault) != null ? bool.equals(item.isDefault) : item.isDefault == null) && ((str2 = this.userId) != null ? str2.equals(item.userId) : item.userId == null) && ((str3 = this.teamId) != null ? str3.equals(item.teamId) : item.teamId == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(item.updatedAt) : item.updatedAt == null) && ((str6 = this.createdById) != null ? str6.equals(item.createdById) : item.createdById == null)) {
                String str7 = this.updatedById;
                String str8 = item.updatedById;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.wabaPhoneNumberId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isDefault;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdById;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                this.$hashCode = iHashCode8 ^ (str7 != null ? str7.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isDefault() {
            return this.isDefault;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.wabaPhoneNumberId);
                    responseWriter.writeBoolean(responseFieldArr[4], Item.this.isDefault);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedById);
                }
            };
        }

        public String teamId() {
            return this.teamId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaPhoneNumberId=" + this.wabaPhoneNumberId + ", isDefault=" + this.isDefault + ", userId=" + this.userId + ", teamId=" + this.teamId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String userId() {
            return this.userId;
        }

        public String wabaPhoneNumberId() {
            return this.wabaPhoneNumberId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelWabaPhoneNumberUserFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelIDKeyConditionInput userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelWabaPhoneNumberUserFilterInput modelWabaPhoneNumberUserFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.userId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelWabaPhoneNumberUserFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("userId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelWabaPhoneNumberUserFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelWabaPhoneNumberUserFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaPhoneNumbersByUserQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("userId", Variables.this.userId != null ? Variables.this.userId.marshaller() : null);
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

        public ModelIDKeyConditionInput userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetWabaPhoneNumbersByUserQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelWabaPhoneNumberUserFilterInput modelWabaPhoneNumberUserFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelWabaPhoneNumberUserFilterInput, num, str2);
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
        return "e7f9c8ec6e3be84bc07c5e35ac1d6f68a45018a6170a8334b9a304f9d2ed6a72";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetWabaPhoneNumbersByUser($accountId: ID, $userId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelWabaPhoneNumberUserFilterInput, $limit: Int, $nextToken: String) {\n  getWabaPhoneNumbersByUser(accountId: $accountId, userId: $userId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaPhoneNumberId\n      isDefault\n      userId\n      teamId\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
