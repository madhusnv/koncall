package gh;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import c6.v0;
import com.google.android.material.button.MaterialButton;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import nh.AbstractC5071a;
import pg.m6;
import ph.C5951f;
import ph.C5952g;
import ph.C5955j;
import ph.InterfaceC5965t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gh.c */
/* loaded from: classes.dex */
public final class C2614c {

    /* renamed from: a */
    public final MaterialButton f14155a;

    /* renamed from: b */
    public C5955j f14156b;

    /* renamed from: c */
    public int f14157c;

    /* renamed from: d */
    public int f14158d;

    /* renamed from: e */
    public int f14159e;

    /* renamed from: f */
    public int f14160f;

    /* renamed from: g */
    public int f14161g;

    /* renamed from: h */
    public int f14162h;

    /* renamed from: i */
    public PorterDuff.Mode f14163i;

    /* renamed from: j */
    public ColorStateList f14164j;

    /* renamed from: k */
    public ColorStateList f14165k;

    /* renamed from: l */
    public ColorStateList f14166l;

    /* renamed from: m */
    public C5952g f14167m;

    /* renamed from: n */
    public boolean f14168n = false;

    /* renamed from: o */
    public boolean f14169o = false;

    /* renamed from: p */
    public boolean f14170p = false;

    /* renamed from: q */
    public boolean f14171q;

    /* renamed from: r */
    public RippleDrawable f14172r;

    /* renamed from: s */
    public int f14173s;

    public C2614c(MaterialButton materialButton, C5955j c5955j) {
        this.f14155a = materialButton;
        this.f14156b = c5955j;
    }

    /* renamed from: a */
    public final InterfaceC5965t m6588a() {
        RippleDrawable rippleDrawable = this.f14172r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f14172r.getNumberOfLayers() > 2 ? (InterfaceC5965t) this.f14172r.getDrawable(2) : (InterfaceC5965t) this.f14172r.getDrawable(1);
    }

    /* renamed from: b */
    public final C5952g m6589b(boolean z6) {
        RippleDrawable rippleDrawable = this.f14172r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C5952g) ((LayerDrawable) ((InsetDrawable) this.f14172r.getDrawable(0)).getDrawable()).getDrawable(!z6 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m6590c(C5955j c5955j) {
        this.f14156b = c5955j;
        if (m6589b(false) != null) {
            m6589b(false).setShapeAppearanceModel(c5955j);
        }
        if (m6589b(true) != null) {
            m6589b(true).setShapeAppearanceModel(c5955j);
        }
        if (m6588a() != null) {
            m6588a().setShapeAppearanceModel(c5955j);
        }
    }

    /* renamed from: d */
    public final void m6591d(int i10, int i11) {
        Field field = v0.f5527a;
        MaterialButton materialButton = this.f14155a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f14159e;
        int i13 = this.f14160f;
        this.f14160f = i11;
        this.f14159e = i10;
        if (!this.f14169o) {
            m6592e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    /* renamed from: e */
    public final void m6592e() {
        C5952g c5952g = new C5952g(this.f14156b);
        MaterialButton materialButton = this.f14155a;
        c5952g.m11986g(materialButton.getContext());
        c5952g.setTintList(this.f14164j);
        PorterDuff.Mode mode = this.f14163i;
        if (mode != null) {
            c5952g.setTintMode(mode);
        }
        float f6 = this.f14162h;
        ColorStateList colorStateList = this.f14165k;
        c5952g.f29152a.f29144j = f6;
        c5952g.invalidateSelf();
        C5951f c5951f = c5952g.f29152a;
        if (c5951f.f29138d != colorStateList) {
            c5951f.f29138d = colorStateList;
            c5952g.onStateChange(c5952g.getState());
        }
        C5952g c5952g2 = new C5952g(this.f14156b);
        c5952g2.setTint(0);
        float f10 = this.f14162h;
        int iM11786a = this.f14168n ? m6.m11786a(R.attr.colorSurface, materialButton) : 0;
        c5952g2.f29152a.f29144j = f10;
        c5952g2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM11786a);
        C5951f c5951f2 = c5952g2.f29152a;
        if (c5951f2.f29138d != colorStateListValueOf) {
            c5951f2.f29138d = colorStateListValueOf;
            c5952g2.onStateChange(c5952g2.getState());
        }
        C5952g c5952g3 = new C5952g(this.f14156b);
        this.f14167m = c5952g3;
        c5952g3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC5071a.m10006a(this.f14166l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c5952g2, c5952g}), this.f14157c, this.f14159e, this.f14158d, this.f14160f), this.f14167m);
        this.f14172r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C5952g c5952gM6589b = m6589b(false);
        if (c5952gM6589b != null) {
            c5952gM6589b.m11987h(this.f14173s);
        }
    }

    /* renamed from: f */
    public final void m6593f() {
        C5952g c5952gM6589b = m6589b(false);
        C5952g c5952gM6589b2 = m6589b(true);
        if (c5952gM6589b != null) {
            float f6 = this.f14162h;
            ColorStateList colorStateList = this.f14165k;
            c5952gM6589b.f29152a.f29144j = f6;
            c5952gM6589b.invalidateSelf();
            C5951f c5951f = c5952gM6589b.f29152a;
            if (c5951f.f29138d != colorStateList) {
                c5951f.f29138d = colorStateList;
                c5952gM6589b.onStateChange(c5952gM6589b.getState());
            }
            if (c5952gM6589b2 != null) {
                float f10 = this.f14162h;
                int iM11786a = this.f14168n ? m6.m11786a(R.attr.colorSurface, this.f14155a) : 0;
                c5952gM6589b2.f29152a.f29144j = f10;
                c5952gM6589b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM11786a);
                C5951f c5951f2 = c5952gM6589b2.f29152a;
                if (c5951f2.f29138d != colorStateListValueOf) {
                    c5951f2.f29138d = colorStateListValueOf;
                    c5952gM6589b2.onStateChange(c5952gM6589b2.getState());
                }
            }
        }
    }
}
