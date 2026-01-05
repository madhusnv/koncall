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
public final class CreateWabaAccountInput implements InputType {
    private final Input<String> accessToken;
    private final String accountId;
    private final Input<Double> blockedBalanceBroadcast;
    private final Input<Double> blockedBalanceOverall;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currentLimitCategory;
    private final Input<String> id;
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
    private final String wabaAccountId;
    private final Input<String> wabaAccountName;
    private final Input<String> wabaBanDate;
    private final Input<String> wabaBanState;
    private final Input<String> wabaDecision;
    private final Input<String> wabaDecisionTime;

    public static final class Builder {
        private String accountId;
        private String wabaAccountId;
        private Input<String> id = Input.absent();
        private Input<String> wabaAccountName = Input.absent();
        private Input<String> accessToken = Input.absent();
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
            this.accountId = str;
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

        public CreateWabaAccountInput build() {
            Utils.checkNotNull(this.wabaAccountId, "wabaAccountId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateWabaAccountInput(this.id, this.wabaAccountId, this.wabaAccountName, this.accessToken, this.accountId, this.remainingFreeTierConversationsOverall, this.remainingBalanceOverall, this.remainingBalanceBroadcast, this.blockedBalanceOverall, this.blockedBalanceBroadcast, this.promptForPaymentThreshold, this.createdAt, this.updatedAt, this.currentLimitCategory, this.maxDailyConversationPerPhone, this.maxPhoneNumbersPerBusiness, this.maxPhoneNumbersPerWaba, this.restrictionInfo, this.wabaBanState, this.wabaBanDate, this.wabaDecision, this.wabaDecisionTime, this.rejectionReason, this.createdById, this.updatedById);
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
            this.id = Input.fromNullable(str);
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
            this.wabaAccountId = str;
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

    public CreateWabaAccountInput(Input<String> input, String str, Input<String> input2, Input<String> input3, String str2, Input<Integer> input4, Input<Double> input5, Input<Double> input6, Input<Double> input7, Input<Double> input8, Input<Double> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<Integer> input13, Input<Integer> input14, Input<Integer> input15, Input<List<RestrictionInfoInput>> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23) {
        this.id = input;
        this.wabaAccountId = str;
        this.wabaAccountName = input2;
        this.accessToken = input3;
        this.accountId = str2;
        this.remainingFreeTierConversationsOverall = input4;
        this.remainingBalanceOverall = input5;
        this.remainingBalanceBroadcast = input6;
        this.blockedBalanceOverall = input7;
        this.blockedBalanceBroadcast = input8;
        this.promptForPaymentThreshold = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.currentLimitCategory = input12;
        this.maxDailyConversationPerPhone = input13;
        this.maxPhoneNumbersPerBusiness = input14;
        this.maxPhoneNumbersPerWaba = input15;
        this.restrictionInfo = input16;
        this.wabaBanState = input17;
        this.wabaBanDate = input18;
        this.wabaDecision = input19;
        this.wabaDecisionTime = input20;
        this.rejectionReason = input21;
        this.createdById = input22;
        this.updatedById = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accessToken() {
        return this.accessToken.value;
    }

    public String accountId() {
        return this.accountId;
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
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWabaAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateWabaAccountInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateWabaAccountInput.this.id.value);
                }
                inputFieldWriter.writeString("wabaAccountId", CreateWabaAccountInput.this.wabaAccountId);
                if (CreateWabaAccountInput.this.wabaAccountName.defined) {
                    inputFieldWriter.writeString("wabaAccountName", (String) CreateWabaAccountInput.this.wabaAccountName.value);
                }
                if (CreateWabaAccountInput.this.accessToken.defined) {
                    inputFieldWriter.writeString("accessToken", (String) CreateWabaAccountInput.this.accessToken.value);
                }
                inputFieldWriter.writeString("accountId", CreateWabaAccountInput.this.accountId);
                if (CreateWabaAccountInput.this.remainingFreeTierConversationsOverall.defined) {
                    inputFieldWriter.writeInt("remainingFreeTierConversationsOverall", (Integer) CreateWabaAccountInput.this.remainingFreeTierConversationsOverall.value);
                }
                if (CreateWabaAccountInput.this.remainingBalanceOverall.defined) {
                    inputFieldWriter.writeDouble("remainingBalanceOverall", (Double) CreateWabaAccountInput.this.remainingBalanceOverall.value);
                }
                if (CreateWabaAccountInput.this.remainingBalanceBroadcast.defined) {
                    inputFieldWriter.writeDouble("remainingBalanceBroadcast", (Double) CreateWabaAccountInput.this.remainingBalanceBroadcast.value);
                }
                if (CreateWabaAccountInput.this.blockedBalanceOverall.defined) {
                    inputFieldWriter.writeDouble("blockedBalanceOverall", (Double) CreateWabaAccountInput.this.blockedBalanceOverall.value);
                }
                if (CreateWabaAccountInput.this.blockedBalanceBroadcast.defined) {
                    inputFieldWriter.writeDouble("blockedBalanceBroadcast", (Double) CreateWabaAccountInput.this.blockedBalanceBroadcast.value);
                }
                if (CreateWabaAccountInput.this.promptForPaymentThreshold.defined) {
                    inputFieldWriter.writeDouble("promptForPaymentThreshold", (Double) CreateWabaAccountInput.this.promptForPaymentThreshold.value);
                }
                if (CreateWabaAccountInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateWabaAccountInput.this.createdAt.value);
                }
                if (CreateWabaAccountInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateWabaAccountInput.this.updatedAt.value);
                }
                if (CreateWabaAccountInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeString("currentLimitCategory", (String) CreateWabaAccountInput.this.currentLimitCategory.value);
                }
                if (CreateWabaAccountInput.this.maxDailyConversationPerPhone.defined) {
                    inputFieldWriter.writeInt("maxDailyConversationPerPhone", (Integer) CreateWabaAccountInput.this.maxDailyConversationPerPhone.value);
                }
                if (CreateWabaAccountInput.this.maxPhoneNumbersPerBusiness.defined) {
                    inputFieldWriter.writeInt("maxPhoneNumbersPerBusiness", (Integer) CreateWabaAccountInput.this.maxPhoneNumbersPerBusiness.value);
                }
                if (CreateWabaAccountInput.this.maxPhoneNumbersPerWaba.defined) {
                    inputFieldWriter.writeInt("maxPhoneNumbersPerWaba", (Integer) CreateWabaAccountInput.this.maxPhoneNumbersPerWaba.value);
                }
                if (CreateWabaAccountInput.this.restrictionInfo.defined) {
                    inputFieldWriter.writeList("restrictionInfo", CreateWabaAccountInput.this.restrictionInfo.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateWabaAccountInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateWabaAccountInput.this.restrictionInfo.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((RestrictionInfoInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateWabaAccountInput.this.wabaBanState.defined) {
                    inputFieldWriter.writeString("wabaBanState", (String) CreateWabaAccountInput.this.wabaBanState.value);
                }
                if (CreateWabaAccountInput.this.wabaBanDate.defined) {
                    inputFieldWriter.writeString("wabaBanDate", (String) CreateWabaAccountInput.this.wabaBanDate.value);
                }
                if (CreateWabaAccountInput.this.wabaDecision.defined) {
                    inputFieldWriter.writeString("wabaDecision", (String) CreateWabaAccountInput.this.wabaDecision.value);
                }
                if (CreateWabaAccountInput.this.wabaDecisionTime.defined) {
                    inputFieldWriter.writeString("wabaDecisionTime", (String) CreateWabaAccountInput.this.wabaDecisionTime.value);
                }
                if (CreateWabaAccountInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeString("rejectionReason", (String) CreateWabaAccountInput.this.rejectionReason.value);
                }
                if (CreateWabaAccountInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateWabaAccountInput.this.createdById.value);
                }
                if (CreateWabaAccountInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateWabaAccountInput.this.updatedById.value);
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
        return this.wabaAccountId;
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
