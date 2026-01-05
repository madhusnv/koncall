package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FieldGroupInput implements InputType {
    private final Input<List<FieldsInput>> fields;
    private final Input<String> groupTitle;
    private final Input<String> hideCondition;
    private final Input<Boolean> isRepeatable;
    private final Input<Integer> numberOfColumns;
    private final Input<String> showCondition;

    public static final class Builder {
        private Input<String> groupTitle = Input.absent();
        private Input<List<FieldsInput>> fields = Input.absent();
        private Input<Integer> numberOfColumns = Input.absent();
        private Input<Boolean> isRepeatable = Input.absent();
        private Input<String> showCondition = Input.absent();
        private Input<String> hideCondition = Input.absent();

        public FieldGroupInput build() {
            return new FieldGroupInput(this.groupTitle, this.fields, this.numberOfColumns, this.isRepeatable, this.showCondition, this.hideCondition);
        }

        public Builder fields(List<FieldsInput> list) {
            this.fields = Input.fromNullable(list);
            return this;
        }

        public Builder groupTitle(String str) {
            this.groupTitle = Input.fromNullable(str);
            return this;
        }

        public Builder hideCondition(String str) {
            this.hideCondition = Input.fromNullable(str);
            return this;
        }

        public Builder isRepeatable(Boolean bool) {
            this.isRepeatable = Input.fromNullable(bool);
            return this;
        }

        public Builder numberOfColumns(Integer num) {
            this.numberOfColumns = Input.fromNullable(num);
            return this;
        }

        public Builder showCondition(String str) {
            this.showCondition = Input.fromNullable(str);
            return this;
        }
    }

    public FieldGroupInput(Input<String> input, Input<List<FieldsInput>> input2, Input<Integer> input3, Input<Boolean> input4, Input<String> input5, Input<String> input6) {
        this.groupTitle = input;
        this.fields = input2;
        this.numberOfColumns = input3;
        this.isRepeatable = input4;
        this.showCondition = input5;
        this.hideCondition = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<FieldsInput> fields() {
        return this.fields.value;
    }

    public String groupTitle() {
        return this.groupTitle.value;
    }

    public String hideCondition() {
        return this.hideCondition.value;
    }

    public Boolean isRepeatable() {
        return this.isRepeatable.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.FieldGroupInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (FieldGroupInput.this.groupTitle.defined) {
                    inputFieldWriter.writeString("groupTitle", (String) FieldGroupInput.this.groupTitle.value);
                }
                if (FieldGroupInput.this.fields.defined) {
                    inputFieldWriter.writeList("fields", FieldGroupInput.this.fields.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.FieldGroupInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) FieldGroupInput.this.fields.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldsInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (FieldGroupInput.this.numberOfColumns.defined) {
                    inputFieldWriter.writeInt("numberOfColumns", (Integer) FieldGroupInput.this.numberOfColumns.value);
                }
                if (FieldGroupInput.this.isRepeatable.defined) {
                    inputFieldWriter.writeBoolean("isRepeatable", (Boolean) FieldGroupInput.this.isRepeatable.value);
                }
                if (FieldGroupInput.this.showCondition.defined) {
                    inputFieldWriter.writeString("showCondition", (String) FieldGroupInput.this.showCondition.value);
                }
                if (FieldGroupInput.this.hideCondition.defined) {
                    inputFieldWriter.writeString("hideCondition", (String) FieldGroupInput.this.hideCondition.value);
                }
            }
        };
    }

    public Integer numberOfColumns() {
        return this.numberOfColumns.value;
    }

    public String showCondition() {
        return this.showCondition.value;
    }
}
