package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchablecustomFormAttachConditionFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchablecustomFormAttachConditionFilterInput>> and;
    private final Input<SearchableStringFilterInput> callOutcome;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdById;
    private final Input<SearchableStringFilterInput> dealStage;
    private final Input<SearchableStringFilterInput> documentCategory;
    private final Input<SearchableStringFilterInput> documentSubCategory;
    private final Input<SearchableIDFilterInput> formId;
    private final Input<SearchableStringFilterInput> formType;
    private final Input<SearchableBooleanFilterInput> hideDefaultNote;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> isDefaultFormForType;
    private final Input<SearchablecustomFormAttachConditionFilterInput> not;
    private final Input<List<SearchablecustomFormAttachConditionFilterInput>> or;
    private final Input<SearchableStringFilterInput> paymentStatus;
    private final Input<SearchableStringFilterInput> taskInputType;
    private final Input<SearchableStringFilterInput> taskOutcomeType;
    private final Input<SearchableStringFilterInput> taskType;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;
    private final Input<SearchableStringFilterInput> visitOutcome;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> formId = Input.absent();
        private Input<SearchableStringFilterInput> formType = Input.absent();
        private Input<SearchableStringFilterInput> callOutcome = Input.absent();
        private Input<SearchableStringFilterInput> visitOutcome = Input.absent();
        private Input<SearchableStringFilterInput> taskInputType = Input.absent();
        private Input<SearchableStringFilterInput> taskType = Input.absent();
        private Input<SearchableStringFilterInput> taskOutcomeType = Input.absent();
        private Input<SearchableStringFilterInput> dealStage = Input.absent();
        private Input<SearchableStringFilterInput> paymentStatus = Input.absent();
        private Input<SearchableStringFilterInput> documentCategory = Input.absent();
        private Input<SearchableStringFilterInput> documentSubCategory = Input.absent();
        private Input<SearchableStringFilterInput> isDefaultFormForType = Input.absent();
        private Input<SearchableBooleanFilterInput> hideDefaultNote = Input.absent();
        private Input<SearchableIDFilterInput> createdById = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchablecustomFormAttachConditionFilterInput>> and = Input.absent();
        private Input<List<SearchablecustomFormAttachConditionFilterInput>> or = Input.absent();
        private Input<SearchablecustomFormAttachConditionFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchablecustomFormAttachConditionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchablecustomFormAttachConditionFilterInput build() {
            return new SearchablecustomFormAttachConditionFilterInput(this.id, this.accountId, this.formId, this.formType, this.callOutcome, this.visitOutcome, this.taskInputType, this.taskType, this.taskOutcomeType, this.dealStage, this.paymentStatus, this.documentCategory, this.documentSubCategory, this.isDefaultFormForType, this.hideDefaultNote, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.callOutcome = Input.fromNullable(searchableStringFilterInput);
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

        public Builder dealStage(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealStage = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder documentCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.documentCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder documentSubCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.documentSubCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder formId(SearchableIDFilterInput searchableIDFilterInput) {
            this.formId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder formType(SearchableStringFilterInput searchableStringFilterInput) {
            this.formType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder hideDefaultNote(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.hideDefaultNote = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isDefaultFormForType(SearchableStringFilterInput searchableStringFilterInput) {
            this.isDefaultFormForType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchablecustomFormAttachConditionFilterInput searchablecustomFormAttachConditionFilterInput) {
            this.not = Input.fromNullable(searchablecustomFormAttachConditionFilterInput);
            return this;
        }

        public Builder or(List<SearchablecustomFormAttachConditionFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder paymentStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.paymentStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskInputType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskInputType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskOutcomeType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskOutcomeType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskType = Input.fromNullable(searchableStringFilterInput);
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

        public Builder visitOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.visitOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchablecustomFormAttachConditionFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableBooleanFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableIDFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<List<SearchablecustomFormAttachConditionFilterInput>> input20, Input<List<SearchablecustomFormAttachConditionFilterInput>> input21, Input<SearchablecustomFormAttachConditionFilterInput> input22) {
        this.id = input;
        this.accountId = input2;
        this.formId = input3;
        this.formType = input4;
        this.callOutcome = input5;
        this.visitOutcome = input6;
        this.taskInputType = input7;
        this.taskType = input8;
        this.taskOutcomeType = input9;
        this.dealStage = input10;
        this.paymentStatus = input11;
        this.documentCategory = input12;
        this.documentSubCategory = input13;
        this.isDefaultFormForType = input14;
        this.hideDefaultNote = input15;
        this.createdById = input16;
        this.updatedById = input17;
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

    public List<SearchablecustomFormAttachConditionFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput callOutcome() {
        return this.callOutcome.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdById() {
        return this.createdById.value;
    }

    public SearchableStringFilterInput dealStage() {
        return this.dealStage.value;
    }

    public SearchableStringFilterInput documentCategory() {
        return this.documentCategory.value;
    }

    public SearchableStringFilterInput documentSubCategory() {
        return this.documentSubCategory.value;
    }

    public SearchableIDFilterInput formId() {
        return this.formId.value;
    }

    public SearchableStringFilterInput formType() {
        return this.formType.value;
    }

    public SearchableBooleanFilterInput hideDefaultNote() {
        return this.hideDefaultNote.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput isDefaultFormForType() {
        return this.isDefaultFormForType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchablecustomFormAttachConditionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchablecustomFormAttachConditionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchablecustomFormAttachConditionFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchablecustomFormAttachConditionFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchablecustomFormAttachConditionFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchablecustomFormAttachConditionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.formId.defined) {
                    inputFieldWriter.writeObject("formId", SearchablecustomFormAttachConditionFilterInput.this.formId.value != 0 ? ((SearchableIDFilterInput) SearchablecustomFormAttachConditionFilterInput.this.formId.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.formType.defined) {
                    inputFieldWriter.writeObject("formType", SearchablecustomFormAttachConditionFilterInput.this.formType.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.formType.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.callOutcome.defined) {
                    inputFieldWriter.writeObject("callOutcome", SearchablecustomFormAttachConditionFilterInput.this.callOutcome.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.callOutcome.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeObject("visitOutcome", SearchablecustomFormAttachConditionFilterInput.this.visitOutcome.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.visitOutcome.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.taskInputType.defined) {
                    inputFieldWriter.writeObject("taskInputType", SearchablecustomFormAttachConditionFilterInput.this.taskInputType.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.taskInputType.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.taskType.defined) {
                    inputFieldWriter.writeObject("taskType", SearchablecustomFormAttachConditionFilterInput.this.taskType.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.taskType.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.taskOutcomeType.defined) {
                    inputFieldWriter.writeObject("taskOutcomeType", SearchablecustomFormAttachConditionFilterInput.this.taskOutcomeType.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.taskOutcomeType.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", SearchablecustomFormAttachConditionFilterInput.this.dealStage.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.dealStage.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.paymentStatus.defined) {
                    inputFieldWriter.writeObject("paymentStatus", SearchablecustomFormAttachConditionFilterInput.this.paymentStatus.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.paymentStatus.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.documentCategory.defined) {
                    inputFieldWriter.writeObject("documentCategory", SearchablecustomFormAttachConditionFilterInput.this.documentCategory.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.documentCategory.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeObject("documentSubCategory", SearchablecustomFormAttachConditionFilterInput.this.documentSubCategory.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.documentSubCategory.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.isDefaultFormForType.defined) {
                    inputFieldWriter.writeObject("isDefaultFormForType", SearchablecustomFormAttachConditionFilterInput.this.isDefaultFormForType.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.isDefaultFormForType.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.hideDefaultNote.defined) {
                    inputFieldWriter.writeObject("hideDefaultNote", SearchablecustomFormAttachConditionFilterInput.this.hideDefaultNote.value != 0 ? ((SearchableBooleanFilterInput) SearchablecustomFormAttachConditionFilterInput.this.hideDefaultNote.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", SearchablecustomFormAttachConditionFilterInput.this.createdById.value != 0 ? ((SearchableIDFilterInput) SearchablecustomFormAttachConditionFilterInput.this.createdById.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchablecustomFormAttachConditionFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchablecustomFormAttachConditionFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchablecustomFormAttachConditionFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchablecustomFormAttachConditionFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchablecustomFormAttachConditionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchablecustomFormAttachConditionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchablecustomFormAttachConditionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchablecustomFormAttachConditionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchablecustomFormAttachConditionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchablecustomFormAttachConditionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchablecustomFormAttachConditionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchablecustomFormAttachConditionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchablecustomFormAttachConditionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchablecustomFormAttachConditionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchablecustomFormAttachConditionFilterInput.this.not.value != 0 ? ((SearchablecustomFormAttachConditionFilterInput) SearchablecustomFormAttachConditionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchablecustomFormAttachConditionFilterInput not() {
        return this.not.value;
    }

    public List<SearchablecustomFormAttachConditionFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput paymentStatus() {
        return this.paymentStatus.value;
    }

    public SearchableStringFilterInput taskInputType() {
        return this.taskInputType.value;
    }

    public SearchableStringFilterInput taskOutcomeType() {
        return this.taskOutcomeType.value;
    }

    public SearchableStringFilterInput taskType() {
        return this.taskType.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }

    public SearchableStringFilterInput visitOutcome() {
        return this.visitOutcome.value;
    }
}
