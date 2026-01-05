package p001o;

import android.content.SharedPreferences;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.messaging.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sja;

/* loaded from: classes5.dex */
public final class il0 {

    /* renamed from: a */
    public static final il0 f28789a = new il0();

    /* renamed from: b */
    public static final String f28790b = il0.class.getCanonicalName();

    /* renamed from: c */
    public static boolean f28791c;

    /* renamed from: b */
    public static final void m32251b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, C10773c.m13020m() + "/cloudbridge_settings", null, p38.GET, new GraphRequest.InterfaceC10763b() { // from class: o.hl0
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) throws JSONException {
                    il0.m32252c(c10776f);
                }
            }, null, 32, null);
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.APP_EVENTS;
            String str = f28790b;
            sq8.m48647f(str, "null cannot be cast to non-null type kotlin.String");
            c16851a.m48388c(bkaVar, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.m12852l();
        } catch (JSONException e) {
            sja.C16851a c16851a2 = sja.f45482e;
            bka bkaVar2 = bka.APP_EVENTS;
            String str2 = f28790b;
            sq8.m48647f(str2, "null cannot be cast to non-null type kotlin.String");
            c16851a2.m48388c(bkaVar2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", cl6.m21378c(e));
        }
    }

    /* renamed from: c */
    public static final void m32252c(C10776f c10776f) throws JSONException {
        sq8.m48649h(c10776f, "response");
        f28789a.m32254d(c10776f);
    }

    /* renamed from: e */
    public static final Map m32253e() {
        if (a94.m16694d(il0.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            uif uifVar = uif.DATASETID;
            String string = sharedPreferences.getString(uifVar.getRawValue(), null);
            uif uifVar2 = uif.URL;
            String string2 = sharedPreferences.getString(uifVar2.getRawValue(), null);
            uif uifVar3 = uif.ACCESSKEY;
            String string3 = sharedPreferences.getString(uifVar3.getRawValue(), null);
            if (!(string == null || f9g.d0(string))) {
                if (!(string2 == null || f9g.d0(string2))) {
                    if (!(string3 == null || f9g.d0(string3))) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(uifVar2.getRawValue(), string2);
                        linkedHashMap.put(uifVar.getRawValue(), string);
                        linkedHashMap.put(uifVar3.getRawValue(), string3);
                        sja.f45482e.m48388c(bka.APP_EVENTS, f28790b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                        return linkedHashMap;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, il0.class);
            return null;
        }
    }

    /* renamed from: d */
    public final void m32254d(C10776f c10776f) throws JSONException {
        Object obj;
        boolean zBooleanValue;
        sq8.m48649h(c10776f, "response");
        if (c10776f.m13064b() != null) {
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.APP_EVENTS;
            String str = f28790b;
            sq8.m48647f(str, "null cannot be cast to non-null type kotlin.String");
            c16851a.m48388c(bkaVar, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", c10776f.m13064b().toString(), String.valueOf(c10776f.m13064b().m12823e()));
            Map mapM32253e = m32253e();
            if (mapM32253e != null) {
                URL url = new URL(String.valueOf(mapM32253e.get(uif.URL.getRawValue())));
                ll0.m37398d(String.valueOf(mapM32253e.get(uif.DATASETID.getRawValue())), url.getProtocol() + "://" + url.getHost(), String.valueOf(mapM32253e.get(uif.ACCESSKEY.getRawValue())));
                f28791c = true;
                return;
            }
            return;
        }
        sja.C16851a c16851a2 = sja.f45482e;
        bka bkaVar2 = bka.APP_EVENTS;
        String str2 = f28790b;
        sq8.m48647f(str2, "null cannot be cast to non-null type kotlin.String");
        c16851a2.m48388c(bkaVar2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", c10776f);
        JSONObject jSONObjectM13065c = c10776f.m13065c();
        if (jSONObjectM13065c != null) {
            try {
                obj = jSONObjectM13065c.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            } catch (NullPointerException e) {
                sja.C16851a c16851a3 = sja.f45482e;
                bka bkaVar3 = bka.APP_EVENTS;
                String str3 = f28790b;
                sq8.m48648g(str3, "TAG");
                c16851a3.m48388c(bkaVar3, str3, "CloudBridge Settings API response is not a valid json: \n%s ", cl6.m21378c(e));
                return;
            } catch (JSONException e2) {
                sja.C16851a c16851a4 = sja.f45482e;
                bka bkaVar4 = bka.APP_EVENTS;
                String str4 = f28790b;
                sq8.m48648g(str4, "TAG");
                c16851a4.m48388c(bkaVar4, str4, "CloudBridge Settings API response is not a valid json: \n%s ", cl6.m21378c(e2));
                return;
            }
        } else {
            obj = null;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Map mapM21668o = cri.m21668o(new JSONObject((String) kh3.h0(cri.m21667n((JSONArray) obj))));
        String str5 = (String) mapM21668o.get(uif.URL.getRawValue());
        String str6 = (String) mapM21668o.get(uif.DATASETID.getRawValue());
        String str7 = (String) mapM21668o.get(uif.ACCESSKEY.getRawValue());
        if (str5 == null || str6 == null || str7 == null) {
            sq8.m48648g(str2, "TAG");
            c16851a2.m48387b(bkaVar2, str2, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            ll0.m37398d(str6, str5, str7);
            m32256g(mapM21668o);
            uif uifVar = uif.ENABLED;
            if (mapM21668o.get(uifVar.getRawValue()) != null) {
                Object obj2 = mapM21668o.get(uifVar.getRawValue());
                sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                zBooleanValue = ((Boolean) obj2).booleanValue();
            } else {
                zBooleanValue = false;
            }
            f28791c = zBooleanValue;
        } catch (MalformedURLException e3) {
            sja.C16851a c16851a5 = sja.f45482e;
            bka bkaVar5 = bka.APP_EVENTS;
            String str8 = f28790b;
            sq8.m48648g(str8, "TAG");
            c16851a5.m48388c(bkaVar5, str8, "CloudBridge Settings API response doesn't have valid url\n %s ", cl6.m21378c(e3));
        }
    }

    /* renamed from: f */
    public final boolean m32255f() {
        return f28791c;
    }

    /* renamed from: g */
    public final void m32256g(Map map) {
        SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        uif uifVar = uif.DATASETID;
        Object obj = map.get(uifVar.getRawValue());
        uif uifVar2 = uif.URL;
        Object obj2 = map.get(uifVar2.getRawValue());
        uif uifVar3 = uif.ACCESSKEY;
        Object obj3 = map.get(uifVar3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(uifVar.getRawValue(), obj.toString());
        editorEdit2.putString(uifVar2.getRawValue(), obj2.toString());
        editorEdit2.putString(uifVar3.getRawValue(), obj3.toString());
        editorEdit2.apply();
        sja.f45482e.m48388c(bka.APP_EVENTS, f28790b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
