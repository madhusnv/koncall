package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMissedOpportunitiesFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelMissedOpportunitiesFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelMissedOpportunityTypeInput> missedOpportunityType;
    private final Input<ModelMissedOpportunitiesFilterInput> not;
    private final Input<List<ModelMissedOpportunitiesFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelIDInputExtended> relatedEngagementId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelMissedOpportunityTypeInput> missedOpportunityType = Input.absent();
        private Input<ModelIDInputExtended> relatedEngagementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMissedOpportunitiesFilterInput>> and = Input.absent();
        private Input<List<ModelMissedOpportunitiesFilterInput>> or = Input.absent();
        private Input<ModelMissedOpportunitiesFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelMissedOpportunitiesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelMissedOpportunitiesFilterInput build() {
            return new ModelMissedOpportunitiesFilterInput(this.accountId, this.ownerId, this.primaryTeamId, this.contactId, this.missedOpportunityType, this.relatedEngagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder missedOpportunityType(ModelMissedOpportunityTypeInput modelMissedOpportunityTypeInput) {
            this.missedOpportunityType = Input.fromNullable(modelMissedOpportunityTypeInput);
            return this;
        }

        public Builder not(ModelMissedOpportunitiesFilterInput modelMissedOpportunitiesFilterInput) {
            this.not = Input.fromNullable(modelMissedOpportunitiesFilterInput);
            return this;
        }

        public Builder or(List<ModelMissedOpportunitiesFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
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

    public ModelMissedOpportunitiesFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelMissedOpportunityTypeInput> input5, Input<ModelIDInputExtended> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelMissedOpportunitiesFilterInput>> input9, Input<List<ModelMissedOpportunitiesFilterInput>> input10, Input<ModelMissedOpportunitiesFilterInput> input11) {
        this.accountId = input;
        this.ownerId = input2;
        this.primaryTeamId = input3;
        this.contactId = input4;
        this.missedOpportunityType = input5;
        this.relatedEngagementId = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelMissedOpportunitiesFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMissedOpportunitiesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMissedOpportunitiesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelMissedOpportunitiesFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelMissedOpportunitiesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelMissedOpportunitiesFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelMissedOpportunitiesFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelMissedOpportunitiesFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelMissedOpportunitiesFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelMissedOpportunitiesFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelMissedOpportunitiesFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.missedOpportunityType.defined) {
                    inputFieldWriter.writeObject("missedOpportunityType", ModelMissedOpportunitiesFilterInput.this.missedOpportunityType.value != 0 ? ((ModelMissedOpportunityTypeInput) ModelMissedOpportunitiesFilterInput.this.missedOpportunityType.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.relatedEngagementId.defined) {
                    inputFieldWriter.writeObject("relatedEngagementId", ModelMissedOpportunitiesFilterInput.this.relatedEngagementId.value != 0 ? ((ModelIDInputExtended) ModelMissedOpportunitiesFilterInput.this.relatedEngagementId.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMissedOpportunitiesFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMissedOpportunitiesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMissedOpportunitiesFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMissedOpportunitiesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMissedOpportunitiesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMissedOpportunitiesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMissedOpportunitiesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMissedOpportunitiesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMissedOpportunitiesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMissedOpportunitiesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMissedOpportunitiesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMissedOpportunitiesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMissedOpportunitiesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMissedOpportunitiesFilterInput.this.not.value != 0 ? ((ModelMissedOpportunitiesFilterInput) ModelMissedOpportunitiesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelMissedOpportunityTypeInput missedOpportunityType() {
        return this.missedOpportunityType.value;
    }

    public ModelMissedOpportunitiesFilterInput not() {
        return this.not.value;
    }

    public List<ModelMissedOpportunitiesFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
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
