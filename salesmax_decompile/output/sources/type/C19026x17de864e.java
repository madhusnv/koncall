package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* renamed from: type.ModelAttendanceAttendanceByAccountAndUserCompositeKeyConditionInput */
/* loaded from: classes7.dex */
public final class C19026x17de864e implements InputType {
    private final Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> beginsWith;
    private final Input<List<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput>> between;
    private final Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> eq;
    private final Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> ge;
    private final Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> gt;
    private final Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> le;
    private final Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> lt;

    /* renamed from: type.ModelAttendanceAttendanceByAccountAndUserCompositeKeyConditionInput$Builder */
    public static final class Builder {
        private Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> eq = Input.absent();
        private Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> le = Input.absent();
        private Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> lt = Input.absent();
        private Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> ge = Input.absent();
        private Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput>> between = Input.absent();
        private Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput modelAttendanceAttendanceByAccountAndUserCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelAttendanceAttendanceByAccountAndUserCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public C19026x17de864e build() {
            return new C19026x17de864e(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput modelAttendanceAttendanceByAccountAndUserCompositeKeyInput) {
            this.eq = Input.fromNullable(modelAttendanceAttendanceByAccountAndUserCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput modelAttendanceAttendanceByAccountAndUserCompositeKeyInput) {
            this.ge = Input.fromNullable(modelAttendanceAttendanceByAccountAndUserCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput modelAttendanceAttendanceByAccountAndUserCompositeKeyInput) {
            this.gt = Input.fromNullable(modelAttendanceAttendanceByAccountAndUserCompositeKeyInput);
            return this;
        }

        public Builder le(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput modelAttendanceAttendanceByAccountAndUserCompositeKeyInput) {
            this.le = Input.fromNullable(modelAttendanceAttendanceByAccountAndUserCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput modelAttendanceAttendanceByAccountAndUserCompositeKeyInput) {
            this.lt = Input.fromNullable(modelAttendanceAttendanceByAccountAndUserCompositeKeyInput);
            return this;
        }
    }

    public C19026x17de864e(Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> input, Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> input2, Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> input3, Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> input4, Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> input5, Input<List<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput>> input6, Input<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> input7) {
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

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAttendanceAttendanceByAccountAndUserCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (C19026x17de864e.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", C19026x17de864e.this.eq.value != 0 ? ((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) C19026x17de864e.this.eq.value).marshaller() : null);
                }
                if (C19026x17de864e.this.le.defined) {
                    inputFieldWriter.writeObject("le", C19026x17de864e.this.le.value != 0 ? ((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) C19026x17de864e.this.le.value).marshaller() : null);
                }
                if (C19026x17de864e.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", C19026x17de864e.this.lt.value != 0 ? ((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) C19026x17de864e.this.lt.value).marshaller() : null);
                }
                if (C19026x17de864e.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", C19026x17de864e.this.ge.value != 0 ? ((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) C19026x17de864e.this.ge.value).marshaller() : null);
                }
                if (C19026x17de864e.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", C19026x17de864e.this.gt.value != 0 ? ((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) C19026x17de864e.this.gt.value).marshaller() : null);
                }
                if (C19026x17de864e.this.between.defined) {
                    inputFieldWriter.writeList("between", C19026x17de864e.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAttendanceAttendanceByAccountAndUserCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) C19026x17de864e.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (C19026x17de864e.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", C19026x17de864e.this.beginsWith.value != 0 ? ((ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput) C19026x17de864e.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
