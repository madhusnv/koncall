package com.amplifyframework.auth;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthCodeDeliveryDetails {
    private String attributeName;
    private DeliveryMedium deliveryMedium;
    private String destination;

    public enum DeliveryMedium {
        EMAIL("email"),
        SMS("sms"),
        PHONE("phone"),
        UNKNOWN("unknown");

        private String value;

        DeliveryMedium(String str) {
            Objects.requireNonNull(str);
            this.value = str;
        }

        public static DeliveryMedium fromString(String str) {
            for (DeliveryMedium deliveryMedium : values()) {
                if (deliveryMedium.getValue().equalsIgnoreCase(str)) {
                    return deliveryMedium;
                }
            }
            return UNKNOWN;
        }

        public String getValue() {
            return this.value;
        }
    }

    public AuthCodeDeliveryDetails(String str, DeliveryMedium deliveryMedium) {
        this(str, deliveryMedium, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthCodeDeliveryDetails.class != obj.getClass()) {
            return false;
        }
        AuthCodeDeliveryDetails authCodeDeliveryDetails = (AuthCodeDeliveryDetails) obj;
        return s6c.m47909a(getDestination(), authCodeDeliveryDetails.getDestination()) && s6c.m47909a(getDeliveryMedium(), authCodeDeliveryDetails.getDeliveryMedium()) && s6c.m47909a(getAttributeName(), authCodeDeliveryDetails.getAttributeName());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public DeliveryMedium getDeliveryMedium() {
        return this.deliveryMedium;
    }

    public String getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return s6c.m47910b(getDestination(), getDeliveryMedium(), getAttributeName());
    }

    public String toString() {
        return "AuthCodeDeliveryDetails{destination='" + this.destination + "', deliveryMedium=" + this.deliveryMedium + ", attributeName='" + this.attributeName + "'}";
    }

    public AuthCodeDeliveryDetails(String str, DeliveryMedium deliveryMedium, String str2) {
        Objects.requireNonNull(str);
        this.destination = str;
        Objects.requireNonNull(deliveryMedium);
        this.deliveryMedium = deliveryMedium;
        this.attributeName = str2;
    }
}
