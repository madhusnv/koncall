package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableMissedOpportunitiesFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableMissedOpportunitiesFilterInput>> and;
    private final Input<SearchableStringFilterInput> callLaterDateTime;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> messageBody;
    private final Input<SearchableMissedOpportunitiesFilterInput> not;
    private final Input<List<SearchableMissedOpportunitiesFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableIDFilterInput> relatedEngagementId;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableStringFilterInput> messageBody = Input.absent();
        private Input<SearchableStringFilterInput> callLaterDateTime = Input.absent();
        private Input<SearchableIDFilterInput> relatedEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableMissedOpportunitiesFilterInput>> and = Input.absent();
        private Input<List<SearchableMissedOpportunitiesFilterInput>> or = Input.absent();
        private Input<SearchableMissedOpportunitiesFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableMissedOpportunitiesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableMissedOpportunitiesFilterInput build() {
            return new SearchableMissedOpportunitiesFilterInput(this.accountId, this.ownerId, this.primaryTeamId, this.contactId, this.messageBody, this.callLaterDateTime, this.relatedEngagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callLaterDateTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.callLaterDateTime = Input.fromNullable(searchableStringFilterInput);
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

        public Builder messageBody(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageBody = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableMissedOpportunitiesFilterInput searchableMissedOpportunitiesFilterInput) {
            this.not = Input.fromNullable(searchableMissedOpportunitiesFilterInput);
            return this;
        }

        public Builder or(List<SearchableMissedOpportunitiesFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder primaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.primaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder relatedEngagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.relatedEngagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableMissedOpportunitiesFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<List<SearchableMissedOpportunitiesFilterInput>> input10, Input<List<SearchableMissedOpportunitiesFilterInput>> input11, Input<SearchableMissedOpportunitiesFilterInput> input12) {
        this.accountId = input;
        this.ownerId = input2;
        this.primaryTeamId = input3;
        this.contactId = input4;
        this.messageBody = input5;
        this.callLaterDateTime = input6;
        this.relatedEngagementId = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableMissedOpportunitiesFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput callLaterDateTime() {
        return this.callLaterDateTime.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableMissedOpportunitiesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableMissedOpportunitiesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableMissedOpportunitiesFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableMissedOpportunitiesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableMissedOpportunitiesFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableMissedOpportunitiesFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableMissedOpportunitiesFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableMissedOpportunitiesFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableMissedOpportunitiesFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableMissedOpportunitiesFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.messageBody.defined) {
                    inputFieldWriter.writeObject("messageBody", SearchableMissedOpportunitiesFilterInput.this.messageBody.value != 0 ? ((SearchableStringFilterInput) SearchableMissedOpportunitiesFilterInput.this.messageBody.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.callLaterDateTime.defined) {
                    inputFieldWriter.writeObject("callLaterDateTime", SearchableMissedOpportunitiesFilterInput.this.callLaterDateTime.value != 0 ? ((SearchableStringFilterInput) SearchableMissedOpportunitiesFilterInput.this.callLaterDateTime.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.relatedEngagementId.defined) {
                    inputFieldWriter.writeObject("relatedEngagementId", SearchableMissedOpportunitiesFilterInput.this.relatedEngagementId.value != 0 ? ((SearchableIDFilterInput) SearchableMissedOpportunitiesFilterInput.this.relatedEngagementId.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableMissedOpportunitiesFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableMissedOpportunitiesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableMissedOpportunitiesFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableMissedOpportunitiesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableMissedOpportunitiesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableMissedOpportunitiesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableMissedOpportunitiesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableMissedOpportunitiesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableMissedOpportunitiesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableMissedOpportunitiesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableMissedOpportunitiesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableMissedOpportunitiesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableMissedOpportunitiesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableMissedOpportunitiesFilterInput.this.not.value != 0 ? ((SearchableMissedOpportunitiesFilterInput) SearchableMissedOpportunitiesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput messageBody() {
        return this.messageBody.value;
    }

    public SearchableMissedOpportunitiesFilterInput not() {
        return this.not.value;
    }

    public List<SearchableMissedOpportunitiesFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableIDFilterInput relatedEngagementId() {
        return this.relatedEngagementId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
