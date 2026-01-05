package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelChatParticipantChannelByParticipantCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19063x745baff2 implements InputType {
    private final Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> beginsWith;
    private final Input<List<ModelChatParticipantChannelByParticipantCompositeKeyInput>> between;
    private final Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> eq;
    private final Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> ge;
    private final Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> gt;
    private final Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> le;
    private final Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> lt;

    /* renamed from: type.ModelChatParticipantChannelByParticipantCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> eq = Input.absent();
        private Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> le = Input.absent();
        private Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> lt = Input.absent();
        private Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> ge = Input.absent();
        private Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelChatParticipantChannelByParticipantCompositeKeyInput>> between = Input.absent();
        private Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelChatParticipantChannelByParticipantCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelChatParticipantChannelByParticipantCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19063x745baff2 build() {
            return new C19063x745baff2(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
            this.eq = Input.fromNullable(modelChatParticipantChannelByParticipantCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
            this.ge = Input.fromNullable(modelChatParticipantChannelByParticipantCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
            this.gt = Input.fromNullable(modelChatParticipantChannelByParticipantCompositeKeyInput);
            return this;
        }

        public Builder le(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
            this.le = Input.fromNullable(modelChatParticipantChannelByParticipantCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
            this.lt = Input.fromNullable(modelChatParticipantChannelByParticipantCompositeKeyInput);
            return this;
        }
    }

    public C19063x745baff2(Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> input, Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> input2, Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> input3, Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> input4, Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> input5, Input<List<ModelChatParticipantChannelByParticipantCompositeKeyInput>> input6, Input<ModelChatParticipantChannelByParticipantCompositeKeyInput> input7) {
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

    public ModelChatParticipantChannelByParticipantCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelChatParticipantChannelByParticipantCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelChatParticipantChannelByParticipantCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelChatParticipantChannelByParticipantCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelChatParticipantChannelByParticipantCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelChatParticipantChannelByParticipantCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelChatParticipantChannelByParticipantCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatParticipantChannelByParticipantCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19063x745baff2.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19063x745baff2.this.eq.value != 0 ? ((ModelChatParticipantChannelByParticipantCompositeKeyInput) C19063x745baff2.this.eq.value).marshaller() : null);
                }
                if (C19063x745baff2.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19063x745baff2.this.le.value != 0 ? ((ModelChatParticipantChannelByParticipantCompositeKeyInput) C19063x745baff2.this.le.value).marshaller() : null);
                }
                if (C19063x745baff2.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19063x745baff2.this.lt.value != 0 ? ((ModelChatParticipantChannelByParticipantCompositeKeyInput) C19063x745baff2.this.lt.value).marshaller() : null);
                }
                if (C19063x745baff2.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19063x745baff2.this.ge.value != 0 ? ((ModelChatParticipantChannelByParticipantCompositeKeyInput) C19063x745baff2.this.ge.value).marshaller() : null);
                }
                if (C19063x745baff2.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19063x745baff2.this.gt.value != 0 ? ((ModelChatParticipantChannelByParticipantCompositeKeyInput) C19063x745baff2.this.gt.value).marshaller() : null);
                }
                if (C19063x745baff2.this.between.defined) {
                    inputFieldWriter.writeList("between", C19063x745baff2.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatParticipantChannelByParticipantCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19063x745baff2.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatParticipantChannelByParticipantCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19063x745baff2.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19063x745baff2.this.beginsWith.value != 0 ? ((ModelChatParticipantChannelByParticipantCompositeKeyInput) C19063x745baff2.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
