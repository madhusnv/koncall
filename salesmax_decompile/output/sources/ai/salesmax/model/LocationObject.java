package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class LocationObject implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LocationObject> CREATOR = new Creator();
    private String address;
    private Double latitude;
    private Double longitude;
    private String name;

    public static final class Creator implements Parcelable.Creator<LocationObject> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationObject createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new LocationObject(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationObject[] newArray(int i) {
            return new LocationObject[i];
        }
    }

    public LocationObject() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LocationObject copy$default(LocationObject locationObject, Double d, Double d2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationObject.latitude;
        }
        if ((i & 2) != 0) {
            d2 = locationObject.longitude;
        }
        if ((i & 4) != 0) {
            str = locationObject.name;
        }
        if ((i & 8) != 0) {
            str2 = locationObject.address;
        }
        return locationObject.copy(d, d2, str, str2);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.address;
    }

    public final LocationObject copy(Double d, Double d2, String str, String str2) {
        return new LocationObject(d, d2, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationObject)) {
            return false;
        }
        LocationObject locationObject = (LocationObject) obj;
        return sq8.m48644c(this.latitude, locationObject.latitude) && sq8.m48644c(this.longitude, locationObject.longitude) && sq8.m48644c(this.name, locationObject.name) && sq8.m48644c(this.address, locationObject.address);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Double d = this.latitude;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.longitude;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setLatitude(Double d) {
        this.latitude = d;
    }

    public final void setLongitude(Double d) {
        this.longitude = d;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "LocationObject(latitude=" + this.latitude + ", longitude=" + this.longitude + ", name=" + this.name + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        Double d = this.latitude;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.longitude;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.address);
    }

    public LocationObject(Double d, Double d2, String str, String str2) {
        this.latitude = d;
        this.longitude = d2;
        this.name = str;
        this.address = str2;
    }

    public /* synthetic */ LocationObject(Double d, Double d2, String str, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
