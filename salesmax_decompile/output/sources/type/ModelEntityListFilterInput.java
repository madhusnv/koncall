package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelBooleanInput> allowMultiple;
    private final Input<List<ModelEntityListFilterInput>> and;
    private final Input<ModelStringInput> assignedTeamId;
    private final Input<ModelStringInput> assignedUserId;
    private final Input<ModelIDInput> associatedDistributionId;
    private final Input<ModelStringInput> chatMessagePlatform;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> defaultCountryCode;
    private final Input<ModelStringInput> defaultCountryIso;
    private final Input<ModelStringInput> description;
    private final Input<ModelIntInput> doNotTrackCount;
    private final Input<ModelIDInput> dupliacteLeadList;
    private final Input<ModelIntInput> duplicateCount;
    private final Input<ModelIDInput> entityActionDefinitionReference;
    private final Input<ModelEntityListTypeInput> entityListType;
    private final Input<ModelStringInput> entityTypeInList;
    private final Input<ModelStringInput> finalBulkUploadFileRef;
    private final Input<ModelIDInput> id;
    private final Input<ModelIntInput> invalidEmailCount;
    private final Input<ModelIntInput> invalidNumbersCount;
    private final Input<ModelStringInput> leadSourceForBulkUpload;
    private final Input<ModelStringInput> listCategory;
    private final Input<ModelListCreationTypeInput> listCreationType;
    private final Input<ModelStringInput> listName;
    private final Input<ModelStringInput> modifiedBulkUploadFileRef;
    private final Input<ModelEntityListFilterInput> not;
    private final Input<ModelStringInput> notificationBody;
    private final Input<List<ModelEntityListFilterInput>> or;
    private final Input<ModelIntInput> otherFailedCount;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelStringInput> rawBulkUploadFileHash;
    private final Input<ModelStringInput> rawBulkUploadFileRef;
    private final Input<ModelBooleanInput> redistributeEntities;
    private final Input<ModelStringInput> redistributionRequestedAt;
    private final Input<ModelStringInput> rule;
    private final Input<ModelEntityListStatusInput> status;
    private final Input<ModelIntInput> successfulCount;
    private final Input<ModelStringInput> tags;
    private final Input<ModelContactAssignmentStatusInput> toBeAssigned;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> entityTypeInList = Input.absent();
        private Input<ModelEntityListTypeInput> entityListType = Input.absent();
        private Input<ModelStringInput> listName = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelEntityListStatusInput> status = Input.absent();
        private Input<ModelIntInput> successfulCount = Input.absent();
        private Input<ModelIntInput> duplicateCount = Input.absent();
        private Input<ModelIntInput> invalidNumbersCount = Input.absent();
        private Input<ModelIntInput> invalidEmailCount = Input.absent();
        private Input<ModelIntInput> doNotTrackCount = Input.absent();
        private Input<ModelIntInput> otherFailedCount = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelListCreationTypeInput> listCreationType = Input.absent();
        private Input<ModelStringInput> listCategory = Input.absent();
        private Input<ModelStringInput> rawBulkUploadFileRef = Input.absent();
        private Input<ModelStringInput> rawBulkUploadFileHash = Input.absent();
        private Input<ModelStringInput> modifiedBulkUploadFileRef = Input.absent();
        private Input<ModelStringInput> finalBulkUploadFileRef = Input.absent();
        private Input<ModelStringInput> leadSourceForBulkUpload = Input.absent();
        private Input<ModelStringInput> defaultCountryCode = Input.absent();
        private Input<ModelStringInput> defaultCountryIso = Input.absent();
        private Input<ModelStringInput> notificationBody = Input.absent();
        private Input<ModelStringInput> rule = Input.absent();
        private Input<ModelContactAssignmentStatusInput> toBeAssigned = Input.absent();
        private Input<ModelStringInput> assignedUserId = Input.absent();
        private Input<ModelStringInput> assignedTeamId = Input.absent();
        private Input<ModelIDInput> associatedDistributionId = Input.absent();
        private Input<ModelIDInput> entityActionDefinitionReference = Input.absent();
        private Input<ModelBooleanInput> redistributeEntities = Input.absent();
        private Input<ModelStringInput> redistributionRequestedAt = Input.absent();
        private Input<ModelIDInput> dupliacteLeadList = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelStringInput> chatMessagePlatform = Input.absent();
        private Input<ModelBooleanInput> allowMultiple = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelEntityListFilterInput>> and = Input.absent();
        private Input<List<ModelEntityListFilterInput>> or = Input.absent();
        private Input<ModelEntityListFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder allowMultiple(ModelBooleanInput modelBooleanInput) {
            this.allowMultiple = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder and(List<ModelEntityListFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder assignedTeamId(ModelStringInput modelStringInput) {
            this.assignedTeamId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder assignedUserId(ModelStringInput modelStringInput) {
            this.assignedUserId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder associatedDistributionId(ModelIDInput modelIDInput) {
            this.associatedDistributionId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelEntityListFilterInput build() {
            return new ModelEntityListFilterInput(this.id, this.accountId, this.entityTypeInList, this.entityListType, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.ownerId, this.listCreationType, this.listCategory, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder chatMessagePlatform(ModelStringInput modelStringInput) {
            this.chatMessagePlatform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder defaultCountryCode(ModelStringInput modelStringInput) {
            this.defaultCountryCode = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder defaultCountryIso(ModelStringInput modelStringInput) {
            this.defaultCountryIso = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder doNotTrackCount(ModelIntInput modelIntInput) {
            this.doNotTrackCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder dupliacteLeadList(ModelIDInput modelIDInput) {
            this.dupliacteLeadList = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder duplicateCount(ModelIntInput modelIntInput) {
            this.duplicateCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder entityActionDefinitionReference(ModelIDInput modelIDInput) {
            this.entityActionDefinitionReference = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder entityListType(ModelEntityListTypeInput modelEntityListTypeInput) {
            this.entityListType = Input.fromNullable(modelEntityListTypeInput);
            return this;
        }

        public Builder entityTypeInList(ModelStringInput modelStringInput) {
            this.entityTypeInList = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder finalBulkUploadFileRef(ModelStringInput modelStringInput) {
            this.finalBulkUploadFileRef = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder invalidEmailCount(ModelIntInput modelIntInput) {
            this.invalidEmailCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder invalidNumbersCount(ModelIntInput modelIntInput) {
            this.invalidNumbersCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder leadSourceForBulkUpload(ModelStringInput modelStringInput) {
            this.leadSourceForBulkUpload = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder listCategory(ModelStringInput modelStringInput) {
            this.listCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder listCreationType(ModelListCreationTypeInput modelListCreationTypeInput) {
            this.listCreationType = Input.fromNullable(modelListCreationTypeInput);
            return this;
        }

        public Builder listName(ModelStringInput modelStringInput) {
            this.listName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder modifiedBulkUploadFileRef(ModelStringInput modelStringInput) {
            this.modifiedBulkUploadFileRef = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelEntityListFilterInput modelEntityListFilterInput) {
            this.not = Input.fromNullable(modelEntityListFilterInput);
            return this;
        }

        public Builder notificationBody(ModelStringInput modelStringInput) {
            this.notificationBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelEntityListFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder otherFailedCount(ModelIntInput modelIntInput) {
            this.otherFailedCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder rawBulkUploadFileHash(ModelStringInput modelStringInput) {
            this.rawBulkUploadFileHash = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder rawBulkUploadFileRef(ModelStringInput modelStringInput) {
            this.rawBulkUploadFileRef = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder redistributeEntities(ModelBooleanInput modelBooleanInput) {
            this.redistributeEntities = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder redistributionRequestedAt(ModelStringInput modelStringInput) {
            this.redistributionRequestedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder rule(ModelStringInput modelStringInput) {
            this.rule = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelEntityListStatusInput modelEntityListStatusInput) {
            this.status = Input.fromNullable(modelEntityListStatusInput);
            return this;
        }

        public Builder successfulCount(ModelIntInput modelIntInput) {
            this.successfulCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder toBeAssigned(ModelContactAssignmentStatusInput modelContactAssignmentStatusInput) {
            this.toBeAssigned = Input.fromNullable(modelContactAssignmentStatusInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelEntityListFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelEntityListTypeInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelEntityListStatusInput> input7, Input<ModelIntInput> input8, Input<ModelIntInput> input9, Input<ModelIntInput> input10, Input<ModelIntInput> input11, Input<ModelIntInput> input12, Input<ModelIntInput> input13, Input<ModelIDInput> input14, Input<ModelListCreationTypeInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelContactAssignmentStatusInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelIDInput> input29, Input<ModelIDInput> input30, Input<ModelBooleanInput> input31, Input<ModelStringInput> input32, Input<ModelIDInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelBooleanInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<List<ModelEntityListFilterInput>> input39, Input<List<ModelEntityListFilterInput>> input40, Input<ModelEntityListFilterInput> input41) {
        this.id = input;
        this.accountId = input2;
        this.entityTypeInList = input3;
        this.entityListType = input4;
        this.listName = input5;
        this.description = input6;
        this.status = input7;
        this.successfulCount = input8;
        this.duplicateCount = input9;
        this.invalidNumbersCount = input10;
        this.invalidEmailCount = input11;
        this.doNotTrackCount = input12;
        this.otherFailedCount = input13;
        this.ownerId = input14;
        this.listCreationType = input15;
        this.listCategory = input16;
        this.rawBulkUploadFileRef = input17;
        this.rawBulkUploadFileHash = input18;
        this.modifiedBulkUploadFileRef = input19;
        this.finalBulkUploadFileRef = input20;
        this.leadSourceForBulkUpload = input21;
        this.defaultCountryCode = input22;
        this.defaultCountryIso = input23;
        this.notificationBody = input24;
        this.rule = input25;
        this.toBeAssigned = input26;
        this.assignedUserId = input27;
        this.assignedTeamId = input28;
        this.associatedDistributionId = input29;
        this.entityActionDefinitionReference = input30;
        this.redistributeEntities = input31;
        this.redistributionRequestedAt = input32;
        this.dupliacteLeadList = input33;
        this.tags = input34;
        this.chatMessagePlatform = input35;
        this.allowMultiple = input36;
        this.createdAt = input37;
        this.updatedAt = input38;
        this.and = input39;
        this.or = input40;
        this.not = input41;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelBooleanInput allowMultiple() {
        return this.allowMultiple.value;
    }

    public List<ModelEntityListFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput assignedTeamId() {
        return this.assignedTeamId.value;
    }

    public ModelStringInput assignedUserId() {
        return this.assignedUserId.value;
    }

    public ModelIDInput associatedDistributionId() {
        return this.associatedDistributionId.value;
    }

    public ModelStringInput chatMessagePlatform() {
        return this.chatMessagePlatform.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput defaultCountryCode() {
        return this.defaultCountryCode.value;
    }

    public ModelStringInput defaultCountryIso() {
        return this.defaultCountryIso.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelIntInput doNotTrackCount() {
        return this.doNotTrackCount.value;
    }

    public ModelIDInput dupliacteLeadList() {
        return this.dupliacteLeadList.value;
    }

    public ModelIntInput duplicateCount() {
        return this.duplicateCount.value;
    }

    public ModelIDInput entityActionDefinitionReference() {
        return this.entityActionDefinitionReference.value;
    }

    public ModelEntityListTypeInput entityListType() {
        return this.entityListType.value;
    }

    public ModelStringInput entityTypeInList() {
        return this.entityTypeInList.value;
    }

    public ModelStringInput finalBulkUploadFileRef() {
        return this.finalBulkUploadFileRef.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelIntInput invalidEmailCount() {
        return this.invalidEmailCount.value;
    }

    public ModelIntInput invalidNumbersCount() {
        return this.invalidNumbersCount.value;
    }

    public ModelStringInput leadSourceForBulkUpload() {
        return this.leadSourceForBulkUpload.value;
    }

    public ModelStringInput listCategory() {
        return this.listCategory.value;
    }

    public ModelListCreationTypeInput listCreationType() {
        return this.listCreationType.value;
    }

    public ModelStringInput listName() {
        return this.listName.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelEntityListFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelEntityListFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEntityListFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEntityListFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.entityTypeInList.defined) {
                    inputFieldWriter.writeObject("entityTypeInList", ModelEntityListFilterInput.this.entityTypeInList.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.entityTypeInList.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.entityListType.defined) {
                    inputFieldWriter.writeObject("entityListType", ModelEntityListFilterInput.this.entityListType.value != 0 ? ((ModelEntityListTypeInput) ModelEntityListFilterInput.this.entityListType.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.listName.defined) {
                    inputFieldWriter.writeObject("listName", ModelEntityListFilterInput.this.listName.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.listName.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelEntityListFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelEntityListFilterInput.this.status.value != 0 ? ((ModelEntityListStatusInput) ModelEntityListFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.successfulCount.defined) {
                    inputFieldWriter.writeObject("successfulCount", ModelEntityListFilterInput.this.successfulCount.value != 0 ? ((ModelIntInput) ModelEntityListFilterInput.this.successfulCount.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.duplicateCount.defined) {
                    inputFieldWriter.writeObject("duplicateCount", ModelEntityListFilterInput.this.duplicateCount.value != 0 ? ((ModelIntInput) ModelEntityListFilterInput.this.duplicateCount.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.invalidNumbersCount.defined) {
                    inputFieldWriter.writeObject("invalidNumbersCount", ModelEntityListFilterInput.this.invalidNumbersCount.value != 0 ? ((ModelIntInput) ModelEntityListFilterInput.this.invalidNumbersCount.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.invalidEmailCount.defined) {
                    inputFieldWriter.writeObject("invalidEmailCount", ModelEntityListFilterInput.this.invalidEmailCount.value != 0 ? ((ModelIntInput) ModelEntityListFilterInput.this.invalidEmailCount.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.doNotTrackCount.defined) {
                    inputFieldWriter.writeObject("doNotTrackCount", ModelEntityListFilterInput.this.doNotTrackCount.value != 0 ? ((ModelIntInput) ModelEntityListFilterInput.this.doNotTrackCount.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.otherFailedCount.defined) {
                    inputFieldWriter.writeObject("otherFailedCount", ModelEntityListFilterInput.this.otherFailedCount.value != 0 ? ((ModelIntInput) ModelEntityListFilterInput.this.otherFailedCount.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelEntityListFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelEntityListFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.listCreationType.defined) {
                    inputFieldWriter.writeObject("listCreationType", ModelEntityListFilterInput.this.listCreationType.value != 0 ? ((ModelListCreationTypeInput) ModelEntityListFilterInput.this.listCreationType.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.listCategory.defined) {
                    inputFieldWriter.writeObject("listCategory", ModelEntityListFilterInput.this.listCategory.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.listCategory.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.rawBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("rawBulkUploadFileRef", ModelEntityListFilterInput.this.rawBulkUploadFileRef.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.rawBulkUploadFileRef.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.rawBulkUploadFileHash.defined) {
                    inputFieldWriter.writeObject("rawBulkUploadFileHash", ModelEntityListFilterInput.this.rawBulkUploadFileHash.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.rawBulkUploadFileHash.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.modifiedBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("modifiedBulkUploadFileRef", ModelEntityListFilterInput.this.modifiedBulkUploadFileRef.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.modifiedBulkUploadFileRef.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.finalBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("finalBulkUploadFileRef", ModelEntityListFilterInput.this.finalBulkUploadFileRef.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.finalBulkUploadFileRef.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.leadSourceForBulkUpload.defined) {
                    inputFieldWriter.writeObject("leadSourceForBulkUpload", ModelEntityListFilterInput.this.leadSourceForBulkUpload.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.leadSourceForBulkUpload.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.defaultCountryCode.defined) {
                    inputFieldWriter.writeObject("defaultCountryCode", ModelEntityListFilterInput.this.defaultCountryCode.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.defaultCountryCode.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.defaultCountryIso.defined) {
                    inputFieldWriter.writeObject("defaultCountryIso", ModelEntityListFilterInput.this.defaultCountryIso.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.defaultCountryIso.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.notificationBody.defined) {
                    inputFieldWriter.writeObject("notificationBody", ModelEntityListFilterInput.this.notificationBody.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.notificationBody.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.rule.defined) {
                    inputFieldWriter.writeObject("rule", ModelEntityListFilterInput.this.rule.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.rule.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelEntityListFilterInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelEntityListFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.assignedUserId.defined) {
                    inputFieldWriter.writeObject("assignedUserId", ModelEntityListFilterInput.this.assignedUserId.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.assignedUserId.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.assignedTeamId.defined) {
                    inputFieldWriter.writeObject("assignedTeamId", ModelEntityListFilterInput.this.assignedTeamId.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.assignedTeamId.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.associatedDistributionId.defined) {
                    inputFieldWriter.writeObject("associatedDistributionId", ModelEntityListFilterInput.this.associatedDistributionId.value != 0 ? ((ModelIDInput) ModelEntityListFilterInput.this.associatedDistributionId.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeObject("entityActionDefinitionReference", ModelEntityListFilterInput.this.entityActionDefinitionReference.value != 0 ? ((ModelIDInput) ModelEntityListFilterInput.this.entityActionDefinitionReference.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.redistributeEntities.defined) {
                    inputFieldWriter.writeObject("redistributeEntities", ModelEntityListFilterInput.this.redistributeEntities.value != 0 ? ((ModelBooleanInput) ModelEntityListFilterInput.this.redistributeEntities.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.redistributionRequestedAt.defined) {
                    inputFieldWriter.writeObject("redistributionRequestedAt", ModelEntityListFilterInput.this.redistributionRequestedAt.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.redistributionRequestedAt.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.dupliacteLeadList.defined) {
                    inputFieldWriter.writeObject("dupliacteLeadList", ModelEntityListFilterInput.this.dupliacteLeadList.value != 0 ? ((ModelIDInput) ModelEntityListFilterInput.this.dupliacteLeadList.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelEntityListFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.chatMessagePlatform.defined) {
                    inputFieldWriter.writeObject("chatMessagePlatform", ModelEntityListFilterInput.this.chatMessagePlatform.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.chatMessagePlatform.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeObject("allowMultiple", ModelEntityListFilterInput.this.allowMultiple.value != 0 ? ((ModelBooleanInput) ModelEntityListFilterInput.this.allowMultiple.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEntityListFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEntityListFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEntityListFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEntityListFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEntityListFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEntityListFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEntityListFilterInput.this.not.value != 0 ? ((ModelEntityListFilterInput) ModelEntityListFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput modifiedBulkUploadFileRef() {
        return this.modifiedBulkUploadFileRef.value;
    }

    public ModelEntityListFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput notificationBody() {
        return this.notificationBody.value;
    }

    public List<ModelEntityListFilterInput> or() {
        return this.or.value;
    }

    public ModelIntInput otherFailedCount() {
        return this.otherFailedCount.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelStringInput rawBulkUploadFileHash() {
        return this.rawBulkUploadFileHash.value;
    }

    public ModelStringInput rawBulkUploadFileRef() {
        return this.rawBulkUploadFileRef.value;
    }

    public ModelBooleanInput redistributeEntities() {
        return this.redistributeEntities.value;
    }

    public ModelStringInput redistributionRequestedAt() {
        return this.redistributionRequestedAt.value;
    }

    public ModelStringInput rule() {
        return this.rule.value;
    }

    public ModelEntityListStatusInput status() {
        return this.status.value;
    }

    public ModelIntInput successfulCount() {
        return this.successfulCount.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelContactAssignmentStatusInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
