package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ReplyButtonInput implements InputType {
    private final Input<String> idReply;
    private final Input<String> titleReply;
    private final Input<String> typeReply;

    public static final class Builder {
        private Input<String> typeReply = Input.absent();
        private Input<String> titleReply = Input.absent();
        private Input<String> idReply = Input.absent();

        public ReplyButtonInput build() {
            return new ReplyButtonInput(this.typeReply, this.titleReply, this.idReply);
        }

        public Builder idReply(String str) {
            this.idReply = Input.fromNullable(str);
            return this;
        }

        public Builder titleReply(String str) {
            this.titleReply = Input.fromNullable(str);
            return this;
        }

        public Builder typeReply(String str) {
            this.typeReply = Input.fromNullable(str);
            return this;
        }
    }

    public ReplyButtonInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.typeReply = input;
        this.titleReply = input2;
        this.idReply = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String idReply() {
        return this.idReply.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ReplyButtonInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ReplyButtonInput.this.typeReply.defined) {
                    inputFieldWriter.writeString("typeReply", (String) ReplyButtonInput.this.typeReply.value);
                }
                if (ReplyButtonInput.this.titleReply.defined) {
                    inputFieldWriter.writeString("titleReply", (String) ReplyButtonInput.this.titleReply.value);
                }
                if (ReplyButtonInput.this.idReply.defined) {
                    inputFieldWriter.writeString("idReply", (String) ReplyButtonInput.this.idReply.value);
                }
            }
        };
    }

    public String titleReply() {
        return this.titleReply.value;
    }

    public String typeReply() {
        return this.typeReply.value;
    }
}
