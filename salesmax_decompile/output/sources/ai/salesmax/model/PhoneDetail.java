package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class PhoneDetail extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PhoneDetail> CREATOR = new Creator();
    private boolean isWhatsapp;
    private String number;

    public static final class Creator implements Parcelable.Creator<PhoneDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneDetail createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PhoneDetail(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneDetail[] newArray(int i) {
            return new PhoneDetail[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneDetail() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhoneDetail copy$default(PhoneDetail phoneDetail, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneDetail.number;
        }
        if ((i & 2) != 0) {
            z = phoneDetail.isWhatsapp;
        }
        return phoneDetail.copy(str, z);
    }

    public final String component1() {
        return this.number;
    }

    public final boolean component2() {
        return this.isWhatsapp;
    }

    public final PhoneDetail copy(String str, boolean z) {
        sq8.m48649h(str, "number");
        return new PhoneDetail(str, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneDetail)) {
            return false;
        }
        PhoneDetail phoneDetail = (PhoneDetail) obj;
        return sq8.m48644c(this.number, phoneDetail.number) && this.isWhatsapp == phoneDetail.isWhatsapp;
    }

    public final String getNumber() {
        return this.number;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.number.hashCode() * 31;
        boolean z = this.isWhatsapp;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isWhatsapp() {
        return this.isWhatsapp;
    }

    public final void setNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.number = str;
    }

    public final void setWhatsapp(boolean z) {
        this.isWhatsapp = z;
    }

    public String toString() {
        return "PhoneDetail(number=" + this.number + ", isWhatsapp=" + this.isWhatsapp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.number);
        parcel.writeInt(this.isWhatsapp ? 1 : 0);
    }

    public /* synthetic */ PhoneDetail(String str, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public PhoneDetail(String str, boolean z) {
        sq8.m48649h(str, "number");
        this.number = str;
        this.isWhatsapp = z;
    }
}
