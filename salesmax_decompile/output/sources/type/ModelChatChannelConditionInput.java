package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatChannelConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatChannelConditionInput>> and;
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
    private final Input<ModelBooleanInput> isLastMessageByLead;
    private final Input<ModelStringInput> lastMessageByLeadTime;
    private final Input<ModelStringInput> lastMessageByUserTime;
    private final Input<ModelIDInput> lastOutboundMessageId;
    private final Input<ModelStringInput> lastOutboundMessageStatus;
    private final Input<ModelBooleanInput> lastOutboundMessageWasBroadcast;
    private final Input<ModelStringInput> messagePlatform;
    private final Input<ModelChatChannelConditionInput> not;
    private final Input<List<ModelChatChannelConditionInput>> or;
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
        private Input<List<ModelChatChannelConditionInput>> and = Input.absent();
        private Input<List<ModelChatChannelConditionInput>> or = Input.absent();
        private Input<ModelChatChannelConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatChannelConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatChannelConditionInput build() {
            return new ModelChatChannelConditionInput(this.accountId, this.phoneNumberIdExternal, this.channelName, this.messagePlatform, this.tags, this.recipientType, this.channelType, this.channelSubType, this.externalParticipantsAllowed, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.contactId, this.visitorId, this.recipientExternalId, this.recipientExternalIdType, this.ownerId, this.primaryTeamId, this.toBeAssigned, this.createdById, this.readNotifiedAt, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.lastOutboundMessageWasBroadcast, this.chanelHasOnlyBroadcast, this.salesmaxAccountId, this.channelProfilePic, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelChatChannelConditionInput modelChatChannelConditionInput) {
            this.not = Input.fromNullable(modelChatChannelConditionInput);
            return this;
        }

        public Builder or(List<ModelChatChannelConditionInput> list) {
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

    public ModelChatChannelConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelBooleanInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelIDInput> input19, Input<ModelIDInput> input20, Input<ModelContactAssignmentStatusInput> input21, Input<ModelIDInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelBooleanInput> input26, Input<ModelIDInput> input27, Input<ModelStringInput> input28, Input<ModelBooleanInput> input29, Input<ModelBooleanInput> input30, Input<ModelIDInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<List<ModelChatChannelConditionInput>> input35, Input<List<ModelChatChannelConditionInput>> input36, Input<ModelChatChannelConditionInput> input37) {
        this.accountId = input;
        this.phoneNumberIdExternal = input2;
        this.channelName = input3;
        this.messagePlatform = input4;
        this.tags = input5;
        this.recipientType = input6;
        this.channelType = input7;
        this.channelSubType = input8;
        this.externalParticipantsAllowed = input9;
        this.participantScopeIfInternal = input10;
        this.userIdsForDirectChannel = input11;
        this.channelStatus = input12;
        this.channelWillBeChargedNext = input13;
        this.channelOpenUntil = input14;
        this.contactId = input15;
        this.visitorId = input16;
        this.recipientExternalId = input17;
        this.recipientExternalIdType = input18;
        this.ownerId = input19;
        this.primaryTeamId = input20;
        this.toBeAssigned = input21;
        this.createdById = input22;
        this.readNotifiedAt = input23;
        this.lastMessageByLeadTime = input24;
        this.lastMessageByUserTime = input25;
        this.isLastMessageByLead = input26;
        this.lastOutboundMessageId = input27;
        this.lastOutboundMessageStatus = input28;
        this.lastOutboundMessageWasBroadcast = input29;
        this.chanelHasOnlyBroadcast = input30;
        this.salesmaxAccountId = input31;
        this.channelProfilePic = input32;
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

    public List<ModelChatChannelConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelChatChannelConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatChannelConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatChannelConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelChatChannelConditionInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelName.defined) {
                    inputFieldWriter.writeObject("channelName", ModelChatChannelConditionInput.this.channelName.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelName.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", ModelChatChannelConditionInput.this.messagePlatform.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.messagePlatform.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelChatChannelConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.recipientType.defined) {
                    inputFieldWriter.writeObject("recipientType", ModelChatChannelConditionInput.this.recipientType.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.recipientType.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelType.defined) {
                    inputFieldWriter.writeObject("channelType", ModelChatChannelConditionInput.this.channelType.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelType.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelSubType.defined) {
                    inputFieldWriter.writeObject("channelSubType", ModelChatChannelConditionInput.this.channelSubType.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelSubType.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.externalParticipantsAllowed.defined) {
                    inputFieldWriter.writeObject("externalParticipantsAllowed", ModelChatChannelConditionInput.this.externalParticipantsAllowed.value != 0 ? ((ModelBooleanInput) ModelChatChannelConditionInput.this.externalParticipantsAllowed.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeObject("participantScopeIfInternal", ModelChatChannelConditionInput.this.participantScopeIfInternal.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.participantScopeIfInternal.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeObject("userIdsForDirectChannel", ModelChatChannelConditionInput.this.userIdsForDirectChannel.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.userIdsForDirectChannel.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelStatus.defined) {
                    inputFieldWriter.writeObject("channelStatus", ModelChatChannelConditionInput.this.channelStatus.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelStatus.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeObject("channelWillBeChargedNext", ModelChatChannelConditionInput.this.channelWillBeChargedNext.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelWillBeChargedNext.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeObject("channelOpenUntil", ModelChatChannelConditionInput.this.channelOpenUntil.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelOpenUntil.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelChatChannelConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.visitorId.defined) {
                    inputFieldWriter.writeObject("visitorId", ModelChatChannelConditionInput.this.visitorId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.visitorId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeObject("recipientExternalId", ModelChatChannelConditionInput.this.recipientExternalId.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.recipientExternalId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeObject("recipientExternalIdType", ModelChatChannelConditionInput.this.recipientExternalIdType.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.recipientExternalIdType.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelChatChannelConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelChatChannelConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelChatChannelConditionInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelChatChannelConditionInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelChatChannelConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.readNotifiedAt.defined) {
                    inputFieldWriter.writeObject("readNotifiedAt", ModelChatChannelConditionInput.this.readNotifiedAt.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.readNotifiedAt.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByLeadTime", ModelChatChannelConditionInput.this.lastMessageByLeadTime.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.lastMessageByLeadTime.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByUserTime", ModelChatChannelConditionInput.this.lastMessageByUserTime.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.lastMessageByUserTime.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeObject("isLastMessageByLead", ModelChatChannelConditionInput.this.isLastMessageByLead.value != 0 ? ((ModelBooleanInput) ModelChatChannelConditionInput.this.isLastMessageByLead.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageId", ModelChatChannelConditionInput.this.lastOutboundMessageId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.lastOutboundMessageId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageStatus", ModelChatChannelConditionInput.this.lastOutboundMessageStatus.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.lastOutboundMessageStatus.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.lastOutboundMessageWasBroadcast.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageWasBroadcast", ModelChatChannelConditionInput.this.lastOutboundMessageWasBroadcast.value != 0 ? ((ModelBooleanInput) ModelChatChannelConditionInput.this.lastOutboundMessageWasBroadcast.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.chanelHasOnlyBroadcast.defined) {
                    inputFieldWriter.writeObject("chanelHasOnlyBroadcast", ModelChatChannelConditionInput.this.chanelHasOnlyBroadcast.value != 0 ? ((ModelBooleanInput) ModelChatChannelConditionInput.this.chanelHasOnlyBroadcast.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.salesmaxAccountId.defined) {
                    inputFieldWriter.writeObject("salesmaxAccountId", ModelChatChannelConditionInput.this.salesmaxAccountId.value != 0 ? ((ModelIDInput) ModelChatChannelConditionInput.this.salesmaxAccountId.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.channelProfilePic.defined) {
                    inputFieldWriter.writeObject("channelProfilePic", ModelChatChannelConditionInput.this.channelProfilePic.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.channelProfilePic.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatChannelConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatChannelConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatChannelConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatChannelConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatChannelConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatChannelConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatChannelConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatChannelConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatChannelConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatChannelConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatChannelConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatChannelConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatChannelConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatChannelConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatChannelConditionInput.this.not.value != 0 ? ((ModelChatChannelConditionInput) ModelChatChannelConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public ModelChatChannelConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatChannelConditionInput> or() {
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
