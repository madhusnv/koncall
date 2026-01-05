package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAuthorizationLevelInput implements InputType {
    private final Input<AuthorizationLevel> eq;
    private final Input<AuthorizationLevel> ne;

    public static final class Builder {
        private Input<AuthorizationLevel> eq = Input.absent();
        private Input<AuthorizationLevel> ne = Input.absent();

        public ModelAuthorizationLevelInput build() {
            return new ModelAuthorizationLevelInput(this.eq, this.ne);
        }

        public Builder eq(AuthorizationLevel authorizationLevel) {
            this.eq = Input.fromNullable(authorizationLevel);
            return this;
        }

        public Builder ne(AuthorizationLevel authorizationLevel) {
            this.ne = Input.fromNullable(authorizationLevel);
            return this;
        }
    }

    public ModelAuthorizationLevelInput(Input<AuthorizationLevel> input, Input<AuthorizationLevel> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AuthorizationLevel eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAuthorizationLevelInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAuthorizationLevelInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelAuthorizationLevelInput.this.eq.value != 0 ? ((AuthorizationLevel) ModelAuthorizationLevelInput.this.eq.value).name() : null);
                }
                if (ModelAuthorizationLevelInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelAuthorizationLevelInput.this.ne.value != 0 ? ((AuthorizationLevel) ModelAuthorizationLevelInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public AuthorizationLevel ne() {
        return this.ne.value;
    }
}
