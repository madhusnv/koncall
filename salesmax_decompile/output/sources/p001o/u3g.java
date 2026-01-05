package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public class u3g extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f48293a;

    /* renamed from: b */
    public final TextView f48294b;

    /* renamed from: c */
    public CharSequence f48295c;

    /* renamed from: d */
    public final CheckableImageButton f48296d;

    /* renamed from: e */
    public ColorStateList f48297e;

    /* renamed from: f */
    public PorterDuff.Mode f48298f;

    /* renamed from: g */
    public int f48299g;

    /* renamed from: h */
    public ImageView.ScaleType f48300h;

    /* renamed from: q */
    public View.OnLongClickListener f48301q;

    /* renamed from: s */
    public boolean f48302s;

    public u3g(TextInputLayout textInputLayout, anh anhVar) {
        super(textInputLayout.getContext());
        this.f48293a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(n9e.design_text_input_start_icon, (ViewGroup) this, false);
        this.f48296d = checkableImageButton;
        qa8.m45046e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f48294b = appCompatTextView;
        m50911j(anhVar);
        m50910i(anhVar);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: A */
    public void m50899A(cc ccVar) {
        if (this.f48294b.getVisibility() != 0) {
            ccVar.X0(this.f48296d);
        } else {
            ccVar.D0(this.f48294b);
            ccVar.X0(this.f48294b);
        }
    }

    /* renamed from: B */
    public void m50900B() {
        EditText editText = this.f48293a.f13109e;
        if (editText == null) {
            return;
        }
        this.f48294b.setPaddingRelative(m50912k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(x6e.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: C */
    public final void m50901C() {
        int i = (this.f48295c == null || this.f48302s) ? 8 : 0;
        setVisibility(this.f48296d.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f48294b.setVisibility(i);
        this.f48293a.u0();
    }

    /* renamed from: a */
    public CharSequence m50902a() {
        return this.f48295c;
    }

    /* renamed from: b */
    public ColorStateList m50903b() {
        return this.f48294b.getTextColors();
    }

    /* renamed from: c */
    public int m50904c() {
        return getPaddingStart() + this.f48294b.getPaddingStart() + (m50912k() ? this.f48296d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f48296d.getLayoutParams()).getMarginEnd() : 0);
    }

    /* renamed from: d */
    public TextView m50905d() {
        return this.f48294b;
    }

    /* renamed from: e */
    public CharSequence m50906e() {
        return this.f48296d.getContentDescription();
    }

    /* renamed from: f */
    public Drawable m50907f() {
        return this.f48296d.getDrawable();
    }

    /* renamed from: g */
    public int m50908g() {
        return this.f48299g;
    }

    /* renamed from: h */
    public ImageView.ScaleType m50909h() {
        return this.f48300h;
    }

    /* renamed from: i */
    public final void m50910i(anh anhVar) {
        this.f48294b.setVisibility(8);
        this.f48294b.setId(n8e.textinput_prefix_text);
        this.f48294b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f48294b.setAccessibilityLiveRegion(1);
        m50916o(anhVar.m17539n(ebe.TextInputLayout_prefixTextAppearance, 0));
        if (anhVar.m17544s(ebe.TextInputLayout_prefixTextColor)) {
            m50917p(anhVar.m17528c(ebe.TextInputLayout_prefixTextColor));
        }
        m50915n(anhVar.m17541p(ebe.TextInputLayout_prefixText));
    }

    /* renamed from: j */
    public final void m50911j(anh anhVar) {
        if (yya.m58504k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f48296d.getLayoutParams()).setMarginEnd(0);
        }
        m50922u(null);
        m50923v(null);
        if (anhVar.m17544s(ebe.TextInputLayout_startIconTint)) {
            this.f48297e = yya.m58495b(getContext(), anhVar, ebe.TextInputLayout_startIconTint);
        }
        if (anhVar.m17544s(ebe.TextInputLayout_startIconTintMode)) {
            this.f48298f = xzi.m57081q(anhVar.m17536k(ebe.TextInputLayout_startIconTintMode, -1), null);
        }
        if (anhVar.m17544s(ebe.TextInputLayout_startIconDrawable)) {
            m50920s(anhVar.m17532g(ebe.TextInputLayout_startIconDrawable));
            if (anhVar.m17544s(ebe.TextInputLayout_startIconContentDescription)) {
                m50919r(anhVar.m17541p(ebe.TextInputLayout_startIconContentDescription));
            }
            m50918q(anhVar.m17526a(ebe.TextInputLayout_startIconCheckable, true));
        }
        m50921t(anhVar.m17531f(ebe.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(x6e.mtrl_min_touch_target_size)));
        if (anhVar.m17544s(ebe.TextInputLayout_startIconScaleType)) {
            m50924w(qa8.m45043b(anhVar.m17536k(ebe.TextInputLayout_startIconScaleType, -1)));
        }
    }

    /* renamed from: k */
    public boolean m50912k() {
        return this.f48296d.getVisibility() == 0;
    }

    /* renamed from: l */
    public void m50913l(boolean z) {
        this.f48302s = z;
        m50901C();
    }

    /* renamed from: m */
    public void m50914m() {
        qa8.m45045d(this.f48293a, this.f48296d, this.f48297e);
    }

    /* renamed from: n */
    public void m50915n(CharSequence charSequence) {
        this.f48295c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f48294b.setText(charSequence);
        m50901C();
    }

    /* renamed from: o */
    public void m50916o(int i) {
        gjh.m28914m(this.f48294b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m50900B();
    }

    /* renamed from: p */
    public void m50917p(ColorStateList colorStateList) {
        this.f48294b.setTextColor(colorStateList);
    }

    /* renamed from: q */
    public void m50918q(boolean z) {
        this.f48296d.setCheckable(z);
    }

    /* renamed from: r */
    public void m50919r(CharSequence charSequence) {
        if (m50906e() != charSequence) {
            this.f48296d.setContentDescription(charSequence);
        }
    }

    /* renamed from: s */
    public void m50920s(Drawable drawable) {
        this.f48296d.setImageDrawable(drawable);
        if (drawable != null) {
            qa8.m45042a(this.f48293a, this.f48296d, this.f48297e, this.f48298f);
            m50927z(true);
            m50914m();
        } else {
            m50927z(false);
            m50922u(null);
            m50923v(null);
            m50919r(null);
        }
    }

    /* renamed from: t */
    public void m50921t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.f48299g) {
            this.f48299g = i;
            qa8.m45048g(this.f48296d, i);
        }
    }

    /* renamed from: u */
    public void m50922u(View.OnClickListener onClickListener) {
        qa8.m45049h(this.f48296d, onClickListener, this.f48301q);
    }

    /* renamed from: v */
    public void m50923v(View.OnLongClickListener onLongClickListener) {
        this.f48301q = onLongClickListener;
        qa8.m45050i(this.f48296d, onLongClickListener);
    }

    /* renamed from: w */
    public void m50924w(ImageView.ScaleType scaleType) {
        this.f48300h = scaleType;
        qa8.m45051j(this.f48296d, scaleType);
    }

    /* renamed from: x */
    public void m50925x(ColorStateList colorStateList) {
        if (this.f48297e != colorStateList) {
            this.f48297e = colorStateList;
            qa8.m45042a(this.f48293a, this.f48296d, colorStateList, this.f48298f);
        }
    }

    /* renamed from: y */
    public void m50926y(PorterDuff.Mode mode) {
        if (this.f48298f != mode) {
            this.f48298f = mode;
            qa8.m45042a(this.f48293a, this.f48296d, this.f48297e, mode);
        }
    }

    /* renamed from: z */
    public void m50927z(boolean z) {
        if (m50912k() != z) {
            this.f48296d.setVisibility(z ? 0 : 8);
            m50900B();
            m50901C();
        }
    }
}
