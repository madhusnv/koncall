package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDeviceRegistrationRequestConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDeviceRegistrationRequestConditionInput>> and;
    private final Input<ModelStringInput> approvedAt;
    private final Input<ModelIDInput> approvedBy;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> deviceModel;
    private final Input<ModelStringInput> ipAddress;
    private final Input<ModelDeviceRegistrationRequestConditionInput> not;
    private final Input<List<ModelDeviceRegistrationRequestConditionInput>> or;
    private final Input<ModelStringInput> osVersion;
    private final Input<ModelStringInput> reason;
    private final Input<ModelStringInput> requestedAt;
    private final Input<ModelStringInput> requestedDeviceId;
    private final Input<ModelDeviceRequestStatusInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> requestedDeviceId = Input.absent();
        private Input<ModelStringInput> deviceModel = Input.absent();
        private Input<ModelStringInput> osVersion = Input.absent();
        private Input<ModelStringInput> ipAddress = Input.absent();
        private Input<ModelStringInput> reason = Input.absent();
        private Input<ModelDeviceRequestStatusInput> status = Input.absent();
        private Input<ModelStringInput> requestedAt = Input.absent();
        private Input<ModelIDInput> approvedBy = Input.absent();
        private Input<ModelStringInput> approvedAt = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDeviceRegistrationRequestConditionInput>> and = Input.absent();
        private Input<List<ModelDeviceRegistrationRequestConditionInput>> or = Input.absent();
        private Input<ModelDeviceRegistrationRequestConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDeviceRegistrationRequestConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder approvedAt(ModelStringInput modelStringInput) {
            this.approvedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder approvedBy(ModelIDInput modelIDInput) {
            this.approvedBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelDeviceRegistrationRequestConditionInput build() {
            return new ModelDeviceRegistrationRequestConditionInput(this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.status, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deviceModel(ModelStringInput modelStringInput) {
            this.deviceModel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder ipAddress(ModelStringInput modelStringInput) {
            this.ipAddress = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
            this.not = Input.fromNullable(modelDeviceRegistrationRequestConditionInput);
            return this;
        }

        public Builder or(List<ModelDeviceRegistrationRequestConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder osVersion(ModelStringInput modelStringInput) {
            this.osVersion = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder reason(ModelStringInput modelStringInput) {
            this.reason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder requestedAt(ModelStringInput modelStringInput) {
            this.requestedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder requestedDeviceId(ModelStringInput modelStringInput) {
            this.requestedDeviceId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelDeviceRequestStatusInput modelDeviceRequestStatusInput) {
            this.status = Input.fromNullable(modelDeviceRequestStatusInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelDeviceRegistrationRequestConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelDeviceRequestStatusInput> input8, Input<ModelStringInput> input9, Input<ModelIDInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<List<ModelDeviceRegistrationRequestConditionInput>> input14, Input<List<ModelDeviceRegistrationRequestConditionInput>> input15, Input<ModelDeviceRegistrationRequestConditionInput> input16) {
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
        this.and = input14;
        this.or = input15;
        this.not = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelDeviceRegistrationRequestConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput approvedAt() {
        return this.approvedAt.value;
    }

    public ModelIDInput approvedBy() {
        return this.approvedBy.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput deviceModel() {
        return this.deviceModel.value;
    }

    public ModelStringInput ipAddress() {
        return this.ipAddress.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDeviceRegistrationRequestConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDeviceRegistrationRequestConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDeviceRegistrationRequestConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelDeviceRegistrationRequestConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.requestedDeviceId.defined) {
                    inputFieldWriter.writeObject("requestedDeviceId", ModelDeviceRegistrationRequestConditionInput.this.requestedDeviceId.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.requestedDeviceId.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.deviceModel.defined) {
                    inputFieldWriter.writeObject("deviceModel", ModelDeviceRegistrationRequestConditionInput.this.deviceModel.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.deviceModel.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.osVersion.defined) {
                    inputFieldWriter.writeObject("osVersion", ModelDeviceRegistrationRequestConditionInput.this.osVersion.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.osVersion.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.ipAddress.defined) {
                    inputFieldWriter.writeObject("ipAddress", ModelDeviceRegistrationRequestConditionInput.this.ipAddress.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.ipAddress.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.reason.defined) {
                    inputFieldWriter.writeObject("reason", ModelDeviceRegistrationRequestConditionInput.this.reason.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.reason.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelDeviceRegistrationRequestConditionInput.this.status.value != 0 ? ((ModelDeviceRequestStatusInput) ModelDeviceRegistrationRequestConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.requestedAt.defined) {
                    inputFieldWriter.writeObject("requestedAt", ModelDeviceRegistrationRequestConditionInput.this.requestedAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.requestedAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.approvedBy.defined) {
                    inputFieldWriter.writeObject("approvedBy", ModelDeviceRegistrationRequestConditionInput.this.approvedBy.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestConditionInput.this.approvedBy.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.approvedAt.defined) {
                    inputFieldWriter.writeObject("approvedAt", ModelDeviceRegistrationRequestConditionInput.this.approvedAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.approvedAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDeviceRegistrationRequestConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDeviceRegistrationRequestConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDeviceRegistrationRequestConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDeviceRegistrationRequestConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDeviceRegistrationRequestConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDeviceRegistrationRequestConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDeviceRegistrationRequestConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDeviceRegistrationRequestConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDeviceRegistrationRequestConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDeviceRegistrationRequestConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDeviceRegistrationRequestConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDeviceRegistrationRequestConditionInput.this.not.value != 0 ? ((ModelDeviceRegistrationRequestConditionInput) ModelDeviceRegistrationRequestConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDeviceRegistrationRequestConditionInput not() {
        return this.not.value;
    }

    public List<ModelDeviceRegistrationRequestConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput osVersion() {
        return this.osVersion.value;
    }

    public ModelStringInput reason() {
        return this.reason.value;
    }

    public ModelStringInput requestedAt() {
        return this.requestedAt.value;
    }

    public ModelStringInput requestedDeviceId() {
        return this.requestedDeviceId.value;
    }

    public ModelDeviceRequestStatusInput status() {
        return this.status.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
