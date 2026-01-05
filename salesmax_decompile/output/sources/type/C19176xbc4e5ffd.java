package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelMentionUserMembershipByMentionedUserIdCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19176xbc4e5ffd implements InputType {
    private final Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> beginsWith;
    private final Input<List<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput>> between;
    private final Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> eq;
    private final Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> ge;
    private final Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> gt;
    private final Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> le;
    private final Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> lt;

    /* renamed from: type.ModelMentionUserMembershipByMentionedUserIdCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> eq = Input.absent();
        private Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> le = Input.absent();
        private Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> lt = Input.absent();
        private Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> ge = Input.absent();
        private Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput>> between = Input.absent();
        private Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput modelMentionUserMembershipByMentionedUserIdCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelMentionUserMembershipByMentionedUserIdCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19176xbc4e5ffd build() {
            return new C19176xbc4e5ffd(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput modelMentionUserMembershipByMentionedUserIdCompositeKeyInput) {
            this.eq = Input.fromNullable(modelMentionUserMembershipByMentionedUserIdCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput modelMentionUserMembershipByMentionedUserIdCompositeKeyInput) {
            this.ge = Input.fromNullable(modelMentionUserMembershipByMentionedUserIdCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput modelMentionUserMembershipByMentionedUserIdCompositeKeyInput) {
            this.gt = Input.fromNullable(modelMentionUserMembershipByMentionedUserIdCompositeKeyInput);
            return this;
        }

        public Builder le(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput modelMentionUserMembershipByMentionedUserIdCompositeKeyInput) {
            this.le = Input.fromNullable(modelMentionUserMembershipByMentionedUserIdCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput modelMentionUserMembershipByMentionedUserIdCompositeKeyInput) {
            this.lt = Input.fromNullable(modelMentionUserMembershipByMentionedUserIdCompositeKeyInput);
            return this;
        }
    }

    public C19176xbc4e5ffd(Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> input, Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> input2, Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> input3, Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> input4, Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> input5, Input<List<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput>> input6, Input<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> input7) {
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

    public ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMentionUserMembershipByMentionedUserIdCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19176xbc4e5ffd.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19176xbc4e5ffd.this.eq.value != 0 ? ((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) C19176xbc4e5ffd.this.eq.value).marshaller() : null);
                }
                if (C19176xbc4e5ffd.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19176xbc4e5ffd.this.le.value != 0 ? ((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) C19176xbc4e5ffd.this.le.value).marshaller() : null);
                }
                if (C19176xbc4e5ffd.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19176xbc4e5ffd.this.lt.value != 0 ? ((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) C19176xbc4e5ffd.this.lt.value).marshaller() : null);
                }
                if (C19176xbc4e5ffd.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19176xbc4e5ffd.this.ge.value != 0 ? ((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) C19176xbc4e5ffd.this.ge.value).marshaller() : null);
                }
                if (C19176xbc4e5ffd.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19176xbc4e5ffd.this.gt.value != 0 ? ((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) C19176xbc4e5ffd.this.gt.value).marshaller() : null);
                }
                if (C19176xbc4e5ffd.this.between.defined) {
                    inputFieldWriter.writeList("between", C19176xbc4e5ffd.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMentionUserMembershipByMentionedUserIdCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19176xbc4e5ffd.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19176xbc4e5ffd.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19176xbc4e5ffd.this.beginsWith.value != 0 ? ((ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput) C19176xbc4e5ffd.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
