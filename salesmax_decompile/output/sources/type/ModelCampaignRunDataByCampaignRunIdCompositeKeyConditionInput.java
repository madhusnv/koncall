package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput implements InputType {
    private final Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> beginsWith;
    private final Input<List<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput>> between;
    private final Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> eq;
    private final Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> ge;
    private final Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> gt;
    private final Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> le;
    private final Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> eq = Input.absent();
        private Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> le = Input.absent();
        private Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> lt = Input.absent();
        private Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> ge = Input.absent();
        private Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput>> between = Input.absent();
        private Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelCampaignRunDataByCampaignRunIdCompositeKeyInput modelCampaignRunDataByCampaignRunIdCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelCampaignRunDataByCampaignRunIdCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput build() {
            return new ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelCampaignRunDataByCampaignRunIdCompositeKeyInput modelCampaignRunDataByCampaignRunIdCompositeKeyInput) {
            this.eq = Input.fromNullable(modelCampaignRunDataByCampaignRunIdCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelCampaignRunDataByCampaignRunIdCompositeKeyInput modelCampaignRunDataByCampaignRunIdCompositeKeyInput) {
            this.ge = Input.fromNullable(modelCampaignRunDataByCampaignRunIdCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelCampaignRunDataByCampaignRunIdCompositeKeyInput modelCampaignRunDataByCampaignRunIdCompositeKeyInput) {
            this.gt = Input.fromNullable(modelCampaignRunDataByCampaignRunIdCompositeKeyInput);
            return this;
        }

        public Builder le(ModelCampaignRunDataByCampaignRunIdCompositeKeyInput modelCampaignRunDataByCampaignRunIdCompositeKeyInput) {
            this.le = Input.fromNullable(modelCampaignRunDataByCampaignRunIdCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelCampaignRunDataByCampaignRunIdCompositeKeyInput modelCampaignRunDataByCampaignRunIdCompositeKeyInput) {
            this.lt = Input.fromNullable(modelCampaignRunDataByCampaignRunIdCompositeKeyInput);
            return this;
        }
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput(Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> input, Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> input2, Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> input3, Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> input4, Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> input5, Input<List<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput>> input6, Input<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> input7) {
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

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelCampaignRunDataByCampaignRunIdCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.le.value != 0 ? ((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelCampaignRunDataByCampaignRunIdCompositeKeyInput) ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
