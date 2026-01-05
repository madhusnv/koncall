package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAccountTypeInput implements InputType {
    private final Input<AccountType> eq;
    private final Input<AccountType> ne;

    public static final class Builder {
        private Input<AccountType> eq = Input.absent();
        private Input<AccountType> ne = Input.absent();

        public ModelAccountTypeInput build() {
            return new ModelAccountTypeInput(this.eq, this.ne);
        }

        public Builder eq(AccountType accountType) {
            this.eq = Input.fromNullable(accountType);
            return this;
        }

        public Builder ne(AccountType accountType) {
            this.ne = Input.fromNullable(accountType);
            return this;
        }
    }

    public ModelAccountTypeInput(Input<AccountType> input, Input<AccountType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AccountType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelAccountTypeInput.this.eq.value != 0 ? ((AccountType) ModelAccountTypeInput.this.eq.value).name() : null);
                }
                if (ModelAccountTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelAccountTypeInput.this.ne.value != 0 ? ((AccountType) ModelAccountTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public AccountType ne() {
        return this.ne.value;
    }
}
