package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCampaignRunDataFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCampaignRunDataFilterInput>> and;
    private final Input<SearchableIDFilterInput> campaignId;
    private final Input<SearchableIDFilterInput> campaignOutputId;
    private final Input<SearchableStringFilterInput> campaignOutputType;
    private final Input<SearchableIDFilterInput> campaignResponseId;
    private final Input<SearchableStringFilterInput> campaignResponseType;
    private final Input<SearchableIDFilterInput> campaignRunId;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> contactSource;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> deliveredAt;
    private final Input<SearchableIDFilterInput> engagementId;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> messageCreatedAt;
    private final Input<SearchableCampaignRunDataFilterInput> not;
    private final Input<List<SearchableCampaignRunDataFilterInput>> or;
    private final Input<SearchableStringFilterInput> readAt;
    private final Input<SearchableStringFilterInput> repliedAt;
    private final Input<SearchableStringFilterInput> responseBody;
    private final Input<SearchableStringFilterInput> responseCategory;
    private final Input<SearchableStringFilterInput> sentAt;
    private final Input<SearchableIDFilterInput> sourceId;
    private final Input<SearchableStringFilterInput> sourceType;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableStringFilterInput> contactSource = Input.absent();
        private Input<SearchableIDFilterInput> campaignId = Input.absent();
        private Input<SearchableIDFilterInput> campaignRunId = Input.absent();
        private Input<SearchableIDFilterInput> engagementId = Input.absent();
        private Input<SearchableStringFilterInput> campaignOutputType = Input.absent();
        private Input<SearchableIDFilterInput> campaignOutputId = Input.absent();
        private Input<SearchableStringFilterInput> campaignResponseType = Input.absent();
        private Input<SearchableIDFilterInput> campaignResponseId = Input.absent();
        private Input<SearchableStringFilterInput> responseCategory = Input.absent();
        private Input<SearchableStringFilterInput> responseBody = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> messageCreatedAt = Input.absent();
        private Input<SearchableStringFilterInput> sentAt = Input.absent();
        private Input<SearchableStringFilterInput> deliveredAt = Input.absent();
        private Input<SearchableStringFilterInput> readAt = Input.absent();
        private Input<SearchableStringFilterInput> repliedAt = Input.absent();
        private Input<SearchableIDFilterInput> sourceId = Input.absent();
        private Input<SearchableStringFilterInput> sourceType = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableCampaignRunDataFilterInput>> and = Input.absent();
        private Input<List<SearchableCampaignRunDataFilterInput>> or = Input.absent();
        private Input<SearchableCampaignRunDataFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCampaignRunDataFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableCampaignRunDataFilterInput build() {
            return new SearchableCampaignRunDataFilterInput(this.id, this.accountId, this.contactId, this.contactSource, this.campaignId, this.campaignRunId, this.engagementId, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder campaignId(SearchableIDFilterInput searchableIDFilterInput) {
            this.campaignId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder campaignOutputId(SearchableIDFilterInput searchableIDFilterInput) {
            this.campaignOutputId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder campaignOutputType(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignOutputType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder campaignResponseId(SearchableIDFilterInput searchableIDFilterInput) {
            this.campaignResponseId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder campaignResponseType(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignResponseType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder campaignRunId(SearchableIDFilterInput searchableIDFilterInput) {
            this.campaignRunId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactSource(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactSource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder deliveredAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.deliveredAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.engagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder messageCreatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageCreatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableCampaignRunDataFilterInput searchableCampaignRunDataFilterInput) {
            this.not = Input.fromNullable(searchableCampaignRunDataFilterInput);
            return this;
        }

        public Builder or(List<SearchableCampaignRunDataFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder readAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.readAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder repliedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.repliedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder responseBody(SearchableStringFilterInput searchableStringFilterInput) {
            this.responseBody = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder responseCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.responseCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder sentAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.sentAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder sourceId(SearchableIDFilterInput searchableIDFilterInput) {
            this.sourceId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder sourceType(SearchableStringFilterInput searchableStringFilterInput) {
            this.sourceType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableCampaignRunDataFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableIDFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<List<SearchableCampaignRunDataFilterInput>> input24, Input<List<SearchableCampaignRunDataFilterInput>> input25, Input<SearchableCampaignRunDataFilterInput> input26) {
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

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableCampaignRunDataFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput campaignId() {
        return this.campaignId.value;
    }

    public SearchableIDFilterInput campaignOutputId() {
        return this.campaignOutputId.value;
    }

    public SearchableStringFilterInput campaignOutputType() {
        return this.campaignOutputType.value;
    }

    public SearchableIDFilterInput campaignResponseId() {
        return this.campaignResponseId.value;
    }

    public SearchableStringFilterInput campaignResponseType() {
        return this.campaignResponseType.value;
    }

    public SearchableIDFilterInput campaignRunId() {
        return this.campaignRunId.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput contactSource() {
        return this.contactSource.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput deliveredAt() {
        return this.deliveredAt.value;
    }

    public SearchableIDFilterInput engagementId() {
        return this.engagementId.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCampaignRunDataFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCampaignRunDataFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableCampaignRunDataFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCampaignRunDataFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableCampaignRunDataFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.contactSource.defined) {
                    inputFieldWriter.writeObject("contactSource", SearchableCampaignRunDataFilterInput.this.contactSource.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.contactSource.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", SearchableCampaignRunDataFilterInput.this.campaignId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.campaignId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.campaignRunId.defined) {
                    inputFieldWriter.writeObject("campaignRunId", SearchableCampaignRunDataFilterInput.this.campaignRunId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.campaignRunId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", SearchableCampaignRunDataFilterInput.this.engagementId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.campaignOutputType.defined) {
                    inputFieldWriter.writeObject("campaignOutputType", SearchableCampaignRunDataFilterInput.this.campaignOutputType.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.campaignOutputType.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.campaignOutputId.defined) {
                    inputFieldWriter.writeObject("campaignOutputId", SearchableCampaignRunDataFilterInput.this.campaignOutputId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.campaignOutputId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.campaignResponseType.defined) {
                    inputFieldWriter.writeObject("campaignResponseType", SearchableCampaignRunDataFilterInput.this.campaignResponseType.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.campaignResponseType.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.campaignResponseId.defined) {
                    inputFieldWriter.writeObject("campaignResponseId", SearchableCampaignRunDataFilterInput.this.campaignResponseId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.campaignResponseId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.responseCategory.defined) {
                    inputFieldWriter.writeObject("responseCategory", SearchableCampaignRunDataFilterInput.this.responseCategory.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.responseCategory.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.responseBody.defined) {
                    inputFieldWriter.writeObject("responseBody", SearchableCampaignRunDataFilterInput.this.responseBody.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.responseBody.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableCampaignRunDataFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.messageCreatedAt.defined) {
                    inputFieldWriter.writeObject("messageCreatedAt", SearchableCampaignRunDataFilterInput.this.messageCreatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.messageCreatedAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.sentAt.defined) {
                    inputFieldWriter.writeObject("sentAt", SearchableCampaignRunDataFilterInput.this.sentAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.sentAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.deliveredAt.defined) {
                    inputFieldWriter.writeObject("deliveredAt", SearchableCampaignRunDataFilterInput.this.deliveredAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.deliveredAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.readAt.defined) {
                    inputFieldWriter.writeObject("readAt", SearchableCampaignRunDataFilterInput.this.readAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.readAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.repliedAt.defined) {
                    inputFieldWriter.writeObject("repliedAt", SearchableCampaignRunDataFilterInput.this.repliedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.repliedAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.sourceId.defined) {
                    inputFieldWriter.writeObject("sourceId", SearchableCampaignRunDataFilterInput.this.sourceId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunDataFilterInput.this.sourceId.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.sourceType.defined) {
                    inputFieldWriter.writeObject("sourceType", SearchableCampaignRunDataFilterInput.this.sourceType.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.sourceType.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCampaignRunDataFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCampaignRunDataFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunDataFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCampaignRunDataFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignRunDataFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignRunDataFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignRunDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCampaignRunDataFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignRunDataFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignRunDataFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignRunDataFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCampaignRunDataFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableCampaignRunDataFilterInput.this.not.value != 0 ? ((SearchableCampaignRunDataFilterInput) SearchableCampaignRunDataFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput messageCreatedAt() {
        return this.messageCreatedAt.value;
    }

    public SearchableCampaignRunDataFilterInput not() {
        return this.not.value;
    }

    public List<SearchableCampaignRunDataFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput readAt() {
        return this.readAt.value;
    }

    public SearchableStringFilterInput repliedAt() {
        return this.repliedAt.value;
    }

    public SearchableStringFilterInput responseBody() {
        return this.responseBody.value;
    }

    public SearchableStringFilterInput responseCategory() {
        return this.responseCategory.value;
    }

    public SearchableStringFilterInput sentAt() {
        return this.sentAt.value;
    }

    public SearchableIDFilterInput sourceId() {
        return this.sourceId.value;
    }

    public SearchableStringFilterInput sourceType() {
        return this.sourceType.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
