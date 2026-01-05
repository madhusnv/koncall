package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableSubmittedFormValueFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableSubmittedFormValueFilterInput>> and;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> extensionOfObject;
    private final Input<SearchableStringFilterInput> extensionOfProperty;
    private final Input<SearchableIDFilterInput> formId;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableSubmittedFormValueFilterInput> not;
    private final Input<SearchableIDFilterInput> objectId;
    private final Input<List<SearchableSubmittedFormValueFilterInput>> or;
    private final Input<SearchableIDFilterInput> submittedBy;
    private final Input<SearchableStringFilterInput> submittedByIdType;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> value;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> formId = Input.absent();
        private Input<SearchableStringFilterInput> value = Input.absent();
        private Input<SearchableStringFilterInput> extensionOfProperty = Input.absent();
        private Input<SearchableStringFilterInput> extensionOfObject = Input.absent();
        private Input<SearchableIDFilterInput> objectId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> submittedBy = Input.absent();
        private Input<SearchableStringFilterInput> submittedByIdType = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableSubmittedFormValueFilterInput>> and = Input.absent();
        private Input<List<SearchableSubmittedFormValueFilterInput>> or = Input.absent();
        private Input<SearchableSubmittedFormValueFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableSubmittedFormValueFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableSubmittedFormValueFilterInput build() {
            return new SearchableSubmittedFormValueFilterInput(this.id, this.accountId, this.formId, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder extensionOfObject(SearchableStringFilterInput searchableStringFilterInput) {
            this.extensionOfObject = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder extensionOfProperty(SearchableStringFilterInput searchableStringFilterInput) {
            this.extensionOfProperty = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder formId(SearchableIDFilterInput searchableIDFilterInput) {
            this.formId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableSubmittedFormValueFilterInput searchableSubmittedFormValueFilterInput) {
            this.not = Input.fromNullable(searchableSubmittedFormValueFilterInput);
            return this;
        }

        public Builder objectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.objectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder or(List<SearchableSubmittedFormValueFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder submittedBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.submittedBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder submittedByIdType(SearchableStringFilterInput searchableStringFilterInput) {
            this.submittedByIdType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder value(SearchableStringFilterInput searchableStringFilterInput) {
            this.value = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableSubmittedFormValueFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<List<SearchableSubmittedFormValueFilterInput>> input13, Input<List<SearchableSubmittedFormValueFilterInput>> input14, Input<SearchableSubmittedFormValueFilterInput> input15) {
        this.id = input;
        this.accountId = input2;
        this.formId = input3;
        this.value = input4;
        this.extensionOfProperty = input5;
        this.extensionOfObject = input6;
        this.objectId = input7;
        this.contactId = input8;
        this.submittedBy = input9;
        this.submittedByIdType = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.and = input13;
        this.or = input14;
        this.not = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableSubmittedFormValueFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput extensionOfObject() {
        return this.extensionOfObject.value;
    }

    public SearchableStringFilterInput extensionOfProperty() {
        return this.extensionOfProperty.value;
    }

    public SearchableIDFilterInput formId() {
        return this.formId.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableSubmittedFormValueFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableSubmittedFormValueFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableSubmittedFormValueFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableSubmittedFormValueFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableSubmittedFormValueFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableSubmittedFormValueFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.formId.defined) {
                    inputFieldWriter.writeObject("formId", SearchableSubmittedFormValueFilterInput.this.formId.value != 0 ? ((SearchableIDFilterInput) SearchableSubmittedFormValueFilterInput.this.formId.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", SearchableSubmittedFormValueFilterInput.this.value.value != 0 ? ((SearchableStringFilterInput) SearchableSubmittedFormValueFilterInput.this.value.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.extensionOfProperty.defined) {
                    inputFieldWriter.writeObject("extensionOfProperty", SearchableSubmittedFormValueFilterInput.this.extensionOfProperty.value != 0 ? ((SearchableStringFilterInput) SearchableSubmittedFormValueFilterInput.this.extensionOfProperty.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.extensionOfObject.defined) {
                    inputFieldWriter.writeObject("extensionOfObject", SearchableSubmittedFormValueFilterInput.this.extensionOfObject.value != 0 ? ((SearchableStringFilterInput) SearchableSubmittedFormValueFilterInput.this.extensionOfObject.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.objectId.defined) {
                    inputFieldWriter.writeObject("objectId", SearchableSubmittedFormValueFilterInput.this.objectId.value != 0 ? ((SearchableIDFilterInput) SearchableSubmittedFormValueFilterInput.this.objectId.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableSubmittedFormValueFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableSubmittedFormValueFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.submittedBy.defined) {
                    inputFieldWriter.writeObject("submittedBy", SearchableSubmittedFormValueFilterInput.this.submittedBy.value != 0 ? ((SearchableIDFilterInput) SearchableSubmittedFormValueFilterInput.this.submittedBy.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.submittedByIdType.defined) {
                    inputFieldWriter.writeObject("submittedByIdType", SearchableSubmittedFormValueFilterInput.this.submittedByIdType.value != 0 ? ((SearchableStringFilterInput) SearchableSubmittedFormValueFilterInput.this.submittedByIdType.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableSubmittedFormValueFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableSubmittedFormValueFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableSubmittedFormValueFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableSubmittedFormValueFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableSubmittedFormValueFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableSubmittedFormValueFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableSubmittedFormValueFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableSubmittedFormValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableSubmittedFormValueFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableSubmittedFormValueFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableSubmittedFormValueFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableSubmittedFormValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableSubmittedFormValueFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableSubmittedFormValueFilterInput.this.not.value != 0 ? ((SearchableSubmittedFormValueFilterInput) SearchableSubmittedFormValueFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableSubmittedFormValueFilterInput not() {
        return this.not.value;
    }

    public SearchableIDFilterInput objectId() {
        return this.objectId.value;
    }

    public List<SearchableSubmittedFormValueFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput submittedBy() {
        return this.submittedBy.value;
    }

    public SearchableStringFilterInput submittedByIdType() {
        return this.submittedByIdType.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput value() {
        return this.value.value;
    }
}
