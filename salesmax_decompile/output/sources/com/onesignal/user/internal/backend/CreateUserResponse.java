package com.onesignal.user.internal.backend;

import java.util.List;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class CreateUserResponse {
    private final Map<String, String> identities;
    private final PropertiesObject properties;
    private final List<SubscriptionObject> subscriptions;

    public CreateUserResponse(Map<String, String> map, PropertiesObject propertiesObject, List<SubscriptionObject> list) {
        sq8.m48649h(map, "identities");
        sq8.m48649h(propertiesObject, "properties");
        sq8.m48649h(list, "subscriptions");
        this.identities = map;
        this.properties = propertiesObject;
        this.subscriptions = list;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final PropertiesObject getProperties() {
        return this.properties;
    }

    public final List<SubscriptionObject> getSubscriptions() {
        return this.subscriptions;
    }
}
