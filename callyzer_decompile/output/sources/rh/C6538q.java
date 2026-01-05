package rh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bh.AbstractC0659a;
import c6.v0;
import com.google.android.material.textfield.TextInputLayout;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import og.y0;
import p013o.j0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.q */
/* loaded from: classes.dex */
public final class C6538q {

    /* renamed from: a */
    public final Context f31344a;

    /* renamed from: b */
    public final TextInputLayout f31345b;

    /* renamed from: c */
    public LinearLayout f31346c;

    /* renamed from: d */
    public int f31347d;

    /* renamed from: e */
    public FrameLayout f31348e;

    /* renamed from: f */
    public AnimatorSet f31349f;

    /* renamed from: g */
    public final float f31350g;

    /* renamed from: h */
    public int f31351h;

    /* renamed from: i */
    public int f31352i;

    /* renamed from: j */
    public CharSequence f31353j;

    /* renamed from: k */
    public boolean f31354k;

    /* renamed from: l */
    public j0 f31355l;

    /* renamed from: m */
    public CharSequence f31356m;

    /* renamed from: n */
    public int f31357n;

    /* renamed from: o */
    public ColorStateList f31358o;

    /* renamed from: p */
    public CharSequence f31359p;

    /* renamed from: q */
    public boolean f31360q;

    /* renamed from: r */
    public j0 f31361r;

    /* renamed from: s */
    public int f31362s;

    /* renamed from: t */
    public ColorStateList f31363t;

    /* renamed from: u */
    public Typeface f31364u;

    public C6538q(TextInputLayout textInputLayout) {
        this.f31344a = textInputLayout.getContext();
        this.f31345b = textInputLayout;
        this.f31350g = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public final void m12560a(j0 j0Var, int i10) {
        if (this.f31346c == null && this.f31348e == null) {
            Context context = this.f31344a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f31346c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f31346c;
            TextInputLayout textInputLayout = this.f31345b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f31348e = new FrameLayout(context);
            this.f31346c.addView(this.f31348e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m12561b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f31348e.setVisibility(0);
            this.f31348e.addView(j0Var);
        } else {
            this.f31346c.addView(j0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f31346c.setVisibility(0);
        this.f31347d++;
    }

    /* renamed from: b */
    public final void m12561b() {
        if (this.f31346c != null) {
            TextInputLayout textInputLayout = this.f31345b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f31344a;
                boolean zM11060j = y0.m11060j(context);
                LinearLayout linearLayout = this.f31346c;
                Field field = v0.f5527a;
                int paddingStart = editText.getPaddingStart();
                if (zM11060j) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM11060j) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM11060j) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m12562c() {
        AnimatorSet animatorSet = this.f31349f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m12563d(ArrayList arrayList, boolean z6, j0 j0Var, int i10, int i11, int i12) {
        if (j0Var == null || !z6) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(j0Var, (Property<j0, Float>) View.ALPHA, i12 == i10 ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(AbstractC0659a.f4203a);
            arrayList.add(objectAnimatorOfFloat);
            if (i12 == i10) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(j0Var, (Property<j0, Float>) View.TRANSLATION_Y, -this.f31350g, DefinitionKt.NO_Float_VALUE);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(AbstractC0659a.f4206d);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    /* renamed from: e */
    public final boolean m12564e() {
        return (this.f31352i != 1 || this.f31355l == null || TextUtils.isEmpty(this.f31353j)) ? false : true;
    }

    /* renamed from: f */
    public final TextView m12565f(int i10) {
        if (i10 == 1) {
            return this.f31355l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f31361r;
    }

    /* renamed from: g */
    public final void m12566g() {
        this.f31353j = null;
        m12562c();
        if (this.f31351h == 1) {
            if (!this.f31360q || TextUtils.isEmpty(this.f31359p)) {
                this.f31352i = 0;
            } else {
                this.f31352i = 2;
            }
        }
        m12569j(this.f31351h, this.f31352i, m12568i(this.f31355l, null));
    }

    /* renamed from: h */
    public final void m12567h(j0 j0Var, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f31346c;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f31348e) != null) {
            frameLayout.removeView(j0Var);
        } else {
            linearLayout.removeView(j0Var);
        }
        int i11 = this.f31347d - 1;
        this.f31347d = i11;
        LinearLayout linearLayout2 = this.f31346c;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: i */
    public final boolean m12568i(j0 j0Var, CharSequence charSequence) {
        Field field = v0.f5527a;
        TextInputLayout textInputLayout = this.f31345b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f31352i == this.f31351h && j0Var != null && TextUtils.equals(j0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m12569j(int i10, int i11, boolean z6) {
        TextView textViewM12565f;
        TextView textViewM12565f2;
        C6538q c6538q = this;
        if (i10 == i11) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            c6538q.f31349f = animatorSet;
            ArrayList arrayList = new ArrayList();
            c6538q.m12563d(arrayList, c6538q.f31360q, c6538q.f31361r, 2, i10, i11);
            c6538q.m12563d(arrayList, c6538q.f31354k, c6538q.f31355l, 1, i10, i11);
            int size = arrayList.size();
            long jMax = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Animator animator = (Animator) arrayList.get(i12);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C6537p c6537p = new C6537p(this, i11, m12565f(i10), i10, c6538q.m12565f(i11));
            c6538q = this;
            animatorSet.addListener(c6537p);
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewM12565f2 = c6538q.m12565f(i11)) != null) {
                textViewM12565f2.setVisibility(0);
                textViewM12565f2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewM12565f = m12565f(i10)) != null) {
                textViewM12565f.setVisibility(4);
                if (i10 == 1) {
                    textViewM12565f.setText((CharSequence) null);
                }
            }
            c6538q.f31351h = i11;
        }
        TextInputLayout textInputLayout = c6538q.f31345b;
        textInputLayout.m4132q();
        textInputLayout.m4134s(z6, false);
        textInputLayout.m4141z();
    }
}
