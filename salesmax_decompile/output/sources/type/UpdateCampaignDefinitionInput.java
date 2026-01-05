package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateCampaignDefinitionInput implements InputType {
    private final Input<String> accountId;
    private final Input<Boolean> allowMultiple;
    private final Input<String> associatedEntityListId;
    private final Input<String> campaignCategory;
    private final Input<String> campaignChannelIdentifier;
    private final Input<String> campaignData;
    private final Input<CampaignRunFrequencyUnit> campaignRunFrequencyUnit;
    private final Input<Integer> campaignRunFrequencyValue;
    private final Input<String> campaignSubCategory;
    private final Input<CampaignType> campaignType;
    private final Input<String> createdAt;
    private final Input<List<String>> daysToSend;
    private final Input<Integer> deliveredCount;
    private final Input<String> description;
    private final Input<Integer> durationOfRunInDays;
    private final Input<String> endDateOfRun;
    private final Input<Integer> failedCount;
    private final String id;
    private final Input<Boolean> includeHistoricalMemberships;
    private final Input<Integer> leadLimit;
    private final Input<Integer> messageCreated;
    private final Input<String> name;
    private final Input<String> ownerId;
    private final Input<String> primaryTeamId;
    private final Input<Integer> readCount;
    private final Input<Integer> repliedCount;
    private final Input<Integer> sentCount;
    private final Input<String> startDateOfRun;
    private final Input<CampaignStatus> status;
    private final Input<String> systemPauseReason;
    private final Input<List<String>> tags;
    private final Input<List<TimeSlotToSendInput>> timeSlotToSend;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> campaignCategory = Input.absent();
        private Input<String> campaignSubCategory = Input.absent();
        private Input<CampaignType> campaignType = Input.absent();
        private Input<String> campaignChannelIdentifier = Input.absent();
        private Input<String> campaignData = Input.absent();
        private Input<CampaignRunFrequencyUnit> campaignRunFrequencyUnit = Input.absent();
        private Input<Integer> campaignRunFrequencyValue = Input.absent();
        private Input<String> startDateOfRun = Input.absent();
        private Input<String> endDateOfRun = Input.absent();
        private Input<Integer> durationOfRunInDays = Input.absent();
        private Input<List<String>> daysToSend = Input.absent();
        private Input<List<TimeSlotToSendInput>> timeSlotToSend = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<CampaignStatus> status = Input.absent();
        private Input<String> systemPauseReason = Input.absent();
        private Input<String> associatedEntityListId = Input.absent();
        private Input<Boolean> includeHistoricalMemberships = Input.absent();
        private Input<Boolean> allowMultiple = Input.absent();
        private Input<Integer> messageCreated = Input.absent();
        private Input<Integer> sentCount = Input.absent();
        private Input<Integer> deliveredCount = Input.absent();
        private Input<Integer> readCount = Input.absent();
        private Input<Integer> repliedCount = Input.absent();
        private Input<Integer> failedCount = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<Integer> leadLimit = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder allowMultiple(Boolean bool) {
            this.allowMultiple = Input.fromNullable(bool);
            return this;
        }

        public Builder associatedEntityListId(String str) {
            this.associatedEntityListId = Input.fromNullable(str);
            return this;
        }

        public UpdateCampaignDefinitionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCampaignDefinitionInput(this.id, this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.campaignChannelIdentifier, this.campaignData, this.campaignRunFrequencyUnit, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.daysToSend, this.timeSlotToSend, this.ownerId, this.primaryTeamId, this.status, this.systemPauseReason, this.associatedEntityListId, this.includeHistoricalMemberships, this.allowMultiple, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.tags, this.leadLimit, this.createdAt, this.updatedAt);
        }

        public Builder campaignCategory(String str) {
            this.campaignCategory = Input.fromNullable(str);
            return this;
        }

        public Builder campaignChannelIdentifier(String str) {
            this.campaignChannelIdentifier = Input.fromNullable(str);
            return this;
        }

        public Builder campaignData(String str) {
            this.campaignData = Input.fromNullable(str);
            return this;
        }

        public Builder campaignRunFrequencyUnit(CampaignRunFrequencyUnit campaignRunFrequencyUnit) {
            this.campaignRunFrequencyUnit = Input.fromNullable(campaignRunFrequencyUnit);
            return this;
        }

        public Builder campaignRunFrequencyValue(Integer num) {
            this.campaignRunFrequencyValue = Input.fromNullable(num);
            return this;
        }

        public Builder campaignSubCategory(String str) {
            this.campaignSubCategory = Input.fromNullable(str);
            return this;
        }

        public Builder campaignType(CampaignType campaignType) {
            this.campaignType = Input.fromNullable(campaignType);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder daysToSend(List<String> list) {
            this.daysToSend = Input.fromNullable(list);
            return this;
        }

        public Builder deliveredCount(Integer num) {
            this.deliveredCount = Input.fromNullable(num);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder durationOfRunInDays(Integer num) {
            this.durationOfRunInDays = Input.fromNullable(num);
            return this;
        }

        public Builder endDateOfRun(String str) {
            this.endDateOfRun = Input.fromNullable(str);
            return this;
        }

        public Builder failedCount(Integer num) {
            this.failedCount = Input.fromNullable(num);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder includeHistoricalMemberships(Boolean bool) {
            this.includeHistoricalMemberships = Input.fromNullable(bool);
            return this;
        }

        public Builder leadLimit(Integer num) {
            this.leadLimit = Input.fromNullable(num);
            return this;
        }

        public Builder messageCreated(Integer num) {
            this.messageCreated = Input.fromNullable(num);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder readCount(Integer num) {
            this.readCount = Input.fromNullable(num);
            return this;
        }

        public Builder repliedCount(Integer num) {
            this.repliedCount = Input.fromNullable(num);
            return this;
        }

        public Builder sentCount(Integer num) {
            this.sentCount = Input.fromNullable(num);
            return this;
        }

        public Builder startDateOfRun(String str) {
            this.startDateOfRun = Input.fromNullable(str);
            return this;
        }

        public Builder status(CampaignStatus campaignStatus) {
            this.status = Input.fromNullable(campaignStatus);
            return this;
        }

        public Builder systemPauseReason(String str) {
            this.systemPauseReason = Input.fromNullable(str);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder timeSlotToSend(List<TimeSlotToSendInput> list) {
            this.timeSlotToSend = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCampaignDefinitionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<CampaignType> input6, Input<String> input7, Input<String> input8, Input<CampaignRunFrequencyUnit> input9, Input<Integer> input10, Input<String> input11, Input<String> input12, Input<Integer> input13, Input<List<String>> input14, Input<List<TimeSlotToSendInput>> input15, Input<String> input16, Input<String> input17, Input<CampaignStatus> input18, Input<String> input19, Input<String> input20, Input<Boolean> input21, Input<Boolean> input22, Input<Integer> input23, Input<Integer> input24, Input<Integer> input25, Input<Integer> input26, Input<Integer> input27, Input<Integer> input28, Input<List<String>> input29, Input<Integer> input30, Input<String> input31, Input<String> input32) {
        this.id = str;
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
        this.timeSlotToSend = input15;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Boolean allowMultiple() {
        return this.allowMultiple.value;
    }

    public String associatedEntityListId() {
        return this.associatedEntityListId.value;
    }

    public String campaignCategory() {
        return this.campaignCategory.value;
    }

    public String campaignChannelIdentifier() {
        return this.campaignChannelIdentifier.value;
    }

    public String campaignData() {
        return this.campaignData.value;
    }

    public CampaignRunFrequencyUnit campaignRunFrequencyUnit() {
        return this.campaignRunFrequencyUnit.value;
    }

    public Integer campaignRunFrequencyValue() {
        return this.campaignRunFrequencyValue.value;
    }

    public String campaignSubCategory() {
        return this.campaignSubCategory.value;
    }

    public CampaignType campaignType() {
        return this.campaignType.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public List<String> daysToSend() {
        return this.daysToSend.value;
    }

    public Integer deliveredCount() {
        return this.deliveredCount.value;
    }

    public String description() {
        return this.description.value;
    }

    public Integer durationOfRunInDays() {
        return this.durationOfRunInDays.value;
    }

    public String endDateOfRun() {
        return this.endDateOfRun.value;
    }

    public Integer failedCount() {
        return this.failedCount.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean includeHistoricalMemberships() {
        return this.includeHistoricalMemberships.value;
    }

    public Integer leadLimit() {
        return this.leadLimit.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCampaignDefinitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCampaignDefinitionInput.this.id);
                if (UpdateCampaignDefinitionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCampaignDefinitionInput.this.accountId.value);
                }
                if (UpdateCampaignDefinitionInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateCampaignDefinitionInput.this.name.value);
                }
                if (UpdateCampaignDefinitionInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateCampaignDefinitionInput.this.description.value);
                }
                if (UpdateCampaignDefinitionInput.this.campaignCategory.defined) {
                    inputFieldWriter.writeString("campaignCategory", (String) UpdateCampaignDefinitionInput.this.campaignCategory.value);
                }
                if (UpdateCampaignDefinitionInput.this.campaignSubCategory.defined) {
                    inputFieldWriter.writeString("campaignSubCategory", (String) UpdateCampaignDefinitionInput.this.campaignSubCategory.value);
                }
                if (UpdateCampaignDefinitionInput.this.campaignType.defined) {
                    inputFieldWriter.writeString("campaignType", UpdateCampaignDefinitionInput.this.campaignType.value != 0 ? ((CampaignType) UpdateCampaignDefinitionInput.this.campaignType.value).name() : null);
                }
                if (UpdateCampaignDefinitionInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeString("campaignChannelIdentifier", (String) UpdateCampaignDefinitionInput.this.campaignChannelIdentifier.value);
                }
                if (UpdateCampaignDefinitionInput.this.campaignData.defined) {
                    inputFieldWriter.writeString("campaignData", (String) UpdateCampaignDefinitionInput.this.campaignData.value);
                }
                if (UpdateCampaignDefinitionInput.this.campaignRunFrequencyUnit.defined) {
                    inputFieldWriter.writeString("campaignRunFrequencyUnit", UpdateCampaignDefinitionInput.this.campaignRunFrequencyUnit.value != 0 ? ((CampaignRunFrequencyUnit) UpdateCampaignDefinitionInput.this.campaignRunFrequencyUnit.value).name() : null);
                }
                if (UpdateCampaignDefinitionInput.this.campaignRunFrequencyValue.defined) {
                    inputFieldWriter.writeInt("campaignRunFrequencyValue", (Integer) UpdateCampaignDefinitionInput.this.campaignRunFrequencyValue.value);
                }
                if (UpdateCampaignDefinitionInput.this.startDateOfRun.defined) {
                    inputFieldWriter.writeString("startDateOfRun", (String) UpdateCampaignDefinitionInput.this.startDateOfRun.value);
                }
                if (UpdateCampaignDefinitionInput.this.endDateOfRun.defined) {
                    inputFieldWriter.writeString("endDateOfRun", (String) UpdateCampaignDefinitionInput.this.endDateOfRun.value);
                }
                if (UpdateCampaignDefinitionInput.this.durationOfRunInDays.defined) {
                    inputFieldWriter.writeInt("durationOfRunInDays", (Integer) UpdateCampaignDefinitionInput.this.durationOfRunInDays.value);
                }
                if (UpdateCampaignDefinitionInput.this.daysToSend.defined) {
                    inputFieldWriter.writeList("daysToSend", UpdateCampaignDefinitionInput.this.daysToSend.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCampaignDefinitionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCampaignDefinitionInput.this.daysToSend.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateCampaignDefinitionInput.this.timeSlotToSend.defined) {
                    inputFieldWriter.writeList("timeSlotToSend", UpdateCampaignDefinitionInput.this.timeSlotToSend.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCampaignDefinitionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCampaignDefinitionInput.this.timeSlotToSend.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TimeSlotToSendInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateCampaignDefinitionInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateCampaignDefinitionInput.this.ownerId.value);
                }
                if (UpdateCampaignDefinitionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateCampaignDefinitionInput.this.primaryTeamId.value);
                }
                if (UpdateCampaignDefinitionInput.this.status.defined) {
                    inputFieldWriter.writeString("status", UpdateCampaignDefinitionInput.this.status.value != 0 ? ((CampaignStatus) UpdateCampaignDefinitionInput.this.status.value).name() : null);
                }
                if (UpdateCampaignDefinitionInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeString("systemPauseReason", (String) UpdateCampaignDefinitionInput.this.systemPauseReason.value);
                }
                if (UpdateCampaignDefinitionInput.this.associatedEntityListId.defined) {
                    inputFieldWriter.writeString("associatedEntityListId", (String) UpdateCampaignDefinitionInput.this.associatedEntityListId.value);
                }
                if (UpdateCampaignDefinitionInput.this.includeHistoricalMemberships.defined) {
                    inputFieldWriter.writeBoolean("includeHistoricalMemberships", (Boolean) UpdateCampaignDefinitionInput.this.includeHistoricalMemberships.value);
                }
                if (UpdateCampaignDefinitionInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeBoolean("allowMultiple", (Boolean) UpdateCampaignDefinitionInput.this.allowMultiple.value);
                }
                if (UpdateCampaignDefinitionInput.this.messageCreated.defined) {
                    inputFieldWriter.writeInt("messageCreated", (Integer) UpdateCampaignDefinitionInput.this.messageCreated.value);
                }
                if (UpdateCampaignDefinitionInput.this.sentCount.defined) {
                    inputFieldWriter.writeInt("sentCount", (Integer) UpdateCampaignDefinitionInput.this.sentCount.value);
                }
                if (UpdateCampaignDefinitionInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeInt("deliveredCount", (Integer) UpdateCampaignDefinitionInput.this.deliveredCount.value);
                }
                if (UpdateCampaignDefinitionInput.this.readCount.defined) {
                    inputFieldWriter.writeInt("readCount", (Integer) UpdateCampaignDefinitionInput.this.readCount.value);
                }
                if (UpdateCampaignDefinitionInput.this.repliedCount.defined) {
                    inputFieldWriter.writeInt("repliedCount", (Integer) UpdateCampaignDefinitionInput.this.repliedCount.value);
                }
                if (UpdateCampaignDefinitionInput.this.failedCount.defined) {
                    inputFieldWriter.writeInt("failedCount", (Integer) UpdateCampaignDefinitionInput.this.failedCount.value);
                }
                if (UpdateCampaignDefinitionInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", UpdateCampaignDefinitionInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCampaignDefinitionInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCampaignDefinitionInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateCampaignDefinitionInput.this.leadLimit.defined) {
                    inputFieldWriter.writeInt("leadLimit", (Integer) UpdateCampaignDefinitionInput.this.leadLimit.value);
                }
                if (UpdateCampaignDefinitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCampaignDefinitionInput.this.createdAt.value);
                }
                if (UpdateCampaignDefinitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCampaignDefinitionInput.this.updatedAt.value);
                }
            }
        };
    }

    public Integer messageCreated() {
        return this.messageCreated.value;
    }

    public String name() {
        return this.name.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public Integer readCount() {
        return this.readCount.value;
    }

    public Integer repliedCount() {
        return this.repliedCount.value;
    }

    public Integer sentCount() {
        return this.sentCount.value;
    }

    public String startDateOfRun() {
        return this.startDateOfRun.value;
    }

    public CampaignStatus status() {
        return this.status.value;
    }

    public String systemPauseReason() {
        return this.systemPauseReason.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public List<TimeSlotToSendInput> timeSlotToSend() {
        return this.timeSlotToSend.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
