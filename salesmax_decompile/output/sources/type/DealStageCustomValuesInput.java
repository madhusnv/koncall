package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DealStageCustomValuesInput implements InputType {
    private final Input<String> customValue;
    private final String dealStage;

    public static final class Builder {
        private Input<String> customValue = Input.absent();
        private String dealStage;

        public DealStageCustomValuesInput build() {
            Utils.checkNotNull(this.dealStage, "dealStage == null");
            return new DealStageCustomValuesInput(this.dealStage, this.customValue);
        }

        public Builder customValue(String str) {
            this.customValue = Input.fromNullable(str);
            return this;
        }

        public Builder dealStage(String str) {
            this.dealStage = str;
            return this;
        }
    }

    public DealStageCustomValuesInput(String str, Input<String> input) {
        this.dealStage = str;
        this.customValue = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String customValue() {
        return this.customValue.value;
    }

    public String dealStage() {
        return this.dealStage;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DealStageCustomValuesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("dealStage", DealStageCustomValuesInput.this.dealStage);
                if (DealStageCustomValuesInput.this.customValue.defined) {
                    inputFieldWriter.writeString("customValue", (String) DealStageCustomValuesInput.this.customValue.value);
                }
            }
        };
    }
}
