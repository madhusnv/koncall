package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelChatParticipantChannelByParticipantCompositeKeyInput implements InputType {
    private final Input<String> participantId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> participantId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelChatParticipantChannelByParticipantCompositeKeyInput build() {
            return new ModelChatParticipantChannelByParticipantCompositeKeyInput(this.participantId, this.updatedAt);
        }

        public Builder participantId(String str) {
            this.participantId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelChatParticipantChannelByParticipantCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.participantId = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatParticipantChannelByParticipantCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatParticipantChannelByParticipantCompositeKeyInput.this.participantId.defined) {
                    inputFieldWriter.writeString("participantId", (String) ModelChatParticipantChannelByParticipantCompositeKeyInput.this.participantId.value);
                }
                if (ModelChatParticipantChannelByParticipantCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelChatParticipantChannelByParticipantCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String participantId() {
        return this.participantId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
