package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableCampaignDefinitionFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableCampaignDefinitionFilterInput>> and;
    private final Input<SearchableIDFilterInput> associatedEntityListId;
    private final Input<SearchableStringFilterInput> campaignCategory;
    private final Input<SearchableStringFilterInput> campaignData;
    private final Input<SearchableIntFilterInput> campaignRunFrequencyValue;
    private final Input<SearchableStringFilterInput> campaignSubCategory;
    private final Input<SearchableStringFilterInput> campaignType;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIntFilterInput> deliveredCount;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableIntFilterInput> durationOfRunInDays;
    private final Input<SearchableStringFilterInput> endDateOfRun;
    private final Input<SearchableIntFilterInput> failedCount;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableIntFilterInput> messageCreated;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableCampaignDefinitionFilterInput> not;
    private final Input<List<SearchableCampaignDefinitionFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableIntFilterInput> readCount;
    private final Input<SearchableIntFilterInput> repliedCount;
    private final Input<SearchableIntFilterInput> sentCount;
    private final Input<SearchableStringFilterInput> startDateOfRun;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableStringFilterInput> campaignCategory = Input.absent();
        private Input<SearchableStringFilterInput> campaignSubCategory = Input.absent();
        private Input<SearchableStringFilterInput> campaignType = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> campaignData = Input.absent();
        private Input<SearchableIntFilterInput> campaignRunFrequencyValue = Input.absent();
        private Input<SearchableStringFilterInput> startDateOfRun = Input.absent();
        private Input<SearchableStringFilterInput> endDateOfRun = Input.absent();
        private Input<SearchableIntFilterInput> durationOfRunInDays = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableIDFilterInput> associatedEntityListId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableIntFilterInput> messageCreated = Input.absent();
        private Input<SearchableIntFilterInput> sentCount = Input.absent();
        private Input<SearchableIntFilterInput> deliveredCount = Input.absent();
        private Input<SearchableIntFilterInput> readCount = Input.absent();
        private Input<SearchableIntFilterInput> failedCount = Input.absent();
        private Input<SearchableIntFilterInput> repliedCount = Input.absent();
        private Input<List<SearchableCampaignDefinitionFilterInput>> and = Input.absent();
        private Input<List<SearchableCampaignDefinitionFilterInput>> or = Input.absent();
        private Input<SearchableCampaignDefinitionFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableCampaignDefinitionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder associatedEntityListId(SearchableIDFilterInput searchableIDFilterInput) {
            this.associatedEntityListId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public SearchableCampaignDefinitionFilterInput build() {
            return new SearchableCampaignDefinitionFilterInput(this.id, this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.status, this.campaignData, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.ownerId, this.primaryTeamId, this.associatedEntityListId, this.createdAt, this.updatedAt, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.failedCount, this.repliedCount, this.and, this.or, this.not);
        }

        public Builder campaignCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder campaignData(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignData = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder campaignRunFrequencyValue(SearchableIntFilterInput searchableIntFilterInput) {
            this.campaignRunFrequencyValue = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder campaignSubCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignSubCategory = Input.fromNullable(searchableStringFilterInput);
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

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder durationOfRunInDays(SearchableIntFilterInput searchableIntFilterInput) {
            this.durationOfRunInDays = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder endDateOfRun(SearchableStringFilterInput searchableStringFilterInput) {
            this.endDateOfRun = Input.fromNullable(searchableStringFilterInput);
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

        public Builder messageCreated(SearchableIntFilterInput searchableIntFilterInput) {
            this.messageCreated = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableCampaignDefinitionFilterInput searchableCampaignDefinitionFilterInput) {
            this.not = Input.fromNullable(searchableCampaignDefinitionFilterInput);
            return this;
        }

        public Builder or(List<SearchableCampaignDefinitionFilterInput> list) {
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

        public Builder startDateOfRun(SearchableStringFilterInput searchableStringFilterInput) {
            this.startDateOfRun = Input.fromNullable(searchableStringFilterInput);
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

    public SearchableCampaignDefinitionFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableIntFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableIntFilterInput> input13, Input<SearchableIDFilterInput> input14, Input<SearchableIDFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableIntFilterInput> input19, Input<SearchableIntFilterInput> input20, Input<SearchableIntFilterInput> input21, Input<SearchableIntFilterInput> input22, Input<SearchableIntFilterInput> input23, Input<SearchableIntFilterInput> input24, Input<List<SearchableCampaignDefinitionFilterInput>> input25, Input<List<SearchableCampaignDefinitionFilterInput>> input26, Input<SearchableCampaignDefinitionFilterInput> input27) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.campaignCategory = input5;
        this.campaignSubCategory = input6;
        this.campaignType = input7;
        this.status = input8;
        this.campaignData = input9;
        this.campaignRunFrequencyValue = input10;
        this.startDateOfRun = input11;
        this.endDateOfRun = input12;
        this.durationOfRunInDays = input13;
        this.ownerId = input14;
        this.primaryTeamId = input15;
        this.associatedEntityListId = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.messageCreated = input19;
        this.sentCount = input20;
        this.deliveredCount = input21;
        this.readCount = input22;
        this.failedCount = input23;
        this.repliedCount = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableCampaignDefinitionFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput associatedEntityListId() {
        return this.associatedEntityListId.value;
    }

    public SearchableStringFilterInput campaignCategory() {
        return this.campaignCategory.value;
    }

    public SearchableStringFilterInput campaignData() {
        return this.campaignData.value;
    }

    public SearchableIntFilterInput campaignRunFrequencyValue() {
        return this.campaignRunFrequencyValue.value;
    }

    public SearchableStringFilterInput campaignSubCategory() {
        return this.campaignSubCategory.value;
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

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableIntFilterInput durationOfRunInDays() {
        return this.durationOfRunInDays.value;
    }

    public SearchableStringFilterInput endDateOfRun() {
        return this.endDateOfRun.value;
    }

    public SearchableIntFilterInput failedCount() {
        return this.failedCount.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCampaignDefinitionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCampaignDefinitionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableCampaignDefinitionFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignDefinitionFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableCampaignDefinitionFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignDefinitionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableCampaignDefinitionFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableCampaignDefinitionFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.campaignCategory.defined) {
                    inputFieldWriter.writeObject("campaignCategory", SearchableCampaignDefinitionFilterInput.this.campaignCategory.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.campaignCategory.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.campaignSubCategory.defined) {
                    inputFieldWriter.writeObject("campaignSubCategory", SearchableCampaignDefinitionFilterInput.this.campaignSubCategory.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.campaignSubCategory.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.campaignType.defined) {
                    inputFieldWriter.writeObject("campaignType", SearchableCampaignDefinitionFilterInput.this.campaignType.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.campaignType.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableCampaignDefinitionFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.campaignData.defined) {
                    inputFieldWriter.writeObject("campaignData", SearchableCampaignDefinitionFilterInput.this.campaignData.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.campaignData.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.campaignRunFrequencyValue.defined) {
                    inputFieldWriter.writeObject("campaignRunFrequencyValue", SearchableCampaignDefinitionFilterInput.this.campaignRunFrequencyValue.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.campaignRunFrequencyValue.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.startDateOfRun.defined) {
                    inputFieldWriter.writeObject("startDateOfRun", SearchableCampaignDefinitionFilterInput.this.startDateOfRun.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.startDateOfRun.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.endDateOfRun.defined) {
                    inputFieldWriter.writeObject("endDateOfRun", SearchableCampaignDefinitionFilterInput.this.endDateOfRun.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.endDateOfRun.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.durationOfRunInDays.defined) {
                    inputFieldWriter.writeObject("durationOfRunInDays", SearchableCampaignDefinitionFilterInput.this.durationOfRunInDays.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.durationOfRunInDays.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableCampaignDefinitionFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignDefinitionFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableCampaignDefinitionFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignDefinitionFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.associatedEntityListId.defined) {
                    inputFieldWriter.writeObject("associatedEntityListId", SearchableCampaignDefinitionFilterInput.this.associatedEntityListId.value != 0 ? ((SearchableIDFilterInput) SearchableCampaignDefinitionFilterInput.this.associatedEntityListId.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableCampaignDefinitionFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableCampaignDefinitionFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableCampaignDefinitionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.messageCreated.defined) {
                    inputFieldWriter.writeObject("messageCreated", SearchableCampaignDefinitionFilterInput.this.messageCreated.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.messageCreated.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.sentCount.defined) {
                    inputFieldWriter.writeObject("sentCount", SearchableCampaignDefinitionFilterInput.this.sentCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.sentCount.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.deliveredCount.defined) {
                    inputFieldWriter.writeObject("deliveredCount", SearchableCampaignDefinitionFilterInput.this.deliveredCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.deliveredCount.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.readCount.defined) {
                    inputFieldWriter.writeObject("readCount", SearchableCampaignDefinitionFilterInput.this.readCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.readCount.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.failedCount.defined) {
                    inputFieldWriter.writeObject("failedCount", SearchableCampaignDefinitionFilterInput.this.failedCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.failedCount.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.repliedCount.defined) {
                    inputFieldWriter.writeObject("repliedCount", SearchableCampaignDefinitionFilterInput.this.repliedCount.value != 0 ? ((SearchableIntFilterInput) SearchableCampaignDefinitionFilterInput.this.repliedCount.value).marshaller() : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableCampaignDefinitionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignDefinitionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignDefinitionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableCampaignDefinitionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableCampaignDefinitionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableCampaignDefinitionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableCampaignDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableCampaignDefinitionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableCampaignDefinitionFilterInput.this.not.value != 0 ? ((SearchableCampaignDefinitionFilterInput) SearchableCampaignDefinitionFilterInput.this.not.value).marshaller() : null);
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

    public SearchableCampaignDefinitionFilterInput not() {
        return this.not.value;
    }

    public List<SearchableCampaignDefinitionFilterInput> or() {
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

    public SearchableStringFilterInput startDateOfRun() {
        return this.startDateOfRun.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
