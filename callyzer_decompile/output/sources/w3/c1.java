package w3;

import a3.C0043b;
import a4.InterfaceC0051a;
import android.view.ViewGroup;
import c3.C0848c;
import w2.AbstractC7878q;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractC7878q implements InterfaceC0051a {

    /* renamed from: q */
    public ViewGroup f37757q;

    @Override // a4.InterfaceC0051a
    public final Object u0(v3.h1 h1Var, C0043b c0043b, AbstractC8193c abstractC8193c) {
        long jMo13299V = h1Var.mo13299V(0L);
        C0848c c0848c = (C0848c) c0043b.invoke();
        C0848c c0848cM2287i = c0848c != null ? c0848c.m2287i(jMo13299V) : null;
        if (c0848cM2287i != null) {
            this.f37757q.requestRectangleOnScreen(d3.h0.m5146r(c0848cM2287i), false);
        }
        return qw.a0.f30746a;
    }
}
