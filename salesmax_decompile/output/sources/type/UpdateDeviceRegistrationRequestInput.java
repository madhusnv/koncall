package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateDeviceRegistrationRequestInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> approvedAt;
    private final Input<String> approvedBy;
    private final Input<String> createdAt;
    private final Input<String> deviceModel;
    private final String id;
    private final Input<String> ipAddress;
    private final Input<String> osVersion;
    private final Input<String> reason;
    private final Input<String> requestedAt;
    private final Input<String> requestedDeviceId;
    private final Input<DeviceRequestStatus> status;
    private final Input<String> updatedAt;
    private final Input<String> userId;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> requestedDeviceId = Input.absent();
        private Input<String> deviceModel = Input.absent();
        private Input<String> osVersion = Input.absent();
        private Input<String> ipAddress = Input.absent();
        private Input<String> reason = Input.absent();
        private Input<DeviceRequestStatus> status = Input.absent();
        private Input<String> requestedAt = Input.absent();
        private Input<String> approvedBy = Input.absent();
        private Input<String> approvedAt = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder approvedAt(String str) {
            this.approvedAt = Input.fromNullable(str);
            return this;
        }

        public Builder approvedBy(String str) {
            this.approvedBy = Input.fromNullable(str);
            return this;
        }

        public UpdateDeviceRegistrationRequestInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateDeviceRegistrationRequestInput(this.id, this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.status, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
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

        public Builder ipAddress(String str) {
            this.ipAddress = Input.fromNullable(str);
            return this;
        }

        public Builder osVersion(String str) {
            this.osVersion = Input.fromNullable(str);
            return this;
        }

        public Builder reason(String str) {
            this.reason = Input.fromNullable(str);
            return this;
        }

        public Builder requestedAt(String str) {
            this.requestedAt = Input.fromNullable(str);
            return this;
        }

        public Builder requestedDeviceId(String str) {
            this.requestedDeviceId = Input.fromNullable(str);
            return this;
        }

        public Builder status(DeviceRequestStatus deviceRequestStatus) {
            this.status = Input.fromNullable(deviceRequestStatus);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateDeviceRegistrationRequestInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<DeviceRequestStatus> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13) {
        this.id = str;
        this.accountId = input;
        this.userId = input2;
        this.requestedDeviceId = input3;
        this.deviceModel = input4;
        this.osVersion = input5;
        this.ipAddress = input6;
        this.reason = input7;
        this.status = input8;
        this.requestedAt = input9;
        this.approvedBy = input10;
        this.approvedAt = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String approvedAt() {
        return this.approvedAt.value;
    }

    public String approvedBy() {
        return this.approvedBy.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String deviceModel() {
        return this.deviceModel.value;
    }

    public String id() {
        return this.id;
    }

    public String ipAddress() {
        return this.ipAddress.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateDeviceRegistrationRequestInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateDeviceRegistrationRequestInput.this.id);
                if (UpdateDeviceRegistrationRequestInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateDeviceRegistrationRequestInput.this.accountId.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateDeviceRegistrationRequestInput.this.userId.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.requestedDeviceId.defined) {
                    inputFieldWriter.writeString("requestedDeviceId", (String) UpdateDeviceRegistrationRequestInput.this.requestedDeviceId.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.deviceModel.defined) {
                    inputFieldWriter.writeString("deviceModel", (String) UpdateDeviceRegistrationRequestInput.this.deviceModel.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.osVersion.defined) {
                    inputFieldWriter.writeString("osVersion", (String) UpdateDeviceRegistrationRequestInput.this.osVersion.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.ipAddress.defined) {
                    inputFieldWriter.writeString("ipAddress", (String) UpdateDeviceRegistrationRequestInput.this.ipAddress.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.reason.defined) {
                    inputFieldWriter.writeString("reason", (String) UpdateDeviceRegistrationRequestInput.this.reason.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.status.defined) {
                    inputFieldWriter.writeString("status", UpdateDeviceRegistrationRequestInput.this.status.value != 0 ? ((DeviceRequestStatus) UpdateDeviceRegistrationRequestInput.this.status.value).name() : null);
                }
                if (UpdateDeviceRegistrationRequestInput.this.requestedAt.defined) {
                    inputFieldWriter.writeString("requestedAt", (String) UpdateDeviceRegistrationRequestInput.this.requestedAt.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.approvedBy.defined) {
                    inputFieldWriter.writeString("approvedBy", (String) UpdateDeviceRegistrationRequestInput.this.approvedBy.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.approvedAt.defined) {
                    inputFieldWriter.writeString("approvedAt", (String) UpdateDeviceRegistrationRequestInput.this.approvedAt.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateDeviceRegistrationRequestInput.this.createdAt.value);
                }
                if (UpdateDeviceRegistrationRequestInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateDeviceRegistrationRequestInput.this.updatedAt.value);
                }
            }
        };
    }

    public String osVersion() {
        return this.osVersion.value;
    }

    public String reason() {
        return this.reason.value;
    }

    public String requestedAt() {
        return this.requestedAt.value;
    }

    public String requestedDeviceId() {
        return this.requestedDeviceId.value;
    }

    public DeviceRequestStatus status() {
        return this.status.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
