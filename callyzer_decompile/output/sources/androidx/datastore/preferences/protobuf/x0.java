package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: c */
    public static final x0 f2424c = new x0();

    /* renamed from: b */
    public final ConcurrentHashMap f2426b = new ConcurrentHashMap();

    /* renamed from: a */
    public final i0 f2425a = new i0();

    /* renamed from: a */
    public final a1 m1073a(Class cls) {
        a1 a1VarM1039w;
        Class cls2;
        b0.m820a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2426b;
        a1 a1Var = (a1) concurrentHashMap.get(cls);
        if (a1Var != null) {
            return a1Var;
        }
        i0 i0Var = this.f2425a;
        i0Var.getClass();
        Class cls3 = b1.f2295a;
        if (!AbstractC0335z.class.isAssignableFrom(cls) && (cls2 = b1.f2295a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        z0 z0VarMo904a = ((h0) i0Var.f2353a).mo904a(cls);
        int i10 = z0VarMo904a.f2433d;
        AbstractC0306a abstractC0306a = z0VarMo904a.f2430a;
        if ((i10 & 2) == 2) {
            if (AbstractC0335z.class.isAssignableFrom(cls)) {
                a1VarM1039w = new r0(b1.f2297c, AbstractC0322q.f2390a, abstractC0306a);
            } else {
                g1 g1Var = b1.f2296b;
                C0321p c0321p = AbstractC0322q.f2391b;
                if (c0321p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                a1VarM1039w = new r0(g1Var, c0321p, abstractC0306a);
            }
        } else if (AbstractC0335z.class.isAssignableFrom(cls)) {
            C0321p c0321p2 = null;
            s0 s0Var = t0.f2419b;
            e0 e0Var = f0.f2322b;
            i1 i1Var = b1.f2297c;
            if (g0.f2329a[z0VarMo904a.m1085a().ordinal()] != 1) {
                c0321p2 = AbstractC0322q.f2390a;
            }
            C0321p c0321p3 = c0321p2;
            m0 m0Var = n0.f2378b;
            if (!(z0VarMo904a instanceof z0)) {
                int[] iArr = q0.f2392n;
                z0VarMo904a.getClass();
                throw new ClassCastException();
            }
            a1VarM1039w = q0.m1039w(z0VarMo904a, s0Var, e0Var, i1Var, c0321p3, m0Var);
        } else {
            C0321p c0321p4 = null;
            s0 s0Var2 = t0.f2418a;
            e0 e0Var2 = f0.f2321a;
            g1 g1Var2 = b1.f2296b;
            if (g0.f2329a[z0VarMo904a.m1085a().ordinal()] != 1 && (c0321p4 = AbstractC0322q.f2391b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0321p c0321p5 = c0321p4;
            m0 m0Var2 = n0.f2377a;
            if (!(z0VarMo904a instanceof z0)) {
                int[] iArr2 = q0.f2392n;
                z0VarMo904a.getClass();
                throw new ClassCastException();
            }
            a1VarM1039w = q0.m1039w(z0VarMo904a, s0Var2, e0Var2, g1Var2, c0321p5, m0Var2);
        }
        a1 a1Var2 = (a1) concurrentHashMap.putIfAbsent(cls, a1VarM1039w);
        return a1Var2 != null ? a1Var2 : a1VarM1039w;
    }
}
