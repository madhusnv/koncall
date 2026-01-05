package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class WaBody extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WaBody> CREATOR = new Creator();
    private String waExample;
    private String waText;
    private String waType;

    public static final class Creator implements Parcelable.Creator<WaBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaBody createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new WaBody(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaBody[] newArray(int i) {
            return new WaBody[i];
        }
    }

    public WaBody() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WaBody copy$default(WaBody waBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = waBody.waType;
        }
        if ((i & 2) != 0) {
            str2 = waBody.waText;
        }
        if ((i & 4) != 0) {
            str3 = waBody.waExample;
        }
        return waBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.waType;
    }

    public final String component2() {
        return this.waText;
    }

    public final String component3() {
        return this.waExample;
    }

    public final WaBody copy(String str, String str2, String str3) {
        return new WaBody(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaBody)) {
            return false;
        }
        WaBody waBody = (WaBody) obj;
        return sq8.m48644c(this.waType, waBody.waType) && sq8.m48644c(this.waText, waBody.waText) && sq8.m48644c(this.waExample, waBody.waExample);
    }

    public final String getWaExample() {
        return this.waExample;
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
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.waExample;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setWaExample(String str) {
        this.waExample = str;
    }

    public final void setWaText(String str) {
        this.waText = str;
    }

    public final void setWaType(String str) {
        this.waType = str;
    }

    public String toString() {
        return "WaBody(waType=" + this.waType + ", waText=" + this.waText + ", waExample=" + this.waExample + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.waType);
        parcel.writeString(this.waText);
        parcel.writeString(this.waExample);
    }

    public /* synthetic */ WaBody(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public WaBody(String str, String str2, String str3) {
        this.waType = str;
        this.waText = str2;
        this.waExample = str3;
    }
}
