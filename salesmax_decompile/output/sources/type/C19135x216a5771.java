package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelEngagementListEngagementTypeByContactCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19135x216a5771 implements InputType {
    private final Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> beginsWith;
    private final Input<List<ModelEngagementListEngagementTypeByContactCompositeKeyInput>> between;
    private final Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> eq;
    private final Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> ge;
    private final Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> gt;
    private final Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> le;
    private final Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> lt;

    /* renamed from: type.ModelEngagementListEngagementTypeByContactCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> eq = Input.absent();
        private Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> le = Input.absent();
        private Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> lt = Input.absent();
        private Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> ge = Input.absent();
        private Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelEngagementListEngagementTypeByContactCompositeKeyInput>> between = Input.absent();
        private Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelEngagementListEngagementTypeByContactCompositeKeyInput modelEngagementListEngagementTypeByContactCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelEngagementListEngagementTypeByContactCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelEngagementListEngagementTypeByContactCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19135x216a5771 build() {
            return new C19135x216a5771(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelEngagementListEngagementTypeByContactCompositeKeyInput modelEngagementListEngagementTypeByContactCompositeKeyInput) {
            this.eq = Input.fromNullable(modelEngagementListEngagementTypeByContactCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelEngagementListEngagementTypeByContactCompositeKeyInput modelEngagementListEngagementTypeByContactCompositeKeyInput) {
            this.ge = Input.fromNullable(modelEngagementListEngagementTypeByContactCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelEngagementListEngagementTypeByContactCompositeKeyInput modelEngagementListEngagementTypeByContactCompositeKeyInput) {
            this.gt = Input.fromNullable(modelEngagementListEngagementTypeByContactCompositeKeyInput);
            return this;
        }

        public Builder le(ModelEngagementListEngagementTypeByContactCompositeKeyInput modelEngagementListEngagementTypeByContactCompositeKeyInput) {
            this.le = Input.fromNullable(modelEngagementListEngagementTypeByContactCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelEngagementListEngagementTypeByContactCompositeKeyInput modelEngagementListEngagementTypeByContactCompositeKeyInput) {
            this.lt = Input.fromNullable(modelEngagementListEngagementTypeByContactCompositeKeyInput);
            return this;
        }
    }

    public C19135x216a5771(Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> input, Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> input2, Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> input3, Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> input4, Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> input5, Input<List<ModelEngagementListEngagementTypeByContactCompositeKeyInput>> input6, Input<ModelEngagementListEngagementTypeByContactCompositeKeyInput> input7) {
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

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelEngagementListEngagementTypeByContactCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelEngagementListEngagementTypeByContactCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementListEngagementTypeByContactCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19135x216a5771.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19135x216a5771.this.eq.value != 0 ? ((ModelEngagementListEngagementTypeByContactCompositeKeyInput) C19135x216a5771.this.eq.value).marshaller() : null);
                }
                if (C19135x216a5771.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19135x216a5771.this.le.value != 0 ? ((ModelEngagementListEngagementTypeByContactCompositeKeyInput) C19135x216a5771.this.le.value).marshaller() : null);
                }
                if (C19135x216a5771.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19135x216a5771.this.lt.value != 0 ? ((ModelEngagementListEngagementTypeByContactCompositeKeyInput) C19135x216a5771.this.lt.value).marshaller() : null);
                }
                if (C19135x216a5771.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19135x216a5771.this.ge.value != 0 ? ((ModelEngagementListEngagementTypeByContactCompositeKeyInput) C19135x216a5771.this.ge.value).marshaller() : null);
                }
                if (C19135x216a5771.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19135x216a5771.this.gt.value != 0 ? ((ModelEngagementListEngagementTypeByContactCompositeKeyInput) C19135x216a5771.this.gt.value).marshaller() : null);
                }
                if (C19135x216a5771.this.between.defined) {
                    inputFieldWriter.writeList("between", C19135x216a5771.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementListEngagementTypeByContactCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19135x216a5771.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementListEngagementTypeByContactCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19135x216a5771.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19135x216a5771.this.beginsWith.value != 0 ? ((ModelEngagementListEngagementTypeByContactCompositeKeyInput) C19135x216a5771.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
