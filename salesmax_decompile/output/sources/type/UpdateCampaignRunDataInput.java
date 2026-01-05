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
public final class UpdateCampaignRunDataInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> campaignId;
    private final Input<String> campaignOutputId;
    private final Input<String> campaignOutputType;
    private final Input<String> campaignResponseId;
    private final Input<String> campaignResponseType;
    private final Input<String> campaignRunId;
    private final Input<String> contactId;
    private final Input<String> contactSource;
    private final Input<String> createdAt;
    private final Input<String> deliveredAt;
    private final Input<String> engagementId;
    private final String id;
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
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> contactSource = Input.absent();
        private Input<String> campaignId = Input.absent();
        private Input<String> campaignRunId = Input.absent();
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
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCampaignRunDataInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCampaignRunDataInput(this.id, this.accountId, this.contactId, this.contactSource, this.campaignId, this.campaignRunId, this.engagementId, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.statusTransition, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt);
        }

        public Builder campaignId(String str) {
            this.campaignId = Input.fromNullable(str);
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
            this.campaignRunId = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
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
            this.id = str;
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

    public UpdateCampaignRunDataInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<List<StatusTransitionInput>> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23) {
        this.id = str;
        this.accountId = input;
        this.contactId = input2;
        this.contactSource = input3;
        this.campaignId = input4;
        this.campaignRunId = input5;
        this.engagementId = input6;
        this.campaignOutputType = input7;
        this.campaignOutputId = input8;
        this.campaignResponseType = input9;
        this.campaignResponseId = input10;
        this.responseCategory = input11;
        this.responseBody = input12;
        this.statusTransition = input13;
        this.status = input14;
        this.messageCreatedAt = input15;
        this.sentAt = input16;
        this.deliveredAt = input17;
        this.readAt = input18;
        this.repliedAt = input19;
        this.sourceId = input20;
        this.sourceType = input21;
        this.createdAt = input22;
        this.updatedAt = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String campaignId() {
        return this.campaignId.value;
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
        return this.campaignRunId.value;
    }

    public String contactId() {
        return this.contactId.value;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCampaignRunDataInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCampaignRunDataInput.this.id);
                if (UpdateCampaignRunDataInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCampaignRunDataInput.this.accountId.value);
                }
                if (UpdateCampaignRunDataInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateCampaignRunDataInput.this.contactId.value);
                }
                if (UpdateCampaignRunDataInput.this.contactSource.defined) {
                    inputFieldWriter.writeString("contactSource", (String) UpdateCampaignRunDataInput.this.contactSource.value);
                }
                if (UpdateCampaignRunDataInput.this.campaignId.defined) {
                    inputFieldWriter.writeString("campaignId", (String) UpdateCampaignRunDataInput.this.campaignId.value);
                }
                if (UpdateCampaignRunDataInput.this.campaignRunId.defined) {
                    inputFieldWriter.writeString("campaignRunId", (String) UpdateCampaignRunDataInput.this.campaignRunId.value);
                }
                if (UpdateCampaignRunDataInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdateCampaignRunDataInput.this.engagementId.value);
                }
                if (UpdateCampaignRunDataInput.this.campaignOutputType.defined) {
                    inputFieldWriter.writeString("campaignOutputType", (String) UpdateCampaignRunDataInput.this.campaignOutputType.value);
                }
                if (UpdateCampaignRunDataInput.this.campaignOutputId.defined) {
                    inputFieldWriter.writeString("campaignOutputId", (String) UpdateCampaignRunDataInput.this.campaignOutputId.value);
                }
                if (UpdateCampaignRunDataInput.this.campaignResponseType.defined) {
                    inputFieldWriter.writeString("campaignResponseType", (String) UpdateCampaignRunDataInput.this.campaignResponseType.value);
                }
                if (UpdateCampaignRunDataInput.this.campaignResponseId.defined) {
                    inputFieldWriter.writeString("campaignResponseId", (String) UpdateCampaignRunDataInput.this.campaignResponseId.value);
                }
                if (UpdateCampaignRunDataInput.this.responseCategory.defined) {
                    inputFieldWriter.writeString("responseCategory", (String) UpdateCampaignRunDataInput.this.responseCategory.value);
                }
                if (UpdateCampaignRunDataInput.this.responseBody.defined) {
                    inputFieldWriter.writeString("responseBody", (String) UpdateCampaignRunDataInput.this.responseBody.value);
                }
                if (UpdateCampaignRunDataInput.this.statusTransition.defined) {
                    inputFieldWriter.writeList("statusTransition", UpdateCampaignRunDataInput.this.statusTransition.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCampaignRunDataInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCampaignRunDataInput.this.statusTransition.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((StatusTransitionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateCampaignRunDataInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateCampaignRunDataInput.this.status.value);
                }
                if (UpdateCampaignRunDataInput.this.messageCreatedAt.defined) {
                    inputFieldWriter.writeString("messageCreatedAt", (String) UpdateCampaignRunDataInput.this.messageCreatedAt.value);
                }
                if (UpdateCampaignRunDataInput.this.sentAt.defined) {
                    inputFieldWriter.writeString("sentAt", (String) UpdateCampaignRunDataInput.this.sentAt.value);
                }
                if (UpdateCampaignRunDataInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeString("deliveredAt", (String) UpdateCampaignRunDataInput.this.deliveredAt.value);
                }
                if (UpdateCampaignRunDataInput.this.readAt.defined) {
                    inputFieldWriter.writeString("readAt", (String) UpdateCampaignRunDataInput.this.readAt.value);
                }
                if (UpdateCampaignRunDataInput.this.repliedAt.defined) {
                    inputFieldWriter.writeString("repliedAt", (String) UpdateCampaignRunDataInput.this.repliedAt.value);
                }
                if (UpdateCampaignRunDataInput.this.sourceId.defined) {
                    inputFieldWriter.writeString("sourceId", (String) UpdateCampaignRunDataInput.this.sourceId.value);
                }
                if (UpdateCampaignRunDataInput.this.sourceType.defined) {
                    inputFieldWriter.writeString("sourceType", (String) UpdateCampaignRunDataInput.this.sourceType.value);
                }
                if (UpdateCampaignRunDataInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCampaignRunDataInput.this.createdAt.value);
                }
                if (UpdateCampaignRunDataInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCampaignRunDataInput.this.updatedAt.value);
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
