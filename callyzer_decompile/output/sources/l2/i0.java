package l2;

import b2.C0558p;
import k2.InterfaceC3954c;
import k2.y1;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a */
    public final int f21818a;

    /* renamed from: b */
    public final int f21819b;

    public i0(int i10, int i11) {
        this.f21818a = i10;
        this.f21819b = i11;
    }

    /* renamed from: a */
    public abstract void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h);

    public final String toString() {
        String strM8914c = kotlin.jvm.internal.a0.m8901a(getClass()).m8914c();
        return strM8914c == null ? "" : strM8914c;
    }

    public /* synthetic */ i0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
