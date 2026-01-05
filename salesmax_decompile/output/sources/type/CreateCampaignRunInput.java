package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateCampaignRunInput implements InputType {
    private final String accountId;
    private final Input<String> campaignChannelIdentifier;
    private final String campaignId;
    private final Input<String> campaignName;
    private final Input<CampaignType> campaignType;
    private final Input<String> createdAt;
    private final Input<Integer> deliveredCount;
    private final Input<String> endDate;
    private final Input<Integer> failedCount;
    private final Input<String> id;
    private final Input<Integer> leadCount;
    private final Input<Integer> messageCreated;
    private final String name;
    private final String ownerId;
    private final Input<String> primaryTeamId;
    private final Input<Integer> readCount;
    private final Input<Integer> repliedCount;
    private final Input<Integer> sentCount;
    private final Input<String> startDate;
    private final CampaignStatus status;
    private final Input<String> systemPauseReason;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String campaignId;
        private String name;
        private String ownerId;
        private CampaignStatus status;
        private Input<String> id = Input.absent();
        private Input<String> campaignName = Input.absent();
        private Input<CampaignType> campaignType = Input.absent();
        private Input<String> campaignChannelIdentifier = Input.absent();
        private Input<String> startDate = Input.absent();
        private Input<String> endDate = Input.absent();
        private Input<String> systemPauseReason = Input.absent();
        private Input<Integer> leadCount = Input.absent();
        private Input<Integer> messageCreated = Input.absent();
        private Input<Integer> sentCount = Input.absent();
        private Input<Integer> deliveredCount = Input.absent();
        private Input<Integer> readCount = Input.absent();
        private Input<Integer> repliedCount = Input.absent();
        private Input<Integer> failedCount = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCampaignRunInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.campaignId, "campaignId == null");
            Utils.checkNotNull(this.name, "name == null");
            Utils.checkNotNull(this.status, "status == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            return new CreateCampaignRunInput(this.id, this.accountId, this.campaignId, this.campaignName, this.campaignType, this.campaignChannelIdentifier, this.name, this.startDate, this.endDate, this.status, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt);
        }

        public Builder campaignChannelIdentifier(String str) {
            this.campaignChannelIdentifier = Input.fromNullable(str);
            return this;
        }

        public Builder campaignId(String str) {
            this.campaignId = str;
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
            this.id = Input.fromNullable(str);
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

        public Builder startDate(String str) {
            this.startDate = Input.fromNullable(str);
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

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateCampaignRunInput(Input<String> input, String str, String str2, Input<String> input2, Input<CampaignType> input3, Input<String> input4, String str3, Input<String> input5, Input<String> input6, CampaignStatus campaignStatus, Input<String> input7, Input<Integer> input8, Input<Integer> input9, Input<Integer> input10, Input<Integer> input11, Input<Integer> input12, Input<Integer> input13, Input<Integer> input14, String str4, Input<String> input15, Input<String> input16, Input<String> input17) {
        this.id = input;
        this.accountId = str;
        this.campaignId = str2;
        this.campaignName = input2;
        this.campaignType = input3;
        this.campaignChannelIdentifier = input4;
        this.name = str3;
        this.startDate = input5;
        this.endDate = input6;
        this.status = campaignStatus;
        this.systemPauseReason = input7;
        this.leadCount = input8;
        this.messageCreated = input9;
        this.sentCount = input10;
        this.deliveredCount = input11;
        this.readCount = input12;
        this.repliedCount = input13;
        this.failedCount = input14;
        this.ownerId = str4;
        this.primaryTeamId = input15;
        this.createdAt = input16;
        this.updatedAt = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String campaignChannelIdentifier() {
        return this.campaignChannelIdentifier.value;
    }

    public String campaignId() {
        return this.campaignId;
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
        return this.id.value;
    }

    public Integer leadCount() {
        return this.leadCount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCampaignRunInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCampaignRunInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCampaignRunInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCampaignRunInput.this.accountId);
                inputFieldWriter.writeString("campaignId", CreateCampaignRunInput.this.campaignId);
                if (CreateCampaignRunInput.this.campaignName.defined) {
                    inputFieldWriter.writeString("campaignName", (String) CreateCampaignRunInput.this.campaignName.value);
                }
                if (CreateCampaignRunInput.this.campaignType.defined) {
                    inputFieldWriter.writeString("campaignType", CreateCampaignRunInput.this.campaignType.value != 0 ? ((CampaignType) CreateCampaignRunInput.this.campaignType.value).name() : null);
                }
                if (CreateCampaignRunInput.this.campaignChannelIdentifier.defined) {
                    inputFieldWriter.writeString("campaignChannelIdentifier", (String) CreateCampaignRunInput.this.campaignChannelIdentifier.value);
                }
                inputFieldWriter.writeString("name", CreateCampaignRunInput.this.name);
                if (CreateCampaignRunInput.this.startDate.defined) {
                    inputFieldWriter.writeString("startDate", (String) CreateCampaignRunInput.this.startDate.value);
                }
                if (CreateCampaignRunInput.this.endDate.defined) {
                    inputFieldWriter.writeString("endDate", (String) CreateCampaignRunInput.this.endDate.value);
                }
                inputFieldWriter.writeString("status", CreateCampaignRunInput.this.status.name());
                if (CreateCampaignRunInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeString("systemPauseReason", (String) CreateCampaignRunInput.this.systemPauseReason.value);
                }
                if (CreateCampaignRunInput.this.leadCount.defined) {
                    inputFieldWriter.writeInt("leadCount", (Integer) CreateCampaignRunInput.this.leadCount.value);
                }
                if (CreateCampaignRunInput.this.messageCreated.defined) {
                    inputFieldWriter.writeInt("messageCreated", (Integer) CreateCampaignRunInput.this.messageCreated.value);
                }
                if (CreateCampaignRunInput.this.sentCount.defined) {
                    inputFieldWriter.writeInt("sentCount", (Integer) CreateCampaignRunInput.this.sentCount.value);
                }
                if (CreateCampaignRunInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeInt("deliveredCount", (Integer) CreateCampaignRunInput.this.deliveredCount.value);
                }
                if (CreateCampaignRunInput.this.readCount.defined) {
                    inputFieldWriter.writeInt("readCount", (Integer) CreateCampaignRunInput.this.readCount.value);
                }
                if (CreateCampaignRunInput.this.repliedCount.defined) {
                    inputFieldWriter.writeInt("repliedCount", (Integer) CreateCampaignRunInput.this.repliedCount.value);
                }
                if (CreateCampaignRunInput.this.failedCount.defined) {
                    inputFieldWriter.writeInt("failedCount", (Integer) CreateCampaignRunInput.this.failedCount.value);
                }
                inputFieldWriter.writeString("ownerId", CreateCampaignRunInput.this.ownerId);
                if (CreateCampaignRunInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateCampaignRunInput.this.primaryTeamId.value);
                }
                if (CreateCampaignRunInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCampaignRunInput.this.createdAt.value);
                }
                if (CreateCampaignRunInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCampaignRunInput.this.updatedAt.value);
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

    public String startDate() {
        return this.startDate.value;
    }

    public CampaignStatus status() {
        return this.status;
    }

    public String systemPauseReason() {
        return this.systemPauseReason.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
