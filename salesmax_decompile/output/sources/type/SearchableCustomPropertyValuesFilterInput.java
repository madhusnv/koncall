package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCustomPropertyValuesFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCustomPropertyValuesFilterInput>> and;
    private final Input<SearchableIDFilterInput> createSourceId;
    private final Input<SearchableStringFilterInput> createSourceType;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableCustomPropertyValuesFilterInput> not;
    private final Input<List<SearchableCustomPropertyValuesFilterInput>> or;
    private final Input<SearchableStringFilterInput> parentObject;
    private final Input<SearchableIDFilterInput> parentObjectId;
    private final Input<SearchableIDFilterInput> propertyDefinitionId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> value;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> propertyDefinitionId = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> parentObjectId = Input.absent();
        private Input<SearchableStringFilterInput> parentObject = Input.absent();
        private Input<SearchableStringFilterInput> value = Input.absent();
        private Input<SearchableIDFilterInput> createSourceId = Input.absent();
        private Input<SearchableStringFilterInput> createSourceType = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableCustomPropertyValuesFilterInput>> and = Input.absent();
        private Input<List<SearchableCustomPropertyValuesFilterInput>> or = Input.absent();
        private Input<SearchableCustomPropertyValuesFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCustomPropertyValuesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableCustomPropertyValuesFilterInput build() {
            return new SearchableCustomPropertyValuesFilterInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createSourceId(SearchableIDFilterInput searchableIDFilterInput) {
            this.createSourceId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createSourceType(SearchableStringFilterInput searchableStringFilterInput) {
            this.createSourceType = Input.fromNullable(searchableStringFilterInput);
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

        public Builder not(SearchableCustomPropertyValuesFilterInput searchableCustomPropertyValuesFilterInput) {
            this.not = Input.fromNullable(searchableCustomPropertyValuesFilterInput);
            return this;
        }

        public Builder or(List<SearchableCustomPropertyValuesFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObject(SearchableStringFilterInput searchableStringFilterInput) {
            this.parentObject = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder parentObjectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.parentObjectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder propertyDefinitionId(SearchableIDFilterInput searchableIDFilterInput) {
            this.propertyDefinitionId = Input.fromNullable(searchableIDFilterInput);
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

    public SearchableCustomPropertyValuesFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<List<SearchableCustomPropertyValuesFilterInput>> input11, Input<List<SearchableCustomPropertyValuesFilterInput>> input12, Input<SearchableCustomPropertyValuesFilterInput> input13) {
        this.id = input;
        this.propertyDefinitionId = input2;
        this.accountId = input3;
        this.parentObjectId = input4;
        this.parentObject = input5;
        this.value = input6;
        this.createSourceId = input7;
        this.createSourceType = input8;
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

    public List<SearchableCustomPropertyValuesFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput createSourceId() {
        return this.createSourceId.value;
    }

    public SearchableStringFilterInput createSourceType() {
        return this.createSourceType.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomPropertyValuesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomPropertyValuesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableCustomPropertyValuesFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyValuesFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", SearchableCustomPropertyValuesFilterInput.this.propertyDefinitionId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyValuesFilterInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCustomPropertyValuesFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyValuesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", SearchableCustomPropertyValuesFilterInput.this.parentObjectId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyValuesFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.parentObject.defined) {
                    inputFieldWriter.writeObject("parentObject", SearchableCustomPropertyValuesFilterInput.this.parentObject.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyValuesFilterInput.this.parentObject.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", SearchableCustomPropertyValuesFilterInput.this.value.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyValuesFilterInput.this.value.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.createSourceId.defined) {
                    inputFieldWriter.writeObject("createSourceId", SearchableCustomPropertyValuesFilterInput.this.createSourceId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyValuesFilterInput.this.createSourceId.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.createSourceType.defined) {
                    inputFieldWriter.writeObject("createSourceType", SearchableCustomPropertyValuesFilterInput.this.createSourceType.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyValuesFilterInput.this.createSourceType.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCustomPropertyValuesFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyValuesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCustomPropertyValuesFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyValuesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCustomPropertyValuesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomPropertyValuesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomPropertyValuesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomPropertyValuesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCustomPropertyValuesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomPropertyValuesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomPropertyValuesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomPropertyValuesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomPropertyValuesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableCustomPropertyValuesFilterInput.this.not.value != 0 ? ((SearchableCustomPropertyValuesFilterInput) SearchableCustomPropertyValuesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableCustomPropertyValuesFilterInput not() {
        return this.not.value;
    }

    public List<SearchableCustomPropertyValuesFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput parentObject() {
        return this.parentObject.value;
    }

    public SearchableIDFilterInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public SearchableIDFilterInput propertyDefinitionId() {
        return this.propertyDefinitionId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput value() {
        return this.value.value;
    }
}
