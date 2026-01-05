package gs;

import ap.C0388a;
import ex.InterfaceC2141e;
import fo.C2348l;
import fs.C2371b;
import java.util.List;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.v0;
import xm.r3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.k */
/* loaded from: classes3.dex */
public final class C2725k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15201a;

    /* renamed from: b */
    public int f15202b;

    /* renamed from: c */
    public final /* synthetic */ C2728n f15203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2725k(C2728n c2728n, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15201a = i10;
        this.f15203c = c2728n;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15201a) {
            case 0:
                return new C2725k(this.f15203c, interfaceC7559c, 0);
            default:
                return new C2725k(this.f15203c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f15201a) {
        }
        return ((C2725k) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM15694j;
        Object value;
        switch (this.f15201a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f15202b;
                C2728n c2728n = this.f15203c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2348l c2348l = c2728n.f15214c;
                    this.f15202b = 1;
                    objM15694j = c2348l.f10661a.m15694j(this);
                    if (objM15694j == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15694j = obj;
                }
                boolean z6 = ((List) objM15694j).size() >= 2;
                m1 m1Var = c2728n.f15224m;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2371b.m6058a((C2371b) value, false, null, null, null, null, null, false, z6, null, null, 3583)));
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f15202b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2728n c2728n2 = this.f15203c;
                    c2728n2.f15218g.getClass();
                    v0 v0Var = r3.f40780k;
                    C0388a c0388a = new C0388a(c2728n2, null, 16);
                    this.f15202b = 1;
                    if (c1.m15379j(v0Var, c0388a, this) == enumC7794a2) {
                        return enumC7794a2;
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
