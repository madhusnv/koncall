package bk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.g */
/* loaded from: classes.dex */
public final class C0676g {

    /* renamed from: h */
    public static final Date f4256h = new Date(0);

    /* renamed from: a */
    public final JSONObject f4257a;

    /* renamed from: b */
    public final JSONObject f4258b;

    /* renamed from: c */
    public final Date f4259c;

    /* renamed from: d */
    public final JSONArray f4260d;

    /* renamed from: e */
    public final JSONObject f4261e;

    /* renamed from: f */
    public final long f4262f;

    /* renamed from: g */
    public final JSONArray f4263g;

    public C0676g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j6, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j6);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f4258b = jSONObject;
        this.f4259c = date;
        this.f4260d = jSONArray;
        this.f4261e = jSONObject2;
        this.f4262f = j6;
        this.f4263g = jSONArray2;
        this.f4257a = jSONObject3;
    }

    /* renamed from: a */
    public static C0676g m1952a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new C0676g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    /* renamed from: c */
    public static C0675f m1953c() {
        C0675f c0675f = new C0675f();
        c0675f.f4251b = new JSONObject();
        c0675f.f4253d = f4256h;
        c0675f.f4254e = new JSONArray();
        c0675f.f4252c = new JSONObject();
        c0675f.f4250a = 0L;
        c0675f.f4255f = new JSONArray();
        return c0675f;
    }

    /* renamed from: b */
    public final HashMap m1954b() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f4263g;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string3 = jSONArray2.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0676g) {
            return this.f4257a.toString().equals(((C0676g) obj).f4257a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4257a.hashCode();
    }

    public final String toString() {
        return this.f4257a.toString();
    }
}
