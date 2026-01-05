package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: c */
    public static final f6 f6193c = new f6();

    /* renamed from: b */
    public final ConcurrentHashMap f6195b = new ConcurrentHashMap();

    /* renamed from: a */
    public final v5 f6194a = new v5(0);

    /* renamed from: a */
    public final i6 m3269a(Class cls) {
        i6 i6VarM3158t;
        Charset charset = p5.f6342a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f6195b;
        i6 i6Var = (i6) concurrentHashMap.get(cls);
        if (i6Var != null) {
            return i6Var;
        }
        v5 v5Var = this.f6194a;
        v5Var.getClass();
        g5 g5Var = j6.f6258a;
        i5.class.isAssignableFrom(cls);
        h6 h6VarMo3296b = ((v5) v5Var.f6423a).mo3296b(cls);
        if ((h6VarMo3296b.f6235d & 2) == 2) {
            g5 g5Var2 = j6.f6258a;
            g5 g5Var3 = c5.f6097a;
            i6VarM3158t = new c6(g5Var2, h6VarMo3296b.f6232a);
        } else {
            int i10 = d6.f6115a;
            int i11 = s5.f6372a;
            g5 g5Var4 = j6.f6258a;
            g5 g5Var5 = h6VarMo3296b.m3309a() + (-1) != 1 ? c5.f6097a : null;
            int i12 = y5.f6457a;
            i6VarM3158t = b6.m3158t(h6VarMo3296b, g5Var4, g5Var5);
        }
        i6 i6Var2 = (i6) concurrentHashMap.putIfAbsent(cls, i6VarM3158t);
        return i6Var2 != null ? i6Var2 : i6VarM3158t;
    }
}
