package l2;

import b2.C0558p;
import java.util.List;
import k2.InterfaceC3954c;
import k2.y1;
import s2.C6735d;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.g */
/* loaded from: classes.dex */
public final class C4334g extends i0 {

    /* renamed from: c */
    public static final C4334g f21813c = new C4334g(0, 2, 1);

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        int i10 = ((C6735d) c0558p.m1659g(0)).f32177a;
        List list = (List) c0558p.m1659g(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            interfaceC3954c.mo2735c(i12, obj);
            interfaceC3954c.mo2741j(i12, obj);
        }
    }
}
