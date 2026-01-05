package vx;

import ex.InterfaceC2142f;
import l7.C4417q;
import tx.InterfaceC7250j;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.j */
/* loaded from: classes3.dex */
public abstract class AbstractC7808j {

    /* renamed from: a */
    public static final C7814p f37497a = new C7814p(-1, null, null, 0);

    /* renamed from: b */
    public static final int f37498b = AbstractC8808b.m16254n(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c */
    public static final int f37499c = AbstractC8808b.m16254n(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d */
    public static final C4417q f37500d = new C4417q("BUFFERED", 3);

    /* renamed from: e */
    public static final C4417q f37501e = new C4417q("SHOULD_BUFFER", 3);

    /* renamed from: f */
    public static final C4417q f37502f = new C4417q("S_RESUMING_BY_RCV", 3);

    /* renamed from: g */
    public static final C4417q f37503g = new C4417q("RESUMING_BY_EB", 3);

    /* renamed from: h */
    public static final C4417q f37504h = new C4417q("POISONED", 3);

    /* renamed from: i */
    public static final C4417q f37505i = new C4417q("DONE_RCV", 3);

    /* renamed from: j */
    public static final C4417q f37506j = new C4417q("INTERRUPTED_SEND", 3);

    /* renamed from: k */
    public static final C4417q f37507k = new C4417q("INTERRUPTED_RCV", 3);

    /* renamed from: l */
    public static final C4417q f37508l = new C4417q("CHANNEL_CLOSED", 3);

    /* renamed from: m */
    public static final C4417q f37509m = new C4417q("SUSPEND", 3);

    /* renamed from: n */
    public static final C4417q f37510n = new C4417q("SUSPEND_NO_WAITER", 3);

    /* renamed from: o */
    public static final C4417q f37511o = new C4417q("FAILED", 3);

    /* renamed from: p */
    public static final C4417q f37512p = new C4417q("NO_RECEIVE_RESULT", 3);

    /* renamed from: q */
    public static final C4417q f37513q = new C4417q("CLOSE_HANDLER_CLOSED", 3);

    /* renamed from: r */
    public static final C4417q f37514r = new C4417q("CLOSE_HANDLER_INVOKED", 3);

    /* renamed from: s */
    public static final C4417q f37515s = new C4417q("NO_CLOSE_CAUSE", 3);

    /* renamed from: a */
    public static final boolean m14793a(InterfaceC7250j interfaceC7250j, Object obj, InterfaceC2142f interfaceC2142f) {
        C4417q c4417qMo5486r = interfaceC7250j.mo5486r(obj, interfaceC2142f);
        if (c4417qMo5486r == null) {
            return false;
        }
        interfaceC7250j.mo5487s(c4417qMo5486r);
        return true;
    }
}
