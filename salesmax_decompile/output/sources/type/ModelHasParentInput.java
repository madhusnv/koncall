package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelHasParentInput implements InputType {
    private final Input<HasParent> eq;
    private final Input<HasParent> ne;

    public static final class Builder {
        private Input<HasParent> eq = Input.absent();
        private Input<HasParent> ne = Input.absent();

        public ModelHasParentInput build() {
            return new ModelHasParentInput(this.eq, this.ne);
        }

        public Builder eq(HasParent hasParent) {
            this.eq = Input.fromNullable(hasParent);
            return this;
        }

        public Builder ne(HasParent hasParent) {
            this.ne = Input.fromNullable(hasParent);
            return this;
        }
    }

    public ModelHasParentInput(Input<HasParent> input, Input<HasParent> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public HasParent eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelHasParentInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelHasParentInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelHasParentInput.this.eq.value != 0 ? ((HasParent) ModelHasParentInput.this.eq.value).name() : null);
                }
                if (ModelHasParentInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelHasParentInput.this.ne.value != 0 ? ((HasParent) ModelHasParentInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public HasParent ne() {
        return this.ne.value;
    }
}
