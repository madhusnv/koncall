package gm;

import com.websoptimization.callyzerbiz.MainActivity;
import ex.InterfaceC2141e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wv.AbstractC8189c;
import wv.C8187a;
import wv.C8188b;
import wv.C8190d;
import ww.AbstractC8199i;
import yv.C8789d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f14229a;

    /* renamed from: b */
    public /* synthetic */ Object f14230b;

    /* renamed from: c */
    public final /* synthetic */ MainActivity f14231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(MainActivity mainActivity, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f14229a = i10;
        this.f14231c = mainActivity;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f14229a) {
            case 0:
                b0 b0Var = new b0(this.f14231c, interfaceC7559c, 0);
                b0Var.f14230b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0(this.f14231c, interfaceC7559c, 1);
                b0Var2.f14230b = obj;
                return b0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14229a) {
            case 0:
                b0 b0Var = (b0) create((C8190d) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                b0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                b0 b0Var2 = (b0) create((AbstractC8189c) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                b0Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14229a;
        qw.a0 a0Var = qw.a0.f30746a;
        MainActivity mainActivity = this.f14231c;
        switch (i10) {
            case 0:
                C8190d c8190d = (C8190d) this.f14230b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!AbstractC4154l.m8918a(c8190d, C8190d.f39158a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C8789d.f42453a.m16167m(mainActivity, null, false, false);
                return a0Var;
            default:
                AbstractC8189c abstractC8189c = (AbstractC8189c) this.f14230b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC8189c instanceof C8188b) {
                    MainActivity.m4583f(mainActivity, ((C8188b) abstractC8189c).f39157a, 1);
                } else {
                    if (!(abstractC8189c instanceof C8187a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MainActivity.m4583f(mainActivity, ((C8187a) abstractC8189c).f39156a, 0);
                }
                return a0Var;
        }
    }
}
