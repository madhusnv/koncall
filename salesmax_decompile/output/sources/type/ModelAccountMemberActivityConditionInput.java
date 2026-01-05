package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAccountMemberActivityConditionInput implements InputType {
    private final Input<List<ModelAccountMemberActivityConditionInput>> and;
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
    private final Input<ModelAccountMemberActivityConditionInput> not;
    private final Input<List<ModelAccountMemberActivityConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelAccountMemberActivityConditionInput>> and = Input.absent();
        private Input<List<ModelAccountMemberActivityConditionInput>> or = Input.absent();
        private Input<ModelAccountMemberActivityConditionInput> not = Input.absent();

        public Builder and(List<ModelAccountMemberActivityConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAccountMemberActivityConditionInput build() {
            return new ModelAccountMemberActivityConditionInput(this.lastActivityId, this.lastViewedNotifications, this.lastViewedCommentMentions, this.lastViewedRecentTasks, this.lastViewedRecentActivities, this.lastViewedMissedActions, this.lastViewedPendingAssignments, this.lastViewedCommentAndMentions, this.lastActivityTime, this.lastActivityType, this.lastActivityBody, this.lastCallLogged, this.lastNoteAdded, this.lastCommentAdded, this.lastTaskCompleted, this.lastTaskCreated, this.lastVisitLogged, this.lastContactAdded, this.lastEmailSent, this.lastWhatsappSent, this.lastSmsSent, this.lastKnownLocation, this.lastKnownLocationTime, this.inCall, this.inCallWithContactId, this.inCallWithContactName, this.inCallWithContactNumber, this.inCallRequestedAt, this.lastInCallUpdatedAt, this.callPlacementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelAccountMemberActivityConditionInput modelAccountMemberActivityConditionInput) {
            this.not = Input.fromNullable(modelAccountMemberActivityConditionInput);
            return this;
        }

        public Builder or(List<ModelAccountMemberActivityConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelAccountMemberActivityConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelActivityTypeInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelIDInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelIDInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<List<ModelAccountMemberActivityConditionInput>> input33, Input<List<ModelAccountMemberActivityConditionInput>> input34, Input<ModelAccountMemberActivityConditionInput> input35) {
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
        this.and = input33;
        this.or = input34;
        this.not = input35;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelAccountMemberActivityConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelAccountMemberActivityConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountMemberActivityConditionInput.this.lastActivityId.defined) {
                    inputFieldWriter.writeObject("lastActivityId", ModelAccountMemberActivityConditionInput.this.lastActivityId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityConditionInput.this.lastActivityId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedNotifications.defined) {
                    inputFieldWriter.writeObject("lastViewedNotifications", ModelAccountMemberActivityConditionInput.this.lastViewedNotifications.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedNotifications.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedCommentMentions.defined) {
                    inputFieldWriter.writeObject("lastViewedCommentMentions", ModelAccountMemberActivityConditionInput.this.lastViewedCommentMentions.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedCommentMentions.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedRecentTasks.defined) {
                    inputFieldWriter.writeObject("lastViewedRecentTasks", ModelAccountMemberActivityConditionInput.this.lastViewedRecentTasks.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedRecentTasks.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedRecentActivities.defined) {
                    inputFieldWriter.writeObject("lastViewedRecentActivities", ModelAccountMemberActivityConditionInput.this.lastViewedRecentActivities.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedRecentActivities.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedMissedActions.defined) {
                    inputFieldWriter.writeObject("lastViewedMissedActions", ModelAccountMemberActivityConditionInput.this.lastViewedMissedActions.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedMissedActions.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedPendingAssignments.defined) {
                    inputFieldWriter.writeObject("lastViewedPendingAssignments", ModelAccountMemberActivityConditionInput.this.lastViewedPendingAssignments.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedPendingAssignments.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastViewedCommentAndMentions.defined) {
                    inputFieldWriter.writeObject("lastViewedCommentAndMentions", ModelAccountMemberActivityConditionInput.this.lastViewedCommentAndMentions.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastViewedCommentAndMentions.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastActivityTime.defined) {
                    inputFieldWriter.writeObject("lastActivityTime", ModelAccountMemberActivityConditionInput.this.lastActivityTime.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastActivityTime.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastActivityType.defined) {
                    inputFieldWriter.writeObject("lastActivityType", ModelAccountMemberActivityConditionInput.this.lastActivityType.value != 0 ? ((ModelActivityTypeInput) ModelAccountMemberActivityConditionInput.this.lastActivityType.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastActivityBody.defined) {
                    inputFieldWriter.writeObject("lastActivityBody", ModelAccountMemberActivityConditionInput.this.lastActivityBody.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastActivityBody.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastCallLogged.defined) {
                    inputFieldWriter.writeObject("lastCallLogged", ModelAccountMemberActivityConditionInput.this.lastCallLogged.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastCallLogged.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastNoteAdded.defined) {
                    inputFieldWriter.writeObject("lastNoteAdded", ModelAccountMemberActivityConditionInput.this.lastNoteAdded.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastNoteAdded.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastCommentAdded.defined) {
                    inputFieldWriter.writeObject("lastCommentAdded", ModelAccountMemberActivityConditionInput.this.lastCommentAdded.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastCommentAdded.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastTaskCompleted.defined) {
                    inputFieldWriter.writeObject("lastTaskCompleted", ModelAccountMemberActivityConditionInput.this.lastTaskCompleted.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastTaskCompleted.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastTaskCreated.defined) {
                    inputFieldWriter.writeObject("lastTaskCreated", ModelAccountMemberActivityConditionInput.this.lastTaskCreated.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastTaskCreated.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastVisitLogged.defined) {
                    inputFieldWriter.writeObject("lastVisitLogged", ModelAccountMemberActivityConditionInput.this.lastVisitLogged.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastVisitLogged.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastContactAdded.defined) {
                    inputFieldWriter.writeObject("lastContactAdded", ModelAccountMemberActivityConditionInput.this.lastContactAdded.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastContactAdded.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastEmailSent.defined) {
                    inputFieldWriter.writeObject("lastEmailSent", ModelAccountMemberActivityConditionInput.this.lastEmailSent.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastEmailSent.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastWhatsappSent.defined) {
                    inputFieldWriter.writeObject("lastWhatsappSent", ModelAccountMemberActivityConditionInput.this.lastWhatsappSent.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastWhatsappSent.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastSmsSent.defined) {
                    inputFieldWriter.writeObject("lastSmsSent", ModelAccountMemberActivityConditionInput.this.lastSmsSent.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastSmsSent.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastKnownLocation.defined) {
                    inputFieldWriter.writeObject("lastKnownLocation", ModelAccountMemberActivityConditionInput.this.lastKnownLocation.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastKnownLocation.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastKnownLocationTime.defined) {
                    inputFieldWriter.writeObject("lastKnownLocationTime", ModelAccountMemberActivityConditionInput.this.lastKnownLocationTime.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastKnownLocationTime.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.inCall.defined) {
                    inputFieldWriter.writeObject("inCall", ModelAccountMemberActivityConditionInput.this.inCall.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.inCall.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.inCallWithContactId.defined) {
                    inputFieldWriter.writeObject("inCallWithContactId", ModelAccountMemberActivityConditionInput.this.inCallWithContactId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityConditionInput.this.inCallWithContactId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.inCallWithContactName.defined) {
                    inputFieldWriter.writeObject("inCallWithContactName", ModelAccountMemberActivityConditionInput.this.inCallWithContactName.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.inCallWithContactName.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.inCallWithContactNumber.defined) {
                    inputFieldWriter.writeObject("inCallWithContactNumber", ModelAccountMemberActivityConditionInput.this.inCallWithContactNumber.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.inCallWithContactNumber.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.inCallRequestedAt.defined) {
                    inputFieldWriter.writeObject("inCallRequestedAt", ModelAccountMemberActivityConditionInput.this.inCallRequestedAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.inCallRequestedAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.lastInCallUpdatedAt.defined) {
                    inputFieldWriter.writeObject("lastInCallUpdatedAt", ModelAccountMemberActivityConditionInput.this.lastInCallUpdatedAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.lastInCallUpdatedAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.callPlacementId.defined) {
                    inputFieldWriter.writeObject("callPlacementId", ModelAccountMemberActivityConditionInput.this.callPlacementId.value != 0 ? ((ModelIDInput) ModelAccountMemberActivityConditionInput.this.callPlacementId.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAccountMemberActivityConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAccountMemberActivityConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAccountMemberActivityConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAccountMemberActivityConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMemberActivityConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMemberActivityConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMemberActivityConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAccountMemberActivityConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAccountMemberActivityConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAccountMemberActivityConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAccountMemberActivityConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAccountMemberActivityConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAccountMemberActivityConditionInput.this.not.value != 0 ? ((ModelAccountMemberActivityConditionInput) ModelAccountMemberActivityConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAccountMemberActivityConditionInput not() {
        return this.not.value;
    }

    public List<ModelAccountMemberActivityConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
