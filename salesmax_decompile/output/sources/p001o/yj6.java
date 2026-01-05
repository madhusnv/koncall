package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class yj6 {

    /* renamed from: j */
    public static final C18421b f55592j = new C18421b(null);

    /* renamed from: a */
    public final String f55593a;

    /* renamed from: b */
    public final EnumC18422c f55594b;

    /* renamed from: c */
    public final EnumC18420a f55595c;

    /* renamed from: d */
    public final String f55596d;

    /* renamed from: e */
    public final List f55597e;

    /* renamed from: f */
    public final List f55598f;

    /* renamed from: g */
    public final String f55599g;

    /* renamed from: h */
    public final String f55600h;

    /* renamed from: i */
    public final String f55601i;

    /* renamed from: o.yj6$a */
    public enum EnumC18420a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: o.yj6$b */
    public static final class C18421b {
        public C18421b() {
        }

        public /* synthetic */ C18421b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final yj6 m57883a(JSONObject jSONObject) throws JSONException {
            sq8.m48649h(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
            sq8.m48648g(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            sq8.m48648g(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            sq8.m48648g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            EnumC18422c enumC18422cValueOf = EnumC18422c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            sq8.m48648g(string3, "mapping.getString(\"event_type\")");
            sq8.m48648g(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            sq8.m48648g(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            EnumC18420a enumC18420aValueOf = EnumC18420a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray(ClientCookie.PATH_ATTR);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sq8.m48648g(jSONObject2, "jsonPath");
                arrayList.add(new yzc(jSONObject2));
            }
            String strOptString = jSONObject.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                    sq8.m48648g(jSONObject3, "jsonParameter");
                    arrayList2.add(new pwc(jSONObject3));
                }
            }
            String strOptString2 = jSONObject.optString("component_id");
            String strOptString3 = jSONObject.optString("activity_name");
            sq8.m48648g(string, "eventName");
            sq8.m48648g(string4, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
            sq8.m48648g(strOptString2, "componentId");
            sq8.m48648g(strOptString, "pathType");
            sq8.m48648g(strOptString3, "activityName");
            return new yj6(string, enumC18422cValueOf, enumC18420aValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
        }

        /* renamed from: b */
        public final List m57884b(JSONArray jSONArray) throws JSONException {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        sq8.m48648g(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(m57883a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* renamed from: o.yj6$c */
    public enum EnumC18422c {
        MANUAL,
        INFERENCE
    }

    public yj6(String str, EnumC18422c enumC18422c, EnumC18420a enumC18420a, String str2, List list, List list2, String str3, String str4, String str5) {
        sq8.m48649h(str, "eventName");
        sq8.m48649h(enumC18422c, FirebaseAnalytics.Param.METHOD);
        sq8.m48649h(enumC18420a, "type");
        sq8.m48649h(str2, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        sq8.m48649h(list, ClientCookie.PATH_ATTR);
        sq8.m48649h(list2, "parameters");
        sq8.m48649h(str3, "componentId");
        sq8.m48649h(str4, "pathType");
        sq8.m48649h(str5, "activityName");
        this.f55593a = str;
        this.f55594b = enumC18422c;
        this.f55595c = enumC18420a;
        this.f55596d = str2;
        this.f55597e = list;
        this.f55598f = list2;
        this.f55599g = str3;
        this.f55600h = str4;
        this.f55601i = str5;
    }

    /* renamed from: a */
    public final String m57879a() {
        return this.f55601i;
    }

    /* renamed from: b */
    public final String m57880b() {
        return this.f55593a;
    }

    /* renamed from: c */
    public final List m57881c() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f55598f);
        sq8.m48648g(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    /* renamed from: d */
    public final List m57882d() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f55597e);
        sq8.m48648g(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
