package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19129xf2f0a77f implements InputType {
    private final Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput>> between;
    private final Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> eq;
    private final Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> ge;
    private final Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> gt;
    private final Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> le;
    private final Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> lt;

    /* renamed from: type.ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput modelDistributionDefinitionByDistributionOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelDistributionDefinitionByDistributionOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19129xf2f0a77f build() {
            return new C19129xf2f0a77f(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput modelDistributionDefinitionByDistributionOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelDistributionDefinitionByDistributionOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput modelDistributionDefinitionByDistributionOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelDistributionDefinitionByDistributionOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput modelDistributionDefinitionByDistributionOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelDistributionDefinitionByDistributionOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput modelDistributionDefinitionByDistributionOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelDistributionDefinitionByDistributionOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput modelDistributionDefinitionByDistributionOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelDistributionDefinitionByDistributionOwnerCompositeKeyInput);
            return this;
        }
    }

    public C19129xf2f0a77f(Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> input, Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> input2, Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> input3, Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> input4, Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> input5, Input<List<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput>> input6, Input<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> input7) {
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

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19129xf2f0a77f.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19129xf2f0a77f.this.eq.value != 0 ? ((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) C19129xf2f0a77f.this.eq.value).marshaller() : null);
                }
                if (C19129xf2f0a77f.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19129xf2f0a77f.this.le.value != 0 ? ((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) C19129xf2f0a77f.this.le.value).marshaller() : null);
                }
                if (C19129xf2f0a77f.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19129xf2f0a77f.this.lt.value != 0 ? ((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) C19129xf2f0a77f.this.lt.value).marshaller() : null);
                }
                if (C19129xf2f0a77f.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19129xf2f0a77f.this.ge.value != 0 ? ((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) C19129xf2f0a77f.this.ge.value).marshaller() : null);
                }
                if (C19129xf2f0a77f.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19129xf2f0a77f.this.gt.value != 0 ? ((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) C19129xf2f0a77f.this.gt.value).marshaller() : null);
                }
                if (C19129xf2f0a77f.this.between.defined) {
                    inputFieldWriter.writeList("between", C19129xf2f0a77f.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19129xf2f0a77f.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19129xf2f0a77f.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19129xf2f0a77f.this.beginsWith.value != 0 ? ((ModelDistributionDefinitionByDistributionOwnerCompositeKeyInput) C19129xf2f0a77f.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
