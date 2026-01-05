package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"parentFileId"}, name = "byParentFile")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "UploadedFiles")
/* loaded from: classes5.dex */
public final class UploadedFile implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @ModelField(targetType = "fileObjectRelationship")
    @HasMany(associatedWith = TransferTable.COLUMN_FILE, type = fileObjectRelationship.class)
    private final List<fileObjectRelationship> associations;

    @ModelField(targetType = "UploadedFile")
    @HasMany(associatedWith = "parentFile", type = UploadedFile.class)
    private final List<UploadedFile> childFiles;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "String")
    private final String documentCategory;

    @ModelField(targetType = "String")
    private final String documentSubCategory;

    @ModelField(targetType = "AWSJSON")
    private final String fileMetaData;

    @ModelField(targetType = "String")
    private final String fileMimeType;

    @ModelField(targetType = "String")
    private final String fileName;

    @ModelField(targetType = "String")
    private final String fileStorageDestination;

    @ModelField(targetType = "String")
    private final String fileThumbnailUrl;

    @ModelField(targetType = "String")
    private final String fileUrl;

    @ModelField(targetType = "HasParent")
    private final HasParent hasParent;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @BelongsTo(targetName = "parentFileId", type = UploadedFile.class)
    @ModelField(targetType = "UploadedFile")
    private final UploadedFile parentFile;

    @ModelField(targetType = "ID")
    private final String scopeId;

    @ModelField(targetType = "ScopeLevel")
    private final ScopeLevel scopeLevel;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "String")
    private final String templateBody;

    @ModelField(targetType = "String")
    private final String templateExternalLink;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime templateLastUsed;

    @ModelField(targetType = "String")
    private final String templateTitle;

    @ModelField(targetType = "String")
    private final String templateType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "String")
    private final String uploadSource;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User uploadedBy;

    @ModelField(targetType = "ID")
    private final String uploadedById;
    public static final QueryField ID = QueryField.field("UploadedFile", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT = QueryField.field("UploadedFile", "accountId");
    public static final QueryField FILE_URL = QueryField.field("UploadedFile", "fileUrl");
    public static final QueryField FILE_STORAGE_DESTINATION = QueryField.field("UploadedFile", "fileStorageDestination");
    public static final QueryField FILE_NAME = QueryField.field("UploadedFile", "fileName");
    public static final QueryField DESCRIPTION = QueryField.field("UploadedFile", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField DOCUMENT_CATEGORY = QueryField.field("UploadedFile", "documentCategory");
    public static final QueryField DOCUMENT_SUB_CATEGORY = QueryField.field("UploadedFile", "documentSubCategory");
    public static final QueryField TAGS = QueryField.field("UploadedFile", "tags");
    public static final QueryField TEMPLATE_TYPE = QueryField.field("UploadedFile", "templateType");
    public static final QueryField TEMPLATE_TITLE = QueryField.field("UploadedFile", "templateTitle");
    public static final QueryField TEMPLATE_BODY = QueryField.field("UploadedFile", "templateBody");
    public static final QueryField TEMPLATE_LAST_USED = QueryField.field("UploadedFile", "templateLastUsed");
    public static final QueryField TEMPLATE_EXTERNAL_LINK = QueryField.field("UploadedFile", "templateExternalLink");
    public static final QueryField UPLOAD_SOURCE = QueryField.field("UploadedFile", "uploadSource");
    public static final QueryField FILE_META_DATA = QueryField.field("UploadedFile", "fileMetaData");
    public static final QueryField FILE_MIME_TYPE = QueryField.field("UploadedFile", "fileMimeType");
    public static final QueryField FILE_THUMBNAIL_URL = QueryField.field("UploadedFile", "fileThumbnailUrl");
    public static final QueryField HAS_PARENT = QueryField.field("UploadedFile", "hasParent");
    public static final QueryField PARENT_FILE = QueryField.field("UploadedFile", "parentFileId");
    public static final QueryField SCOPE_LEVEL = QueryField.field("UploadedFile", "scopeLevel");
    public static final QueryField SCOPE_ID = QueryField.field("UploadedFile", "scopeId");
    public static final QueryField UPLOADED_BY_ID = QueryField.field("UploadedFile", "uploadedById");
    public static final QueryField CREATED_AT = QueryField.field("UploadedFile", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("UploadedFile", "updatedAt");

    public interface BuildStep {
        BuildStep account(Account account);

        UploadedFile build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep description(String str);

        BuildStep documentCategory(String str);

        BuildStep documentSubCategory(String str);

        BuildStep fileMetaData(String str);

        BuildStep fileMimeType(String str);

        BuildStep fileName(String str);

        BuildStep fileStorageDestination(String str);

        BuildStep fileThumbnailUrl(String str);

        BuildStep fileUrl(String str);

        BuildStep hasParent(HasParent hasParent);

        BuildStep id(String str);

        BuildStep parentFile(UploadedFile uploadedFile);

        BuildStep scopeId(String str);

        BuildStep scopeLevel(ScopeLevel scopeLevel);

        BuildStep tags(List<String> list);

        BuildStep templateBody(String str);

        BuildStep templateExternalLink(String str);

        BuildStep templateLastUsed(Temporal.DateTime dateTime);

        BuildStep templateTitle(String str);

        BuildStep templateType(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep uploadSource(String str);

        BuildStep uploadedById(String str);
    }

    public static class Builder implements BuildStep {
        private Account account;
        private Temporal.DateTime createdAt;
        private String description;
        private String documentCategory;
        private String documentSubCategory;
        private String fileMetaData;
        private String fileMimeType;
        private String fileName;
        private String fileStorageDestination;
        private String fileThumbnailUrl;
        private String fileUrl;
        private HasParent hasParent;
        private String id;
        private UploadedFile parentFile;
        private String scopeId;
        private ScopeLevel scopeLevel;
        private List<String> tags;
        private String templateBody;
        private String templateExternalLink;
        private Temporal.DateTime templateLastUsed;
        private String templateTitle;
        private String templateType;
        private Temporal.DateTime updatedAt;
        private String uploadSource;
        private String uploadedById;

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public UploadedFile build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new UploadedFile(string, this.account, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.hasParent, this.parentFile, this.scopeLevel, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep documentCategory(String str) {
            this.documentCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep documentSubCategory(String str) {
            this.documentSubCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep fileMetaData(String str) {
            this.fileMetaData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep fileMimeType(String str) {
            this.fileMimeType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep fileName(String str) {
            this.fileName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep fileStorageDestination(String str) {
            this.fileStorageDestination = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep fileThumbnailUrl(String str) {
            this.fileThumbnailUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep fileUrl(String str) {
            this.fileUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep hasParent(HasParent hasParent) {
            this.hasParent = hasParent;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep parentFile(UploadedFile uploadedFile) {
            this.parentFile = uploadedFile;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep scopeId(String str) {
            this.scopeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep scopeLevel(ScopeLevel scopeLevel) {
            this.scopeLevel = scopeLevel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep templateBody(String str) {
            this.templateBody = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep templateExternalLink(String str) {
            this.templateExternalLink = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep templateLastUsed(Temporal.DateTime dateTime) {
            this.templateLastUsed = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep templateTitle(String str) {
            this.templateTitle = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep templateType(String str) {
            this.templateType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep uploadSource(String str) {
            this.uploadSource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public BuildStep uploadedById(String str) {
            this.uploadedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, String str9, String str10, Temporal.DateTime dateTime, String str11, String str12, String str13, String str14, String str15, HasParent hasParent, UploadedFile uploadedFile, ScopeLevel scopeLevel, String str16, String str17, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.account = account;
            this.fileUrl = str2;
            this.fileStorageDestination = str3;
            this.fileName = str4;
            this.description = str5;
            this.documentCategory = str6;
            this.documentSubCategory = str7;
            this.tags = list;
            this.templateType = str8;
            this.templateTitle = str9;
            this.templateBody = str10;
            this.templateLastUsed = dateTime;
            this.templateExternalLink = str11;
            this.uploadSource = str12;
            this.fileMetaData = str13;
            this.fileMimeType = str14;
            this.fileThumbnailUrl = str15;
            this.hasParent = hasParent;
            this.parentFile = uploadedFile;
            this.scopeLevel = scopeLevel;
            this.scopeId = str16;
            this.uploadedById = str17;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, Account account, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, String str9, String str10, Temporal.DateTime dateTime, String str11, String str12, String str13, String str14, String str15, HasParent hasParent, UploadedFile uploadedFile, ScopeLevel scopeLevel, String str16, String str17, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, account, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, dateTime, str11, str12, str13, str14, str15, hasParent, uploadedFile, scopeLevel, str16, str17, dateTime2, dateTime3);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder documentCategory(String str) {
            return (CopyOfBuilder) super.documentCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder documentSubCategory(String str) {
            return (CopyOfBuilder) super.documentSubCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder fileMetaData(String str) {
            return (CopyOfBuilder) super.fileMetaData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder fileMimeType(String str) {
            return (CopyOfBuilder) super.fileMimeType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder fileName(String str) {
            return (CopyOfBuilder) super.fileName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder fileStorageDestination(String str) {
            return (CopyOfBuilder) super.fileStorageDestination(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder fileThumbnailUrl(String str) {
            return (CopyOfBuilder) super.fileThumbnailUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder fileUrl(String str) {
            return (CopyOfBuilder) super.fileUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder hasParent(HasParent hasParent) {
            return (CopyOfBuilder) super.hasParent(hasParent);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder parentFile(UploadedFile uploadedFile) {
            return (CopyOfBuilder) super.parentFile(uploadedFile);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder scopeId(String str) {
            return (CopyOfBuilder) super.scopeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder scopeLevel(ScopeLevel scopeLevel) {
            return (CopyOfBuilder) super.scopeLevel(scopeLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder templateBody(String str) {
            return (CopyOfBuilder) super.templateBody(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder templateExternalLink(String str) {
            return (CopyOfBuilder) super.templateExternalLink(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder templateLastUsed(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.templateLastUsed(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder templateTitle(String str) {
            return (CopyOfBuilder) super.templateTitle(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder templateType(String str) {
            return (CopyOfBuilder) super.templateType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder uploadSource(String str) {
            return (CopyOfBuilder) super.uploadSource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UploadedFile.Builder, com.amplifyframework.datastore.generated.model.UploadedFile.BuildStep
        public CopyOfBuilder uploadedById(String str) {
            return (CopyOfBuilder) super.uploadedById(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static UploadedFile justId(String str) {
        return new UploadedFile(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.account, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.hasParent, this.parentFile, this.scopeLevel, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UploadedFile.class != obj.getClass()) {
            return false;
        }
        UploadedFile uploadedFile = (UploadedFile) obj;
        return s6c.m47909a(getId(), uploadedFile.getId()) && s6c.m47909a(getAccount(), uploadedFile.getAccount()) && s6c.m47909a(getFileUrl(), uploadedFile.getFileUrl()) && s6c.m47909a(getFileStorageDestination(), uploadedFile.getFileStorageDestination()) && s6c.m47909a(getFileName(), uploadedFile.getFileName()) && s6c.m47909a(getDescription(), uploadedFile.getDescription()) && s6c.m47909a(getDocumentCategory(), uploadedFile.getDocumentCategory()) && s6c.m47909a(getDocumentSubCategory(), uploadedFile.getDocumentSubCategory()) && s6c.m47909a(getTags(), uploadedFile.getTags()) && s6c.m47909a(getTemplateType(), uploadedFile.getTemplateType()) && s6c.m47909a(getTemplateTitle(), uploadedFile.getTemplateTitle()) && s6c.m47909a(getTemplateBody(), uploadedFile.getTemplateBody()) && s6c.m47909a(getTemplateLastUsed(), uploadedFile.getTemplateLastUsed()) && s6c.m47909a(getTemplateExternalLink(), uploadedFile.getTemplateExternalLink()) && s6c.m47909a(getUploadSource(), uploadedFile.getUploadSource()) && s6c.m47909a(getFileMetaData(), uploadedFile.getFileMetaData()) && s6c.m47909a(getFileMimeType(), uploadedFile.getFileMimeType()) && s6c.m47909a(getFileThumbnailUrl(), uploadedFile.getFileThumbnailUrl()) && s6c.m47909a(getHasParent(), uploadedFile.getHasParent()) && s6c.m47909a(getParentFile(), uploadedFile.getParentFile()) && s6c.m47909a(getScopeLevel(), uploadedFile.getScopeLevel()) && s6c.m47909a(getScopeId(), uploadedFile.getScopeId()) && s6c.m47909a(getUploadedById(), uploadedFile.getUploadedById()) && s6c.m47909a(getCreatedAt(), uploadedFile.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), uploadedFile.getUpdatedAt());
    }

    public Account getAccount() {
        return this.account;
    }

    public List<fileObjectRelationship> getAssociations() {
        return this.associations;
    }

    public List<UploadedFile> getChildFiles() {
        return this.childFiles;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDocumentCategory() {
        return this.documentCategory;
    }

    public String getDocumentSubCategory() {
        return this.documentSubCategory;
    }

    public String getFileMetaData() {
        return this.fileMetaData;
    }

    public String getFileMimeType() {
        return this.fileMimeType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileStorageDestination() {
        return this.fileStorageDestination;
    }

    public String getFileThumbnailUrl() {
        return this.fileThumbnailUrl;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public HasParent getHasParent() {
        return this.hasParent;
    }

    public String getId() {
        return this.id;
    }

    public UploadedFile getParentFile() {
        return this.parentFile;
    }

    public String getScopeId() {
        return this.scopeId;
    }

    public ScopeLevel getScopeLevel() {
        return this.scopeLevel;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public String getTemplateExternalLink() {
        return this.templateExternalLink;
    }

    public Temporal.DateTime getTemplateLastUsed() {
        return this.templateLastUsed;
    }

    public String getTemplateTitle() {
        return this.templateTitle;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUploadSource() {
        return this.uploadSource;
    }

    public User getUploadedBy() {
        return this.uploadedBy;
    }

    public String getUploadedById() {
        return this.uploadedById;
    }

    public int hashCode() {
        return (getId() + getAccount() + getFileUrl() + getFileStorageDestination() + getFileName() + getDescription() + getDocumentCategory() + getDocumentSubCategory() + getTags() + getTemplateType() + getTemplateTitle() + getTemplateBody() + getTemplateLastUsed() + getTemplateExternalLink() + getUploadSource() + getFileMetaData() + getFileMimeType() + getFileThumbnailUrl() + getHasParent() + getParentFile() + getScopeLevel() + getScopeId() + getUploadedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadedFile {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("fileUrl=" + String.valueOf(getFileUrl()) + ", ");
        sb.append("fileStorageDestination=" + String.valueOf(getFileStorageDestination()) + ", ");
        sb.append("fileName=" + String.valueOf(getFileName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("documentCategory=" + String.valueOf(getDocumentCategory()) + ", ");
        sb.append("documentSubCategory=" + String.valueOf(getDocumentSubCategory()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("templateType=" + String.valueOf(getTemplateType()) + ", ");
        sb.append("templateTitle=" + String.valueOf(getTemplateTitle()) + ", ");
        sb.append("templateBody=" + String.valueOf(getTemplateBody()) + ", ");
        sb.append("templateLastUsed=" + String.valueOf(getTemplateLastUsed()) + ", ");
        sb.append("templateExternalLink=" + String.valueOf(getTemplateExternalLink()) + ", ");
        sb.append("uploadSource=" + String.valueOf(getUploadSource()) + ", ");
        sb.append("fileMetaData=" + String.valueOf(getFileMetaData()) + ", ");
        sb.append("fileMimeType=" + String.valueOf(getFileMimeType()) + ", ");
        sb.append("fileThumbnailUrl=" + String.valueOf(getFileThumbnailUrl()) + ", ");
        sb.append("hasParent=" + String.valueOf(getHasParent()) + ", ");
        sb.append("parentFile=" + String.valueOf(getParentFile()) + ", ");
        sb.append("scopeLevel=" + String.valueOf(getScopeLevel()) + ", ");
        sb.append("scopeId=" + String.valueOf(getScopeId()) + ", ");
        sb.append("uploadedById=" + String.valueOf(getUploadedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private UploadedFile(String str, Account account, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, String str9, String str10, Temporal.DateTime dateTime, String str11, String str12, String str13, String str14, String str15, HasParent hasParent, UploadedFile uploadedFile, ScopeLevel scopeLevel, String str16, String str17, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.childFiles = null;
        this.uploadedBy = null;
        this.associations = null;
        this.id = str;
        this.account = account;
        this.fileUrl = str2;
        this.fileStorageDestination = str3;
        this.fileName = str4;
        this.description = str5;
        this.documentCategory = str6;
        this.documentSubCategory = str7;
        this.tags = list;
        this.templateType = str8;
        this.templateTitle = str9;
        this.templateBody = str10;
        this.templateLastUsed = dateTime;
        this.templateExternalLink = str11;
        this.uploadSource = str12;
        this.fileMetaData = str13;
        this.fileMimeType = str14;
        this.fileThumbnailUrl = str15;
        this.hasParent = hasParent;
        this.parentFile = uploadedFile;
        this.scopeLevel = scopeLevel;
        this.scopeId = str16;
        this.uploadedById = str17;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
