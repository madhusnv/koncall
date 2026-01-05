package com.razorpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.razorpay.AnalyticsProperty;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class f$_G$ {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m16054a(Context context, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        String string;
        String string2 = "";
        if (jSONArray != null && jSONArray.length() != 0) {
            if (jSONArray.length() == 1) {
                jSONObject = jSONArray.getJSONObject(0);
            } else {
                if (jSONArray.length() != 1) {
                    String str = "{";
                    String string3 = null;
                    boolean z = false;
                    boolean z2 = true;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            if (z2) {
                                z2 = false;
                            } else {
                                str = str + ",";
                            }
                            str = str + "'" + jSONObject2.getString("card_saving_token_source") + "': '" + jSONObject2.getString("rzp_device_token") + "'";
                            if (string3 == null) {
                                string3 = jSONObject2.getString("rzp_device_token");
                            } else if (!string3.equals(jSONObject2.getString("rzp_device_token"))) {
                                z = true;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    String str2 = str + "}";
                    if (z) {
                        HashMap map = new HashMap();
                        map.put("packages", str2);
                        AnalyticsUtil.trackEvent(AnalyticsEvent.MULTIPLE_TOKEN_EVENT, AnalyticsUtil.getJSONResponse(map));
                        return null;
                    }
                    jSONObject = jSONArray.getJSONObject(0);
                }
                jSONObject = null;
                if (jSONObject != null) {
                    try {
                        string = jSONObject.getString("rzp_device_token");
                        try {
                            string2 = jSONObject.getString("card_saving_token_source");
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        string = "";
                    }
                    m16056a(context, string);
                    AnalyticsUtil.addProperty("device_token_source_single", new AnalyticsProperty(string2, AnalyticsProperty.Scope.ORDER));
                    return string;
                }
            }
            if (jSONObject != null) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m16057b(Context context) {
        return C11907l.m16083c(context).getString("rzp_device_token", null);
    }

    /* renamed from: c */
    private static JSONArray m16058c(Context context) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<ResolveInfo> it = BaseUtils.getListOfAppsWhichHandleDeepLink(context, "io.rzp://rzp.io").iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = it.next().activityInfo.taskAffinity;
            i++;
            try {
                String strM16057b = m16057b(context.createPackageContext(str, 2));
                if (strM16057b != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("rzp_device_token", strM16057b);
                    jSONObject.put("card_saving_token_source", str);
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e) {
                if (e instanceof SecurityException) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.SHARE_PREFERENCES_SECURITY_EXCEPTION);
                } else {
                    AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
                }
                d__1_.m16053a("Error fetching global device token", e);
            }
        }
        AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.ORDER;
        AnalyticsUtil.addProperty("sdk_count", new AnalyticsProperty(i, scope));
        AnalyticsUtil.addProperty("sdk_count_with_token", new AnalyticsProperty(jSONArray.length(), scope));
        return jSONArray;
    }

    /* renamed from: a */
    public static void m16055a(Context context) throws JSONException {
        if (g$_H$.m16059a().m16065b() && m16057b(context) != null) {
            AnalyticsUtil.addProperty("device_token_source_single", new AnalyticsProperty(context.getPackageName(), AnalyticsProperty.Scope.ORDER));
            return;
        }
        if (g$_H$.m16059a().m16076m()) {
            Intent intent = new Intent();
            intent.setAction("rzp.device_token.share");
            context.sendOrderedBroadcast(intent, null, new BroadcastReceiver() { // from class: com.razorpay.L__R$
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent2) {
                    String string;
                    Bundle resultExtras = getResultExtras(true);
                    if (resultExtras == null || (string = resultExtras.getString("device_token_info_list")) == null) {
                        return;
                    }
                    try {
                        f$_G$.m16054a(context2, new JSONArray(string));
                    } catch (Exception unused) {
                    }
                }
            }, null, -1, null, null);
        } else if (g$_H$.m16059a().m16077n()) {
            m16054a(context, m16058c(context));
        }
    }

    /* renamed from: a */
    public static void m16056a(Context context, String str) {
        C11907l.m16084d(context).putString("rzp_device_token", str).apply();
    }
}
