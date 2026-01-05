package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19141x30a1d946 implements InputType {
    private final Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> beginsWith;
    private final Input<List<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput>> between;
    private final Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> eq;
    private final Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> ge;
    private final Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> gt;
    private final Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> le;
    private final Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> lt;

    /* renamed from: type.ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> eq = Input.absent();
        private Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> le = Input.absent();
        private Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> lt = Input.absent();
        private Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> ge = Input.absent();
        private Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput>> between = Input.absent();
        private Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19141x30a1d946 build() {
            return new C19141x30a1d946(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) {
            this.eq = Input.fromNullable(modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) {
            this.ge = Input.fromNullable(modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) {
            this.gt = Input.fromNullable(modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput);
            return this;
        }

        public Builder le(ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) {
            this.le = Input.fromNullable(modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) {
            this.lt = Input.fromNullable(modelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput);
            return this;
        }
    }

    public C19141x30a1d946(Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> input, Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> input2, Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> input3, Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> input4, Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> input5, Input<List<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput>> input6, Input<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> input7) {
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

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19141x30a1d946.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19141x30a1d946.this.eq.value != 0 ? ((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) C19141x30a1d946.this.eq.value).marshaller() : null);
                }
                if (C19141x30a1d946.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19141x30a1d946.this.le.value != 0 ? ((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) C19141x30a1d946.this.le.value).marshaller() : null);
                }
                if (C19141x30a1d946.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19141x30a1d946.this.lt.value != 0 ? ((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) C19141x30a1d946.this.lt.value).marshaller() : null);
                }
                if (C19141x30a1d946.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19141x30a1d946.this.ge.value != 0 ? ((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) C19141x30a1d946.this.ge.value).marshaller() : null);
                }
                if (C19141x30a1d946.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19141x30a1d946.this.gt.value != 0 ? ((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) C19141x30a1d946.this.gt.value).marshaller() : null);
                }
                if (C19141x30a1d946.this.between.defined) {
                    inputFieldWriter.writeList("between", C19141x30a1d946.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19141x30a1d946.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19141x30a1d946.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19141x30a1d946.this.beginsWith.value != 0 ? ((ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput) C19141x30a1d946.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
