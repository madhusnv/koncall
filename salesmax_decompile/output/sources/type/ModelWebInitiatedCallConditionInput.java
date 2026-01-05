package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWebInitiatedCallConditionInput implements InputType {
    private final Input<List<ModelWebInitiatedCallConditionInput>> and;
    private final Input<ModelIDInput> callId;
    private final Input<ModelWebInitiatedCallConditionInput> not;
    private final Input<List<ModelWebInitiatedCallConditionInput>> or;
    private final Input<ModelStringInput> status;

    public static final class Builder {
        private Input<ModelIDInput> callId = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<List<ModelWebInitiatedCallConditionInput>> and = Input.absent();
        private Input<List<ModelWebInitiatedCallConditionInput>> or = Input.absent();
        private Input<ModelWebInitiatedCallConditionInput> not = Input.absent();

        public Builder and(List<ModelWebInitiatedCallConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWebInitiatedCallConditionInput build() {
            return new ModelWebInitiatedCallConditionInput(this.callId, this.status, this.and, this.or, this.not);
        }

        public Builder callId(ModelIDInput modelIDInput) {
            this.callId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelWebInitiatedCallConditionInput modelWebInitiatedCallConditionInput) {
            this.not = Input.fromNullable(modelWebInitiatedCallConditionInput);
            return this;
        }

        public Builder or(List<ModelWebInitiatedCallConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelWebInitiatedCallConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<List<ModelWebInitiatedCallConditionInput>> input3, Input<List<ModelWebInitiatedCallConditionInput>> input4, Input<ModelWebInitiatedCallConditionInput> input5) {
        this.callId = input;
        this.status = input2;
        this.and = input3;
        this.or = input4;
        this.not = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelWebInitiatedCallConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput callId() {
        return this.callId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWebInitiatedCallConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWebInitiatedCallConditionInput.this.callId.defined) {
                    inputFieldWriter.writeObject("callId", ModelWebInitiatedCallConditionInput.this.callId.value != 0 ? ((ModelIDInput) ModelWebInitiatedCallConditionInput.this.callId.value).marshaller() : null);
                }
                if (ModelWebInitiatedCallConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWebInitiatedCallConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelWebInitiatedCallConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelWebInitiatedCallConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWebInitiatedCallConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWebInitiatedCallConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWebInitiatedCallConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWebInitiatedCallConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWebInitiatedCallConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWebInitiatedCallConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWebInitiatedCallConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWebInitiatedCallConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWebInitiatedCallConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWebInitiatedCallConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWebInitiatedCallConditionInput.this.not.value != 0 ? ((ModelWebInitiatedCallConditionInput) ModelWebInitiatedCallConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelWebInitiatedCallConditionInput not() {
        return this.not.value;
    }

    public List<ModelWebInitiatedCallConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }
}
