package p001o;

import com.facebook.C10773c;
import com.facebook.C10775e;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.lk8;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class wk6 {

    /* renamed from: a */
    public static final wk6 f52256a = new wk6();

    /* renamed from: b */
    public static boolean f52257b;

    /* renamed from: b */
    public static final void m54664b() throws JSONException {
        f52257b = true;
        if (C10773c.m13023p()) {
            f52256a.m54668e();
        }
    }

    /* renamed from: c */
    public static final void m54665c(Throwable th) {
        if (!f52257b || m54666d() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        sq8.m48648g(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            sq8.m48648g(className, "it.className");
            mt6.EnumC15426c enumC15426cM39647d = mt6.m39647d(className);
            if (enumC15426cM39647d != mt6.EnumC15426c.Unknown) {
                mt6.m39646c(enumC15426cM39647d);
                hashSet.add(enumC15426cM39647d.toString());
            }
        }
        if (C10773c.m13023p() && (!hashSet.isEmpty())) {
            lk8.C15093a.m37386c(new JSONArray((Collection) hashSet)).m37383g();
        }
    }

    /* renamed from: d */
    public static final boolean m54666d() {
        return false;
    }

    /* renamed from: f */
    public static final void m54667f(lk8 lk8Var, C10776f c10776f) {
        sq8.m48649h(lk8Var, "$instrumentData");
        sq8.m48649h(c10776f, "response");
        try {
            if (c10776f.m13064b() == null) {
                JSONObject jSONObjectM13066d = c10776f.m13066d();
                boolean z = false;
                if (jSONObjectM13066d != null && jSONObjectM13066d.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                    z = true;
                }
                if (z) {
                    lk8Var.m37377a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    public final void m54668e() throws JSONException {
        if (cri.a0()) {
            return;
        }
        File[] fileArrM50119n = tk8.m50119n();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrM50119n) {
            final lk8 lk8VarM37387d = lk8.C15093a.m37387d(file);
            if (lk8VarM37387d.m37382f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", lk8VarM37387d.toString());
                    GraphRequest.C10764c c10764c = GraphRequest.f11338n;
                    h8g h8gVar = h8g.f26398a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{C10773c.m13020m()}, 1));
                    sq8.m48648g(str, "format(format, *args)");
                    arrayList.add(c10764c.m12882A(null, str, jSONObject, new GraphRequest.InterfaceC10763b() { // from class: o.vk6
                        @Override // com.facebook.GraphRequest.InterfaceC10763b
                        /* renamed from: a */
                        public final void mo12873a(C10776f c10776f) {
                            wk6.m54667f(lk8VarM37387d, c10776f);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C10775e(arrayList).m13051m();
    }
}
