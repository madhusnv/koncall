package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class DeleteAccountMembershipInput implements InputType {
    private final Input<String> id;

    public static final class Builder {
        private Input<String> id = Input.absent();

        public DeleteAccountMembershipInput build() {
            return new DeleteAccountMembershipInput(this.id);
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }
    }

    public DeleteAccountMembershipInput(Input<String> input) {
        this.id = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteAccountMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (DeleteAccountMembershipInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) DeleteAccountMembershipInput.this.id.value);
                }
            }
        };
    }
}
