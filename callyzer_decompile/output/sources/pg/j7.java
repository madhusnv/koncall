package pg;

import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import s1.C6725t;
import tx.C7251k;
import u8.RunnableC7362j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import x4.AbstractC8298h;
import x4.EnumC8303m;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j7 {
    /* renamed from: a */
    public static final Object m11711a(InterfaceFutureC8957d interfaceFutureC8957d, InterfaceC7559c interfaceC7559c) throws Throwable {
        try {
            if (interfaceFutureC8957d.isDone()) {
                return AbstractC8298h.m15500g(interfaceFutureC8957d);
            }
            C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
            interfaceFutureC8957d.mo9026a(new RunnableC7362j(interfaceFutureC8957d, c7251k, 1), EnumC8303m.INSTANCE);
            c7251k.m13542t(new C6725t(17, interfaceFutureC8957d));
            Object objM13539o = c7251k.m13539o();
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            return objM13539o;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            AbstractC4154l.m8927j(kotlinNullPointerException, AbstractC4154l.class.getName());
            throw kotlinNullPointerException;
        }
    }

    /* renamed from: b */
    public static int m11712b(int i10, int i11, boolean z6) {
        int i12 = z6 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (og.u1.m10947f(2, og.u1.m10950i("CameraOrientationUtil"))) {
            og.u1.m10942a("CameraOrientationUtil");
        }
        return i12;
    }

    /* renamed from: c */
    public static int m11713c(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unsupported surface rotation: "));
    }
}
