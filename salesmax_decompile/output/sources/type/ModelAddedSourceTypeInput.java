package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAddedSourceTypeInput implements InputType {
    private final Input<AddedSourceType> eq;
    private final Input<AddedSourceType> ne;

    public static final class Builder {
        private Input<AddedSourceType> eq = Input.absent();
        private Input<AddedSourceType> ne = Input.absent();

        public ModelAddedSourceTypeInput build() {
            return new ModelAddedSourceTypeInput(this.eq, this.ne);
        }

        public Builder eq(AddedSourceType addedSourceType) {
            this.eq = Input.fromNullable(addedSourceType);
            return this;
        }

        public Builder ne(AddedSourceType addedSourceType) {
            this.ne = Input.fromNullable(addedSourceType);
            return this;
        }
    }

    public ModelAddedSourceTypeInput(Input<AddedSourceType> input, Input<AddedSourceType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AddedSourceType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAddedSourceTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAddedSourceTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelAddedSourceTypeInput.this.eq.value != 0 ? ((AddedSourceType) ModelAddedSourceTypeInput.this.eq.value).name() : null);
                }
                if (ModelAddedSourceTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelAddedSourceTypeInput.this.ne.value != 0 ? ((AddedSourceType) ModelAddedSourceTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public AddedSourceType ne() {
        return this.ne.value;
    }
}
