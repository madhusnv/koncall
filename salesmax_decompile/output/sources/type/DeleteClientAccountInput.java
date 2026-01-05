package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteClientAccountInput implements InputType {
    private final String accountId;
    private final String clientAccountId;

    public static final class Builder {
        private String accountId;
        private String clientAccountId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteClientAccountInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.clientAccountId, "clientAccountId == null");
            return new DeleteClientAccountInput(this.accountId, this.clientAccountId);
        }

        public Builder clientAccountId(String str) {
            this.clientAccountId = str;
            return this;
        }
    }

    public DeleteClientAccountInput(String str, String str2) {
        this.accountId = str;
        this.clientAccountId = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String clientAccountId() {
        return this.clientAccountId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteClientAccountInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteClientAccountInput.this.accountId);
                inputFieldWriter.writeString("clientAccountId", DeleteClientAccountInput.this.clientAccountId);
            }
        };
    }
}
