package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelContactStatusInput implements InputType {
    private final Input<ContactStatus> eq;
    private final Input<ContactStatus> ne;

    public static final class Builder {
        private Input<ContactStatus> eq = Input.absent();
        private Input<ContactStatus> ne = Input.absent();

        public ModelContactStatusInput build() {
            return new ModelContactStatusInput(this.eq, this.ne);
        }

        public Builder eq(ContactStatus contactStatus) {
            this.eq = Input.fromNullable(contactStatus);
            return this;
        }

        public Builder ne(ContactStatus contactStatus) {
            this.ne = Input.fromNullable(contactStatus);
            return this;
        }
    }

    public ModelContactStatusInput(Input<ContactStatus> input, Input<ContactStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ContactStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelContactStatusInput.this.eq.value != 0 ? ((ContactStatus) ModelContactStatusInput.this.eq.value).name() : null);
                }
                if (ModelContactStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelContactStatusInput.this.ne.value != 0 ? ((ContactStatus) ModelContactStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ContactStatus ne() {
        return this.ne.value;
    }
}
