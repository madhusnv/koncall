package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatChannelFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatChannelFilterInput>> and;
    private final Input<ModelBooleanInput> chanelHasOnlyBroadcast;
    private final Input<ModelStringInput> channelName;
    private final Input<ModelStringInput> channelOpenUntil;
    private final Input<ModelStringInput> channelProfilePic;
    private final Input<ModelStringInput> channelStatus;
    private final Input<ModelStringInput> channelSubType;
    private final Input<ModelStringInput> channelType;
    private final Input<ModelStringInput> channelWillBeChargedNext;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelBooleanInput> externalParticipantsAllowed;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isLastMessageByLead;
    private final Input<ModelStringInput> lastMessageByLeadTime;
    private final Input<ModelStringInput> lastMessageByUserTime;
    private final Input<ModelIDInput> lastOutboundMessageId;
    private final Input<ModelStringInput> lastOutboundMessageStatus;
    private final Input<ModelBooleanInput> lastOutboundMessageWasBroadcast;
    private final Input<ModelStringInput> messagePlatform;
    private final Input<ModelChatChannelFilterInput> not;
    private final Input<List<ModelChatChannelFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelStringInput> participantScopeIfInternal;
    private final Input<ModelStringInput> phoneNumberIdExternal;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> readNotifiedAt;
    private final Input<ModelStringInput> recipientExternalId;
    private final Input<ModelStringInput> recipientExternalIdType;
    private final Input<ModelStringInput> recipientType;
    private final Input<ModelIDInput> salesmaxAccountId;
    private final Input<ModelStringInput> tags;
    private final Input<ModelContactAssignmentStatusInput> toBeAssigned;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> userIdsForDirectChannel;
    private final Input<ModelIDInput> visitorId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> phoneNumberIdExternal = Input.absent();
        private Input<ModelStringInput> channelName = Input.absent();
        private Input<ModelStringInput> messagePlatform = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelStringInput> recipientType = Input.absent();
        private Input<ModelStringInput> channelType = Input.absent();
        private Input<ModelStringInput> channelSubType = Input.absent();
        private Input<ModelBooleanInput> externalParticipantsAllowed = Input.absent();
        private Input<ModelStringInput> participantScopeIfInternal = Input.absent();
        private Input<ModelStringInput> userIdsForDirectChannel = Input.absent();
        private Input<ModelStringInput> channelStatus = Input.absent();
        private Input<ModelStringInput> channelWillBeChargedNext = Input.absent();
        private Input<ModelStringInput> channelOpenUntil = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> visitorId = Input.absent();
        private Input<ModelStringInput> recipientExternalId = Input.absent();
        private Input<ModelStringInput> recipientExternalIdType = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelContactAssignmentStatusInput> toBeAssigned = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelStringInput> readNotifiedAt = Input.absent();
        private Input<ModelStringInput> lastMessageByLeadTime = Input.absent();
        private Input<ModelStringInput> lastMessageByUserTime = Input.absent();
        private Input<ModelBooleanInput> isLastMessageByLead = Input.absent();
        private Input<ModelIDInput> lastOutboundMessageId = Input.absent();
        private Input<ModelStringInput> lastOutboundMessageStatus = Input.absent();
        private Input<ModelBooleanInput> lastOutboundMessageWasBroadcast = Input.absent();
        private Input<ModelBooleanInput> chanelHasOnlyBroadcast = Input.absent();
        private Input<ModelIDInput> salesmaxAccountId = Input.absent();
        private Input<ModelStringInput> channelProfilePic = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelChatChannelFilterInput>> and = Input.absent();
        private Input<List<ModelChatChannelFilterInput>> or = Input.absent();
        private Input<ModelChatChannelFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatChannelFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatChannelFilterInput build() {
            return new ModelChatChannelFilterInput(this.id, this.accountId, this.phoneNumberIdExternal, this.channelName, this.messagePlatform, this.tags, this.recipientType, this.channelType, this.channelSubType, this.externalParticipantsAllowed, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.contactId, this.visitorId, this.recipientExternalId, this.recipientExternalIdType, this.ownerId, this.primaryTeamId, this.toBeAssigned, this.createdById, this.readNotifiedAt, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.lastOutboundMessageWasBroadcast, this.chanelHasOnlyBroadcast, this.salesmaxAccountId, this.channelProfilePic, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder chanelHasOnlyBroadcast(ModelBooleanInput modelBooleanInput) {
            this.chanelHasOnlyBroadcast = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder channelName(ModelStringInput modelStringInput) {
            this.channelName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelOpenUntil(ModelStringInput modelStringInput) {
            this.channelOpenUntil = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelProfilePic(ModelStringInput modelStringInput) {
            this.channelProfilePic = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelStatus(ModelStringInput modelStringInput) {
            this.channelStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelSubType(ModelStringInput modelStringInput) {
            this.channelSubType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelType(ModelStringInput modelStringInput) {
            this.channelType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder channelWillBeChargedNext(ModelStringInput modelStringInput) {
            this.channelWillBeChargedNext = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder externalParticipantsAllowed(ModelBooleanInput modelBooleanInput) {
            this.externalParticipantsAllowed = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isLastMessageByLead(ModelBooleanInput modelBooleanInput) {
            this.isLastMessageByLead = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder lastMessageByLeadTime(ModelStringInput modelStringInput) {
            this.lastMessageByLeadTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastMessageByUserTime(ModelStringInput modelStringInput) {
            this.lastMessageByUserTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastOutboundMessageId(ModelIDInput modelIDInput) {
            this.lastOutboundMessageId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastOutboundMessageStatus(ModelStringInput modelStringInput) {
            this.lastOutboundMessageStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastOutboundMessageWasBroadcast(ModelBooleanInput modelBooleanInput) {
            this.lastOutboundMessageWasBroadcast = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder messagePlatform(ModelStringInput modelStringInput) {
            this.messagePlatform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelChatChannelFilterInput modelChatChannelFilterInput) {
            this.not = Input.fromNullable(modelChatChannelFilterInput);
            return this;
        }

        public Builder or(List<ModelChatChannelFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder participantScopeIfInternal(ModelStringInput modelStringInput) {
            this.participantScopeIfInternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder phoneNumberIdExternal(ModelStringInput modelStringInput) {
            this.phoneNumberIdExternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder readNotifiedAt(ModelStringInput modelStringInput) {
            this.readNotifiedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recipientExternalId(ModelStringInput modelStringInput) {
            this.recipientExternalId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recipientExternalIdType(ModelStringInput modelStringInput) {
            this.recipientExternalIdType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recipientType(ModelStringInput modelStringInput) {
            this.recipientType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder salesmaxAccountId(ModelIDInput modelIDInput) {
            this.salesmaxAccountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder toBeAssigned(ModelContactAssignmentStatusInput modelContactAssignmentStatusInput) {
            this.toBeAssigned = Input.fromNullable(modelContactAssignmentStatusInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userIdsForDirectChannel(ModelStringInput modelStringInput) {
            this.userIdsForDirectChannel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder visitorId(ModelIDInput modelIDInput) {
            this.visitorId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelChatChannelFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelBooleanInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelIDInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelIDInput> input20, Input<ModelIDInput> input21, Input<ModelContactAssignmentStatusInput> input22, Input<ModelIDInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelBooleanInput> input27, Input<ModelIDInput> input28, Input<ModelStringInput> input29, Input<ModelBooleanInput> input30, Input<ModelBooleanInput> input31, Input<ModelIDInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<List<ModelChatChannelFilterInput>> input36, Input<List<ModelChatChannelFilterInput>> input37, Input<ModelChatChannelFilterInput> input38) {
        this.id = input;
        this.accountId = input2;
        this.phoneNumberIdExternal = input3;
        this.channelName = input4;
        this.messagePlatform = input5;
        this.tags = input6;
        this.recipientType = input7;
        this.channelType = input8;
        this.channelSubType = input9;
        this.externalParticipantsAllowed = input10;
        this.participantScopeIfInternal = input11;
        this.userIdsForDirectChannel = input12;
        this.channelStatus = input13;
        this.channelWillBeChargedNext = input14;
        this.channelOpenUntil = input15;
        this.contactId = input16;
        this.visitorId = input17;
        this.recipientExternalId = input18;
        this.recipientExternalIdType = input19;
        this.ownerId = input20;
        this.primaryTeamId = input21;
        this.toBeAssigned = input22;
        this.createdById = input23;
        this.readNotifiedAt = input24;
        this.lastMessageByLeadTime = input25;
        this.lastMessageByUserTime = input26;
        this.isLastMessageByLead = input27;
        this.lastOutboundMessageId = input28;
        this.lastOutboundMessageStatus = input29;
        this.lastOutboundMessageWasBroadcast = input30;
        this.chanelHasOnlyBroadcast = input31;
        this.salesmaxAccountId = input32;
        this.channelProfilePic = input33;
        this.createdAt = input34;
        this.updatedAt = input35;
        this.and = input36;
        this.or = input37;
        this.not = input38;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatChannelFilterInput> and() {
        return this.and.value;
    }

    public ModelBooleanInput chanelHasOnlyBroadcast() {
        return this.chanelHasOnlyBroadcast.value;
    }

    public ModelStringInput channelName() {
        return this.channelName.value;
    }

    public ModelStringInput channelOpenUntil() {
        return this.channelOpenUntil.value;
    }

    public ModelStringInput channelProfilePic() {
        return this.channelProfilePic.value;
    }

    public ModelStringInput channelStatus() {
        return this.channelStatus.value;
    }

    public ModelStringInput channelSubType() {
        return this.channelSubType.value;
    }

    public ModelStringInput channelType() {
        return this.channelType.value;
    }

    public ModelStringInput channelWillBeChargedNext() {
        return this.channelWillBeChargedNext.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelBooleanInput externalParticipantsAllowed() {
        return this.externalParticipantsAllowed.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isLastMessageByLead() {
        return this.isLastMessageByLead.value;
    }

    public ModelStringInput lastMessageByLeadTime() {
        return this.lastMessageByLeadTime.value;
    }

    public ModelStringInput lastMessageByUserTime() {
        return this.lastMessageByUserTime.value;
    }

    public ModelIDInput lastOutboundMessageId() {
        return this.lastOutboundMessageId.value;
    }

    public ModelStringInput lastOutboundMessageStatus() {
        return this.lastOutboundMessageStatus.value;
    }

    public ModelBooleanInput lastOutboundMessageWasBroadcast() {
        return this.lastOutboundMessageWasBroadcast.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatChannelFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatChannelFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelChatChannelFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatChannelFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelChatChannelFilterInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelName.defined) {
                    inputFieldWriter.writeObject("channelName", ModelChatChannelFilterInput.this.channelName.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelName.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", ModelChatChannelFilterInput.this.messagePlatform.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.messagePlatform.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelChatChannelFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.recipientType.defined) {
                    inputFieldWriter.writeObject("recipientType", ModelChatChannelFilterInput.this.recipientType.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.recipientType.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelType.defined) {
                    inputFieldWriter.writeObject("channelType", ModelChatChannelFilterInput.this.channelType.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelType.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelSubType.defined) {
                    inputFieldWriter.writeObject("channelSubType", ModelChatChannelFilterInput.this.channelSubType.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelSubType.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.externalParticipantsAllowed.defined) {
                    inputFieldWriter.writeObject("externalParticipantsAllowed", ModelChatChannelFilterInput.this.externalParticipantsAllowed.value != 0 ? ((ModelBooleanInput) ModelChatChannelFilterInput.this.externalParticipantsAllowed.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeObject("participantScopeIfInternal", ModelChatChannelFilterInput.this.participantScopeIfInternal.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.participantScopeIfInternal.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeObject("userIdsForDirectChannel", ModelChatChannelFilterInput.this.userIdsForDirectChannel.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.userIdsForDirectChannel.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelStatus.defined) {
                    inputFieldWriter.writeObject("channelStatus", ModelChatChannelFilterInput.this.channelStatus.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelStatus.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeObject("channelWillBeChargedNext", ModelChatChannelFilterInput.this.channelWillBeChargedNext.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelWillBeChargedNext.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeObject("channelOpenUntil", ModelChatChannelFilterInput.this.channelOpenUntil.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelOpenUntil.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelChatChannelFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.visitorId.defined) {
                    inputFieldWriter.writeObject("visitorId", ModelChatChannelFilterInput.this.visitorId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.visitorId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeObject("recipientExternalId", ModelChatChannelFilterInput.this.recipientExternalId.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.recipientExternalId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeObject("recipientExternalIdType", ModelChatChannelFilterInput.this.recipientExternalIdType.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.recipientExternalIdType.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelChatChannelFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelChatChannelFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelChatChannelFilterInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelChatChannelFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelChatChannelFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.readNotifiedAt.defined) {
                    inputFieldWriter.writeObject("readNotifiedAt", ModelChatChannelFilterInput.this.readNotifiedAt.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.readNotifiedAt.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByLeadTime", ModelChatChannelFilterInput.this.lastMessageByLeadTime.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.lastMessageByLeadTime.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByUserTime", ModelChatChannelFilterInput.this.lastMessageByUserTime.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.lastMessageByUserTime.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeObject("isLastMessageByLead", ModelChatChannelFilterInput.this.isLastMessageByLead.value != 0 ? ((ModelBooleanInput) ModelChatChannelFilterInput.this.isLastMessageByLead.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageId", ModelChatChannelFilterInput.this.lastOutboundMessageId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.lastOutboundMessageId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageStatus", ModelChatChannelFilterInput.this.lastOutboundMessageStatus.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.lastOutboundMessageStatus.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.lastOutboundMessageWasBroadcast.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageWasBroadcast", ModelChatChannelFilterInput.this.lastOutboundMessageWasBroadcast.value != 0 ? ((ModelBooleanInput) ModelChatChannelFilterInput.this.lastOutboundMessageWasBroadcast.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.chanelHasOnlyBroadcast.defined) {
                    inputFieldWriter.writeObject("chanelHasOnlyBroadcast", ModelChatChannelFilterInput.this.chanelHasOnlyBroadcast.value != 0 ? ((ModelBooleanInput) ModelChatChannelFilterInput.this.chanelHasOnlyBroadcast.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.salesmaxAccountId.defined) {
                    inputFieldWriter.writeObject("salesmaxAccountId", ModelChatChannelFilterInput.this.salesmaxAccountId.value != 0 ? ((ModelIDInput) ModelChatChannelFilterInput.this.salesmaxAccountId.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.channelProfilePic.defined) {
                    inputFieldWriter.writeObject("channelProfilePic", ModelChatChannelFilterInput.this.channelProfilePic.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.channelProfilePic.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatChannelFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatChannelFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatChannelFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatChannelFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatChannelFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatChannelFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatChannelFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatChannelFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatChannelFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatChannelFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatChannelFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatChannelFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatChannelFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatChannelFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatChannelFilterInput.this.not.value != 0 ? ((ModelChatChannelFilterInput) ModelChatChannelFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public ModelChatChannelFilterInput not() {
        return this.not.value;
    }

    public List<ModelChatChannelFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelStringInput participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public ModelStringInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelStringInput readNotifiedAt() {
        return this.readNotifiedAt.value;
    }

    public ModelStringInput recipientExternalId() {
        return this.recipientExternalId.value;
    }

    public ModelStringInput recipientExternalIdType() {
        return this.recipientExternalIdType.value;
    }

    public ModelStringInput recipientType() {
        return this.recipientType.value;
    }

    public ModelIDInput salesmaxAccountId() {
        return this.salesmaxAccountId.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelContactAssignmentStatusInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput userIdsForDirectChannel() {
        return this.userIdsForDirectChannel.value;
    }

    public ModelIDInput visitorId() {
        return this.visitorId.value;
    }
}
