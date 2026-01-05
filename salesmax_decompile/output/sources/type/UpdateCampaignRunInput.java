package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateCampaignRunInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> campaignChannelIdentifier;
    private final Input<String> campaignId;
    private final Input<String> campaignName;
    private final Input<CampaignType> campaignType;
    private final Input<String> createdAt;
    private final Input<Integer> deliveredCount;
    private final Input<String> endDate;
    private final Input<Integer> failedCount;
    private final String id;
    private final Input<Integer> leadCount;
    private final Input<Integer> messageCreated;
    private final Input<String> name;
    private final Input<String> ownerId;
    private final Input<String> primaryTeamId;
    private final Input<Integer> readCount;
    private final Input<Integer> repliedCount;
    private final Input<Integer> sentCount;
    private final Input<String> startDate;
    private final Input<CampaignStatus> status;
    private final Input<String> systemPauseReason;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> campaignId = Input.absent();
        private Input<String> campaignName = Input.absent();
        private Input<CampaignType> campaignType = Input.absent();
        private Input<String> campaignChannelIdentifier = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> startDate = Input.absent();
        private Input<String> endDate = Input.absent();
        private Input<CampaignStatus> status = Input.absent();
        private Input<String> systemPauseReason = Input.absent();
        private Input<Integer> leadCount = Input.absent();
        private Input<Integer> messageCreated = Input.absent();
        private Input<Integer> sentCount = Input.absent();
        private Input<Integer> deliveredCount = Input.absent();
        private Input<Integer> readCount = Input.absent();
        private Input<Integer> repliedCount = Input.absent();
        private Input<Integer> failedCount = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCampaignRunInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCampaignRunInput(this.id, this.accountId, this.campaignId, this.campaignName, this.campaignType, this.campaignChannelIdentifier, this.name, this.startDate, this.endDate, this.status, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt);
        }

        public Builder campaignChannelIdentifier(String str) {
            this.campaignChannelIdentifier = Input.fromNullable(str);
            return this;
        }

        public Builder campaignId(String str) {
            this.campaignId = Input.fromNullable(str);
            return this;
        }

        public Builder campaignName(String str) {
            this.campaignName = Input.fromNullable(str);
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

        public Builder deliveredCount(Integer num) {
            this.deliveredCount = Input.fromNullable(num);
            return this;
        }

        public Builder endDate(String str) {
            this.endDate = Input.fromNullable(str);
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

        public Builder leadCount(Integer num) {
            this.leadCount = Input.fromNullable(num);
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

        public Builder startDate(String str) {
            this.startDate = Input.fromNullable(str);
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

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCampaignRunInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<CampaignType> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<CampaignStatus> input9, Input<String> input10, Input<Integer> input11, Input<Integer> input12, Input<Integer> input13, Input<Integer> input14, Input<Integer> input15, Input<Integer> input16, Input<Integer> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String campaignChannelIdentifier() {
        return this.campaignChannelIdentifier.value;
    }

    public String campaignId() {
        return this.campaignId.value;
    }

    public String campaignName() {
        return this.campaignName.value;
    }

    public CampaignType campaignType() {
        return this.campaignType.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public Integer deliveredCount() {
        return this.deliveredCount.value;
    }

    public String endDate() {
        return this.endDate.value;
    }

    public Integer failedCount() {
        return this.failedCount.value;
    }

    public String id() {
        return this.id;
    }

    public Integer leadCount() {
        return this.leadCount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCampaignRunInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCampaignRunInput.this.id);
                if (UpdateCampaignRunInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCampaignRunInput.this.accountId.value);
                }
                if (UpdateCampaignRunInput.this.campaignId.defined) {
                    inputFieldWriter.writeString("campaignId", (String) UpdateCampaignRunInput.this.campaignId.value);
                }
                if (UpdateCampaignRunInput.this.campaignName.defined) {
                    inputFieldWriter.writeString("campaignName", (String) UpdateCampaignRunInput.this.campaignName.value);
                }
                if (UpdateCampaignRunInput.this.campaignType.defined) {
                    inputFieldWriter.writeString("campaignType", UpdateCampaignRunInput.this.campaignType.value != 0 ? ((CampaignType) UpdateCampaignRunInput.this.campaignType.value).name() : null);
                }
                if (UpdateCampaignRunInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeString("campaignChannelIdentifier", (String) UpdateCampaignRunInput.this.campaignChannelIdentifier.value);
                }
                if (UpdateCampaignRunInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateCampaignRunInput.this.name.value);
                }
                if (UpdateCampaignRunInput.this.startDate.defined) {
                    inputFieldWriter.writeString("startDate", (String) UpdateCampaignRunInput.this.startDate.value);
                }
                if (UpdateCampaignRunInput.this.endDate.defined) {
                    inputFieldWriter.writeString("endDate", (String) UpdateCampaignRunInput.this.endDate.value);
                }
                if (UpdateCampaignRunInput.this.status.defined) {
                    inputFieldWriter.writeString("status", UpdateCampaignRunInput.this.status.value != 0 ? ((CampaignStatus) UpdateCampaignRunInput.this.status.value).name() : null);
                }
                if (UpdateCampaignRunInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeString("systemPauseReason", (String) UpdateCampaignRunInput.this.systemPauseReason.value);
                }
                if (UpdateCampaignRunInput.this.leadCount.defined) {
                    inputFieldWriter.writeInt("leadCount", (Integer) UpdateCampaignRunInput.this.leadCount.value);
                }
                if (UpdateCampaignRunInput.this.messageCreated.defined) {
                    inputFieldWriter.writeInt("messageCreated", (Integer) UpdateCampaignRunInput.this.messageCreated.value);
                }
                if (UpdateCampaignRunInput.this.sentCount.defined) {
                    inputFieldWriter.writeInt("sentCount", (Integer) UpdateCampaignRunInput.this.sentCount.value);
                }
                if (UpdateCampaignRunInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeInt("deliveredCount", (Integer) UpdateCampaignRunInput.this.deliveredCount.value);
                }
                if (UpdateCampaignRunInput.this.readCount.defined) {
                    inputFieldWriter.writeInt("readCount", (Integer) UpdateCampaignRunInput.this.readCount.value);
                }
                if (UpdateCampaignRunInput.this.repliedCount.defined) {
                    inputFieldWriter.writeInt("repliedCount", (Integer) UpdateCampaignRunInput.this.repliedCount.value);
                }
                if (UpdateCampaignRunInput.this.failedCount.defined) {
                    inputFieldWriter.writeInt("failedCount", (Integer) UpdateCampaignRunInput.this.failedCount.value);
                }
                if (UpdateCampaignRunInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateCampaignRunInput.this.ownerId.value);
                }
                if (UpdateCampaignRunInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateCampaignRunInput.this.primaryTeamId.value);
                }
                if (UpdateCampaignRunInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCampaignRunInput.this.createdAt.value);
                }
                if (UpdateCampaignRunInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCampaignRunInput.this.updatedAt.value);
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

    public String startDate() {
        return this.startDate.value;
    }

    public CampaignStatus status() {
        return this.status.value;
    }

    public String systemPauseReason() {
        return this.systemPauseReason.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
