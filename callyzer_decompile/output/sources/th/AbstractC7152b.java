package th;

import c3.C0848c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.d0;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import pg.n6;
import tx.C7260t;
import tx.c0;
import vw.EnumC7794a;
import ww.AbstractC8191a;
import yx.C8822p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.b */
/* loaded from: classes.dex */
public abstract class AbstractC7152b {

    /* renamed from: a */
    public static C7155e f34390a;

    /* renamed from: a */
    public static final boolean m13415a(C0848c c0848c, float f6, float f10) {
        float f11 = c0848c.f5354a;
        if (f6 > c0848c.f5356c || f11 > f6) {
            return false;
        }
        return f10 <= c0848c.f5357d && c0848c.f5355b <= f10;
    }

    /* renamed from: b */
    public static final Object m13416b(C8822p c8822p, boolean z6, C8822p c8822p2, InterfaceC2141e interfaceC2141e) {
        Object c7260t;
        Object objM13559T;
        try {
            if (interfaceC2141e instanceof AbstractC8191a) {
                d0.m8907d(2, interfaceC2141e);
                c7260t = interfaceC2141e.invoke(c8822p2, c8822p);
            } else {
                c7260t = n6.m11798d(interfaceC2141e, c8822p2, c8822p);
            }
        } catch (DispatchException e2) {
            Throwable th2 = e2.f21165a;
            c8822p.m13558R(new C7260t(th2, false));
            throw th2;
        } catch (Throwable th3) {
            c7260t = new C7260t(th3, false);
        }
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (c7260t == enumC7794a || (objM13559T = c8822p.m13559T(c7260t)) == c0.f34609e) {
            return enumC7794a;
        }
        c8822p.k0();
        if (!(objM13559T instanceof C7260t)) {
            return c0.m13473I(objM13559T);
        }
        if (!z6) {
            Throwable th4 = ((C7260t) objM13559T).f34677a;
            if ((th4 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th4).f21167a == c8822p) {
                if (c7260t instanceof C7260t) {
                    throw ((C7260t) c7260t).f34677a;
                }
                return c7260t;
            }
        }
        throw ((C7260t) objM13559T).f34677a;
    }
}
