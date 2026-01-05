package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateDealTransitionInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> dealId;
    private final Input<String> dealStage;
    private final Input<String> engagementId;
    private final String id;
    private final Input<Integer> numberOfDaysToMakeTransition;
    private final Input<String> previousDealStage;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> dealId = Input.absent();
        private Input<String> dealStage = Input.absent();
        private Input<String> previousDealStage = Input.absent();
        private Input<Integer> numberOfDaysToMakeTransition = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateDealTransitionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateDealTransitionInput(this.id, this.accountId, this.dealId, this.dealStage, this.previousDealStage, this.numberOfDaysToMakeTransition, this.engagementId, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dealId(String str) {
            this.dealId = Input.fromNullable(str);
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
            this.id = str;
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

    public UpdateDealTransitionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<Integer> input5, Input<String> input6, Input<String> input7, Input<String> input8) {
        this.id = str;
        this.accountId = input;
        this.dealId = input2;
        this.dealStage = input3;
        this.previousDealStage = input4;
        this.numberOfDaysToMakeTransition = input5;
        this.engagementId = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dealId() {
        return this.dealId.value;
    }

    public String dealStage() {
        return this.dealStage.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateDealTransitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateDealTransitionInput.this.id);
                if (UpdateDealTransitionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateDealTransitionInput.this.accountId.value);
                }
                if (UpdateDealTransitionInput.this.dealId.defined) {
                    inputFieldWriter.writeString("dealId", (String) UpdateDealTransitionInput.this.dealId.value);
                }
                if (UpdateDealTransitionInput.this.dealStage.defined) {
                    inputFieldWriter.writeString("dealStage", (String) UpdateDealTransitionInput.this.dealStage.value);
                }
                if (UpdateDealTransitionInput.this.previousDealStage.defined) {
                    inputFieldWriter.writeString("previousDealStage", (String) UpdateDealTransitionInput.this.previousDealStage.value);
                }
                if (UpdateDealTransitionInput.this.numberOfDaysToMakeTransition.defined) {
                    inputFieldWriter.writeInt("numberOfDaysToMakeTransition", (Integer) UpdateDealTransitionInput.this.numberOfDaysToMakeTransition.value);
                }
                if (UpdateDealTransitionInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdateDealTransitionInput.this.engagementId.value);
                }
                if (UpdateDealTransitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateDealTransitionInput.this.createdAt.value);
                }
                if (UpdateDealTransitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateDealTransitionInput.this.updatedAt.value);
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
