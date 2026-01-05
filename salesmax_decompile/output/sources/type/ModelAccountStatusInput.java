package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAccountStatusInput implements InputType {
    private final Input<AccountStatus> eq;
    private final Input<AccountStatus> ne;

    public static final class Builder {
        private Input<AccountStatus> eq = Input.absent();
        private Input<AccountStatus> ne = Input.absent();

        public ModelAccountStatusInput build() {
            return new ModelAccountStatusInput(this.eq, this.ne);
        }

        public Builder eq(AccountStatus accountStatus) {
            this.eq = Input.fromNullable(accountStatus);
            return this;
        }

        public Builder ne(AccountStatus accountStatus) {
            this.ne = Input.fromNullable(accountStatus);
            return this;
        }
    }

    public ModelAccountStatusInput(Input<AccountStatus> input, Input<AccountStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AccountStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAccountStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAccountStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelAccountStatusInput.this.eq.value != 0 ? ((AccountStatus) ModelAccountStatusInput.this.eq.value).name() : null);
                }
                if (ModelAccountStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelAccountStatusInput.this.ne.value != 0 ? ((AccountStatus) ModelAccountStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public AccountStatus ne() {
        return this.ne.value;
    }
}
