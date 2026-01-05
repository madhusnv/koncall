package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class v74 {
    /* renamed from: a */
    public static final void m52396a(q74 q74Var, String str, Throwable th, uk7 uk7Var) {
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(str, "sourceComponent");
        sq8.m48649h(uk7Var, FirebaseAnalytics.Param.CONTENT);
        m52399d(q74Var, fja.Debug, str, th, uk7Var);
    }

    /* renamed from: b */
    public static final Map m52397b(q74 q74Var) {
        Map mapM21346K;
        sq8.m48649h(q74Var, "<this>");
        cka ckaVar = (cka) q74Var.get(cka.f18274c);
        return (ckaVar == null || (mapM21346K = ckaVar.m21346K()) == null) ? isa.m32681h() : mapM21346K;
    }

    /* renamed from: c */
    public static final void m52398c(q74 q74Var, String str, Throwable th, uk7 uk7Var) {
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(str, "sourceComponent");
        sq8.m48649h(uk7Var, FirebaseAnalytics.Param.CONTENT);
        m52399d(q74Var, fja.Info, str, th, uk7Var);
    }

    /* renamed from: d */
    public static final void m52399d(q74 q74Var, fja fjaVar, String str, Throwable th, uk7 uk7Var) {
        rzf rzfVarA2;
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        sq8.m48649h(str, "sourceComponent");
        sq8.m48649h(uk7Var, FirebaseAnalytics.Param.CONTENT);
        qja qjaVarMo33391a = xdh.m56098a(q74Var).mo40627c().mo33391a(str);
        if (qjaVarMo33391a.mo18188e(fjaVar)) {
            Map mapM52397b = m52397b(q74Var);
            dth dthVarM54033a = w74.m54033a(q74Var);
            rzf rzfVar = null;
            if (dthVarM54033a != null && (rzfVarA2 = dthVarM54033a.A2()) != null && rzfVarA2.mo47360a()) {
                rzfVar = rzfVarA2;
            }
            hja hjaVarMo18184a = qjaVarMo33391a.mo18184a(fjaVar);
            if (th != null) {
                hjaVarMo18184a.mo28154a(th);
            }
            hjaVarMo18184a.mo28157d(uk7Var);
            for (Map.Entry entry : mapM52397b.entrySet()) {
                hjaVarMo18184a.mo28156c((String) entry.getKey(), entry.getValue());
            }
            if (rzfVar != null) {
                hjaVarMo18184a.mo28156c("trace_id", rzfVar.mo47362c());
                hjaVarMo18184a.mo28156c("span_id", rzfVar.mo47361b());
            }
            hjaVarMo18184a.mo28155b();
        }
    }

    /* renamed from: e */
    public static final qja m52400e(q74 q74Var, String str) {
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(str, "sourceComponent");
        return new b64(q74Var, xdh.m56098a(q74Var).mo40627c().mo33391a(str), str);
    }

    /* renamed from: f */
    public static final void m52401f(q74 q74Var, String str, Throwable th, uk7 uk7Var) {
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(str, "sourceComponent");
        sq8.m48649h(uk7Var, FirebaseAnalytics.Param.CONTENT);
        m52399d(q74Var, fja.Trace, str, th, uk7Var);
    }

    /* renamed from: g */
    public static final void m52402g(q74 q74Var, String str, Throwable th, uk7 uk7Var) {
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(str, "sourceComponent");
        sq8.m48649h(uk7Var, FirebaseAnalytics.Param.CONTENT);
        m52399d(q74Var, fja.Warning, str, th, uk7Var);
    }
}
