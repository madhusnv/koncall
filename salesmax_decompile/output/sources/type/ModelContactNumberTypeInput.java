package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelContactNumberTypeInput implements InputType {
    private final Input<ContactNumberType> eq;
    private final Input<ContactNumberType> ne;

    public static final class Builder {
        private Input<ContactNumberType> eq = Input.absent();
        private Input<ContactNumberType> ne = Input.absent();

        public ModelContactNumberTypeInput build() {
            return new ModelContactNumberTypeInput(this.eq, this.ne);
        }

        public Builder eq(ContactNumberType contactNumberType) {
            this.eq = Input.fromNullable(contactNumberType);
            return this;
        }

        public Builder ne(ContactNumberType contactNumberType) {
            this.ne = Input.fromNullable(contactNumberType);
            return this;
        }
    }

    public ModelContactNumberTypeInput(Input<ContactNumberType> input, Input<ContactNumberType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ContactNumberType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactNumberTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactNumberTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelContactNumberTypeInput.this.eq.value != 0 ? ((ContactNumberType) ModelContactNumberTypeInput.this.eq.value).name() : null);
                }
                if (ModelContactNumberTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelContactNumberTypeInput.this.ne.value != 0 ? ((ContactNumberType) ModelContactNumberTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ContactNumberType ne() {
        return this.ne.value;
    }
}
