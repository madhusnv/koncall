package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateWabaPhoneNumberInput implements InputType {
    private final Input<String> accessToken;
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> currentLimitCategory;
    private final Input<String> displayNameUpdate;
    private final Input<String> displayNameUpdateDateTime;
    private final Input<String> entityListId;
    private final Input<String> id;
    private final Input<String> internalName;
    private final Input<Boolean> isDefault;
    private final Input<String> name;
    private final String phoneNumber;
    private final String phoneNumberId;
    private final Input<String> phoneNumberQualityUpdate;
    private final Input<String> phoneNumberQualityUpdateTime;
    private final Input<String> qualityRating;
    private final Input<Integer> quota;
    private final Input<String> rejectionReason;
    private final Input<String> requestedDisplayName;
    private final Input<String> status;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final String wabaAccountId;
    private final Input<String> wabaNumberDecision;
    private final Input<String> wabaNumberDecisionTime;
    private final Input<String> welcomeMessage;

    public static final class Builder {
        private String accountId;
        private String phoneNumber;
        private String phoneNumberId;
        private String wabaAccountId;
        private Input<String> id = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public CreateWabaPhoneNumberInput build() {
            Utils.checkNotNull(this.wabaAccountId, "wabaAccountId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.phoneNumberId, "phoneNumberId == null");
            Utils.checkNotNull(this.phoneNumber, "phoneNumber == null");
            return new CreateWabaPhoneNumberInput(this.id, this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById);
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
            this.id = Input.fromNullable(str);
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
            this.phoneNumber = str;
            return this;
        }

        public Builder phoneNumberId(String str) {
            this.phoneNumberId = str;
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
            this.wabaAccountId = str;
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

    public CreateWabaPhoneNumberInput(Input<String> input, String str, String str2, String str3, String str4, Input<Boolean> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23) {
        this.id = input;
        this.wabaAccountId = str;
        this.accountId = str2;
        this.phoneNumberId = str3;
        this.phoneNumber = str4;
        this.isDefault = input2;
        this.accessToken = input3;
        this.name = input4;
        this.internalName = input5;
        this.quota = input6;
        this.currentLimitCategory = input7;
        this.status = input8;
        this.qualityRating = input9;
        this.entityListId = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.welcomeMessage = input13;
        this.requestedDisplayName = input14;
        this.displayNameUpdate = input15;
        this.displayNameUpdateDateTime = input16;
        this.wabaNumberDecision = input17;
        this.wabaNumberDecisionTime = input18;
        this.rejectionReason = input19;
        this.phoneNumberQualityUpdate = input20;
        this.phoneNumberQualityUpdateTime = input21;
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
        return this.id.value;
    }

    public String internalName() {
        return this.internalName.value;
    }

    public Boolean isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWabaPhoneNumberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateWabaPhoneNumberInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateWabaPhoneNumberInput.this.id.value);
                }
                inputFieldWriter.writeString("wabaAccountId", CreateWabaPhoneNumberInput.this.wabaAccountId);
                inputFieldWriter.writeString("accountId", CreateWabaPhoneNumberInput.this.accountId);
                inputFieldWriter.writeString("phoneNumberId", CreateWabaPhoneNumberInput.this.phoneNumberId);
                inputFieldWriter.writeString("phoneNumber", CreateWabaPhoneNumberInput.this.phoneNumber);
                if (CreateWabaPhoneNumberInput.this.isDefault.defined) {
                    inputFieldWriter.writeBoolean("isDefault", (Boolean) CreateWabaPhoneNumberInput.this.isDefault.value);
                }
                if (CreateWabaPhoneNumberInput.this.accessToken.defined) {
                    inputFieldWriter.writeString("accessToken", (String) CreateWabaPhoneNumberInput.this.accessToken.value);
                }
                if (CreateWabaPhoneNumberInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateWabaPhoneNumberInput.this.name.value);
                }
                if (CreateWabaPhoneNumberInput.this.internalName.defined) {
                    inputFieldWriter.writeString("internalName", (String) CreateWabaPhoneNumberInput.this.internalName.value);
                }
                if (CreateWabaPhoneNumberInput.this.quota.defined) {
                    inputFieldWriter.writeInt("quota", (Integer) CreateWabaPhoneNumberInput.this.quota.value);
                }
                if (CreateWabaPhoneNumberInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeString("currentLimitCategory", (String) CreateWabaPhoneNumberInput.this.currentLimitCategory.value);
                }
                if (CreateWabaPhoneNumberInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateWabaPhoneNumberInput.this.status.value);
                }
                if (CreateWabaPhoneNumberInput.this.qualityRating.defined) {
                    inputFieldWriter.writeString("qualityRating", (String) CreateWabaPhoneNumberInput.this.qualityRating.value);
                }
                if (CreateWabaPhoneNumberInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) CreateWabaPhoneNumberInput.this.entityListId.value);
                }
                if (CreateWabaPhoneNumberInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateWabaPhoneNumberInput.this.createdAt.value);
                }
                if (CreateWabaPhoneNumberInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateWabaPhoneNumberInput.this.updatedAt.value);
                }
                if (CreateWabaPhoneNumberInput.this.welcomeMessage.defined) {
                    inputFieldWriter.writeString("welcomeMessage", (String) CreateWabaPhoneNumberInput.this.welcomeMessage.value);
                }
                if (CreateWabaPhoneNumberInput.this.requestedDisplayName.defined) {
                    inputFieldWriter.writeString("requestedDisplayName", (String) CreateWabaPhoneNumberInput.this.requestedDisplayName.value);
                }
                if (CreateWabaPhoneNumberInput.this.displayNameUpdate.defined) {
                    inputFieldWriter.writeString("displayNameUpdate", (String) CreateWabaPhoneNumberInput.this.displayNameUpdate.value);
                }
                if (CreateWabaPhoneNumberInput.this.displayNameUpdateDateTime.defined) {
                    inputFieldWriter.writeString("displayNameUpdateDateTime", (String) CreateWabaPhoneNumberInput.this.displayNameUpdateDateTime.value);
                }
                if (CreateWabaPhoneNumberInput.this.wabaNumberDecision.defined) {
                    inputFieldWriter.writeString("wabaNumberDecision", (String) CreateWabaPhoneNumberInput.this.wabaNumberDecision.value);
                }
                if (CreateWabaPhoneNumberInput.this.wabaNumberDecisionTime.defined) {
                    inputFieldWriter.writeString("wabaNumberDecisionTime", (String) CreateWabaPhoneNumberInput.this.wabaNumberDecisionTime.value);
                }
                if (CreateWabaPhoneNumberInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeString("rejectionReason", (String) CreateWabaPhoneNumberInput.this.rejectionReason.value);
                }
                if (CreateWabaPhoneNumberInput.this.phoneNumberQualityUpdate.defined) {
                    inputFieldWriter.writeString("phoneNumberQualityUpdate", (String) CreateWabaPhoneNumberInput.this.phoneNumberQualityUpdate.value);
                }
                if (CreateWabaPhoneNumberInput.this.phoneNumberQualityUpdateTime.defined) {
                    inputFieldWriter.writeString("phoneNumberQualityUpdateTime", (String) CreateWabaPhoneNumberInput.this.phoneNumberQualityUpdateTime.value);
                }
                if (CreateWabaPhoneNumberInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateWabaPhoneNumberInput.this.createdById.value);
                }
                if (CreateWabaPhoneNumberInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateWabaPhoneNumberInput.this.updatedById.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String phoneNumber() {
        return this.phoneNumber;
    }

    public String phoneNumberId() {
        return this.phoneNumberId;
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
        return this.wabaAccountId;
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
