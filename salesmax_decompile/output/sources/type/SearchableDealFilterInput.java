package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableDealFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableFloatFilterInput> amount;
    private final Input<List<SearchableDealFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdByUser;
    private final Input<SearchableStringFilterInput> currency;
    private final Input<SearchableStringFilterInput> dealLostReason;
    private final Input<SearchableStringFilterInput> dealOutcome;
    private final Input<SearchableStringFilterInput> dealStage;
    private final Input<SearchableStringFilterInput> dealStageUpdatedAt;
    private final Input<SearchableStringFilterInput> dealState;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> lastActivity;
    private final Input<SearchableIDFilterInput> lastUpdatedByUser;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableDealFilterInput> not;
    private final Input<List<SearchableDealFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableStringFilterInput> recentEngagementsUpdatedAt;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableStringFilterInput> dealStage = Input.absent();
        private Input<SearchableStringFilterInput> dealStageUpdatedAt = Input.absent();
        private Input<SearchableStringFilterInput> dealState = Input.absent();
        private Input<SearchableStringFilterInput> dealOutcome = Input.absent();
        private Input<SearchableFloatFilterInput> amount = Input.absent();
        private Input<SearchableStringFilterInput> currency = Input.absent();
        private Input<SearchableIDFilterInput> createdByUser = Input.absent();
        private Input<SearchableIDFilterInput> lastUpdatedByUser = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableStringFilterInput> recentEngagementsUpdatedAt = Input.absent();
        private Input<SearchableStringFilterInput> lastActivity = Input.absent();
        private Input<SearchableStringFilterInput> dealLostReason = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableDealFilterInput>> and = Input.absent();
        private Input<List<SearchableDealFilterInput>> or = Input.absent();
        private Input<SearchableDealFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder amount(SearchableFloatFilterInput searchableFloatFilterInput) {
            this.amount = Input.fromNullable(searchableFloatFilterInput);
            return this;
        }

        public Builder and(List<SearchableDealFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableDealFilterInput build() {
            return new SearchableDealFilterInput(this.id, this.accountId, this.name, this.description, this.dealStage, this.dealStageUpdatedAt, this.dealState, this.dealOutcome, this.amount, this.currency, this.createdByUser, this.lastUpdatedByUser, this.ownerId, this.primaryTeamId, this.tags, this.recentEngagementsUpdatedAt, this.lastActivity, this.dealLostReason, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdByUser(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdByUser = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder currency(SearchableStringFilterInput searchableStringFilterInput) {
            this.currency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealLostReason(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealLostReason = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealStage(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealStage = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealStageUpdatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealStageUpdatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealState(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealState = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastActivity(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastActivity = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastUpdatedByUser(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastUpdatedByUser = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableDealFilterInput searchableDealFilterInput) {
            this.not = Input.fromNullable(searchableDealFilterInput);
            return this;
        }

        public Builder or(List<SearchableDealFilterInput> list) {
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

        public Builder recentEngagementsUpdatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.recentEngagementsUpdatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableDealFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableFloatFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableIDFilterInput> input13, Input<SearchableIDFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<List<SearchableDealFilterInput>> input21, Input<List<SearchableDealFilterInput>> input22, Input<SearchableDealFilterInput> input23) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.dealStage = input5;
        this.dealStageUpdatedAt = input6;
        this.dealState = input7;
        this.dealOutcome = input8;
        this.amount = input9;
        this.currency = input10;
        this.createdByUser = input11;
        this.lastUpdatedByUser = input12;
        this.ownerId = input13;
        this.primaryTeamId = input14;
        this.tags = input15;
        this.recentEngagementsUpdatedAt = input16;
        this.lastActivity = input17;
        this.dealLostReason = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.and = input21;
        this.or = input22;
        this.not = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableFloatFilterInput amount() {
        return this.amount.value;
    }

    public List<SearchableDealFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdByUser() {
        return this.createdByUser.value;
    }

    public SearchableStringFilterInput currency() {
        return this.currency.value;
    }

    public SearchableStringFilterInput dealLostReason() {
        return this.dealLostReason.value;
    }

    public SearchableStringFilterInput dealOutcome() {
        return this.dealOutcome.value;
    }

    public SearchableStringFilterInput dealStage() {
        return this.dealStage.value;
    }

    public SearchableStringFilterInput dealStageUpdatedAt() {
        return this.dealStageUpdatedAt.value;
    }

    public SearchableStringFilterInput dealState() {
        return this.dealState.value;
    }

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput lastActivity() {
        return this.lastActivity.value;
    }

    public SearchableIDFilterInput lastUpdatedByUser() {
        return this.lastUpdatedByUser.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableDealFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableDealFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableDealFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableDealFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableDealFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableDealFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableDealFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableDealFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", SearchableDealFilterInput.this.dealStage.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.dealStage.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.dealStageUpdatedAt.defined) {
                    inputFieldWriter.writeObject("dealStageUpdatedAt", SearchableDealFilterInput.this.dealStageUpdatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.dealStageUpdatedAt.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.dealState.defined) {
                    inputFieldWriter.writeObject("dealState", SearchableDealFilterInput.this.dealState.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.dealState.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.dealOutcome.defined) {
                    inputFieldWriter.writeObject("dealOutcome", SearchableDealFilterInput.this.dealOutcome.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.dealOutcome.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", SearchableDealFilterInput.this.amount.value != 0 ? ((SearchableFloatFilterInput) SearchableDealFilterInput.this.amount.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, SearchableDealFilterInput.this.currency.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.currency.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.createdByUser.defined) {
                    inputFieldWriter.writeObject("createdByUser", SearchableDealFilterInput.this.createdByUser.value != 0 ? ((SearchableIDFilterInput) SearchableDealFilterInput.this.createdByUser.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.lastUpdatedByUser.defined) {
                    inputFieldWriter.writeObject("lastUpdatedByUser", SearchableDealFilterInput.this.lastUpdatedByUser.value != 0 ? ((SearchableIDFilterInput) SearchableDealFilterInput.this.lastUpdatedByUser.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableDealFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableDealFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableDealFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableDealFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableDealFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.recentEngagementsUpdatedAt.defined) {
                    inputFieldWriter.writeObject("recentEngagementsUpdatedAt", SearchableDealFilterInput.this.recentEngagementsUpdatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.recentEngagementsUpdatedAt.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.lastActivity.defined) {
                    inputFieldWriter.writeObject("lastActivity", SearchableDealFilterInput.this.lastActivity.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.lastActivity.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.dealLostReason.defined) {
                    inputFieldWriter.writeObject("dealLostReason", SearchableDealFilterInput.this.dealLostReason.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.dealLostReason.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableDealFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableDealFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableDealFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableDealFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableDealFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableDealFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableDealFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableDealFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableDealFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableDealFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableDealFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableDealFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableDealFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableDealFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableDealFilterInput.this.not.value != 0 ? ((SearchableDealFilterInput) SearchableDealFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableDealFilterInput not() {
        return this.not.value;
    }

    public List<SearchableDealFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableStringFilterInput recentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
