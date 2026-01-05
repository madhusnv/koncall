package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEntityListMembershipByContactIdCompositeKeyInput implements InputType {
    private final Input<String> contactId;
    private final Input<String> entityListId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> contactId = Input.absent();
        private Input<String> entityListId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelEntityListMembershipByContactIdCompositeKeyInput build() {
            return new ModelEntityListMembershipByContactIdCompositeKeyInput(this.contactId, this.entityListId, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder entityListId(String str) {
            this.entityListId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelEntityListMembershipByContactIdCompositeKeyInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.contactId = input;
        this.entityListId = input2;
        this.updatedAt = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListMembershipByContactIdCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListMembershipByContactIdCompositeKeyInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) ModelEntityListMembershipByContactIdCompositeKeyInput.this.contactId.value);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) ModelEntityListMembershipByContactIdCompositeKeyInput.this.entityListId.value);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelEntityListMembershipByContactIdCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
