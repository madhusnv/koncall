package t1;

import a1.C0007f;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.concurrent.CancellationException;
import k1.x0;
import k2.a1;
import o3.InterfaceC5278a;
import pg.w9;
import s4.C6761q;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.a */
/* loaded from: classes.dex */
public final class C6976a implements InterfaceC5278a {

    /* renamed from: a */
    public final AbstractC7000y f33753a;

    /* renamed from: b */
    public final x0 f33754b;

    public C6976a(AbstractC7000y abstractC7000y, x0 x0Var) {
        this.f33753a = abstractC7000y;
        this.f33754b = x0Var;
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: B */
    public final long mo6161B(int i10, long j6) {
        if (i10 != 1) {
            return 0L;
        }
        AbstractC7000y abstractC7000y = this.f33753a;
        C0007f c0007f = abstractC7000y.f33901d;
        C0007f c0007f2 = abstractC7000y.f33901d;
        if (Math.abs(((a1) c0007f.f39d).m8490f()) <= 1.0E-6d) {
            return 0L;
        }
        float fM8490f = ((a1) c0007f2.f39d).m8490f() * abstractC7000y.m13265m();
        float f6 = ((abstractC7000y.m13264k().f33852b + abstractC7000y.m13264k().f33853c) * (-Math.signum(((a1) c0007f2.f39d).m8490f()))) + fM8490f;
        if (((a1) c0007f2.f39d).m8490f() > DefinitionKt.NO_Float_VALUE) {
            f6 = fM8490f;
            fM8490f = f6;
        }
        x0 x0Var = x0.Horizontal;
        x0 x0Var2 = this.f33754b;
        float fIntBitsToFloat = -abstractC7000y.f33908k.mo7524e(-w9.m11911b(Float.intBitsToFloat((int) (x0Var2 == x0Var ? j6 >> 32 : j6 & 4294967295L)), fM8490f, f6));
        float fIntBitsToFloat2 = x0Var2 == x0Var ? fIntBitsToFloat : Float.intBitsToFloat((int) (j6 >> 32));
        if (x0Var2 != x0.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
    }

    @Override // o3.InterfaceC5278a
    public final long d0(int i10, long j6, long j10) {
        if (i10 != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f33754b == x0.Horizontal ? j10 >> 32 : 4294967295L & j10)) == DefinitionKt.NO_Float_VALUE) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: s */
    public final Object mo6162s(long j6, long j10, InterfaceC7559c interfaceC7559c) {
        return new C6761q(this.f33754b == x0.Vertical ? C6761q.m12958a(j10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 2) : C6761q.m12958a(j10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1));
    }
}
