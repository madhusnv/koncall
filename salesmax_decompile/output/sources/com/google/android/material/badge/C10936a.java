package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p001o.bkh;
import p001o.gh0;
import p001o.mgh;
import p001o.pae;
import p001o.v9e;
import p001o.x5e;
import p001o.ygh;
import p001o.ykf;
import p001o.yya;
import p001o.zya;

/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes3.dex */
public class C10936a extends Drawable implements ygh.InterfaceC18403b {

    /* renamed from: L */
    public static final int f12058L = pae.Widget_MaterialComponents_Badge;

    /* renamed from: M */
    public static final int f12059M = x5e.badgeStyle;

    /* renamed from: H */
    public WeakReference f12060H;

    /* renamed from: a */
    public final WeakReference f12061a;

    /* renamed from: b */
    public final zya f12062b;

    /* renamed from: c */
    public final ygh f12063c;

    /* renamed from: d */
    public final Rect f12064d;

    /* renamed from: e */
    public final BadgeState f12065e;

    /* renamed from: f */
    public float f12066f;

    /* renamed from: g */
    public float f12067g;

    /* renamed from: h */
    public int f12068h;

    /* renamed from: q */
    public float f12069q;

    /* renamed from: s */
    public float f12070s;

    /* renamed from: x */
    public float f12071x;

    /* renamed from: y */
    public WeakReference f12072y;

    public C10936a(Context context, int i, int i2, int i3, BadgeState.State state) {
        this.f12061a = new WeakReference(context);
        bkh.m19299c(context);
        this.f12064d = new Rect();
        ygh yghVar = new ygh(this);
        this.f12063c = yghVar;
        yghVar.m57789g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i, i2, i3, state);
        this.f12065e = badgeState;
        this.f12062b = new zya(ykf.m57922b(context, m14024C() ? badgeState.m13957n() : badgeState.m13953j(), m14024C() ? badgeState.m13956m() : badgeState.m13952i()).m57970m());
        m14037P();
    }

    /* renamed from: U */
    public static void m14019U(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: f */
    public static C10936a m14020f(Context context) {
        return new C10936a(context, 0, f12059M, f12058L, null);
    }

    /* renamed from: g */
    public static C10936a m14021g(Context context, BadgeState.State state) {
        return new C10936a(context, 0, f12059M, f12058L, state);
    }

    /* renamed from: A */
    public final int m14022A() {
        int iM13962s = m14024C() ? this.f12065e.m13962s() : this.f12065e.m13963t();
        if (this.f12065e.f12037k == 1) {
            iM13962s += m14024C() ? this.f12065e.f12036j : this.f12065e.f12035i;
        }
        return iM13962s + this.f12065e.m13946c();
    }

    /* renamed from: B */
    public final int m14023B() {
        int iM13935D = this.f12065e.m13935D();
        if (m14024C()) {
            iM13935D = this.f12065e.m13934C();
            Context context = (Context) this.f12061a.get();
            if (context != null) {
                iM13935D = gh0.m28649c(iM13935D, iM13935D - this.f12065e.m13964u(), gh0.m28648b(0.0f, 1.0f, 0.3f, 1.0f, yya.m58499f(context) - 1.0f));
            }
        }
        if (this.f12065e.f12037k == 0) {
            iM13935D -= Math.round(this.f12071x);
        }
        return iM13935D + this.f12065e.m13947d();
    }

    /* renamed from: C */
    public final boolean m14024C() {
        return m14026E() || m14025D();
    }

    /* renamed from: D */
    public boolean m14025D() {
        return !this.f12065e.m13937F() && this.f12065e.m13936E();
    }

    /* renamed from: E */
    public boolean m14026E() {
        return this.f12065e.m13937F();
    }

    /* renamed from: F */
    public final void m14027F() {
        this.f12063c.m57789g().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* renamed from: G */
    public final void m14028G() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f12065e.m13949f());
        if (this.f12062b.m60096B() != colorStateListValueOf) {
            this.f12062b.g0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    /* renamed from: H */
    public final void m14029H() {
        this.f12063c.m57794l(true);
        m14031J();
        m14043W();
        invalidateSelf();
    }

    /* renamed from: I */
    public final void m14030I() {
        WeakReference weakReference = this.f12072y;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f12072y.get();
        WeakReference weakReference2 = this.f12060H;
        m14042V(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    /* renamed from: J */
    public final void m14031J() {
        Context context = (Context) this.f12061a.get();
        if (context == null) {
            return;
        }
        this.f12062b.setShapeAppearanceModel(ykf.m57922b(context, m14024C() ? this.f12065e.m13957n() : this.f12065e.m13953j(), m14024C() ? this.f12065e.m13956m() : this.f12065e.m13952i()).m57970m());
        invalidateSelf();
    }

    /* renamed from: K */
    public final void m14032K() {
        mgh mghVar;
        Context context = (Context) this.f12061a.get();
        if (context == null || this.f12063c.m57787e() == (mghVar = new mgh(context, this.f12065e.m13933B()))) {
            return;
        }
        this.f12063c.m57793k(mghVar, context);
        m14033L();
        m14043W();
        invalidateSelf();
    }

    /* renamed from: L */
    public final void m14033L() {
        this.f12063c.m57789g().setColor(this.f12065e.m13954k());
        invalidateSelf();
    }

    /* renamed from: M */
    public final void m14034M() {
        m14044X();
        this.f12063c.m57794l(true);
        m14043W();
        invalidateSelf();
    }

    /* renamed from: N */
    public final void m14035N() {
        if (m14026E()) {
            return;
        }
        m14029H();
    }

    /* renamed from: O */
    public final void m14036O() {
        setVisible(this.f12065e.m13939H(), false);
    }

    /* renamed from: P */
    public final void m14037P() {
        m14031J();
        m14032K();
        m14034M();
        m14029H();
        m14027F();
        m14028G();
        m14033L();
        m14030I();
        m14043W();
        m14036O();
    }

    /* renamed from: Q */
    public void m14038Q(int i) {
        this.f12065e.m13941K(i);
        m14028G();
    }

    /* renamed from: R */
    public void m14039R(int i) {
        BadgeState badgeState = this.f12065e;
        if (badgeState.f12038l != i) {
            badgeState.f12038l = i;
            m14043W();
        }
    }

    /* renamed from: S */
    public void m14040S(int i) {
        int iMax = Math.max(0, i);
        if (this.f12065e.m13967x() != iMax) {
            this.f12065e.m13942L(iMax);
            m14035N();
        }
    }

    /* renamed from: T */
    public void m14041T(boolean z) {
        this.f12065e.m13943M(z);
        m14036O();
    }

    /* renamed from: V */
    public void m14042V(View view, FrameLayout frameLayout) {
        this.f12072y = new WeakReference(view);
        this.f12060H = new WeakReference(frameLayout);
        m14019U(view);
        m14043W();
        invalidateSelf();
    }

    /* renamed from: W */
    public final void m14043W() {
        Context context = (Context) this.f12061a.get();
        WeakReference weakReference = this.f12072y;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f12064d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f12060H;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        m14048d(rect2, view);
        AbstractC10937b.m14075g(this.f12064d, this.f12066f, this.f12067g, this.f12070s, this.f12071x);
        float f = this.f12069q;
        if (f != -1.0f) {
            this.f12062b.c0(f);
        }
        if (rect.equals(this.f12064d)) {
            return;
        }
        this.f12062b.setBounds(this.f12064d);
    }

    /* renamed from: X */
    public final void m14044X() {
        if (m14058p() != -2) {
            this.f12068h = ((int) Math.pow(10.0d, m14058p() - 1.0d)) - 1;
        } else {
            this.f12068h = m14059q();
        }
    }

    @Override // p001o.ygh.InterfaceC18403b
    /* renamed from: a */
    public void mo14045a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m14046b(View view) {
        ViewParent viewParentM14054l = m14054l();
        if (viewParentM14054l == null) {
            viewParentM14054l = view.getParent();
        }
        if ((viewParentM14054l instanceof View) && (viewParentM14054l.getParent() instanceof View)) {
            m14047c(view, (View) viewParentM14054l.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: c */
    public final void m14047c(View view, View view2) {
        float y;
        float x;
        View parent;
        boolean z;
        FrameLayout frameLayoutM14054l = m14054l();
        if (frameLayoutM14054l == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutM14054l;
        }
        while (true) {
            z = parent instanceof View;
            if (!z || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = parent;
            y += view3.getY();
            x += view3.getX();
            parent = parent.getParent();
        }
        if (z) {
            float fM14068z = m14068z(y);
            float fM14057o = m14057o(x);
            View view4 = parent;
            float fM14052j = m14052j(view4.getHeight(), y);
            float fM14063u = m14063u(view4.getWidth(), x);
            if (fM14068z < 0.0f) {
                this.f12067g += Math.abs(fM14068z);
            }
            if (fM14057o < 0.0f) {
                this.f12066f += Math.abs(fM14057o);
            }
            if (fM14052j > 0.0f) {
                this.f12067g -= Math.abs(fM14052j);
            }
            if (fM14063u > 0.0f) {
                this.f12066f -= Math.abs(fM14063u);
            }
        }
    }

    /* renamed from: d */
    public final void m14048d(Rect rect, View view) {
        float f = m14024C() ? this.f12065e.f12030d : this.f12065e.f12029c;
        this.f12069q = f;
        if (f != -1.0f) {
            this.f12070s = f;
            this.f12071x = f;
        } else {
            this.f12070s = Math.round((m14024C() ? this.f12065e.f12033g : this.f12065e.f12031e) / 2.0f);
            this.f12071x = Math.round((m14024C() ? this.f12065e.f12034h : this.f12065e.f12032f) / 2.0f);
        }
        if (m14024C()) {
            String strM14051i = m14051i();
            this.f12070s = Math.max(this.f12070s, (this.f12063c.m57790h(strM14051i) / 2.0f) + this.f12065e.m13951h());
            float fMax = Math.max(this.f12071x, (this.f12063c.m57788f(strM14051i) / 2.0f) + this.f12065e.m13955l());
            this.f12071x = fMax;
            this.f12070s = Math.max(this.f12070s, fMax);
        }
        int iM14023B = m14023B();
        int iM13950g = this.f12065e.m13950g();
        if (iM13950g == 8388691 || iM13950g == 8388693) {
            this.f12067g = rect.bottom - iM14023B;
        } else {
            this.f12067g = rect.top + iM14023B;
        }
        int iM14022A = m14022A();
        int iM13950g2 = this.f12065e.m13950g();
        if (iM13950g2 == 8388659 || iM13950g2 == 8388691) {
            this.f12066f = this.f12065e.f12038l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f12070s) - ((this.f12071x * 2.0f) - iM14022A) : (rect.right - this.f12070s) + ((this.f12071x * 2.0f) - iM14022A) : view.getLayoutDirection() == 0 ? (rect.left - this.f12070s) + iM14022A : (rect.right + this.f12070s) - iM14022A;
        } else {
            this.f12066f = this.f12065e.f12038l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f12070s) - iM14022A : (rect.left - this.f12070s) + iM14022A : view.getLayoutDirection() == 0 ? (rect.right - this.f12070s) + ((this.f12071x * 2.0f) - iM14022A) : (rect.left + this.f12070s) - ((this.f12071x * 2.0f) - iM14022A);
        }
        if (this.f12065e.m13938G()) {
            m14046b(view);
        } else {
            m14047c(view, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f12062b.draw(canvas);
        if (m14024C()) {
            m14050h(canvas);
        }
    }

    /* renamed from: e */
    public void m14049e() {
        if (this.f12065e.m13936E()) {
            this.f12065e.m13944a();
            m14035N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12065e.m13948e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12064d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12064d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void m14050h(Canvas canvas) {
        String strM14051i = m14051i();
        if (strM14051i != null) {
            Rect rect = new Rect();
            this.f12063c.m57789g().getTextBounds(strM14051i, 0, strM14051i.length(), rect);
            float fExactCenterY = this.f12067g - rect.exactCenterY();
            canvas.drawText(strM14051i, this.f12066f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f12063c.m57789g());
        }
    }

    /* renamed from: i */
    public final String m14051i() {
        if (m14026E()) {
            return m14066x();
        }
        if (m14025D()) {
            return m14061s();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public final float m14052j(float f, float f2) {
        return ((this.f12067g + this.f12071x) - f) + f2;
    }

    /* renamed from: k */
    public CharSequence m14053k() {
        if (isVisible()) {
            return m14026E() ? m14067y() : m14025D() ? m14062t() : m14055m();
        }
        return null;
    }

    /* renamed from: l */
    public FrameLayout m14054l() {
        WeakReference weakReference = this.f12060H;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* renamed from: m */
    public final CharSequence m14055m() {
        return this.f12065e.m13960q();
    }

    /* renamed from: n */
    public int m14056n() {
        return this.f12065e.m13963t();
    }

    /* renamed from: o */
    public final float m14057o(float f) {
        return (this.f12066f - this.f12070s) + f;
    }

    @Override // android.graphics.drawable.Drawable, p001o.ygh.InterfaceC18403b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public int m14058p() {
        return this.f12065e.m13965v();
    }

    /* renamed from: q */
    public int m14059q() {
        return this.f12065e.m13966w();
    }

    /* renamed from: r */
    public int m14060r() {
        if (this.f12065e.m13936E()) {
            return this.f12065e.m13967x();
        }
        return 0;
    }

    /* renamed from: s */
    public final String m14061s() {
        if (this.f12068h == -2 || m14060r() <= this.f12068h) {
            return NumberFormat.getInstance(this.f12065e.m13968y()).format(m14060r());
        }
        Context context = (Context) this.f12061a.get();
        return context == null ? "" : String.format(this.f12065e.m13968y(), context.getString(v9e.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f12068h), "+");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f12065e.m13940J(i);
        m14027F();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public final String m14062t() {
        Context context;
        if (this.f12065e.m13961r() == 0 || (context = (Context) this.f12061a.get()) == null) {
            return null;
        }
        return (this.f12068h == -2 || m14060r() <= this.f12068h) ? context.getResources().getQuantityString(this.f12065e.m13961r(), m14060r(), Integer.valueOf(m14060r())) : context.getString(this.f12065e.m13958o(), Integer.valueOf(this.f12068h));
    }

    /* renamed from: u */
    public final float m14063u(float f, float f2) {
        return ((this.f12066f + this.f12070s) - f) + f2;
    }

    /* renamed from: v */
    public BadgeState.State m14064v() {
        return this.f12065e.m13969z();
    }

    /* renamed from: w */
    public String m14065w() {
        return this.f12065e.m13932A();
    }

    /* renamed from: x */
    public final String m14066x() {
        String strM14065w = m14065w();
        int iM14058p = m14058p();
        if (iM14058p == -2 || strM14065w == null || strM14065w.length() <= iM14058p) {
            return strM14065w;
        }
        Context context = (Context) this.f12061a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(v9e.m3_exceed_max_badge_text_suffix), strM14065w.substring(0, iM14058p - 1), "…");
    }

    /* renamed from: y */
    public final CharSequence m14067y() {
        CharSequence charSequenceM13959p = this.f12065e.m13959p();
        return charSequenceM13959p != null ? charSequenceM13959p : m14065w();
    }

    /* renamed from: z */
    public final float m14068z(float f) {
        return (this.f12067g - this.f12071x) + f;
    }
}
