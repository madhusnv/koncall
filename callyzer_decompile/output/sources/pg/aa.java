package pg;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import kz.C4295a;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class aa {
    /* renamed from: a */
    public static C8935l m11541a(String scheme) {
        AbstractC4154l.m8923f(scheme, "scheme");
        LinkedHashMap linkedHashMap = C8935l.f42910e;
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        C8935l c8935l = (C8935l) linkedHashMap.get(lowerCase);
        return c8935l == null ? new C8935l(scheme, -1) : c8935l;
    }

    /* renamed from: b */
    public static final iz.k0 m11542b(iz.k0 k0Var) {
        AbstractC4154l.m8923f(k0Var, "<this>");
        iz.j0 j0VarM7739h = k0Var.m7739h();
        iz.n0 n0Var = k0Var.f17923g;
        j0VarM7739h.f17905g = new C4295a(n0Var.mo7461j(), n0Var.mo7460h());
        return j0VarM7739h.m7732a();
    }
}
