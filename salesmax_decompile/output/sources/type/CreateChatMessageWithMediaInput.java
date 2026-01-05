package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class CreateChatMessageWithMediaInput implements InputType {
    private final Input<String> channelName;
    private final Input<CreateChatMessageInput> createChatMessageInput;
    private final Input<CreateUploadedFileInputShort> createUploadedFileInput;
    private final Input<Boolean> isNewContact;
    private final Input<Boolean> isNewParticipant;

    public static final class Builder {
        private Input<CreateChatMessageInput> createChatMessageInput = Input.absent();
        private Input<CreateUploadedFileInputShort> createUploadedFileInput = Input.absent();
        private Input<Boolean> isNewParticipant = Input.absent();
        private Input<String> channelName = Input.absent();
        private Input<Boolean> isNewContact = Input.absent();

        public CreateChatMessageWithMediaInput build() {
            return new CreateChatMessageWithMediaInput(this.createChatMessageInput, this.createUploadedFileInput, this.isNewParticipant, this.channelName, this.isNewContact);
        }

        public Builder channelName(String str) {
            this.channelName = Input.fromNullable(str);
            return this;
        }

        public Builder createChatMessageInput(CreateChatMessageInput createChatMessageInput) {
            this.createChatMessageInput = Input.fromNullable(createChatMessageInput);
            return this;
        }

        public Builder createUploadedFileInput(CreateUploadedFileInputShort createUploadedFileInputShort) {
            this.createUploadedFileInput = Input.fromNullable(createUploadedFileInputShort);
            return this;
        }

        public Builder isNewContact(Boolean bool) {
            this.isNewContact = Input.fromNullable(bool);
            return this;
        }

        public Builder isNewParticipant(Boolean bool) {
            this.isNewParticipant = Input.fromNullable(bool);
            return this;
        }
    }

    public CreateChatMessageWithMediaInput(Input<CreateChatMessageInput> input, Input<CreateUploadedFileInputShort> input2, Input<Boolean> input3, Input<String> input4, Input<Boolean> input5) {
        this.createChatMessageInput = input;
        this.createUploadedFileInput = input2;
        this.isNewParticipant = input3;
        this.channelName = input4;
        this.isNewContact = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String channelName() {
        return this.channelName.value;
    }

    public CreateChatMessageInput createChatMessageInput() {
        return this.createChatMessageInput.value;
    }

    public CreateUploadedFileInputShort createUploadedFileInput() {
        return this.createUploadedFileInput.value;
    }

    public Boolean isNewContact() {
        return this.isNewContact.value;
    }

    public Boolean isNewParticipant() {
        return this.isNewParticipant.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateChatMessageWithMediaInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatMessageWithMediaInput.this.createChatMessageInput.defined) {
                    inputFieldWriter.writeObject("createChatMessageInput", CreateChatMessageWithMediaInput.this.createChatMessageInput.value != 0 ? ((CreateChatMessageInput) CreateChatMessageWithMediaInput.this.createChatMessageInput.value).marshaller() : null);
                }
                if (CreateChatMessageWithMediaInput.this.createUploadedFileInput.defined) {
                    inputFieldWriter.writeObject("createUploadedFileInput", CreateChatMessageWithMediaInput.this.createUploadedFileInput.value != 0 ? ((CreateUploadedFileInputShort) CreateChatMessageWithMediaInput.this.createUploadedFileInput.value).marshaller() : null);
                }
                if (CreateChatMessageWithMediaInput.this.isNewParticipant.defined) {
                    inputFieldWriter.writeBoolean("isNewParticipant", (Boolean) CreateChatMessageWithMediaInput.this.isNewParticipant.value);
                }
                if (CreateChatMessageWithMediaInput.this.channelName.defined) {
                    inputFieldWriter.writeString("channelName", (String) CreateChatMessageWithMediaInput.this.channelName.value);
                }
                if (CreateChatMessageWithMediaInput.this.isNewContact.defined) {
                    inputFieldWriter.writeBoolean("isNewContact", (Boolean) CreateChatMessageWithMediaInput.this.isNewContact.value);
                }
            }
        };
    }
}
