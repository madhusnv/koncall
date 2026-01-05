package er;

import ap.C0388a;
import ex.InterfaceC2141e;
import fr.C2369a;
import gr.AbstractC2710f;
import gr.C2713i;
import im.EnumC3310l;
import kotlin.NoWhenBranchMatchedException;
import og.od;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.u */
/* loaded from: classes3.dex */
public final class C2121u extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9917a;

    /* renamed from: b */
    public int f9918b;

    /* renamed from: c */
    public /* synthetic */ Object f9919c;

    /* renamed from: d */
    public final /* synthetic */ C2713i f9920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2121u(C2713i c2713i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9917a = i10;
        this.f9920d = c2713i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9917a) {
            case 0:
                C2121u c2121u = new C2121u(this.f9920d, interfaceC7559c, 0);
                c2121u.f9919c = obj;
                return c2121u;
            default:
                C2121u c2121u2 = new C2121u(this.f9920d, interfaceC7559c, 1);
                c2121u2.f9919c = obj;
                return c2121u2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9917a) {
            case 0:
                return ((C2121u) create((Integer) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C2121u) create((EnumC3310l) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f9917a) {
            case 0:
                Integer num = (Integer) this.f9919c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9918b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    if (num != null) {
                        C0388a c0388a = new C0388a(this.f9920d, num, null, 13);
                        this.f9919c = null;
                        this.f9918b = 1;
                        if (c0.m13488k(c0388a, this) == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC3310l enumC3310l = (EnumC3310l) this.f9919c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f9918b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    int i12 = AbstractC2710f.f15118a[enumC3310l.ordinal()];
                    C2713i c2713i = this.f9920d;
                    if (i12 == 1 || i12 == 2) {
                        this.f9919c = null;
                        this.f9918b = 1;
                        if (C2713i.m6712e(c2713i, enumC3310l, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m1 m1Var = c2713i.f15135j;
                        do {
                            value = m1Var.getValue();
                        } while (!m1Var.m15397i(value, C2369a.m6056a((C2369a) value, null, null, false, false, false, 0, 223)));
                        c2713i.f15133h.m16469e();
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
