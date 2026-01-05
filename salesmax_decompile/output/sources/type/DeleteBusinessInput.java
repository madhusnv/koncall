package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class DeleteBusinessInput implements InputType {
    private final String accountId;
    private final String id;

    public static final class Builder {
        private String accountId;
        private String id;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteBusinessInput build() {
            Utils.checkNotNull(this.id, "id == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new DeleteBusinessInput(this.id, this.accountId);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public DeleteBusinessInput(String str, String str2) {
        this.id = str;
        this.accountId = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteBusinessInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, DeleteBusinessInput.this.id);
                inputFieldWriter.writeString("accountId", DeleteBusinessInput.this.accountId);
            }
        };
    }
}
