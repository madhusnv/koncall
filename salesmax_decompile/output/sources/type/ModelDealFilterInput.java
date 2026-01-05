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
public final class ModelDealFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelFloatInput> amount;
    private final Input<List<ModelDealFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdByUser;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> customDealData;
    private final Input<ModelStringInput> dealLostReason;
    private final Input<ModelDealOutcomeInput> dealOutcome;
    private final Input<ModelStringInput> dealStage;
    private final Input<ModelStringInput> dealStageUpdatedAt;
    private final Input<ModelDealStateInput> dealState;
    private final Input<ModelStringInput> description;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> lastActivity;
    private final Input<ModelIDInput> lastUpdatedByUser;
    private final Input<ModelStringInput> name;
    private final Input<ModelDealFilterInput> not;
    private final Input<ModelStringInput> openTaskDetail;
    private final Input<List<ModelDealFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> recentEngagements;
    private final Input<ModelStringInput> recentEngagementsUpdatedAt;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> transitionSummary;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> dealStage = Input.absent();
        private Input<ModelStringInput> dealStageUpdatedAt = Input.absent();
        private Input<ModelDealStateInput> dealState = Input.absent();
        private Input<ModelDealOutcomeInput> dealOutcome = Input.absent();
        private Input<ModelStringInput> dealLostReason = Input.absent();
        private Input<ModelFloatInput> amount = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelIDInput> createdByUser = Input.absent();
        private Input<ModelIDInput> lastUpdatedByUser = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelStringInput> openTaskDetail = Input.absent();
        private Input<ModelStringInput> transitionSummary = Input.absent();
        private Input<ModelStringInput> recentEngagements = Input.absent();
        private Input<ModelStringInput> recentEngagementsUpdatedAt = Input.absent();
        private Input<ModelStringInput> lastActivity = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelStringInput> customDealData = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDealFilterInput>> and = Input.absent();
        private Input<List<ModelDealFilterInput>> or = Input.absent();
        private Input<ModelDealFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder amount(ModelFloatInput modelFloatInput) {
            this.amount = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder and(List<ModelDealFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelDealFilterInput build() {
            return new ModelDealFilterInput(this.id, this.accountId, this.name, this.description, this.dealStage, this.dealStageUpdatedAt, this.dealState, this.dealOutcome, this.dealLostReason, this.amount, this.currency, this.createdByUser, this.lastUpdatedByUser, this.ownerId, this.primaryTeamId, this.openTaskDetail, this.transitionSummary, this.recentEngagements, this.recentEngagementsUpdatedAt, this.lastActivity, this.tags, this.customDealData, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdByUser(ModelIDInput modelIDInput) {
            this.createdByUser = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder customDealData(ModelStringInput modelStringInput) {
            this.customDealData = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealLostReason(ModelStringInput modelStringInput) {
            this.dealLostReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealOutcome(ModelDealOutcomeInput modelDealOutcomeInput) {
            this.dealOutcome = Input.fromNullable(modelDealOutcomeInput);
            return this;
        }

        public Builder dealStage(ModelStringInput modelStringInput) {
            this.dealStage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealStageUpdatedAt(ModelStringInput modelStringInput) {
            this.dealStageUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealState(ModelDealStateInput modelDealStateInput) {
            this.dealState = Input.fromNullable(modelDealStateInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastActivity(ModelStringInput modelStringInput) {
            this.lastActivity = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastUpdatedByUser(ModelIDInput modelIDInput) {
            this.lastUpdatedByUser = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelDealFilterInput modelDealFilterInput) {
            this.not = Input.fromNullable(modelDealFilterInput);
            return this;
        }

        public Builder openTaskDetail(ModelStringInput modelStringInput) {
            this.openTaskDetail = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelDealFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder recentEngagements(ModelStringInput modelStringInput) {
            this.recentEngagements = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recentEngagementsUpdatedAt(ModelStringInput modelStringInput) {
            this.recentEngagementsUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder transitionSummary(ModelStringInput modelStringInput) {
            this.transitionSummary = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelDealFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelDealStateInput> input7, Input<ModelDealOutcomeInput> input8, Input<ModelStringInput> input9, Input<ModelFloatInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<List<ModelDealFilterInput>> input25, Input<List<ModelDealFilterInput>> input26, Input<ModelDealFilterInput> input27) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.dealStage = input5;
        this.dealStageUpdatedAt = input6;
        this.dealState = input7;
        this.dealOutcome = input8;
        this.dealLostReason = input9;
        this.amount = input10;
        this.currency = input11;
        this.createdByUser = input12;
        this.lastUpdatedByUser = input13;
        this.ownerId = input14;
        this.primaryTeamId = input15;
        this.openTaskDetail = input16;
        this.transitionSummary = input17;
        this.recentEngagements = input18;
        this.recentEngagementsUpdatedAt = input19;
        this.lastActivity = input20;
        this.tags = input21;
        this.customDealData = input22;
        this.createdAt = input23;
        this.updatedAt = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelFloatInput amount() {
        return this.amount.value;
    }

    public List<ModelDealFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdByUser() {
        return this.createdByUser.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    public ModelStringInput customDealData() {
        return this.customDealData.value;
    }

    public ModelStringInput dealLostReason() {
        return this.dealLostReason.value;
    }

    public ModelDealOutcomeInput dealOutcome() {
        return this.dealOutcome.value;
    }

    public ModelStringInput dealStage() {
        return this.dealStage.value;
    }

    public ModelStringInput dealStageUpdatedAt() {
        return this.dealStageUpdatedAt.value;
    }

    public ModelDealStateInput dealState() {
        return this.dealState.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput lastActivity() {
        return this.lastActivity.value;
    }

    public ModelIDInput lastUpdatedByUser() {
        return this.lastUpdatedByUser.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelDealFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelDealFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDealFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDealFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelDealFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelDealFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", ModelDealFilterInput.this.dealStage.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.dealStage.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.dealStageUpdatedAt.defined) {
                    inputFieldWriter.writeObject("dealStageUpdatedAt", ModelDealFilterInput.this.dealStageUpdatedAt.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.dealStageUpdatedAt.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.dealState.defined) {
                    inputFieldWriter.writeObject("dealState", ModelDealFilterInput.this.dealState.value != 0 ? ((ModelDealStateInput) ModelDealFilterInput.this.dealState.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.dealOutcome.defined) {
                    inputFieldWriter.writeObject("dealOutcome", ModelDealFilterInput.this.dealOutcome.value != 0 ? ((ModelDealOutcomeInput) ModelDealFilterInput.this.dealOutcome.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.dealLostReason.defined) {
                    inputFieldWriter.writeObject("dealLostReason", ModelDealFilterInput.this.dealLostReason.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.dealLostReason.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelDealFilterInput.this.amount.value != 0 ? ((ModelFloatInput) ModelDealFilterInput.this.amount.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelDealFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.createdByUser.defined) {
                    inputFieldWriter.writeObject("createdByUser", ModelDealFilterInput.this.createdByUser.value != 0 ? ((ModelIDInput) ModelDealFilterInput.this.createdByUser.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.lastUpdatedByUser.defined) {
                    inputFieldWriter.writeObject("lastUpdatedByUser", ModelDealFilterInput.this.lastUpdatedByUser.value != 0 ? ((ModelIDInput) ModelDealFilterInput.this.lastUpdatedByUser.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelDealFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelDealFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelDealFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelDealFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.openTaskDetail.defined) {
                    inputFieldWriter.writeObject("openTaskDetail", ModelDealFilterInput.this.openTaskDetail.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.openTaskDetail.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.transitionSummary.defined) {
                    inputFieldWriter.writeObject("transitionSummary", ModelDealFilterInput.this.transitionSummary.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.transitionSummary.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.recentEngagements.defined) {
                    inputFieldWriter.writeObject("recentEngagements", ModelDealFilterInput.this.recentEngagements.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.recentEngagements.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.recentEngagementsUpdatedAt.defined) {
                    inputFieldWriter.writeObject("recentEngagementsUpdatedAt", ModelDealFilterInput.this.recentEngagementsUpdatedAt.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.recentEngagementsUpdatedAt.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.lastActivity.defined) {
                    inputFieldWriter.writeObject("lastActivity", ModelDealFilterInput.this.lastActivity.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.lastActivity.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelDealFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.customDealData.defined) {
                    inputFieldWriter.writeObject("customDealData", ModelDealFilterInput.this.customDealData.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.customDealData.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDealFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDealFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDealFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDealFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDealFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDealFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDealFilterInput.this.not.value != 0 ? ((ModelDealFilterInput) ModelDealFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelDealFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput openTaskDetail() {
        return this.openTaskDetail.value;
    }

    public List<ModelDealFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelStringInput recentEngagements() {
        return this.recentEngagements.value;
    }

    public ModelStringInput recentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelStringInput transitionSummary() {
        return this.transitionSummary.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
