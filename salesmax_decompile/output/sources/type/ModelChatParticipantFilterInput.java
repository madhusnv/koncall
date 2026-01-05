package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatParticipantFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatParticipantFilterInput>> and;
    private final Input<ModelIDInput> channelId;
    private final Input<ModelStringInput> channelName;
    private final Input<ModelStringInput> channelOpenUntil;
    private final Input<ModelStringInput> channelStatus;
    private final Input<ModelStringInput> channelSubType;
    private final Input<ModelStringInput> channelType;
    private final Input<ModelStringInput> channelWillBeChargedNext;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
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
    private final Input<ModelChatParticipantFilterInput> not;
    private final Input<List<ModelChatParticipantFilterInput>> or;
    private final Input<ModelIDInput> participantId;
    private final Input<ModelStringInput> participantScopeIfInternal;
    private final Input<ModelStringInput> participationStatus;
    private final Input<ModelStringInput> phoneNumberIdExternal;
    private final Input<ModelStringInput> tags;
    private final Input<ModelIntInput> unreadMessageCount;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> userIdsForDirectChannel;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelChatParticipantFilterInput>> and = Input.absent();
        private Input<List<ModelChatParticipantFilterInput>> or = Input.absent();
        private Input<ModelChatParticipantFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatParticipantFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelChatParticipantFilterInput build() {
            return new ModelChatParticipantFilterInput(this.id, this.accountId, this.channelId, this.phoneNumberIdExternal, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelChatParticipantFilterInput modelChatParticipantFilterInput) {
            this.not = Input.fromNullable(modelChatParticipantFilterInput);
            return this;
        }

        public Builder or(List<ModelChatParticipantFilterInput> list) {
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

    public ModelChatParticipantFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelBooleanInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelBooleanInput> input20, Input<ModelIDInput> input21, Input<ModelStringInput> input22, Input<ModelBooleanInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<List<ModelChatParticipantFilterInput>> input29, Input<List<ModelChatParticipantFilterInput>> input30, Input<ModelChatParticipantFilterInput> input31) {
        this.id = input;
        this.accountId = input2;
        this.channelId = input3;
        this.phoneNumberIdExternal = input4;
        this.participantId = input5;
        this.participationStatus = input6;
        this.unreadMessageCount = input7;
        this.lastViewed = input8;
        this.isStarred = input9;
        this.joinedAt = input10;
        this.leftAt = input11;
        this.channelName = input12;
        this.channelType = input13;
        this.channelSubType = input14;
        this.channelStatus = input15;
        this.channelWillBeChargedNext = input16;
        this.channelOpenUntil = input17;
        this.lastMessageByLeadTime = input18;
        this.lastMessageByUserTime = input19;
        this.isLastMessageByLead = input20;
        this.lastOutboundMessageId = input21;
        this.lastOutboundMessageStatus = input22;
        this.isNewMessageUpdate = input23;
        this.tags = input24;
        this.participantScopeIfInternal = input25;
        this.userIdsForDirectChannel = input26;
        this.createdAt = input27;
        this.updatedAt = input28;
        this.and = input29;
        this.or = input30;
        this.not = input31;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatParticipantFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelChatParticipantFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatParticipantFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelChatParticipantFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelChatParticipantFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatParticipantFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatParticipantFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", ModelChatParticipantFilterInput.this.channelId.value != 0 ? ((ModelIDInput) ModelChatParticipantFilterInput.this.channelId.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", ModelChatParticipantFilterInput.this.phoneNumberIdExternal.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.participantId.defined) {
                    inputFieldWriter.writeObject("participantId", ModelChatParticipantFilterInput.this.participantId.value != 0 ? ((ModelIDInput) ModelChatParticipantFilterInput.this.participantId.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.participationStatus.defined) {
                    inputFieldWriter.writeObject("participationStatus", ModelChatParticipantFilterInput.this.participationStatus.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.participationStatus.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.unreadMessageCount.defined) {
                    inputFieldWriter.writeObject("unreadMessageCount", ModelChatParticipantFilterInput.this.unreadMessageCount.value != 0 ? ((ModelIntInput) ModelChatParticipantFilterInput.this.unreadMessageCount.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.lastViewed.defined) {
                    inputFieldWriter.writeObject("lastViewed", ModelChatParticipantFilterInput.this.lastViewed.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.lastViewed.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.isStarred.defined) {
                    inputFieldWriter.writeObject("isStarred", ModelChatParticipantFilterInput.this.isStarred.value != 0 ? ((ModelBooleanInput) ModelChatParticipantFilterInput.this.isStarred.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.joinedAt.defined) {
                    inputFieldWriter.writeObject("joinedAt", ModelChatParticipantFilterInput.this.joinedAt.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.joinedAt.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.leftAt.defined) {
                    inputFieldWriter.writeObject("leftAt", ModelChatParticipantFilterInput.this.leftAt.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.leftAt.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelName.defined) {
                    inputFieldWriter.writeObject("channelName", ModelChatParticipantFilterInput.this.channelName.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.channelName.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelType.defined) {
                    inputFieldWriter.writeObject("channelType", ModelChatParticipantFilterInput.this.channelType.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.channelType.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelSubType.defined) {
                    inputFieldWriter.writeObject("channelSubType", ModelChatParticipantFilterInput.this.channelSubType.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.channelSubType.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelStatus.defined) {
                    inputFieldWriter.writeObject("channelStatus", ModelChatParticipantFilterInput.this.channelStatus.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.channelStatus.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeObject("channelWillBeChargedNext", ModelChatParticipantFilterInput.this.channelWillBeChargedNext.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.channelWillBeChargedNext.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeObject("channelOpenUntil", ModelChatParticipantFilterInput.this.channelOpenUntil.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.channelOpenUntil.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByLeadTime", ModelChatParticipantFilterInput.this.lastMessageByLeadTime.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.lastMessageByLeadTime.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByUserTime", ModelChatParticipantFilterInput.this.lastMessageByUserTime.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.lastMessageByUserTime.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeObject("isLastMessageByLead", ModelChatParticipantFilterInput.this.isLastMessageByLead.value != 0 ? ((ModelBooleanInput) ModelChatParticipantFilterInput.this.isLastMessageByLead.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageId", ModelChatParticipantFilterInput.this.lastOutboundMessageId.value != 0 ? ((ModelIDInput) ModelChatParticipantFilterInput.this.lastOutboundMessageId.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageStatus", ModelChatParticipantFilterInput.this.lastOutboundMessageStatus.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.lastOutboundMessageStatus.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.isNewMessageUpdate.defined) {
                    inputFieldWriter.writeObject("isNewMessageUpdate", ModelChatParticipantFilterInput.this.isNewMessageUpdate.value != 0 ? ((ModelBooleanInput) ModelChatParticipantFilterInput.this.isNewMessageUpdate.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelChatParticipantFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeObject("participantScopeIfInternal", ModelChatParticipantFilterInput.this.participantScopeIfInternal.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.participantScopeIfInternal.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeObject("userIdsForDirectChannel", ModelChatParticipantFilterInput.this.userIdsForDirectChannel.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.userIdsForDirectChannel.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatParticipantFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatParticipantFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatParticipantFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatParticipantFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatParticipantFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatParticipantFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatParticipantFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatParticipantFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatParticipantFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatParticipantFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatParticipantFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatParticipantFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatParticipantFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatParticipantFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatParticipantFilterInput.this.not.value != 0 ? ((ModelChatParticipantFilterInput) ModelChatParticipantFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelChatParticipantFilterInput not() {
        return this.not.value;
    }

    public List<ModelChatParticipantFilterInput> or() {
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
