package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelDataExportOutputExportsByUserCompositeKeyInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public ModelDataExportOutputExportsByUserCompositeKeyInput build() {
            return new ModelDataExportOutputExportsByUserCompositeKeyInput(this.accountId, this.updatedAt);
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelDataExportOutputExportsByUserCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.accountId = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDataExportOutputExportsByUserCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDataExportOutputExportsByUserCompositeKeyInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) ModelDataExportOutputExportsByUserCompositeKeyInput.this.accountId.value);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelDataExportOutputExportsByUserCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
