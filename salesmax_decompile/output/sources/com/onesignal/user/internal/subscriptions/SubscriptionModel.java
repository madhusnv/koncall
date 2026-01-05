package com.onesignal.user.internal.subscriptions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class SubscriptionModel extends Model {
    public SubscriptionModel() {
        super(null, null, 3, null);
    }

    public final String getAddress() {
        return Model.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppVersion() {
        return getStringProperty(RemoteConfigConstants.RequestFieldKey.APP_VERSION, SubscriptionModel$appVersion$2.INSTANCE);
    }

    public final String getCarrier() {
        return getStringProperty("carrier", SubscriptionModel$carrier$2.INSTANCE);
    }

    public final String getDeviceOS() {
        return getStringProperty("deviceOS", SubscriptionModel$deviceOS$2.INSTANCE);
    }

    public final boolean getOptedIn() {
        return Model.getBooleanProperty$default(this, "optedIn", null, 2, null);
    }

    public final String getSdk() {
        return getStringProperty("sdk", SubscriptionModel$sdk$2.INSTANCE);
    }

    public final SubscriptionStatus getStatus() {
        if (!hasProperty("status")) {
            SubscriptionStatus subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
            setOptAnyProperty("status", subscriptionStatus != null ? subscriptionStatus.toString() : null, ModelChangeTags.NORMAL, false);
        }
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum enumValueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof SubscriptionStatus ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? SubscriptionStatus.valueOf((String) optAnyProperty$default) : (SubscriptionStatus) optAnyProperty$default : null;
        if (enumValueOf != null) {
            return (SubscriptionStatus) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final SubscriptionType getType() {
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, "type", null, 2, null);
        Enum enumValueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof SubscriptionType ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? SubscriptionType.valueOf((String) optAnyProperty$default) : (SubscriptionType) optAnyProperty$default : null;
        if (enumValueOf != null) {
            return (SubscriptionType) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final void setAddress(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    public final void setAppVersion(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, RemoteConfigConstants.RequestFieldKey.APP_VERSION, str, null, false, 12, null);
    }

    public final void setCarrier(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "carrier", str, null, false, 12, null);
    }

    public final void setDeviceOS(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "deviceOS", str, null, false, 12, null);
    }

    public final void setOptedIn(boolean z) {
        Model.setBooleanProperty$default(this, "optedIn", z, null, false, 12, null);
    }

    public final void setSdk(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "sdk", str, null, false, 12, null);
    }

    public final void setStatus(SubscriptionStatus subscriptionStatus) {
        sq8.m48649h(subscriptionStatus, "value");
        setOptAnyProperty("status", subscriptionStatus.toString(), ModelChangeTags.NORMAL, false);
    }

    public final void setType(SubscriptionType subscriptionType) {
        sq8.m48649h(subscriptionType, "value");
        setOptAnyProperty("type", subscriptionType.toString(), ModelChangeTags.NORMAL, false);
    }
}
