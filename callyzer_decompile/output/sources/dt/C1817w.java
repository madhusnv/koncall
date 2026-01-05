package dt;

import com.google.android.gms.internal.measurement.j4;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import p005f.C2164m;
import pg.y8;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.w */
/* loaded from: classes3.dex */
public final class C1817w extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8785a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f8786b;

    /* renamed from: c */
    public final /* synthetic */ Object f8787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817w(C2164m c2164m, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8787c = c2164m;
        this.f8786b = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8785a) {
            case 0:
                return new C1817w(this.f8786b, (C1818x) this.f8787c, interfaceC7559c);
            default:
                return new C1817w((C2164m) this.f8787c, this.f8786b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8785a) {
            case 0:
                C1817w c1817w = (C1817w) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c1817w.invokeSuspend(a0Var);
                return a0Var;
            default:
                C1817w c1817w2 = (C1817w) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c1817w2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [ex.a, kotlin.jvm.internal.j] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        j4 j4Var;
        int i10 = this.f8785a;
        a0 a0Var = a0.f30746a;
        boolean z6 = this.f8786b;
        Object obj2 = this.f8787c;
        switch (i10) {
            case 0:
                C1818x c1818x = (C1818x) obj2;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                String string = z6 ? c1818x.f8791e.getString(R.string.templated_deleted_success) : c1818x.f8791e.getString(R.string.something_went_wrong_Please_try_again);
                AbstractC4154l.m8920c(string);
                y8.m11952g(c1818x.f8789c, string);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2164m c2164m = (C2164m) obj2;
                if (!z6 && !c2164m.f10024g && c2164m.f8901a && (j4Var = c2164m.f10023f) != null) {
                    j4Var.m3394g();
                }
                c2164m.f8901a = z6;
                ?? r52 = c2164m.f8903c;
                if (r52 != 0) {
                    r52.invoke();
                    break;
                }
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817w(boolean z6, C1818x c1818x, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8786b = z6;
        this.f8787c = c1818x;
    }
}
