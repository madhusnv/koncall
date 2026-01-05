package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelActivityRelatedObjectTypeInput implements InputType {
    private final Input<ActivityRelatedObjectType> eq;
    private final Input<ActivityRelatedObjectType> ne;

    public static final class Builder {
        private Input<ActivityRelatedObjectType> eq = Input.absent();
        private Input<ActivityRelatedObjectType> ne = Input.absent();

        public ModelActivityRelatedObjectTypeInput build() {
            return new ModelActivityRelatedObjectTypeInput(this.eq, this.ne);
        }

        public Builder eq(ActivityRelatedObjectType activityRelatedObjectType) {
            this.eq = Input.fromNullable(activityRelatedObjectType);
            return this;
        }

        public Builder ne(ActivityRelatedObjectType activityRelatedObjectType) {
            this.ne = Input.fromNullable(activityRelatedObjectType);
            return this;
        }
    }

    public ModelActivityRelatedObjectTypeInput(Input<ActivityRelatedObjectType> input, Input<ActivityRelatedObjectType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ActivityRelatedObjectType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityRelatedObjectTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityRelatedObjectTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelActivityRelatedObjectTypeInput.this.eq.value != 0 ? ((ActivityRelatedObjectType) ModelActivityRelatedObjectTypeInput.this.eq.value).name() : null);
                }
                if (ModelActivityRelatedObjectTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelActivityRelatedObjectTypeInput.this.ne.value != 0 ? ((ActivityRelatedObjectType) ModelActivityRelatedObjectTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ActivityRelatedObjectType ne() {
        return this.ne.value;
    }
}
