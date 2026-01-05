package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteWabaConversationInput implements InputType {
    private final String conversationId;

    public static final class Builder {
        private String conversationId;

        public DeleteWabaConversationInput build() {
            Utils.checkNotNull(this.conversationId, "conversationId == null");
            return new DeleteWabaConversationInput(this.conversationId);
        }

        public Builder conversationId(String str) {
            this.conversationId = str;
            return this;
        }
    }

    public DeleteWabaConversationInput(String str) {
        this.conversationId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String conversationId() {
        return this.conversationId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteWabaConversationInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("conversationId", DeleteWabaConversationInput.this.conversationId);
            }
        };
    }
}
