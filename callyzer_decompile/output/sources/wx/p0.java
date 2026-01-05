package wx;

import ex.InterfaceC2141e;
import java.util.ArrayList;
import kn.C4121a;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import xm.s2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f39300a;

    /* renamed from: b */
    public int f39301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(i10, interfaceC7559c);
        this.f39300a = i11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f39300a) {
            case 0:
                p0 p0Var = new p0(2, 0, interfaceC7559c);
                p0Var.f39301b = ((Number) obj).intValue();
                return p0Var;
            case 1:
                return new p0(this.f39301b, interfaceC7559c);
            default:
                return new p0(2, 2, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39300a) {
            case 0:
                break;
        }
        return ((p0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39300a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return Boolean.valueOf(this.f39301b > 0);
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ArrayList arrayList = s2.f40810n;
                int i10 = this.f39301b;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            if (((C4121a) obj2).f21054a.f23832a == i10) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f39301b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = s2.f40814r;
                    this.f39301b = 1;
                    if (c7806h.mo14775g(a0Var, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f39300a = 1;
        this.f39301b = i10;
    }
}
