package qu;

import ay.C0496f;
import ay.ExecutorC0495e;
import ex.InterfaceC2139c;
import io.C3328c;
import nu.C5141b;
import nu.C5143d;
import nu.C5144e;
import nu.C5146g;
import og.od;
import qw.a0;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qu.d */
/* loaded from: classes3.dex */
public final class C6323d extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f30659a;

    /* renamed from: b */
    public int f30660b;

    /* renamed from: c */
    public final /* synthetic */ C6324e f30661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6323d(C6324e c6324e, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f30659a = i10;
        this.f30661c = c6324e;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f30659a) {
            case 0:
                return new C6323d(this.f30661c, interfaceC7559c, 0);
            case 1:
                return new C6323d(this.f30661c, interfaceC7559c, 1);
            case 2:
                return new C6323d(this.f30661c, interfaceC7559c, 2);
            case 3:
                return new C6323d(this.f30661c, interfaceC7559c, 3);
            case 4:
                return new C6323d(this.f30661c, interfaceC7559c, 4);
            case 5:
                return new C6323d(this.f30661c, interfaceC7559c, 5);
            case 6:
                return new C6323d(this.f30661c, interfaceC7559c, 6);
            default:
                return new C6323d(this.f30661c, interfaceC7559c, 7);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f30659a) {
        }
        return ((C6323d) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f30659a;
        int i11 = 0;
        InterfaceC7559c interfaceC7559c = null;
        C6324e c6324e = this.f30661c;
        int i12 = 1;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f30660b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c = c6324e.f30662b;
                this.f30660b = 1;
                c3328c.getClass();
                C0496f c0496f = m0.f34659a;
                Object objM13475K = c0.m13475K(ExecutorC0495e.f3538c, new C5141b(c3328c, interfaceC7559c, i12), this);
                return objM13475K == enumC7794a ? enumC7794a : objM13475K;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f30660b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c2 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c2.getClass();
                C0496f c0496f2 = m0.f34659a;
                Object objM13475K2 = c0.m13475K(ExecutorC0495e.f3538c, new C5141b(c3328c2, interfaceC7559c, i11), this);
                return objM13475K2 == enumC7794a2 ? enumC7794a2 : objM13475K2;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f30660b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c3 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c3.getClass();
                C0496f c0496f3 = m0.f34659a;
                Object objM13475K3 = c0.m13475K(ExecutorC0495e.f3538c, new C5144e(c3328c3, null, 1), this);
                return objM13475K3 == enumC7794a3 ? enumC7794a3 : objM13475K3;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f30660b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c4 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c4.getClass();
                C0496f c0496f4 = m0.f34659a;
                Object objM13475K4 = c0.m13475K(ExecutorC0495e.f3538c, new C5144e(c3328c4, null, 0), this);
                return objM13475K4 == enumC7794a4 ? enumC7794a4 : objM13475K4;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f30660b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c5 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c5.getClass();
                C0496f c0496f5 = m0.f34659a;
                Object objM13475K5 = c0.m13475K(ExecutorC0495e.f3538c, new C5144e(c3328c5, null, 2), this);
                return objM13475K5 == enumC7794a5 ? enumC7794a5 : objM13475K5;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f30660b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c6 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c6.getClass();
                C0496f c0496f6 = m0.f34659a;
                Object objM13475K6 = c0.m13475K(ExecutorC0495e.f3538c, new C5143d(c3328c6, interfaceC7559c, i11), this);
                return objM13475K6 == enumC7794a6 ? enumC7794a6 : objM13475K6;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f30660b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c7 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c7.getClass();
                C0496f c0496f7 = m0.f34659a;
                Object objM13475K7 = c0.m13475K(ExecutorC0495e.f3538c, new C5143d(c3328c7, interfaceC7559c, i12), this);
                return objM13475K7 == enumC7794a7 ? enumC7794a7 : objM13475K7;
            default:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f30660b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C3328c c3328c8 = c6324e.f30662b;
                this.f30660b = 1;
                c3328c8.getClass();
                C0496f c0496f8 = m0.f34659a;
                Object objM13475K8 = c0.m13475K(ExecutorC0495e.f3538c, new C5146g(c3328c8, null), this);
                return objM13475K8 == enumC7794a8 ? enumC7794a8 : objM13475K8;
        }
    }
}
