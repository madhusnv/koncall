package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelSavedTableViewsPrimaryCompositeKeyInput implements InputType {
    private final Input<String> ownerId;
    private final Input<String> tableName;
    private final Input<String> viewName;

    public static final class Builder {
        private Input<String> ownerId = Input.absent();
        private Input<String> tableName = Input.absent();
        private Input<String> viewName = Input.absent();

        public ModelSavedTableViewsPrimaryCompositeKeyInput build() {
            return new ModelSavedTableViewsPrimaryCompositeKeyInput(this.ownerId, this.tableName, this.viewName);
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder tableName(String str) {
            this.tableName = Input.fromNullable(str);
            return this;
        }

        public Builder viewName(String str) {
            this.viewName = Input.fromNullable(str);
            return this;
        }
    }

    public ModelSavedTableViewsPrimaryCompositeKeyInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.ownerId = input;
        this.tableName = input2;
        this.viewName = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSavedTableViewsPrimaryCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSavedTableViewsPrimaryCompositeKeyInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) ModelSavedTableViewsPrimaryCompositeKeyInput.this.ownerId.value);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyInput.this.tableName.defined) {
                    inputFieldWriter.writeString("tableName", (String) ModelSavedTableViewsPrimaryCompositeKeyInput.this.tableName.value);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyInput.this.viewName.defined) {
                    inputFieldWriter.writeString("viewName", (String) ModelSavedTableViewsPrimaryCompositeKeyInput.this.viewName.value);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String tableName() {
        return this.tableName.value;
    }

    public String viewName() {
        return this.viewName.value;
    }
}
