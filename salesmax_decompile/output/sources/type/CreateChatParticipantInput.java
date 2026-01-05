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
public final class CreateChatParticipantInput implements InputType {
    private final String accountId;
    private final String channelId;
    private final Input<String> channelName;
    private final Input<String> channelOpenUntil;
    private final Input<String> channelStatus;
    private final Input<String> channelSubType;
    private final Input<String> channelType;
    private final Input<String> channelWillBeChargedNext;
    private final Input<String> createdAt;
    private final Input<String> id;
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
    private final String participantId;
    private final Input<String> participantScopeIfInternal;
    private final String participationStatus;
    private final Input<String> phoneNumberIdExternal;
    private final Input<List<String>> tags;
    private final Input<Integer> unreadMessageCount;
    private final Input<String> updatedAt;
    private final Input<String> userIdsForDirectChannel;

    public static final class Builder {
        private String accountId;
        private String channelId;
        private String participantId;
        private String participationStatus;
        private Input<String> id = Input.absent();
        private Input<String> phoneNumberIdExternal = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public CreateChatParticipantInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.channelId, "channelId == null");
            Utils.checkNotNull(this.participantId, "participantId == null");
            Utils.checkNotNull(this.participationStatus, "participationStatus == null");
            return new CreateChatParticipantInput(this.id, this.accountId, this.channelId, this.phoneNumberIdExternal, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = str;
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
            this.id = Input.fromNullable(str);
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
            this.participantId = str;
            return this;
        }

        public Builder participantScopeIfInternal(String str) {
            this.participantScopeIfInternal = Input.fromNullable(str);
            return this;
        }

        public Builder participationStatus(String str) {
            this.participationStatus = str;
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

    public CreateChatParticipantInput(Input<String> input, String str, String str2, Input<String> input2, String str3, String str4, Input<Integer> input3, Input<String> input4, Input<Boolean> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<Boolean> input16, Input<String> input17, Input<String> input18, Input<Boolean> input19, Input<List<String>> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24) {
        this.id = input;
        this.accountId = str;
        this.channelId = str2;
        this.phoneNumberIdExternal = input2;
        this.participantId = str3;
        this.participationStatus = str4;
        this.unreadMessageCount = input3;
        this.lastViewed = input4;
        this.isStarred = input5;
        this.joinedAt = input6;
        this.leftAt = input7;
        this.channelName = input8;
        this.channelType = input9;
        this.channelSubType = input10;
        this.channelStatus = input11;
        this.channelWillBeChargedNext = input12;
        this.channelOpenUntil = input13;
        this.lastMessageByLeadTime = input14;
        this.lastMessageByUserTime = input15;
        this.isLastMessageByLead = input16;
        this.lastOutboundMessageId = input17;
        this.lastOutboundMessageStatus = input18;
        this.isNewMessageUpdate = input19;
        this.tags = input20;
        this.participantScopeIfInternal = input21;
        this.userIdsForDirectChannel = input22;
        this.createdAt = input23;
        this.updatedAt = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String channelId() {
        return this.channelId;
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
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.CreateChatParticipantInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatParticipantInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatParticipantInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateChatParticipantInput.this.accountId);
                inputFieldWriter.writeString("channelId", CreateChatParticipantInput.this.channelId);
                if (CreateChatParticipantInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) CreateChatParticipantInput.this.phoneNumberIdExternal.value);
                }
                inputFieldWriter.writeString("participantId", CreateChatParticipantInput.this.participantId);
                inputFieldWriter.writeString("participationStatus", CreateChatParticipantInput.this.participationStatus);
                if (CreateChatParticipantInput.this.unreadMessageCount.defined) {
                    inputFieldWriter.writeInt("unreadMessageCount", (Integer) CreateChatParticipantInput.this.unreadMessageCount.value);
                }
                if (CreateChatParticipantInput.this.lastViewed.defined) {
                    inputFieldWriter.writeString("lastViewed", (String) CreateChatParticipantInput.this.lastViewed.value);
                }
                if (CreateChatParticipantInput.this.isStarred.defined) {
                    inputFieldWriter.writeBoolean("isStarred", (Boolean) CreateChatParticipantInput.this.isStarred.value);
                }
                if (CreateChatParticipantInput.this.joinedAt.defined) {
                    inputFieldWriter.writeString("joinedAt", (String) CreateChatParticipantInput.this.joinedAt.value);
                }
                if (CreateChatParticipantInput.this.leftAt.defined) {
                    inputFieldWriter.writeString("leftAt", (String) CreateChatParticipantInput.this.leftAt.value);
                }
                if (CreateChatParticipantInput.this.channelName.defined) {
                    inputFieldWriter.writeString("channelName", (String) CreateChatParticipantInput.this.channelName.value);
                }
                if (CreateChatParticipantInput.this.channelType.defined) {
                    inputFieldWriter.writeString("channelType", (String) CreateChatParticipantInput.this.channelType.value);
                }
                if (CreateChatParticipantInput.this.channelSubType.defined) {
                    inputFieldWriter.writeString("channelSubType", (String) CreateChatParticipantInput.this.channelSubType.value);
                }
                if (CreateChatParticipantInput.this.channelStatus.defined) {
                    inputFieldWriter.writeString("channelStatus", (String) CreateChatParticipantInput.this.channelStatus.value);
                }
                if (CreateChatParticipantInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeString("channelWillBeChargedNext", (String) CreateChatParticipantInput.this.channelWillBeChargedNext.value);
                }
                if (CreateChatParticipantInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeString("channelOpenUntil", (String) CreateChatParticipantInput.this.channelOpenUntil.value);
                }
                if (CreateChatParticipantInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeString("lastMessageByLeadTime", (String) CreateChatParticipantInput.this.lastMessageByLeadTime.value);
                }
                if (CreateChatParticipantInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeString("lastMessageByUserTime", (String) CreateChatParticipantInput.this.lastMessageByUserTime.value);
                }
                if (CreateChatParticipantInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeBoolean("isLastMessageByLead", (Boolean) CreateChatParticipantInput.this.isLastMessageByLead.value);
                }
                if (CreateChatParticipantInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeString("lastOutboundMessageId", (String) CreateChatParticipantInput.this.lastOutboundMessageId.value);
                }
                if (CreateChatParticipantInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeString("lastOutboundMessageStatus", (String) CreateChatParticipantInput.this.lastOutboundMessageStatus.value);
                }
                if (CreateChatParticipantInput.this.isNewMessageUpdate.defined) {
                    inputFieldWriter.writeBoolean("isNewMessageUpdate", (Boolean) CreateChatParticipantInput.this.isNewMessageUpdate.value);
                }
                if (CreateChatParticipantInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateChatParticipantInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatParticipantInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatParticipantInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateChatParticipantInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeString("participantScopeIfInternal", (String) CreateChatParticipantInput.this.participantScopeIfInternal.value);
                }
                if (CreateChatParticipantInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeString("userIdsForDirectChannel", (String) CreateChatParticipantInput.this.userIdsForDirectChannel.value);
                }
                if (CreateChatParticipantInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatParticipantInput.this.createdAt.value);
                }
                if (CreateChatParticipantInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatParticipantInput.this.updatedAt.value);
                }
            }
        };
    }

    public String participantId() {
        return this.participantId;
    }

    public String participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public String participationStatus() {
        return this.participationStatus;
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
