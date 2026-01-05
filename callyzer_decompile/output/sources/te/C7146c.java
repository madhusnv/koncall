package te;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c3.C0850e;
import d3.AbstractC1550d;
import d3.C1559m;
import d3.InterfaceC1563q;
import f3.C2196b;
import gx.AbstractC2747a;
import i3.AbstractC3166c;
import k2.C3953b;
import k2.e1;
import k2.r1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.d2;
import og.nd;
import pg.w9;
import qc.C6158d;
import qw.C6366p;
import s4.EnumC6757m;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: te.c */
/* loaded from: classes.dex */
public final class C7146c extends AbstractC3166c implements r1 {

    /* renamed from: f */
    public final Drawable f34378f;

    /* renamed from: g */
    public final e1 f34379g;

    /* renamed from: h */
    public final e1 f34380h;

    /* renamed from: j */
    public final C6366p f34381j;

    public C7146c(Drawable drawable) {
        AbstractC4154l.m8923f(drawable, "drawable");
        this.f34378f = drawable;
        this.f34379g = C3953b.m8517t(0);
        Object obj = AbstractC7147d.f34382a;
        this.f34380h = C3953b.m8517t(new C0850e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : d2.m10598a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f34381j = nd.m10782c(new C6158d(6, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // i3.AbstractC3166c
    /* renamed from: a */
    public final boolean mo7531a(float f6) {
        this.f34378f.setAlpha(w9.m11912c(AbstractC2747a.m6747k(f6 * 255), 0, 255));
        return true;
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
        mo5875c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        Drawable drawable = this.f34378f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // i3.AbstractC3166c
    /* renamed from: d */
    public final boolean mo7532d(C1559m c1559m) {
        this.f34378f.setColorFilter(c1559m != null ? c1559m.f7785a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
        Drawable.Callback callback = (Drawable.Callback) this.f34381j.getValue();
        Drawable drawable = this.f34378f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // i3.AbstractC3166c
    /* renamed from: f */
    public final void mo7535f(EnumC6757m layoutDirection) {
        AbstractC4154l.m8923f(layoutDirection, "layoutDirection");
        int i10 = AbstractC7144a.f34376a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.f34378f.setLayoutDirection(i11);
    }

    @Override // i3.AbstractC3166c
    /* renamed from: h */
    public final long mo7533h() {
        return ((C0850e) this.f34380h.getValue()).f5366a;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: i */
    public final void mo7534i(i0 i0Var) {
        C2196b c2196b = i0Var.f36917a;
        InterfaceC1563q interfaceC1563qM75t = c2196b.f10124b.m75t();
        ((Number) this.f34379g.getValue()).intValue();
        try {
            interfaceC1563qM75t.mo5107i();
            int i10 = Build.VERSION.SDK_INT;
            Drawable drawable = this.f34378f;
            if (i10 < 28 || i10 >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, AbstractC2747a.m6747k(C0850e.m2293d(c2196b.mo5913e())), AbstractC2747a.m6747k(C0850e.m2291b(c2196b.mo5913e())));
            } else {
                interfaceC1563qM75t.mo5102c(C0850e.m2293d(c2196b.mo5913e()) / C0850e.m2293d(mo7533h()), C0850e.m2291b(c2196b.mo5913e()) / C0850e.m2291b(mo7533h()));
            }
            drawable.draw(AbstractC1550d.m5119a(interfaceC1563qM75t));
            interfaceC1563qM75t.mo5113o();
        } catch (Throwable th2) {
            interfaceC1563qM75t.mo5113o();
            throw th2;
        }
    }
}
