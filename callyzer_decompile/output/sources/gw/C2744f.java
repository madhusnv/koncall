package gw;

import gm.AbstractApplicationC2654w;
import gm.C2651t;
import h6.C2856l;
import iw.InterfaceC3359b;
import ng.C5070u;
import oj.C5392d;
import ph.C5950e;
import yk.C8687a;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gw.f */
/* loaded from: classes3.dex */
public final class C2744f implements InterfaceC3359b {

    /* renamed from: a */
    public volatile C2651t f15287a;

    /* renamed from: b */
    public final Object f15288b = new Object();

    /* renamed from: c */
    public final C8986c f15289c;

    public C2744f(C8986c c8986c) {
        this.f15289c = c8986c;
    }

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f15287a == null) {
            synchronized (this.f15288b) {
                try {
                    if (this.f15287a == null) {
                        this.f15287a = new C2651t(new C5070u(18), new C2856l((AbstractApplicationC2654w) this.f15289c.f43336b, false), new C5392d(18), new C5950e(18), new C8687a(18));
                    }
                } finally {
                }
            }
        }
        return this.f15287a;
    }
}
