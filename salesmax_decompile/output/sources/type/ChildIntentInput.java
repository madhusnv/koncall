package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ChildIntentInput implements InputType {
    private final Input<String> childBotId;
    private final Input<String> intent;

    public static final class Builder {
        private Input<String> childBotId = Input.absent();
        private Input<String> intent = Input.absent();

        public ChildIntentInput build() {
            return new ChildIntentInput(this.childBotId, this.intent);
        }

        public Builder childBotId(String str) {
            this.childBotId = Input.fromNullable(str);
            return this;
        }

        public Builder intent(String str) {
            this.intent = Input.fromNullable(str);
            return this;
        }
    }

    public ChildIntentInput(Input<String> input, Input<String> input2) {
        this.childBotId = input;
        this.intent = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String childBotId() {
        return this.childBotId.value;
    }

    public String intent() {
        return this.intent.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ChildIntentInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ChildIntentInput.this.childBotId.defined) {
                    inputFieldWriter.writeString("childBotId", (String) ChildIntentInput.this.childBotId.value);
                }
                if (ChildIntentInput.this.intent.defined) {
                    inputFieldWriter.writeString("intent", (String) ChildIntentInput.this.intent.value);
                }
            }
        };
    }
}
