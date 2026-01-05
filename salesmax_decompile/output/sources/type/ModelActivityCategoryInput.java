package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelActivityCategoryInput implements InputType {
    private final Input<ActivityCategory> eq;
    private final Input<ActivityCategory> ne;

    public static final class Builder {
        private Input<ActivityCategory> eq = Input.absent();
        private Input<ActivityCategory> ne = Input.absent();

        public ModelActivityCategoryInput build() {
            return new ModelActivityCategoryInput(this.eq, this.ne);
        }

        public Builder eq(ActivityCategory activityCategory) {
            this.eq = Input.fromNullable(activityCategory);
            return this;
        }

        public Builder ne(ActivityCategory activityCategory) {
            this.ne = Input.fromNullable(activityCategory);
            return this;
        }
    }

    public ModelActivityCategoryInput(Input<ActivityCategory> input, Input<ActivityCategory> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ActivityCategory eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityCategoryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityCategoryInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelActivityCategoryInput.this.eq.value != 0 ? ((ActivityCategory) ModelActivityCategoryInput.this.eq.value).name() : null);
                }
                if (ModelActivityCategoryInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelActivityCategoryInput.this.ne.value != 0 ? ((ActivityCategory) ModelActivityCategoryInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ActivityCategory ne() {
        return this.ne.value;
    }
}
