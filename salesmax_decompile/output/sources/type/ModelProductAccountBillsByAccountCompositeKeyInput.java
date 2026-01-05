package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelProductAccountBillsByAccountCompositeKeyInput implements InputType {
    private final Input<String> billStatus;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> billStatus = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder billStatus(String str) {
            this.billStatus = Input.fromNullable(str);
            return this;
        }

        public ModelProductAccountBillsByAccountCompositeKeyInput build() {
            return new ModelProductAccountBillsByAccountCompositeKeyInput(this.billStatus, this.updatedAt);
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelProductAccountBillsByAccountCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.billStatus = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String billStatus() {
        return this.billStatus.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductAccountBillsByAccountCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductAccountBillsByAccountCompositeKeyInput.this.billStatus.defined) {
                    inputFieldWriter.writeString("billStatus", (String) ModelProductAccountBillsByAccountCompositeKeyInput.this.billStatus.value);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelProductAccountBillsByAccountCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
