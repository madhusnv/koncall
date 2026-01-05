package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignRunDataConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCampaignRunDataConditionInput>> and;
    private final Input<ModelIDInput> campaignId;
    private final Input<ModelIDInput> campaignOutputId;
    private final Input<ModelStringInput> campaignOutputType;
    private final Input<ModelIDInput> campaignResponseId;
    private final Input<ModelStringInput> campaignResponseType;
    private final Input<ModelIDInput> campaignRunId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactSource;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> deliveredAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> messageCreatedAt;
    private final Input<ModelCampaignRunDataConditionInput> not;
    private final Input<List<ModelCampaignRunDataConditionInput>> or;
    private final Input<ModelStringInput> readAt;
    private final Input<ModelStringInput> repliedAt;
    private final Input<ModelStringInput> responseBody;
    private final Input<ModelStringInput> responseCategory;
    private final Input<ModelStringInput> sentAt;
    private final Input<ModelIDInput> sourceId;
    private final Input<ModelStringInput> sourceType;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> contactSource = Input.absent();
        private Input<ModelIDInput> campaignId = Input.absent();
        private Input<ModelIDInput> campaignRunId = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> campaignOutputType = Input.absent();
        private Input<ModelIDInput> campaignOutputId = Input.absent();
        private Input<ModelStringInput> campaignResponseType = Input.absent();
        private Input<ModelIDInput> campaignResponseId = Input.absent();
        private Input<ModelStringInput> responseCategory = Input.absent();
        private Input<ModelStringInput> responseBody = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> messageCreatedAt = Input.absent();
        private Input<ModelStringInput> sentAt = Input.absent();
        private Input<ModelStringInput> deliveredAt = Input.absent();
        private Input<ModelStringInput> readAt = Input.absent();
        private Input<ModelStringInput> repliedAt = Input.absent();
        private Input<ModelIDInput> sourceId = Input.absent();
        private Input<ModelStringInput> sourceType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCampaignRunDataConditionInput>> and = Input.absent();
        private Input<List<ModelCampaignRunDataConditionInput>> or = Input.absent();
        private Input<ModelCampaignRunDataConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCampaignRunDataConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCampaignRunDataConditionInput build() {
            return new ModelCampaignRunDataConditionInput(this.accountId, this.contactId, this.contactSource, this.campaignId, this.campaignRunId, this.engagementId, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder campaignId(ModelIDInput modelIDInput) {
            this.campaignId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder campaignOutputId(ModelIDInput modelIDInput) {
            this.campaignOutputId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder campaignOutputType(ModelStringInput modelStringInput) {
            this.campaignOutputType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignResponseId(ModelIDInput modelIDInput) {
            this.campaignResponseId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder campaignResponseType(ModelStringInput modelStringInput) {
            this.campaignResponseType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignRunId(ModelIDInput modelIDInput) {
            this.campaignRunId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactSource(ModelStringInput modelStringInput) {
            this.contactSource = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder deliveredAt(ModelStringInput modelStringInput) {
            this.deliveredAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder messageCreatedAt(ModelStringInput modelStringInput) {
            this.messageCreatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCampaignRunDataConditionInput modelCampaignRunDataConditionInput) {
            this.not = Input.fromNullable(modelCampaignRunDataConditionInput);
            return this;
        }

        public Builder or(List<ModelCampaignRunDataConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder readAt(ModelStringInput modelStringInput) {
            this.readAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder repliedAt(ModelStringInput modelStringInput) {
            this.repliedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder responseBody(ModelStringInput modelStringInput) {
            this.responseBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder responseCategory(ModelStringInput modelStringInput) {
            this.responseCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder sentAt(ModelStringInput modelStringInput) {
            this.sentAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder sourceId(ModelIDInput modelIDInput) {
            this.sourceId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder sourceType(ModelStringInput modelStringInput) {
            this.sourceType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCampaignRunDataConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelIDInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelIDInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<List<ModelCampaignRunDataConditionInput>> input23, Input<List<ModelCampaignRunDataConditionInput>> input24, Input<ModelCampaignRunDataConditionInput> input25) {
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
        this.status = input13;
        this.messageCreatedAt = input14;
        this.sentAt = input15;
        this.deliveredAt = input16;
        this.readAt = input17;
        this.repliedAt = input18;
        this.sourceId = input19;
        this.sourceType = input20;
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

    public List<ModelCampaignRunDataConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput campaignId() {
        return this.campaignId.value;
    }

    public ModelIDInput campaignOutputId() {
        return this.campaignOutputId.value;
    }

    public ModelStringInput campaignOutputType() {
        return this.campaignOutputType.value;
    }

    public ModelIDInput campaignResponseId() {
        return this.campaignResponseId.value;
    }

    public ModelStringInput campaignResponseType() {
        return this.campaignResponseType.value;
    }

    public ModelIDInput campaignRunId() {
        return this.campaignRunId.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput contactSource() {
        return this.contactSource.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput deliveredAt() {
        return this.deliveredAt.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunDataConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunDataConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCampaignRunDataConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelCampaignRunDataConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.contactSource.defined) {
                    inputFieldWriter.writeObject("contactSource", ModelCampaignRunDataConditionInput.this.contactSource.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.contactSource.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", ModelCampaignRunDataConditionInput.this.campaignId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.campaignId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.campaignRunId.defined) {
                    inputFieldWriter.writeObject("campaignRunId", ModelCampaignRunDataConditionInput.this.campaignRunId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.campaignRunId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelCampaignRunDataConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.campaignOutputType.defined) {
                    inputFieldWriter.writeObject("campaignOutputType", ModelCampaignRunDataConditionInput.this.campaignOutputType.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.campaignOutputType.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.campaignOutputId.defined) {
                    inputFieldWriter.writeObject("campaignOutputId", ModelCampaignRunDataConditionInput.this.campaignOutputId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.campaignOutputId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.campaignResponseType.defined) {
                    inputFieldWriter.writeObject("campaignResponseType", ModelCampaignRunDataConditionInput.this.campaignResponseType.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.campaignResponseType.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.campaignResponseId.defined) {
                    inputFieldWriter.writeObject("campaignResponseId", ModelCampaignRunDataConditionInput.this.campaignResponseId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.campaignResponseId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.responseCategory.defined) {
                    inputFieldWriter.writeObject("responseCategory", ModelCampaignRunDataConditionInput.this.responseCategory.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.responseCategory.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.responseBody.defined) {
                    inputFieldWriter.writeObject("responseBody", ModelCampaignRunDataConditionInput.this.responseBody.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.responseBody.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCampaignRunDataConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.messageCreatedAt.defined) {
                    inputFieldWriter.writeObject("messageCreatedAt", ModelCampaignRunDataConditionInput.this.messageCreatedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.messageCreatedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.sentAt.defined) {
                    inputFieldWriter.writeObject("sentAt", ModelCampaignRunDataConditionInput.this.sentAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.sentAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeObject("deliveredAt", ModelCampaignRunDataConditionInput.this.deliveredAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.deliveredAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.readAt.defined) {
                    inputFieldWriter.writeObject("readAt", ModelCampaignRunDataConditionInput.this.readAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.readAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.repliedAt.defined) {
                    inputFieldWriter.writeObject("repliedAt", ModelCampaignRunDataConditionInput.this.repliedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.repliedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.sourceId.defined) {
                    inputFieldWriter.writeObject("sourceId", ModelCampaignRunDataConditionInput.this.sourceId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataConditionInput.this.sourceId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.sourceType.defined) {
                    inputFieldWriter.writeObject("sourceType", ModelCampaignRunDataConditionInput.this.sourceType.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.sourceType.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCampaignRunDataConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCampaignRunDataConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCampaignRunDataConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunDataConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunDataConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunDataConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunDataConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCampaignRunDataConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunDataConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunDataConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunDataConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunDataConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCampaignRunDataConditionInput.this.not.value != 0 ? ((ModelCampaignRunDataConditionInput) ModelCampaignRunDataConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messageCreatedAt() {
        return this.messageCreatedAt.value;
    }

    public ModelCampaignRunDataConditionInput not() {
        return this.not.value;
    }

    public List<ModelCampaignRunDataConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput readAt() {
        return this.readAt.value;
    }

    public ModelStringInput repliedAt() {
        return this.repliedAt.value;
    }

    public ModelStringInput responseBody() {
        return this.responseBody.value;
    }

    public ModelStringInput responseCategory() {
        return this.responseCategory.value;
    }

    public ModelStringInput sentAt() {
        return this.sentAt.value;
    }

    public ModelIDInput sourceId() {
        return this.sourceId.value;
    }

    public ModelStringInput sourceType() {
        return this.sourceType.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
