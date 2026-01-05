package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h1.AbstractC2773d;
import h1.C2772c;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.l */
/* loaded from: classes.dex */
public final class C2458l extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11971a;

    /* renamed from: b */
    public int f11972b;

    /* renamed from: c */
    public final /* synthetic */ C2460n f11973c;

    /* renamed from: d */
    public final /* synthetic */ float f11974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2458l(C2460n c2460n, float f6, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f11971a = i10;
        this.f11973c = c2460n;
        this.f11974d = f6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f11971a) {
            case 0:
                return new C2458l(this.f11973c, this.f11974d, interfaceC7559c, 0);
            default:
                return new C2458l(this.f11973c, this.f11974d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f11971a) {
        }
        return ((C2458l) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11971a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f11972b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return obj;
                }
                og.od.m10798c(obj);
                C2772c c2772c = this.f11973c.f12149d;
                Float f6 = new Float(this.f11974d);
                h1.a1 a1VarM6794q = AbstractC2773d.m6794q(1.0f, 700.0f, null, 4);
                this.f11972b = 1;
                Object objM6774c = C2772c.m6774c(c2772c, f6, a1VarM6794q, this, 12);
                return objM6774c == enumC7794a ? enumC7794a : objM6774c;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f11972b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return obj;
                }
                og.od.m10798c(obj);
                C2772c c2772c2 = this.f11973c.f12149d;
                Float f10 = new Float(this.f11974d);
                h1.a1 a1VarM6794q2 = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
                this.f11972b = 1;
                Object objM6774c2 = C2772c.m6774c(c2772c2, f10, a1VarM6794q2, this, 12);
                return objM6774c2 == enumC7794a2 ? enumC7794a2 : objM6774c2;
        }
    }
}
