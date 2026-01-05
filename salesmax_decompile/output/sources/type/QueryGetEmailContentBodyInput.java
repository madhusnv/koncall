package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class QueryGetEmailContentBodyInput implements InputType {
    private final Input<String> logId;
    private final Input<String> messageId;

    public static final class Builder {
        private Input<String> logId = Input.absent();
        private Input<String> messageId = Input.absent();

        public QueryGetEmailContentBodyInput build() {
            return new QueryGetEmailContentBodyInput(this.logId, this.messageId);
        }

        public Builder logId(String str) {
            this.logId = Input.fromNullable(str);
            return this;
        }

        public Builder messageId(String str) {
            this.messageId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryGetEmailContentBodyInput(Input<String> input, Input<String> input2) {
        this.logId = input;
        this.messageId = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String logId() {
        return this.logId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryGetEmailContentBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryGetEmailContentBodyInput.this.logId.defined) {
                    inputFieldWriter.writeString("logId", (String) QueryGetEmailContentBodyInput.this.logId.value);
                }
                if (QueryGetEmailContentBodyInput.this.messageId.defined) {
                    inputFieldWriter.writeString("messageId", (String) QueryGetEmailContentBodyInput.this.messageId.value);
                }
            }
        };
    }

    public String messageId() {
        return this.messageId.value;
    }
}
