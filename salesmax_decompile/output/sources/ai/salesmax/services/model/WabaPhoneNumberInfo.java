package ai.salesmax.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class WabaPhoneNumberInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WabaPhoneNumberInfo> CREATOR = new Creator();
    private final boolean isPermitted;
    private boolean isSelected;
    private boolean showSelection;
    private final String wabaAccountId;
    private final String wabaAccountName;
    private final String wabaPhoneNumber;
    private final String wabaPhoneNumberId;
    private final String wabaPhoneNumberName;

    public static final class Creator implements Parcelable.Creator<WabaPhoneNumberInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WabaPhoneNumberInfo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new WabaPhoneNumberInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WabaPhoneNumberInfo[] newArray(int i) {
            return new WabaPhoneNumberInfo[i];
        }
    }

    public /* synthetic */ WabaPhoneNumberInfo(String str, String str2, String str3, String str4, String str5, boolean z, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? null : str5, z);
    }

    public static /* synthetic */ WabaPhoneNumberInfo copy$default(WabaPhoneNumberInfo wabaPhoneNumberInfo, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wabaPhoneNumberInfo.wabaPhoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = wabaPhoneNumberInfo.wabaPhoneNumberName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = wabaPhoneNumberInfo.wabaPhoneNumberId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = wabaPhoneNumberInfo.wabaAccountId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = wabaPhoneNumberInfo.wabaAccountName;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = wabaPhoneNumberInfo.isPermitted;
        }
        return wabaPhoneNumberInfo.copy(str, str6, str7, str8, str9, z);
    }

    public static /* synthetic */ void getShowSelection$annotations() {
    }

    public static /* synthetic */ void isSelected$annotations() {
    }

    public final String component1() {
        return this.wabaPhoneNumber;
    }

    public final String component2() {
        return this.wabaPhoneNumberName;
    }

    public final String component3() {
        return this.wabaPhoneNumberId;
    }

    public final String component4() {
        return this.wabaAccountId;
    }

    public final String component5() {
        return this.wabaAccountName;
    }

    public final boolean component6() {
        return this.isPermitted;
    }

    public final WabaPhoneNumberInfo copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        sq8.m48649h(str, "wabaPhoneNumber");
        sq8.m48649h(str3, "wabaPhoneNumberId");
        sq8.m48649h(str4, "wabaAccountId");
        return new WabaPhoneNumberInfo(str, str2, str3, str4, str5, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WabaPhoneNumberInfo)) {
            return false;
        }
        WabaPhoneNumberInfo wabaPhoneNumberInfo = (WabaPhoneNumberInfo) obj;
        return sq8.m48644c(this.wabaPhoneNumber, wabaPhoneNumberInfo.wabaPhoneNumber) && sq8.m48644c(this.wabaPhoneNumberName, wabaPhoneNumberInfo.wabaPhoneNumberName) && sq8.m48644c(this.wabaPhoneNumberId, wabaPhoneNumberInfo.wabaPhoneNumberId) && sq8.m48644c(this.wabaAccountId, wabaPhoneNumberInfo.wabaAccountId) && sq8.m48644c(this.wabaAccountName, wabaPhoneNumberInfo.wabaAccountName) && this.isPermitted == wabaPhoneNumberInfo.isPermitted;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final String getWabaAccountId() {
        return this.wabaAccountId;
    }

    public final String getWabaAccountName() {
        return this.wabaAccountName;
    }

    public final String getWabaPhoneNumber() {
        return this.wabaPhoneNumber;
    }

    public final String getWabaPhoneNumberId() {
        return this.wabaPhoneNumberId;
    }

    public final String getWabaPhoneNumberName() {
        return this.wabaPhoneNumberName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.wabaPhoneNumber.hashCode() * 31;
        String str = this.wabaPhoneNumberName;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.wabaPhoneNumberId.hashCode()) * 31) + this.wabaAccountId.hashCode()) * 31;
        String str2 = this.wabaAccountName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isPermitted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode3 + i;
    }

    public final boolean isPermitted() {
        return this.isPermitted;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public String toString() {
        return "WabaPhoneNumberInfo(wabaPhoneNumber=" + this.wabaPhoneNumber + ", wabaPhoneNumberName=" + this.wabaPhoneNumberName + ", wabaPhoneNumberId=" + this.wabaPhoneNumberId + ", wabaAccountId=" + this.wabaAccountId + ", wabaAccountName=" + this.wabaAccountName + ", isPermitted=" + this.isPermitted + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.wabaPhoneNumber);
        parcel.writeString(this.wabaPhoneNumberName);
        parcel.writeString(this.wabaPhoneNumberId);
        parcel.writeString(this.wabaAccountId);
        parcel.writeString(this.wabaAccountName);
        parcel.writeInt(this.isPermitted ? 1 : 0);
    }

    public WabaPhoneNumberInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        sq8.m48649h(str, "wabaPhoneNumber");
        sq8.m48649h(str3, "wabaPhoneNumberId");
        sq8.m48649h(str4, "wabaAccountId");
        this.wabaPhoneNumber = str;
        this.wabaPhoneNumberName = str2;
        this.wabaPhoneNumberId = str3;
        this.wabaAccountId = str4;
        this.wabaAccountName = str5;
        this.isPermitted = z;
    }
}
