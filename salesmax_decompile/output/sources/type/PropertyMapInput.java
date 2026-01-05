package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class PropertyMapInput implements InputType {
    private final Input<List<PropertyMap>> parameters;

    public static final class Builder {
        private Input<List<PropertyMap>> parameters = Input.absent();

        public PropertyMapInput build() {
            return new PropertyMapInput(this.parameters);
        }

        public Builder parameters(List<PropertyMap> list) {
            this.parameters = Input.fromNullable(list);
            return this;
        }
    }

    public PropertyMapInput(Input<List<PropertyMap>> input) {
        this.parameters = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.PropertyMapInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (PropertyMapInput.this.parameters.defined) {
                    inputFieldWriter.writeList("parameters", PropertyMapInput.this.parameters.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.PropertyMapInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) PropertyMapInput.this.parameters.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PropertyMap) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public List<PropertyMap> parameters() {
        return this.parameters.value;
    }
}
