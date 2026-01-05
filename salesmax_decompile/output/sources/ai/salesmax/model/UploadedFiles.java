package ai.salesmax.model;

import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class UploadedFiles {
    public static final int $stable = 8;
    private String accountId;
    private long createdAt;
    private String description;
    private String documentCategory;
    private String documentSubCategory;
    private String fileMimeType;
    private String fileName;
    private String fileStorageDestination;
    private String fileThumbnailUrl;
    private String fileUrl;
    private String id;
    private String scopeId;
    private String scopeLevel;
    private String templateBody;
    private long templateLastUsed;
    private String templateTitle;
    private String templateType;
    private long updatedAt;
    private String uploadSource;

    public UploadedFiles() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0L, 0L, 524287, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.templateType;
    }

    public final String component11() {
        return this.templateTitle;
    }

    public final String component12() {
        return this.templateBody;
    }

    public final long component13() {
        return this.templateLastUsed;
    }

    public final String component14() {
        return this.fileMimeType;
    }

    public final String component15() {
        return this.scopeId;
    }

    public final String component16() {
        return this.scopeLevel;
    }

    public final String component17() {
        return this.uploadSource;
    }

    public final long component18() {
        return this.createdAt;
    }

    public final long component19() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final String component4() {
        return this.fileThumbnailUrl;
    }

    public final String component5() {
        return this.fileStorageDestination;
    }

    public final String component6() {
        return this.fileName;
    }

    public final String component7() {
        return this.description;
    }

    public final String component8() {
        return this.documentCategory;
    }

    public final String component9() {
        return this.documentSubCategory;
    }

    public final UploadedFiles copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, String str13, String str14, String str15, String str16, long j2, long j3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "fileUrl");
        sq8.m48649h(str4, "fileThumbnailUrl");
        sq8.m48649h(str5, "fileStorageDestination");
        sq8.m48649h(str6, "fileName");
        sq8.m48649h(str7, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str8, "documentCategory");
        sq8.m48649h(str9, "documentSubCategory");
        sq8.m48649h(str10, "templateType");
        sq8.m48649h(str11, "templateTitle");
        sq8.m48649h(str12, "templateBody");
        sq8.m48649h(str13, "fileMimeType");
        return new UploadedFiles(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, j, str13, str14, str15, str16, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadedFiles)) {
            return false;
        }
        UploadedFiles uploadedFiles = (UploadedFiles) obj;
        return sq8.m48644c(this.id, uploadedFiles.id) && sq8.m48644c(this.accountId, uploadedFiles.accountId) && sq8.m48644c(this.fileUrl, uploadedFiles.fileUrl) && sq8.m48644c(this.fileThumbnailUrl, uploadedFiles.fileThumbnailUrl) && sq8.m48644c(this.fileStorageDestination, uploadedFiles.fileStorageDestination) && sq8.m48644c(this.fileName, uploadedFiles.fileName) && sq8.m48644c(this.description, uploadedFiles.description) && sq8.m48644c(this.documentCategory, uploadedFiles.documentCategory) && sq8.m48644c(this.documentSubCategory, uploadedFiles.documentSubCategory) && sq8.m48644c(this.templateType, uploadedFiles.templateType) && sq8.m48644c(this.templateTitle, uploadedFiles.templateTitle) && sq8.m48644c(this.templateBody, uploadedFiles.templateBody) && this.templateLastUsed == uploadedFiles.templateLastUsed && sq8.m48644c(this.fileMimeType, uploadedFiles.fileMimeType) && sq8.m48644c(this.scopeId, uploadedFiles.scopeId) && sq8.m48644c(this.scopeLevel, uploadedFiles.scopeLevel) && sq8.m48644c(this.uploadSource, uploadedFiles.uploadSource) && this.createdAt == uploadedFiles.createdAt && this.updatedAt == uploadedFiles.updatedAt;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDocumentCategory() {
        return this.documentCategory;
    }

    public final String getDocumentSubCategory() {
        return this.documentSubCategory;
    }

    public final String getFileMimeType() {
        return this.fileMimeType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileStorageDestination() {
        return this.fileStorageDestination;
    }

    public final String getFileThumbnailUrl() {
        return this.fileThumbnailUrl;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getScopeId() {
        return this.scopeId;
    }

    public final String getScopeLevel() {
        return this.scopeLevel;
    }

    public final String getTemplateBody() {
        return this.templateBody;
    }

    public final long getTemplateLastUsed() {
        return this.templateLastUsed;
    }

    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUploadSource() {
        return this.uploadSource;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.fileThumbnailUrl.hashCode()) * 31) + this.fileStorageDestination.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.documentCategory.hashCode()) * 31) + this.documentSubCategory.hashCode()) * 31) + this.templateType.hashCode()) * 31) + this.templateTitle.hashCode()) * 31) + this.templateBody.hashCode()) * 31) + Long.hashCode(this.templateLastUsed)) * 31) + this.fileMimeType.hashCode()) * 31;
        String str = this.scopeId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scopeLevel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uploadSource;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.updatedAt);
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setDocumentCategory(String str) {
        sq8.m48649h(str, "<set-?>");
        this.documentCategory = str;
    }

    public final void setDocumentSubCategory(String str) {
        sq8.m48649h(str, "<set-?>");
        this.documentSubCategory = str;
    }

    public final void setFileMimeType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileMimeType = str;
    }

    public final void setFileName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFileStorageDestination(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileStorageDestination = str;
    }

    public final void setFileThumbnailUrl(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileThumbnailUrl = str;
    }

    public final void setFileUrl(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setScopeId(String str) {
        this.scopeId = str;
    }

    public final void setScopeLevel(String str) {
        this.scopeLevel = str;
    }

    public final void setTemplateBody(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateBody = str;
    }

    public final void setTemplateLastUsed(long j) {
        this.templateLastUsed = j;
    }

    public final void setTemplateTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateTitle = str;
    }

    public final void setTemplateType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateType = str;
    }

    public final void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public final void setUploadSource(String str) {
        this.uploadSource = str;
    }

    public String toString() {
        return "UploadedFiles(id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", fileMimeType=" + this.fileMimeType + ", scopeId=" + this.scopeId + ", scopeLevel=" + this.scopeLevel + ", uploadSource=" + this.uploadSource + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public UploadedFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, String str13, String str14, String str15, String str16, long j2, long j3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "fileUrl");
        sq8.m48649h(str4, "fileThumbnailUrl");
        sq8.m48649h(str5, "fileStorageDestination");
        sq8.m48649h(str6, "fileName");
        sq8.m48649h(str7, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str8, "documentCategory");
        sq8.m48649h(str9, "documentSubCategory");
        sq8.m48649h(str10, "templateType");
        sq8.m48649h(str11, "templateTitle");
        sq8.m48649h(str12, "templateBody");
        sq8.m48649h(str13, "fileMimeType");
        this.id = str;
        this.accountId = str2;
        this.fileUrl = str3;
        this.fileThumbnailUrl = str4;
        this.fileStorageDestination = str5;
        this.fileName = str6;
        this.description = str7;
        this.documentCategory = str8;
        this.documentSubCategory = str9;
        this.templateType = str10;
        this.templateTitle = str11;
        this.templateBody = str12;
        this.templateLastUsed = j;
        this.fileMimeType = str13;
        this.scopeId = str14;
        this.scopeLevel = str15;
        this.uploadSource = str16;
        this.createdAt = j2;
        this.updatedAt = j3;
    }

    public /* synthetic */ UploadedFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, String str13, String str14, String str15, String str16, long j2, long j3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? 0L : j, (i & 8192) == 0 ? str13 : "", (i & Opcodes.ACC_ENUM) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) == 0 ? str16 : null, (i & Opcodes.ACC_DEPRECATED) != 0 ? 0L : j2, (i & 262144) == 0 ? j3 : 0L);
    }
}
