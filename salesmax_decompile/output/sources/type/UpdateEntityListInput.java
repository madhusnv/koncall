package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateEntityListInput implements InputType {
    private final Input<String> accountId;
    private final Input<Boolean> allowMultiple;
    private final Input<String> assignedTeamId;
    private final Input<String> assignedUserId;
    private final Input<String> associatedDistributionId;
    private final Input<String> chatMessagePlatform;
    private final Input<String> createdAt;
    private final Input<String> defaultCountryCode;
    private final Input<String> defaultCountryIso;
    private final Input<String> description;
    private final Input<Integer> doNotTrackCount;
    private final Input<String> dupliacteLeadList;
    private final Input<Integer> duplicateCount;
    private final Input<String> entityActionDefinitionReference;
    private final Input<EntityListType> entityListType;
    private final Input<String> entityTypeInList;
    private final Input<String> finalBulkUploadFileRef;
    private final String id;
    private final Input<Integer> invalidEmailCount;
    private final Input<Integer> invalidNumbersCount;
    private final Input<String> leadSourceForBulkUpload;
    private final Input<String> listCategory;
    private final Input<ListCreationType> listCreationType;
    private final Input<String> listName;
    private final Input<String> modifiedBulkUploadFileRef;
    private final Input<String> notificationBody;
    private final Input<Integer> otherFailedCount;
    private final Input<String> ownerId;
    private final Input<String> rawBulkUploadFileHash;
    private final Input<String> rawBulkUploadFileRef;
    private final Input<Boolean> redistributeEntities;
    private final Input<String> redistributionRequestedAt;
    private final Input<String> rule;
    private final Input<EntityListStatus> status;
    private final Input<Integer> successfulCount;
    private final Input<List<String>> tags;
    private final Input<ContactAssignmentStatus> toBeAssigned;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> entityTypeInList = Input.absent();
        private Input<EntityListType> entityListType = Input.absent();
        private Input<String> listName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<EntityListStatus> status = Input.absent();
        private Input<Integer> successfulCount = Input.absent();
        private Input<Integer> duplicateCount = Input.absent();
        private Input<Integer> invalidNumbersCount = Input.absent();
        private Input<Integer> invalidEmailCount = Input.absent();
        private Input<Integer> doNotTrackCount = Input.absent();
        private Input<Integer> otherFailedCount = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<ListCreationType> listCreationType = Input.absent();
        private Input<String> listCategory = Input.absent();
        private Input<String> rawBulkUploadFileRef = Input.absent();
        private Input<String> rawBulkUploadFileHash = Input.absent();
        private Input<String> modifiedBulkUploadFileRef = Input.absent();
        private Input<String> finalBulkUploadFileRef = Input.absent();
        private Input<String> leadSourceForBulkUpload = Input.absent();
        private Input<String> defaultCountryCode = Input.absent();
        private Input<String> defaultCountryIso = Input.absent();
        private Input<String> notificationBody = Input.absent();
        private Input<String> rule = Input.absent();
        private Input<ContactAssignmentStatus> toBeAssigned = Input.absent();
        private Input<String> assignedUserId = Input.absent();
        private Input<String> assignedTeamId = Input.absent();
        private Input<String> associatedDistributionId = Input.absent();
        private Input<String> entityActionDefinitionReference = Input.absent();
        private Input<Boolean> redistributeEntities = Input.absent();
        private Input<String> redistributionRequestedAt = Input.absent();
        private Input<String> dupliacteLeadList = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<String> chatMessagePlatform = Input.absent();
        private Input<Boolean> allowMultiple = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder allowMultiple(Boolean bool) {
            this.allowMultiple = Input.fromNullable(bool);
            return this;
        }

        public Builder assignedTeamId(String str) {
            this.assignedTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder assignedUserId(String str) {
            this.assignedUserId = Input.fromNullable(str);
            return this;
        }

        public Builder associatedDistributionId(String str) {
            this.associatedDistributionId = Input.fromNullable(str);
            return this;
        }

        public UpdateEntityListInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateEntityListInput(this.id, this.accountId, this.entityTypeInList, this.entityListType, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.ownerId, this.listCreationType, this.listCategory, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt);
        }

        public Builder chatMessagePlatform(String str) {
            this.chatMessagePlatform = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder defaultCountryCode(String str) {
            this.defaultCountryCode = Input.fromNullable(str);
            return this;
        }

        public Builder defaultCountryIso(String str) {
            this.defaultCountryIso = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder doNotTrackCount(Integer num) {
            this.doNotTrackCount = Input.fromNullable(num);
            return this;
        }

        public Builder dupliacteLeadList(String str) {
            this.dupliacteLeadList = Input.fromNullable(str);
            return this;
        }

        public Builder duplicateCount(Integer num) {
            this.duplicateCount = Input.fromNullable(num);
            return this;
        }

        public Builder entityActionDefinitionReference(String str) {
            this.entityActionDefinitionReference = Input.fromNullable(str);
            return this;
        }

        public Builder entityListType(EntityListType entityListType) {
            this.entityListType = Input.fromNullable(entityListType);
            return this;
        }

        public Builder entityTypeInList(String str) {
            this.entityTypeInList = Input.fromNullable(str);
            return this;
        }

        public Builder finalBulkUploadFileRef(String str) {
            this.finalBulkUploadFileRef = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder invalidEmailCount(Integer num) {
            this.invalidEmailCount = Input.fromNullable(num);
            return this;
        }

        public Builder invalidNumbersCount(Integer num) {
            this.invalidNumbersCount = Input.fromNullable(num);
            return this;
        }

        public Builder leadSourceForBulkUpload(String str) {
            this.leadSourceForBulkUpload = Input.fromNullable(str);
            return this;
        }

        public Builder listCategory(String str) {
            this.listCategory = Input.fromNullable(str);
            return this;
        }

        public Builder listCreationType(ListCreationType listCreationType) {
            this.listCreationType = Input.fromNullable(listCreationType);
            return this;
        }

        public Builder listName(String str) {
            this.listName = Input.fromNullable(str);
            return this;
        }

        public Builder modifiedBulkUploadFileRef(String str) {
            this.modifiedBulkUploadFileRef = Input.fromNullable(str);
            return this;
        }

        public Builder notificationBody(String str) {
            this.notificationBody = Input.fromNullable(str);
            return this;
        }

        public Builder otherFailedCount(Integer num) {
            this.otherFailedCount = Input.fromNullable(num);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder rawBulkUploadFileHash(String str) {
            this.rawBulkUploadFileHash = Input.fromNullable(str);
            return this;
        }

        public Builder rawBulkUploadFileRef(String str) {
            this.rawBulkUploadFileRef = Input.fromNullable(str);
            return this;
        }

        public Builder redistributeEntities(Boolean bool) {
            this.redistributeEntities = Input.fromNullable(bool);
            return this;
        }

        public Builder redistributionRequestedAt(String str) {
            this.redistributionRequestedAt = Input.fromNullable(str);
            return this;
        }

        public Builder rule(String str) {
            this.rule = Input.fromNullable(str);
            return this;
        }

        public Builder status(EntityListStatus entityListStatus) {
            this.status = Input.fromNullable(entityListStatus);
            return this;
        }

        public Builder successfulCount(Integer num) {
            this.successfulCount = Input.fromNullable(num);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = Input.fromNullable(contactAssignmentStatus);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateEntityListInput(String str, Input<String> input, Input<String> input2, Input<EntityListType> input3, Input<String> input4, Input<String> input5, Input<EntityListStatus> input6, Input<Integer> input7, Input<Integer> input8, Input<Integer> input9, Input<Integer> input10, Input<Integer> input11, Input<Integer> input12, Input<String> input13, Input<ListCreationType> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<ContactAssignmentStatus> input25, Input<String> input26, Input<String> input27, Input<String> input28, Input<String> input29, Input<Boolean> input30, Input<String> input31, Input<String> input32, Input<List<String>> input33, Input<String> input34, Input<Boolean> input35, Input<String> input36, Input<String> input37) {
        this.id = str;
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
        this.ownerId = input13;
        this.listCreationType = input14;
        this.listCategory = input15;
        this.rawBulkUploadFileRef = input16;
        this.rawBulkUploadFileHash = input17;
        this.modifiedBulkUploadFileRef = input18;
        this.finalBulkUploadFileRef = input19;
        this.leadSourceForBulkUpload = input20;
        this.defaultCountryCode = input21;
        this.defaultCountryIso = input22;
        this.notificationBody = input23;
        this.rule = input24;
        this.toBeAssigned = input25;
        this.assignedUserId = input26;
        this.assignedTeamId = input27;
        this.associatedDistributionId = input28;
        this.entityActionDefinitionReference = input29;
        this.redistributeEntities = input30;
        this.redistributionRequestedAt = input31;
        this.dupliacteLeadList = input32;
        this.tags = input33;
        this.chatMessagePlatform = input34;
        this.allowMultiple = input35;
        this.createdAt = input36;
        this.updatedAt = input37;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Boolean allowMultiple() {
        return this.allowMultiple.value;
    }

    public String assignedTeamId() {
        return this.assignedTeamId.value;
    }

    public String assignedUserId() {
        return this.assignedUserId.value;
    }

    public String associatedDistributionId() {
        return this.associatedDistributionId.value;
    }

    public String chatMessagePlatform() {
        return this.chatMessagePlatform.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String defaultCountryCode() {
        return this.defaultCountryCode.value;
    }

    public String defaultCountryIso() {
        return this.defaultCountryIso.value;
    }

    public String description() {
        return this.description.value;
    }

    public Integer doNotTrackCount() {
        return this.doNotTrackCount.value;
    }

    public String dupliacteLeadList() {
        return this.dupliacteLeadList.value;
    }

    public Integer duplicateCount() {
        return this.duplicateCount.value;
    }

    public String entityActionDefinitionReference() {
        return this.entityActionDefinitionReference.value;
    }

    public EntityListType entityListType() {
        return this.entityListType.value;
    }

    public String entityTypeInList() {
        return this.entityTypeInList.value;
    }

    public String finalBulkUploadFileRef() {
        return this.finalBulkUploadFileRef.value;
    }

    public String id() {
        return this.id;
    }

    public Integer invalidEmailCount() {
        return this.invalidEmailCount.value;
    }

    public Integer invalidNumbersCount() {
        return this.invalidNumbersCount.value;
    }

    public String leadSourceForBulkUpload() {
        return this.leadSourceForBulkUpload.value;
    }

    public String listCategory() {
        return this.listCategory.value;
    }

    public ListCreationType listCreationType() {
        return this.listCreationType.value;
    }

    public String listName() {
        return this.listName.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateEntityListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateEntityListInput.this.id);
                if (UpdateEntityListInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateEntityListInput.this.accountId.value);
                }
                if (UpdateEntityListInput.this.entityTypeInList.defined) {
                    inputFieldWriter.writeString("entityTypeInList", (String) UpdateEntityListInput.this.entityTypeInList.value);
                }
                if (UpdateEntityListInput.this.entityListType.defined) {
                    inputFieldWriter.writeString("entityListType", UpdateEntityListInput.this.entityListType.value != 0 ? ((EntityListType) UpdateEntityListInput.this.entityListType.value).name() : null);
                }
                if (UpdateEntityListInput.this.listName.defined) {
                    inputFieldWriter.writeString("listName", (String) UpdateEntityListInput.this.listName.value);
                }
                if (UpdateEntityListInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateEntityListInput.this.description.value);
                }
                if (UpdateEntityListInput.this.status.defined) {
                    inputFieldWriter.writeString("status", UpdateEntityListInput.this.status.value != 0 ? ((EntityListStatus) UpdateEntityListInput.this.status.value).name() : null);
                }
                if (UpdateEntityListInput.this.successfulCount.defined) {
                    inputFieldWriter.writeInt("successfulCount", (Integer) UpdateEntityListInput.this.successfulCount.value);
                }
                if (UpdateEntityListInput.this.duplicateCount.defined) {
                    inputFieldWriter.writeInt("duplicateCount", (Integer) UpdateEntityListInput.this.duplicateCount.value);
                }
                if (UpdateEntityListInput.this.invalidNumbersCount.defined) {
                    inputFieldWriter.writeInt("invalidNumbersCount", (Integer) UpdateEntityListInput.this.invalidNumbersCount.value);
                }
                if (UpdateEntityListInput.this.invalidEmailCount.defined) {
                    inputFieldWriter.writeInt("invalidEmailCount", (Integer) UpdateEntityListInput.this.invalidEmailCount.value);
                }
                if (UpdateEntityListInput.this.doNotTrackCount.defined) {
                    inputFieldWriter.writeInt("doNotTrackCount", (Integer) UpdateEntityListInput.this.doNotTrackCount.value);
                }
                if (UpdateEntityListInput.this.otherFailedCount.defined) {
                    inputFieldWriter.writeInt("otherFailedCount", (Integer) UpdateEntityListInput.this.otherFailedCount.value);
                }
                if (UpdateEntityListInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateEntityListInput.this.ownerId.value);
                }
                if (UpdateEntityListInput.this.listCreationType.defined) {
                    inputFieldWriter.writeString("listCreationType", UpdateEntityListInput.this.listCreationType.value != 0 ? ((ListCreationType) UpdateEntityListInput.this.listCreationType.value).name() : null);
                }
                if (UpdateEntityListInput.this.listCategory.defined) {
                    inputFieldWriter.writeString("listCategory", (String) UpdateEntityListInput.this.listCategory.value);
                }
                if (UpdateEntityListInput.this.rawBulkUploadFileRef.defined) {
                    inputFieldWriter.writeString("rawBulkUploadFileRef", (String) UpdateEntityListInput.this.rawBulkUploadFileRef.value);
                }
                if (UpdateEntityListInput.this.rawBulkUploadFileHash.defined) {
                    inputFieldWriter.writeString("rawBulkUploadFileHash", (String) UpdateEntityListInput.this.rawBulkUploadFileHash.value);
                }
                if (UpdateEntityListInput.this.modifiedBulkUploadFileRef.defined) {
                    inputFieldWriter.writeString("modifiedBulkUploadFileRef", (String) UpdateEntityListInput.this.modifiedBulkUploadFileRef.value);
                }
                if (UpdateEntityListInput.this.finalBulkUploadFileRef.defined) {
                    inputFieldWriter.writeString("finalBulkUploadFileRef", (String) UpdateEntityListInput.this.finalBulkUploadFileRef.value);
                }
                if (UpdateEntityListInput.this.leadSourceForBulkUpload.defined) {
                    inputFieldWriter.writeString("leadSourceForBulkUpload", (String) UpdateEntityListInput.this.leadSourceForBulkUpload.value);
                }
                if (UpdateEntityListInput.this.defaultCountryCode.defined) {
                    inputFieldWriter.writeString("defaultCountryCode", (String) UpdateEntityListInput.this.defaultCountryCode.value);
                }
                if (UpdateEntityListInput.this.defaultCountryIso.defined) {
                    inputFieldWriter.writeString("defaultCountryIso", (String) UpdateEntityListInput.this.defaultCountryIso.value);
                }
                if (UpdateEntityListInput.this.notificationBody.defined) {
                    inputFieldWriter.writeString("notificationBody", (String) UpdateEntityListInput.this.notificationBody.value);
                }
                if (UpdateEntityListInput.this.rule.defined) {
                    inputFieldWriter.writeString("rule", (String) UpdateEntityListInput.this.rule.value);
                }
                if (UpdateEntityListInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", UpdateEntityListInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) UpdateEntityListInput.this.toBeAssigned.value).name() : null);
                }
                if (UpdateEntityListInput.this.assignedUserId.defined) {
                    inputFieldWriter.writeString("assignedUserId", (String) UpdateEntityListInput.this.assignedUserId.value);
                }
                if (UpdateEntityListInput.this.assignedTeamId.defined) {
                    inputFieldWriter.writeString("assignedTeamId", (String) UpdateEntityListInput.this.assignedTeamId.value);
                }
                if (UpdateEntityListInput.this.associatedDistributionId.defined) {
                    inputFieldWriter.writeString("associatedDistributionId", (String) UpdateEntityListInput.this.associatedDistributionId.value);
                }
                if (UpdateEntityListInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeString("entityActionDefinitionReference", (String) UpdateEntityListInput.this.entityActionDefinitionReference.value);
                }
                if (UpdateEntityListInput.this.redistributeEntities.defined) {
                    inputFieldWriter.writeBoolean("redistributeEntities", (Boolean) UpdateEntityListInput.this.redistributeEntities.value);
                }
                if (UpdateEntityListInput.this.redistributionRequestedAt.defined) {
                    inputFieldWriter.writeString("redistributionRequestedAt", (String) UpdateEntityListInput.this.redistributionRequestedAt.value);
                }
                if (UpdateEntityListInput.this.dupliacteLeadList.defined) {
                    inputFieldWriter.writeString("dupliacteLeadList", (String) UpdateEntityListInput.this.dupliacteLeadList.value);
                }
                if (UpdateEntityListInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", UpdateEntityListInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateEntityListInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateEntityListInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateEntityListInput.this.chatMessagePlatform.defined) {
                    inputFieldWriter.writeString("chatMessagePlatform", (String) UpdateEntityListInput.this.chatMessagePlatform.value);
                }
                if (UpdateEntityListInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeBoolean("allowMultiple", (Boolean) UpdateEntityListInput.this.allowMultiple.value);
                }
                if (UpdateEntityListInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateEntityListInput.this.createdAt.value);
                }
                if (UpdateEntityListInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateEntityListInput.this.updatedAt.value);
                }
            }
        };
    }

    public String modifiedBulkUploadFileRef() {
        return this.modifiedBulkUploadFileRef.value;
    }

    public String notificationBody() {
        return this.notificationBody.value;
    }

    public Integer otherFailedCount() {
        return this.otherFailedCount.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String rawBulkUploadFileHash() {
        return this.rawBulkUploadFileHash.value;
    }

    public String rawBulkUploadFileRef() {
        return this.rawBulkUploadFileRef.value;
    }

    public Boolean redistributeEntities() {
        return this.redistributeEntities.value;
    }

    public String redistributionRequestedAt() {
        return this.redistributionRequestedAt.value;
    }

    public String rule() {
        return this.rule.value;
    }

    public EntityListStatus status() {
        return this.status.value;
    }

    public Integer successfulCount() {
        return this.successfulCount.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public ContactAssignmentStatus toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
