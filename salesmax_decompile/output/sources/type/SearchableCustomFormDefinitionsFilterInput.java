package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCustomFormDefinitionsFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCustomFormDefinitionsFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableStringFilterInput> displayName;
    private final Input<SearchableStringFilterInput> formName;
    private final Input<SearchableStringFilterInput> formTitle;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableCustomFormDefinitionsFilterInput> not;
    private final Input<List<SearchableCustomFormDefinitionsFilterInput>> or;
    private final Input<SearchableIDFilterInput> updaedById;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> formName = Input.absent();
        private Input<SearchableStringFilterInput> displayName = Input.absent();
        private Input<SearchableStringFilterInput> formTitle = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableIDFilterInput> updaedById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableCustomFormDefinitionsFilterInput>> and = Input.absent();
        private Input<List<SearchableCustomFormDefinitionsFilterInput>> or = Input.absent();
        private Input<SearchableCustomFormDefinitionsFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCustomFormDefinitionsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableCustomFormDefinitionsFilterInput build() {
            return new SearchableCustomFormDefinitionsFilterInput(this.id, this.accountId, this.formName, this.displayName, this.formTitle, this.createdById, this.updaedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdById(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder displayName(SearchableStringFilterInput searchableStringFilterInput) {
            this.displayName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder formName(SearchableStringFilterInput searchableStringFilterInput) {
            this.formName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder formTitle(SearchableStringFilterInput searchableStringFilterInput) {
            this.formTitle = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableCustomFormDefinitionsFilterInput searchableCustomFormDefinitionsFilterInput) {
            this.not = Input.fromNullable(searchableCustomFormDefinitionsFilterInput);
            return this;
        }

        public Builder or(List<SearchableCustomFormDefinitionsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updaedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.updaedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableCustomFormDefinitionsFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<List<SearchableCustomFormDefinitionsFilterInput>> input10, Input<List<SearchableCustomFormDefinitionsFilterInput>> input11, Input<SearchableCustomFormDefinitionsFilterInput> input12) {
        this.id = input;
        this.accountId = input2;
        this.formName = input3;
        this.displayName = input4;
        this.formTitle = input5;
        this.createdById = input6;
        this.updaedById = input7;
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

    public List<SearchableCustomFormDefinitionsFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdById() {
        return this.createdById.value;
    }

    public SearchableStringFilterInput displayName() {
        return this.displayName.value;
    }

    public SearchableStringFilterInput formName() {
        return this.formName.value;
    }

    public SearchableStringFilterInput formTitle() {
        return this.formTitle.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomFormDefinitionsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomFormDefinitionsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableCustomFormDefinitionsFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableCustomFormDefinitionsFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCustomFormDefinitionsFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomFormDefinitionsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.formName.defined) {
                    inputFieldWriter.writeObject("formName", SearchableCustomFormDefinitionsFilterInput.this.formName.value != 0 ? ((SearchableStringFilterInput) SearchableCustomFormDefinitionsFilterInput.this.formName.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.displayName.defined) {
                    inputFieldWriter.writeObject("displayName", SearchableCustomFormDefinitionsFilterInput.this.displayName.value != 0 ? ((SearchableStringFilterInput) SearchableCustomFormDefinitionsFilterInput.this.displayName.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.formTitle.defined) {
                    inputFieldWriter.writeObject("formTitle", SearchableCustomFormDefinitionsFilterInput.this.formTitle.value != 0 ? ((SearchableStringFilterInput) SearchableCustomFormDefinitionsFilterInput.this.formTitle.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchableCustomFormDefinitionsFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchableCustomFormDefinitionsFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.updaedById.defined) {
                    inputFieldWriter.writeObject("updaedById", SearchableCustomFormDefinitionsFilterInput.this.updaedById.value != 0 ? ((SearchableIDFilterInput) SearchableCustomFormDefinitionsFilterInput.this.updaedById.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCustomFormDefinitionsFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomFormDefinitionsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCustomFormDefinitionsFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomFormDefinitionsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCustomFormDefinitionsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomFormDefinitionsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomFormDefinitionsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomFormDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCustomFormDefinitionsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomFormDefinitionsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomFormDefinitionsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomFormDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomFormDefinitionsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableCustomFormDefinitionsFilterInput.this.not.value != 0 ? ((SearchableCustomFormDefinitionsFilterInput) SearchableCustomFormDefinitionsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableCustomFormDefinitionsFilterInput not() {
        return this.not.value;
    }

    public List<SearchableCustomFormDefinitionsFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput updaedById() {
        return this.updaedById.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
