package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class UpdateContactWithNumberInput implements InputType {
    private final Input<Boolean> forceDuplicate;
    private final Input<CreateBusinessInputShort> updateBusinessInput;
    private final Input<UpdateContactInput> updateContactInput;

    public static final class Builder {
        private Input<Boolean> forceDuplicate = Input.absent();
        private Input<UpdateContactInput> updateContactInput = Input.absent();
        private Input<CreateBusinessInputShort> updateBusinessInput = Input.absent();

        public UpdateContactWithNumberInput build() {
            return new UpdateContactWithNumberInput(this.forceDuplicate, this.updateContactInput, this.updateBusinessInput);
        }

        public Builder forceDuplicate(Boolean bool) {
            this.forceDuplicate = Input.fromNullable(bool);
            return this;
        }

        public Builder updateBusinessInput(CreateBusinessInputShort createBusinessInputShort) {
            this.updateBusinessInput = Input.fromNullable(createBusinessInputShort);
            return this;
        }

        public Builder updateContactInput(UpdateContactInput updateContactInput) {
            this.updateContactInput = Input.fromNullable(updateContactInput);
            return this;
        }
    }

    public UpdateContactWithNumberInput(Input<Boolean> input, Input<UpdateContactInput> input2, Input<CreateBusinessInputShort> input3) {
        this.forceDuplicate = input;
        this.updateContactInput = input2;
        this.updateBusinessInput = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean forceDuplicate() {
        return this.forceDuplicate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateContactWithNumberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (UpdateContactWithNumberInput.this.forceDuplicate.defined) {
                    inputFieldWriter.writeBoolean("forceDuplicate", (Boolean) UpdateContactWithNumberInput.this.forceDuplicate.value);
                }
                if (UpdateContactWithNumberInput.this.updateContactInput.defined) {
                    inputFieldWriter.writeObject("updateContactInput", UpdateContactWithNumberInput.this.updateContactInput.value != 0 ? ((UpdateContactInput) UpdateContactWithNumberInput.this.updateContactInput.value).marshaller() : null);
                }
                if (UpdateContactWithNumberInput.this.updateBusinessInput.defined) {
                    inputFieldWriter.writeObject("updateBusinessInput", UpdateContactWithNumberInput.this.updateBusinessInput.value != 0 ? ((CreateBusinessInputShort) UpdateContactWithNumberInput.this.updateBusinessInput.value).marshaller() : null);
                }
            }
        };
    }

    public CreateBusinessInputShort updateBusinessInput() {
        return this.updateBusinessInput.value;
    }

    public UpdateContactInput updateContactInput() {
        return this.updateContactInput.value;
    }
}
