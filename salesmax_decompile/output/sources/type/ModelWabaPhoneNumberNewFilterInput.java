package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaPhoneNumberNewFilterInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaPhoneNumberNewFilterInput>> and;
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
    private final Input<ModelWabaPhoneNumberNewFilterInput> not;
    private final Input<List<ModelWabaPhoneNumberNewFilterInput>> or;
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
        private Input<List<ModelWabaPhoneNumberNewFilterInput>> and = Input.absent();
        private Input<List<ModelWabaPhoneNumberNewFilterInput>> or = Input.absent();
        private Input<ModelWabaPhoneNumberNewFilterInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaPhoneNumberNewFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaPhoneNumberNewFilterInput build() {
            return new ModelWabaPhoneNumberNewFilterInput(this.id, this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder not(ModelWabaPhoneNumberNewFilterInput modelWabaPhoneNumberNewFilterInput) {
            this.not = Input.fromNullable(modelWabaPhoneNumberNewFilterInput);
            return this;
        }

        public Builder or(List<ModelWabaPhoneNumberNewFilterInput> list) {
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

    public ModelWabaPhoneNumberNewFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelIntInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelIDInput> input26, Input<ModelIDInput> input27, Input<List<ModelWabaPhoneNumberNewFilterInput>> input28, Input<List<ModelWabaPhoneNumberNewFilterInput>> input29, Input<ModelWabaPhoneNumberNewFilterInput> input30) {
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

    public List<ModelWabaPhoneNumberNewFilterInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelWabaPhoneNumberNewFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaPhoneNumberNewFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelWabaPhoneNumberNewFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaPhoneNumberNewFilterInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaPhoneNumberNewFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaPhoneNumberNewFilterInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", ModelWabaPhoneNumberNewFilterInput.this.phoneNumber.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.phoneNumber.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.isDefault.defined) {
                    inputFieldWriter.writeObject("isDefault", ModelWabaPhoneNumberNewFilterInput.this.isDefault.value != 0 ? ((ModelBooleanInput) ModelWabaPhoneNumberNewFilterInput.this.isDefault.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelWabaPhoneNumberNewFilterInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelWabaPhoneNumberNewFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.internalName.defined) {
                    inputFieldWriter.writeObject("internalName", ModelWabaPhoneNumberNewFilterInput.this.internalName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.internalName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.quota.defined) {
                    inputFieldWriter.writeObject("quota", ModelWabaPhoneNumberNewFilterInput.this.quota.value != 0 ? ((ModelIntInput) ModelWabaPhoneNumberNewFilterInput.this.quota.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.currentLimitCategory.defined) {
                    inputFieldWriter.writeObject("currentLimitCategory", ModelWabaPhoneNumberNewFilterInput.this.currentLimitCategory.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.currentLimitCategory.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWabaPhoneNumberNewFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.qualityRating.defined) {
                    inputFieldWriter.writeObject("qualityRating", ModelWabaPhoneNumberNewFilterInput.this.qualityRating.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.qualityRating.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelWabaPhoneNumberNewFilterInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaPhoneNumberNewFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWabaPhoneNumberNewFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.welcomeMessage.defined) {
                    inputFieldWriter.writeObject("welcomeMessage", ModelWabaPhoneNumberNewFilterInput.this.welcomeMessage.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.welcomeMessage.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.requestedDisplayName.defined) {
                    inputFieldWriter.writeObject("requestedDisplayName", ModelWabaPhoneNumberNewFilterInput.this.requestedDisplayName.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.requestedDisplayName.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.displayNameUpdate.defined) {
                    inputFieldWriter.writeObject("displayNameUpdate", ModelWabaPhoneNumberNewFilterInput.this.displayNameUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.displayNameUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.displayNameUpdateDateTime.defined) {
                    inputFieldWriter.writeObject("displayNameUpdateDateTime", ModelWabaPhoneNumberNewFilterInput.this.displayNameUpdateDateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.displayNameUpdateDateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.wabaNumberDecision.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecision", ModelWabaPhoneNumberNewFilterInput.this.wabaNumberDecision.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.wabaNumberDecision.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.wabaNumberDecisionTime.defined) {
                    inputFieldWriter.writeObject("wabaNumberDecisionTime", ModelWabaPhoneNumberNewFilterInput.this.wabaNumberDecisionTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.wabaNumberDecisionTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.rejectionReason.defined) {
                    inputFieldWriter.writeObject("rejectionReason", ModelWabaPhoneNumberNewFilterInput.this.rejectionReason.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.rejectionReason.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.phoneNumberQualityUpdate.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdate", ModelWabaPhoneNumberNewFilterInput.this.phoneNumberQualityUpdate.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.phoneNumberQualityUpdate.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.phoneNumberQualityUpdateTime.defined) {
                    inputFieldWriter.writeObject("phoneNumberQualityUpdateTime", ModelWabaPhoneNumberNewFilterInput.this.phoneNumberQualityUpdateTime.value != 0 ? ((ModelStringInput) ModelWabaPhoneNumberNewFilterInput.this.phoneNumberQualityUpdateTime.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelWabaPhoneNumberNewFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelWabaPhoneNumberNewFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelWabaPhoneNumberNewFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaPhoneNumberNewFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberNewFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberNewFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberNewFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaPhoneNumberNewFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaPhoneNumberNewFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaPhoneNumberNewFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaPhoneNumberNewFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaPhoneNumberNewFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaPhoneNumberNewFilterInput.this.not.value != 0 ? ((ModelWabaPhoneNumberNewFilterInput) ModelWabaPhoneNumberNewFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelWabaPhoneNumberNewFilterInput not() {
        return this.not.value;
    }

    public List<ModelWabaPhoneNumberNewFilterInput> or() {
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
