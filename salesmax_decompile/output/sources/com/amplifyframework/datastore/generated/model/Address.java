package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class Address {
    private final String addressType;
    private final String area;
    private final String city;
    private final String country;
    private final String establishmentName;
    private final String googlePlaceId;
    private final Boolean isPrimaryAddress;
    private final String landmark;
    private final String lat;
    private final String lng;
    private final String rawAddressText;
    private final String region;
    private final String state;
    private final String streetAddress;
    private final String zipcode;

    public interface BuildStep {
        BuildStep addressType(String str);

        BuildStep area(String str);

        Address build();

        BuildStep city(String str);

        BuildStep country(String str);

        BuildStep establishmentName(String str);

        BuildStep googlePlaceId(String str);

        BuildStep isPrimaryAddress(Boolean bool);

        BuildStep landmark(String str);

        BuildStep lat(String str);

        BuildStep lng(String str);

        BuildStep rawAddressText(String str);

        BuildStep region(String str);

        BuildStep state(String str);

        BuildStep streetAddress(String str);

        BuildStep zipcode(String str);
    }

    public static class Builder implements BuildStep {
        private String addressType;
        private String area;
        private String city;
        private String country;
        private String establishmentName;
        private String googlePlaceId;
        private Boolean isPrimaryAddress;
        private String landmark;
        private String lat;
        private String lng;
        private String rawAddressText;
        private String region;
        private String state;
        private String streetAddress;
        private String zipcode;

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep addressType(String str) {
            this.addressType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep area(String str) {
            this.area = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public Address build() {
            return new Address(this.addressType, this.establishmentName, this.area, this.city, this.country, this.googlePlaceId, this.isPrimaryAddress, this.landmark, this.lat, this.lng, this.rawAddressText, this.region, this.state, this.streetAddress, this.zipcode);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep city(String str) {
            this.city = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep country(String str) {
            this.country = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep establishmentName(String str) {
            this.establishmentName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep googlePlaceId(String str) {
            this.googlePlaceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep isPrimaryAddress(Boolean bool) {
            this.isPrimaryAddress = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep landmark(String str) {
            this.landmark = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep lat(String str) {
            this.lat = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep lng(String str) {
            this.lng = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep rawAddressText(String str) {
            this.rawAddressText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep region(String str) {
            this.region = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep state(String str) {
            this.state = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep streetAddress(String str) {
            this.streetAddress = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.BuildStep
        public BuildStep zipcode(String str) {
            this.zipcode = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.addressType = str;
            this.establishmentName = str2;
            this.area = str3;
            this.city = str4;
            this.country = str5;
            this.googlePlaceId = str6;
            this.isPrimaryAddress = bool;
            this.landmark = str7;
            this.lat = str8;
            this.lng = str9;
            this.rawAddressText = str10;
            this.region = str11;
            this.state = str12;
            this.streetAddress = str13;
            this.zipcode = str14;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            super(str, str2, str3, str4, str5, str6, bool, str7, str8, str9, str10, str11, str12, str13, str14);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder addressType(String str) {
            return (CopyOfBuilder) super.addressType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder area(String str) {
            return (CopyOfBuilder) super.area(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder city(String str) {
            return (CopyOfBuilder) super.city(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder country(String str) {
            return (CopyOfBuilder) super.country(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder establishmentName(String str) {
            return (CopyOfBuilder) super.establishmentName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder googlePlaceId(String str) {
            return (CopyOfBuilder) super.googlePlaceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder isPrimaryAddress(Boolean bool) {
            return (CopyOfBuilder) super.isPrimaryAddress(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder landmark(String str) {
            return (CopyOfBuilder) super.landmark(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder lat(String str) {
            return (CopyOfBuilder) super.lat(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder lng(String str) {
            return (CopyOfBuilder) super.lng(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder rawAddressText(String str) {
            return (CopyOfBuilder) super.rawAddressText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder region(String str) {
            return (CopyOfBuilder) super.region(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder state(String str) {
            return (CopyOfBuilder) super.state(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder streetAddress(String str) {
            return (CopyOfBuilder) super.streetAddress(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Address.Builder, com.amplifyframework.datastore.generated.model.Address.BuildStep
        public CopyOfBuilder zipcode(String str) {
            return (CopyOfBuilder) super.zipcode(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.addressType, this.establishmentName, this.area, this.city, this.country, this.googlePlaceId, this.isPrimaryAddress, this.landmark, this.lat, this.lng, this.rawAddressText, this.region, this.state, this.streetAddress, this.zipcode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Address.class != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;
        return s6c.m47909a(getAddressType(), address.getAddressType()) && s6c.m47909a(getEstablishmentName(), address.getEstablishmentName()) && s6c.m47909a(getArea(), address.getArea()) && s6c.m47909a(getCity(), address.getCity()) && s6c.m47909a(getCountry(), address.getCountry()) && s6c.m47909a(getGooglePlaceId(), address.getGooglePlaceId()) && s6c.m47909a(getIsPrimaryAddress(), address.getIsPrimaryAddress()) && s6c.m47909a(getLandmark(), address.getLandmark()) && s6c.m47909a(getLat(), address.getLat()) && s6c.m47909a(getLng(), address.getLng()) && s6c.m47909a(getRawAddressText(), address.getRawAddressText()) && s6c.m47909a(getRegion(), address.getRegion()) && s6c.m47909a(getState(), address.getState()) && s6c.m47909a(getStreetAddress(), address.getStreetAddress()) && s6c.m47909a(getZipcode(), address.getZipcode());
    }

    public String getAddressType() {
        return this.addressType;
    }

    public String getArea() {
        return this.area;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getEstablishmentName() {
        return this.establishmentName;
    }

    public String getGooglePlaceId() {
        return this.googlePlaceId;
    }

    public Boolean getIsPrimaryAddress() {
        return this.isPrimaryAddress;
    }

    public String getLandmark() {
        return this.landmark;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLng() {
        return this.lng;
    }

    public String getRawAddressText() {
        return this.rawAddressText;
    }

    public String getRegion() {
        return this.region;
    }

    public String getState() {
        return this.state;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public int hashCode() {
        return (getAddressType() + getEstablishmentName() + getArea() + getCity() + getCountry() + getGooglePlaceId() + getIsPrimaryAddress() + getLandmark() + getLat() + getLng() + getRawAddressText() + getRegion() + getState() + getStreetAddress() + getZipcode()).hashCode();
    }

    private Address(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.addressType = str;
        this.establishmentName = str2;
        this.area = str3;
        this.city = str4;
        this.country = str5;
        this.googlePlaceId = str6;
        this.isPrimaryAddress = bool;
        this.landmark = str7;
        this.lat = str8;
        this.lng = str9;
        this.rawAddressText = str10;
        this.region = str11;
        this.state = str12;
        this.streetAddress = str13;
        this.zipcode = str14;
    }
}
