package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class TemplateParameterInput implements InputType {
    private final Input<String> index;
    private final Input<List<ParameterInput>> parameters;
    private final Input<String> sub_type;
    private final Input<String> taType;

    public static final class Builder {
        private Input<String> taType = Input.absent();
        private Input<String> sub_type = Input.absent();
        private Input<String> index = Input.absent();
        private Input<List<ParameterInput>> parameters = Input.absent();

        public TemplateParameterInput build() {
            return new TemplateParameterInput(this.taType, this.sub_type, this.index, this.parameters);
        }

        public Builder index(String str) {
            this.index = Input.fromNullable(str);
            return this;
        }

        public Builder parameters(List<ParameterInput> list) {
            this.parameters = Input.fromNullable(list);
            return this;
        }

        public Builder sub_type(String str) {
            this.sub_type = Input.fromNullable(str);
            return this;
        }

        public Builder taType(String str) {
            this.taType = Input.fromNullable(str);
            return this;
        }
    }

    public TemplateParameterInput(Input<String> input, Input<String> input2, Input<String> input3, Input<List<ParameterInput>> input4) {
        this.taType = input;
        this.sub_type = input2;
        this.index = input3;
        this.parameters = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String index() {
        return this.index.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.TemplateParameterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (TemplateParameterInput.this.taType.defined) {
                    inputFieldWriter.writeString("taType", (String) TemplateParameterInput.this.taType.value);
                }
                if (TemplateParameterInput.this.sub_type.defined) {
                    inputFieldWriter.writeString("sub_type", (String) TemplateParameterInput.this.sub_type.value);
                }
                if (TemplateParameterInput.this.index.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.INDEX, (String) TemplateParameterInput.this.index.value);
                }
                if (TemplateParameterInput.this.parameters.defined) {
                    inputFieldWriter.writeList("parameters", TemplateParameterInput.this.parameters.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.TemplateParameterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) TemplateParameterInput.this.parameters.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ParameterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public List<ParameterInput> parameters() {
        return this.parameters.value;
    }

    public String sub_type() {
        return this.sub_type.value;
    }

    public String taType() {
        return this.taType.value;
    }
}
