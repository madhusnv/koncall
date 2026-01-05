package ak;

import a1.C0011j;
import a1.RunnableC0025x;
import android.os.Build;
import bk.C0674e;
import bk.C0676g;
import bk.C0677h;
import bk.C0681l;
import bk.C0682m;
import bk.C0685p;
import bk.C0687r;
import bk.EnumC0680k;
import c9.C0908c;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import ki.C4079b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ri.EnumC6551i;
import wj.C8090p;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.d */
/* loaded from: classes.dex */
public final class C0165d {

    /* renamed from: a */
    public final C4079b f505a;

    /* renamed from: b */
    public final Executor f506b;

    /* renamed from: c */
    public final C0674e f507c;

    /* renamed from: d */
    public final C0674e f508d;

    /* renamed from: e */
    public final C0674e f509e;

    /* renamed from: f */
    public final C0681l f510f;

    /* renamed from: g */
    public final C0682m f511g;

    /* renamed from: h */
    public final C0687r f512h;

    /* renamed from: i */
    public final C0908c f513i;

    /* renamed from: j */
    public final C8090p f514j;

    public C0165d(C4079b c4079b, Executor executor, C0674e c0674e, C0674e c0674e2, C0674e c0674e3, C0681l c0681l, C0682m c0682m, C0687r c0687r, C0908c c0908c, C8090p c8090p) {
        this.f505a = c4079b;
        this.f506b = executor;
        this.f507c = c0674e;
        this.f508d = c0674e2;
        this.f509e = c0674e3;
        this.f510f = c0681l;
        this.f511g = c0682m;
        this.f512h = c0687r;
        this.f513i = c0908c;
        this.f514j = c8090p;
    }

    /* renamed from: d */
    public static ArrayList m381d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C8656m m382a() {
        C0681l c0681l = this.f510f;
        long j6 = c0681l.f4283g.f4316a.getLong("minimum_fetch_interval_in_seconds", C0681l.f4275i);
        HashMap map = new HashMap(c0681l.f4284h);
        map.put("X-Firebase-RC-Fetch-Type", EnumC0680k.BASE.getValue() + "/1");
        return c0681l.f4281e.m1948b().m15981h(c0681l.f4279c, new C0677h(c0681l, j6, map)).m15986m(EnumC6551i.INSTANCE, new C0011j(8)).m15986m(this.f506b, new C0164c(this));
    }

    /* renamed from: b */
    public final String m383b(String str) {
        String string;
        C0682m c0682m = this.f511g;
        C0676g c0676gM1949c = c0682m.f4287c.m1949c();
        String string2 = null;
        if (c0676gM1949c == null) {
            string = null;
        } else {
            try {
                string = c0676gM1949c.f4258b.getString(str);
            } catch (JSONException unused) {
            }
        }
        if (string == null) {
            C0676g c0676gM1949c2 = c0682m.f4288d.m1949c();
            if (c0676gM1949c2 != null) {
                try {
                    string2 = c0676gM1949c2.f4258b.getString(str);
                } catch (JSONException unused2) {
                }
            }
            return string2 != null ? string2 : "";
        }
        C0676g c0676gM1949c3 = c0682m.f4287c.m1949c();
        if (c0676gM1949c3 != null) {
            synchronized (c0682m.f4285a) {
                try {
                    Iterator it = c0682m.f4285a.iterator();
                    while (it.hasNext()) {
                        c0682m.f4286b.execute(new RunnableC0025x(3, (C0168g) it.next(), str, c0676gM1949c3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return string;
    }

    /* renamed from: c */
    public final void m384c(boolean z6) {
        HttpURLConnection httpURLConnection;
        C0908c c0908c = this.f513i;
        synchronized (c0908c) {
            C0685p c0685p = (C0685p) c0908c.f5575c;
            synchronized (c0685p.f4311q) {
                try {
                    c0685p.f4299e = z6;
                    if (Build.VERSION.SDK_INT >= 26 && z6 && (httpURLConnection = c0685p.f4300f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z6) {
                c0908c.m2560c();
            }
        }
    }
}
