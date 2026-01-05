package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class QueryGetWabaProductsBodyInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> idType;
    private final Input<List<String>> ids;
    private final Input<String> wabaId;
    private final Input<String> whatsappRequestType;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> whatsappRequestType = Input.absent();
        private Input<String> wabaId = Input.absent();
        private Input<String> idType = Input.absent();
        private Input<List<String>> ids = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public QueryGetWabaProductsBodyInput build() {
            return new QueryGetWabaProductsBodyInput(this.accountId, this.whatsappRequestType, this.wabaId, this.idType, this.ids);
        }

        public Builder idType(String str) {
            this.idType = Input.fromNullable(str);
            return this;
        }

        public Builder ids(List<String> list) {
            this.ids = Input.fromNullable(list);
            return this;
        }

        public Builder wabaId(String str) {
            this.wabaId = Input.fromNullable(str);
            return this;
        }

        public Builder whatsappRequestType(String str) {
            this.whatsappRequestType = Input.fromNullable(str);
            return this;
        }
    }

    public QueryGetWabaProductsBodyInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<List<String>> input5) {
        this.accountId = input;
        this.whatsappRequestType = input2;
        this.wabaId = input3;
        this.idType = input4;
        this.ids = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String idType() {
        return this.idType.value;
    }

    public List<String> ids() {
        return this.ids.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryGetWabaProductsBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryGetWabaProductsBodyInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryGetWabaProductsBodyInput.this.accountId.value);
                }
                if (QueryGetWabaProductsBodyInput.this.whatsappRequestType.defined) {
                    inputFieldWriter.writeString("whatsappRequestType", (String) QueryGetWabaProductsBodyInput.this.whatsappRequestType.value);
                }
                if (QueryGetWabaProductsBodyInput.this.wabaId.defined) {
                    inputFieldWriter.writeString("wabaId", (String) QueryGetWabaProductsBodyInput.this.wabaId.value);
                }
                if (QueryGetWabaProductsBodyInput.this.idType.defined) {
                    inputFieldWriter.writeString("idType", (String) QueryGetWabaProductsBodyInput.this.idType.value);
                }
                if (QueryGetWabaProductsBodyInput.this.ids.defined) {
                    inputFieldWriter.writeList("ids", QueryGetWabaProductsBodyInput.this.ids.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.QueryGetWabaProductsBodyInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) QueryGetWabaProductsBodyInput.this.ids.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public String wabaId() {
        return this.wabaId.value;
    }

    public String whatsappRequestType() {
        return this.whatsappRequestType.value;
    }
}
