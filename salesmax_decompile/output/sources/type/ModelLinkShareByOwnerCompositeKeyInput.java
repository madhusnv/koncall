package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelLinkShareByOwnerCompositeKeyInput implements InputType {
    private final Input<String> sharedById;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> sharedById = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelLinkShareByOwnerCompositeKeyInput build() {
            return new ModelLinkShareByOwnerCompositeKeyInput(this.sharedById, this.updatedAt);
        }

        public Builder sharedById(String str) {
            this.sharedById = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelLinkShareByOwnerCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.sharedById = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelLinkShareByOwnerCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelLinkShareByOwnerCompositeKeyInput.this.sharedById.defined) {
                    inputFieldWriter.writeString("sharedById", (String) ModelLinkShareByOwnerCompositeKeyInput.this.sharedById.value);
                }
                if (ModelLinkShareByOwnerCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelLinkShareByOwnerCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String sharedById() {
        return this.sharedById.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
