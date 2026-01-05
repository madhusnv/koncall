package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;

/* loaded from: classes.dex */
public final class UserLocation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserLocation> CREATOR = new Creator();
    private Long createdAt;
    private Double latitude;
    private Double longitude;
    private String userId;

    public static final class Creator implements Parcelable.Creator<UserLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLocation createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new UserLocation(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLocation[] newArray(int i) {
            return new UserLocation[i];
        }
    }

    public UserLocation() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UserLocation copy$default(UserLocation userLocation, String str, Double d, Double d2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userLocation.userId;
        }
        if ((i & 2) != 0) {
            d = userLocation.latitude;
        }
        if ((i & 4) != 0) {
            d2 = userLocation.longitude;
        }
        if ((i & 8) != 0) {
            l = userLocation.createdAt;
        }
        return userLocation.copy(str, d, d2, l);
    }

    public final String component1() {
        return this.userId;
    }

    public final Double component2() {
        return this.latitude;
    }

    public final Double component3() {
        return this.longitude;
    }

    public final Long component4() {
        return this.createdAt;
    }

    public final UserLocation copy(String str, Double d, Double d2, Long l) {
        sq8.m48649h(str, "userId");
        return new UserLocation(str, d, d2, l);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLocation)) {
            return false;
        }
        UserLocation userLocation = (UserLocation) obj;
        return sq8.m48644c(this.userId, userLocation.userId) && sq8.m48644c(this.latitude, userLocation.latitude) && sq8.m48644c(this.longitude, userLocation.longitude) && sq8.m48644c(this.createdAt, userLocation.createdAt);
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final LeadsUser getLocationUser() {
        return lpi.a0(this.userId);
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Double d = this.latitude;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.createdAt;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setLatitude(Double d) {
        this.latitude = d;
    }

    public final void setLongitude(Double d) {
        this.longitude = d;
    }

    public final void setUserId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        return "UserLocation(userId=" + this.userId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.userId);
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
        Long l = this.createdAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public UserLocation(String str, Double d, Double d2, Long l) {
        sq8.m48649h(str, "userId");
        this.userId = str;
        this.latitude = d;
        this.longitude = d2;
        this.createdAt = l;
    }

    public /* synthetic */ UserLocation(String str, Double d, Double d2, Long l, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : l);
    }
}
