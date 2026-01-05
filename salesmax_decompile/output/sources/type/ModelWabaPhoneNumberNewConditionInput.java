package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaPhoneNumberNewConditionInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaPhoneNumberNewConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currentLimitCategory;
    private final Input<ModelStringInput> displayNameUpdate;
    private final Input<ModelStringInput> displayNameUpdateDateTime;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelStringInput> internalName;
    private final Input<ModelBooleanInput> isDefault;
    private final Input<ModelStringInput> name;
    private final Input<ModelWabaPhoneNumberNewConditionInput> not;
    private final Input<List<ModelWabaPhoneNumberNewConditionInput>> or;
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
        private Input<List<ModelWabaPhoneNumberNewConditionInput>> and = Input.absent();
        private Input<List<ModelWabaPhoneNumberNewConditionInput>> or = Input.absent();
        private Input<ModelWabaPhoneNumberNewConditionInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaPhoneNumberNewConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaPhoneNumberNewConditionInput build() {
            return new ModelWabaPhoneNumberNewConditionInput(this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder not(ModelWabaPhoneNumberNewConditionInput modelWabaPhoneNumberNewConditionInput) {
            this.not = Input.fromNullable(modelWabaPhoneNumberNewConditionInput);
            return this;
        }

        public Builder or(List<ModelWabaPhoneNumberNewConditionInput> list) {
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

    public ModelWabaPhoneNumberNewConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelBooleanInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIntInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelIDInput> input25, Input<ModelIDInput> input26, Input<List<ModelWabaPhoneNumberNewConditionInput>> input27, Input<List<ModelWabaPhoneNumberNewConditionInput>> input28, Input<ModelWabaPhoneNumberNewConditionInput> input29) {
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

    public List<ModelWabaPhoneNumberNewConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelWabaPhoneNumberNewConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaPhoneNumberNewConditionInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaPhoneNumberNewConditionInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewConditionInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaPhoneNumberNewConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaPhoneNumberNewConditionInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewConditionInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", ModelWabaPhoneNumberNewConditionInput.this.phoneNumber.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.phoneNumber.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.isDefault.defined) {
                    inputFieldWriter.writeObject("isDefault", ModelWabaPhoneNumberNewConditionInput.this.isDefault.value != 0 ? ((ModelBooleanInput) ModelWabaPhoneNumberNewConditionInput.this.isDefault.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelWabaPhoneNumberNewConditionInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelWabaPhoneNumberNewConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.internalName.defined) {
                    inputFieldWriter.writeObject("internalName", ModelWabaPhoneNumberNewConditionInput.this.internalName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.internalName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.quota.defined) {
                    inputFieldWriter.writeObject("quota", ModelWabaPhoneNumberNewConditionInput.this.quota.value != 0 ? ((ModelIntInput) ModelWabaPhoneNumberNewConditionInput.this.quota.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeObject("currentLimitCategory", ModelWabaPhoneNumberNewConditionInput.this.currentLimitCategory.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.currentLimitCategory.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWabaPhoneNumberNewConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.qualityRating.defined) {
                    inputFieldWriter.writeObject("qualityRating", ModelWabaPhoneNumberNewConditionInput.this.qualityRating.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.qualityRating.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelWabaPhoneNumberNewConditionInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewConditionInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaPhoneNumberNewConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaPhoneNumberNewConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.welcomeMessage.defined) {
                    inputFieldWriter.writeObject("welcomeMessage", ModelWabaPhoneNumberNewConditionInput.this.welcomeMessage.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.welcomeMessage.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.requestedDisplayName.defined) {
                    inputFieldWriter.writeObject("requestedDisplayName", ModelWabaPhoneNumberNewConditionInput.this.requestedDisplayName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.requestedDisplayName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.displayNameUpdate.defined) {
                    inputFieldWriter.writeObject("displayNameUpdate", ModelWabaPhoneNumberNewConditionInput.this.displayNameUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.displayNameUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.displayNameUpdateDateTime.defined) {
                    inputFieldWriter.writeObject("displayNameUpdateDateTime", ModelWabaPhoneNumberNewConditionInput.this.displayNameUpdateDateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.displayNameUpdateDateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.wabaNumberDecision.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecision", ModelWabaPhoneNumberNewConditionInput.this.wabaNumberDecision.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.wabaNumberDecision.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.wabaNumberDecisionTime.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecisionTime", ModelWabaPhoneNumberNewConditionInput.this.wabaNumberDecisionTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.wabaNumberDecisionTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeObject("rejectionReason", ModelWabaPhoneNumberNewConditionInput.this.rejectionReason.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.rejectionReason.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.phoneNumberQualityUpdate.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdate", ModelWabaPhoneNumberNewConditionInput.this.phoneNumberQualityUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.phoneNumberQualityUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.phoneNumberQualityUpdateTime.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdateTime", ModelWabaPhoneNumberNewConditionInput.this.phoneNumberQualityUpdateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewConditionInput.this.phoneNumberQualityUpdateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaPhoneNumberNewConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaPhoneNumberNewConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaPhoneNumberNewConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberNewConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberNewConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberNewConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaPhoneNumberNewConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberNewConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberNewConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberNewConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberNewConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaPhoneNumberNewConditionInput.this.not.value != 0 ? ((ModelWabaPhoneNumberNewConditionInput) ModelWabaPhoneNumberNewConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelWabaPhoneNumberNewConditionInput not() {
        return this.not.value;
    }

    public List<ModelWabaPhoneNumberNewConditionInput> or() {
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
