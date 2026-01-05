package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignRunConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCampaignRunConditionInput>> and;
    private final Input<ModelStringInput> campaignChannelIdentifier;
    private final Input<ModelIDInput> campaignId;
    private final Input<ModelStringInput> campaignName;
    private final Input<ModelCampaignTypeInput> campaignType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> deliveredCount;
    private final Input<ModelStringInput> endDate;
    private final Input<ModelIntInput> failedCount;
    private final Input<ModelIntInput> leadCount;
    private final Input<ModelIntInput> messageCreated;
    private final Input<ModelStringInput> name;
    private final Input<ModelCampaignRunConditionInput> not;
    private final Input<List<ModelCampaignRunConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelIntInput> readCount;
    private final Input<ModelIntInput> repliedCount;
    private final Input<ModelIntInput> sentCount;
    private final Input<ModelStringInput> startDate;
    private final Input<ModelCampaignStatusInput> status;
    private final Input<ModelStringInput> systemPauseReason;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> campaignId = Input.absent();
        private Input<ModelStringInput> campaignName = Input.absent();
        private Input<ModelCampaignTypeInput> campaignType = Input.absent();
        private Input<ModelStringInput> campaignChannelIdentifier = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> startDate = Input.absent();
        private Input<ModelStringInput> endDate = Input.absent();
        private Input<ModelCampaignStatusInput> status = Input.absent();
        private Input<ModelStringInput> systemPauseReason = Input.absent();
        private Input<ModelIntInput> leadCount = Input.absent();
        private Input<ModelIntInput> messageCreated = Input.absent();
        private Input<ModelIntInput> sentCount = Input.absent();
        private Input<ModelIntInput> deliveredCount = Input.absent();
        private Input<ModelIntInput> readCount = Input.absent();
        private Input<ModelIntInput> repliedCount = Input.absent();
        private Input<ModelIntInput> failedCount = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCampaignRunConditionInput>> and = Input.absent();
        private Input<List<ModelCampaignRunConditionInput>> or = Input.absent();
        private Input<ModelCampaignRunConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCampaignRunConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCampaignRunConditionInput build() {
            return new ModelCampaignRunConditionInput(this.accountId, this.campaignId, this.campaignName, this.campaignType, this.campaignChannelIdentifier, this.name, this.startDate, this.endDate, this.status, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder campaignChannelIdentifier(ModelStringInput modelStringInput) {
            this.campaignChannelIdentifier = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignId(ModelIDInput modelIDInput) {
            this.campaignId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder campaignName(ModelStringInput modelStringInput) {
            this.campaignName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignType(ModelCampaignTypeInput modelCampaignTypeInput) {
            this.campaignType = Input.fromNullable(modelCampaignTypeInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deliveredCount(ModelIntInput modelIntInput) {
            this.deliveredCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder endDate(ModelStringInput modelStringInput) {
            this.endDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder failedCount(ModelIntInput modelIntInput) {
            this.failedCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder leadCount(ModelIntInput modelIntInput) {
            this.leadCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder messageCreated(ModelIntInput modelIntInput) {
            this.messageCreated = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCampaignRunConditionInput modelCampaignRunConditionInput) {
            this.not = Input.fromNullable(modelCampaignRunConditionInput);
            return this;
        }

        public Builder or(List<ModelCampaignRunConditionInput> list) {
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

        public Builder readCount(ModelIntInput modelIntInput) {
            this.readCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder repliedCount(ModelIntInput modelIntInput) {
            this.repliedCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder sentCount(ModelIntInput modelIntInput) {
            this.sentCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder startDate(ModelStringInput modelStringInput) {
            this.startDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelCampaignStatusInput modelCampaignStatusInput) {
            this.status = Input.fromNullable(modelCampaignStatusInput);
            return this;
        }

        public Builder systemPauseReason(ModelStringInput modelStringInput) {
            this.systemPauseReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCampaignRunConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelCampaignTypeInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelCampaignStatusInput> input9, Input<ModelStringInput> input10, Input<ModelIntInput> input11, Input<ModelIntInput> input12, Input<ModelIntInput> input13, Input<ModelIntInput> input14, Input<ModelIntInput> input15, Input<ModelIntInput> input16, Input<ModelIntInput> input17, Input<ModelIDInput> input18, Input<ModelIDInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<List<ModelCampaignRunConditionInput>> input22, Input<List<ModelCampaignRunConditionInput>> input23, Input<ModelCampaignRunConditionInput> input24) {
        this.accountId = input;
        this.campaignId = input2;
        this.campaignName = input3;
        this.campaignType = input4;
        this.campaignChannelIdentifier = input5;
        this.name = input6;
        this.startDate = input7;
        this.endDate = input8;
        this.status = input9;
        this.systemPauseReason = input10;
        this.leadCount = input11;
        this.messageCreated = input12;
        this.sentCount = input13;
        this.deliveredCount = input14;
        this.readCount = input15;
        this.repliedCount = input16;
        this.failedCount = input17;
        this.ownerId = input18;
        this.primaryTeamId = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCampaignRunConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput campaignChannelIdentifier() {
        return this.campaignChannelIdentifier.value;
    }

    public ModelIDInput campaignId() {
        return this.campaignId.value;
    }

    public ModelStringInput campaignName() {
        return this.campaignName.value;
    }

    public ModelCampaignTypeInput campaignType() {
        return this.campaignType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIntInput deliveredCount() {
        return this.deliveredCount.value;
    }

    public ModelStringInput endDate() {
        return this.endDate.value;
    }

    public ModelIntInput failedCount() {
        return this.failedCount.value;
    }

    public ModelIntInput leadCount() {
        return this.leadCount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCampaignRunConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCampaignRunConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", ModelCampaignRunConditionInput.this.campaignId.value != 0 ? ((ModelIDInput) ModelCampaignRunConditionInput.this.campaignId.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.campaignName.defined) {
                    inputFieldWriter.writeObject("campaignName", ModelCampaignRunConditionInput.this.campaignName.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.campaignName.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.campaignType.defined) {
                    inputFieldWriter.writeObject("campaignType", ModelCampaignRunConditionInput.this.campaignType.value != 0 ? ((ModelCampaignTypeInput) ModelCampaignRunConditionInput.this.campaignType.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeObject("campaignChannelIdentifier", ModelCampaignRunConditionInput.this.campaignChannelIdentifier.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.campaignChannelIdentifier.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelCampaignRunConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.startDate.defined) {
                    inputFieldWriter.writeObject("startDate", ModelCampaignRunConditionInput.this.startDate.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.startDate.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.endDate.defined) {
                    inputFieldWriter.writeObject("endDate", ModelCampaignRunConditionInput.this.endDate.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.endDate.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCampaignRunConditionInput.this.status.value != 0 ? ((ModelCampaignStatusInput) ModelCampaignRunConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeObject("systemPauseReason", ModelCampaignRunConditionInput.this.systemPauseReason.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.systemPauseReason.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.leadCount.defined) {
                    inputFieldWriter.writeObject("leadCount", ModelCampaignRunConditionInput.this.leadCount.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.leadCount.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.messageCreated.defined) {
                    inputFieldWriter.writeObject("messageCreated", ModelCampaignRunConditionInput.this.messageCreated.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.messageCreated.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.sentCount.defined) {
                    inputFieldWriter.writeObject("sentCount", ModelCampaignRunConditionInput.this.sentCount.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.sentCount.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeObject("deliveredCount", ModelCampaignRunConditionInput.this.deliveredCount.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.deliveredCount.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.readCount.defined) {
                    inputFieldWriter.writeObject("readCount", ModelCampaignRunConditionInput.this.readCount.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.readCount.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.repliedCount.defined) {
                    inputFieldWriter.writeObject("repliedCount", ModelCampaignRunConditionInput.this.repliedCount.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.repliedCount.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.failedCount.defined) {
                    inputFieldWriter.writeObject("failedCount", ModelCampaignRunConditionInput.this.failedCount.value != 0 ? ((ModelIntInput) ModelCampaignRunConditionInput.this.failedCount.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelCampaignRunConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelCampaignRunConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelCampaignRunConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelCampaignRunConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCampaignRunConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCampaignRunConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCampaignRunConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCampaignRunConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCampaignRunConditionInput.this.not.value != 0 ? ((ModelCampaignRunConditionInput) ModelCampaignRunConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIntInput messageCreated() {
        return this.messageCreated.value;
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelCampaignRunConditionInput not() {
        return this.not.value;
    }

    public List<ModelCampaignRunConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelIntInput readCount() {
        return this.readCount.value;
    }

    public ModelIntInput repliedCount() {
        return this.repliedCount.value;
    }

    public ModelIntInput sentCount() {
        return this.sentCount.value;
    }

    public ModelStringInput startDate() {
        return this.startDate.value;
    }

    public ModelCampaignStatusInput status() {
        return this.status.value;
    }

    public ModelStringInput systemPauseReason() {
        return this.systemPauseReason.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
