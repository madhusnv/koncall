package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableIDFilterInputWithExists implements InputType {
    private final Input<String> eq;
    private final Input<Boolean> exists;

    public static final class Builder {
        private Input<String> eq = Input.absent();
        private Input<Boolean> exists = Input.absent();

        public SearchableIDFilterInputWithExists build() {
            return new SearchableIDFilterInputWithExists(this.eq, this.exists);
        }

        public Builder eq(String str) {
            this.eq = Input.fromNullable(str);
            return this;
        }

        public Builder exists(Boolean bool) {
            this.exists = Input.fromNullable(bool);
            return this;
        }
    }

    public SearchableIDFilterInputWithExists(Input<String> input, Input<Boolean> input2) {
        this.eq = input;
        this.exists = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String eq() {
        return this.eq.value;
    }

    public Boolean exists() {
        return this.exists.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableIDFilterInputWithExists.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableIDFilterInputWithExists.this.eq.defined) {
                    inputFieldWriter.writeString("eq", (String) SearchableIDFilterInputWithExists.this.eq.value);
                }
                if (SearchableIDFilterInputWithExists.this.exists.defined) {
                    inputFieldWriter.writeBoolean("exists", (Boolean) SearchableIDFilterInputWithExists.this.exists.value);
                }
            }
        };
    }
}
