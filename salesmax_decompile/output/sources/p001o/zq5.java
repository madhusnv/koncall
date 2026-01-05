package p001o;

import androidx.camera.core.impl.C1896a;

/* loaded from: classes2.dex */
public abstract class zq5 {

    /* renamed from: a */
    public static volatile l5e f57503a;

    static {
        k5e.m35009b().m35011c(gb2.m28293a(), new hu3() { // from class: o.wq5
            @Override // p001o.hu3
            public final void accept(Object obj) {
                zq5.m59714d((C1896a) obj);
            }
        });
    }

    /* renamed from: b */
    public static j5e m59712b(Class cls) {
        return f57503a.m36594b(cls);
    }

    /* renamed from: c */
    public static l5e m59713c() {
        return f57503a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m59714d(C1896a c1896a) {
        f57503a = new l5e(cr5.m21609a(c1896a));
        wja.m54627a("DeviceQuirks", "camera2 DeviceQuirks = " + l5e.m36592d(f57503a));
    }
}
