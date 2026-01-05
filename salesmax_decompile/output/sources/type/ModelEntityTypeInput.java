package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEntityTypeInput implements InputType {
    private final Input<EntityType> eq;
    private final Input<EntityType> ne;

    public static final class Builder {
        private Input<EntityType> eq = Input.absent();
        private Input<EntityType> ne = Input.absent();

        public ModelEntityTypeInput build() {
            return new ModelEntityTypeInput(this.eq, this.ne);
        }

        public Builder eq(EntityType entityType) {
            this.eq = Input.fromNullable(entityType);
            return this;
        }

        public Builder ne(EntityType entityType) {
            this.ne = Input.fromNullable(entityType);
            return this;
        }
    }

    public ModelEntityTypeInput(Input<EntityType> input, Input<EntityType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EntityType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelEntityTypeInput.this.eq.value != 0 ? ((EntityType) ModelEntityTypeInput.this.eq.value).name() : null);
                }
                if (ModelEntityTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelEntityTypeInput.this.ne.value != 0 ? ((EntityType) ModelEntityTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public EntityType ne() {
        return this.ne.value;
    }
}
