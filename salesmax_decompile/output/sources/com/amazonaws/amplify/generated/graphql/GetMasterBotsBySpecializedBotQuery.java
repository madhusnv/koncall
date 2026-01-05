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
import type.ModelMasterBotSpecializedBotFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetMasterBotsBySpecializedBotQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetMasterBotsBySpecializedBot($specializedBotId: ID, $masterBotId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMasterBotSpecializedBotFilterInput, $limit: Int, $nextToken: String) {\n  getMasterBotsBySpecializedBot(specializedBotId: $specializedBotId, masterBotId: $masterBotId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      masterBotId\n      specializedBotId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetMasterBotsBySpecializedBot";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetMasterBotsBySpecializedBot($specializedBotId: ID, $masterBotId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMasterBotSpecializedBotFilterInput, $limit: Int, $nextToken: String) {\n  getMasterBotsBySpecializedBot(specializedBotId: $specializedBotId, masterBotId: $masterBotId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      masterBotId\n      specializedBotId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelMasterBotSpecializedBotFilterInput filter;
        private Integer limit;
        private ModelIDKeyConditionInput masterBotId;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private String specializedBotId;

        public GetMasterBotsBySpecializedBotQuery build() {
            return new GetMasterBotsBySpecializedBotQuery(this.specializedBotId, this.masterBotId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelMasterBotSpecializedBotFilterInput modelMasterBotSpecializedBotFilterInput) {
            this.filter = modelMasterBotSpecializedBotFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder masterBotId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.masterBotId = modelIDKeyConditionInput;
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

        public Builder specializedBotId(String str) {
            this.specializedBotId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getMasterBotsBySpecializedBot", "getMasterBotsBySpecializedBot", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("specializedBotId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "specializedBotId").build()).put("masterBotId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "masterBotId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetMasterBotsBySpecializedBot.Mapper getMasterBotsBySpecializedBotFieldMapper = new GetMasterBotsBySpecializedBot.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetMasterBotsBySpecializedBot) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetMasterBotsBySpecializedBot>() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetMasterBotsBySpecializedBot read(ResponseReader responseReader2) {
                        return Mapper.this.getMasterBotsBySpecializedBotFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot) {
            this.getMasterBotsBySpecializedBot = getMasterBotsBySpecializedBot;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot = this.getMasterBotsBySpecializedBot;
            GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot2 = ((Data) obj).getMasterBotsBySpecializedBot;
            return getMasterBotsBySpecializedBot == null ? getMasterBotsBySpecializedBot2 == null : getMasterBotsBySpecializedBot.equals(getMasterBotsBySpecializedBot2);
        }

        public GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot() {
            return this.getMasterBotsBySpecializedBot;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot = this.getMasterBotsBySpecializedBot;
                this.$hashCode = (getMasterBotsBySpecializedBot == null ? 0 : getMasterBotsBySpecializedBot.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot = Data.this.getMasterBotsBySpecializedBot;
                    responseWriter.writeObject(responseField, getMasterBotsBySpecializedBot != null ? getMasterBotsBySpecializedBot.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getMasterBotsBySpecializedBot=" + this.getMasterBotsBySpecializedBot + "}";
            }
            return this.$toString;
        }
    }

    public static class GetMasterBotsBySpecializedBot {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetMasterBotsBySpecializedBot> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetMasterBotsBySpecializedBot map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetMasterBotsBySpecializedBot.$responseFields;
                return new GetMasterBotsBySpecializedBot(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.GetMasterBotsBySpecializedBot.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.GetMasterBotsBySpecializedBot.Mapper.1.1
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

        public GetMasterBotsBySpecializedBot(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetMasterBotsBySpecializedBot)) {
                return false;
            }
            GetMasterBotsBySpecializedBot getMasterBotsBySpecializedBot = (GetMasterBotsBySpecializedBot) obj;
            if (this.__typename.equals(getMasterBotsBySpecializedBot.__typename) && this.items.equals(getMasterBotsBySpecializedBot.items)) {
                String str = this.nextToken;
                String str2 = getMasterBotsBySpecializedBot.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.GetMasterBotsBySpecializedBot.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetMasterBotsBySpecializedBot.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetMasterBotsBySpecializedBot.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetMasterBotsBySpecializedBot.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.GetMasterBotsBySpecializedBot.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetMasterBotsBySpecializedBot.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetMasterBotsBySpecializedBot{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String createdAt;
        final String id;
        final String masterBotId;
        final String specializedBotId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("masterBotId", "masterBotId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("specializedBotId", "specializedBotId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.masterBotId = (String) Utils.checkNotNull(str3, "masterBotId == null");
            this.specializedBotId = (String) Utils.checkNotNull(str4, "specializedBotId == null");
            this.createdAt = (String) Utils.checkNotNull(str5, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str6, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.masterBotId.equals(item.masterBotId) && this.specializedBotId.equals(item.specializedBotId) && this.createdAt.equals(item.createdAt) && this.updatedAt.equals(item.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = ((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.masterBotId.hashCode()) * 1000003) ^ this.specializedBotId.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.masterBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.specializedBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.updatedAt);
                }
            };
        }

        public String masterBotId() {
            return this.masterBotId;
        }

        public String specializedBotId() {
            return this.specializedBotId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", masterBotId=" + this.masterBotId + ", specializedBotId=" + this.specializedBotId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelMasterBotSpecializedBotFilterInput filter;
        private final Integer limit;
        private final ModelIDKeyConditionInput masterBotId;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final String specializedBotId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelMasterBotSpecializedBotFilterInput modelMasterBotSpecializedBotFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.specializedBotId = str;
            this.masterBotId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelMasterBotSpecializedBotFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("specializedBotId", str);
            linkedHashMap.put("masterBotId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelMasterBotSpecializedBotFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelMasterBotSpecializedBotFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMasterBotsBySpecializedBotQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("specializedBotId", Variables.this.specializedBotId);
                    inputFieldWriter.writeObject("masterBotId", Variables.this.masterBotId != null ? Variables.this.masterBotId.marshaller() : null);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public ModelIDKeyConditionInput masterBotId() {
            return this.masterBotId;
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        public String specializedBotId() {
            return this.specializedBotId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetMasterBotsBySpecializedBotQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelMasterBotSpecializedBotFilterInput modelMasterBotSpecializedBotFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelMasterBotSpecializedBotFilterInput, num, str2);
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
        return "55a9c7030282aa2ff33401ebc9cfa984eee2c38069a69dd9645804b101bce194";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetMasterBotsBySpecializedBot($specializedBotId: ID, $masterBotId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMasterBotSpecializedBotFilterInput, $limit: Int, $nextToken: String) {\n  getMasterBotsBySpecializedBot(specializedBotId: $specializedBotId, masterBotId: $masterBotId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      masterBotId\n      specializedBotId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
