package s1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h1.C2780k;
import h1.a1;
import k4.C4001v;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f32080a;

    /* renamed from: b */
    public int f32081b;

    /* renamed from: c */
    public final /* synthetic */ C4001v f32082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(C4001v c4001v, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f32080a = i10;
        this.f32082c = c4001v;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f32080a) {
            case 0:
                return new j0(this.f32082c, interfaceC7559c, 0);
            default:
                return new j0(this.f32082c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f32080a) {
        }
        return ((j0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32080a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f32081b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2780k c2780k = (C2780k) this.f32082c.f20704b;
                    Float f6 = new Float(DefinitionKt.NO_Float_VALUE);
                    a1 a1VarM6794q = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, 400.0f, new Float(0.5f), 1);
                    this.f32081b = 1;
                    if (AbstractC2773d.m6786i(c2780k, f6, a1VarM6794q, true, null, this, 8) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f32081b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2780k c2780k2 = (C2780k) this.f32082c.f20704b;
                    Float f10 = new Float(DefinitionKt.NO_Float_VALUE);
                    a1 a1VarM6794q2 = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, 400.0f, new Float(0.5f), 1);
                    this.f32081b = 1;
                    if (AbstractC2773d.m6786i(c2780k2, f10, a1VarM6794q2, true, null, this, 8) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
