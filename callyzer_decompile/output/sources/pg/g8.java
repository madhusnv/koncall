package pg;

import androidx.compose.ui.layout.AbstractC0264a;
import hq.C3008m;
import pc.C5884l;
import tx.C7263w;
import tx.InterfaceC7258r;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g8 {
    /* renamed from: a */
    public static final Object m11659a(C5884l c5884l, AbstractC8193c abstractC8193c) {
        InterfaceC7564h interfaceC7564hO0 = c5884l.f28694e.o0(C7263w.f34689b);
        InterfaceC7564h interfaceC7564h = interfaceC7564hO0 instanceof InterfaceC7258r ? (InterfaceC7258r) interfaceC7564hO0 : null;
        if (interfaceC7564h != null) {
            ((tx.f1) interfaceC7564h).i0();
            tx.k1 k1Var = (tx.k1) interfaceC7564h;
            if (!k1Var.m13556O()) {
                InterfaceC7564h interfaceC7564h2 = c5884l.f28694e;
                String strM8913b = kotlin.jvm.internal.a0.m8901a(C5884l.class).m8913b();
                if (strM8913b == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
                }
                og.u1.m10949h(interfaceC7564h2, strM8913b).mo330g(null, new C3008m(20));
                c5884l.m11502a();
            }
            Object objMo13508U = k1Var.mo13508U(abstractC8193c);
            if (objMo13508U == EnumC7794a.COROUTINE_SUSPENDED) {
                return objMo13508U;
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: b */
    public static final String m11660b(t3.i0 i0Var) {
        String string;
        Object objM720a = AbstractC0264a.m720a(i0Var);
        if (objM720a == null) {
            objM720a = f8.m11620a(i0Var);
        }
        return (objM720a == null || (string = objM720a.toString()) == null) ? "null" : string;
    }
}
