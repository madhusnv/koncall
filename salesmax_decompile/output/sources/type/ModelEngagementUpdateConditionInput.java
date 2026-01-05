package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEngagementUpdateConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelEngagementUpdateConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dueDateTimeChangedFrom;
    private final Input<ModelStringInput> dueDateTimeChangedTo;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> eventType;
    private final Input<ModelEngagementUpdateConditionInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelEngagementUpdateConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
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
        private Input<List<ModelEngagementUpdateConditionInput>> and = Input.absent();
        private Input<List<ModelEngagementUpdateConditionInput>> or = Input.absent();
        private Input<ModelEngagementUpdateConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelEngagementUpdateConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelEngagementUpdateConditionInput build() {
            return new ModelEngagementUpdateConditionInput(this.accountId, this.updatedById, this.contactId, this.eventType, this.engagementId, this.note, this.dueDateTimeChangedFrom, this.dueDateTimeChangedTo, this.updatedAt, this.createdAt, this.and, this.or, this.not);
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

        public Builder not(ModelEngagementUpdateConditionInput modelEngagementUpdateConditionInput) {
            this.not = Input.fromNullable(modelEngagementUpdateConditionInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelEngagementUpdateConditionInput> list) {
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

    public ModelEngagementUpdateConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelEngagementUpdateConditionInput>> input11, Input<List<ModelEngagementUpdateConditionInput>> input12, Input<ModelEngagementUpdateConditionInput> input13) {
        this.accountId = input;
        this.updatedById = input2;
        this.contactId = input3;
        this.eventType = input4;
        this.engagementId = input5;
        this.note = input6;
        this.dueDateTimeChangedFrom = input7;
        this.dueDateTimeChangedTo = input8;
        this.updatedAt = input9;
        this.createdAt = input10;
        this.and = input11;
        this.or = input12;
        this.not = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelEngagementUpdateConditionInput> and() {
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementUpdateConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementUpdateConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEngagementUpdateConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEngagementUpdateConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelEngagementUpdateConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelEngagementUpdateConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelEngagementUpdateConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelEngagementUpdateConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.eventType.defined) {
                    inputFieldWriter.writeObject("eventType", ModelEngagementUpdateConditionInput.this.eventType.value != 0 ? ((ModelStringInput) ModelEngagementUpdateConditionInput.this.eventType.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelEngagementUpdateConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelEngagementUpdateConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelEngagementUpdateConditionInput.this.note.value != 0 ? ((ModelStringInput) ModelEngagementUpdateConditionInput.this.note.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.dueDateTimeChangedFrom.defined) {
                    inputFieldWriter.writeObject("dueDateTimeChangedFrom", ModelEngagementUpdateConditionInput.this.dueDateTimeChangedFrom.value != 0 ? ((ModelStringInput) ModelEngagementUpdateConditionInput.this.dueDateTimeChangedFrom.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.dueDateTimeChangedTo.defined) {
                    inputFieldWriter.writeObject("dueDateTimeChangedTo", ModelEngagementUpdateConditionInput.this.dueDateTimeChangedTo.value != 0 ? ((ModelStringInput) ModelEngagementUpdateConditionInput.this.dueDateTimeChangedTo.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEngagementUpdateConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEngagementUpdateConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEngagementUpdateConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEngagementUpdateConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEngagementUpdateConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEngagementUpdateConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementUpdateConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementUpdateConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementUpdateConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementUpdateConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEngagementUpdateConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementUpdateConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementUpdateConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementUpdateConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementUpdateConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEngagementUpdateConditionInput.this.not.value != 0 ? ((ModelEngagementUpdateConditionInput) ModelEngagementUpdateConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelEngagementUpdateConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelEngagementUpdateConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
