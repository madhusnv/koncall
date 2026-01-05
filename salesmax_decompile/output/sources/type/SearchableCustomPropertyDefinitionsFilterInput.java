package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCustomPropertyDefinitionsFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCustomPropertyDefinitionsFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableStringFilterInput> displayName;
    private final Input<SearchableIntFilterInput> displayOrder;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> isArchived;
    private final Input<SearchableBooleanFilterInput> isMultiple;
    private final Input<SearchableBooleanFilterInput> isSystemProperty;
    private final Input<SearchableCustomPropertyDefinitionsFilterInput> not;
    private final Input<List<SearchableCustomPropertyDefinitionsFilterInput>> or;
    private final Input<SearchableStringFilterInput> parentObjectType;
    private final Input<SearchableStringFilterInput> propertyName;
    private final Input<SearchableStringFilterInput> scalarType;
    private final Input<SearchableIDFilterInput> updaedById;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> propertyName = Input.absent();
        private Input<SearchableStringFilterInput> displayName = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableStringFilterInput> scalarType = Input.absent();
        private Input<SearchableBooleanFilterInput> isMultiple = Input.absent();
        private Input<SearchableStringFilterInput> parentObjectType = Input.absent();
        private Input<SearchableBooleanFilterInput> isSystemProperty = Input.absent();
        private Input<SearchableBooleanFilterInput> isArchived = Input.absent();
        private Input<SearchableIntFilterInput> displayOrder = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableIDFilterInput> updaedById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableCustomPropertyDefinitionsFilterInput>> and = Input.absent();
        private Input<List<SearchableCustomPropertyDefinitionsFilterInput>> or = Input.absent();
        private Input<SearchableCustomPropertyDefinitionsFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCustomPropertyDefinitionsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableCustomPropertyDefinitionsFilterInput build() {
            return new SearchableCustomPropertyDefinitionsFilterInput(this.id, this.accountId, this.propertyName, this.displayName, this.description, this.scalarType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.isArchived, this.displayOrder, this.createdById, this.updaedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdById(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder displayName(SearchableStringFilterInput searchableStringFilterInput) {
            this.displayName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder displayOrder(SearchableIntFilterInput searchableIntFilterInput) {
            this.displayOrder = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isArchived(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isArchived = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isMultiple(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isMultiple = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isSystemProperty(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isSystemProperty = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder not(SearchableCustomPropertyDefinitionsFilterInput searchableCustomPropertyDefinitionsFilterInput) {
            this.not = Input.fromNullable(searchableCustomPropertyDefinitionsFilterInput);
            return this;
        }

        public Builder or(List<SearchableCustomPropertyDefinitionsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectType(SearchableStringFilterInput searchableStringFilterInput) {
            this.parentObjectType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder propertyName(SearchableStringFilterInput searchableStringFilterInput) {
            this.propertyName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder scalarType(SearchableStringFilterInput searchableStringFilterInput) {
            this.scalarType = Input.fromNullable(searchableStringFilterInput);
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

    public SearchableCustomPropertyDefinitionsFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableBooleanFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableBooleanFilterInput> input9, Input<SearchableBooleanFilterInput> input10, Input<SearchableIntFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableIDFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<List<SearchableCustomPropertyDefinitionsFilterInput>> input16, Input<List<SearchableCustomPropertyDefinitionsFilterInput>> input17, Input<SearchableCustomPropertyDefinitionsFilterInput> input18) {
        this.id = input;
        this.accountId = input2;
        this.propertyName = input3;
        this.displayName = input4;
        this.description = input5;
        this.scalarType = input6;
        this.isMultiple = input7;
        this.parentObjectType = input8;
        this.isSystemProperty = input9;
        this.isArchived = input10;
        this.displayOrder = input11;
        this.createdById = input12;
        this.updaedById = input13;
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

    public List<SearchableCustomPropertyDefinitionsFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdById() {
        return this.createdById.value;
    }

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableStringFilterInput displayName() {
        return this.displayName.value;
    }

    public SearchableIntFilterInput displayOrder() {
        return this.displayOrder.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput isArchived() {
        return this.isArchived.value;
    }

    public SearchableBooleanFilterInput isMultiple() {
        return this.isMultiple.value;
    }

    public SearchableBooleanFilterInput isSystemProperty() {
        return this.isSystemProperty.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomPropertyDefinitionsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomPropertyDefinitionsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableCustomPropertyDefinitionsFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCustomPropertyDefinitionsFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.propertyName.defined) {
                    inputFieldWriter.writeObject("propertyName", SearchableCustomPropertyDefinitionsFilterInput.this.propertyName.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.propertyName.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.displayName.defined) {
                    inputFieldWriter.writeObject("displayName", SearchableCustomPropertyDefinitionsFilterInput.this.displayName.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.displayName.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableCustomPropertyDefinitionsFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.scalarType.defined) {
                    inputFieldWriter.writeObject("scalarType", SearchableCustomPropertyDefinitionsFilterInput.this.scalarType.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.scalarType.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.isMultiple.defined) {
                    inputFieldWriter.writeObject("isMultiple", SearchableCustomPropertyDefinitionsFilterInput.this.isMultiple.value != 0 ? ((SearchableBooleanFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.isMultiple.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", SearchableCustomPropertyDefinitionsFilterInput.this.parentObjectType.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.parentObjectType.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.isSystemProperty.defined) {
                    inputFieldWriter.writeObject("isSystemProperty", SearchableCustomPropertyDefinitionsFilterInput.this.isSystemProperty.value != 0 ? ((SearchableBooleanFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.isSystemProperty.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.isArchived.defined) {
                    inputFieldWriter.writeObject("isArchived", SearchableCustomPropertyDefinitionsFilterInput.this.isArchived.value != 0 ? ((SearchableBooleanFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.isArchived.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.displayOrder.defined) {
                    inputFieldWriter.writeObject("displayOrder", SearchableCustomPropertyDefinitionsFilterInput.this.displayOrder.value != 0 ? ((SearchableIntFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.displayOrder.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchableCustomPropertyDefinitionsFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.updaedById.defined) {
                    inputFieldWriter.writeObject("updaedById", SearchableCustomPropertyDefinitionsFilterInput.this.updaedById.value != 0 ? ((SearchableIDFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.updaedById.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCustomPropertyDefinitionsFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCustomPropertyDefinitionsFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCustomPropertyDefinitionsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomPropertyDefinitionsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomPropertyDefinitionsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomPropertyDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCustomPropertyDefinitionsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCustomPropertyDefinitionsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCustomPropertyDefinitionsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCustomPropertyDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCustomPropertyDefinitionsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableCustomPropertyDefinitionsFilterInput.this.not.value != 0 ? ((SearchableCustomPropertyDefinitionsFilterInput) SearchableCustomPropertyDefinitionsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableCustomPropertyDefinitionsFilterInput not() {
        return this.not.value;
    }

    public List<SearchableCustomPropertyDefinitionsFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput parentObjectType() {
        return this.parentObjectType.value;
    }

    public SearchableStringFilterInput propertyName() {
        return this.propertyName.value;
    }

    public SearchableStringFilterInput scalarType() {
        return this.scalarType.value;
    }

    public SearchableIDFilterInput updaedById() {
        return this.updaedById.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
