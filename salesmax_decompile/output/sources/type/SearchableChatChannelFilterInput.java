package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableChatChannelFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableChatChannelFilterInput>> and;
    private final Input<SearchableBooleanFilterInput> chanelHasOnlyBroadcast;
    private final Input<SearchableStringFilterInput> channelName;
    private final Input<SearchableStringFilterInput> channelOpenUntil;
    private final Input<SearchableStringFilterInput> channelStatus;
    private final Input<SearchableStringFilterInput> channelSubType;
    private final Input<SearchableStringFilterInput> channelType;
    private final Input<SearchableStringFilterInput> channelWillBeChargedNext;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableBooleanFilterInput> externalParticipantsAllowed;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> isLastMessageByLead;
    private final Input<SearchableStringFilterInput> lastMessageByLeadTime;
    private final Input<SearchableStringFilterInput> lastMessageByUserTime;
    private final Input<SearchableIDFilterInput> lastOutboundMessageId;
    private final Input<SearchableStringFilterInput> lastOutboundMessageStatus;
    private final Input<SearchableBooleanFilterInput> lastOutboundMessageWasBroadcast;
    private final Input<SearchableStringFilterInput> messagePlatform;
    private final Input<List<SearchableChatChannelFilterInput>> not;
    private final Input<List<SearchableChatChannelFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableStringFilterInput> participantScopeIfInternal;
    private final Input<SearchableStringFilterInput> phoneNumberIdExternal;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableStringFilterInput> readNotifiedAt;
    private final Input<SearchableStringFilterInput> recipientExternalId;
    private final Input<SearchableStringFilterInput> recipientExternalIdType;
    private final Input<SearchableStringFilterInput> recipientType;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableStringFilterInput> toBeAssigned;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> userIdsForDirectChannel;
    private final Input<SearchableIDFilterInput> visitorId;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> phoneNumberIdExternal = Input.absent();
        private Input<SearchableStringFilterInput> channelName = Input.absent();
        private Input<SearchableStringFilterInput> messagePlatform = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableStringFilterInput> recipientType = Input.absent();
        private Input<SearchableStringFilterInput> channelType = Input.absent();
        private Input<SearchableStringFilterInput> channelSubType = Input.absent();
        private Input<SearchableBooleanFilterInput> externalParticipantsAllowed = Input.absent();
        private Input<SearchableStringFilterInput> participantScopeIfInternal = Input.absent();
        private Input<SearchableStringFilterInput> userIdsForDirectChannel = Input.absent();
        private Input<SearchableStringFilterInput> channelStatus = Input.absent();
        private Input<SearchableStringFilterInput> channelWillBeChargedNext = Input.absent();
        private Input<SearchableStringFilterInput> channelOpenUntil = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> visitorId = Input.absent();
        private Input<SearchableStringFilterInput> recipientExternalId = Input.absent();
        private Input<SearchableStringFilterInput> recipientExternalIdType = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableStringFilterInput> toBeAssigned = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableStringFilterInput> readNotifiedAt = Input.absent();
        private Input<SearchableStringFilterInput> lastMessageByLeadTime = Input.absent();
        private Input<SearchableStringFilterInput> lastMessageByUserTime = Input.absent();
        private Input<SearchableBooleanFilterInput> isLastMessageByLead = Input.absent();
        private Input<SearchableIDFilterInput> lastOutboundMessageId = Input.absent();
        private Input<SearchableStringFilterInput> lastOutboundMessageStatus = Input.absent();
        private Input<SearchableBooleanFilterInput> lastOutboundMessageWasBroadcast = Input.absent();
        private Input<SearchableBooleanFilterInput> chanelHasOnlyBroadcast = Input.absent();
        private Input<List<SearchableChatChannelFilterInput>> and = Input.absent();
        private Input<List<SearchableChatChannelFilterInput>> or = Input.absent();
        private Input<List<SearchableChatChannelFilterInput>> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableChatChannelFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableChatChannelFilterInput build() {
            return new SearchableChatChannelFilterInput(this.id, this.accountId, this.phoneNumberIdExternal, this.channelName, this.messagePlatform, this.tags, this.recipientType, this.channelType, this.channelSubType, this.externalParticipantsAllowed, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.contactId, this.visitorId, this.recipientExternalId, this.recipientExternalIdType, this.ownerId, this.primaryTeamId, this.toBeAssigned, this.createdById, this.createdAt, this.updatedAt, this.readNotifiedAt, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.lastOutboundMessageWasBroadcast, this.chanelHasOnlyBroadcast, this.and, this.or, this.not);
        }

        public Builder chanelHasOnlyBroadcast(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.chanelHasOnlyBroadcast = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder channelName(SearchableStringFilterInput searchableStringFilterInput) {
            this.channelName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder channelOpenUntil(SearchableStringFilterInput searchableStringFilterInput) {
            this.channelOpenUntil = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder channelStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.channelStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder channelSubType(SearchableStringFilterInput searchableStringFilterInput) {
            this.channelSubType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder channelType(SearchableStringFilterInput searchableStringFilterInput) {
            this.channelType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder channelWillBeChargedNext(SearchableStringFilterInput searchableStringFilterInput) {
            this.channelWillBeChargedNext = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdById(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder externalParticipantsAllowed(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.externalParticipantsAllowed = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isLastMessageByLead(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isLastMessageByLead = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder lastMessageByLeadTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastMessageByLeadTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastMessageByUserTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastMessageByUserTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastOutboundMessageId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastOutboundMessageId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastOutboundMessageStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastOutboundMessageStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastOutboundMessageWasBroadcast(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.lastOutboundMessageWasBroadcast = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder messagePlatform(SearchableStringFilterInput searchableStringFilterInput) {
            this.messagePlatform = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(List<SearchableChatChannelFilterInput> list) {
            this.not = Input.fromNullable(list);
            return this;
        }

        public Builder or(List<SearchableChatChannelFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder participantScopeIfInternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.participantScopeIfInternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder phoneNumberIdExternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.phoneNumberIdExternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder primaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.primaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder readNotifiedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.readNotifiedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recipientExternalId(SearchableStringFilterInput searchableStringFilterInput) {
            this.recipientExternalId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recipientExternalIdType(SearchableStringFilterInput searchableStringFilterInput) {
            this.recipientExternalIdType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recipientType(SearchableStringFilterInput searchableStringFilterInput) {
            this.recipientType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder toBeAssigned(SearchableStringFilterInput searchableStringFilterInput) {
            this.toBeAssigned = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder userIdsForDirectChannel(SearchableStringFilterInput searchableStringFilterInput) {
            this.userIdsForDirectChannel = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder visitorId(SearchableIDFilterInput searchableIDFilterInput) {
            this.visitorId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableChatChannelFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableBooleanFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableIDFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableIDFilterInput> input20, Input<SearchableIDFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableIDFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<SearchableBooleanFilterInput> input29, Input<SearchableIDFilterInput> input30, Input<SearchableStringFilterInput> input31, Input<SearchableBooleanFilterInput> input32, Input<SearchableBooleanFilterInput> input33, Input<List<SearchableChatChannelFilterInput>> input34, Input<List<SearchableChatChannelFilterInput>> input35, Input<List<SearchableChatChannelFilterInput>> input36) {
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
        this.createdAt = input24;
        this.updatedAt = input25;
        this.readNotifiedAt = input26;
        this.lastMessageByLeadTime = input27;
        this.lastMessageByUserTime = input28;
        this.isLastMessageByLead = input29;
        this.lastOutboundMessageId = input30;
        this.lastOutboundMessageStatus = input31;
        this.lastOutboundMessageWasBroadcast = input32;
        this.chanelHasOnlyBroadcast = input33;
        this.and = input34;
        this.or = input35;
        this.not = input36;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableChatChannelFilterInput> and() {
        return this.and.value;
    }

    public SearchableBooleanFilterInput chanelHasOnlyBroadcast() {
        return this.chanelHasOnlyBroadcast.value;
    }

    public SearchableStringFilterInput channelName() {
        return this.channelName.value;
    }

    public SearchableStringFilterInput channelOpenUntil() {
        return this.channelOpenUntil.value;
    }

    public SearchableStringFilterInput channelStatus() {
        return this.channelStatus.value;
    }

    public SearchableStringFilterInput channelSubType() {
        return this.channelSubType.value;
    }

    public SearchableStringFilterInput channelType() {
        return this.channelType.value;
    }

    public SearchableStringFilterInput channelWillBeChargedNext() {
        return this.channelWillBeChargedNext.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdById() {
        return this.createdById.value;
    }

    public SearchableBooleanFilterInput externalParticipantsAllowed() {
        return this.externalParticipantsAllowed.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput isLastMessageByLead() {
        return this.isLastMessageByLead.value;
    }

    public SearchableStringFilterInput lastMessageByLeadTime() {
        return this.lastMessageByLeadTime.value;
    }

    public SearchableStringFilterInput lastMessageByUserTime() {
        return this.lastMessageByUserTime.value;
    }

    public SearchableIDFilterInput lastOutboundMessageId() {
        return this.lastOutboundMessageId.value;
    }

    public SearchableStringFilterInput lastOutboundMessageStatus() {
        return this.lastOutboundMessageStatus.value;
    }

    public SearchableBooleanFilterInput lastOutboundMessageWasBroadcast() {
        return this.lastOutboundMessageWasBroadcast.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatChannelFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatChannelFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableChatChannelFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableChatChannelFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", SearchableChatChannelFilterInput.this.phoneNumberIdExternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.channelName.defined) {
                    inputFieldWriter.writeObject("channelName", SearchableChatChannelFilterInput.this.channelName.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.channelName.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.messagePlatform.defined) {
                    inputFieldWriter.writeObject("messagePlatform", SearchableChatChannelFilterInput.this.messagePlatform.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.messagePlatform.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableChatChannelFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.recipientType.defined) {
                    inputFieldWriter.writeObject("recipientType", SearchableChatChannelFilterInput.this.recipientType.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.recipientType.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.channelType.defined) {
                    inputFieldWriter.writeObject("channelType", SearchableChatChannelFilterInput.this.channelType.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.channelType.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.channelSubType.defined) {
                    inputFieldWriter.writeObject("channelSubType", SearchableChatChannelFilterInput.this.channelSubType.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.channelSubType.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.externalParticipantsAllowed.defined) {
                    inputFieldWriter.writeObject("externalParticipantsAllowed", SearchableChatChannelFilterInput.this.externalParticipantsAllowed.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatChannelFilterInput.this.externalParticipantsAllowed.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeObject("participantScopeIfInternal", SearchableChatChannelFilterInput.this.participantScopeIfInternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.participantScopeIfInternal.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeObject("userIdsForDirectChannel", SearchableChatChannelFilterInput.this.userIdsForDirectChannel.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.userIdsForDirectChannel.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.channelStatus.defined) {
                    inputFieldWriter.writeObject("channelStatus", SearchableChatChannelFilterInput.this.channelStatus.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.channelStatus.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeObject("channelWillBeChargedNext", SearchableChatChannelFilterInput.this.channelWillBeChargedNext.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.channelWillBeChargedNext.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeObject("channelOpenUntil", SearchableChatChannelFilterInput.this.channelOpenUntil.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.channelOpenUntil.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableChatChannelFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.visitorId.defined) {
                    inputFieldWriter.writeObject("visitorId", SearchableChatChannelFilterInput.this.visitorId.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.visitorId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.recipientExternalId.defined) {
                    inputFieldWriter.writeObject("recipientExternalId", SearchableChatChannelFilterInput.this.recipientExternalId.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.recipientExternalId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.recipientExternalIdType.defined) {
                    inputFieldWriter.writeObject("recipientExternalIdType", SearchableChatChannelFilterInput.this.recipientExternalIdType.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.recipientExternalIdType.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableChatChannelFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableChatChannelFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", SearchableChatChannelFilterInput.this.toBeAssigned.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchableChatChannelFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableChatChannelFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableChatChannelFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.readNotifiedAt.defined) {
                    inputFieldWriter.writeObject("readNotifiedAt", SearchableChatChannelFilterInput.this.readNotifiedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.readNotifiedAt.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByLeadTime", SearchableChatChannelFilterInput.this.lastMessageByLeadTime.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.lastMessageByLeadTime.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByUserTime", SearchableChatChannelFilterInput.this.lastMessageByUserTime.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.lastMessageByUserTime.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeObject("isLastMessageByLead", SearchableChatChannelFilterInput.this.isLastMessageByLead.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatChannelFilterInput.this.isLastMessageByLead.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageId", SearchableChatChannelFilterInput.this.lastOutboundMessageId.value != 0 ? ((SearchableIDFilterInput) SearchableChatChannelFilterInput.this.lastOutboundMessageId.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageStatus", SearchableChatChannelFilterInput.this.lastOutboundMessageStatus.value != 0 ? ((SearchableStringFilterInput) SearchableChatChannelFilterInput.this.lastOutboundMessageStatus.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.lastOutboundMessageWasBroadcast.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageWasBroadcast", SearchableChatChannelFilterInput.this.lastOutboundMessageWasBroadcast.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatChannelFilterInput.this.lastOutboundMessageWasBroadcast.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.chanelHasOnlyBroadcast.defined) {
                    inputFieldWriter.writeObject("chanelHasOnlyBroadcast", SearchableChatChannelFilterInput.this.chanelHasOnlyBroadcast.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatChannelFilterInput.this.chanelHasOnlyBroadcast.value).marshaller() : null);
                }
                if (SearchableChatChannelFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableChatChannelFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatChannelFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatChannelFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatChannelFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatChannelFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableChatChannelFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatChannelFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatChannelFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatChannelFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatChannelFilterInput.this.not.defined) {
                    inputFieldWriter.writeList("not", SearchableChatChannelFilterInput.this.not.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatChannelFilterInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatChannelFilterInput.this.not.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatChannelFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public SearchableStringFilterInput messagePlatform() {
        return this.messagePlatform.value;
    }

    public List<SearchableChatChannelFilterInput> not() {
        return this.not.value;
    }

    public List<SearchableChatChannelFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableStringFilterInput participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public SearchableStringFilterInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableStringFilterInput readNotifiedAt() {
        return this.readNotifiedAt.value;
    }

    public SearchableStringFilterInput recipientExternalId() {
        return this.recipientExternalId.value;
    }

    public SearchableStringFilterInput recipientExternalIdType() {
        return this.recipientExternalIdType.value;
    }

    public SearchableStringFilterInput recipientType() {
        return this.recipientType.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableStringFilterInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput userIdsForDirectChannel() {
        return this.userIdsForDirectChannel.value;
    }

    public SearchableIDFilterInput visitorId() {
        return this.visitorId.value;
    }
}
