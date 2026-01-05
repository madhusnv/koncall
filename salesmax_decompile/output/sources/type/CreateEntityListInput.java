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
public final class CreateEntityListInput implements InputType {
    private final String accountId;
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
    private final EntityListType entityListType;
    private final String entityTypeInList;
    private final Input<String> finalBulkUploadFileRef;
    private final Input<String> id;
    private final Input<Integer> invalidEmailCount;
    private final Input<Integer> invalidNumbersCount;
    private final Input<String> leadSourceForBulkUpload;
    private final Input<String> listCategory;
    private final ListCreationType listCreationType;
    private final Input<String> listName;
    private final Input<String> modifiedBulkUploadFileRef;
    private final Input<String> notificationBody;
    private final Input<Integer> otherFailedCount;
    private final String ownerId;
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
        private String accountId;
        private EntityListType entityListType;
        private String entityTypeInList;
        private ListCreationType listCreationType;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<String> listName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<EntityListStatus> status = Input.absent();
        private Input<Integer> successfulCount = Input.absent();
        private Input<Integer> duplicateCount = Input.absent();
        private Input<Integer> invalidNumbersCount = Input.absent();
        private Input<Integer> invalidEmailCount = Input.absent();
        private Input<Integer> doNotTrackCount = Input.absent();
        private Input<Integer> otherFailedCount = Input.absent();
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
            this.accountId = str;
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

        public CreateEntityListInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.entityTypeInList, "entityTypeInList == null");
            Utils.checkNotNull(this.entityListType, "entityListType == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.listCreationType, "listCreationType == null");
            return new CreateEntityListInput(this.id, this.accountId, this.entityTypeInList, this.entityListType, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.ownerId, this.listCreationType, this.listCategory, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt);
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
            this.entityListType = entityListType;
            return this;
        }

        public Builder entityTypeInList(String str) {
            this.entityTypeInList = str;
            return this;
        }

        public Builder finalBulkUploadFileRef(String str) {
            this.finalBulkUploadFileRef = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
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
            this.listCreationType = listCreationType;
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
            this.ownerId = str;
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

    public CreateEntityListInput(Input<String> input, String str, String str2, EntityListType entityListType, Input<String> input2, Input<String> input3, Input<EntityListStatus> input4, Input<Integer> input5, Input<Integer> input6, Input<Integer> input7, Input<Integer> input8, Input<Integer> input9, Input<Integer> input10, String str3, ListCreationType listCreationType, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<ContactAssignmentStatus> input21, Input<String> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<Boolean> input26, Input<String> input27, Input<String> input28, Input<List<String>> input29, Input<String> input30, Input<Boolean> input31, Input<String> input32, Input<String> input33) {
        this.id = input;
        this.accountId = str;
        this.entityTypeInList = str2;
        this.entityListType = entityListType;
        this.listName = input2;
        this.description = input3;
        this.status = input4;
        this.successfulCount = input5;
        this.duplicateCount = input6;
        this.invalidNumbersCount = input7;
        this.invalidEmailCount = input8;
        this.doNotTrackCount = input9;
        this.otherFailedCount = input10;
        this.ownerId = str3;
        this.listCreationType = listCreationType;
        this.listCategory = input11;
        this.rawBulkUploadFileRef = input12;
        this.rawBulkUploadFileHash = input13;
        this.modifiedBulkUploadFileRef = input14;
        this.finalBulkUploadFileRef = input15;
        this.leadSourceForBulkUpload = input16;
        this.defaultCountryCode = input17;
        this.defaultCountryIso = input18;
        this.notificationBody = input19;
        this.rule = input20;
        this.toBeAssigned = input21;
        this.assignedUserId = input22;
        this.assignedTeamId = input23;
        this.associatedDistributionId = input24;
        this.entityActionDefinitionReference = input25;
        this.redistributeEntities = input26;
        this.redistributionRequestedAt = input27;
        this.dupliacteLeadList = input28;
        this.tags = input29;
        this.chatMessagePlatform = input30;
        this.allowMultiple = input31;
        this.createdAt = input32;
        this.updatedAt = input33;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.entityListType;
    }

    public String entityTypeInList() {
        return this.entityTypeInList;
    }

    public String finalBulkUploadFileRef() {
        return this.finalBulkUploadFileRef.value;
    }

    public String id() {
        return this.id.value;
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
        return this.listCreationType;
    }

    public String listName() {
        return this.listName.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateEntityListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateEntityListInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateEntityListInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateEntityListInput.this.accountId);
                inputFieldWriter.writeString("entityTypeInList", CreateEntityListInput.this.entityTypeInList);
                inputFieldWriter.writeString("entityListType", CreateEntityListInput.this.entityListType.name());
                if (CreateEntityListInput.this.listName.defined) {
                    inputFieldWriter.writeString("listName", (String) CreateEntityListInput.this.listName.value);
                }
                if (CreateEntityListInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) CreateEntityListInput.this.description.value);
                }
                if (CreateEntityListInput.this.status.defined) {
                    inputFieldWriter.writeString("status", CreateEntityListInput.this.status.value != 0 ? ((EntityListStatus) CreateEntityListInput.this.status.value).name() : null);
                }
                if (CreateEntityListInput.this.successfulCount.defined) {
                    inputFieldWriter.writeInt("successfulCount", (Integer) CreateEntityListInput.this.successfulCount.value);
                }
                if (CreateEntityListInput.this.duplicateCount.defined) {
                    inputFieldWriter.writeInt("duplicateCount", (Integer) CreateEntityListInput.this.duplicateCount.value);
                }
                if (CreateEntityListInput.this.invalidNumbersCount.defined) {
                    inputFieldWriter.writeInt("invalidNumbersCount", (Integer) CreateEntityListInput.this.invalidNumbersCount.value);
                }
                if (CreateEntityListInput.this.invalidEmailCount.defined) {
                    inputFieldWriter.writeInt("invalidEmailCount", (Integer) CreateEntityListInput.this.invalidEmailCount.value);
                }
                if (CreateEntityListInput.this.doNotTrackCount.defined) {
                    inputFieldWriter.writeInt("doNotTrackCount", (Integer) CreateEntityListInput.this.doNotTrackCount.value);
                }
                if (CreateEntityListInput.this.otherFailedCount.defined) {
                    inputFieldWriter.writeInt("otherFailedCount", (Integer) CreateEntityListInput.this.otherFailedCount.value);
                }
                inputFieldWriter.writeString("ownerId", CreateEntityListInput.this.ownerId);
                inputFieldWriter.writeString("listCreationType", CreateEntityListInput.this.listCreationType.name());
                if (CreateEntityListInput.this.listCategory.defined) {
                    inputFieldWriter.writeString("listCategory", (String) CreateEntityListInput.this.listCategory.value);
                }
                if (CreateEntityListInput.this.rawBulkUploadFileRef.defined) {
                    inputFieldWriter.writeString("rawBulkUploadFileRef", (String) CreateEntityListInput.this.rawBulkUploadFileRef.value);
                }
                if (CreateEntityListInput.this.rawBulkUploadFileHash.defined) {
                    inputFieldWriter.writeString("rawBulkUploadFileHash", (String) CreateEntityListInput.this.rawBulkUploadFileHash.value);
                }
                if (CreateEntityListInput.this.modifiedBulkUploadFileRef.defined) {
                    inputFieldWriter.writeString("modifiedBulkUploadFileRef", (String) CreateEntityListInput.this.modifiedBulkUploadFileRef.value);
                }
                if (CreateEntityListInput.this.finalBulkUploadFileRef.defined) {
                    inputFieldWriter.writeString("finalBulkUploadFileRef", (String) CreateEntityListInput.this.finalBulkUploadFileRef.value);
                }
                if (CreateEntityListInput.this.leadSourceForBulkUpload.defined) {
                    inputFieldWriter.writeString("leadSourceForBulkUpload", (String) CreateEntityListInput.this.leadSourceForBulkUpload.value);
                }
                if (CreateEntityListInput.this.defaultCountryCode.defined) {
                    inputFieldWriter.writeString("defaultCountryCode", (String) CreateEntityListInput.this.defaultCountryCode.value);
                }
                if (CreateEntityListInput.this.defaultCountryIso.defined) {
                    inputFieldWriter.writeString("defaultCountryIso", (String) CreateEntityListInput.this.defaultCountryIso.value);
                }
                if (CreateEntityListInput.this.notificationBody.defined) {
                    inputFieldWriter.writeString("notificationBody", (String) CreateEntityListInput.this.notificationBody.value);
                }
                if (CreateEntityListInput.this.rule.defined) {
                    inputFieldWriter.writeString("rule", (String) CreateEntityListInput.this.rule.value);
                }
                if (CreateEntityListInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", CreateEntityListInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) CreateEntityListInput.this.toBeAssigned.value).name() : null);
                }
                if (CreateEntityListInput.this.assignedUserId.defined) {
                    inputFieldWriter.writeString("assignedUserId", (String) CreateEntityListInput.this.assignedUserId.value);
                }
                if (CreateEntityListInput.this.assignedTeamId.defined) {
                    inputFieldWriter.writeString("assignedTeamId", (String) CreateEntityListInput.this.assignedTeamId.value);
                }
                if (CreateEntityListInput.this.associatedDistributionId.defined) {
                    inputFieldWriter.writeString("associatedDistributionId", (String) CreateEntityListInput.this.associatedDistributionId.value);
                }
                if (CreateEntityListInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeString("entityActionDefinitionReference", (String) CreateEntityListInput.this.entityActionDefinitionReference.value);
                }
                if (CreateEntityListInput.this.redistributeEntities.defined) {
                    inputFieldWriter.writeBoolean("redistributeEntities", (Boolean) CreateEntityListInput.this.redistributeEntities.value);
                }
                if (CreateEntityListInput.this.redistributionRequestedAt.defined) {
                    inputFieldWriter.writeString("redistributionRequestedAt", (String) CreateEntityListInput.this.redistributionRequestedAt.value);
                }
                if (CreateEntityListInput.this.dupliacteLeadList.defined) {
                    inputFieldWriter.writeString("dupliacteLeadList", (String) CreateEntityListInput.this.dupliacteLeadList.value);
                }
                if (CreateEntityListInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateEntityListInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateEntityListInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateEntityListInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateEntityListInput.this.chatMessagePlatform.defined) {
                    inputFieldWriter.writeString("chatMessagePlatform", (String) CreateEntityListInput.this.chatMessagePlatform.value);
                }
                if (CreateEntityListInput.this.allowMultiple.defined) {
                    inputFieldWriter.writeBoolean("allowMultiple", (Boolean) CreateEntityListInput.this.allowMultiple.value);
                }
                if (CreateEntityListInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateEntityListInput.this.createdAt.value);
                }
                if (CreateEntityListInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateEntityListInput.this.updatedAt.value);
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
        return this.ownerId;
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
