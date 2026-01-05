package com.amazonaws.amplify.generated.graphql;

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
import java.util.Map;
import type.ActivityCategory;
import type.ActivityRelatedObjectType;
import type.ActivityType;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetAccountMemberActivityQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetAccountMemberActivity($accountId: ID!, $userId: ID!) {\n  getAccountMemberActivity(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    lastActivityId\n    lastViewedNotifications\n    lastViewedCommentMentions\n    lastViewedRecentTasks\n    lastViewedRecentActivities\n    lastViewedMissedActions\n    lastViewedPendingAssignments\n    lastViewedCommentAndMentions\n    lastActivityTime\n    lastActivityType\n    lastActivityBody\n    lastCallLogged\n    lastNoteAdded\n    lastCommentAdded\n    lastTaskCompleted\n    lastTaskCreated\n    lastVisitLogged\n    lastContactAdded\n    lastEmailSent\n    lastWhatsappSent\n    lastSmsSent\n    lastKnownLocation\n    lastKnownLocationTime\n    inCall\n    inCallWithContactId\n    inCallWithContactName\n    inCallWithContactNumber\n    inCallRequestedAt\n    lastInCallUpdatedAt\n    callPlacementId\n    createdAt\n    updatedAt\n    lastActivity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetAccountMemberActivity";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetAccountMemberActivity($accountId: ID!, $userId: ID!) {\n  getAccountMemberActivity(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    lastActivityId\n    lastViewedNotifications\n    lastViewedCommentMentions\n    lastViewedRecentTasks\n    lastViewedRecentActivities\n    lastViewedMissedActions\n    lastViewedPendingAssignments\n    lastViewedCommentAndMentions\n    lastActivityTime\n    lastActivityType\n    lastActivityBody\n    lastCallLogged\n    lastNoteAdded\n    lastCommentAdded\n    lastTaskCompleted\n    lastTaskCreated\n    lastVisitLogged\n    lastContactAdded\n    lastEmailSent\n    lastWhatsappSent\n    lastSmsSent\n    lastKnownLocation\n    lastKnownLocationTime\n    inCall\n    inCallWithContactId\n    inCallWithContactName\n    inCallWithContactNumber\n    inCallRequestedAt\n    lastInCallUpdatedAt\n    callPlacementId\n    createdAt\n    updatedAt\n    lastActivity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetAccountMemberActivityQuery build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new GetAccountMemberActivityQuery(this.accountId, this.userId);
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getAccountMemberActivity", "getAccountMemberActivity", new UnmodifiableMapBuilder(2).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetAccountMemberActivity getAccountMemberActivity;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetAccountMemberActivity.Mapper getAccountMemberActivityFieldMapper = new GetAccountMemberActivity.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetAccountMemberActivity) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetAccountMemberActivity>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetAccountMemberActivity read(ResponseReader responseReader2) {
                        return Mapper.this.getAccountMemberActivityFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetAccountMemberActivity getAccountMemberActivity) {
            this.getAccountMemberActivity = getAccountMemberActivity;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetAccountMemberActivity getAccountMemberActivity = this.getAccountMemberActivity;
            GetAccountMemberActivity getAccountMemberActivity2 = ((Data) obj).getAccountMemberActivity;
            return getAccountMemberActivity == null ? getAccountMemberActivity2 == null : getAccountMemberActivity.equals(getAccountMemberActivity2);
        }

        public GetAccountMemberActivity getAccountMemberActivity() {
            return this.getAccountMemberActivity;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetAccountMemberActivity getAccountMemberActivity = this.getAccountMemberActivity;
                this.$hashCode = (getAccountMemberActivity == null ? 0 : getAccountMemberActivity.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetAccountMemberActivity getAccountMemberActivity = Data.this.getAccountMemberActivity;
                    responseWriter.writeObject(responseField, getAccountMemberActivity != null ? getAccountMemberActivity.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getAccountMemberActivity=" + this.getAccountMemberActivity + "}";
            }
            return this.$toString;
        }
    }

    public static class GetAccountMemberActivity {
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
        final LastActivity lastActivity;
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

        public static final class Mapper implements ResponseFieldMapper<GetAccountMemberActivity> {
            final LastActivity.Mapper lastActivityFieldMapper = new LastActivity.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetAccountMemberActivity map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetAccountMemberActivity.$responseFields;
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
                return new GetAccountMemberActivity(string, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, string2 != null ? ActivityType.valueOf(string2) : null, responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (LastActivity) responseReader.readObject(responseFieldArr[35], new ResponseReader.ObjectReader<LastActivity>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.GetAccountMemberActivity.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastActivity read(ResponseReader responseReader2) {
                        return Mapper.this.lastActivityFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("lastActivityId", "lastActivityId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastViewedNotifications", "lastViewedNotifications", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedCommentMentions", "lastViewedCommentMentions", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedRecentTasks", "lastViewedRecentTasks", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedRecentActivities", "lastViewedRecentActivities", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedMissedActions", "lastViewedMissedActions", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedPendingAssignments", "lastViewedPendingAssignments", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedCommentAndMentions", "lastViewedCommentAndMentions", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastActivityTime", "lastActivityTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastActivityType", "lastActivityType", null, true, Collections.emptyList()), ResponseField.forString("lastActivityBody", "lastActivityBody", null, true, Collections.emptyList()), ResponseField.forCustomType("lastCallLogged", "lastCallLogged", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastNoteAdded", "lastNoteAdded", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastCommentAdded", "lastCommentAdded", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskCompleted", "lastTaskCompleted", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastTaskCreated", "lastTaskCreated", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastVisitLogged", "lastVisitLogged", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastContactAdded", "lastContactAdded", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastEmailSent", "lastEmailSent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastWhatsappSent", "lastWhatsappSent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastSmsSent", "lastSmsSent", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastKnownLocation", "lastKnownLocation", null, true, Collections.emptyList()), ResponseField.forCustomType("lastKnownLocationTime", "lastKnownLocationTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("inCall", "inCall", null, true, Collections.emptyList()), ResponseField.forCustomType("inCallWithContactId", "inCallWithContactId", null, true, customType, Collections.emptyList()), ResponseField.forString("inCallWithContactName", "inCallWithContactName", null, true, Collections.emptyList()), ResponseField.forString("inCallWithContactNumber", "inCallWithContactNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("inCallRequestedAt", "inCallRequestedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastInCallUpdatedAt", "lastInCallUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("callPlacementId", "callPlacementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("lastActivity", "lastActivity", null, true, Collections.emptyList())};
        }

        public GetAccountMemberActivity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ActivityType activityType, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, LastActivity lastActivity) {
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
            this.lastActivity = lastActivity;
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
            String str31;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAccountMemberActivity)) {
                return false;
            }
            GetAccountMemberActivity getAccountMemberActivity = (GetAccountMemberActivity) obj;
            if (this.__typename.equals(getAccountMemberActivity.__typename) && this.accountId.equals(getAccountMemberActivity.accountId) && this.userId.equals(getAccountMemberActivity.userId) && ((str = this.lastActivityId) != null ? str.equals(getAccountMemberActivity.lastActivityId) : getAccountMemberActivity.lastActivityId == null) && ((str2 = this.lastViewedNotifications) != null ? str2.equals(getAccountMemberActivity.lastViewedNotifications) : getAccountMemberActivity.lastViewedNotifications == null) && ((str3 = this.lastViewedCommentMentions) != null ? str3.equals(getAccountMemberActivity.lastViewedCommentMentions) : getAccountMemberActivity.lastViewedCommentMentions == null) && ((str4 = this.lastViewedRecentTasks) != null ? str4.equals(getAccountMemberActivity.lastViewedRecentTasks) : getAccountMemberActivity.lastViewedRecentTasks == null) && ((str5 = this.lastViewedRecentActivities) != null ? str5.equals(getAccountMemberActivity.lastViewedRecentActivities) : getAccountMemberActivity.lastViewedRecentActivities == null) && ((str6 = this.lastViewedMissedActions) != null ? str6.equals(getAccountMemberActivity.lastViewedMissedActions) : getAccountMemberActivity.lastViewedMissedActions == null) && ((str7 = this.lastViewedPendingAssignments) != null ? str7.equals(getAccountMemberActivity.lastViewedPendingAssignments) : getAccountMemberActivity.lastViewedPendingAssignments == null) && ((str8 = this.lastViewedCommentAndMentions) != null ? str8.equals(getAccountMemberActivity.lastViewedCommentAndMentions) : getAccountMemberActivity.lastViewedCommentAndMentions == null) && ((str9 = this.lastActivityTime) != null ? str9.equals(getAccountMemberActivity.lastActivityTime) : getAccountMemberActivity.lastActivityTime == null) && ((activityType = this.lastActivityType) != null ? activityType.equals(getAccountMemberActivity.lastActivityType) : getAccountMemberActivity.lastActivityType == null) && ((str10 = this.lastActivityBody) != null ? str10.equals(getAccountMemberActivity.lastActivityBody) : getAccountMemberActivity.lastActivityBody == null) && ((str11 = this.lastCallLogged) != null ? str11.equals(getAccountMemberActivity.lastCallLogged) : getAccountMemberActivity.lastCallLogged == null) && ((str12 = this.lastNoteAdded) != null ? str12.equals(getAccountMemberActivity.lastNoteAdded) : getAccountMemberActivity.lastNoteAdded == null) && ((str13 = this.lastCommentAdded) != null ? str13.equals(getAccountMemberActivity.lastCommentAdded) : getAccountMemberActivity.lastCommentAdded == null) && ((str14 = this.lastTaskCompleted) != null ? str14.equals(getAccountMemberActivity.lastTaskCompleted) : getAccountMemberActivity.lastTaskCompleted == null) && ((str15 = this.lastTaskCreated) != null ? str15.equals(getAccountMemberActivity.lastTaskCreated) : getAccountMemberActivity.lastTaskCreated == null) && ((str16 = this.lastVisitLogged) != null ? str16.equals(getAccountMemberActivity.lastVisitLogged) : getAccountMemberActivity.lastVisitLogged == null) && ((str17 = this.lastContactAdded) != null ? str17.equals(getAccountMemberActivity.lastContactAdded) : getAccountMemberActivity.lastContactAdded == null) && ((str18 = this.lastEmailSent) != null ? str18.equals(getAccountMemberActivity.lastEmailSent) : getAccountMemberActivity.lastEmailSent == null) && ((str19 = this.lastWhatsappSent) != null ? str19.equals(getAccountMemberActivity.lastWhatsappSent) : getAccountMemberActivity.lastWhatsappSent == null) && ((str20 = this.lastSmsSent) != null ? str20.equals(getAccountMemberActivity.lastSmsSent) : getAccountMemberActivity.lastSmsSent == null) && ((str21 = this.lastKnownLocation) != null ? str21.equals(getAccountMemberActivity.lastKnownLocation) : getAccountMemberActivity.lastKnownLocation == null) && ((str22 = this.lastKnownLocationTime) != null ? str22.equals(getAccountMemberActivity.lastKnownLocationTime) : getAccountMemberActivity.lastKnownLocationTime == null) && ((str23 = this.inCall) != null ? str23.equals(getAccountMemberActivity.inCall) : getAccountMemberActivity.inCall == null) && ((str24 = this.inCallWithContactId) != null ? str24.equals(getAccountMemberActivity.inCallWithContactId) : getAccountMemberActivity.inCallWithContactId == null) && ((str25 = this.inCallWithContactName) != null ? str25.equals(getAccountMemberActivity.inCallWithContactName) : getAccountMemberActivity.inCallWithContactName == null) && ((str26 = this.inCallWithContactNumber) != null ? str26.equals(getAccountMemberActivity.inCallWithContactNumber) : getAccountMemberActivity.inCallWithContactNumber == null) && ((str27 = this.inCallRequestedAt) != null ? str27.equals(getAccountMemberActivity.inCallRequestedAt) : getAccountMemberActivity.inCallRequestedAt == null) && ((str28 = this.lastInCallUpdatedAt) != null ? str28.equals(getAccountMemberActivity.lastInCallUpdatedAt) : getAccountMemberActivity.lastInCallUpdatedAt == null) && ((str29 = this.callPlacementId) != null ? str29.equals(getAccountMemberActivity.callPlacementId) : getAccountMemberActivity.callPlacementId == null) && ((str30 = this.createdAt) != null ? str30.equals(getAccountMemberActivity.createdAt) : getAccountMemberActivity.createdAt == null) && ((str31 = this.updatedAt) != null ? str31.equals(getAccountMemberActivity.updatedAt) : getAccountMemberActivity.updatedAt == null)) {
                LastActivity lastActivity = this.lastActivity;
                LastActivity lastActivity2 = getAccountMemberActivity.lastActivity;
                if (lastActivity == null) {
                    if (lastActivity2 == null) {
                        return true;
                    }
                } else if (lastActivity.equals(lastActivity2)) {
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
                int iHashCode33 = (iHashCode32 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                LastActivity lastActivity = this.lastActivity;
                this.$hashCode = iHashCode33 ^ (lastActivity != null ? lastActivity.hashCode() : 0);
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

        public LastActivity lastActivity() {
            return this.lastActivity;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.GetAccountMemberActivity.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetAccountMemberActivity.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetAccountMemberActivity.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetAccountMemberActivity.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetAccountMemberActivity.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetAccountMemberActivity.this.lastActivityId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], GetAccountMemberActivity.this.lastViewedNotifications);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], GetAccountMemberActivity.this.lastViewedCommentMentions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], GetAccountMemberActivity.this.lastViewedRecentTasks);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], GetAccountMemberActivity.this.lastViewedRecentActivities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetAccountMemberActivity.this.lastViewedMissedActions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], GetAccountMemberActivity.this.lastViewedPendingAssignments);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], GetAccountMemberActivity.this.lastViewedCommentAndMentions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], GetAccountMemberActivity.this.lastActivityTime);
                    ResponseField responseField = responseFieldArr[12];
                    ActivityType activityType = GetAccountMemberActivity.this.lastActivityType;
                    responseWriter.writeString(responseField, activityType != null ? activityType.name() : null);
                    responseWriter.writeString(responseFieldArr[13], GetAccountMemberActivity.this.lastActivityBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], GetAccountMemberActivity.this.lastCallLogged);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], GetAccountMemberActivity.this.lastNoteAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], GetAccountMemberActivity.this.lastCommentAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], GetAccountMemberActivity.this.lastTaskCompleted);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], GetAccountMemberActivity.this.lastTaskCreated);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], GetAccountMemberActivity.this.lastVisitLogged);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], GetAccountMemberActivity.this.lastContactAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], GetAccountMemberActivity.this.lastEmailSent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], GetAccountMemberActivity.this.lastWhatsappSent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], GetAccountMemberActivity.this.lastSmsSent);
                    responseWriter.writeString(responseFieldArr[24], GetAccountMemberActivity.this.lastKnownLocation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], GetAccountMemberActivity.this.lastKnownLocationTime);
                    responseWriter.writeString(responseFieldArr[26], GetAccountMemberActivity.this.inCall);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], GetAccountMemberActivity.this.inCallWithContactId);
                    responseWriter.writeString(responseFieldArr[28], GetAccountMemberActivity.this.inCallWithContactName);
                    responseWriter.writeString(responseFieldArr[29], GetAccountMemberActivity.this.inCallWithContactNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], GetAccountMemberActivity.this.inCallRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], GetAccountMemberActivity.this.lastInCallUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], GetAccountMemberActivity.this.callPlacementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], GetAccountMemberActivity.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], GetAccountMemberActivity.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[35];
                    LastActivity lastActivity = GetAccountMemberActivity.this.lastActivity;
                    responseWriter.writeObject(responseField2, lastActivity != null ? lastActivity.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetAccountMemberActivity{__typename=" + this.__typename + ", accountId=" + this.accountId + ", userId=" + this.userId + ", lastActivityId=" + this.lastActivityId + ", lastViewedNotifications=" + this.lastViewedNotifications + ", lastViewedCommentMentions=" + this.lastViewedCommentMentions + ", lastViewedRecentTasks=" + this.lastViewedRecentTasks + ", lastViewedRecentActivities=" + this.lastViewedRecentActivities + ", lastViewedMissedActions=" + this.lastViewedMissedActions + ", lastViewedPendingAssignments=" + this.lastViewedPendingAssignments + ", lastViewedCommentAndMentions=" + this.lastViewedCommentAndMentions + ", lastActivityTime=" + this.lastActivityTime + ", lastActivityType=" + this.lastActivityType + ", lastActivityBody=" + this.lastActivityBody + ", lastCallLogged=" + this.lastCallLogged + ", lastNoteAdded=" + this.lastNoteAdded + ", lastCommentAdded=" + this.lastCommentAdded + ", lastTaskCompleted=" + this.lastTaskCompleted + ", lastTaskCreated=" + this.lastTaskCreated + ", lastVisitLogged=" + this.lastVisitLogged + ", lastContactAdded=" + this.lastContactAdded + ", lastEmailSent=" + this.lastEmailSent + ", lastWhatsappSent=" + this.lastWhatsappSent + ", lastSmsSent=" + this.lastSmsSent + ", lastKnownLocation=" + this.lastKnownLocation + ", lastKnownLocationTime=" + this.lastKnownLocationTime + ", inCall=" + this.inCall + ", inCallWithContactId=" + this.inCallWithContactId + ", inCallWithContactName=" + this.inCallWithContactName + ", inCallWithContactNumber=" + this.inCallWithContactNumber + ", inCallRequestedAt=" + this.inCallRequestedAt + ", lastInCallUpdatedAt=" + this.lastInCallUpdatedAt + ", callPlacementId=" + this.callPlacementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", lastActivity=" + this.lastActivity + "}";
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

    public static class LastActivity {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ActivityCategory activityCategory;
        final String activityDoneByUserId;
        final String activityRelatedObjectId;
        final ActivityRelatedObjectType activityRelatedObjectType;
        final ActivityType activityType;
        final String body;
        final String contactId;
        final String createdAt;
        final String id;
        final String note;
        final String ownerId;
        final String primaryTeamId;
        final String threadId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<LastActivity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastActivity map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastActivity.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                ActivityRelatedObjectType activityRelatedObjectTypeValueOf = string2 != null ? ActivityRelatedObjectType.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                ActivityCategory activityCategoryValueOf = string3 != null ? ActivityCategory.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[7]);
                return new LastActivity(string, str, str2, str3, activityRelatedObjectTypeValueOf, str4, activityCategoryValueOf, string4 != null ? ActivityType.valueOf(string4) : null, responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("threadId", "threadId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("activityRelatedObjectType", "activityRelatedObjectType", null, false, Collections.emptyList()), ResponseField.forCustomType("activityRelatedObjectId", "activityRelatedObjectId", null, false, customType, Collections.emptyList()), ResponseField.forString("activityCategory", "activityCategory", null, false, Collections.emptyList()), ResponseField.forString("activityType", "activityType", null, false, Collections.emptyList()), ResponseField.forString("body", "body", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityDoneByUserId", "activityDoneByUserId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public LastActivity(String str, String str2, String str3, String str4, ActivityRelatedObjectType activityRelatedObjectType, String str5, ActivityCategory activityCategory, ActivityType activityType, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.threadId = str3;
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.activityRelatedObjectType = (ActivityRelatedObjectType) Utils.checkNotNull(activityRelatedObjectType, "activityRelatedObjectType == null");
            this.activityRelatedObjectId = (String) Utils.checkNotNull(str5, "activityRelatedObjectId == null");
            this.activityCategory = (ActivityCategory) Utils.checkNotNull(activityCategory, "activityCategory == null");
            this.activityType = (ActivityType) Utils.checkNotNull(activityType, "activityType == null");
            this.body = str6;
            this.note = str7;
            this.ownerId = (String) Utils.checkNotNull(str8, "ownerId == null");
            this.primaryTeamId = str9;
            this.contactId = str10;
            this.activityDoneByUserId = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActivityCategory activityCategory() {
            return this.activityCategory;
        }

        public String activityDoneByUserId() {
            return this.activityDoneByUserId;
        }

        public String activityRelatedObjectId() {
            return this.activityRelatedObjectId;
        }

        public ActivityRelatedObjectType activityRelatedObjectType() {
            return this.activityRelatedObjectType;
        }

        public ActivityType activityType() {
            return this.activityType;
        }

        public String body() {
            return this.body;
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
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LastActivity)) {
                return false;
            }
            LastActivity lastActivity = (LastActivity) obj;
            if (this.__typename.equals(lastActivity.__typename) && this.id.equals(lastActivity.id) && ((str = this.threadId) != null ? str.equals(lastActivity.threadId) : lastActivity.threadId == null) && this.accountId.equals(lastActivity.accountId) && this.activityRelatedObjectType.equals(lastActivity.activityRelatedObjectType) && this.activityRelatedObjectId.equals(lastActivity.activityRelatedObjectId) && this.activityCategory.equals(lastActivity.activityCategory) && this.activityType.equals(lastActivity.activityType) && ((str2 = this.body) != null ? str2.equals(lastActivity.body) : lastActivity.body == null) && ((str3 = this.note) != null ? str3.equals(lastActivity.note) : lastActivity.note == null) && this.ownerId.equals(lastActivity.ownerId) && ((str4 = this.primaryTeamId) != null ? str4.equals(lastActivity.primaryTeamId) : lastActivity.primaryTeamId == null) && ((str5 = this.contactId) != null ? str5.equals(lastActivity.contactId) : lastActivity.contactId == null) && ((str6 = this.activityDoneByUserId) != null ? str6.equals(lastActivity.activityDoneByUserId) : lastActivity.activityDoneByUserId == null) && ((str7 = this.createdAt) != null ? str7.equals(lastActivity.createdAt) : lastActivity.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = lastActivity.updatedAt;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.threadId;
                int iHashCode2 = (((((((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.activityRelatedObjectType.hashCode()) * 1000003) ^ this.activityRelatedObjectId.hashCode()) * 1000003) ^ this.activityCategory.hashCode()) * 1000003) ^ this.activityType.hashCode()) * 1000003;
                String str2 = this.body;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.note;
                int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str4 = this.primaryTeamId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.activityDoneByUserId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.LastActivity.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastActivity.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastActivity.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastActivity.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], LastActivity.this.threadId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], LastActivity.this.accountId);
                    responseWriter.writeString(responseFieldArr[4], LastActivity.this.activityRelatedObjectType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastActivity.this.activityRelatedObjectId);
                    responseWriter.writeString(responseFieldArr[6], LastActivity.this.activityCategory.name());
                    responseWriter.writeString(responseFieldArr[7], LastActivity.this.activityType.name());
                    responseWriter.writeString(responseFieldArr[8], LastActivity.this.body);
                    responseWriter.writeString(responseFieldArr[9], LastActivity.this.note);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], LastActivity.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], LastActivity.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], LastActivity.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], LastActivity.this.activityDoneByUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], LastActivity.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], LastActivity.this.updatedAt);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public String threadId() {
            return this.threadId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastActivity{__typename=" + this.__typename + ", id=" + this.id + ", threadId=" + this.threadId + ", accountId=" + this.accountId + ", activityRelatedObjectType=" + this.activityRelatedObjectType + ", activityRelatedObjectId=" + this.activityRelatedObjectId + ", activityCategory=" + this.activityCategory + ", activityType=" + this.activityType + ", body=" + this.body + ", note=" + this.note + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", contactId=" + this.contactId + ", activityDoneByUserId=" + this.activityDoneByUserId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.userId = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("userId", str2);
        }

        public String accountId() {
            return this.accountId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountMemberActivityQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                }
            };
        }

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetAccountMemberActivityQuery(String str, String str2) {
        Utils.checkNotNull(str, "accountId == null");
        Utils.checkNotNull(str2, "userId == null");
        this.variables = new Variables(str, str2);
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
        return "f67528aa4d2922ea76c75d4f640612d66794fb389e319529444a463fb8b94964";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetAccountMemberActivity($accountId: ID!, $userId: ID!) {\n  getAccountMemberActivity(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    lastActivityId\n    lastViewedNotifications\n    lastViewedCommentMentions\n    lastViewedRecentTasks\n    lastViewedRecentActivities\n    lastViewedMissedActions\n    lastViewedPendingAssignments\n    lastViewedCommentAndMentions\n    lastActivityTime\n    lastActivityType\n    lastActivityBody\n    lastCallLogged\n    lastNoteAdded\n    lastCommentAdded\n    lastTaskCompleted\n    lastTaskCreated\n    lastVisitLogged\n    lastContactAdded\n    lastEmailSent\n    lastWhatsappSent\n    lastSmsSent\n    lastKnownLocation\n    lastKnownLocationTime\n    inCall\n    inCallWithContactId\n    inCallWithContactName\n    inCallWithContactNumber\n    inCallRequestedAt\n    lastInCallUpdatedAt\n    callPlacementId\n    createdAt\n    updatedAt\n    lastActivity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
