package d9;

import c9.C0915j;
import java.util.HashMap;
import java.util.Objects;
import k4.C4001v;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.v */
/* loaded from: classes.dex */
public final class C1677v {

    /* renamed from: a */
    public final C4001v f8210a;

    /* renamed from: b */
    public final HashMap f8211b = new HashMap();

    /* renamed from: c */
    public final HashMap f8212c = new HashMap();

    /* renamed from: d */
    public final Object f8213d = new Object();

    static {
        C7077w.m13372b("WorkTimer");
    }

    public C1677v(C4001v c4001v) {
        this.f8210a = c4001v;
    }

    /* renamed from: a */
    public final void m5382a(C0915j c0915j) {
        synchronized (this.f8213d) {
            try {
                if (((RunnableC1676u) this.f8211b.remove(c0915j)) != null) {
                    C7077w c7077wM13371a = C7077w.m13371a();
                    Objects.toString(c0915j);
                    c7077wM13371a.getClass();
                    this.f8212c.remove(c0915j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
