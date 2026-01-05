package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Address;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class LeadsAddress {
    public static final int $stable = 8;
    private Address address;

    /* JADX WARN: Multi-variable type inference failed */
    public LeadsAddress() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getArea() {
        String area = this.address.getArea();
        return area == null ? "" : area;
    }

    public final String getCity() {
        String city = this.address.getCity();
        return city == null ? "" : city;
    }

    public final String getCountry() {
        String country = this.address.getCountry();
        return country == null ? "" : country;
    }

    public final String getEstablishmentName() {
        String establishmentName = this.address.getEstablishmentName();
        return establishmentName == null ? "" : establishmentName;
    }

    public final String getGooglePlaceId() {
        String googlePlaceId = this.address.getGooglePlaceId();
        return googlePlaceId == null ? "" : googlePlaceId;
    }

    public final String getLandmark() {
        String landmark = this.address.getLandmark();
        return landmark == null ? "" : landmark;
    }

    public final String getLatitude() {
        return this.address.getLat();
    }

    public final String getLongitude() {
        return this.address.getLng();
    }

    public final String getRawAddressText() {
        return this.address.getRawAddressText();
    }

    public final String getRegion() {
        String region = this.address.getRegion();
        return region == null ? "" : region;
    }

    public final String getState() {
        String state = this.address.getState();
        return state == null ? "" : state;
    }

    public final String getStreetAddress() {
        String streetAddress = this.address.getStreetAddress();
        return streetAddress == null ? "" : streetAddress;
    }

    public final String getZipcode() {
        String zipcode = this.address.getZipcode();
        return zipcode == null ? "" : zipcode;
    }

    public final void setAddress(Address address) {
        sq8.m48649h(address, "<set-?>");
        this.address = address;
    }

    public final void setArea(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().area(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setCity(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().city(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setCountry(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().country(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setEstablishmentName(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().establishmentName(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setGooglePlaceId(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().googlePlaceId(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setLandmark(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().landmark(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setLatitude(String str) {
        Address addressBuild = this.address.copyOfBuilder().lat(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setLongitude(String str) {
        Address addressBuild = this.address.copyOfBuilder().lng(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setRawAddressText(String str) {
        Address addressBuild = this.address.copyOfBuilder().rawAddressText(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setRegion(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().region(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setState(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().state(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setStreetAddress(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().streetAddress(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public final void setZipcode(String str) {
        sq8.m48649h(str, "value");
        Address addressBuild = this.address.copyOfBuilder().zipcode(str).build();
        sq8.m48648g(addressBuild, "build(...)");
        this.address = addressBuild;
    }

    public LeadsAddress(Address address) {
        sq8.m48649h(address, "address");
        this.address = address;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LeadsAddress(Address address, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            address = Address.builder().build();
            sq8.m48648g(address, "build(...)");
        }
        this(address);
    }
}
