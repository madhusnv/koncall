package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: c */
    public static final y1 f6701c = new y1();

    /* renamed from: b */
    public final ConcurrentHashMap f6703b = new ConcurrentHashMap();

    /* renamed from: a */
    public final p1 f6702a = new p1(0);

    /* renamed from: a */
    public final e2 m4007a(Class cls) {
        e2 e2VarM3977v;
        Charset charset = l1.f6594a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f6703b;
        e2 e2Var = (e2) concurrentHashMap.get(cls);
        if (e2Var != null) {
            return e2Var;
        }
        p1 p1Var = this.f6702a;
        p1Var.getClass();
        z0 z0Var = f2.f6533a;
        e1.class.isAssignableFrom(cls);
        a2 a2VarMo3932a = ((p1) p1Var.f6630a).mo3932a(cls);
        if ((a2VarMo3932a.f6479d & 2) == 2) {
            z0 z0Var2 = f2.f6533a;
            z0 z0Var3 = v0.f6675a;
            e2VarM3977v = new w1(z0Var2, a2VarMo3932a.f6476a);
        } else {
            int i10 = x1.f6696a;
            int i11 = o1.f6624a;
            z0 z0Var4 = f2.f6533a;
            z0 z0Var5 = a2VarMo3932a.m3810a() + (-1) != 1 ? v0.f6675a : null;
            int i12 = r1.f6643a;
            e2VarM3977v = v1.m3977v(a2VarMo3932a, z0Var4, z0Var5);
        }
        e2 e2Var2 = (e2) concurrentHashMap.putIfAbsent(cls, e2VarM3977v);
        return e2Var2 == null ? e2VarM3977v : e2Var2;
    }
}
