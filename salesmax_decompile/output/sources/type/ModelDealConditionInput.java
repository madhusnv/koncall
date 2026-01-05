package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDealConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelFloatInput> amount;
    private final Input<List<ModelDealConditionInput>> and;
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
    private final Input<ModelStringInput> lastActivity;
    private final Input<ModelIDInput> lastUpdatedByUser;
    private final Input<ModelStringInput> name;
    private final Input<ModelDealConditionInput> not;
    private final Input<ModelStringInput> openTaskDetail;
    private final Input<List<ModelDealConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> recentEngagements;
    private final Input<ModelStringInput> recentEngagementsUpdatedAt;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> transitionSummary;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelDealConditionInput>> and = Input.absent();
        private Input<List<ModelDealConditionInput>> or = Input.absent();
        private Input<ModelDealConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder amount(ModelFloatInput modelFloatInput) {
            this.amount = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder and(List<ModelDealConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelDealConditionInput build() {
            return new ModelDealConditionInput(this.accountId, this.name, this.description, this.dealStage, this.dealStageUpdatedAt, this.dealState, this.dealOutcome, this.dealLostReason, this.amount, this.currency, this.createdByUser, this.lastUpdatedByUser, this.ownerId, this.primaryTeamId, this.openTaskDetail, this.transitionSummary, this.recentEngagements, this.recentEngagementsUpdatedAt, this.lastActivity, this.tags, this.customDealData, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelDealConditionInput modelDealConditionInput) {
            this.not = Input.fromNullable(modelDealConditionInput);
            return this;
        }

        public Builder openTaskDetail(ModelStringInput modelStringInput) {
            this.openTaskDetail = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelDealConditionInput> list) {
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

    public ModelDealConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelDealStateInput> input6, Input<ModelDealOutcomeInput> input7, Input<ModelStringInput> input8, Input<ModelFloatInput> input9, Input<ModelStringInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<List<ModelDealConditionInput>> input24, Input<List<ModelDealConditionInput>> input25, Input<ModelDealConditionInput> input26) {
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.dealStage = input4;
        this.dealStageUpdatedAt = input5;
        this.dealState = input6;
        this.dealOutcome = input7;
        this.dealLostReason = input8;
        this.amount = input9;
        this.currency = input10;
        this.createdByUser = input11;
        this.lastUpdatedByUser = input12;
        this.ownerId = input13;
        this.primaryTeamId = input14;
        this.openTaskDetail = input15;
        this.transitionSummary = input16;
        this.recentEngagements = input17;
        this.recentEngagementsUpdatedAt = input18;
        this.lastActivity = input19;
        this.tags = input20;
        this.customDealData = input21;
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

    public ModelFloatInput amount() {
        return this.amount.value;
    }

    public List<ModelDealConditionInput> and() {
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

    public ModelStringInput lastActivity() {
        return this.lastActivity.value;
    }

    public ModelIDInput lastUpdatedByUser() {
        return this.lastUpdatedByUser.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDealConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDealConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelDealConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelDealConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.dealStage.defined) {
                    inputFieldWriter.writeObject("dealStage", ModelDealConditionInput.this.dealStage.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.dealStage.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.dealStageUpdatedAt.defined) {
                    inputFieldWriter.writeObject("dealStageUpdatedAt", ModelDealConditionInput.this.dealStageUpdatedAt.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.dealStageUpdatedAt.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.dealState.defined) {
                    inputFieldWriter.writeObject("dealState", ModelDealConditionInput.this.dealState.value != 0 ? ((ModelDealStateInput) ModelDealConditionInput.this.dealState.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.dealOutcome.defined) {
                    inputFieldWriter.writeObject("dealOutcome", ModelDealConditionInput.this.dealOutcome.value != 0 ? ((ModelDealOutcomeInput) ModelDealConditionInput.this.dealOutcome.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.dealLostReason.defined) {
                    inputFieldWriter.writeObject("dealLostReason", ModelDealConditionInput.this.dealLostReason.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.dealLostReason.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.amount.defined) {
                    inputFieldWriter.writeObject("amount", ModelDealConditionInput.this.amount.value != 0 ? ((ModelFloatInput) ModelDealConditionInput.this.amount.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelDealConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.createdByUser.defined) {
                    inputFieldWriter.writeObject("createdByUser", ModelDealConditionInput.this.createdByUser.value != 0 ? ((ModelIDInput) ModelDealConditionInput.this.createdByUser.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.lastUpdatedByUser.defined) {
                    inputFieldWriter.writeObject("lastUpdatedByUser", ModelDealConditionInput.this.lastUpdatedByUser.value != 0 ? ((ModelIDInput) ModelDealConditionInput.this.lastUpdatedByUser.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelDealConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelDealConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelDealConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelDealConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.openTaskDetail.defined) {
                    inputFieldWriter.writeObject("openTaskDetail", ModelDealConditionInput.this.openTaskDetail.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.openTaskDetail.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.transitionSummary.defined) {
                    inputFieldWriter.writeObject("transitionSummary", ModelDealConditionInput.this.transitionSummary.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.transitionSummary.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.recentEngagements.defined) {
                    inputFieldWriter.writeObject("recentEngagements", ModelDealConditionInput.this.recentEngagements.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.recentEngagements.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.recentEngagementsUpdatedAt.defined) {
                    inputFieldWriter.writeObject("recentEngagementsUpdatedAt", ModelDealConditionInput.this.recentEngagementsUpdatedAt.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.recentEngagementsUpdatedAt.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.lastActivity.defined) {
                    inputFieldWriter.writeObject("lastActivity", ModelDealConditionInput.this.lastActivity.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.lastActivity.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelDealConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.customDealData.defined) {
                    inputFieldWriter.writeObject("customDealData", ModelDealConditionInput.this.customDealData.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.customDealData.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDealConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDealConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDealConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDealConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDealConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDealConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDealConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDealConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDealConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDealConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDealConditionInput.this.not.value != 0 ? ((ModelDealConditionInput) ModelDealConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelDealConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput openTaskDetail() {
        return this.openTaskDetail.value;
    }

    public List<ModelDealConditionInput> or() {
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
