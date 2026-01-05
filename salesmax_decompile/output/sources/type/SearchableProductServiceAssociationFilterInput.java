package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableProductServiceAssociationFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableProductServiceAssociationFilterInput>> and;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableProductServiceAssociationFilterInput> not;
    private final Input<List<SearchableProductServiceAssociationFilterInput>> or;
    private final Input<SearchableIDFilterInput> productId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> productId = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<List<SearchableProductServiceAssociationFilterInput>> and = Input.absent();
        private Input<List<SearchableProductServiceAssociationFilterInput>> or = Input.absent();
        private Input<SearchableProductServiceAssociationFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableProductServiceAssociationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableProductServiceAssociationFilterInput build() {
            return new SearchableProductServiceAssociationFilterInput(this.id, this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableProductServiceAssociationFilterInput searchableProductServiceAssociationFilterInput) {
            this.not = Input.fromNullable(searchableProductServiceAssociationFilterInput);
            return this;
        }

        public Builder or(List<SearchableProductServiceAssociationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder productId(SearchableIDFilterInput searchableIDFilterInput) {
            this.productId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableProductServiceAssociationFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<List<SearchableProductServiceAssociationFilterInput>> input9, Input<List<SearchableProductServiceAssociationFilterInput>> input10, Input<SearchableProductServiceAssociationFilterInput> input11) {
        this.id = input;
        this.productId = input2;
        this.accountId = input3;
        this.contactId = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
        this.createdById = input7;
        this.updatedById = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableProductServiceAssociationFilterInput> and() {
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

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductServiceAssociationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductServiceAssociationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableProductServiceAssociationFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceAssociationFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", SearchableProductServiceAssociationFilterInput.this.productId.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceAssociationFilterInput.this.productId.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableProductServiceAssociationFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceAssociationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableProductServiceAssociationFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceAssociationFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableProductServiceAssociationFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceAssociationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableProductServiceAssociationFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceAssociationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchableProductServiceAssociationFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceAssociationFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchableProductServiceAssociationFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceAssociationFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableProductServiceAssociationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductServiceAssociationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductServiceAssociationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductServiceAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableProductServiceAssociationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductServiceAssociationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductServiceAssociationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductServiceAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductServiceAssociationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableProductServiceAssociationFilterInput.this.not.value != 0 ? ((SearchableProductServiceAssociationFilterInput) SearchableProductServiceAssociationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableProductServiceAssociationFilterInput not() {
        return this.not.value;
    }

    public List<SearchableProductServiceAssociationFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput productId() {
        return this.productId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }
}
