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
public final class ModelTeamFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelTeamFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> description;
    private final Input<ModelIDInput> id;
    private final Input<ModelTeamFilterInput> not;
    private final Input<List<ModelTeamFilterInput>> or;
    private final Input<ModelStringInput> teamName;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> teamName = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelTeamFilterInput>> and = Input.absent();
        private Input<List<ModelTeamFilterInput>> or = Input.absent();
        private Input<ModelTeamFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelTeamFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelTeamFilterInput build() {
            return new ModelTeamFilterInput(this.id, this.accountId, this.createdById, this.description, this.teamName, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelTeamFilterInput modelTeamFilterInput) {
            this.not = Input.fromNullable(modelTeamFilterInput);
            return this;
        }

        public Builder or(List<ModelTeamFilterInput> list) {
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

    public ModelTeamFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelTeamFilterInput>> input9, Input<List<ModelTeamFilterInput>> input10, Input<ModelTeamFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.createdById = input3;
        this.description = input4;
        this.teamName = input5;
        this.updatedById = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelTeamFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTeamFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTeamFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelTeamFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelTeamFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelTeamFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelTeamFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelTeamFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelTeamFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelTeamFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelTeamFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.teamName.defined) {
                    inputFieldWriter.writeObject("teamName", ModelTeamFilterInput.this.teamName.value != 0 ? ((ModelStringInput) ModelTeamFilterInput.this.teamName.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelTeamFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelTeamFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelTeamFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelTeamFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelTeamFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelTeamFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelTeamFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelTeamFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelTeamFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelTeamFilterInput.this.not.value != 0 ? ((ModelTeamFilterInput) ModelTeamFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelTeamFilterInput not() {
        return this.not.value;
    }

    public List<ModelTeamFilterInput> or() {
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
