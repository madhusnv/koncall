package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateChatAssociationInput implements InputType {
    private final String accountId;
    private final String channelId;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final String relatedObjectId;
    private final String relatedObjectType;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String channelId;
        private String relatedObjectId;
        private String relatedObjectType;
        private Input<String> id = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateChatAssociationInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.channelId, "channelId == null");
            Utils.checkNotNull(this.relatedObjectId, "relatedObjectId == null");
            Utils.checkNotNull(this.relatedObjectType, "relatedObjectType == null");
            return new CreateChatAssociationInput(this.id, this.accountId, this.channelId, this.relatedObjectId, this.relatedObjectType, this.createdAt, this.updatedAt);
        }

        public Builder channelId(String str) {
            this.channelId = str;
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder relatedObjectId(String str) {
            this.relatedObjectId = str;
            return this;
        }

        public Builder relatedObjectType(String str) {
            this.relatedObjectType = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateChatAssociationInput(Input<String> input, String str, String str2, String str3, String str4, Input<String> input2, Input<String> input3) {
        this.id = input;
        this.accountId = str;
        this.channelId = str2;
        this.relatedObjectId = str3;
        this.relatedObjectType = str4;
        this.createdAt = input2;
        this.updatedAt = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String channelId() {
        return this.channelId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateChatAssociationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatAssociationInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatAssociationInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateChatAssociationInput.this.accountId);
                inputFieldWriter.writeString("channelId", CreateChatAssociationInput.this.channelId);
                inputFieldWriter.writeString("relatedObjectId", CreateChatAssociationInput.this.relatedObjectId);
                inputFieldWriter.writeString("relatedObjectType", CreateChatAssociationInput.this.relatedObjectType);
                if (CreateChatAssociationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatAssociationInput.this.createdAt.value);
                }
                if (CreateChatAssociationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatAssociationInput.this.updatedAt.value);
                }
            }
        };
    }

    public String relatedObjectId() {
        return this.relatedObjectId;
    }

    public String relatedObjectType() {
        return this.relatedObjectType;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
