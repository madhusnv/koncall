package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class bi8 {

    /* renamed from: A */
    public ColorStateList f16346A;

    /* renamed from: B */
    public Typeface f16347B;

    /* renamed from: a */
    public final int f16348a;

    /* renamed from: b */
    public final int f16349b;

    /* renamed from: c */
    public final int f16350c;

    /* renamed from: d */
    public final TimeInterpolator f16351d;

    /* renamed from: e */
    public final TimeInterpolator f16352e;

    /* renamed from: f */
    public final TimeInterpolator f16353f;

    /* renamed from: g */
    public final Context f16354g;

    /* renamed from: h */
    public final TextInputLayout f16355h;

    /* renamed from: i */
    public LinearLayout f16356i;

    /* renamed from: j */
    public int f16357j;

    /* renamed from: k */
    public FrameLayout f16358k;

    /* renamed from: l */
    public Animator f16359l;

    /* renamed from: m */
    public final float f16360m;

    /* renamed from: n */
    public int f16361n;

    /* renamed from: o */
    public int f16362o;

    /* renamed from: p */
    public CharSequence f16363p;

    /* renamed from: q */
    public boolean f16364q;

    /* renamed from: r */
    public TextView f16365r;

    /* renamed from: s */
    public CharSequence f16366s;

    /* renamed from: t */
    public int f16367t;

    /* renamed from: u */
    public int f16368u;

    /* renamed from: v */
    public ColorStateList f16369v;

    /* renamed from: w */
    public CharSequence f16370w;

    /* renamed from: x */
    public boolean f16371x;

    /* renamed from: y */
    public TextView f16372y;

    /* renamed from: z */
    public int f16373z;

    /* renamed from: o.bi8$a */
    public class C12427a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f16374a;

        /* renamed from: b */
        public final /* synthetic */ TextView f16375b;

        /* renamed from: c */
        public final /* synthetic */ int f16376c;

        /* renamed from: d */
        public final /* synthetic */ TextView f16377d;

        public C12427a(int i, TextView textView, int i2, TextView textView2) {
            this.f16374a = i;
            this.f16375b = textView;
            this.f16376c = i2;
            this.f16377d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bi8.this.f16361n = this.f16374a;
            bi8.this.f16359l = null;
            TextView textView = this.f16375b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f16376c == 1 && bi8.this.f16365r != null) {
                    bi8.this.f16365r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f16377d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f16377d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f16377d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f16377d.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: o.bi8$b */
    public class C12428b extends View.AccessibilityDelegate {
        public C12428b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = bi8.this.f16355h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public bi8(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f16354g = context;
        this.f16355h = textInputLayout;
        this.f16360m = context.getResources().getDimensionPixelSize(x6e.design_textinput_caption_translate_y);
        this.f16348a = umb.m51785f(context, x5e.motionDurationShort4, 217);
        this.f16349b = umb.m51785f(context, x5e.motionDurationMedium4, Opcodes.GOTO);
        this.f16350c = umb.m51785f(context, x5e.motionDurationShort4, Opcodes.GOTO);
        this.f16351d = umb.m51786g(context, x5e.motionEasingEmphasizedDecelerateInterpolator, gh0.f25149d);
        int i = x5e.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = gh0.f25146a;
        this.f16352e = umb.m51786g(context, i, timeInterpolator);
        this.f16353f = umb.m51786g(context, x5e.motionEasingLinearInterpolator, timeInterpolator);
    }

    /* renamed from: A */
    public boolean m19131A() {
        return this.f16364q;
    }

    /* renamed from: B */
    public boolean m19132B() {
        return this.f16371x;
    }

    /* renamed from: C */
    public void m19133C(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f16356i == null) {
            return;
        }
        if (!m19171z(i) || (frameLayout = this.f16358k) == null) {
            this.f16356i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f16357j - 1;
        this.f16357j = i2;
        m19145O(this.f16356i, i2);
    }

    /* renamed from: D */
    public final void m19134D(int i, int i2) {
        TextView textViewM19158m;
        TextView textViewM19158m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (textViewM19158m2 = m19158m(i2)) != null) {
            textViewM19158m2.setVisibility(0);
            textViewM19158m2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewM19158m = m19158m(i)) != null) {
            textViewM19158m.setVisibility(4);
            if (i == 1) {
                textViewM19158m.setText((CharSequence) null);
            }
        }
        this.f16361n = i2;
    }

    /* renamed from: E */
    public void m19135E(int i) {
        this.f16367t = i;
        TextView textView = this.f16365r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: F */
    public void m19136F(CharSequence charSequence) {
        this.f16366s = charSequence;
        TextView textView = this.f16365r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: G */
    public void m19137G(boolean z) {
        if (this.f16364q == z) {
            return;
        }
        m19153h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f16354g);
            this.f16365r = appCompatTextView;
            appCompatTextView.setId(n8e.textinput_error);
            this.f16365r.setTextAlignment(5);
            Typeface typeface = this.f16347B;
            if (typeface != null) {
                this.f16365r.setTypeface(typeface);
            }
            m19138H(this.f16368u);
            m19139I(this.f16369v);
            m19136F(this.f16366s);
            m19135E(this.f16367t);
            this.f16365r.setVisibility(4);
            m19150e(this.f16365r, 0);
        } else {
            m19168w();
            m19133C(this.f16365r, 0);
            this.f16365r = null;
            this.f16355h.v0();
            this.f16355h.H0();
        }
        this.f16364q = z;
    }

    /* renamed from: H */
    public void m19138H(int i) {
        this.f16368u = i;
        TextView textView = this.f16365r;
        if (textView != null) {
            this.f16355h.h0(textView, i);
        }
    }

    /* renamed from: I */
    public void m19139I(ColorStateList colorStateList) {
        this.f16369v = colorStateList;
        TextView textView = this.f16365r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: J */
    public void m19140J(int i) {
        this.f16373z = i;
        TextView textView = this.f16372y;
        if (textView != null) {
            gjh.m28914m(textView, i);
        }
    }

    /* renamed from: K */
    public void m19141K(boolean z) {
        if (this.f16371x == z) {
            return;
        }
        m19153h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f16354g);
            this.f16372y = appCompatTextView;
            appCompatTextView.setId(n8e.textinput_helper_text);
            this.f16372y.setTextAlignment(5);
            Typeface typeface = this.f16347B;
            if (typeface != null) {
                this.f16372y.setTypeface(typeface);
            }
            this.f16372y.setVisibility(4);
            this.f16372y.setAccessibilityLiveRegion(1);
            m19140J(this.f16373z);
            m19142L(this.f16346A);
            m19150e(this.f16372y, 1);
            this.f16372y.setAccessibilityDelegate(new C12428b());
        } else {
            m19169x();
            m19133C(this.f16372y, 1);
            this.f16372y = null;
            this.f16355h.v0();
            this.f16355h.H0();
        }
        this.f16371x = z;
    }

    /* renamed from: L */
    public void m19142L(ColorStateList colorStateList) {
        this.f16346A = colorStateList;
        TextView textView = this.f16372y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: M */
    public final void m19143M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: N */
    public void m19144N(Typeface typeface) {
        if (typeface != this.f16347B) {
            this.f16347B = typeface;
            m19143M(this.f16365r, typeface);
            m19143M(this.f16372y, typeface);
        }
    }

    /* renamed from: O */
    public final void m19145O(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: P */
    public final boolean m19146P(TextView textView, CharSequence charSequence) {
        return this.f16355h.isLaidOut() && this.f16355h.isEnabled() && !(this.f16362o == this.f16361n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: Q */
    public void m19147Q(CharSequence charSequence) {
        m19153h();
        this.f16363p = charSequence;
        this.f16365r.setText(charSequence);
        int i = this.f16361n;
        if (i != 1) {
            this.f16362o = 1;
        }
        m19149S(i, this.f16362o, m19146P(this.f16365r, charSequence));
    }

    /* renamed from: R */
    public void m19148R(CharSequence charSequence) {
        m19153h();
        this.f16370w = charSequence;
        this.f16372y.setText(charSequence);
        int i = this.f16361n;
        if (i != 2) {
            this.f16362o = 2;
        }
        m19149S(i, this.f16362o, m19146P(this.f16372y, charSequence));
    }

    /* renamed from: S */
    public final void m19149S(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f16359l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m19154i(arrayList, this.f16371x, this.f16372y, 2, i, i2);
            m19154i(arrayList, this.f16364q, this.f16365r, 1, i, i2);
            lh0.m37166a(animatorSet, arrayList);
            animatorSet.addListener(new C12427a(i2, m19158m(i), i, m19158m(i2)));
            animatorSet.start();
        } else {
            m19134D(i, i2);
        }
        this.f16355h.v0();
        this.f16355h.B0(z);
        this.f16355h.H0();
    }

    /* renamed from: e */
    public void m19150e(TextView textView, int i) {
        if (this.f16356i == null && this.f16358k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f16354g);
            this.f16356i = linearLayout;
            linearLayout.setOrientation(0);
            this.f16355h.addView(this.f16356i, -1, -2);
            this.f16358k = new FrameLayout(this.f16354g);
            this.f16356i.addView(this.f16358k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f16355h.getEditText() != null) {
                m19151f();
            }
        }
        if (m19171z(i)) {
            this.f16358k.setVisibility(0);
            this.f16358k.addView(textView);
        } else {
            this.f16356i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f16356i.setVisibility(0);
        this.f16357j++;
    }

    /* renamed from: f */
    public void m19151f() {
        if (m19152g()) {
            EditText editText = this.f16355h.getEditText();
            boolean zM58504k = yya.m58504k(this.f16354g);
            this.f16356i.setPaddingRelative(m19167v(zM58504k, x6e.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), m19167v(zM58504k, x6e.material_helper_text_font_1_3_padding_top, this.f16354g.getResources().getDimensionPixelSize(x6e.material_helper_text_default_padding_top)), m19167v(zM58504k, x6e.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
        }
    }

    /* renamed from: g */
    public final boolean m19152g() {
        return (this.f16356i == null || this.f16355h.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    public void m19153h() {
        Animator animator = this.f16359l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public final void m19154i(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        boolean z2 = false;
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorM19155j = m19155j(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                z2 = true;
            }
            if (z2) {
                objectAnimatorM19155j.setStartDelay(this.f16350c);
            }
            list.add(objectAnimatorM19155j);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorM19156k = m19156k(textView);
            objectAnimatorM19156k.setStartDelay(this.f16350c);
            list.add(objectAnimatorM19156k);
        }
    }

    /* renamed from: j */
    public final ObjectAnimator m19155j(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z ? this.f16349b : this.f16350c);
        objectAnimatorOfFloat.setInterpolator(z ? this.f16352e : this.f16353f);
        return objectAnimatorOfFloat;
    }

    /* renamed from: k */
    public final ObjectAnimator m19156k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f16360m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f16348a);
        objectAnimatorOfFloat.setInterpolator(this.f16351d);
        return objectAnimatorOfFloat;
    }

    /* renamed from: l */
    public boolean m19157l() {
        return m19170y(this.f16362o);
    }

    /* renamed from: m */
    public final TextView m19158m(int i) {
        if (i == 1) {
            return this.f16365r;
        }
        if (i != 2) {
            return null;
        }
        return this.f16372y;
    }

    /* renamed from: n */
    public int m19159n() {
        return this.f16367t;
    }

    /* renamed from: o */
    public CharSequence m19160o() {
        return this.f16366s;
    }

    /* renamed from: p */
    public CharSequence m19161p() {
        return this.f16363p;
    }

    /* renamed from: q */
    public int m19162q() {
        TextView textView = this.f16365r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: r */
    public ColorStateList m19163r() {
        TextView textView = this.f16365r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence m19164s() {
        return this.f16370w;
    }

    /* renamed from: t */
    public View m19165t() {
        return this.f16372y;
    }

    /* renamed from: u */
    public int m19166u() {
        TextView textView = this.f16372y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: v */
    public final int m19167v(boolean z, int i, int i2) {
        return z ? this.f16354g.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: w */
    public void m19168w() {
        this.f16363p = null;
        m19153h();
        if (this.f16361n == 1) {
            if (!this.f16371x || TextUtils.isEmpty(this.f16370w)) {
                this.f16362o = 0;
            } else {
                this.f16362o = 2;
            }
        }
        m19149S(this.f16361n, this.f16362o, m19146P(this.f16365r, ""));
    }

    /* renamed from: x */
    public void m19169x() {
        m19153h();
        int i = this.f16361n;
        if (i == 2) {
            this.f16362o = 0;
        }
        m19149S(i, this.f16362o, m19146P(this.f16372y, ""));
    }

    /* renamed from: y */
    public final boolean m19170y(int i) {
        return (i != 1 || this.f16365r == null || TextUtils.isEmpty(this.f16363p)) ? false : true;
    }

    /* renamed from: z */
    public boolean m19171z(int i) {
        return i == 0 || i == 1;
    }
}
