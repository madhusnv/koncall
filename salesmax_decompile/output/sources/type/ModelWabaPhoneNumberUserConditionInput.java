package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaPhoneNumberUserConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaPhoneNumberUserConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelBooleanInput> isDefault;
    private final Input<ModelWabaPhoneNumberUserConditionInput> not;
    private final Input<List<ModelWabaPhoneNumberUserConditionInput>> or;
    private final Input<ModelIDInput> teamId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;
    private final Input<ModelIDInput> wabaPhoneNumberId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> wabaPhoneNumberId = Input.absent();
        private Input<ModelBooleanInput> isDefault = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> teamId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelWabaPhoneNumberUserConditionInput>> and = Input.absent();
        private Input<List<ModelWabaPhoneNumberUserConditionInput>> or = Input.absent();
        private Input<ModelWabaPhoneNumberUserConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaPhoneNumberUserConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaPhoneNumberUserConditionInput build() {
            return new ModelWabaPhoneNumberUserConditionInput(this.accountId, this.wabaPhoneNumberId, this.isDefault, this.userId, this.teamId, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isDefault(ModelBooleanInput modelBooleanInput) {
            this.isDefault = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelWabaPhoneNumberUserConditionInput modelWabaPhoneNumberUserConditionInput) {
            this.not = Input.fromNullable(modelWabaPhoneNumberUserConditionInput);
            return this;
        }

        public Builder or(List<ModelWabaPhoneNumberUserConditionInput> list) {
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

    public ModelWabaPhoneNumberUserConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelBooleanInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<List<ModelWabaPhoneNumberUserConditionInput>> input10, Input<List<ModelWabaPhoneNumberUserConditionInput>> input11, Input<ModelWabaPhoneNumberUserConditionInput> input12) {
        this.accountId = input;
        this.wabaPhoneNumberId = input2;
        this.isDefault = input3;
        this.userId = input4;
        this.teamId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
        this.createdById = input8;
        this.updatedById = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWabaPhoneNumberUserConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelBooleanInput isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaPhoneNumberUserConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaPhoneNumberUserConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaPhoneNumberUserConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.wabaPhoneNumberId.defined) {
                    inputFieldWriter.writeObject("wabaPhoneNumberId", ModelWabaPhoneNumberUserConditionInput.this.wabaPhoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserConditionInput.this.wabaPhoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.isDefault.defined) {
                    inputFieldWriter.writeObject("isDefault", ModelWabaPhoneNumberUserConditionInput.this.isDefault.value != 0 ? ((ModelBooleanInput) ModelWabaPhoneNumberUserConditionInput.this.isDefault.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelWabaPhoneNumberUserConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.teamId.defined) {
                    inputFieldWriter.writeObject("teamId", ModelWabaPhoneNumberUserConditionInput.this.teamId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserConditionInput.this.teamId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaPhoneNumberUserConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberUserConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaPhoneNumberUserConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberUserConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaPhoneNumberUserConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaPhoneNumberUserConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberUserConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaPhoneNumberUserConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberUserConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberUserConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberUserConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaPhoneNumberUserConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberUserConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberUserConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberUserConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberUserConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaPhoneNumberUserConditionInput.this.not.value != 0 ? ((ModelWabaPhoneNumberUserConditionInput) ModelWabaPhoneNumberUserConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelWabaPhoneNumberUserConditionInput not() {
        return this.not.value;
    }

    public List<ModelWabaPhoneNumberUserConditionInput> or() {
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
