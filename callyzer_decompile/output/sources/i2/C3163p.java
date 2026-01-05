package i2;

import c9.C0917l;
import h1.C2772c;
import qw.a0;
import t2.AbstractC7013l;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.p */
/* loaded from: classes.dex */
public final class C3163p implements InterfaceC3161n {

    /* renamed from: b */
    public static final C0917l f17077b;

    /* renamed from: a */
    public final C2772c f17078a;

    static {
        C3151d c3151d = C3151d.f17034c;
        C0917l c0917l = AbstractC7013l.f33949a;
        f17077b = new C0917l(16, C3162o.f17076a, c3151d);
    }

    public C3163p(C2772c c2772c) {
        this.f17078a = c2772c;
    }

    /* renamed from: a */
    public final Object m7530a(float f6, AbstractC8199i abstractC8199i) {
        Object objM6776e = this.f17078a.m6776e(new Float(f6), abstractC8199i);
        return objM6776e == EnumC7794a.COROUTINE_SUSPENDED ? objM6776e : a0.f30746a;
    }
}
