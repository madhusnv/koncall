package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class QueryGetEmailContentQueryInput implements InputType {
    private final Input<String> logId;
    private final Input<String> messageId;

    public static final class Builder {
        private Input<String> logId = Input.absent();
        private Input<String> messageId = Input.absent();

        public QueryGetEmailContentQueryInput build() {
            return new QueryGetEmailContentQueryInput(this.logId, this.messageId);
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

    public QueryGetEmailContentQueryInput(Input<String> input, Input<String> input2) {
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
        return new InputFieldMarshaller() { // from class: type.QueryGetEmailContentQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryGetEmailContentQueryInput.this.logId.defined) {
                    inputFieldWriter.writeString("logId", (String) QueryGetEmailContentQueryInput.this.logId.value);
                }
                if (QueryGetEmailContentQueryInput.this.messageId.defined) {
                    inputFieldWriter.writeString("messageId", (String) QueryGetEmailContentQueryInput.this.messageId.value);
                }
            }
        };
    }

    public String messageId() {
        return this.messageId.value;
    }
}
