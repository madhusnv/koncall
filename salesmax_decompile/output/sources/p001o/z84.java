package p001o;

import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.lk8;
import p001o.z84;

/* loaded from: classes5.dex */
public final class z84 implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static final C18578a f56686b = new C18578a(null);

    /* renamed from: c */
    public static final String f56687c = z84.class.getCanonicalName();

    /* renamed from: d */
    public static z84 f56688d;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f56689a;

    /* renamed from: o.z84$a */
    public static final class C18578a {
        public C18578a() {
        }

        public /* synthetic */ C18578a(id5 id5Var) {
            this();
        }

        /* renamed from: e */
        public static final int m58932e(lk8 lk8Var, lk8 lk8Var2) {
            sq8.m48648g(lk8Var2, "o2");
            return lk8Var.m37378b(lk8Var2);
        }

        /* renamed from: f */
        public static final void m58933f(List list, C10776f c10776f) {
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
        }

        /* renamed from: c */
        public final synchronized void m58934c() {
            if (C10773c.m13023p()) {
                m58935d();
            }
            if (z84.f56688d != null) {
                String unused = z84.f56687c;
            } else {
                z84.f56688d = new z84(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(z84.f56688d);
            }
        }

        /* renamed from: d */
        public final void m58935d() {
            if (cri.a0()) {
                return;
            }
            File[] fileArrM50121p = tk8.m50121p();
            ArrayList arrayList = new ArrayList(fileArrM50121p.length);
            for (File file : fileArrM50121p) {
                arrayList.add(lk8.C15093a.m37387d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((lk8) obj).m37382f()) {
                    arrayList2.add(obj);
                }
            }
            final List listI0 = kh3.I0(arrayList2, new Comparator() { // from class: o.x84
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return z84.C18578a.m58932e((lk8) obj2, (lk8) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it = bce.m18616s(0, Math.min(listI0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listI0.get(((dl8) it).mo23412a()));
            }
            tk8.m50124s("crash_reports", jSONArray, new GraphRequest.InterfaceC10763b() { // from class: o.y84
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) {
                    z84.C18578a.m58933f(listI0, c10776f);
                }
            });
        }
    }

    public /* synthetic */ z84(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, id5 id5Var) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        sq8.m48649h(thread, "t");
        sq8.m48649h(th, "e");
        if (tk8.m50115j(th)) {
            wk6.m54665c(th);
            lk8.C15093a.m37385b(th, lk8.EnumC15095c.CrashReport).m37383g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f56689a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public z84(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f56689a = uncaughtExceptionHandler;
    }
}
