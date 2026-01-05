package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateProductInput implements InputType {
    private final Input<String> accountId;
    private final String id;
    private final Input<String> name;
    private final Input<String> productDescription;
    private final Input<String> productType;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> productDescription = Input.absent();
        private Input<String> productType = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateProductInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateProductInput(this.id, this.accountId, this.name, this.productDescription, this.productType);
        }

        public Builder id(String str) {
            this.id = str;
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

    public UpdateProductInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
        this.id = str;
        this.accountId = input;
        this.name = input2;
        this.productDescription = input3;
        this.productType = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateProductInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateProductInput.this.id);
                if (UpdateProductInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateProductInput.this.accountId.value);
                }
                if (UpdateProductInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateProductInput.this.name.value);
                }
                if (UpdateProductInput.this.productDescription.defined) {
                    inputFieldWriter.writeString("productDescription", (String) UpdateProductInput.this.productDescription.value);
                }
                if (UpdateProductInput.this.productType.defined) {
                    inputFieldWriter.writeString("productType", (String) UpdateProductInput.this.productType.value);
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
