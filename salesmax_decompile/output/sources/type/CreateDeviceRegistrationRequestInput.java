package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateDeviceRegistrationRequestInput implements InputType {
    private final String accountId;
    private final Input<String> approvedAt;
    private final Input<String> approvedBy;
    private final Input<String> createdAt;
    private final Input<String> deviceModel;
    private final Input<String> id;
    private final Input<String> ipAddress;
    private final Input<String> osVersion;
    private final Input<String> reason;
    private final String requestedAt;
    private final String requestedDeviceId;
    private final DeviceRequestStatus status;
    private final Input<String> updatedAt;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String requestedAt;
        private String requestedDeviceId;
        private DeviceRequestStatus status;
        private String userId;
        private Input<String> id = Input.absent();
        private Input<String> deviceModel = Input.absent();
        private Input<String> osVersion = Input.absent();
        private Input<String> ipAddress = Input.absent();
        private Input<String> reason = Input.absent();
        private Input<String> approvedBy = Input.absent();
        private Input<String> approvedAt = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
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

        public CreateDeviceRegistrationRequestInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            Utils.checkNotNull(this.requestedDeviceId, "requestedDeviceId == null");
            Utils.checkNotNull(this.status, "status == null");
            Utils.checkNotNull(this.requestedAt, "requestedAt == null");
            return new CreateDeviceRegistrationRequestInput(this.id, this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.status, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt);
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
            this.id = Input.fromNullable(str);
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
            this.requestedAt = str;
            return this;
        }

        public Builder requestedDeviceId(String str) {
            this.requestedDeviceId = str;
            return this;
        }

        public Builder status(DeviceRequestStatus deviceRequestStatus) {
            this.status = deviceRequestStatus;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public CreateDeviceRegistrationRequestInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, DeviceRequestStatus deviceRequestStatus, String str4, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = input;
        this.accountId = str;
        this.userId = str2;
        this.requestedDeviceId = str3;
        this.deviceModel = input2;
        this.osVersion = input3;
        this.ipAddress = input4;
        this.reason = input5;
        this.status = deviceRequestStatus;
        this.requestedAt = str4;
        this.approvedBy = input6;
        this.approvedAt = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.id.value;
    }

    public String ipAddress() {
        return this.ipAddress.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateDeviceRegistrationRequestInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateDeviceRegistrationRequestInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateDeviceRegistrationRequestInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateDeviceRegistrationRequestInput.this.accountId);
                inputFieldWriter.writeString("userId", CreateDeviceRegistrationRequestInput.this.userId);
                inputFieldWriter.writeString("requestedDeviceId", CreateDeviceRegistrationRequestInput.this.requestedDeviceId);
                if (CreateDeviceRegistrationRequestInput.this.deviceModel.defined) {
                    inputFieldWriter.writeString("deviceModel", (String) CreateDeviceRegistrationRequestInput.this.deviceModel.value);
                }
                if (CreateDeviceRegistrationRequestInput.this.osVersion.defined) {
                    inputFieldWriter.writeString("osVersion", (String) CreateDeviceRegistrationRequestInput.this.osVersion.value);
                }
                if (CreateDeviceRegistrationRequestInput.this.ipAddress.defined) {
                    inputFieldWriter.writeString("ipAddress", (String) CreateDeviceRegistrationRequestInput.this.ipAddress.value);
                }
                if (CreateDeviceRegistrationRequestInput.this.reason.defined) {
                    inputFieldWriter.writeString("reason", (String) CreateDeviceRegistrationRequestInput.this.reason.value);
                }
                inputFieldWriter.writeString("status", CreateDeviceRegistrationRequestInput.this.status.name());
                inputFieldWriter.writeString("requestedAt", CreateDeviceRegistrationRequestInput.this.requestedAt);
                if (CreateDeviceRegistrationRequestInput.this.approvedBy.defined) {
                    inputFieldWriter.writeString("approvedBy", (String) CreateDeviceRegistrationRequestInput.this.approvedBy.value);
                }
                if (CreateDeviceRegistrationRequestInput.this.approvedAt.defined) {
                    inputFieldWriter.writeString("approvedAt", (String) CreateDeviceRegistrationRequestInput.this.approvedAt.value);
                }
                if (CreateDeviceRegistrationRequestInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateDeviceRegistrationRequestInput.this.createdAt.value);
                }
                if (CreateDeviceRegistrationRequestInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateDeviceRegistrationRequestInput.this.updatedAt.value);
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
        return this.requestedAt;
    }

    public String requestedDeviceId() {
        return this.requestedDeviceId;
    }

    public DeviceRequestStatus status() {
        return this.status;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userId() {
        return this.userId;
    }
}
