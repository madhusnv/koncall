package u8;

import ak.CallableC0163b;
import androidx.work.impl.WorkerStoppedException;
import ex.InterfaceC2141e;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qc.C6158d;
import t8.C7077w;
import tx.InterfaceC7266z;
import tx.c0;
import tx.f1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.x */
/* loaded from: classes.dex */
public final class C7376x extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f35059a;

    /* renamed from: b */
    public int f35060b;

    /* renamed from: c */
    public final /* synthetic */ C7378z f35061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7376x(C7378z c7378z, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f35059a = i10;
        this.f35061c = c7378z;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f35059a) {
            case 0:
                return new C7376x(this.f35061c, interfaceC7559c, 0);
            default:
                return new C7376x(this.f35061c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f35059a) {
        }
        return ((C7376x) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object c7372t;
        int i10 = this.f35059a;
        C7378z c7378z = this.f35061c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f35060b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f35060b = 1;
                Object objM13790a = C7378z.m13790a(c7378z, this);
                return objM13790a == enumC7794a ? enumC7794a : objM13790a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f35060b;
                try {
                    if (i12 == 0) {
                        od.m10798c(obj);
                        f1 f1Var = c7378z.f35079n;
                        C7376x c7376x = new C7376x(c7378z, null, 0);
                        this.f35060b = 1;
                        obj = c0.m13475K(f1Var, c7376x, this);
                        if (obj == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                    c7372t = (AbstractC7375w) obj;
                } catch (WorkerStoppedException e2) {
                    c7372t = new C7374v(e2.f2881a);
                } catch (CancellationException unused) {
                    c7372t = new C7372t();
                } catch (Throwable unused2) {
                    int i13 = a0.f34991a;
                    C7077w.m13371a().getClass();
                    c7372t = new C7372t();
                }
                Object objM16398u = c7378z.f35074i.m16398u(new C6158d(20, new CallableC0163b(2, c7372t, c7378z)));
                AbstractC4154l.m8922e(objM16398u, "workDatabase.runInTransa…          }\n            )");
                return objM16398u;
        }
    }
}
