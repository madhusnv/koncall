package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelUserStatusInput implements InputType {
    private final Input<UserStatus> eq;
    private final Input<UserStatus> ne;

    public static final class Builder {
        private Input<UserStatus> eq = Input.absent();
        private Input<UserStatus> ne = Input.absent();

        public ModelUserStatusInput build() {
            return new ModelUserStatusInput(this.eq, this.ne);
        }

        public Builder eq(UserStatus userStatus) {
            this.eq = Input.fromNullable(userStatus);
            return this;
        }

        public Builder ne(UserStatus userStatus) {
            this.ne = Input.fromNullable(userStatus);
            return this;
        }
    }

    public ModelUserStatusInput(Input<UserStatus> input, Input<UserStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public UserStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUserStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUserStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelUserStatusInput.this.eq.value != 0 ? ((UserStatus) ModelUserStatusInput.this.eq.value).name() : null);
                }
                if (ModelUserStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelUserStatusInput.this.ne.value != 0 ? ((UserStatus) ModelUserStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public UserStatus ne() {
        return this.ne.value;
    }
}
