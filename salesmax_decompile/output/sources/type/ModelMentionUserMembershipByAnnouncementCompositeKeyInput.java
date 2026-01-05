package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelMentionUserMembershipByAnnouncementCompositeKeyInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public ModelMentionUserMembershipByAnnouncementCompositeKeyInput build() {
            return new ModelMentionUserMembershipByAnnouncementCompositeKeyInput(this.accountId, this.updatedAt);
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.accountId = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMentionUserMembershipByAnnouncementCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMentionUserMembershipByAnnouncementCompositeKeyInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) ModelMentionUserMembershipByAnnouncementCompositeKeyInput.this.accountId.value);
                }
                if (ModelMentionUserMembershipByAnnouncementCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelMentionUserMembershipByAnnouncementCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
