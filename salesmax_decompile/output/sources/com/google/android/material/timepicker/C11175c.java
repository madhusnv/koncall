package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import p001o.c64;
import p001o.cc;
import p001o.ta3;
import p001o.v9e;
import p001o.zlh;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes3.dex */
public class C11175c implements ClockHandView.InterfaceC11161c, TimePickerView.InterfaceC11172f, TimePickerView.InterfaceC11171e, ClockHandView.InterfaceC11160b, zlh {

    /* renamed from: f */
    public static final String[] f13217f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g */
    public static final String[] f13218g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: h */
    public static final String[] f13219h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a */
    public final TimePickerView f13220a;

    /* renamed from: b */
    public final TimeModel f13221b;

    /* renamed from: c */
    public float f13222c;

    /* renamed from: d */
    public float f13223d;

    /* renamed from: e */
    public boolean f13224e = false;

    /* renamed from: com.google.android.material.timepicker.c$a */
    public class a extends ta3 {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // p001o.ta3, p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.s0(view.getResources().getString(C11175c.this.f13221b.m15526c(), String.valueOf(C11175c.this.f13221b.m15527d())));
        }
    }

    /* renamed from: com.google.android.material.timepicker.c$b */
    public class b extends ta3 {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // p001o.ta3, p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.s0(view.getResources().getString(v9e.material_minute_suffix, String.valueOf(C11175c.this.f13221b.f13208e)));
        }
    }

    public C11175c(TimePickerView timePickerView, TimeModel timeModel) {
        this.f13220a = timePickerView;
        this.f13221b = timeModel;
        m15564i();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC11160b
    /* renamed from: a */
    public void mo15501a(float f, boolean z) {
        this.f13224e = true;
        TimeModel timeModel = this.f13221b;
        int i = timeModel.f13208e;
        int i2 = timeModel.f13207d;
        if (timeModel.f13209f == 10) {
            this.f13220a.m15545L(this.f13223d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) c64.getSystemService(this.f13220a.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                m15566k(12, true);
            }
        } else {
            int iRound = Math.round(f);
            if (!z) {
                this.f13221b.m15532j(((iRound + 15) / 30) * 5);
                this.f13222c = this.f13221b.f13208e * 6;
            }
            this.f13220a.m15545L(this.f13222c, z);
        }
        this.f13224e = false;
        m15568m();
        m15565j(i2, i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC11171e
    /* renamed from: b */
    public void mo15558b(int i) {
        this.f13221b.m15533k(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC11172f
    /* renamed from: c */
    public void mo15559c(int i) {
        m15566k(i, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC11161c
    /* renamed from: d */
    public void mo15478d(float f, boolean z) {
        if (this.f13224e || z) {
            return;
        }
        TimeModel timeModel = this.f13221b;
        int i = timeModel.f13207d;
        int i2 = timeModel.f13208e;
        int iRound = Math.round(f);
        TimeModel timeModel2 = this.f13221b;
        if (timeModel2.f13209f == 12) {
            timeModel2.m15532j((iRound + 3) / 6);
            this.f13222c = (float) Math.floor(this.f13221b.f13208e * 6);
        } else {
            int i3 = (iRound + 15) / 30;
            if (timeModel2.f13206c == 1) {
                i3 %= 12;
                if (this.f13220a.m15541G() == 2) {
                    i3 += 12;
                }
            }
            this.f13221b.m15530h(i3);
            this.f13223d = m15563h();
        }
        m15568m();
        m15565j(i, i2);
    }

    @Override // p001o.zlh
    /* renamed from: e */
    public void mo15561e() {
        this.f13220a.setVisibility(8);
    }

    /* renamed from: g */
    public final String[] m15562g() {
        return this.f13221b.f13206c == 1 ? f13218g : f13217f;
    }

    /* renamed from: h */
    public final int m15563h() {
        return (this.f13221b.m15527d() * 30) % 360;
    }

    /* renamed from: i */
    public void m15564i() {
        if (this.f13221b.f13206c == 0) {
            this.f13220a.m15555V();
        }
        this.f13220a.m15540F(this);
        this.f13220a.m15551R(this);
        this.f13220a.m15550Q(this);
        this.f13220a.m15548O(this);
        m15569n();
        invalidate();
    }

    @Override // p001o.zlh
    public void invalidate() {
        this.f13223d = m15563h();
        TimeModel timeModel = this.f13221b;
        this.f13222c = timeModel.f13208e * 6;
        m15566k(timeModel.f13209f, false);
        m15568m();
    }

    /* renamed from: j */
    public final void m15565j(int i, int i2) {
        TimeModel timeModel = this.f13221b;
        if (timeModel.f13208e == i2 && timeModel.f13207d == i) {
            return;
        }
        this.f13220a.performHapticFeedback(4);
    }

    /* renamed from: k */
    public void m15566k(int i, boolean z) {
        boolean z2 = i == 12;
        this.f13220a.m15543J(z2);
        this.f13221b.f13209f = i;
        this.f13220a.m15553T(z2 ? f13219h : m15562g(), z2 ? v9e.material_minute_suffix : this.f13221b.m15526c());
        m15567l();
        this.f13220a.m15545L(z2 ? this.f13222c : this.f13223d, z);
        this.f13220a.m15542I(i);
        this.f13220a.m15547N(new a(this.f13220a.getContext(), v9e.material_hour_selection));
        this.f13220a.m15546M(new b(this.f13220a.getContext(), v9e.material_minute_selection));
    }

    /* renamed from: l */
    public final void m15567l() {
        TimeModel timeModel = this.f13221b;
        int i = 1;
        if (timeModel.f13209f == 10 && timeModel.f13206c == 1 && timeModel.f13207d >= 12) {
            i = 2;
        }
        this.f13220a.m15544K(i);
    }

    /* renamed from: m */
    public final void m15568m() {
        TimePickerView timePickerView = this.f13220a;
        TimeModel timeModel = this.f13221b;
        timePickerView.m15557X(timeModel.f13210g, timeModel.m15527d(), this.f13221b.f13208e);
    }

    /* renamed from: n */
    public final void m15569n() {
        m15570o(f13217f, "%d");
        m15570o(f13218g, "%d");
        m15570o(f13219h, "%02d");
    }

    /* renamed from: o */
    public final void m15570o(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.m15524b(this.f13220a.getResources(), strArr[i], str);
        }
    }

    @Override // p001o.zlh
    public void show() {
        this.f13220a.setVisibility(0);
    }
}
