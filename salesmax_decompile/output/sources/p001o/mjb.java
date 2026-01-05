package p001o;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.mjb;
import p001o.mt6;
import p001o.pw6;

/* loaded from: classes5.dex */
public final class mjb {

    /* renamed from: a */
    public static final mjb f35551a = new mjb();

    /* renamed from: b */
    public static final Map f35552b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final List f35553c = ch3.m21249n("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d */
    public static final List f35554d = ch3.m21249n(DevicePublicKeyStringDef.NONE, "address", "health");

    /* renamed from: o.mjb$a */
    public enum EnumC15341a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: o.mjb$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35555a;

            static {
                int[] iArr = new int[EnumC15341a.values().length];
                try {
                    iArr[EnumC15341a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC15341a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f35555a = iArr;
            }
        }

        public final String toKey() {
            int i = a.f35555a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new szb();
        }

        public final String toUseCase() {
            int i = a.f35555a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new szb();
        }
    }

    /* renamed from: o.mjb$b */
    public static final class C15342b {

        /* renamed from: i */
        public static final a f35556i = new a(null);

        /* renamed from: a */
        public String f35557a;

        /* renamed from: b */
        public String f35558b;

        /* renamed from: c */
        public String f35559c;

        /* renamed from: d */
        public int f35560d;

        /* renamed from: e */
        public float[] f35561e;

        /* renamed from: f */
        public File f35562f;

        /* renamed from: g */
        public rgb f35563g;

        /* renamed from: h */
        public Runnable f35564h;

        /* renamed from: o.mjb$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: g */
            public static final void m39217g(List list, File file) {
                sq8.m48649h(list, "$slaves");
                sq8.m48649h(file, TransferTable.COLUMN_FILE);
                final rgb rgbVarM46731a = rgb.f43588m.m46731a(file);
                if (rgbVarM46731a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final C15342b c15342b = (C15342b) it.next();
                        C15342b.f35556i.m39221e(c15342b.m39208e(), c15342b.m39210g() + '_' + c15342b.m39211h() + "_rule", new pw6.InterfaceC16205a() { // from class: o.ojb
                            @Override // p001o.pw6.InterfaceC16205a
                            /* renamed from: a */
                            public final void mo40677a(File file2) {
                                mjb.C15342b.a.m39218h(c15342b, rgbVarM46731a, file2);
                            }
                        });
                    }
                }
            }

            /* renamed from: h */
            public static final void m39218h(C15342b c15342b, rgb rgbVar, File file) {
                sq8.m48649h(c15342b, "$slave");
                sq8.m48649h(file, TransferTable.COLUMN_FILE);
                c15342b.m39212i(rgbVar);
                c15342b.m39214k(file);
                Runnable runnable = c15342b.f35564h;
                if (runnable != null) {
                    runnable.run();
                }
            }

            /* renamed from: c */
            public final C15342b m39219c(JSONObject jSONObject) throws JSONException {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i = jSONObject.getInt(TransferTable.COLUMN_VERSION_ID);
                    float[] fArrM39188d = mjb.m39188d(mjb.f35551a, jSONObject.getJSONArray("thresholds"));
                    sq8.m48648g(string, "useCase");
                    sq8.m48648g(string2, "assetUri");
                    return new C15342b(string, string2, strOptString, i, fArrM39188d);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: d */
            public final void m39220d(String str, int i) {
                File[] fileArrListFiles;
                File fileM32648a = iri.m32648a();
                if (fileM32648a == null || (fileArrListFiles = fileM32648a.listFiles()) == null) {
                    return;
                }
                if (fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    sq8.m48648g(name, "name");
                    if (e9g.m24597K(name, str, false, 2, null) && !e9g.m24597K(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* renamed from: e */
            public final void m39221e(String str, String str2, pw6.InterfaceC16205a interfaceC16205a) {
                File file = new File(iri.m32648a(), str2);
                if (str == null || file.exists()) {
                    interfaceC16205a.mo40677a(file);
                } else {
                    new pw6(str, file, interfaceC16205a).execute(new String[0]);
                }
            }

            /* renamed from: f */
            public final void m39222f(C15342b c15342b, final List list) {
                sq8.m48649h(c15342b, "master");
                sq8.m48649h(list, "slaves");
                m39220d(c15342b.m39210g(), c15342b.m39211h());
                m39221e(c15342b.m39205b(), c15342b.m39210g() + '_' + c15342b.m39211h(), new pw6.InterfaceC16205a() { // from class: o.njb
                    @Override // p001o.pw6.InterfaceC16205a
                    /* renamed from: a */
                    public final void mo40677a(File file) {
                        mjb.C15342b.a.m39217g(list, file);
                    }
                });
            }
        }

        public C15342b(String str, String str2, String str3, int i, float[] fArr) {
            sq8.m48649h(str, "useCase");
            sq8.m48649h(str2, "assetUri");
            this.f35557a = str;
            this.f35558b = str2;
            this.f35559c = str3;
            this.f35560d = i;
            this.f35561e = fArr;
        }

        /* renamed from: b */
        public final String m39205b() {
            return this.f35558b;
        }

        /* renamed from: c */
        public final rgb m39206c() {
            return this.f35563g;
        }

        /* renamed from: d */
        public final File m39207d() {
            return this.f35562f;
        }

        /* renamed from: e */
        public final String m39208e() {
            return this.f35559c;
        }

        /* renamed from: f */
        public final float[] m39209f() {
            return this.f35561e;
        }

        /* renamed from: g */
        public final String m39210g() {
            return this.f35557a;
        }

        /* renamed from: h */
        public final int m39211h() {
            return this.f35560d;
        }

        /* renamed from: i */
        public final void m39212i(rgb rgbVar) {
            this.f35563g = rgbVar;
        }

        /* renamed from: j */
        public final C15342b m39213j(Runnable runnable) {
            this.f35564h = runnable;
            return this;
        }

        /* renamed from: k */
        public final void m39214k(File file) {
            this.f35562f = file;
        }
    }

    /* renamed from: o.mjb$c */
    public /* synthetic */ class C15343c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35565a;

        static {
            int[] iArr = new int[EnumC15341a.values().length];
            try {
                iArr[EnumC15341a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15341a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35565a = iArr;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ float[] m39188d(mjb mjbVar, JSONArray jSONArray) {
        if (a94.m16694d(mjb.class)) {
            return null;
        }
        try {
            return mjbVar.m39200o(jSONArray);
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m39189f() {
        if (a94.m16694d(mjb.class)) {
            return;
        }
        try {
            cri.C0(new Runnable() { // from class: o.jjb
                @Override // java.lang.Runnable
                public final void run() {
                    mjb.m39190g();
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
        }
    }

    /* renamed from: g */
    public static final void m39190g() {
        JSONObject jSONObject;
        if (a94.m16694d(mjb.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            if (string != null) {
                jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
            }
            long j = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!mt6.m39648g(mt6.EnumC15426c.ModelRequest) || jSONObject.length() == 0 || !f35551a.m39199n(j)) {
                jSONObject = f35551a.m39197k();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            mjb mjbVar = f35551a;
            mjbVar.m39195e(jSONObject);
            mjbVar.m39196h();
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
        }
    }

    /* renamed from: i */
    public static final void m39191i() {
        if (a94.m16694d(mjb.class)) {
            return;
        }
        try {
            bcg.m18618b();
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
        }
    }

    /* renamed from: j */
    public static final void m39192j() {
        if (a94.m16694d(mjb.class)) {
            return;
        }
        try {
            qn8.m45702a();
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
        }
    }

    /* renamed from: l */
    public static final File m39193l(EnumC15341a enumC15341a) {
        if (a94.m16694d(mjb.class)) {
            return null;
        }
        try {
            sq8.m48649h(enumC15341a, "task");
            C15342b c15342b = (C15342b) f35552b.get(enumC15341a.toUseCase());
            if (c15342b == null) {
                return null;
            }
            return c15342b.m39207d();
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
            return null;
        }
    }

    /* renamed from: q */
    public static final String[] m39194q(EnumC15341a enumC15341a, float[][] fArr, String[] strArr) {
        rgb rgbVarM39206c;
        if (a94.m16694d(mjb.class)) {
            return null;
        }
        try {
            sq8.m48649h(enumC15341a, "task");
            sq8.m48649h(fArr, "denses");
            sq8.m48649h(strArr, "texts");
            C15342b c15342b = (C15342b) f35552b.get(enumC15341a.toUseCase());
            if (c15342b != null && (rgbVarM39206c = c15342b.m39206c()) != null) {
                float[] fArrM39209f = c15342b.m39209f();
                int length = strArr.length;
                int length2 = fArr[0].length;
                gna gnaVar = new gna(new int[]{length, length2});
                for (int i = 0; i < length; i++) {
                    System.arraycopy(fArr[i], 0, gnaVar.m29151a(), i * length2, length2);
                }
                gna gnaVarM46730b = rgbVarM39206c.m46730b(gnaVar, strArr, enumC15341a.toKey());
                if (gnaVarM46730b == null || fArrM39209f == null) {
                    return null;
                }
                if (gnaVarM46730b.m29151a().length == 0) {
                    return null;
                }
                if (fArrM39209f.length == 0) {
                    return null;
                }
                int i2 = C15343c.f35565a[enumC15341a.ordinal()];
                if (i2 == 1) {
                    return f35551a.m39203s(gnaVarM46730b, fArrM39209f);
                }
                if (i2 == 2) {
                    return f35551a.m39202r(gnaVarM46730b, fArrM39209f);
                }
                throw new szb();
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, mjb.class);
            return null;
        }
    }

    /* renamed from: e */
    public final void m39195e(JSONObject jSONObject) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    C15342b c15342bM39219c = C15342b.f35556i.m39219c(jSONObject.getJSONObject(itKeys.next()));
                    if (c15342bM39219c != null) {
                        f35552b.put(c15342bM39219c.m39210g(), c15342bM39219c);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m39196h() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String strM39205b = null;
            int iMax = 0;
            for (Map.Entry entry : f35552b.entrySet()) {
                String str = (String) entry.getKey();
                C15342b c15342b = (C15342b) entry.getValue();
                if (sq8.m48644c(str, EnumC15341a.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String strM39205b2 = c15342b.m39205b();
                    int iMax2 = Math.max(iMax, c15342b.m39211h());
                    if (mt6.m39648g(mt6.EnumC15426c.SuggestedEvents) && m39198m()) {
                        arrayList.add(c15342b.m39213j(new Runnable() { // from class: o.kjb
                            @Override // java.lang.Runnable
                            public final void run() {
                                mjb.m39191i();
                            }
                        }));
                    }
                    strM39205b = strM39205b2;
                    iMax = iMax2;
                }
                if (sq8.m48644c(str, EnumC15341a.MTML_INTEGRITY_DETECT.toUseCase())) {
                    strM39205b = c15342b.m39205b();
                    iMax = Math.max(iMax, c15342b.m39211h());
                    if (mt6.m39648g(mt6.EnumC15426c.IntelligentIntegrity)) {
                        arrayList.add(c15342b.m39213j(new Runnable() { // from class: o.ljb
                            @Override // java.lang.Runnable
                            public final void run() {
                                mjb.m39192j();
                            }
                        }));
                    }
                }
            }
            if (strM39205b == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            C15342b.f35556i.m39222f(new C15342b("MTML", strM39205b, null, iMax, null), arrayList);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: k */
    public final JSONObject m39197k() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            String[] strArr = {"use_case", TransferTable.COLUMN_VERSION_ID, "asset_uri", "rules_uri", "thresholds"};
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", strArr));
            GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(null, "app/model_asset", null);
            graphRequestM12913x.m12846G(bundle);
            JSONObject jSONObjectM13065c = graphRequestM12913x.m12851k().m13065c();
            if (jSONObjectM13065c == null) {
                return null;
            }
            return m39201p(jSONObjectM13065c);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: m */
    public final boolean m39198m() {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            Locale localeM21650O = cri.m21650O();
            if (localeM21650O != null) {
                String language = localeM21650O.getLanguage();
                sq8.m48648g(language, "locale.language");
                if (!f9g.m26306P(language, "en", false, 2, null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m39199n(long j) {
        if (a94.m16694d(this) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < 259200000;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: o */
    public final float[] m39200o(JSONArray jSONArray) {
        if (a94.m16694d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    sq8.m48648g(string, "jsonArray.getString(i)");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: p */
    public final JSONObject m39201p(JSONObject jSONObject) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(TransferTable.COLUMN_VERSION_ID, jSONObject3.getString(TransferTable.COLUMN_VERSION_ID));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: r */
    public final String[] m39202r(gna gnaVar, float[] fArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            float[] fArrM29151a = gnaVar.m29151a();
            if (iM29152b2 != fArr.length) {
                return null;
            }
            kl8 kl8VarM18616s = bce.m18616s(0, iM29152b);
            ArrayList arrayList = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
            Iterator it = kl8VarM18616s.iterator();
            while (it.hasNext()) {
                int iMo23412a = ((dl8) it).mo23412a();
                Object obj = DevicePublicKeyStringDef.NONE;
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (fArrM29151a[(iMo23412a * iM29152b2) + i2] >= fArr[i]) {
                        obj = f35554d.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: s */
    public final String[] m39203s(gna gnaVar, float[] fArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            float[] fArrM29151a = gnaVar.m29151a();
            if (iM29152b2 != fArr.length) {
                return null;
            }
            kl8 kl8VarM18616s = bce.m18616s(0, iM29152b);
            ArrayList arrayList = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
            Iterator it = kl8VarM18616s.iterator();
            while (it.hasNext()) {
                int iMo23412a = ((dl8) it).mo23412a();
                Object obj = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (fArrM29151a[(iMo23412a * iM29152b2) + i2] >= fArr[i]) {
                        obj = f35553c.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
