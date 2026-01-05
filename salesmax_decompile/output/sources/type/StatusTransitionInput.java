package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class StatusTransitionInput implements InputType {
    private final Input<String> recordedAt;
    private final Input<String> status;

    public static final class Builder {
        private Input<String> status = Input.absent();
        private Input<String> recordedAt = Input.absent();

        public StatusTransitionInput build() {
            return new StatusTransitionInput(this.status, this.recordedAt);
        }

        public Builder recordedAt(String str) {
            this.recordedAt = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }
    }

    public StatusTransitionInput(Input<String> input, Input<String> input2) {
        this.status = input;
        this.recordedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.StatusTransitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (StatusTransitionInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) StatusTransitionInput.this.status.value);
                }
                if (StatusTransitionInput.this.recordedAt.defined) {
                    inputFieldWriter.writeString("recordedAt", (String) StatusTransitionInput.this.recordedAt.value);
                }
            }
        };
    }

    public String recordedAt() {
        return this.recordedAt.value;
    }

    public String status() {
        return this.status.value;
    }
}
