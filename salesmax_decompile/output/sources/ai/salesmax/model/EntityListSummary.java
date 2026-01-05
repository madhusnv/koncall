package ai.salesmax.model;

import ai.salesmax.model.EntityListSummary;
import com.amplifyframework.datastore.generated.model.ContactAssignmentStatus;
import com.amplifyframework.datastore.generated.model.EntityList;
import com.amplifyframework.datastore.generated.model.EntityListStatus;
import com.amplifyframework.datastore.generated.model.EntityListType;
import com.amplifyframework.datastore.generated.model.ListCreationType;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class EntityListSummary {
    private final String accountId;
    private final Boolean allowMultiple;
    private final String assignedTeamId;
    private final String assignedUserId;
    private final String associatedDistributionId;
    private final List<String> chatMessagePlatform;
    private final long createdAt;
    private final String defaultCountryCode;
    private final String defaultCountryIso;
    private final String description;
    private final Integer doNotTrackCount;
    private final String dupliacteLeadList;
    private final Integer duplicateCount;
    private final String entityActionDefinitionReference;
    private final String entityListType;
    private final String entityTypeInList;
    private final String finalBulkUploadFileRef;
    private final String id;
    private final Integer invalidEmailCount;
    private final Integer invalidNumbersCount;
    private final String leadSourceForBulkUpload;
    private final String listCreationType;
    private final String listName;
    private final String modifiedBulkUploadFileRef;
    private final String notificationBody;
    private final Integer otherFailedCount;
    private final String ownerId;
    private final String rawBulkUploadFileHash;
    private final String rawBulkUploadFileRef;
    private final Boolean redistributeEntities;
    private final long redistributionRequestedAt;
    private final String rule;
    private final String status;
    private final Integer successfulCount;
    private final List<String> tags;
    private final String toBeAssigned;
    private EntityList underlyingEntityList;
    private final long updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final EntityList newInstance() {
            EntityList entityListBuild = EntityList.builder().accountId("").entityTypeInList("CONTACT").entityListType(EntityListType.STATIC).ownerId("").listCreationType(ListCreationType.BULK_UPLOAD).id("").build();
            sq8.m48648g(entityListBuild, "build(...)");
            return entityListBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EntityListSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long createdAt$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long redistributionRequestedAt$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long updatedAt$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    public final String getAssignedTeamId() {
        return this.assignedTeamId;
    }

    public final String getAssignedUserId() {
        return this.assignedUserId;
    }

    public final String getAssociatedDistributionId() {
        return this.associatedDistributionId;
    }

    public final List<String> getChatMessagePlatform() {
        return this.chatMessagePlatform;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDefaultCountryCode() {
        return this.defaultCountryCode;
    }

    public final String getDefaultCountryIso() {
        return this.defaultCountryIso;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDoNotTrackCount() {
        return this.doNotTrackCount;
    }

    public final String getDupliacteLeadList() {
        return this.dupliacteLeadList;
    }

    public final Integer getDuplicateCount() {
        return this.duplicateCount;
    }

    public final String getEntityActionDefinitionReference() {
        return this.entityActionDefinitionReference;
    }

    public final String getEntityListType() {
        return this.entityListType;
    }

    public final String getEntityTypeInList() {
        return this.entityTypeInList;
    }

    public final String getFinalBulkUploadFileRef() {
        return this.finalBulkUploadFileRef;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getInvalidEmailCount() {
        return this.invalidEmailCount;
    }

    public final Integer getInvalidNumbersCount() {
        return this.invalidNumbersCount;
    }

    public final String getLeadSourceForBulkUpload() {
        return this.leadSourceForBulkUpload;
    }

    public final String getListCreationType() {
        return this.listCreationType;
    }

    public final String getListName() {
        return this.listName;
    }

    public final String getModifiedBulkUploadFileRef() {
        return this.modifiedBulkUploadFileRef;
    }

    public final String getNotificationBody() {
        return this.notificationBody;
    }

    public final Integer getOtherFailedCount() {
        return this.otherFailedCount;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getRawBulkUploadFileHash() {
        return this.rawBulkUploadFileHash;
    }

    public final String getRawBulkUploadFileRef() {
        return this.rawBulkUploadFileRef;
    }

    public final Boolean getRedistributeEntities() {
        return this.redistributeEntities;
    }

    public final long getRedistributionRequestedAt() {
        return this.redistributionRequestedAt;
    }

    public final String getRule() {
        return this.rule;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getSuccessfulCount() {
        return this.successfulCount;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getToBeAssigned() {
        return this.toBeAssigned;
    }

    public final EntityList getUnderlyingEntityList() {
        return this.underlyingEntityList;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final void setUnderlyingEntityList(EntityList entityList) {
        sq8.m48649h(entityList, "<set-?>");
        this.underlyingEntityList = entityList;
    }

    public final EntityListInfo toEntityListInfo() {
        return new EntityListInfo(this.id, this.accountId, this.entityListType, this.entityTypeInList, this.ownerId, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.listCreationType, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt);
    }

    public EntityListSummary(EntityList entityList) {
        sq8.m48649h(entityList, "underlyingEntityList");
        this.underlyingEntityList = entityList;
        this.id = entityList.getId();
        this.accountId = this.underlyingEntityList.getAccountId();
        EntityListType entityListType = this.underlyingEntityList.getEntityListType();
        this.entityListType = entityListType != null ? entityListType.name() : null;
        this.entityTypeInList = this.underlyingEntityList.getEntityTypeInList();
        this.ownerId = this.underlyingEntityList.getOwnerId();
        this.listName = this.underlyingEntityList.getListName();
        this.description = this.underlyingEntityList.getDescription();
        EntityListStatus status = this.underlyingEntityList.getStatus();
        this.status = status != null ? status.name() : null;
        this.successfulCount = this.underlyingEntityList.getSuccessfulCount();
        this.duplicateCount = this.underlyingEntityList.getDuplicateCount();
        this.invalidNumbersCount = this.underlyingEntityList.getInvalidNumbersCount();
        this.invalidEmailCount = this.underlyingEntityList.getInvalidEmailCount();
        this.doNotTrackCount = this.underlyingEntityList.getDoNotTrackCount();
        this.otherFailedCount = this.underlyingEntityList.getOtherFailedCount();
        ListCreationType listCreationType = this.underlyingEntityList.getListCreationType();
        this.listCreationType = listCreationType != null ? listCreationType.name() : null;
        this.rawBulkUploadFileRef = this.underlyingEntityList.getRawBulkUploadFileRef();
        this.rawBulkUploadFileHash = this.underlyingEntityList.getRawBulkUploadFileHash();
        this.modifiedBulkUploadFileRef = this.underlyingEntityList.getModifiedBulkUploadFileRef();
        this.finalBulkUploadFileRef = this.underlyingEntityList.getFinalBulkUploadFileRef();
        this.leadSourceForBulkUpload = this.underlyingEntityList.getLeadSourceForBulkUpload();
        this.defaultCountryCode = this.underlyingEntityList.getDefaultCountryCode();
        this.defaultCountryIso = this.underlyingEntityList.getDefaultCountryIso();
        this.notificationBody = this.underlyingEntityList.getNotificationBody();
        this.rule = this.underlyingEntityList.getRule();
        ContactAssignmentStatus toBeAssigned = this.underlyingEntityList.getToBeAssigned();
        this.toBeAssigned = toBeAssigned != null ? toBeAssigned.name() : null;
        this.assignedUserId = this.underlyingEntityList.getAssignedUserId();
        this.assignedTeamId = this.underlyingEntityList.getAssignedTeamId();
        this.associatedDistributionId = this.underlyingEntityList.getAssociatedDistributionId();
        this.entityActionDefinitionReference = this.underlyingEntityList.getEntityActionDefinitionReference();
        this.redistributeEntities = this.underlyingEntityList.getRedistributeEntities();
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingEntityList.getRedistributionRequestedAt());
        final EntityListSummary$redistributionRequestedAt$1 entityListSummary$redistributionRequestedAt$1 = EntityListSummary$redistributionRequestedAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.rh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EntityListSummary.redistributionRequestedAt$lambda$0(entityListSummary$redistributionRequestedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        this.redistributionRequestedAt = ((Number) objOrElse).longValue();
        this.dupliacteLeadList = this.underlyingEntityList.getDupliacteLeadList();
        this.tags = this.underlyingEntityList.getTags();
        this.chatMessagePlatform = this.underlyingEntityList.getTags();
        this.allowMultiple = this.underlyingEntityList.getAllowMultiple();
        Optional optionalOfNullable2 = Optional.ofNullable(this.underlyingEntityList.getCreatedAt());
        final EntityListSummary$createdAt$1 entityListSummary$createdAt$1 = EntityListSummary$createdAt$1.INSTANCE;
        Object objOrElse2 = optionalOfNullable2.map(new Function() { // from class: o.sh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EntityListSummary.createdAt$lambda$1(entityListSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse2, "orElse(...)");
        this.createdAt = ((Number) objOrElse2).longValue();
        Optional optionalOfNullable3 = Optional.ofNullable(this.underlyingEntityList.getUpdatedAt());
        final EntityListSummary$updatedAt$1 entityListSummary$updatedAt$1 = EntityListSummary$updatedAt$1.INSTANCE;
        Object objOrElse3 = optionalOfNullable3.map(new Function() { // from class: o.th6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EntityListSummary.updatedAt$lambda$2(entityListSummary$updatedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse3, "orElse(...)");
        this.updatedAt = ((Number) objOrElse3).longValue();
    }

    public /* synthetic */ EntityListSummary(EntityList entityList, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : entityList);
    }
}
