package gr;

import c9.C0908c;
import ex.InterfaceC2141e;
import fr.C2369a;
import im.EnumC3310l;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gr.g */
/* loaded from: classes3.dex */
public final class C2711g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15119a;

    /* renamed from: b */
    public int f15120b;

    /* renamed from: c */
    public /* synthetic */ int f15121c;

    /* renamed from: d */
    public final /* synthetic */ C2713i f15122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2711g(C2713i c2713i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15119a = i10;
        this.f15122d = c2713i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15119a) {
            case 0:
                C2711g c2711g = new C2711g(this.f15122d, interfaceC7559c, 0);
                c2711g.f15121c = ((Number) obj).intValue();
                return c2711g;
            default:
                C2711g c2711g2 = new C2711g(this.f15122d, interfaceC7559c, 1);
                c2711g2.f15121c = ((Number) obj).intValue();
                return c2711g2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15119a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C2711g) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM2578w;
        Object objM2573r;
        switch (this.f15119a) {
            case 0:
                C2713i c2713i = this.f15122d;
                w0 w0Var = c2713i.f15138m;
                C0908c c0908c = c2713i.f15127b;
                int i10 = this.f15121c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f15120b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    if (((C2369a) c2713i.f15136k.f39340a.getValue()).f10772b == EnumC3310l.AtoZ) {
                        String str = (String) w0Var.f39340a.getValue();
                        this.f15121c = i10;
                        this.f15120b = 1;
                        objM2578w = c0908c.m2576u(i10, str, this);
                        if (objM2578w == enumC7794a) {
                            return enumC7794a;
                        }
                    } else {
                        String str2 = (String) w0Var.f39340a.getValue();
                        this.f15121c = i10;
                        this.f15120b = 2;
                        objM2578w = c0908c.m2578w(i10, str2, this);
                        if (objM2578w == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM2578w = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM2578w);
            default:
                C2713i c2713i2 = this.f15122d;
                w0 w0Var2 = c2713i2.f15138m;
                C0908c c0908c2 = c2713i2.f15127b;
                int i12 = this.f15121c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f15120b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    if (((C2369a) c2713i2.f15136k.f39340a.getValue()).f10772b == EnumC3310l.AtoZ) {
                        String str3 = (String) w0Var2.f39340a.getValue();
                        this.f15121c = i12;
                        this.f15120b = 1;
                        objM2573r = c0908c2.m2572q(i12, str3, this);
                        if (objM2573r == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        String str4 = (String) w0Var2.f39340a.getValue();
                        this.f15121c = i12;
                        this.f15120b = 2;
                        objM2573r = c0908c2.m2573r(i12, str4, this);
                        if (objM2573r == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM2573r = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM2573r);
        }
    }
}
