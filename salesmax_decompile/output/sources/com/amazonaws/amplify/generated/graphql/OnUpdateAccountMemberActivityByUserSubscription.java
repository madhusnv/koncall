package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
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

/* loaded from: classes4.dex */
public final class OnUpdateAccountMemberActivityByUserSubscription implements Subscription<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateAccountMemberActivityByUser($accountId: ID!, $userId: ID!) {\n  onUpdateAccountMemberActivityByUser(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    lastActivityId\n    lastViewedNotifications\n    lastViewedCommentMentions\n    lastViewedRecentTasks\n    lastViewedRecentActivities\n    lastViewedMissedActions\n    lastViewedPendingAssignments\n    lastViewedCommentAndMentions\n    lastActivityTime\n    lastActivityType\n    lastActivityBody\n    lastCallLogged\n    lastNoteAdded\n    lastCommentAdded\n    lastTaskCompleted\n    lastTaskCreated\n    lastVisitLogged\n    lastContactAdded\n    lastEmailSent\n    lastWhatsappSent\n    lastSmsSent\n    lastKnownLocation\n    lastKnownLocationTime\n    inCall\n    inCallWithContactId\n    inCallWithContactName\n    inCallWithContactNumber\n    inCallRequestedAt\n    lastInCallUpdatedAt\n    callPlacementId\n    createdAt\n    updatedAt\n    lastActivity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateAccountMemberActivityByUser";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateAccountMemberActivityByUser($accountId: ID!, $userId: ID!) {\n  onUpdateAccountMemberActivityByUser(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    lastActivityId\n    lastViewedNotifications\n    lastViewedCommentMentions\n    lastViewedRecentTasks\n    lastViewedRecentActivities\n    lastViewedMissedActions\n    lastViewedPendingAssignments\n    lastViewedCommentAndMentions\n    lastActivityTime\n    lastActivityType\n    lastActivityBody\n    lastCallLogged\n    lastNoteAdded\n    lastCommentAdded\n    lastTaskCompleted\n    lastTaskCreated\n    lastVisitLogged\n    lastContactAdded\n    lastEmailSent\n    lastWhatsappSent\n    lastSmsSent\n    lastKnownLocation\n    lastKnownLocationTime\n    inCall\n    inCallWithContactId\n    inCallWithContactName\n    inCallWithContactNumber\n    inCallRequestedAt\n    lastInCallUpdatedAt\n    callPlacementId\n    createdAt\n    updatedAt\n    lastActivity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public OnUpdateAccountMemberActivityByUserSubscription build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new OnUpdateAccountMemberActivityByUserSubscription(this.accountId, this.userId);
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateAccountMemberActivityByUser", "onUpdateAccountMemberActivityByUser", new UnmodifiableMapBuilder(2).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateAccountMemberActivityByUser.Mapper onUpdateAccountMemberActivityByUserFieldMapper = new OnUpdateAccountMemberActivityByUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateAccountMemberActivityByUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateAccountMemberActivityByUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateAccountMemberActivityByUser read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateAccountMemberActivityByUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser) {
            this.onUpdateAccountMemberActivityByUser = onUpdateAccountMemberActivityByUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser = this.onUpdateAccountMemberActivityByUser;
            OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser2 = ((Data) obj).onUpdateAccountMemberActivityByUser;
            return onUpdateAccountMemberActivityByUser == null ? onUpdateAccountMemberActivityByUser2 == null : onUpdateAccountMemberActivityByUser.equals(onUpdateAccountMemberActivityByUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser = this.onUpdateAccountMemberActivityByUser;
                this.$hashCode = (onUpdateAccountMemberActivityByUser == null ? 0 : onUpdateAccountMemberActivityByUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser = Data.this.onUpdateAccountMemberActivityByUser;
                    responseWriter.writeObject(responseField, onUpdateAccountMemberActivityByUser != null ? onUpdateAccountMemberActivityByUser.marshaller() : null);
                }
            };
        }

        public OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser() {
            return this.onUpdateAccountMemberActivityByUser;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateAccountMemberActivityByUser=" + this.onUpdateAccountMemberActivityByUser + "}";
            }
            return this.$toString;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.LastActivity.1
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

    public static class OnUpdateAccountMemberActivityByUser {
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

        public static final class Mapper implements ResponseFieldMapper<OnUpdateAccountMemberActivityByUser> {
            final LastActivity.Mapper lastActivityFieldMapper = new LastActivity.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateAccountMemberActivityByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateAccountMemberActivityByUser.$responseFields;
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
                return new OnUpdateAccountMemberActivityByUser(string, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, string2 != null ? ActivityType.valueOf(string2) : null, responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (LastActivity) responseReader.readObject(responseFieldArr[35], new ResponseReader.ObjectReader<LastActivity>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.OnUpdateAccountMemberActivityByUser.Mapper.1
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

        public OnUpdateAccountMemberActivityByUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ActivityType activityType, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, LastActivity lastActivity) {
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
            if (!(obj instanceof OnUpdateAccountMemberActivityByUser)) {
                return false;
            }
            OnUpdateAccountMemberActivityByUser onUpdateAccountMemberActivityByUser = (OnUpdateAccountMemberActivityByUser) obj;
            if (this.__typename.equals(onUpdateAccountMemberActivityByUser.__typename) && this.accountId.equals(onUpdateAccountMemberActivityByUser.accountId) && this.userId.equals(onUpdateAccountMemberActivityByUser.userId) && ((str = this.lastActivityId) != null ? str.equals(onUpdateAccountMemberActivityByUser.lastActivityId) : onUpdateAccountMemberActivityByUser.lastActivityId == null) && ((str2 = this.lastViewedNotifications) != null ? str2.equals(onUpdateAccountMemberActivityByUser.lastViewedNotifications) : onUpdateAccountMemberActivityByUser.lastViewedNotifications == null) && ((str3 = this.lastViewedCommentMentions) != null ? str3.equals(onUpdateAccountMemberActivityByUser.lastViewedCommentMentions) : onUpdateAccountMemberActivityByUser.lastViewedCommentMentions == null) && ((str4 = this.lastViewedRecentTasks) != null ? str4.equals(onUpdateAccountMemberActivityByUser.lastViewedRecentTasks) : onUpdateAccountMemberActivityByUser.lastViewedRecentTasks == null) && ((str5 = this.lastViewedRecentActivities) != null ? str5.equals(onUpdateAccountMemberActivityByUser.lastViewedRecentActivities) : onUpdateAccountMemberActivityByUser.lastViewedRecentActivities == null) && ((str6 = this.lastViewedMissedActions) != null ? str6.equals(onUpdateAccountMemberActivityByUser.lastViewedMissedActions) : onUpdateAccountMemberActivityByUser.lastViewedMissedActions == null) && ((str7 = this.lastViewedPendingAssignments) != null ? str7.equals(onUpdateAccountMemberActivityByUser.lastViewedPendingAssignments) : onUpdateAccountMemberActivityByUser.lastViewedPendingAssignments == null) && ((str8 = this.lastViewedCommentAndMentions) != null ? str8.equals(onUpdateAccountMemberActivityByUser.lastViewedCommentAndMentions) : onUpdateAccountMemberActivityByUser.lastViewedCommentAndMentions == null) && ((str9 = this.lastActivityTime) != null ? str9.equals(onUpdateAccountMemberActivityByUser.lastActivityTime) : onUpdateAccountMemberActivityByUser.lastActivityTime == null) && ((activityType = this.lastActivityType) != null ? activityType.equals(onUpdateAccountMemberActivityByUser.lastActivityType) : onUpdateAccountMemberActivityByUser.lastActivityType == null) && ((str10 = this.lastActivityBody) != null ? str10.equals(onUpdateAccountMemberActivityByUser.lastActivityBody) : onUpdateAccountMemberActivityByUser.lastActivityBody == null) && ((str11 = this.lastCallLogged) != null ? str11.equals(onUpdateAccountMemberActivityByUser.lastCallLogged) : onUpdateAccountMemberActivityByUser.lastCallLogged == null) && ((str12 = this.lastNoteAdded) != null ? str12.equals(onUpdateAccountMemberActivityByUser.lastNoteAdded) : onUpdateAccountMemberActivityByUser.lastNoteAdded == null) && ((str13 = this.lastCommentAdded) != null ? str13.equals(onUpdateAccountMemberActivityByUser.lastCommentAdded) : onUpdateAccountMemberActivityByUser.lastCommentAdded == null) && ((str14 = this.lastTaskCompleted) != null ? str14.equals(onUpdateAccountMemberActivityByUser.lastTaskCompleted) : onUpdateAccountMemberActivityByUser.lastTaskCompleted == null) && ((str15 = this.lastTaskCreated) != null ? str15.equals(onUpdateAccountMemberActivityByUser.lastTaskCreated) : onUpdateAccountMemberActivityByUser.lastTaskCreated == null) && ((str16 = this.lastVisitLogged) != null ? str16.equals(onUpdateAccountMemberActivityByUser.lastVisitLogged) : onUpdateAccountMemberActivityByUser.lastVisitLogged == null) && ((str17 = this.lastContactAdded) != null ? str17.equals(onUpdateAccountMemberActivityByUser.lastContactAdded) : onUpdateAccountMemberActivityByUser.lastContactAdded == null) && ((str18 = this.lastEmailSent) != null ? str18.equals(onUpdateAccountMemberActivityByUser.lastEmailSent) : onUpdateAccountMemberActivityByUser.lastEmailSent == null) && ((str19 = this.lastWhatsappSent) != null ? str19.equals(onUpdateAccountMemberActivityByUser.lastWhatsappSent) : onUpdateAccountMemberActivityByUser.lastWhatsappSent == null) && ((str20 = this.lastSmsSent) != null ? str20.equals(onUpdateAccountMemberActivityByUser.lastSmsSent) : onUpdateAccountMemberActivityByUser.lastSmsSent == null) && ((str21 = this.lastKnownLocation) != null ? str21.equals(onUpdateAccountMemberActivityByUser.lastKnownLocation) : onUpdateAccountMemberActivityByUser.lastKnownLocation == null) && ((str22 = this.lastKnownLocationTime) != null ? str22.equals(onUpdateAccountMemberActivityByUser.lastKnownLocationTime) : onUpdateAccountMemberActivityByUser.lastKnownLocationTime == null) && ((str23 = this.inCall) != null ? str23.equals(onUpdateAccountMemberActivityByUser.inCall) : onUpdateAccountMemberActivityByUser.inCall == null) && ((str24 = this.inCallWithContactId) != null ? str24.equals(onUpdateAccountMemberActivityByUser.inCallWithContactId) : onUpdateAccountMemberActivityByUser.inCallWithContactId == null) && ((str25 = this.inCallWithContactName) != null ? str25.equals(onUpdateAccountMemberActivityByUser.inCallWithContactName) : onUpdateAccountMemberActivityByUser.inCallWithContactName == null) && ((str26 = this.inCallWithContactNumber) != null ? str26.equals(onUpdateAccountMemberActivityByUser.inCallWithContactNumber) : onUpdateAccountMemberActivityByUser.inCallWithContactNumber == null) && ((str27 = this.inCallRequestedAt) != null ? str27.equals(onUpdateAccountMemberActivityByUser.inCallRequestedAt) : onUpdateAccountMemberActivityByUser.inCallRequestedAt == null) && ((str28 = this.lastInCallUpdatedAt) != null ? str28.equals(onUpdateAccountMemberActivityByUser.lastInCallUpdatedAt) : onUpdateAccountMemberActivityByUser.lastInCallUpdatedAt == null) && ((str29 = this.callPlacementId) != null ? str29.equals(onUpdateAccountMemberActivityByUser.callPlacementId) : onUpdateAccountMemberActivityByUser.callPlacementId == null) && ((str30 = this.createdAt) != null ? str30.equals(onUpdateAccountMemberActivityByUser.createdAt) : onUpdateAccountMemberActivityByUser.createdAt == null) && ((str31 = this.updatedAt) != null ? str31.equals(onUpdateAccountMemberActivityByUser.updatedAt) : onUpdateAccountMemberActivityByUser.updatedAt == null)) {
                LastActivity lastActivity = this.lastActivity;
                LastActivity lastActivity2 = onUpdateAccountMemberActivityByUser.lastActivity;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.OnUpdateAccountMemberActivityByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateAccountMemberActivityByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateAccountMemberActivityByUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateAccountMemberActivityByUser.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateAccountMemberActivityByUser.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnUpdateAccountMemberActivityByUser.this.lastActivityId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], OnUpdateAccountMemberActivityByUser.this.lastViewedNotifications);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnUpdateAccountMemberActivityByUser.this.lastViewedCommentMentions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], OnUpdateAccountMemberActivityByUser.this.lastViewedRecentTasks);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnUpdateAccountMemberActivityByUser.this.lastViewedRecentActivities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnUpdateAccountMemberActivityByUser.this.lastViewedMissedActions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], OnUpdateAccountMemberActivityByUser.this.lastViewedPendingAssignments);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnUpdateAccountMemberActivityByUser.this.lastViewedCommentAndMentions);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], OnUpdateAccountMemberActivityByUser.this.lastActivityTime);
                    ResponseField responseField = responseFieldArr[12];
                    ActivityType activityType = OnUpdateAccountMemberActivityByUser.this.lastActivityType;
                    responseWriter.writeString(responseField, activityType != null ? activityType.name() : null);
                    responseWriter.writeString(responseFieldArr[13], OnUpdateAccountMemberActivityByUser.this.lastActivityBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], OnUpdateAccountMemberActivityByUser.this.lastCallLogged);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], OnUpdateAccountMemberActivityByUser.this.lastNoteAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], OnUpdateAccountMemberActivityByUser.this.lastCommentAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], OnUpdateAccountMemberActivityByUser.this.lastTaskCompleted);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], OnUpdateAccountMemberActivityByUser.this.lastTaskCreated);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], OnUpdateAccountMemberActivityByUser.this.lastVisitLogged);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], OnUpdateAccountMemberActivityByUser.this.lastContactAdded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], OnUpdateAccountMemberActivityByUser.this.lastEmailSent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], OnUpdateAccountMemberActivityByUser.this.lastWhatsappSent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], OnUpdateAccountMemberActivityByUser.this.lastSmsSent);
                    responseWriter.writeString(responseFieldArr[24], OnUpdateAccountMemberActivityByUser.this.lastKnownLocation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], OnUpdateAccountMemberActivityByUser.this.lastKnownLocationTime);
                    responseWriter.writeString(responseFieldArr[26], OnUpdateAccountMemberActivityByUser.this.inCall);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], OnUpdateAccountMemberActivityByUser.this.inCallWithContactId);
                    responseWriter.writeString(responseFieldArr[28], OnUpdateAccountMemberActivityByUser.this.inCallWithContactName);
                    responseWriter.writeString(responseFieldArr[29], OnUpdateAccountMemberActivityByUser.this.inCallWithContactNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], OnUpdateAccountMemberActivityByUser.this.inCallRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], OnUpdateAccountMemberActivityByUser.this.lastInCallUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], OnUpdateAccountMemberActivityByUser.this.callPlacementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], OnUpdateAccountMemberActivityByUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], OnUpdateAccountMemberActivityByUser.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[35];
                    LastActivity lastActivity = OnUpdateAccountMemberActivityByUser.this.lastActivity;
                    responseWriter.writeObject(responseField2, lastActivity != null ? lastActivity.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnUpdateAccountMemberActivityByUser{__typename=" + this.__typename + ", accountId=" + this.accountId + ", userId=" + this.userId + ", lastActivityId=" + this.lastActivityId + ", lastViewedNotifications=" + this.lastViewedNotifications + ", lastViewedCommentMentions=" + this.lastViewedCommentMentions + ", lastViewedRecentTasks=" + this.lastViewedRecentTasks + ", lastViewedRecentActivities=" + this.lastViewedRecentActivities + ", lastViewedMissedActions=" + this.lastViewedMissedActions + ", lastViewedPendingAssignments=" + this.lastViewedPendingAssignments + ", lastViewedCommentAndMentions=" + this.lastViewedCommentAndMentions + ", lastActivityTime=" + this.lastActivityTime + ", lastActivityType=" + this.lastActivityType + ", lastActivityBody=" + this.lastActivityBody + ", lastCallLogged=" + this.lastCallLogged + ", lastNoteAdded=" + this.lastNoteAdded + ", lastCommentAdded=" + this.lastCommentAdded + ", lastTaskCompleted=" + this.lastTaskCompleted + ", lastTaskCreated=" + this.lastTaskCreated + ", lastVisitLogged=" + this.lastVisitLogged + ", lastContactAdded=" + this.lastContactAdded + ", lastEmailSent=" + this.lastEmailSent + ", lastWhatsappSent=" + this.lastWhatsappSent + ", lastSmsSent=" + this.lastSmsSent + ", lastKnownLocation=" + this.lastKnownLocation + ", lastKnownLocationTime=" + this.lastKnownLocationTime + ", inCall=" + this.inCall + ", inCallWithContactId=" + this.inCallWithContactId + ", inCallWithContactName=" + this.inCallWithContactName + ", inCallWithContactNumber=" + this.inCallWithContactNumber + ", inCallRequestedAt=" + this.inCallRequestedAt + ", lastInCallUpdatedAt=" + this.lastInCallUpdatedAt + ", callPlacementId=" + this.callPlacementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", lastActivity=" + this.lastActivity + "}";
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription.Variables.1
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

    public OnUpdateAccountMemberActivityByUserSubscription(String str, String str2) {
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
        return "4f1fbe9f323d8da6597a15a0a849c40629fcc42dbee984be092e7c7945241290";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateAccountMemberActivityByUser($accountId: ID!, $userId: ID!) {\n  onUpdateAccountMemberActivityByUser(accountId: $accountId, userId: $userId) {\n    __typename\n    accountId\n    userId\n    lastActivityId\n    lastViewedNotifications\n    lastViewedCommentMentions\n    lastViewedRecentTasks\n    lastViewedRecentActivities\n    lastViewedMissedActions\n    lastViewedPendingAssignments\n    lastViewedCommentAndMentions\n    lastActivityTime\n    lastActivityType\n    lastActivityBody\n    lastCallLogged\n    lastNoteAdded\n    lastCommentAdded\n    lastTaskCompleted\n    lastTaskCreated\n    lastVisitLogged\n    lastContactAdded\n    lastEmailSent\n    lastWhatsappSent\n    lastSmsSent\n    lastKnownLocation\n    lastKnownLocationTime\n    inCall\n    inCallWithContactId\n    inCallWithContactName\n    inCallWithContactNumber\n    inCallRequestedAt\n    lastInCallUpdatedAt\n    callPlacementId\n    createdAt\n    updatedAt\n    lastActivity {\n      __typename\n      id\n      threadId\n      accountId\n      activityRelatedObjectType\n      activityRelatedObjectId\n      activityCategory\n      activityType\n      body\n      note\n      ownerId\n      primaryTeamId\n      contactId\n      activityDoneByUserId\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
