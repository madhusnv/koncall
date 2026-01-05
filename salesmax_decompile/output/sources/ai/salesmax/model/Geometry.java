package ai.salesmax.model;

import p001o.sq8;

/* loaded from: classes.dex */
public final class Geometry {
    public static final int $stable = 0;
    private final Location location;

    public Geometry(Location location) {
        sq8.m48649h(location, "location");
        this.location = location;
    }

    public static /* synthetic */ Geometry copy$default(Geometry geometry, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            location = geometry.location;
        }
        return geometry.copy(location);
    }

    public final Location component1() {
        return this.location;
    }

    public final Geometry copy(Location location) {
        sq8.m48649h(location, "location");
        return new Geometry(location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Geometry) && sq8.m48644c(this.location, ((Geometry) obj).location);
    }

    public final Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        return this.location.hashCode();
    }

    public String toString() {
        return "Geometry(location=" + this.location + ")";
    }
}
