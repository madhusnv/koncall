package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEntityListMembershipByListIdCompositeKeyInput implements InputType {
    private final Input<String> entityListId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> entityListId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelEntityListMembershipByListIdCompositeKeyInput build() {
            return new ModelEntityListMembershipByListIdCompositeKeyInput(this.entityListId, this.updatedAt);
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

    public ModelEntityListMembershipByListIdCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.entityListId = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListMembershipByListIdCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListMembershipByListIdCompositeKeyInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) ModelEntityListMembershipByListIdCompositeKeyInput.this.entityListId.value);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelEntityListMembershipByListIdCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
