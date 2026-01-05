package f8;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.c */
/* loaded from: classes.dex */
public final class C2208c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10146a = 1;

    /* renamed from: b */
    public int f10147b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC8894w f10148c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10149d;

    /* renamed from: e */
    public final /* synthetic */ boolean f10150e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f10151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2208c(InterfaceC7559c interfaceC7559c, AbstractC8894w abstractC8894w, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c) {
        super(2, interfaceC7559c);
        this.f10148c = abstractC8894w;
        this.f10149d = z6;
        this.f10150e = z10;
        this.f10151f = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10146a) {
            case 0:
                return new C2208c(this.f10148c, this.f10149d, this.f10150e, this.f10151f, interfaceC7559c);
            default:
                return new C2208c(interfaceC7559c, this.f10148c, this.f10149d, this.f10150e, this.f10151f);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10146a) {
        }
        return ((C2208c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10146a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f10147b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                AbstractC8894w abstractC8894w = this.f10148c;
                boolean z6 = !(abstractC8894w.m16393p() && abstractC8894w.m16394q()) && this.f10149d;
                boolean z10 = this.f10150e;
                AbstractC8894w abstractC8894w2 = this.f10148c;
                C2207b c2207b = new C2207b(z6, z10, abstractC8894w2, null, this.f10151f, 0);
                this.f10147b = 1;
                Object objM16400w = abstractC8894w2.m16400w(z10, c2207b, this);
                return objM16400w == enumC7794a ? enumC7794a : objM16400w;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f10147b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                boolean z11 = this.f10150e;
                boolean z12 = this.f10149d;
                AbstractC8894w abstractC8894w3 = this.f10148c;
                C2207b c2207b2 = new C2207b(z11, z12, abstractC8894w3, null, this.f10151f, 1);
                this.f10147b = 1;
                Object objM16400w2 = abstractC8894w3.m16400w(z12, c2207b2, this);
                return objM16400w2 == enumC7794a2 ? enumC7794a2 : objM16400w2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2208c(AbstractC8894w abstractC8894w, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f10148c = abstractC8894w;
        this.f10149d = z6;
        this.f10150e = z10;
        this.f10151f = interfaceC2139c;
    }
}
