package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateEntityListMembershipInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> associatedObjectId;
    private final Input<String> associatedObjectType;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> entityListId;
    private final String id;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> associatedObjectId = Input.absent();
        private Input<String> associatedObjectType = Input.absent();
        private Input<String> entityListId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder associatedObjectId(String str) {
            this.associatedObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder associatedObjectType(String str) {
            this.associatedObjectType = Input.fromNullable(str);
            return this;
        }

        public UpdateEntityListMembershipInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateEntityListMembershipInput(this.id, this.accountId, this.contactId, this.associatedObjectId, this.associatedObjectType, this.entityListId, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder entityListId(String str) {
            this.entityListId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateEntityListMembershipInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.accountId = input;
        this.contactId = input2;
        this.associatedObjectId = input3;
        this.associatedObjectType = input4;
        this.entityListId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String associatedObjectId() {
        return this.associatedObjectId.value;
    }

    public String associatedObjectType() {
        return this.associatedObjectType.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateEntityListMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateEntityListMembershipInput.this.id);
                if (UpdateEntityListMembershipInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateEntityListMembershipInput.this.accountId.value);
                }
                if (UpdateEntityListMembershipInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateEntityListMembershipInput.this.contactId.value);
                }
                if (UpdateEntityListMembershipInput.this.associatedObjectId.defined) {
                    inputFieldWriter.writeString("associatedObjectId", (String) UpdateEntityListMembershipInput.this.associatedObjectId.value);
                }
                if (UpdateEntityListMembershipInput.this.associatedObjectType.defined) {
                    inputFieldWriter.writeString("associatedObjectType", (String) UpdateEntityListMembershipInput.this.associatedObjectType.value);
                }
                if (UpdateEntityListMembershipInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) UpdateEntityListMembershipInput.this.entityListId.value);
                }
                if (UpdateEntityListMembershipInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateEntityListMembershipInput.this.createdAt.value);
                }
                if (UpdateEntityListMembershipInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateEntityListMembershipInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
