package x1;

import a3.C0046e;
import d3.C1559m;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import g2.jb;
import hz.AbstractC3063b;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.b */
/* loaded from: classes.dex */
public final class C8252b extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f39428a;

    /* renamed from: b */
    public final /* synthetic */ long f39429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8252b(int i10, long j6) {
        super(1);
        this.f39428a = i10;
        this.f39429b = j6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f39428a) {
            case 0:
                C0046e c0046e = (C0046e) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0046e.f201a.mo150e() >> 32)) / 2.0f;
                return c0046e.m156b(new jb(fIntBitsToFloat, AbstractC3063b.m7290f(c0046e, fIntBitsToFloat), new C1559m(5, this.f39429b), 4));
            default:
                C1583k c1583k = (C1583k) ((InterfaceC1596x) obj);
                c1583k.m5202q(b2.g0.f3747c, new b2.f0(j0.Cursor, this.f39429b, b2.e0.Middle, true));
                return qw.a0.f30746a;
        }
    }
}
