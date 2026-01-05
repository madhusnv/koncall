package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaPhoneNumberFilterInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaPhoneNumberFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> currentLimitCategory;
    private final Input<ModelStringInput> displayNameUpdate;
    private final Input<ModelStringInput> displayNameUpdateDateTime;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> internalName;
    private final Input<ModelBooleanInput> isDefault;
    private final Input<ModelStringInput> name;
    private final Input<ModelWabaPhoneNumberFilterInput> not;
    private final Input<List<ModelWabaPhoneNumberFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelWabaPhoneNumberFilterInput>> and = Input.absent();
        private Input<List<ModelWabaPhoneNumberFilterInput>> or = Input.absent();
        private Input<ModelWabaPhoneNumberFilterInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaPhoneNumberFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaPhoneNumberFilterInput build() {
            return new ModelWabaPhoneNumberFilterInput(this.id, this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelWabaPhoneNumberFilterInput modelWabaPhoneNumberFilterInput) {
            this.not = Input.fromNullable(modelWabaPhoneNumberFilterInput);
            return this;
        }

        public Builder or(List<ModelWabaPhoneNumberFilterInput> list) {
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

    public ModelWabaPhoneNumberFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelIntInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelIDInput> input26, Input<ModelIDInput> input27, Input<List<ModelWabaPhoneNumberFilterInput>> input28, Input<List<ModelWabaPhoneNumberFilterInput>> input29, Input<ModelWabaPhoneNumberFilterInput> input30) {
        this.id = input;
        this.wabaAccountId = input2;
        this.accountId = input3;
        this.phoneNumberId = input4;
        this.phoneNumber = input5;
        this.isDefault = input6;
        this.accessToken = input7;
        this.name = input8;
        this.internalName = input9;
        this.quota = input10;
        this.currentLimitCategory = input11;
        this.status = input12;
        this.qualityRating = input13;
        this.entityListId = input14;
        this.createdAt = input15;
        this.updatedAt = input16;
        this.welcomeMessage = input17;
        this.requestedDisplayName = input18;
        this.displayNameUpdate = input19;
        this.displayNameUpdateDateTime = input20;
        this.wabaNumberDecision = input21;
        this.wabaNumberDecisionTime = input22;
        this.rejectionReason = input23;
        this.phoneNumberQualityUpdate = input24;
        this.phoneNumberQualityUpdateTime = input25;
        this.createdById = input26;
        this.updatedById = input27;
        this.and = input28;
        this.or = input29;
        this.not = input30;
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

    public List<ModelWabaPhoneNumberFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput internalName() {
        return this.internalName.value;
    }

    public ModelBooleanInput isDefault() {
        return this.isDefault.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaPhoneNumberFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaPhoneNumberFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelWabaPhoneNumberFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaPhoneNumberFilterInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaPhoneNumberFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaPhoneNumberFilterInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", ModelWabaPhoneNumberFilterInput.this.phoneNumber.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.phoneNumber.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.isDefault.defined) {
                    inputFieldWriter.writeObject("isDefault", ModelWabaPhoneNumberFilterInput.this.isDefault.value != 0 ? ((ModelBooleanInput) ModelWabaPhoneNumberFilterInput.this.isDefault.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelWabaPhoneNumberFilterInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelWabaPhoneNumberFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.internalName.defined) {
                    inputFieldWriter.writeObject("internalName", ModelWabaPhoneNumberFilterInput.this.internalName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.internalName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.quota.defined) {
                    inputFieldWriter.writeObject("quota", ModelWabaPhoneNumberFilterInput.this.quota.value != 0 ? ((ModelIntInput) ModelWabaPhoneNumberFilterInput.this.quota.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeObject("currentLimitCategory", ModelWabaPhoneNumberFilterInput.this.currentLimitCategory.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.currentLimitCategory.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWabaPhoneNumberFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.qualityRating.defined) {
                    inputFieldWriter.writeObject("qualityRating", ModelWabaPhoneNumberFilterInput.this.qualityRating.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.qualityRating.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelWabaPhoneNumberFilterInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaPhoneNumberFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaPhoneNumberFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.welcomeMessage.defined) {
                    inputFieldWriter.writeObject("welcomeMessage", ModelWabaPhoneNumberFilterInput.this.welcomeMessage.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.welcomeMessage.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.requestedDisplayName.defined) {
                    inputFieldWriter.writeObject("requestedDisplayName", ModelWabaPhoneNumberFilterInput.this.requestedDisplayName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.requestedDisplayName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.displayNameUpdate.defined) {
                    inputFieldWriter.writeObject("displayNameUpdate", ModelWabaPhoneNumberFilterInput.this.displayNameUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.displayNameUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.displayNameUpdateDateTime.defined) {
                    inputFieldWriter.writeObject("displayNameUpdateDateTime", ModelWabaPhoneNumberFilterInput.this.displayNameUpdateDateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.displayNameUpdateDateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.wabaNumberDecision.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecision", ModelWabaPhoneNumberFilterInput.this.wabaNumberDecision.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.wabaNumberDecision.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.wabaNumberDecisionTime.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecisionTime", ModelWabaPhoneNumberFilterInput.this.wabaNumberDecisionTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.wabaNumberDecisionTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeObject("rejectionReason", ModelWabaPhoneNumberFilterInput.this.rejectionReason.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.rejectionReason.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.phoneNumberQualityUpdate.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdate", ModelWabaPhoneNumberFilterInput.this.phoneNumberQualityUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.phoneNumberQualityUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.phoneNumberQualityUpdateTime.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdateTime", ModelWabaPhoneNumberFilterInput.this.phoneNumberQualityUpdateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberFilterInput.this.phoneNumberQualityUpdateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaPhoneNumberFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaPhoneNumberFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaPhoneNumberFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaPhoneNumberFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaPhoneNumberFilterInput.this.not.value != 0 ? ((ModelWabaPhoneNumberFilterInput) ModelWabaPhoneNumberFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelWabaPhoneNumberFilterInput not() {
        return this.not.value;
    }

    public List<ModelWabaPhoneNumberFilterInput> or() {
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
