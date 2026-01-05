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
import type.MissedOpportunityType;
import type.ModelMissedOpportunitiesFilterInput;
import type.ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes4.dex */
public final class ListMissedOpportunitiessQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListMissedOpportunitiess($accountId: ID, $ownerIdContactIdMissedOpportunityType: ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput, $filter: ModelMissedOpportunitiesFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listMissedOpportunitiess(accountId: $accountId, ownerIdContactIdMissedOpportunityType: $ownerIdContactIdMissedOpportunityType, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      primaryTeamId\n      contactId\n      messageBody\n      missedOpportunityType\n      callLaterDateTime\n      relatedEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListMissedOpportunitiess";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListMissedOpportunitiess($accountId: ID, $ownerIdContactIdMissedOpportunityType: ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput, $filter: ModelMissedOpportunitiesFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listMissedOpportunitiess(accountId: $accountId, ownerIdContactIdMissedOpportunityType: $ownerIdContactIdMissedOpportunityType, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      primaryTeamId\n      contactId\n      messageBody\n      missedOpportunityType\n      callLaterDateTime\n      relatedEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelMissedOpportunitiesFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput ownerIdContactIdMissedOpportunityType;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ListMissedOpportunitiessQuery build() {
            return new ListMissedOpportunitiessQuery(this.accountId, this.ownerIdContactIdMissedOpportunityType, this.filter, this.limit, this.nextToken, this.sortDirection);
        }

        public Builder filter(ModelMissedOpportunitiesFilterInput modelMissedOpportunitiesFilterInput) {
            this.filter = modelMissedOpportunitiesFilterInput;
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

        public Builder ownerIdContactIdMissedOpportunityType(ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput modelMissedOpportunitiesPrimaryCompositeKeyConditionInput) {
            this.ownerIdContactIdMissedOpportunityType = modelMissedOpportunitiesPrimaryCompositeKeyConditionInput;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listMissedOpportunitiess", "listMissedOpportunitiess", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("ownerIdContactIdMissedOpportunityType", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "ownerIdContactIdMissedOpportunityType").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListMissedOpportunitiess listMissedOpportunitiess;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListMissedOpportunitiess.Mapper listMissedOpportunitiessFieldMapper = new ListMissedOpportunitiess.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListMissedOpportunitiess) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListMissedOpportunitiess>() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListMissedOpportunitiess read(ResponseReader responseReader2) {
                        return Mapper.this.listMissedOpportunitiessFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListMissedOpportunitiess listMissedOpportunitiess) {
            this.listMissedOpportunitiess = listMissedOpportunitiess;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListMissedOpportunitiess listMissedOpportunitiess = this.listMissedOpportunitiess;
            ListMissedOpportunitiess listMissedOpportunitiess2 = ((Data) obj).listMissedOpportunitiess;
            return listMissedOpportunitiess == null ? listMissedOpportunitiess2 == null : listMissedOpportunitiess.equals(listMissedOpportunitiess2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListMissedOpportunitiess listMissedOpportunitiess = this.listMissedOpportunitiess;
                this.$hashCode = (listMissedOpportunitiess == null ? 0 : listMissedOpportunitiess.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListMissedOpportunitiess listMissedOpportunitiess() {
            return this.listMissedOpportunitiess;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListMissedOpportunitiess listMissedOpportunitiess = Data.this.listMissedOpportunitiess;
                    responseWriter.writeObject(responseField, listMissedOpportunitiess != null ? listMissedOpportunitiess.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listMissedOpportunitiess=" + this.listMissedOpportunitiess + "}";
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
        final String callLaterDateTime;
        final String contactId;
        final String createdAt;
        final String messageBody;
        final MissedOpportunityType missedOpportunityType;
        final String ownerId;
        final String primaryTeamId;
        final String relatedEngagementId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String string2 = responseReader.readString(responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                return new Item(string, str, str2, str3, str4, string2, string3 != null ? MissedOpportunityType.valueOf(string3) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("messageBody", "messageBody", null, true, Collections.emptyList()), ResponseField.forString("missedOpportunityType", "missedOpportunityType", null, false, Collections.emptyList()), ResponseField.forCustomType("callLaterDateTime", "callLaterDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("relatedEngagementId", "relatedEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, MissedOpportunityType missedOpportunityType, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str3, "ownerId == null");
            this.primaryTeamId = str4;
            this.contactId = (String) Utils.checkNotNull(str5, "contactId == null");
            this.messageBody = str6;
            this.missedOpportunityType = (MissedOpportunityType) Utils.checkNotNull(missedOpportunityType, "missedOpportunityType == null");
            this.callLaterDateTime = str7;
            this.relatedEngagementId = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callLaterDateTime() {
            return this.callLaterDateTime;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && this.ownerId.equals(item.ownerId) && ((str = this.primaryTeamId) != null ? str.equals(item.primaryTeamId) : item.primaryTeamId == null) && this.contactId.equals(item.contactId) && ((str2 = this.messageBody) != null ? str2.equals(item.messageBody) : item.messageBody == null) && this.missedOpportunityType.equals(item.missedOpportunityType) && ((str3 = this.callLaterDateTime) != null ? str3.equals(item.callLaterDateTime) : item.callLaterDateTime == null) && ((str4 = this.relatedEngagementId) != null ? str4.equals(item.relatedEngagementId) : item.relatedEngagementId == null) && ((str5 = this.createdAt) != null ? str5.equals(item.createdAt) : item.createdAt == null)) {
                String str6 = this.updatedAt;
                String str7 = item.updatedAt;
                if (str6 == null) {
                    if (str7 == null) {
                        return true;
                    }
                } else if (str6.equals(str7)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str = this.primaryTeamId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str2 = this.messageBody;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.missedOpportunityType.hashCode()) * 1000003;
                String str3 = this.callLaterDateTime;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.relatedEngagementId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.updatedAt;
                this.$hashCode = iHashCode6 ^ (str6 != null ? str6.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.messageBody);
                    responseWriter.writeString(responseFieldArr[6], Item.this.missedOpportunityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.callLaterDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.relatedEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedAt);
                }
            };
        }

        public String messageBody() {
            return this.messageBody;
        }

        public MissedOpportunityType missedOpportunityType() {
            return this.missedOpportunityType;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String relatedEngagementId() {
            return this.relatedEngagementId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", messageBody=" + this.messageBody + ", missedOpportunityType=" + this.missedOpportunityType + ", callLaterDateTime=" + this.callLaterDateTime + ", relatedEngagementId=" + this.relatedEngagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListMissedOpportunitiess {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, true, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListMissedOpportunitiess> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListMissedOpportunitiess map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListMissedOpportunitiess.$responseFields;
                return new ListMissedOpportunitiess(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.ListMissedOpportunitiess.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.ListMissedOpportunitiess.Mapper.1.1
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

        public ListMissedOpportunitiess(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = list;
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            List<Item> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListMissedOpportunitiess)) {
                return false;
            }
            ListMissedOpportunitiess listMissedOpportunitiess = (ListMissedOpportunitiess) obj;
            if (this.__typename.equals(listMissedOpportunitiess.__typename) && ((list = this.items) != null ? list.equals(listMissedOpportunitiess.items) : listMissedOpportunitiess.items == null)) {
                String str = this.nextToken;
                String str2 = listMissedOpportunitiess.nextToken;
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
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Item> list = this.items;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode2 ^ (str != null ? str.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.ListMissedOpportunitiess.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListMissedOpportunitiess.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListMissedOpportunitiess.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListMissedOpportunitiess.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.ListMissedOpportunitiess.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListMissedOpportunitiess.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListMissedOpportunitiess{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelMissedOpportunitiesFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput ownerIdContactIdMissedOpportunityType;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput modelMissedOpportunitiesPrimaryCompositeKeyConditionInput, ModelMissedOpportunitiesFilterInput modelMissedOpportunitiesFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.ownerIdContactIdMissedOpportunityType = modelMissedOpportunitiesPrimaryCompositeKeyConditionInput;
            this.filter = modelMissedOpportunitiesFilterInput;
            this.limit = num;
            this.nextToken = str2;
            this.sortDirection = modelSortDirection;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("ownerIdContactIdMissedOpportunityType", modelMissedOpportunitiesPrimaryCompositeKeyConditionInput);
            linkedHashMap.put("filter", modelMissedOpportunitiesFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
            linkedHashMap.put("sortDirection", modelSortDirection);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelMissedOpportunitiesFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListMissedOpportunitiessQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("ownerIdContactIdMissedOpportunityType", Variables.this.ownerIdContactIdMissedOpportunityType != null ? Variables.this.ownerIdContactIdMissedOpportunityType.marshaller() : null);
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

        public ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput ownerIdContactIdMissedOpportunityType() {
            return this.ownerIdContactIdMissedOpportunityType;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListMissedOpportunitiessQuery(String str, ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput modelMissedOpportunitiesPrimaryCompositeKeyConditionInput, ModelMissedOpportunitiesFilterInput modelMissedOpportunitiesFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
        this.variables = new Variables(str, modelMissedOpportunitiesPrimaryCompositeKeyConditionInput, modelMissedOpportunitiesFilterInput, num, str2, modelSortDirection);
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
        return "1ceed6c2cd90203b5e3cd2cf5451ae4942593bb93c4a488054f3429b0e565aac";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListMissedOpportunitiess($accountId: ID, $ownerIdContactIdMissedOpportunityType: ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput, $filter: ModelMissedOpportunitiesFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listMissedOpportunitiess(accountId: $accountId, ownerIdContactIdMissedOpportunityType: $ownerIdContactIdMissedOpportunityType, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      primaryTeamId\n      contactId\n      messageBody\n      missedOpportunityType\n      callLaterDateTime\n      relatedEngagementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
