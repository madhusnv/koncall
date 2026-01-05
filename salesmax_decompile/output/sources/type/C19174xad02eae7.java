package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19174xad02eae7 implements InputType {
    private final Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> beginsWith;
    private final Input<List<ModelMentionUserMembershipByAnnouncementCompositeKeyInput>> between;
    private final Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> eq;
    private final Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> ge;
    private final Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> gt;
    private final Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> le;
    private final Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> lt;

    /* renamed from: type.ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> eq = Input.absent();
        private Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> le = Input.absent();
        private Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> lt = Input.absent();
        private Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> ge = Input.absent();
        private Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelMentionUserMembershipByAnnouncementCompositeKeyInput>> between = Input.absent();
        private Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelMentionUserMembershipByAnnouncementCompositeKeyInput modelMentionUserMembershipByAnnouncementCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelMentionUserMembershipByAnnouncementCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19174xad02eae7 build() {
            return new C19174xad02eae7(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelMentionUserMembershipByAnnouncementCompositeKeyInput modelMentionUserMembershipByAnnouncementCompositeKeyInput) {
            this.eq = Input.fromNullable(modelMentionUserMembershipByAnnouncementCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelMentionUserMembershipByAnnouncementCompositeKeyInput modelMentionUserMembershipByAnnouncementCompositeKeyInput) {
            this.ge = Input.fromNullable(modelMentionUserMembershipByAnnouncementCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelMentionUserMembershipByAnnouncementCompositeKeyInput modelMentionUserMembershipByAnnouncementCompositeKeyInput) {
            this.gt = Input.fromNullable(modelMentionUserMembershipByAnnouncementCompositeKeyInput);
            return this;
        }

        public Builder le(ModelMentionUserMembershipByAnnouncementCompositeKeyInput modelMentionUserMembershipByAnnouncementCompositeKeyInput) {
            this.le = Input.fromNullable(modelMentionUserMembershipByAnnouncementCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelMentionUserMembershipByAnnouncementCompositeKeyInput modelMentionUserMembershipByAnnouncementCompositeKeyInput) {
            this.lt = Input.fromNullable(modelMentionUserMembershipByAnnouncementCompositeKeyInput);
            return this;
        }
    }

    public C19174xad02eae7(Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> input, Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> input2, Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> input3, Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> input4, Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> input5, Input<List<ModelMentionUserMembershipByAnnouncementCompositeKeyInput>> input6, Input<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> input7) {
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

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelMentionUserMembershipByAnnouncementCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelMentionUserMembershipByAnnouncementCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19174xad02eae7.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19174xad02eae7.this.eq.value != 0 ? ((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) C19174xad02eae7.this.eq.value).marshaller() : null);
                }
                if (C19174xad02eae7.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19174xad02eae7.this.le.value != 0 ? ((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) C19174xad02eae7.this.le.value).marshaller() : null);
                }
                if (C19174xad02eae7.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19174xad02eae7.this.lt.value != 0 ? ((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) C19174xad02eae7.this.lt.value).marshaller() : null);
                }
                if (C19174xad02eae7.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19174xad02eae7.this.ge.value != 0 ? ((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) C19174xad02eae7.this.ge.value).marshaller() : null);
                }
                if (C19174xad02eae7.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19174xad02eae7.this.gt.value != 0 ? ((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) C19174xad02eae7.this.gt.value).marshaller() : null);
                }
                if (C19174xad02eae7.this.between.defined) {
                    inputFieldWriter.writeList("between", C19174xad02eae7.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMentionUserMembershipByAnnouncementCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19174xad02eae7.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19174xad02eae7.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19174xad02eae7.this.beginsWith.value != 0 ? ((ModelMentionUserMembershipByAnnouncementCompositeKeyInput) C19174xad02eae7.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
