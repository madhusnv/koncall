package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class WhatsAppTemplates extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WhatsAppTemplates> CREATOR = new Creator();
    private String accountId;
    private Long archivedAt;
    private String archivedStatus;
    private String category;
    private List<TemplateComponent> components;
    private Long createdAt;
    private FileData defaultMedia;
    private List<MappedVariable> defaultVariableMap;
    private String id;
    private boolean isSelected;
    private String language;
    private Long lastUsed;
    private String name;
    private boolean newFileUploaded;
    private String platform;
    private boolean showBottom;
    private boolean showSelection;
    private String status;
    private List<String> tags;
    private String templateId;
    private transient List<TemplateVariable> templateVariables;
    private Long updatedAt;
    private String whatsappBusinessAccount;

    public static final class Creator implements Parcelable.Creator<WhatsAppTemplates> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhatsAppTemplates createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MappedVariable.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(TemplateComponent.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            FileData fileDataCreateFromParcel = parcel.readInt() == 0 ? null : FileData.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList4.add(TemplateVariable.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            return new WhatsAppTemplates(string, string2, string3, string4, string5, string6, string7, arrayListCreateStringArrayList, string8, string9, arrayList, arrayList2, fileDataCreateFromParcel, string10, lValueOf, lValueOf2, z, z2, z3, z4, arrayList4, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhatsAppTemplates[] newArray(int i) {
            return new WhatsAppTemplates[i];
        }
    }

    public WhatsAppTemplates() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 8388607, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.language;
    }

    public final List<MappedVariable> component11() {
        return this.defaultVariableMap;
    }

    public final List<TemplateComponent> component12() {
        return this.components;
    }

    public final FileData component13() {
        return this.defaultMedia;
    }

    public final String component14() {
        return this.archivedStatus;
    }

    public final Long component15() {
        return this.archivedAt;
    }

    public final Long component16() {
        return this.lastUsed;
    }

    public final boolean component17() {
        return this.showSelection;
    }

    public final boolean component18() {
        return this.isSelected;
    }

    public final boolean component19() {
        return this.showBottom;
    }

    public final String component2() {
        return this.accountId;
    }

    public final boolean component20() {
        return this.newFileUploaded;
    }

    public final List<TemplateVariable> component21() {
        return this.templateVariables;
    }

    public final Long component22() {
        return this.updatedAt;
    }

    public final Long component23() {
        return this.createdAt;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.whatsappBusinessAccount;
    }

    public final String component5() {
        return this.platform;
    }

    public final String component6() {
        return this.category;
    }

    public final String component7() {
        return this.status;
    }

    public final List<String> component8() {
        return this.tags;
    }

    public final String component9() {
        return this.templateId;
    }

    public final WhatsAppTemplates copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, String str9, List<MappedVariable> list2, List<TemplateComponent> list3, FileData fileData, String str10, Long l, Long l2, boolean z, boolean z2, boolean z3, boolean z4, List<TemplateVariable> list4, Long l3, Long l4) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(list4, "templateVariables");
        return new WhatsAppTemplates(str, str2, str3, str4, str5, str6, str7, list, str8, str9, list2, list3, fileData, str10, l, l2, z, z2, z3, z4, list4, l3, l4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsAppTemplates)) {
            return false;
        }
        WhatsAppTemplates whatsAppTemplates = (WhatsAppTemplates) obj;
        return sq8.m48644c(this.id, whatsAppTemplates.id) && sq8.m48644c(this.accountId, whatsAppTemplates.accountId) && sq8.m48644c(this.name, whatsAppTemplates.name) && sq8.m48644c(this.whatsappBusinessAccount, whatsAppTemplates.whatsappBusinessAccount) && sq8.m48644c(this.platform, whatsAppTemplates.platform) && sq8.m48644c(this.category, whatsAppTemplates.category) && sq8.m48644c(this.status, whatsAppTemplates.status) && sq8.m48644c(this.tags, whatsAppTemplates.tags) && sq8.m48644c(this.templateId, whatsAppTemplates.templateId) && sq8.m48644c(this.language, whatsAppTemplates.language) && sq8.m48644c(this.defaultVariableMap, whatsAppTemplates.defaultVariableMap) && sq8.m48644c(this.components, whatsAppTemplates.components) && sq8.m48644c(this.defaultMedia, whatsAppTemplates.defaultMedia) && sq8.m48644c(this.archivedStatus, whatsAppTemplates.archivedStatus) && sq8.m48644c(this.archivedAt, whatsAppTemplates.archivedAt) && sq8.m48644c(this.lastUsed, whatsAppTemplates.lastUsed) && this.showSelection == whatsAppTemplates.showSelection && this.isSelected == whatsAppTemplates.isSelected && this.showBottom == whatsAppTemplates.showBottom && this.newFileUploaded == whatsAppTemplates.newFileUploaded && sq8.m48644c(this.templateVariables, whatsAppTemplates.templateVariables) && sq8.m48644c(this.updatedAt, whatsAppTemplates.updatedAt) && sq8.m48644c(this.createdAt, whatsAppTemplates.createdAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Long getArchivedAt() {
        return this.archivedAt;
    }

    public final String getArchivedStatus() {
        return this.archivedStatus;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<TemplateComponent> getComponents() {
        return this.components;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final FileData getDefaultMedia() {
        return this.defaultMedia;
    }

    public final List<MappedVariable> getDefaultVariableMap() {
        return this.defaultVariableMap;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getLastUsed() {
        return this.lastUsed;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNewFileUploaded() {
        return this.newFileUploaded;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final List<TemplateVariable> getTemplateVariables() {
        return this.templateVariables;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWhatsappBusinessAccount() {
        return this.whatsappBusinessAccount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.whatsappBusinessAccount;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.templateId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.language;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<MappedVariable> list2 = this.defaultVariableMap;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TemplateComponent> list3 = this.components;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        FileData fileData = this.defaultMedia;
        int iHashCode12 = (iHashCode11 + (fileData == null ? 0 : fileData.hashCode())) * 31;
        String str8 = this.archivedStatus;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.archivedAt;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastUsed;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z = this.showSelection;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode15 + i) * 31;
        boolean z2 = this.isSelected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.showBottom;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.newFileUploaded;
        int iHashCode16 = (((i6 + (z4 ? 1 : z4 ? 1 : 0)) * 31) + this.templateVariables.hashCode()) * 31;
        Long l3 = this.updatedAt;
        int iHashCode17 = (iHashCode16 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.createdAt;
        return iHashCode17 + (l4 != null ? l4.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setArchivedAt(Long l) {
        this.archivedAt = l;
    }

    public final void setArchivedStatus(String str) {
        this.archivedStatus = str;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setComponents(List<TemplateComponent> list) {
        this.components = list;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setDefaultMedia(FileData fileData) {
        this.defaultMedia = fileData;
    }

    public final void setDefaultVariableMap(List<MappedVariable> list) {
        this.defaultVariableMap = list;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLastUsed(Long l) {
        this.lastUsed = l;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNewFileUploaded(boolean z) {
        this.newFileUploaded = z;
    }

    public final void setPlatform(String str) {
        this.platform = str;
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

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateVariables(List<TemplateVariable> list) {
        sq8.m48649h(list, "<set-?>");
        this.templateVariables = list;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setWhatsappBusinessAccount(String str) {
        this.whatsappBusinessAccount = str;
    }

    public String toString() {
        return "WhatsAppTemplates(id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", whatsappBusinessAccount=" + this.whatsappBusinessAccount + ", platform=" + this.platform + ", category=" + this.category + ", status=" + this.status + ", tags=" + this.tags + ", templateId=" + this.templateId + ", language=" + this.language + ", defaultVariableMap=" + this.defaultVariableMap + ", components=" + this.components + ", defaultMedia=" + this.defaultMedia + ", archivedStatus=" + this.archivedStatus + ", archivedAt=" + this.archivedAt + ", lastUsed=" + this.lastUsed + ", showSelection=" + this.showSelection + ", isSelected=" + this.isSelected + ", showBottom=" + this.showBottom + ", newFileUploaded=" + this.newFileUploaded + ", templateVariables=" + this.templateVariables + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    public final Template toTemplate() {
        TemplateComponent templateComponent;
        WaBody waBody;
        TemplateComponent templateComponent2;
        WaHeader waHeader;
        String str = this.id;
        String str2 = this.accountId;
        String str3 = this.name;
        String str4 = str3 == null ? "" : str3;
        FileData fileData = this.defaultMedia;
        String waText = null;
        String uploadedUri = fileData != null ? fileData.getUploadedUri() : null;
        String str5 = uploadedUri == null ? "" : uploadedUri;
        FileData fileData2 = this.defaultMedia;
        List listM21242g = fileData2 != null ? ch3.m21242g(fileData2) : null;
        if (listM21242g == null) {
            listM21242g = ch3.m21246k();
        }
        List list = listM21242g;
        FileData fileData3 = this.defaultMedia;
        String mimeType = fileData3 != null ? fileData3.getMimeType() : null;
        String str6 = mimeType == null ? "" : mimeType;
        FileData fileData4 = this.defaultMedia;
        String uploadedUri2 = fileData4 != null ? fileData4.getUploadedUri() : null;
        String str7 = uploadedUri2 == null ? "" : uploadedUri2;
        String str8 = this.name;
        String str9 = str8 == null ? "" : str8;
        String str10 = this.category;
        String str11 = str10 == null ? "" : str10;
        List<TemplateComponent> list2 = this.components;
        String waText2 = (list2 == null || (templateComponent2 = (TemplateComponent) kh3.h0(list2)) == null || (waHeader = templateComponent2.getWaHeader()) == null) ? null : waHeader.getWaText();
        String str12 = waText2 == null ? "" : waText2;
        List<TemplateComponent> list3 = this.components;
        if (list3 != null && (templateComponent = (TemplateComponent) kh3.h0(list3)) != null && (waBody = templateComponent.getWaBody()) != null) {
            waText = waBody.getWaText();
        }
        String str13 = waText == null ? "" : waText;
        String str14 = this.templateId;
        String str15 = str14 == null ? "" : str14;
        String str16 = str14 == null ? "" : str14;
        String str17 = this.whatsappBusinessAccount;
        Template template = new Template(str, str2, str4, str5, null, list, str6, str7, str9, str11, "wabaTemplate", str12, str13, str15, str16, null, null, null, null, "", str17 == null ? "" : str17, this.showSelection, this.isSelected, this.showBottom, getUpdatedAt(), getCreatedAt(), 16, null);
        template.setPosition(getPosition());
        template.setHighLightTerm(getHighLightTerm());
        return template;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WhatsAppTemplateSummary toWhatsAppTemplateSummary() {
        WhatsAppTemplateSummary whatsAppTemplateSummary = new WhatsAppTemplateSummary(null, 1, 0 == true ? 1 : 0);
        whatsAppTemplateSummary.setId(this.id);
        whatsAppTemplateSummary.setAccountId(this.accountId);
        whatsAppTemplateSummary.setLastUsed(this.lastUsed);
        whatsAppTemplateSummary.setArchivedAt(this.archivedAt);
        whatsAppTemplateSummary.setArchivedStatus(this.archivedStatus);
        whatsAppTemplateSummary.setStatus(this.status);
        whatsAppTemplateSummary.setCategory(this.category);
        whatsAppTemplateSummary.setStatus(this.status);
        whatsAppTemplateSummary.setWhatsappBusinessAccount(this.whatsappBusinessAccount);
        whatsAppTemplateSummary.setComponents(this.components);
        whatsAppTemplateSummary.setDefaultVariableMap(this.defaultVariableMap);
        whatsAppTemplateSummary.setDefaultMedia(this.defaultMedia);
        whatsAppTemplateSummary.setTags(this.tags);
        whatsAppTemplateSummary.setName(this.name);
        whatsAppTemplateSummary.setPlatform(this.platform);
        whatsAppTemplateSummary.setTemplateId(this.templateId);
        whatsAppTemplateSummary.setLanguage(this.language);
        return whatsAppTemplateSummary;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.name);
        parcel.writeString(this.whatsappBusinessAccount);
        parcel.writeString(this.platform);
        parcel.writeString(this.category);
        parcel.writeString(this.status);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.templateId);
        parcel.writeString(this.language);
        List<MappedVariable> list = this.defaultVariableMap;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MappedVariable> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<TemplateComponent> list2 = this.components;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<TemplateComponent> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        FileData fileData = this.defaultMedia;
        if (fileData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fileData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.archivedStatus);
        Long l = this.archivedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.lastUsed;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showBottom ? 1 : 0);
        parcel.writeInt(this.newFileUploaded ? 1 : 0);
        List<TemplateVariable> list3 = this.templateVariables;
        parcel.writeInt(list3.size());
        Iterator<TemplateVariable> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        Long l3 = this.updatedAt;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.createdAt;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
    }

    public /* synthetic */ WhatsAppTemplates(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, List list2, List list3, FileData fileData, String str10, Long l, Long l2, boolean z, boolean z2, boolean z3, boolean z4, List list4, Long l3, Long l4, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : fileData, (i & 8192) != 0 ? null : str10, (i & Opcodes.ACC_ENUM) != 0 ? null : l, (i & 32768) != 0 ? null : l2, (i & 65536) != 0 ? false : z, (i & Opcodes.ACC_DEPRECATED) != 0 ? false : z2, (i & 262144) != 0 ? false : z3, (i & Opcodes.ASM8) == 0 ? z4 : false, (i & 1048576) != 0 ? new ArrayList() : list4, (i & 2097152) != 0 ? null : l3, (i & 4194304) != 0 ? null : l4);
    }

    public WhatsAppTemplates(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, String str9, List<MappedVariable> list2, List<TemplateComponent> list3, FileData fileData, String str10, Long l, Long l2, boolean z, boolean z2, boolean z3, boolean z4, List<TemplateVariable> list4, Long l3, Long l4) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(list4, "templateVariables");
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.whatsappBusinessAccount = str4;
        this.platform = str5;
        this.category = str6;
        this.status = str7;
        this.tags = list;
        this.templateId = str8;
        this.language = str9;
        this.defaultVariableMap = list2;
        this.components = list3;
        this.defaultMedia = fileData;
        this.archivedStatus = str10;
        this.archivedAt = l;
        this.lastUsed = l2;
        this.showSelection = z;
        this.isSelected = z2;
        this.showBottom = z3;
        this.newFileUploaded = z4;
        this.templateVariables = list4;
        this.updatedAt = l3;
        this.createdAt = l4;
    }
}
