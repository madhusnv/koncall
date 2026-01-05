package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableChatParticipantFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableChatParticipantFilterInput>> and;
    private final Input<SearchableIDFilterInput> channelId;
    private final Input<SearchableStringFilterInput> channelName;
    private final Input<SearchableStringFilterInput> channelOpenUntil;
    private final Input<SearchableStringFilterInput> channelStatus;
    private final Input<SearchableStringFilterInput> channelSubType;
    private final Input<SearchableStringFilterInput> channelType;
    private final Input<SearchableStringFilterInput> channelWillBeChargedNext;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> isLastMessageByLead;
    private final Input<SearchableBooleanFilterInput> isNewMessageUpdate;
    private final Input<SearchableBooleanFilterInput> isStarred;
    private final Input<SearchableStringFilterInput> joinedAt;
    private final Input<SearchableStringFilterInput> lastMessageByLeadTime;
    private final Input<SearchableStringFilterInput> lastMessageByUserTime;
    private final Input<SearchableIDFilterInput> lastOutboundMessageId;
    private final Input<SearchableStringFilterInput> lastOutboundMessageStatus;
    private final Input<SearchableStringFilterInput> lastViewed;
    private final Input<SearchableStringFilterInput> leftAt;
    private final Input<SearchableChatParticipantFilterInput> not;
    private final Input<List<SearchableChatParticipantFilterInput>> or;
    private final Input<SearchableIDFilterInput> participantId;
    private final Input<SearchableStringFilterInput> participantScopeIfInternal;
    private final Input<SearchableStringFilterInput> participationStatus;
    private final Input<SearchableStringFilterInput> phoneNumberIdExternal;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableIntFilterInput> unreadMessageCount;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> userIdsForDirectChannel;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> channelId = Input.absent();
        private Input<SearchableStringFilterInput> phoneNumberIdExternal = Input.absent();
        private Input<SearchableIDFilterInput> participantId = Input.absent();
        private Input<SearchableStringFilterInput> participationStatus = Input.absent();
        private Input<SearchableIntFilterInput> unreadMessageCount = Input.absent();
        private Input<SearchableStringFilterInput> lastViewed = Input.absent();
        private Input<SearchableBooleanFilterInput> isStarred = Input.absent();
        private Input<SearchableStringFilterInput> joinedAt = Input.absent();
        private Input<SearchableStringFilterInput> leftAt = Input.absent();
        private Input<SearchableStringFilterInput> channelName = Input.absent();
        private Input<SearchableStringFilterInput> channelType = Input.absent();
        private Input<SearchableStringFilterInput> channelSubType = Input.absent();
        private Input<SearchableStringFilterInput> channelStatus = Input.absent();
        private Input<SearchableStringFilterInput> channelWillBeChargedNext = Input.absent();
        private Input<SearchableStringFilterInput> channelOpenUntil = Input.absent();
        private Input<SearchableStringFilterInput> lastMessageByLeadTime = Input.absent();
        private Input<SearchableStringFilterInput> lastMessageByUserTime = Input.absent();
        private Input<SearchableBooleanFilterInput> isLastMessageByLead = Input.absent();
        private Input<SearchableIDFilterInput> lastOutboundMessageId = Input.absent();
        private Input<SearchableStringFilterInput> lastOutboundMessageStatus = Input.absent();
        private Input<SearchableBooleanFilterInput> isNewMessageUpdate = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableStringFilterInput> participantScopeIfInternal = Input.absent();
        private Input<SearchableStringFilterInput> userIdsForDirectChannel = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableChatParticipantFilterInput>> and = Input.absent();
        private Input<List<SearchableChatParticipantFilterInput>> or = Input.absent();
        private Input<SearchableChatParticipantFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableChatParticipantFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableChatParticipantFilterInput build() {
            return new SearchableChatParticipantFilterInput(this.id, this.accountId, this.channelId, this.phoneNumberIdExternal, this.participantId, this.participationStatus, this.unreadMessageCount, this.lastViewed, this.isStarred, this.joinedAt, this.leftAt, this.channelName, this.channelType, this.channelSubType, this.channelStatus, this.channelWillBeChargedNext, this.channelOpenUntil, this.lastMessageByLeadTime, this.lastMessageByUserTime, this.isLastMessageByLead, this.lastOutboundMessageId, this.lastOutboundMessageStatus, this.isNewMessageUpdate, this.tags, this.participantScopeIfInternal, this.userIdsForDirectChannel, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(SearchableIDFilterInput searchableIDFilterInput) {
            this.channelId = Input.fromNullable(searchableIDFilterInput);
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

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
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

        public Builder isNewMessageUpdate(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isNewMessageUpdate = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isStarred(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isStarred = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder joinedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.joinedAt = Input.fromNullable(searchableStringFilterInput);
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

        public Builder lastViewed(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastViewed = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder leftAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.leftAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableChatParticipantFilterInput searchableChatParticipantFilterInput) {
            this.not = Input.fromNullable(searchableChatParticipantFilterInput);
            return this;
        }

        public Builder or(List<SearchableChatParticipantFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder participantId(SearchableIDFilterInput searchableIDFilterInput) {
            this.participantId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder participantScopeIfInternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.participantScopeIfInternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder participationStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.participationStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder phoneNumberIdExternal(SearchableStringFilterInput searchableStringFilterInput) {
            this.phoneNumberIdExternal = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder unreadMessageCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.unreadMessageCount = Input.fromNullable(searchableIntFilterInput);
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
    }

    public SearchableChatParticipantFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIntFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableBooleanFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableBooleanFilterInput> input20, Input<SearchableIDFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableBooleanFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<List<SearchableChatParticipantFilterInput>> input29, Input<List<SearchableChatParticipantFilterInput>> input30, Input<SearchableChatParticipantFilterInput> input31) {
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

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableChatParticipantFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput channelId() {
        return this.channelId.value;
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

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput isLastMessageByLead() {
        return this.isLastMessageByLead.value;
    }

    public SearchableBooleanFilterInput isNewMessageUpdate() {
        return this.isNewMessageUpdate.value;
    }

    public SearchableBooleanFilterInput isStarred() {
        return this.isStarred.value;
    }

    public SearchableStringFilterInput joinedAt() {
        return this.joinedAt.value;
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

    public SearchableStringFilterInput lastViewed() {
        return this.lastViewed.value;
    }

    public SearchableStringFilterInput leftAt() {
        return this.leftAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatParticipantFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatParticipantFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableChatParticipantFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableChatParticipantFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableChatParticipantFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableChatParticipantFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", SearchableChatParticipantFilterInput.this.channelId.value != 0 ? ((SearchableIDFilterInput) SearchableChatParticipantFilterInput.this.channelId.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.phoneNumberIdExternal.defined) {
                    inputFieldWriter.writeObject("phoneNumberIdExternal", SearchableChatParticipantFilterInput.this.phoneNumberIdExternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.phoneNumberIdExternal.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.participantId.defined) {
                    inputFieldWriter.writeObject("participantId", SearchableChatParticipantFilterInput.this.participantId.value != 0 ? ((SearchableIDFilterInput) SearchableChatParticipantFilterInput.this.participantId.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.participationStatus.defined) {
                    inputFieldWriter.writeObject("participationStatus", SearchableChatParticipantFilterInput.this.participationStatus.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.participationStatus.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.unreadMessageCount.defined) {
                    inputFieldWriter.writeObject("unreadMessageCount", SearchableChatParticipantFilterInput.this.unreadMessageCount.value != 0 ? ((SearchableIntFilterInput) SearchableChatParticipantFilterInput.this.unreadMessageCount.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.lastViewed.defined) {
                    inputFieldWriter.writeObject("lastViewed", SearchableChatParticipantFilterInput.this.lastViewed.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.lastViewed.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.isStarred.defined) {
                    inputFieldWriter.writeObject("isStarred", SearchableChatParticipantFilterInput.this.isStarred.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatParticipantFilterInput.this.isStarred.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.joinedAt.defined) {
                    inputFieldWriter.writeObject("joinedAt", SearchableChatParticipantFilterInput.this.joinedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.joinedAt.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.leftAt.defined) {
                    inputFieldWriter.writeObject("leftAt", SearchableChatParticipantFilterInput.this.leftAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.leftAt.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelName.defined) {
                    inputFieldWriter.writeObject("channelName", SearchableChatParticipantFilterInput.this.channelName.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.channelName.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelType.defined) {
                    inputFieldWriter.writeObject("channelType", SearchableChatParticipantFilterInput.this.channelType.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.channelType.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelSubType.defined) {
                    inputFieldWriter.writeObject("channelSubType", SearchableChatParticipantFilterInput.this.channelSubType.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.channelSubType.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelStatus.defined) {
                    inputFieldWriter.writeObject("channelStatus", SearchableChatParticipantFilterInput.this.channelStatus.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.channelStatus.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelWillBeChargedNext.defined) {
                    inputFieldWriter.writeObject("channelWillBeChargedNext", SearchableChatParticipantFilterInput.this.channelWillBeChargedNext.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.channelWillBeChargedNext.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.channelOpenUntil.defined) {
                    inputFieldWriter.writeObject("channelOpenUntil", SearchableChatParticipantFilterInput.this.channelOpenUntil.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.channelOpenUntil.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.lastMessageByLeadTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByLeadTime", SearchableChatParticipantFilterInput.this.lastMessageByLeadTime.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.lastMessageByLeadTime.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.lastMessageByUserTime.defined) {
                    inputFieldWriter.writeObject("lastMessageByUserTime", SearchableChatParticipantFilterInput.this.lastMessageByUserTime.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.lastMessageByUserTime.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.isLastMessageByLead.defined) {
                    inputFieldWriter.writeObject("isLastMessageByLead", SearchableChatParticipantFilterInput.this.isLastMessageByLead.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatParticipantFilterInput.this.isLastMessageByLead.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.lastOutboundMessageId.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageId", SearchableChatParticipantFilterInput.this.lastOutboundMessageId.value != 0 ? ((SearchableIDFilterInput) SearchableChatParticipantFilterInput.this.lastOutboundMessageId.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.lastOutboundMessageStatus.defined) {
                    inputFieldWriter.writeObject("lastOutboundMessageStatus", SearchableChatParticipantFilterInput.this.lastOutboundMessageStatus.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.lastOutboundMessageStatus.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.isNewMessageUpdate.defined) {
                    inputFieldWriter.writeObject("isNewMessageUpdate", SearchableChatParticipantFilterInput.this.isNewMessageUpdate.value != 0 ? ((SearchableBooleanFilterInput) SearchableChatParticipantFilterInput.this.isNewMessageUpdate.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableChatParticipantFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.participantScopeIfInternal.defined) {
                    inputFieldWriter.writeObject("participantScopeIfInternal", SearchableChatParticipantFilterInput.this.participantScopeIfInternal.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.participantScopeIfInternal.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.userIdsForDirectChannel.defined) {
                    inputFieldWriter.writeObject("userIdsForDirectChannel", SearchableChatParticipantFilterInput.this.userIdsForDirectChannel.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.userIdsForDirectChannel.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableChatParticipantFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableChatParticipantFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatParticipantFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableChatParticipantFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableChatParticipantFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatParticipantFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatParticipantFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatParticipantFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatParticipantFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableChatParticipantFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatParticipantFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatParticipantFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatParticipantFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatParticipantFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableChatParticipantFilterInput.this.not.value != 0 ? ((SearchableChatParticipantFilterInput) SearchableChatParticipantFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableChatParticipantFilterInput not() {
        return this.not.value;
    }

    public List<SearchableChatParticipantFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput participantId() {
        return this.participantId.value;
    }

    public SearchableStringFilterInput participantScopeIfInternal() {
        return this.participantScopeIfInternal.value;
    }

    public SearchableStringFilterInput participationStatus() {
        return this.participationStatus.value;
    }

    public SearchableStringFilterInput phoneNumberIdExternal() {
        return this.phoneNumberIdExternal.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableIntFilterInput unreadMessageCount() {
        return this.unreadMessageCount.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput userIdsForDirectChannel() {
        return this.userIdsForDirectChannel.value;
    }
}
