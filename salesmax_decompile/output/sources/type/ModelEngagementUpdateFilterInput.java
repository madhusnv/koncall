package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEngagementUpdateFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelEngagementUpdateFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dueDateTimeChangedFrom;
    private final Input<ModelStringInput> dueDateTimeChangedTo;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> eventType;
    private final Input<ModelIDInput> id;
    private final Input<ModelEngagementUpdateFilterInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelEngagementUpdateFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> eventType = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> note = Input.absent();
        private Input<ModelStringInput> dueDateTimeChangedFrom = Input.absent();
        private Input<ModelStringInput> dueDateTimeChangedTo = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<List<ModelEngagementUpdateFilterInput>> and = Input.absent();
        private Input<List<ModelEngagementUpdateFilterInput>> or = Input.absent();
        private Input<ModelEngagementUpdateFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelEngagementUpdateFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelEngagementUpdateFilterInput build() {
            return new ModelEngagementUpdateFilterInput(this.id, this.accountId, this.updatedById, this.contactId, this.eventType, this.engagementId, this.note, this.dueDateTimeChangedFrom, this.dueDateTimeChangedTo, this.updatedAt, this.createdAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dueDateTimeChangedFrom(ModelStringInput modelStringInput) {
            this.dueDateTimeChangedFrom = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dueDateTimeChangedTo(ModelStringInput modelStringInput) {
            this.dueDateTimeChangedTo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder eventType(ModelStringInput modelStringInput) {
            this.eventType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelEngagementUpdateFilterInput modelEngagementUpdateFilterInput) {
            this.not = Input.fromNullable(modelEngagementUpdateFilterInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelEngagementUpdateFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelEngagementUpdateFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<List<ModelEngagementUpdateFilterInput>> input12, Input<List<ModelEngagementUpdateFilterInput>> input13, Input<ModelEngagementUpdateFilterInput> input14) {
        this.id = input;
        this.accountId = input2;
        this.updatedById = input3;
        this.contactId = input4;
        this.eventType = input5;
        this.engagementId = input6;
        this.note = input7;
        this.dueDateTimeChangedFrom = input8;
        this.dueDateTimeChangedTo = input9;
        this.updatedAt = input10;
        this.createdAt = input11;
        this.and = input12;
        this.or = input13;
        this.not = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelEngagementUpdateFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput dueDateTimeChangedFrom() {
        return this.dueDateTimeChangedFrom.value;
    }

    public ModelStringInput dueDateTimeChangedTo() {
        return this.dueDateTimeChangedTo.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    public ModelStringInput eventType() {
        return this.eventType.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementUpdateFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementUpdateFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelEngagementUpdateFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelEngagementUpdateFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEngagementUpdateFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEngagementUpdateFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelEngagementUpdateFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelEngagementUpdateFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelEngagementUpdateFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelEngagementUpdateFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.eventType.defined) {
                    inputFieldWriter.writeObject("eventType", ModelEngagementUpdateFilterInput.this.eventType.value != 0 ? ((ModelStringInput) ModelEngagementUpdateFilterInput.this.eventType.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelEngagementUpdateFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelEngagementUpdateFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelEngagementUpdateFilterInput.this.note.value != 0 ? ((ModelStringInput) ModelEngagementUpdateFilterInput.this.note.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.dueDateTimeChangedFrom.defined) {
                    inputFieldWriter.writeObject("dueDateTimeChangedFrom", ModelEngagementUpdateFilterInput.this.dueDateTimeChangedFrom.value != 0 ? ((ModelStringInput) ModelEngagementUpdateFilterInput.this.dueDateTimeChangedFrom.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.dueDateTimeChangedTo.defined) {
                    inputFieldWriter.writeObject("dueDateTimeChangedTo", ModelEngagementUpdateFilterInput.this.dueDateTimeChangedTo.value != 0 ? ((ModelStringInput) ModelEngagementUpdateFilterInput.this.dueDateTimeChangedTo.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEngagementUpdateFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEngagementUpdateFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEngagementUpdateFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEngagementUpdateFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEngagementUpdateFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEngagementUpdateFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementUpdateFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementUpdateFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementUpdateFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementUpdateFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEngagementUpdateFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementUpdateFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementUpdateFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementUpdateFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementUpdateFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEngagementUpdateFilterInput.this.not.value != 0 ? ((ModelEngagementUpdateFilterInput) ModelEngagementUpdateFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelEngagementUpdateFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelEngagementUpdateFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
