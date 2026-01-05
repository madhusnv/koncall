package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteCustomPropertyIndexForAccountInput implements InputType {
    private final String accountId;

    public static final class Builder {
        private String accountId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteCustomPropertyIndexForAccountInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new DeleteCustomPropertyIndexForAccountInput(this.accountId);
        }
    }

    public DeleteCustomPropertyIndexForAccountInput(String str) {
        this.accountId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteCustomPropertyIndexForAccountInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteCustomPropertyIndexForAccountInput.this.accountId);
            }
        };
    }
}
