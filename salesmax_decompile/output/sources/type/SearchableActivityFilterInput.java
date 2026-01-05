package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableActivityFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableStringFilterInput> activityCategory;
    private final Input<SearchableIDFilterInput> activityDoneByUserId;
    private final Input<SearchableIDFilterInput> activityRelatedObjectId;
    private final Input<SearchableStringFilterInput> activityRelatedObjectType;
    private final Input<SearchableStringFilterInput> activityType;
    private final Input<List<SearchableActivityFilterInput>> and;
    private final Input<SearchableStringFilterInput> body;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableActivityFilterInput> not;
    private final Input<SearchableStringFilterInput> note;
    private final Input<List<SearchableActivityFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableIDFilterInput> threadId;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> threadId = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> activityRelatedObjectType = Input.absent();
        private Input<SearchableIDFilterInput> activityRelatedObjectId = Input.absent();
        private Input<SearchableStringFilterInput> activityCategory = Input.absent();
        private Input<SearchableStringFilterInput> activityType = Input.absent();
        private Input<SearchableStringFilterInput> body = Input.absent();
        private Input<SearchableStringFilterInput> note = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> activityDoneByUserId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableActivityFilterInput>> and = Input.absent();
        private Input<List<SearchableActivityFilterInput>> or = Input.absent();
        private Input<SearchableActivityFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder activityCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.activityCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder activityDoneByUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.activityDoneByUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder activityRelatedObjectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.activityRelatedObjectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder activityRelatedObjectType(SearchableStringFilterInput searchableStringFilterInput) {
            this.activityRelatedObjectType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder activityType(SearchableStringFilterInput searchableStringFilterInput) {
            this.activityType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableActivityFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(SearchableStringFilterInput searchableStringFilterInput) {
            this.body = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableActivityFilterInput build() {
            return new SearchableActivityFilterInput(this.id, this.threadId, this.accountId, this.activityRelatedObjectType, this.activityRelatedObjectId, this.activityCategory, this.activityType, this.body, this.note, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
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

        public Builder not(SearchableActivityFilterInput searchableActivityFilterInput) {
            this.not = Input.fromNullable(searchableActivityFilterInput);
            return this;
        }

        public Builder note(SearchableStringFilterInput searchableStringFilterInput) {
            this.note = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchableActivityFilterInput> list) {
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

        public Builder threadId(SearchableIDFilterInput searchableIDFilterInput) {
            this.threadId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableActivityFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableIDFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<List<SearchableActivityFilterInput>> input16, Input<List<SearchableActivityFilterInput>> input17, Input<SearchableActivityFilterInput> input18) {
        this.id = input;
        this.threadId = input2;
        this.accountId = input3;
        this.activityRelatedObjectType = input4;
        this.activityRelatedObjectId = input5;
        this.activityCategory = input6;
        this.activityType = input7;
        this.body = input8;
        this.note = input9;
        this.ownerId = input10;
        this.primaryTeamId = input11;
        this.contactId = input12;
        this.activityDoneByUserId = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableStringFilterInput activityCategory() {
        return this.activityCategory.value;
    }

    public SearchableIDFilterInput activityDoneByUserId() {
        return this.activityDoneByUserId.value;
    }

    public SearchableIDFilterInput activityRelatedObjectId() {
        return this.activityRelatedObjectId.value;
    }

    public SearchableStringFilterInput activityRelatedObjectType() {
        return this.activityRelatedObjectType.value;
    }

    public SearchableStringFilterInput activityType() {
        return this.activityType.value;
    }

    public List<SearchableActivityFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput body() {
        return this.body.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableActivityFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableActivityFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableActivityFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.threadId.defined) {
                    inputFieldWriter.writeObject("threadId", SearchableActivityFilterInput.this.threadId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.threadId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableActivityFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.activityRelatedObjectType.defined) {
                    inputFieldWriter.writeObject("activityRelatedObjectType", SearchableActivityFilterInput.this.activityRelatedObjectType.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.activityRelatedObjectType.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.activityRelatedObjectId.defined) {
                    inputFieldWriter.writeObject("activityRelatedObjectId", SearchableActivityFilterInput.this.activityRelatedObjectId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.activityRelatedObjectId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.activityCategory.defined) {
                    inputFieldWriter.writeObject("activityCategory", SearchableActivityFilterInput.this.activityCategory.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.activityCategory.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.activityType.defined) {
                    inputFieldWriter.writeObject("activityType", SearchableActivityFilterInput.this.activityType.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.activityType.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", SearchableActivityFilterInput.this.body.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.body.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", SearchableActivityFilterInput.this.note.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.note.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableActivityFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableActivityFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableActivityFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeObject("activityDoneByUserId", SearchableActivityFilterInput.this.activityDoneByUserId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityFilterInput.this.activityDoneByUserId.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableActivityFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableActivityFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableActivityFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableActivityFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableActivityFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableActivityFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableActivityFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableActivityFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableActivityFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableActivityFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableActivityFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableActivityFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableActivityFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableActivityFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableActivityFilterInput.this.not.value != 0 ? ((SearchableActivityFilterInput) SearchableActivityFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableActivityFilterInput not() {
        return this.not.value;
    }

    public SearchableStringFilterInput note() {
        return this.note.value;
    }

    public List<SearchableActivityFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableIDFilterInput threadId() {
        return this.threadId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
