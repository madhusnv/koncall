package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class Template extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Template> CREATOR = new Creator();
    private String accountId;
    private Long createdAt;
    private String description;
    private String documentCategory;
    private List<FileData> fileList;
    private String fileMimeType;
    private String fileName;
    private String fileStorageDestination;
    private String fileUrl;
    private String hasParent;
    private String id;
    private boolean isSelected;
    private String parentFileId;
    private String scopeId;
    private String scopeLevel;
    private boolean showBottom;
    private boolean showSelection;
    private String templateBody;
    private String templateExternalLink;
    private String templateTitle;
    private String templateType;
    private String thumbNailUri;
    private String trackedLink;
    private Long updatedAt;
    private String uploadSource;
    private String uploadedById;

    public static final class Creator implements Parcelable.Creator<Template> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Template createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FileData.CREATOR.createFromParcel(parcel));
            }
            return new Template(string, string2, string3, string4, string5, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Template[] newArray(int i) {
            return new Template[i];
        }
    }

    public Template() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 67108863, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.documentCategory;
    }

    public final String component11() {
        return this.templateType;
    }

    public final String component12() {
        return this.templateTitle;
    }

    public final String component13() {
        return this.templateBody;
    }

    public final String component14() {
        return this.templateExternalLink;
    }

    public final String component15() {
        return this.trackedLink;
    }

    public final String component16() {
        return this.hasParent;
    }

    public final String component17() {
        return this.parentFileId;
    }

    public final String component18() {
        return this.scopeLevel;
    }

    public final String component19() {
        return this.scopeId;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component20() {
        return this.uploadedById;
    }

    public final String component21() {
        return this.uploadSource;
    }

    public final boolean component22() {
        return this.showSelection;
    }

    public final boolean component23() {
        return this.isSelected;
    }

    public final boolean component24() {
        return this.showBottom;
    }

    public final Long component25() {
        return this.updatedAt;
    }

    public final Long component26() {
        return this.createdAt;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.fileUrl;
    }

    public final String component5() {
        return this.thumbNailUri;
    }

    public final List<FileData> component6() {
        return this.fileList;
    }

    public final String component7() {
        return this.fileMimeType;
    }

    public final String component8() {
        return this.fileStorageDestination;
    }

    public final String component9() {
        return this.description;
    }

    public final Template copy(String str, String str2, String str3, String str4, String str5, List<FileData> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z, boolean z2, boolean z3, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "fileName");
        sq8.m48649h(str4, "fileUrl");
        sq8.m48649h(str5, "thumbNailUri");
        sq8.m48649h(list, "fileList");
        sq8.m48649h(str6, "fileMimeType");
        sq8.m48649h(str7, "fileStorageDestination");
        sq8.m48649h(str8, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str9, "documentCategory");
        sq8.m48649h(str10, "templateType");
        sq8.m48649h(str11, "templateTitle");
        sq8.m48649h(str12, "templateBody");
        sq8.m48649h(str13, "templateExternalLink");
        sq8.m48649h(str14, "trackedLink");
        sq8.m48649h(str19, "uploadedById");
        sq8.m48649h(str20, "uploadSource");
        return new Template(str, str2, str3, str4, str5, list, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, z, z2, z3, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Template)) {
            return false;
        }
        Template template = (Template) obj;
        return sq8.m48644c(this.id, template.id) && sq8.m48644c(this.accountId, template.accountId) && sq8.m48644c(this.fileName, template.fileName) && sq8.m48644c(this.fileUrl, template.fileUrl) && sq8.m48644c(this.thumbNailUri, template.thumbNailUri) && sq8.m48644c(this.fileList, template.fileList) && sq8.m48644c(this.fileMimeType, template.fileMimeType) && sq8.m48644c(this.fileStorageDestination, template.fileStorageDestination) && sq8.m48644c(this.description, template.description) && sq8.m48644c(this.documentCategory, template.documentCategory) && sq8.m48644c(this.templateType, template.templateType) && sq8.m48644c(this.templateTitle, template.templateTitle) && sq8.m48644c(this.templateBody, template.templateBody) && sq8.m48644c(this.templateExternalLink, template.templateExternalLink) && sq8.m48644c(this.trackedLink, template.trackedLink) && sq8.m48644c(this.hasParent, template.hasParent) && sq8.m48644c(this.parentFileId, template.parentFileId) && sq8.m48644c(this.scopeLevel, template.scopeLevel) && sq8.m48644c(this.scopeId, template.scopeId) && sq8.m48644c(this.uploadedById, template.uploadedById) && sq8.m48644c(this.uploadSource, template.uploadSource) && this.showSelection == template.showSelection && this.isSelected == template.isSelected && this.showBottom == template.showBottom && sq8.m48644c(this.updatedAt, template.updatedAt) && sq8.m48644c(this.createdAt, template.createdAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDocumentCategory() {
        return this.documentCategory;
    }

    public final List<FileData> getFileList() {
        return this.fileList;
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

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getHasParent() {
        return this.hasParent;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentFileId() {
        return this.parentFileId;
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

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final String getTemplateBody() {
        return this.templateBody;
    }

    public final String getTemplateExternalLink() {
        return this.templateExternalLink;
    }

    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final String getThumbNailUri() {
        return this.thumbNailUri;
    }

    public final String getTrackedLink() {
        return this.trackedLink;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUploadSource() {
        return this.uploadSource;
    }

    public final String getUploadedById() {
        return this.uploadedById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.thumbNailUri.hashCode()) * 31) + this.fileList.hashCode()) * 31) + this.fileMimeType.hashCode()) * 31) + this.fileStorageDestination.hashCode()) * 31) + this.description.hashCode()) * 31) + this.documentCategory.hashCode()) * 31) + this.templateType.hashCode()) * 31) + this.templateTitle.hashCode()) * 31) + this.templateBody.hashCode()) * 31) + this.templateExternalLink.hashCode()) * 31) + this.trackedLink.hashCode()) * 31;
        String str = this.hasParent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentFileId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scopeLevel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scopeId;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.uploadedById.hashCode()) * 31) + this.uploadSource.hashCode()) * 31;
        boolean z = this.showSelection;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode5 + i) * 31;
        boolean z2 = this.isSelected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.showBottom;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        Long l = this.updatedAt;
        int iHashCode6 = (i5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setDocumentCategory(String str) {
        sq8.m48649h(str, "<set-?>");
        this.documentCategory = str;
    }

    public final void setFileList(List<FileData> list) {
        sq8.m48649h(list, "<set-?>");
        this.fileList = list;
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

    public final void setFileUrl(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setHasParent(String str) {
        this.hasParent = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setParentFileId(String str) {
        this.parentFileId = str;
    }

    public final void setScopeId(String str) {
        this.scopeId = str;
    }

    public final void setScopeLevel(String str) {
        this.scopeLevel = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public final void setTemplateBody(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateBody = str;
    }

    public final void setTemplateExternalLink(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateExternalLink = str;
    }

    public final void setTemplateTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateTitle = str;
    }

    public final void setTemplateType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.templateType = str;
    }

    public final void setThumbNailUri(String str) {
        sq8.m48649h(str, "<set-?>");
        this.thumbNailUri = str;
    }

    public final void setTrackedLink(String str) {
        sq8.m48649h(str, "<set-?>");
        this.trackedLink = str;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setUploadSource(String str) {
        sq8.m48649h(str, "<set-?>");
        this.uploadSource = str;
    }

    public final void setUploadedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.uploadedById = str;
    }

    public String toString() {
        return "Template(id=" + this.id + ", accountId=" + this.accountId + ", fileName=" + this.fileName + ", fileUrl=" + this.fileUrl + ", thumbNailUri=" + this.thumbNailUri + ", fileList=" + this.fileList + ", fileMimeType=" + this.fileMimeType + ", fileStorageDestination=" + this.fileStorageDestination + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateExternalLink=" + this.templateExternalLink + ", trackedLink=" + this.trackedLink + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", uploadSource=" + this.uploadSource + ", showSelection=" + this.showSelection + ", isSelected=" + this.isSelected + ", showBottom=" + this.showBottom + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.fileName);
        parcel.writeString(this.fileUrl);
        parcel.writeString(this.thumbNailUri);
        List<FileData> list = this.fileList;
        parcel.writeInt(list.size());
        Iterator<FileData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.fileMimeType);
        parcel.writeString(this.fileStorageDestination);
        parcel.writeString(this.description);
        parcel.writeString(this.documentCategory);
        parcel.writeString(this.templateType);
        parcel.writeString(this.templateTitle);
        parcel.writeString(this.templateBody);
        parcel.writeString(this.templateExternalLink);
        parcel.writeString(this.trackedLink);
        parcel.writeString(this.hasParent);
        parcel.writeString(this.parentFileId);
        parcel.writeString(this.scopeLevel);
        parcel.writeString(this.scopeId);
        parcel.writeString(this.uploadedById);
        parcel.writeString(this.uploadSource);
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showBottom ? 1 : 0);
        Long l = this.updatedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.createdAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public /* synthetic */ Template(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z, boolean z2, boolean z3, Long l, Long l2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & Opcodes.ACC_ENUM) != 0 ? "" : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & Opcodes.ACC_DEPRECATED) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & Opcodes.ASM8) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? false : z, (i & 4194304) != 0 ? false : z2, (i & 8388608) == 0 ? z3 : false, (i & 16777216) != 0 ? null : l, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? l2 : null);
    }

    public Template(String str, String str2, String str3, String str4, String str5, List<FileData> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z, boolean z2, boolean z3, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "fileName");
        sq8.m48649h(str4, "fileUrl");
        sq8.m48649h(str5, "thumbNailUri");
        sq8.m48649h(list, "fileList");
        sq8.m48649h(str6, "fileMimeType");
        sq8.m48649h(str7, "fileStorageDestination");
        sq8.m48649h(str8, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str9, "documentCategory");
        sq8.m48649h(str10, "templateType");
        sq8.m48649h(str11, "templateTitle");
        sq8.m48649h(str12, "templateBody");
        sq8.m48649h(str13, "templateExternalLink");
        sq8.m48649h(str14, "trackedLink");
        sq8.m48649h(str19, "uploadedById");
        sq8.m48649h(str20, "uploadSource");
        this.id = str;
        this.accountId = str2;
        this.fileName = str3;
        this.fileUrl = str4;
        this.thumbNailUri = str5;
        this.fileList = list;
        this.fileMimeType = str6;
        this.fileStorageDestination = str7;
        this.description = str8;
        this.documentCategory = str9;
        this.templateType = str10;
        this.templateTitle = str11;
        this.templateBody = str12;
        this.templateExternalLink = str13;
        this.trackedLink = str14;
        this.hasParent = str15;
        this.parentFileId = str16;
        this.scopeLevel = str17;
        this.scopeId = str18;
        this.uploadedById = str19;
        this.uploadSource = str20;
        this.showSelection = z;
        this.isSelected = z2;
        this.showBottom = z3;
        this.updatedAt = l;
        this.createdAt = l2;
    }
}
