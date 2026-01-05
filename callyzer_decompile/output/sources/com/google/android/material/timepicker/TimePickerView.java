package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c6.v0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import m5.C4656j;
import m5.C4657k;
import m5.C4661o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: s */
    public static final /* synthetic */ int f7005s = 0;

    /* renamed from: r */
    public final MaterialButtonToggleGroup f7006r;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC1370g viewOnClickListenerC1370g = new ViewOnClickListenerC1370g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f7006r = materialButtonToggleGroup;
        materialButtonToggleGroup.f6801d.add(new C1371h());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ViewOnTouchListenerC1373j viewOnTouchListenerC1373j = new ViewOnTouchListenerC1373j(new GestureDetector(getContext(), new C1372i(this)));
        chip.setOnTouchListener(viewOnTouchListenerC1373j);
        chip2.setOnTouchListener(viewOnTouchListenerC1373j);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC1370g);
        chip2.setOnClickListener(viewOnClickListenerC1370g);
    }

    /* renamed from: e */
    public final void m4145e() {
        if (this.f7006r.getVisibility() == 0) {
            C4661o c4661o = new C4661o();
            c4661o.m9544b(this);
            Field field = v0.f5527a;
            char c2 = getLayoutDirection() == 0 ? (char) 2 : (char) 1;
            Integer numValueOf = Integer.valueOf(R.id.material_clock_display);
            HashMap map = c4661o.f23053c;
            if (map.containsKey(numValueOf)) {
                C4656j c4656j = (C4656j) map.get(Integer.valueOf(R.id.material_clock_display));
                switch (c2) {
                    case 1:
                        C4657k c4657k = c4656j.f22972d;
                        c4657k.f23008h = -1;
                        c4657k.f23007g = -1;
                        c4657k.f22977C = -1;
                        c4657k.f22983I = -1;
                        break;
                    case 2:
                        C4657k c4657k2 = c4656j.f22972d;
                        c4657k2.f23010j = -1;
                        c4657k2.f23009i = -1;
                        c4657k2.f22978D = -1;
                        c4657k2.f22985K = -1;
                        break;
                    case 3:
                        C4657k c4657k3 = c4656j.f22972d;
                        c4657k3.f23012l = -1;
                        c4657k3.f23011k = -1;
                        c4657k3.f22979E = -1;
                        c4657k3.f22984J = -1;
                        break;
                    case 4:
                        C4657k c4657k4 = c4656j.f22972d;
                        c4657k4.f23013m = -1;
                        c4657k4.f23014n = -1;
                        c4657k4.f22980F = -1;
                        c4657k4.f22986L = -1;
                        break;
                    case 5:
                        c4656j.f22972d.f23015o = -1;
                        break;
                    case 6:
                        C4657k c4657k5 = c4656j.f22972d;
                        c4657k5.f23016p = -1;
                        c4657k5.f23017q = -1;
                        c4657k5.f22982H = -1;
                        c4657k5.f22988N = -1;
                        break;
                    case 7:
                        C4657k c4657k6 = c4656j.f22972d;
                        c4657k6.f23018r = -1;
                        c4657k6.f23019s = -1;
                        c4657k6.f22981G = -1;
                        c4657k6.f22987M = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            c4661o.m9543a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4145e();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            m4145e();
        }
    }
}
