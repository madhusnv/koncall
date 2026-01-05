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
import type.Announcement;
import type.C19174xad02eae7;
import type.CustomType;
import type.ModelMentionUserMembershipFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetAnnouncementsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetAnnouncements($isAnnouncement: Announcement, $accountIdUpdatedAt: ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMentionUserMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getAnnouncements(isAnnouncement: $isAnnouncement, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      commentId\n      mentionedUserId\n      isAnnouncement\n      commentedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetAnnouncements";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetAnnouncements($isAnnouncement: Announcement, $accountIdUpdatedAt: ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMentionUserMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getAnnouncements(isAnnouncement: $isAnnouncement, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      commentId\n      mentionedUserId\n      isAnnouncement\n      commentedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private C19174xad02eae7 accountIdUpdatedAt;
        private ModelMentionUserMembershipFilterInput filter;
        private Announcement isAnnouncement;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountIdUpdatedAt(C19174xad02eae7 c19174xad02eae7) {
            this.accountIdUpdatedAt = c19174xad02eae7;
            return this;
        }

        public GetAnnouncementsQuery build() {
            return new GetAnnouncementsQuery(this.isAnnouncement, this.accountIdUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelMentionUserMembershipFilterInput modelMentionUserMembershipFilterInput) {
            this.filter = modelMentionUserMembershipFilterInput;
            return this;
        }

        public Builder isAnnouncement(Announcement announcement) {
            this.isAnnouncement = announcement;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getAnnouncements", "getAnnouncements", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountIdUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountIdUpdatedAt").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("isAnnouncement", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "isAnnouncement").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetAnnouncements getAnnouncements;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetAnnouncements.Mapper getAnnouncementsFieldMapper = new GetAnnouncements.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetAnnouncements) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetAnnouncements>() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetAnnouncements read(ResponseReader responseReader2) {
                        return Mapper.this.getAnnouncementsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetAnnouncements getAnnouncements) {
            this.getAnnouncements = getAnnouncements;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetAnnouncements getAnnouncements = this.getAnnouncements;
            GetAnnouncements getAnnouncements2 = ((Data) obj).getAnnouncements;
            return getAnnouncements == null ? getAnnouncements2 == null : getAnnouncements.equals(getAnnouncements2);
        }

        public GetAnnouncements getAnnouncements() {
            return this.getAnnouncements;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetAnnouncements getAnnouncements = this.getAnnouncements;
                this.$hashCode = (getAnnouncements == null ? 0 : getAnnouncements.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetAnnouncements getAnnouncements = Data.this.getAnnouncements;
                    responseWriter.writeObject(responseField, getAnnouncements != null ? getAnnouncements.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getAnnouncements=" + this.getAnnouncements + "}";
            }
            return this.$toString;
        }
    }

    public static class GetAnnouncements {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetAnnouncements> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetAnnouncements map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetAnnouncements.$responseFields;
                return new GetAnnouncements(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.GetAnnouncements.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.GetAnnouncements.Mapper.1.1
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

        public GetAnnouncements(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetAnnouncements)) {
                return false;
            }
            GetAnnouncements getAnnouncements = (GetAnnouncements) obj;
            if (this.__typename.equals(getAnnouncements.__typename) && this.items.equals(getAnnouncements.items)) {
                String str = this.nextToken;
                String str2 = getAnnouncements.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.GetAnnouncements.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetAnnouncements.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetAnnouncements.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetAnnouncements.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.GetAnnouncements.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetAnnouncements.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetAnnouncements{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String commentId;
        final String commentedById;
        final String createdAt;
        final String id;
        final Announcement isAnnouncement;
        final String mentionedUserId;
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
                return new Item(string, str, str2, str3, str4, string2 != null ? Announcement.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("commentId", "commentId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("mentionedUserId", "mentionedUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("isAnnouncement", "isAnnouncement", null, true, Collections.emptyList()), ResponseField.forCustomType("commentedById", "commentedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, Announcement announcement, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.commentId = (String) Utils.checkNotNull(str4, "commentId == null");
            this.mentionedUserId = str5;
            this.isAnnouncement = announcement;
            this.commentedById = (String) Utils.checkNotNull(str6, "commentedById == null");
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String commentId() {
            return this.commentId;
        }

        public String commentedById() {
            return this.commentedById;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            Announcement announcement;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.commentId.equals(item.commentId) && ((str = this.mentionedUserId) != null ? str.equals(item.mentionedUserId) : item.mentionedUserId == null) && ((announcement = this.isAnnouncement) != null ? announcement.equals(item.isAnnouncement) : item.isAnnouncement == null) && this.commentedById.equals(item.commentedById) && ((str2 = this.createdAt) != null ? str2.equals(item.createdAt) : item.createdAt == null)) {
                String str3 = this.updatedAt;
                String str4 = item.updatedAt;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.commentId.hashCode()) * 1000003;
                String str = this.mentionedUserId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Announcement announcement = this.isAnnouncement;
                int iHashCode3 = (((iHashCode2 ^ (announcement == null ? 0 : announcement.hashCode())) * 1000003) ^ this.commentedById.hashCode()) * 1000003;
                String str2 = this.createdAt;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                this.$hashCode = iHashCode4 ^ (str3 != null ? str3.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Announcement isAnnouncement() {
            return this.isAnnouncement;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.commentId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.mentionedUserId);
                    ResponseField responseField = responseFieldArr[5];
                    Announcement announcement = Item.this.isAnnouncement;
                    responseWriter.writeString(responseField, announcement != null ? announcement.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.commentedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedAt);
                }
            };
        }

        public String mentionedUserId() {
            return this.mentionedUserId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", commentId=" + this.commentId + ", mentionedUserId=" + this.mentionedUserId + ", isAnnouncement=" + this.isAnnouncement + ", commentedById=" + this.commentedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final C19174xad02eae7 accountIdUpdatedAt;
        private final ModelMentionUserMembershipFilterInput filter;
        private final Announcement isAnnouncement;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(Announcement announcement, C19174xad02eae7 c19174xad02eae7, ModelSortDirection modelSortDirection, ModelMentionUserMembershipFilterInput modelMentionUserMembershipFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.isAnnouncement = announcement;
            this.accountIdUpdatedAt = c19174xad02eae7;
            this.sortDirection = modelSortDirection;
            this.filter = modelMentionUserMembershipFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("isAnnouncement", announcement);
            linkedHashMap.put("accountIdUpdatedAt", c19174xad02eae7);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelMentionUserMembershipFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public C19174xad02eae7 accountIdUpdatedAt() {
            return this.accountIdUpdatedAt;
        }

        public ModelMentionUserMembershipFilterInput filter() {
            return this.filter;
        }

        public Announcement isAnnouncement() {
            return this.isAnnouncement;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAnnouncementsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("isAnnouncement", Variables.this.isAnnouncement != null ? Variables.this.isAnnouncement.name() : null);
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

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetAnnouncementsQuery(Announcement announcement, C19174xad02eae7 c19174xad02eae7, ModelSortDirection modelSortDirection, ModelMentionUserMembershipFilterInput modelMentionUserMembershipFilterInput, Integer num, String str) {
        this.variables = new Variables(announcement, c19174xad02eae7, modelSortDirection, modelMentionUserMembershipFilterInput, num, str);
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
        return "ecafc41040c7a2e18ae4bee8a1e7578ace5dcc73dd05acaa6cc3cc926689ef8d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetAnnouncements($isAnnouncement: Announcement, $accountIdUpdatedAt: ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMentionUserMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getAnnouncements(isAnnouncement: $isAnnouncement, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      commentId\n      mentionedUserId\n      isAnnouncement\n      commentedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
