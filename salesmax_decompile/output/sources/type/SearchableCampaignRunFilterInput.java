package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCampaignRunFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCampaignRunFilterInput>> and;
    private final Input<SearchableIDFilterInput> campaignId;
    private final Input<SearchableStringFilterInput> campaignName;
    private final Input<SearchableStringFilterInput> campaignType;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIntFilterInput> deliveredCount;
    private final Input<SearchableStringFilterInput> endDate;
    private final Input<SearchableIntFilterInput> failedCount;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableIntFilterInput> leadCount;
    private final Input<SearchableIntFilterInput> messageCreated;
    private final Input<SearchableStringFilterInput> name;
    private final Input<List<SearchableCampaignRunFilterInput>> not;
    private final Input<List<SearchableCampaignRunFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableIntFilterInput> readCount;
    private final Input<SearchableIntFilterInput> repliedCount;
    private final Input<SearchableIntFilterInput> sentCount;
    private final Input<SearchableStringFilterInput> startDate;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> systemPauseReason;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> campaignId = Input.absent();
        private Input<SearchableStringFilterInput> campaignName = Input.absent();
        private Input<SearchableStringFilterInput> campaignType = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> startDate = Input.absent();
        private Input<SearchableStringFilterInput> endDate = Input.absent();
        private Input<SearchableStringFilterInput> systemPauseReason = Input.absent();
        private Input<SearchableIntFilterInput> leadCount = Input.absent();
        private Input<SearchableIntFilterInput> messageCreated = Input.absent();
        private Input<SearchableIntFilterInput> sentCount = Input.absent();
        private Input<SearchableIntFilterInput> deliveredCount = Input.absent();
        private Input<SearchableIntFilterInput> readCount = Input.absent();
        private Input<SearchableIntFilterInput> failedCount = Input.absent();
        private Input<SearchableIntFilterInput> repliedCount = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableCampaignRunFilterInput>> and = Input.absent();
        private Input<List<SearchableCampaignRunFilterInput>> or = Input.absent();
        private Input<List<SearchableCampaignRunFilterInput>> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCampaignRunFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableCampaignRunFilterInput build() {
            return new SearchableCampaignRunFilterInput(this.id, this.accountId, this.campaignId, this.campaignName, this.campaignType, this.name, this.status, this.startDate, this.endDate, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.failedCount, this.repliedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder campaignId(SearchableIDFilterInput searchableIDFilterInput) {
            this.campaignId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder campaignName(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder campaignType(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder deliveredCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.deliveredCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder endDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.endDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder failedCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.failedCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder leadCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.leadCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder messageCreated(SearchableIntFilterInput searchableIntFilterInput) {
            this.messageCreated = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(List<SearchableCampaignRunFilterInput> list) {
            this.not = Input.fromNullable(list);
            return this;
        }

        public Builder or(List<SearchableCampaignRunFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder primaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.primaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder readCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.readCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder repliedCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.repliedCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder sentCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.sentCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder startDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.startDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder systemPauseReason(SearchableStringFilterInput searchableStringFilterInput) {
            this.systemPauseReason = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableCampaignRunFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIntFilterInput> input11, Input<SearchableIntFilterInput> input12, Input<SearchableIntFilterInput> input13, Input<SearchableIntFilterInput> input14, Input<SearchableIntFilterInput> input15, Input<SearchableIntFilterInput> input16, Input<SearchableIntFilterInput> input17, Input<SearchableIDFilterInput> input18, Input<SearchableIDFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<List<SearchableCampaignRunFilterInput>> input22, Input<List<SearchableCampaignRunFilterInput>> input23, Input<List<SearchableCampaignRunFilterInput>> input24) {
        this.id = input;
        this.accountId = input2;
        this.campaignId = input3;
        this.campaignName = input4;
        this.campaignType = input5;
        this.name = input6;
        this.status = input7;
        this.startDate = input8;
        this.endDate = input9;
        this.systemPauseReason = input10;
        this.leadCount = input11;
        this.messageCreated = input12;
        this.sentCount = input13;
        this.deliveredCount = input14;
        this.readCount = input15;
        this.failedCount = input16;
        this.repliedCount = input17;
        this.ownerId = input18;
        this.primaryTeamId = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableCampaignRunFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput campaignId() {
        return this.campaignId.value;
    }

    public SearchableStringFilterInput campaignName() {
        return this.campaignName.value;
    }

    public SearchableStringFilterInput campaignType() {
        return this.campaignType.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIntFilterInput deliveredCount() {
        return this.deliveredCount.value;
    }

    public SearchableStringFilterInput endDate() {
        return this.endDate.value;
    }

    public SearchableIntFilterInput failedCount() {
        return this.failedCount.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableIntFilterInput leadCount() {
        return this.leadCount.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCampaignRunFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCampaignRunFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableCampaignRunFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCampaignRunFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", SearchableCampaignRunFilterInput.this.campaignId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunFilterInput.this.campaignId.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.campaignName.defined) {
                    inputFieldWriter.writeObject("campaignName", SearchableCampaignRunFilterInput.this.campaignName.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.campaignName.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.campaignType.defined) {
                    inputFieldWriter.writeObject("campaignType", SearchableCampaignRunFilterInput.this.campaignType.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.campaignType.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableCampaignRunFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableCampaignRunFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.startDate.defined) {
                    inputFieldWriter.writeObject("startDate", SearchableCampaignRunFilterInput.this.startDate.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.startDate.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.endDate.defined) {
                    inputFieldWriter.writeObject("endDate", SearchableCampaignRunFilterInput.this.endDate.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.endDate.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.systemPauseReason.defined) {
                    inputFieldWriter.writeObject("systemPauseReason", SearchableCampaignRunFilterInput.this.systemPauseReason.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.systemPauseReason.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.leadCount.defined) {
                    inputFieldWriter.writeObject("leadCount", SearchableCampaignRunFilterInput.this.leadCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.leadCount.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.messageCreated.defined) {
                    inputFieldWriter.writeObject("messageCreated", SearchableCampaignRunFilterInput.this.messageCreated.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.messageCreated.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.sentCount.defined) {
                    inputFieldWriter.writeObject("sentCount", SearchableCampaignRunFilterInput.this.sentCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.sentCount.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeObject("deliveredCount", SearchableCampaignRunFilterInput.this.deliveredCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.deliveredCount.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.readCount.defined) {
                    inputFieldWriter.writeObject("readCount", SearchableCampaignRunFilterInput.this.readCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.readCount.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.failedCount.defined) {
                    inputFieldWriter.writeObject("failedCount", SearchableCampaignRunFilterInput.this.failedCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.failedCount.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.repliedCount.defined) {
                    inputFieldWriter.writeObject("repliedCount", SearchableCampaignRunFilterInput.this.repliedCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignRunFilterInput.this.repliedCount.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableCampaignRunFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableCampaignRunFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignRunFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCampaignRunFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCampaignRunFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignRunFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCampaignRunFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCampaignRunFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignRunFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignRunFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignRunFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCampaignRunFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCampaignRunFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignRunFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignRunFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignRunFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCampaignRunFilterInput.this.not.defined) {
                    inputFieldWriter.writeList("not", SearchableCampaignRunFilterInput.this.not.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignRunFilterInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignRunFilterInput.this.not.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignRunFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public SearchableIntFilterInput messageCreated() {
        return this.messageCreated.value;
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public List<SearchableCampaignRunFilterInput> not() {
        return this.not.value;
    }

    public List<SearchableCampaignRunFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableIntFilterInput readCount() {
        return this.readCount.value;
    }

    public SearchableIntFilterInput repliedCount() {
        return this.repliedCount.value;
    }

    public SearchableIntFilterInput sentCount() {
        return this.sentCount.value;
    }

    public SearchableStringFilterInput startDate() {
        return this.startDate.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput systemPauseReason() {
        return this.systemPauseReason.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
