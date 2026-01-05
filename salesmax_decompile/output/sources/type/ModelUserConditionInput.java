package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelUserConditionInput implements InputType {
    private final Input<ModelAddedSourceTypeInput> addedSourceType;
    private final Input<List<ModelUserConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> name;
    private final Input<ModelUserConditionInput> not;
    private final Input<List<ModelUserConditionInput>> or;
    private final Input<ModelStringInput> profilePictureUrl;
    private final Input<ModelStringInput> registeredEmail;
    private final Input<ModelBooleanInput> registeredEmailVerified;
    private final Input<ModelStringInput> registeredNumber;
    private final Input<ModelBooleanInput> registeredNumberVerified;
    private final Input<ModelStringInput> secondaryNumber;
    private final Input<ModelBooleanInput> secondaryNumberVerified;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelUserRegistrationStatusInput> userRegistrationStatus;

    public static final class Builder {
        private Input<ModelAddedSourceTypeInput> addedSourceType = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> profilePictureUrl = Input.absent();
        private Input<ModelStringInput> registeredEmail = Input.absent();
        private Input<ModelBooleanInput> registeredEmailVerified = Input.absent();
        private Input<ModelStringInput> registeredNumber = Input.absent();
        private Input<ModelBooleanInput> registeredNumberVerified = Input.absent();
        private Input<ModelStringInput> secondaryNumber = Input.absent();
        private Input<ModelBooleanInput> secondaryNumberVerified = Input.absent();
        private Input<ModelUserRegistrationStatusInput> userRegistrationStatus = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelUserConditionInput>> and = Input.absent();
        private Input<List<ModelUserConditionInput>> or = Input.absent();
        private Input<ModelUserConditionInput> not = Input.absent();

        public Builder addedSourceType(ModelAddedSourceTypeInput modelAddedSourceTypeInput) {
            this.addedSourceType = Input.fromNullable(modelAddedSourceTypeInput);
            return this;
        }

        public Builder and(List<ModelUserConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelUserConditionInput build() {
            return new ModelUserConditionInput(this.addedSourceType, this.name, this.profilePictureUrl, this.registeredEmail, this.registeredEmailVerified, this.registeredNumber, this.registeredNumberVerified, this.secondaryNumber, this.secondaryNumberVerified, this.userRegistrationStatus, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelUserConditionInput modelUserConditionInput) {
            this.not = Input.fromNullable(modelUserConditionInput);
            return this;
        }

        public Builder or(List<ModelUserConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder profilePictureUrl(ModelStringInput modelStringInput) {
            this.profilePictureUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder registeredEmail(ModelStringInput modelStringInput) {
            this.registeredEmail = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder registeredEmailVerified(ModelBooleanInput modelBooleanInput) {
            this.registeredEmailVerified = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder registeredNumber(ModelStringInput modelStringInput) {
            this.registeredNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder registeredNumberVerified(ModelBooleanInput modelBooleanInput) {
            this.registeredNumberVerified = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder secondaryNumber(ModelStringInput modelStringInput) {
            this.secondaryNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder secondaryNumberVerified(ModelBooleanInput modelBooleanInput) {
            this.secondaryNumberVerified = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userRegistrationStatus(ModelUserRegistrationStatusInput modelUserRegistrationStatusInput) {
            this.userRegistrationStatus = Input.fromNullable(modelUserRegistrationStatusInput);
            return this;
        }
    }

    public ModelUserConditionInput(Input<ModelAddedSourceTypeInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelBooleanInput> input5, Input<ModelStringInput> input6, Input<ModelBooleanInput> input7, Input<ModelStringInput> input8, Input<ModelBooleanInput> input9, Input<ModelUserRegistrationStatusInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<List<ModelUserConditionInput>> input13, Input<List<ModelUserConditionInput>> input14, Input<ModelUserConditionInput> input15) {
        this.addedSourceType = input;
        this.name = input2;
        this.profilePictureUrl = input3;
        this.registeredEmail = input4;
        this.registeredEmailVerified = input5;
        this.registeredNumber = input6;
        this.registeredNumberVerified = input7;
        this.secondaryNumber = input8;
        this.secondaryNumberVerified = input9;
        this.userRegistrationStatus = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.and = input13;
        this.or = input14;
        this.not = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelAddedSourceTypeInput addedSourceType() {
        return this.addedSourceType.value;
    }

    public List<ModelUserConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUserConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUserConditionInput.this.addedSourceType.defined) {
                    inputFieldWriter.writeObject("addedSourceType", ModelUserConditionInput.this.addedSourceType.value != 0 ? ((ModelAddedSourceTypeInput) ModelUserConditionInput.this.addedSourceType.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelUserConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.profilePictureUrl.defined) {
                    inputFieldWriter.writeObject("profilePictureUrl", ModelUserConditionInput.this.profilePictureUrl.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.profilePictureUrl.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.registeredEmail.defined) {
                    inputFieldWriter.writeObject("registeredEmail", ModelUserConditionInput.this.registeredEmail.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.registeredEmail.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.registeredEmailVerified.defined) {
                    inputFieldWriter.writeObject("registeredEmailVerified", ModelUserConditionInput.this.registeredEmailVerified.value != 0 ? ((ModelBooleanInput) ModelUserConditionInput.this.registeredEmailVerified.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.registeredNumber.defined) {
                    inputFieldWriter.writeObject("registeredNumber", ModelUserConditionInput.this.registeredNumber.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.registeredNumber.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.registeredNumberVerified.defined) {
                    inputFieldWriter.writeObject("registeredNumberVerified", ModelUserConditionInput.this.registeredNumberVerified.value != 0 ? ((ModelBooleanInput) ModelUserConditionInput.this.registeredNumberVerified.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.secondaryNumber.defined) {
                    inputFieldWriter.writeObject("secondaryNumber", ModelUserConditionInput.this.secondaryNumber.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.secondaryNumber.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.secondaryNumberVerified.defined) {
                    inputFieldWriter.writeObject("secondaryNumberVerified", ModelUserConditionInput.this.secondaryNumberVerified.value != 0 ? ((ModelBooleanInput) ModelUserConditionInput.this.secondaryNumberVerified.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.userRegistrationStatus.defined) {
                    inputFieldWriter.writeObject("userRegistrationStatus", ModelUserConditionInput.this.userRegistrationStatus.value != 0 ? ((ModelUserRegistrationStatusInput) ModelUserConditionInput.this.userRegistrationStatus.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelUserConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelUserConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelUserConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelUserConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelUserConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUserConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUserConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUserConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUserConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelUserConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUserConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUserConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUserConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUserConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelUserConditionInput.this.not.value != 0 ? ((ModelUserConditionInput) ModelUserConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelUserConditionInput not() {
        return this.not.value;
    }

    public List<ModelUserConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput profilePictureUrl() {
        return this.profilePictureUrl.value;
    }

    public ModelStringInput registeredEmail() {
        return this.registeredEmail.value;
    }

    public ModelBooleanInput registeredEmailVerified() {
        return this.registeredEmailVerified.value;
    }

    public ModelStringInput registeredNumber() {
        return this.registeredNumber.value;
    }

    public ModelBooleanInput registeredNumberVerified() {
        return this.registeredNumberVerified.value;
    }

    public ModelStringInput secondaryNumber() {
        return this.secondaryNumber.value;
    }

    public ModelBooleanInput secondaryNumberVerified() {
        return this.secondaryNumberVerified.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelUserRegistrationStatusInput userRegistrationStatus() {
        return this.userRegistrationStatus.value;
    }
}
