package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEntityListStatusInput implements InputType {
    private final Input<EntityListStatus> eq;
    private final Input<EntityListStatus> ne;

    public static final class Builder {
        private Input<EntityListStatus> eq = Input.absent();
        private Input<EntityListStatus> ne = Input.absent();

        public ModelEntityListStatusInput build() {
            return new ModelEntityListStatusInput(this.eq, this.ne);
        }

        public Builder eq(EntityListStatus entityListStatus) {
            this.eq = Input.fromNullable(entityListStatus);
            return this;
        }

        public Builder ne(EntityListStatus entityListStatus) {
            this.ne = Input.fromNullable(entityListStatus);
            return this;
        }
    }

    public ModelEntityListStatusInput(Input<EntityListStatus> input, Input<EntityListStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EntityListStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelEntityListStatusInput.this.eq.value != 0 ? ((EntityListStatus) ModelEntityListStatusInput.this.eq.value).name() : null);
                }
                if (ModelEntityListStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelEntityListStatusInput.this.ne.value != 0 ? ((EntityListStatus) ModelEntityListStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public EntityListStatus ne() {
        return this.ne.value;
    }
}
