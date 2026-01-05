package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelDeviceRequestStatusInput implements InputType {
    private final Input<DeviceRequestStatus> eq;
    private final Input<DeviceRequestStatus> ne;

    public static final class Builder {
        private Input<DeviceRequestStatus> eq = Input.absent();
        private Input<DeviceRequestStatus> ne = Input.absent();

        public ModelDeviceRequestStatusInput build() {
            return new ModelDeviceRequestStatusInput(this.eq, this.ne);
        }

        public Builder eq(DeviceRequestStatus deviceRequestStatus) {
            this.eq = Input.fromNullable(deviceRequestStatus);
            return this;
        }

        public Builder ne(DeviceRequestStatus deviceRequestStatus) {
            this.ne = Input.fromNullable(deviceRequestStatus);
            return this;
        }
    }

    public ModelDeviceRequestStatusInput(Input<DeviceRequestStatus> input, Input<DeviceRequestStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DeviceRequestStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDeviceRequestStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDeviceRequestStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelDeviceRequestStatusInput.this.eq.value != 0 ? ((DeviceRequestStatus) ModelDeviceRequestStatusInput.this.eq.value).name() : null);
                }
                if (ModelDeviceRequestStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelDeviceRequestStatusInput.this.ne.value != 0 ? ((DeviceRequestStatus) ModelDeviceRequestStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public DeviceRequestStatus ne() {
        return this.ne.value;
    }
}
