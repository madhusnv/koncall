package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class QueryGetObjectPropertiesQueryInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> entity;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> entity = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public QueryGetObjectPropertiesQueryInput build() {
            return new QueryGetObjectPropertiesQueryInput(this.accountId, this.entity);
        }

        public Builder entity(String str) {
            this.entity = Input.fromNullable(str);
            return this;
        }
    }

    public QueryGetObjectPropertiesQueryInput(Input<String> input, Input<String> input2) {
        this.accountId = input;
        this.entity = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String entity() {
        return this.entity.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryGetObjectPropertiesQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryGetObjectPropertiesQueryInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryGetObjectPropertiesQueryInput.this.accountId.value);
                }
                if (QueryGetObjectPropertiesQueryInput.this.entity.defined) {
                    inputFieldWriter.writeString("entity", (String) QueryGetObjectPropertiesQueryInput.this.entity.value);
                }
            }
        };
    }
}
