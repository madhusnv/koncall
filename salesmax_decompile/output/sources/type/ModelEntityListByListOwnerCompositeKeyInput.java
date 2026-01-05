package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEntityListByListOwnerCompositeKeyInput implements InputType {
    private final Input<String> entityTypeInList;
    private final Input<String> ownerId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> ownerId = Input.absent();
        private Input<String> entityTypeInList = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelEntityListByListOwnerCompositeKeyInput build() {
            return new ModelEntityListByListOwnerCompositeKeyInput(this.ownerId, this.entityTypeInList, this.updatedAt);
        }

        public Builder entityTypeInList(String str) {
            this.entityTypeInList = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelEntityListByListOwnerCompositeKeyInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.ownerId = input;
        this.entityTypeInList = input2;
        this.updatedAt = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String entityTypeInList() {
        return this.entityTypeInList.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListByListOwnerCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListByListOwnerCompositeKeyInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) ModelEntityListByListOwnerCompositeKeyInput.this.ownerId.value);
                }
                if (ModelEntityListByListOwnerCompositeKeyInput.this.entityTypeInList.defined) {
                    inputFieldWriter.writeString("entityTypeInList", (String) ModelEntityListByListOwnerCompositeKeyInput.this.entityTypeInList.value);
                }
                if (ModelEntityListByListOwnerCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelEntityListByListOwnerCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
