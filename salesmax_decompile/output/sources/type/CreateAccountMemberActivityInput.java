package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateAccountMemberActivityInput implements InputType {
    private final String accountId;
    private final Input<String> callPlacementId;
    private final Input<String> createdAt;
    private final Input<String> inCall;
    private final Input<String> inCallRequestedAt;
    private final Input<String> inCallWithContactId;
    private final Input<String> inCallWithContactName;
    private final Input<String> inCallWithContactNumber;
    private final Input<String> lastActivityBody;
    private final Input<String> lastActivityId;
    private final Input<String> lastActivityTime;
    private final Input<ActivityType> lastActivityType;
    private final Input<String> lastCallLogged;
    private final Input<String> lastCommentAdded;
    private final Input<String> lastContactAdded;
    private final Input<String> lastEmailSent;
    private final Input<String> lastInCallUpdatedAt;
    private final Input<String> lastKnownLocation;
    private final Input<String> lastKnownLocationTime;
    private final Input<String> lastNoteAdded;
    private final Input<String> lastSmsSent;
    private final Input<String> lastTaskCompleted;
    private final Input<String> lastTaskCreated;
    private final Input<String> lastViewedCommentAndMentions;
    private final Input<String> lastViewedCommentMentions;
    private final Input<String> lastViewedMissedActions;
    private final Input<String> lastViewedNotifications;
    private final Input<String> lastViewedPendingAssignments;
    private final Input<String> lastViewedRecentActivities;
    private final Input<String> lastViewedRecentTasks;
    private final Input<String> lastVisitLogged;
    private final Input<String> lastWhatsappSent;
    private final Input<String> updatedAt;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String userId;
        private Input<String> lastActivityId = Input.absent();
        private Input<String> lastViewedNotifications = Input.absent();
        private Input<String> lastViewedCommentMentions = Input.absent();
        private Input<String> lastViewedRecentTasks = Input.absent();
        private Input<String> lastViewedRecentActivities = Input.absent();
        private Input<String> lastViewedMissedActions = Input.absent();
        private Input<String> lastViewedPendingAssignments = Input.absent();
        private Input<String> lastViewedCommentAndMentions = Input.absent();
        private Input<String> lastActivityTime = Input.absent();
        private Input<ActivityType> lastActivityType = Input.absent();
        private Input<String> lastActivityBody = Input.absent();
        private Input<String> lastCallLogged = Input.absent();
        private Input<String> lastNoteAdded = Input.absent();
        private Input<String> lastCommentAdded = Input.absent();
        private Input<String> lastTaskCompleted = Input.absent();
        private Input<String> lastTaskCreated = Input.absent();
        private Input<String> lastVisitLogged = Input.absent();
        private Input<String> lastContactAdded = Input.absent();
        private Input<String> lastEmailSent = Input.absent();
        private Input<String> lastWhatsappSent = Input.absent();
        private Input<String> lastSmsSent = Input.absent();
        private Input<String> lastKnownLocation = Input.absent();
        private Input<String> lastKnownLocationTime = Input.absent();
        private Input<String> inCall = Input.absent();
        private Input<String> inCallWithContactId = Input.absent();
        private Input<String> inCallWithContactName = Input.absent();
        private Input<String> inCallWithContactNumber = Input.absent();
        private Input<String> inCallRequestedAt = Input.absent();
        private Input<String> lastInCallUpdatedAt = Input.absent();
        private Input<String> callPlacementId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateAccountMemberActivityInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new CreateAccountMemberActivityInput(this.accountId, this.userId, this.lastActivityId, this.lastViewedNotifications, this.lastViewedCommentMentions, this.lastViewedRecentTasks, this.lastViewedRecentActivities, this.lastViewedMissedActions, this.lastViewedPendingAssignments, this.lastViewedCommentAndMentions, this.lastActivityTime, this.lastActivityType, this.lastActivityBody, this.lastCallLogged, this.lastNoteAdded, this.lastCommentAdded, this.lastTaskCompleted, this.lastTaskCreated, this.lastVisitLogged, this.lastContactAdded, this.lastEmailSent, this.lastWhatsappSent, this.lastSmsSent, this.lastKnownLocation, this.lastKnownLocationTime, this.inCall, this.inCallWithContactId, this.inCallWithContactName, this.inCallWithContactNumber, this.inCallRequestedAt, this.lastInCallUpdatedAt, this.callPlacementId, this.createdAt, this.updatedAt);
        }

        public Builder callPlacementId(String str) {
            this.callPlacementId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder inCall(String str) {
            this.inCall = Input.fromNullable(str);
            return this;
        }

        public Builder inCallRequestedAt(String str) {
            this.inCallRequestedAt = Input.fromNullable(str);
            return this;
        }

        public Builder inCallWithContactId(String str) {
            this.inCallWithContactId = Input.fromNullable(str);
            return this;
        }

        public Builder inCallWithContactName(String str) {
            this.inCallWithContactName = Input.fromNullable(str);
            return this;
        }

        public Builder inCallWithContactNumber(String str) {
            this.inCallWithContactNumber = Input.fromNullable(str);
            return this;
        }

        public Builder lastActivityBody(String str) {
            this.lastActivityBody = Input.fromNullable(str);
            return this;
        }

        public Builder lastActivityId(String str) {
            this.lastActivityId = Input.fromNullable(str);
            return this;
        }

        public Builder lastActivityTime(String str) {
            this.lastActivityTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastActivityType(ActivityType activityType) {
            this.lastActivityType = Input.fromNullable(activityType);
            return this;
        }

        public Builder lastCallLogged(String str) {
            this.lastCallLogged = Input.fromNullable(str);
            return this;
        }

        public Builder lastCommentAdded(String str) {
            this.lastCommentAdded = Input.fromNullable(str);
            return this;
        }

        public Builder lastContactAdded(String str) {
            this.lastContactAdded = Input.fromNullable(str);
            return this;
        }

        public Builder lastEmailSent(String str) {
            this.lastEmailSent = Input.fromNullable(str);
            return this;
        }

        public Builder lastInCallUpdatedAt(String str) {
            this.lastInCallUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder lastKnownLocation(String str) {
            this.lastKnownLocation = Input.fromNullable(str);
            return this;
        }

        public Builder lastKnownLocationTime(String str) {
            this.lastKnownLocationTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastNoteAdded(String str) {
            this.lastNoteAdded = Input.fromNullable(str);
            return this;
        }

        public Builder lastSmsSent(String str) {
            this.lastSmsSent = Input.fromNullable(str);
            return this;
        }

        public Builder lastTaskCompleted(String str) {
            this.lastTaskCompleted = Input.fromNullable(str);
            return this;
        }

        public Builder lastTaskCreated(String str) {
            this.lastTaskCreated = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedCommentAndMentions(String str) {
            this.lastViewedCommentAndMentions = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedCommentMentions(String str) {
            this.lastViewedCommentMentions = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedMissedActions(String str) {
            this.lastViewedMissedActions = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedNotifications(String str) {
            this.lastViewedNotifications = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedPendingAssignments(String str) {
            this.lastViewedPendingAssignments = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedRecentActivities(String str) {
            this.lastViewedRecentActivities = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewedRecentTasks(String str) {
            this.lastViewedRecentTasks = Input.fromNullable(str);
            return this;
        }

        public Builder lastVisitLogged(String str) {
            this.lastVisitLogged = Input.fromNullable(str);
            return this;
        }

        public Builder lastWhatsappSent(String str) {
            this.lastWhatsappSent = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public CreateAccountMemberActivityInput(String str, String str2, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<ActivityType> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<String> input26, Input<String> input27, Input<String> input28, Input<String> input29, Input<String> input30, Input<String> input31, Input<String> input32) {
        this.accountId = str;
        this.userId = str2;
        this.lastActivityId = input;
        this.lastViewedNotifications = input2;
        this.lastViewedCommentMentions = input3;
        this.lastViewedRecentTasks = input4;
        this.lastViewedRecentActivities = input5;
        this.lastViewedMissedActions = input6;
        this.lastViewedPendingAssignments = input7;
        this.lastViewedCommentAndMentions = input8;
        this.lastActivityTime = input9;
        this.lastActivityType = input10;
        this.lastActivityBody = input11;
        this.lastCallLogged = input12;
        this.lastNoteAdded = input13;
        this.lastCommentAdded = input14;
        this.lastTaskCompleted = input15;
        this.lastTaskCreated = input16;
        this.lastVisitLogged = input17;
        this.lastContactAdded = input18;
        this.lastEmailSent = input19;
        this.lastWhatsappSent = input20;
        this.lastSmsSent = input21;
        this.lastKnownLocation = input22;
        this.lastKnownLocationTime = input23;
        this.inCall = input24;
        this.inCallWithContactId = input25;
        this.inCallWithContactName = input26;
        this.inCallWithContactNumber = input27;
        this.inCallRequestedAt = input28;
        this.lastInCallUpdatedAt = input29;
        this.callPlacementId = input30;
        this.createdAt = input31;
        this.updatedAt = input32;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String callPlacementId() {
        return this.callPlacementId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String inCall() {
        return this.inCall.value;
    }

    public String inCallRequestedAt() {
        return this.inCallRequestedAt.value;
    }

    public String inCallWithContactId() {
        return this.inCallWithContactId.value;
    }

    public String inCallWithContactName() {
        return this.inCallWithContactName.value;
    }

    public String inCallWithContactNumber() {
        return this.inCallWithContactNumber.value;
    }

    public String lastActivityBody() {
        return this.lastActivityBody.value;
    }

    public String lastActivityId() {
        return this.lastActivityId.value;
    }

    public String lastActivityTime() {
        return this.lastActivityTime.value;
    }

    public ActivityType lastActivityType() {
        return this.lastActivityType.value;
    }

    public String lastCallLogged() {
        return this.lastCallLogged.value;
    }

    public String lastCommentAdded() {
        return this.lastCommentAdded.value;
    }

    public String lastContactAdded() {
        return this.lastContactAdded.value;
    }

    public String lastEmailSent() {
        return this.lastEmailSent.value;
    }

    public String lastInCallUpdatedAt() {
        return this.lastInCallUpdatedAt.value;
    }

    public String lastKnownLocation() {
        return this.lastKnownLocation.value;
    }

    public String lastKnownLocationTime() {
        return this.lastKnownLocationTime.value;
    }

    public String lastNoteAdded() {
        return this.lastNoteAdded.value;
    }

    public String lastSmsSent() {
        return this.lastSmsSent.value;
    }

    public String lastTaskCompleted() {
        return this.lastTaskCompleted.value;
    }

    public String lastTaskCreated() {
        return this.lastTaskCreated.value;
    }

    public String lastViewedCommentAndMentions() {
        return this.lastViewedCommentAndMentions.value;
    }

    public String lastViewedCommentMentions() {
        return this.lastViewedCommentMentions.value;
    }

    public String lastViewedMissedActions() {
        return this.lastViewedMissedActions.value;
    }

    public String lastViewedNotifications() {
        return this.lastViewedNotifications.value;
    }

    public String lastViewedPendingAssignments() {
        return this.lastViewedPendingAssignments.value;
    }

    public String lastViewedRecentActivities() {
        return this.lastViewedRecentActivities.value;
    }

    public String lastViewedRecentTasks() {
        return this.lastViewedRecentTasks.value;
    }

    public String lastVisitLogged() {
        return this.lastVisitLogged.value;
    }

    public String lastWhatsappSent() {
        return this.lastWhatsappSent.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateAccountMemberActivityInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", CreateAccountMemberActivityInput.this.accountId);
                inputFieldWriter.writeString("userId", CreateAccountMemberActivityInput.this.userId);
                if (CreateAccountMemberActivityInput.this.lastActivityId.defined) {
                    inputFieldWriter.writeString("lastActivityId", (String) CreateAccountMemberActivityInput.this.lastActivityId.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedNotifications.defined) {
                    inputFieldWriter.writeString("lastViewedNotifications", (String) CreateAccountMemberActivityInput.this.lastViewedNotifications.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedCommentMentions.defined) {
                    inputFieldWriter.writeString("lastViewedCommentMentions", (String) CreateAccountMemberActivityInput.this.lastViewedCommentMentions.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedRecentTasks.defined) {
                    inputFieldWriter.writeString("lastViewedRecentTasks", (String) CreateAccountMemberActivityInput.this.lastViewedRecentTasks.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedRecentActivities.defined) {
                    inputFieldWriter.writeString("lastViewedRecentActivities", (String) CreateAccountMemberActivityInput.this.lastViewedRecentActivities.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedMissedActions.defined) {
                    inputFieldWriter.writeString("lastViewedMissedActions", (String) CreateAccountMemberActivityInput.this.lastViewedMissedActions.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedPendingAssignments.defined) {
                    inputFieldWriter.writeString("lastViewedPendingAssignments", (String) CreateAccountMemberActivityInput.this.lastViewedPendingAssignments.value);
                }
                if (CreateAccountMemberActivityInput.this.lastViewedCommentAndMentions.defined) {
                    inputFieldWriter.writeString("lastViewedCommentAndMentions", (String) CreateAccountMemberActivityInput.this.lastViewedCommentAndMentions.value);
                }
                if (CreateAccountMemberActivityInput.this.lastActivityTime.defined) {
                    inputFieldWriter.writeString("lastActivityTime", (String) CreateAccountMemberActivityInput.this.lastActivityTime.value);
                }
                if (CreateAccountMemberActivityInput.this.lastActivityType.defined) {
                    inputFieldWriter.writeString("lastActivityType", CreateAccountMemberActivityInput.this.lastActivityType.value != 0 ? ((ActivityType) CreateAccountMemberActivityInput.this.lastActivityType.value).name() : null);
                }
                if (CreateAccountMemberActivityInput.this.lastActivityBody.defined) {
                    inputFieldWriter.writeString("lastActivityBody", (String) CreateAccountMemberActivityInput.this.lastActivityBody.value);
                }
                if (CreateAccountMemberActivityInput.this.lastCallLogged.defined) {
                    inputFieldWriter.writeString("lastCallLogged", (String) CreateAccountMemberActivityInput.this.lastCallLogged.value);
                }
                if (CreateAccountMemberActivityInput.this.lastNoteAdded.defined) {
                    inputFieldWriter.writeString("lastNoteAdded", (String) CreateAccountMemberActivityInput.this.lastNoteAdded.value);
                }
                if (CreateAccountMemberActivityInput.this.lastCommentAdded.defined) {
                    inputFieldWriter.writeString("lastCommentAdded", (String) CreateAccountMemberActivityInput.this.lastCommentAdded.value);
                }
                if (CreateAccountMemberActivityInput.this.lastTaskCompleted.defined) {
                    inputFieldWriter.writeString("lastTaskCompleted", (String) CreateAccountMemberActivityInput.this.lastTaskCompleted.value);
                }
                if (CreateAccountMemberActivityInput.this.lastTaskCreated.defined) {
                    inputFieldWriter.writeString("lastTaskCreated", (String) CreateAccountMemberActivityInput.this.lastTaskCreated.value);
                }
                if (CreateAccountMemberActivityInput.this.lastVisitLogged.defined) {
                    inputFieldWriter.writeString("lastVisitLogged", (String) CreateAccountMemberActivityInput.this.lastVisitLogged.value);
                }
                if (CreateAccountMemberActivityInput.this.lastContactAdded.defined) {
                    inputFieldWriter.writeString("lastContactAdded", (String) CreateAccountMemberActivityInput.this.lastContactAdded.value);
                }
                if (CreateAccountMemberActivityInput.this.lastEmailSent.defined) {
                    inputFieldWriter.writeString("lastEmailSent", (String) CreateAccountMemberActivityInput.this.lastEmailSent.value);
                }
                if (CreateAccountMemberActivityInput.this.lastWhatsappSent.defined) {
                    inputFieldWriter.writeString("lastWhatsappSent", (String) CreateAccountMemberActivityInput.this.lastWhatsappSent.value);
                }
                if (CreateAccountMemberActivityInput.this.lastSmsSent.defined) {
                    inputFieldWriter.writeString("lastSmsSent", (String) CreateAccountMemberActivityInput.this.lastSmsSent.value);
                }
                if (CreateAccountMemberActivityInput.this.lastKnownLocation.defined) {
                    inputFieldWriter.writeString("lastKnownLocation", (String) CreateAccountMemberActivityInput.this.lastKnownLocation.value);
                }
                if (CreateAccountMemberActivityInput.this.lastKnownLocationTime.defined) {
                    inputFieldWriter.writeString("lastKnownLocationTime", (String) CreateAccountMemberActivityInput.this.lastKnownLocationTime.value);
                }
                if (CreateAccountMemberActivityInput.this.inCall.defined) {
                    inputFieldWriter.writeString("inCall", (String) CreateAccountMemberActivityInput.this.inCall.value);
                }
                if (CreateAccountMemberActivityInput.this.inCallWithContactId.defined) {
                    inputFieldWriter.writeString("inCallWithContactId", (String) CreateAccountMemberActivityInput.this.inCallWithContactId.value);
                }
                if (CreateAccountMemberActivityInput.this.inCallWithContactName.defined) {
                    inputFieldWriter.writeString("inCallWithContactName", (String) CreateAccountMemberActivityInput.this.inCallWithContactName.value);
                }
                if (CreateAccountMemberActivityInput.this.inCallWithContactNumber.defined) {
                    inputFieldWriter.writeString("inCallWithContactNumber", (String) CreateAccountMemberActivityInput.this.inCallWithContactNumber.value);
                }
                if (CreateAccountMemberActivityInput.this.inCallRequestedAt.defined) {
                    inputFieldWriter.writeString("inCallRequestedAt", (String) CreateAccountMemberActivityInput.this.inCallRequestedAt.value);
                }
                if (CreateAccountMemberActivityInput.this.lastInCallUpdatedAt.defined) {
                    inputFieldWriter.writeString("lastInCallUpdatedAt", (String) CreateAccountMemberActivityInput.this.lastInCallUpdatedAt.value);
                }
                if (CreateAccountMemberActivityInput.this.callPlacementId.defined) {
                    inputFieldWriter.writeString("callPlacementId", (String) CreateAccountMemberActivityInput.this.callPlacementId.value);
                }
                if (CreateAccountMemberActivityInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateAccountMemberActivityInput.this.createdAt.value);
                }
                if (CreateAccountMemberActivityInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateAccountMemberActivityInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userId() {
        return this.userId;
    }
}
