package g2;

import android.content.Context;
import android.os.Build;
import cp.C1475f;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import h1.C2772c;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import tx.InterfaceC7266z;
import w3.AbstractC7883a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k7 extends AbstractC7883a {

    /* renamed from: a */
    public final boolean f11920a;

    /* renamed from: b */
    public final InterfaceC2137a f11921b;

    /* renamed from: c */
    public final C2772c f11922c;

    /* renamed from: d */
    public final InterfaceC7266z f11923d;

    /* renamed from: e */
    public final k2.e1 f11924e;

    /* renamed from: f */
    public Object f11925f;

    /* renamed from: g */
    public boolean f11926g;

    public k7(Context context, boolean z6, InterfaceC2137a interfaceC2137a, C2772c c2772c, InterfaceC7266z interfaceC7266z) {
        super(context);
        this.f11920a = z6;
        this.f11921b = interfaceC2137a;
        this.f11922c = c2772c;
        this.f11923d = interfaceC7266z;
        this.f11924e = C3953b.m8517t(g2.f11620a);
    }

    @Override // w3.AbstractC7883a
    public final void Content(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(576708319);
        if ((((c3966o.m8616i(this) ? 4 : 2) | i10) & 3) == 2 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            ((InterfaceC2141e) this.f11924e.getValue()).invoke(c3966o, 0);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1475f(this, i10, 4);
        }
    }

    @Override // w3.AbstractC7883a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11926g;
    }

    @Override // w3.AbstractC7883a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (!this.f11920a || (i10 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f11925f == null) {
            InterfaceC2137a interfaceC2137a = this.f11921b;
            this.f11925f = i10 >= 34 ? j7.m6178a(interfaceC2137a, this.f11922c, this.f11923d) : f7.m6158a(interfaceC2137a);
        }
        f7.m6159b(this, this.f11925f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            f7.m6160c(this, this.f11925f);
        }
        this.f11925f = null;
    }
}
