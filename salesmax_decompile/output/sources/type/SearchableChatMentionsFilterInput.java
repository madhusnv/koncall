package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableChatMentionsFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableChatMentionsFilterInput>> and;
    private final Input<SearchableIDFilterInput> channelId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIntFilterInput> expirationUnixTime;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableIDFilterInput> mentionedById;
    private final Input<SearchableIDFilterInput> mentionedMessageId;
    private final Input<SearchableIDFilterInput> mentionedUserId;
    private final Input<SearchableChatMentionsFilterInput> not;
    private final Input<List<SearchableChatMentionsFilterInput>> or;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> mentionedUserId = Input.absent();
        private Input<SearchableIDFilterInput> mentionedMessageId = Input.absent();
        private Input<SearchableIDFilterInput> channelId = Input.absent();
        private Input<SearchableIDFilterInput> mentionedById = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableIntFilterInput> expirationUnixTime = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableChatMentionsFilterInput>> and = Input.absent();
        private Input<List<SearchableChatMentionsFilterInput>> or = Input.absent();
        private Input<SearchableChatMentionsFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableChatMentionsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableChatMentionsFilterInput build() {
            return new SearchableChatMentionsFilterInput(this.id, this.accountId, this.mentionedUserId, this.mentionedMessageId, this.channelId, this.mentionedById, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(SearchableIDFilterInput searchableIDFilterInput) {
            this.channelId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder expirationUnixTime(SearchableIntFilterInput searchableIntFilterInput) {
            this.expirationUnixTime = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder mentionedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.mentionedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder mentionedMessageId(SearchableIDFilterInput searchableIDFilterInput) {
            this.mentionedMessageId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder mentionedUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.mentionedUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableChatMentionsFilterInput searchableChatMentionsFilterInput) {
            this.not = Input.fromNullable(searchableChatMentionsFilterInput);
            return this;
        }

        public Builder or(List<SearchableChatMentionsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableChatMentionsFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableIntFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<List<SearchableChatMentionsFilterInput>> input11, Input<List<SearchableChatMentionsFilterInput>> input12, Input<SearchableChatMentionsFilterInput> input13) {
        this.id = input;
        this.accountId = input2;
        this.mentionedUserId = input3;
        this.mentionedMessageId = input4;
        this.channelId = input5;
        this.mentionedById = input6;
        this.status = input7;
        this.expirationUnixTime = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.and = input11;
        this.or = input12;
        this.not = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableChatMentionsFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput channelId() {
        return this.channelId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIntFilterInput expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatMentionsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatMentionsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableChatMentionsFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableChatMentionsFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableChatMentionsFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMentionsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.mentionedUserId.defined) {
                    inputFieldWriter.writeObject("mentionedUserId", SearchableChatMentionsFilterInput.this.mentionedUserId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMentionsFilterInput.this.mentionedUserId.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.mentionedMessageId.defined) {
                    inputFieldWriter.writeObject("mentionedMessageId", SearchableChatMentionsFilterInput.this.mentionedMessageId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMentionsFilterInput.this.mentionedMessageId.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", SearchableChatMentionsFilterInput.this.channelId.value != 0 ? ((SearchableIDFilterInput) SearchableChatMentionsFilterInput.this.channelId.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.mentionedById.defined) {
                    inputFieldWriter.writeObject("mentionedById", SearchableChatMentionsFilterInput.this.mentionedById.value != 0 ? ((SearchableIDFilterInput) SearchableChatMentionsFilterInput.this.mentionedById.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableChatMentionsFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableChatMentionsFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", SearchableChatMentionsFilterInput.this.expirationUnixTime.value != 0 ? ((SearchableIntFilterInput) SearchableChatMentionsFilterInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableChatMentionsFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMentionsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableChatMentionsFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatMentionsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableChatMentionsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableChatMentionsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatMentionsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatMentionsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatMentionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatMentionsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableChatMentionsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatMentionsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatMentionsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatMentionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatMentionsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableChatMentionsFilterInput.this.not.value != 0 ? ((SearchableChatMentionsFilterInput) SearchableChatMentionsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableIDFilterInput mentionedById() {
        return this.mentionedById.value;
    }

    public SearchableIDFilterInput mentionedMessageId() {
        return this.mentionedMessageId.value;
    }

    public SearchableIDFilterInput mentionedUserId() {
        return this.mentionedUserId.value;
    }

    public SearchableChatMentionsFilterInput not() {
        return this.not.value;
    }

    public List<SearchableChatMentionsFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
