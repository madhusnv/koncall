package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FormStepSchemaInput implements InputType {
    private final Input<List<FieldGroupInput>> fieldGroups;
    private final Input<List<FieldsInput>> fields;
    private final Input<LayoutType> layoutType;
    private final Input<Integer> numberOfColumns;
    private final Input<String> stepTitle;

    public static final class Builder {
        private Input<String> stepTitle = Input.absent();
        private Input<List<FieldsInput>> fields = Input.absent();
        private Input<List<FieldGroupInput>> fieldGroups = Input.absent();
        private Input<LayoutType> layoutType = Input.absent();
        private Input<Integer> numberOfColumns = Input.absent();

        public FormStepSchemaInput build() {
            return new FormStepSchemaInput(this.stepTitle, this.fields, this.fieldGroups, this.layoutType, this.numberOfColumns);
        }

        public Builder fieldGroups(List<FieldGroupInput> list) {
            this.fieldGroups = Input.fromNullable(list);
            return this;
        }

        public Builder fields(List<FieldsInput> list) {
            this.fields = Input.fromNullable(list);
            return this;
        }

        public Builder layoutType(LayoutType layoutType) {
            this.layoutType = Input.fromNullable(layoutType);
            return this;
        }

        public Builder numberOfColumns(Integer num) {
            this.numberOfColumns = Input.fromNullable(num);
            return this;
        }

        public Builder stepTitle(String str) {
            this.stepTitle = Input.fromNullable(str);
            return this;
        }
    }

    public FormStepSchemaInput(Input<String> input, Input<List<FieldsInput>> input2, Input<List<FieldGroupInput>> input3, Input<LayoutType> input4, Input<Integer> input5) {
        this.stepTitle = input;
        this.fields = input2;
        this.fieldGroups = input3;
        this.layoutType = input4;
        this.numberOfColumns = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<FieldGroupInput> fieldGroups() {
        return this.fieldGroups.value;
    }

    public List<FieldsInput> fields() {
        return this.fields.value;
    }

    public LayoutType layoutType() {
        return this.layoutType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.FormStepSchemaInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (FormStepSchemaInput.this.stepTitle.defined) {
                    inputFieldWriter.writeString("stepTitle", (String) FormStepSchemaInput.this.stepTitle.value);
                }
                if (FormStepSchemaInput.this.fields.defined) {
                    inputFieldWriter.writeList("fields", FormStepSchemaInput.this.fields.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.FormStepSchemaInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) FormStepSchemaInput.this.fields.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldsInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (FormStepSchemaInput.this.fieldGroups.defined) {
                    inputFieldWriter.writeList("fieldGroups", FormStepSchemaInput.this.fieldGroups.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.FormStepSchemaInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) FormStepSchemaInput.this.fieldGroups.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldGroupInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (FormStepSchemaInput.this.layoutType.defined) {
                    inputFieldWriter.writeString("layoutType", FormStepSchemaInput.this.layoutType.value != 0 ? ((LayoutType) FormStepSchemaInput.this.layoutType.value).name() : null);
                }
                if (FormStepSchemaInput.this.numberOfColumns.defined) {
                    inputFieldWriter.writeInt("numberOfColumns", (Integer) FormStepSchemaInput.this.numberOfColumns.value);
                }
            }
        };
    }

    public Integer numberOfColumns() {
        return this.numberOfColumns.value;
    }

    public String stepTitle() {
        return this.stepTitle.value;
    }
}
