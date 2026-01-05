package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCampaignRunDataFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCampaignRunDataFilterInput>> and;
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
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> messageCreatedAt;
    private final Input<ModelCampaignRunDataFilterInput> not;
    private final Input<List<ModelCampaignRunDataFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelCampaignRunDataFilterInput>> and = Input.absent();
        private Input<List<ModelCampaignRunDataFilterInput>> or = Input.absent();
        private Input<ModelCampaignRunDataFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCampaignRunDataFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCampaignRunDataFilterInput build() {
            return new ModelCampaignRunDataFilterInput(this.id, this.accountId, this.contactId, this.contactSource, this.campaignId, this.campaignRunId, this.engagementId, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder messageCreatedAt(ModelStringInput modelStringInput) {
            this.messageCreatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCampaignRunDataFilterInput modelCampaignRunDataFilterInput) {
            this.not = Input.fromNullable(modelCampaignRunDataFilterInput);
            return this;
        }

        public Builder or(List<ModelCampaignRunDataFilterInput> list) {
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

    public ModelCampaignRunDataFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelStringInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelIDInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<List<ModelCampaignRunDataFilterInput>> input24, Input<List<ModelCampaignRunDataFilterInput>> input25, Input<ModelCampaignRunDataFilterInput> input26) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.contactSource = input4;
        this.campaignId = input5;
        this.campaignRunId = input6;
        this.engagementId = input7;
        this.campaignOutputType = input8;
        this.campaignOutputId = input9;
        this.campaignResponseType = input10;
        this.campaignResponseId = input11;
        this.responseCategory = input12;
        this.responseBody = input13;
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
        this.and = input24;
        this.or = input25;
        this.not = input26;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCampaignRunDataFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunDataFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunDataFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCampaignRunDataFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCampaignRunDataFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelCampaignRunDataFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.contactSource.defined) {
                    inputFieldWriter.writeObject("contactSource", ModelCampaignRunDataFilterInput.this.contactSource.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.contactSource.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", ModelCampaignRunDataFilterInput.this.campaignId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.campaignId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.campaignRunId.defined) {
                    inputFieldWriter.writeObject("campaignRunId", ModelCampaignRunDataFilterInput.this.campaignRunId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.campaignRunId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelCampaignRunDataFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.campaignOutputType.defined) {
                    inputFieldWriter.writeObject("campaignOutputType", ModelCampaignRunDataFilterInput.this.campaignOutputType.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.campaignOutputType.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.campaignOutputId.defined) {
                    inputFieldWriter.writeObject("campaignOutputId", ModelCampaignRunDataFilterInput.this.campaignOutputId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.campaignOutputId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.campaignResponseType.defined) {
                    inputFieldWriter.writeObject("campaignResponseType", ModelCampaignRunDataFilterInput.this.campaignResponseType.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.campaignResponseType.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.campaignResponseId.defined) {
                    inputFieldWriter.writeObject("campaignResponseId", ModelCampaignRunDataFilterInput.this.campaignResponseId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.campaignResponseId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.responseCategory.defined) {
                    inputFieldWriter.writeObject("responseCategory", ModelCampaignRunDataFilterInput.this.responseCategory.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.responseCategory.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.responseBody.defined) {
                    inputFieldWriter.writeObject("responseBody", ModelCampaignRunDataFilterInput.this.responseBody.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.responseBody.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCampaignRunDataFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.messageCreatedAt.defined) {
                    inputFieldWriter.writeObject("messageCreatedAt", ModelCampaignRunDataFilterInput.this.messageCreatedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.messageCreatedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.sentAt.defined) {
                    inputFieldWriter.writeObject("sentAt", ModelCampaignRunDataFilterInput.this.sentAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.sentAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeObject("deliveredAt", ModelCampaignRunDataFilterInput.this.deliveredAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.deliveredAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.readAt.defined) {
                    inputFieldWriter.writeObject("readAt", ModelCampaignRunDataFilterInput.this.readAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.readAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.repliedAt.defined) {
                    inputFieldWriter.writeObject("repliedAt", ModelCampaignRunDataFilterInput.this.repliedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.repliedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.sourceId.defined) {
                    inputFieldWriter.writeObject("sourceId", ModelCampaignRunDataFilterInput.this.sourceId.value != 0 ? ((ModelIDInput) ModelCampaignRunDataFilterInput.this.sourceId.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.sourceType.defined) {
                    inputFieldWriter.writeObject("sourceType", ModelCampaignRunDataFilterInput.this.sourceType.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.sourceType.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCampaignRunDataFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCampaignRunDataFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCampaignRunDataFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCampaignRunDataFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCampaignRunDataFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunDataFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunDataFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunDataFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCampaignRunDataFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCampaignRunDataFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCampaignRunDataFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCampaignRunDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCampaignRunDataFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCampaignRunDataFilterInput.this.not.value != 0 ? ((ModelCampaignRunDataFilterInput) ModelCampaignRunDataFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messageCreatedAt() {
        return this.messageCreatedAt.value;
    }

    public ModelCampaignRunDataFilterInput not() {
        return this.not.value;
    }

    public List<ModelCampaignRunDataFilterInput> or() {
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
