package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelIntInput implements InputType {
    private final Input<Boolean> attributeExists;
    private final Input<ModelAttributeTypes> attributeType;
    private final Input<List<Integer>> between;
    private final Input<Integer> eq;
    private final Input<Integer> ge;
    private final Input<Integer> gt;
    private final Input<Integer> le;
    private final Input<Integer> lt;
    private final Input<Integer> ne;

    public static final class Builder {
        private Input<Integer> ne = Input.absent();
        private Input<Integer> eq = Input.absent();
        private Input<Integer> le = Input.absent();
        private Input<Integer> lt = Input.absent();
        private Input<Integer> ge = Input.absent();
        private Input<Integer> gt = Input.absent();
        private Input<List<Integer>> between = Input.absent();
        private Input<Boolean> attributeExists = Input.absent();
        private Input<ModelAttributeTypes> attributeType = Input.absent();

        public Builder attributeExists(Boolean bool) {
            this.attributeExists = Input.fromNullable(bool);
            return this;
        }

        public Builder attributeType(ModelAttributeTypes modelAttributeTypes) {
            this.attributeType = Input.fromNullable(modelAttributeTypes);
            return this;
        }

        public Builder between(List<Integer> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelIntInput build() {
            return new ModelIntInput(this.ne, this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.attributeExists, this.attributeType);
        }

        public Builder eq(Integer num) {
            this.eq = Input.fromNullable(num);
            return this;
        }

        public Builder ge(Integer num) {
            this.ge = Input.fromNullable(num);
            return this;
        }

        public Builder gt(Integer num) {
            this.gt = Input.fromNullable(num);
            return this;
        }

        public Builder le(Integer num) {
            this.le = Input.fromNullable(num);
            return this;
        }

        public Builder lt(Integer num) {
            this.lt = Input.fromNullable(num);
            return this;
        }

        public Builder ne(Integer num) {
            this.ne = Input.fromNullable(num);
            return this;
        }
    }

    public ModelIntInput(Input<Integer> input, Input<Integer> input2, Input<Integer> input3, Input<Integer> input4, Input<Integer> input5, Input<Integer> input6, Input<List<Integer>> input7, Input<Boolean> input8, Input<ModelAttributeTypes> input9) {
        this.ne = input;
        this.eq = input2;
        this.le = input3;
        this.lt = input4;
        this.ge = input5;
        this.gt = input6;
        this.between = input7;
        this.attributeExists = input8;
        this.attributeType = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean attributeExists() {
        return this.attributeExists.value;
    }

    public ModelAttributeTypes attributeType() {
        return this.attributeType.value;
    }

    public List<Integer> between() {
        return this.between.value;
    }

    public Integer eq() {
        return this.eq.value;
    }

    public Integer ge() {
        return this.ge.value;
    }

    public Integer gt() {
        return this.gt.value;
    }

    public Integer le() {
        return this.le.value;
    }

    public Integer lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelIntInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelIntInput.this.ne.defined) {
                    inputFieldWriter.writeInt("ne", (Integer) ModelIntInput.this.ne.value);
                }
                if (ModelIntInput.this.eq.defined) {
                    inputFieldWriter.writeInt("eq", (Integer) ModelIntInput.this.eq.value);
                }
                if (ModelIntInput.this.le.defined) {
                    inputFieldWriter.writeInt("le", (Integer) ModelIntInput.this.le.value);
                }
                if (ModelIntInput.this.lt.defined) {
                    inputFieldWriter.writeInt("lt", (Integer) ModelIntInput.this.lt.value);
                }
                if (ModelIntInput.this.ge.defined) {
                    inputFieldWriter.writeInt("ge", (Integer) ModelIntInput.this.ge.value);
                }
                if (ModelIntInput.this.gt.defined) {
                    inputFieldWriter.writeInt("gt", (Integer) ModelIntInput.this.gt.value);
                }
                if (ModelIntInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelIntInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelIntInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelIntInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeInt((Integer) it.next());
                            }
                        }
                    } : null);
                }
                if (ModelIntInput.this.attributeExists.defined) {
                    inputFieldWriter.writeBoolean("attributeExists", (Boolean) ModelIntInput.this.attributeExists.value);
                }
                if (ModelIntInput.this.attributeType.defined) {
                    inputFieldWriter.writeString("attributeType", ModelIntInput.this.attributeType.value != 0 ? ((ModelAttributeTypes) ModelIntInput.this.attributeType.value).name() : null);
                }
            }
        };
    }

    public Integer ne() {
        return this.ne.value;
    }
}
