package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "ownerId", "entityTypeInList", "updatedAt"}, name = "byListOwner"), @Index(fields = {"accountId", "updatedAt"}, name = "listForAccount"), @Index(fields = {"rawBulkUploadFileHash", "accountId"}, name = "byFileHash")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.OWNER, identityClaim = "userId", operations = {ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, ownerField = "ownerId", provider = "userPools"), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "EntityLists")
/* loaded from: classes5.dex */
public final class EntityList implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Boolean")
    private final Boolean allowMultiple;

    @ModelField(targetType = "String")
    private final String assignedTeamId;

    @ModelField(targetType = "String")
    private final String assignedUserId;

    @ModelField(targetType = "DistributionDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = DistributionDefinition.class)
    private final DistributionDefinition associatedDistribution;

    @ModelField(targetType = "ID")
    private final String associatedDistributionId;

    @ModelField(targetType = "String")
    private final String chatMessagePlatform;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String defaultCountryCode;

    @ModelField(targetType = "String")
    private final String defaultCountryIso;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "Int")
    private final Integer doNotTrackCount;

    @ModelField(targetType = "ID")
    private final String dupliacteLeadList;

    @ModelField(targetType = "Int")
    private final Integer duplicateCount;

    @ModelField(targetType = "EntityActionDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = EntityActionDefinition.class)
    private final EntityActionDefinition entityActionDefinition;

    @ModelField(targetType = "ID")
    private final String entityActionDefinitionReference;

    @ModelField(isRequired = true, targetType = "EntityListType")
    private final EntityListType entityListType;

    @ModelField(isRequired = true, targetType = "String")
    private final String entityTypeInList;

    @ModelField(targetType = "String")
    private final String finalBulkUploadFileRef;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer invalidEmailCount;

    @ModelField(targetType = "Int")
    private final Integer invalidNumbersCount;

    @ModelField(targetType = "String")
    private final String leadSourceForBulkUpload;

    @ModelField(targetType = "String")
    private final String listCategory;

    @ModelField(isRequired = true, targetType = "ListCreationType")
    private final ListCreationType listCreationType;

    @ModelField(targetType = "String")
    private final String listName;

    @ModelField(targetType = "String")
    private final String modifiedBulkUploadFileRef;

    @ModelField(targetType = "String")
    private final String notificationBody;

    @ModelField(targetType = "Int")
    private final Integer otherFailedCount;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User owner;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "String")
    private final String rawBulkUploadFileHash;

    @ModelField(targetType = "String")
    private final String rawBulkUploadFileRef;

    @ModelField(targetType = "Boolean")
    private final Boolean redistributeEntities;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime redistributionRequestedAt;

    @ModelField(targetType = "String")
    private final String rule;

    @ModelField(targetType = "EntityListStatus")
    private final EntityListStatus status;

    @ModelField(targetType = "Int")
    private final Integer successfulCount;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "ContactAssignmentStatus")
    private final ContactAssignmentStatus toBeAssigned;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("EntityList", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("EntityList", "accountId");
    public static final QueryField ENTITY_TYPE_IN_LIST = QueryField.field("EntityList", "entityTypeInList");
    public static final QueryField ENTITY_LIST_TYPE = QueryField.field("EntityList", "entityListType");
    public static final QueryField LIST_NAME = QueryField.field("EntityList", "listName");
    public static final QueryField DESCRIPTION = QueryField.field("EntityList", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField STATUS = QueryField.field("EntityList", "status");
    public static final QueryField SUCCESSFUL_COUNT = QueryField.field("EntityList", "successfulCount");
    public static final QueryField DUPLICATE_COUNT = QueryField.field("EntityList", "duplicateCount");
    public static final QueryField INVALID_NUMBERS_COUNT = QueryField.field("EntityList", "invalidNumbersCount");
    public static final QueryField INVALID_EMAIL_COUNT = QueryField.field("EntityList", "invalidEmailCount");
    public static final QueryField DO_NOT_TRACK_COUNT = QueryField.field("EntityList", "doNotTrackCount");
    public static final QueryField OTHER_FAILED_COUNT = QueryField.field("EntityList", "otherFailedCount");
    public static final QueryField OWNER_ID = QueryField.field("EntityList", "ownerId");
    public static final QueryField LIST_CREATION_TYPE = QueryField.field("EntityList", "listCreationType");
    public static final QueryField LIST_CATEGORY = QueryField.field("EntityList", "listCategory");
    public static final QueryField RAW_BULK_UPLOAD_FILE_REF = QueryField.field("EntityList", "rawBulkUploadFileRef");
    public static final QueryField RAW_BULK_UPLOAD_FILE_HASH = QueryField.field("EntityList", "rawBulkUploadFileHash");
    public static final QueryField MODIFIED_BULK_UPLOAD_FILE_REF = QueryField.field("EntityList", "modifiedBulkUploadFileRef");
    public static final QueryField FINAL_BULK_UPLOAD_FILE_REF = QueryField.field("EntityList", "finalBulkUploadFileRef");
    public static final QueryField LEAD_SOURCE_FOR_BULK_UPLOAD = QueryField.field("EntityList", "leadSourceForBulkUpload");
    public static final QueryField DEFAULT_COUNTRY_CODE = QueryField.field("EntityList", "defaultCountryCode");
    public static final QueryField DEFAULT_COUNTRY_ISO = QueryField.field("EntityList", "defaultCountryIso");
    public static final QueryField NOTIFICATION_BODY = QueryField.field("EntityList", "notificationBody");
    public static final QueryField RULE = QueryField.field("EntityList", "rule");
    public static final QueryField TO_BE_ASSIGNED = QueryField.field("EntityList", "toBeAssigned");
    public static final QueryField ASSIGNED_USER_ID = QueryField.field("EntityList", "assignedUserId");
    public static final QueryField ASSIGNED_TEAM_ID = QueryField.field("EntityList", "assignedTeamId");
    public static final QueryField ASSOCIATED_DISTRIBUTION_ID = QueryField.field("EntityList", "associatedDistributionId");
    public static final QueryField ENTITY_ACTION_DEFINITION_REFERENCE = QueryField.field("EntityList", "entityActionDefinitionReference");
    public static final QueryField REDISTRIBUTE_ENTITIES = QueryField.field("EntityList", "redistributeEntities");
    public static final QueryField REDISTRIBUTION_REQUESTED_AT = QueryField.field("EntityList", "redistributionRequestedAt");
    public static final QueryField DUPLIACTE_LEAD_LIST = QueryField.field("EntityList", "dupliacteLeadList");
    public static final QueryField TAGS = QueryField.field("EntityList", "tags");
    public static final QueryField CHAT_MESSAGE_PLATFORM = QueryField.field("EntityList", "chatMessagePlatform");
    public static final QueryField ALLOW_MULTIPLE = QueryField.field("EntityList", "allowMultiple");
    public static final QueryField CREATED_AT = QueryField.field("EntityList", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("EntityList", "updatedAt");

    public interface AccountIdStep {
        EntityTypeInListStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep allowMultiple(Boolean bool);

        BuildStep assignedTeamId(String str);

        BuildStep assignedUserId(String str);

        BuildStep associatedDistributionId(String str);

        EntityList build();

        BuildStep chatMessagePlatform(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep defaultCountryCode(String str);

        BuildStep defaultCountryIso(String str);

        BuildStep description(String str);

        BuildStep doNotTrackCount(Integer num);

        BuildStep dupliacteLeadList(String str);

        BuildStep duplicateCount(Integer num);

        BuildStep entityActionDefinitionReference(String str);

        BuildStep finalBulkUploadFileRef(String str);

        BuildStep id(String str);

        BuildStep invalidEmailCount(Integer num);

        BuildStep invalidNumbersCount(Integer num);

        BuildStep leadSourceForBulkUpload(String str);

        BuildStep listCategory(String str);

        BuildStep listName(String str);

        BuildStep modifiedBulkUploadFileRef(String str);

        BuildStep notificationBody(String str);

        BuildStep otherFailedCount(Integer num);

        BuildStep rawBulkUploadFileHash(String str);

        BuildStep rawBulkUploadFileRef(String str);

        BuildStep redistributeEntities(Boolean bool);

        BuildStep redistributionRequestedAt(Temporal.DateTime dateTime);

        BuildStep rule(String str);

        BuildStep status(EntityListStatus entityListStatus);

        BuildStep successfulCount(Integer num);

        BuildStep tags(List<String> list);

        BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, EntityTypeInListStep, EntityListTypeStep, OwnerIdStep, ListCreationTypeStep, BuildStep {
        private String accountId;
        private Boolean allowMultiple;
        private String assignedTeamId;
        private String assignedUserId;
        private String associatedDistributionId;
        private String chatMessagePlatform;
        private Temporal.DateTime createdAt;
        private String defaultCountryCode;
        private String defaultCountryIso;
        private String description;
        private Integer doNotTrackCount;
        private String dupliacteLeadList;
        private Integer duplicateCount;
        private String entityActionDefinitionReference;
        private EntityListType entityListType;
        private String entityTypeInList;
        private String finalBulkUploadFileRef;
        private String id;
        private Integer invalidEmailCount;
        private Integer invalidNumbersCount;
        private String leadSourceForBulkUpload;
        private String listCategory;
        private ListCreationType listCreationType;
        private String listName;
        private String modifiedBulkUploadFileRef;
        private String notificationBody;
        private Integer otherFailedCount;
        private String ownerId;
        private String rawBulkUploadFileHash;
        private String rawBulkUploadFileRef;
        private Boolean redistributeEntities;
        private Temporal.DateTime redistributionRequestedAt;
        private String rule;
        private EntityListStatus status;
        private Integer successfulCount;
        private List<String> tags;
        private ContactAssignmentStatus toBeAssigned;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.EntityList.AccountIdStep
        public EntityTypeInListStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep allowMultiple(Boolean bool) {
            this.allowMultiple = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep assignedTeamId(String str) {
            this.assignedTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep assignedUserId(String str) {
            this.assignedUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep associatedDistributionId(String str) {
            this.associatedDistributionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public EntityList build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new EntityList(string, this.accountId, this.entityTypeInList, this.entityListType, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.ownerId, this.listCreationType, this.listCategory, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep chatMessagePlatform(String str) {
            this.chatMessagePlatform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep defaultCountryCode(String str) {
            this.defaultCountryCode = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep defaultCountryIso(String str) {
            this.defaultCountryIso = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep doNotTrackCount(Integer num) {
            this.doNotTrackCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep dupliacteLeadList(String str) {
            this.dupliacteLeadList = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep duplicateCount(Integer num) {
            this.duplicateCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep entityActionDefinitionReference(String str) {
            this.entityActionDefinitionReference = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.EntityListTypeStep
        public OwnerIdStep entityListType(EntityListType entityListType) {
            Objects.requireNonNull(entityListType);
            this.entityListType = entityListType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.EntityTypeInListStep
        public EntityListTypeStep entityTypeInList(String str) {
            Objects.requireNonNull(str);
            this.entityTypeInList = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep finalBulkUploadFileRef(String str) {
            this.finalBulkUploadFileRef = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep invalidEmailCount(Integer num) {
            this.invalidEmailCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep invalidNumbersCount(Integer num) {
            this.invalidNumbersCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep leadSourceForBulkUpload(String str) {
            this.leadSourceForBulkUpload = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep listCategory(String str) {
            this.listCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.ListCreationTypeStep
        public BuildStep listCreationType(ListCreationType listCreationType) {
            Objects.requireNonNull(listCreationType);
            this.listCreationType = listCreationType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep listName(String str) {
            this.listName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep modifiedBulkUploadFileRef(String str) {
            this.modifiedBulkUploadFileRef = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep notificationBody(String str) {
            this.notificationBody = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep otherFailedCount(Integer num) {
            this.otherFailedCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.OwnerIdStep
        public ListCreationTypeStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep rawBulkUploadFileHash(String str) {
            this.rawBulkUploadFileHash = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep rawBulkUploadFileRef(String str) {
            this.rawBulkUploadFileRef = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep redistributeEntities(Boolean bool) {
            this.redistributeEntities = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep redistributionRequestedAt(Temporal.DateTime dateTime) {
            this.redistributionRequestedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep rule(String str) {
            this.rule = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep status(EntityListStatus entityListStatus) {
            this.status = entityListStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep successfulCount(Integer num) {
            this.successfulCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = contactAssignmentStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, EntityListType entityListType, String str4, String str5, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str6, ListCreationType listCreationType, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ContactAssignmentStatus contactAssignmentStatus, String str17, String str18, String str19, String str20, Boolean bool, Temporal.DateTime dateTime, String str21, List<String> list, String str22, Boolean bool2, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.accountId = str2;
            this.entityTypeInList = str3;
            this.entityListType = entityListType;
            this.listName = str4;
            this.description = str5;
            this.status = entityListStatus;
            this.successfulCount = num;
            this.duplicateCount = num2;
            this.invalidNumbersCount = num3;
            this.invalidEmailCount = num4;
            this.doNotTrackCount = num5;
            this.otherFailedCount = num6;
            this.ownerId = str6;
            this.listCreationType = listCreationType;
            this.listCategory = str7;
            this.rawBulkUploadFileRef = str8;
            this.rawBulkUploadFileHash = str9;
            this.modifiedBulkUploadFileRef = str10;
            this.finalBulkUploadFileRef = str11;
            this.leadSourceForBulkUpload = str12;
            this.defaultCountryCode = str13;
            this.defaultCountryIso = str14;
            this.notificationBody = str15;
            this.rule = str16;
            this.toBeAssigned = contactAssignmentStatus;
            this.assignedUserId = str17;
            this.assignedTeamId = str18;
            this.associatedDistributionId = str19;
            this.entityActionDefinitionReference = str20;
            this.redistributeEntities = bool;
            this.redistributionRequestedAt = dateTime;
            this.dupliacteLeadList = str21;
            this.tags = list;
            this.chatMessagePlatform = str22;
            this.allowMultiple = bool2;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, EntityListType entityListType, String str4, String str5, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str6, ListCreationType listCreationType, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ContactAssignmentStatus contactAssignmentStatus, String str17, String str18, String str19, String str20, Boolean bool, Temporal.DateTime dateTime, String str21, List<String> list, String str22, Boolean bool2, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, str2, str3, entityListType, str4, str5, entityListStatus, num, num2, num3, num4, num5, num6, str6, listCreationType, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, contactAssignmentStatus, str17, str18, str19, str20, bool, dateTime, str21, list, str22, bool2, dateTime2, dateTime3);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(entityListType);
            Objects.requireNonNull(str6);
            Objects.requireNonNull(listCreationType);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder allowMultiple(Boolean bool) {
            return (CopyOfBuilder) super.allowMultiple(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder assignedTeamId(String str) {
            return (CopyOfBuilder) super.assignedTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder assignedUserId(String str) {
            return (CopyOfBuilder) super.assignedUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder associatedDistributionId(String str) {
            return (CopyOfBuilder) super.associatedDistributionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder chatMessagePlatform(String str) {
            return (CopyOfBuilder) super.chatMessagePlatform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder defaultCountryCode(String str) {
            return (CopyOfBuilder) super.defaultCountryCode(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder defaultCountryIso(String str) {
            return (CopyOfBuilder) super.defaultCountryIso(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder doNotTrackCount(Integer num) {
            return (CopyOfBuilder) super.doNotTrackCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder dupliacteLeadList(String str) {
            return (CopyOfBuilder) super.dupliacteLeadList(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder duplicateCount(Integer num) {
            return (CopyOfBuilder) super.duplicateCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder entityActionDefinitionReference(String str) {
            return (CopyOfBuilder) super.entityActionDefinitionReference(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.EntityListTypeStep
        public CopyOfBuilder entityListType(EntityListType entityListType) {
            return (CopyOfBuilder) super.entityListType(entityListType);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.EntityTypeInListStep
        public CopyOfBuilder entityTypeInList(String str) {
            return (CopyOfBuilder) super.entityTypeInList(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder finalBulkUploadFileRef(String str) {
            return (CopyOfBuilder) super.finalBulkUploadFileRef(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder invalidEmailCount(Integer num) {
            return (CopyOfBuilder) super.invalidEmailCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder invalidNumbersCount(Integer num) {
            return (CopyOfBuilder) super.invalidNumbersCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder leadSourceForBulkUpload(String str) {
            return (CopyOfBuilder) super.leadSourceForBulkUpload(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder listCategory(String str) {
            return (CopyOfBuilder) super.listCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.ListCreationTypeStep
        public CopyOfBuilder listCreationType(ListCreationType listCreationType) {
            return (CopyOfBuilder) super.listCreationType(listCreationType);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder listName(String str) {
            return (CopyOfBuilder) super.listName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder modifiedBulkUploadFileRef(String str) {
            return (CopyOfBuilder) super.modifiedBulkUploadFileRef(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder notificationBody(String str) {
            return (CopyOfBuilder) super.notificationBody(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder otherFailedCount(Integer num) {
            return (CopyOfBuilder) super.otherFailedCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder rawBulkUploadFileHash(String str) {
            return (CopyOfBuilder) super.rawBulkUploadFileHash(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder rawBulkUploadFileRef(String str) {
            return (CopyOfBuilder) super.rawBulkUploadFileRef(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder redistributeEntities(Boolean bool) {
            return (CopyOfBuilder) super.redistributeEntities(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder redistributionRequestedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.redistributionRequestedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder rule(String str) {
            return (CopyOfBuilder) super.rule(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder status(EntityListStatus entityListStatus) {
            return (CopyOfBuilder) super.status(entityListStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder successfulCount(Integer num) {
            return (CopyOfBuilder) super.successfulCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            return (CopyOfBuilder) super.toBeAssigned(contactAssignmentStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityList.Builder, com.amplifyframework.datastore.generated.model.EntityList.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface EntityListTypeStep {
        OwnerIdStep entityListType(EntityListType entityListType);
    }

    public interface EntityTypeInListStep {
        EntityListTypeStep entityTypeInList(String str);
    }

    public interface ListCreationTypeStep {
        BuildStep listCreationType(ListCreationType listCreationType);
    }

    public interface OwnerIdStep {
        ListCreationTypeStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static EntityList justId(String str) {
        return new EntityList(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.entityTypeInList, this.entityListType, this.listName, this.description, this.status, this.successfulCount, this.duplicateCount, this.invalidNumbersCount, this.invalidEmailCount, this.doNotTrackCount, this.otherFailedCount, this.ownerId, this.listCreationType, this.listCategory, this.rawBulkUploadFileRef, this.rawBulkUploadFileHash, this.modifiedBulkUploadFileRef, this.finalBulkUploadFileRef, this.leadSourceForBulkUpload, this.defaultCountryCode, this.defaultCountryIso, this.notificationBody, this.rule, this.toBeAssigned, this.assignedUserId, this.assignedTeamId, this.associatedDistributionId, this.entityActionDefinitionReference, this.redistributeEntities, this.redistributionRequestedAt, this.dupliacteLeadList, this.tags, this.chatMessagePlatform, this.allowMultiple, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EntityList.class != obj.getClass()) {
            return false;
        }
        EntityList entityList = (EntityList) obj;
        return s6c.m47909a(getId(), entityList.getId()) && s6c.m47909a(getAccountId(), entityList.getAccountId()) && s6c.m47909a(getEntityTypeInList(), entityList.getEntityTypeInList()) && s6c.m47909a(getEntityListType(), entityList.getEntityListType()) && s6c.m47909a(getListName(), entityList.getListName()) && s6c.m47909a(getDescription(), entityList.getDescription()) && s6c.m47909a(getStatus(), entityList.getStatus()) && s6c.m47909a(getSuccessfulCount(), entityList.getSuccessfulCount()) && s6c.m47909a(getDuplicateCount(), entityList.getDuplicateCount()) && s6c.m47909a(getInvalidNumbersCount(), entityList.getInvalidNumbersCount()) && s6c.m47909a(getInvalidEmailCount(), entityList.getInvalidEmailCount()) && s6c.m47909a(getDoNotTrackCount(), entityList.getDoNotTrackCount()) && s6c.m47909a(getOtherFailedCount(), entityList.getOtherFailedCount()) && s6c.m47909a(getOwnerId(), entityList.getOwnerId()) && s6c.m47909a(getListCreationType(), entityList.getListCreationType()) && s6c.m47909a(getListCategory(), entityList.getListCategory()) && s6c.m47909a(getRawBulkUploadFileRef(), entityList.getRawBulkUploadFileRef()) && s6c.m47909a(getRawBulkUploadFileHash(), entityList.getRawBulkUploadFileHash()) && s6c.m47909a(getModifiedBulkUploadFileRef(), entityList.getModifiedBulkUploadFileRef()) && s6c.m47909a(getFinalBulkUploadFileRef(), entityList.getFinalBulkUploadFileRef()) && s6c.m47909a(getLeadSourceForBulkUpload(), entityList.getLeadSourceForBulkUpload()) && s6c.m47909a(getDefaultCountryCode(), entityList.getDefaultCountryCode()) && s6c.m47909a(getDefaultCountryIso(), entityList.getDefaultCountryIso()) && s6c.m47909a(getNotificationBody(), entityList.getNotificationBody()) && s6c.m47909a(getRule(), entityList.getRule()) && s6c.m47909a(getToBeAssigned(), entityList.getToBeAssigned()) && s6c.m47909a(getAssignedUserId(), entityList.getAssignedUserId()) && s6c.m47909a(getAssignedTeamId(), entityList.getAssignedTeamId()) && s6c.m47909a(getAssociatedDistributionId(), entityList.getAssociatedDistributionId()) && s6c.m47909a(getEntityActionDefinitionReference(), entityList.getEntityActionDefinitionReference()) && s6c.m47909a(getRedistributeEntities(), entityList.getRedistributeEntities()) && s6c.m47909a(getRedistributionRequestedAt(), entityList.getRedistributionRequestedAt()) && s6c.m47909a(getDupliacteLeadList(), entityList.getDupliacteLeadList()) && s6c.m47909a(getTags(), entityList.getTags()) && s6c.m47909a(getChatMessagePlatform(), entityList.getChatMessagePlatform()) && s6c.m47909a(getAllowMultiple(), entityList.getAllowMultiple()) && s6c.m47909a(getCreatedAt(), entityList.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), entityList.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    public String getAssignedTeamId() {
        return this.assignedTeamId;
    }

    public String getAssignedUserId() {
        return this.assignedUserId;
    }

    public DistributionDefinition getAssociatedDistribution() {
        return this.associatedDistribution;
    }

    public String getAssociatedDistributionId() {
        return this.associatedDistributionId;
    }

    public String getChatMessagePlatform() {
        return this.chatMessagePlatform;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDefaultCountryCode() {
        return this.defaultCountryCode;
    }

    public String getDefaultCountryIso() {
        return this.defaultCountryIso;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getDoNotTrackCount() {
        return this.doNotTrackCount;
    }

    public String getDupliacteLeadList() {
        return this.dupliacteLeadList;
    }

    public Integer getDuplicateCount() {
        return this.duplicateCount;
    }

    public EntityActionDefinition getEntityActionDefinition() {
        return this.entityActionDefinition;
    }

    public String getEntityActionDefinitionReference() {
        return this.entityActionDefinitionReference;
    }

    public EntityListType getEntityListType() {
        return this.entityListType;
    }

    public String getEntityTypeInList() {
        return this.entityTypeInList;
    }

    public String getFinalBulkUploadFileRef() {
        return this.finalBulkUploadFileRef;
    }

    public String getId() {
        return this.id;
    }

    public Integer getInvalidEmailCount() {
        return this.invalidEmailCount;
    }

    public Integer getInvalidNumbersCount() {
        return this.invalidNumbersCount;
    }

    public String getLeadSourceForBulkUpload() {
        return this.leadSourceForBulkUpload;
    }

    public String getListCategory() {
        return this.listCategory;
    }

    public ListCreationType getListCreationType() {
        return this.listCreationType;
    }

    public String getListName() {
        return this.listName;
    }

    public String getModifiedBulkUploadFileRef() {
        return this.modifiedBulkUploadFileRef;
    }

    public String getNotificationBody() {
        return this.notificationBody;
    }

    public Integer getOtherFailedCount() {
        return this.otherFailedCount;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getRawBulkUploadFileHash() {
        return this.rawBulkUploadFileHash;
    }

    public String getRawBulkUploadFileRef() {
        return this.rawBulkUploadFileRef;
    }

    public Boolean getRedistributeEntities() {
        return this.redistributeEntities;
    }

    public Temporal.DateTime getRedistributionRequestedAt() {
        return this.redistributionRequestedAt;
    }

    public String getRule() {
        return this.rule;
    }

    public EntityListStatus getStatus() {
        return this.status;
    }

    public Integer getSuccessfulCount() {
        return this.successfulCount;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public ContactAssignmentStatus getToBeAssigned() {
        return this.toBeAssigned;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getEntityTypeInList() + getEntityListType() + getListName() + getDescription() + getStatus() + getSuccessfulCount() + getDuplicateCount() + getInvalidNumbersCount() + getInvalidEmailCount() + getDoNotTrackCount() + getOtherFailedCount() + getOwnerId() + getListCreationType() + getListCategory() + getRawBulkUploadFileRef() + getRawBulkUploadFileHash() + getModifiedBulkUploadFileRef() + getFinalBulkUploadFileRef() + getLeadSourceForBulkUpload() + getDefaultCountryCode() + getDefaultCountryIso() + getNotificationBody() + getRule() + getToBeAssigned() + getAssignedUserId() + getAssignedTeamId() + getAssociatedDistributionId() + getEntityActionDefinitionReference() + getRedistributeEntities() + getRedistributionRequestedAt() + getDupliacteLeadList() + getTags() + getChatMessagePlatform() + getAllowMultiple() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityList {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("entityTypeInList=" + String.valueOf(getEntityTypeInList()) + ", ");
        sb.append("entityListType=" + String.valueOf(getEntityListType()) + ", ");
        sb.append("listName=" + String.valueOf(getListName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("successfulCount=" + String.valueOf(getSuccessfulCount()) + ", ");
        sb.append("duplicateCount=" + String.valueOf(getDuplicateCount()) + ", ");
        sb.append("invalidNumbersCount=" + String.valueOf(getInvalidNumbersCount()) + ", ");
        sb.append("invalidEmailCount=" + String.valueOf(getInvalidEmailCount()) + ", ");
        sb.append("doNotTrackCount=" + String.valueOf(getDoNotTrackCount()) + ", ");
        sb.append("otherFailedCount=" + String.valueOf(getOtherFailedCount()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("listCreationType=" + String.valueOf(getListCreationType()) + ", ");
        sb.append("listCategory=" + String.valueOf(getListCategory()) + ", ");
        sb.append("rawBulkUploadFileRef=" + String.valueOf(getRawBulkUploadFileRef()) + ", ");
        sb.append("rawBulkUploadFileHash=" + String.valueOf(getRawBulkUploadFileHash()) + ", ");
        sb.append("modifiedBulkUploadFileRef=" + String.valueOf(getModifiedBulkUploadFileRef()) + ", ");
        sb.append("finalBulkUploadFileRef=" + String.valueOf(getFinalBulkUploadFileRef()) + ", ");
        sb.append("leadSourceForBulkUpload=" + String.valueOf(getLeadSourceForBulkUpload()) + ", ");
        sb.append("defaultCountryCode=" + String.valueOf(getDefaultCountryCode()) + ", ");
        sb.append("defaultCountryIso=" + String.valueOf(getDefaultCountryIso()) + ", ");
        sb.append("notificationBody=" + String.valueOf(getNotificationBody()) + ", ");
        sb.append("rule=" + String.valueOf(getRule()) + ", ");
        sb.append("toBeAssigned=" + String.valueOf(getToBeAssigned()) + ", ");
        sb.append("assignedUserId=" + String.valueOf(getAssignedUserId()) + ", ");
        sb.append("assignedTeamId=" + String.valueOf(getAssignedTeamId()) + ", ");
        sb.append("associatedDistributionId=" + String.valueOf(getAssociatedDistributionId()) + ", ");
        sb.append("entityActionDefinitionReference=" + String.valueOf(getEntityActionDefinitionReference()) + ", ");
        sb.append("redistributeEntities=" + String.valueOf(getRedistributeEntities()) + ", ");
        sb.append("redistributionRequestedAt=" + String.valueOf(getRedistributionRequestedAt()) + ", ");
        sb.append("dupliacteLeadList=" + String.valueOf(getDupliacteLeadList()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("chatMessagePlatform=" + String.valueOf(getChatMessagePlatform()) + ", ");
        sb.append("allowMultiple=" + String.valueOf(getAllowMultiple()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private EntityList(String str, String str2, String str3, EntityListType entityListType, String str4, String str5, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str6, ListCreationType listCreationType, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ContactAssignmentStatus contactAssignmentStatus, String str17, String str18, String str19, String str20, Boolean bool, Temporal.DateTime dateTime, String str21, List<String> list, String str22, Boolean bool2, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.owner = null;
        this.associatedDistribution = null;
        this.entityActionDefinition = null;
        this.id = str;
        this.accountId = str2;
        this.entityTypeInList = str3;
        this.entityListType = entityListType;
        this.listName = str4;
        this.description = str5;
        this.status = entityListStatus;
        this.successfulCount = num;
        this.duplicateCount = num2;
        this.invalidNumbersCount = num3;
        this.invalidEmailCount = num4;
        this.doNotTrackCount = num5;
        this.otherFailedCount = num6;
        this.ownerId = str6;
        this.listCreationType = listCreationType;
        this.listCategory = str7;
        this.rawBulkUploadFileRef = str8;
        this.rawBulkUploadFileHash = str9;
        this.modifiedBulkUploadFileRef = str10;
        this.finalBulkUploadFileRef = str11;
        this.leadSourceForBulkUpload = str12;
        this.defaultCountryCode = str13;
        this.defaultCountryIso = str14;
        this.notificationBody = str15;
        this.rule = str16;
        this.toBeAssigned = contactAssignmentStatus;
        this.assignedUserId = str17;
        this.assignedTeamId = str18;
        this.associatedDistributionId = str19;
        this.entityActionDefinitionReference = str20;
        this.redistributeEntities = bool;
        this.redistributionRequestedAt = dateTime;
        this.dupliacteLeadList = str21;
        this.tags = list;
        this.chatMessagePlatform = str22;
        this.allowMultiple = bool2;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
