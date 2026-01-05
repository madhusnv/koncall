package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: c */
    public static final b1 f7019c = new b1();

    /* renamed from: b */
    public final ConcurrentHashMap f7021b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C1387n f7020a = new C1387n();

    /* renamed from: a */
    public final f1 m4170a(Class cls) {
        f1 f1VarM4427y;
        Class cls2;
        g0.m4228a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f7021b;
        f1 f1Var = (f1) concurrentHashMap.get(cls);
        if (f1Var != null) {
            return f1Var;
        }
        C1387n c1387n = this.f7020a;
        c1387n.getClass();
        Class cls3 = g1.f7039a;
        if (!a0.class.isAssignableFrom(cls) && (cls2 = g1.f7039a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        d1 d1VarMo4353a = ((o0) c1387n.f7081a).mo4353a(cls);
        int i10 = d1VarMo4353a.f7033d;
        AbstractC1374a abstractC1374a = d1VarMo4353a.f7030a;
        if ((i10 & 2) == 2) {
            if (a0.class.isAssignableFrom(cls)) {
                f1VarM4427y = new v0(g1.f7042d, AbstractC1392s.f7100a, abstractC1374a);
            } else {
                h1 h1Var = g1.f7040b;
                C1391r c1391r = AbstractC1392s.f7101b;
                if (c1391r == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                f1VarM4427y = new v0(h1Var, c1391r, abstractC1374a);
            }
        } else if (a0.class.isAssignableFrom(cls)) {
            f1VarM4427y = ((d1VarMo4353a.f7033d & 1) == 1 ? a1.PROTO2 : a1.PROTO3) == a1.PROTO2 ? u0.m4427y(d1VarMo4353a, x0.f7131b, m0.f7078b, g1.f7042d, AbstractC1392s.f7100a, r0.f7091b) : u0.m4427y(d1VarMo4353a, x0.f7131b, m0.f7078b, g1.f7042d, null, r0.f7091b);
        } else {
            if (((d1VarMo4353a.f7033d & 1) == 1 ? a1.PROTO2 : a1.PROTO3) == a1.PROTO2) {
                w0 w0Var = x0.f7130a;
                k0 k0Var = m0.f7077a;
                h1 h1Var2 = g1.f7040b;
                C1391r c1391r2 = AbstractC1392s.f7101b;
                if (c1391r2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                f1VarM4427y = u0.m4427y(d1VarMo4353a, w0Var, k0Var, h1Var2, c1391r2, r0.f7090a);
            } else {
                f1VarM4427y = u0.m4427y(d1VarMo4353a, x0.f7130a, m0.f7077a, g1.f7041c, null, r0.f7090a);
            }
        }
        f1 f1Var2 = (f1) concurrentHashMap.putIfAbsent(cls, f1VarM4427y);
        return f1Var2 != null ? f1Var2 : f1VarM4427y;
    }
}
