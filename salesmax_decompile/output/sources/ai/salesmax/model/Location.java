package ai.salesmax.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.id5;

/* loaded from: classes.dex */
public final class Location {
    public static final int $stable = 0;
    private final double lat;
    private final double lng;

    public Location() {
        this(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null);
    }

    public static /* synthetic */ Location copy$default(Location location, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = location.lng;
        }
        if ((i & 2) != 0) {
            d2 = location.lat;
        }
        return location.copy(d, d2);
    }

    public final double component1() {
        return this.lng;
    }

    public final double component2() {
        return this.lat;
    }

    public final Location copy(double d, double d2) {
        return new Location(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Double.compare(this.lng, location.lng) == 0 && Double.compare(this.lat, location.lat) == 0;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (Double.hashCode(this.lng) * 31) + Double.hashCode(this.lat);
    }

    public String toString() {
        return "Location(lng=" + this.lng + ", lat=" + this.lat + ")";
    }

    public Location(double d, double d2) {
        this.lng = d;
        this.lat = d2;
    }

    public /* synthetic */ Location(double d, double d2, int i, id5 id5Var) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
