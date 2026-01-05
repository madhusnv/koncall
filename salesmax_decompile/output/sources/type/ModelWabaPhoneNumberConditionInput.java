package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaPhoneNumberConditionInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaPhoneNumberConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currentLimitCategory;
    private final Input<ModelStringInput> displayNameUpdate;
    private final Input<ModelStringInput> displayNameUpdateDateTime;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelStringInput> internalName;
    private final Input<ModelBooleanInput> isDefault;
    private final Input<ModelStringInput> name;
    private final Input<ModelWabaPhoneNumberConditionInput> not;
    private final Input<List<ModelWabaPhoneNumberConditionInput>> or;
    private final Input<ModelStringInput> phoneNumber;
    private final Input<ModelIDInput> phoneNumberId;
    private final Input<ModelStringInput> phoneNumberQualityUpdate;
    private final Input<ModelStringInput> phoneNumberQualityUpdateTime;
    private final Input<ModelStringInput> qualityRating;
    private final Input<ModelIntInput> quota;
    private final Input<ModelStringInput> rejectionReason;
    private final Input<ModelStringInput> requestedDisplayName;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> wabaAccountId;
    private final Input<ModelStringInput> wabaNumberDecision;
    private final Input<ModelStringInput> wabaNumberDecisionTime;
    private final Input<ModelStringInput> welcomeMessage;

    public static final class Builder {
        private Input<ModelIDInput> wabaAccountId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> phoneNumberId = Input.absent();
        private Input<ModelStringInput> phoneNumber = Input.absent();
        private Input<ModelBooleanInput> isDefault = Input.absent();
        private Input<ModelStringInput> accessToken = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> internalName = Input.absent();
        private Input<ModelIntInput> quota = Input.absent();
        private Input<ModelStringInput> currentLimitCategory = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> qualityRating = Input.absent();
        private Input<ModelIDInput> entityListId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> welcomeMessage = Input.absent();
        private Input<ModelStringInput> requestedDisplayName = Input.absent();
        private Input<ModelStringInput> displayNameUpdate = Input.absent();
        private Input<ModelStringInput> displayNameUpdateDateTime = Input.absent();
        private Input<ModelStringInput> wabaNumberDecision = Input.absent();
        private Input<ModelStringInput> wabaNumberDecisionTime = Input.absent();
        private Input<ModelStringInput> rejectionReason = Input.absent();
        private Input<ModelStringInput> phoneNumberQualityUpdate = Input.absent();
        private Input<ModelStringInput> phoneNumberQualityUpdateTime = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelWabaPhoneNumberConditionInput>> and = Input.absent();
        private Input<List<ModelWabaPhoneNumberConditionInput>> or = Input.absent();
        private Input<ModelWabaPhoneNumberConditionInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaPhoneNumberConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaPhoneNumberConditionInput build() {
            return new ModelWabaPhoneNumberConditionInput(this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder displayNameUpdate(ModelStringInput modelStringInput) {
            this.displayNameUpdate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder displayNameUpdateDateTime(ModelStringInput modelStringInput) {
            this.displayNameUpdateDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder entityListId(ModelIDInput modelIDInput) {
            this.entityListId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder internalName(ModelStringInput modelStringInput) {
            this.internalName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isDefault(ModelBooleanInput modelBooleanInput) {
            this.isDefault = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelWabaPhoneNumberConditionInput modelWabaPhoneNumberConditionInput) {
            this.not = Input.fromNullable(modelWabaPhoneNumberConditionInput);
            return this;
        }

        public Builder or(List<ModelWabaPhoneNumberConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumber(ModelStringInput modelStringInput) {
            this.phoneNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder phoneNumberId(ModelIDInput modelIDInput) {
            this.phoneNumberId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder phoneNumberQualityUpdate(ModelStringInput modelStringInput) {
            this.phoneNumberQualityUpdate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder phoneNumberQualityUpdateTime(ModelStringInput modelStringInput) {
            this.phoneNumberQualityUpdateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder qualityRating(ModelStringInput modelStringInput) {
            this.qualityRating = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder quota(ModelIntInput modelIntInput) {
            this.quota = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder rejectionReason(ModelStringInput modelStringInput) {
            this.rejectionReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder requestedDisplayName(ModelStringInput modelStringInput) {
            this.requestedDisplayName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
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

        public Builder wabaNumberDecision(ModelStringInput modelStringInput) {
            this.wabaNumberDecision = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder wabaNumberDecisionTime(ModelStringInput modelStringInput) {
            this.wabaNumberDecisionTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder welcomeMessage(ModelStringInput modelStringInput) {
            this.welcomeMessage = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelWabaPhoneNumberConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelBooleanInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIntInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelIDInput> input25, Input<ModelIDInput> input26, Input<List<ModelWabaPhoneNumberConditionInput>> input27, Input<List<ModelWabaPhoneNumberConditionInput>> input28, Input<ModelWabaPhoneNumberConditionInput> input29) {
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
        this.and = input27;
        this.or = input28;
        this.not = input29;
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

    public List<ModelWabaPhoneNumberConditionInput> and() {
        return this.and.value;
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

    public ModelStringInput displayNameUpdate() {
        return this.displayNameUpdate.value;
    }

    public ModelStringInput displayNameUpdateDateTime() {
        return this.displayNameUpdateDateTime.value;
    }

    public ModelIDInput entityListId() {
        return this.entityListId.value;
    }

    public ModelStringInput internalName() {
        return this.internalName.value;
    }

    public ModelBooleanInput isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaPhoneNumberConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaPhoneNumberConditionInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaPhoneNumberConditionInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberConditionInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaPhoneNumberConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaPhoneNumberConditionInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberConditionInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", ModelWabaPhoneNumberConditionInput.this.phoneNumber.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.phoneNumber.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.isDefault.defined) {
                    inputFieldWriter.writeObject("isDefault", ModelWabaPhoneNumberConditionInput.this.isDefault.value != 0 ? ((ModelBooleanInput) ModelWabaPhoneNumberConditionInput.this.isDefault.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelWabaPhoneNumberConditionInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelWabaPhoneNumberConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.internalName.defined) {
                    inputFieldWriter.writeObject("internalName", ModelWabaPhoneNumberConditionInput.this.internalName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.internalName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.quota.defined) {
                    inputFieldWriter.writeObject("quota", ModelWabaPhoneNumberConditionInput.this.quota.value != 0 ? ((ModelIntInput) ModelWabaPhoneNumberConditionInput.this.quota.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeObject("currentLimitCategory", ModelWabaPhoneNumberConditionInput.this.currentLimitCategory.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.currentLimitCategory.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWabaPhoneNumberConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.qualityRating.defined) {
                    inputFieldWriter.writeObject("qualityRating", ModelWabaPhoneNumberConditionInput.this.qualityRating.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.qualityRating.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelWabaPhoneNumberConditionInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberConditionInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaPhoneNumberConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaPhoneNumberConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.welcomeMessage.defined) {
                    inputFieldWriter.writeObject("welcomeMessage", ModelWabaPhoneNumberConditionInput.this.welcomeMessage.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.welcomeMessage.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.requestedDisplayName.defined) {
                    inputFieldWriter.writeObject("requestedDisplayName", ModelWabaPhoneNumberConditionInput.this.requestedDisplayName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.requestedDisplayName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.displayNameUpdate.defined) {
                    inputFieldWriter.writeObject("displayNameUpdate", ModelWabaPhoneNumberConditionInput.this.displayNameUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.displayNameUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.displayNameUpdateDateTime.defined) {
                    inputFieldWriter.writeObject("displayNameUpdateDateTime", ModelWabaPhoneNumberConditionInput.this.displayNameUpdateDateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.displayNameUpdateDateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.wabaNumberDecision.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecision", ModelWabaPhoneNumberConditionInput.this.wabaNumberDecision.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.wabaNumberDecision.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.wabaNumberDecisionTime.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecisionTime", ModelWabaPhoneNumberConditionInput.this.wabaNumberDecisionTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.wabaNumberDecisionTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeObject("rejectionReason", ModelWabaPhoneNumberConditionInput.this.rejectionReason.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.rejectionReason.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.phoneNumberQualityUpdate.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdate", ModelWabaPhoneNumberConditionInput.this.phoneNumberQualityUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.phoneNumberQualityUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.phoneNumberQualityUpdateTime.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdateTime", ModelWabaPhoneNumberConditionInput.this.phoneNumberQualityUpdateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberConditionInput.this.phoneNumberQualityUpdateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaPhoneNumberConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaPhoneNumberConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaPhoneNumberConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaPhoneNumberConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaPhoneNumberConditionInput.this.not.value != 0 ? ((ModelWabaPhoneNumberConditionInput) ModelWabaPhoneNumberConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelWabaPhoneNumberConditionInput not() {
        return this.not.value;
    }

    public List<ModelWabaPhoneNumberConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput phoneNumber() {
        return this.phoneNumber.value;
    }

    public ModelIDInput phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public ModelStringInput phoneNumberQualityUpdate() {
        return this.phoneNumberQualityUpdate.value;
    }

    public ModelStringInput phoneNumberQualityUpdateTime() {
        return this.phoneNumberQualityUpdateTime.value;
    }

    public ModelStringInput qualityRating() {
        return this.qualityRating.value;
    }

    public ModelIntInput quota() {
        return this.quota.value;
    }

    public ModelStringInput rejectionReason() {
        return this.rejectionReason.value;
    }

    public ModelStringInput requestedDisplayName() {
        return this.requestedDisplayName.value;
    }

    public ModelStringInput status() {
        return this.status.value;
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

    public ModelStringInput wabaNumberDecision() {
        return this.wabaNumberDecision.value;
    }

    public ModelStringInput wabaNumberDecisionTime() {
        return this.wabaNumberDecisionTime.value;
    }

    public ModelStringInput welcomeMessage() {
        return this.welcomeMessage.value;
    }
}
