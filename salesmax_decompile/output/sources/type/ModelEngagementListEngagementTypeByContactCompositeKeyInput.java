package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEngagementListEngagementTypeByContactCompositeKeyInput implements InputType {
    private final Input<EngagementType> engagementType;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<EngagementType> engagementType = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelEngagementListEngagementTypeByContactCompositeKeyInput build() {
            return new ModelEngagementListEngagementTypeByContactCompositeKeyInput(this.engagementType, this.updatedAt);
        }

        public Builder engagementType(EngagementType engagementType) {
            this.engagementType = Input.fromNullable(engagementType);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput(Input<EngagementType> input, Input<String> input2) {
        this.engagementType = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EngagementType engagementType() {
        return this.engagementType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementListEngagementTypeByContactCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementListEngagementTypeByContactCompositeKeyInput.this.engagementType.defined) {
                    inputFieldWriter.writeString("engagementType", ModelEngagementListEngagementTypeByContactCompositeKeyInput.this.engagementType.value != 0 ? ((EngagementType) ModelEngagementListEngagementTypeByContactCompositeKeyInput.this.engagementType.value).name() : null);
                }
                if (ModelEngagementListEngagementTypeByContactCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelEngagementListEngagementTypeByContactCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
