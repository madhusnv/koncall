package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMissedOpportunitiesConditionInput implements InputType {
    private final Input<List<ModelMissedOpportunitiesConditionInput>> and;
    private final Input<ModelStringInput> callLaterDateTime;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> messageBody;
    private final Input<ModelMissedOpportunitiesConditionInput> not;
    private final Input<List<ModelMissedOpportunitiesConditionInput>> or;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelIDInputExtended> relatedEngagementId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelStringInput> messageBody = Input.absent();
        private Input<ModelStringInput> callLaterDateTime = Input.absent();
        private Input<ModelIDInputExtended> relatedEngagementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMissedOpportunitiesConditionInput>> and = Input.absent();
        private Input<List<ModelMissedOpportunitiesConditionInput>> or = Input.absent();
        private Input<ModelMissedOpportunitiesConditionInput> not = Input.absent();

        public Builder and(List<ModelMissedOpportunitiesConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelMissedOpportunitiesConditionInput build() {
            return new ModelMissedOpportunitiesConditionInput(this.primaryTeamId, this.messageBody, this.callLaterDateTime, this.relatedEngagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callLaterDateTime(ModelStringInput modelStringInput) {
            this.callLaterDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageBody(ModelStringInput modelStringInput) {
            this.messageBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelMissedOpportunitiesConditionInput modelMissedOpportunitiesConditionInput) {
            this.not = Input.fromNullable(modelMissedOpportunitiesConditionInput);
            return this;
        }

        public Builder or(List<ModelMissedOpportunitiesConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder relatedEngagementId(ModelIDInputExtended modelIDInputExtended) {
            this.relatedEngagementId = Input.fromNullable(modelIDInputExtended);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelMissedOpportunitiesConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelIDInputExtended> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<List<ModelMissedOpportunitiesConditionInput>> input7, Input<List<ModelMissedOpportunitiesConditionInput>> input8, Input<ModelMissedOpportunitiesConditionInput> input9) {
        this.primaryTeamId = input;
        this.messageBody = input2;
        this.callLaterDateTime = input3;
        this.relatedEngagementId = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
        this.and = input7;
        this.or = input8;
        this.not = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelMissedOpportunitiesConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput callLaterDateTime() {
        return this.callLaterDateTime.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMissedOpportunitiesConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMissedOpportunitiesConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelMissedOpportunitiesConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelMissedOpportunitiesConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.messageBody.defined) {
                    inputFieldWriter.writeObject("messageBody", ModelMissedOpportunitiesConditionInput.this.messageBody.value != 0 ? ((ModelStringInput) ModelMissedOpportunitiesConditionInput.this.messageBody.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.callLaterDateTime.defined) {
                    inputFieldWriter.writeObject("callLaterDateTime", ModelMissedOpportunitiesConditionInput.this.callLaterDateTime.value != 0 ? ((ModelStringInput) ModelMissedOpportunitiesConditionInput.this.callLaterDateTime.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.relatedEngagementId.defined) {
                    inputFieldWriter.writeObject("relatedEngagementId", ModelMissedOpportunitiesConditionInput.this.relatedEngagementId.value != 0 ? ((ModelIDInputExtended) ModelMissedOpportunitiesConditionInput.this.relatedEngagementId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMissedOpportunitiesConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMissedOpportunitiesConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMissedOpportunitiesConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMissedOpportunitiesConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMissedOpportunitiesConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMissedOpportunitiesConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMissedOpportunitiesConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMissedOpportunitiesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMissedOpportunitiesConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMissedOpportunitiesConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMissedOpportunitiesConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMissedOpportunitiesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMissedOpportunitiesConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMissedOpportunitiesConditionInput.this.not.value != 0 ? ((ModelMissedOpportunitiesConditionInput) ModelMissedOpportunitiesConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messageBody() {
        return this.messageBody.value;
    }

    public ModelMissedOpportunitiesConditionInput not() {
        return this.not.value;
    }

    public List<ModelMissedOpportunitiesConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelIDInputExtended relatedEngagementId() {
        return this.relatedEngagementId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
