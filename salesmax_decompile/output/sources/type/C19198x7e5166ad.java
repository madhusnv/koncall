package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelPaymentDataPaymentRequestsByContactCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19198x7e5166ad implements InputType {
    private final Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> beginsWith;
    private final Input<List<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput>> between;
    private final Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> eq;
    private final Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> ge;
    private final Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> gt;
    private final Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> le;
    private final Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> lt;

    /* renamed from: type.ModelPaymentDataPaymentRequestsByContactCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> eq = Input.absent();
        private Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> le = Input.absent();
        private Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> lt = Input.absent();
        private Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> ge = Input.absent();
        private Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput>> between = Input.absent();
        private Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelPaymentDataPaymentRequestsByContactCompositeKeyInput modelPaymentDataPaymentRequestsByContactCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelPaymentDataPaymentRequestsByContactCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19198x7e5166ad build() {
            return new C19198x7e5166ad(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelPaymentDataPaymentRequestsByContactCompositeKeyInput modelPaymentDataPaymentRequestsByContactCompositeKeyInput) {
            this.eq = Input.fromNullable(modelPaymentDataPaymentRequestsByContactCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelPaymentDataPaymentRequestsByContactCompositeKeyInput modelPaymentDataPaymentRequestsByContactCompositeKeyInput) {
            this.ge = Input.fromNullable(modelPaymentDataPaymentRequestsByContactCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelPaymentDataPaymentRequestsByContactCompositeKeyInput modelPaymentDataPaymentRequestsByContactCompositeKeyInput) {
            this.gt = Input.fromNullable(modelPaymentDataPaymentRequestsByContactCompositeKeyInput);
            return this;
        }

        public Builder le(ModelPaymentDataPaymentRequestsByContactCompositeKeyInput modelPaymentDataPaymentRequestsByContactCompositeKeyInput) {
            this.le = Input.fromNullable(modelPaymentDataPaymentRequestsByContactCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelPaymentDataPaymentRequestsByContactCompositeKeyInput modelPaymentDataPaymentRequestsByContactCompositeKeyInput) {
            this.lt = Input.fromNullable(modelPaymentDataPaymentRequestsByContactCompositeKeyInput);
            return this;
        }
    }

    public C19198x7e5166ad(Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> input, Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> input2, Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> input3, Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> input4, Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> input5, Input<List<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput>> input6, Input<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> input7) {
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

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelPaymentDataPaymentRequestsByContactCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelPaymentDataPaymentRequestsByContactCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelPaymentDataPaymentRequestsByContactCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19198x7e5166ad.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19198x7e5166ad.this.eq.value != 0 ? ((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) C19198x7e5166ad.this.eq.value).marshaller() : null);
                }
                if (C19198x7e5166ad.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19198x7e5166ad.this.le.value != 0 ? ((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) C19198x7e5166ad.this.le.value).marshaller() : null);
                }
                if (C19198x7e5166ad.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19198x7e5166ad.this.lt.value != 0 ? ((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) C19198x7e5166ad.this.lt.value).marshaller() : null);
                }
                if (C19198x7e5166ad.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19198x7e5166ad.this.ge.value != 0 ? ((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) C19198x7e5166ad.this.ge.value).marshaller() : null);
                }
                if (C19198x7e5166ad.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19198x7e5166ad.this.gt.value != 0 ? ((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) C19198x7e5166ad.this.gt.value).marshaller() : null);
                }
                if (C19198x7e5166ad.this.between.defined) {
                    inputFieldWriter.writeList("between", C19198x7e5166ad.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelPaymentDataPaymentRequestsByContactCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19198x7e5166ad.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19198x7e5166ad.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19198x7e5166ad.this.beginsWith.value != 0 ? ((ModelPaymentDataPaymentRequestsByContactCompositeKeyInput) C19198x7e5166ad.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
