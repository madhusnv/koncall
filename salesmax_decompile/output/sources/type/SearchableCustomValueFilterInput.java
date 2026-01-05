package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCustomValueFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCustomValueFilterInput>> and;
    private final Input<SearchableIDFilterInput> createSourceId;
    private final Input<SearchableStringFilterInput> createSourceType;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableCustomValueFilterInput> not;
    private final Input<List<SearchableCustomValueFilterInput>> or;
    private final Input<SearchableIDFilterInput> parentObjectId;
    private final Input<SearchableStringFilterInput> parentObjectType;
    private final Input<SearchableIDFilterInput> propertyDefinitionId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> value;

    public static final class Builder {
        private Input<SearchableIDFilterInput> propertyDefinitionId = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> parentObjectId = Input.absent();
        private Input<SearchableStringFilterInput> parentObjectType = Input.absent();
        private Input<SearchableStringFilterInput> value = Input.absent();
        private Input<SearchableIDFilterInput> createSourceId = Input.absent();
        private Input<SearchableStringFilterInput> createSourceType = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableCustomValueFilterInput>> and = Input.absent();
        private Input<List<SearchableCustomValueFilterInput>> or = Input.absent();
        private Input<SearchableCustomValueFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCustomValueFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableCustomValueFilterInput build() {
            return new SearchableCustomValueFilterInput(this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(SearchableCustomValueFilterInput searchableCustomValueFilterInput) {
            this.not = Input.fromNullable(searchableCustomValueFilterInput);
            return this;
        }

        public Builder or(List<SearchableCustomValueFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.parentObjectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder parentObjectType(SearchableStringFilterInput searchableStringFilterInput) {
            this.parentObjectType = Input.fromNullable(searchableStringFilterInput);
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

    public SearchableCustomValueFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<List<SearchableCustomValueFilterInput>> input10, Input<List<SearchableCustomValueFilterInput>> input11, Input<SearchableCustomValueFilterInput> input12) {
        this.propertyDefinitionId = input;
        this.accountId = input2;
        this.parentObjectId = input3;
        this.parentObjectType = input4;
        this.value = input5;
        this.createSourceId = input6;
        this.createSourceType = input7;
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

    public List<SearchableCustomValueFilterInput> and() {
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomValueFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomValueFilterInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", SearchableCustomValueFilterInput.this.propertyDefinitionId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomValueFilterInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCustomValueFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomValueFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", SearchableCustomValueFilterInput.this.parentObjectId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomValueFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", SearchableCustomValueFilterInput.this.parentObjectType.value != 0 ? ((SearchableStringFilterInput) SearchableCustomValueFilterInput.this.parentObjectType.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", SearchableCustomValueFilterInput.this.value.value != 0 ? ((SearchableStringFilterInput) SearchableCustomValueFilterInput.this.value.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.createSourceId.defined) {
                    inputFieldWriter.writeObject("createSourceId", SearchableCustomValueFilterInput.this.createSourceId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomValueFilterInput.this.createSourceId.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.createSourceType.defined) {
                    inputFieldWriter.writeObject("createSourceType", SearchableCustomValueFilterInput.this.createSourceType.value != 0 ? ((SearchableStringFilterInput) SearchableCustomValueFilterInput.this.createSourceType.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCustomValueFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomValueFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCustomValueFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomValueFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCustomValueFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCustomValueFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomValueFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomValueFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomValueFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCustomValueFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomValueFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomValueFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomValueFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableCustomValueFilterInput.this.not.value != 0 ? ((SearchableCustomValueFilterInput) SearchableCustomValueFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableCustomValueFilterInput not() {
        return this.not.value;
    }

    public List<SearchableCustomValueFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public SearchableStringFilterInput parentObjectType() {
        return this.parentObjectType.value;
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
