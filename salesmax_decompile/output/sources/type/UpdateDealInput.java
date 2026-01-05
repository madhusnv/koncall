package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateDealInput implements InputType {
    private final Input<String> accountId;
    private final Input<Double> amount;
    private final Input<String> createdAt;
    private final Input<String> createdByUser;
    private final Input<String> currency;
    private final Input<String> customDealData;
    private final Input<String> dealLostReason;
    private final Input<DealOutcome> dealOutcome;
    private final Input<String> dealStage;
    private final Input<List<DealStageCustomValuesInput>> dealStageCustomValues;
    private final Input<String> dealStageUpdatedAt;
    private final Input<DealState> dealState;
    private final Input<String> description;
    private final String id;
    private final Input<String> lastActivity;
    private final Input<String> lastUpdatedByUser;
    private final Input<String> name;
    private final Input<String> openTaskDetail;
    private final Input<String> ownerId;
    private final Input<String> primaryTeamId;
    private final Input<List<String>> recentEngagements;
    private final Input<String> recentEngagementsUpdatedAt;
    private final Input<List<String>> tags;
    private final Input<List<String>> transitionSummary;
    private final Input<List<ProductServiceUnitInput>> units;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> dealStage = Input.absent();
        private Input<String> dealStageUpdatedAt = Input.absent();
        private Input<DealState> dealState = Input.absent();
        private Input<DealOutcome> dealOutcome = Input.absent();
        private Input<String> dealLostReason = Input.absent();
        private Input<Double> amount = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<List<ProductServiceUnitInput>> units = Input.absent();
        private Input<String> createdByUser = Input.absent();
        private Input<String> lastUpdatedByUser = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> openTaskDetail = Input.absent();
        private Input<List<String>> transitionSummary = Input.absent();
        private Input<List<String>> recentEngagements = Input.absent();
        private Input<String> recentEngagementsUpdatedAt = Input.absent();
        private Input<String> lastActivity = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<List<DealStageCustomValuesInput>> dealStageCustomValues = Input.absent();
        private Input<String> customDealData = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder amount(Double d) {
            this.amount = Input.fromNullable(d);
            return this;
        }

        public UpdateDealInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateDealInput(this.id, this.accountId, this.name, this.description, this.dealStage, this.dealStageUpdatedAt, this.dealState, this.dealOutcome, this.dealLostReason, this.amount, this.currency, this.units, this.createdByUser, this.lastUpdatedByUser, this.ownerId, this.primaryTeamId, this.openTaskDetail, this.transitionSummary, this.recentEngagements, this.recentEngagementsUpdatedAt, this.lastActivity, this.tags, this.dealStageCustomValues, this.customDealData, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdByUser(String str) {
            this.createdByUser = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder customDealData(String str) {
            this.customDealData = Input.fromNullable(str);
            return this;
        }

        public Builder dealLostReason(String str) {
            this.dealLostReason = Input.fromNullable(str);
            return this;
        }

        public Builder dealOutcome(DealOutcome dealOutcome) {
            this.dealOutcome = Input.fromNullable(dealOutcome);
            return this;
        }

        public Builder dealStage(String str) {
            this.dealStage = Input.fromNullable(str);
            return this;
        }

        public Builder dealStageCustomValues(List<DealStageCustomValuesInput> list) {
            this.dealStageCustomValues = Input.fromNullable(list);
            return this;
        }

        public Builder dealStageUpdatedAt(String str) {
            this.dealStageUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder dealState(DealState dealState) {
            this.dealState = Input.fromNullable(dealState);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder lastActivity(String str) {
            this.lastActivity = Input.fromNullable(str);
            return this;
        }

        public Builder lastUpdatedByUser(String str) {
            this.lastUpdatedByUser = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder openTaskDetail(String str) {
            this.openTaskDetail = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder recentEngagements(List<String> list) {
            this.recentEngagements = Input.fromNullable(list);
            return this;
        }

        public Builder recentEngagementsUpdatedAt(String str) {
            this.recentEngagementsUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder transitionSummary(List<String> list) {
            this.transitionSummary = Input.fromNullable(list);
            return this;
        }

        public Builder units(List<ProductServiceUnitInput> list) {
            this.units = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateDealInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<DealState> input6, Input<DealOutcome> input7, Input<String> input8, Input<Double> input9, Input<String> input10, Input<List<ProductServiceUnitInput>> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<List<String>> input17, Input<List<String>> input18, Input<String> input19, Input<String> input20, Input<List<String>> input21, Input<List<DealStageCustomValuesInput>> input22, Input<String> input23, Input<String> input24, Input<String> input25) {
        this.id = str;
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
        this.units = input11;
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
        this.dealStageCustomValues = input22;
        this.customDealData = input23;
        this.createdAt = input24;
        this.updatedAt = input25;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Double amount() {
        return this.amount.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdByUser() {
        return this.createdByUser.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public String customDealData() {
        return this.customDealData.value;
    }

    public String dealLostReason() {
        return this.dealLostReason.value;
    }

    public DealOutcome dealOutcome() {
        return this.dealOutcome.value;
    }

    public String dealStage() {
        return this.dealStage.value;
    }

    public List<DealStageCustomValuesInput> dealStageCustomValues() {
        return this.dealStageCustomValues.value;
    }

    public String dealStageUpdatedAt() {
        return this.dealStageUpdatedAt.value;
    }

    public DealState dealState() {
        return this.dealState.value;
    }

    public String description() {
        return this.description.value;
    }

    public String id() {
        return this.id;
    }

    public String lastActivity() {
        return this.lastActivity.value;
    }

    public String lastUpdatedByUser() {
        return this.lastUpdatedByUser.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateDealInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateDealInput.this.id);
                if (UpdateDealInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateDealInput.this.accountId.value);
                }
                if (UpdateDealInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateDealInput.this.name.value);
                }
                if (UpdateDealInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateDealInput.this.description.value);
                }
                if (UpdateDealInput.this.dealStage.defined) {
                    inputFieldWriter.writeString("dealStage", (String) UpdateDealInput.this.dealStage.value);
                }
                if (UpdateDealInput.this.dealStageUpdatedAt.defined) {
                    inputFieldWriter.writeString("dealStageUpdatedAt", (String) UpdateDealInput.this.dealStageUpdatedAt.value);
                }
                if (UpdateDealInput.this.dealState.defined) {
                    inputFieldWriter.writeString("dealState", UpdateDealInput.this.dealState.value != 0 ? ((DealState) UpdateDealInput.this.dealState.value).name() : null);
                }
                if (UpdateDealInput.this.dealOutcome.defined) {
                    inputFieldWriter.writeString("dealOutcome", UpdateDealInput.this.dealOutcome.value != 0 ? ((DealOutcome) UpdateDealInput.this.dealOutcome.value).name() : null);
                }
                if (UpdateDealInput.this.dealLostReason.defined) {
                    inputFieldWriter.writeString("dealLostReason", (String) UpdateDealInput.this.dealLostReason.value);
                }
                if (UpdateDealInput.this.amount.defined) {
                    inputFieldWriter.writeDouble("amount", (Double) UpdateDealInput.this.amount.value);
                }
                if (UpdateDealInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdateDealInput.this.currency.value);
                }
                if (UpdateDealInput.this.units.defined) {
                    inputFieldWriter.writeList("units", UpdateDealInput.this.units.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDealInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDealInput.this.units.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ProductServiceUnitInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateDealInput.this.createdByUser.defined) {
                    inputFieldWriter.writeString("createdByUser", (String) UpdateDealInput.this.createdByUser.value);
                }
                if (UpdateDealInput.this.lastUpdatedByUser.defined) {
                    inputFieldWriter.writeString("lastUpdatedByUser", (String) UpdateDealInput.this.lastUpdatedByUser.value);
                }
                if (UpdateDealInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateDealInput.this.ownerId.value);
                }
                if (UpdateDealInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateDealInput.this.primaryTeamId.value);
                }
                if (UpdateDealInput.this.openTaskDetail.defined) {
                    inputFieldWriter.writeString("openTaskDetail", (String) UpdateDealInput.this.openTaskDetail.value);
                }
                if (UpdateDealInput.this.transitionSummary.defined) {
                    inputFieldWriter.writeList("transitionSummary", UpdateDealInput.this.transitionSummary.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDealInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDealInput.this.transitionSummary.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateDealInput.this.recentEngagements.defined) {
                    inputFieldWriter.writeList("recentEngagements", UpdateDealInput.this.recentEngagements.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDealInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDealInput.this.recentEngagements.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateDealInput.this.recentEngagementsUpdatedAt.defined) {
                    inputFieldWriter.writeString("recentEngagementsUpdatedAt", (String) UpdateDealInput.this.recentEngagementsUpdatedAt.value);
                }
                if (UpdateDealInput.this.lastActivity.defined) {
                    inputFieldWriter.writeString("lastActivity", (String) UpdateDealInput.this.lastActivity.value);
                }
                if (UpdateDealInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", UpdateDealInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDealInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDealInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateDealInput.this.dealStageCustomValues.defined) {
                    inputFieldWriter.writeList("dealStageCustomValues", UpdateDealInput.this.dealStageCustomValues.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDealInput.1.5
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDealInput.this.dealStageCustomValues.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((DealStageCustomValuesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateDealInput.this.customDealData.defined) {
                    inputFieldWriter.writeString("customDealData", (String) UpdateDealInput.this.customDealData.value);
                }
                if (UpdateDealInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateDealInput.this.createdAt.value);
                }
                if (UpdateDealInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateDealInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String openTaskDetail() {
        return this.openTaskDetail.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public List<String> recentEngagements() {
        return this.recentEngagements.value;
    }

    public String recentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public List<String> transitionSummary() {
        return this.transitionSummary.value;
    }

    public List<ProductServiceUnitInput> units() {
        return this.units.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
