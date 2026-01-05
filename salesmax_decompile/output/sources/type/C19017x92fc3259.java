package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelActivityLocationAllLocationsByOwnerCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19017x92fc3259 implements InputType {
    private final Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput>> between;
    private final Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> eq;
    private final Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> ge;
    private final Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> gt;
    private final Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> le;
    private final Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> lt;

    /* renamed from: type.ModelActivityLocationAllLocationsByOwnerCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelActivityLocationAllLocationsByOwnerCompositeKeyInput modelActivityLocationAllLocationsByOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelActivityLocationAllLocationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19017x92fc3259 build() {
            return new C19017x92fc3259(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelActivityLocationAllLocationsByOwnerCompositeKeyInput modelActivityLocationAllLocationsByOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelActivityLocationAllLocationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelActivityLocationAllLocationsByOwnerCompositeKeyInput modelActivityLocationAllLocationsByOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelActivityLocationAllLocationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelActivityLocationAllLocationsByOwnerCompositeKeyInput modelActivityLocationAllLocationsByOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelActivityLocationAllLocationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelActivityLocationAllLocationsByOwnerCompositeKeyInput modelActivityLocationAllLocationsByOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelActivityLocationAllLocationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelActivityLocationAllLocationsByOwnerCompositeKeyInput modelActivityLocationAllLocationsByOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelActivityLocationAllLocationsByOwnerCompositeKeyInput);
            return this;
        }
    }

    public C19017x92fc3259(Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> input, Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> input2, Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> input3, Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> input4, Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> input5, Input<List<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput>> input6, Input<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> input7) {
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

    public ModelActivityLocationAllLocationsByOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelActivityLocationAllLocationsByOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelActivityLocationAllLocationsByOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelActivityLocationAllLocationsByOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelActivityLocationAllLocationsByOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelActivityLocationAllLocationsByOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelActivityLocationAllLocationsByOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityLocationAllLocationsByOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19017x92fc3259.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19017x92fc3259.this.eq.value != 0 ? ((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) C19017x92fc3259.this.eq.value).marshaller() : null);
                }
                if (C19017x92fc3259.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19017x92fc3259.this.le.value != 0 ? ((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) C19017x92fc3259.this.le.value).marshaller() : null);
                }
                if (C19017x92fc3259.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19017x92fc3259.this.lt.value != 0 ? ((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) C19017x92fc3259.this.lt.value).marshaller() : null);
                }
                if (C19017x92fc3259.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19017x92fc3259.this.ge.value != 0 ? ((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) C19017x92fc3259.this.ge.value).marshaller() : null);
                }
                if (C19017x92fc3259.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19017x92fc3259.this.gt.value != 0 ? ((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) C19017x92fc3259.this.gt.value).marshaller() : null);
                }
                if (C19017x92fc3259.this.between.defined) {
                    inputFieldWriter.writeList("between", C19017x92fc3259.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityLocationAllLocationsByOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19017x92fc3259.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19017x92fc3259.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19017x92fc3259.this.beginsWith.value != 0 ? ((ModelActivityLocationAllLocationsByOwnerCompositeKeyInput) C19017x92fc3259.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
