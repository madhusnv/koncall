package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class MutationCreateDealOnContactQueryInput implements InputType {
    private final Input<CreateManualDealInput> input;

    public static final class Builder {
        private Input<CreateManualDealInput> input = Input.absent();

        public MutationCreateDealOnContactQueryInput build() {
            return new MutationCreateDealOnContactQueryInput(this.input);
        }

        public Builder input(CreateManualDealInput createManualDealInput) {
            this.input = Input.fromNullable(createManualDealInput);
            return this;
        }
    }

    public MutationCreateDealOnContactQueryInput(Input<CreateManualDealInput> input) {
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
        return new InputFieldMarshaller() { // from class: type.MutationCreateDealOnContactQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationCreateDealOnContactQueryInput.this.input.defined) {
                    inputFieldWriter.writeObject("input", MutationCreateDealOnContactQueryInput.this.input.value != 0 ? ((CreateManualDealInput) MutationCreateDealOnContactQueryInput.this.input.value).marshaller() : null);
                }
            }
        };
    }
}
