package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDeviceRegistrationRequestFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDeviceRegistrationRequestFilterInput>> and;
    private final Input<ModelStringInput> approvedAt;
    private final Input<ModelIDInput> approvedBy;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> deviceModel;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> ipAddress;
    private final Input<ModelDeviceRegistrationRequestFilterInput> not;
    private final Input<List<ModelDeviceRegistrationRequestFilterInput>> or;
    private final Input<ModelStringInput> osVersion;
    private final Input<ModelStringInput> reason;
    private final Input<ModelStringInput> requestedAt;
    private final Input<ModelStringInput> requestedDeviceId;
    private final Input<ModelDeviceRequestStatusInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelDeviceRegistrationRequestFilterInput>> and = Input.absent();
        private Input<List<ModelDeviceRegistrationRequestFilterInput>> or = Input.absent();
        private Input<ModelDeviceRegistrationRequestFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDeviceRegistrationRequestFilterInput> list) {
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

        public ModelDeviceRegistrationRequestFilterInput build() {
            return new ModelDeviceRegistrationRequestFilterInput(this.id, this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.status, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
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

        public Builder ipAddress(ModelStringInput modelStringInput) {
            this.ipAddress = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelDeviceRegistrationRequestFilterInput modelDeviceRegistrationRequestFilterInput) {
            this.not = Input.fromNullable(modelDeviceRegistrationRequestFilterInput);
            return this;
        }

        public Builder or(List<ModelDeviceRegistrationRequestFilterInput> list) {
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

    public ModelDeviceRegistrationRequestFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelDeviceRequestStatusInput> input9, Input<ModelStringInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<List<ModelDeviceRegistrationRequestFilterInput>> input15, Input<List<ModelDeviceRegistrationRequestFilterInput>> input16, Input<ModelDeviceRegistrationRequestFilterInput> input17) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.requestedDeviceId = input4;
        this.deviceModel = input5;
        this.osVersion = input6;
        this.ipAddress = input7;
        this.reason = input8;
        this.status = input9;
        this.requestedAt = input10;
        this.approvedBy = input11;
        this.approvedAt = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
        this.and = input15;
        this.or = input16;
        this.not = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelDeviceRegistrationRequestFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput ipAddress() {
        return this.ipAddress.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDeviceRegistrationRequestFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDeviceRegistrationRequestFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelDeviceRegistrationRequestFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDeviceRegistrationRequestFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelDeviceRegistrationRequestFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.requestedDeviceId.defined) {
                    inputFieldWriter.writeObject("requestedDeviceId", ModelDeviceRegistrationRequestFilterInput.this.requestedDeviceId.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.requestedDeviceId.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.deviceModel.defined) {
                    inputFieldWriter.writeObject("deviceModel", ModelDeviceRegistrationRequestFilterInput.this.deviceModel.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.deviceModel.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.osVersion.defined) {
                    inputFieldWriter.writeObject("osVersion", ModelDeviceRegistrationRequestFilterInput.this.osVersion.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.osVersion.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.ipAddress.defined) {
                    inputFieldWriter.writeObject("ipAddress", ModelDeviceRegistrationRequestFilterInput.this.ipAddress.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.ipAddress.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.reason.defined) {
                    inputFieldWriter.writeObject("reason", ModelDeviceRegistrationRequestFilterInput.this.reason.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.reason.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelDeviceRegistrationRequestFilterInput.this.status.value != 0 ? ((ModelDeviceRequestStatusInput) ModelDeviceRegistrationRequestFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.requestedAt.defined) {
                    inputFieldWriter.writeObject("requestedAt", ModelDeviceRegistrationRequestFilterInput.this.requestedAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.requestedAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.approvedBy.defined) {
                    inputFieldWriter.writeObject("approvedBy", ModelDeviceRegistrationRequestFilterInput.this.approvedBy.value != 0 ? ((ModelIDInput) ModelDeviceRegistrationRequestFilterInput.this.approvedBy.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.approvedAt.defined) {
                    inputFieldWriter.writeObject("approvedAt", ModelDeviceRegistrationRequestFilterInput.this.approvedAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.approvedAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDeviceRegistrationRequestFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDeviceRegistrationRequestFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDeviceRegistrationRequestFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDeviceRegistrationRequestFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDeviceRegistrationRequestFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDeviceRegistrationRequestFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDeviceRegistrationRequestFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDeviceRegistrationRequestFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDeviceRegistrationRequestFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDeviceRegistrationRequestFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDeviceRegistrationRequestFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDeviceRegistrationRequestFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDeviceRegistrationRequestFilterInput.this.not.value != 0 ? ((ModelDeviceRegistrationRequestFilterInput) ModelDeviceRegistrationRequestFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelDeviceRegistrationRequestFilterInput not() {
        return this.not.value;
    }

    public List<ModelDeviceRegistrationRequestFilterInput> or() {
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
