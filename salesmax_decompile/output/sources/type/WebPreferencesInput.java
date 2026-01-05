package type;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class WebPreferencesInput implements InputType {
    private final Input<String> key;
    private final Input<String> value;

    public static final class Builder {
        private Input<String> key = Input.absent();
        private Input<String> value = Input.absent();

        public WebPreferencesInput build() {
            return new WebPreferencesInput(this.key, this.value);
        }

        public Builder key(String str) {
            this.key = Input.fromNullable(str);
            return this;
        }

        public Builder value(String str) {
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public WebPreferencesInput(Input<String> input, Input<String> input2) {
        this.key = input;
        this.value = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String key() {
        return this.key.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WebPreferencesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WebPreferencesInput.this.key.defined) {
                    inputFieldWriter.writeString(TransferTable.COLUMN_KEY, (String) WebPreferencesInput.this.key.value);
                }
                if (WebPreferencesInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) WebPreferencesInput.this.value.value);
                }
            }
        };
    }

    public String value() {
        return this.value.value;
    }
}
