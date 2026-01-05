package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19075x32ad419c implements InputType {
    private final Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> beginsWith;
    private final Input<List<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput>> between;
    private final Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> eq;
    private final Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> ge;
    private final Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> gt;
    private final Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> le;
    private final Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> lt;

    /* renamed from: type.ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> eq = Input.absent();
        private Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> le = Input.absent();
        private Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> lt = Input.absent();
        private Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> ge = Input.absent();
        private Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput>> between = Input.absent();
        private Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19075x32ad419c build() {
            return new C19075x32ad419c(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) {
            this.eq = Input.fromNullable(modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) {
            this.ge = Input.fromNullable(modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) {
            this.gt = Input.fromNullable(modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput);
            return this;
        }

        public Builder le(ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) {
            this.le = Input.fromNullable(modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) {
            this.lt = Input.fromNullable(modelCloudTelephonyUserUserByAgentNumberCompositeKeyInput);
            return this;
        }
    }

    public C19075x32ad419c(Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> input, Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> input2, Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> input3, Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> input4, Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> input5, Input<List<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput>> input6, Input<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> input7) {
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

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19075x32ad419c.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19075x32ad419c.this.eq.value != 0 ? ((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) C19075x32ad419c.this.eq.value).marshaller() : null);
                }
                if (C19075x32ad419c.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19075x32ad419c.this.le.value != 0 ? ((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) C19075x32ad419c.this.le.value).marshaller() : null);
                }
                if (C19075x32ad419c.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19075x32ad419c.this.lt.value != 0 ? ((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) C19075x32ad419c.this.lt.value).marshaller() : null);
                }
                if (C19075x32ad419c.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19075x32ad419c.this.ge.value != 0 ? ((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) C19075x32ad419c.this.ge.value).marshaller() : null);
                }
                if (C19075x32ad419c.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19075x32ad419c.this.gt.value != 0 ? ((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) C19075x32ad419c.this.gt.value).marshaller() : null);
                }
                if (C19075x32ad419c.this.between.defined) {
                    inputFieldWriter.writeList("between", C19075x32ad419c.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19075x32ad419c.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19075x32ad419c.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19075x32ad419c.this.beginsWith.value != 0 ? ((ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput) C19075x32ad419c.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
