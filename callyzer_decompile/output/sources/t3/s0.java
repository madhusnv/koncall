package t3;

import ex.InterfaceC2139c;
import s4.C6756l;
import v3.InterfaceC7651w;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends AbstractC7878q implements InterfaceC7651w {

    /* renamed from: q */
    public InterfaceC2139c f34024q;

    /* renamed from: r */
    public long f34025r;

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return true;
    }

    @Override // v3.InterfaceC7651w
    /* renamed from: k */
    public final void mo5878k(long j6) {
        if (C6756l.m12948a(this.f34025r, j6)) {
            return;
        }
        this.f34024q.invoke(new C6756l(j6));
        this.f34025r = j6;
    }
}
