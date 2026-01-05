package ni;

import android.os.Bundle;
import c9.C0917l;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.y0;
import java.util.concurrent.ConcurrentHashMap;
import k4.C4001v;
import ng.C5070u;
import oi.AbstractC5387a;
import sf.AbstractC6840z;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ni.c */
/* loaded from: classes.dex */
public final class C5074c implements InterfaceC5073b {

    /* renamed from: c */
    public static volatile C5074c f24883c;

    /* renamed from: a */
    public final C4001v f24884a;

    /* renamed from: b */
    public final ConcurrentHashMap f24885b;

    public C5074c(C4001v c4001v) {
        AbstractC6840z.m13036g(c4001v);
        this.f24884a = c4001v;
        this.f24885b = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public final void m10007a(String str, String str2, Bundle bundle) {
        if (AbstractC5387a.m11102a(str) && AbstractC5387a.m11103b(str2, bundle) && AbstractC5387a.m11105d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            l1 l1Var = (l1) this.f24884a.f20704b;
            l1Var.m3482c(new y0(l1Var, str, str2, bundle, 1));
        }
    }

    /* renamed from: b */
    public final C5070u m10008b(String str, C7105p c7105p) {
        if (AbstractC5387a.m11102a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f24885b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                C4001v c4001v = this.f24884a;
                Object c0917l = zEquals ? new C0917l(c4001v, c7105p) : "clx".equals(str) ? new C4001v(c4001v, c7105p) : null;
                if (c0917l != null) {
                    concurrentHashMap.put(str, c0917l);
                    return new C5070u(21);
                }
            }
        }
        return null;
    }
}
