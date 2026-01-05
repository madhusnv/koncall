package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEntityListTypeInput implements InputType {
    private final Input<EntityListType> eq;
    private final Input<EntityListType> ne;

    public static final class Builder {
        private Input<EntityListType> eq = Input.absent();
        private Input<EntityListType> ne = Input.absent();

        public ModelEntityListTypeInput build() {
            return new ModelEntityListTypeInput(this.eq, this.ne);
        }

        public Builder eq(EntityListType entityListType) {
            this.eq = Input.fromNullable(entityListType);
            return this;
        }

        public Builder ne(EntityListType entityListType) {
            this.ne = Input.fromNullable(entityListType);
            return this;
        }
    }

    public ModelEntityListTypeInput(Input<EntityListType> input, Input<EntityListType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EntityListType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelEntityListTypeInput.this.eq.value != 0 ? ((EntityListType) ModelEntityListTypeInput.this.eq.value).name() : null);
                }
                if (ModelEntityListTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelEntityListTypeInput.this.ne.value != 0 ? ((EntityListType) ModelEntityListTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public EntityListType ne() {
        return this.ne.value;
    }
}
