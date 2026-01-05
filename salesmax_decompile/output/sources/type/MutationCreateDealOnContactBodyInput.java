package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class MutationCreateDealOnContactBodyInput implements InputType {
    private final Input<CreateManualDealInput> input;

    public static final class Builder {
        private Input<CreateManualDealInput> input = Input.absent();

        public MutationCreateDealOnContactBodyInput build() {
            return new MutationCreateDealOnContactBodyInput(this.input);
        }

        public Builder input(CreateManualDealInput createManualDealInput) {
            this.input = Input.fromNullable(createManualDealInput);
            return this;
        }
    }

    public MutationCreateDealOnContactBodyInput(Input<CreateManualDealInput> input) {
        this.input = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CreateManualDealInput input() {
        return this.input.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MutationCreateDealOnContactBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationCreateDealOnContactBodyInput.this.input.defined) {
                    inputFieldWriter.writeObject("input", MutationCreateDealOnContactBodyInput.this.input.value != 0 ? ((CreateManualDealInput) MutationCreateDealOnContactBodyInput.this.input.value).marshaller() : null);
                }
            }
        };
    }
}
