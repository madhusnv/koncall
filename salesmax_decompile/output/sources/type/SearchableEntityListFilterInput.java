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
public final class SearchableEntityListFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableEntityListFilterInput>> and;
    private final Input<SearchableStringFilterInput> assignedTeamId;
    private final Input<SearchableStringFilterInput> assignedUserId;
    private final Input<SearchableIDFilterInput> associatedDistributionId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> defaultCountryCode;
    private final Input<SearchableStringFilterInput> defaultCountryIso;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableIntFilterInput> doNotTrackCount;
    private final Input<SearchableIntFilterInput> duplicateCount;
    private final Input<SearchableIDFilterInput> entityActionDefinitionReference;
    private final Input<SearchableStringFilterInput> entityListType;
    private final Input<SearchableStringFilterInput> entityTypeInList;
    private final Input<SearchableStringFilterInput> finalBulkUploadFileRef;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableIntFilterInput> invalidEmailCount;
    private final Input<SearchableIntFilterInput> invalidNumbersCount;
    private final Input<SearchableStringFilterInput> leadSourceForBulkUpload;
    private final Input<SearchableStringFilterInput> listCategory;
    private final Input<SearchableStringFilterInput> listCreationType;
    private final Input<SearchableStringFilterInput> listName;
    private final Input<SearchableStringFilterInput> modifiedBulkUploadFileRef;
    private final Input<SearchableEntityListFilterInput> not;
    private final Input<SearchableStringFilterInput> notificationBody;
    private final Input<List<SearchableEntityListFilterInput>> or;
    private final Input<SearchableIntFilterInput> otherFailedCount;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableStringFilterInput> rawBulkUploadFileHash;
    private final Input<SearchableStringFilterInput> rawBulkUploadFileRef;
    private final Input<SearchableBooleanFilterInput> redistributeEntities;
    private final Input<SearchableStringFilterInput> redistributionRequestedAt;
    private final Input<SearchableStringFilterInput> rule;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableIntFilterInput> successfulCount;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> entityTypeInList = Input.absent();
        private Input<SearchableStringFilterInput> entityListType = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> listCreationType = Input.absent();
        private Input<SearchableStringFilterInput> listCategory = Input.absent();
        private Input<SearchableStringFilterInput> listName = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableIntFilterInput> successfulCount = Input.absent();
        private Input<SearchableIntFilterInput> duplicateCount = Input.absent();
        private Input<SearchableIntFilterInput> invalidNumbersCount = Input.absent();
        private Input<SearchableIntFilterInput> doNotTrackCount = Input.absent();
        private Input<SearchableIntFilterInput> invalidEmailCount = Input.absent();
        private Input<SearchableIntFilterInput> otherFailedCount = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableStringFilterInput> rawBulkUploadFileRef = Input.absent();
        private Input<SearchableStringFilterInput> rawBulkUploadFileHash = Input.absent();
        private Input<SearchableStringFilterInput> modifiedBulkUploadFileRef = Input.absent();
        private Input<SearchableStringFilterInput> finalBulkUploadFileRef = Input.absent();
        private Input<SearchableStringFilterInput> leadSourceForBulkUpload = Input.absent();
        private Input<SearchableStringFilterInput> defaultCountryCode = Input.absent();
        private Input<SearchableStringFilterInput> defaultCountryIso = Input.absent();
        private Input<SearchableStringFilterInput> notificationBody = Input.absent();
        private Input<SearchableStringFilterInput> rule = Input.absent();
        private Input<SearchableStringFilterInput> assignedUserId = Input.absent();
        private Input<SearchableStringFilterInput> assignedTeamId = Input.absent();
        private Input<SearchableIDFilterInput> associatedDistributionId = Input.absent();
        private Input<SearchableIDFilterInput> entityActionDefinitionReference = Input.absent();
        private Input<SearchableBooleanFilterInput> redistributeEntities = Input.absent();
        private Input<SearchableStringFilterInput> redistributionRequestedAt = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableEntityListFilterInput>> and = Input.absent();
        private Input<List<SearchableEntityListFilterInput>> or = Input.absent();
        private Input<SearchableEntityListFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableEntityListFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder assignedTeamId(SearchableStringFilterInput searchableStringFilterInput) {
            this.assignedTeamId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder assignedUserId(SearchableStringFilterInput searchableStringFilterInput) {
            this.assignedUserId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder associatedDistributionId(SearchableIDFilterInput searchableIDFilterInput) {
            this.associatedDistributionId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public SearchableEntityListFilterInput build() {
            return new SearchableEntityListFilterInput(this.id, this.accountId, this.entityTypeInList, this.entityListType, this.status, this.listCreationType, this.listCategory, this.listName, this.description, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.doNotTrackCount, this.invalidEmailCount, this.otherFailedCount, this.ownerId, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.tags, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder defaultCountryCode(SearchableStringFilterInput searchableStringFilterInput) {
            this.defaultCountryCode = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder defaultCountryIso(SearchableStringFilterInput searchableStringFilterInput) {
            this.defaultCountryIso = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder doNotTrackCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.doNotTrackCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder duplicateCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.duplicateCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder entityActionDefinitionReference(SearchableIDFilterInput searchableIDFilterInput) {
            this.entityActionDefinitionReference = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder entityListType(SearchableStringFilterInput searchableStringFilterInput) {
            this.entityListType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder entityTypeInList(SearchableStringFilterInput searchableStringFilterInput) {
            this.entityTypeInList = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder finalBulkUploadFileRef(SearchableStringFilterInput searchableStringFilterInput) {
            this.finalBulkUploadFileRef = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder invalidEmailCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.invalidEmailCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder invalidNumbersCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.invalidNumbersCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder leadSourceForBulkUpload(SearchableStringFilterInput searchableStringFilterInput) {
            this.leadSourceForBulkUpload = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder listCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.listCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder listCreationType(SearchableStringFilterInput searchableStringFilterInput) {
            this.listCreationType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder listName(SearchableStringFilterInput searchableStringFilterInput) {
            this.listName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder modifiedBulkUploadFileRef(SearchableStringFilterInput searchableStringFilterInput) {
            this.modifiedBulkUploadFileRef = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableEntityListFilterInput searchableEntityListFilterInput) {
            this.not = Input.fromNullable(searchableEntityListFilterInput);
            return this;
        }

        public Builder notificationBody(SearchableStringFilterInput searchableStringFilterInput) {
            this.notificationBody = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchableEntityListFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder otherFailedCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.otherFailedCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder rawBulkUploadFileHash(SearchableStringFilterInput searchableStringFilterInput) {
            this.rawBulkUploadFileHash = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder rawBulkUploadFileRef(SearchableStringFilterInput searchableStringFilterInput) {
            this.rawBulkUploadFileRef = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder redistributeEntities(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.redistributeEntities = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder redistributionRequestedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.redistributionRequestedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder rule(SearchableStringFilterInput searchableStringFilterInput) {
            this.rule = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder successfulCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.successfulCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableEntityListFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableIntFilterInput> input10, Input<SearchableIntFilterInput> input11, Input<SearchableIntFilterInput> input12, Input<SearchableIntFilterInput> input13, Input<SearchableIntFilterInput> input14, Input<SearchableIntFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableIDFilterInput> input28, Input<SearchableIDFilterInput> input29, Input<SearchableBooleanFilterInput> input30, Input<SearchableStringFilterInput> input31, Input<SearchableStringFilterInput> input32, Input<SearchableStringFilterInput> input33, Input<SearchableStringFilterInput> input34, Input<List<SearchableEntityListFilterInput>> input35, Input<List<SearchableEntityListFilterInput>> input36, Input<SearchableEntityListFilterInput> input37) {
        this.id = input;
        this.accountId = input2;
        this.entityTypeInList = input3;
        this.entityListType = input4;
        this.status = input5;
        this.listCreationType = input6;
        this.listCategory = input7;
        this.listName = input8;
        this.description = input9;
        this.successfulCount = input10;
        this.duplicateCount = input11;
        this.invalidNumbersCount = input12;
        this.doNotTrackCount = input13;
        this.invalidEmailCount = input14;
        this.otherFailedCount = input15;
        this.ownerId = input16;
        this.rawBulkUploadFileRef = input17;
        this.rawBulkUploadFileHash = input18;
        this.modifiedBulkUploadFileRef = input19;
        this.finalBulkUploadFileRef = input20;
        this.leadSourceForBulkUpload = input21;
        this.defaultCountryCode = input22;
        this.defaultCountryIso = input23;
        this.notificationBody = input24;
        this.rule = input25;
        this.assignedUserId = input26;
        this.assignedTeamId = input27;
        this.associatedDistributionId = input28;
        this.entityActionDefinitionReference = input29;
        this.redistributeEntities = input30;
        this.redistributionRequestedAt = input31;
        this.tags = input32;
        this.createdAt = input33;
        this.updatedAt = input34;
        this.and = input35;
        this.or = input36;
        this.not = input37;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableEntityListFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput assignedTeamId() {
        return this.assignedTeamId.value;
    }

    public SearchableStringFilterInput assignedUserId() {
        return this.assignedUserId.value;
    }

    public SearchableIDFilterInput associatedDistributionId() {
        return this.associatedDistributionId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput defaultCountryCode() {
        return this.defaultCountryCode.value;
    }

    public SearchableStringFilterInput defaultCountryIso() {
        return this.defaultCountryIso.value;
    }

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableIntFilterInput doNotTrackCount() {
        return this.doNotTrackCount.value;
    }

    public SearchableIntFilterInput duplicateCount() {
        return this.duplicateCount.value;
    }

    public SearchableIDFilterInput entityActionDefinitionReference() {
        return this.entityActionDefinitionReference.value;
    }

    public SearchableStringFilterInput entityListType() {
        return this.entityListType.value;
    }

    public SearchableStringFilterInput entityTypeInList() {
        return this.entityTypeInList.value;
    }

    public SearchableStringFilterInput finalBulkUploadFileRef() {
        return this.finalBulkUploadFileRef.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableIntFilterInput invalidEmailCount() {
        return this.invalidEmailCount.value;
    }

    public SearchableIntFilterInput invalidNumbersCount() {
        return this.invalidNumbersCount.value;
    }

    public SearchableStringFilterInput leadSourceForBulkUpload() {
        return this.leadSourceForBulkUpload.value;
    }

    public SearchableStringFilterInput listCategory() {
        return this.listCategory.value;
    }

    public SearchableStringFilterInput listCreationType() {
        return this.listCreationType.value;
    }

    public SearchableStringFilterInput listName() {
        return this.listName.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableEntityListFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableEntityListFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableEntityListFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableEntityListFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableEntityListFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableEntityListFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.entityTypeInList.defined) {
                    inputFieldWriter.writeObject("entityTypeInList", SearchableEntityListFilterInput.this.entityTypeInList.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.entityTypeInList.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.entityListType.defined) {
                    inputFieldWriter.writeObject("entityListType", SearchableEntityListFilterInput.this.entityListType.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.entityListType.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableEntityListFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.listCreationType.defined) {
                    inputFieldWriter.writeObject("listCreationType", SearchableEntityListFilterInput.this.listCreationType.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.listCreationType.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.listCategory.defined) {
                    inputFieldWriter.writeObject("listCategory", SearchableEntityListFilterInput.this.listCategory.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.listCategory.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.listName.defined) {
                    inputFieldWriter.writeObject("listName", SearchableEntityListFilterInput.this.listName.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.listName.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableEntityListFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.successfulCount.defined) {
                    inputFieldWriter.writeObject("successfulCount", SearchableEntityListFilterInput.this.successfulCount.value != 0 ? ((SearchableIntFilterInput) SearchableEntityListFilterInput.this.successfulCount.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.duplicateCount.defined) {
                    inputFieldWriter.writeObject("duplicateCount", SearchableEntityListFilterInput.this.duplicateCount.value != 0 ? ((SearchableIntFilterInput) SearchableEntityListFilterInput.this.duplicateCount.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.invalidNumbersCount.defined) {
                    inputFieldWriter.writeObject("invalidNumbersCount", SearchableEntityListFilterInput.this.invalidNumbersCount.value != 0 ? ((SearchableIntFilterInput) SearchableEntityListFilterInput.this.invalidNumbersCount.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.doNotTrackCount.defined) {
                    inputFieldWriter.writeObject("doNotTrackCount", SearchableEntityListFilterInput.this.doNotTrackCount.value != 0 ? ((SearchableIntFilterInput) SearchableEntityListFilterInput.this.doNotTrackCount.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.invalidEmailCount.defined) {
                    inputFieldWriter.writeObject("invalidEmailCount", SearchableEntityListFilterInput.this.invalidEmailCount.value != 0 ? ((SearchableIntFilterInput) SearchableEntityListFilterInput.this.invalidEmailCount.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.otherFailedCount.defined) {
                    inputFieldWriter.writeObject("otherFailedCount", SearchableEntityListFilterInput.this.otherFailedCount.value != 0 ? ((SearchableIntFilterInput) SearchableEntityListFilterInput.this.otherFailedCount.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableEntityListFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableEntityListFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.rawBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("rawBulkUploadFileRef", SearchableEntityListFilterInput.this.rawBulkUploadFileRef.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.rawBulkUploadFileRef.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.rawBulkUploadFileHash.defined) {
                    inputFieldWriter.writeObject("rawBulkUploadFileHash", SearchableEntityListFilterInput.this.rawBulkUploadFileHash.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.rawBulkUploadFileHash.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.modifiedBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("modifiedBulkUploadFileRef", SearchableEntityListFilterInput.this.modifiedBulkUploadFileRef.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.modifiedBulkUploadFileRef.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.finalBulkUploadFileRef.defined) {
                    inputFieldWriter.writeObject("finalBulkUploadFileRef", SearchableEntityListFilterInput.this.finalBulkUploadFileRef.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.finalBulkUploadFileRef.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.leadSourceForBulkUpload.defined) {
                    inputFieldWriter.writeObject("leadSourceForBulkUpload", SearchableEntityListFilterInput.this.leadSourceForBulkUpload.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.leadSourceForBulkUpload.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.defaultCountryCode.defined) {
                    inputFieldWriter.writeObject("defaultCountryCode", SearchableEntityListFilterInput.this.defaultCountryCode.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.defaultCountryCode.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.defaultCountryIso.defined) {
                    inputFieldWriter.writeObject("defaultCountryIso", SearchableEntityListFilterInput.this.defaultCountryIso.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.defaultCountryIso.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.notificationBody.defined) {
                    inputFieldWriter.writeObject("notificationBody", SearchableEntityListFilterInput.this.notificationBody.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.notificationBody.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.rule.defined) {
                    inputFieldWriter.writeObject("rule", SearchableEntityListFilterInput.this.rule.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.rule.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.assignedUserId.defined) {
                    inputFieldWriter.writeObject("assignedUserId", SearchableEntityListFilterInput.this.assignedUserId.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.assignedUserId.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.assignedTeamId.defined) {
                    inputFieldWriter.writeObject("assignedTeamId", SearchableEntityListFilterInput.this.assignedTeamId.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.assignedTeamId.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.associatedDistributionId.defined) {
                    inputFieldWriter.writeObject("associatedDistributionId", SearchableEntityListFilterInput.this.associatedDistributionId.value != 0 ? ((SearchableIDFilterInput) SearchableEntityListFilterInput.this.associatedDistributionId.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.entityActionDefinitionReference.defined) {
                    inputFieldWriter.writeObject("entityActionDefinitionReference", SearchableEntityListFilterInput.this.entityActionDefinitionReference.value != 0 ? ((SearchableIDFilterInput) SearchableEntityListFilterInput.this.entityActionDefinitionReference.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.redistributeEntities.defined) {
                    inputFieldWriter.writeObject("redistributeEntities", SearchableEntityListFilterInput.this.redistributeEntities.value != 0 ? ((SearchableBooleanFilterInput) SearchableEntityListFilterInput.this.redistributeEntities.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.redistributionRequestedAt.defined) {
                    inputFieldWriter.writeObject("redistributionRequestedAt", SearchableEntityListFilterInput.this.redistributionRequestedAt.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.redistributionRequestedAt.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableEntityListFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableEntityListFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableEntityListFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableEntityListFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableEntityListFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableEntityListFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableEntityListFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableEntityListFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableEntityListFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableEntityListFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableEntityListFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableEntityListFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableEntityListFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableEntityListFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableEntityListFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableEntityListFilterInput.this.not.value != 0 ? ((SearchableEntityListFilterInput) SearchableEntityListFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput modifiedBulkUploadFileRef() {
        return this.modifiedBulkUploadFileRef.value;
    }

    public SearchableEntityListFilterInput not() {
        return this.not.value;
    }

    public SearchableStringFilterInput notificationBody() {
        return this.notificationBody.value;
    }

    public List<SearchableEntityListFilterInput> or() {
        return this.or.value;
    }

    public SearchableIntFilterInput otherFailedCount() {
        return this.otherFailedCount.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableStringFilterInput rawBulkUploadFileHash() {
        return this.rawBulkUploadFileHash.value;
    }

    public SearchableStringFilterInput rawBulkUploadFileRef() {
        return this.rawBulkUploadFileRef.value;
    }

    public SearchableBooleanFilterInput redistributeEntities() {
        return this.redistributeEntities.value;
    }

    public SearchableStringFilterInput redistributionRequestedAt() {
        return this.redistributionRequestedAt.value;
    }

    public SearchableStringFilterInput rule() {
        return this.rule.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableIntFilterInput successfulCount() {
        return this.successfulCount.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
