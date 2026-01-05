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
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;
import type.ModelWabaWebhookEventFilterInput;

/* loaded from: classes7.dex */
public final class GetEventsByAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetEventsByAccount($accountId: ID, $createdAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelWabaWebhookEventFilterInput, $limit: Int, $nextToken: String) {\n  getEventsByAccount(accountId: $accountId, createdAt: $createdAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      field\n      payload\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetEventsByAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetEventsByAccount($accountId: ID, $createdAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelWabaWebhookEventFilterInput, $limit: Int, $nextToken: String) {\n  getEventsByAccount(accountId: $accountId, createdAt: $createdAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      field\n      payload\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelStringKeyConditionInput createdAt;
        private ModelWabaWebhookEventFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetEventsByAccountQuery build() {
            return new GetEventsByAccountQuery(this.accountId, this.createdAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder createdAt(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.createdAt = modelStringKeyConditionInput;
            return this;
        }

        public Builder filter(ModelWabaWebhookEventFilterInput modelWabaWebhookEventFilterInput) {
            this.filter = modelWabaWebhookEventFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getEventsByAccount", "getEventsByAccount", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("createdAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "createdAt").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetEventsByAccount getEventsByAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetEventsByAccount.Mapper getEventsByAccountFieldMapper = new GetEventsByAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetEventsByAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetEventsByAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetEventsByAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getEventsByAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetEventsByAccount getEventsByAccount) {
            this.getEventsByAccount = getEventsByAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetEventsByAccount getEventsByAccount = this.getEventsByAccount;
            GetEventsByAccount getEventsByAccount2 = ((Data) obj).getEventsByAccount;
            return getEventsByAccount == null ? getEventsByAccount2 == null : getEventsByAccount.equals(getEventsByAccount2);
        }

        public GetEventsByAccount getEventsByAccount() {
            return this.getEventsByAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetEventsByAccount getEventsByAccount = this.getEventsByAccount;
                this.$hashCode = (getEventsByAccount == null ? 0 : getEventsByAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetEventsByAccount getEventsByAccount = Data.this.getEventsByAccount;
                    responseWriter.writeObject(responseField, getEventsByAccount != null ? getEventsByAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getEventsByAccount=" + this.getEventsByAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetEventsByAccount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetEventsByAccount> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetEventsByAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetEventsByAccount.$responseFields;
                return new GetEventsByAccount(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.GetEventsByAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.GetEventsByAccount.Mapper.1.1
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

        public GetEventsByAccount(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetEventsByAccount)) {
                return false;
            }
            GetEventsByAccount getEventsByAccount = (GetEventsByAccount) obj;
            if (this.__typename.equals(getEventsByAccount.__typename) && this.items.equals(getEventsByAccount.items)) {
                String str = this.nextToken;
                String str2 = getEventsByAccount.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.GetEventsByAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetEventsByAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetEventsByAccount.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetEventsByAccount.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.GetEventsByAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetEventsByAccount.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetEventsByAccount{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String displayPhoneNumber;
        final String field;
        final String id;
        final String payload;
        final String phoneNumberId;
        final String updatedAt;
        final String wabaAccountId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("displayPhoneNumber", "displayPhoneNumber", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forString("field", "field", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = str3;
            this.wabaAccountId = str4;
            this.displayPhoneNumber = str5;
            this.phoneNumberId = str6;
            this.field = str7;
            this.payload = str8;
            this.createdAt = str9;
            this.updatedAt = (String) Utils.checkNotNull(str10, "updatedAt == null");
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

        public String displayPhoneNumber() {
            return this.displayPhoneNumber;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.accountId) != null ? str.equals(item.accountId) : item.accountId == null) && ((str2 = this.wabaAccountId) != null ? str2.equals(item.wabaAccountId) : item.wabaAccountId == null) && ((str3 = this.displayPhoneNumber) != null ? str3.equals(item.displayPhoneNumber) : item.displayPhoneNumber == null) && ((str4 = this.phoneNumberId) != null ? str4.equals(item.phoneNumberId) : item.phoneNumberId == null) && ((str5 = this.field) != null ? str5.equals(item.field) : item.field == null) && ((str6 = this.payload) != null ? str6.equals(item.payload) : item.payload == null) && ((str7 = this.createdAt) != null ? str7.equals(item.createdAt) : item.createdAt == null) && this.updatedAt.equals(item.updatedAt);
        }

        public String field() {
            return this.field;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.accountId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wabaAccountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.displayPhoneNumber;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.phoneNumberId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.field;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.payload;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                this.$hashCode = ((iHashCode7 ^ (str7 != null ? str7.hashCode() : 0)) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.displayPhoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.field);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.payload);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
                }
            };
        }

        public String payload() {
            return this.payload;
        }

        public String phoneNumberId() {
            return this.phoneNumberId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaAccountId=" + this.wabaAccountId + ", displayPhoneNumber=" + this.displayPhoneNumber + ", phoneNumberId=" + this.phoneNumberId + ", field=" + this.field + ", payload=" + this.payload + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String wabaAccountId() {
            return this.wabaAccountId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelStringKeyConditionInput createdAt;
        private final ModelWabaWebhookEventFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelWabaWebhookEventFilterInput modelWabaWebhookEventFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.createdAt = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelWabaWebhookEventFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("createdAt", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelWabaWebhookEventFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelStringKeyConditionInput createdAt() {
            return this.createdAt;
        }

        public ModelWabaWebhookEventFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventsByAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("createdAt", Variables.this.createdAt != null ? Variables.this.createdAt.marshaller() : null);
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

    public GetEventsByAccountQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelWabaWebhookEventFilterInput modelWabaWebhookEventFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelWabaWebhookEventFilterInput, num, str2);
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
        return "f4348bfaa218bacabb0cf277051683544ff2616d6eb948e38aeda59e98cadf41";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetEventsByAccount($accountId: ID, $createdAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelWabaWebhookEventFilterInput, $limit: Int, $nextToken: String) {\n  getEventsByAccount(accountId: $accountId, createdAt: $createdAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      field\n      payload\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
