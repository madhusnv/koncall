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
import type.ModelDataExportOutputExportsByUserCompositeKeyConditionInput;
import type.ModelDataExportOutputFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetExportsByUserQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetExportsByUser($userId: ID, $accountIdUpdatedAt: ModelDataExportOutputExportsByUserCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDataExportOutputFilterInput, $limit: Int, $nextToken: String) {\n  GetExportsByUser(userId: $userId, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      teamId\n      entityActionDefinitionReference\n      uploadedFileReference\n      exportMessage\n      batchRunId\n      status\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetExportsByUser";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetExportsByUser($userId: ID, $accountIdUpdatedAt: ModelDataExportOutputExportsByUserCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDataExportOutputFilterInput, $limit: Int, $nextToken: String) {\n  GetExportsByUser(userId: $userId, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      teamId\n      entityActionDefinitionReference\n      uploadedFileReference\n      exportMessage\n      batchRunId\n      status\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelDataExportOutputExportsByUserCompositeKeyConditionInput accountIdUpdatedAt;
        private ModelDataExportOutputFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private String userId;

        public Builder accountIdUpdatedAt(ModelDataExportOutputExportsByUserCompositeKeyConditionInput modelDataExportOutputExportsByUserCompositeKeyConditionInput) {
            this.accountIdUpdatedAt = modelDataExportOutputExportsByUserCompositeKeyConditionInput;
            return this;
        }

        public GetExportsByUserQuery build() {
            return new GetExportsByUserQuery(this.userId, this.accountIdUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelDataExportOutputFilterInput modelDataExportOutputFilterInput) {
            this.filter = modelDataExportOutputFilterInput;
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

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("GetExportsByUser", "GetExportsByUser", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountIdUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountIdUpdatedAt").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetExportsByUser GetExportsByUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetExportsByUser.Mapper getExportsByUserFieldMapper = new GetExportsByUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetExportsByUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetExportsByUser>() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetExportsByUser read(ResponseReader responseReader2) {
                        return Mapper.this.getExportsByUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetExportsByUser getExportsByUser) {
            this.GetExportsByUser = getExportsByUser;
        }

        public GetExportsByUser GetExportsByUser() {
            return this.GetExportsByUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetExportsByUser getExportsByUser = this.GetExportsByUser;
            GetExportsByUser getExportsByUser2 = ((Data) obj).GetExportsByUser;
            return getExportsByUser == null ? getExportsByUser2 == null : getExportsByUser.equals(getExportsByUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetExportsByUser getExportsByUser = this.GetExportsByUser;
                this.$hashCode = (getExportsByUser == null ? 0 : getExportsByUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetExportsByUser getExportsByUser = Data.this.GetExportsByUser;
                    responseWriter.writeObject(responseField, getExportsByUser != null ? getExportsByUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{GetExportsByUser=" + this.GetExportsByUser + "}";
            }
            return this.$toString;
        }
    }

    public static class GetExportsByUser {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetExportsByUser> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetExportsByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetExportsByUser.$responseFields;
                return new GetExportsByUser(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.GetExportsByUser.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.GetExportsByUser.Mapper.1.1
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

        public GetExportsByUser(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetExportsByUser)) {
                return false;
            }
            GetExportsByUser getExportsByUser = (GetExportsByUser) obj;
            if (this.__typename.equals(getExportsByUser.__typename) && this.items.equals(getExportsByUser.items)) {
                String str = this.nextToken;
                String str2 = getExportsByUser.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.GetExportsByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetExportsByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetExportsByUser.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetExportsByUser.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.GetExportsByUser.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetExportsByUser.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetExportsByUser{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String batchRunId;
        final String createdAt;
        final String entityActionDefinitionReference;
        final String exportMessage;
        final String id;
        final String status;
        final String teamId;
        final String updatedAt;
        final String uploadedFileReference;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("entityActionDefinitionReference", "entityActionDefinitionReference", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedFileReference", "uploadedFileReference", null, true, customType, Collections.emptyList()), ResponseField.forString("exportMessage", "exportMessage", null, true, Collections.emptyList()), ResponseField.forString("batchRunId", "batchRunId", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = str4;
            this.teamId = str5;
            this.entityActionDefinitionReference = str6;
            this.uploadedFileReference = str7;
            this.exportMessage = str8;
            this.batchRunId = str9;
            this.status = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String batchRunId() {
            return this.batchRunId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String entityActionDefinitionReference() {
            return this.entityActionDefinitionReference;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.userId) != null ? str.equals(item.userId) : item.userId == null) && ((str2 = this.teamId) != null ? str2.equals(item.teamId) : item.teamId == null) && ((str3 = this.entityActionDefinitionReference) != null ? str3.equals(item.entityActionDefinitionReference) : item.entityActionDefinitionReference == null) && ((str4 = this.uploadedFileReference) != null ? str4.equals(item.uploadedFileReference) : item.uploadedFileReference == null) && ((str5 = this.exportMessage) != null ? str5.equals(item.exportMessage) : item.exportMessage == null) && ((str6 = this.batchRunId) != null ? str6.equals(item.batchRunId) : item.batchRunId == null) && ((str7 = this.status) != null ? str7.equals(item.status) : item.status == null) && ((str8 = this.createdAt) != null ? str8.equals(item.createdAt) : item.createdAt == null)) {
                String str9 = this.updatedAt;
                String str10 = item.updatedAt;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public String exportMessage() {
            return this.exportMessage;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.userId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.entityActionDefinitionReference;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.uploadedFileReference;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.exportMessage;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.batchRunId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.status;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                this.$hashCode = iHashCode9 ^ (str9 != null ? str9.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.entityActionDefinitionReference);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.uploadedFileReference);
                    responseWriter.writeString(responseFieldArr[7], Item.this.exportMessage);
                    responseWriter.writeString(responseFieldArr[8], Item.this.batchRunId);
                    responseWriter.writeString(responseFieldArr[9], Item.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.updatedAt);
                }
            };
        }

        public String status() {
            return this.status;
        }

        public String teamId() {
            return this.teamId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", teamId=" + this.teamId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", uploadedFileReference=" + this.uploadedFileReference + ", exportMessage=" + this.exportMessage + ", batchRunId=" + this.batchRunId + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String uploadedFileReference() {
            return this.uploadedFileReference;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelDataExportOutputExportsByUserCompositeKeyConditionInput accountIdUpdatedAt;
        private final ModelDataExportOutputFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelDataExportOutputExportsByUserCompositeKeyConditionInput modelDataExportOutputExportsByUserCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelDataExportOutputFilterInput modelDataExportOutputFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.userId = str;
            this.accountIdUpdatedAt = modelDataExportOutputExportsByUserCompositeKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelDataExportOutputFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("userId", str);
            linkedHashMap.put("accountIdUpdatedAt", modelDataExportOutputExportsByUserCompositeKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelDataExportOutputFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelDataExportOutputExportsByUserCompositeKeyConditionInput accountIdUpdatedAt() {
            return this.accountIdUpdatedAt;
        }

        public ModelDataExportOutputFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExportsByUserQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                    inputFieldWriter.writeObject("accountIdUpdatedAt", Variables.this.accountIdUpdatedAt != null ? Variables.this.accountIdUpdatedAt.marshaller() : null);
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

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetExportsByUserQuery(String str, ModelDataExportOutputExportsByUserCompositeKeyConditionInput modelDataExportOutputExportsByUserCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelDataExportOutputFilterInput modelDataExportOutputFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelDataExportOutputExportsByUserCompositeKeyConditionInput, modelSortDirection, modelDataExportOutputFilterInput, num, str2);
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
        return "37ea08af8a0c906f52a1efd45f1d7f499fb52fe5dbe26e00772860f4e2c86e5f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetExportsByUser($userId: ID, $accountIdUpdatedAt: ModelDataExportOutputExportsByUserCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDataExportOutputFilterInput, $limit: Int, $nextToken: String) {\n  GetExportsByUser(userId: $userId, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      teamId\n      entityActionDefinitionReference\n      uploadedFileReference\n      exportMessage\n      batchRunId\n      status\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
