package p001o;

import com.facebook.C10773c;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p001o.mjb;

/* loaded from: classes5.dex */
public final class qn8 {

    /* renamed from: a */
    public static final qn8 f42208a = new qn8();

    /* renamed from: b */
    public static boolean f42209b;

    /* renamed from: c */
    public static boolean f42210c;

    /* renamed from: a */
    public static final void m45702a() {
        if (a94.m16694d(qn8.class)) {
            return;
        }
        try {
            f42209b = true;
            f42210c = st6.m48897d("FBSDKFeatureIntegritySample", C10773c.m13020m(), false);
        } catch (Throwable th) {
            a94.m16692b(th, qn8.class);
        }
    }

    /* renamed from: c */
    public static final void m45703c(Map map) {
        if (a94.m16694d(qn8.class)) {
            return;
        }
        try {
            sq8.m48649h(map, "parameters");
            if (!f42209b || map.isEmpty()) {
                return;
            }
            try {
                List<String> listQ0 = kh3.Q0(map.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : listQ0) {
                    Object obj = map.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String str2 = (String) obj;
                    qn8 qn8Var = f42208a;
                    if (qn8Var.m45705d(str) || qn8Var.m45705d(str2)) {
                        map.remove(str);
                        if (!f42210c) {
                            str2 = "";
                        }
                        jSONObject.put(str, str2);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    sq8.m48648g(string, "restrictiveParamJson.toString()");
                    map.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, qn8.class);
        }
    }

    /* renamed from: b */
    public final String m45704b(String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String[] strArrM39194q = mjb.m39194q(mjb.EnumC15341a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (strArrM39194q != null) {
                String str2 = strArrM39194q[0];
                if (str2 != null) {
                    return str2;
                }
            }
            return DevicePublicKeyStringDef.NONE;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m45705d(String str) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return !sq8.m48644c(DevicePublicKeyStringDef.NONE, m45704b(str));
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
