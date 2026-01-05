package ai.salesmax.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FileData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FileData> CREATOR = new Creator();
    private String businessId;
    private String contactId;
    private Uri contentUri;
    private String contentUriText;
    private String dealId;
    private String documentCategory;
    private String documentSubCategory;
    private String engagementId;
    private String fieldName;
    private String fileName;
    private String fileObjectRelationshipId;
    private int id;
    private String inputContext;
    private boolean isSuccess;
    private boolean isUploaded;
    private String mimeType;
    private String parentObjectId;
    private String parentObjectType;
    private String scopeId;
    private String scopeLevel;
    private boolean showBottom;
    private String thumbNailUri;
    private String transcription;
    private String translatedTranscription;
    private String uploadSource;
    private String uploadedFileId;
    private String uploadedUri;
    private boolean viewOnly;

    public static final class Creator implements Parcelable.Creator<FileData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileData createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new FileData(parcel.readInt(), (Uri) parcel.readParcelable(FileData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileData[] newArray(int i) {
            return new FileData[i];
        }
    }

    public FileData() {
        this(0, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public static /* synthetic */ FileObjectRelationshipSummary toFileObjectRelationshipSummary$default(FileData fileData, FileObjectRelationshipSummary fileObjectRelationshipSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            fileObjectRelationshipSummary = null;
        }
        return fileData.toFileObjectRelationshipSummary(fileObjectRelationshipSummary);
    }

    public static /* synthetic */ Template toTemplate$default(FileData fileData, Template template, int i, Object obj) {
        if ((i & 1) != 0) {
            template = null;
        }
        return fileData.toTemplate(template);
    }

    public static /* synthetic */ UploadedFileSummary toUploadedFileSummary$default(FileData fileData, UploadedFileSummary uploadedFileSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            uploadedFileSummary = null;
        }
        return fileData.toUploadedFileSummary(uploadedFileSummary);
    }

    public final FileData clone() {
        return new FileData(this.id, this.contentUri, this.fileName, this.mimeType, this.uploadedUri, this.thumbNailUri, this.isUploaded, this.isSuccess, this.viewOnly, this.uploadedFileId, this.fileObjectRelationshipId, this.engagementId, this.contactId, this.dealId, this.businessId, this.documentCategory, this.documentSubCategory, this.uploadSource, this.contentUriText, this.showBottom, this.scopeLevel, this.scopeId, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription);
    }

    public final int component1() {
        return this.id;
    }

    public final String component10() {
        return this.uploadedFileId;
    }

    public final String component11() {
        return this.fileObjectRelationshipId;
    }

    public final String component12() {
        return this.engagementId;
    }

    public final String component13() {
        return this.contactId;
    }

    public final String component14() {
        return this.dealId;
    }

    public final String component15() {
        return this.businessId;
    }

    public final String component16() {
        return this.documentCategory;
    }

    public final String component17() {
        return this.documentSubCategory;
    }

    public final String component18() {
        return this.uploadSource;
    }

    public final String component19() {
        return this.contentUriText;
    }

    public final Uri component2() {
        return this.contentUri;
    }

    public final boolean component20() {
        return this.showBottom;
    }

    public final String component21() {
        return this.scopeLevel;
    }

    public final String component22() {
        return this.scopeId;
    }

    public final String component23() {
        return this.parentObjectId;
    }

    public final String component24() {
        return this.parentObjectType;
    }

    public final String component25() {
        return this.fieldName;
    }

    public final String component26() {
        return this.inputContext;
    }

    public final String component27() {
        return this.transcription;
    }

    public final String component28() {
        return this.translatedTranscription;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final String component5() {
        return this.uploadedUri;
    }

    public final String component6() {
        return this.thumbNailUri;
    }

    public final boolean component7() {
        return this.isUploaded;
    }

    public final boolean component8() {
        return this.isSuccess;
    }

    public final boolean component9() {
        return this.viewOnly;
    }

    public final FileData copy(int i, Uri uri, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        sq8.m48649h(str, "fileName");
        sq8.m48649h(str2, "mimeType");
        sq8.m48649h(str3, "uploadedUri");
        sq8.m48649h(str4, "thumbNailUri");
        return new FileData(i, uri, str, str2, str3, str4, z, z2, z3, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z4, str15, str16, str17, str18, str19, str20, str21, str22);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileData)) {
            return false;
        }
        FileData fileData = (FileData) obj;
        return this.id == fileData.id && sq8.m48644c(this.contentUri, fileData.contentUri) && sq8.m48644c(this.fileName, fileData.fileName) && sq8.m48644c(this.mimeType, fileData.mimeType) && sq8.m48644c(this.uploadedUri, fileData.uploadedUri) && sq8.m48644c(this.thumbNailUri, fileData.thumbNailUri) && this.isUploaded == fileData.isUploaded && this.isSuccess == fileData.isSuccess && this.viewOnly == fileData.viewOnly && sq8.m48644c(this.uploadedFileId, fileData.uploadedFileId) && sq8.m48644c(this.fileObjectRelationshipId, fileData.fileObjectRelationshipId) && sq8.m48644c(this.engagementId, fileData.engagementId) && sq8.m48644c(this.contactId, fileData.contactId) && sq8.m48644c(this.dealId, fileData.dealId) && sq8.m48644c(this.businessId, fileData.businessId) && sq8.m48644c(this.documentCategory, fileData.documentCategory) && sq8.m48644c(this.documentSubCategory, fileData.documentSubCategory) && sq8.m48644c(this.uploadSource, fileData.uploadSource) && sq8.m48644c(this.contentUriText, fileData.contentUriText) && this.showBottom == fileData.showBottom && sq8.m48644c(this.scopeLevel, fileData.scopeLevel) && sq8.m48644c(this.scopeId, fileData.scopeId) && sq8.m48644c(this.parentObjectId, fileData.parentObjectId) && sq8.m48644c(this.parentObjectType, fileData.parentObjectType) && sq8.m48644c(this.fieldName, fileData.fieldName) && sq8.m48644c(this.inputContext, fileData.inputContext) && sq8.m48644c(this.transcription, fileData.transcription) && sq8.m48644c(this.translatedTranscription, fileData.translatedTranscription);
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final Uri getContentUri() {
        return this.contentUri;
    }

    public final String getContentUriText() {
        return this.contentUriText;
    }

    public final String getDealId() {
        return this.dealId;
    }

    public final String getDocumentCategory() {
        return this.documentCategory;
    }

    public final String getDocumentSubCategory() {
        return this.documentSubCategory;
    }

    public final String getEngagementId() {
        return this.engagementId;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileObjectRelationshipId() {
        return this.fileObjectRelationshipId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getInputContext() {
        return this.inputContext;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    public final String getParentObjectType() {
        return this.parentObjectType;
    }

    public final String getScopeId() {
        return this.scopeId;
    }

    public final String getScopeLevel() {
        return this.scopeLevel;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final String getThumbNailUri() {
        return this.thumbNailUri;
    }

    public final String getTranscription() {
        return this.transcription;
    }

    public final String getTranslatedTranscription() {
        return this.translatedTranscription;
    }

    public final String getUploadSource() {
        return this.uploadSource;
    }

    public final String getUploadedFileId() {
        return this.uploadedFileId;
    }

    public final String getUploadedUri() {
        return this.uploadedUri;
    }

    public final boolean getViewOnly() {
        return this.viewOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Uri uri = this.contentUri;
        int iHashCode2 = (((((((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.fileName.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + this.uploadedUri.hashCode()) * 31) + this.thumbNailUri.hashCode()) * 31;
        boolean z = this.isUploaded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        boolean z2 = this.isSuccess;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.viewOnly;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str = this.uploadedFileId;
        int iHashCode3 = (i6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileObjectRelationshipId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.engagementId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contactId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dealId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.businessId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.documentCategory;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.documentSubCategory;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.uploadSource;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.contentUriText;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        boolean z4 = this.showBottom;
        int i7 = (iHashCode12 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        String str11 = this.scopeLevel;
        int iHashCode13 = (i7 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.scopeId;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.parentObjectId;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.parentObjectType;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.fieldName;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.inputContext;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transcription;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.translatedTranscription;
        return iHashCode19 + (str18 != null ? str18.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final boolean isUploaded() {
        return this.isUploaded;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setContentUri(Uri uri) {
        this.contentUri = uri;
    }

    public final void setContentUriText(String str) {
        this.contentUriText = str;
    }

    public final void setDealId(String str) {
        this.dealId = str;
    }

    public final void setDocumentCategory(String str) {
        this.documentCategory = str;
    }

    public final void setDocumentSubCategory(String str) {
        this.documentSubCategory = str;
    }

    public final void setEngagementId(String str) {
        this.engagementId = str;
    }

    public final void setFieldName(String str) {
        this.fieldName = str;
    }

    public final void setFileName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFileObjectRelationshipId(String str) {
        this.fileObjectRelationshipId = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setInputContext(String str) {
        this.inputContext = str;
    }

    public final void setMimeType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setParentObjectId(String str) {
        this.parentObjectId = str;
    }

    public final void setParentObjectType(String str) {
        this.parentObjectType = str;
    }

    public final void setScopeId(String str) {
        this.scopeId = str;
    }

    public final void setScopeLevel(String str) {
        this.scopeLevel = str;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final void setThumbNailUri(String str) {
        sq8.m48649h(str, "<set-?>");
        this.thumbNailUri = str;
    }

    public final void setTranscription(String str) {
        this.transcription = str;
    }

    public final void setTranslatedTranscription(String str) {
        this.translatedTranscription = str;
    }

    public final void setUploadSource(String str) {
        this.uploadSource = str;
    }

    public final void setUploaded(boolean z) {
        this.isUploaded = z;
    }

    public final void setUploadedFileId(String str) {
        this.uploadedFileId = str;
    }

    public final void setUploadedUri(String str) {
        sq8.m48649h(str, "<set-?>");
        this.uploadedUri = str;
    }

    public final void setViewOnly(boolean z) {
        this.viewOnly = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FileObjectRelationshipSummary toFileObjectRelationshipSummary(FileObjectRelationshipSummary fileObjectRelationshipSummary) {
        if (fileObjectRelationshipSummary == null) {
            fileObjectRelationshipSummary = new FileObjectRelationshipSummary(null, 1, 0 == true ? 1 : 0);
        }
        fileObjectRelationshipSummary.setBusinessId(this.businessId);
        fileObjectRelationshipSummary.setContactId(this.contactId);
        fileObjectRelationshipSummary.setFileId(this.uploadedFileId);
        fileObjectRelationshipSummary.setDealId(this.dealId);
        fileObjectRelationshipSummary.setEngagementId(this.engagementId);
        String str = this.fileObjectRelationshipId;
        if (str == null) {
            str = "";
        }
        fileObjectRelationshipSummary.setId(str);
        fileObjectRelationshipSummary.setParentObjectId(this.parentObjectId);
        fileObjectRelationshipSummary.setParentObjectType(this.parentObjectType);
        fileObjectRelationshipSummary.setFieldName(this.fieldName);
        fileObjectRelationshipSummary.setInputContext(this.inputContext);
        return fileObjectRelationshipSummary;
    }

    public String toString() {
        return "FileData(id=" + this.id + ", contentUri=" + this.contentUri + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", uploadedUri=" + this.uploadedUri + ", thumbNailUri=" + this.thumbNailUri + ", isUploaded=" + this.isUploaded + ", isSuccess=" + this.isSuccess + ", viewOnly=" + this.viewOnly + ", uploadedFileId=" + this.uploadedFileId + ", fileObjectRelationshipId=" + this.fileObjectRelationshipId + ", engagementId=" + this.engagementId + ", contactId=" + this.contactId + ", dealId=" + this.dealId + ", businessId=" + this.businessId + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", uploadSource=" + this.uploadSource + ", contentUriText=" + this.contentUriText + ", showBottom=" + this.showBottom + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", parentObjectId=" + this.parentObjectId + ", parentObjectType=" + this.parentObjectType + ", fieldName=" + this.fieldName + ", inputContext=" + this.inputContext + ", transcription=" + this.transcription + ", translatedTranscription=" + this.translatedTranscription + ")";
    }

    public final Template toTemplate(Template template) {
        Template template2 = template == null ? new Template(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 67108863, null) : template;
        template2.setFileName(this.fileName);
        template2.setFileMimeType(this.mimeType);
        template2.setFileUrl(this.uploadedUri);
        template2.setThumbNailUri(this.thumbNailUri);
        template2.setFileStorageDestination("S3");
        String str = this.uploadedFileId;
        if (str == null) {
            str = "";
        }
        template2.setId(str);
        template2.setDocumentCategory(String.valueOf(this.documentCategory));
        String str2 = this.uploadSource;
        template2.setUploadSource(str2 != null ? str2 : "");
        template2.setScopeLevel(this.scopeLevel);
        template2.setScopeId(this.scopeId);
        return template2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UploadedFileSummary toUploadedFileSummary(UploadedFileSummary uploadedFileSummary) {
        if (uploadedFileSummary == null) {
            uploadedFileSummary = new UploadedFileSummary(null, 1, 0 == true ? 1 : 0);
        }
        uploadedFileSummary.setFileName(this.fileName);
        uploadedFileSummary.setFileMimeType(this.mimeType);
        uploadedFileSummary.setFileUrl(this.uploadedUri);
        uploadedFileSummary.setFileThumbnailUrl(this.thumbNailUri);
        uploadedFileSummary.setFileStorageDestination("S3");
        String str = this.uploadedFileId;
        if (str == null) {
            str = "";
        }
        uploadedFileSummary.setId(str);
        uploadedFileSummary.setDocumentCategory(this.documentCategory);
        uploadedFileSummary.setDocumentSubCategory(this.documentSubCategory);
        uploadedFileSummary.setUploadSource(this.uploadSource);
        uploadedFileSummary.setScopeLevel(this.scopeLevel);
        uploadedFileSummary.setScopeId(this.scopeId);
        return uploadedFileSummary;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.contentUri, i);
        parcel.writeString(this.fileName);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.uploadedUri);
        parcel.writeString(this.thumbNailUri);
        parcel.writeInt(this.isUploaded ? 1 : 0);
        parcel.writeInt(this.isSuccess ? 1 : 0);
        parcel.writeInt(this.viewOnly ? 1 : 0);
        parcel.writeString(this.uploadedFileId);
        parcel.writeString(this.fileObjectRelationshipId);
        parcel.writeString(this.engagementId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.dealId);
        parcel.writeString(this.businessId);
        parcel.writeString(this.documentCategory);
        parcel.writeString(this.documentSubCategory);
        parcel.writeString(this.uploadSource);
        parcel.writeString(this.contentUriText);
        parcel.writeInt(this.showBottom ? 1 : 0);
        parcel.writeString(this.scopeLevel);
        parcel.writeString(this.scopeId);
        parcel.writeString(this.parentObjectId);
        parcel.writeString(this.parentObjectType);
        parcel.writeString(this.fieldName);
        parcel.writeString(this.inputContext);
        parcel.writeString(this.transcription);
        parcel.writeString(this.translatedTranscription);
    }

    public FileData(int i, Uri uri, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        sq8.m48649h(str, "fileName");
        sq8.m48649h(str2, "mimeType");
        sq8.m48649h(str3, "uploadedUri");
        sq8.m48649h(str4, "thumbNailUri");
        this.id = i;
        this.contentUri = uri;
        this.fileName = str;
        this.mimeType = str2;
        this.uploadedUri = str3;
        this.thumbNailUri = str4;
        this.isUploaded = z;
        this.isSuccess = z2;
        this.viewOnly = z3;
        this.uploadedFileId = str5;
        this.fileObjectRelationshipId = str6;
        this.engagementId = str7;
        this.contactId = str8;
        this.dealId = str9;
        this.businessId = str10;
        this.documentCategory = str11;
        this.documentSubCategory = str12;
        this.uploadSource = str13;
        this.contentUriText = str14;
        this.showBottom = z4;
        this.scopeLevel = str15;
        this.scopeId = str16;
        this.parentObjectId = str17;
        this.parentObjectType = str18;
        this.fieldName = str19;
        this.inputContext = str20;
        this.transcription = str21;
        this.translatedTranscription = str22;
    }

    public /* synthetic */ FileData(int i, Uri uri, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : uri, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? null : str8, (i2 & 8192) != 0 ? null : str9, (i2 & Opcodes.ACC_ENUM) != 0 ? null : str10, (i2 & 32768) != 0 ? null : str11, (i2 & 65536) != 0 ? null : str12, (i2 & Opcodes.ACC_DEPRECATED) != 0 ? null : str13, (i2 & 262144) != 0 ? null : str14, (i2 & Opcodes.ASM8) != 0 ? false : z4, (i2 & 1048576) != 0 ? null : str15, (i2 & 2097152) != 0 ? null : str16, (i2 & 4194304) != 0 ? null : str17, (i2 & 8388608) != 0 ? null : str18, (i2 & 16777216) != 0 ? null : str19, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str20, (i2 & 67108864) != 0 ? null : str21, (i2 & 134217728) != 0 ? null : str22);
    }
}
