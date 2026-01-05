package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignDefinitionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelBooleanInput> allowMultiple;
    private final Input<List<ModelCampaignDefinitionConditionInput>> and;
    private final Input<ModelIDInput> associatedEntityListId;
    private final Input<ModelStringInput> campaignCategory;
    private final Input<ModelStringInput> campaignChannelIdentifier;
    private final Input<ModelStringInput> campaignData;
    private final Input<ModelCampaignRunFrequencyUnitInput> campaignRunFrequencyUnit;
    private final Input<ModelIntInput> campaignRunFrequencyValue;
    private final Input<ModelStringInput> campaignSubCategory;
    private final Input<ModelCampaignTypeInput> campaignType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> daysToSend;
    private final Input<ModelIntInput> deliveredCount;
    private final Input<ModelStringInput> description;
    private final Input<ModelIntInput> durationOfRunInDays;
    private final Input<ModelStringInput> endDateOfRun;
    private final Input<ModelIntInput> failedCount;
    private final Input<ModelBooleanInput> includeHistoricalMemberships;
    private final Input<ModelIntInput> leadLimit;
    private final Input<ModelIntInput> messageCreated;
    private final Input<ModelStringInput> name;
    private final Input<ModelCampaignDefinitionConditionInput> not;
    private final Input<List<ModelCampaignDefinitionConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelIntInput> readCount;
    private final Input<ModelIntInput> repliedCount;
    private final Input<ModelIntInput> sentCount;
    private final Input<ModelStringInput> startDateOfRun;
    private final Input<ModelCampaignStatusInput> status;
    private final Input<ModelStringInput> systemPauseReason;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> campaignCategory = Input.absent();
        private Input<ModelStringInput> campaignSubCategory = Input.absent();
        private Input<ModelCampaignTypeInput> campaignType = Input.absent();
        private Input<ModelStringInput> campaignChannelIdentifier = Input.absent();
        private Input<ModelStringInput> campaignData = Input.absent();
        private Input<ModelCampaignRunFrequencyUnitInput> campaignRunFrequencyUnit = Input.absent();
        private Input<ModelIntInput> campaignRunFrequencyValue = Input.absent();
        private Input<ModelStringInput> startDateOfRun = Input.absent();
        private Input<ModelStringInput> endDateOfRun = Input.absent();
        private Input<ModelIntInput> durationOfRunInDays = Input.absent();
        private Input<ModelStringInput> daysToSend = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelCampaignStatusInput> status = Input.absent();
        private Input<ModelStringInput> systemPauseReason = Input.absent();
        private Input<ModelIDInput> associatedEntityListId = Input.absent();
        private Input<ModelBooleanInput> includeHistoricalMemberships = Input.absent();
        private Input<ModelBooleanInput> allowMultiple = Input.absent();
        private Input<ModelIntInput> messageCreated = Input.absent();
        private Input<ModelIntInput> sentCount = Input.absent();
        private Input<ModelIntInput> deliveredCount = Input.absent();
        private Input<ModelIntInput> readCount = Input.absent();
        private Input<ModelIntInput> repliedCount = Input.absent();
        private Input<ModelIntInput> failedCount = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelIntInput> leadLimit = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCampaignDefinitionConditionInput>> and = Input.absent();
        private Input<List<ModelCampaignDefinitionConditionInput>> or = Input.absent();
        private Input<ModelCampaignDefinitionConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder allowMultiple(ModelBooleanInput modelBooleanInput) {
            this.allowMultiple = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder and(List<ModelCampaignDefinitionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder associatedEntityListId(ModelIDInput modelIDInput) {
            this.associatedEntityListId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelCampaignDefinitionConditionInput build() {
            return new ModelCampaignDefinitionConditionInput(this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.campaignChannelIdentifier, this.campaignData, this.campaignRunFrequencyUnit, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.daysToSend, this.ownerId, this.primaryTeamId, this.status, this.systemPauseReason, this.associatedEntityListId, this.includeHistoricalMemberships, this.allowMultiple, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.tags, this.leadLimit, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder campaignCategory(ModelStringInput modelStringInput) {
            this.campaignCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignChannelIdentifier(ModelStringInput modelStringInput) {
            this.campaignChannelIdentifier = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignData(ModelStringInput modelStringInput) {
            this.campaignData = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignRunFrequencyUnit(ModelCampaignRunFrequencyUnitInput modelCampaignRunFrequencyUnitInput) {
            this.campaignRunFrequencyUnit = Input.fromNullable(modelCampaignRunFrequencyUnitInput);
            return this;
        }

        public Builder campaignRunFrequencyValue(ModelIntInput modelIntInput) {
            this.campaignRunFrequencyValue = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder campaignSubCategory(ModelStringInput modelStringInput) {
            this.campaignSubCategory = Input.fromNullable(modelStringInput);
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

        public Builder daysToSend(ModelStringInput modelStringInput) {
            this.daysToSend = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deliveredCount(ModelIntInput modelIntInput) {
            this.deliveredCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder durationOfRunInDays(ModelIntInput modelIntInput) {
            this.durationOfRunInDays = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder endDateOfRun(ModelStringInput modelStringInput) {
            this.endDateOfRun = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder failedCount(ModelIntInput modelIntInput) {
            this.failedCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder includeHistoricalMemberships(ModelBooleanInput modelBooleanInput) {
            this.includeHistoricalMemberships = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder leadLimit(ModelIntInput modelIntInput) {
            this.leadLimit = Input.fromNullable(modelIntInput);
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

        public Builder not(ModelCampaignDefinitionConditionInput modelCampaignDefinitionConditionInput) {
            this.not = Input.fromNullable(modelCampaignDefinitionConditionInput);
            return this;
        }

        public Builder or(List<ModelCampaignDefinitionConditionInput> list) {
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

        public Builder startDateOfRun(ModelStringInput modelStringInput) {
            this.startDateOfRun = Input.fromNullable(modelStringInput);
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

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCampaignDefinitionConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelCampaignTypeInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelCampaignRunFrequencyUnitInput> input9, Input<ModelIntInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIntInput> input13, Input<ModelStringInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelCampaignStatusInput> input17, Input<ModelStringInput> input18, Input<ModelIDInput> input19, Input<ModelBooleanInput> input20, Input<ModelBooleanInput> input21, Input<ModelIntInput> input22, Input<ModelIntInput> input23, Input<ModelIntInput> input24, Input<ModelIntInput> input25, Input<ModelIntInput> input26, Input<ModelIntInput> input27, Input<ModelStringInput> input28, Input<ModelIntInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<List<ModelCampaignDefinitionConditionInput>> input32, Input<List<ModelCampaignDefinitionConditionInput>> input33, Input<ModelCampaignDefinitionConditionInput> input34) {
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.campaignCategory = input4;
        this.campaignSubCategory = input5;
        this.campaignType = input6;
        this.campaignChannelIdentifier = input7;
        this.campaignData = input8;
        this.campaignRunFrequencyUnit = input9;
        this.campaignRunFrequencyValue = input10;
        this.startDateOfRun = input11;
        this.endDateOfRun = input12;
        this.durationOfRunInDays = input13;
        this.daysToSend = input14;
        this.ownerId = input15;
        this.primaryTeamId = input16;
        this.status = input17;
        this.systemPauseReason = input18;
        this.associatedEntityListId = input19;
        this.includeHistoricalMemberships = input20;
        this.allowMultiple = input21;
        this.messageCreated = input22;
        this.sentCount = input23;
        this.deliveredCount = input24;
        this.readCount = input25;
        this.repliedCount = input26;
        this.failedCount = input27;
        this.tags = input28;
        this.leadLimit = input29;
        this.createdAt = input30;
        this.updatedAt = input31;
        this.and = input32;
        this.or = input33;
        this.not = input34;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelBooleanInput allowMultiple() {
        return this.allowMultiple.value;
    }

    public List<ModelCampaignDefinitionConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput associatedEntityListId() {
        return this.associatedEntityListId.value;
    }

    public ModelStringInput campaignCategory() {
        return this.campaignCategory.value;
    }

    public ModelStringInput campaignChannelIdentifier() {
        return this.campaignChannelIdentifier.value;
    }

    public ModelStringInput campaignData() {
        return this.campaignData.value;
    }

    public ModelCampaignRunFrequencyUnitInput campaignRunFrequencyUnit() {
        return this.campaignRunFrequencyUnit.value;
    }

    public ModelIntInput campaignRunFrequencyValue() {
        return this.campaignRunFrequencyValue.value;
    }

    public ModelStringInput campaignSubCategory() {
        return this.campaignSubCategory.value;
    }

    public ModelCampaignTypeInput campaignType() {
        return this.campaignType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput daysToSend() {
        return this.daysToSend.value;
    }

    public ModelIntInput deliveredCount() {
        return this.deliveredCount.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelIntInput durationOfRunInDays() {
        return this.durationOfRunInDays.value;
    }

    public ModelStringInput endDateOfRun() {
        return this.endDateOfRun.value;
    }

    public ModelIntInput failedCount() {
        return this.failedCount.value;
    }

    public ModelBooleanInput includeHistoricalMemberships() {
        return this.includeHistoricalMemberships.value;
    }

    public ModelIntInput leadLimit() {
        return this.leadLimit.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignDefinitionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignDefinitionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCampaignDefinitionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelCampaignDefinitionConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelCampaignDefinitionConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignCategory.defined) {
                    inputFieldWriter.writeObject("campaignCategory", ModelCampaignDefinitionConditionInput.this.campaignCategory.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.campaignCategory.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignSubCategory.defined) {
                    inputFieldWriter.writeObject("campaignSubCategory", ModelCampaignDefinitionConditionInput.this.campaignSubCategory.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.campaignSubCategory.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignType.defined) {
                    inputFieldWriter.writeObject("campaignType", ModelCampaignDefinitionConditionInput.this.campaignType.value != 0 ? ((ModelCampaignTypeInput) ModelCampaignDefinitionConditionInput.this.campaignType.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeObject("campaignChannelIdentifier", ModelCampaignDefinitionConditionInput.this.campaignChannelIdentifier.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.campaignChannelIdentifier.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignData.defined) {
                    inputFieldWriter.writeObject("campaignData", ModelCampaignDefinitionConditionInput.this.campaignData.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.campaignData.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignRunFrequencyUnit.defined) {
                    inputFieldWriter.writeObject("campaignRunFrequencyUnit", ModelCampaignDefinitionConditionInput.this.campaignRunFrequencyUnit.value != 0 ? ((ModelCampaignRunFrequencyUnitInput) ModelCampaignDefinitionConditionInput.this.campaignRunFrequencyUnit.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.campaignRunFrequencyValue.defined) {
                    inputFieldWriter.writeObject("campaignRunFrequencyValue", ModelCampaignDefinitionConditionInput.this.campaignRunFrequencyValue.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.campaignRunFrequencyValue.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.startDateOfRun.defined) {
                    inputFieldWriter.writeObject("startDateOfRun", ModelCampaignDefinitionConditionInput.this.startDateOfRun.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.startDateOfRun.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.endDateOfRun.defined) {
                    inputFieldWriter.writeObject("endDateOfRun", ModelCampaignDefinitionConditionInput.this.endDateOfRun.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.endDateOfRun.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.durationOfRunInDays.defined) {
                    inputFieldWriter.writeObject("durationOfRunInDays", ModelCampaignDefinitionConditionInput.this.durationOfRunInDays.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.durationOfRunInDays.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.daysToSend.defined) {
                    inputFieldWriter.writeObject("daysToSend", ModelCampaignDefinitionConditionInput.this.daysToSend.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.daysToSend.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelCampaignDefinitionConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelCampaignDefinitionConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCampaignDefinitionConditionInput.this.status.value != 0 ? ((ModelCampaignStatusInput) ModelCampaignDefinitionConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeObject("systemPauseReason", ModelCampaignDefinitionConditionInput.this.systemPauseReason.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.systemPauseReason.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.associatedEntityListId.defined) {
                    inputFieldWriter.writeObject("associatedEntityListId", ModelCampaignDefinitionConditionInput.this.associatedEntityListId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionConditionInput.this.associatedEntityListId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.includeHistoricalMemberships.defined) {
                    inputFieldWriter.writeObject("includeHistoricalMemberships", ModelCampaignDefinitionConditionInput.this.includeHistoricalMemberships.value != 0 ? ((ModelBooleanInput) ModelCampaignDefinitionConditionInput.this.includeHistoricalMemberships.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeObject("allowMultiple", ModelCampaignDefinitionConditionInput.this.allowMultiple.value != 0 ? ((ModelBooleanInput) ModelCampaignDefinitionConditionInput.this.allowMultiple.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.messageCreated.defined) {
                    inputFieldWriter.writeObject("messageCreated", ModelCampaignDefinitionConditionInput.this.messageCreated.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.messageCreated.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.sentCount.defined) {
                    inputFieldWriter.writeObject("sentCount", ModelCampaignDefinitionConditionInput.this.sentCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.sentCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeObject("deliveredCount", ModelCampaignDefinitionConditionInput.this.deliveredCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.deliveredCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.readCount.defined) {
                    inputFieldWriter.writeObject("readCount", ModelCampaignDefinitionConditionInput.this.readCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.readCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.repliedCount.defined) {
                    inputFieldWriter.writeObject("repliedCount", ModelCampaignDefinitionConditionInput.this.repliedCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.repliedCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.failedCount.defined) {
                    inputFieldWriter.writeObject("failedCount", ModelCampaignDefinitionConditionInput.this.failedCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.failedCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelCampaignDefinitionConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.leadLimit.defined) {
                    inputFieldWriter.writeObject("leadLimit", ModelCampaignDefinitionConditionInput.this.leadLimit.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionConditionInput.this.leadLimit.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCampaignDefinitionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCampaignDefinitionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCampaignDefinitionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignDefinitionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignDefinitionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignDefinitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCampaignDefinitionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignDefinitionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignDefinitionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignDefinitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignDefinitionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCampaignDefinitionConditionInput.this.not.value != 0 ? ((ModelCampaignDefinitionConditionInput) ModelCampaignDefinitionConditionInput.this.not.value).marshaller() : null);
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

    public ModelCampaignDefinitionConditionInput not() {
        return this.not.value;
    }

    public List<ModelCampaignDefinitionConditionInput> or() {
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

    public ModelStringInput startDateOfRun() {
        return this.startDateOfRun.value;
    }

    public ModelCampaignStatusInput status() {
        return this.status.value;
    }

    public ModelStringInput systemPauseReason() {
        return this.systemPauseReason.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
