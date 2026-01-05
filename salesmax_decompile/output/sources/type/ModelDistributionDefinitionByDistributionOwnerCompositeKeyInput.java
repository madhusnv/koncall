package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput implements InputType {
    private final Input<String> ownerId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> ownerId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput build() {
            return new ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput(this.ownerId, this.updatedAt);
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

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.ownerId = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput.this.ownerId.value);
                }
                if (ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput.this.updatedAt.value);
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
