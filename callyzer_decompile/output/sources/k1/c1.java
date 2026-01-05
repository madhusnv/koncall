package k1;

import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1476g;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h1.InterfaceC2779j;
import kotlin.jvm.internal.C4165w;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f20038a;

    /* renamed from: b */
    public /* synthetic */ Object f20039b;

    /* renamed from: c */
    public final /* synthetic */ float f20040c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2779j f20041d;

    /* renamed from: e */
    public final /* synthetic */ C4165w f20042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(float f6, InterfaceC2779j interfaceC2779j, C4165w c4165w, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20040c = f6;
        this.f20041d = interfaceC2779j;
        this.f20042e = c4165w;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        c1 c1Var = new c1(this.f20040c, this.f20041d, this.f20042e, interfaceC7559c);
        c1Var.f20039b = obj;
        return c1Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((c1) create((d1) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f20038a;
        if (i10 == 0) {
            od.m10798c(obj);
            int i11 = 16;
            C1476g c1476g = new C1476g(i11, this.f20042e, (d1) this.f20039b);
            this.f20038a = 1;
            if (AbstractC2773d.m6782e(DefinitionKt.NO_Float_VALUE, this.f20040c, this.f20041d, c1476g, this, 4) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }
}
