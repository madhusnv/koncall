package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.common.api.Api;
import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import p001o.ap6;
import p001o.bkh;
import p001o.cc;
import p001o.ebe;
import p001o.fy5;
import p001o.gh0;
import p001o.gza;
import p001o.hf9;
import p001o.km5;
import p001o.lk0;
import p001o.nsh;
import p001o.pae;
import p001o.pza;
import p001o.r6e;
import p001o.tq;
import p001o.umb;
import p001o.v9e;
import p001o.wvi;
import p001o.wxi;
import p001o.x5e;
import p001o.x6e;
import p001o.xy5;
import p001o.xzi;
import p001o.ykf;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L, T> extends View {
    public static final String I1 = "BaseSlider";
    public static final int J1 = pae.Widget_MaterialComponents_Slider;
    public static final int K1 = x5e.motionDurationMedium4;
    public static final int L1 = x5e.motionDurationShort3;
    public static final int M1 = x5e.motionEasingEmphasizedInterpolator;
    public static final int N1 = x5e.motionEasingEmphasizedAccelerateInterpolator;
    public int A0;
    public List A1;
    public int B0;
    public float B1;
    public int C0;
    public int C1;
    public int D0;
    public final int D1;
    public int E0;
    public final ViewTreeObserver.OnScrollChangedListener E1;
    public Drawable F0;
    public final ViewTreeObserver.OnGlobalLayoutListener F1;
    public boolean G0;
    public final Runnable G1;

    /* renamed from: H */
    public final List f12903H;
    public Drawable H0;
    public boolean H1;
    public boolean I0;
    public ColorStateList J0;
    public Drawable K0;

    /* renamed from: L */
    public final List f12904L;
    public boolean L0;

    /* renamed from: M */
    public boolean f12905M;
    public Drawable M0;
    public boolean N0;
    public ColorStateList O0;
    public int P0;

    /* renamed from: Q */
    public ValueAnimator f12906Q;
    public int Q0;
    public int R0;
    public float S0;
    public float T0;
    public MotionEvent U0;
    public boolean V0;
    public float W0;
    public float X0;
    public ArrayList Y0;
    public int Z0;

    /* renamed from: a */
    public final Paint f12907a;
    public int a1;

    /* renamed from: b */
    public final Paint f12908b;
    public float b1;

    /* renamed from: c */
    public final Paint f12909c;
    public float[] c1;

    /* renamed from: d */
    public final Paint f12910d;
    public int d1;

    /* renamed from: e */
    public final Paint f12911e;
    public int e1;

    /* renamed from: f */
    public final Paint f12912f;
    public int f1;

    /* renamed from: g */
    public final Paint f12913g;
    public int g1;

    /* renamed from: h */
    public final C11103c f12914h;
    public ValueAnimator h0;
    public boolean h1;
    public final int i0;
    public boolean i1;
    public int j0;
    public boolean j1;
    public int k0;
    public ColorStateList k1;
    public int l0;
    public ColorStateList l1;
    public int m0;
    public ColorStateList m1;
    public int n0;
    public ColorStateList n1;
    public int o0;
    public ColorStateList o1;
    public int p0;
    public final Path p1;

    /* renamed from: q */
    public final AccessibilityManager f12915q;
    public int q0;
    public final RectF q1;
    public int r0;
    public final RectF r1;

    /* renamed from: s */
    public RunnableC11102b f12916s;
    public int s0;
    public final RectF s1;
    public int t0;
    public final RectF t1;
    public int u0;
    public final Rect u1;
    public int v0;
    public final RectF v1;
    public int w0;
    public final Rect w1;

    /* renamed from: x */
    public int f12917x;
    public int x0;
    public final Matrix x1;

    /* renamed from: y */
    public final List f12918y;
    public int y0;
    public final zya y1;
    public int z0;
    public Drawable z1;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C11100a();

        /* renamed from: a */
        public float f12919a;

        /* renamed from: b */
        public float f12920b;

        /* renamed from: c */
        public ArrayList f12921c;

        /* renamed from: d */
        public float f12922d;

        /* renamed from: e */
        public boolean f12923e;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        public class C11100a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, C11101a c11101a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f12919a);
            parcel.writeFloat(this.f12920b);
            parcel.writeList(this.f12921c);
            parcel.writeFloat(this.f12922d);
            parcel.writeBooleanArray(new boolean[]{this.f12923e});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f12919a = parcel.readFloat();
            this.f12920b = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f12921c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f12922d = parcel.readFloat();
            this.f12923e = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C11101a extends AnimatorListenerAdapter {
        public C11101a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            wxi wxiVarM57074j = xzi.m57074j(BaseSlider.this);
            Iterator it = BaseSlider.this.f12918y.iterator();
            while (it.hasNext()) {
                wxiVarM57074j.mo53594b((nsh) it.next());
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public static class C11103c extends ap6 {

        /* renamed from: q */
        public final BaseSlider f12927q;

        /* renamed from: r */
        public final Rect f12928r;

        public C11103c(BaseSlider baseSlider) {
            super(baseSlider);
            this.f12928r = new Rect();
            this.f12927q = baseSlider;
        }

        @Override // p001o.ap6
        /* renamed from: B */
        public int mo14398B(float f, float f2) {
            for (int i = 0; i < this.f12927q.getValues().size(); i++) {
                this.f12927q.P0(i, this.f12928r);
                if (this.f12928r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // p001o.ap6
        /* renamed from: C */
        public void mo14399C(List list) {
            for (int i = 0; i < this.f12927q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p001o.ap6
        /* renamed from: L */
        public boolean mo14400L(int i, int i2, Bundle bundle) {
            if (!this.f12927q.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f12927q.N0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f12927q.Q0();
                        this.f12927q.postInvalidate();
                        m17597E(i);
                        return true;
                    }
                }
                return false;
            }
            float fM15104t = this.f12927q.m15104t(20);
            if (i2 == 8192) {
                fM15104t = -fM15104t;
            }
            if (this.f12927q.i0()) {
                fM15104t = -fM15104t;
            }
            if (!this.f12927q.N0(i, pza.m44555a(this.f12927q.getValues().get(i).floatValue() + fM15104t, this.f12927q.getValueFrom(), this.f12927q.getValueTo()))) {
                return false;
            }
            this.f12927q.setActiveThumbIndex(i);
            this.f12927q.G0();
            this.f12927q.Q0();
            this.f12927q.postInvalidate();
            m17597E(i);
            return true;
        }

        @Override // p001o.ap6
        /* renamed from: P */
        public void mo14402P(int i, cc ccVar) {
            ccVar.m20778b(cc.C12624a.f17782L);
            List<Float> values = this.f12927q.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.f12927q.getValueFrom();
            float valueTo = this.f12927q.getValueTo();
            if (this.f12927q.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    ccVar.m20777a(8192);
                }
                if (fFloatValue < valueTo) {
                    ccVar.m20777a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                String unused2 = BaseSlider.I1;
                String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", Float.valueOf(fFloatValue), Float.valueOf(valueFrom), Float.valueOf(valueTo));
            }
            ccVar.M0(cc.C12630g.m20833a(1, valueFrom, valueTo, fFloatValue));
            ccVar.o0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f12927q.getContentDescription() != null) {
                sb.append(this.f12927q.getContentDescription());
                sb.append(",");
            }
            String strM15084N = this.f12927q.m15084N(fFloatValue);
            String string = this.f12927q.getContext().getString(v9e.material_slider_value);
            if (values.size() > 1) {
                string = m15114Y(i);
            }
            sb.append(String.format(Locale.getDefault(), "%s, %s", string, strM15084N));
            ccVar.s0(sb.toString());
            this.f12927q.P0(i, this.f12928r);
            ccVar.j0(this.f12928r);
        }

        /* renamed from: Y */
        public final String m15114Y(int i) {
            return i == this.f12927q.getValues().size() + (-1) ? this.f12927q.getContext().getString(v9e.material_slider_range_end) : i == 0 ? this.f12927q.getContext().getString(v9e.material_slider_range_start) : "";
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    public enum EnumC11104d {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.sliderStyle);
    }

    /* renamed from: P */
    public static float m15059P(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    public static boolean e0(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = this.f12918y.iterator();
        while (it.hasNext()) {
            ((nsh) it.next()).L0(fFloatValue);
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0() {
        setActiveThumbIndex(-1);
        invalidate();
    }

    /* renamed from: A */
    public final float m15071A(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.v0) / this.g1;
        float f3 = this.W0;
        return (f2 * (f3 - this.X0)) + f3;
    }

    public boolean A0() {
        if (this.Z0 != -1) {
            return true;
        }
        float fM15092W = m15092W();
        float fJ1 = j1(fM15092W);
        this.Z0 = 0;
        float fAbs = Math.abs(((Float) this.Y0.get(0)).floatValue() - fM15092W);
        for (int i = 1; i < this.Y0.size(); i++) {
            float fAbs2 = Math.abs(((Float) this.Y0.get(i)).floatValue() - fM15092W);
            float fJ12 = j1(((Float) this.Y0.get(i)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z = i0() || l0() ? fJ12 - fJ1 > 0.0f : fJ12 - fJ1 < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.Z0 = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fJ12 - fJ1) < this.i0) {
                        this.Z0 = -1;
                        return false;
                    }
                    if (z) {
                        this.Z0 = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.Z0 != -1;
    }

    /* renamed from: B */
    public final void m15072B(int i) {
        Iterator it = this.f12903H.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            ((Float) this.Y0.get(i)).floatValue();
            throw null;
        }
        AccessibilityManager accessibilityManager = this.f12915q;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        F0(i);
    }

    public final void B0(int i, int i2) {
        float[] fArrM15085O = m15085O();
        int i3 = this.v0;
        float f = i3 + (fArrM15085O[0] * i);
        if (f <= i3) {
            this.r1.setEmpty();
            return;
        }
        RectF rectF = this.r1;
        float trackCornerSize = i3 - getTrackCornerSize();
        float f2 = i2;
        int i4 = this.u0;
        rectF.set(trackCornerSize, f2 - (i4 / 2.0f), f - this.z0, f2 + (i4 / 2.0f));
    }

    /* renamed from: C */
    public final void m15073C() {
        Iterator it = this.f12903H.iterator();
        while (it.hasNext()) {
            tq.m50332a(it.next());
            Iterator it2 = this.Y0.iterator();
            if (it2.hasNext()) {
                ((Float) it2.next()).floatValue();
                throw null;
            }
        }
    }

    public final void C0(int i, int i2) {
        float[] fArrM15085O = m15085O();
        float f = this.v0 + (fArrM15085O[1] * i);
        if (f >= r1 + i) {
            this.s1.setEmpty();
        } else {
            float f2 = i2;
            this.s1.set(f + this.z0, f2 - (this.u0 / 2.0f), r1 + i + getTrackCornerSize(), f2 + (this.u0 / 2.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m15074D(Canvas canvas, int i, int i2) {
        int i3;
        float[] fArrM15085O = m15085O();
        int i4 = this.v0;
        float f = i;
        float f2 = i4 + (fArrM15085O[1] * f);
        float fJ1 = i4 + (fArrM15085O[0] * f);
        if (fJ1 >= f2) {
            this.q1.setEmpty();
            return;
        }
        EnumC11104d enumC11104d = EnumC11104d.NONE;
        if (this.Y0.size() == 1) {
            enumC11104d = (i0() || l0()) ? EnumC11104d.RIGHT : EnumC11104d.LEFT;
        }
        for (int i5 = 0; i5 < this.Y0.size(); i5++) {
            if (this.Y0.size() > 1) {
                if (i5 > 0) {
                    fJ1 = j1(((Float) this.Y0.get(i5 - 1)).floatValue());
                }
                float fJ12 = j1(((Float) this.Y0.get(i5)).floatValue());
                if (i0() || l0()) {
                    f2 = fJ1;
                    fJ1 = fJ12;
                } else {
                    f2 = fJ12;
                }
            }
            int trackCornerSize = getTrackCornerSize();
            int iOrdinal = enumC11104d.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fJ1 += this.z0;
                    f2 += trackCornerSize;
                } else if (iOrdinal == 3) {
                    i3 = this.z0;
                    fJ1 += i3;
                }
                if (fJ1 < f2) {
                    this.q1.setEmpty();
                } else {
                    RectF rectF = this.q1;
                    float f3 = i2;
                    int i6 = this.u0;
                    rectF.set(fJ1, f3 - (i6 / 2.0f), f2, f3 + (i6 / 2.0f));
                    X0(canvas, this.f12908b, this.q1, trackCornerSize, enumC11104d);
                }
            } else {
                fJ1 -= trackCornerSize;
                i3 = this.z0;
            }
            f2 -= i3;
            if (fJ1 < f2) {
            }
        }
    }

    public final void D0(nsh nshVar, float f) {
        m15101q(nshVar, f);
        if (l0()) {
            RectF rectF = new RectF(this.u1);
            this.x1.mapRect(rectF);
            rectF.round(this.u1);
        }
        km5.m35903c(xzi.m57073i(this), this, this.u1);
        nshVar.setBounds(this.u1);
    }

    /* renamed from: E */
    public final void m15075E(Canvas canvas, int i, int i2) {
        C0(i, i2);
        X0(canvas, this.f12907a, this.s1, getTrackCornerSize(), EnumC11104d.RIGHT);
        B0(i, i2);
        X0(canvas, this.f12907a, this.r1, getTrackCornerSize(), EnumC11104d.LEFT);
    }

    public final void E0(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.Slider, i, J1, new int[0]);
        setOrientation(typedArrayM19305i.getInt(ebe.Slider_android_orientation, 0));
        this.f12917x = typedArrayM19305i.getResourceId(ebe.Slider_labelStyle, pae.Widget_MaterialComponents_Tooltip);
        this.W0 = typedArrayM19305i.getFloat(ebe.Slider_android_valueFrom, 0.0f);
        this.X0 = typedArrayM19305i.getFloat(ebe.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.W0));
        this.b1 = typedArrayM19305i.getFloat(ebe.Slider_android_stepSize, 0.0f);
        this.p0 = (int) Math.ceil(typedArrayM19305i.getDimension(ebe.Slider_minTouchTargetSize, (float) Math.ceil(xzi.m57071g(getContext(), 48))));
        boolean zHasValue = typedArrayM19305i.hasValue(ebe.Slider_trackColor);
        int i2 = zHasValue ? ebe.Slider_trackColor : ebe.Slider_trackColorInactive;
        int i3 = zHasValue ? ebe.Slider_trackColor : ebe.Slider_trackColorActive;
        ColorStateList colorStateListM58494a = yya.m58494a(context, typedArrayM19305i, i2);
        if (colorStateListM58494a == null) {
            colorStateListM58494a = lk0.m37352a(context, r6e.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateListM58494a);
        ColorStateList colorStateListM58494a2 = yya.m58494a(context, typedArrayM19305i, i3);
        if (colorStateListM58494a2 == null) {
            colorStateListM58494a2 = lk0.m37352a(context, r6e.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateListM58494a2);
        this.y1.g0(yya.m58494a(context, typedArrayM19305i, ebe.Slider_thumbColor));
        if (typedArrayM19305i.hasValue(ebe.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(yya.m58494a(context, typedArrayM19305i, ebe.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayM19305i.getDimension(ebe.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListM58494a3 = yya.m58494a(context, typedArrayM19305i, ebe.Slider_haloColor);
        if (colorStateListM58494a3 == null) {
            colorStateListM58494a3 = lk0.m37352a(context, r6e.material_slider_halo_color);
        }
        setHaloTintList(colorStateListM58494a3);
        this.d1 = typedArrayM19305i.hasValue(ebe.Slider_tickVisibilityMode) ? typedArrayM19305i.getInt(ebe.Slider_tickVisibilityMode, -1) : m15107w(typedArrayM19305i.getBoolean(ebe.Slider_tickVisible, true));
        boolean zHasValue2 = typedArrayM19305i.hasValue(ebe.Slider_tickColor);
        int i4 = zHasValue2 ? ebe.Slider_tickColor : ebe.Slider_tickColorInactive;
        int i5 = zHasValue2 ? ebe.Slider_tickColor : ebe.Slider_tickColorActive;
        ColorStateList colorStateListM58494a4 = yya.m58494a(context, typedArrayM19305i, i4);
        if (colorStateListM58494a4 == null) {
            colorStateListM58494a4 = lk0.m37352a(context, r6e.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateListM58494a4);
        ColorStateList colorStateListM58494a5 = yya.m58494a(context, typedArrayM19305i, i5);
        if (colorStateListM58494a5 == null) {
            colorStateListM58494a5 = lk0.m37352a(context, r6e.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateListM58494a5);
        setThumbTrackGapSize(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(yya.m58498e(context, typedArrayM19305i, ebe.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(yya.m58498e(context, typedArrayM19305i, ebe.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(yya.m58494a(context, typedArrayM19305i, ebe.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(yya.m58498e(context, typedArrayM19305i, ebe.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(yya.m58498e(context, typedArrayM19305i, ebe.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(yya.m58494a(context, typedArrayM19305i, ebe.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayM19305i.getDimensionPixelSize(ebe.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayM19305i.getDimensionPixelSize(ebe.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayM19305i.getDimensionPixelSize(ebe.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_haloRadius, 0));
        setThumbElevation(typedArrayM19305i.getDimension(ebe.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_tickRadiusActive, this.C0 / 2));
        setTickInactiveRadius(typedArrayM19305i.getDimensionPixelSize(ebe.Slider_tickRadiusInactive, this.C0 / 2));
        setLabelBehavior(typedArrayM19305i.getInt(ebe.Slider_labelBehavior, 0));
        if (!typedArrayM19305i.getBoolean(ebe.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayM19305i.recycle();
    }

    /* renamed from: F */
    public final void m15076F(Canvas canvas, float f, float f2) {
        if (l0()) {
            canvas.drawPoint(f2, f, this.f12913g);
        } else {
            canvas.drawPoint(f, f2, this.f12913g);
        }
    }

    public final void F0(int i) {
        RunnableC11102b runnableC11102b = this.f12916s;
        if (runnableC11102b == null) {
            this.f12916s = new RunnableC11102b(this, null);
        } else {
            removeCallbacks(runnableC11102b);
        }
        this.f12916s.m15113a(i);
        postDelayed(this.f12916s, 200L);
    }

    /* renamed from: G */
    public final void m15077G(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (l0()) {
            canvas.concat(this.x1);
        }
        canvas.translate((this.v0 + ((int) (w0(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public void G0() {
        removeCallbacks(this.G1);
        postDelayed(this.G1, this.D1);
    }

    /* renamed from: H */
    public final void m15078H(Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.Y0.size(); i3++) {
            float fFloatValue = ((Float) this.Y0.get(i3)).floatValue();
            Drawable drawable = this.z1;
            if (drawable != null) {
                m15077G(canvas, i, i2, fFloatValue, drawable);
            } else if (i3 < this.A1.size()) {
                m15077G(canvas, i, i2, fFloatValue, (Drawable) this.A1.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.v0 + (w0(fFloatValue) * i), i2, getThumbRadius(), this.f12909c);
                }
                m15077G(canvas, i, i2, fFloatValue, this.y1);
            }
        }
    }

    public final void H0(nsh nshVar, float f) {
        nshVar.M0(m15084N(f));
        D0(nshVar, f);
        xzi.m57074j(this).mo53593a(nshVar);
    }

    /* renamed from: I */
    public final void m15079I(Canvas canvas, RectF rectF, Drawable drawable) {
        if (l0()) {
            this.x1.mapRect(rectF);
        }
        rectF.round(this.w1);
        drawable.setBounds(this.w1);
        drawable.draw(canvas);
    }

    public final void I0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.Y0.size() == arrayList.size() && this.Y0.equals(arrayList)) {
            return;
        }
        this.Y0 = arrayList;
        this.j1 = true;
        this.a1 = 0;
        Q0();
        m15109y();
        m15073C();
        postInvalidate();
    }

    /* renamed from: J */
    public final void m15080J(Canvas canvas, RectF rectF, RectF rectF2) {
        if (m15095Z()) {
            this.Y0.size();
            m15098n(canvas, rectF, this.F0, true);
            m15098n(canvas, rectF2, this.K0, true);
            m15098n(canvas, rectF, this.H0, false);
            m15098n(canvas, rectF2, this.M0, false);
        }
    }

    public final boolean J0() {
        return this.t0 == 3;
    }

    /* renamed from: K */
    public final void m15081K() {
        if (!this.f12905M) {
            this.f12905M = true;
            ValueAnimator valueAnimatorM15108x = m15108x(true);
            this.f12906Q = valueAnimatorM15108x;
            this.h0 = null;
            valueAnimatorM15108x.start();
        }
        Iterator it = this.f12918y.iterator();
        for (int i = 0; i < this.Y0.size() && it.hasNext(); i++) {
            if (i != this.a1) {
                H0((nsh) it.next(), ((Float) this.Y0.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f12918y.size()), Integer.valueOf(this.Y0.size())));
        }
        H0((nsh) it.next(), ((Float) this.Y0.get(this.a1)).floatValue());
    }

    public final boolean K0() {
        return this.h1 || !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: L */
    public final void m15082L() {
        if (this.f12905M) {
            this.f12905M = false;
            ValueAnimator valueAnimatorM15108x = m15108x(false);
            this.h0 = valueAnimatorM15108x;
            this.f12906Q = null;
            valueAnimatorM15108x.addListener(new C11101a());
            this.h0.start();
        }
    }

    public final boolean L0(float f) {
        return N0(this.Z0, f);
    }

    /* renamed from: M */
    public final void m15083M(int i) {
        if (i == 1) {
            u0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        if (i == 2) {
            u0(Integer.MIN_VALUE);
        } else if (i == 17) {
            v0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            if (i != 66) {
                return;
            }
            v0(Integer.MIN_VALUE);
        }
    }

    public final double M0(float f) {
        float f2 = this.b1;
        if (f2 <= 0.0f) {
            return f;
        }
        return Math.round(f * r0) / ((int) ((this.X0 - this.W0) / f2));
    }

    /* renamed from: N */
    public final String m15084N(float f) {
        if (mo15094Y()) {
            throw null;
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final boolean N0(int i, float f) {
        this.a1 = i;
        if (Math.abs(f - ((Float) this.Y0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.Y0.set(i, Float.valueOf(m15086Q(i, f)));
        m15072B(i);
        return true;
    }

    /* renamed from: O */
    public final float[] m15085O() {
        float fFloatValue = ((Float) this.Y0.get(0)).floatValue();
        ArrayList arrayList = this.Y0;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.Y0.size() == 1) {
            fFloatValue = this.W0;
        }
        float fW0 = w0(fFloatValue);
        float fW02 = w0(fFloatValue2);
        return (i0() || l0()) ? new float[]{fW02, fW0} : new float[]{fW0, fW02};
    }

    public final boolean O0() {
        return L0(m15091V());
    }

    public void P0(int i, Rect rect) {
        int iW0 = this.v0 + ((int) (w0(getValues().get(i).floatValue()) * this.g1));
        int iM15105u = m15105u();
        int iMax = Math.max(this.w0 / 2, this.p0 / 2);
        int iMax2 = Math.max(this.x0 / 2, this.p0 / 2);
        RectF rectF = new RectF(iW0 - iMax, iM15105u - iMax2, iW0 + iMax, iM15105u + iMax2);
        if (l0()) {
            this.x1.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* renamed from: Q */
    public final float m15086Q(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.C1 == 0) {
            minSeparation = m15071A(minSeparation);
        }
        if (i0() || l0()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return pza.m44555a(f, i3 < 0 ? this.W0 : ((Float) this.Y0.get(i3)).floatValue() + minSeparation, i2 >= this.Y0.size() ? this.X0 : ((Float) this.Y0.get(i2)).floatValue() - minSeparation);
    }

    public final void Q0() {
        if (K0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fW0 = (w0(((Float) this.Y0.get(this.a1)).floatValue()) * this.g1) + this.v0;
            int iM15105u = m15105u();
            int i = this.y0;
            float[] fArr = {fW0 - i, iM15105u - i, fW0 + i, iM15105u + i};
            if (l0()) {
                this.x1.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    /* renamed from: R */
    public final int m15087R(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final void R0() {
        float f;
        boolean zL0 = l0();
        boolean zI0 = i0();
        float f2 = 0.5f;
        if (zL0 && zI0) {
            f = 0.5f;
            f2 = -0.2f;
        } else {
            f = 1.2f;
            if (zL0) {
                f2 = 1.2f;
                f = 0.5f;
            }
        }
        Iterator it = this.f12918y.iterator();
        while (it.hasNext()) {
            ((nsh) it.next()).J0(f2, f);
        }
    }

    /* renamed from: S */
    public final float[] m15088S(float f, float f2) {
        return l0() ? new float[]{f, f, f, f, f2, f2, f2, f2} : new float[]{f, f, f2, f2, f2, f2, f, f};
    }

    public final void S0() {
        R0();
        int i = this.t0;
        if (i == 0 || i == 1) {
            if (this.Z0 == -1 || !isEnabled()) {
                m15082L();
                return;
            } else {
                m15081K();
                return;
            }
        }
        if (i == 2) {
            m15082L();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.t0);
        }
        if (isEnabled() && j0()) {
            m15081K();
        } else {
            m15082L();
        }
    }

    /* renamed from: T */
    public final int m15089T() {
        return (int) (((this.X0 - this.W0) / this.b1) + 1.0f);
    }

    public final void T0() {
        float fM15105u = m15105u();
        this.x1.reset();
        this.x1.setRotate(90.0f, fM15105u, fM15105u);
    }

    /* renamed from: U */
    public final int m15090U() {
        return (this.g1 / this.o0) + 1;
    }

    public final void U0() {
        if (m15093X()) {
            int i = this.w0;
            this.A0 = i;
            this.B0 = this.z0;
            int iRound = Math.round(i * 0.5f);
            int i2 = this.w0 - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.z0 - (i2 / 2));
        }
    }

    /* renamed from: V */
    public final float m15091V() {
        double dM0 = M0(this.B1);
        if (i0() || l0()) {
            dM0 = 1.0d - dM0;
        }
        float f = this.X0;
        return (float) ((dM0 * (f - r3)) + this.W0);
    }

    public final void V0() {
        e1();
        int iMin = 0;
        if (this.b1 <= 0.0f) {
            W0(0);
            return;
        }
        int i = this.d1;
        if (i == 0) {
            iMin = Math.min(m15089T(), m15090U());
        } else if (i == 1) {
            int iM15089T = m15089T();
            if (iM15089T <= m15090U()) {
                iMin = iM15089T;
            }
        } else if (i != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.d1);
        }
        W0(iMin);
    }

    /* renamed from: W */
    public final float m15092W() {
        float f = this.B1;
        if (i0() || l0()) {
            f = 1.0f - f;
        }
        float f2 = this.X0;
        float f3 = this.W0;
        return (f * (f2 - f3)) + f3;
    }

    public final void W0(int i) {
        if (i == 0) {
            this.c1 = null;
            return;
        }
        float[] fArr = this.c1;
        if (fArr == null || fArr.length != i * 2) {
            this.c1 = new float[i * 2];
        }
        float f = this.g1 / (i - 1);
        float fM15105u = m15105u();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.c1;
            fArr2[i2] = this.v0 + ((i2 / 2.0f) * f);
            fArr2[i2 + 1] = fM15105u;
        }
        if (l0()) {
            this.x1.mapPoints(this.c1);
        }
    }

    /* renamed from: X */
    public final boolean m15093X() {
        return this.z0 > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(Canvas canvas, Paint paint, RectF rectF, float f, EnumC11104d enumC11104d) {
        int i;
        if (rectF.isEmpty()) {
            return;
        }
        float fM15102r = m15102r(f);
        float fM15099o = m15099o(f);
        int iOrdinal = enumC11104d.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                fM15102r = this.E0;
            } else if (iOrdinal == 3) {
                i = this.E0;
                fM15102r = i;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (m15093X()) {
                paint.setAntiAlias(true);
            }
            RectF rectF2 = new RectF(rectF);
            if (l0()) {
                this.x1.mapRect(rectF2);
            }
            this.p1.reset();
            if (rectF.width() < fM15102r + fM15099o) {
                this.p1.addRoundRect(rectF2, m15088S(fM15102r, fM15099o), Path.Direction.CW);
                canvas.drawPath(this.p1, paint);
                return;
            }
            float fMin = Math.min(fM15102r, fM15099o);
            float fMax = Math.max(fM15102r, fM15099o);
            canvas.save();
            this.p1.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.p1);
            int iOrdinal2 = enumC11104d.ordinal();
            if (iOrdinal2 == 1) {
                RectF rectF3 = this.t1;
                float f2 = rectF.left;
                rectF3.set(f2, rectF.top, (2.0f * fMax) + f2, rectF.bottom);
            } else if (iOrdinal2 != 2) {
                this.t1.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF4 = this.t1;
                float f3 = rectF.right;
                rectF4.set(f3 - (2.0f * fMax), rectF.top, f3, rectF.bottom);
            }
            if (l0()) {
                this.x1.mapRect(this.t1);
            }
            canvas.drawRoundRect(this.t1, fMax, fMax, paint);
            canvas.restore();
            return;
        }
        i = this.E0;
        fM15099o = i;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (m15093X()) {
        }
        RectF rectF22 = new RectF(rectF);
        if (l0()) {
        }
        this.p1.reset();
        if (rectF.width() < fM15102r + fM15099o) {
        }
    }

    /* renamed from: Y */
    public boolean mo15094Y() {
        return false;
    }

    public final void Y0() {
        Drawable drawable = this.H0;
        if (drawable != null) {
            if (!this.I0 && this.J0 != null) {
                this.H0 = fy5.m27744r(drawable).mutate();
                this.I0 = true;
            }
            if (this.I0) {
                this.H0.setTintList(this.J0);
            }
        }
    }

    /* renamed from: Z */
    public final boolean m15095Z() {
        return (this.F0 == null && this.H0 == null && this.K0 == null && this.M0 == null) ? false : true;
    }

    public final void Z0() {
        Drawable drawable = this.F0;
        if (drawable != null) {
            if (!this.G0 && this.J0 != null) {
                this.F0 = fy5.m27744r(drawable).mutate();
                this.G0 = true;
            }
            if (this.G0) {
                this.F0.setTintList(this.J0);
            }
        }
    }

    public final Drawable a0(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m15096l(drawableNewDrawable);
        return drawableNewDrawable;
    }

    public final void a1() {
        Drawable drawable = this.M0;
        if (drawable != null) {
            if (!this.N0 && this.O0 != null) {
                this.M0 = fy5.m27744r(drawable).mutate();
                this.N0 = true;
            }
            if (this.N0) {
                this.M0.setTintList(this.O0);
            }
        }
    }

    public final void b0() {
        this.f12907a.setStrokeWidth(this.u0);
        this.f12908b.setStrokeWidth(this.u0);
    }

    public final void b1() {
        Drawable drawable = this.K0;
        if (drawable != null) {
            if (!this.L0 && this.O0 != null) {
                this.K0 = fy5.m27744r(drawable).mutate();
                this.L0 = true;
            }
            if (this.L0) {
                this.K0.setTintList(this.O0);
            }
        }
    }

    public final boolean c0() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final void c1(int i) {
        this.g1 = Math.max(i - (this.v0 * 2), 0);
        V0();
    }

    public final boolean d0() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final void d1(boolean z) {
        boolean zT0 = t0();
        boolean zS0 = s0();
        if (l0()) {
            T0();
        }
        if (zT0 || z) {
            requestLayout();
        } else if (zS0) {
            postInvalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f12914h.m17620v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12907a.setColor(m15087R(this.o1));
        this.f12908b.setColor(m15087R(this.n1));
        this.f12911e.setColor(m15087R(this.m1));
        this.f12912f.setColor(m15087R(this.l1));
        this.f12913g.setColor(m15087R(this.m1));
        for (nsh nshVar : this.f12918y) {
            if (nshVar.isStateful()) {
                nshVar.setState(getDrawableState());
            }
        }
        if (this.y1.isStateful()) {
            this.y1.setState(getDrawableState());
        }
        this.f12910d.setColor(m15087R(this.k1));
        this.f12910d.setAlpha(63);
    }

    public final void e1() {
        if (this.j1) {
            h1();
            g1();
            f1();
            k1();
            this.j1 = false;
        }
    }

    public final boolean f0(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.b1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final void f1() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
        }
        float f = this.b1;
        if (f <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.C1 != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.b1)));
        }
        if (minSeparation < f || !f0(minSeparation)) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.b1), Float.valueOf(this.b1)));
        }
    }

    public final boolean g0(MotionEvent motionEvent) {
        return !e0(motionEvent) && c0();
    }

    public final void g1() {
        if (this.b1 > 0.0f && !i1(this.X0)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.b1), Float.valueOf(this.W0), Float.valueOf(this.X0)));
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f12914h.m17622x();
    }

    public int getActiveThumbIndex() {
        return this.Z0;
    }

    public int getFocusedThumbIndex() {
        return this.a1;
    }

    public int getHaloRadius() {
        return this.y0;
    }

    public ColorStateList getHaloTintList() {
        return this.k1;
    }

    public int getLabelBehavior() {
        return this.t0;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.b1;
    }

    public float getThumbElevation() {
        return this.y1.m60095A();
    }

    public int getThumbHeight() {
        return this.x0;
    }

    public int getThumbRadius() {
        return this.w0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.y1.m60104J();
    }

    public float getThumbStrokeWidth() {
        return this.y1.m60106L();
    }

    public ColorStateList getThumbTintList() {
        return this.y1.m60096B();
    }

    public int getThumbTrackGapSize() {
        return this.z0;
    }

    public int getThumbWidth() {
        return this.w0;
    }

    public int getTickActiveRadius() {
        return this.e1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.l1;
    }

    public int getTickInactiveRadius() {
        return this.f1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.m1;
    }

    public ColorStateList getTickTintList() {
        if (this.m1.equals(this.l1)) {
            return this.l1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.d1;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.n1;
    }

    public int getTrackCornerSize() {
        int i = this.D0;
        return i == -1 ? this.u0 / 2 : i;
    }

    public int getTrackHeight() {
        return this.u0;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.J0;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.H0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.F0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.O0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.M0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.K0;
    }

    public int getTrackIconSize() {
        return this.P0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.o1;
    }

    public int getTrackInsideCornerSize() {
        return this.E0;
    }

    public int getTrackSidePadding() {
        return this.v0;
    }

    public int getTrackStopIndicatorSize() {
        return this.C0;
    }

    public ColorStateList getTrackTintList() {
        if (this.o1.equals(this.n1)) {
            return this.n1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.g1;
    }

    public float getValueFrom() {
        return this.W0;
    }

    public float getValueTo() {
        return this.X0;
    }

    public List<Float> getValues() {
        return new ArrayList(this.Y0);
    }

    public final boolean h0(MotionEvent motionEvent) {
        return !e0(motionEvent) && d0();
    }

    public final void h1() {
        if (this.W0 >= this.X0) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.W0), Float.valueOf(this.X0)));
        }
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            Float f = (Float) it.next();
            if (f.floatValue() < this.W0 || f.floatValue() > this.X0) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f, Float.valueOf(this.W0), Float.valueOf(this.X0)));
            }
            if (this.b1 > 0.0f && !i1(f.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f, Float.valueOf(this.W0), Float.valueOf(this.b1), Float.valueOf(this.b1)));
            }
        }
    }

    public final boolean i0() {
        return getLayoutDirection() == 1;
    }

    public final boolean i1(float f) {
        return f0(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.W0)), MathContext.DECIMAL64).doubleValue());
    }

    public final boolean j0() {
        Rect rect = new Rect();
        xzi.m57073i(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && k0();
    }

    public final float j1(float f) {
        return (w0(f) * this.g1) + this.v0;
    }

    public final boolean k0() {
        return this.H1;
    }

    public final void k1() {
        float f = this.b1;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f));
        }
        float f2 = this.W0;
        if (((int) f2) != f2) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2));
        }
        float f3 = this.X0;
        if (((int) f3) != f3) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3));
        }
    }

    /* renamed from: l */
    public final void m15096l(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.w0, this.x0);
        } else {
            float fMax = Math.max(this.w0, this.x0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final boolean l0() {
        return this.q0 == 1;
    }

    /* renamed from: m */
    public final void m15097m(nsh nshVar) {
        nshVar.K0(xzi.m57073i(this));
    }

    /* renamed from: n */
    public final void m15098n(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            m15106v(rectF, this.v1, this.P0, this.Q0, z);
            if (this.v1.isEmpty()) {
                return;
            }
            m15079I(canvas, this.v1, drawable);
        }
    }

    /* renamed from: o */
    public final float m15099o(float f) {
        if (this.Y0.isEmpty() || !m15093X()) {
            return f;
        }
        float fJ1 = j1(((Float) this.Y0.get((i0() || l0()) ? 0 : this.Y0.size() - 1)).floatValue()) - this.v0;
        int i = this.g1;
        return fJ1 > ((float) i) - f ? Math.max(i - fJ1, this.E0) : f;
    }

    public final void o0(Resources resources) throws Resources.NotFoundException {
        this.r0 = resources.getDimensionPixelSize(x6e.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(x6e.mtrl_slider_track_side_padding);
        this.j0 = dimensionPixelOffset;
        this.v0 = dimensionPixelOffset;
        this.k0 = resources.getDimensionPixelSize(x6e.mtrl_slider_thumb_radius);
        this.l0 = resources.getDimensionPixelSize(x6e.mtrl_slider_track_height);
        this.m0 = resources.getDimensionPixelSize(x6e.mtrl_slider_tick_radius);
        this.n0 = resources.getDimensionPixelSize(x6e.mtrl_slider_tick_radius);
        this.o0 = resources.getDimensionPixelSize(x6e.mtrl_slider_tick_min_spacing);
        this.R0 = resources.getDimensionPixelSize(x6e.mtrl_slider_label_padding);
        this.Q0 = resources.getDimensionPixelOffset(x6e.m3_slider_track_icon_padding);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.E1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.F1);
        Iterator it = this.f12918y.iterator();
        while (it.hasNext()) {
            m15097m((nsh) it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        RunnableC11102b runnableC11102b = this.f12916s;
        if (runnableC11102b != null) {
            removeCallbacks(runnableC11102b);
        }
        this.f12905M = false;
        Iterator it = this.f12918y.iterator();
        while (it.hasNext()) {
            m15110z((nsh) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.E1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.F1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.j1) {
            e1();
            V0();
        }
        super.onDraw(canvas);
        int iM15105u = m15105u();
        m15075E(canvas, this.g1, iM15105u);
        m15074D(canvas, this.g1, iM15105u);
        if (i0() || l0()) {
            m15080J(canvas, this.q1, this.r1);
        } else {
            m15080J(canvas, this.q1, this.s1);
        }
        r0(canvas);
        q0(canvas, iM15105u);
        if ((this.V0 || isFocused()) && isEnabled()) {
            p0(canvas, this.g1, iM15105u);
        }
        S0();
        m15078H(canvas, this.g1, iM15105u);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            m15083M(i);
            this.f12914h.m17609V(this.a1);
        } else {
            this.Z0 = -1;
            this.f12914h.m17613o(this.a1);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.Y0.size() == 1) {
            this.Z0 = 0;
        }
        if (this.Z0 == -1) {
            Boolean boolX0 = x0(i, keyEvent);
            return boolX0 != null ? boolX0.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.i1 |= keyEvent.isLongPress();
        Float fM15100p = m15100p(i);
        if (fM15100p != null) {
            if (L0(((Float) this.Y0.get(this.Z0)).floatValue() + fM15100p.floatValue())) {
                Q0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return u0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return u0(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.Z0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.i1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.s0 + ((this.t0 == 1 || J0()) ? ((nsh) this.f12918y.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (l0()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.W0 = sliderState.f12919a;
        this.X0 = sliderState.f12920b;
        I0(sliderState.f12921c);
        this.b1 = sliderState.f12922d;
        if (sliderState.f12923e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f12919a = this.W0;
        sliderState.f12920b = this.X0;
        sliderState.f12921c = new ArrayList(this.Y0);
        sliderState.f12922d = this.b1;
        sliderState.f12923e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (l0()) {
            i = i2;
        }
        c1(i);
        Q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (!isEnabled()) {
            return false;
        }
        float y = l0() ? motionEvent.getY() : motionEvent.getX();
        float x = l0() ? motionEvent.getX() : motionEvent.getY();
        float f = (y - this.v0) / this.g1;
        this.B1 = f;
        float fMax = Math.max(0.0f, f);
        this.B1 = fMax;
        this.B1 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S0 = y;
            this.T0 = x;
            if ((l0() || !h0(motionEvent)) && (!l0() || !g0(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (A0()) {
                    requestFocus();
                    this.V0 = true;
                    U0();
                    y0();
                    O0();
                    Q0();
                    invalidate();
                }
            }
        } else if (actionMasked == 1) {
            this.V0 = false;
            MotionEvent motionEvent2 = this.U0;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.U0.getX() - motionEvent.getX()) <= this.i0 && Math.abs(this.U0.getY() - motionEvent.getY()) <= this.i0 && A0()) {
                y0();
            }
            if (this.Z0 != -1) {
                O0();
                Q0();
                if (m15093X() && (i = this.A0) != -1 && this.B0 != -1) {
                    setThumbWidth(i);
                    setThumbTrackGapSize(this.B0);
                }
                this.Z0 = -1;
                z0();
            }
            invalidate();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
            }
        } else if (this.V0) {
            O0();
            Q0();
            invalidate();
        } else {
            if (!l0() && h0(motionEvent) && Math.abs(y - this.S0) < this.i0) {
                return false;
            }
            if (l0() && g0(motionEvent) && Math.abs(x - this.T0) < this.i0 * 0.8f) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            if (A0()) {
                this.V0 = true;
                U0();
                y0();
                O0();
                Q0();
                invalidate();
            }
        }
        setPressed(this.V0);
        this.U0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.H1 = z;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        wxi wxiVarM57074j;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (wxiVarM57074j = xzi.m57074j(this)) == null) {
            return;
        }
        Iterator it = this.f12918y.iterator();
        while (it.hasNext()) {
            wxiVarM57074j.mo53594b((nsh) it.next());
        }
    }

    /* renamed from: p */
    public final Float m15100p(int i) {
        float fM15104t = this.i1 ? m15104t(20) : m15103s();
        if (i == 69) {
            return Float.valueOf(-fM15104t);
        }
        if (i == 70 || i == 81) {
            return Float.valueOf(fM15104t);
        }
        switch (i) {
            case 19:
                if (l0()) {
                    return Float.valueOf(fM15104t);
                }
                return null;
            case 20:
                if (l0()) {
                    return Float.valueOf(-fM15104t);
                }
                return null;
            case 21:
                if (!i0()) {
                    fM15104t = -fM15104t;
                }
                return Float.valueOf(fM15104t);
            case 22:
                if (i0()) {
                    fM15104t = -fM15104t;
                }
                return Float.valueOf(fM15104t);
            default:
                return null;
        }
    }

    public final void p0(Canvas canvas, int i, int i2) {
        if (K0()) {
            float[] fArr = {this.v0 + (w0(((Float) this.Y0.get(this.a1)).floatValue()) * i), i2};
            if (l0()) {
                this.x1.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f = fArr[0];
                int i3 = this.y0;
                float f2 = fArr[1];
                canvas.clipRect(f - i3, f2 - i3, f + i3, f2 + i3, Region.Op.UNION);
            }
            canvas.drawCircle(fArr[0], fArr[1], this.y0, this.f12910d);
        }
    }

    /* renamed from: q */
    public final void m15101q(nsh nshVar, float f) {
        int iW0;
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicWidth2;
        if (!l0() || i0()) {
            iW0 = (this.v0 + ((int) (w0(f) * this.g1))) - (nshVar.getIntrinsicWidth() / 2);
            intrinsicWidth = nshVar.getIntrinsicWidth() + iW0;
            int iM15105u = m15105u() - (this.R0 + (this.x0 / 2));
            intrinsicHeight = iM15105u - nshVar.getIntrinsicHeight();
            intrinsicWidth2 = iM15105u;
        } else {
            iW0 = (this.v0 + ((int) (w0(f) * this.g1))) - (nshVar.getIntrinsicHeight() / 2);
            intrinsicWidth = nshVar.getIntrinsicHeight() + iW0;
            intrinsicHeight = m15105u() + this.R0 + (this.x0 / 2);
            intrinsicWidth2 = nshVar.getIntrinsicWidth() + intrinsicHeight;
        }
        this.u1.set(iW0, intrinsicHeight, intrinsicWidth, intrinsicWidth2);
    }

    public final void q0(Canvas canvas, int i) {
        if (this.C0 <= 0 || this.Y0.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.Y0;
        float fFloatValue = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f = this.X0;
        if (fFloatValue < f) {
            m15076F(canvas, j1(f), i);
        }
        if (this.Y0.size() > 1) {
            float fFloatValue2 = ((Float) this.Y0.get(0)).floatValue();
            float f2 = this.W0;
            if (fFloatValue2 > f2) {
                m15076F(canvas, j1(f2), i);
            }
        }
    }

    /* renamed from: r */
    public final float m15102r(float f) {
        if (this.Y0.isEmpty() || !m15093X()) {
            return f;
        }
        float fJ1 = j1(((Float) this.Y0.get((i0() || l0()) ? this.Y0.size() - 1 : 0)).floatValue()) - this.v0;
        return fJ1 < f ? Math.max(fJ1, this.E0) : f;
    }

    public final void r0(Canvas canvas) {
        float[] fArr = this.c1;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] fArrM15085O = m15085O();
        int iCeil = (int) Math.ceil(fArrM15085O[0] * ((this.c1.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(fArrM15085O[1] * ((this.c1.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            canvas.drawPoints(this.c1, 0, iCeil * 2, this.f12911e);
        }
        if (iCeil <= iFloor) {
            canvas.drawPoints(this.c1, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.f12912f);
        }
        int i = (iFloor + 1) * 2;
        float[] fArr2 = this.c1;
        if (i < fArr2.length) {
            canvas.drawPoints(fArr2, i, fArr2.length - i, this.f12911e);
        }
    }

    /* renamed from: s */
    public final float m15103s() {
        float f = this.b1;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    public final boolean s0() {
        int iMax = this.j0 + Math.max(Math.max(Math.max((this.w0 / 2) - this.k0, 0), Math.max((this.u0 - this.l0) / 2, 0)), Math.max(Math.max(this.e1 - this.m0, 0), Math.max(this.f1 - this.n0, 0)));
        if (this.v0 == iMax) {
            return false;
        }
        this.v0 = iMax;
        if (!isLaidOut()) {
            return true;
        }
        c1(l0() ? getHeight() : getWidth());
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.Z0 = i;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.Y0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.a1 = i;
        this.f12914h.m17609V(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.y0) {
            return;
        }
        this.y0 = i;
        Drawable background = getBackground();
        if (K0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            xy5.m56954m((RippleDrawable) background, this.y0);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.k1)) {
            return;
        }
        this.k1 = colorStateList;
        Drawable background = getBackground();
        if (!K0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f12910d.setColor(m15087R(colorStateList));
        this.f12910d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            d1(true);
        }
    }

    public void setLabelFormatter(hf9 hf9Var) {
    }

    public void setOrientation(int i) {
        if (this.q0 == i) {
            return;
        }
        this.q0 = i;
        d1(true);
    }

    public void setSeparationUnit(int i) {
        this.C1 = i;
        this.j1 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.W0), Float.valueOf(this.X0)));
        }
        if (this.b1 != f) {
            this.b1 = f;
            this.j1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.y1.f0(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(int i) {
        if (i == this.x0) {
            return;
        }
        this.x0 = i;
        this.y1.setBounds(0, 0, this.w0, i);
        Drawable drawable = this.z1;
        if (drawable != null) {
            m15096l(drawable);
        }
        Iterator it = this.A1.iterator();
        while (it.hasNext()) {
            m15096l((Drawable) it.next());
        }
        d1(false);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.y1.r0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(lk0.m37352a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.y1.s0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.y1.m60096B())) {
            return;
        }
        this.y1.g0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        invalidate();
    }

    public void setThumbWidth(int i) {
        if (i == this.w0) {
            return;
        }
        this.w0 = i;
        this.y1.setShapeAppearanceModel(ykf.m57921a().m57973q(0, this.w0 / 2.0f).m57970m());
        this.y1.setBounds(0, 0, this.w0, this.x0);
        Drawable drawable = this.z1;
        if (drawable != null) {
            m15096l(drawable);
        }
        Iterator it = this.A1.iterator();
        while (it.hasNext()) {
            m15096l((Drawable) it.next());
        }
        d1(false);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(int i) {
        if (this.e1 != i) {
            this.e1 = i;
            this.f12912f.setStrokeWidth(i * 2);
            d1(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.l1)) {
            return;
        }
        this.l1 = colorStateList;
        this.f12912f.setColor(m15087R(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.f1 != i) {
            this.f1 = i;
            this.f12911e.setStrokeWidth(i * 2);
            d1(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.m1)) {
            return;
        }
        this.m1 = colorStateList;
        this.f12911e.setColor(m15087R(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.d1 != i) {
            this.d1 = i;
            postInvalidate();
        }
    }

    public void setTickVisible(boolean z) {
        setTickVisibilityMode(m15107w(z));
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.n1)) {
            return;
        }
        this.n1 = colorStateList;
        this.f12908b.setColor(m15087R(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i) {
        if (this.D0 == i) {
            return;
        }
        this.D0 = i;
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            b0();
            d1(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.J0) {
            return;
        }
        this.J0 = colorStateList;
        Z0();
        Y0();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.H0) {
            return;
        }
        this.H0 = drawable;
        this.I0 = false;
        Y0();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.F0) {
            return;
        }
        this.F0 = drawable;
        this.G0 = false;
        Z0();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.O0) {
            return;
        }
        this.O0 = colorStateList;
        b1();
        a1();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.M0) {
            return;
        }
        this.M0 = drawable;
        this.N0 = false;
        a1();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.K0) {
            return;
        }
        this.K0 = drawable;
        this.L0 = false;
        b1();
        invalidate();
    }

    public void setTrackIconSize(int i) {
        if (this.P0 == i) {
            return;
        }
        this.P0 = i;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.o1)) {
            return;
        }
        this.o1 = colorStateList;
        this.f12907a.setColor(m15087R(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.E0 == i) {
            return;
        }
        this.E0 = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.C0 == i) {
            return;
        }
        this.C0 = i;
        this.f12913g.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.W0 = f;
        this.j1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.X0 = f;
        this.j1 = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        I0(arrayList);
    }

    /* renamed from: t */
    public final float m15104t(int i) {
        float fM15103s = m15103s();
        return (this.X0 - this.W0) / fM15103s <= i ? fM15103s : Math.round(r1 / r4) * fM15103s;
    }

    public final boolean t0() {
        int paddingTop;
        int paddingBottom;
        if (l0()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingTop + paddingBottom;
        int iMax = Math.max(this.r0, Math.max(this.u0 + i, this.x0 + i));
        if (iMax == this.s0) {
            return false;
        }
        this.s0 = iMax;
        return true;
    }

    /* renamed from: u */
    public final int m15105u() {
        return (this.s0 / 2) + ((this.t0 == 1 || J0()) ? ((nsh) this.f12918y.get(0)).getIntrinsicHeight() : 0);
    }

    public final boolean u0(int i) {
        int i2 = this.a1;
        int iM44557c = (int) pza.m44557c(i2 + i, 0L, this.Y0.size() - 1);
        this.a1 = iM44557c;
        if (iM44557c == i2) {
            return false;
        }
        if (this.Z0 != -1) {
            this.Z0 = iM44557c;
        }
        Q0();
        postInvalidate();
        return true;
    }

    /* renamed from: v */
    public final void m15106v(RectF rectF, RectF rectF2, int i, int i2, boolean z) {
        if (rectF.right - rectF.left < (i2 * 2) + i) {
            rectF2.setEmpty();
            return;
        }
        float f = z ^ (i0() || l0()) ? rectF.left + i2 : (rectF.right - i2) - i;
        float f2 = i;
        float fM15105u = m15105u() - (f2 / 2.0f);
        rectF2.set(f, fM15105u, f + f2, f2 + fM15105u);
    }

    public final boolean v0(int i) {
        if (i0() || l0()) {
            i = i == Integer.MIN_VALUE ? Api.BaseClientBuilder.API_PRIORITY_OTHER : -i;
        }
        return u0(i);
    }

    /* renamed from: w */
    public final int m15107w(boolean z) {
        return z ? 0 : 2;
    }

    public final float w0(float f) {
        float f2 = this.W0;
        float f3 = (f - f2) / (this.X0 - f2);
        return (i0() || l0()) ? 1.0f - f3 : f3;
    }

    /* renamed from: x */
    public final ValueAnimator m15108x(boolean z) {
        int iM51785f;
        TimeInterpolator timeInterpolatorM51786g;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m15059P(z ? this.h0 : this.f12906Q, z ? 0.0f : 1.0f), z ? 1.0f : 0.0f);
        if (z) {
            iM51785f = umb.m51785f(getContext(), K1, 83);
            timeInterpolatorM51786g = umb.m51786g(getContext(), M1, gh0.f25150e);
        } else {
            iM51785f = umb.m51785f(getContext(), L1, Opcodes.LNEG);
            timeInterpolatorM51786g = umb.m51786g(getContext(), N1, gh0.f25148c);
        }
        valueAnimatorOfFloat.setDuration(iM51785f);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM51786g);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12934a.m0(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final Boolean x0(int i, KeyEvent keyEvent) {
        if (i == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(u0(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(u0(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    u0(-1);
                    return Boolean.TRUE;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            v0(-1);
                            break;
                        case 22:
                            v0(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            u0(1);
            return Boolean.TRUE;
        }
        this.Z0 = this.a1;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* renamed from: y */
    public final void m15109y() {
        if (this.f12918y.size() > this.Y0.size()) {
            List<nsh> listSubList = this.f12918y.subList(this.Y0.size(), this.f12918y.size());
            for (nsh nshVar : listSubList) {
                if (isAttachedToWindow()) {
                    m15110z(nshVar);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f12918y.size() >= this.Y0.size()) {
                break;
            }
            nsh nshVarD0 = nsh.D0(getContext(), null, 0, this.f12917x);
            this.f12918y.add(nshVarD0);
            if (isAttachedToWindow()) {
                m15097m(nshVarD0);
            }
        }
        int i = this.f12918y.size() != 1 ? 1 : 0;
        Iterator it = this.f12918y.iterator();
        while (it.hasNext()) {
            ((nsh) it.next()).s0(i);
        }
    }

    public final void y0() {
        Iterator it = this.f12904L.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    /* renamed from: z */
    public final void m15110z(nsh nshVar) {
        wxi wxiVarM57074j = xzi.m57074j(this);
        if (wxiVarM57074j != null) {
            wxiVarM57074j.mo53594b(nshVar);
            nshVar.F0(xzi.m57073i(this));
        }
    }

    public final void z0() {
        Iterator it = this.f12904L.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    public class RunnableC11102b implements Runnable {

        /* renamed from: a */
        public int f12925a;

        public RunnableC11102b() {
            this.f12925a = -1;
        }

        /* renamed from: a */
        public void m15113a(int i) {
            this.f12925a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f12914h.m17610W(this.f12925a, 4);
        }

        public /* synthetic */ RunnableC11102b(BaseSlider baseSlider, C11101a c11101a) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(gza.m29680d(context, attributeSet, i, J1), attributeSet, i);
        this.f12918y = new ArrayList();
        this.f12903H = new ArrayList();
        this.f12904L = new ArrayList();
        this.f12905M = false;
        this.A0 = -1;
        this.B0 = -1;
        this.G0 = false;
        this.I0 = false;
        this.L0 = false;
        this.N0 = false;
        this.V0 = false;
        this.Y0 = new ArrayList();
        this.Z0 = -1;
        this.a1 = -1;
        this.b1 = 0.0f;
        this.i1 = false;
        this.p1 = new Path();
        this.q1 = new RectF();
        this.r1 = new RectF();
        this.s1 = new RectF();
        this.t1 = new RectF();
        this.u1 = new Rect();
        this.v1 = new RectF();
        this.w1 = new Rect();
        this.x1 = new Matrix();
        zya zyaVar = new zya();
        this.y1 = zyaVar;
        this.A1 = Collections.emptyList();
        this.C1 = 0;
        this.E1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f12931a.S0();
            }
        };
        this.F1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f12932a.S0();
            }
        };
        this.G1 = new Runnable() { // from class: com.google.android.material.slider.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f12933a.n0();
            }
        };
        Context context2 = getContext();
        this.H1 = isShown();
        this.f12907a = new Paint();
        this.f12908b = new Paint();
        Paint paint = new Paint(1);
        this.f12909c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f12910d = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f12911e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.f12912f = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = new Paint();
        this.f12913g = paint5;
        paint5.setStyle(Paint.Style.FILL);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        o0(context2.getResources());
        E0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        zyaVar.n0(2);
        this.i0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        C11103c c11103c = new C11103c(this);
        this.f12914h = c11103c;
        wvi.m0(this, c11103c);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f12915q = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.D1 = accessibilityManager.getRecommendedTimeoutMillis(TransferRecord.MAXIMUM_UPLOAD_PARTS, 6);
        } else {
            this.D1 = 120000;
        }
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.z1 = a0(drawable);
        this.A1.clear();
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        I0(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.z1 = null;
        this.A1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.A1.add(a0(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }
}
