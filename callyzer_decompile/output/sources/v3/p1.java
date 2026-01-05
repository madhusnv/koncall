package v3;

import android.view.View;
import c9.C0917l;
import ex.InterfaceC2141e;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import w3.C7904v;
import w3.j2;
import w3.u2;
import w3.v2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface p1 {
    /* renamed from: a */
    static o1 m14656a(p1 p1Var, InterfaceC2141e interfaceC2141e, e1 e1Var, boolean z6, int i10) {
        C4640e c4640e;
        Reference referencePoll;
        Object obj;
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        C7904v c7904v = (C7904v) p1Var;
        if (z6) {
            if (c7904v.isHardwareAccelerated() && c7904v.f44841e1) {
                try {
                    return new j2(c7904v, interfaceC2141e, e1Var);
                } catch (Throwable unused) {
                    c7904v.f44841e1 = false;
                }
            }
            if (c7904v.f38015O == null) {
                if (!u2.f37986v) {
                    w3.m0.m14997x(new View(c7904v.getContext()));
                }
                w3.o1 o1Var = u2.f37987w ? new w3.o1(c7904v.getContext()) : new v2(c7904v.getContext());
                c7904v.f38015O = o1Var;
                c7904v.addView(o1Var, -1);
            }
            w3.o1 o1Var2 = c7904v.f38015O;
            AbstractC4154l.m8920c(o1Var2);
            return new u2(c7904v, o1Var2, interfaceC2141e, e1Var);
        }
        C0917l c0917l = c7904v.f44864z1;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) c0917l.f5595c;
            c4640e = (C4640e) c0917l.f5594b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                c4640e.m9514l(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i11 = c4640e.f22886c;
            if (i11 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c4640e.m9515m(i11 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        o1 o1Var3 = (o1) obj;
        if (o1Var3 == null) {
            return new w3.q1(c7904v.getGraphicsContext().mo5121b(), c7904v.getGraphicsContext(), c7904v, interfaceC2141e, e1Var);
        }
        o1Var3.mo14647c(interfaceC2141e, e1Var);
        return o1Var3;
    }
}
