package com.onesignal.user.internal.backend.impl;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.PurchaseObject;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.hsa;
import p001o.isa;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes6.dex */
public final class JSONConverter {
    public static final JSONConverter INSTANCE = new JSONConverter();

    /* renamed from: com.onesignal.user.internal.backend.impl.JSONConverter$convertToJSON$1 */
    public static final class C118541 extends kf9 implements xk7 {
        public static final C118541 INSTANCE = new C118541();

        public C118541() {
            super(1);
        }

        @Override // p001o.xk7
        public final JSONObject invoke(PurchaseObject purchaseObject) {
            sq8.m48649h(purchaseObject, "it");
            return new JSONObject().put("sku", purchaseObject.getSku()).put("iso", purchaseObject.getIso()).put("amount", purchaseObject.getAmount().toString());
        }
    }

    private JSONConverter() {
    }

    public final CreateUserResponse convertToCreateUserResponse(JSONObject jSONObject) {
        Map mapM32681h;
        LinkedHashMap linkedHashMap;
        JSONObject jSONObjectSafeJSONObject;
        Map<String, Object> map;
        Map<String, Object> map2;
        sq8.m48649h(jSONObject, "jsonObject");
        JSONObject jSONObjectSafeJSONObject2 = JSONObjectExtensionsKt.safeJSONObject(jSONObject, HTTP.IDENTITY_CODING);
        if (jSONObjectSafeJSONObject2 == null || (map2 = JSONObjectExtensionsKt.toMap(jSONObjectSafeJSONObject2)) == null) {
            mapM32681h = isa.m32681h();
        } else {
            mapM32681h = new LinkedHashMap(hsa.m31055e(map2.size()));
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapM32681h.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject jSONObjectSafeJSONObject3 = JSONObjectExtensionsKt.safeJSONObject(jSONObject, "properties");
        if (jSONObjectSafeJSONObject3 == null || (jSONObjectSafeJSONObject = JSONObjectExtensionsKt.safeJSONObject(jSONObjectSafeJSONObject3, "tags")) == null || (map = JSONObjectExtensionsKt.toMap(jSONObjectSafeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(hsa.m31055e(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new CreateUserResponse(mapM32681h, new PropertiesObject(linkedHashMap, jSONObjectSafeJSONObject3 != null ? JSONObjectExtensionsKt.safeString(jSONObjectSafeJSONObject3, "language") : null, jSONObjectSafeJSONObject3 != null ? JSONObjectExtensionsKt.safeString(jSONObjectSafeJSONObject3, "timezone_id") : null, jSONObjectSafeJSONObject3 != null ? JSONObjectExtensionsKt.safeString(jSONObjectSafeJSONObject3, "country") : null, jSONObjectSafeJSONObject3 != null ? JSONObjectExtensionsKt.safeDouble(jSONObjectSafeJSONObject3, "lat") : null, jSONObjectSafeJSONObject3 != null ? JSONObjectExtensionsKt.safeDouble(jSONObjectSafeJSONObject3, "long") : null), JSONObjectExtensionsKt.expandJSONArray(jSONObject, "subscriptions", JSONConverter$convertToCreateUserResponse$respSubscriptions$1.INSTANCE));
    }

    public final JSONObject convertToJSON(PropertiesObject propertiesObject) {
        sq8.m48649h(propertiesObject, "properties");
        return JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putMap(new JSONObject(), "tags", propertiesObject.getTags()), "language", propertiesObject.getLanguage()), "timezone_id", propertiesObject.getTimezoneId()), "lat", propertiesObject.getLatitude()), "long", propertiesObject.getLongitude()), "country", propertiesObject.getCountry());
    }

    public final JSONObject convertToJSON(PropertiesDeltasObject propertiesDeltasObject) throws JSONException {
        sq8.m48649h(propertiesDeltasObject, "propertiesDeltas");
        JSONObject jSONObjectPutSafe = JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(new JSONObject(), "session_time", propertiesDeltasObject.getSessionTime()), "session_count", propertiesDeltasObject.getSessionCount());
        BigDecimal amountSpent = propertiesDeltasObject.getAmountSpent();
        return JSONObjectExtensionsKt.putJSONArray(JSONObjectExtensionsKt.putSafe(jSONObjectPutSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltasObject.getPurchases(), C118541.INSTANCE);
    }

    public final JSONArray convertToJSON(List<SubscriptionObject> list) {
        sq8.m48649h(list, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<SubscriptionObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(SubscriptionObject subscriptionObject) throws JSONException {
        sq8.m48649h(subscriptionObject, "subscription");
        JSONObject jSONObjectPutSafe = JSONObjectExtensionsKt.putSafe(new JSONObject(), OutcomeConstants.OUTCOME_ID, subscriptionObject.getId());
        SubscriptionObjectType type2 = subscriptionObject.getType();
        return JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(jSONObjectPutSafe, "type", type2 != null ? type2.getValue() : null), AWSCognitoLegacyCredentialStore.TOKEN_KEY, subscriptionObject.getToken()), "enabled", subscriptionObject.getEnabled()), "notification_types", subscriptionObject.getNotificationTypes()), "sdk", subscriptionObject.getSdk()), "device_model", subscriptionObject.getDeviceModel()), "device_os", subscriptionObject.getDeviceOS()), "rooted", subscriptionObject.getRooted()), "net_type", subscriptionObject.getNetType()), "carrier", subscriptionObject.getCarrier()), "app_version", subscriptionObject.getAppVersion());
    }
}
