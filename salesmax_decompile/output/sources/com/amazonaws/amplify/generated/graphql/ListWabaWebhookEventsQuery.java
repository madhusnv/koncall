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
import type.ModelWabaWebhookEventFilterInput;

/* loaded from: classes4.dex */
public final class ListWabaWebhookEventsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListWabaWebhookEvents($filter: ModelWabaWebhookEventFilterInput, $limit: Int, $nextToken: String) {\n  listWabaWebhookEvents(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      field\n      payload\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListWabaWebhookEvents";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListWabaWebhookEvents($filter: ModelWabaWebhookEventFilterInput, $limit: Int, $nextToken: String) {\n  listWabaWebhookEvents(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      field\n      payload\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaWebhookEventFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListWabaWebhookEventsQuery build() {
            return new ListWabaWebhookEventsQuery(this.filter, this.limit, this.nextToken);
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
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listWabaWebhookEvents", "listWabaWebhookEvents", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListWabaWebhookEvents listWabaWebhookEvents;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListWabaWebhookEvents.Mapper listWabaWebhookEventsFieldMapper = new ListWabaWebhookEvents.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListWabaWebhookEvents) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListWabaWebhookEvents>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListWabaWebhookEvents read(ResponseReader responseReader2) {
                        return Mapper.this.listWabaWebhookEventsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListWabaWebhookEvents listWabaWebhookEvents) {
            this.listWabaWebhookEvents = listWabaWebhookEvents;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListWabaWebhookEvents listWabaWebhookEvents = this.listWabaWebhookEvents;
            ListWabaWebhookEvents listWabaWebhookEvents2 = ((Data) obj).listWabaWebhookEvents;
            return listWabaWebhookEvents == null ? listWabaWebhookEvents2 == null : listWabaWebhookEvents.equals(listWabaWebhookEvents2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListWabaWebhookEvents listWabaWebhookEvents = this.listWabaWebhookEvents;
                this.$hashCode = (listWabaWebhookEvents == null ? 0 : listWabaWebhookEvents.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListWabaWebhookEvents listWabaWebhookEvents() {
            return this.listWabaWebhookEvents;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListWabaWebhookEvents listWabaWebhookEvents = Data.this.listWabaWebhookEvents;
                    responseWriter.writeObject(responseField, listWabaWebhookEvents != null ? listWabaWebhookEvents.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listWabaWebhookEvents=" + this.listWabaWebhookEvents + "}";
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.Item.1
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

    public static class ListWabaWebhookEvents {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListWabaWebhookEvents> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListWabaWebhookEvents map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListWabaWebhookEvents.$responseFields;
                return new ListWabaWebhookEvents(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.ListWabaWebhookEvents.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.ListWabaWebhookEvents.Mapper.1.1
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

        public ListWabaWebhookEvents(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListWabaWebhookEvents)) {
                return false;
            }
            ListWabaWebhookEvents listWabaWebhookEvents = (ListWabaWebhookEvents) obj;
            if (this.__typename.equals(listWabaWebhookEvents.__typename) && this.items.equals(listWabaWebhookEvents.items)) {
                String str = this.nextToken;
                String str2 = listWabaWebhookEvents.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.ListWabaWebhookEvents.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListWabaWebhookEvents.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListWabaWebhookEvents.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListWabaWebhookEvents.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.ListWabaWebhookEvents.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListWabaWebhookEvents.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListWabaWebhookEvents{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWabaWebhookEventFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelWabaWebhookEventFilterInput modelWabaWebhookEventFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelWabaWebhookEventFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelWabaWebhookEventFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelWabaWebhookEventFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaWebhookEventsQuery.Variables.1
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

    public ListWabaWebhookEventsQuery(ModelWabaWebhookEventFilterInput modelWabaWebhookEventFilterInput, Integer num, String str) {
        this.variables = new Variables(modelWabaWebhookEventFilterInput, num, str);
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
        return "cdf1107f9c5970a667e8427ea1870d314abb438459ed4948b2a41b8d7b45bfa5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListWabaWebhookEvents($filter: ModelWabaWebhookEventFilterInput, $limit: Int, $nextToken: String) {\n  listWabaWebhookEvents(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      wabaAccountId\n      displayPhoneNumber\n      phoneNumberId\n      field\n      payload\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
