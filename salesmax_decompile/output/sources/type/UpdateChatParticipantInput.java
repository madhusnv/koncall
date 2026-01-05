package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateChatParticipantInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> channelId;
    private final Input<String> channelName;
    private final Input<String> channelOpenUntil;
    private final Input<String> channelStatus;
    private final Input<String> channelSubType;
    private final Input<String> channelType;
    private final Input<String> channelWillBeChargedNext;
    private final Input<String> createdAt;
    private final String id;
    private final Input<Boolean> isLastMessageByLead;
    private final Input<Boolean> isNewMessageUpdate;
    private final Input<Boolean> isStarred;
    private final Input<String> joinedAt;
    private final Input<String> lastMessageByLeadTime;
    private final Input<String> lastMessageByUserTime;
    private final Input<String> lastOutboundMessageId;
    private final Input<String> lastOutboundMessageStatus;
    private final Input<String> lastViewed;
    private final Input<String> leftAt;
    private final Input<String> participantId;
    private final Input<String> participantScopeIfInternal;
    private final Input<String> participationStatus;
    private final Input<String> phoneNumberIdExternal;
    private final Input<List<String>> tags;
    private final Input<Integer> unreadMessageCount;
    private final Input<String> updatedAt;
    private final Input<String> userIdsForDirectChannel;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> phoneNumberIdExternal = Input.absent();
        private Input<String> participantId = Input.absent();
        private Input<String> participationStatus = Input.absent();
        private Input<Integer> unreadMessageCount = Input.absent();
        private Input<String> lastViewed = Input.absent();
        private Input<Boolean> isStarred = Input.absent();
        private Input<String> joinedAt = Input.absent();
        private Input<String> leftAt = Input.absent();
        private Input<String> channelName = Input.absent();
        private Input<String> channelType = Input.absent();
        private Input<String> channelSubType = Input.absent();
        private Input<String> channelStatus = Input.absent();
        private Input<String> channelWillBeChargedNext = Input.absent();
        private Input<String> channelOpenUntil = Input.absent();
        private Input<String> lastMessageByLeadTime = Input.absent();
        private Input<String> lastMessageByUserTime = Input.absent();
        private Input<Boolean> isLastMessageByLead = Input.absent();
        private Input<String> lastOutboundMessageId = Input.absent();
        private Input<String> lastOutboundMessageStatus = Input.absent();
        private Input<Boolean> isNewMessageUpdate = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<String> participantScopeIfInternal = Input.absent();
        private Input<String> userIdsForDirectChannel = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateChatParticipantInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateChatParticipantInput(this.id, this.accountId, this.channelId, this.phoneNumberIdExternal, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder channelName(String str) {
            this.channelName = Input.fromNullable(str);
            return this;
        }

        public Builder channelOpenUntil(String str) {
            this.channelOpenUntil = Input.fromNullable(str);
            return this;
        }

        public Builder channelStatus(String str) {
            this.channelStatus = Input.fromNullable(str);
            return this;
        }

        public Builder channelSubType(String str) {
            this.channelSubType = Input.fromNullable(str);
            return this;
        }

        public Builder channelType(String str) {
            this.channelType = Input.fromNullable(str);
            return this;
        }

        public Builder channelWillBeChargedNext(String str) {
            this.channelWillBeChargedNext = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isLastMessageByLead(Boolean bool) {
            this.isLastMessageByLead = Input.fromNullable(bool);
            return this;
        }

        public Builder isNewMessageUpdate(Boolean bool) {
            this.isNewMessageUpdate = Input.fromNullable(bool);
            return this;
        }

        public Builder isStarred(Boolean bool) {
            this.isStarred = Input.fromNullable(bool);
            return this;
        }

        public Builder joinedAt(String str) {
            this.joinedAt = Input.fromNullable(str);
            return this;
        }

        public Builder lastMessageByLeadTime(String str) {
            this.lastMessageByLeadTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastMessageByUserTime(String str) {
            this.lastMessageByUserTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastOutboundMessageId(String str) {
            this.lastOutboundMessageId = Input.fromNullable(str);
            return this;
        }

        public Builder lastOutboundMessageStatus(String str) {
            this.lastOutboundMessageStatus = Input.fromNullable(str);
            return this;
        }

        public Builder lastViewed(String str) {
            this.lastViewed = Input.fromNullable(str);
            return this;
        }

        public Builder leftAt(String str) {
            this.leftAt = Input.fromNullable(str);
            return this;
        }

        public Builder participantId(String str) {
            this.participantId = Input.fromNullable(str);
            return this;
        }

        public Builder participantScopeIfInternal(String str) {
            this.participantScopeIfInternal = Input.fromNullable(str);
            return this;
        }

        public Builder participationStatus(String str) {
            this.participationStatus = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = Input.fromNullable(str);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder unreadMessageCount(Integer num) {
            this.unreadMessageCount = Input.fromNullable(num);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userIdsForDirectChannel(String str) {
            this.userIdsForDirectChannel = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateChatParticipantInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6, Input<String> input7, Input<Boolean> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<Boolean> input19, Input<String> input20, Input<String> input21, Input<Boolean> input22, Input<List<String>> input23, Input<String> input24, Input<String> input25, Input<String> input26, Input<String> input27) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String channelId() {
        return this.channelId.value;
    }

    public String channelName() {
        return this.channelName.value;
    }

    public String channelOpenUntil() {
        return this.channelOpenUntil.value;
    }

    public String channelStatus() {
        return this.channelStatus.value;
    }

    public String channelSubType() {
        return this.channelSubType.value;
    }

    public String channelType() {
        return this.channelType.value;
    }

    public String channelWillBeChargedNext() {
        return this.channelWillBeChargedNext.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isLastMessageByLead() {
        return this.isLastMessageByLead.value;
    }

    public Boolean isNewMessageUpdate() {
        return this.isNewMessageUpdate.value;
    }

    public Boolean isStarred() {
        return this.isStarred.value;
    }

    public String joinedAt() {
        return this.joinedAt.value;
    }

    public String lastMessageByLeadTime() {
        return this.lastMessageByLeadTime.value;
    }

    public String lastMessageByUserTime() {
        return this.lastMessageByUserTime.value;
    }

    public String lastOutboundMessageId() {
        return this.lastOutboundMessageId.value;
    }

    public String lastOutboundMessageStatus() {
        return this.lastOutboundMessageStatus.value;
    }

    public String lastViewed() {
        return this.lastViewed.value;
    }

    public String leftAt() {
        return this.leftAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateChatParticipantInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateChatParticipantInput.this.id);
                if (UpdateChatParticipantInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateChatParticipantInput.this.accountId.value);
                }
                if (UpdateChatParticipantInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) UpdateChatParticipantInput.this.channelId.value);
                }
                if (UpdateChatParticipantInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) UpdateChatParticipantInput.this.phoneNumberIdExternal.value);
                }
                if (UpdateChatParticipantInput.this.participantId.defined) {
                    inputFieldWriter.writeString("participantId", (String) UpdateChatParticipantInput.this.participantId.value);
                }
                if (UpdateChatParticipantInput.this.participationStatus.defined) {
                    inputFieldWriter.writeString("participationStatus", (String) UpdateChatParticipantInput.this.participationStatus.value);
                }
                if (UpdateChatParticipantInput.this.unreadMessageCount.defined) {
                    inputFieldWriter.writeInt("unreadMessageCount", (Integer) UpdateChatParticipantInput.this.unreadMessageCount.value);
                }
                if (UpdateChatParticipantInput.this.lastViewed.defined) {
                    inputFieldWriter.writeString("lastViewed", (String) UpdateChatParticipantInput.this.lastViewed.value);
                }
                if (UpdateChatParticipantInput.this.isStarred.defined) {
                    inputFieldWriter.writeBoolean("isStarred", (Boolean) UpdateChatParticipantInput.this.isStarred.value);
                }
                if (UpdateChatParticipantInput.this.joinedAt.defined) {
                    inputFieldWriter.writeString("joinedAt", (String) UpdateChatParticipantInput.this.joinedAt.value);
                }
                if (UpdateChatParticipantInput.this.leftAt.defined) {
                    inputFieldWriter.writeString("leftAt", (String) UpdateChatParticipantInput.this.leftAt.value);
                }
                if (UpdateChatParticipantInput.this.channelName.defined) {
                    inputFieldWriter.writeString("channelName", (String) UpdateChatParticipantInput.this.channelName.value);
                }
                if (UpdateChatParticipantInput.this.channelType.defined) {
                    inputFieldWriter.writeString("channelType", (String) UpdateChatParticipantInput.this.channelType.value);
                }
                if (UpdateChatParticipantInput.this.channelSubType.defined) {
                    inputFieldWriter.writeString("channelSubType", (String) UpdateChatParticipantInput.this.channelSubType.value);
                }
                if (UpdateChatParticipantInput.this.channelStatus.defined) {
                    inputFieldWriter.writeString("channelStatus", (String) UpdateChatParticipantInput.this.channelStatus.value);
                }
                if (UpdateChatParticipantInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeString("channelWillBeChargedNext", (String) UpdateChatParticipantInput.this.channelWillBeChargedNext.value);
                }
                if (UpdateChatParticipantInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeString("channelOpenUntil", (String) UpdateChatParticipantInput.this.channelOpenUntil.value);
                }
                if (UpdateChatParticipantInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeString("lastMessageByLeadTime", (String) UpdateChatParticipantInput.this.lastMessageByLeadTime.value);
                }
                if (UpdateChatParticipantInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeString("lastMessageByUserTime", (String) UpdateChatParticipantInput.this.lastMessageByUserTime.value);
                }
                if (UpdateChatParticipantInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeBoolean("isLastMessageByLead", (Boolean) UpdateChatParticipantInput.this.isLastMessageByLead.value);
                }
                if (UpdateChatParticipantInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeString("lastOutboundMessageId", (String) UpdateChatParticipantInput.this.lastOutboundMessageId.value);
                }
                if (UpdateChatParticipantInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeString("lastOutboundMessageStatus", (String) UpdateChatParticipantInput.this.lastOutboundMessageStatus.value);
                }
                if (UpdateChatParticipantInput.this.isNewMessageUpdate.defined) {
                    inputFieldWriter.writeBoolean("isNewMessageUpdate", (Boolean) UpdateChatParticipantInput.this.isNewMessageUpdate.value);
                }
                if (UpdateChatParticipantInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", UpdateChatParticipantInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatParticipantInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatParticipantInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateChatParticipantInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeString("participantScopeIfInternal", (String) UpdateChatParticipantInput.this.participantScopeIfInternal.value);
                }
                if (UpdateChatParticipantInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeString("userIdsForDirectChannel", (String) UpdateChatParticipantInput.this.userIdsForDirectChannel.value);
                }
                if (UpdateChatParticipantInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateChatParticipantInput.this.createdAt.value);
                }
                if (UpdateChatParticipantInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateChatParticipantInput.this.updatedAt.value);
                }
            }
        };
    }

    public String participantId() {
        return this.participantId.value;
    }

    public String participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public String participationStatus() {
        return this.participationStatus.value;
    }

    public String phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public Integer unreadMessageCount() {
        return this.unreadMessageCount.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userIdsForDirectChannel() {
        return this.userIdsForDirectChannel.value;
    }
}
