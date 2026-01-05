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
public final class ModelEntityActionDefinitionFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> action;
    private final Input<List<ModelEntityActionDefinitionFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> endDateTime;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> name;
    private final Input<ModelEntityActionDefinitionFilterInput> not;
    private final Input<List<ModelEntityActionDefinitionFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelEntityActionDefinitionFilterInput>> and = Input.absent();
        private Input<List<ModelEntityActionDefinitionFilterInput>> or = Input.absent();
        private Input<ModelEntityActionDefinitionFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder action(ModelStringInput modelStringInput) {
            this.action = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelEntityActionDefinitionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelEntityActionDefinitionFilterInput build() {
            return new ModelEntityActionDefinitionFilterInput(this.id, this.accountId, this.name, this.description, this.action, this.target, this.subscriptionType, this.periodicFrequency, this.periodicFrequencyUnit, this.startDateTime, this.endDateTime, this.status, this.ownerId, this.createdAt, this.updatedAt, this.createdBy, this.updatedBy, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelEntityActionDefinitionFilterInput modelEntityActionDefinitionFilterInput) {
            this.not = Input.fromNullable(modelEntityActionDefinitionFilterInput);
            return this;
        }

        public Builder or(List<ModelEntityActionDefinitionFilterInput> list) {
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

    public ModelEntityActionDefinitionFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIntInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelIDInput> input16, Input<ModelIDInput> input17, Input<List<ModelEntityActionDefinitionFilterInput>> input18, Input<List<ModelEntityActionDefinitionFilterInput>> input19, Input<ModelEntityActionDefinitionFilterInput> input20) {
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

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput action() {
        return this.action.value;
    }

    public List<ModelEntityActionDefinitionFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityActionDefinitionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityActionDefinitionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelEntityActionDefinitionFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEntityActionDefinitionFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelEntityActionDefinitionFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelEntityActionDefinitionFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.action.defined) {
                    inputFieldWriter.writeObject("action", ModelEntityActionDefinitionFilterInput.this.action.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.action.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.target.defined) {
                    inputFieldWriter.writeObject("target", ModelEntityActionDefinitionFilterInput.this.target.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.target.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.subscriptionType.defined) {
                    inputFieldWriter.writeObject("subscriptionType", ModelEntityActionDefinitionFilterInput.this.subscriptionType.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.subscriptionType.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.periodicFrequency.defined) {
                    inputFieldWriter.writeObject("periodicFrequency", ModelEntityActionDefinitionFilterInput.this.periodicFrequency.value != 0 ? ((ModelIntInput) ModelEntityActionDefinitionFilterInput.this.periodicFrequency.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.periodicFrequencyUnit.defined) {
                    inputFieldWriter.writeObject("periodicFrequencyUnit", ModelEntityActionDefinitionFilterInput.this.periodicFrequencyUnit.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.periodicFrequencyUnit.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.startDateTime.defined) {
                    inputFieldWriter.writeObject("startDateTime", ModelEntityActionDefinitionFilterInput.this.startDateTime.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.startDateTime.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.endDateTime.defined) {
                    inputFieldWriter.writeObject("endDateTime", ModelEntityActionDefinitionFilterInput.this.endDateTime.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.endDateTime.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelEntityActionDefinitionFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelEntityActionDefinitionFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEntityActionDefinitionFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEntityActionDefinitionFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEntityActionDefinitionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelEntityActionDefinitionFilterInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelEntityActionDefinitionFilterInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelEntityActionDefinitionFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEntityActionDefinitionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityActionDefinitionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityActionDefinitionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityActionDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEntityActionDefinitionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityActionDefinitionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityActionDefinitionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityActionDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityActionDefinitionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEntityActionDefinitionFilterInput.this.not.value != 0 ? ((ModelEntityActionDefinitionFilterInput) ModelEntityActionDefinitionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelEntityActionDefinitionFilterInput not() {
        return this.not.value;
    }

    public List<ModelEntityActionDefinitionFilterInput> or() {
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
