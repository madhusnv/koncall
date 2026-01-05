package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class AddressMessageParameters extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressMessageParameters> CREATOR = new Creator();
    private String country;

    public static final class Creator implements Parcelable.Creator<AddressMessageParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressMessageParameters createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new AddressMessageParameters(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressMessageParameters[] newArray(int i) {
            return new AddressMessageParameters[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressMessageParameters() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AddressMessageParameters copy$default(AddressMessageParameters addressMessageParameters, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressMessageParameters.country;
        }
        return addressMessageParameters.copy(str);
    }

    public final String component1() {
        return this.country;
    }

    public final AddressMessageParameters copy(String str) {
        return new AddressMessageParameters(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressMessageParameters) && sq8.m48644c(this.country, ((AddressMessageParameters) obj).country);
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        String str = this.country;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public String toString() {
        return "AddressMessageParameters(country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.country);
    }

    public /* synthetic */ AddressMessageParameters(String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str);
    }

    public AddressMessageParameters(String str) {
        this.country = str;
    }
}
