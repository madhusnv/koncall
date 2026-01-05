package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityActionDefinitionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> action;
    private final Input<List<ModelEntityActionDefinitionConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> endDateTime;
    private final Input<ModelStringInput> name;
    private final Input<ModelEntityActionDefinitionConditionInput> not;
    private final Input<List<ModelEntityActionDefinitionConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIntInput> periodicFrequency;
    private final Input<ModelStringInput> periodicFrequencyUnit;
    private final Input<ModelStringInput> startDateTime;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> subscriptionType;
    private final Input<ModelStringInput> target;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedBy;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> action = Input.absent();
        private Input<ModelStringInput> target = Input.absent();
        private Input<ModelStringInput> subscriptionType = Input.absent();
        private Input<ModelIntInput> periodicFrequency = Input.absent();
        private Input<ModelStringInput> periodicFrequencyUnit = Input.absent();
        private Input<ModelStringInput> startDateTime = Input.absent();
        private Input<ModelStringInput> endDateTime = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdBy = Input.absent();
        private Input<ModelIDInput> updatedBy = Input.absent();
        private Input<List<ModelEntityActionDefinitionConditionInput>> and = Input.absent();
        private Input<List<ModelEntityActionDefinitionConditionInput>> or = Input.absent();
        private Input<ModelEntityActionDefinitionConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder action(ModelStringInput modelStringInput) {
            this.action = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelEntityActionDefinitionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelEntityActionDefinitionConditionInput build() {
            return new ModelEntityActionDefinitionConditionInput(this.accountId, this.name, this.description, this.action, this.target, this.subscriptionType, this.periodicFrequency, this.periodicFrequencyUnit, this.startDateTime, this.endDateTime, this.status, this.ownerId, this.createdAt, this.updatedAt, this.createdBy, this.updatedBy, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdBy(ModelIDInput modelIDInput) {
            this.createdBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder endDateTime(ModelStringInput modelStringInput) {
            this.endDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelEntityActionDefinitionConditionInput modelEntityActionDefinitionConditionInput) {
            this.not = Input.fromNullable(modelEntityActionDefinitionConditionInput);
            return this;
        }

        public Builder or(List<ModelEntityActionDefinitionConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder periodicFrequency(ModelIntInput modelIntInput) {
            this.periodicFrequency = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder periodicFrequencyUnit(ModelStringInput modelStringInput) {
            this.periodicFrequencyUnit = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder startDateTime(ModelStringInput modelStringInput) {
            this.startDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder subscriptionType(ModelStringInput modelStringInput) {
            this.subscriptionType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder target(ModelStringInput modelStringInput) {
            this.target = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedBy(ModelIDInput modelIDInput) {
            this.updatedBy = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelEntityActionDefinitionConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<List<ModelEntityActionDefinitionConditionInput>> input17, Input<List<ModelEntityActionDefinitionConditionInput>> input18, Input<ModelEntityActionDefinitionConditionInput> input19) {
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.action = input4;
        this.target = input5;
        this.subscriptionType = input6;
        this.periodicFrequency = input7;
        this.periodicFrequencyUnit = input8;
        this.startDateTime = input9;
        this.endDateTime = input10;
        this.status = input11;
        this.ownerId = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
        this.createdBy = input15;
        this.updatedBy = input16;
        this.and = input17;
        this.or = input18;
        this.not = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput action() {
        return this.action.value;
    }

    public List<ModelEntityActionDefinitionConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdBy() {
        return this.createdBy.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput endDateTime() {
        return this.endDateTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityActionDefinitionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityActionDefinitionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEntityActionDefinitionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelEntityActionDefinitionConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelEntityActionDefinitionConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.action.defined) {
                    inputFieldWriter.writeObject("action", ModelEntityActionDefinitionConditionInput.this.action.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.action.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.target.defined) {
                    inputFieldWriter.writeObject("target", ModelEntityActionDefinitionConditionInput.this.target.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.target.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.subscriptionType.defined) {
                    inputFieldWriter.writeObject("subscriptionType", ModelEntityActionDefinitionConditionInput.this.subscriptionType.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.subscriptionType.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.periodicFrequency.defined) {
                    inputFieldWriter.writeObject("periodicFrequency", ModelEntityActionDefinitionConditionInput.this.periodicFrequency.value != 0 ? ((ModelIntInput) ModelEntityActionDefinitionConditionInput.this.periodicFrequency.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.periodicFrequencyUnit.defined) {
                    inputFieldWriter.writeObject("periodicFrequencyUnit", ModelEntityActionDefinitionConditionInput.this.periodicFrequencyUnit.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.periodicFrequencyUnit.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.startDateTime.defined) {
                    inputFieldWriter.writeObject("startDateTime", ModelEntityActionDefinitionConditionInput.this.startDateTime.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.startDateTime.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.endDateTime.defined) {
                    inputFieldWriter.writeObject("endDateTime", ModelEntityActionDefinitionConditionInput.this.endDateTime.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.endDateTime.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelEntityActionDefinitionConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelEntityActionDefinitionConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEntityActionDefinitionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEntityActionDefinitionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelEntityActionDefinitionConditionInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionConditionInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelEntityActionDefinitionConditionInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionConditionInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEntityActionDefinitionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityActionDefinitionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityActionDefinitionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityActionDefinitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEntityActionDefinitionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityActionDefinitionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityActionDefinitionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityActionDefinitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityActionDefinitionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEntityActionDefinitionConditionInput.this.not.value != 0 ? ((ModelEntityActionDefinitionConditionInput) ModelEntityActionDefinitionConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelEntityActionDefinitionConditionInput not() {
        return this.not.value;
    }

    public List<ModelEntityActionDefinitionConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIntInput periodicFrequency() {
        return this.periodicFrequency.value;
    }

    public ModelStringInput periodicFrequencyUnit() {
        return this.periodicFrequencyUnit.value;
    }

    public ModelStringInput startDateTime() {
        return this.startDateTime.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput subscriptionType() {
        return this.subscriptionType.value;
    }

    public ModelStringInput target() {
        return this.target.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedBy() {
        return this.updatedBy.value;
    }
}
