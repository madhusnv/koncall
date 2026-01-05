package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelPaymentDataPaymentRequestsByContactCompositeKeyInput implements InputType {
    private final Input<String> contactId;
    private final Input<String> status;

    public static final class Builder {
        private Input<String> status = Input.absent();
        private Input<String> contactId = Input.absent();

        public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput build() {
            return new ModelPaymentDataPaymentRequestsByContactCompositeKeyInput(this.status, this.contactId);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }
    }

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.status = input;
        this.contactId = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String contactId() {
        return this.contactId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentDataPaymentRequestsByContactCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelPaymentDataPaymentRequestsByContactCompositeKeyInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) ModelPaymentDataPaymentRequestsByContactCompositeKeyInput.this.status.value);
                }
                if (ModelPaymentDataPaymentRequestsByContactCompositeKeyInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) ModelPaymentDataPaymentRequestsByContactCompositeKeyInput.this.contactId.value);
                }
            }
        };
    }

    public String status() {
        return this.status.value;
    }
}
