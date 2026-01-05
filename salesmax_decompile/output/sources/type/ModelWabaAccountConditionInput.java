package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaAccountConditionInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaAccountConditionInput>> and;
    private final Input<ModelFloatInput> blockedBalanceBroadcast;
    private final Input<ModelFloatInput> blockedBalanceOverall;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currentLimitCategory;
    private final Input<ModelIntInput> maxDailyConversationPerPhone;
    private final Input<ModelIntInput> maxPhoneNumbersPerBusiness;
    private final Input<ModelIntInput> maxPhoneNumbersPerWaba;
    private final Input<ModelWabaAccountConditionInput> not;
    private final Input<List<ModelWabaAccountConditionInput>> or;
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
        private Input<List<ModelWabaAccountConditionInput>> and = Input.absent();
        private Input<List<ModelWabaAccountConditionInput>> or = Input.absent();
        private Input<ModelWabaAccountConditionInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaAccountConditionInput> list) {
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

        public ModelWabaAccountConditionInput build() {
            return new ModelWabaAccountConditionInput(this.wabaAccountId, this.wabaAccountName, this.accessToken, this.accountId, this.remainingFreeTierConversationsOverall, this.remainingBalanceOverall, this.remainingBalanceBroadcast, this.blockedBalanceOverall, this.blockedBalanceBroadcast, this.promptForPaymentThreshold, this.createdAt, this.updatedAt, this.currentLimitCategory, this.maxDailyConversationPerPhone, this.maxPhoneNumbersPerBusiness, this.maxPhoneNumbersPerWaba, this.wabaBanState, this.wabaBanDate, this.wabaDecision, this.wabaDecisionTime, this.rejectionReason, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder not(ModelWabaAccountConditionInput modelWabaAccountConditionInput) {
            this.not = Input.fromNullable(modelWabaAccountConditionInput);
            return this;
        }

        public Builder or(List<ModelWabaAccountConditionInput> list) {
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

    public ModelWabaAccountConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIntInput> input5, Input<ModelFloatInput> input6, Input<ModelFloatInput> input7, Input<ModelFloatInput> input8, Input<ModelFloatInput> input9, Input<ModelFloatInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIntInput> input14, Input<ModelIntInput> input15, Input<ModelIntInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelIDInput> input22, Input<ModelIDInput> input23, Input<List<ModelWabaAccountConditionInput>> input24, Input<List<ModelWabaAccountConditionInput>> input25, Input<ModelWabaAccountConditionInput> input26) {
        this.wabaAccountId = input;
        this.wabaAccountName = input2;
        this.accessToken = input3;
        this.accountId = input4;
        this.remainingFreeTierConversationsOverall = input5;
        this.remainingBalanceOverall = input6;
        this.remainingBalanceBroadcast = input7;
        this.blockedBalanceOverall = input8;
        this.blockedBalanceBroadcast = input9;
        this.promptForPaymentThreshold = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.currentLimitCategory = input13;
        this.maxDailyConversationPerPhone = input14;
        this.maxPhoneNumbersPerBusiness = input15;
        this.maxPhoneNumbersPerWaba = input16;
        this.wabaBanState = input17;
        this.wabaBanDate = input18;
        this.wabaDecision = input19;
        this.wabaDecisionTime = input20;
        this.rejectionReason = input21;
        this.createdById = input22;
        this.updatedById = input23;
        this.and = input24;
        this.or = input25;
        this.not = input26;
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

    public List<ModelWabaAccountConditionInput> and() {
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaAccountConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaAccountConditionInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaAccountConditionInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaAccountConditionInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.wabaAccountName.defined) {
                    inputFieldWriter.writeObject("wabaAccountName", ModelWabaAccountConditionInput.this.wabaAccountName.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.wabaAccountName.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelWabaAccountConditionInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaAccountConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaAccountConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.remainingFreeTierConversationsOverall.defined) {
                    inputFieldWriter.writeObject("remainingFreeTierConversationsOverall", ModelWabaAccountConditionInput.this.remainingFreeTierConversationsOverall.value != 0 ? ((ModelIntInput) ModelWabaAccountConditionInput.this.remainingFreeTierConversationsOverall.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.remainingBalanceOverall.defined) {
                    inputFieldWriter.writeObject("remainingBalanceOverall", ModelWabaAccountConditionInput.this.remainingBalanceOverall.value != 0 ? ((ModelFloatInput) ModelWabaAccountConditionInput.this.remainingBalanceOverall.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.remainingBalanceBroadcast.defined) {
                    inputFieldWriter.writeObject("remainingBalanceBroadcast", ModelWabaAccountConditionInput.this.remainingBalanceBroadcast.value != 0 ? ((ModelFloatInput) ModelWabaAccountConditionInput.this.remainingBalanceBroadcast.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.blockedBalanceOverall.defined) {
                    inputFieldWriter.writeObject("blockedBalanceOverall", ModelWabaAccountConditionInput.this.blockedBalanceOverall.value != 0 ? ((ModelFloatInput) ModelWabaAccountConditionInput.this.blockedBalanceOverall.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.blockedBalanceBroadcast.defined) {
                    inputFieldWriter.writeObject("blockedBalanceBroadcast", ModelWabaAccountConditionInput.this.blockedBalanceBroadcast.value != 0 ? ((ModelFloatInput) ModelWabaAccountConditionInput.this.blockedBalanceBroadcast.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.promptForPaymentThreshold.defined) {
                    inputFieldWriter.writeObject("promptForPaymentThreshold", ModelWabaAccountConditionInput.this.promptForPaymentThreshold.value != 0 ? ((ModelFloatInput) ModelWabaAccountConditionInput.this.promptForPaymentThreshold.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaAccountConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaAccountConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeObject("currentLimitCategory", ModelWabaAccountConditionInput.this.currentLimitCategory.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.currentLimitCategory.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.maxDailyConversationPerPhone.defined) {
                    inputFieldWriter.writeObject("maxDailyConversationPerPhone", ModelWabaAccountConditionInput.this.maxDailyConversationPerPhone.value != 0 ? ((ModelIntInput) ModelWabaAccountConditionInput.this.maxDailyConversationPerPhone.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.maxPhoneNumbersPerBusiness.defined) {
                    inputFieldWriter.writeObject("maxPhoneNumbersPerBusiness", ModelWabaAccountConditionInput.this.maxPhoneNumbersPerBusiness.value != 0 ? ((ModelIntInput) ModelWabaAccountConditionInput.this.maxPhoneNumbersPerBusiness.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.maxPhoneNumbersPerWaba.defined) {
                    inputFieldWriter.writeObject("maxPhoneNumbersPerWaba", ModelWabaAccountConditionInput.this.maxPhoneNumbersPerWaba.value != 0 ? ((ModelIntInput) ModelWabaAccountConditionInput.this.maxPhoneNumbersPerWaba.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.wabaBanState.defined) {
                    inputFieldWriter.writeObject("wabaBanState", ModelWabaAccountConditionInput.this.wabaBanState.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.wabaBanState.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.wabaBanDate.defined) {
                    inputFieldWriter.writeObject("wabaBanDate", ModelWabaAccountConditionInput.this.wabaBanDate.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.wabaBanDate.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.wabaDecision.defined) {
                    inputFieldWriter.writeObject("wabaDecision", ModelWabaAccountConditionInput.this.wabaDecision.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.wabaDecision.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.wabaDecisionTime.defined) {
                    inputFieldWriter.writeObject("wabaDecisionTime", ModelWabaAccountConditionInput.this.wabaDecisionTime.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.wabaDecisionTime.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeObject("rejectionReason", ModelWabaAccountConditionInput.this.rejectionReason.value != 0 ? ((ModelStringInput) ModelWabaAccountConditionInput.this.rejectionReason.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaAccountConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaAccountConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaAccountConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaAccountConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaAccountConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaAccountConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaAccountConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaAccountConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaAccountConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaAccountConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaAccountConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaAccountConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaAccountConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaAccountConditionInput.this.not.value != 0 ? ((ModelWabaAccountConditionInput) ModelWabaAccountConditionInput.this.not.value).marshaller() : null);
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

    public ModelWabaAccountConditionInput not() {
        return this.not.value;
    }

    public List<ModelWabaAccountConditionInput> or() {
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
