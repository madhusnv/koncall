package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateInitialProductPlanSubscriptionInput implements InputType {
    private final Input<CreateClientAccountInput> createClientAccountInput;
    private final CreateProductPlanSubscriptionInput createProductPlanSubscriptionInput;
    private final Input<Boolean> overrideExisting;

    public static final class Builder {
        private CreateProductPlanSubscriptionInput createProductPlanSubscriptionInput;
        private Input<Boolean> overrideExisting = Input.absent();
        private Input<CreateClientAccountInput> createClientAccountInput = Input.absent();

        public CreateInitialProductPlanSubscriptionInput build() {
            Utils.checkNotNull(this.createProductPlanSubscriptionInput, "createProductPlanSubscriptionInput == null");
            return new CreateInitialProductPlanSubscriptionInput(this.overrideExisting, this.createProductPlanSubscriptionInput, this.createClientAccountInput);
        }

        public Builder createClientAccountInput(CreateClientAccountInput createClientAccountInput) {
            this.createClientAccountInput = Input.fromNullable(createClientAccountInput);
            return this;
        }

        public Builder createProductPlanSubscriptionInput(CreateProductPlanSubscriptionInput createProductPlanSubscriptionInput) {
            this.createProductPlanSubscriptionInput = createProductPlanSubscriptionInput;
            return this;
        }

        public Builder overrideExisting(Boolean bool) {
            this.overrideExisting = Input.fromNullable(bool);
            return this;
        }
    }

    public CreateInitialProductPlanSubscriptionInput(Input<Boolean> input, CreateProductPlanSubscriptionInput createProductPlanSubscriptionInput, Input<CreateClientAccountInput> input2) {
        this.overrideExisting = input;
        this.createProductPlanSubscriptionInput = createProductPlanSubscriptionInput;
        this.createClientAccountInput = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CreateClientAccountInput createClientAccountInput() {
        return this.createClientAccountInput.value;
    }

    public CreateProductPlanSubscriptionInput createProductPlanSubscriptionInput() {
        return this.createProductPlanSubscriptionInput;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateInitialProductPlanSubscriptionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateInitialProductPlanSubscriptionInput.this.overrideExisting.defined) {
                    inputFieldWriter.writeBoolean("overrideExisting", (Boolean) CreateInitialProductPlanSubscriptionInput.this.overrideExisting.value);
                }
                inputFieldWriter.writeObject("createProductPlanSubscriptionInput", CreateInitialProductPlanSubscriptionInput.this.createProductPlanSubscriptionInput.marshaller());
                if (CreateInitialProductPlanSubscriptionInput.this.createClientAccountInput.defined) {
                    inputFieldWriter.writeObject("createClientAccountInput", CreateInitialProductPlanSubscriptionInput.this.createClientAccountInput.value != 0 ? ((CreateClientAccountInput) CreateInitialProductPlanSubscriptionInput.this.createClientAccountInput.value).marshaller() : null);
                }
            }
        };
    }

    public Boolean overrideExisting() {
        return this.overrideExisting.value;
    }
}
