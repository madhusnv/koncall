package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class MeetingRequest implements InputType {
    private final String accountId;
    private final String action;
    private final Input<CreateEngagementInput> engagementInput;
    private final Input<String> purpose;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String action;
        private String userId;
        private Input<String> purpose = Input.absent();
        private Input<CreateEngagementInput> engagementInput = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder action(String str) {
            this.action = str;
            return this;
        }

        public MeetingRequest build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            Utils.checkNotNull(this.action, "action == null");
            return new MeetingRequest(this.accountId, this.userId, this.purpose, this.engagementInput, this.action);
        }

        public Builder engagementInput(CreateEngagementInput createEngagementInput) {
            this.engagementInput = Input.fromNullable(createEngagementInput);
            return this;
        }

        public Builder purpose(String str) {
            this.purpose = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public MeetingRequest(String str, String str2, Input<String> input, Input<CreateEngagementInput> input2, String str3) {
        this.accountId = str;
        this.userId = str2;
        this.purpose = input;
        this.engagementInput = input2;
        this.action = str3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String action() {
        return this.action;
    }

    public CreateEngagementInput engagementInput() {
        return this.engagementInput.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MeetingRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", MeetingRequest.this.accountId);
                inputFieldWriter.writeString("userId", MeetingRequest.this.userId);
                if (MeetingRequest.this.purpose.defined) {
                    inputFieldWriter.writeString("purpose", (String) MeetingRequest.this.purpose.value);
                }
                if (MeetingRequest.this.engagementInput.defined) {
                    inputFieldWriter.writeObject("engagementInput", MeetingRequest.this.engagementInput.value != 0 ? ((CreateEngagementInput) MeetingRequest.this.engagementInput.value).marshaller() : null);
                }
                inputFieldWriter.writeString("action", MeetingRequest.this.action);
            }
        };
    }

    public String purpose() {
        return this.purpose.value;
    }

    public String userId() {
        return this.userId;
    }
}
