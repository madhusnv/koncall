package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;
import p001o.db;
import p001o.n8e;
import p001o.n9e;
import p001o.wvi;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    public final Chip q0;
    public final Chip r0;
    public final ClockHandView s0;
    public final ClockFaceView t0;
    public final MaterialButtonToggleGroup u0;
    public final View.OnClickListener v0;
    public InterfaceC11171e w0;
    public InterfaceC11172f x0;
    public InterfaceC11170d y0;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC11167a implements View.OnClickListener {
        public ViewOnClickListenerC11167a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.x0 != null) {
                TimePickerView.this.x0.mo15559c(((Integer) view.getTag(n8e.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C11168b extends GestureDetector.SimpleOnGestureListener {
        public C11168b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            InterfaceC11170d interfaceC11170d = TimePickerView.this.y0;
            if (interfaceC11170d == null) {
                return false;
            }
            interfaceC11170d.mo15502z();
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    public class ViewOnTouchListenerC11169c implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f13213a;

        public ViewOnTouchListenerC11169c(GestureDetector gestureDetector) {
            this.f13213a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f13213a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    public interface InterfaceC11170d {
        /* renamed from: z */
        void mo15502z();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    public interface InterfaceC11171e {
        /* renamed from: b */
        void mo15558b(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    public interface InterfaceC11172f {
        /* renamed from: c */
        void mo15559c(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m15539H(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        InterfaceC11171e interfaceC11171e;
        if (z && (interfaceC11171e = this.w0) != null) {
            interfaceC11171e.mo15558b(i == n8e.material_clock_period_pm_button ? 1 : 0);
        }
    }

    /* renamed from: F */
    public void m15540F(ClockHandView.InterfaceC11161c interfaceC11161c) {
        this.s0.m15481b(interfaceC11161c);
    }

    /* renamed from: G */
    public int m15541G() {
        return this.t0.m15472P();
    }

    /* renamed from: I */
    public void m15542I(int i) {
        m15556W(this.q0, i == 12);
        m15556W(this.r0, i == 10);
    }

    /* renamed from: J */
    public void m15543J(boolean z) {
        this.s0.m15493o(z);
    }

    /* renamed from: K */
    public void m15544K(int i) {
        this.t0.m15475T(i);
    }

    /* renamed from: L */
    public void m15545L(float f, boolean z) {
        this.s0.m15497s(f, z);
    }

    /* renamed from: M */
    public void m15546M(db dbVar) {
        wvi.m0(this.q0, dbVar);
    }

    /* renamed from: N */
    public void m15547N(db dbVar) {
        wvi.m0(this.r0, dbVar);
    }

    /* renamed from: O */
    public void m15548O(ClockHandView.InterfaceC11160b interfaceC11160b) {
        this.s0.m15500v(interfaceC11160b);
    }

    /* renamed from: P */
    public void m15549P(InterfaceC11170d interfaceC11170d) {
        this.y0 = interfaceC11170d;
    }

    /* renamed from: Q */
    public void m15550Q(InterfaceC11171e interfaceC11171e) {
        this.w0 = interfaceC11171e;
    }

    /* renamed from: R */
    public void m15551R(InterfaceC11172f interfaceC11172f) {
        this.x0 = interfaceC11172f;
    }

    /* renamed from: S */
    public final void m15552S() {
        this.q0.setTag(n8e.selection_type, 12);
        this.r0.setTag(n8e.selection_type, 10);
        this.q0.setOnClickListener(this.v0);
        this.r0.setOnClickListener(this.v0);
        this.q0.setAccessibilityClassName("android.view.View");
        this.r0.setAccessibilityClassName("android.view.View");
    }

    /* renamed from: T */
    public void m15553T(String[] strArr, int i) {
        this.t0.m15476U(strArr, i);
    }

    /* renamed from: U */
    public final void m15554U() {
        ViewOnTouchListenerC11169c viewOnTouchListenerC11169c = new ViewOnTouchListenerC11169c(new GestureDetector(getContext(), new C11168b()));
        this.q0.setOnTouchListener(viewOnTouchListenerC11169c);
        this.r0.setOnTouchListener(viewOnTouchListenerC11169c);
    }

    /* renamed from: V */
    public void m15555V() {
        this.u0.setVisibility(0);
    }

    /* renamed from: W */
    public final void m15556W(Chip chip, boolean z) {
        chip.setChecked(z);
        chip.setAccessibilityLiveRegion(z ? 2 : 0);
    }

    /* renamed from: X */
    public void m15557X(int i, int i2, int i3) {
        this.u0.m14257r(i == 1 ? n8e.material_clock_period_pm_button : n8e.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i3));
        String str2 = String.format(locale, "%02d", Integer.valueOf(i2));
        if (!TextUtils.equals(this.q0.getText(), str)) {
            this.q0.setText(str);
        }
        if (TextUtils.equals(this.r0.getText(), str2)) {
            return;
        }
        this.r0.setText(str2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.r0.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v0 = new ViewOnClickListenerC11167a();
        LayoutInflater.from(context).inflate(n9e.material_timepicker, this);
        this.t0 = (ClockFaceView) findViewById(n8e.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(n8e.material_clock_period_toggle);
        this.u0 = materialButtonToggleGroup;
        materialButtonToggleGroup.m14256q(new MaterialButtonToggleGroup.InterfaceC10981b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC10981b
            /* renamed from: a */
            public final void mo14266a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                this.f13251a.m15539H(materialButtonToggleGroup2, i2, z);
            }
        });
        this.q0 = (Chip) findViewById(n8e.material_minute_tv);
        this.r0 = (Chip) findViewById(n8e.material_hour_tv);
        this.s0 = (ClockHandView) findViewById(n8e.material_clock_hand);
        m15554U();
        m15552S();
    }
}
