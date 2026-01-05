package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class WaFooter extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WaFooter> CREATOR = new Creator();
    private String waText;
    private String waType;

    public static final class Creator implements Parcelable.Creator<WaFooter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaFooter createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new WaFooter(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaFooter[] newArray(int i) {
            return new WaFooter[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WaFooter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WaFooter copy$default(WaFooter waFooter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = waFooter.waType;
        }
        if ((i & 2) != 0) {
            str2 = waFooter.waText;
        }
        return waFooter.copy(str, str2);
    }

    public final String component1() {
        return this.waType;
    }

    public final String component2() {
        return this.waText;
    }

    public final WaFooter copy(String str, String str2) {
        return new WaFooter(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaFooter)) {
            return false;
        }
        WaFooter waFooter = (WaFooter) obj;
        return sq8.m48644c(this.waType, waFooter.waType) && sq8.m48644c(this.waText, waFooter.waText);
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
        String str2 = this.waText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setWaText(String str) {
        this.waText = str;
    }

    public final void setWaType(String str) {
        this.waType = str;
    }

    public String toString() {
        return "WaFooter(waType=" + this.waType + ", waText=" + this.waText + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.waType);
        parcel.writeString(this.waText);
    }

    public /* synthetic */ WaFooter(String str, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public WaFooter(String str, String str2) {
        this.waType = str;
        this.waText = str2;
    }
}
