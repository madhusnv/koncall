package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatParticipantConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatParticipantConditionInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelStringInput> channelName;
    private final Input<ModelStringInput> channelOpenUntil;
    private final Input<ModelStringInput> channelStatus;
    private final Input<ModelStringInput> channelSubType;
    private final Input<ModelStringInput> channelType;
    private final Input<ModelStringInput> channelWillBeChargedNext;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelBooleanInput> isLastMessageByLead;
    private final Input<ModelBooleanInput> isNewMessageUpdate;
    private final Input<ModelBooleanInput> isStarred;
    private final Input<ModelStringInput> joinedAt;
    private final Input<ModelStringInput> lastMessageByLeadTime;
    private final Input<ModelStringInput> lastMessageByUserTime;
    private final Input<ModelIDInput> lastOutboundMessageId;
    private final Input<ModelStringInput> lastOutboundMessageStatus;
    private final Input<ModelStringInput> lastViewed;
    private final Input<ModelStringInput> leftAt;
    private final Input<ModelChatParticipantConditionInput> not;
    private final Input<List<ModelChatParticipantConditionInput>> or;
    private final Input<ModelIDInput> participantId;
    private final Input<ModelStringInput> participantScopeIfInternal;
    private final Input<ModelStringInput> participationStatus;
    private final Input<ModelStringInput> phoneNumberIdExternal;
    private final Input<ModelStringInput> tags;
    private final Input<ModelIntInput> unreadMessageCount;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> userIdsForDirectChannel;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> channelId = Input.absent();
        private Input<ModelStringInput> phoneNumberIdExternal = Input.absent();
        private Input<ModelIDInput> participantId = Input.absent();
        private Input<ModelStringInput> participationStatus = Input.absent();
        private Input<ModelIntInput> unreadMessageCount = Input.absent();
        private Input<ModelStringInput> lastViewed = Input.absent();
        private Input<ModelBooleanInput> isStarred = Input.absent();
        private Input<ModelStringInput> joinedAt = Input.absent();
        private Input<ModelStringInput> leftAt = Input.absent();
        private Input<ModelStringInput> channelName = Input.absent();
        private Input<ModelStringInput> channelType = Input.absent();
        private Input<ModelStringInput> channelSubType = Input.absent();
        private Input<ModelStringInput> channelStatus = Input.absent();
        private Input<ModelStringInput> channelWillBeChargedNext = Input.absent();
        private Input<ModelStringInput> channelOpenUntil = Input.absent();
        private Input<ModelStringInput> lastMessageByLeadTime = Input.absent();
        private Input<ModelStringInput> lastMessageByUserTime = Input.absent();
        private Input<ModelBooleanInput> isLastMessageByLead = Input.absent();
        private Input<ModelIDInput> lastOutboundMessageId = Input.absent();
        private Input<ModelStringInput> lastOutboundMessageStatus = Input.absent();
        private Input<ModelBooleanInput> isNewMessageUpdate = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelStringInput> participantScopeIfInternal = Input.absent();
        private Input<ModelStringInput> userIdsForDirectChannel = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelChatParticipantConditionInput>> and = Input.absent();
        private Input<List<ModelChatParticipantConditionInput>> or = Input.absent();
        private Input<ModelChatParticipantConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatParticipantConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatParticipantConditionInput build() {
            return new ModelChatParticipantConditionInput(this.accountId, this.channelId, this.phoneNumberIdExternal, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(ModelIDInput modelIDInput) {
            this.channelId = Input.fromNullable(modelIDInput);
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

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isLastMessageByLead(ModelBooleanInput modelBooleanInput) {
            this.isLastMessageByLead = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isNewMessageUpdate(ModelBooleanInput modelBooleanInput) {
            this.isNewMessageUpdate = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isStarred(ModelBooleanInput modelBooleanInput) {
            this.isStarred = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder joinedAt(ModelStringInput modelStringInput) {
            this.joinedAt = Input.fromNullable(modelStringInput);
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

        public Builder lastViewed(ModelStringInput modelStringInput) {
            this.lastViewed = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder leftAt(ModelStringInput modelStringInput) {
            this.leftAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelChatParticipantConditionInput modelChatParticipantConditionInput) {
            this.not = Input.fromNullable(modelChatParticipantConditionInput);
            return this;
        }

        public Builder or(List<ModelChatParticipantConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder participantId(ModelIDInput modelIDInput) {
            this.participantId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder participantScopeIfInternal(ModelStringInput modelStringInput) {
            this.participantScopeIfInternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder participationStatus(ModelStringInput modelStringInput) {
            this.participationStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder phoneNumberIdExternal(ModelStringInput modelStringInput) {
            this.phoneNumberIdExternal = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder unreadMessageCount(ModelIntInput modelIntInput) {
            this.unreadMessageCount = Input.fromNullable(modelIntInput);
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
    }

    public ModelChatParticipantConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelStringInput> input7, Input<ModelBooleanInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelBooleanInput> input19, Input<ModelIDInput> input20, Input<ModelStringInput> input21, Input<ModelBooleanInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<List<ModelChatParticipantConditionInput>> input28, Input<List<ModelChatParticipantConditionInput>> input29, Input<ModelChatParticipantConditionInput> input30) {
        this.accountId = input;
        this.channelId = input2;
        this.phoneNumberIdExternal = input3;
        this.participantId = input4;
        this.participationStatus = input5;
        this.unreadMessageCount = input6;
        this.lastViewed = input7;
        this.isStarred = input8;
        this.joinedAt = input9;
        this.leftAt = input10;
        this.channelName = input11;
        this.channelType = input12;
        this.channelSubType = input13;
        this.channelStatus = input14;
        this.channelWillBeChargedNext = input15;
        this.channelOpenUntil = input16;
        this.lastMessageByLeadTime = input17;
        this.lastMessageByUserTime = input18;
        this.isLastMessageByLead = input19;
        this.lastOutboundMessageId = input20;
        this.lastOutboundMessageStatus = input21;
        this.isNewMessageUpdate = input22;
        this.tags = input23;
        this.participantScopeIfInternal = input24;
        this.userIdsForDirectChannel = input25;
        this.createdAt = input26;
        this.updatedAt = input27;
        this.and = input28;
        this.or = input29;
        this.not = input30;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatParticipantConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput channelId() {
        return this.channelId.value;
    }

    public ModelStringInput channelName() {
        return this.channelName.value;
    }

    public ModelStringInput channelOpenUntil() {
        return this.channelOpenUntil.value;
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

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelBooleanInput isLastMessageByLead() {
        return this.isLastMessageByLead.value;
    }

    public ModelBooleanInput isNewMessageUpdate() {
        return this.isNewMessageUpdate.value;
    }

    public ModelBooleanInput isStarred() {
        return this.isStarred.value;
    }

    public ModelStringInput joinedAt() {
        return this.joinedAt.value;
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

    public ModelStringInput lastViewed() {
        return this.lastViewed.value;
    }

    public ModelStringInput leftAt() {
        return this.leftAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatParticipantConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatParticipantConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatParticipantConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatParticipantConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatParticipantConditionInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatParticipantConditionInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelChatParticipantConditionInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.participantId.defined) {
                    inputFieldWriter.writeObject("participantId", ModelChatParticipantConditionInput.this.participantId.value != 0 ? ((ModelIDInput) ModelChatParticipantConditionInput.this.participantId.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.participationStatus.defined) {
                    inputFieldWriter.writeObject("participationStatus", ModelChatParticipantConditionInput.this.participationStatus.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.participationStatus.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.unreadMessageCount.defined) {
                    inputFieldWriter.writeObject("unreadMessageCount", ModelChatParticipantConditionInput.this.unreadMessageCount.value != 0 ? ((ModelIntInput) ModelChatParticipantConditionInput.this.unreadMessageCount.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.lastViewed.defined) {
                    inputFieldWriter.writeObject("lastViewed", ModelChatParticipantConditionInput.this.lastViewed.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.lastViewed.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.isStarred.defined) {
                    inputFieldWriter.writeObject("isStarred", ModelChatParticipantConditionInput.this.isStarred.value != 0 ? ((ModelBooleanInput) ModelChatParticipantConditionInput.this.isStarred.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.joinedAt.defined) {
                    inputFieldWriter.writeObject("joinedAt", ModelChatParticipantConditionInput.this.joinedAt.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.joinedAt.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.leftAt.defined) {
                    inputFieldWriter.writeObject("leftAt", ModelChatParticipantConditionInput.this.leftAt.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.leftAt.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelName.defined) {
                    inputFieldWriter.writeObject("channelName", ModelChatParticipantConditionInput.this.channelName.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.channelName.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelType.defined) {
                    inputFieldWriter.writeObject("channelType", ModelChatParticipantConditionInput.this.channelType.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.channelType.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelSubType.defined) {
                    inputFieldWriter.writeObject("channelSubType", ModelChatParticipantConditionInput.this.channelSubType.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.channelSubType.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelStatus.defined) {
                    inputFieldWriter.writeObject("channelStatus", ModelChatParticipantConditionInput.this.channelStatus.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.channelStatus.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeObject("channelWillBeChargedNext", ModelChatParticipantConditionInput.this.channelWillBeChargedNext.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.channelWillBeChargedNext.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeObject("channelOpenUntil", ModelChatParticipantConditionInput.this.channelOpenUntil.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.channelOpenUntil.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByLeadTime", ModelChatParticipantConditionInput.this.lastMessageByLeadTime.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.lastMessageByLeadTime.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByUserTime", ModelChatParticipantConditionInput.this.lastMessageByUserTime.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.lastMessageByUserTime.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeObject("isLastMessageByLead", ModelChatParticipantConditionInput.this.isLastMessageByLead.value != 0 ? ((ModelBooleanInput) ModelChatParticipantConditionInput.this.isLastMessageByLead.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageId", ModelChatParticipantConditionInput.this.lastOutboundMessageId.value != 0 ? ((ModelIDInput) ModelChatParticipantConditionInput.this.lastOutboundMessageId.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageStatus", ModelChatParticipantConditionInput.this.lastOutboundMessageStatus.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.lastOutboundMessageStatus.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.isNewMessageUpdate.defined) {
                    inputFieldWriter.writeObject("isNewMessageUpdate", ModelChatParticipantConditionInput.this.isNewMessageUpdate.value != 0 ? ((ModelBooleanInput) ModelChatParticipantConditionInput.this.isNewMessageUpdate.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelChatParticipantConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeObject("participantScopeIfInternal", ModelChatParticipantConditionInput.this.participantScopeIfInternal.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.participantScopeIfInternal.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeObject("userIdsForDirectChannel", ModelChatParticipantConditionInput.this.userIdsForDirectChannel.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.userIdsForDirectChannel.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatParticipantConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatParticipantConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatParticipantConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatParticipantConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatParticipantConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatParticipantConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatParticipantConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatParticipantConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatParticipantConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatParticipantConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatParticipantConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatParticipantConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatParticipantConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatParticipantConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatParticipantConditionInput.this.not.value != 0 ? ((ModelChatParticipantConditionInput) ModelChatParticipantConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelChatParticipantConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatParticipantConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput participantId() {
        return this.participantId.value;
    }

    public ModelStringInput participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public ModelStringInput participationStatus() {
        return this.participationStatus.value;
    }

    public ModelStringInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelIntInput unreadMessageCount() {
        return this.unreadMessageCount.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput userIdsForDirectChannel() {
        return this.userIdsForDirectChannel.value;
    }
}
