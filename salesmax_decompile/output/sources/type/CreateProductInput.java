package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateProductInput implements InputType {
    private final String accountId;
    private final Input<String> id;
    private final Input<String> name;
    private final Input<String> productDescription;
    private final Input<String> productType;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> productDescription = Input.absent();
        private Input<String> productType = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateProductInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateProductInput(this.id, this.accountId, this.name, this.productDescription, this.productType);
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder productDescription(String str) {
            this.productDescription = Input.fromNullable(str);
            return this;
        }

        public Builder productType(String str) {
            this.productType = Input.fromNullable(str);
            return this;
        }
    }

    public CreateProductInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4) {
        this.id = input;
        this.accountId = str;
        this.name = input2;
        this.productDescription = input3;
        this.productType = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateProductInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateProductInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateProductInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateProductInput.this.accountId);
                if (CreateProductInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateProductInput.this.name.value);
                }
                if (CreateProductInput.this.productDescription.defined) {
                    inputFieldWriter.writeString("productDescription", (String) CreateProductInput.this.productDescription.value);
                }
                if (CreateProductInput.this.productType.defined) {
                    inputFieldWriter.writeString("productType", (String) CreateProductInput.this.productType.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String productDescription() {
        return this.productDescription.value;
    }

    public String productType() {
        return this.productType.value;
    }
}
