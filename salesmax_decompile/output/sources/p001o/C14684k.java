package p001o;

import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.lk8;

/* renamed from: o.k */
/* loaded from: classes5.dex */
public final class C14684k {

    /* renamed from: a */
    public static final C14684k f31311a = new C14684k();

    /* renamed from: b */
    public static final AtomicBoolean f31312b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final synchronized void m34811c() {
        if (a94.m16694d(C14684k.class)) {
            return;
        }
        try {
            if (f31312b.getAndSet(true)) {
                return;
            }
            if (C10773c.m13023p()) {
                m34812d();
            }
            C13836h.m29716d();
        } catch (Throwable th) {
            a94.m16692b(th, C14684k.class);
        }
    }

    /* renamed from: d */
    public static final void m34812d() {
        if (a94.m16694d(C14684k.class)) {
            return;
        }
        try {
            if (cri.a0()) {
                return;
            }
            File[] fileArrM50117l = tk8.m50117l();
            ArrayList arrayList = new ArrayList(fileArrM50117l.length);
            for (File file : fileArrM50117l) {
                arrayList.add(lk8.C15093a.m37387d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((lk8) obj).m37382f()) {
                    arrayList2.add(obj);
                }
            }
            final List listI0 = kh3.I0(arrayList2, new Comparator() { // from class: o.i
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return C14684k.m34813e((lk8) obj2, (lk8) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it = bce.m18616s(0, Math.min(listI0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listI0.get(((dl8) it).mo23412a()));
            }
            tk8.m50124s("anr_reports", jSONArray, new GraphRequest.InterfaceC10763b() { // from class: o.j
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) {
                    C14684k.m34814f(listI0, c10776f);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, C14684k.class);
        }
    }

    /* renamed from: e */
    public static final int m34813e(lk8 lk8Var, lk8 lk8Var2) {
        if (a94.m16694d(C14684k.class)) {
            return 0;
        }
        try {
            sq8.m48648g(lk8Var2, "o2");
            return lk8Var.m37378b(lk8Var2);
        } catch (Throwable th) {
            a94.m16692b(th, C14684k.class);
            return 0;
        }
    }

    /* renamed from: f */
    public static final void m34814f(List list, C10776f c10776f) {
        if (a94.m16694d(C14684k.class)) {
            return;
        }
        try {
            sq8.m48649h(list, "$validReports");
            sq8.m48649h(c10776f, "response");
            try {
                if (c10776f.m13064b() == null) {
                    JSONObject jSONObjectM13066d = c10776f.m13066d();
                    boolean z = false;
                    if (jSONObjectM13066d != null && jSONObjectM13066d.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                        z = true;
                    }
                    if (z) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((lk8) it.next()).m37377a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, C14684k.class);
        }
    }
}
