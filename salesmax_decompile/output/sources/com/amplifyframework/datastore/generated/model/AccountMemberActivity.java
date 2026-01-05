package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "userId"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "AccountMemberActivities")
/* loaded from: classes5.dex */
public final class AccountMemberActivity implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String callPlacementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String inCall;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime inCallRequestedAt;

    @ModelField(targetType = "ID")
    private final String inCallWithContactId;

    @ModelField(targetType = "String")
    private final String inCallWithContactName;

    @ModelField(targetType = "String")
    private final String inCallWithContactNumber;

    @BelongsTo(targetName = "lastActivityId", type = Activity.class)
    @ModelField(targetType = "Activity")
    private final Activity lastActivity;

    @ModelField(targetType = "String")
    private final String lastActivityBody;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastActivityTime;

    @ModelField(targetType = "ActivityType")
    private final ActivityType lastActivityType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastCallLogged;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastCommentAdded;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastContactAdded;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastEmailSent;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastInCallUpdatedAt;

    @ModelField(targetType = "String")
    private final String lastKnownLocation;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastKnownLocationTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastNoteAdded;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastSmsSent;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastTaskCompleted;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastTaskCreated;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedCommentAndMentions;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedCommentMentions;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedMissedActions;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedNotifications;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedPendingAssignments;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedRecentActivities;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedRecentTasks;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastVisitLogged;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastWhatsappSent;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("AccountMemberActivity", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("AccountMemberActivity", "accountId");
    public static final QueryField USER_ID = QueryField.field("AccountMemberActivity", "userId");
    public static final QueryField LAST_ACTIVITY = QueryField.field("AccountMemberActivity", "lastActivityId");
    public static final QueryField LAST_VIEWED_NOTIFICATIONS = QueryField.field("AccountMemberActivity", "lastViewedNotifications");
    public static final QueryField LAST_VIEWED_COMMENT_MENTIONS = QueryField.field("AccountMemberActivity", "lastViewedCommentMentions");
    public static final QueryField LAST_VIEWED_RECENT_TASKS = QueryField.field("AccountMemberActivity", "lastViewedRecentTasks");
    public static final QueryField LAST_VIEWED_RECENT_ACTIVITIES = QueryField.field("AccountMemberActivity", "lastViewedRecentActivities");
    public static final QueryField LAST_VIEWED_MISSED_ACTIONS = QueryField.field("AccountMemberActivity", "lastViewedMissedActions");
    public static final QueryField LAST_VIEWED_PENDING_ASSIGNMENTS = QueryField.field("AccountMemberActivity", "lastViewedPendingAssignments");
    public static final QueryField LAST_VIEWED_COMMENT_AND_MENTIONS = QueryField.field("AccountMemberActivity", "lastViewedCommentAndMentions");
    public static final QueryField LAST_ACTIVITY_TIME = QueryField.field("AccountMemberActivity", "lastActivityTime");
    public static final QueryField LAST_ACTIVITY_TYPE = QueryField.field("AccountMemberActivity", "lastActivityType");
    public static final QueryField LAST_ACTIVITY_BODY = QueryField.field("AccountMemberActivity", "lastActivityBody");
    public static final QueryField LAST_CALL_LOGGED = QueryField.field("AccountMemberActivity", "lastCallLogged");
    public static final QueryField LAST_NOTE_ADDED = QueryField.field("AccountMemberActivity", "lastNoteAdded");
    public static final QueryField LAST_COMMENT_ADDED = QueryField.field("AccountMemberActivity", "lastCommentAdded");
    public static final QueryField LAST_TASK_COMPLETED = QueryField.field("AccountMemberActivity", "lastTaskCompleted");
    public static final QueryField LAST_TASK_CREATED = QueryField.field("AccountMemberActivity", "lastTaskCreated");
    public static final QueryField LAST_VISIT_LOGGED = QueryField.field("AccountMemberActivity", "lastVisitLogged");
    public static final QueryField LAST_CONTACT_ADDED = QueryField.field("AccountMemberActivity", "lastContactAdded");
    public static final QueryField LAST_EMAIL_SENT = QueryField.field("AccountMemberActivity", "lastEmailSent");
    public static final QueryField LAST_WHATSAPP_SENT = QueryField.field("AccountMemberActivity", "lastWhatsappSent");
    public static final QueryField LAST_SMS_SENT = QueryField.field("AccountMemberActivity", "lastSmsSent");
    public static final QueryField LAST_KNOWN_LOCATION = QueryField.field("AccountMemberActivity", "lastKnownLocation");
    public static final QueryField LAST_KNOWN_LOCATION_TIME = QueryField.field("AccountMemberActivity", "lastKnownLocationTime");
    public static final QueryField IN_CALL = QueryField.field("AccountMemberActivity", "inCall");
    public static final QueryField IN_CALL_WITH_CONTACT_ID = QueryField.field("AccountMemberActivity", "inCallWithContactId");
    public static final QueryField IN_CALL_WITH_CONTACT_NAME = QueryField.field("AccountMemberActivity", "inCallWithContactName");
    public static final QueryField IN_CALL_WITH_CONTACT_NUMBER = QueryField.field("AccountMemberActivity", "inCallWithContactNumber");
    public static final QueryField IN_CALL_REQUESTED_AT = QueryField.field("AccountMemberActivity", "inCallRequestedAt");
    public static final QueryField LAST_IN_CALL_UPDATED_AT = QueryField.field("AccountMemberActivity", "lastInCallUpdatedAt");
    public static final QueryField CALL_PLACEMENT_ID = QueryField.field("AccountMemberActivity", "callPlacementId");
    public static final QueryField CREATED_AT = QueryField.field("AccountMemberActivity", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("AccountMemberActivity", "updatedAt");

    public interface AccountIdStep {
        UserIdStep accountId(String str);
    }

    public interface BuildStep {
        AccountMemberActivity build();

        BuildStep callPlacementId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep inCall(String str);

        BuildStep inCallRequestedAt(Temporal.DateTime dateTime);

        BuildStep inCallWithContactId(String str);

        BuildStep inCallWithContactName(String str);

        BuildStep inCallWithContactNumber(String str);

        BuildStep lastActivity(Activity activity);

        BuildStep lastActivityBody(String str);

        BuildStep lastActivityTime(Temporal.DateTime dateTime);

        BuildStep lastActivityType(ActivityType activityType);

        BuildStep lastCallLogged(Temporal.DateTime dateTime);

        BuildStep lastCommentAdded(Temporal.DateTime dateTime);

        BuildStep lastContactAdded(Temporal.DateTime dateTime);

        BuildStep lastEmailSent(Temporal.DateTime dateTime);

        BuildStep lastInCallUpdatedAt(Temporal.DateTime dateTime);

        BuildStep lastKnownLocation(String str);

        BuildStep lastKnownLocationTime(Temporal.DateTime dateTime);

        BuildStep lastNoteAdded(Temporal.DateTime dateTime);

        BuildStep lastSmsSent(Temporal.DateTime dateTime);

        BuildStep lastTaskCompleted(Temporal.DateTime dateTime);

        BuildStep lastTaskCreated(Temporal.DateTime dateTime);

        BuildStep lastViewedCommentAndMentions(Temporal.DateTime dateTime);

        BuildStep lastViewedCommentMentions(Temporal.DateTime dateTime);

        BuildStep lastViewedMissedActions(Temporal.DateTime dateTime);

        BuildStep lastViewedNotifications(Temporal.DateTime dateTime);

        BuildStep lastViewedPendingAssignments(Temporal.DateTime dateTime);

        BuildStep lastViewedRecentActivities(Temporal.DateTime dateTime);

        BuildStep lastViewedRecentTasks(Temporal.DateTime dateTime);

        BuildStep lastVisitLogged(Temporal.DateTime dateTime);

        BuildStep lastWhatsappSent(Temporal.DateTime dateTime);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, UserIdStep, BuildStep {
        private String accountId;
        private String callPlacementId;
        private Temporal.DateTime createdAt;
        private String id;
        private String inCall;
        private Temporal.DateTime inCallRequestedAt;
        private String inCallWithContactId;
        private String inCallWithContactName;
        private String inCallWithContactNumber;
        private Activity lastActivity;
        private String lastActivityBody;
        private Temporal.DateTime lastActivityTime;
        private ActivityType lastActivityType;
        private Temporal.DateTime lastCallLogged;
        private Temporal.DateTime lastCommentAdded;
        private Temporal.DateTime lastContactAdded;
        private Temporal.DateTime lastEmailSent;
        private Temporal.DateTime lastInCallUpdatedAt;
        private String lastKnownLocation;
        private Temporal.DateTime lastKnownLocationTime;
        private Temporal.DateTime lastNoteAdded;
        private Temporal.DateTime lastSmsSent;
        private Temporal.DateTime lastTaskCompleted;
        private Temporal.DateTime lastTaskCreated;
        private Temporal.DateTime lastViewedCommentAndMentions;
        private Temporal.DateTime lastViewedCommentMentions;
        private Temporal.DateTime lastViewedMissedActions;
        private Temporal.DateTime lastViewedNotifications;
        private Temporal.DateTime lastViewedPendingAssignments;
        private Temporal.DateTime lastViewedRecentActivities;
        private Temporal.DateTime lastViewedRecentTasks;
        private Temporal.DateTime lastVisitLogged;
        private Temporal.DateTime lastWhatsappSent;
        private Temporal.DateTime updatedAt;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.AccountIdStep
        public UserIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public AccountMemberActivity build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new AccountMemberActivity(string, this.accountId, this.userId, this.lastActivity, this.lastViewedNotifications, this.lastViewedCommentMentions, this.lastViewedRecentTasks, this.lastViewedRecentActivities, this.lastViewedMissedActions, this.lastViewedPendingAssignments, this.lastViewedCommentAndMentions, this.lastActivityTime, this.lastActivityType, this.lastActivityBody, this.lastCallLogged, this.lastNoteAdded, this.lastCommentAdded, this.lastTaskCompleted, this.lastTaskCreated, this.lastVisitLogged, this.lastContactAdded, this.lastEmailSent, this.lastWhatsappSent, this.lastSmsSent, this.lastKnownLocation, this.lastKnownLocationTime, this.inCall, this.inCallWithContactId, this.inCallWithContactName, this.inCallWithContactNumber, this.inCallRequestedAt, this.lastInCallUpdatedAt, this.callPlacementId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep callPlacementId(String str) {
            this.callPlacementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep inCall(String str) {
            this.inCall = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep inCallRequestedAt(Temporal.DateTime dateTime) {
            this.inCallRequestedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep inCallWithContactId(String str) {
            this.inCallWithContactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep inCallWithContactName(String str) {
            this.inCallWithContactName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep inCallWithContactNumber(String str) {
            this.inCallWithContactNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastActivity(Activity activity) {
            this.lastActivity = activity;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastActivityBody(String str) {
            this.lastActivityBody = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastActivityTime(Temporal.DateTime dateTime) {
            this.lastActivityTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastActivityType(ActivityType activityType) {
            this.lastActivityType = activityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastCallLogged(Temporal.DateTime dateTime) {
            this.lastCallLogged = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastCommentAdded(Temporal.DateTime dateTime) {
            this.lastCommentAdded = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastContactAdded(Temporal.DateTime dateTime) {
            this.lastContactAdded = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastEmailSent(Temporal.DateTime dateTime) {
            this.lastEmailSent = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastInCallUpdatedAt(Temporal.DateTime dateTime) {
            this.lastInCallUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastKnownLocation(String str) {
            this.lastKnownLocation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastKnownLocationTime(Temporal.DateTime dateTime) {
            this.lastKnownLocationTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastNoteAdded(Temporal.DateTime dateTime) {
            this.lastNoteAdded = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastSmsSent(Temporal.DateTime dateTime) {
            this.lastSmsSent = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastTaskCompleted(Temporal.DateTime dateTime) {
            this.lastTaskCompleted = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastTaskCreated(Temporal.DateTime dateTime) {
            this.lastTaskCreated = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedCommentAndMentions(Temporal.DateTime dateTime) {
            this.lastViewedCommentAndMentions = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedCommentMentions(Temporal.DateTime dateTime) {
            this.lastViewedCommentMentions = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedMissedActions(Temporal.DateTime dateTime) {
            this.lastViewedMissedActions = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedNotifications(Temporal.DateTime dateTime) {
            this.lastViewedNotifications = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedPendingAssignments(Temporal.DateTime dateTime) {
            this.lastViewedPendingAssignments = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedRecentActivities(Temporal.DateTime dateTime) {
            this.lastViewedRecentActivities = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastViewedRecentTasks(Temporal.DateTime dateTime) {
            this.lastViewedRecentTasks = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastVisitLogged(Temporal.DateTime dateTime) {
            this.lastVisitLogged = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep lastWhatsappSent(Temporal.DateTime dateTime) {
            this.lastWhatsappSent = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.UserIdStep
        public BuildStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Activity activity, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, Temporal.DateTime dateTime8, ActivityType activityType, String str4, Temporal.DateTime dateTime9, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, Temporal.DateTime dateTime12, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, Temporal.DateTime dateTime17, Temporal.DateTime dateTime18, String str5, Temporal.DateTime dateTime19, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime20, Temporal.DateTime dateTime21, String str10, Temporal.DateTime dateTime22, Temporal.DateTime dateTime23) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.lastActivity = activity;
            this.lastViewedNotifications = dateTime;
            this.lastViewedCommentMentions = dateTime2;
            this.lastViewedRecentTasks = dateTime3;
            this.lastViewedRecentActivities = dateTime4;
            this.lastViewedMissedActions = dateTime5;
            this.lastViewedPendingAssignments = dateTime6;
            this.lastViewedCommentAndMentions = dateTime7;
            this.lastActivityTime = dateTime8;
            this.lastActivityType = activityType;
            this.lastActivityBody = str4;
            this.lastCallLogged = dateTime9;
            this.lastNoteAdded = dateTime10;
            this.lastCommentAdded = dateTime11;
            this.lastTaskCompleted = dateTime12;
            this.lastTaskCreated = dateTime13;
            this.lastVisitLogged = dateTime14;
            this.lastContactAdded = dateTime15;
            this.lastEmailSent = dateTime16;
            this.lastWhatsappSent = dateTime17;
            this.lastSmsSent = dateTime18;
            this.lastKnownLocation = str5;
            this.lastKnownLocationTime = dateTime19;
            this.inCall = str6;
            this.inCallWithContactId = str7;
            this.inCallWithContactName = str8;
            this.inCallWithContactNumber = str9;
            this.inCallRequestedAt = dateTime20;
            this.lastInCallUpdatedAt = dateTime21;
            this.callPlacementId = str10;
            this.createdAt = dateTime22;
            this.updatedAt = dateTime23;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, Activity activity, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, Temporal.DateTime dateTime8, ActivityType activityType, String str4, Temporal.DateTime dateTime9, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, Temporal.DateTime dateTime12, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, Temporal.DateTime dateTime17, Temporal.DateTime dateTime18, String str5, Temporal.DateTime dateTime19, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime20, Temporal.DateTime dateTime21, String str10, Temporal.DateTime dateTime22, Temporal.DateTime dateTime23) {
            super(str, str2, str3, activity, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, dateTime6, dateTime7, dateTime8, activityType, str4, dateTime9, dateTime10, dateTime11, dateTime12, dateTime13, dateTime14, dateTime15, dateTime16, dateTime17, dateTime18, str5, dateTime19, str6, str7, str8, str9, dateTime20, dateTime21, str10, dateTime22, dateTime23);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder callPlacementId(String str) {
            return (CopyOfBuilder) super.callPlacementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder inCall(String str) {
            return (CopyOfBuilder) super.inCall(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder inCallRequestedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.inCallRequestedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder inCallWithContactId(String str) {
            return (CopyOfBuilder) super.inCallWithContactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder inCallWithContactName(String str) {
            return (CopyOfBuilder) super.inCallWithContactName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder inCallWithContactNumber(String str) {
            return (CopyOfBuilder) super.inCallWithContactNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastActivity(Activity activity) {
            return (CopyOfBuilder) super.lastActivity(activity);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastActivityBody(String str) {
            return (CopyOfBuilder) super.lastActivityBody(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastActivityTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastActivityTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastActivityType(ActivityType activityType) {
            return (CopyOfBuilder) super.lastActivityType(activityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastCallLogged(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastCallLogged(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastCommentAdded(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastCommentAdded(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastContactAdded(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastContactAdded(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastEmailSent(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastEmailSent(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastInCallUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastInCallUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastKnownLocation(String str) {
            return (CopyOfBuilder) super.lastKnownLocation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastKnownLocationTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastKnownLocationTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastNoteAdded(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastNoteAdded(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastSmsSent(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastSmsSent(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastTaskCompleted(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastTaskCompleted(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastTaskCreated(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastTaskCreated(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedCommentAndMentions(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedCommentAndMentions(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedCommentMentions(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedCommentMentions(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedMissedActions(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedMissedActions(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedNotifications(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedNotifications(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedPendingAssignments(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedPendingAssignments(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedRecentActivities(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedRecentActivities(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastViewedRecentTasks(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedRecentTasks(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastVisitLogged(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastVisitLogged(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder lastWhatsappSent(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastWhatsappSent(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMemberActivity.Builder, com.amplifyframework.datastore.generated.model.AccountMemberActivity.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface UserIdStep {
        BuildStep userId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static AccountMemberActivity justId(String str) {
        return new AccountMemberActivity(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.lastActivity, this.lastViewedNotifications, this.lastViewedCommentMentions, this.lastViewedRecentTasks, this.lastViewedRecentActivities, this.lastViewedMissedActions, this.lastViewedPendingAssignments, this.lastViewedCommentAndMentions, this.lastActivityTime, this.lastActivityType, this.lastActivityBody, this.lastCallLogged, this.lastNoteAdded, this.lastCommentAdded, this.lastTaskCompleted, this.lastTaskCreated, this.lastVisitLogged, this.lastContactAdded, this.lastEmailSent, this.lastWhatsappSent, this.lastSmsSent, this.lastKnownLocation, this.lastKnownLocationTime, this.inCall, this.inCallWithContactId, this.inCallWithContactName, this.inCallWithContactNumber, this.inCallRequestedAt, this.lastInCallUpdatedAt, this.callPlacementId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountMemberActivity.class != obj.getClass()) {
            return false;
        }
        AccountMemberActivity accountMemberActivity = (AccountMemberActivity) obj;
        return s6c.m47909a(getId(), accountMemberActivity.getId()) && s6c.m47909a(getAccountId(), accountMemberActivity.getAccountId()) && s6c.m47909a(getUserId(), accountMemberActivity.getUserId()) && s6c.m47909a(getLastActivity(), accountMemberActivity.getLastActivity()) && s6c.m47909a(getLastViewedNotifications(), accountMemberActivity.getLastViewedNotifications()) && s6c.m47909a(getLastViewedCommentMentions(), accountMemberActivity.getLastViewedCommentMentions()) && s6c.m47909a(getLastViewedRecentTasks(), accountMemberActivity.getLastViewedRecentTasks()) && s6c.m47909a(getLastViewedRecentActivities(), accountMemberActivity.getLastViewedRecentActivities()) && s6c.m47909a(getLastViewedMissedActions(), accountMemberActivity.getLastViewedMissedActions()) && s6c.m47909a(getLastViewedPendingAssignments(), accountMemberActivity.getLastViewedPendingAssignments()) && s6c.m47909a(getLastViewedCommentAndMentions(), accountMemberActivity.getLastViewedCommentAndMentions()) && s6c.m47909a(getLastActivityTime(), accountMemberActivity.getLastActivityTime()) && s6c.m47909a(getLastActivityType(), accountMemberActivity.getLastActivityType()) && s6c.m47909a(getLastActivityBody(), accountMemberActivity.getLastActivityBody()) && s6c.m47909a(getLastCallLogged(), accountMemberActivity.getLastCallLogged()) && s6c.m47909a(getLastNoteAdded(), accountMemberActivity.getLastNoteAdded()) && s6c.m47909a(getLastCommentAdded(), accountMemberActivity.getLastCommentAdded()) && s6c.m47909a(getLastTaskCompleted(), accountMemberActivity.getLastTaskCompleted()) && s6c.m47909a(getLastTaskCreated(), accountMemberActivity.getLastTaskCreated()) && s6c.m47909a(getLastVisitLogged(), accountMemberActivity.getLastVisitLogged()) && s6c.m47909a(getLastContactAdded(), accountMemberActivity.getLastContactAdded()) && s6c.m47909a(getLastEmailSent(), accountMemberActivity.getLastEmailSent()) && s6c.m47909a(getLastWhatsappSent(), accountMemberActivity.getLastWhatsappSent()) && s6c.m47909a(getLastSmsSent(), accountMemberActivity.getLastSmsSent()) && s6c.m47909a(getLastKnownLocation(), accountMemberActivity.getLastKnownLocation()) && s6c.m47909a(getLastKnownLocationTime(), accountMemberActivity.getLastKnownLocationTime()) && s6c.m47909a(getInCall(), accountMemberActivity.getInCall()) && s6c.m47909a(getInCallWithContactId(), accountMemberActivity.getInCallWithContactId()) && s6c.m47909a(getInCallWithContactName(), accountMemberActivity.getInCallWithContactName()) && s6c.m47909a(getInCallWithContactNumber(), accountMemberActivity.getInCallWithContactNumber()) && s6c.m47909a(getInCallRequestedAt(), accountMemberActivity.getInCallRequestedAt()) && s6c.m47909a(getLastInCallUpdatedAt(), accountMemberActivity.getLastInCallUpdatedAt()) && s6c.m47909a(getCallPlacementId(), accountMemberActivity.getCallPlacementId()) && s6c.m47909a(getCreatedAt(), accountMemberActivity.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), accountMemberActivity.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCallPlacementId() {
        return this.callPlacementId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public String getInCall() {
        return this.inCall;
    }

    public Temporal.DateTime getInCallRequestedAt() {
        return this.inCallRequestedAt;
    }

    public String getInCallWithContactId() {
        return this.inCallWithContactId;
    }

    public String getInCallWithContactName() {
        return this.inCallWithContactName;
    }

    public String getInCallWithContactNumber() {
        return this.inCallWithContactNumber;
    }

    public Activity getLastActivity() {
        return this.lastActivity;
    }

    public String getLastActivityBody() {
        return this.lastActivityBody;
    }

    public Temporal.DateTime getLastActivityTime() {
        return this.lastActivityTime;
    }

    public ActivityType getLastActivityType() {
        return this.lastActivityType;
    }

    public Temporal.DateTime getLastCallLogged() {
        return this.lastCallLogged;
    }

    public Temporal.DateTime getLastCommentAdded() {
        return this.lastCommentAdded;
    }

    public Temporal.DateTime getLastContactAdded() {
        return this.lastContactAdded;
    }

    public Temporal.DateTime getLastEmailSent() {
        return this.lastEmailSent;
    }

    public Temporal.DateTime getLastInCallUpdatedAt() {
        return this.lastInCallUpdatedAt;
    }

    public String getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public Temporal.DateTime getLastKnownLocationTime() {
        return this.lastKnownLocationTime;
    }

    public Temporal.DateTime getLastNoteAdded() {
        return this.lastNoteAdded;
    }

    public Temporal.DateTime getLastSmsSent() {
        return this.lastSmsSent;
    }

    public Temporal.DateTime getLastTaskCompleted() {
        return this.lastTaskCompleted;
    }

    public Temporal.DateTime getLastTaskCreated() {
        return this.lastTaskCreated;
    }

    public Temporal.DateTime getLastViewedCommentAndMentions() {
        return this.lastViewedCommentAndMentions;
    }

    public Temporal.DateTime getLastViewedCommentMentions() {
        return this.lastViewedCommentMentions;
    }

    public Temporal.DateTime getLastViewedMissedActions() {
        return this.lastViewedMissedActions;
    }

    public Temporal.DateTime getLastViewedNotifications() {
        return this.lastViewedNotifications;
    }

    public Temporal.DateTime getLastViewedPendingAssignments() {
        return this.lastViewedPendingAssignments;
    }

    public Temporal.DateTime getLastViewedRecentActivities() {
        return this.lastViewedRecentActivities;
    }

    public Temporal.DateTime getLastViewedRecentTasks() {
        return this.lastViewedRecentTasks;
    }

    public Temporal.DateTime getLastVisitLogged() {
        return this.lastVisitLogged;
    }

    public Temporal.DateTime getLastWhatsappSent() {
        return this.lastWhatsappSent;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getLastActivity() + getLastViewedNotifications() + getLastViewedCommentMentions() + getLastViewedRecentTasks() + getLastViewedRecentActivities() + getLastViewedMissedActions() + getLastViewedPendingAssignments() + getLastViewedCommentAndMentions() + getLastActivityTime() + getLastActivityType() + getLastActivityBody() + getLastCallLogged() + getLastNoteAdded() + getLastCommentAdded() + getLastTaskCompleted() + getLastTaskCreated() + getLastVisitLogged() + getLastContactAdded() + getLastEmailSent() + getLastWhatsappSent() + getLastSmsSent() + getLastKnownLocation() + getLastKnownLocationTime() + getInCall() + getInCallWithContactId() + getInCallWithContactName() + getInCallWithContactNumber() + getInCallRequestedAt() + getLastInCallUpdatedAt() + getCallPlacementId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountMemberActivity {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("lastActivity=" + String.valueOf(getLastActivity()) + ", ");
        sb.append("lastViewedNotifications=" + String.valueOf(getLastViewedNotifications()) + ", ");
        sb.append("lastViewedCommentMentions=" + String.valueOf(getLastViewedCommentMentions()) + ", ");
        sb.append("lastViewedRecentTasks=" + String.valueOf(getLastViewedRecentTasks()) + ", ");
        sb.append("lastViewedRecentActivities=" + String.valueOf(getLastViewedRecentActivities()) + ", ");
        sb.append("lastViewedMissedActions=" + String.valueOf(getLastViewedMissedActions()) + ", ");
        sb.append("lastViewedPendingAssignments=" + String.valueOf(getLastViewedPendingAssignments()) + ", ");
        sb.append("lastViewedCommentAndMentions=" + String.valueOf(getLastViewedCommentAndMentions()) + ", ");
        sb.append("lastActivityTime=" + String.valueOf(getLastActivityTime()) + ", ");
        sb.append("lastActivityType=" + String.valueOf(getLastActivityType()) + ", ");
        sb.append("lastActivityBody=" + String.valueOf(getLastActivityBody()) + ", ");
        sb.append("lastCallLogged=" + String.valueOf(getLastCallLogged()) + ", ");
        sb.append("lastNoteAdded=" + String.valueOf(getLastNoteAdded()) + ", ");
        sb.append("lastCommentAdded=" + String.valueOf(getLastCommentAdded()) + ", ");
        sb.append("lastTaskCompleted=" + String.valueOf(getLastTaskCompleted()) + ", ");
        sb.append("lastTaskCreated=" + String.valueOf(getLastTaskCreated()) + ", ");
        sb.append("lastVisitLogged=" + String.valueOf(getLastVisitLogged()) + ", ");
        sb.append("lastContactAdded=" + String.valueOf(getLastContactAdded()) + ", ");
        sb.append("lastEmailSent=" + String.valueOf(getLastEmailSent()) + ", ");
        sb.append("lastWhatsappSent=" + String.valueOf(getLastWhatsappSent()) + ", ");
        sb.append("lastSmsSent=" + String.valueOf(getLastSmsSent()) + ", ");
        sb.append("lastKnownLocation=" + String.valueOf(getLastKnownLocation()) + ", ");
        sb.append("lastKnownLocationTime=" + String.valueOf(getLastKnownLocationTime()) + ", ");
        sb.append("inCall=" + String.valueOf(getInCall()) + ", ");
        sb.append("inCallWithContactId=" + String.valueOf(getInCallWithContactId()) + ", ");
        sb.append("inCallWithContactName=" + String.valueOf(getInCallWithContactName()) + ", ");
        sb.append("inCallWithContactNumber=" + String.valueOf(getInCallWithContactNumber()) + ", ");
        sb.append("inCallRequestedAt=" + String.valueOf(getInCallRequestedAt()) + ", ");
        sb.append("lastInCallUpdatedAt=" + String.valueOf(getLastInCallUpdatedAt()) + ", ");
        sb.append("callPlacementId=" + String.valueOf(getCallPlacementId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private AccountMemberActivity(String str, String str2, String str3, Activity activity, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, Temporal.DateTime dateTime8, ActivityType activityType, String str4, Temporal.DateTime dateTime9, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, Temporal.DateTime dateTime12, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, Temporal.DateTime dateTime17, Temporal.DateTime dateTime18, String str5, Temporal.DateTime dateTime19, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime20, Temporal.DateTime dateTime21, String str10, Temporal.DateTime dateTime22, Temporal.DateTime dateTime23) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.lastActivity = activity;
        this.lastViewedNotifications = dateTime;
        this.lastViewedCommentMentions = dateTime2;
        this.lastViewedRecentTasks = dateTime3;
        this.lastViewedRecentActivities = dateTime4;
        this.lastViewedMissedActions = dateTime5;
        this.lastViewedPendingAssignments = dateTime6;
        this.lastViewedCommentAndMentions = dateTime7;
        this.lastActivityTime = dateTime8;
        this.lastActivityType = activityType;
        this.lastActivityBody = str4;
        this.lastCallLogged = dateTime9;
        this.lastNoteAdded = dateTime10;
        this.lastCommentAdded = dateTime11;
        this.lastTaskCompleted = dateTime12;
        this.lastTaskCreated = dateTime13;
        this.lastVisitLogged = dateTime14;
        this.lastContactAdded = dateTime15;
        this.lastEmailSent = dateTime16;
        this.lastWhatsappSent = dateTime17;
        this.lastSmsSent = dateTime18;
        this.lastKnownLocation = str5;
        this.lastKnownLocationTime = dateTime19;
        this.inCall = str6;
        this.inCallWithContactId = str7;
        this.inCallWithContactName = str8;
        this.inCallWithContactNumber = str9;
        this.inCallRequestedAt = dateTime20;
        this.lastInCallUpdatedAt = dateTime21;
        this.callPlacementId = str10;
        this.createdAt = dateTime22;
        this.updatedAt = dateTime23;
    }
}
