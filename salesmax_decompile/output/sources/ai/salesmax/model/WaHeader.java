package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class WaHeader extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WaHeader> CREATOR = new Creator();
    private String waExample;
    private String waFormat;
    private String waText;
    private String waType;

    public static final class Creator implements Parcelable.Creator<WaHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaHeader createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new WaHeader(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaHeader[] newArray(int i) {
            return new WaHeader[i];
        }
    }

    public WaHeader() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WaHeader copy$default(WaHeader waHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = waHeader.waType;
        }
        if ((i & 2) != 0) {
            str2 = waHeader.waFormat;
        }
        if ((i & 4) != 0) {
            str3 = waHeader.waText;
        }
        if ((i & 8) != 0) {
            str4 = waHeader.waExample;
        }
        return waHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.waType;
    }

    public final String component2() {
        return this.waFormat;
    }

    public final String component3() {
        return this.waText;
    }

    public final String component4() {
        return this.waExample;
    }

    public final WaHeader copy(String str, String str2, String str3, String str4) {
        return new WaHeader(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaHeader)) {
            return false;
        }
        WaHeader waHeader = (WaHeader) obj;
        return sq8.m48644c(this.waType, waHeader.waType) && sq8.m48644c(this.waFormat, waHeader.waFormat) && sq8.m48644c(this.waText, waHeader.waText) && sq8.m48644c(this.waExample, waHeader.waExample);
    }

    public final String getWaExample() {
        return this.waExample;
    }

    public final String getWaFormat() {
        return this.waFormat;
    }

    public final String getWaText() {
        return this.waText;
    }

    public final String getWaType() {
        return this.waType;
    }

    public int hashCode() {
        String str = this.waType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.waFormat;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.waText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.waExample;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setWaExample(String str) {
        this.waExample = str;
    }

    public final void setWaFormat(String str) {
        this.waFormat = str;
    }

    public final void setWaText(String str) {
        this.waText = str;
    }

    public final void setWaType(String str) {
        this.waType = str;
    }

    public String toString() {
        return "WaHeader(waType=" + this.waType + ", waFormat=" + this.waFormat + ", waText=" + this.waText + ", waExample=" + this.waExample + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.waType);
        parcel.writeString(this.waFormat);
        parcel.writeString(this.waText);
        parcel.writeString(this.waExample);
    }

    public /* synthetic */ WaHeader(String str, String str2, String str3, String str4, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public WaHeader(String str, String str2, String str3, String str4) {
        this.waType = str;
        this.waFormat = str2;
        this.waText = str3;
        this.waExample = str4;
    }
}
