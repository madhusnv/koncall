package com.amplifyframework.auth;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthCodeDeliveryDetails {
    private String attributeName;
    private DeliveryMedium deliveryMedium;
    private String destination;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
        if (obj != null && AuthCodeDeliveryDetails.class == obj.getClass()) {
            AuthCodeDeliveryDetails authCodeDeliveryDetails = (AuthCodeDeliveryDetails) obj;
            if (Objects.equals(getDestination(), authCodeDeliveryDetails.getDestination()) && Objects.equals(getDeliveryMedium(), authCodeDeliveryDetails.getDeliveryMedium()) && Objects.equals(getAttributeName(), authCodeDeliveryDetails.getAttributeName())) {
                return true;
            }
        }
        return false;
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
        return Objects.hash(getDestination(), getDeliveryMedium(), getAttributeName());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthCodeDeliveryDetails{destination='");
        sb2.append(this.destination);
        sb2.append("', deliveryMedium=");
        sb2.append(this.deliveryMedium);
        sb2.append(", attributeName='");
        return AbstractC1452a.m4564k(sb2, this.attributeName, "'}");
    }

    public AuthCodeDeliveryDetails(String str, DeliveryMedium deliveryMedium, String str2) {
        Objects.requireNonNull(str);
        this.destination = str;
        Objects.requireNonNull(deliveryMedium);
        this.deliveryMedium = deliveryMedium;
        this.attributeName = str2;
    }
}
