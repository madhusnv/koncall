package g2;

import androidx.compose.foundation.lazy.layout.C0248b;
import ex.InterfaceC2141e;
import q1.C6092t;
import r1.C6440y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b4 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11246a;

    /* renamed from: b */
    public int f11247b;

    /* renamed from: c */
    public final /* synthetic */ C6440y f11248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(C6440y c6440y, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f11246a = 2;
        this.f11248c = c6440y;
        this.f11247b = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f11246a) {
            case 0:
                return new b4(this.f11248c, interfaceC7559c, 0);
            case 1:
                return new b4(this.f11248c, interfaceC7559c, 1);
            default:
                return new b4(this.f11248c, this.f11247b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11246a) {
            case 0:
                return ((b4) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((b4) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                b4 b4Var = (b4) create((k1.d1) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                b4Var.invokeSuspend(a0Var);
                return a0Var;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f11246a;
        qw.a0 a0Var = qw.a0.f30746a;
        C6440y c6440y = this.f11248c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f11247b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                int iM8526f = c6440y.f31077d.f29752b.m8526f() + 3;
                this.f11247b = 1;
                return C6440y.m12432i(c6440y, iM8526f, this) == enumC7794a ? enumC7794a : a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f11247b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                int iM8526f2 = c6440y.f31077d.f29752b.m8526f() - 3;
                this.f11247b = 1;
                return C6440y.m12432i(c6440y, iM8526f2, this) == enumC7794a2 ? enumC7794a2 : a0Var;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                og.od.m10798c(obj);
                int i13 = this.f11247b;
                C6092t c6092t = c6440y.f31077d;
                if (c6092t.f29752b.m8526f() != i13 || c6092t.f29753c.m8526f() != 0) {
                    C0248b c0248b = c6440y.f31086m;
                    c0248b.m695d();
                    c0248b.f1989b = null;
                }
                c6092t.m12125a(i13, 0);
                c6092t.f29755e = null;
                v3.g0 g0Var = c6440y.f31083j;
                if (g0Var != null) {
                    g0Var.m14600l();
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(C6440y c6440y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f11246a = i10;
        this.f11248c = c6440y;
    }
}
