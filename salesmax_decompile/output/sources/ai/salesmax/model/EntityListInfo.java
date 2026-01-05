package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class EntityListInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EntityListInfo> CREATOR = new Creator();
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
    private final long updatedAt;

    public static final class Creator implements Parcelable.Creator<EntityListInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntityListInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            long j = parcel.readLong();
            String string24 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EntityListInfo(string, string2, string3, string4, string5, string6, string7, string8, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, boolValueOf, j, string24, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, boolValueOf2, parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntityListInfo[] newArray(int i) {
            return new EntityListInfo[i];
        }
    }

    public EntityListInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0L, 0L, -1, 31, null);
    }

    public static /* synthetic */ EntityListInfo copy$default(EntityListInfo entityListInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, long j, String str24, List list, List list2, Boolean bool2, long j2, long j3, int i, int i2, Object obj) {
        String str25 = (i & 1) != 0 ? entityListInfo.id : str;
        String str26 = (i & 2) != 0 ? entityListInfo.accountId : str2;
        String str27 = (i & 4) != 0 ? entityListInfo.entityListType : str3;
        String str28 = (i & 8) != 0 ? entityListInfo.entityTypeInList : str4;
        String str29 = (i & 16) != 0 ? entityListInfo.ownerId : str5;
        String str30 = (i & 32) != 0 ? entityListInfo.listName : str6;
        String str31 = (i & 64) != 0 ? entityListInfo.description : str7;
        String str32 = (i & 128) != 0 ? entityListInfo.status : str8;
        Integer num7 = (i & 256) != 0 ? entityListInfo.successfulCount : num;
        Integer num8 = (i & 512) != 0 ? entityListInfo.duplicateCount : num2;
        Integer num9 = (i & 1024) != 0 ? entityListInfo.invalidNumbersCount : num3;
        Integer num10 = (i & 2048) != 0 ? entityListInfo.invalidEmailCount : num4;
        Integer num11 = (i & 4096) != 0 ? entityListInfo.doNotTrackCount : num5;
        return entityListInfo.copy(str25, str26, str27, str28, str29, str30, str31, str32, num7, num8, num9, num10, num11, (i & 8192) != 0 ? entityListInfo.otherFailedCount : num6, (i & Opcodes.ACC_ENUM) != 0 ? entityListInfo.listCreationType : str9, (i & 32768) != 0 ? entityListInfo.rawBulkUploadFileRef : str10, (i & 65536) != 0 ? entityListInfo.rawBulkUploadFileHash : str11, (i & Opcodes.ACC_DEPRECATED) != 0 ? entityListInfo.modifiedBulkUploadFileRef : str12, (i & 262144) != 0 ? entityListInfo.finalBulkUploadFileRef : str13, (i & Opcodes.ASM8) != 0 ? entityListInfo.leadSourceForBulkUpload : str14, (i & 1048576) != 0 ? entityListInfo.defaultCountryCode : str15, (i & 2097152) != 0 ? entityListInfo.defaultCountryIso : str16, (i & 4194304) != 0 ? entityListInfo.notificationBody : str17, (i & 8388608) != 0 ? entityListInfo.rule : str18, (i & 16777216) != 0 ? entityListInfo.toBeAssigned : str19, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? entityListInfo.assignedUserId : str20, (i & 67108864) != 0 ? entityListInfo.assignedTeamId : str21, (i & 134217728) != 0 ? entityListInfo.associatedDistributionId : str22, (i & 268435456) != 0 ? entityListInfo.entityActionDefinitionReference : str23, (i & 536870912) != 0 ? entityListInfo.redistributeEntities : bool, (i & 1073741824) != 0 ? entityListInfo.redistributionRequestedAt : j, (i & Integer.MIN_VALUE) != 0 ? entityListInfo.dupliacteLeadList : str24, (i2 & 1) != 0 ? entityListInfo.tags : list, (i2 & 2) != 0 ? entityListInfo.chatMessagePlatform : list2, (i2 & 4) != 0 ? entityListInfo.allowMultiple : bool2, (i2 & 8) != 0 ? entityListInfo.createdAt : j2, (i2 & 16) != 0 ? entityListInfo.updatedAt : j3);
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.duplicateCount;
    }

    public final Integer component11() {
        return this.invalidNumbersCount;
    }

    public final Integer component12() {
        return this.invalidEmailCount;
    }

    public final Integer component13() {
        return this.doNotTrackCount;
    }

    public final Integer component14() {
        return this.otherFailedCount;
    }

    public final String component15() {
        return this.listCreationType;
    }

    public final String component16() {
        return this.rawBulkUploadFileRef;
    }

    public final String component17() {
        return this.rawBulkUploadFileHash;
    }

    public final String component18() {
        return this.modifiedBulkUploadFileRef;
    }

    public final String component19() {
        return this.finalBulkUploadFileRef;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component20() {
        return this.leadSourceForBulkUpload;
    }

    public final String component21() {
        return this.defaultCountryCode;
    }

    public final String component22() {
        return this.defaultCountryIso;
    }

    public final String component23() {
        return this.notificationBody;
    }

    public final String component24() {
        return this.rule;
    }

    public final String component25() {
        return this.toBeAssigned;
    }

    public final String component26() {
        return this.assignedUserId;
    }

    public final String component27() {
        return this.assignedTeamId;
    }

    public final String component28() {
        return this.associatedDistributionId;
    }

    public final String component29() {
        return this.entityActionDefinitionReference;
    }

    public final String component3() {
        return this.entityListType;
    }

    public final Boolean component30() {
        return this.redistributeEntities;
    }

    public final long component31() {
        return this.redistributionRequestedAt;
    }

    public final String component32() {
        return this.dupliacteLeadList;
    }

    public final List<String> component33() {
        return this.tags;
    }

    public final List<String> component34() {
        return this.chatMessagePlatform;
    }

    public final Boolean component35() {
        return this.allowMultiple;
    }

    public final long component36() {
        return this.createdAt;
    }

    public final long component37() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.entityTypeInList;
    }

    public final String component5() {
        return this.ownerId;
    }

    public final String component6() {
        return this.listName;
    }

    public final String component7() {
        return this.description;
    }

    public final String component8() {
        return this.status;
    }

    public final Integer component9() {
        return this.successfulCount;
    }

    public final EntityListInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, long j, String str24, List<String> list, List<String> list2, Boolean bool2, long j2, long j3) {
        return new EntityListInfo(str, str2, str3, str4, str5, str6, str7, str8, num, num2, num3, num4, num5, num6, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, bool, j, str24, list, list2, bool2, j2, j3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityListInfo)) {
            return false;
        }
        EntityListInfo entityListInfo = (EntityListInfo) obj;
        return sq8.m48644c(this.id, entityListInfo.id) && sq8.m48644c(this.accountId, entityListInfo.accountId) && sq8.m48644c(this.entityListType, entityListInfo.entityListType) && sq8.m48644c(this.entityTypeInList, entityListInfo.entityTypeInList) && sq8.m48644c(this.ownerId, entityListInfo.ownerId) && sq8.m48644c(this.listName, entityListInfo.listName) && sq8.m48644c(this.description, entityListInfo.description) && sq8.m48644c(this.status, entityListInfo.status) && sq8.m48644c(this.successfulCount, entityListInfo.successfulCount) && sq8.m48644c(this.duplicateCount, entityListInfo.duplicateCount) && sq8.m48644c(this.invalidNumbersCount, entityListInfo.invalidNumbersCount) && sq8.m48644c(this.invalidEmailCount, entityListInfo.invalidEmailCount) && sq8.m48644c(this.doNotTrackCount, entityListInfo.doNotTrackCount) && sq8.m48644c(this.otherFailedCount, entityListInfo.otherFailedCount) && sq8.m48644c(this.listCreationType, entityListInfo.listCreationType) && sq8.m48644c(this.rawBulkUploadFileRef, entityListInfo.rawBulkUploadFileRef) && sq8.m48644c(this.rawBulkUploadFileHash, entityListInfo.rawBulkUploadFileHash) && sq8.m48644c(this.modifiedBulkUploadFileRef, entityListInfo.modifiedBulkUploadFileRef) && sq8.m48644c(this.finalBulkUploadFileRef, entityListInfo.finalBulkUploadFileRef) && sq8.m48644c(this.leadSourceForBulkUpload, entityListInfo.leadSourceForBulkUpload) && sq8.m48644c(this.defaultCountryCode, entityListInfo.defaultCountryCode) && sq8.m48644c(this.defaultCountryIso, entityListInfo.defaultCountryIso) && sq8.m48644c(this.notificationBody, entityListInfo.notificationBody) && sq8.m48644c(this.rule, entityListInfo.rule) && sq8.m48644c(this.toBeAssigned, entityListInfo.toBeAssigned) && sq8.m48644c(this.assignedUserId, entityListInfo.assignedUserId) && sq8.m48644c(this.assignedTeamId, entityListInfo.assignedTeamId) && sq8.m48644c(this.associatedDistributionId, entityListInfo.associatedDistributionId) && sq8.m48644c(this.entityActionDefinitionReference, entityListInfo.entityActionDefinitionReference) && sq8.m48644c(this.redistributeEntities, entityListInfo.redistributeEntities) && this.redistributionRequestedAt == entityListInfo.redistributionRequestedAt && sq8.m48644c(this.dupliacteLeadList, entityListInfo.dupliacteLeadList) && sq8.m48644c(this.tags, entityListInfo.tags) && sq8.m48644c(this.chatMessagePlatform, entityListInfo.chatMessagePlatform) && sq8.m48644c(this.allowMultiple, entityListInfo.allowMultiple) && this.createdAt == entityListInfo.createdAt && this.updatedAt == entityListInfo.updatedAt;
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

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entityListType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entityTypeInList;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ownerId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.listName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.successfulCount;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.duplicateCount;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.invalidNumbersCount;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.invalidEmailCount;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.doNotTrackCount;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.otherFailedCount;
        int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str9 = this.listCreationType;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rawBulkUploadFileRef;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rawBulkUploadFileHash;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.modifiedBulkUploadFileRef;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.finalBulkUploadFileRef;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.leadSourceForBulkUpload;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.defaultCountryCode;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.defaultCountryIso;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.notificationBody;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.rule;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.toBeAssigned;
        int iHashCode25 = (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.assignedUserId;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.assignedTeamId;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.associatedDistributionId;
        int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.entityActionDefinitionReference;
        int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool = this.redistributeEntities;
        int iHashCode30 = (((iHashCode29 + (bool == null ? 0 : bool.hashCode())) * 31) + Long.hashCode(this.redistributionRequestedAt)) * 31;
        String str24 = this.dupliacteLeadList;
        int iHashCode31 = (iHashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode32 = (iHashCode31 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.chatMessagePlatform;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.allowMultiple;
        return ((((iHashCode33 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.updatedAt);
    }

    public String toString() {
        return "EntityListInfo(id=" + this.id + ", accountId=" + this.accountId + ", entityListType=" + this.entityListType + ", entityTypeInList=" + this.entityTypeInList + ", ownerId=" + this.ownerId + ", listName=" + this.listName + ", description=" + this.description + ", status=" + this.status + ", successfulCount=" + this.successfulCount + ", duplicateCount=" + this.duplicateCount + ", invalidNumbersCount=" + this.invalidNumbersCount + ", invalidEmailCount=" + this.invalidEmailCount + ", doNotTrackCount=" + this.doNotTrackCount + ", otherFailedCount=" + this.otherFailedCount + ", listCreationType=" + this.listCreationType + ", rawBulkUploadFileRef=" + this.rawBulkUploadFileRef + ", rawBulkUploadFileHash=" + this.rawBulkUploadFileHash + ", modifiedBulkUploadFileRef=" + this.modifiedBulkUploadFileRef + ", finalBulkUploadFileRef=" + this.finalBulkUploadFileRef + ", leadSourceForBulkUpload=" + this.leadSourceForBulkUpload + ", defaultCountryCode=" + this.defaultCountryCode + ", defaultCountryIso=" + this.defaultCountryIso + ", notificationBody=" + this.notificationBody + ", rule=" + this.rule + ", toBeAssigned=" + this.toBeAssigned + ", assignedUserId=" + this.assignedUserId + ", assignedTeamId=" + this.assignedTeamId + ", associatedDistributionId=" + this.associatedDistributionId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", redistributeEntities=" + this.redistributeEntities + ", redistributionRequestedAt=" + this.redistributionRequestedAt + ", dupliacteLeadList=" + this.dupliacteLeadList + ", tags=" + this.tags + ", chatMessagePlatform=" + this.chatMessagePlatform + ", allowMultiple=" + this.allowMultiple + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.entityListType);
        parcel.writeString(this.entityTypeInList);
        parcel.writeString(this.ownerId);
        parcel.writeString(this.listName);
        parcel.writeString(this.description);
        parcel.writeString(this.status);
        Integer num = this.successfulCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.duplicateCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.invalidNumbersCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.invalidEmailCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.doNotTrackCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.otherFailedCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.listCreationType);
        parcel.writeString(this.rawBulkUploadFileRef);
        parcel.writeString(this.rawBulkUploadFileHash);
        parcel.writeString(this.modifiedBulkUploadFileRef);
        parcel.writeString(this.finalBulkUploadFileRef);
        parcel.writeString(this.leadSourceForBulkUpload);
        parcel.writeString(this.defaultCountryCode);
        parcel.writeString(this.defaultCountryIso);
        parcel.writeString(this.notificationBody);
        parcel.writeString(this.rule);
        parcel.writeString(this.toBeAssigned);
        parcel.writeString(this.assignedUserId);
        parcel.writeString(this.assignedTeamId);
        parcel.writeString(this.associatedDistributionId);
        parcel.writeString(this.entityActionDefinitionReference);
        Boolean bool = this.redistributeEntities;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeLong(this.redistributionRequestedAt);
        parcel.writeString(this.dupliacteLeadList);
        parcel.writeStringList(this.tags);
        parcel.writeStringList(this.chatMessagePlatform);
        Boolean bool2 = this.allowMultiple;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeLong(this.createdAt);
        parcel.writeLong(this.updatedAt);
    }

    public EntityListInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, long j, String str24, List<String> list, List<String> list2, Boolean bool2, long j2, long j3) {
        this.id = str;
        this.accountId = str2;
        this.entityListType = str3;
        this.entityTypeInList = str4;
        this.ownerId = str5;
        this.listName = str6;
        this.description = str7;
        this.status = str8;
        this.successfulCount = num;
        this.duplicateCount = num2;
        this.invalidNumbersCount = num3;
        this.invalidEmailCount = num4;
        this.doNotTrackCount = num5;
        this.otherFailedCount = num6;
        this.listCreationType = str9;
        this.rawBulkUploadFileRef = str10;
        this.rawBulkUploadFileHash = str11;
        this.modifiedBulkUploadFileRef = str12;
        this.finalBulkUploadFileRef = str13;
        this.leadSourceForBulkUpload = str14;
        this.defaultCountryCode = str15;
        this.defaultCountryIso = str16;
        this.notificationBody = str17;
        this.rule = str18;
        this.toBeAssigned = str19;
        this.assignedUserId = str20;
        this.assignedTeamId = str21;
        this.associatedDistributionId = str22;
        this.entityActionDefinitionReference = str23;
        this.redistributeEntities = bool;
        this.redistributionRequestedAt = j;
        this.dupliacteLeadList = str24;
        this.tags = list;
        this.chatMessagePlatform = list2;
        this.allowMultiple = bool2;
        this.createdAt = j2;
        this.updatedAt = j3;
    }

    public /* synthetic */ EntityListInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, long j, String str24, List list, List list2, Boolean bool2, long j2, long j3, int i, int i2, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? 0 : num, (i & 512) != 0 ? 0 : num2, (i & 1024) != 0 ? 0 : num3, (i & 2048) != 0 ? 0 : num4, (i & 4096) != 0 ? 0 : num5, (i & 8192) != 0 ? 0 : num6, (i & Opcodes.ACC_ENUM) != 0 ? "" : str9, (i & 32768) != 0 ? "" : str10, (i & 65536) != 0 ? "" : str11, (i & Opcodes.ACC_DEPRECATED) != 0 ? "" : str12, (i & 262144) != 0 ? "" : str13, (i & Opcodes.ASM8) != 0 ? "" : str14, (i & 1048576) != 0 ? "" : str15, (i & 2097152) != 0 ? "" : str16, (i & 4194304) != 0 ? "" : str17, (i & 8388608) != 0 ? "" : str18, (i & 16777216) != 0 ? "" : str19, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str20, (i & 67108864) != 0 ? "" : str21, (i & 134217728) != 0 ? "" : str22, (i & 268435456) != 0 ? "" : str23, (i & 536870912) != 0 ? Boolean.FALSE : bool, (i & 1073741824) != 0 ? 0L : j, (i & Integer.MIN_VALUE) != 0 ? null : str24, (i2 & 1) != 0 ? null : list, (i2 & 2) == 0 ? list2 : null, (i2 & 4) != 0 ? Boolean.FALSE : bool2, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) == 0 ? j3 : 0L);
    }
}
