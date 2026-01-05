package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignRunFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCampaignRunFilterInput>> and;
    private final Input<ModelStringInput> campaignChannelIdentifier;
    private final Input<ModelIDInput> campaignId;
    private final Input<ModelStringInput> campaignName;
    private final Input<ModelCampaignTypeInput> campaignType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> deliveredCount;
    private final Input<ModelStringInput> endDate;
    private final Input<ModelIntInput> failedCount;
    private final Input<ModelIDInput> id;
    private final Input<ModelIntInput> leadCount;
    private final Input<ModelIntInput> messageCreated;
    private final Input<ModelStringInput> name;
    private final Input<ModelCampaignRunFilterInput> not;
    private final Input<List<ModelCampaignRunFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelCampaignRunFilterInput>> and = Input.absent();
        private Input<List<ModelCampaignRunFilterInput>> or = Input.absent();
        private Input<ModelCampaignRunFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCampaignRunFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCampaignRunFilterInput build() {
            return new ModelCampaignRunFilterInput(this.id, this.accountId, this.campaignId, this.campaignName, this.campaignType, this.campaignChannelIdentifier, this.name, this.startDate, this.endDate, this.status, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelCampaignRunFilterInput modelCampaignRunFilterInput) {
            this.not = Input.fromNullable(modelCampaignRunFilterInput);
            return this;
        }

        public Builder or(List<ModelCampaignRunFilterInput> list) {
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

    public ModelCampaignRunFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelCampaignTypeInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelCampaignStatusInput> input10, Input<ModelStringInput> input11, Input<ModelIntInput> input12, Input<ModelIntInput> input13, Input<ModelIntInput> input14, Input<ModelIntInput> input15, Input<ModelIntInput> input16, Input<ModelIntInput> input17, Input<ModelIntInput> input18, Input<ModelIDInput> input19, Input<ModelIDInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<List<ModelCampaignRunFilterInput>> input23, Input<List<ModelCampaignRunFilterInput>> input24, Input<ModelCampaignRunFilterInput> input25) {
        this.id = input;
        this.accountId = input2;
        this.campaignId = input3;
        this.campaignName = input4;
        this.campaignType = input5;
        this.campaignChannelIdentifier = input6;
        this.name = input7;
        this.startDate = input8;
        this.endDate = input9;
        this.status = input10;
        this.systemPauseReason = input11;
        this.leadCount = input12;
        this.messageCreated = input13;
        this.sentCount = input14;
        this.deliveredCount = input15;
        this.readCount = input16;
        this.repliedCount = input17;
        this.failedCount = input18;
        this.ownerId = input19;
        this.primaryTeamId = input20;
        this.createdAt = input21;
        this.updatedAt = input22;
        this.and = input23;
        this.or = input24;
        this.not = input25;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCampaignRunFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelIntInput leadCount() {
        return this.leadCount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCampaignRunFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCampaignRunFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCampaignRunFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCampaignRunFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", ModelCampaignRunFilterInput.this.campaignId.value != 0 ? ((ModelIDInput) ModelCampaignRunFilterInput.this.campaignId.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.campaignName.defined) {
                    inputFieldWriter.writeObject("campaignName", ModelCampaignRunFilterInput.this.campaignName.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.campaignName.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.campaignType.defined) {
                    inputFieldWriter.writeObject("campaignType", ModelCampaignRunFilterInput.this.campaignType.value != 0 ? ((ModelCampaignTypeInput) ModelCampaignRunFilterInput.this.campaignType.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeObject("campaignChannelIdentifier", ModelCampaignRunFilterInput.this.campaignChannelIdentifier.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.campaignChannelIdentifier.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelCampaignRunFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.startDate.defined) {
                    inputFieldWriter.writeObject("startDate", ModelCampaignRunFilterInput.this.startDate.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.startDate.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.endDate.defined) {
                    inputFieldWriter.writeObject("endDate", ModelCampaignRunFilterInput.this.endDate.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.endDate.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCampaignRunFilterInput.this.status.value != 0 ? ((ModelCampaignStatusInput) ModelCampaignRunFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeObject("systemPauseReason", ModelCampaignRunFilterInput.this.systemPauseReason.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.systemPauseReason.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.leadCount.defined) {
                    inputFieldWriter.writeObject("leadCount", ModelCampaignRunFilterInput.this.leadCount.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.leadCount.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.messageCreated.defined) {
                    inputFieldWriter.writeObject("messageCreated", ModelCampaignRunFilterInput.this.messageCreated.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.messageCreated.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.sentCount.defined) {
                    inputFieldWriter.writeObject("sentCount", ModelCampaignRunFilterInput.this.sentCount.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.sentCount.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeObject("deliveredCount", ModelCampaignRunFilterInput.this.deliveredCount.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.deliveredCount.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.readCount.defined) {
                    inputFieldWriter.writeObject("readCount", ModelCampaignRunFilterInput.this.readCount.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.readCount.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.repliedCount.defined) {
                    inputFieldWriter.writeObject("repliedCount", ModelCampaignRunFilterInput.this.repliedCount.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.repliedCount.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.failedCount.defined) {
                    inputFieldWriter.writeObject("failedCount", ModelCampaignRunFilterInput.this.failedCount.value != 0 ? ((ModelIntInput) ModelCampaignRunFilterInput.this.failedCount.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelCampaignRunFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelCampaignRunFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelCampaignRunFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelCampaignRunFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCampaignRunFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCampaignRunFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCampaignRunFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCampaignRunFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCampaignRunFilterInput.this.not.value != 0 ? ((ModelCampaignRunFilterInput) ModelCampaignRunFilterInput.this.not.value).marshaller() : null);
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

    public ModelCampaignRunFilterInput not() {
        return this.not.value;
    }

    public List<ModelCampaignRunFilterInput> or() {
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
