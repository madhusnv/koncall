package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelActionTypeInput implements InputType {
    private final Input<ActionType> eq;
    private final Input<ActionType> ne;

    public static final class Builder {
        private Input<ActionType> eq = Input.absent();
        private Input<ActionType> ne = Input.absent();

        public ModelActionTypeInput build() {
            return new ModelActionTypeInput(this.eq, this.ne);
        }

        public Builder eq(ActionType actionType) {
            this.eq = Input.fromNullable(actionType);
            return this;
        }

        public Builder ne(ActionType actionType) {
            this.ne = Input.fromNullable(actionType);
            return this;
        }
    }

    public ModelActionTypeInput(Input<ActionType> input, Input<ActionType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ActionType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActionTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActionTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelActionTypeInput.this.eq.value != 0 ? ((ActionType) ModelActionTypeInput.this.eq.value).name() : null);
                }
                if (ModelActionTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelActionTypeInput.this.ne.value != 0 ? ((ActionType) ModelActionTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ActionType ne() {
        return this.ne.value;
    }
}
