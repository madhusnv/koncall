package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableStagedLeadDataFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableStagedLeadDataFilterInput>> and;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableIDFilterInput> entityListId;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> leadCreatedAt;
    private final Input<SearchableStringFilterInput> logId;
    private final Input<SearchableStringFilterInput> mailFrom;
    private final Input<SearchableStringFilterInput> mailSubject;
    private final Input<SearchableStringFilterInput> mailTo;
    private final Input<SearchableStringFilterInput> messageDate;
    private final Input<SearchableStringFilterInput> messageId;
    private final Input<SearchableStringFilterInput> messageType;
    private final Input<SearchableStringFilterInput> network;
    private final Input<SearchableStagedLeadDataFilterInput> not;
    private final Input<List<SearchableStagedLeadDataFilterInput>> or;
    private final Input<SearchableStringFilterInput> snippet;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> viewedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> network = Input.absent();
        private Input<SearchableStringFilterInput> messageType = Input.absent();
        private Input<SearchableStringFilterInput> logId = Input.absent();
        private Input<SearchableStringFilterInput> messageId = Input.absent();
        private Input<SearchableStringFilterInput> mailFrom = Input.absent();
        private Input<SearchableStringFilterInput> mailTo = Input.absent();
        private Input<SearchableStringFilterInput> mailSubject = Input.absent();
        private Input<SearchableStringFilterInput> snippet = Input.absent();
        private Input<SearchableStringFilterInput> messageDate = Input.absent();
        private Input<SearchableStringFilterInput> viewedAt = Input.absent();
        private Input<SearchableStringFilterInput> leadCreatedAt = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableIDFilterInput> entityListId = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableStagedLeadDataFilterInput>> and = Input.absent();
        private Input<List<SearchableStagedLeadDataFilterInput>> or = Input.absent();
        private Input<SearchableStagedLeadDataFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableStagedLeadDataFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableStagedLeadDataFilterInput build() {
            return new SearchableStagedLeadDataFilterInput(this.id, this.accountId, this.network, this.messageType, this.logId, this.messageId, this.mailFrom, this.mailTo, this.mailSubject, this.snippet, this.messageDate, this.viewedAt, this.leadCreatedAt, this.contactId, this.tags, this.entityListId, this.createdById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder entityListId(SearchableIDFilterInput searchableIDFilterInput) {
            this.entityListId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder leadCreatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.leadCreatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder logId(SearchableStringFilterInput searchableStringFilterInput) {
            this.logId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder mailFrom(SearchableStringFilterInput searchableStringFilterInput) {
            this.mailFrom = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder mailSubject(SearchableStringFilterInput searchableStringFilterInput) {
            this.mailSubject = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder mailTo(SearchableStringFilterInput searchableStringFilterInput) {
            this.mailTo = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageId(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageType(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder network(SearchableStringFilterInput searchableStringFilterInput) {
            this.network = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableStagedLeadDataFilterInput searchableStagedLeadDataFilterInput) {
            this.not = Input.fromNullable(searchableStagedLeadDataFilterInput);
            return this;
        }

        public Builder or(List<SearchableStagedLeadDataFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder snippet(SearchableStringFilterInput searchableStringFilterInput) {
            this.snippet = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder viewedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.viewedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableStagedLeadDataFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableIDFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableIDFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<List<SearchableStagedLeadDataFilterInput>> input20, Input<List<SearchableStagedLeadDataFilterInput>> input21, Input<SearchableStagedLeadDataFilterInput> input22) {
        this.id = input;
        this.accountId = input2;
        this.network = input3;
        this.messageType = input4;
        this.logId = input5;
        this.messageId = input6;
        this.mailFrom = input7;
        this.mailTo = input8;
        this.mailSubject = input9;
        this.snippet = input10;
        this.messageDate = input11;
        this.viewedAt = input12;
        this.leadCreatedAt = input13;
        this.contactId = input14;
        this.tags = input15;
        this.entityListId = input16;
        this.createdById = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableStagedLeadDataFilterInput> and() {
        return this.and.value;
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

    public SearchableIDFilterInput entityListId() {
        return this.entityListId.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput leadCreatedAt() {
        return this.leadCreatedAt.value;
    }

    public SearchableStringFilterInput logId() {
        return this.logId.value;
    }

    public SearchableStringFilterInput mailFrom() {
        return this.mailFrom.value;
    }

    public SearchableStringFilterInput mailSubject() {
        return this.mailSubject.value;
    }

    public SearchableStringFilterInput mailTo() {
        return this.mailTo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableStagedLeadDataFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableStagedLeadDataFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableStagedLeadDataFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableStagedLeadDataFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableStagedLeadDataFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableStagedLeadDataFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.network.defined) {
                    inputFieldWriter.writeObject("network", SearchableStagedLeadDataFilterInput.this.network.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.network.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", SearchableStagedLeadDataFilterInput.this.messageType.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.messageType.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.logId.defined) {
                    inputFieldWriter.writeObject("logId", SearchableStagedLeadDataFilterInput.this.logId.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.logId.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.messageId.defined) {
                    inputFieldWriter.writeObject("messageId", SearchableStagedLeadDataFilterInput.this.messageId.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.messageId.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.mailFrom.defined) {
                    inputFieldWriter.writeObject("mailFrom", SearchableStagedLeadDataFilterInput.this.mailFrom.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.mailFrom.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.mailTo.defined) {
                    inputFieldWriter.writeObject("mailTo", SearchableStagedLeadDataFilterInput.this.mailTo.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.mailTo.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.mailSubject.defined) {
                    inputFieldWriter.writeObject("mailSubject", SearchableStagedLeadDataFilterInput.this.mailSubject.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.mailSubject.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.snippet.defined) {
                    inputFieldWriter.writeObject("snippet", SearchableStagedLeadDataFilterInput.this.snippet.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.snippet.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.messageDate.defined) {
                    inputFieldWriter.writeObject("messageDate", SearchableStagedLeadDataFilterInput.this.messageDate.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.messageDate.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.viewedAt.defined) {
                    inputFieldWriter.writeObject("viewedAt", SearchableStagedLeadDataFilterInput.this.viewedAt.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.viewedAt.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.leadCreatedAt.defined) {
                    inputFieldWriter.writeObject("leadCreatedAt", SearchableStagedLeadDataFilterInput.this.leadCreatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.leadCreatedAt.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableStagedLeadDataFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableStagedLeadDataFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableStagedLeadDataFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", SearchableStagedLeadDataFilterInput.this.entityListId.value != 0 ? ((SearchableIDFilterInput) SearchableStagedLeadDataFilterInput.this.entityListId.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchableStagedLeadDataFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchableStagedLeadDataFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableStagedLeadDataFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableStagedLeadDataFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableStagedLeadDataFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableStagedLeadDataFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableStagedLeadDataFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableStagedLeadDataFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableStagedLeadDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableStagedLeadDataFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableStagedLeadDataFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableStagedLeadDataFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableStagedLeadDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableStagedLeadDataFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableStagedLeadDataFilterInput.this.not.value != 0 ? ((SearchableStagedLeadDataFilterInput) SearchableStagedLeadDataFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput messageDate() {
        return this.messageDate.value;
    }

    public SearchableStringFilterInput messageId() {
        return this.messageId.value;
    }

    public SearchableStringFilterInput messageType() {
        return this.messageType.value;
    }

    public SearchableStringFilterInput network() {
        return this.network.value;
    }

    public SearchableStagedLeadDataFilterInput not() {
        return this.not.value;
    }

    public List<SearchableStagedLeadDataFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput snippet() {
        return this.snippet.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput viewedAt() {
        return this.viewedAt.value;
    }
}
