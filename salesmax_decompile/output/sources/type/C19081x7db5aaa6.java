package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19081x7db5aaa6 implements InputType {
    private final Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> beginsWith;
    private final Input<List<ModelCommentListAllCommentsOnEngagementCompositeKeyInput>> between;
    private final Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> eq;
    private final Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> ge;
    private final Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> gt;
    private final Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> le;
    private final Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> lt;

    /* renamed from: type.ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> eq = Input.absent();
        private Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> le = Input.absent();
        private Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> lt = Input.absent();
        private Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> ge = Input.absent();
        private Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelCommentListAllCommentsOnEngagementCompositeKeyInput>> between = Input.absent();
        private Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelCommentListAllCommentsOnEngagementCompositeKeyInput modelCommentListAllCommentsOnEngagementCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelCommentListAllCommentsOnEngagementCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19081x7db5aaa6 build() {
            return new C19081x7db5aaa6(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelCommentListAllCommentsOnEngagementCompositeKeyInput modelCommentListAllCommentsOnEngagementCompositeKeyInput) {
            this.eq = Input.fromNullable(modelCommentListAllCommentsOnEngagementCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelCommentListAllCommentsOnEngagementCompositeKeyInput modelCommentListAllCommentsOnEngagementCompositeKeyInput) {
            this.ge = Input.fromNullable(modelCommentListAllCommentsOnEngagementCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelCommentListAllCommentsOnEngagementCompositeKeyInput modelCommentListAllCommentsOnEngagementCompositeKeyInput) {
            this.gt = Input.fromNullable(modelCommentListAllCommentsOnEngagementCompositeKeyInput);
            return this;
        }

        public Builder le(ModelCommentListAllCommentsOnEngagementCompositeKeyInput modelCommentListAllCommentsOnEngagementCompositeKeyInput) {
            this.le = Input.fromNullable(modelCommentListAllCommentsOnEngagementCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelCommentListAllCommentsOnEngagementCompositeKeyInput modelCommentListAllCommentsOnEngagementCompositeKeyInput) {
            this.lt = Input.fromNullable(modelCommentListAllCommentsOnEngagementCompositeKeyInput);
            return this;
        }
    }

    public C19081x7db5aaa6(Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> input, Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> input2, Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> input3, Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> input4, Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> input5, Input<List<ModelCommentListAllCommentsOnEngagementCompositeKeyInput>> input6, Input<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> input7) {
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

    public ModelCommentListAllCommentsOnEngagementCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelCommentListAllCommentsOnEngagementCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelCommentListAllCommentsOnEngagementCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelCommentListAllCommentsOnEngagementCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelCommentListAllCommentsOnEngagementCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelCommentListAllCommentsOnEngagementCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelCommentListAllCommentsOnEngagementCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19081x7db5aaa6.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19081x7db5aaa6.this.eq.value != 0 ? ((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) C19081x7db5aaa6.this.eq.value).marshaller() : null);
                }
                if (C19081x7db5aaa6.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19081x7db5aaa6.this.le.value != 0 ? ((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) C19081x7db5aaa6.this.le.value).marshaller() : null);
                }
                if (C19081x7db5aaa6.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19081x7db5aaa6.this.lt.value != 0 ? ((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) C19081x7db5aaa6.this.lt.value).marshaller() : null);
                }
                if (C19081x7db5aaa6.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19081x7db5aaa6.this.ge.value != 0 ? ((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) C19081x7db5aaa6.this.ge.value).marshaller() : null);
                }
                if (C19081x7db5aaa6.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19081x7db5aaa6.this.gt.value != 0 ? ((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) C19081x7db5aaa6.this.gt.value).marshaller() : null);
                }
                if (C19081x7db5aaa6.this.between.defined) {
                    inputFieldWriter.writeList("between", C19081x7db5aaa6.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCommentListAllCommentsOnEngagementCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19081x7db5aaa6.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19081x7db5aaa6.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19081x7db5aaa6.this.beginsWith.value != 0 ? ((ModelCommentListAllCommentsOnEngagementCompositeKeyInput) C19081x7db5aaa6.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
