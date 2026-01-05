package com.onesignal.user.internal.backend.impl;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes6.dex */
public final class JSONConverter$convertToCreateUserResponse$respSubscriptions$1 extends kf9 implements xk7 {
    public static final JSONConverter$convertToCreateUserResponse$respSubscriptions$1 INSTANCE = new JSONConverter$convertToCreateUserResponse$respSubscriptions$1();

    public JSONConverter$convertToCreateUserResponse$respSubscriptions$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final SubscriptionObject invoke(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "it");
        SubscriptionObjectType.Companion companion = SubscriptionObjectType.Companion;
        String string = jSONObject.getString("type");
        sq8.m48648g(string, "it.getString(\"type\")");
        SubscriptionObjectType subscriptionObjectTypeFromString = companion.fromString(string);
        if (subscriptionObjectTypeFromString != null) {
            return new SubscriptionObject(jSONObject.getString(OutcomeConstants.OUTCOME_ID), subscriptionObjectTypeFromString, JSONObjectExtensionsKt.safeString(jSONObject, AWSCognitoLegacyCredentialStore.TOKEN_KEY), JSONObjectExtensionsKt.safeBool(jSONObject, "enabled"), JSONObjectExtensionsKt.safeInt(jSONObject, "notification_types"), JSONObjectExtensionsKt.safeString(jSONObject, "sdk"), JSONObjectExtensionsKt.safeString(jSONObject, "device_model"), JSONObjectExtensionsKt.safeString(jSONObject, "device_os"), JSONObjectExtensionsKt.safeBool(jSONObject, "rooted"), JSONObjectExtensionsKt.safeInt(jSONObject, "net_type"), JSONObjectExtensionsKt.safeString(jSONObject, "carrier"), JSONObjectExtensionsKt.safeString(jSONObject, "app_version"));
        }
        return null;
    }
}
