package ai.salesmax.model;

import ai.salesmax.model.UploadedFileSummary;
import android.net.Uri;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.ScopeLevel;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import java.util.Optional;
import java.util.function.Function;
import p001o.a81;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class UploadedFileSummary {
    private UploadedFile underlyingUploadedFile;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final UploadedFile newInstance() {
            UploadedFile uploadedFileBuild = UploadedFile.builder().id("").account(Account.justId("")).build();
            sq8.m48648g(uploadedFileBuild, "build(...)");
            return uploadedFileBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UploadedFileSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_templateLastUsed_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        Account account = this.underlyingUploadedFile.getAccount();
        if (account != null) {
            return account.getId();
        }
        return null;
    }

    public final long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingUploadedFile.getCreatedAt());
        final UploadedFileSummary$createdAt$1 uploadedFileSummary$createdAt$1 = UploadedFileSummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.j7i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return UploadedFileSummary._get_createdAt_$lambda$4(uploadedFileSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getDescription() {
        return this.underlyingUploadedFile.getDescription();
    }

    public final String getDocumentCategory() {
        return this.underlyingUploadedFile.getDocumentCategory();
    }

    public final String getDocumentSubCategory() {
        return this.underlyingUploadedFile.getDocumentSubCategory();
    }

    public final String getFileMimeType() {
        return this.underlyingUploadedFile.getFileMimeType();
    }

    public final String getFileName() {
        return this.underlyingUploadedFile.getFileName();
    }

    public final String getFileStorageDestination() {
        return this.underlyingUploadedFile.getFileStorageDestination();
    }

    public final String getFileThumbnailUrl() {
        return this.underlyingUploadedFile.getFileThumbnailUrl();
    }

    public final String getFileUrl() {
        return this.underlyingUploadedFile.getFileUrl();
    }

    public final String getId() {
        String id = this.underlyingUploadedFile.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getScopeId() {
        return this.underlyingUploadedFile.getScopeId();
    }

    public final String getScopeLevel() {
        ScopeLevel scopeLevel = this.underlyingUploadedFile.getScopeLevel();
        if (scopeLevel != null) {
            return scopeLevel.name();
        }
        return null;
    }

    public final String getTemplateBody() {
        return this.underlyingUploadedFile.getTemplateBody();
    }

    public final long getTemplateLastUsed() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingUploadedFile.getTemplateLastUsed());
        final UploadedFileSummary$templateLastUsed$1 uploadedFileSummary$templateLastUsed$1 = UploadedFileSummary$templateLastUsed$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.h7i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return UploadedFileSummary._get_templateLastUsed_$lambda$0(uploadedFileSummary$templateLastUsed$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getTemplateTitle() {
        return this.underlyingUploadedFile.getTemplateTitle();
    }

    public final String getTemplateType() {
        return this.underlyingUploadedFile.getTemplateType();
    }

    public final UploadedFile getUnderlyingUploadedFile() {
        return this.underlyingUploadedFile;
    }

    public final long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingUploadedFile.getUpdatedAt());
        final UploadedFileSummary$updatedAt$1 uploadedFileSummary$updatedAt$1 = UploadedFileSummary$updatedAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.i7i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return UploadedFileSummary._get_updatedAt_$lambda$5(uploadedFileSummary$updatedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getUploadSource() {
        return this.underlyingUploadedFile.getUploadSource();
    }

    public final void setAccountId(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().account(Account.justId("")).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setCreatedAt(long j) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().createdAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setDescription(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().description(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setDocumentCategory(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().documentCategory(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setDocumentSubCategory(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().documentSubCategory(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setFileMimeType(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().fileMimeType(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setFileName(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().fileName(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setFileStorageDestination(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().fileStorageDestination(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setFileThumbnailUrl(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().fileThumbnailUrl(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setFileUrl(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().fileUrl(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().id(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setScopeId(String str) {
        if (str != null) {
            UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().scopeId(str).build();
            sq8.m48648g(uploadedFileBuild, "build(...)");
            this.underlyingUploadedFile = uploadedFileBuild;
        }
    }

    public final void setScopeLevel(String str) {
        ScopeLevel scopeLevelValueOf;
        if (str == null || (scopeLevelValueOf = ScopeLevel.valueOf(str)) == null) {
            return;
        }
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().scopeLevel(scopeLevelValueOf).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setTemplateBody(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().templateBody(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setTemplateLastUsed(long j) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().templateLastUsed(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setTemplateTitle(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().templateTitle(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setTemplateType(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().templateType(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setUnderlyingUploadedFile(UploadedFile uploadedFile) {
        sq8.m48649h(uploadedFile, "<set-?>");
        this.underlyingUploadedFile = uploadedFile;
    }

    public final void setUpdatedAt(long j) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().updatedAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final void setUploadSource(String str) {
        UploadedFile uploadedFileBuild = this.underlyingUploadedFile.copyOfBuilder().uploadSource(str).build();
        sq8.m48648g(uploadedFileBuild, "build(...)");
        this.underlyingUploadedFile = uploadedFileBuild;
    }

    public final FileData toFileData() {
        String fileUrl = getFileUrl();
        Uri uri = fileUrl != null ? Uri.parse(fileUrl) : null;
        String fileName = getFileName();
        String str = fileName == null ? "" : fileName;
        String fileMimeType = getFileMimeType();
        String str2 = fileMimeType == null ? "" : fileMimeType;
        String fileUrl2 = getFileUrl();
        String str3 = fileUrl2 == null ? "" : fileUrl2;
        String fileThumbnailUrl = getFileThumbnailUrl();
        return new FileData(0, uri, str, str2, str3, fileThumbnailUrl == null ? "" : fileThumbnailUrl, true, true, false, getId(), null, null, null, null, null, null, null, getUploadSource(), null, false, getScopeLevel(), getScopeId(), null, null, null, null, null, null, 265125888, null);
    }

    public final UploadedFiles toUploadedFiles() {
        String id = getId();
        String accountId = getAccountId();
        String str = accountId == null ? "" : accountId;
        String fileUrl = getFileUrl();
        String str2 = fileUrl == null ? "" : fileUrl;
        String fileThumbnailUrl = getFileThumbnailUrl();
        String str3 = fileThumbnailUrl == null ? "" : fileThumbnailUrl;
        String fileStorageDestination = getFileStorageDestination();
        String str4 = fileStorageDestination == null ? "" : fileStorageDestination;
        String fileName = getFileName();
        String str5 = fileName == null ? "" : fileName;
        String description = getDescription();
        String str6 = description == null ? "" : description;
        String documentCategory = getDocumentCategory();
        String str7 = documentCategory == null ? "" : documentCategory;
        String documentSubCategory = getDocumentSubCategory();
        String str8 = documentSubCategory == null ? "" : documentSubCategory;
        String templateType = getTemplateType();
        String str9 = templateType == null ? "" : templateType;
        String templateTitle = getTemplateTitle();
        String str10 = templateTitle == null ? "" : templateTitle;
        String templateBody = getTemplateBody();
        String str11 = templateBody == null ? "" : templateBody;
        long templateLastUsed = getTemplateLastUsed();
        String fileMimeType = getFileMimeType();
        return new UploadedFiles(id, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, templateLastUsed, fileMimeType == null ? "" : fileMimeType, getScopeId(), getScopeLevel(), getUploadSource(), getCreatedAt(), getUpdatedAt());
    }

    public UploadedFileSummary(UploadedFile uploadedFile) {
        sq8.m48649h(uploadedFile, "underlyingUploadedFile");
        this.underlyingUploadedFile = uploadedFile;
    }

    public /* synthetic */ UploadedFileSummary(UploadedFile uploadedFile, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : uploadedFile);
    }
}
