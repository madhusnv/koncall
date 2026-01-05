package t8;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import u8.C7365m;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g0 {
    /* renamed from: a */
    public abstract C7077w mo13353a(String str);

    /* renamed from: b */
    public final void m13354b(C7079y request) {
        AbstractC4154l.m8923f(request, "request");
        List listM10833h = pe.m10833h(request);
        C7368p c7368p = (C7368p) this;
        if (listM10833h.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new C7365m(c7368p, null, EnumC7068n.KEEP, listM10833h, null).m13782c();
    }

    /* renamed from: c */
    public final void m13355c(String uniqueWorkName, EnumC7068n existingWorkPolicy, C7079y request) {
        AbstractC4154l.m8923f(uniqueWorkName, "uniqueWorkName");
        AbstractC4154l.m8923f(existingWorkPolicy, "existingWorkPolicy");
        AbstractC4154l.m8923f(request, "request");
        new C7365m((C7368p) this, uniqueWorkName, existingWorkPolicy, pe.m10833h(request), null).m13782c();
    }

    /* renamed from: d */
    public abstract d7.f0 mo13356d(String str);

    /* renamed from: e */
    public abstract d7.f0 mo13357e(String str);
}
