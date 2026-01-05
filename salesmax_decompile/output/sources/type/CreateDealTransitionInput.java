package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateDealTransitionInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final String dealId;
    private final Input<String> dealStage;
    private final Input<String> engagementId;
    private final Input<String> id;
    private final Input<Integer> numberOfDaysToMakeTransition;
    private final Input<String> previousDealStage;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String dealId;
        private Input<String> id = Input.absent();
        private Input<String> dealStage = Input.absent();
        private Input<String> previousDealStage = Input.absent();
        private Input<Integer> numberOfDaysToMakeTransition = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateDealTransitionInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.dealId, "dealId == null");
            return new CreateDealTransitionInput(this.id, this.accountId, this.dealId, this.dealStage, this.previousDealStage, this.numberOfDaysToMakeTransition, this.engagementId, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dealId(String str) {
            this.dealId = str;
            return this;
        }

        public Builder dealStage(String str) {
            this.dealStage = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder numberOfDaysToMakeTransition(Integer num) {
            this.numberOfDaysToMakeTransition = Input.fromNullable(num);
            return this;
        }

        public Builder previousDealStage(String str) {
            this.previousDealStage = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateDealTransitionInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<Integer> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = input;
        this.accountId = str;
        this.dealId = str2;
        this.dealStage = input2;
        this.previousDealStage = input3;
        this.numberOfDaysToMakeTransition = input4;
        this.engagementId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dealId() {
        return this.dealId;
    }

    public String dealStage() {
        return this.dealStage.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateDealTransitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateDealTransitionInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateDealTransitionInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateDealTransitionInput.this.accountId);
                inputFieldWriter.writeString("dealId", CreateDealTransitionInput.this.dealId);
                if (CreateDealTransitionInput.this.dealStage.defined) {
                    inputFieldWriter.writeString("dealStage", (String) CreateDealTransitionInput.this.dealStage.value);
                }
                if (CreateDealTransitionInput.this.previousDealStage.defined) {
                    inputFieldWriter.writeString("previousDealStage", (String) CreateDealTransitionInput.this.previousDealStage.value);
                }
                if (CreateDealTransitionInput.this.numberOfDaysToMakeTransition.defined) {
                    inputFieldWriter.writeInt("numberOfDaysToMakeTransition", (Integer) CreateDealTransitionInput.this.numberOfDaysToMakeTransition.value);
                }
                if (CreateDealTransitionInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) CreateDealTransitionInput.this.engagementId.value);
                }
                if (CreateDealTransitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateDealTransitionInput.this.createdAt.value);
                }
                if (CreateDealTransitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateDealTransitionInput.this.updatedAt.value);
                }
            }
        };
    }

    public Integer numberOfDaysToMakeTransition() {
        return this.numberOfDaysToMakeTransition.value;
    }

    public String previousDealStage() {
        return this.previousDealStage.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
