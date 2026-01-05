package xm;

import ex.InterfaceC2141e;
import java.util.Iterator;
import java.util.List;
import mm.C4803n;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40510a;

    /* renamed from: b */
    public x1 f40511b;

    /* renamed from: c */
    public Iterator f40512c;

    /* renamed from: d */
    public int f40513d;

    /* renamed from: e */
    public int f40514e;

    /* renamed from: f */
    public final /* synthetic */ List f40515f;

    /* renamed from: g */
    public final /* synthetic */ x1 f40516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(List list, x1 x1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40510a = i10;
        this.f40515f = list;
        this.f40516g = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40510a) {
            case 0:
                return new l0(this.f40515f, this.f40516g, interfaceC7559c, 0);
            default:
                return new l0(this.f40515f, this.f40516g, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40510a) {
        }
        return ((l0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10;
        x1 x1Var;
        Iterator it;
        int i11;
        x1 x1Var2;
        Iterator it2;
        switch (this.f40510a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40514e;
                if (i12 == 0) {
                    od.m10798c(obj);
                    Iterator it3 = this.f40515f.iterator();
                    i10 = 0;
                    x1Var = this.f40516g;
                    it = it3;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f40513d;
                    it = this.f40512c;
                    x1Var = this.f40511b;
                    od.m10798c(obj);
                }
                while (it.hasNext()) {
                    C4803n c4803n = (C4803n) it.next();
                    gn.x2 x2Var = x1Var.f40991a;
                    this.f40511b = x1Var;
                    this.f40512c = it;
                    this.f40513d = i10;
                    this.f40514e = 1;
                    if (x2Var.m6695o(c4803n, this) == enumC7794a) {
                        return enumC7794a;
                    }
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40514e;
                if (i13 == 0) {
                    od.m10798c(obj);
                    Iterator it4 = this.f40515f.iterator();
                    i11 = 0;
                    x1Var2 = this.f40516g;
                    it2 = it4;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f40513d;
                    it2 = this.f40512c;
                    x1Var2 = this.f40511b;
                    od.m10798c(obj);
                }
                while (it2.hasNext()) {
                    C4803n c4803n2 = (C4803n) it2.next();
                    gn.x2 x2Var2 = x1Var2.f40991a;
                    this.f40511b = x1Var2;
                    this.f40512c = it2;
                    this.f40513d = i11;
                    this.f40514e = 1;
                    if (x2Var2.t0(c4803n2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                }
                return qw.a0.f30746a;
        }
    }
}
