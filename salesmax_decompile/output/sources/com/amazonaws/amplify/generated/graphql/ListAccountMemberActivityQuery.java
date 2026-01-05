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
import type.ActivityType;
import type.CustomType;
import type.ModelAccountMemberActivityFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes8.dex */
public final class ListAccountMemberActivityQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListAccountMemberActivity($accountId: ID, $userId: ModelIDKeyConditionInput, $filter: ModelAccountMemberActivityFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listAccountMemberActivity(accountId: $accountId, userId: $userId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      userId\n      lastActivityId\n      lastViewedNotifications\n      lastViewedCommentMentions\n      lastViewedRecentTasks\n      lastViewedRecentActivities\n      lastViewedMissedActions\n      lastViewedPendingAssignments\n      lastViewedCommentAndMentions\n      lastActivityTime\n      lastActivityType\n      lastActivityBody\n      lastCallLogged\n      lastNoteAdded\n      lastCommentAdded\n      lastTaskCompleted\n      lastTaskCreated\n      lastVisitLogged\n      lastContactAdded\n      lastEmailSent\n      lastWhatsappSent\n      lastSmsSent\n      lastKnownLocation\n      lastKnownLocationTime\n      inCall\n      inCallWithContactId\n      inCallWithContactName\n      inCallWithContactNumber\n      inCallRequestedAt\n      lastInCallUpdatedAt\n      callPlacementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListAccountMemberActivity";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListAccountMemberActivity($accountId: ID, $userId: ModelIDKeyConditionInput, $filter: ModelAccountMemberActivityFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listAccountMemberActivity(accountId: $accountId, userId: $userId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      userId\n      lastActivityId\n      lastViewedNotifications\n      lastViewedCommentMentions\n      lastViewedRecentTasks\n      lastViewedRecentActivities\n      lastViewedMissedActions\n      lastViewedPendingAssignments\n      lastViewedCommentAndMentions\n      lastActivityTime\n      lastActivityType\n      lastActivityBody\n      lastCallLogged\n      lastNoteAdded\n      lastCommentAdded\n      lastTaskCompleted\n      lastTaskCreated\n      lastVisitLogged\n      lastContactAdded\n      lastEmailSent\n      lastWhatsappSent\n      lastSmsSent\n      lastKnownLocation\n      lastKnownLocationTime\n      inCall\n      inCallWithContactId\n      inCallWithContactName\n      inCallWithContactNumber\n      inCallRequestedAt\n      lastInCallUpdatedAt\n      callPlacementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelAccountMemberActivityFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelIDKeyConditionInput userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ListAccountMemberActivityQuery build() {
            return new ListAccountMemberActivityQuery(this.accountId, this.userId, this.filter, this.limit, this.nextToken, this.sortDirection);
        }

        public Builder filter(ModelAccountMemberActivityFilterInput modelAccountMemberActivityFilterInput) {
            this.filter = modelAccountMemberActivityFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listAccountMemberActivity", "listAccountMemberActivity", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListAccountMemberActivity listAccountMemberActivity;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListAccountMemberActivity.Mapper listAccountMemberActivityFieldMapper = new ListAccountMemberActivity.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListAccountMemberActivity) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListAccountMemberActivity>() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListAccountMemberActivity read(ResponseReader responseReader2) {
                        return Mapper.this.listAccountMemberActivityFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListAccountMemberActivity listAccountMemberActivity) {
            this.listAccountMemberActivity = listAccountMemberActivity;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListAccountMemberActivity listAccountMemberActivity = this.listAccountMemberActivity;
            ListAccountMemberActivity listAccountMemberActivity2 = ((Data) obj).listAccountMemberActivity;
            return listAccountMemberActivity == null ? listAccountMemberActivity2 == null : listAccountMemberActivity.equals(listAccountMemberActivity2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListAccountMemberActivity listAccountMemberActivity = this.listAccountMemberActivity;
                this.$hashCode = (listAccountMemberActivity == null ? 0 : listAccountMemberActivity.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListAccountMemberActivity listAccountMemberActivity() {
            return this.listAccountMemberActivity;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListAccountMemberActivity listAccountMemberActivity = Data.this.listAccountMemberActivity;
                    responseWriter.writeObject(responseField, listAccountMemberActivity != null ? listAccountMemberActivity.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listAccountMemberActivity=" + this.listAccountMemberActivity + "}";
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
        final String callPlacementId;
        final String createdAt;
        final String inCall;
        final String inCallRequestedAt;
        final String inCallWithContactId;
        final String inCallWithContactName;
        final String inCallWithContactNumber;
        final String lastActivityBody;
        final String lastActivityId;
        final String lastActivityTime;
        final ActivityType lastActivityType;
        final String lastCallLogged;
        final String lastCommentAdded;
        final String lastContactAdded;
        final String lastEmailSent;
        final String lastInCallUpdatedAt;
        final String lastKnownLocation;
        final String lastKnownLocationTime;
        final String lastNoteAdded;
        final String lastSmsSent;
        final String lastTaskCompleted;
        final String lastTaskCreated;
        final String lastViewedCommentAndMentions;
        final String lastViewedCommentMentions;
        final String lastViewedMissedActions;
        final String lastViewedNotifications;
        final String lastViewedPendingAssignments;
        final String lastViewedRecentActivities;
        final String lastViewedRecentTasks;
        final String lastVisitLogged;
        final String lastWhatsappSent;
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
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str10 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str11 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String string2 = responseReader.readString(responseFieldArr[12]);
                return new Item(string, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, string2 != null ? ActivityType.valueOf(string2) : null, responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("lastActivityId", "lastActivityId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastViewedNotifications", "lastViewedNotifications", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedCommentMentions", "lastViewedCommentMentions", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedRecentTasks", "lastViewedRecentTasks", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedRecentActivities", "lastViewedRecentActivities", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedMissedActions", "lastViewedMissedActions", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedPendingAssignments", "lastViewedPendingAssignments", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedCommentAndMentions", "lastViewedCommentAndMentions", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastActivityTime", "lastActivityTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastActivityType", "lastActivityType", null, true, Collections.emptyList()), ResponseField.forString("lastActivityBody", "lastActivityBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallLogged", "lastCallLogged", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteAdded", "lastNoteAdded", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastCommentAdded", "lastCommentAdded", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskCompleted", "lastTaskCompleted", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskCreated", "lastTaskCreated", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastVisitLogged", "lastVisitLogged", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastContactAdded", "lastContactAdded", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailSent", "lastEmailSent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappSent", "lastWhatsappSent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsSent", "lastSmsSent", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastKnownLocation", "lastKnownLocation", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownLocationTime", "lastKnownLocationTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("inCall", "inCall", null, true, Collections.emptyList()), ResponseField.forCustomType("inCallWithContactId", "inCallWithContactId", null, true, customType, Collections.emptyList()), ResponseField.forString("inCallWithContactName", "inCallWithContactName", null, true, Collections.emptyList()), ResponseField.forString("inCallWithContactNumber", "inCallWithContactNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("inCallRequestedAt", "inCallRequestedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastInCallUpdatedAt", "lastInCallUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("callPlacementId", "callPlacementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ActivityType activityType, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str3, "userId == null");
            this.lastActivityId = str4;
            this.lastViewedNotifications = str5;
            this.lastViewedCommentMentions = str6;
            this.lastViewedRecentTasks = str7;
            this.lastViewedRecentActivities = str8;
            this.lastViewedMissedActions = str9;
            this.lastViewedPendingAssignments = str10;
            this.lastViewedCommentAndMentions = str11;
            this.lastActivityTime = str12;
            this.lastActivityType = activityType;
            this.lastActivityBody = str13;
            this.lastCallLogged = str14;
            this.lastNoteAdded = str15;
            this.lastCommentAdded = str16;
            this.lastTaskCompleted = str17;
            this.lastTaskCreated = str18;
            this.lastVisitLogged = str19;
            this.lastContactAdded = str20;
            this.lastEmailSent = str21;
            this.lastWhatsappSent = str22;
            this.lastSmsSent = str23;
            this.lastKnownLocation = str24;
            this.lastKnownLocationTime = str25;
            this.inCall = str26;
            this.inCallWithContactId = str27;
            this.inCallWithContactName = str28;
            this.inCallWithContactNumber = str29;
            this.inCallRequestedAt = str30;
            this.lastInCallUpdatedAt = str31;
            this.callPlacementId = str32;
            this.createdAt = str33;
            this.updatedAt = str34;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callPlacementId() {
            return this.callPlacementId;
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
            ActivityType activityType;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && this.userId.equals(item.userId) && ((str = this.lastActivityId) != null ? str.equals(item.lastActivityId) : item.lastActivityId == null) && ((str2 = this.lastViewedNotifications) != null ? str2.equals(item.lastViewedNotifications) : item.lastViewedNotifications == null) && ((str3 = this.lastViewedCommentMentions) != null ? str3.equals(item.lastViewedCommentMentions) : item.lastViewedCommentMentions == null) && ((str4 = this.lastViewedRecentTasks) != null ? str4.equals(item.lastViewedRecentTasks) : item.lastViewedRecentTasks == null) && ((str5 = this.lastViewedRecentActivities) != null ? str5.equals(item.lastViewedRecentActivities) : item.lastViewedRecentActivities == null) && ((str6 = this.lastViewedMissedActions) != null ? str6.equals(item.lastViewedMissedActions) : item.lastViewedMissedActions == null) && ((str7 = this.lastViewedPendingAssignments) != null ? str7.equals(item.lastViewedPendingAssignments) : item.lastViewedPendingAssignments == null) && ((str8 = this.lastViewedCommentAndMentions) != null ? str8.equals(item.lastViewedCommentAndMentions) : item.lastViewedCommentAndMentions == null) && ((str9 = this.lastActivityTime) != null ? str9.equals(item.lastActivityTime) : item.lastActivityTime == null) && ((activityType = this.lastActivityType) != null ? activityType.equals(item.lastActivityType) : item.lastActivityType == null) && ((str10 = this.lastActivityBody) != null ? str10.equals(item.lastActivityBody) : item.lastActivityBody == null) && ((str11 = this.lastCallLogged) != null ? str11.equals(item.lastCallLogged) : item.lastCallLogged == null) && ((str12 = this.lastNoteAdded) != null ? str12.equals(item.lastNoteAdded) : item.lastNoteAdded == null) && ((str13 = this.lastCommentAdded) != null ? str13.equals(item.lastCommentAdded) : item.lastCommentAdded == null) && ((str14 = this.lastTaskCompleted) != null ? str14.equals(item.lastTaskCompleted) : item.lastTaskCompleted == null) && ((str15 = this.lastTaskCreated) != null ? str15.equals(item.lastTaskCreated) : item.lastTaskCreated == null) && ((str16 = this.lastVisitLogged) != null ? str16.equals(item.lastVisitLogged) : item.lastVisitLogged == null) && ((str17 = this.lastContactAdded) != null ? str17.equals(item.lastContactAdded) : item.lastContactAdded == null) && ((str18 = this.lastEmailSent) != null ? str18.equals(item.lastEmailSent) : item.lastEmailSent == null) && ((str19 = this.lastWhatsappSent) != null ? str19.equals(item.lastWhatsappSent) : item.lastWhatsappSent == null) && ((str20 = this.lastSmsSent) != null ? str20.equals(item.lastSmsSent) : item.lastSmsSent == null) && ((str21 = this.lastKnownLocation) != null ? str21.equals(item.lastKnownLocation) : item.lastKnownLocation == null) && ((str22 = this.lastKnownLocationTime) != null ? str22.equals(item.lastKnownLocationTime) : item.lastKnownLocationTime == null) && ((str23 = this.inCall) != null ? str23.equals(item.inCall) : item.inCall == null) && ((str24 = this.inCallWithContactId) != null ? str24.equals(item.inCallWithContactId) : item.inCallWithContactId == null) && ((str25 = this.inCallWithContactName) != null ? str25.equals(item.inCallWithContactName) : item.inCallWithContactName == null) && ((str26 = this.inCallWithContactNumber) != null ? str26.equals(item.inCallWithContactNumber) : item.inCallWithContactNumber == null) && ((str27 = this.inCallRequestedAt) != null ? str27.equals(item.inCallRequestedAt) : item.inCallRequestedAt == null) && ((str28 = this.lastInCallUpdatedAt) != null ? str28.equals(item.lastInCallUpdatedAt) : item.lastInCallUpdatedAt == null) && ((str29 = this.callPlacementId) != null ? str29.equals(item.callPlacementId) : item.callPlacementId == null) && ((str30 = this.createdAt) != null ? str30.equals(item.createdAt) : item.createdAt == null)) {
                String str31 = this.updatedAt;
                String str32 = item.updatedAt;
                if (str31 == null) {
                    if (str32 == null) {
                        return true;
                    }
                } else if (str31.equals(str32)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003;
                String str = this.lastActivityId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.lastViewedNotifications;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.lastViewedCommentMentions;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.lastViewedRecentTasks;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastViewedRecentActivities;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.lastViewedMissedActions;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.lastViewedPendingAssignments;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastViewedCommentAndMentions;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.lastActivityTime;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                ActivityType activityType = this.lastActivityType;
                int iHashCode11 = (iHashCode10 ^ (activityType == null ? 0 : activityType.hashCode())) * 1000003;
                String str10 = this.lastActivityBody;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.lastCallLogged;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.lastNoteAdded;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastCommentAdded;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.lastTaskCompleted;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.lastTaskCreated;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.lastVisitLogged;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.lastContactAdded;
                int iHashCode19 = (iHashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.lastEmailSent;
                int iHashCode20 = (iHashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.lastWhatsappSent;
                int iHashCode21 = (iHashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.lastSmsSent;
                int iHashCode22 = (iHashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.lastKnownLocation;
                int iHashCode23 = (iHashCode22 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.lastKnownLocationTime;
                int iHashCode24 = (iHashCode23 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.inCall;
                int iHashCode25 = (iHashCode24 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.inCallWithContactId;
                int iHashCode26 = (iHashCode25 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.inCallWithContactName;
                int iHashCode27 = (iHashCode26 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.inCallWithContactNumber;
                int iHashCode28 = (iHashCode27 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.inCallRequestedAt;
                int iHashCode29 = (iHashCode28 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.lastInCallUpdatedAt;
                int iHashCode30 = (iHashCode29 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.callPlacementId;
                int iHashCode31 = (iHashCode30 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.createdAt;
                int iHashCode32 = (iHashCode31 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.updatedAt;
                this.$hashCode = iHashCode32 ^ (str31 != null ? str31.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String inCall() {
            return this.inCall;
        }

        public String inCallRequestedAt() {
            return this.inCallRequestedAt;
        }

        public String inCallWithContactId() {
            return this.inCallWithContactId;
        }

        public String inCallWithContactName() {
            return this.inCallWithContactName;
        }

        public String inCallWithContactNumber() {
            return this.inCallWithContactNumber;
        }

        public String lastActivityBody() {
            return this.lastActivityBody;
        }

        public String lastActivityId() {
            return this.lastActivityId;
        }

        public String lastActivityTime() {
            return this.lastActivityTime;
        }

        public ActivityType lastActivityType() {
            return this.lastActivityType;
        }

        public String lastCallLogged() {
            return this.lastCallLogged;
        }

        public String lastCommentAdded() {
            return this.lastCommentAdded;
        }

        public String lastContactAdded() {
            return this.lastContactAdded;
        }

        public String lastEmailSent() {
            return this.lastEmailSent;
        }

        public String lastInCallUpdatedAt() {
            return this.lastInCallUpdatedAt;
        }

        public String lastKnownLocation() {
            return this.lastKnownLocation;
        }

        public String lastKnownLocationTime() {
            return this.lastKnownLocationTime;
        }

        public String lastNoteAdded() {
            return this.lastNoteAdded;
        }

        public String lastSmsSent() {
            return this.lastSmsSent;
        }

        public String lastTaskCompleted() {
            return this.lastTaskCompleted;
        }

        public String lastTaskCreated() {
            return this.lastTaskCreated;
        }

        public String lastViewedCommentAndMentions() {
            return this.lastViewedCommentAndMentions;
        }

        public String lastViewedCommentMentions() {
            return this.lastViewedCommentMentions;
        }

        public String lastViewedMissedActions() {
            return this.lastViewedMissedActions;
        }

        public String lastViewedNotifications() {
            return this.lastViewedNotifications;
        }

        public String lastViewedPendingAssignments() {
            return this.lastViewedPendingAssignments;
        }

        public String lastViewedRecentActivities() {
            return this.lastViewedRecentActivities;
        }

        public String lastViewedRecentTasks() {
            return this.lastViewedRecentTasks;
        }

        public String lastVisitLogged() {
            return this.lastVisitLogged;
        }

        public String lastWhatsappSent() {
            return this.lastWhatsappSent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.lastActivityId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.lastViewedNotifications);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.lastViewedCommentMentions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.lastViewedRecentTasks);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.lastViewedRecentActivities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.lastViewedMissedActions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.lastViewedPendingAssignments);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.lastViewedCommentAndMentions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.lastActivityTime);
                    ResponseField responseField = responseFieldArr[12];
                    ActivityType activityType = Item.this.lastActivityType;
                    responseWriter.writeString(responseField, activityType != null ? activityType.name() : null);
                    responseWriter.writeString(responseFieldArr[13], Item.this.lastActivityBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.lastCallLogged);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.lastNoteAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.lastCommentAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.lastTaskCompleted);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.lastTaskCreated);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.lastVisitLogged);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.lastContactAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.lastEmailSent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.lastWhatsappSent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.lastSmsSent);
                    responseWriter.writeString(responseFieldArr[24], Item.this.lastKnownLocation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.lastKnownLocationTime);
                    responseWriter.writeString(responseFieldArr[26], Item.this.inCall);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], Item.this.inCallWithContactId);
                    responseWriter.writeString(responseFieldArr[28], Item.this.inCallWithContactName);
                    responseWriter.writeString(responseFieldArr[29], Item.this.inCallWithContactNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], Item.this.inCallRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], Item.this.lastInCallUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.callPlacementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], Item.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", userId=" + this.userId + ", lastActivityId=" + this.lastActivityId + ", lastViewedNotifications=" + this.lastViewedNotifications + ", lastViewedCommentMentions=" + this.lastViewedCommentMentions + ", lastViewedRecentTasks=" + this.lastViewedRecentTasks + ", lastViewedRecentActivities=" + this.lastViewedRecentActivities + ", lastViewedMissedActions=" + this.lastViewedMissedActions + ", lastViewedPendingAssignments=" + this.lastViewedPendingAssignments + ", lastViewedCommentAndMentions=" + this.lastViewedCommentAndMentions + ", lastActivityTime=" + this.lastActivityTime + ", lastActivityType=" + this.lastActivityType + ", lastActivityBody=" + this.lastActivityBody + ", lastCallLogged=" + this.lastCallLogged + ", lastNoteAdded=" + this.lastNoteAdded + ", lastCommentAdded=" + this.lastCommentAdded + ", lastTaskCompleted=" + this.lastTaskCompleted + ", lastTaskCreated=" + this.lastTaskCreated + ", lastVisitLogged=" + this.lastVisitLogged + ", lastContactAdded=" + this.lastContactAdded + ", lastEmailSent=" + this.lastEmailSent + ", lastWhatsappSent=" + this.lastWhatsappSent + ", lastSmsSent=" + this.lastSmsSent + ", lastKnownLocation=" + this.lastKnownLocation + ", lastKnownLocationTime=" + this.lastKnownLocationTime + ", inCall=" + this.inCall + ", inCallWithContactId=" + this.inCallWithContactId + ", inCallWithContactName=" + this.inCallWithContactName + ", inCallWithContactNumber=" + this.inCallWithContactNumber + ", inCallRequestedAt=" + this.inCallRequestedAt + ", lastInCallUpdatedAt=" + this.lastInCallUpdatedAt + ", callPlacementId=" + this.callPlacementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ListAccountMemberActivity {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListAccountMemberActivity> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListAccountMemberActivity map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListAccountMemberActivity.$responseFields;
                return new ListAccountMemberActivity(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.ListAccountMemberActivity.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.ListAccountMemberActivity.Mapper.1.1
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

        public ListAccountMemberActivity(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListAccountMemberActivity)) {
                return false;
            }
            ListAccountMemberActivity listAccountMemberActivity = (ListAccountMemberActivity) obj;
            if (this.__typename.equals(listAccountMemberActivity.__typename) && this.items.equals(listAccountMemberActivity.items)) {
                String str = this.nextToken;
                String str2 = listAccountMemberActivity.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.ListAccountMemberActivity.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListAccountMemberActivity.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListAccountMemberActivity.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListAccountMemberActivity.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.ListAccountMemberActivity.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListAccountMemberActivity.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListAccountMemberActivity{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelAccountMemberActivityFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelIDKeyConditionInput userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelAccountMemberActivityFilterInput modelAccountMemberActivityFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.userId = modelIDKeyConditionInput;
            this.filter = modelAccountMemberActivityFilterInput;
            this.limit = num;
            this.nextToken = str2;
            this.sortDirection = modelSortDirection;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("userId", modelIDKeyConditionInput);
            linkedHashMap.put("filter", modelAccountMemberActivityFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
            linkedHashMap.put("sortDirection", modelSortDirection);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelAccountMemberActivityFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListAccountMemberActivityQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("userId", Variables.this.userId != null ? Variables.this.userId.marshaller() : null);
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

    public ListAccountMemberActivityQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelAccountMemberActivityFilterInput modelAccountMemberActivityFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelAccountMemberActivityFilterInput, num, str2, modelSortDirection);
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
        return "e794ea85ee744c5b9b0ca073e621a52a96341a4dad6bf63ef7a75d3d0d96ecb9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListAccountMemberActivity($accountId: ID, $userId: ModelIDKeyConditionInput, $filter: ModelAccountMemberActivityFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listAccountMemberActivity(accountId: $accountId, userId: $userId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      userId\n      lastActivityId\n      lastViewedNotifications\n      lastViewedCommentMentions\n      lastViewedRecentTasks\n      lastViewedRecentActivities\n      lastViewedMissedActions\n      lastViewedPendingAssignments\n      lastViewedCommentAndMentions\n      lastActivityTime\n      lastActivityType\n      lastActivityBody\n      lastCallLogged\n      lastNoteAdded\n      lastCommentAdded\n      lastTaskCompleted\n      lastTaskCreated\n      lastVisitLogged\n      lastContactAdded\n      lastEmailSent\n      lastWhatsappSent\n      lastSmsSent\n      lastKnownLocation\n      lastKnownLocationTime\n      inCall\n      inCallWithContactId\n      inCallWithContactName\n      inCallWithContactNumber\n      inCallRequestedAt\n      lastInCallUpdatedAt\n      callPlacementId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
