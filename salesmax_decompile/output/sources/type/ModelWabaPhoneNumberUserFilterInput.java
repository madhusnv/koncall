package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaPhoneNumberUserFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaPhoneNumberUserFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isDefault;
    private final Input<ModelWabaPhoneNumberUserFilterInput> not;
    private final Input<List<ModelWabaPhoneNumberUserFilterInput>> or;
    private final Input<ModelIDInput> teamId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;
    private final Input<ModelIDInput> wabaPhoneNumberId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> wabaPhoneNumberId = Input.absent();
        private Input<ModelBooleanInput> isDefault = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> teamId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelWabaPhoneNumberUserFilterInput>> and = Input.absent();
        private Input<List<ModelWabaPhoneNumberUserFilterInput>> or = Input.absent();
        private Input<ModelWabaPhoneNumberUserFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaPhoneNumberUserFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaPhoneNumberUserFilterInput build() {
            return new ModelWabaPhoneNumberUserFilterInput(this.id, this.accountId, this.wabaPhoneNumberId, this.isDefault, this.userId, this.teamId, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isDefault(ModelBooleanInput modelBooleanInput) {
            this.isDefault = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelWabaPhoneNumberUserFilterInput modelWabaPhoneNumberUserFilterInput) {
            this.not = Input.fromNullable(modelWabaPhoneNumberUserFilterInput);
            return this;
        }

        public Builder or(List<ModelWabaPhoneNumberUserFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder teamId(ModelIDInput modelIDInput) {
            this.teamId = Input.fromNullable(modelIDInput);
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

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder wabaPhoneNumberId(ModelIDInput modelIDInput) {
            this.wabaPhoneNumberId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelWabaPhoneNumberUserFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelBooleanInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<List<ModelWabaPhoneNumberUserFilterInput>> input11, Input<List<ModelWabaPhoneNumberUserFilterInput>> input12, Input<ModelWabaPhoneNumberUserFilterInput> input13) {
        this.id = input;
        this.accountId = input2;
        this.wabaPhoneNumberId = input3;
        this.isDefault = input4;
        this.userId = input5;
        this.teamId = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.createdById = input9;
        this.updatedById = input10;
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

    public List<ModelWabaPhoneNumberUserFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaPhoneNumberUserFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaPhoneNumberUserFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelWabaPhoneNumberUserFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaPhoneNumberUserFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.wabaPhoneNumberId.defined) {
                    inputFieldWriter.writeObject("wabaPhoneNumberId", ModelWabaPhoneNumberUserFilterInput.this.wabaPhoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.wabaPhoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.isDefault.defined) {
                    inputFieldWriter.writeObject("isDefault", ModelWabaPhoneNumberUserFilterInput.this.isDefault.value != 0 ? ((ModelBooleanInput) ModelWabaPhoneNumberUserFilterInput.this.isDefault.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelWabaPhoneNumberUserFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.teamId.defined) {
                    inputFieldWriter.writeObject("teamId", ModelWabaPhoneNumberUserFilterInput.this.teamId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.teamId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaPhoneNumberUserFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberUserFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaPhoneNumberUserFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberUserFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaPhoneNumberUserFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaPhoneNumberUserFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaPhoneNumberUserFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberUserFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberUserFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberUserFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaPhoneNumberUserFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberUserFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberUserFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberUserFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberUserFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaPhoneNumberUserFilterInput.this.not.value != 0 ? ((ModelWabaPhoneNumberUserFilterInput) ModelWabaPhoneNumberUserFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelWabaPhoneNumberUserFilterInput not() {
        return this.not.value;
    }

    public List<ModelWabaPhoneNumberUserFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput teamId() {
        return this.teamId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }

    public ModelIDInput wabaPhoneNumberId() {
        return this.wabaPhoneNumberId.value;
    }
}
