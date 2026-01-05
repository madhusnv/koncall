package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignDefinitionFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelBooleanInput> allowMultiple;
    private final Input<List<ModelCampaignDefinitionFilterInput>> and;
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
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> includeHistoricalMemberships;
    private final Input<ModelIntInput> leadLimit;
    private final Input<ModelIntInput> messageCreated;
    private final Input<ModelStringInput> name;
    private final Input<ModelCampaignDefinitionFilterInput> not;
    private final Input<List<ModelCampaignDefinitionFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelCampaignDefinitionFilterInput>> and = Input.absent();
        private Input<List<ModelCampaignDefinitionFilterInput>> or = Input.absent();
        private Input<ModelCampaignDefinitionFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder allowMultiple(ModelBooleanInput modelBooleanInput) {
            this.allowMultiple = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder and(List<ModelCampaignDefinitionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder associatedEntityListId(ModelIDInput modelIDInput) {
            this.associatedEntityListId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelCampaignDefinitionFilterInput build() {
            return new ModelCampaignDefinitionFilterInput(this.id, this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.campaignChannelIdentifier, this.campaignData, this.campaignRunFrequencyUnit, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.daysToSend, this.ownerId, this.primaryTeamId, this.status, this.systemPauseReason, this.associatedEntityListId, this.includeHistoricalMemberships, this.allowMultiple, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.tags, this.leadLimit, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelCampaignDefinitionFilterInput modelCampaignDefinitionFilterInput) {
            this.not = Input.fromNullable(modelCampaignDefinitionFilterInput);
            return this;
        }

        public Builder or(List<ModelCampaignDefinitionFilterInput> list) {
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

    public ModelCampaignDefinitionFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelCampaignTypeInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelCampaignRunFrequencyUnitInput> input10, Input<ModelIntInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIntInput> input14, Input<ModelStringInput> input15, Input<ModelIDInput> input16, Input<ModelIDInput> input17, Input<ModelCampaignStatusInput> input18, Input<ModelStringInput> input19, Input<ModelIDInput> input20, Input<ModelBooleanInput> input21, Input<ModelBooleanInput> input22, Input<ModelIntInput> input23, Input<ModelIntInput> input24, Input<ModelIntInput> input25, Input<ModelIntInput> input26, Input<ModelIntInput> input27, Input<ModelIntInput> input28, Input<ModelStringInput> input29, Input<ModelIntInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<List<ModelCampaignDefinitionFilterInput>> input33, Input<List<ModelCampaignDefinitionFilterInput>> input34, Input<ModelCampaignDefinitionFilterInput> input35) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.campaignCategory = input5;
        this.campaignSubCategory = input6;
        this.campaignType = input7;
        this.campaignChannelIdentifier = input8;
        this.campaignData = input9;
        this.campaignRunFrequencyUnit = input10;
        this.campaignRunFrequencyValue = input11;
        this.startDateOfRun = input12;
        this.endDateOfRun = input13;
        this.durationOfRunInDays = input14;
        this.daysToSend = input15;
        this.ownerId = input16;
        this.primaryTeamId = input17;
        this.status = input18;
        this.systemPauseReason = input19;
        this.associatedEntityListId = input20;
        this.includeHistoricalMemberships = input21;
        this.allowMultiple = input22;
        this.messageCreated = input23;
        this.sentCount = input24;
        this.deliveredCount = input25;
        this.readCount = input26;
        this.repliedCount = input27;
        this.failedCount = input28;
        this.tags = input29;
        this.leadLimit = input30;
        this.createdAt = input31;
        this.updatedAt = input32;
        this.and = input33;
        this.or = input34;
        this.not = input35;
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

    public List<ModelCampaignDefinitionFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput includeHistoricalMemberships() {
        return this.includeHistoricalMemberships.value;
    }

    public ModelIntInput leadLimit() {
        return this.leadLimit.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignDefinitionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignDefinitionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCampaignDefinitionFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCampaignDefinitionFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelCampaignDefinitionFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelCampaignDefinitionFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignCategory.defined) {
                    inputFieldWriter.writeObject("campaignCategory", ModelCampaignDefinitionFilterInput.this.campaignCategory.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.campaignCategory.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignSubCategory.defined) {
                    inputFieldWriter.writeObject("campaignSubCategory", ModelCampaignDefinitionFilterInput.this.campaignSubCategory.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.campaignSubCategory.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignType.defined) {
                    inputFieldWriter.writeObject("campaignType", ModelCampaignDefinitionFilterInput.this.campaignType.value != 0 ? ((ModelCampaignTypeInput) ModelCampaignDefinitionFilterInput.this.campaignType.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeObject("campaignChannelIdentifier", ModelCampaignDefinitionFilterInput.this.campaignChannelIdentifier.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.campaignChannelIdentifier.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignData.defined) {
                    inputFieldWriter.writeObject("campaignData", ModelCampaignDefinitionFilterInput.this.campaignData.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.campaignData.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignRunFrequencyUnit.defined) {
                    inputFieldWriter.writeObject("campaignRunFrequencyUnit", ModelCampaignDefinitionFilterInput.this.campaignRunFrequencyUnit.value != 0 ? ((ModelCampaignRunFrequencyUnitInput) ModelCampaignDefinitionFilterInput.this.campaignRunFrequencyUnit.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.campaignRunFrequencyValue.defined) {
                    inputFieldWriter.writeObject("campaignRunFrequencyValue", ModelCampaignDefinitionFilterInput.this.campaignRunFrequencyValue.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.campaignRunFrequencyValue.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.startDateOfRun.defined) {
                    inputFieldWriter.writeObject("startDateOfRun", ModelCampaignDefinitionFilterInput.this.startDateOfRun.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.startDateOfRun.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.endDateOfRun.defined) {
                    inputFieldWriter.writeObject("endDateOfRun", ModelCampaignDefinitionFilterInput.this.endDateOfRun.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.endDateOfRun.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.durationOfRunInDays.defined) {
                    inputFieldWriter.writeObject("durationOfRunInDays", ModelCampaignDefinitionFilterInput.this.durationOfRunInDays.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.durationOfRunInDays.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.daysToSend.defined) {
                    inputFieldWriter.writeObject("daysToSend", ModelCampaignDefinitionFilterInput.this.daysToSend.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.daysToSend.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelCampaignDefinitionFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelCampaignDefinitionFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCampaignDefinitionFilterInput.this.status.value != 0 ? ((ModelCampaignStatusInput) ModelCampaignDefinitionFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeObject("systemPauseReason", ModelCampaignDefinitionFilterInput.this.systemPauseReason.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.systemPauseReason.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.associatedEntityListId.defined) {
                    inputFieldWriter.writeObject("associatedEntityListId", ModelCampaignDefinitionFilterInput.this.associatedEntityListId.value != 0 ? ((ModelIDInput) ModelCampaignDefinitionFilterInput.this.associatedEntityListId.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.includeHistoricalMemberships.defined) {
                    inputFieldWriter.writeObject("includeHistoricalMemberships", ModelCampaignDefinitionFilterInput.this.includeHistoricalMemberships.value != 0 ? ((ModelBooleanInput) ModelCampaignDefinitionFilterInput.this.includeHistoricalMemberships.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeObject("allowMultiple", ModelCampaignDefinitionFilterInput.this.allowMultiple.value != 0 ? ((ModelBooleanInput) ModelCampaignDefinitionFilterInput.this.allowMultiple.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.messageCreated.defined) {
                    inputFieldWriter.writeObject("messageCreated", ModelCampaignDefinitionFilterInput.this.messageCreated.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.messageCreated.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.sentCount.defined) {
                    inputFieldWriter.writeObject("sentCount", ModelCampaignDefinitionFilterInput.this.sentCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.sentCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeObject("deliveredCount", ModelCampaignDefinitionFilterInput.this.deliveredCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.deliveredCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.readCount.defined) {
                    inputFieldWriter.writeObject("readCount", ModelCampaignDefinitionFilterInput.this.readCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.readCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.repliedCount.defined) {
                    inputFieldWriter.writeObject("repliedCount", ModelCampaignDefinitionFilterInput.this.repliedCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.repliedCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.failedCount.defined) {
                    inputFieldWriter.writeObject("failedCount", ModelCampaignDefinitionFilterInput.this.failedCount.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.failedCount.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelCampaignDefinitionFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.leadLimit.defined) {
                    inputFieldWriter.writeObject("leadLimit", ModelCampaignDefinitionFilterInput.this.leadLimit.value != 0 ? ((ModelIntInput) ModelCampaignDefinitionFilterInput.this.leadLimit.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCampaignDefinitionFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCampaignDefinitionFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCampaignDefinitionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCampaignDefinitionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignDefinitionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignDefinitionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCampaignDefinitionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignDefinitionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignDefinitionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignDefinitionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCampaignDefinitionFilterInput.this.not.value != 0 ? ((ModelCampaignDefinitionFilterInput) ModelCampaignDefinitionFilterInput.this.not.value).marshaller() : null);
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

    public ModelCampaignDefinitionFilterInput not() {
        return this.not.value;
    }

    public List<ModelCampaignDefinitionFilterInput> or() {
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
