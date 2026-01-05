package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelTaskActivityTypeInput implements InputType {
    private final Input<TaskActivityType> eq;
    private final Input<TaskActivityType> ne;

    public static final class Builder {
        private Input<TaskActivityType> eq = Input.absent();
        private Input<TaskActivityType> ne = Input.absent();

        public ModelTaskActivityTypeInput build() {
            return new ModelTaskActivityTypeInput(this.eq, this.ne);
        }

        public Builder eq(TaskActivityType taskActivityType) {
            this.eq = Input.fromNullable(taskActivityType);
            return this;
        }

        public Builder ne(TaskActivityType taskActivityType) {
            this.ne = Input.fromNullable(taskActivityType);
            return this;
        }
    }

    public ModelTaskActivityTypeInput(Input<TaskActivityType> input, Input<TaskActivityType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public TaskActivityType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTaskActivityTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTaskActivityTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelTaskActivityTypeInput.this.eq.value != 0 ? ((TaskActivityType) ModelTaskActivityTypeInput.this.eq.value).name() : null);
                }
                if (ModelTaskActivityTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelTaskActivityTypeInput.this.ne.value != 0 ? ((TaskActivityType) ModelTaskActivityTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public TaskActivityType ne() {
        return this.ne.value;
    }
}
