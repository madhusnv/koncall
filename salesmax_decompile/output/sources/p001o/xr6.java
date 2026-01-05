package p001o;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class xr6 {

    /* renamed from: g */
    public static final C18228a f54160g = new C18228a(null);

    /* renamed from: h */
    public static xr6 f54161h;

    /* renamed from: a */
    public final Map f54162a;

    /* renamed from: b */
    public final Map f54163b;

    /* renamed from: c */
    public final Map f54164c;

    /* renamed from: d */
    public final String f54165d;

    /* renamed from: e */
    public final String f54166e;

    /* renamed from: f */
    public final String f54167f;

    /* renamed from: o.xr6$a */
    public static final class C18228a {
        public C18228a() {
        }

        public /* synthetic */ C18228a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xr6 m56689a(JSONArray jSONArray) {
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map mapM56692d = null;
            Map mapM56692d2 = null;
            Map mapM56692d3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (e9g.m24606x(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM56692d = m56692d(jSONObjectOptJSONObject);
                    } else if (e9g.m24606x(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM56692d2 = m56692d(jSONObjectOptJSONObject);
                    } else if (e9g.m24606x(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM56692d3 = m56692d(jSONObjectOptJSONObject);
                    }
                }
            }
            return new xr6(mapM56692d, mapM56692d2, mapM56692d3, strOptString2, strOptString3, strOptString4);
        }

        /* renamed from: b */
        public final synchronized xr6 m56690b() {
            xr6 xr6Var;
            if (xr6.f54161h == null) {
                xr6.f54161h = m56691c();
            }
            xr6Var = xr6.f54161h;
            sq8.m48647f(xr6Var, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            return xr6Var;
        }

        /* renamed from: c */
        public final xr6 m56691c() {
            return new xr6(null, isa.m32683j(vyh.m53620a(2, null), vyh.m53620a(4, null), vyh.m53620a(9, null), vyh.m53620a(17, null), vyh.m53620a(341, null)), isa.m32683j(vyh.m53620a(102, null), vyh.m53620a(Integer.valueOf(Opcodes.ARRAYLENGTH), null), vyh.m53620a(412, null)), null, null, null);
        }

        /* renamed from: d */
        public final Map m56692d(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }
    }

    /* renamed from: o.xr6$b */
    public /* synthetic */ class C18229b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54168a;

        static {
            int[] iArr = new int[FacebookRequestError.EnumC10756a.values().length];
            try {
                iArr[FacebookRequestError.EnumC10756a.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacebookRequestError.EnumC10756a.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacebookRequestError.EnumC10756a.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54168a = iArr;
        }
    }

    public xr6(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f54162a = map;
        this.f54163b = map2;
        this.f54164c = map3;
        this.f54165d = str;
        this.f54166e = str2;
        this.f54167f = str3;
    }

    /* renamed from: c */
    public final FacebookRequestError.EnumC10756a m56687c(int i, int i2, boolean z) {
        Set set;
        Set set2;
        Set set3;
        if (z) {
            return FacebookRequestError.EnumC10756a.TRANSIENT;
        }
        Map map = this.f54162a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = (Set) this.f54162a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC10756a.OTHER;
        }
        Map map2 = this.f54164c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = (Set) this.f54164c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC10756a.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f54163b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = (Set) this.f54163b.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) ? FacebookRequestError.EnumC10756a.TRANSIENT : FacebookRequestError.EnumC10756a.OTHER;
    }

    /* renamed from: d */
    public final String m56688d(FacebookRequestError.EnumC10756a enumC10756a) {
        int i = enumC10756a == null ? -1 : C18229b.f54168a[enumC10756a.ordinal()];
        if (i == 1) {
            return this.f54165d;
        }
        if (i == 2) {
            return this.f54167f;
        }
        if (i != 3) {
            return null;
        }
        return this.f54166e;
    }
}
