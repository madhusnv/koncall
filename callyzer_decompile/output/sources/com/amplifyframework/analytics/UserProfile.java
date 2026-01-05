package com.amplifyframework.analytics;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class UserProfile {
    private final AnalyticsProperties customProperties;
    private final String email;
    private final Location location;
    private final String name;
    private final String plan;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder<B extends Builder<?, ?>, O extends UserProfile> {
        private AnalyticsProperties customProperties;
        private String email;
        private Location location;
        private String name;
        private String plan;

        public O build() {
            return (O) new UserProfile(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B customProperties(AnalyticsProperties analyticsProperties) {
            Objects.requireNonNull(analyticsProperties);
            this.customProperties = analyticsProperties;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B email(String str) {
            Objects.requireNonNull(str);
            this.email = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B location(Location location) {
            Objects.requireNonNull(location);
            this.location = location;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B plan(String str) {
            Objects.requireNonNull(str);
            this.plan = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Location {
        private final String city;
        private final String country;
        private final Double latitude;
        private final Double longitude;
        private final String postalCode;
        private final String region;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Builder {
            private String city;
            private String country;
            private Double latitude;
            private Double longitude;
            private String postalCode;
            private String region;

            public Location build() {
                return new Location(this, 0);
            }

            public Builder city(String str) {
                Objects.requireNonNull(str);
                this.city = str;
                return this;
            }

            public Builder country(String str) {
                Objects.requireNonNull(str);
                this.country = str;
                return this;
            }

            public Builder latitude(Double d2) {
                Objects.requireNonNull(d2);
                this.latitude = d2;
                return this;
            }

            public Builder longitude(Double d2) {
                Objects.requireNonNull(d2);
                this.longitude = d2;
                return this;
            }

            public Builder postalCode(String str) {
                Objects.requireNonNull(str);
                this.postalCode = str;
                return this;
            }

            public Builder region(String str) {
                Objects.requireNonNull(str);
                this.region = str;
                return this;
            }
        }

        public /* synthetic */ Location(Builder builder, int i10) {
            this(builder);
        }

        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Location.class != obj.getClass()) {
                return false;
            }
            Location location = (Location) obj;
            if (Objects.equals(this.latitude, location.latitude) && Objects.equals(this.longitude, location.longitude) && Objects.equals(this.postalCode, location.postalCode) && Objects.equals(this.city, location.city) && Objects.equals(this.region, location.region)) {
                return Objects.equals(this.country, location.country);
            }
            return false;
        }

        public String getCity() {
            return this.city;
        }

        public String getCountry() {
            return this.country;
        }

        public Double getLatitude() {
            return this.latitude;
        }

        public Double getLongitude() {
            return this.longitude;
        }

        public String getPostalCode() {
            return this.postalCode;
        }

        public String getRegion() {
            return this.region;
        }

        public int hashCode() {
            Double d2 = this.latitude;
            int iHashCode = (d2 != null ? d2.hashCode() : 0) * 31;
            Double d10 = this.longitude;
            int iHashCode2 = (iHashCode + (d10 != null ? d10.hashCode() : 0)) * 31;
            String str = this.postalCode;
            int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.city;
            int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.region;
            int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.country;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Location{latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            sb2.append(this.longitude);
            sb2.append(", postalCode='");
            sb2.append(this.postalCode);
            sb2.append("', city='");
            sb2.append(this.city);
            sb2.append("', region='");
            sb2.append(this.region);
            sb2.append("', country='");
            return AbstractC1452a.m4564k(sb2, this.country, "'}");
        }

        private Location(Builder builder) {
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.postalCode = builder.postalCode;
            this.city = builder.city;
            this.region = builder.region;
            this.country = builder.country;
        }
    }

    public UserProfile(Builder<?, ?> builder) {
        this.name = ((Builder) builder).name;
        this.email = ((Builder) builder).email;
        this.plan = ((Builder) builder).plan;
        this.location = ((Builder) builder).location;
        this.customProperties = ((Builder) builder).customProperties;
    }

    public static Builder<?, ?> builder() {
        return new Builder<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        if (Objects.equals(this.name, userProfile.name) && Objects.equals(this.email, userProfile.email) && Objects.equals(this.plan, userProfile.plan) && Objects.equals(this.location, userProfile.location)) {
            return Objects.equals(this.customProperties, userProfile.customProperties);
        }
        return false;
    }

    public AnalyticsProperties getCustomProperties() {
        return this.customProperties;
    }

    public String getEmail() {
        return this.email;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String getPlan() {
        return this.plan;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.plan;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Location location = this.location;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        AnalyticsProperties analyticsProperties = this.customProperties;
        return iHashCode4 + (analyticsProperties != null ? analyticsProperties.hashCode() : 0);
    }

    public String toString() {
        return "UserProfile{name='" + this.name + "', email='" + this.email + "', plan='" + this.plan + "', location=" + this.location + ", customProperties=" + this.customProperties + '}';
    }
}
