package p001o;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class tt6 {

    /* renamed from: G */
    public static final C17203a f47724G = new C17203a(null);

    /* renamed from: A */
    public final JSONArray f47725A;

    /* renamed from: B */
    public final List f47726B;

    /* renamed from: C */
    public final List f47727C;

    /* renamed from: D */
    public final List f47728D;

    /* renamed from: E */
    public final List f47729E;

    /* renamed from: F */
    public final Long f47730F;

    /* renamed from: a */
    public final boolean f47731a;

    /* renamed from: b */
    public final String f47732b;

    /* renamed from: c */
    public final boolean f47733c;

    /* renamed from: d */
    public final int f47734d;

    /* renamed from: e */
    public final EnumSet f47735e;

    /* renamed from: f */
    public final Map f47736f;

    /* renamed from: g */
    public final boolean f47737g;

    /* renamed from: h */
    public final xr6 f47738h;

    /* renamed from: i */
    public final String f47739i;

    /* renamed from: j */
    public final String f47740j;

    /* renamed from: k */
    public final boolean f47741k;

    /* renamed from: l */
    public final boolean f47742l;

    /* renamed from: m */
    public final JSONArray f47743m;

    /* renamed from: n */
    public final String f47744n;

    /* renamed from: o */
    public final boolean f47745o;

    /* renamed from: p */
    public final boolean f47746p;

    /* renamed from: q */
    public final String f47747q;

    /* renamed from: r */
    public final String f47748r;

    /* renamed from: s */
    public final String f47749s;

    /* renamed from: t */
    public final JSONArray f47750t;

    /* renamed from: u */
    public final JSONArray f47751u;

    /* renamed from: v */
    public final Map f47752v;

    /* renamed from: w */
    public final JSONArray f47753w;

    /* renamed from: x */
    public final JSONArray f47754x;

    /* renamed from: y */
    public final JSONArray f47755y;

    /* renamed from: z */
    public final JSONArray f47756z;

    /* renamed from: o.tt6$a */
    public static final class C17203a {
        public C17203a() {
        }

        public /* synthetic */ C17203a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.tt6$b */
    public static final class C17204b {

        /* renamed from: e */
        public static final a f47757e = new a(null);

        /* renamed from: a */
        public final String f47758a;

        /* renamed from: b */
        public final String f47759b;

        /* renamed from: c */
        public final Uri f47760c;

        /* renamed from: d */
        public final int[] f47761d;

        /* renamed from: o.tt6$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C17204b m50562a(JSONObject jSONObject) {
                sq8.m48649h(jSONObject, "dialogConfigJSON");
                String strOptString = jSONObject.optString("name");
                if (cri.d0(strOptString)) {
                    return null;
                }
                sq8.m48648g(strOptString, "dialogNameWithFeature");
                List listD0 = f9g.D0(strOptString, new String[]{"|"}, false, 0, 6, null);
                if (listD0.size() != 2) {
                    return null;
                }
                String str = (String) kh3.f0(listD0);
                String str2 = (String) kh3.r0(listD0);
                if (cri.d0(str) || cri.d0(str2)) {
                    return null;
                }
                String strOptString2 = jSONObject.optString(ImagesContract.URL);
                return new C17204b(str, str2, cri.d0(strOptString2) ? null : Uri.parse(strOptString2), m50563b(jSONObject.optJSONArray("versions")), null);
            }

            /* renamed from: b */
            public final int[] m50563b(JSONArray jSONArray) throws NumberFormatException {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    int i2 = -1;
                    int iOptInt = jSONArray.optInt(i, -1);
                    if (iOptInt == -1) {
                        String strOptString = jSONArray.optString(i);
                        if (!cri.d0(strOptString)) {
                            try {
                                sq8.m48648g(strOptString, "versionString");
                                i2 = Integer.parseInt(strOptString);
                            } catch (NumberFormatException e) {
                                cri.j0("FacebookSDK", e);
                            }
                            iOptInt = i2;
                        }
                    }
                    iArr[i] = iOptInt;
                }
                return iArr;
            }
        }

        public /* synthetic */ C17204b(String str, String str2, Uri uri, int[] iArr, id5 id5Var) {
            this(str, str2, uri, iArr);
        }

        /* renamed from: a */
        public final String m50560a() {
            return this.f47758a;
        }

        /* renamed from: b */
        public final String m50561b() {
            return this.f47759b;
        }

        public C17204b(String str, String str2, Uri uri, int[] iArr) {
            this.f47758a = str;
            this.f47759b = str2;
            this.f47760c = uri;
            this.f47761d = iArr;
        }
    }

    public tt6(boolean z, String str, boolean z2, int i, EnumSet enumSet, Map map, boolean z3, xr6 xr6Var, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7, JSONArray jSONArray2, JSONArray jSONArray3, Map map2, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, List list, List list2, List list3, List list4, Long l) {
        sq8.m48649h(str, "nuxContent");
        sq8.m48649h(enumSet, "smartLoginOptions");
        sq8.m48649h(map, "dialogConfigurations");
        sq8.m48649h(xr6Var, "errorClassification");
        sq8.m48649h(str2, "smartLoginBookmarkIconURL");
        sq8.m48649h(str3, "smartLoginMenuIconURL");
        sq8.m48649h(str4, "sdkUpdateMessage");
        this.f47731a = z;
        this.f47732b = str;
        this.f47733c = z2;
        this.f47734d = i;
        this.f47735e = enumSet;
        this.f47736f = map;
        this.f47737g = z3;
        this.f47738h = xr6Var;
        this.f47739i = str2;
        this.f47740j = str3;
        this.f47741k = z4;
        this.f47742l = z5;
        this.f47743m = jSONArray;
        this.f47744n = str4;
        this.f47745o = z6;
        this.f47746p = z7;
        this.f47747q = str5;
        this.f47748r = str6;
        this.f47749s = str7;
        this.f47750t = jSONArray2;
        this.f47751u = jSONArray3;
        this.f47752v = map2;
        this.f47753w = jSONArray4;
        this.f47754x = jSONArray5;
        this.f47755y = jSONArray6;
        this.f47756z = jSONArray7;
        this.f47725A = jSONArray8;
        this.f47726B = list;
        this.f47727C = list2;
        this.f47728D = list3;
        this.f47729E = list4;
        this.f47730F = l;
    }

    /* renamed from: a */
    public final boolean m50534a() {
        return this.f47737g;
    }

    /* renamed from: b */
    public final JSONArray m50535b() {
        return this.f47725A;
    }

    /* renamed from: c */
    public final JSONArray m50536c() {
        return this.f47753w;
    }

    /* renamed from: d */
    public final boolean m50537d() {
        return this.f47742l;
    }

    /* renamed from: e */
    public final List m50538e() {
        return this.f47726B;
    }

    /* renamed from: f */
    public final Long m50539f() {
        return this.f47730F;
    }

    /* renamed from: g */
    public final xr6 m50540g() {
        return this.f47738h;
    }

    /* renamed from: h */
    public final JSONArray m50541h() {
        return this.f47743m;
    }

    /* renamed from: i */
    public final boolean m50542i() {
        return this.f47741k;
    }

    /* renamed from: j */
    public final JSONArray m50543j() {
        return this.f47751u;
    }

    /* renamed from: k */
    public final String m50544k() {
        return this.f47732b;
    }

    /* renamed from: l */
    public final boolean m50545l() {
        return this.f47733c;
    }

    /* renamed from: m */
    public final List m50546m() {
        return this.f47728D;
    }

    /* renamed from: n */
    public final JSONArray m50547n() {
        return this.f47750t;
    }

    /* renamed from: o */
    public final List m50548o() {
        return this.f47727C;
    }

    /* renamed from: p */
    public final String m50549p() {
        return this.f47747q;
    }

    /* renamed from: q */
    public final JSONArray m50550q() {
        return this.f47754x;
    }

    /* renamed from: r */
    public final String m50551r() {
        return this.f47749s;
    }

    /* renamed from: s */
    public final JSONArray m50552s() {
        return this.f47756z;
    }

    /* renamed from: t */
    public final String m50553t() {
        return this.f47744n;
    }

    /* renamed from: u */
    public final JSONArray m50554u() {
        return this.f47755y;
    }

    /* renamed from: v */
    public final int m50555v() {
        return this.f47734d;
    }

    /* renamed from: w */
    public final EnumSet m50556w() {
        return this.f47735e;
    }

    /* renamed from: x */
    public final String m50557x() {
        return this.f47748r;
    }

    /* renamed from: y */
    public final List m50558y() {
        return this.f47729E;
    }

    /* renamed from: z */
    public final boolean m50559z() {
        return this.f47731a;
    }
}
