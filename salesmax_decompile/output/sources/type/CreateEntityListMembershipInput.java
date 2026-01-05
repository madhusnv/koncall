package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateEntityListMembershipInput implements InputType {
    private final String accountId;
    private final String contactId;
    private final String entityListId;
    private final Input<String> id;

    public static final class Builder {
        private String accountId;
        private String contactId;
        private String entityListId;
        private Input<String> id = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateEntityListMembershipInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            Utils.checkNotNull(this.entityListId, "entityListId == null");
            return new CreateEntityListMembershipInput(this.id, this.accountId, this.contactId, this.entityListId);
        }

        public Builder contactId(String str) {
            this.contactId = str;
            return this;
        }

        public Builder entityListId(String str) {
            this.entityListId = str;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }
    }

    public CreateEntityListMembershipInput(Input<String> input, String str, String str2, String str3) {
        this.id = input;
        this.accountId = str;
        this.contactId = str2;
        this.entityListId = str3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String contactId() {
        return this.contactId;
    }

    public String entityListId() {
        return this.entityListId;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateEntityListMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateEntityListMembershipInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateEntityListMembershipInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateEntityListMembershipInput.this.accountId);
                inputFieldWriter.writeString("contactId", CreateEntityListMembershipInput.this.contactId);
                inputFieldWriter.writeString("entityListId", CreateEntityListMembershipInput.this.entityListId);
            }
        };
    }
}
