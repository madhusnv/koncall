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
public final class CreateCampaignDefinitionInput implements InputType {
    private final String accountId;
    private final Input<Boolean> allowMultiple;
    private final String associatedEntityListId;
    private final Input<String> campaignCategory;
    private final Input<String> campaignChannelIdentifier;
    private final Input<String> campaignData;
    private final Input<CampaignRunFrequencyUnit> campaignRunFrequencyUnit;
    private final Input<Integer> campaignRunFrequencyValue;
    private final Input<String> campaignSubCategory;
    private final CampaignType campaignType;
    private final Input<String> createdAt;
    private final Input<List<String>> daysToSend;
    private final Input<Integer> deliveredCount;
    private final String description;
    private final Input<Integer> durationOfRunInDays;
    private final Input<String> endDateOfRun;
    private final Input<Integer> failedCount;
    private final Input<String> id;
    private final Input<Boolean> includeHistoricalMemberships;
    private final Input<Integer> leadLimit;
    private final Input<Integer> messageCreated;
    private final String name;
    private final String ownerId;
    private final Input<String> primaryTeamId;
    private final Input<Integer> readCount;
    private final Input<Integer> repliedCount;
    private final Input<Integer> sentCount;
    private final Input<String> startDateOfRun;
    private final CampaignStatus status;
    private final Input<String> systemPauseReason;
    private final Input<List<String>> tags;
    private final Input<List<TimeSlotToSendInput>> timeSlotToSend;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String associatedEntityListId;
        private CampaignType campaignType;
        private String description;
        private String name;
        private String ownerId;
        private CampaignStatus status;
        private Input<String> id = Input.absent();
        private Input<String> campaignCategory = Input.absent();
        private Input<String> campaignSubCategory = Input.absent();
        private Input<String> campaignChannelIdentifier = Input.absent();
        private Input<String> campaignData = Input.absent();
        private Input<CampaignRunFrequencyUnit> campaignRunFrequencyUnit = Input.absent();
        private Input<Integer> campaignRunFrequencyValue = Input.absent();
        private Input<String> startDateOfRun = Input.absent();
        private Input<String> endDateOfRun = Input.absent();
        private Input<Integer> durationOfRunInDays = Input.absent();
        private Input<List<String>> daysToSend = Input.absent();
        private Input<List<TimeSlotToSendInput>> timeSlotToSend = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> systemPauseReason = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public Builder allowMultiple(Boolean bool) {
            this.allowMultiple = Input.fromNullable(bool);
            return this;
        }

        public Builder associatedEntityListId(String str) {
            this.associatedEntityListId = str;
            return this;
        }

        public CreateCampaignDefinitionInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.name, "name == null");
            Utils.checkNotNull(this.description, "description == null");
            Utils.checkNotNull(this.campaignType, "campaignType == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.status, "status == null");
            Utils.checkNotNull(this.associatedEntityListId, "associatedEntityListId == null");
            return new CreateCampaignDefinitionInput(this.id, this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.campaignChannelIdentifier, this.campaignData, this.campaignRunFrequencyUnit, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.daysToSend, this.timeSlotToSend, this.ownerId, this.primaryTeamId, this.status, this.systemPauseReason, this.associatedEntityListId, this.includeHistoricalMemberships, this.allowMultiple, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.tags, this.leadLimit, this.createdAt, this.updatedAt);
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
            this.campaignType = campaignType;
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
            this.description = str;
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
            this.id = Input.fromNullable(str);
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
            this.name = str;
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
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
            this.status = campaignStatus;
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

    public CreateCampaignDefinitionInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<String> input3, CampaignType campaignType, Input<String> input4, Input<String> input5, Input<CampaignRunFrequencyUnit> input6, Input<Integer> input7, Input<String> input8, Input<String> input9, Input<Integer> input10, Input<List<String>> input11, Input<List<TimeSlotToSendInput>> input12, String str4, Input<String> input13, CampaignStatus campaignStatus, Input<String> input14, String str5, Input<Boolean> input15, Input<Boolean> input16, Input<Integer> input17, Input<Integer> input18, Input<Integer> input19, Input<Integer> input20, Input<Integer> input21, Input<Integer> input22, Input<List<String>> input23, Input<Integer> input24, Input<String> input25, Input<String> input26) {
        this.id = input;
        this.accountId = str;
        this.name = str2;
        this.description = str3;
        this.campaignCategory = input2;
        this.campaignSubCategory = input3;
        this.campaignType = campaignType;
        this.campaignChannelIdentifier = input4;
        this.campaignData = input5;
        this.campaignRunFrequencyUnit = input6;
        this.campaignRunFrequencyValue = input7;
        this.startDateOfRun = input8;
        this.endDateOfRun = input9;
        this.durationOfRunInDays = input10;
        this.daysToSend = input11;
        this.timeSlotToSend = input12;
        this.ownerId = str4;
        this.primaryTeamId = input13;
        this.status = campaignStatus;
        this.systemPauseReason = input14;
        this.associatedEntityListId = str5;
        this.includeHistoricalMemberships = input15;
        this.allowMultiple = input16;
        this.messageCreated = input17;
        this.sentCount = input18;
        this.deliveredCount = input19;
        this.readCount = input20;
        this.repliedCount = input21;
        this.failedCount = input22;
        this.tags = input23;
        this.leadLimit = input24;
        this.createdAt = input25;
        this.updatedAt = input26;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public Boolean allowMultiple() {
        return this.allowMultiple.value;
    }

    public String associatedEntityListId() {
        return this.associatedEntityListId;
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
        return this.campaignType;
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
        return this.description;
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
        return this.id.value;
    }

    public Boolean includeHistoricalMemberships() {
        return this.includeHistoricalMemberships.value;
    }

    public Integer leadLimit() {
        return this.leadLimit.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCampaignDefinitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCampaignDefinitionInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCampaignDefinitionInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCampaignDefinitionInput.this.accountId);
                inputFieldWriter.writeString("name", CreateCampaignDefinitionInput.this.name);
                inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, CreateCampaignDefinitionInput.this.description);
                if (CreateCampaignDefinitionInput.this.campaignCategory.defined) {
                    inputFieldWriter.writeString("campaignCategory", (String) CreateCampaignDefinitionInput.this.campaignCategory.value);
                }
                if (CreateCampaignDefinitionInput.this.campaignSubCategory.defined) {
                    inputFieldWriter.writeString("campaignSubCategory", (String) CreateCampaignDefinitionInput.this.campaignSubCategory.value);
                }
                inputFieldWriter.writeString("campaignType", CreateCampaignDefinitionInput.this.campaignType.name());
                if (CreateCampaignDefinitionInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeString("campaignChannelIdentifier", (String) CreateCampaignDefinitionInput.this.campaignChannelIdentifier.value);
                }
                if (CreateCampaignDefinitionInput.this.campaignData.defined) {
                    inputFieldWriter.writeString("campaignData", (String) CreateCampaignDefinitionInput.this.campaignData.value);
                }
                if (CreateCampaignDefinitionInput.this.campaignRunFrequencyUnit.defined) {
                    inputFieldWriter.writeString("campaignRunFrequencyUnit", CreateCampaignDefinitionInput.this.campaignRunFrequencyUnit.value != 0 ? ((CampaignRunFrequencyUnit) CreateCampaignDefinitionInput.this.campaignRunFrequencyUnit.value).name() : null);
                }
                if (CreateCampaignDefinitionInput.this.campaignRunFrequencyValue.defined) {
                    inputFieldWriter.writeInt("campaignRunFrequencyValue", (Integer) CreateCampaignDefinitionInput.this.campaignRunFrequencyValue.value);
                }
                if (CreateCampaignDefinitionInput.this.startDateOfRun.defined) {
                    inputFieldWriter.writeString("startDateOfRun", (String) CreateCampaignDefinitionInput.this.startDateOfRun.value);
                }
                if (CreateCampaignDefinitionInput.this.endDateOfRun.defined) {
                    inputFieldWriter.writeString("endDateOfRun", (String) CreateCampaignDefinitionInput.this.endDateOfRun.value);
                }
                if (CreateCampaignDefinitionInput.this.durationOfRunInDays.defined) {
                    inputFieldWriter.writeInt("durationOfRunInDays", (Integer) CreateCampaignDefinitionInput.this.durationOfRunInDays.value);
                }
                if (CreateCampaignDefinitionInput.this.daysToSend.defined) {
                    inputFieldWriter.writeList("daysToSend", CreateCampaignDefinitionInput.this.daysToSend.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCampaignDefinitionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCampaignDefinitionInput.this.daysToSend.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateCampaignDefinitionInput.this.timeSlotToSend.defined) {
                    inputFieldWriter.writeList("timeSlotToSend", CreateCampaignDefinitionInput.this.timeSlotToSend.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCampaignDefinitionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCampaignDefinitionInput.this.timeSlotToSend.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TimeSlotToSendInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                inputFieldWriter.writeString("ownerId", CreateCampaignDefinitionInput.this.ownerId);
                if (CreateCampaignDefinitionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateCampaignDefinitionInput.this.primaryTeamId.value);
                }
                inputFieldWriter.writeString("status", CreateCampaignDefinitionInput.this.status.name());
                if (CreateCampaignDefinitionInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeString("systemPauseReason", (String) CreateCampaignDefinitionInput.this.systemPauseReason.value);
                }
                inputFieldWriter.writeString("associatedEntityListId", CreateCampaignDefinitionInput.this.associatedEntityListId);
                if (CreateCampaignDefinitionInput.this.includeHistoricalMemberships.defined) {
                    inputFieldWriter.writeBoolean("includeHistoricalMemberships", (Boolean) CreateCampaignDefinitionInput.this.includeHistoricalMemberships.value);
                }
                if (CreateCampaignDefinitionInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeBoolean("allowMultiple", (Boolean) CreateCampaignDefinitionInput.this.allowMultiple.value);
                }
                if (CreateCampaignDefinitionInput.this.messageCreated.defined) {
                    inputFieldWriter.writeInt("messageCreated", (Integer) CreateCampaignDefinitionInput.this.messageCreated.value);
                }
                if (CreateCampaignDefinitionInput.this.sentCount.defined) {
                    inputFieldWriter.writeInt("sentCount", (Integer) CreateCampaignDefinitionInput.this.sentCount.value);
                }
                if (CreateCampaignDefinitionInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeInt("deliveredCount", (Integer) CreateCampaignDefinitionInput.this.deliveredCount.value);
                }
                if (CreateCampaignDefinitionInput.this.readCount.defined) {
                    inputFieldWriter.writeInt("readCount", (Integer) CreateCampaignDefinitionInput.this.readCount.value);
                }
                if (CreateCampaignDefinitionInput.this.repliedCount.defined) {
                    inputFieldWriter.writeInt("repliedCount", (Integer) CreateCampaignDefinitionInput.this.repliedCount.value);
                }
                if (CreateCampaignDefinitionInput.this.failedCount.defined) {
                    inputFieldWriter.writeInt("failedCount", (Integer) CreateCampaignDefinitionInput.this.failedCount.value);
                }
                if (CreateCampaignDefinitionInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateCampaignDefinitionInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCampaignDefinitionInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCampaignDefinitionInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateCampaignDefinitionInput.this.leadLimit.defined) {
                    inputFieldWriter.writeInt("leadLimit", (Integer) CreateCampaignDefinitionInput.this.leadLimit.value);
                }
                if (CreateCampaignDefinitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCampaignDefinitionInput.this.createdAt.value);
                }
                if (CreateCampaignDefinitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCampaignDefinitionInput.this.updatedAt.value);
                }
            }
        };
    }

    public Integer messageCreated() {
        return this.messageCreated.value;
    }

    public String name() {
        return this.name;
    }

    public String ownerId() {
        return this.ownerId;
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
        return this.status;
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
