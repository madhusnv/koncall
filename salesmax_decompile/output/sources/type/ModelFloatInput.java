package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelFloatInput implements InputType {
    private final Input<Boolean> attributeExists;
    private final Input<ModelAttributeTypes> attributeType;
    private final Input<List<Double>> between;
    private final Input<Double> eq;
    private final Input<Double> ge;
    private final Input<Double> gt;
    private final Input<Double> le;
    private final Input<Double> lt;
    private final Input<Double> ne;

    public static final class Builder {
        private Input<Double> ne = Input.absent();
        private Input<Double> eq = Input.absent();
        private Input<Double> le = Input.absent();
        private Input<Double> lt = Input.absent();
        private Input<Double> ge = Input.absent();
        private Input<Double> gt = Input.absent();
        private Input<List<Double>> between = Input.absent();
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

        public Builder between(List<Double> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelFloatInput build() {
            return new ModelFloatInput(this.ne, this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.attributeExists, this.attributeType);
        }

        public Builder eq(Double d) {
            this.eq = Input.fromNullable(d);
            return this;
        }

        public Builder ge(Double d) {
            this.ge = Input.fromNullable(d);
            return this;
        }

        public Builder gt(Double d) {
            this.gt = Input.fromNullable(d);
            return this;
        }

        public Builder le(Double d) {
            this.le = Input.fromNullable(d);
            return this;
        }

        public Builder lt(Double d) {
            this.lt = Input.fromNullable(d);
            return this;
        }

        public Builder ne(Double d) {
            this.ne = Input.fromNullable(d);
            return this;
        }
    }

    public ModelFloatInput(Input<Double> input, Input<Double> input2, Input<Double> input3, Input<Double> input4, Input<Double> input5, Input<Double> input6, Input<List<Double>> input7, Input<Boolean> input8, Input<ModelAttributeTypes> input9) {
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

    public List<Double> between() {
        return this.between.value;
    }

    public Double eq() {
        return this.eq.value;
    }

    public Double ge() {
        return this.ge.value;
    }

    public Double gt() {
        return this.gt.value;
    }

    public Double le() {
        return this.le.value;
    }

    public Double lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelFloatInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelFloatInput.this.ne.defined) {
                    inputFieldWriter.writeDouble("ne", (Double) ModelFloatInput.this.ne.value);
                }
                if (ModelFloatInput.this.eq.defined) {
                    inputFieldWriter.writeDouble("eq", (Double) ModelFloatInput.this.eq.value);
                }
                if (ModelFloatInput.this.le.defined) {
                    inputFieldWriter.writeDouble("le", (Double) ModelFloatInput.this.le.value);
                }
                if (ModelFloatInput.this.lt.defined) {
                    inputFieldWriter.writeDouble("lt", (Double) ModelFloatInput.this.lt.value);
                }
                if (ModelFloatInput.this.ge.defined) {
                    inputFieldWriter.writeDouble("ge", (Double) ModelFloatInput.this.ge.value);
                }
                if (ModelFloatInput.this.gt.defined) {
                    inputFieldWriter.writeDouble("gt", (Double) ModelFloatInput.this.gt.value);
                }
                if (ModelFloatInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelFloatInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelFloatInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelFloatInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    } : null);
                }
                if (ModelFloatInput.this.attributeExists.defined) {
                    inputFieldWriter.writeBoolean("attributeExists", (Boolean) ModelFloatInput.this.attributeExists.value);
                }
                if (ModelFloatInput.this.attributeType.defined) {
                    inputFieldWriter.writeString("attributeType", ModelFloatInput.this.attributeType.value != 0 ? ((ModelAttributeTypes) ModelFloatInput.this.attributeType.value).name() : null);
                }
            }
        };
    }

    public Double ne() {
        return this.ne.value;
    }
}
