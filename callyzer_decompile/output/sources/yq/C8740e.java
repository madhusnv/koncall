package yq;

import c9.C0908c;
import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yq.e */
/* loaded from: classes3.dex */
public final class C8740e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42329a;

    /* renamed from: b */
    public int f42330b;

    /* renamed from: c */
    public /* synthetic */ int f42331c;

    /* renamed from: d */
    public final /* synthetic */ C8741f f42332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8740e(C8741f c8741f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42329a = i10;
        this.f42332d = c8741f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42329a) {
            case 0:
                C8740e c8740e = new C8740e(this.f42332d, interfaceC7559c, 0);
                c8740e.f42331c = ((Number) obj).intValue();
                return c8740e;
            default:
                C8740e c8740e2 = new C8740e(this.f42332d, interfaceC7559c, 1);
                c8740e2.f42331c = ((Number) obj).intValue();
                return c8740e2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f42329a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C8740e) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM2572q;
        Object objM2572q2;
        switch (this.f42329a) {
            case 0:
                int i10 = this.f42331c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42330b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8741f c8741f = this.f42332d;
                    C0908c c0908c = c8741f.f42333b;
                    String str = (String) c8741f.f42344m.f39340a.getValue();
                    this.f42331c = i10;
                    this.f42330b = 1;
                    objM2572q = c0908c.m2572q(i10, str, this);
                    if (objM2572q == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM2572q = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM2572q);
            default:
                int i12 = this.f42331c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f42330b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C8741f c8741f2 = this.f42332d;
                    C0908c c0908c2 = c8741f2.f42333b;
                    String str2 = (String) c8741f2.f42344m.f39340a.getValue();
                    this.f42331c = i12;
                    this.f42330b = 1;
                    objM2572q2 = c0908c2.m2572q(i12, str2, this);
                    if (objM2572q2 == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM2572q2 = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM2572q2);
        }
    }
}
