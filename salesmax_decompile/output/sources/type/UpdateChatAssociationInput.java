package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateChatAssociationInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> channelId;
    private final Input<String> createdAt;
    private final String id;
    private final Input<String> relatedObjectId;
    private final Input<String> relatedObjectType;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> channelId = Input.absent();
        private Input<String> relatedObjectId = Input.absent();
        private Input<String> relatedObjectType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateChatAssociationInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateChatAssociationInput(this.id, this.accountId, this.channelId, this.relatedObjectId, this.relatedObjectType, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder relatedObjectId(String str) {
            this.relatedObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder relatedObjectType(String str) {
            this.relatedObjectType = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateChatAssociationInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.id = str;
        this.accountId = input;
        this.channelId = input2;
        this.relatedObjectId = input3;
        this.relatedObjectType = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String channelId() {
        return this.channelId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateChatAssociationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateChatAssociationInput.this.id);
                if (UpdateChatAssociationInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateChatAssociationInput.this.accountId.value);
                }
                if (UpdateChatAssociationInput.this.channelId.defined) {
                    inputFieldWriter.writeString("channelId", (String) UpdateChatAssociationInput.this.channelId.value);
                }
                if (UpdateChatAssociationInput.this.relatedObjectId.defined) {
                    inputFieldWriter.writeString("relatedObjectId", (String) UpdateChatAssociationInput.this.relatedObjectId.value);
                }
                if (UpdateChatAssociationInput.this.relatedObjectType.defined) {
                    inputFieldWriter.writeString("relatedObjectType", (String) UpdateChatAssociationInput.this.relatedObjectType.value);
                }
                if (UpdateChatAssociationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateChatAssociationInput.this.createdAt.value);
                }
                if (UpdateChatAssociationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateChatAssociationInput.this.updatedAt.value);
                }
            }
        };
    }

    public String relatedObjectId() {
        return this.relatedObjectId.value;
    }

    public String relatedObjectType() {
        return this.relatedObjectType.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
