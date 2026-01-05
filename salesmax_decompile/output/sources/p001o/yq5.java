package p001o;

import androidx.camera.core.impl.C1896a;

/* loaded from: classes2.dex */
public abstract class yq5 {

    /* renamed from: a */
    public static volatile l5e f55815a;

    static {
        k5e.m35009b().m35011c(gb2.m28293a(), new hu3() { // from class: o.vq5
            @Override // p001o.hu3
            public final void accept(Object obj) {
                yq5.m58113c((C1896a) obj);
            }
        });
    }

    /* renamed from: b */
    public static j5e m58112b(Class cls) {
        return f55815a.m36594b(cls);
    }

    /* renamed from: c */
    public static /* synthetic */ void m58113c(C1896a c1896a) {
        f55815a = new l5e(br5.m19625a(c1896a));
        wja.m54627a("DeviceQuirks", "view DeviceQuirks = " + l5e.m36592d(f55815a));
    }
}
