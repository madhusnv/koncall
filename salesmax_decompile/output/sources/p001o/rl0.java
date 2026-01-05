package p001o;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class rl0 {

    /* renamed from: a */
    public static final rl0 f43755a = new rl0();

    /* renamed from: b */
    public static final Map f43756b = isa.m32683j(vyh.m53620a(EnumC16619a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), vyh.m53620a(EnumC16619a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* renamed from: o.rl0$a */
    public enum EnumC16619a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static final JSONObject m46900a(EnumC16619a enumC16619a, vx0 vx0Var, String str, boolean z, Context context) throws JSONException {
        sq8.m48649h(enumC16619a, "activityType");
        sq8.m48649h(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f43756b.get(enumC16619a));
        String strM40737d = nl0.f36985b.m40737d();
        if (strM40737d != null) {
            jSONObject.put("app_user_id", strM40737d);
        }
        cri.D0(jSONObject, vx0Var, str, z, context);
        try {
            cri.E0(jSONObject, context);
        } catch (Exception e) {
            sja.f45482e.m48388c(bka.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject jSONObjectM21643D = cri.m21643D();
        if (jSONObjectM21643D != null) {
            Iterator<String> itKeys = jSONObjectM21643D.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectM21643D.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
