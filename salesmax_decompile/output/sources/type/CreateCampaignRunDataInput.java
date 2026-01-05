package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateCampaignRunDataInput implements InputType {
    private final String accountId;
    private final String campaignId;
    private final Input<String> campaignOutputId;
    private final Input<String> campaignOutputType;
    private final Input<String> campaignResponseId;
    private final Input<String> campaignResponseType;
    private final String campaignRunId;
    private final String contactId;
    private final Input<String> contactSource;
    private final Input<String> createdAt;
    private final Input<String> deliveredAt;
    private final Input<String> engagementId;
    private final Input<String> id;
    private final Input<String> messageCreatedAt;
    private final Input<String> readAt;
    private final Input<String> repliedAt;
    private final Input<String> responseBody;
    private final Input<String> responseCategory;
    private final Input<String> sentAt;
    private final Input<String> sourceId;
    private final Input<String> sourceType;
    private final Input<String> status;
    private final Input<List<StatusTransitionInput>> statusTransition;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String campaignId;
        private String campaignRunId;
        private String contactId;
        private Input<String> id = Input.absent();
        private Input<String> contactSource = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> campaignOutputType = Input.absent();
        private Input<String> campaignOutputId = Input.absent();
        private Input<String> campaignResponseType = Input.absent();
        private Input<String> campaignResponseId = Input.absent();
        private Input<String> responseCategory = Input.absent();
        private Input<String> responseBody = Input.absent();
        private Input<List<StatusTransitionInput>> statusTransition = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> messageCreatedAt = Input.absent();
        private Input<String> sentAt = Input.absent();
        private Input<String> deliveredAt = Input.absent();
        private Input<String> readAt = Input.absent();
        private Input<String> repliedAt = Input.absent();
        private Input<String> sourceId = Input.absent();
        private Input<String> sourceType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCampaignRunDataInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            Utils.checkNotNull(this.campaignId, "campaignId == null");
            Utils.checkNotNull(this.campaignRunId, "campaignRunId == null");
            return new CreateCampaignRunDataInput(this.id, this.accountId, this.contactId, this.contactSource, this.campaignId, this.campaignRunId, this.engagementId, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.statusTransition, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt);
        }

        public Builder campaignId(String str) {
            this.campaignId = str;
            return this;
        }

        public Builder campaignOutputId(String str) {
            this.campaignOutputId = Input.fromNullable(str);
            return this;
        }

        public Builder campaignOutputType(String str) {
            this.campaignOutputType = Input.fromNullable(str);
            return this;
        }

        public Builder campaignResponseId(String str) {
            this.campaignResponseId = Input.fromNullable(str);
            return this;
        }

        public Builder campaignResponseType(String str) {
            this.campaignResponseType = Input.fromNullable(str);
            return this;
        }

        public Builder campaignRunId(String str) {
            this.campaignRunId = str;
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = str;
            return this;
        }

        public Builder contactSource(String str) {
            this.contactSource = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder deliveredAt(String str) {
            this.deliveredAt = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder messageCreatedAt(String str) {
            this.messageCreatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder readAt(String str) {
            this.readAt = Input.fromNullable(str);
            return this;
        }

        public Builder repliedAt(String str) {
            this.repliedAt = Input.fromNullable(str);
            return this;
        }

        public Builder responseBody(String str) {
            this.responseBody = Input.fromNullable(str);
            return this;
        }

        public Builder responseCategory(String str) {
            this.responseCategory = Input.fromNullable(str);
            return this;
        }

        public Builder sentAt(String str) {
            this.sentAt = Input.fromNullable(str);
            return this;
        }

        public Builder sourceId(String str) {
            this.sourceId = Input.fromNullable(str);
            return this;
        }

        public Builder sourceType(String str) {
            this.sourceType = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder statusTransition(List<StatusTransitionInput> list) {
            this.statusTransition = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateCampaignRunDataInput(Input<String> input, String str, String str2, Input<String> input2, String str3, String str4, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<List<StatusTransitionInput>> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20) {
        this.id = input;
        this.accountId = str;
        this.contactId = str2;
        this.contactSource = input2;
        this.campaignId = str3;
        this.campaignRunId = str4;
        this.engagementId = input3;
        this.campaignOutputType = input4;
        this.campaignOutputId = input5;
        this.campaignResponseType = input6;
        this.campaignResponseId = input7;
        this.responseCategory = input8;
        this.responseBody = input9;
        this.statusTransition = input10;
        this.status = input11;
        this.messageCreatedAt = input12;
        this.sentAt = input13;
        this.deliveredAt = input14;
        this.readAt = input15;
        this.repliedAt = input16;
        this.sourceId = input17;
        this.sourceType = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String campaignId() {
        return this.campaignId;
    }

    public String campaignOutputId() {
        return this.campaignOutputId.value;
    }

    public String campaignOutputType() {
        return this.campaignOutputType.value;
    }

    public String campaignResponseId() {
        return this.campaignResponseId.value;
    }

    public String campaignResponseType() {
        return this.campaignResponseType.value;
    }

    public String campaignRunId() {
        return this.campaignRunId;
    }

    public String contactId() {
        return this.contactId;
    }

    public String contactSource() {
        return this.contactSource.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String deliveredAt() {
        return this.deliveredAt.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCampaignRunDataInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCampaignRunDataInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCampaignRunDataInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCampaignRunDataInput.this.accountId);
                inputFieldWriter.writeString("contactId", CreateCampaignRunDataInput.this.contactId);
                if (CreateCampaignRunDataInput.this.contactSource.defined) {
                    inputFieldWriter.writeString("contactSource", (String) CreateCampaignRunDataInput.this.contactSource.value);
                }
                inputFieldWriter.writeString("campaignId", CreateCampaignRunDataInput.this.campaignId);
                inputFieldWriter.writeString("campaignRunId", CreateCampaignRunDataInput.this.campaignRunId);
                if (CreateCampaignRunDataInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) CreateCampaignRunDataInput.this.engagementId.value);
                }
                if (CreateCampaignRunDataInput.this.campaignOutputType.defined) {
                    inputFieldWriter.writeString("campaignOutputType", (String) CreateCampaignRunDataInput.this.campaignOutputType.value);
                }
                if (CreateCampaignRunDataInput.this.campaignOutputId.defined) {
                    inputFieldWriter.writeString("campaignOutputId", (String) CreateCampaignRunDataInput.this.campaignOutputId.value);
                }
                if (CreateCampaignRunDataInput.this.campaignResponseType.defined) {
                    inputFieldWriter.writeString("campaignResponseType", (String) CreateCampaignRunDataInput.this.campaignResponseType.value);
                }
                if (CreateCampaignRunDataInput.this.campaignResponseId.defined) {
                    inputFieldWriter.writeString("campaignResponseId", (String) CreateCampaignRunDataInput.this.campaignResponseId.value);
                }
                if (CreateCampaignRunDataInput.this.responseCategory.defined) {
                    inputFieldWriter.writeString("responseCategory", (String) CreateCampaignRunDataInput.this.responseCategory.value);
                }
                if (CreateCampaignRunDataInput.this.responseBody.defined) {
                    inputFieldWriter.writeString("responseBody", (String) CreateCampaignRunDataInput.this.responseBody.value);
                }
                if (CreateCampaignRunDataInput.this.statusTransition.defined) {
                    inputFieldWriter.writeList("statusTransition", CreateCampaignRunDataInput.this.statusTransition.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCampaignRunDataInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCampaignRunDataInput.this.statusTransition.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((StatusTransitionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateCampaignRunDataInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateCampaignRunDataInput.this.status.value);
                }
                if (CreateCampaignRunDataInput.this.messageCreatedAt.defined) {
                    inputFieldWriter.writeString("messageCreatedAt", (String) CreateCampaignRunDataInput.this.messageCreatedAt.value);
                }
                if (CreateCampaignRunDataInput.this.sentAt.defined) {
                    inputFieldWriter.writeString("sentAt", (String) CreateCampaignRunDataInput.this.sentAt.value);
                }
                if (CreateCampaignRunDataInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeString("deliveredAt", (String) CreateCampaignRunDataInput.this.deliveredAt.value);
                }
                if (CreateCampaignRunDataInput.this.readAt.defined) {
                    inputFieldWriter.writeString("readAt", (String) CreateCampaignRunDataInput.this.readAt.value);
                }
                if (CreateCampaignRunDataInput.this.repliedAt.defined) {
                    inputFieldWriter.writeString("repliedAt", (String) CreateCampaignRunDataInput.this.repliedAt.value);
                }
                if (CreateCampaignRunDataInput.this.sourceId.defined) {
                    inputFieldWriter.writeString("sourceId", (String) CreateCampaignRunDataInput.this.sourceId.value);
                }
                if (CreateCampaignRunDataInput.this.sourceType.defined) {
                    inputFieldWriter.writeString("sourceType", (String) CreateCampaignRunDataInput.this.sourceType.value);
                }
                if (CreateCampaignRunDataInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCampaignRunDataInput.this.createdAt.value);
                }
                if (CreateCampaignRunDataInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCampaignRunDataInput.this.updatedAt.value);
                }
            }
        };
    }

    public String messageCreatedAt() {
        return this.messageCreatedAt.value;
    }

    public String readAt() {
        return this.readAt.value;
    }

    public String repliedAt() {
        return this.repliedAt.value;
    }

    public String responseBody() {
        return this.responseBody.value;
    }

    public String responseCategory() {
        return this.responseCategory.value;
    }

    public String sentAt() {
        return this.sentAt.value;
    }

    public String sourceId() {
        return this.sourceId.value;
    }

    public String sourceType() {
        return this.sourceType.value;
    }

    public String status() {
        return this.status.value;
    }

    public List<StatusTransitionInput> statusTransition() {
        return this.statusTransition.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
