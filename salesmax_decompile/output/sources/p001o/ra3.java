package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C11154a;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class ra3 extends w76 {

    /* renamed from: e */
    public final int f43299e;

    /* renamed from: f */
    public final int f43300f;

    /* renamed from: g */
    public final TimeInterpolator f43301g;

    /* renamed from: h */
    public final TimeInterpolator f43302h;

    /* renamed from: i */
    public EditText f43303i;

    /* renamed from: j */
    public final View.OnClickListener f43304j;

    /* renamed from: k */
    public final View.OnFocusChangeListener f43305k;

    /* renamed from: l */
    public AnimatorSet f43306l;

    /* renamed from: m */
    public ValueAnimator f43307m;

    /* renamed from: o.ra3$a */
    public class C16578a extends AnimatorListenerAdapter {
        public C16578a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ra3.this.f51558b.b0(true);
        }
    }

    /* renamed from: o.ra3$b */
    public class C16579b extends AnimatorListenerAdapter {
        public C16579b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ra3.this.f51558b.b0(false);
        }
    }

    public ra3(C11154a c11154a) {
        super(c11154a);
        this.f43304j = new View.OnClickListener() { // from class: o.pa3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39696a.m46457G(view);
            }
        };
        this.f43305k = new View.OnFocusChangeListener() { // from class: o.qa3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f41527a.m46458H(view, z);
            }
        };
        this.f43299e = umb.m51785f(c11154a.getContext(), x5e.motionDurationShort3, 100);
        this.f43300f = umb.m51785f(c11154a.getContext(), x5e.motionDurationShort3, Opcodes.FCMPG);
        this.f43301g = umb.m51786g(c11154a.getContext(), x5e.motionEasingLinearInterpolator, gh0.f25146a);
        this.f43302h = umb.m51786g(c11154a.getContext(), x5e.motionEasingEmphasizedInterpolator, gh0.f25149d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m46455E(ValueAnimator valueAnimator) {
        this.f51560d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m46456F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f51560d.setScaleX(fFloatValue);
        this.f51560d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m46457G(View view) {
        EditText editText = this.f43303i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        m54035r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m46458H(View view, boolean z) {
        m46465A(m46469J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m46459I() {
        m46465A(true);
    }

    /* renamed from: A */
    public final void m46465A(boolean z) {
        boolean z2 = this.f51558b.m15402G() == z;
        if (z && !this.f43306l.isRunning()) {
            this.f43307m.cancel();
            this.f43306l.start();
            if (z2) {
                this.f43306l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f43306l.cancel();
        this.f43307m.start();
        if (z2) {
            this.f43307m.end();
        }
    }

    /* renamed from: B */
    public final ValueAnimator m46466B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f43301g);
        valueAnimatorOfFloat.setDuration(this.f43299e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oa3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37995a.m46455E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* renamed from: C */
    public final ValueAnimator m46467C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f43302h);
        valueAnimatorOfFloat.setDuration(this.f43300f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.na3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f36609a.m46456F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* renamed from: D */
    public final void m46468D() {
        ValueAnimator valueAnimatorM46467C = m46467C();
        ValueAnimator valueAnimatorM46466B = m46466B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43306l = animatorSet;
        animatorSet.playTogether(valueAnimatorM46467C, valueAnimatorM46466B);
        this.f43306l.addListener(new C16578a());
        ValueAnimator valueAnimatorM46466B2 = m46466B(1.0f, 0.0f);
        this.f43307m = valueAnimatorM46466B2;
        valueAnimatorM46466B2.addListener(new C16579b());
    }

    /* renamed from: J */
    public final boolean m46469J() {
        EditText editText = this.f43303i;
        return editText != null && (editText.hasFocus() || this.f51560d.hasFocus()) && this.f43303i.getText().length() > 0;
    }

    @Override // p001o.w76
    /* renamed from: a */
    public void mo24009a(Editable editable) {
        if (this.f51558b.m15439x() != null) {
            return;
        }
        m46465A(m46469J());
    }

    @Override // p001o.w76
    /* renamed from: c */
    public int mo24010c() {
        return v9e.clear_text_end_icon_content_description;
    }

    @Override // p001o.w76
    /* renamed from: d */
    public int mo24011d() {
        return u7e.mtrl_ic_cancel;
    }

    @Override // p001o.w76
    /* renamed from: e */
    public View.OnFocusChangeListener mo24012e() {
        return this.f43305k;
    }

    @Override // p001o.w76
    /* renamed from: f */
    public View.OnClickListener mo24013f() {
        return this.f43304j;
    }

    @Override // p001o.w76
    /* renamed from: g */
    public View.OnFocusChangeListener mo46470g() {
        return this.f43305k;
    }

    @Override // p001o.w76
    /* renamed from: n */
    public void mo24020n(EditText editText) {
        this.f43303i = editText;
        this.f51557a.setEndIconVisible(m46469J());
    }

    @Override // p001o.w76
    /* renamed from: q */
    public void mo46471q(boolean z) {
        if (this.f51558b.m15439x() == null) {
            return;
        }
        m46465A(z);
    }

    @Override // p001o.w76
    /* renamed from: s */
    public void mo24023s() {
        m46468D();
    }

    @Override // p001o.w76
    /* renamed from: u */
    public void mo24025u() {
        EditText editText = this.f43303i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: o.ma3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35038a.m46459I();
                }
            });
        }
    }
}
