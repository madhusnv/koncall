package p001o;

import androidx.camera.core.impl.C1896a;

/* loaded from: classes2.dex */
public abstract class xq5 {

    /* renamed from: a */
    public static volatile l5e f54064a;

    static {
        k5e.m35009b().m35011c(gb2.m28293a(), new hu3() { // from class: o.uq5
            @Override // p001o.hu3
            public final void accept(Object obj) {
                xq5.m56607d((C1896a) obj);
            }
        });
    }

    /* renamed from: b */
    public static j5e m56605b(Class cls) {
        return f54064a.m36594b(cls);
    }

    /* renamed from: c */
    public static l5e m56606c() {
        return f54064a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m56607d(C1896a c1896a) {
        f54064a = new l5e(ar5.m17701a(c1896a));
        wja.m54627a("DeviceQuirks", "core DeviceQuirks = " + l5e.m36592d(f54064a));
    }
}
