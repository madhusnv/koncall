package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class MutationUpdateDealOnContactBodyInput implements InputType {
    private final Input<UpdateManualDealInput> input;

    public static final class Builder {
        private Input<UpdateManualDealInput> input = Input.absent();

        public MutationUpdateDealOnContactBodyInput build() {
            return new MutationUpdateDealOnContactBodyInput(this.input);
        }

        public Builder input(UpdateManualDealInput updateManualDealInput) {
            this.input = Input.fromNullable(updateManualDealInput);
            return this;
        }
    }

    public MutationUpdateDealOnContactBodyInput(Input<UpdateManualDealInput> input) {
        this.input = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public UpdateManualDealInput input() {
        return this.input.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MutationUpdateDealOnContactBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationUpdateDealOnContactBodyInput.this.input.defined) {
                    inputFieldWriter.writeObject("input", MutationUpdateDealOnContactBodyInput.this.input.value != 0 ? ((UpdateManualDealInput) MutationUpdateDealOnContactBodyInput.this.input.value).marshaller() : null);
                }
            }
        };
    }
}
