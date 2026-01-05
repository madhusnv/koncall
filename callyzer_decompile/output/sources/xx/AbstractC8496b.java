package xx;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import l7.C4417q;
import pg.n6;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.EnumC7799a;
import wx.InterfaceC8209j;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8496b {

    /* renamed from: a */
    public static final InterfaceC7559c[] f41394a = new InterfaceC7559c[0];

    /* renamed from: b */
    public static final C4417q f41395b;

    /* renamed from: c */
    public static final C4417q f41396c;

    /* renamed from: d */
    public static final C4417q f41397d;

    static {
        int i10 = 3;
        f41395b = new C4417q("NULL", i10);
        f41396c = new C4417q("UNINITIALIZED", i10);
        f41397d = new C4417q("DONE", i10);
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8209j m15788a(InterfaceC8510p interfaceC8510p, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC7564h = C7565i.f36440a;
        }
        if ((i11 & 2) != 0) {
            i10 = -3;
        }
        if ((i11 & 4) != 0) {
            enumC7799a = EnumC7799a.SUSPEND;
        }
        return interfaceC8510p.mo15353c(interfaceC7564h, i10, enumC7799a);
    }

    /* renamed from: b */
    public static final Object m15789b(InterfaceC7564h interfaceC7564h, Object obj, Object obj2, InterfaceC2141e interfaceC2141e, InterfaceC7559c frame) {
        Object objInvoke;
        Object objM16256p = AbstractC8808b.m16256p(interfaceC7564h, obj2);
        try {
            C8517w c8517w = new C8517w(frame, interfaceC7564h);
            if (interfaceC2141e == null) {
                objInvoke = n6.m11798d(interfaceC2141e, obj, c8517w);
            } else {
                d0.m8907d(2, interfaceC2141e);
                objInvoke = interfaceC2141e.invoke(obj, c8517w);
            }
            AbstractC8808b.m16249i(interfaceC7564h, objM16256p);
            if (objInvoke == EnumC7794a.COROUTINE_SUSPENDED) {
                AbstractC4154l.m8923f(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            AbstractC8808b.m16249i(interfaceC7564h, objM16256p);
            throw th2;
        }
    }
}
