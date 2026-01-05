package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import bh.AbstractC0659a;
import com.google.android.material.datepicker.ViewOnClickListenerC1348l;
import com.google.android.material.textfield.TextInputLayout;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import dh.C1723a;
import fh.C2287b;
import java.util.LinkedHashSet;
import og.v0;
import pg.s8;
import ph.C5946a;
import ph.C5950e;
import ph.C5951f;
import ph.C5952g;
import ph.C5954i;
import ph.C5955j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.n */
/* loaded from: classes.dex */
public final class C6535n extends AbstractC6536o {

    /* renamed from: d */
    public final C6531j f31323d;

    /* renamed from: e */
    public final ViewOnFocusChangeListenerC6523b f31324e;

    /* renamed from: f */
    public final C6532k f31325f;

    /* renamed from: g */
    public final C6524c f31326g;

    /* renamed from: h */
    public final C6525d f31327h;

    /* renamed from: i */
    public boolean f31328i;

    /* renamed from: j */
    public boolean f31329j;

    /* renamed from: k */
    public long f31330k;

    /* renamed from: l */
    public StateListDrawable f31331l;

    /* renamed from: m */
    public C5952g f31332m;

    /* renamed from: n */
    public AccessibilityManager f31333n;

    /* renamed from: o */
    public ValueAnimator f31334o;

    /* renamed from: p */
    public ValueAnimator f31335p;

    public C6535n(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f31323d = new C6531j(this, 0);
        this.f31324e = new ViewOnFocusChangeListenerC6523b(this, 1);
        this.f31325f = new C6532k(this, textInputLayout);
        this.f31326g = new C6524c(this, 1);
        this.f31327h = new C6525d(this, 1);
        this.f31328i = false;
        this.f31329j = false;
        this.f31330k = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m12555d(C6535n c6535n, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c6535n.f31330k;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            c6535n.f31328i = false;
        }
        if (c6535n.f31328i) {
            c6535n.f31328i = false;
            return;
        }
        c6535n.m12559g(!c6535n.f31329j);
        if (!c6535n.f31329j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* renamed from: f */
    public static boolean m12556f(EditText editText) {
        return editText.getKeyListener() != null;
    }

    @Override // rh.AbstractC6536o
    /* renamed from: a */
    public final void mo12551a() throws Resources.NotFoundException {
        Context context = this.f31337b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C5952g c5952gM12558e = m12558e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C5952g c5952gM12558e2 = m12558e(DefinitionKt.NO_Float_VALUE, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f31332m = c5952gM12558e;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f31331l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, c5952gM12558e);
        this.f31331l.addState(new int[0], c5952gM12558e2);
        Drawable drawableM11864b = s8.m11864b(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.f31336a;
        textInputLayout.setEndIconDrawable(drawableM11864b);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC1348l(5, this));
        LinkedHashSet linkedHashSet = textInputLayout.f43897k1;
        C6524c c6524c = this.f31326g;
        linkedHashSet.add(c6524c);
        if (textInputLayout.f6960e != null) {
            c6524c.m12550a(textInputLayout);
        }
        textInputLayout.f43901o1.add(this.f31327h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(DefinitionKt.NO_Float_VALUE, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC0659a.f4203a;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new C2287b(i10, this));
        this.f31335p = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, DefinitionKt.NO_Float_VALUE);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new C2287b(i10, this));
        this.f31334o = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C1723a(3, this));
        this.f31333n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // rh.AbstractC6536o
    /* renamed from: b */
    public final boolean mo12557b(int i10) {
        return i10 != 0;
    }

    /* renamed from: e */
    public final C5952g m12558e(float f6, float f10, float f11, int i10) {
        C5954i c5954i = new C5954i();
        C5954i c5954i2 = new C5954i();
        C5954i c5954i3 = new C5954i();
        C5954i c5954i4 = new C5954i();
        int i11 = 0;
        C5950e c5950e = new C5950e(i11);
        C5950e c5950e2 = new C5950e(i11);
        C5950e c5950e3 = new C5950e(i11);
        C5950e c5950e4 = new C5950e(i11);
        C5946a c5946a = new C5946a(f6);
        C5946a c5946a2 = new C5946a(f6);
        C5946a c5946a3 = new C5946a(f10);
        C5946a c5946a4 = new C5946a(f10);
        C5955j c5955j = new C5955j();
        c5955j.f29175a = c5954i;
        c5955j.f29176b = c5954i2;
        c5955j.f29177c = c5954i3;
        c5955j.f29178d = c5954i4;
        c5955j.f29179e = c5946a;
        c5955j.f29180f = c5946a2;
        c5955j.f29181g = c5946a4;
        c5955j.f29182h = c5946a3;
        c5955j.f29183i = c5950e;
        c5955j.f29184j = c5950e2;
        c5955j.f29185k = c5950e3;
        c5955j.f29186l = c5950e4;
        Paint paint = C5952g.f29151z;
        String simpleName = C5952g.class.getSimpleName();
        Context context = this.f31337b;
        int iM11010c = v0.m11010c(R.attr.colorSurface, context, simpleName);
        C5952g c5952g = new C5952g();
        c5952g.m11986g(context);
        c5952g.m11988i(ColorStateList.valueOf(iM11010c));
        c5952g.m11987h(f11);
        c5952g.setShapeAppearanceModel(c5955j);
        C5951f c5951f = c5952g.f29152a;
        if (c5951f.f29141g == null) {
            c5951f.f29141g = new Rect();
        }
        c5952g.f29152a.f29141g.set(0, i10, 0, i10);
        c5952g.invalidateSelf();
        return c5952g;
    }

    /* renamed from: g */
    public final void m12559g(boolean z6) {
        if (this.f31329j != z6) {
            this.f31329j = z6;
            this.f31335p.cancel();
            this.f31334o.start();
        }
    }
}
