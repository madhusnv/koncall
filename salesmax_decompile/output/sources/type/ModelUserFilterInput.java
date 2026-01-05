package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelUserFilterInput implements InputType {
    private final Input<ModelAddedSourceTypeInput> addedSourceType;
    private final Input<List<ModelUserFilterInput>> and;
    private final Input<ModelStringInput> androidVersionRelease;
    private final Input<ModelStringInput> appVersion;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> deviceManufacturer;
    private final Input<ModelStringInput> deviceModel;
    private final Input<ModelIDInput> id;
    private final Input<ModelIDInput> lastSelectedAccountApp;
    private final Input<ModelIDInput> lastSelectedAccountWeb;
    private final Input<ModelStringInput> name;
    private final Input<ModelUserFilterInput> not;
    private final Input<List<ModelUserFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<ModelIDInput> lastSelectedAccountWeb = Input.absent();
        private Input<ModelIDInput> lastSelectedAccountApp = Input.absent();
        private Input<ModelStringInput> appVersion = Input.absent();
        private Input<ModelStringInput> deviceModel = Input.absent();
        private Input<ModelStringInput> deviceManufacturer = Input.absent();
        private Input<ModelStringInput> androidVersionRelease = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelUserFilterInput>> and = Input.absent();
        private Input<List<ModelUserFilterInput>> or = Input.absent();
        private Input<ModelUserFilterInput> not = Input.absent();

        public Builder addedSourceType(ModelAddedSourceTypeInput modelAddedSourceTypeInput) {
            this.addedSourceType = Input.fromNullable(modelAddedSourceTypeInput);
            return this;
        }

        public Builder and(List<ModelUserFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder androidVersionRelease(ModelStringInput modelStringInput) {
            this.androidVersionRelease = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder appVersion(ModelStringInput modelStringInput) {
            this.appVersion = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelUserFilterInput build() {
            return new ModelUserFilterInput(this.id, this.addedSourceType, this.name, this.profilePictureUrl, this.registeredEmail, this.registeredEmailVerified, this.registeredNumber, this.registeredNumberVerified, this.secondaryNumber, this.secondaryNumberVerified, this.userRegistrationStatus, this.lastSelectedAccountWeb, this.lastSelectedAccountApp, this.appVersion, this.deviceModel, this.deviceManufacturer, this.androidVersionRelease, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deviceManufacturer(ModelStringInput modelStringInput) {
            this.deviceManufacturer = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deviceModel(ModelStringInput modelStringInput) {
            this.deviceModel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastSelectedAccountApp(ModelIDInput modelIDInput) {
            this.lastSelectedAccountApp = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastSelectedAccountWeb(ModelIDInput modelIDInput) {
            this.lastSelectedAccountWeb = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelUserFilterInput modelUserFilterInput) {
            this.not = Input.fromNullable(modelUserFilterInput);
            return this;
        }

        public Builder or(List<ModelUserFilterInput> list) {
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

    public ModelUserFilterInput(Input<ModelIDInput> input, Input<ModelAddedSourceTypeInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelStringInput> input7, Input<ModelBooleanInput> input8, Input<ModelStringInput> input9, Input<ModelBooleanInput> input10, Input<ModelUserRegistrationStatusInput> input11, Input<ModelIDInput> input12, Input<ModelIDInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<List<ModelUserFilterInput>> input20, Input<List<ModelUserFilterInput>> input21, Input<ModelUserFilterInput> input22) {
        this.id = input;
        this.addedSourceType = input2;
        this.name = input3;
        this.profilePictureUrl = input4;
        this.registeredEmail = input5;
        this.registeredEmailVerified = input6;
        this.registeredNumber = input7;
        this.registeredNumberVerified = input8;
        this.secondaryNumber = input9;
        this.secondaryNumberVerified = input10;
        this.userRegistrationStatus = input11;
        this.lastSelectedAccountWeb = input12;
        this.lastSelectedAccountApp = input13;
        this.appVersion = input14;
        this.deviceModel = input15;
        this.deviceManufacturer = input16;
        this.androidVersionRelease = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelAddedSourceTypeInput addedSourceType() {
        return this.addedSourceType.value;
    }

    public List<ModelUserFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput androidVersionRelease() {
        return this.androidVersionRelease.value;
    }

    public ModelStringInput appVersion() {
        return this.appVersion.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput deviceManufacturer() {
        return this.deviceManufacturer.value;
    }

    public ModelStringInput deviceModel() {
        return this.deviceModel.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelIDInput lastSelectedAccountApp() {
        return this.lastSelectedAccountApp.value;
    }

    public ModelIDInput lastSelectedAccountWeb() {
        return this.lastSelectedAccountWeb.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUserFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUserFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelUserFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelUserFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.addedSourceType.defined) {
                    inputFieldWriter.writeObject("addedSourceType", ModelUserFilterInput.this.addedSourceType.value != 0 ? ((ModelAddedSourceTypeInput) ModelUserFilterInput.this.addedSourceType.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelUserFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.profilePictureUrl.defined) {
                    inputFieldWriter.writeObject("profilePictureUrl", ModelUserFilterInput.this.profilePictureUrl.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.profilePictureUrl.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.registeredEmail.defined) {
                    inputFieldWriter.writeObject("registeredEmail", ModelUserFilterInput.this.registeredEmail.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.registeredEmail.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.registeredEmailVerified.defined) {
                    inputFieldWriter.writeObject("registeredEmailVerified", ModelUserFilterInput.this.registeredEmailVerified.value != 0 ? ((ModelBooleanInput) ModelUserFilterInput.this.registeredEmailVerified.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.registeredNumber.defined) {
                    inputFieldWriter.writeObject("registeredNumber", ModelUserFilterInput.this.registeredNumber.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.registeredNumber.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.registeredNumberVerified.defined) {
                    inputFieldWriter.writeObject("registeredNumberVerified", ModelUserFilterInput.this.registeredNumberVerified.value != 0 ? ((ModelBooleanInput) ModelUserFilterInput.this.registeredNumberVerified.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.secondaryNumber.defined) {
                    inputFieldWriter.writeObject("secondaryNumber", ModelUserFilterInput.this.secondaryNumber.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.secondaryNumber.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.secondaryNumberVerified.defined) {
                    inputFieldWriter.writeObject("secondaryNumberVerified", ModelUserFilterInput.this.secondaryNumberVerified.value != 0 ? ((ModelBooleanInput) ModelUserFilterInput.this.secondaryNumberVerified.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.userRegistrationStatus.defined) {
                    inputFieldWriter.writeObject("userRegistrationStatus", ModelUserFilterInput.this.userRegistrationStatus.value != 0 ? ((ModelUserRegistrationStatusInput) ModelUserFilterInput.this.userRegistrationStatus.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.lastSelectedAccountWeb.defined) {
                    inputFieldWriter.writeObject("lastSelectedAccountWeb", ModelUserFilterInput.this.lastSelectedAccountWeb.value != 0 ? ((ModelIDInput) ModelUserFilterInput.this.lastSelectedAccountWeb.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.lastSelectedAccountApp.defined) {
                    inputFieldWriter.writeObject("lastSelectedAccountApp", ModelUserFilterInput.this.lastSelectedAccountApp.value != 0 ? ((ModelIDInput) ModelUserFilterInput.this.lastSelectedAccountApp.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.appVersion.defined) {
                    inputFieldWriter.writeObject(RemoteConfigConstants.RequestFieldKey.APP_VERSION, ModelUserFilterInput.this.appVersion.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.appVersion.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.deviceModel.defined) {
                    inputFieldWriter.writeObject("deviceModel", ModelUserFilterInput.this.deviceModel.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.deviceModel.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.deviceManufacturer.defined) {
                    inputFieldWriter.writeObject("deviceManufacturer", ModelUserFilterInput.this.deviceManufacturer.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.deviceManufacturer.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.androidVersionRelease.defined) {
                    inputFieldWriter.writeObject("androidVersionRelease", ModelUserFilterInput.this.androidVersionRelease.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.androidVersionRelease.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelUserFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelUserFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelUserFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelUserFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelUserFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUserFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUserFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUserFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUserFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelUserFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUserFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUserFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUserFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUserFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelUserFilterInput.this.not.value != 0 ? ((ModelUserFilterInput) ModelUserFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelUserFilterInput not() {
        return this.not.value;
    }

    public List<ModelUserFilterInput> or() {
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
