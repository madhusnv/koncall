package k1;

import ex.InterfaceC2141e;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.C4143a;
import s2.C6734c;
import s4.C6761q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 extends C4143a implements InterfaceC2141e {

    /* renamed from: h */
    public final /* synthetic */ int f20168h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f20168h = i12;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20168h) {
            case 0:
                long j6 = ((C6761q) obj).f32216a;
                p1 p1Var = (p1) this.f21147a;
                tx.c0.m13502y(p1Var.f20205E.m10430c(), null, null, new m1(p1Var, j6, null, 2), 3);
                break;
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((C6734c) this.f21147a).m12890d((InterfaceC3962k) obj, iIntValue);
                break;
        }
        return qw.a0.f30746a;
    }
}
