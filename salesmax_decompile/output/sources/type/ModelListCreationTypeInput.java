package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelListCreationTypeInput implements InputType {
    private final Input<ListCreationType> eq;
    private final Input<ListCreationType> ne;

    public static final class Builder {
        private Input<ListCreationType> eq = Input.absent();
        private Input<ListCreationType> ne = Input.absent();

        public ModelListCreationTypeInput build() {
            return new ModelListCreationTypeInput(this.eq, this.ne);
        }

        public Builder eq(ListCreationType listCreationType) {
            this.eq = Input.fromNullable(listCreationType);
            return this;
        }

        public Builder ne(ListCreationType listCreationType) {
            this.ne = Input.fromNullable(listCreationType);
            return this;
        }
    }

    public ModelListCreationTypeInput(Input<ListCreationType> input, Input<ListCreationType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ListCreationType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelListCreationTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelListCreationTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelListCreationTypeInput.this.eq.value != 0 ? ((ListCreationType) ModelListCreationTypeInput.this.eq.value).name() : null);
                }
                if (ModelListCreationTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelListCreationTypeInput.this.ne.value != 0 ? ((ListCreationType) ModelListCreationTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ListCreationType ne() {
        return this.ne.value;
    }
}
