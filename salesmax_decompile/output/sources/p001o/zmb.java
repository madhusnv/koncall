package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes2.dex */
public final class zmb {

    /* renamed from: a */
    public final Object f57408a;

    /* renamed from: b */
    public final u64 f57409b;

    /* renamed from: c */
    public final dwf f57410c;

    /* renamed from: d */
    public final sc0 f57411d;

    /* renamed from: e */
    public List f57412e;

    /* renamed from: f */
    public final o4d f57413f;

    public zmb(xmb xmbVar, Object obj, u64 u64Var, dwf dwfVar, sc0 sc0Var, List list, o4d o4dVar) {
        sq8.m48649h(xmbVar, FirebaseAnalytics.Param.CONTENT);
        sq8.m48649h(u64Var, "composition");
        sq8.m48649h(dwfVar, "slotTable");
        sq8.m48649h(sc0Var, "anchor");
        sq8.m48649h(list, "invalidations");
        sq8.m48649h(o4dVar, "locals");
        this.f57408a = obj;
        this.f57409b = u64Var;
        this.f57410c = dwfVar;
        this.f57411d = sc0Var;
        this.f57412e = list;
        this.f57413f = o4dVar;
    }

    /* renamed from: a */
    public final sc0 m59616a() {
        return this.f57411d;
    }

    /* renamed from: b */
    public final u64 m59617b() {
        return this.f57409b;
    }

    /* renamed from: c */
    public final xmb m59618c() {
        return null;
    }

    /* renamed from: d */
    public final List m59619d() {
        return this.f57412e;
    }

    /* renamed from: e */
    public final o4d m59620e() {
        return this.f57413f;
    }

    /* renamed from: f */
    public final Object m59621f() {
        return this.f57408a;
    }

    /* renamed from: g */
    public final dwf m59622g() {
        return this.f57410c;
    }
}
