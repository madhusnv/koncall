package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelTeamConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelTeamConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> description;
    private final Input<ModelTeamConditionInput> not;
    private final Input<List<ModelTeamConditionInput>> or;
    private final Input<ModelStringInput> teamName;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> teamName = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelTeamConditionInput>> and = Input.absent();
        private Input<List<ModelTeamConditionInput>> or = Input.absent();
        private Input<ModelTeamConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelTeamConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelTeamConditionInput build() {
            return new ModelTeamConditionInput(this.accountId, this.createdById, this.description, this.teamName, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelTeamConditionInput modelTeamConditionInput) {
            this.not = Input.fromNullable(modelTeamConditionInput);
            return this;
        }

        public Builder or(List<ModelTeamConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder teamName(ModelStringInput modelStringInput) {
            this.teamName = Input.fromNullable(modelStringInput);
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

    public ModelTeamConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelTeamConditionInput>> input8, Input<List<ModelTeamConditionInput>> input9, Input<ModelTeamConditionInput> input10) {
        this.accountId = input;
        this.createdById = input2;
        this.description = input3;
        this.teamName = input4;
        this.updatedById = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
        this.and = input8;
        this.or = input9;
        this.not = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelTeamConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTeamConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTeamConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelTeamConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelTeamConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelTeamConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelTeamConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelTeamConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelTeamConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.teamName.defined) {
                    inputFieldWriter.writeObject("teamName", ModelTeamConditionInput.this.teamName.value != 0 ? ((ModelStringInput) ModelTeamConditionInput.this.teamName.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelTeamConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelTeamConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelTeamConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelTeamConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelTeamConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelTeamConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelTeamConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelTeamConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelTeamConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelTeamConditionInput.this.not.value != 0 ? ((ModelTeamConditionInput) ModelTeamConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelTeamConditionInput not() {
        return this.not.value;
    }

    public List<ModelTeamConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput teamName() {
        return this.teamName.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
