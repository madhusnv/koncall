package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class WaButton extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WaButton> CREATOR = new Creator();
    private String waNumber;
    private String waText;
    private String waType;
    private String waUrl;

    public static final class Creator implements Parcelable.Creator<WaButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaButton createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new WaButton(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaButton[] newArray(int i) {
            return new WaButton[i];
        }
    }

    public WaButton() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WaButton copy$default(WaButton waButton, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = waButton.waType;
        }
        if ((i & 2) != 0) {
            str2 = waButton.waText;
        }
        if ((i & 4) != 0) {
            str3 = waButton.waUrl;
        }
        if ((i & 8) != 0) {
            str4 = waButton.waNumber;
        }
        return waButton.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.waType;
    }

    public final String component2() {
        return this.waText;
    }

    public final String component3() {
        return this.waUrl;
    }

    public final String component4() {
        return this.waNumber;
    }

    public final WaButton copy(String str, String str2, String str3, String str4) {
        return new WaButton(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaButton)) {
            return false;
        }
        WaButton waButton = (WaButton) obj;
        return sq8.m48644c(this.waType, waButton.waType) && sq8.m48644c(this.waText, waButton.waText) && sq8.m48644c(this.waUrl, waButton.waUrl) && sq8.m48644c(this.waNumber, waButton.waNumber);
    }

    public final String getWaNumber() {
        return this.waNumber;
    }

    public final String getWaText() {
        return this.waText;
    }

    public final String getWaType() {
        return this.waType;
    }

    public final String getWaUrl() {
        return this.waUrl;
    }

    public int hashCode() {
        String str = this.waType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.waText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.waUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.waNumber;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setWaNumber(String str) {
        this.waNumber = str;
    }

    public final void setWaText(String str) {
        this.waText = str;
    }

    public final void setWaType(String str) {
        this.waType = str;
    }

    public final void setWaUrl(String str) {
        this.waUrl = str;
    }

    public String toString() {
        return "WaButton(waType=" + this.waType + ", waText=" + this.waText + ", waUrl=" + this.waUrl + ", waNumber=" + this.waNumber + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.waType);
        parcel.writeString(this.waText);
        parcel.writeString(this.waUrl);
        parcel.writeString(this.waNumber);
    }

    public /* synthetic */ WaButton(String str, String str2, String str3, String str4, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public WaButton(String str, String str2, String str3, String str4) {
        this.waType = str;
        this.waText = str2;
        this.waUrl = str3;
        this.waNumber = str4;
    }
}
