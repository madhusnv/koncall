package p001o;

import android.os.Bundle;
import android.view.View;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.mjb;
import p001o.txi;

/* loaded from: classes5.dex */
public final class txi implements View.OnClickListener {

    /* renamed from: e */
    public static final C17249a f48012e = new C17249a(null);

    /* renamed from: f */
    public static final Set f48013f = new HashSet();

    /* renamed from: a */
    public final View.OnClickListener f48014a;

    /* renamed from: b */
    public final WeakReference f48015b;

    /* renamed from: c */
    public final WeakReference f48016c;

    /* renamed from: d */
    public final String f48017d;

    /* renamed from: o.txi$a */
    public static final class C17249a {
        public C17249a() {
        }

        public /* synthetic */ C17249a(id5 id5Var) {
            this();
        }

        /* renamed from: g */
        public static final void m50765g(String str, String str2) throws JSONException {
            sq8.m48649h(str, "$queriedEvent");
            sq8.m48649h(str2, "$buttonText");
            txi.f48012e.m50767e(str, str2, new float[0]);
        }

        /* renamed from: d */
        public final void m50766d(View view, View view2, String str) {
            sq8.m48649h(view, "hostView");
            sq8.m48649h(view2, "rootView");
            sq8.m48649h(str, "activityName");
            int iHashCode = view.hashCode();
            if (txi.m50758b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            owi.m42742r(view, new txi(view, view2, str, null));
            txi.m50758b().add(Integer.valueOf(iHashCode));
        }

        /* renamed from: e */
        public final void m50767e(String str, String str2, float[] fArr) throws JSONException {
            if (bcg.m18621f(str)) {
                new ao8(C10773c.m13019l()).m17562e(str, str2);
            } else if (bcg.m18620e(str)) {
                m50769h(str, str2, fArr);
            }
        }

        /* renamed from: f */
        public final boolean m50768f(String str, final String str2) {
            final String strM33804d = jgd.m33804d(str);
            if (strM33804d == null) {
                return false;
            }
            if (sq8.m48644c(strM33804d, "other")) {
                return true;
            }
            cri.C0(new Runnable() { // from class: o.sxi
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    txi.C17249a.m50765g(strM33804d, str2);
                }
            });
            return true;
        }

        /* renamed from: h */
        public final void m50769h(String str, String str2, float[] fArr) throws JSONException {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.C10764c c10764c = GraphRequest.f11338n;
                h8g h8gVar = h8g.f26398a;
                String str3 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C10773c.m13020m()}, 1));
                sq8.m48648g(str3, "format(locale, format, *args)");
                GraphRequest graphRequestM12882A = c10764c.m12882A(null, str3, null, null);
                graphRequestM12882A.m12846G(bundle);
                graphRequestM12882A.m12851k();
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ txi(View view, View view2, String str, id5 id5Var) {
        this(view, view2, str);
    }

    /* renamed from: b */
    public static final /* synthetic */ Set m50758b() {
        if (a94.m16694d(txi.class)) {
            return null;
        }
        try {
            return f48013f;
        } catch (Throwable th) {
            a94.m16692b(th, txi.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m50759d(JSONObject jSONObject, String str, txi txiVar, String str2) {
        String[] strArrM39194q;
        if (a94.m16694d(txi.class)) {
            return;
        }
        try {
            sq8.m48649h(jSONObject, "$viewData");
            sq8.m48649h(str, "$buttonText");
            sq8.m48649h(txiVar, "this$0");
            sq8.m48649h(str2, "$pathID");
            try {
                String lowerCase = cri.m21674v(C10773c.m13019l()).toLowerCase();
                sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] fArrM32707a = it6.m32707a(jSONObject, lowerCase);
                String strM32708c = it6.m32708c(str, txiVar.f48017d, lowerCase);
                if (fArrM32707a == null || (strArrM39194q = mjb.m39194q(mjb.EnumC15341a.MTML_APP_EVENT_PREDICTION, new float[][]{fArrM32707a}, new String[]{strM32708c})) == null) {
                    return;
                }
                String str3 = strArrM39194q[0];
                jgd.m33802a(str2, str3);
                if (sq8.m48644c(str3, "other")) {
                    return;
                }
                f48012e.m50767e(str3, str, fArrM32707a);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, txi.class);
        }
    }

    /* renamed from: c */
    public final void m50760c(final String str, final String str2, final JSONObject jSONObject) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            cri.C0(new Runnable() { // from class: o.rxi
                @Override // java.lang.Runnable
                public final void run() {
                    txi.m50759d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: e */
    public final void m50761e() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            View view = (View) this.f48015b.get();
            View view2 = (View) this.f48016c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strM59167d = zbg.m59167d(view2);
                String strM33803b = jgd.m33803b(view2, strM59167d);
                if (strM33803b == null || f48012e.m50768f(strM33803b, strM59167d)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", zbg.m59166b(view, view2));
                jSONObject.put("screenname", this.f48017d);
                m50760c(strM33803b, strM59167d, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(view, "view");
            View.OnClickListener onClickListener = this.f48014a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            m50761e();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public txi(View view, View view2, String str) {
        this.f48014a = owi.m42736g(view);
        this.f48015b = new WeakReference(view2);
        this.f48016c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f48017d = e9g.m24593G(lowerCase, "activity", "", false, 4, null);
    }
}
