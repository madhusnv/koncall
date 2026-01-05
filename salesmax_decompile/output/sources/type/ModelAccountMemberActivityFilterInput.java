package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountMemberActivityFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelAccountMemberActivityFilterInput>> and;
    private final Input<ModelIDInput> callPlacementId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> inCall;
    private final Input<ModelStringInput> inCallRequestedAt;
    private final Input<ModelIDInput> inCallWithContactId;
    private final Input<ModelStringInput> inCallWithContactName;
    private final Input<ModelStringInput> inCallWithContactNumber;
    private final Input<ModelStringInput> lastActivityBody;
    private final Input<ModelIDInput> lastActivityId;
    private final Input<ModelStringInput> lastActivityTime;
    private final Input<ModelActivityTypeInput> lastActivityType;
    private final Input<ModelStringInput> lastCallLogged;
    private final Input<ModelStringInput> lastCommentAdded;
    private final Input<ModelStringInput> lastContactAdded;
    private final Input<ModelStringInput> lastEmailSent;
    private final Input<ModelStringInput> lastInCallUpdatedAt;
    private final Input<ModelStringInput> lastKnownLocation;
    private final Input<ModelStringInput> lastKnownLocationTime;
    private final Input<ModelStringInput> lastNoteAdded;
    private final Input<ModelStringInput> lastSmsSent;
    private final Input<ModelStringInput> lastTaskCompleted;
    private final Input<ModelStringInput> lastTaskCreated;
    private final Input<ModelStringInput> lastViewedCommentAndMentions;
    private final Input<ModelStringInput> lastViewedCommentMentions;
    private final Input<ModelStringInput> lastViewedMissedActions;
    private final Input<ModelStringInput> lastViewedNotifications;
    private final Input<ModelStringInput> lastViewedPendingAssignments;
    private final Input<ModelStringInput> lastViewedRecentActivities;
    private final Input<ModelStringInput> lastViewedRecentTasks;
    private final Input<ModelStringInput> lastVisitLogged;
    private final Input<ModelStringInput> lastWhatsappSent;
    private final Input<ModelAccountMemberActivityFilterInput> not;
    private final Input<List<ModelAccountMemberActivityFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> lastActivityId = Input.absent();
        private Input<ModelStringInput> lastViewedNotifications = Input.absent();
        private Input<ModelStringInput> lastViewedCommentMentions = Input.absent();
        private Input<ModelStringInput> lastViewedRecentTasks = Input.absent();
        private Input<ModelStringInput> lastViewedRecentActivities = Input.absent();
        private Input<ModelStringInput> lastViewedMissedActions = Input.absent();
        private Input<ModelStringInput> lastViewedPendingAssignments = Input.absent();
        private Input<ModelStringInput> lastViewedCommentAndMentions = Input.absent();
        private Input<ModelStringInput> lastActivityTime = Input.absent();
        private Input<ModelActivityTypeInput> lastActivityType = Input.absent();
        private Input<ModelStringInput> lastActivityBody = Input.absent();
        private Input<ModelStringInput> lastCallLogged = Input.absent();
        private Input<ModelStringInput> lastNoteAdded = Input.absent();
        private Input<ModelStringInput> lastCommentAdded = Input.absent();
        private Input<ModelStringInput> lastTaskCompleted = Input.absent();
        private Input<ModelStringInput> lastTaskCreated = Input.absent();
        private Input<ModelStringInput> lastVisitLogged = Input.absent();
        private Input<ModelStringInput> lastContactAdded = Input.absent();
        private Input<ModelStringInput> lastEmailSent = Input.absent();
        private Input<ModelStringInput> lastWhatsappSent = Input.absent();
        private Input<ModelStringInput> lastSmsSent = Input.absent();
        private Input<ModelStringInput> lastKnownLocation = Input.absent();
        private Input<ModelStringInput> lastKnownLocationTime = Input.absent();
        private Input<ModelStringInput> inCall = Input.absent();
        private Input<ModelIDInput> inCallWithContactId = Input.absent();
        private Input<ModelStringInput> inCallWithContactName = Input.absent();
        private Input<ModelStringInput> inCallWithContactNumber = Input.absent();
        private Input<ModelStringInput> inCallRequestedAt = Input.absent();
        private Input<ModelStringInput> lastInCallUpdatedAt = Input.absent();
        private Input<ModelIDInput> callPlacementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAccountMemberActivityFilterInput>> and = Input.absent();
        private Input<List<ModelAccountMemberActivityFilterInput>> or = Input.absent();
        private Input<ModelAccountMemberActivityFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelAccountMemberActivityFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAccountMemberActivityFilterInput build() {
            return new ModelAccountMemberActivityFilterInput(this.accountId, this.userId, this.lastActivityId, this.lastViewedNotifications, this.lastViewedCommentMentions, this.lastViewedRecentTasks, this.lastViewedRecentActivities, this.lastViewedMissedActions, this.lastViewedPendingAssignments, this.lastViewedCommentAndMentions, this.lastActivityTime, this.lastActivityType, this.lastActivityBody, this.lastCallLogged, this.lastNoteAdded, this.lastCommentAdded, this.lastTaskCompleted, this.lastTaskCreated, this.lastVisitLogged, this.lastContactAdded, this.lastEmailSent, this.lastWhatsappSent, this.lastSmsSent, this.lastKnownLocation, this.lastKnownLocationTime, this.inCall, this.inCallWithContactId, this.inCallWithContactName, this.inCallWithContactNumber, this.inCallRequestedAt, this.lastInCallUpdatedAt, this.callPlacementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callPlacementId(ModelIDInput modelIDInput) {
            this.callPlacementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder inCall(ModelStringInput modelStringInput) {
            this.inCall = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder inCallRequestedAt(ModelStringInput modelStringInput) {
            this.inCallRequestedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder inCallWithContactId(ModelIDInput modelIDInput) {
            this.inCallWithContactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder inCallWithContactName(ModelStringInput modelStringInput) {
            this.inCallWithContactName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder inCallWithContactNumber(ModelStringInput modelStringInput) {
            this.inCallWithContactNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastActivityBody(ModelStringInput modelStringInput) {
            this.lastActivityBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastActivityId(ModelIDInput modelIDInput) {
            this.lastActivityId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastActivityTime(ModelStringInput modelStringInput) {
            this.lastActivityTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastActivityType(ModelActivityTypeInput modelActivityTypeInput) {
            this.lastActivityType = Input.fromNullable(modelActivityTypeInput);
            return this;
        }

        public Builder lastCallLogged(ModelStringInput modelStringInput) {
            this.lastCallLogged = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastCommentAdded(ModelStringInput modelStringInput) {
            this.lastCommentAdded = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastContactAdded(ModelStringInput modelStringInput) {
            this.lastContactAdded = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastEmailSent(ModelStringInput modelStringInput) {
            this.lastEmailSent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastInCallUpdatedAt(ModelStringInput modelStringInput) {
            this.lastInCallUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastKnownLocation(ModelStringInput modelStringInput) {
            this.lastKnownLocation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastKnownLocationTime(ModelStringInput modelStringInput) {
            this.lastKnownLocationTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastNoteAdded(ModelStringInput modelStringInput) {
            this.lastNoteAdded = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastSmsSent(ModelStringInput modelStringInput) {
            this.lastSmsSent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastTaskCompleted(ModelStringInput modelStringInput) {
            this.lastTaskCompleted = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastTaskCreated(ModelStringInput modelStringInput) {
            this.lastTaskCreated = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedCommentAndMentions(ModelStringInput modelStringInput) {
            this.lastViewedCommentAndMentions = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedCommentMentions(ModelStringInput modelStringInput) {
            this.lastViewedCommentMentions = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedMissedActions(ModelStringInput modelStringInput) {
            this.lastViewedMissedActions = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedNotifications(ModelStringInput modelStringInput) {
            this.lastViewedNotifications = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedPendingAssignments(ModelStringInput modelStringInput) {
            this.lastViewedPendingAssignments = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedRecentActivities(ModelStringInput modelStringInput) {
            this.lastViewedRecentActivities = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastViewedRecentTasks(ModelStringInput modelStringInput) {
            this.lastViewedRecentTasks = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastVisitLogged(ModelStringInput modelStringInput) {
            this.lastVisitLogged = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWhatsappSent(ModelStringInput modelStringInput) {
            this.lastWhatsappSent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelAccountMemberActivityFilterInput modelAccountMemberActivityFilterInput) {
            this.not = Input.fromNullable(modelAccountMemberActivityFilterInput);
            return this;
        }

        public Builder or(List<ModelAccountMemberActivityFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelAccountMemberActivityFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelActivityTypeInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelIDInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelIDInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<List<ModelAccountMemberActivityFilterInput>> input35, Input<List<ModelAccountMemberActivityFilterInput>> input36, Input<ModelAccountMemberActivityFilterInput> input37) {
        this.accountId = input;
        this.userId = input2;
        this.lastActivityId = input3;
        this.lastViewedNotifications = input4;
        this.lastViewedCommentMentions = input5;
        this.lastViewedRecentTasks = input6;
        this.lastViewedRecentActivities = input7;
        this.lastViewedMissedActions = input8;
        this.lastViewedPendingAssignments = input9;
        this.lastViewedCommentAndMentions = input10;
        this.lastActivityTime = input11;
        this.lastActivityType = input12;
        this.lastActivityBody = input13;
        this.lastCallLogged = input14;
        this.lastNoteAdded = input15;
        this.lastCommentAdded = input16;
        this.lastTaskCompleted = input17;
        this.lastTaskCreated = input18;
        this.lastVisitLogged = input19;
        this.lastContactAdded = input20;
        this.lastEmailSent = input21;
        this.lastWhatsappSent = input22;
        this.lastSmsSent = input23;
        this.lastKnownLocation = input24;
        this.lastKnownLocationTime = input25;
        this.inCall = input26;
        this.inCallWithContactId = input27;
        this.inCallWithContactName = input28;
        this.inCallWithContactNumber = input29;
        this.inCallRequestedAt = input30;
        this.lastInCallUpdatedAt = input31;
        this.callPlacementId = input32;
        this.createdAt = input33;
        this.updatedAt = input34;
        this.and = input35;
        this.or = input36;
        this.not = input37;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelAccountMemberActivityFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput callPlacementId() {
        return this.callPlacementId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput inCall() {
        return this.inCall.value;
    }

    public ModelStringInput inCallRequestedAt() {
        return this.inCallRequestedAt.value;
    }

    public ModelIDInput inCallWithContactId() {
        return this.inCallWithContactId.value;
    }

    public ModelStringInput inCallWithContactName() {
        return this.inCallWithContactName.value;
    }

    public ModelStringInput inCallWithContactNumber() {
        return this.inCallWithContactNumber.value;
    }

    public ModelStringInput lastActivityBody() {
        return this.lastActivityBody.value;
    }

    public ModelIDInput lastActivityId() {
        return this.lastActivityId.value;
    }

    public ModelStringInput lastActivityTime() {
        return this.lastActivityTime.value;
    }

    public ModelActivityTypeInput lastActivityType() {
        return this.lastActivityType.value;
    }

    public ModelStringInput lastCallLogged() {
        return this.lastCallLogged.value;
    }

    public ModelStringInput lastCommentAdded() {
        return this.lastCommentAdded.value;
    }

    public ModelStringInput lastContactAdded() {
        return this.lastContactAdded.value;
    }

    public ModelStringInput lastEmailSent() {
        return this.lastEmailSent.value;
    }

    public ModelStringInput lastInCallUpdatedAt() {
        return this.lastInCallUpdatedAt.value;
    }

    public ModelStringInput lastKnownLocation() {
        return this.lastKnownLocation.value;
    }

    public ModelStringInput lastKnownLocationTime() {
        return this.lastKnownLocationTime.value;
    }

    public ModelStringInput lastNoteAdded() {
        return this.lastNoteAdded.value;
    }

    public ModelStringInput lastSmsSent() {
        return this.lastSmsSent.value;
    }

    public ModelStringInput lastTaskCompleted() {
        return this.lastTaskCompleted.value;
    }

    public ModelStringInput lastTaskCreated() {
        return this.lastTaskCreated.value;
    }

    public ModelStringInput lastViewedCommentAndMentions() {
        return this.lastViewedCommentAndMentions.value;
    }

    public ModelStringInput lastViewedCommentMentions() {
        return this.lastViewedCommentMentions.value;
    }

    public ModelStringInput lastViewedMissedActions() {
        return this.lastViewedMissedActions.value;
    }

    public ModelStringInput lastViewedNotifications() {
        return this.lastViewedNotifications.value;
    }

    public ModelStringInput lastViewedPendingAssignments() {
        return this.lastViewedPendingAssignments.value;
    }

    public ModelStringInput lastViewedRecentActivities() {
        return this.lastViewedRecentActivities.value;
    }

    public ModelStringInput lastViewedRecentTasks() {
        return this.lastViewedRecentTasks.value;
    }

    public ModelStringInput lastVisitLogged() {
        return this.lastVisitLogged.value;
    }

    public ModelStringInput lastWhatsappSent() {
        return this.lastWhatsappSent.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountMemberActivityFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountMemberActivityFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAccountMemberActivityFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAccountMemberActivityFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastActivityId.defined) {
                    inputFieldWriter.writeObject("lastActivityId", ModelAccountMemberActivityFilterInput.this.lastActivityId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityFilterInput.this.lastActivityId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedNotifications.defined) {
                    inputFieldWriter.writeObject("lastViewedNotifications", ModelAccountMemberActivityFilterInput.this.lastViewedNotifications.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedNotifications.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedCommentMentions.defined) {
                    inputFieldWriter.writeObject("lastViewedCommentMentions", ModelAccountMemberActivityFilterInput.this.lastViewedCommentMentions.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedCommentMentions.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedRecentTasks.defined) {
                    inputFieldWriter.writeObject("lastViewedRecentTasks", ModelAccountMemberActivityFilterInput.this.lastViewedRecentTasks.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedRecentTasks.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedRecentActivities.defined) {
                    inputFieldWriter.writeObject("lastViewedRecentActivities", ModelAccountMemberActivityFilterInput.this.lastViewedRecentActivities.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedRecentActivities.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedMissedActions.defined) {
                    inputFieldWriter.writeObject("lastViewedMissedActions", ModelAccountMemberActivityFilterInput.this.lastViewedMissedActions.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedMissedActions.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedPendingAssignments.defined) {
                    inputFieldWriter.writeObject("lastViewedPendingAssignments", ModelAccountMemberActivityFilterInput.this.lastViewedPendingAssignments.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedPendingAssignments.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastViewedCommentAndMentions.defined) {
                    inputFieldWriter.writeObject("lastViewedCommentAndMentions", ModelAccountMemberActivityFilterInput.this.lastViewedCommentAndMentions.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastViewedCommentAndMentions.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastActivityTime.defined) {
                    inputFieldWriter.writeObject("lastActivityTime", ModelAccountMemberActivityFilterInput.this.lastActivityTime.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastActivityTime.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastActivityType.defined) {
                    inputFieldWriter.writeObject("lastActivityType", ModelAccountMemberActivityFilterInput.this.lastActivityType.value != 0 ? ((ModelActivityTypeInput) ModelAccountMemberActivityFilterInput.this.lastActivityType.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastActivityBody.defined) {
                    inputFieldWriter.writeObject("lastActivityBody", ModelAccountMemberActivityFilterInput.this.lastActivityBody.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastActivityBody.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastCallLogged.defined) {
                    inputFieldWriter.writeObject("lastCallLogged", ModelAccountMemberActivityFilterInput.this.lastCallLogged.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastCallLogged.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastNoteAdded.defined) {
                    inputFieldWriter.writeObject("lastNoteAdded", ModelAccountMemberActivityFilterInput.this.lastNoteAdded.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastNoteAdded.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastCommentAdded.defined) {
                    inputFieldWriter.writeObject("lastCommentAdded", ModelAccountMemberActivityFilterInput.this.lastCommentAdded.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastCommentAdded.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastTaskCompleted.defined) {
                    inputFieldWriter.writeObject("lastTaskCompleted", ModelAccountMemberActivityFilterInput.this.lastTaskCompleted.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastTaskCompleted.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastTaskCreated.defined) {
                    inputFieldWriter.writeObject("lastTaskCreated", ModelAccountMemberActivityFilterInput.this.lastTaskCreated.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastTaskCreated.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastVisitLogged.defined) {
                    inputFieldWriter.writeObject("lastVisitLogged", ModelAccountMemberActivityFilterInput.this.lastVisitLogged.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastVisitLogged.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastContactAdded.defined) {
                    inputFieldWriter.writeObject("lastContactAdded", ModelAccountMemberActivityFilterInput.this.lastContactAdded.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastContactAdded.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastEmailSent.defined) {
                    inputFieldWriter.writeObject("lastEmailSent", ModelAccountMemberActivityFilterInput.this.lastEmailSent.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastEmailSent.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastWhatsappSent.defined) {
                    inputFieldWriter.writeObject("lastWhatsappSent", ModelAccountMemberActivityFilterInput.this.lastWhatsappSent.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastWhatsappSent.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastSmsSent.defined) {
                    inputFieldWriter.writeObject("lastSmsSent", ModelAccountMemberActivityFilterInput.this.lastSmsSent.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastSmsSent.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastKnownLocation.defined) {
                    inputFieldWriter.writeObject("lastKnownLocation", ModelAccountMemberActivityFilterInput.this.lastKnownLocation.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastKnownLocation.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastKnownLocationTime.defined) {
                    inputFieldWriter.writeObject("lastKnownLocationTime", ModelAccountMemberActivityFilterInput.this.lastKnownLocationTime.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastKnownLocationTime.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.inCall.defined) {
                    inputFieldWriter.writeObject("inCall", ModelAccountMemberActivityFilterInput.this.inCall.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.inCall.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.inCallWithContactId.defined) {
                    inputFieldWriter.writeObject("inCallWithContactId", ModelAccountMemberActivityFilterInput.this.inCallWithContactId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityFilterInput.this.inCallWithContactId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.inCallWithContactName.defined) {
                    inputFieldWriter.writeObject("inCallWithContactName", ModelAccountMemberActivityFilterInput.this.inCallWithContactName.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.inCallWithContactName.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.inCallWithContactNumber.defined) {
                    inputFieldWriter.writeObject("inCallWithContactNumber", ModelAccountMemberActivityFilterInput.this.inCallWithContactNumber.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.inCallWithContactNumber.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.inCallRequestedAt.defined) {
                    inputFieldWriter.writeObject("inCallRequestedAt", ModelAccountMemberActivityFilterInput.this.inCallRequestedAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.inCallRequestedAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.lastInCallUpdatedAt.defined) {
                    inputFieldWriter.writeObject("lastInCallUpdatedAt", ModelAccountMemberActivityFilterInput.this.lastInCallUpdatedAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.lastInCallUpdatedAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.callPlacementId.defined) {
                    inputFieldWriter.writeObject("callPlacementId", ModelAccountMemberActivityFilterInput.this.callPlacementId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityFilterInput.this.callPlacementId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountMemberActivityFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountMemberActivityFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountMemberActivityFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMemberActivityFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMemberActivityFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMemberActivityFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountMemberActivityFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMemberActivityFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMemberActivityFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMemberActivityFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMemberActivityFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountMemberActivityFilterInput.this.not.value != 0 ? ((ModelAccountMemberActivityFilterInput) ModelAccountMemberActivityFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAccountMemberActivityFilterInput not() {
        return this.not.value;
    }

    public List<ModelAccountMemberActivityFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
