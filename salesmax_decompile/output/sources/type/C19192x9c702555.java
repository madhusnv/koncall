package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelNotificationStagingAllNotificationsByOwnerCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19192x9c702555 implements InputType {
    private final Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput>> between;
    private final Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> eq;
    private final Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> ge;
    private final Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> gt;
    private final Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> le;
    private final Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> lt;

    /* renamed from: type.ModelNotificationStagingAllNotificationsByOwnerCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19192x9c702555 build() {
            return new C19192x9c702555(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelNotificationStagingAllNotificationsByOwnerCompositeKeyInput);
            return this;
        }
    }

    public C19192x9c702555(Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> input, Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> input2, Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> input3, Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> input4, Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> input5, Input<List<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput>> input6, Input<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> input7) {
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

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelNotificationStagingAllNotificationsByOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19192x9c702555.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19192x9c702555.this.eq.value != 0 ? ((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) C19192x9c702555.this.eq.value).marshaller() : null);
                }
                if (C19192x9c702555.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19192x9c702555.this.le.value != 0 ? ((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) C19192x9c702555.this.le.value).marshaller() : null);
                }
                if (C19192x9c702555.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19192x9c702555.this.lt.value != 0 ? ((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) C19192x9c702555.this.lt.value).marshaller() : null);
                }
                if (C19192x9c702555.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19192x9c702555.this.ge.value != 0 ? ((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) C19192x9c702555.this.ge.value).marshaller() : null);
                }
                if (C19192x9c702555.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19192x9c702555.this.gt.value != 0 ? ((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) C19192x9c702555.this.gt.value).marshaller() : null);
                }
                if (C19192x9c702555.this.between.defined) {
                    inputFieldWriter.writeList("between", C19192x9c702555.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelNotificationStagingAllNotificationsByOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19192x9c702555.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19192x9c702555.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19192x9c702555.this.beginsWith.value != 0 ? ((ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput) C19192x9c702555.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
