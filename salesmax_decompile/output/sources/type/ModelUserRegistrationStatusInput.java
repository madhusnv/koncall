package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelUserRegistrationStatusInput implements InputType {
    private final Input<UserRegistrationStatus> eq;
    private final Input<UserRegistrationStatus> ne;

    public static final class Builder {
        private Input<UserRegistrationStatus> eq = Input.absent();
        private Input<UserRegistrationStatus> ne = Input.absent();

        public ModelUserRegistrationStatusInput build() {
            return new ModelUserRegistrationStatusInput(this.eq, this.ne);
        }

        public Builder eq(UserRegistrationStatus userRegistrationStatus) {
            this.eq = Input.fromNullable(userRegistrationStatus);
            return this;
        }

        public Builder ne(UserRegistrationStatus userRegistrationStatus) {
            this.ne = Input.fromNullable(userRegistrationStatus);
            return this;
        }
    }

    public ModelUserRegistrationStatusInput(Input<UserRegistrationStatus> input, Input<UserRegistrationStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public UserRegistrationStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUserRegistrationStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUserRegistrationStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelUserRegistrationStatusInput.this.eq.value != 0 ? ((UserRegistrationStatus) ModelUserRegistrationStatusInput.this.eq.value).name() : null);
                }
                if (ModelUserRegistrationStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelUserRegistrationStatusInput.this.ne.value != 0 ? ((UserRegistrationStatus) ModelUserRegistrationStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public UserRegistrationStatus ne() {
        return this.ne.value;
    }
}
