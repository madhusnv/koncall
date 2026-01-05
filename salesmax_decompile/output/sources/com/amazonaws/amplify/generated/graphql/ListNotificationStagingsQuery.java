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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.ActivityRelatedObjectType;
import type.CustomType;
import type.ModelNotificationStagingFilterInput;

/* loaded from: classes4.dex */
public final class ListNotificationStagingsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListNotificationStagings($filter: ModelNotificationStagingFilterInput, $limit: Int, $nextToken: String) {\n  listNotificationStagings(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      notificationId\n      notificationChannel\n      notificationStatus\n      notificationType\n      notificationRelatedObjectType\n      notificationRelatedObjectId\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      content\n      createdAt\n      updatedAt\n      scheduledAt\n      expirationUnixTime\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListNotificationStagings";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListNotificationStagings($filter: ModelNotificationStagingFilterInput, $limit: Int, $nextToken: String) {\n  listNotificationStagings(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      notificationId\n      notificationChannel\n      notificationStatus\n      notificationType\n      notificationRelatedObjectType\n      notificationRelatedObjectId\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      content\n      createdAt\n      updatedAt\n      scheduledAt\n      expirationUnixTime\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelNotificationStagingFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListNotificationStagingsQuery build() {
            return new ListNotificationStagingsQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelNotificationStagingFilterInput modelNotificationStagingFilterInput) {
            this.filter = modelNotificationStagingFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listNotificationStagings", "listNotificationStagings", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListNotificationStagings listNotificationStagings;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListNotificationStagings.Mapper listNotificationStagingsFieldMapper = new ListNotificationStagings.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListNotificationStagings) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListNotificationStagings>() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListNotificationStagings read(ResponseReader responseReader2) {
                        return Mapper.this.listNotificationStagingsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListNotificationStagings listNotificationStagings) {
            this.listNotificationStagings = listNotificationStagings;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListNotificationStagings listNotificationStagings = this.listNotificationStagings;
            ListNotificationStagings listNotificationStagings2 = ((Data) obj).listNotificationStagings;
            return listNotificationStagings == null ? listNotificationStagings2 == null : listNotificationStagings.equals(listNotificationStagings2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListNotificationStagings listNotificationStagings = this.listNotificationStagings;
                this.$hashCode = (listNotificationStagings == null ? 0 : listNotificationStagings.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListNotificationStagings listNotificationStagings() {
            return this.listNotificationStagings;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListNotificationStagings listNotificationStagings = Data.this.listNotificationStagings;
                    responseWriter.writeObject(responseField, listNotificationStagings != null ? listNotificationStagings.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listNotificationStagings=" + this.listNotificationStagings + "}";
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
        final String activityDoneByUserId;
        final String contactId;
        final String content;
        final String createdAt;
        final Long expirationUnixTime;
        final String id;
        final String notificationChannel;
        final String notificationId;
        final String notificationRelatedObjectId;
        final ActivityRelatedObjectType notificationRelatedObjectType;
        final String notificationStatus;
        final String notificationType;
        final String ownerId;
        final String primaryTeamId;
        final String scheduledAt;
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
                String string2 = responseReader.readString(responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                return new Item(string, str, str2, str3, string2, string3, string4, string5 != null ? ActivityRelatedObjectType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("notificationId", "notificationId", null, true, customType, Collections.emptyList()), ResponseField.forString("notificationChannel", "notificationChannel", null, true, Collections.emptyList()), ResponseField.forString("notificationStatus", "notificationStatus", null, true, Collections.emptyList()), ResponseField.forString("notificationType", "notificationType", null, true, Collections.emptyList()), ResponseField.forString("notificationRelatedObjectType", "notificationRelatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("notificationRelatedObjectId", "notificationRelatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityDoneByUserId", "activityDoneByUserId", null, true, customType, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CONTENT, FirebaseAnalytics.Param.CONTENT, null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("scheduledAt", "scheduledAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, ActivityRelatedObjectType activityRelatedObjectType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.notificationId = str4;
            this.notificationChannel = str5;
            this.notificationStatus = str6;
            this.notificationType = str7;
            this.notificationRelatedObjectType = (ActivityRelatedObjectType) Utils.checkNotNull(activityRelatedObjectType, "notificationRelatedObjectType == null");
            this.notificationRelatedObjectId = (String) Utils.checkNotNull(str8, "notificationRelatedObjectId == null");
            this.ownerId = (String) Utils.checkNotNull(str9, "ownerId == null");
            this.primaryTeamId = str10;
            this.contactId = str11;
            this.activityDoneByUserId = str12;
            this.content = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.scheduledAt = str16;
            this.expirationUnixTime = l;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String activityDoneByUserId() {
            return this.activityDoneByUserId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String content() {
            return this.content;
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
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.notificationId) != null ? str.equals(item.notificationId) : item.notificationId == null) && ((str2 = this.notificationChannel) != null ? str2.equals(item.notificationChannel) : item.notificationChannel == null) && ((str3 = this.notificationStatus) != null ? str3.equals(item.notificationStatus) : item.notificationStatus == null) && ((str4 = this.notificationType) != null ? str4.equals(item.notificationType) : item.notificationType == null) && this.notificationRelatedObjectType.equals(item.notificationRelatedObjectType) && this.notificationRelatedObjectId.equals(item.notificationRelatedObjectId) && this.ownerId.equals(item.ownerId) && ((str5 = this.primaryTeamId) != null ? str5.equals(item.primaryTeamId) : item.primaryTeamId == null) && ((str6 = this.contactId) != null ? str6.equals(item.contactId) : item.contactId == null) && ((str7 = this.activityDoneByUserId) != null ? str7.equals(item.activityDoneByUserId) : item.activityDoneByUserId == null) && ((str8 = this.content) != null ? str8.equals(item.content) : item.content == null) && ((str9 = this.createdAt) != null ? str9.equals(item.createdAt) : item.createdAt == null) && ((str10 = this.updatedAt) != null ? str10.equals(item.updatedAt) : item.updatedAt == null) && ((str11 = this.scheduledAt) != null ? str11.equals(item.scheduledAt) : item.scheduledAt == null)) {
                Long l = this.expirationUnixTime;
                Long l2 = item.expirationUnixTime;
                if (l == null) {
                    if (l2 == null) {
                        return true;
                    }
                } else if (l.equals(l2)) {
                    return true;
                }
            }
            return false;
        }

        public Long expirationUnixTime() {
            return this.expirationUnixTime;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.notificationId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.notificationChannel;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.notificationStatus;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.notificationType;
                int iHashCode5 = (((((((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.notificationRelatedObjectType.hashCode()) * 1000003) ^ this.notificationRelatedObjectId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str5 = this.primaryTeamId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.contactId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.activityDoneByUserId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.content;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.scheduledAt;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Long l = this.expirationUnixTime;
                this.$hashCode = iHashCode12 ^ (l != null ? l.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.notificationId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.notificationChannel);
                    responseWriter.writeString(responseFieldArr[5], Item.this.notificationStatus);
                    responseWriter.writeString(responseFieldArr[6], Item.this.notificationType);
                    responseWriter.writeString(responseFieldArr[7], Item.this.notificationRelatedObjectType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.notificationRelatedObjectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.activityDoneByUserId);
                    responseWriter.writeString(responseFieldArr[13], Item.this.content);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.scheduledAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.expirationUnixTime);
                }
            };
        }

        public String notificationChannel() {
            return this.notificationChannel;
        }

        public String notificationId() {
            return this.notificationId;
        }

        public String notificationRelatedObjectId() {
            return this.notificationRelatedObjectId;
        }

        public ActivityRelatedObjectType notificationRelatedObjectType() {
            return this.notificationRelatedObjectType;
        }

        public String notificationStatus() {
            return this.notificationStatus;
        }

        public String notificationType() {
            return this.notificationType;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String scheduledAt() {
            return this.scheduledAt;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", notificationId=" + this.notificationId + ", notificationChannel=" + this.notificationChannel + ", notificationStatus=" + this.notificationStatus + ", notificationType=" + this.notificationType + ", notificationRelatedObjectType=" + this.notificationRelatedObjectType + ", notificationRelatedObjectId=" + this.notificationRelatedObjectId + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", content=" + this.content + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", scheduledAt=" + this.scheduledAt + ", expirationUnixTime=" + this.expirationUnixTime + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListNotificationStagings {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListNotificationStagings> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListNotificationStagings map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListNotificationStagings.$responseFields;
                return new ListNotificationStagings(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.ListNotificationStagings.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.ListNotificationStagings.Mapper.1.1
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

        public ListNotificationStagings(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListNotificationStagings)) {
                return false;
            }
            ListNotificationStagings listNotificationStagings = (ListNotificationStagings) obj;
            if (this.__typename.equals(listNotificationStagings.__typename) && this.items.equals(listNotificationStagings.items)) {
                String str = this.nextToken;
                String str2 = listNotificationStagings.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.ListNotificationStagings.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListNotificationStagings.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListNotificationStagings.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListNotificationStagings.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.ListNotificationStagings.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListNotificationStagings.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListNotificationStagings{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelNotificationStagingFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelNotificationStagingFilterInput modelNotificationStagingFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelNotificationStagingFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelNotificationStagingFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelNotificationStagingFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListNotificationStagingsQuery.Variables.1
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

    public ListNotificationStagingsQuery(ModelNotificationStagingFilterInput modelNotificationStagingFilterInput, Integer num, String str) {
        this.variables = new Variables(modelNotificationStagingFilterInput, num, str);
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
        return "6d82b2aa168df7e0dc27c43f2cb43bb38c5fb67e0c784e3f92284f15b55b8413";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListNotificationStagings($filter: ModelNotificationStagingFilterInput, $limit: Int, $nextToken: String) {\n  listNotificationStagings(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      notificationId\n      notificationChannel\n      notificationStatus\n      notificationType\n      notificationRelatedObjectType\n      notificationRelatedObjectId\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      content\n      createdAt\n      updatedAt\n      scheduledAt\n      expirationUnixTime\n    }\n    nextToken\n  }\n}";
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
