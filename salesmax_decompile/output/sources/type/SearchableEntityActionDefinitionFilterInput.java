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
public final class SearchableEntityActionDefinitionFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableStringFilterInput> action;
    private final Input<List<SearchableEntityActionDefinitionFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdBy;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableStringFilterInput> endDateTime;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableEntityActionDefinitionFilterInput> not;
    private final Input<List<SearchableEntityActionDefinitionFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIntFilterInput> periodicFrequency;
    private final Input<SearchableStringFilterInput> periodicFrequencyUnit;
    private final Input<SearchableStringFilterInput> startDateTime;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> subscriptionType;
    private final Input<SearchableStringFilterInput> target;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedBy;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableStringFilterInput> action = Input.absent();
        private Input<SearchableStringFilterInput> target = Input.absent();
        private Input<SearchableStringFilterInput> subscriptionType = Input.absent();
        private Input<SearchableIntFilterInput> periodicFrequency = Input.absent();
        private Input<SearchableStringFilterInput> periodicFrequencyUnit = Input.absent();
        private Input<SearchableStringFilterInput> startDateTime = Input.absent();
        private Input<SearchableStringFilterInput> endDateTime = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableIDFilterInput> createdBy = Input.absent();
        private Input<SearchableIDFilterInput> updatedBy = Input.absent();
        private Input<List<SearchableEntityActionDefinitionFilterInput>> and = Input.absent();
        private Input<List<SearchableEntityActionDefinitionFilterInput>> or = Input.absent();
        private Input<SearchableEntityActionDefinitionFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder action(SearchableStringFilterInput searchableStringFilterInput) {
            this.action = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableEntityActionDefinitionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableEntityActionDefinitionFilterInput build() {
            return new SearchableEntityActionDefinitionFilterInput(this.id, this.accountId, this.name, this.description, this.action, this.target, this.subscriptionType, this.periodicFrequency, this.periodicFrequencyUnit, this.startDateTime, this.endDateTime, this.status, this.ownerId, this.createdAt, this.updatedAt, this.createdBy, this.updatedBy, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder endDateTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.endDateTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableEntityActionDefinitionFilterInput searchableEntityActionDefinitionFilterInput) {
            this.not = Input.fromNullable(searchableEntityActionDefinitionFilterInput);
            return this;
        }

        public Builder or(List<SearchableEntityActionDefinitionFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder periodicFrequency(SearchableIntFilterInput searchableIntFilterInput) {
            this.periodicFrequency = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder periodicFrequencyUnit(SearchableStringFilterInput searchableStringFilterInput) {
            this.periodicFrequencyUnit = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder startDateTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.startDateTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder subscriptionType(SearchableStringFilterInput searchableStringFilterInput) {
            this.subscriptionType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder target(SearchableStringFilterInput searchableStringFilterInput) {
            this.target = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableEntityActionDefinitionFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableIntFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableIDFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableIDFilterInput> input17, Input<List<SearchableEntityActionDefinitionFilterInput>> input18, Input<List<SearchableEntityActionDefinitionFilterInput>> input19, Input<SearchableEntityActionDefinitionFilterInput> input20) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.action = input5;
        this.target = input6;
        this.subscriptionType = input7;
        this.periodicFrequency = input8;
        this.periodicFrequencyUnit = input9;
        this.startDateTime = input10;
        this.endDateTime = input11;
        this.status = input12;
        this.ownerId = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.createdBy = input16;
        this.updatedBy = input17;
        this.and = input18;
        this.or = input19;
        this.not = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableStringFilterInput action() {
        return this.action.value;
    }

    public List<SearchableEntityActionDefinitionFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdBy() {
        return this.createdBy.value;
    }

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableStringFilterInput endDateTime() {
        return this.endDateTime.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableEntityActionDefinitionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableEntityActionDefinitionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableEntityActionDefinitionFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableEntityActionDefinitionFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableEntityActionDefinitionFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableEntityActionDefinitionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableEntityActionDefinitionFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableEntityActionDefinitionFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.action.defined) {
                    inputFieldWriter.writeObject("action", SearchableEntityActionDefinitionFilterInput.this.action.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.action.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.target.defined) {
                    inputFieldWriter.writeObject("target", SearchableEntityActionDefinitionFilterInput.this.target.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.target.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.subscriptionType.defined) {
                    inputFieldWriter.writeObject("subscriptionType", SearchableEntityActionDefinitionFilterInput.this.subscriptionType.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.subscriptionType.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.periodicFrequency.defined) {
                    inputFieldWriter.writeObject("periodicFrequency", SearchableEntityActionDefinitionFilterInput.this.periodicFrequency.value != 0 ? ((SearchableIntFilterInput) SearchableEntityActionDefinitionFilterInput.this.periodicFrequency.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.periodicFrequencyUnit.defined) {
                    inputFieldWriter.writeObject("periodicFrequencyUnit", SearchableEntityActionDefinitionFilterInput.this.periodicFrequencyUnit.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.periodicFrequencyUnit.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.startDateTime.defined) {
                    inputFieldWriter.writeObject("startDateTime", SearchableEntityActionDefinitionFilterInput.this.startDateTime.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.startDateTime.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.endDateTime.defined) {
                    inputFieldWriter.writeObject("endDateTime", SearchableEntityActionDefinitionFilterInput.this.endDateTime.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.endDateTime.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableEntityActionDefinitionFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableEntityActionDefinitionFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableEntityActionDefinitionFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableEntityActionDefinitionFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableEntityActionDefinitionFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableEntityActionDefinitionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", SearchableEntityActionDefinitionFilterInput.this.createdBy.value != 0 ? ((SearchableIDFilterInput) SearchableEntityActionDefinitionFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", SearchableEntityActionDefinitionFilterInput.this.updatedBy.value != 0 ? ((SearchableIDFilterInput) SearchableEntityActionDefinitionFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableEntityActionDefinitionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableEntityActionDefinitionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableEntityActionDefinitionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableEntityActionDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableEntityActionDefinitionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableEntityActionDefinitionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableEntityActionDefinitionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableEntityActionDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableEntityActionDefinitionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableEntityActionDefinitionFilterInput.this.not.value != 0 ? ((SearchableEntityActionDefinitionFilterInput) SearchableEntityActionDefinitionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableEntityActionDefinitionFilterInput not() {
        return this.not.value;
    }

    public List<SearchableEntityActionDefinitionFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIntFilterInput periodicFrequency() {
        return this.periodicFrequency.value;
    }

    public SearchableStringFilterInput periodicFrequencyUnit() {
        return this.periodicFrequencyUnit.value;
    }

    public SearchableStringFilterInput startDateTime() {
        return this.startDateTime.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput subscriptionType() {
        return this.subscriptionType.value;
    }

    public SearchableStringFilterInput target() {
        return this.target.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedBy() {
        return this.updatedBy.value;
    }
}
