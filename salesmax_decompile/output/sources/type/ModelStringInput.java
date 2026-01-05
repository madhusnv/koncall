package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelStringInput implements InputType {
    private final Input<Boolean> attributeExists;
    private final Input<ModelAttributeTypes> attributeType;
    private final Input<String> beginsWith;
    private final Input<List<String>> between;
    private final Input<String> contains;
    private final Input<String> eq;
    private final Input<String> ge;
    private final Input<String> gt;
    private final Input<String> le;
    private final Input<String> lt;
    private final Input<String> ne;
    private final Input<String> notContains;
    private final Input<ModelSizeInput> size;

    public static final class Builder {
        private Input<String> ne = Input.absent();
        private Input<String> eq = Input.absent();
        private Input<String> le = Input.absent();
        private Input<String> lt = Input.absent();
        private Input<String> ge = Input.absent();
        private Input<String> gt = Input.absent();
        private Input<String> contains = Input.absent();
        private Input<String> notContains = Input.absent();
        private Input<List<String>> between = Input.absent();
        private Input<String> beginsWith = Input.absent();
        private Input<Boolean> attributeExists = Input.absent();
        private Input<ModelAttributeTypes> attributeType = Input.absent();
        private Input<ModelSizeInput> size = Input.absent();

        public Builder attributeExists(Boolean bool) {
            this.attributeExists = Input.fromNullable(bool);
            return this;
        }

        public Builder attributeType(ModelAttributeTypes modelAttributeTypes) {
            this.attributeType = Input.fromNullable(modelAttributeTypes);
            return this;
        }

        public Builder beginsWith(String str) {
            this.beginsWith = Input.fromNullable(str);
            return this;
        }

        public Builder between(List<String> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelStringInput build() {
            return new ModelStringInput(this.ne, this.eq, this.le, this.lt, this.ge, this.gt, this.contains, this.notContains, this.between, this.beginsWith, this.attributeExists, this.attributeType, this.size);
        }

        public Builder contains(String str) {
            this.contains = Input.fromNullable(str);
            return this;
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

        public Builder ne(String str) {
            this.ne = Input.fromNullable(str);
            return this;
        }

        public Builder notContains(String str) {
            this.notContains = Input.fromNullable(str);
            return this;
        }

        public Builder size(ModelSizeInput modelSizeInput) {
            this.size = Input.fromNullable(modelSizeInput);
            return this;
        }
    }

    public ModelStringInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<List<String>> input9, Input<String> input10, Input<Boolean> input11, Input<ModelAttributeTypes> input12, Input<ModelSizeInput> input13) {
        this.ne = input;
        this.eq = input2;
        this.le = input3;
        this.lt = input4;
        this.ge = input5;
        this.gt = input6;
        this.contains = input7;
        this.notContains = input8;
        this.between = input9;
        this.beginsWith = input10;
        this.attributeExists = input11;
        this.attributeType = input12;
        this.size = input13;
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

    public String beginsWith() {
        return this.beginsWith.value;
    }

    public List<String> between() {
        return this.between.value;
    }

    public String contains() {
        return this.contains.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelStringInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelStringInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", (String) ModelStringInput.this.ne.value);
                }
                if (ModelStringInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", (String) ModelStringInput.this.eq.value);
                }
                if (ModelStringInput.this.le.defined) {
                    inputFieldWriter.writeString("le", (String) ModelStringInput.this.le.value);
                }
                if (ModelStringInput.this.lt.defined) {
                    inputFieldWriter.writeString("lt", (String) ModelStringInput.this.lt.value);
                }
                if (ModelStringInput.this.ge.defined) {
                    inputFieldWriter.writeString("ge", (String) ModelStringInput.this.ge.value);
                }
                if (ModelStringInput.this.gt.defined) {
                    inputFieldWriter.writeString("gt", (String) ModelStringInput.this.gt.value);
                }
                if (ModelStringInput.this.contains.defined) {
                    inputFieldWriter.writeString("contains", (String) ModelStringInput.this.contains.value);
                }
                if (ModelStringInput.this.notContains.defined) {
                    inputFieldWriter.writeString("notContains", (String) ModelStringInput.this.notContains.value);
                }
                if (ModelStringInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelStringInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelStringInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelStringInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (ModelStringInput.this.beginsWith.defined) {
                    inputFieldWriter.writeString("beginsWith", (String) ModelStringInput.this.beginsWith.value);
                }
                if (ModelStringInput.this.attributeExists.defined) {
                    inputFieldWriter.writeBoolean("attributeExists", (Boolean) ModelStringInput.this.attributeExists.value);
                }
                if (ModelStringInput.this.attributeType.defined) {
                    inputFieldWriter.writeString("attributeType", ModelStringInput.this.attributeType.value != 0 ? ((ModelAttributeTypes) ModelStringInput.this.attributeType.value).name() : null);
                }
                if (ModelStringInput.this.size.defined) {
                    inputFieldWriter.writeObject("size", ModelStringInput.this.size.value != 0 ? ((ModelSizeInput) ModelStringInput.this.size.value).marshaller() : null);
                }
            }
        };
    }

    public String ne() {
        return this.ne.value;
    }

    public String notContains() {
        return this.notContains.value;
    }

    public ModelSizeInput size() {
        return this.size.value;
    }
}
