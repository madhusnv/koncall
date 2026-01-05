package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class DeleteDeviceRegistrationRequestInput implements InputType {
    private final String id;

    public static final class Builder {
        private String id;

        public DeleteDeviceRegistrationRequestInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new DeleteDeviceRegistrationRequestInput(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public DeleteDeviceRegistrationRequestInput(String str) {
        this.id = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteDeviceRegistrationRequestInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, DeleteDeviceRegistrationRequestInput.this.id);
            }
        };
    }
}
