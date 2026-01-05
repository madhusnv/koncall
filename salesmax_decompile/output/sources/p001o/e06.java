package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.C11154a;

/* loaded from: classes3.dex */
public class e06 extends w76 {

    /* renamed from: e */
    public final int f20687e;

    /* renamed from: f */
    public final int f20688f;

    /* renamed from: g */
    public final TimeInterpolator f20689g;

    /* renamed from: h */
    public AutoCompleteTextView f20690h;

    /* renamed from: i */
    public final View.OnClickListener f20691i;

    /* renamed from: j */
    public final View.OnFocusChangeListener f20692j;

    /* renamed from: k */
    public final AccessibilityManager.TouchExplorationStateChangeListener f20693k;

    /* renamed from: l */
    public boolean f20694l;

    /* renamed from: m */
    public boolean f20695m;

    /* renamed from: n */
    public boolean f20696n;

    /* renamed from: o */
    public long f20697o;

    /* renamed from: p */
    public AccessibilityManager f20698p;

    /* renamed from: q */
    public ValueAnimator f20699q;

    /* renamed from: r */
    public ValueAnimator f20700r;

    /* renamed from: o.e06$a */
    public class C13067a extends AnimatorListenerAdapter {
        public C13067a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e06.this.m54035r();
            e06.this.f20700r.start();
        }
    }

    public e06(C11154a c11154a) {
        super(c11154a);
        this.f20691i = new View.OnClickListener() { // from class: o.xz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54496a.m23992J(view);
            }
        };
        this.f20692j = new View.OnFocusChangeListener() { // from class: o.yz5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f56319a.m23993K(view, z);
            }
        };
        this.f20693k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.zz5
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f57926a.m23994L(z);
            }
        };
        this.f20697o = Long.MAX_VALUE;
        this.f20688f = umb.m51785f(c11154a.getContext(), x5e.motionDurationShort3, 67);
        this.f20687e = umb.m51785f(c11154a.getContext(), x5e.motionDurationShort3, 50);
        this.f20689g = umb.m51786g(c11154a.getContext(), x5e.motionEasingLinearInterpolator, gh0.f25146a);
    }

    /* renamed from: D */
    public static AutoCompleteTextView m23989D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m23990H() {
        boolean zIsPopupShowing = this.f20690h.isPopupShowing();
        m24005O(zIsPopupShowing);
        this.f20695m = zIsPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m23991I(ValueAnimator valueAnimator) {
        this.f51560d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m23992J(View view) {
        m24007Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m23993K(View view, boolean z) {
        this.f20694l = z;
        m54035r();
        if (z) {
            return;
        }
        m24005O(false);
        this.f20695m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m23994L(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.f20690h;
        if (autoCompleteTextView == null || f46.m26047a(autoCompleteTextView)) {
            return;
        }
        this.f51560d.setImportantForAccessibility(z ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ boolean m23995M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (m24004G()) {
                this.f20695m = false;
            }
            m24007Q();
            m24008R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m23996N() {
        m24008R();
        m24005O(false);
    }

    /* renamed from: E */
    public final ValueAnimator m24002E(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f20689g);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.a06
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14005a.m23991I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* renamed from: F */
    public final void m24003F() {
        this.f20700r = m24002E(this.f20688f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorM24002E = m24002E(this.f20687e, 1.0f, 0.0f);
        this.f20699q = valueAnimatorM24002E;
        valueAnimatorM24002E.addListener(new C13067a());
    }

    /* renamed from: G */
    public final boolean m24004G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f20697o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    /* renamed from: O */
    public final void m24005O(boolean z) {
        if (this.f20696n != z) {
            this.f20696n = z;
            this.f20700r.cancel();
            this.f20699q.start();
        }
    }

    /* renamed from: P */
    public final void m24006P() {
        this.f20690h.setOnTouchListener(new View.OnTouchListener() { // from class: o.c06
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f17046a.m23995M(view, motionEvent);
            }
        });
        this.f20690h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.d06
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                this.f18927a.m23996N();
            }
        });
        this.f20690h.setThreshold(0);
    }

    /* renamed from: Q */
    public final void m24007Q() {
        if (this.f20690h == null) {
            return;
        }
        if (m24004G()) {
            this.f20695m = false;
        }
        if (this.f20695m) {
            this.f20695m = false;
            return;
        }
        m24005O(!this.f20696n);
        if (!this.f20696n) {
            this.f20690h.dismissDropDown();
        } else {
            this.f20690h.requestFocus();
            this.f20690h.showDropDown();
        }
    }

    /* renamed from: R */
    public final void m24008R() {
        this.f20695m = true;
        this.f20697o = SystemClock.uptimeMillis();
    }

    @Override // p001o.w76
    /* renamed from: a */
    public void mo24009a(Editable editable) {
        if (this.f20698p.isTouchExplorationEnabled() && f46.m26047a(this.f20690h) && !this.f51560d.hasFocus()) {
            this.f20690h.dismissDropDown();
        }
        this.f20690h.post(new Runnable() { // from class: o.b06
            @Override // java.lang.Runnable
            public final void run() {
                this.f15425a.m23990H();
            }
        });
    }

    @Override // p001o.w76
    /* renamed from: c */
    public int mo24010c() {
        return v9e.exposed_dropdown_menu_content_description;
    }

    @Override // p001o.w76
    /* renamed from: d */
    public int mo24011d() {
        return u7e.mtrl_dropdown_arrow;
    }

    @Override // p001o.w76
    /* renamed from: e */
    public View.OnFocusChangeListener mo24012e() {
        return this.f20692j;
    }

    @Override // p001o.w76
    /* renamed from: f */
    public View.OnClickListener mo24013f() {
        return this.f20691i;
    }

    @Override // p001o.w76
    /* renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo24014h() {
        return this.f20693k;
    }

    @Override // p001o.w76
    /* renamed from: i */
    public boolean mo24015i(int i) {
        return i != 0;
    }

    @Override // p001o.w76
    /* renamed from: j */
    public boolean mo24016j() {
        return true;
    }

    @Override // p001o.w76
    /* renamed from: k */
    public boolean mo24017k() {
        return this.f20694l;
    }

    @Override // p001o.w76
    /* renamed from: l */
    public boolean mo24018l() {
        return true;
    }

    @Override // p001o.w76
    /* renamed from: m */
    public boolean mo24019m() {
        return this.f20696n;
    }

    @Override // p001o.w76
    /* renamed from: n */
    public void mo24020n(EditText editText) {
        this.f20690h = m23989D(editText);
        m24006P();
        this.f51557a.setErrorIconDrawable((Drawable) null);
        if (!f46.m26047a(editText) && this.f20698p.isTouchExplorationEnabled()) {
            this.f51560d.setImportantForAccessibility(2);
        }
        this.f51557a.setEndIconVisible(true);
    }

    @Override // p001o.w76
    /* renamed from: o */
    public void mo24021o(View view, cc ccVar) {
        if (!f46.m26047a(this.f20690h)) {
            ccVar.o0(Spinner.class.getName());
        }
        if (ccVar.m20774X()) {
            ccVar.B0(null);
        }
    }

    @Override // p001o.w76
    /* renamed from: p */
    public void mo24022p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f20698p.isEnabled() || f46.m26047a(this.f20690h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f20696n && !this.f20690h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m24007Q();
            m24008R();
        }
    }

    @Override // p001o.w76
    /* renamed from: s */
    public void mo24023s() {
        m24003F();
        this.f20698p = (AccessibilityManager) this.f51559c.getSystemService("accessibility");
    }

    @Override // p001o.w76
    /* renamed from: t */
    public boolean mo24024t() {
        return true;
    }

    @Override // p001o.w76
    /* renamed from: u */
    public void mo24025u() {
        AutoCompleteTextView autoCompleteTextView = this.f20690h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f20690h.setOnDismissListener(null);
        }
    }
}
