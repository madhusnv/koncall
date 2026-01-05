package ke;

import android.os.SystemClock;
import he.C2910a;
import he.C2916g;
import pg.AbstractC5935p;
import zd.C8943g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ke.k */
/* loaded from: classes.dex */
public final class C4070k implements InterfaceC4068i {

    /* renamed from: a */
    public static final C4070k f20933a = new C4070k();

    /* renamed from: b */
    public static C8943g f20934b;

    @Override // ke.InterfaceC4068i
    /* renamed from: a */
    public boolean mo5735a(C2916g c2916g) {
        AbstractC5935p abstractC5935p = c2916g.f15948a;
        if ((abstractC5935p instanceof C2910a ? ((C2910a) abstractC5935p).f15944b : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        AbstractC5935p abstractC5935p2 = c2916g.f15949b;
        return (abstractC5935p2 instanceof C2910a ? ((C2910a) abstractC5935p2).f15944b : Integer.MAX_VALUE) > 100;
    }

    @Override // ke.InterfaceC4068i
    /* renamed from: b */
    public boolean mo5736b() {
        boolean z6;
        synchronized (C4067h.f20923a) {
            try {
                int i10 = C4067h.f20925c;
                C4067h.f20925c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > C4067h.f20926d + 30000) {
                    C4067h.f20925c = 0;
                    C4067h.f20926d = SystemClock.uptimeMillis();
                    String[] list = C4067h.f20924b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C4067h.f20927e = list.length < 800;
                }
                z6 = C4067h.f20927e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }
}
