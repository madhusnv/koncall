package q1;

import i1.y0;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.x */
/* loaded from: classes.dex */
public final class C6096x extends AbstractC8193c {

    /* renamed from: a */
    public C6097y f29763a;

    /* renamed from: b */
    public y0 f29764b;

    /* renamed from: c */
    public AbstractC8199i f29765c;

    /* renamed from: d */
    public /* synthetic */ Object f29766d;

    /* renamed from: e */
    public final /* synthetic */ C6097y f29767e;

    /* renamed from: f */
    public int f29768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6096x(C6097y c6097y, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f29767e = c6097y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f29766d = obj;
        this.f29768f |= Integer.MIN_VALUE;
        return this.f29767e.mo7521b(null, null, this);
    }
}
