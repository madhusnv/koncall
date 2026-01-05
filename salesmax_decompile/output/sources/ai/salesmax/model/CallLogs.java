package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CallLogs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CallLogs> CREATOR = new Creator();
    private String callCachedName;
    private String callCachedPhoto;
    private String callDate;
    private String callDuration;
    private String callID;
    private String callLastModified;
    private String callNumber;
    private String callNumberEdited;
    private String callPlacementId;
    private String callType;
    private boolean isCloudTelephony;
    private boolean isSelected;
    private String subscriptionId;

    public static final class Creator implements Parcelable.Creator<CallLogs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallLogs createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new CallLogs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallLogs[] newArray(int i) {
            return new CallLogs[i];
        }
    }

    public CallLogs() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, false, 8191, null);
    }

    public final String component1() {
        return this.callID;
    }

    public final boolean component10() {
        return this.isSelected;
    }

    public final String component11() {
        return this.subscriptionId;
    }

    public final String component12() {
        return this.callPlacementId;
    }

    public final boolean component13() {
        return this.isCloudTelephony;
    }

    public final String component2() {
        return this.callDuration;
    }

    public final String component3() {
        return this.callType;
    }

    public final String component4() {
        return this.callDate;
    }

    public final String component5() {
        return this.callNumber;
    }

    public final String component6() {
        return this.callLastModified;
    }

    public final String component7() {
        return this.callCachedName;
    }

    public final String component8() {
        return this.callCachedPhoto;
    }

    public final String component9() {
        return this.callNumberEdited;
    }

    public final CallLogs copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, boolean z2) {
        sq8.m48649h(str, "callID");
        sq8.m48649h(str2, "callDuration");
        sq8.m48649h(str3, "callType");
        sq8.m48649h(str4, "callDate");
        sq8.m48649h(str5, "callNumber");
        sq8.m48649h(str6, "callLastModified");
        sq8.m48649h(str9, "callNumberEdited");
        sq8.m48649h(str10, "subscriptionId");
        return new CallLogs(str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, str11, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallLogs)) {
            return false;
        }
        CallLogs callLogs = (CallLogs) obj;
        return sq8.m48644c(this.callID, callLogs.callID) && sq8.m48644c(this.callDuration, callLogs.callDuration) && sq8.m48644c(this.callType, callLogs.callType) && sq8.m48644c(this.callDate, callLogs.callDate) && sq8.m48644c(this.callNumber, callLogs.callNumber) && sq8.m48644c(this.callLastModified, callLogs.callLastModified) && sq8.m48644c(this.callCachedName, callLogs.callCachedName) && sq8.m48644c(this.callCachedPhoto, callLogs.callCachedPhoto) && sq8.m48644c(this.callNumberEdited, callLogs.callNumberEdited) && this.isSelected == callLogs.isSelected && sq8.m48644c(this.subscriptionId, callLogs.subscriptionId) && sq8.m48644c(this.callPlacementId, callLogs.callPlacementId) && this.isCloudTelephony == callLogs.isCloudTelephony;
    }

    public final String getCallCachedName() {
        return this.callCachedName;
    }

    public final String getCallCachedPhoto() {
        return this.callCachedPhoto;
    }

    public final String getCallDate() {
        return this.callDate;
    }

    public final String getCallDuration() {
        return this.callDuration;
    }

    public final String getCallID() {
        return this.callID;
    }

    public final String getCallLastModified() {
        return this.callLastModified;
    }

    public final String getCallNumber() {
        return this.callNumber;
    }

    public final String getCallNumberEdited() {
        return this.callNumberEdited;
    }

    public final String getCallPlacementId() {
        return this.callPlacementId;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((this.callID.hashCode() * 31) + this.callDuration.hashCode()) * 31) + this.callType.hashCode()) * 31) + this.callDate.hashCode()) * 31) + this.callNumber.hashCode()) * 31) + this.callLastModified.hashCode()) * 31;
        String str = this.callCachedName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.callCachedPhoto;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.callNumberEdited.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode4 = (((iHashCode3 + i) * 31) + this.subscriptionId.hashCode()) * 31;
        String str3 = this.callPlacementId;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.isCloudTelephony;
        return iHashCode5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isCloudTelephony() {
        return this.isCloudTelephony;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCallCachedName(String str) {
        this.callCachedName = str;
    }

    public final void setCallCachedPhoto(String str) {
        this.callCachedPhoto = str;
    }

    public final void setCallDate(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callDate = str;
    }

    public final void setCallDuration(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callDuration = str;
    }

    public final void setCallID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callID = str;
    }

    public final void setCallLastModified(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callLastModified = str;
    }

    public final void setCallNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callNumber = str;
    }

    public final void setCallNumberEdited(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callNumberEdited = str;
    }

    public final void setCallPlacementId(String str) {
        this.callPlacementId = str;
    }

    public final void setCallType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callType = str;
    }

    public final void setCloudTelephony(boolean z) {
        this.isCloudTelephony = z;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setSubscriptionId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.subscriptionId = str;
    }

    public String toString() {
        return "CallLogs(callID=" + this.callID + ", callDuration=" + this.callDuration + ", callType=" + this.callType + ", callDate=" + this.callDate + ", callNumber=" + this.callNumber + ", callLastModified=" + this.callLastModified + ", callCachedName=" + this.callCachedName + ", callCachedPhoto=" + this.callCachedPhoto + ", callNumberEdited=" + this.callNumberEdited + ", isSelected=" + this.isSelected + ", subscriptionId=" + this.subscriptionId + ", callPlacementId=" + this.callPlacementId + ", isCloudTelephony=" + this.isCloudTelephony + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.callID);
        parcel.writeString(this.callDuration);
        parcel.writeString(this.callType);
        parcel.writeString(this.callDate);
        parcel.writeString(this.callNumber);
        parcel.writeString(this.callLastModified);
        parcel.writeString(this.callCachedName);
        parcel.writeString(this.callCachedPhoto);
        parcel.writeString(this.callNumberEdited);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.subscriptionId);
        parcel.writeString(this.callPlacementId);
        parcel.writeInt(this.isCloudTelephony ? 1 : 0);
    }

    public CallLogs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, boolean z2) {
        sq8.m48649h(str, "callID");
        sq8.m48649h(str2, "callDuration");
        sq8.m48649h(str3, "callType");
        sq8.m48649h(str4, "callDate");
        sq8.m48649h(str5, "callNumber");
        sq8.m48649h(str6, "callLastModified");
        sq8.m48649h(str9, "callNumberEdited");
        sq8.m48649h(str10, "subscriptionId");
        this.callID = str;
        this.callDuration = str2;
        this.callType = str3;
        this.callDate = str4;
        this.callNumber = str5;
        this.callLastModified = str6;
        this.callCachedName = str7;
        this.callCachedPhoto = str8;
        this.callNumberEdited = str9;
        this.isSelected = z;
        this.subscriptionId = str10;
        this.callPlacementId = str11;
        this.isCloudTelephony = z2;
    }

    public /* synthetic */ CallLogs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, boolean z2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? str10 : "", (i & 2048) != 0 ? null : str11, (i & 4096) == 0 ? z2 : false);
    }
}
