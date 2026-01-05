package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelIDKeyConditionInput implements InputType {
    private final Input<String> beginsWith;
    private final Input<List<String>> between;
    private final Input<String> eq;
    private final Input<String> ge;
    private final Input<String> gt;
    private final Input<String> le;
    private final Input<String> lt;

    public static final class Builder {
        private Input<String> eq = Input.absent();
        private Input<String> le = Input.absent();
        private Input<String> lt = Input.absent();
        private Input<String> ge = Input.absent();
        private Input<String> gt = Input.absent();
        private Input<List<String>> between = Input.absent();
        private Input<String> beginsWith = Input.absent();

        public Builder beginsWith(String str) {
            this.beginsWith = Input.fromNullable(str);
            return this;
        }

        public Builder between(List<String> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelIDKeyConditionInput build() {
            return new ModelIDKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(String str) {
            this.eq = Input.fromNullable(str);
            return this;
        }

        public Builder ge(String str) {
            this.ge = Input.fromNullable(str);
            return this;
        }

        public Builder gt(String str) {
            this.gt = Input.fromNullable(str);
            return this;
        }

        public Builder le(String str) {
            this.le = Input.fromNullable(str);
            return this;
        }

        public Builder lt(String str) {
            this.lt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelIDKeyConditionInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<List<String>> input6, Input<String> input7) {
        this.eq = input;
        this.le = input2;
        this.lt = input3;
        this.ge = input4;
        this.gt = input5;
        this.between = input6;
        this.beginsWith = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String beginsWith() {
        return this.beginsWith.value;
    }

    public List<String> between() {
        return this.between.value;
    }

    public String eq() {
        return this.eq.value;
    }

    public String ge() {
        return this.ge.value;
    }

    public String gt() {
        return this.gt.value;
    }

    public String le() {
        return this.le.value;
    }

    public String lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelIDKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelIDKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", (String) ModelIDKeyConditionInput.this.eq.value);
                }
                if (ModelIDKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeString("le", (String) ModelIDKeyConditionInput.this.le.value);
                }
                if (ModelIDKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeString("lt", (String) ModelIDKeyConditionInput.this.lt.value);
                }
                if (ModelIDKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeString("ge", (String) ModelIDKeyConditionInput.this.ge.value);
                }
                if (ModelIDKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeString("gt", (String) ModelIDKeyConditionInput.this.gt.value);
                }
                if (ModelIDKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelIDKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelIDKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelIDKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (ModelIDKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeString("beginsWith", (String) ModelIDKeyConditionInput.this.beginsWith.value);
                }
            }
        };
    }
}
