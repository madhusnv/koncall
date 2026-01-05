package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaAccountFilterInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaAccountFilterInput>> and;
    private final Input<ModelFloatInput> blockedBalanceBroadcast;
    private final Input<ModelFloatInput> blockedBalanceOverall;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currentLimitCategory;
    private final Input<ModelIDInput> id;
    private final Input<ModelIntInput> maxDailyConversationPerPhone;
    private final Input<ModelIntInput> maxPhoneNumbersPerBusiness;
    private final Input<ModelIntInput> maxPhoneNumbersPerWaba;
    private final Input<ModelWabaAccountFilterInput> not;
    private final Input<List<ModelWabaAccountFilterInput>> or;
    private final Input<ModelFloatInput> promptForPaymentThreshold;
    private final Input<ModelStringInput> rejectionReason;
    private final Input<ModelFloatInput> remainingBalanceBroadcast;
    private final Input<ModelFloatInput> remainingBalanceOverall;
    private final Input<ModelIntInput> remainingFreeTierConversationsOverall;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> wabaAccountId;
    private final Input<ModelStringInput> wabaAccountName;
    private final Input<ModelStringInput> wabaBanDate;
    private final Input<ModelStringInput> wabaBanState;
    private final Input<ModelStringInput> wabaDecision;
    private final Input<ModelStringInput> wabaDecisionTime;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> wabaAccountId = Input.absent();
        private Input<ModelStringInput> wabaAccountName = Input.absent();
        private Input<ModelStringInput> accessToken = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIntInput> remainingFreeTierConversationsOverall = Input.absent();
        private Input<ModelFloatInput> remainingBalanceOverall = Input.absent();
        private Input<ModelFloatInput> remainingBalanceBroadcast = Input.absent();
        private Input<ModelFloatInput> blockedBalanceOverall = Input.absent();
        private Input<ModelFloatInput> blockedBalanceBroadcast = Input.absent();
        private Input<ModelFloatInput> promptForPaymentThreshold = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> currentLimitCategory = Input.absent();
        private Input<ModelIntInput> maxDailyConversationPerPhone = Input.absent();
        private Input<ModelIntInput> maxPhoneNumbersPerBusiness = Input.absent();
        private Input<ModelIntInput> maxPhoneNumbersPerWaba = Input.absent();
        private Input<ModelStringInput> wabaBanState = Input.absent();
        private Input<ModelStringInput> wabaBanDate = Input.absent();
        private Input<ModelStringInput> wabaDecision = Input.absent();
        private Input<ModelStringInput> wabaDecisionTime = Input.absent();
        private Input<ModelStringInput> rejectionReason = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelWabaAccountFilterInput>> and = Input.absent();
        private Input<List<ModelWabaAccountFilterInput>> or = Input.absent();
        private Input<ModelWabaAccountFilterInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaAccountFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder blockedBalanceBroadcast(ModelFloatInput modelFloatInput) {
            this.blockedBalanceBroadcast = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder blockedBalanceOverall(ModelFloatInput modelFloatInput) {
            this.blockedBalanceOverall = Input.fromNullable(modelFloatInput);
            return this;
        }

        public ModelWabaAccountFilterInput build() {
            return new ModelWabaAccountFilterInput(this.id, this.wabaAccountId, this.wabaAccountName, this.accessToken, this.accountId, this.remainingFreeTierConversationsOverall, this.remainingBalanceOverall, this.remainingBalanceBroadcast, this.blockedBalanceOverall, this.blockedBalanceBroadcast, this.promptForPaymentThreshold, this.createdAt, this.updatedAt, this.currentLimitCategory, this.maxDailyConversationPerPhone, this.maxPhoneNumbersPerBusiness, this.maxPhoneNumbersPerWaba, this.wabaBanState, this.wabaBanDate, this.wabaDecision, this.wabaDecisionTime, this.rejectionReason, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder currentLimitCategory(ModelStringInput modelStringInput) {
            this.currentLimitCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder maxDailyConversationPerPhone(ModelIntInput modelIntInput) {
            this.maxDailyConversationPerPhone = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder maxPhoneNumbersPerBusiness(ModelIntInput modelIntInput) {
            this.maxPhoneNumbersPerBusiness = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder maxPhoneNumbersPerWaba(ModelIntInput modelIntInput) {
            this.maxPhoneNumbersPerWaba = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder not(ModelWabaAccountFilterInput modelWabaAccountFilterInput) {
            this.not = Input.fromNullable(modelWabaAccountFilterInput);
            return this;
        }

        public Builder or(List<ModelWabaAccountFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder promptForPaymentThreshold(ModelFloatInput modelFloatInput) {
            this.promptForPaymentThreshold = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder rejectionReason(ModelStringInput modelStringInput) {
            this.rejectionReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder remainingBalanceBroadcast(ModelFloatInput modelFloatInput) {
            this.remainingBalanceBroadcast = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder remainingBalanceOverall(ModelFloatInput modelFloatInput) {
            this.remainingBalanceOverall = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder remainingFreeTierConversationsOverall(ModelIntInput modelIntInput) {
            this.remainingFreeTierConversationsOverall = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder wabaAccountId(ModelIDInput modelIDInput) {
            this.wabaAccountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder wabaAccountName(ModelStringInput modelStringInput) {
            this.wabaAccountName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder wabaBanDate(ModelStringInput modelStringInput) {
            this.wabaBanDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder wabaBanState(ModelStringInput modelStringInput) {
            this.wabaBanState = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder wabaDecision(ModelStringInput modelStringInput) {
            this.wabaDecision = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder wabaDecisionTime(ModelStringInput modelStringInput) {
            this.wabaDecisionTime = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelWabaAccountFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIntInput> input6, Input<ModelFloatInput> input7, Input<ModelFloatInput> input8, Input<ModelFloatInput> input9, Input<ModelFloatInput> input10, Input<ModelFloatInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelIntInput> input15, Input<ModelIntInput> input16, Input<ModelIntInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelIDInput> input23, Input<ModelIDInput> input24, Input<List<ModelWabaAccountFilterInput>> input25, Input<List<ModelWabaAccountFilterInput>> input26, Input<ModelWabaAccountFilterInput> input27) {
        this.id = input;
        this.wabaAccountId = input2;
        this.wabaAccountName = input3;
        this.accessToken = input4;
        this.accountId = input5;
        this.remainingFreeTierConversationsOverall = input6;
        this.remainingBalanceOverall = input7;
        this.remainingBalanceBroadcast = input8;
        this.blockedBalanceOverall = input9;
        this.blockedBalanceBroadcast = input10;
        this.promptForPaymentThreshold = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.currentLimitCategory = input14;
        this.maxDailyConversationPerPhone = input15;
        this.maxPhoneNumbersPerBusiness = input16;
        this.maxPhoneNumbersPerWaba = input17;
        this.wabaBanState = input18;
        this.wabaBanDate = input19;
        this.wabaDecision = input20;
        this.wabaDecisionTime = input21;
        this.rejectionReason = input22;
        this.createdById = input23;
        this.updatedById = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput accessToken() {
        return this.accessToken.value;
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWabaAccountFilterInput> and() {
        return this.and.value;
    }

    public ModelFloatInput blockedBalanceBroadcast() {
        return this.blockedBalanceBroadcast.value;
    }

    public ModelFloatInput blockedBalanceOverall() {
        return this.blockedBalanceOverall.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput currentLimitCategory() {
        return this.currentLimitCategory.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaAccountFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelWabaAccountFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelWabaAccountFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaAccountFilterInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaAccountFilterInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.wabaAccountName.defined) {
                    inputFieldWriter.writeObject("wabaAccountName", ModelWabaAccountFilterInput.this.wabaAccountName.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.wabaAccountName.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelWabaAccountFilterInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaAccountFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaAccountFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.remainingFreeTierConversationsOverall.defined) {
                    inputFieldWriter.writeObject("remainingFreeTierConversationsOverall", ModelWabaAccountFilterInput.this.remainingFreeTierConversationsOverall.value != 0 ? ((ModelIntInput) ModelWabaAccountFilterInput.this.remainingFreeTierConversationsOverall.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.remainingBalanceOverall.defined) {
                    inputFieldWriter.writeObject("remainingBalanceOverall", ModelWabaAccountFilterInput.this.remainingBalanceOverall.value != 0 ? ((ModelFloatInput) ModelWabaAccountFilterInput.this.remainingBalanceOverall.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.remainingBalanceBroadcast.defined) {
                    inputFieldWriter.writeObject("remainingBalanceBroadcast", ModelWabaAccountFilterInput.this.remainingBalanceBroadcast.value != 0 ? ((ModelFloatInput) ModelWabaAccountFilterInput.this.remainingBalanceBroadcast.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.blockedBalanceOverall.defined) {
                    inputFieldWriter.writeObject("blockedBalanceOverall", ModelWabaAccountFilterInput.this.blockedBalanceOverall.value != 0 ? ((ModelFloatInput) ModelWabaAccountFilterInput.this.blockedBalanceOverall.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.blockedBalanceBroadcast.defined) {
                    inputFieldWriter.writeObject("blockedBalanceBroadcast", ModelWabaAccountFilterInput.this.blockedBalanceBroadcast.value != 0 ? ((ModelFloatInput) ModelWabaAccountFilterInput.this.blockedBalanceBroadcast.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.promptForPaymentThreshold.defined) {
                    inputFieldWriter.writeObject("promptForPaymentThreshold", ModelWabaAccountFilterInput.this.promptForPaymentThreshold.value != 0 ? ((ModelFloatInput) ModelWabaAccountFilterInput.this.promptForPaymentThreshold.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaAccountFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaAccountFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeObject("currentLimitCategory", ModelWabaAccountFilterInput.this.currentLimitCategory.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.currentLimitCategory.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.maxDailyConversationPerPhone.defined) {
                    inputFieldWriter.writeObject("maxDailyConversationPerPhone", ModelWabaAccountFilterInput.this.maxDailyConversationPerPhone.value != 0 ? ((ModelIntInput) ModelWabaAccountFilterInput.this.maxDailyConversationPerPhone.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.maxPhoneNumbersPerBusiness.defined) {
                    inputFieldWriter.writeObject("maxPhoneNumbersPerBusiness", ModelWabaAccountFilterInput.this.maxPhoneNumbersPerBusiness.value != 0 ? ((ModelIntInput) ModelWabaAccountFilterInput.this.maxPhoneNumbersPerBusiness.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.maxPhoneNumbersPerWaba.defined) {
                    inputFieldWriter.writeObject("maxPhoneNumbersPerWaba", ModelWabaAccountFilterInput.this.maxPhoneNumbersPerWaba.value != 0 ? ((ModelIntInput) ModelWabaAccountFilterInput.this.maxPhoneNumbersPerWaba.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.wabaBanState.defined) {
                    inputFieldWriter.writeObject("wabaBanState", ModelWabaAccountFilterInput.this.wabaBanState.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.wabaBanState.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.wabaBanDate.defined) {
                    inputFieldWriter.writeObject("wabaBanDate", ModelWabaAccountFilterInput.this.wabaBanDate.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.wabaBanDate.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.wabaDecision.defined) {
                    inputFieldWriter.writeObject("wabaDecision", ModelWabaAccountFilterInput.this.wabaDecision.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.wabaDecision.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.wabaDecisionTime.defined) {
                    inputFieldWriter.writeObject("wabaDecisionTime", ModelWabaAccountFilterInput.this.wabaDecisionTime.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.wabaDecisionTime.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeObject("rejectionReason", ModelWabaAccountFilterInput.this.rejectionReason.value != 0 ? ((ModelStringInput) ModelWabaAccountFilterInput.this.rejectionReason.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaAccountFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaAccountFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaAccountFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaAccountFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaAccountFilterInput.this.not.value != 0 ? ((ModelWabaAccountFilterInput) ModelWabaAccountFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIntInput maxDailyConversationPerPhone() {
        return this.maxDailyConversationPerPhone.value;
    }

    public ModelIntInput maxPhoneNumbersPerBusiness() {
        return this.maxPhoneNumbersPerBusiness.value;
    }

    public ModelIntInput maxPhoneNumbersPerWaba() {
        return this.maxPhoneNumbersPerWaba.value;
    }

    public ModelWabaAccountFilterInput not() {
        return this.not.value;
    }

    public List<ModelWabaAccountFilterInput> or() {
        return this.or.value;
    }

    public ModelFloatInput promptForPaymentThreshold() {
        return this.promptForPaymentThreshold.value;
    }

    public ModelStringInput rejectionReason() {
        return this.rejectionReason.value;
    }

    public ModelFloatInput remainingBalanceBroadcast() {
        return this.remainingBalanceBroadcast.value;
    }

    public ModelFloatInput remainingBalanceOverall() {
        return this.remainingBalanceOverall.value;
    }

    public ModelIntInput remainingFreeTierConversationsOverall() {
        return this.remainingFreeTierConversationsOverall.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelIDInput wabaAccountId() {
        return this.wabaAccountId.value;
    }

    public ModelStringInput wabaAccountName() {
        return this.wabaAccountName.value;
    }

    public ModelStringInput wabaBanDate() {
        return this.wabaBanDate.value;
    }

    public ModelStringInput wabaBanState() {
        return this.wabaBanState.value;
    }

    public ModelStringInput wabaDecision() {
        return this.wabaDecision.value;
    }

    public ModelStringInput wabaDecisionTime() {
        return this.wabaDecisionTime.value;
    }
}
