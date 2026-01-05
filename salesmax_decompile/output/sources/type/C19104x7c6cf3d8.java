package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19104x7c6cf3d8 implements InputType {
    private final Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> beginsWith;
    private final Input<List<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput>> between;
    private final Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> eq;
    private final Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> ge;
    private final Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> gt;
    private final Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> le;
    private final Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> lt;

    /* renamed from: type.ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> eq = Input.absent();
        private Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> le = Input.absent();
        private Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> lt = Input.absent();
        private Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> ge = Input.absent();
        private Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput>> between = Input.absent();
        private Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19104x7c6cf3d8 build() {
            return new C19104x7c6cf3d8(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) {
            this.eq = Input.fromNullable(modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) {
            this.ge = Input.fromNullable(modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) {
            this.gt = Input.fromNullable(modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput);
            return this;
        }

        public Builder le(ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) {
            this.le = Input.fromNullable(modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) {
            this.lt = Input.fromNullable(modelCustomPropertyValuesExistinPropertyValueCompositeKeyInput);
            return this;
        }
    }

    public C19104x7c6cf3d8(Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> input, Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> input2, Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> input3, Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> input4, Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> input5, Input<List<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput>> input6, Input<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> input7) {
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

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19104x7c6cf3d8.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19104x7c6cf3d8.this.eq.value != 0 ? ((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) C19104x7c6cf3d8.this.eq.value).marshaller() : null);
                }
                if (C19104x7c6cf3d8.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19104x7c6cf3d8.this.le.value != 0 ? ((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) C19104x7c6cf3d8.this.le.value).marshaller() : null);
                }
                if (C19104x7c6cf3d8.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19104x7c6cf3d8.this.lt.value != 0 ? ((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) C19104x7c6cf3d8.this.lt.value).marshaller() : null);
                }
                if (C19104x7c6cf3d8.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19104x7c6cf3d8.this.ge.value != 0 ? ((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) C19104x7c6cf3d8.this.ge.value).marshaller() : null);
                }
                if (C19104x7c6cf3d8.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19104x7c6cf3d8.this.gt.value != 0 ? ((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) C19104x7c6cf3d8.this.gt.value).marshaller() : null);
                }
                if (C19104x7c6cf3d8.this.between.defined) {
                    inputFieldWriter.writeList("between", C19104x7c6cf3d8.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19104x7c6cf3d8.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19104x7c6cf3d8.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19104x7c6cf3d8.this.beginsWith.value != 0 ? ((ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput) C19104x7c6cf3d8.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
