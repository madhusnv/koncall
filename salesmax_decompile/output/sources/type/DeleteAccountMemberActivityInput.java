package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteAccountMemberActivityInput implements InputType {
    private final String accountId;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteAccountMemberActivityInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new DeleteAccountMemberActivityInput(this.accountId, this.userId);
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public DeleteAccountMemberActivityInput(String str, String str2) {
        this.accountId = str;
        this.userId = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteAccountMemberActivityInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteAccountMemberActivityInput.this.accountId);
                inputFieldWriter.writeString("userId", DeleteAccountMemberActivityInput.this.userId);
            }
        };
    }

    public String userId() {
        return this.userId;
    }
}
