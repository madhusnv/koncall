package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelBooleanInput> allowMultiple;
    private final Input<List<ModelEntityListConditionInput>> and;
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
    private final Input<ModelIntInput> invalidEmailCount;
    private final Input<ModelIntInput> invalidNumbersCount;
    private final Input<ModelStringInput> leadSourceForBulkUpload;
    private final Input<ModelStringInput> listCategory;
    private final Input<ModelListCreationTypeInput> listCreationType;
    private final Input<ModelStringInput> listName;
    private final Input<ModelStringInput> modifiedBulkUploadFileRef;
    private final Input<ModelEntityListConditionInput> not;
    private final Input<ModelStringInput> notificationBody;
    private final Input<List<ModelEntityListConditionInput>> or;
    private final Input<ModelIntInput> otherFailedCount;
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
        private Input<List<ModelEntityListConditionInput>> and = Input.absent();
        private Input<List<ModelEntityListConditionInput>> or = Input.absent();
        private Input<ModelEntityListConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder allowMultiple(ModelBooleanInput modelBooleanInput) {
            this.allowMultiple = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder and(List<ModelEntityListConditionInput> list) {
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

        public ModelEntityListConditionInput build() {
            return new ModelEntityListConditionInput(this.accountId, this.entityTypeInList, this.entityListType, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.listCreationType, this.listCategory, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelEntityListConditionInput modelEntityListConditionInput) {
            this.not = Input.fromNullable(modelEntityListConditionInput);
            return this;
        }

        public Builder notificationBody(ModelStringInput modelStringInput) {
            this.notificationBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelEntityListConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder otherFailedCount(ModelIntInput modelIntInput) {
            this.otherFailedCount = Input.fromNullable(modelIntInput);
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

    public ModelEntityListConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelEntityListTypeInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelEntityListStatusInput> input6, Input<ModelIntInput> input7, Input<ModelIntInput> input8, Input<ModelIntInput> input9, Input<ModelIntInput> input10, Input<ModelIntInput> input11, Input<ModelIntInput> input12, Input<ModelListCreationTypeInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelContactAssignmentStatusInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelIDInput> input27, Input<ModelIDInput> input28, Input<ModelBooleanInput> input29, Input<ModelStringInput> input30, Input<ModelIDInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelBooleanInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<List<ModelEntityListConditionInput>> input37, Input<List<ModelEntityListConditionInput>> input38, Input<ModelEntityListConditionInput> input39) {
        this.accountId = input;
        this.entityTypeInList = input2;
        this.entityListType = input3;
        this.listName = input4;
        this.description = input5;
        this.status = input6;
        this.successfulCount = input7;
        this.duplicateCount = input8;
        this.invalidNumbersCount = input9;
        this.invalidEmailCount = input10;
        this.doNotTrackCount = input11;
        this.otherFailedCount = input12;
        this.listCreationType = input13;
        this.listCategory = input14;
        this.rawBulkUploadFileRef = input15;
        this.rawBulkUploadFileHash = input16;
        this.modifiedBulkUploadFileRef = input17;
        this.finalBulkUploadFileRef = input18;
        this.leadSourceForBulkUpload = input19;
        this.defaultCountryCode = input20;
        this.defaultCountryIso = input21;
        this.notificationBody = input22;
        this.rule = input23;
        this.toBeAssigned = input24;
        this.assignedUserId = input25;
        this.assignedTeamId = input26;
        this.associatedDistributionId = input27;
        this.entityActionDefinitionReference = input28;
        this.redistributeEntities = input29;
        this.redistributionRequestedAt = input30;
        this.dupliacteLeadList = input31;
        this.tags = input32;
        this.chatMessagePlatform = input33;
        this.allowMultiple = input34;
        this.createdAt = input35;
        this.updatedAt = input36;
        this.and = input37;
        this.or = input38;
        this.not = input39;
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

    public List<ModelEntityListConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelEntityListConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEntityListConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEntityListConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.entityTypeInList.defined) {
                    inputFieldWriter.writeObject("entityTypeInList", ModelEntityListConditionInput.this.entityTypeInList.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.entityTypeInList.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.entityListType.defined) {
                    inputFieldWriter.writeObject("entityListType", ModelEntityListConditionInput.this.entityListType.value != 0 ? ((ModelEntityListTypeInput) ModelEntityListConditionInput.this.entityListType.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.listName.defined) {
                    inputFieldWriter.writeObject("listName", ModelEntityListConditionInput.this.listName.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.listName.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelEntityListConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelEntityListConditionInput.this.status.value != 0 ? ((ModelEntityListStatusInput) ModelEntityListConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.successfulCount.defined) {
                    inputFieldWriter.writeObject("successfulCount", ModelEntityListConditionInput.this.successfulCount.value != 0 ? ((ModelIntInput) ModelEntityListConditionInput.this.successfulCount.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.duplicateCount.defined) {
                    inputFieldWriter.writeObject("duplicateCount", ModelEntityListConditionInput.this.duplicateCount.value != 0 ? ((ModelIntInput) ModelEntityListConditionInput.this.duplicateCount.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.invalidNumbersCount.defined) {
                    inputFieldWriter.writeObject("invalidNumbersCount", ModelEntityListConditionInput.this.invalidNumbersCount.value != 0 ? ((ModelIntInput) ModelEntityListConditionInput.this.invalidNumbersCount.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.invalidEmailCount.defined) {
                    inputFieldWriter.writeObject("invalidEmailCount", ModelEntityListConditionInput.this.invalidEmailCount.value != 0 ? ((ModelIntInput) ModelEntityListConditionInput.this.invalidEmailCount.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.doNotTrackCount.defined) {
                    inputFieldWriter.writeObject("doNotTrackCount", ModelEntityListConditionInput.this.doNotTrackCount.value != 0 ? ((ModelIntInput) ModelEntityListConditionInput.this.doNotTrackCount.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.otherFailedCount.defined) {
                    inputFieldWriter.writeObject("otherFailedCount", ModelEntityListConditionInput.this.otherFailedCount.value != 0 ? ((ModelIntInput) ModelEntityListConditionInput.this.otherFailedCount.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.listCreationType.defined) {
                    inputFieldWriter.writeObject("listCreationType", ModelEntityListConditionInput.this.listCreationType.value != 0 ? ((ModelListCreationTypeInput) ModelEntityListConditionInput.this.listCreationType.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.listCategory.defined) {
                    inputFieldWriter.writeObject("listCategory", ModelEntityListConditionInput.this.listCategory.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.listCategory.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.rawBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("rawBulkUploadFileRef", ModelEntityListConditionInput.this.rawBulkUploadFileRef.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.rawBulkUploadFileRef.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.rawBulkUploadFileHash.defined) {
                    inputFieldWriter.writeObject("rawBulkUploadFileHash", ModelEntityListConditionInput.this.rawBulkUploadFileHash.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.rawBulkUploadFileHash.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.modifiedBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("modifiedBulkUploadFileRef", ModelEntityListConditionInput.this.modifiedBulkUploadFileRef.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.modifiedBulkUploadFileRef.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.finalBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("finalBulkUploadFileRef", ModelEntityListConditionInput.this.finalBulkUploadFileRef.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.finalBulkUploadFileRef.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.leadSourceForBulkUpload.defined) {
                    inputFieldWriter.writeObject("leadSourceForBulkUpload", ModelEntityListConditionInput.this.leadSourceForBulkUpload.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.leadSourceForBulkUpload.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.defaultCountryCode.defined) {
                    inputFieldWriter.writeObject("defaultCountryCode", ModelEntityListConditionInput.this.defaultCountryCode.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.defaultCountryCode.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.defaultCountryIso.defined) {
                    inputFieldWriter.writeObject("defaultCountryIso", ModelEntityListConditionInput.this.defaultCountryIso.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.defaultCountryIso.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.notificationBody.defined) {
                    inputFieldWriter.writeObject("notificationBody", ModelEntityListConditionInput.this.notificationBody.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.notificationBody.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.rule.defined) {
                    inputFieldWriter.writeObject("rule", ModelEntityListConditionInput.this.rule.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.rule.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelEntityListConditionInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelEntityListConditionInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.assignedUserId.defined) {
                    inputFieldWriter.writeObject("assignedUserId", ModelEntityListConditionInput.this.assignedUserId.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.assignedUserId.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.assignedTeamId.defined) {
                    inputFieldWriter.writeObject("assignedTeamId", ModelEntityListConditionInput.this.assignedTeamId.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.assignedTeamId.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.associatedDistributionId.defined) {
                    inputFieldWriter.writeObject("associatedDistributionId", ModelEntityListConditionInput.this.associatedDistributionId.value != 0 ? ((ModelIDInput) ModelEntityListConditionInput.this.associatedDistributionId.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeObject("entityActionDefinitionReference", ModelEntityListConditionInput.this.entityActionDefinitionReference.value != 0 ? ((ModelIDInput) ModelEntityListConditionInput.this.entityActionDefinitionReference.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.redistributeEntities.defined) {
                    inputFieldWriter.writeObject("redistributeEntities", ModelEntityListConditionInput.this.redistributeEntities.value != 0 ? ((ModelBooleanInput) ModelEntityListConditionInput.this.redistributeEntities.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.redistributionRequestedAt.defined) {
                    inputFieldWriter.writeObject("redistributionRequestedAt", ModelEntityListConditionInput.this.redistributionRequestedAt.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.redistributionRequestedAt.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.dupliacteLeadList.defined) {
                    inputFieldWriter.writeObject("dupliacteLeadList", ModelEntityListConditionInput.this.dupliacteLeadList.value != 0 ? ((ModelIDInput) ModelEntityListConditionInput.this.dupliacteLeadList.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelEntityListConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.chatMessagePlatform.defined) {
                    inputFieldWriter.writeObject("chatMessagePlatform", ModelEntityListConditionInput.this.chatMessagePlatform.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.chatMessagePlatform.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeObject("allowMultiple", ModelEntityListConditionInput.this.allowMultiple.value != 0 ? ((ModelBooleanInput) ModelEntityListConditionInput.this.allowMultiple.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEntityListConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEntityListConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEntityListConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEntityListConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEntityListConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEntityListConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEntityListConditionInput.this.not.value != 0 ? ((ModelEntityListConditionInput) ModelEntityListConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput modifiedBulkUploadFileRef() {
        return this.modifiedBulkUploadFileRef.value;
    }

    public ModelEntityListConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput notificationBody() {
        return this.notificationBody.value;
    }

    public List<ModelEntityListConditionInput> or() {
        return this.or.value;
    }

    public ModelIntInput otherFailedCount() {
        return this.otherFailedCount.value;
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
