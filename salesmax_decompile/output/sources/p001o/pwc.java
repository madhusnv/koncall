package p001o;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class pwc {

    /* renamed from: e */
    public static final C16207a f40685e = new C16207a(null);

    /* renamed from: a */
    public final String f40686a;

    /* renamed from: b */
    public final String f40687b;

    /* renamed from: c */
    public final List f40688c;

    /* renamed from: d */
    public final String f40689d;

    /* renamed from: o.pwc$a */
    public static final class C16207a {
        public C16207a() {
        }

        public /* synthetic */ C16207a(id5 id5Var) {
            this();
        }
    }

    public pwc(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "component");
        String string = jSONObject.getString("name");
        sq8.m48648g(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f40686a = string;
        String strOptString = jSONObject.optString("value");
        sq8.m48648g(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f40687b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        sq8.m48648g(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f40689d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ClientCookie.PATH_ATTR);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                sq8.m48648g(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new yzc(jSONObject2));
            }
        }
        this.f40688c = arrayList;
    }

    /* renamed from: a */
    public final String m44257a() {
        return this.f40686a;
    }

    /* renamed from: b */
    public final List m44258b() {
        return this.f40688c;
    }

    /* renamed from: c */
    public final String m44259c() {
        return this.f40689d;
    }

    /* renamed from: d */
    public final String m44260d() {
        return this.f40687b;
    }
}
