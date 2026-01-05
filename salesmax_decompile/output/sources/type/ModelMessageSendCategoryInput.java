package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelMessageSendCategoryInput implements InputType {
    private final Input<MessageSendCategory> eq;
    private final Input<MessageSendCategory> ne;

    public static final class Builder {
        private Input<MessageSendCategory> eq = Input.absent();
        private Input<MessageSendCategory> ne = Input.absent();

        public ModelMessageSendCategoryInput build() {
            return new ModelMessageSendCategoryInput(this.eq, this.ne);
        }

        public Builder eq(MessageSendCategory messageSendCategory) {
            this.eq = Input.fromNullable(messageSendCategory);
            return this;
        }

        public Builder ne(MessageSendCategory messageSendCategory) {
            this.ne = Input.fromNullable(messageSendCategory);
            return this;
        }
    }

    public ModelMessageSendCategoryInput(Input<MessageSendCategory> input, Input<MessageSendCategory> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public MessageSendCategory eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMessageSendCategoryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMessageSendCategoryInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelMessageSendCategoryInput.this.eq.value != 0 ? ((MessageSendCategory) ModelMessageSendCategoryInput.this.eq.value).name() : null);
                }
                if (ModelMessageSendCategoryInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelMessageSendCategoryInput.this.ne.value != 0 ? ((MessageSendCategory) ModelMessageSendCategoryInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public MessageSendCategory ne() {
        return this.ne.value;
    }
}
