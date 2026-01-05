package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateWabaAccountInput implements InputType {
    private final Input<String> accessToken;
    private final Input<String> accountId;
    private final Input<Double> blockedBalanceBroadcast;
    private final Input<Double> blockedBalanceOverall;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currentLimitCategory;
    private final String id;
    private final Input<Integer> maxDailyConversationPerPhone;
    private final Input<Integer> maxPhoneNumbersPerBusiness;
    private final Input<Integer> maxPhoneNumbersPerWaba;
    private final Input<Double> promptForPaymentThreshold;
    private final Input<String> rejectionReason;
    private final Input<Double> remainingBalanceBroadcast;
    private final Input<Double> remainingBalanceOverall;
    private final Input<Integer> remainingFreeTierConversationsOverall;
    private final Input<List<RestrictionInfoInput>> restrictionInfo;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> wabaAccountId;
    private final Input<String> wabaAccountName;
    private final Input<String> wabaBanDate;
    private final Input<String> wabaBanState;
    private final Input<String> wabaDecision;
    private final Input<String> wabaDecisionTime;

    public static final class Builder {
        private String id;
        private Input<String> wabaAccountId = Input.absent();
        private Input<String> wabaAccountName = Input.absent();
        private Input<String> accessToken = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<Integer> remainingFreeTierConversationsOverall = Input.absent();
        private Input<Double> remainingBalanceOverall = Input.absent();
        private Input<Double> remainingBalanceBroadcast = Input.absent();
        private Input<Double> blockedBalanceOverall = Input.absent();
        private Input<Double> blockedBalanceBroadcast = Input.absent();
        private Input<Double> promptForPaymentThreshold = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> currentLimitCategory = Input.absent();
        private Input<Integer> maxDailyConversationPerPhone = Input.absent();
        private Input<Integer> maxPhoneNumbersPerBusiness = Input.absent();
        private Input<Integer> maxPhoneNumbersPerWaba = Input.absent();
        private Input<List<RestrictionInfoInput>> restrictionInfo = Input.absent();
        private Input<String> wabaBanState = Input.absent();
        private Input<String> wabaBanDate = Input.absent();
        private Input<String> wabaDecision = Input.absent();
        private Input<String> wabaDecisionTime = Input.absent();
        private Input<String> rejectionReason = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accessToken(String str) {
            this.accessToken = Input.fromNullable(str);
            return this;
        }

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder blockedBalanceBroadcast(Double d) {
            this.blockedBalanceBroadcast = Input.fromNullable(d);
            return this;
        }

        public Builder blockedBalanceOverall(Double d) {
            this.blockedBalanceOverall = Input.fromNullable(d);
            return this;
        }

        public UpdateWabaAccountInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateWabaAccountInput(this.id, this.wabaAccountId, this.wabaAccountName, this.accessToken, this.accountId, this.remainingFreeTierConversationsOverall, this.remainingBalanceOverall, this.remainingBalanceBroadcast, this.blockedBalanceOverall, this.blockedBalanceBroadcast, this.promptForPaymentThreshold, this.createdAt, this.updatedAt, this.currentLimitCategory, this.maxDailyConversationPerPhone, this.maxPhoneNumbersPerBusiness, this.maxPhoneNumbersPerWaba, this.restrictionInfo, this.wabaBanState, this.wabaBanDate, this.wabaDecision, this.wabaDecisionTime, this.rejectionReason, this.createdById, this.updatedById);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder currentLimitCategory(String str) {
            this.currentLimitCategory = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder maxDailyConversationPerPhone(Integer num) {
            this.maxDailyConversationPerPhone = Input.fromNullable(num);
            return this;
        }

        public Builder maxPhoneNumbersPerBusiness(Integer num) {
            this.maxPhoneNumbersPerBusiness = Input.fromNullable(num);
            return this;
        }

        public Builder maxPhoneNumbersPerWaba(Integer num) {
            this.maxPhoneNumbersPerWaba = Input.fromNullable(num);
            return this;
        }

        public Builder promptForPaymentThreshold(Double d) {
            this.promptForPaymentThreshold = Input.fromNullable(d);
            return this;
        }

        public Builder rejectionReason(String str) {
            this.rejectionReason = Input.fromNullable(str);
            return this;
        }

        public Builder remainingBalanceBroadcast(Double d) {
            this.remainingBalanceBroadcast = Input.fromNullable(d);
            return this;
        }

        public Builder remainingBalanceOverall(Double d) {
            this.remainingBalanceOverall = Input.fromNullable(d);
            return this;
        }

        public Builder remainingFreeTierConversationsOverall(Integer num) {
            this.remainingFreeTierConversationsOverall = Input.fromNullable(num);
            return this;
        }

        public Builder restrictionInfo(List<RestrictionInfoInput> list) {
            this.restrictionInfo = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder wabaAccountId(String str) {
            this.wabaAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder wabaAccountName(String str) {
            this.wabaAccountName = Input.fromNullable(str);
            return this;
        }

        public Builder wabaBanDate(String str) {
            this.wabaBanDate = Input.fromNullable(str);
            return this;
        }

        public Builder wabaBanState(String str) {
            this.wabaBanState = Input.fromNullable(str);
            return this;
        }

        public Builder wabaDecision(String str) {
            this.wabaDecision = Input.fromNullable(str);
            return this;
        }

        public Builder wabaDecisionTime(String str) {
            this.wabaDecisionTime = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateWabaAccountInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<Integer> input5, Input<Double> input6, Input<Double> input7, Input<Double> input8, Input<Double> input9, Input<Double> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<Integer> input14, Input<Integer> input15, Input<Integer> input16, Input<List<RestrictionInfoInput>> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24) {
        this.id = str;
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
        this.restrictionInfo = input17;
        this.wabaBanState = input18;
        this.wabaBanDate = input19;
        this.wabaDecision = input20;
        this.wabaDecisionTime = input21;
        this.rejectionReason = input22;
        this.createdById = input23;
        this.updatedById = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accessToken() {
        return this.accessToken.value;
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Double blockedBalanceBroadcast() {
        return this.blockedBalanceBroadcast.value;
    }

    public Double blockedBalanceOverall() {
        return this.blockedBalanceOverall.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String currentLimitCategory() {
        return this.currentLimitCategory.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateWabaAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateWabaAccountInput.this.id);
                if (UpdateWabaAccountInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeString("wabaAccountId", (String) UpdateWabaAccountInput.this.wabaAccountId.value);
                }
                if (UpdateWabaAccountInput.this.wabaAccountName.defined) {
                    inputFieldWriter.writeString("wabaAccountName", (String) UpdateWabaAccountInput.this.wabaAccountName.value);
                }
                if (UpdateWabaAccountInput.this.accessToken.defined) {
                    inputFieldWriter.writeString("accessToken", (String) UpdateWabaAccountInput.this.accessToken.value);
                }
                if (UpdateWabaAccountInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateWabaAccountInput.this.accountId.value);
                }
                if (UpdateWabaAccountInput.this.remainingFreeTierConversationsOverall.defined) {
                    inputFieldWriter.writeInt("remainingFreeTierConversationsOverall", (Integer) UpdateWabaAccountInput.this.remainingFreeTierConversationsOverall.value);
                }
                if (UpdateWabaAccountInput.this.remainingBalanceOverall.defined) {
                    inputFieldWriter.writeDouble("remainingBalanceOverall", (Double) UpdateWabaAccountInput.this.remainingBalanceOverall.value);
                }
                if (UpdateWabaAccountInput.this.remainingBalanceBroadcast.defined) {
                    inputFieldWriter.writeDouble("remainingBalanceBroadcast", (Double) UpdateWabaAccountInput.this.remainingBalanceBroadcast.value);
                }
                if (UpdateWabaAccountInput.this.blockedBalanceOverall.defined) {
                    inputFieldWriter.writeDouble("blockedBalanceOverall", (Double) UpdateWabaAccountInput.this.blockedBalanceOverall.value);
                }
                if (UpdateWabaAccountInput.this.blockedBalanceBroadcast.defined) {
                    inputFieldWriter.writeDouble("blockedBalanceBroadcast", (Double) UpdateWabaAccountInput.this.blockedBalanceBroadcast.value);
                }
                if (UpdateWabaAccountInput.this.promptForPaymentThreshold.defined) {
                    inputFieldWriter.writeDouble("promptForPaymentThreshold", (Double) UpdateWabaAccountInput.this.promptForPaymentThreshold.value);
                }
                if (UpdateWabaAccountInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateWabaAccountInput.this.createdAt.value);
                }
                if (UpdateWabaAccountInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateWabaAccountInput.this.updatedAt.value);
                }
                if (UpdateWabaAccountInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeString("currentLimitCategory", (String) UpdateWabaAccountInput.this.currentLimitCategory.value);
                }
                if (UpdateWabaAccountInput.this.maxDailyConversationPerPhone.defined) {
                    inputFieldWriter.writeInt("maxDailyConversationPerPhone", (Integer) UpdateWabaAccountInput.this.maxDailyConversationPerPhone.value);
                }
                if (UpdateWabaAccountInput.this.maxPhoneNumbersPerBusiness.defined) {
                    inputFieldWriter.writeInt("maxPhoneNumbersPerBusiness", (Integer) UpdateWabaAccountInput.this.maxPhoneNumbersPerBusiness.value);
                }
                if (UpdateWabaAccountInput.this.maxPhoneNumbersPerWaba.defined) {
                    inputFieldWriter.writeInt("maxPhoneNumbersPerWaba", (Integer) UpdateWabaAccountInput.this.maxPhoneNumbersPerWaba.value);
                }
                if (UpdateWabaAccountInput.this.restrictionInfo.defined) {
                    inputFieldWriter.writeList("restrictionInfo", UpdateWabaAccountInput.this.restrictionInfo.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateWabaAccountInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateWabaAccountInput.this.restrictionInfo.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((RestrictionInfoInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateWabaAccountInput.this.wabaBanState.defined) {
                    inputFieldWriter.writeString("wabaBanState", (String) UpdateWabaAccountInput.this.wabaBanState.value);
                }
                if (UpdateWabaAccountInput.this.wabaBanDate.defined) {
                    inputFieldWriter.writeString("wabaBanDate", (String) UpdateWabaAccountInput.this.wabaBanDate.value);
                }
                if (UpdateWabaAccountInput.this.wabaDecision.defined) {
                    inputFieldWriter.writeString("wabaDecision", (String) UpdateWabaAccountInput.this.wabaDecision.value);
                }
                if (UpdateWabaAccountInput.this.wabaDecisionTime.defined) {
                    inputFieldWriter.writeString("wabaDecisionTime", (String) UpdateWabaAccountInput.this.wabaDecisionTime.value);
                }
                if (UpdateWabaAccountInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeString("rejectionReason", (String) UpdateWabaAccountInput.this.rejectionReason.value);
                }
                if (UpdateWabaAccountInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateWabaAccountInput.this.createdById.value);
                }
                if (UpdateWabaAccountInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateWabaAccountInput.this.updatedById.value);
                }
            }
        };
    }

    public Integer maxDailyConversationPerPhone() {
        return this.maxDailyConversationPerPhone.value;
    }

    public Integer maxPhoneNumbersPerBusiness() {
        return this.maxPhoneNumbersPerBusiness.value;
    }

    public Integer maxPhoneNumbersPerWaba() {
        return this.maxPhoneNumbersPerWaba.value;
    }

    public Double promptForPaymentThreshold() {
        return this.promptForPaymentThreshold.value;
    }

    public String rejectionReason() {
        return this.rejectionReason.value;
    }

    public Double remainingBalanceBroadcast() {
        return this.remainingBalanceBroadcast.value;
    }

    public Double remainingBalanceOverall() {
        return this.remainingBalanceOverall.value;
    }

    public Integer remainingFreeTierConversationsOverall() {
        return this.remainingFreeTierConversationsOverall.value;
    }

    public List<RestrictionInfoInput> restrictionInfo() {
        return this.restrictionInfo.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String wabaAccountId() {
        return this.wabaAccountId.value;
    }

    public String wabaAccountName() {
        return this.wabaAccountName.value;
    }

    public String wabaBanDate() {
        return this.wabaBanDate.value;
    }

    public String wabaBanState() {
        return this.wabaBanState.value;
    }

    public String wabaDecision() {
        return this.wabaDecision.value;
    }

    public String wabaDecisionTime() {
        return this.wabaDecisionTime.value;
    }
}
