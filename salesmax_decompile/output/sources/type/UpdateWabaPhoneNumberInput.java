package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateWabaPhoneNumberInput implements InputType {
    private final Input<String> accessToken;
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currentLimitCategory;
    private final Input<String> displayNameUpdate;
    private final Input<String> displayNameUpdateDateTime;
    private final Input<String> entityListId;
    private final String id;
    private final Input<String> internalName;
    private final Input<Boolean> isDefault;
    private final Input<String> name;
    private final Input<String> phoneNumber;
    private final Input<String> phoneNumberId;
    private final Input<String> phoneNumberQualityUpdate;
    private final Input<String> phoneNumberQualityUpdateTime;
    private final Input<String> qualityRating;
    private final Input<Integer> quota;
    private final Input<String> rejectionReason;
    private final Input<String> requestedDisplayName;
    private final Input<String> status;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> wabaAccountId;
    private final Input<String> wabaNumberDecision;
    private final Input<String> wabaNumberDecisionTime;
    private final Input<String> welcomeMessage;

    public static final class Builder {
        private String id;
        private Input<String> wabaAccountId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> phoneNumberId = Input.absent();
        private Input<String> phoneNumber = Input.absent();
        private Input<Boolean> isDefault = Input.absent();
        private Input<String> accessToken = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> internalName = Input.absent();
        private Input<Integer> quota = Input.absent();
        private Input<String> currentLimitCategory = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> qualityRating = Input.absent();
        private Input<String> entityListId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> welcomeMessage = Input.absent();
        private Input<String> requestedDisplayName = Input.absent();
        private Input<String> displayNameUpdate = Input.absent();
        private Input<String> displayNameUpdateDateTime = Input.absent();
        private Input<String> wabaNumberDecision = Input.absent();
        private Input<String> wabaNumberDecisionTime = Input.absent();
        private Input<String> rejectionReason = Input.absent();
        private Input<String> phoneNumberQualityUpdate = Input.absent();
        private Input<String> phoneNumberQualityUpdateTime = Input.absent();
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

        public UpdateWabaPhoneNumberInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateWabaPhoneNumberInput(this.id, this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById);
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

        public Builder displayNameUpdate(String str) {
            this.displayNameUpdate = Input.fromNullable(str);
            return this;
        }

        public Builder displayNameUpdateDateTime(String str) {
            this.displayNameUpdateDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder entityListId(String str) {
            this.entityListId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder internalName(String str) {
            this.internalName = Input.fromNullable(str);
            return this;
        }

        public Builder isDefault(Boolean bool) {
            this.isDefault = Input.fromNullable(bool);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumber(String str) {
            this.phoneNumber = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberId(String str) {
            this.phoneNumberId = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberQualityUpdate(String str) {
            this.phoneNumberQualityUpdate = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumberQualityUpdateTime(String str) {
            this.phoneNumberQualityUpdateTime = Input.fromNullable(str);
            return this;
        }

        public Builder qualityRating(String str) {
            this.qualityRating = Input.fromNullable(str);
            return this;
        }

        public Builder quota(Integer num) {
            this.quota = Input.fromNullable(num);
            return this;
        }

        public Builder rejectionReason(String str) {
            this.rejectionReason = Input.fromNullable(str);
            return this;
        }

        public Builder requestedDisplayName(String str) {
            this.requestedDisplayName = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
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

        public Builder wabaNumberDecision(String str) {
            this.wabaNumberDecision = Input.fromNullable(str);
            return this;
        }

        public Builder wabaNumberDecisionTime(String str) {
            this.wabaNumberDecisionTime = Input.fromNullable(str);
            return this;
        }

        public Builder welcomeMessage(String str) {
            this.welcomeMessage = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateWabaPhoneNumberInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<Boolean> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<Integer> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<String> input26) {
        this.id = str;
        this.wabaAccountId = input;
        this.accountId = input2;
        this.phoneNumberId = input3;
        this.phoneNumber = input4;
        this.isDefault = input5;
        this.accessToken = input6;
        this.name = input7;
        this.internalName = input8;
        this.quota = input9;
        this.currentLimitCategory = input10;
        this.status = input11;
        this.qualityRating = input12;
        this.entityListId = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.welcomeMessage = input16;
        this.requestedDisplayName = input17;
        this.displayNameUpdate = input18;
        this.displayNameUpdateDateTime = input19;
        this.wabaNumberDecision = input20;
        this.wabaNumberDecisionTime = input21;
        this.rejectionReason = input22;
        this.phoneNumberQualityUpdate = input23;
        this.phoneNumberQualityUpdateTime = input24;
        this.createdById = input25;
        this.updatedById = input26;
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

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String currentLimitCategory() {
        return this.currentLimitCategory.value;
    }

    public String displayNameUpdate() {
        return this.displayNameUpdate.value;
    }

    public String displayNameUpdateDateTime() {
        return this.displayNameUpdateDateTime.value;
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    public String id() {
        return this.id;
    }

    public String internalName() {
        return this.internalName.value;
    }

    public Boolean isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateWabaPhoneNumberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateWabaPhoneNumberInput.this.id);
                if (UpdateWabaPhoneNumberInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeString("wabaAccountId", (String) UpdateWabaPhoneNumberInput.this.wabaAccountId.value);
                }
                if (UpdateWabaPhoneNumberInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateWabaPhoneNumberInput.this.accountId.value);
                }
                if (UpdateWabaPhoneNumberInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeString("phoneNumberId", (String) UpdateWabaPhoneNumberInput.this.phoneNumberId.value);
                }
                if (UpdateWabaPhoneNumberInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeString("phoneNumber", (String) UpdateWabaPhoneNumberInput.this.phoneNumber.value);
                }
                if (UpdateWabaPhoneNumberInput.this.isDefault.defined) {
                    inputFieldWriter.writeBoolean("isDefault", (Boolean) UpdateWabaPhoneNumberInput.this.isDefault.value);
                }
                if (UpdateWabaPhoneNumberInput.this.accessToken.defined) {
                    inputFieldWriter.writeString("accessToken", (String) UpdateWabaPhoneNumberInput.this.accessToken.value);
                }
                if (UpdateWabaPhoneNumberInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateWabaPhoneNumberInput.this.name.value);
                }
                if (UpdateWabaPhoneNumberInput.this.internalName.defined) {
                    inputFieldWriter.writeString("internalName", (String) UpdateWabaPhoneNumberInput.this.internalName.value);
                }
                if (UpdateWabaPhoneNumberInput.this.quota.defined) {
                    inputFieldWriter.writeInt("quota", (Integer) UpdateWabaPhoneNumberInput.this.quota.value);
                }
                if (UpdateWabaPhoneNumberInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeString("currentLimitCategory", (String) UpdateWabaPhoneNumberInput.this.currentLimitCategory.value);
                }
                if (UpdateWabaPhoneNumberInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateWabaPhoneNumberInput.this.status.value);
                }
                if (UpdateWabaPhoneNumberInput.this.qualityRating.defined) {
                    inputFieldWriter.writeString("qualityRating", (String) UpdateWabaPhoneNumberInput.this.qualityRating.value);
                }
                if (UpdateWabaPhoneNumberInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) UpdateWabaPhoneNumberInput.this.entityListId.value);
                }
                if (UpdateWabaPhoneNumberInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateWabaPhoneNumberInput.this.createdAt.value);
                }
                if (UpdateWabaPhoneNumberInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateWabaPhoneNumberInput.this.updatedAt.value);
                }
                if (UpdateWabaPhoneNumberInput.this.welcomeMessage.defined) {
                    inputFieldWriter.writeString("welcomeMessage", (String) UpdateWabaPhoneNumberInput.this.welcomeMessage.value);
                }
                if (UpdateWabaPhoneNumberInput.this.requestedDisplayName.defined) {
                    inputFieldWriter.writeString("requestedDisplayName", (String) UpdateWabaPhoneNumberInput.this.requestedDisplayName.value);
                }
                if (UpdateWabaPhoneNumberInput.this.displayNameUpdate.defined) {
                    inputFieldWriter.writeString("displayNameUpdate", (String) UpdateWabaPhoneNumberInput.this.displayNameUpdate.value);
                }
                if (UpdateWabaPhoneNumberInput.this.displayNameUpdateDateTime.defined) {
                    inputFieldWriter.writeString("displayNameUpdateDateTime", (String) UpdateWabaPhoneNumberInput.this.displayNameUpdateDateTime.value);
                }
                if (UpdateWabaPhoneNumberInput.this.wabaNumberDecision.defined) {
                    inputFieldWriter.writeString("wabaNumberDecision", (String) UpdateWabaPhoneNumberInput.this.wabaNumberDecision.value);
                }
                if (UpdateWabaPhoneNumberInput.this.wabaNumberDecisionTime.defined) {
                    inputFieldWriter.writeString("wabaNumberDecisionTime", (String) UpdateWabaPhoneNumberInput.this.wabaNumberDecisionTime.value);
                }
                if (UpdateWabaPhoneNumberInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeString("rejectionReason", (String) UpdateWabaPhoneNumberInput.this.rejectionReason.value);
                }
                if (UpdateWabaPhoneNumberInput.this.phoneNumberQualityUpdate.defined) {
                    inputFieldWriter.writeString("phoneNumberQualityUpdate", (String) UpdateWabaPhoneNumberInput.this.phoneNumberQualityUpdate.value);
                }
                if (UpdateWabaPhoneNumberInput.this.phoneNumberQualityUpdateTime.defined) {
                    inputFieldWriter.writeString("phoneNumberQualityUpdateTime", (String) UpdateWabaPhoneNumberInput.this.phoneNumberQualityUpdateTime.value);
                }
                if (UpdateWabaPhoneNumberInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateWabaPhoneNumberInput.this.createdById.value);
                }
                if (UpdateWabaPhoneNumberInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateWabaPhoneNumberInput.this.updatedById.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String phoneNumber() {
        return this.phoneNumber.value;
    }

    public String phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public String phoneNumberQualityUpdate() {
        return this.phoneNumberQualityUpdate.value;
    }

    public String phoneNumberQualityUpdateTime() {
        return this.phoneNumberQualityUpdateTime.value;
    }

    public String qualityRating() {
        return this.qualityRating.value;
    }

    public Integer quota() {
        return this.quota.value;
    }

    public String rejectionReason() {
        return this.rejectionReason.value;
    }

    public String requestedDisplayName() {
        return this.requestedDisplayName.value;
    }

    public String status() {
        return this.status.value;
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

    public String wabaNumberDecision() {
        return this.wabaNumberDecision.value;
    }

    public String wabaNumberDecisionTime() {
        return this.wabaNumberDecisionTime.value;
    }

    public String welcomeMessage() {
        return this.welcomeMessage.value;
    }
}
