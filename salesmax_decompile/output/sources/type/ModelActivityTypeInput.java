package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelActivityTypeInput implements InputType {
    private final Input<ActivityType> eq;
    private final Input<ActivityType> ne;

    public static final class Builder {
        private Input<ActivityType> eq = Input.absent();
        private Input<ActivityType> ne = Input.absent();

        public ModelActivityTypeInput build() {
            return new ModelActivityTypeInput(this.eq, this.ne);
        }

        public Builder eq(ActivityType activityType) {
            this.eq = Input.fromNullable(activityType);
            return this;
        }

        public Builder ne(ActivityType activityType) {
            this.ne = Input.fromNullable(activityType);
            return this;
        }
    }

    public ModelActivityTypeInput(Input<ActivityType> input, Input<ActivityType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ActivityType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelActivityTypeInput.this.eq.value != 0 ? ((ActivityType) ModelActivityTypeInput.this.eq.value).name() : null);
                }
                if (ModelActivityTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelActivityTypeInput.this.ne.value != 0 ? ((ActivityType) ModelActivityTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ActivityType ne() {
        return this.ne.value;
    }
}
