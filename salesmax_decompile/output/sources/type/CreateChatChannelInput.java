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
public final class CreateChatChannelInput implements InputType {
    private final String accountId;
    private final Input<Boolean> chanelHasOnlyBroadcast;
    private final Input<String> channelName;
    private final Input<String> channelOpenUntil;
    private final Input<String> channelProfilePic;
    private final Input<String> channelStatus;
    private final Input<String> channelSubType;
    private final Input<String> channelType;
    private final Input<String> channelWillBeChargedNext;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<Boolean> externalParticipantsAllowed;
    private final Input<String> id;
    private final Input<Boolean> isLastMessageByLead;
    private final Input<String> lastMessageByLeadTime;
    private final Input<String> lastMessageByUserTime;
    private final Input<String> lastOutboundMessageId;
    private final Input<String> lastOutboundMessageStatus;
    private final Input<Boolean> lastOutboundMessageWasBroadcast;
    private final Input<String> messagePlatform;
    private final Input<String> ownerId;
    private final Input<String> participantScopeIfInternal;
    private final Input<String> phoneNumberIdExternal;
    private final Input<String> primaryTeamId;
    private final Input<String> readNotifiedAt;
    private final Input<String> recipientExternalId;
    private final Input<String> recipientExternalIdType;
    private final Input<String> recipientType;
    private final Input<String> salesmaxAccountId;
    private final Input<List<String>> tags;
    private final Input<ContactAssignmentStatus> toBeAssigned;
    private final Input<String> updatedAt;
    private final Input<String> userIdsForDirectChannel;
    private final Input<String> visitorId;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> phoneNumberIdExternal = Input.absent();
        private Input<String> channelName = Input.absent();
        private Input<String> messagePlatform = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<String> recipientType = Input.absent();
        private Input<String> channelType = Input.absent();
        private Input<String> channelSubType = Input.absent();
        private Input<Boolean> externalParticipantsAllowed = Input.absent();
        private Input<String> participantScopeIfInternal = Input.absent();
        private Input<String> userIdsForDirectChannel = Input.absent();
        private Input<String> channelStatus = Input.absent();
        private Input<String> channelWillBeChargedNext = Input.absent();
        private Input<String> channelOpenUntil = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> visitorId = Input.absent();
        private Input<String> recipientExternalId = Input.absent();
        private Input<String> recipientExternalIdType = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<ContactAssignmentStatus> toBeAssigned = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> readNotifiedAt = Input.absent();
        private Input<String> lastMessageByLeadTime = Input.absent();
        private Input<String> lastMessageByUserTime = Input.absent();
        private Input<Boolean> isLastMessageByLead = Input.absent();
        private Input<String> lastOutboundMessageId = Input.absent();
        private Input<String> lastOutboundMessageStatus = Input.absent();
        private Input<Boolean> lastOutboundMessageWasBroadcast = Input.absent();
        private Input<Boolean> chanelHasOnlyBroadcast = Input.absent();
        private Input<String> salesmaxAccountId = Input.absent();
        private Input<String> channelProfilePic = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateChatChannelInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateChatChannelInput(this.id, this.accountId, this.phoneNumberIdExternal, this.channelName, this.messagePlatform, this.tags, this.recipientType, this.channelType, this.channelSubType, this.externalParticipantsAllowed, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.contactId, this.visitorId, this.recipientExternalId, this.recipientExternalIdType, this.ownerId, this.primaryTeamId, this.toBeAssigned, this.createdById, this.readNotifiedAt, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.lastOutboundMessageWasBroadcast, this.chanelHasOnlyBroadcast, this.salesmaxAccountId, this.channelProfilePic, this.createdAt, this.updatedAt);
        }

        public Builder chanelHasOnlyBroadcast(Boolean bool) {
            this.chanelHasOnlyBroadcast = Input.fromNullable(bool);
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

        public Builder channelProfilePic(String str) {
            this.channelProfilePic = Input.fromNullable(str);
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

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder externalParticipantsAllowed(Boolean bool) {
            this.externalParticipantsAllowed = Input.fromNullable(bool);
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

        public Builder lastOutboundMessageWasBroadcast(Boolean bool) {
            this.lastOutboundMessageWasBroadcast = Input.fromNullable(bool);
            return this;
        }

        public Builder messagePlatform(String str) {
            this.messagePlatform = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder participantScopeIfInternal(String str) {
            this.participantScopeIfInternal = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberIdExternal(String str) {
            this.phoneNumberIdExternal = Input.fromNullable(str);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder readNotifiedAt(String str) {
            this.readNotifiedAt = Input.fromNullable(str);
            return this;
        }

        public Builder recipientExternalId(String str) {
            this.recipientExternalId = Input.fromNullable(str);
            return this;
        }

        public Builder recipientExternalIdType(String str) {
            this.recipientExternalIdType = Input.fromNullable(str);
            return this;
        }

        public Builder recipientType(String str) {
            this.recipientType = Input.fromNullable(str);
            return this;
        }

        public Builder salesmaxAccountId(String str) {
            this.salesmaxAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = Input.fromNullable(contactAssignmentStatus);
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

        public Builder visitorId(String str) {
            this.visitorId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateChatChannelInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<List<String>> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<Boolean> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<ContactAssignmentStatus> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<Boolean> input26, Input<String> input27, Input<String> input28, Input<Boolean> input29, Input<Boolean> input30, Input<String> input31, Input<String> input32, Input<String> input33, Input<String> input34) {
        this.id = input;
        this.accountId = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public Boolean chanelHasOnlyBroadcast() {
        return this.chanelHasOnlyBroadcast.value;
    }

    public String channelName() {
        return this.channelName.value;
    }

    public String channelOpenUntil() {
        return this.channelOpenUntil.value;
    }

    public String channelProfilePic() {
        return this.channelProfilePic.value;
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

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public Boolean externalParticipantsAllowed() {
        return this.externalParticipantsAllowed.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isLastMessageByLead() {
        return this.isLastMessageByLead.value;
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

    public Boolean lastOutboundMessageWasBroadcast() {
        return this.lastOutboundMessageWasBroadcast.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateChatChannelInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatChannelInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatChannelInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateChatChannelInput.this.accountId);
                if (CreateChatChannelInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeString("phoneNumberIdExternal", (String) CreateChatChannelInput.this.phoneNumberIdExternal.value);
                }
                if (CreateChatChannelInput.this.channelName.defined) {
                    inputFieldWriter.writeString("channelName", (String) CreateChatChannelInput.this.channelName.value);
                }
                if (CreateChatChannelInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeString("messagePlatform", (String) CreateChatChannelInput.this.messagePlatform.value);
                }
                if (CreateChatChannelInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateChatChannelInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatChannelInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatChannelInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateChatChannelInput.this.recipientType.defined) {
                    inputFieldWriter.writeString("recipientType", (String) CreateChatChannelInput.this.recipientType.value);
                }
                if (CreateChatChannelInput.this.channelType.defined) {
                    inputFieldWriter.writeString("channelType", (String) CreateChatChannelInput.this.channelType.value);
                }
                if (CreateChatChannelInput.this.channelSubType.defined) {
                    inputFieldWriter.writeString("channelSubType", (String) CreateChatChannelInput.this.channelSubType.value);
                }
                if (CreateChatChannelInput.this.externalParticipantsAllowed.defined) {
                    inputFieldWriter.writeBoolean("externalParticipantsAllowed", (Boolean) CreateChatChannelInput.this.externalParticipantsAllowed.value);
                }
                if (CreateChatChannelInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeString("participantScopeIfInternal", (String) CreateChatChannelInput.this.participantScopeIfInternal.value);
                }
                if (CreateChatChannelInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeString("userIdsForDirectChannel", (String) CreateChatChannelInput.this.userIdsForDirectChannel.value);
                }
                if (CreateChatChannelInput.this.channelStatus.defined) {
                    inputFieldWriter.writeString("channelStatus", (String) CreateChatChannelInput.this.channelStatus.value);
                }
                if (CreateChatChannelInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeString("channelWillBeChargedNext", (String) CreateChatChannelInput.this.channelWillBeChargedNext.value);
                }
                if (CreateChatChannelInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeString("channelOpenUntil", (String) CreateChatChannelInput.this.channelOpenUntil.value);
                }
                if (CreateChatChannelInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateChatChannelInput.this.contactId.value);
                }
                if (CreateChatChannelInput.this.visitorId.defined) {
                    inputFieldWriter.writeString("visitorId", (String) CreateChatChannelInput.this.visitorId.value);
                }
                if (CreateChatChannelInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeString("recipientExternalId", (String) CreateChatChannelInput.this.recipientExternalId.value);
                }
                if (CreateChatChannelInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeString("recipientExternalIdType", (String) CreateChatChannelInput.this.recipientExternalIdType.value);
                }
                if (CreateChatChannelInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) CreateChatChannelInput.this.ownerId.value);
                }
                if (CreateChatChannelInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateChatChannelInput.this.primaryTeamId.value);
                }
                if (CreateChatChannelInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", CreateChatChannelInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) CreateChatChannelInput.this.toBeAssigned.value).name() : null);
                }
                if (CreateChatChannelInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateChatChannelInput.this.createdById.value);
                }
                if (CreateChatChannelInput.this.readNotifiedAt.defined) {
                    inputFieldWriter.writeString("readNotifiedAt", (String) CreateChatChannelInput.this.readNotifiedAt.value);
                }
                if (CreateChatChannelInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeString("lastMessageByLeadTime", (String) CreateChatChannelInput.this.lastMessageByLeadTime.value);
                }
                if (CreateChatChannelInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeString("lastMessageByUserTime", (String) CreateChatChannelInput.this.lastMessageByUserTime.value);
                }
                if (CreateChatChannelInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeBoolean("isLastMessageByLead", (Boolean) CreateChatChannelInput.this.isLastMessageByLead.value);
                }
                if (CreateChatChannelInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeString("lastOutboundMessageId", (String) CreateChatChannelInput.this.lastOutboundMessageId.value);
                }
                if (CreateChatChannelInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeString("lastOutboundMessageStatus", (String) CreateChatChannelInput.this.lastOutboundMessageStatus.value);
                }
                if (CreateChatChannelInput.this.lastOutboundMessageWasBroadcast.defined) {
                    inputFieldWriter.writeBoolean("lastOutboundMessageWasBroadcast", (Boolean) CreateChatChannelInput.this.lastOutboundMessageWasBroadcast.value);
                }
                if (CreateChatChannelInput.this.chanelHasOnlyBroadcast.defined) {
                    inputFieldWriter.writeBoolean("chanelHasOnlyBroadcast", (Boolean) CreateChatChannelInput.this.chanelHasOnlyBroadcast.value);
                }
                if (CreateChatChannelInput.this.salesmaxAccountId.defined) {
                    inputFieldWriter.writeString("salesmaxAccountId", (String) CreateChatChannelInput.this.salesmaxAccountId.value);
                }
                if (CreateChatChannelInput.this.channelProfilePic.defined) {
                    inputFieldWriter.writeString("channelProfilePic", (String) CreateChatChannelInput.this.channelProfilePic.value);
                }
                if (CreateChatChannelInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatChannelInput.this.createdAt.value);
                }
                if (CreateChatChannelInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatChannelInput.this.updatedAt.value);
                }
            }
        };
    }

    public String messagePlatform() {
        return this.messagePlatform.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public String phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public String readNotifiedAt() {
        return this.readNotifiedAt.value;
    }

    public String recipientExternalId() {
        return this.recipientExternalId.value;
    }

    public String recipientExternalIdType() {
        return this.recipientExternalIdType.value;
    }

    public String recipientType() {
        return this.recipientType.value;
    }

    public String salesmaxAccountId() {
        return this.salesmaxAccountId.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public ContactAssignmentStatus toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userIdsForDirectChannel() {
        return this.userIdsForDirectChannel.value;
    }

    public String visitorId() {
        return this.visitorId.value;
    }
}
