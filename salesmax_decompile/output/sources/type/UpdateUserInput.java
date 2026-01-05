package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateUserInput implements InputType {
    private final Input<AddedSourceType> addedSourceType;
    private final Input<String> androidVersionRelease;
    private final Input<String> appVersion;
    private final Input<String> createdAt;
    private final Input<String> deviceManufacturer;
    private final Input<String> deviceModel;
    private final String id;
    private final Input<String> lastSelectedAccountApp;
    private final Input<String> lastSelectedAccountWeb;
    private final Input<String> name;
    private final Input<String> profilePictureUrl;
    private final Input<String> registeredEmail;
    private final Input<Boolean> registeredEmailVerified;
    private final Input<String> registeredNumber;
    private final Input<Boolean> registeredNumberVerified;
    private final Input<String> secondaryNumber;
    private final Input<Boolean> secondaryNumberVerified;
    private final Input<String> updatedAt;
    private final Input<UserRegistrationStatus> userRegistrationStatus;
    private final Input<List<WebPreferencesInput>> webPreferences;

    public static final class Builder {
        private String id;
        private Input<AddedSourceType> addedSourceType = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> profilePictureUrl = Input.absent();
        private Input<String> registeredEmail = Input.absent();
        private Input<Boolean> registeredEmailVerified = Input.absent();
        private Input<String> registeredNumber = Input.absent();
        private Input<Boolean> registeredNumberVerified = Input.absent();
        private Input<String> secondaryNumber = Input.absent();
        private Input<Boolean> secondaryNumberVerified = Input.absent();
        private Input<UserRegistrationStatus> userRegistrationStatus = Input.absent();
        private Input<String> lastSelectedAccountWeb = Input.absent();
        private Input<String> lastSelectedAccountApp = Input.absent();
        private Input<String> appVersion = Input.absent();
        private Input<String> deviceModel = Input.absent();
        private Input<String> deviceManufacturer = Input.absent();
        private Input<String> androidVersionRelease = Input.absent();
        private Input<List<WebPreferencesInput>> webPreferences = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder addedSourceType(AddedSourceType addedSourceType) {
            this.addedSourceType = Input.fromNullable(addedSourceType);
            return this;
        }

        public Builder androidVersionRelease(String str) {
            this.androidVersionRelease = Input.fromNullable(str);
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = Input.fromNullable(str);
            return this;
        }

        public UpdateUserInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateUserInput(this.id, this.addedSourceType, this.name, this.profilePictureUrl, this.registeredEmail, this.registeredEmailVerified, this.registeredNumber, this.registeredNumberVerified, this.secondaryNumber, this.secondaryNumberVerified, this.userRegistrationStatus, this.lastSelectedAccountWeb, this.lastSelectedAccountApp, this.appVersion, this.deviceModel, this.deviceManufacturer, this.androidVersionRelease, this.webPreferences, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder deviceManufacturer(String str) {
            this.deviceManufacturer = Input.fromNullable(str);
            return this;
        }

        public Builder deviceModel(String str) {
            this.deviceModel = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder lastSelectedAccountApp(String str) {
            this.lastSelectedAccountApp = Input.fromNullable(str);
            return this;
        }

        public Builder lastSelectedAccountWeb(String str) {
            this.lastSelectedAccountWeb = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder profilePictureUrl(String str) {
            this.profilePictureUrl = Input.fromNullable(str);
            return this;
        }

        public Builder registeredEmail(String str) {
            this.registeredEmail = Input.fromNullable(str);
            return this;
        }

        public Builder registeredEmailVerified(Boolean bool) {
            this.registeredEmailVerified = Input.fromNullable(bool);
            return this;
        }

        public Builder registeredNumber(String str) {
            this.registeredNumber = Input.fromNullable(str);
            return this;
        }

        public Builder registeredNumberVerified(Boolean bool) {
            this.registeredNumberVerified = Input.fromNullable(bool);
            return this;
        }

        public Builder secondaryNumber(String str) {
            this.secondaryNumber = Input.fromNullable(str);
            return this;
        }

        public Builder secondaryNumberVerified(Boolean bool) {
            this.secondaryNumberVerified = Input.fromNullable(bool);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userRegistrationStatus(UserRegistrationStatus userRegistrationStatus) {
            this.userRegistrationStatus = Input.fromNullable(userRegistrationStatus);
            return this;
        }

        public Builder webPreferences(List<WebPreferencesInput> list) {
            this.webPreferences = Input.fromNullable(list);
            return this;
        }
    }

    public UpdateUserInput(String str, Input<AddedSourceType> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<Boolean> input5, Input<String> input6, Input<Boolean> input7, Input<String> input8, Input<Boolean> input9, Input<UserRegistrationStatus> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<List<WebPreferencesInput>> input17, Input<String> input18, Input<String> input19) {
        this.id = str;
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
        this.lastSelectedAccountWeb = input11;
        this.lastSelectedAccountApp = input12;
        this.appVersion = input13;
        this.deviceModel = input14;
        this.deviceManufacturer = input15;
        this.androidVersionRelease = input16;
        this.webPreferences = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AddedSourceType addedSourceType() {
        return this.addedSourceType.value;
    }

    public String androidVersionRelease() {
        return this.androidVersionRelease.value;
    }

    public String appVersion() {
        return this.appVersion.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String deviceManufacturer() {
        return this.deviceManufacturer.value;
    }

    public String deviceModel() {
        return this.deviceModel.value;
    }

    public String id() {
        return this.id;
    }

    public String lastSelectedAccountApp() {
        return this.lastSelectedAccountApp.value;
    }

    public String lastSelectedAccountWeb() {
        return this.lastSelectedAccountWeb.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateUserInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateUserInput.this.id);
                if (UpdateUserInput.this.addedSourceType.defined) {
                    inputFieldWriter.writeString("addedSourceType", UpdateUserInput.this.addedSourceType.value != 0 ? ((AddedSourceType) UpdateUserInput.this.addedSourceType.value).name() : null);
                }
                if (UpdateUserInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateUserInput.this.name.value);
                }
                if (UpdateUserInput.this.profilePictureUrl.defined) {
                    inputFieldWriter.writeString("profilePictureUrl", (String) UpdateUserInput.this.profilePictureUrl.value);
                }
                if (UpdateUserInput.this.registeredEmail.defined) {
                    inputFieldWriter.writeString("registeredEmail", (String) UpdateUserInput.this.registeredEmail.value);
                }
                if (UpdateUserInput.this.registeredEmailVerified.defined) {
                    inputFieldWriter.writeBoolean("registeredEmailVerified", (Boolean) UpdateUserInput.this.registeredEmailVerified.value);
                }
                if (UpdateUserInput.this.registeredNumber.defined) {
                    inputFieldWriter.writeString("registeredNumber", (String) UpdateUserInput.this.registeredNumber.value);
                }
                if (UpdateUserInput.this.registeredNumberVerified.defined) {
                    inputFieldWriter.writeBoolean("registeredNumberVerified", (Boolean) UpdateUserInput.this.registeredNumberVerified.value);
                }
                if (UpdateUserInput.this.secondaryNumber.defined) {
                    inputFieldWriter.writeString("secondaryNumber", (String) UpdateUserInput.this.secondaryNumber.value);
                }
                if (UpdateUserInput.this.secondaryNumberVerified.defined) {
                    inputFieldWriter.writeBoolean("secondaryNumberVerified", (Boolean) UpdateUserInput.this.secondaryNumberVerified.value);
                }
                if (UpdateUserInput.this.userRegistrationStatus.defined) {
                    inputFieldWriter.writeString("userRegistrationStatus", UpdateUserInput.this.userRegistrationStatus.value != 0 ? ((UserRegistrationStatus) UpdateUserInput.this.userRegistrationStatus.value).name() : null);
                }
                if (UpdateUserInput.this.lastSelectedAccountWeb.defined) {
                    inputFieldWriter.writeString("lastSelectedAccountWeb", (String) UpdateUserInput.this.lastSelectedAccountWeb.value);
                }
                if (UpdateUserInput.this.lastSelectedAccountApp.defined) {
                    inputFieldWriter.writeString("lastSelectedAccountApp", (String) UpdateUserInput.this.lastSelectedAccountApp.value);
                }
                if (UpdateUserInput.this.appVersion.defined) {
                    inputFieldWriter.writeString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, (String) UpdateUserInput.this.appVersion.value);
                }
                if (UpdateUserInput.this.deviceModel.defined) {
                    inputFieldWriter.writeString("deviceModel", (String) UpdateUserInput.this.deviceModel.value);
                }
                if (UpdateUserInput.this.deviceManufacturer.defined) {
                    inputFieldWriter.writeString("deviceManufacturer", (String) UpdateUserInput.this.deviceManufacturer.value);
                }
                if (UpdateUserInput.this.androidVersionRelease.defined) {
                    inputFieldWriter.writeString("androidVersionRelease", (String) UpdateUserInput.this.androidVersionRelease.value);
                }
                if (UpdateUserInput.this.webPreferences.defined) {
                    inputFieldWriter.writeList("webPreferences", UpdateUserInput.this.webPreferences.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateUserInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateUserInput.this.webPreferences.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WebPreferencesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateUserInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateUserInput.this.createdAt.value);
                }
                if (UpdateUserInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateUserInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String profilePictureUrl() {
        return this.profilePictureUrl.value;
    }

    public String registeredEmail() {
        return this.registeredEmail.value;
    }

    public Boolean registeredEmailVerified() {
        return this.registeredEmailVerified.value;
    }

    public String registeredNumber() {
        return this.registeredNumber.value;
    }

    public Boolean registeredNumberVerified() {
        return this.registeredNumberVerified.value;
    }

    public String secondaryNumber() {
        return this.secondaryNumber.value;
    }

    public Boolean secondaryNumberVerified() {
        return this.secondaryNumberVerified.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public UserRegistrationStatus userRegistrationStatus() {
        return this.userRegistrationStatus.value;
    }

    public List<WebPreferencesInput> webPreferences() {
        return this.webPreferences.value;
    }
}
