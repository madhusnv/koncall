package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;
import p001o.bkh;
import p001o.ebe;
import p001o.fy5;
import p001o.gua;
import p001o.gue;
import p001o.lh1;
import p001o.lk0;
import p001o.mgh;
import p001o.nc2;
import p001o.ni3;
import p001o.smb;
import p001o.xy5;
import p001o.xzi;
import p001o.ygh;
import p001o.yya;
import p001o.zya;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes3.dex */
public class C11001a extends zya implements Drawable.Callback, ygh.InterfaceC18403b {
    public static final int[] F1 = {R.attr.state_enabled};
    public static final ShapeDrawable G1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public WeakReference A1;
    public ColorStateList B0;
    public TextUtils.TruncateAt B1;
    public CharSequence C0;
    public boolean C1;
    public boolean D0;
    public int D1;
    public Drawable E0;
    public boolean E1;
    public ColorStateList F0;
    public float G0;
    public boolean H0;
    public boolean I0;
    public Drawable J0;
    public Drawable K0;
    public ColorStateList L0;
    public float M0;
    public CharSequence N0;
    public boolean O0;
    public boolean P0;
    public Drawable Q0;
    public ColorStateList R0;
    public smb S0;
    public smb T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;
    public float a1;
    public float b1;
    public final Context c1;
    public final Paint d1;
    public final Paint e1;
    public final Paint.FontMetrics f1;
    public final RectF g1;
    public final PointF h1;
    public final Path i1;
    public final ygh j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public boolean q1;
    public int r1;
    public int s1;
    public ColorFilter t1;
    public PorterDuffColorFilter u1;
    public ColorStateList v0;
    public ColorStateList v1;
    public ColorStateList w0;
    public PorterDuff.Mode w1;
    public float x0;
    public int[] x1;
    public float y0;
    public boolean y1;
    public ColorStateList z0;
    public ColorStateList z1;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* renamed from: a */
        void mo14380a();
    }

    public C11001a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.y0 = -1.0f;
        this.d1 = new Paint(1);
        this.f1 = new Paint.FontMetrics();
        this.g1 = new RectF();
        this.h1 = new PointF();
        this.i1 = new Path();
        this.s1 = Constants.MAX_HOST_LENGTH;
        this.w1 = PorterDuff.Mode.SRC_IN;
        this.A1 = new WeakReference(null);
        m60115U(context);
        this.c1 = context;
        ygh yghVar = new ygh(this);
        this.j1 = yghVar;
        this.C0 = "";
        yghVar.m57789g().density = context.getResources().getDisplayMetrics().density;
        this.e1 = null;
        int[] iArr = F1;
        setState(iArr);
        B2(iArr);
        this.C1 = true;
        G1.setTint(-1);
    }

    public static boolean C1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean G1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean H1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean I1(mgh mghVar) {
        return (mghVar == null || mghVar.m39028j() == null || !mghVar.m39028j().isStateful()) ? false : true;
    }

    public static C11001a K0(Context context, AttributeSet attributeSet, int i, int i2) {
        C11001a c11001a = new C11001a(context, attributeSet, i, i2);
        c11001a.J1(attributeSet, i, i2);
        return c11001a;
    }

    public final void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (e3() || d3()) {
            float f = this.U0 + this.V0;
            float fP1 = p1();
            if (fy5.m27732f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fP1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fP1;
            }
            float fO1 = o1();
            float fExactCenterY = rect.exactCenterY() - (fO1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fO1;
        }
    }

    public final ColorFilter A1() {
        ColorFilter colorFilter = this.t1;
        return colorFilter != null ? colorFilter : this.u1;
    }

    public void A2(int i) {
        z2(this.c1.getResources().getDimension(i));
    }

    public float B0() {
        if (e3() || d3()) {
            return this.V0 + p1() + this.W0;
        }
        return 0.0f;
    }

    public boolean B1() {
        return this.y1;
    }

    public boolean B2(int[] iArr) {
        if (Arrays.equals(this.x1, iArr)) {
            return false;
        }
        this.x1 = iArr;
        if (f3()) {
            return L1(getState(), iArr);
        }
        return false;
    }

    public final void C0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (f3()) {
            float f = this.b1 + this.a1 + this.M0 + this.Z0 + this.Y0;
            if (fy5.m27732f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void C2(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            if (f3()) {
                this.J0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f3()) {
            float f = this.b1 + this.a1;
            if (fy5.m27732f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.M0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.M0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.M0;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean D1() {
        return this.O0;
    }

    public void D2(int i) {
        C2(lk0.m37352a(this.c1, i));
    }

    public final void E0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f3()) {
            float f = this.b1 + this.a1 + this.M0 + this.Z0 + this.Y0;
            if (fy5.m27732f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean E1() {
        return H1(this.J0);
    }

    public void E2(boolean z) {
        if (this.I0 != z) {
            boolean zF3 = f3();
            this.I0 = z;
            boolean zF32 = f3();
            if (zF3 != zF32) {
                if (zF32) {
                    z0(this.J0);
                } else {
                    g3(this.J0);
                }
                invalidateSelf();
                K1();
            }
        }
    }

    public float F0() {
        if (f3()) {
            return this.Z0 + this.M0 + this.a1;
        }
        return 0.0f;
    }

    public boolean F1() {
        return this.I0;
    }

    public void F2(a aVar) {
        this.A1 = new WeakReference(aVar);
    }

    public final void G0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.C0 != null) {
            float fB0 = this.U0 + B0() + this.X0;
            float fF0 = this.b1 + F0() + this.Y0;
            if (fy5.m27732f(this) == 0) {
                rectF.left = rect.left + fB0;
                rectF.right = rect.right - fF0;
            } else {
                rectF.left = rect.left + fF0;
                rectF.right = rect.right - fB0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void G2(TextUtils.TruncateAt truncateAt) {
        this.B1 = truncateAt;
    }

    public final float H0() {
        this.j1.m57789g().getFontMetrics(this.f1);
        Paint.FontMetrics fontMetrics = this.f1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void H2(smb smbVar) {
        this.T0 = smbVar;
    }

    public Paint.Align I0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.C0 != null) {
            float fB0 = this.U0 + B0() + this.X0;
            if (fy5.m27732f(this) == 0) {
                pointF.x = rect.left + fB0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fB0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - H0();
        }
        return align;
    }

    public void I2(int i) {
        H2(smb.m48547d(this.c1, i));
    }

    public final boolean J0() {
        return this.P0 && this.Q0 != null && this.O0;
    }

    public final void J1(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayM19305i = bkh.m19305i(this.c1, attributeSet, ebe.Chip, i, i2, new int[0]);
        this.E1 = typedArrayM19305i.hasValue(ebe.Chip_shapeAppearance);
        r2(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_chipSurfaceColor));
        V1(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_chipBackgroundColor));
        j2(typedArrayM19305i.getDimension(ebe.Chip_chipMinHeight, 0.0f));
        if (typedArrayM19305i.hasValue(ebe.Chip_chipCornerRadius)) {
            X1(typedArrayM19305i.getDimension(ebe.Chip_chipCornerRadius, 0.0f));
        }
        n2(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_chipStrokeColor));
        p2(typedArrayM19305i.getDimension(ebe.Chip_chipStrokeWidth, 0.0f));
        O2(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_rippleColor));
        T2(typedArrayM19305i.getText(ebe.Chip_android_text));
        mgh mghVarM58501h = yya.m58501h(this.c1, typedArrayM19305i, ebe.Chip_android_textAppearance);
        mghVarM58501h.m39032o(typedArrayM19305i.getDimension(ebe.Chip_android_textSize, mghVarM58501h.m39029k()));
        U2(mghVarM58501h);
        int i3 = typedArrayM19305i.getInt(ebe.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            G2(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            G2(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            G2(TextUtils.TruncateAt.END);
        }
        i2(typedArrayM19305i.getBoolean(ebe.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            i2(typedArrayM19305i.getBoolean(ebe.Chip_chipIconEnabled, false));
        }
        b2(yya.m58498e(this.c1, typedArrayM19305i, ebe.Chip_chipIcon));
        if (typedArrayM19305i.hasValue(ebe.Chip_chipIconTint)) {
            f2(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_chipIconTint));
        }
        d2(typedArrayM19305i.getDimension(ebe.Chip_chipIconSize, -1.0f));
        E2(typedArrayM19305i.getBoolean(ebe.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            E2(typedArrayM19305i.getBoolean(ebe.Chip_closeIconEnabled, false));
        }
        s2(yya.m58498e(this.c1, typedArrayM19305i, ebe.Chip_closeIcon));
        C2(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_closeIconTint));
        x2(typedArrayM19305i.getDimension(ebe.Chip_closeIconSize, 0.0f));
        N1(typedArrayM19305i.getBoolean(ebe.Chip_android_checkable, false));
        U1(typedArrayM19305i.getBoolean(ebe.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            U1(typedArrayM19305i.getBoolean(ebe.Chip_checkedIconEnabled, false));
        }
        P1(yya.m58498e(this.c1, typedArrayM19305i, ebe.Chip_checkedIcon));
        if (typedArrayM19305i.hasValue(ebe.Chip_checkedIconTint)) {
            R1(yya.m58494a(this.c1, typedArrayM19305i, ebe.Chip_checkedIconTint));
        }
        R2(smb.m48546c(this.c1, typedArrayM19305i, ebe.Chip_showMotionSpec));
        H2(smb.m48546c(this.c1, typedArrayM19305i, ebe.Chip_hideMotionSpec));
        l2(typedArrayM19305i.getDimension(ebe.Chip_chipStartPadding, 0.0f));
        L2(typedArrayM19305i.getDimension(ebe.Chip_iconStartPadding, 0.0f));
        J2(typedArrayM19305i.getDimension(ebe.Chip_iconEndPadding, 0.0f));
        Z2(typedArrayM19305i.getDimension(ebe.Chip_textStartPadding, 0.0f));
        W2(typedArrayM19305i.getDimension(ebe.Chip_textEndPadding, 0.0f));
        z2(typedArrayM19305i.getDimension(ebe.Chip_closeIconStartPadding, 0.0f));
        u2(typedArrayM19305i.getDimension(ebe.Chip_closeIconEndPadding, 0.0f));
        Z1(typedArrayM19305i.getDimension(ebe.Chip_chipEndPadding, 0.0f));
        N2(typedArrayM19305i.getDimensionPixelSize(ebe.Chip_android_maxWidth, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        typedArrayM19305i.recycle();
    }

    public void J2(float f) {
        if (this.W0 != f) {
            float fB0 = B0();
            this.W0 = f;
            float fB02 = B0();
            invalidateSelf();
            if (fB0 != fB02) {
                K1();
            }
        }
    }

    public void K1() {
        a aVar = (a) this.A1.get();
        if (aVar != null) {
            aVar.mo14380a();
        }
    }

    public void K2(int i) {
        J2(this.c1.getResources().getDimension(i));
    }

    public final void L0(Canvas canvas, Rect rect) {
        if (d3()) {
            A0(rect, this.g1);
            RectF rectF = this.g1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.Q0.setBounds(0, 0, (int) this.g1.width(), (int) this.g1.height());
            this.Q0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean L1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.v0;
        int iM60127p = m60127p(colorStateList != null ? colorStateList.getColorForState(iArr, this.k1) : 0);
        boolean state = true;
        if (this.k1 != iM60127p) {
            this.k1 = iM60127p;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.w0;
        int iM60127p2 = m60127p(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.l1) : 0);
        if (this.l1 != iM60127p2) {
            this.l1 = iM60127p2;
            zOnStateChange = true;
        }
        int iM29511j = gua.m29511j(iM60127p, iM60127p2);
        if ((this.m1 != iM29511j) | (m60096B() == null)) {
            this.m1 = iM29511j;
            g0(ColorStateList.valueOf(iM29511j));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.z0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.n1) : 0;
        if (this.n1 != colorForState) {
            this.n1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.z1 == null || !gue.m29520e(iArr)) ? 0 : this.z1.getColorForState(iArr, this.o1);
        if (this.o1 != colorForState2) {
            this.o1 = colorForState2;
            if (this.y1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.j1.m57787e() == null || this.j1.m57787e().m39028j() == null) ? 0 : this.j1.m57787e().m39028j().getColorForState(iArr, this.p1);
        if (this.p1 != colorForState3) {
            this.p1 = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = C1(getState(), R.attr.state_checked) && this.O0;
        if (this.q1 == z2 || this.Q0 == null) {
            z = false;
        } else {
            float fB0 = B0();
            this.q1 = z2;
            if (fB0 != B0()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.v1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.r1) : 0;
        if (this.r1 != colorForState4) {
            this.r1 = colorForState4;
            this.u1 = xy5.m56956o(this, this.v1, this.w1);
        } else {
            state = zOnStateChange;
        }
        if (H1(this.E0)) {
            state |= this.E0.setState(iArr);
        }
        if (H1(this.Q0)) {
            state |= this.Q0.setState(iArr);
        }
        if (H1(this.J0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.J0.setState(iArr3);
        }
        if (H1(this.K0)) {
            state |= this.K0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            K1();
        }
        return state;
    }

    public void L2(float f) {
        if (this.V0 != f) {
            float fB0 = B0();
            this.V0 = f;
            float fB02 = B0();
            invalidateSelf();
            if (fB0 != fB02) {
                K1();
            }
        }
    }

    public final void M0(Canvas canvas, Rect rect) {
        if (this.E1) {
            return;
        }
        this.d1.setColor(this.l1);
        this.d1.setStyle(Paint.Style.FILL);
        this.d1.setColorFilter(A1());
        this.g1.set(rect);
        canvas.drawRoundRect(this.g1, X0(), X0(), this.d1);
    }

    public boolean M1(boolean z) {
        if (this.J0 != null) {
            return B2(z ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : F1);
        }
        return false;
    }

    public void M2(int i) {
        L2(this.c1.getResources().getDimension(i));
    }

    public final void N0(Canvas canvas, Rect rect) {
        if (e3()) {
            A0(rect, this.g1);
            RectF rectF = this.g1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.E0.setBounds(0, 0, (int) this.g1.width(), (int) this.g1.height());
            this.E0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void N1(boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
            float fB0 = B0();
            if (!z && this.q1) {
                this.q1 = false;
            }
            float fB02 = B0();
            invalidateSelf();
            if (fB0 != fB02) {
                K1();
            }
        }
    }

    public void N2(int i) {
        this.D1 = i;
    }

    public final void O0(Canvas canvas, Rect rect) {
        if (this.A0 <= 0.0f || this.E1) {
            return;
        }
        this.d1.setColor(this.n1);
        this.d1.setStyle(Paint.Style.STROKE);
        if (!this.E1) {
            this.d1.setColorFilter(A1());
        }
        RectF rectF = this.g1;
        float f = rect.left;
        float f2 = this.A0;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.y0 - (this.A0 / 2.0f);
        canvas.drawRoundRect(this.g1, f3, f3, this.d1);
    }

    public void O1(int i) {
        N1(this.c1.getResources().getBoolean(i));
    }

    public void O2(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            h3();
            onStateChange(getState());
        }
    }

    public final void P0(Canvas canvas, Rect rect) {
        if (this.E1) {
            return;
        }
        this.d1.setColor(this.k1);
        this.d1.setStyle(Paint.Style.FILL);
        this.g1.set(rect);
        canvas.drawRoundRect(this.g1, X0(), X0(), this.d1);
    }

    public void P1(Drawable drawable) {
        if (this.Q0 != drawable) {
            float fB0 = B0();
            this.Q0 = drawable;
            float fB02 = B0();
            g3(this.Q0);
            z0(this.Q0);
            invalidateSelf();
            if (fB0 != fB02) {
                K1();
            }
        }
    }

    public void P2(int i) {
        O2(lk0.m37352a(this.c1, i));
    }

    public final void Q0(Canvas canvas, Rect rect) {
        if (f3()) {
            D0(rect, this.g1);
            RectF rectF = this.g1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.J0.setBounds(0, 0, (int) this.g1.width(), (int) this.g1.height());
            this.K0.setBounds(this.J0.getBounds());
            this.K0.jumpToCurrentState();
            this.K0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void Q1(int i) {
        P1(lk0.m37353b(this.c1, i));
    }

    public void Q2(boolean z) {
        this.C1 = z;
    }

    public final void R0(Canvas canvas, Rect rect) {
        this.d1.setColor(this.o1);
        this.d1.setStyle(Paint.Style.FILL);
        this.g1.set(rect);
        if (!this.E1) {
            canvas.drawRoundRect(this.g1, X0(), X0(), this.d1);
        } else {
            m60122k(new RectF(rect), this.i1);
            super.m60130t(canvas, this.d1, this.i1, m60134y());
        }
    }

    public void R1(ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            if (J0()) {
                this.Q0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void R2(smb smbVar) {
        this.S0 = smbVar;
    }

    public final void S0(Canvas canvas, Rect rect) {
        Paint paint = this.e1;
        if (paint != null) {
            paint.setColor(ni3.m40624p(-16777216, Opcodes.LAND));
            canvas.drawRect(rect, this.e1);
            if (e3() || d3()) {
                A0(rect, this.g1);
                canvas.drawRect(this.g1, this.e1);
            }
            if (this.C0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.e1);
            }
            if (f3()) {
                D0(rect, this.g1);
                canvas.drawRect(this.g1, this.e1);
            }
            this.e1.setColor(ni3.m40624p(Opcodes.V_PREVIEW, Opcodes.LAND));
            C0(rect, this.g1);
            canvas.drawRect(this.g1, this.e1);
            this.e1.setColor(ni3.m40624p(-16711936, Opcodes.LAND));
            E0(rect, this.g1);
            canvas.drawRect(this.g1, this.e1);
        }
    }

    public void S1(int i) {
        R1(lk0.m37352a(this.c1, i));
    }

    public void S2(int i) {
        R2(smb.m48547d(this.c1, i));
    }

    public final void T0(Canvas canvas, Rect rect) {
        if (this.C0 != null) {
            Paint.Align alignI0 = I0(rect, this.h1);
            G0(rect, this.g1);
            if (this.j1.m57787e() != null) {
                this.j1.m57789g().drawableState = getState();
                this.j1.m57796n(this.c1);
            }
            this.j1.m57789g().setTextAlign(alignI0);
            int iSave = 0;
            boolean z = Math.round(this.j1.m57790h(w1().toString())) > Math.round(this.g1.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.g1);
            }
            CharSequence charSequenceEllipsize = this.C0;
            if (z && this.B1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.j1.m57789g(), this.g1.width(), this.B1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.h1;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.j1.m57789g());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void T1(int i) {
        U1(this.c1.getResources().getBoolean(i));
    }

    public void T2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.C0, charSequence)) {
            return;
        }
        this.C0 = charSequence;
        this.j1.m57795m(true);
        invalidateSelf();
        K1();
    }

    public Drawable U0() {
        return this.Q0;
    }

    public void U1(boolean z) {
        if (this.P0 != z) {
            boolean zD3 = d3();
            this.P0 = z;
            boolean zD32 = d3();
            if (zD3 != zD32) {
                if (zD32) {
                    z0(this.Q0);
                } else {
                    g3(this.Q0);
                }
                invalidateSelf();
                K1();
            }
        }
    }

    public void U2(mgh mghVar) {
        this.j1.m57793k(mghVar, this.c1);
    }

    public ColorStateList V0() {
        return this.R0;
    }

    public void V1(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void V2(int i) {
        U2(new mgh(this.c1, i));
    }

    public ColorStateList W0() {
        return this.w0;
    }

    public void W1(int i) {
        V1(lk0.m37352a(this.c1, i));
    }

    public void W2(float f) {
        if (this.Y0 != f) {
            this.Y0 = f;
            invalidateSelf();
            K1();
        }
    }

    public float X0() {
        return this.E1 ? m60108N() : this.y0;
    }

    public void X1(float f) {
        if (this.y0 != f) {
            this.y0 = f;
            setShapeAppearanceModel(m60103I().m57944x(f));
        }
    }

    public void X2(int i) {
        W2(this.c1.getResources().getDimension(i));
    }

    public float Y0() {
        return this.b1;
    }

    public void Y1(int i) {
        X1(this.c1.getResources().getDimension(i));
    }

    public void Y2(float f) {
        mgh mghVarX1 = x1();
        if (mghVarX1 != null) {
            mghVarX1.m39032o(f);
            this.j1.m57789g().setTextSize(f);
            mo14045a();
        }
    }

    public Drawable Z0() {
        Drawable drawable = this.E0;
        if (drawable != null) {
            return fy5.m27743q(drawable);
        }
        return null;
    }

    public void Z1(float f) {
        if (this.b1 != f) {
            this.b1 = f;
            invalidateSelf();
            K1();
        }
    }

    public void Z2(float f) {
        if (this.X0 != f) {
            this.X0 = f;
            invalidateSelf();
            K1();
        }
    }

    @Override // p001o.ygh.InterfaceC18403b
    /* renamed from: a */
    public void mo14045a() {
        K1();
        invalidateSelf();
    }

    public float a1() {
        return this.G0;
    }

    public void a2(int i) {
        Z1(this.c1.getResources().getDimension(i));
    }

    public void a3(int i) {
        Z2(this.c1.getResources().getDimension(i));
    }

    public ColorStateList b1() {
        return this.F0;
    }

    public void b2(Drawable drawable) {
        Drawable drawableZ0 = Z0();
        if (drawableZ0 != drawable) {
            float fB0 = B0();
            this.E0 = drawable != null ? fy5.m27744r(drawable).mutate() : null;
            float fB02 = B0();
            g3(drawableZ0);
            if (e3()) {
                z0(this.E0);
            }
            invalidateSelf();
            if (fB0 != fB02) {
                K1();
            }
        }
    }

    public void b3(boolean z) {
        if (this.y1 != z) {
            this.y1 = z;
            h3();
            onStateChange(getState());
        }
    }

    public float c1() {
        return this.x0;
    }

    public void c2(int i) {
        b2(lk0.m37353b(this.c1, i));
    }

    public boolean c3() {
        return this.C1;
    }

    public float d1() {
        return this.U0;
    }

    public void d2(float f) {
        if (this.G0 != f) {
            float fB0 = B0();
            this.G0 = f;
            float fB02 = B0();
            invalidateSelf();
            if (fB0 != fB02) {
                K1();
            }
        }
    }

    public final boolean d3() {
        return this.P0 && this.Q0 != null && this.q1;
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.s1;
        int iM40311a = i < 255 ? nc2.m40311a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        P0(canvas, bounds);
        M0(canvas, bounds);
        if (this.E1) {
            super.draw(canvas);
        }
        O0(canvas, bounds);
        R0(canvas, bounds);
        N0(canvas, bounds);
        L0(canvas, bounds);
        if (this.C1) {
            T0(canvas, bounds);
        }
        Q0(canvas, bounds);
        S0(canvas, bounds);
        if (this.s1 < 255) {
            canvas.restoreToCount(iM40311a);
        }
    }

    public ColorStateList e1() {
        return this.z0;
    }

    public void e2(int i) {
        d2(this.c1.getResources().getDimension(i));
    }

    public final boolean e3() {
        return this.D0 && this.E0 != null;
    }

    public float f1() {
        return this.A0;
    }

    public void f2(ColorStateList colorStateList) {
        this.H0 = true;
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            if (e3()) {
                this.E0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean f3() {
        return this.I0 && this.J0 != null;
    }

    public Drawable g1() {
        Drawable drawable = this.J0;
        if (drawable != null) {
            return fy5.m27743q(drawable);
        }
        return null;
    }

    public void g2(int i) {
        f2(lk0.m37352a(this.c1, i));
    }

    public final void g3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s1;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.t1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.U0 + B0() + this.X0 + this.j1.m57790h(w1().toString()) + this.Y0 + F0() + this.b1), this.D1);
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.E1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.y0);
        } else {
            outline.setRoundRect(bounds, this.y0);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public CharSequence h1() {
        return this.N0;
    }

    public void h2(int i) {
        i2(this.c1.getResources().getBoolean(i));
    }

    public final void h3() {
        this.z1 = this.y1 ? gue.m29519d(this.B0) : null;
    }

    public float i1() {
        return this.a1;
    }

    public void i2(boolean z) {
        if (this.D0 != z) {
            boolean zE3 = e3();
            this.D0 = z;
            boolean zE32 = e3();
            if (zE3 != zE32) {
                if (zE32) {
                    z0(this.E0);
                } else {
                    g3(this.E0);
                }
                invalidateSelf();
                K1();
            }
        }
    }

    public final void i3() {
        this.K0 = new RippleDrawable(gue.m29519d(u1()), this.J0, G1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return G1(this.v0) || G1(this.w0) || G1(this.z0) || (this.y1 && G1(this.z1)) || I1(this.j1.m57787e()) || J0() || H1(this.E0) || H1(this.Q0) || G1(this.v1);
    }

    public float j1() {
        return this.M0;
    }

    public void j2(float f) {
        if (this.x0 != f) {
            this.x0 = f;
            invalidateSelf();
            K1();
        }
    }

    public float k1() {
        return this.Z0;
    }

    public void k2(int i) {
        j2(this.c1.getResources().getDimension(i));
    }

    public int[] l1() {
        return this.x1;
    }

    public void l2(float f) {
        if (this.U0 != f) {
            this.U0 = f;
            invalidateSelf();
            K1();
        }
    }

    public ColorStateList m1() {
        return this.L0;
    }

    public void m2(int i) {
        l2(this.c1.getResources().getDimension(i));
    }

    public void n1(RectF rectF) {
        E0(getBounds(), rectF);
    }

    public void n2(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            if (this.E1) {
                r0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final float o1() {
        Drawable drawable = this.q1 ? this.Q0 : this.E0;
        float fCeil = this.G0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(xzi.m57071g(this.c1, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void o2(int i) {
        n2(lk0.m37352a(this.c1, i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (e3()) {
            zOnLayoutDirectionChanged |= fy5.m27739m(this.E0, i);
        }
        if (d3()) {
            zOnLayoutDirectionChanged |= fy5.m27739m(this.Q0, i);
        }
        if (f3()) {
            zOnLayoutDirectionChanged |= fy5.m27739m(this.J0, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (e3()) {
            zOnLevelChange |= this.E0.setLevel(i);
        }
        if (d3()) {
            zOnLevelChange |= this.Q0.setLevel(i);
        }
        if (f3()) {
            zOnLevelChange |= this.J0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable, p001o.ygh.InterfaceC18403b
    public boolean onStateChange(int[] iArr) {
        if (this.E1) {
            super.onStateChange(iArr);
        }
        return L1(iArr, l1());
    }

    public final float p1() {
        Drawable drawable = this.q1 ? this.Q0 : this.E0;
        float f = this.G0;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void p2(float f) {
        if (this.A0 != f) {
            this.A0 = f;
            this.d1.setStrokeWidth(f);
            if (this.E1) {
                super.s0(f);
            }
            invalidateSelf();
        }
    }

    public TextUtils.TruncateAt q1() {
        return this.B1;
    }

    public void q2(int i) {
        p2(this.c1.getResources().getDimension(i));
    }

    public smb r1() {
        return this.T0;
    }

    public final void r2(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            onStateChange(getState());
        }
    }

    public float s1() {
        return this.W0;
    }

    public void s2(Drawable drawable) {
        Drawable drawableG1 = g1();
        if (drawableG1 != drawable) {
            float fF0 = F0();
            this.J0 = drawable != null ? fy5.m27744r(drawable).mutate() : null;
            i3();
            float fF02 = F0();
            g3(drawableG1);
            if (f3()) {
                z0(this.J0);
            }
            invalidateSelf();
            if (fF0 != fF02) {
                K1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.s1 != i) {
            this.s1 = i;
            invalidateSelf();
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.t1 != colorFilter) {
            this.t1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.v1 != colorStateList) {
            this.v1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.w1 != mode) {
            this.w1 = mode;
            this.u1 = xy5.m56956o(this, this.v1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (e3()) {
            visible |= this.E0.setVisible(z, z2);
        }
        if (d3()) {
            visible |= this.Q0.setVisible(z, z2);
        }
        if (f3()) {
            visible |= this.J0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.V0;
    }

    public void t2(CharSequence charSequence) {
        if (this.N0 != charSequence) {
            this.N0 = lh1.m37169c().m37174h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList u1() {
        return this.B0;
    }

    public void u2(float f) {
        if (this.a1 != f) {
            this.a1 = f;
            invalidateSelf();
            if (f3()) {
                K1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public smb v1() {
        return this.S0;
    }

    public void v2(int i) {
        u2(this.c1.getResources().getDimension(i));
    }

    public CharSequence w1() {
        return this.C0;
    }

    public void w2(int i) {
        s2(lk0.m37353b(this.c1, i));
    }

    public mgh x1() {
        return this.j1.m57787e();
    }

    public void x2(float f) {
        if (this.M0 != f) {
            this.M0 = f;
            invalidateSelf();
            if (f3()) {
                K1();
            }
        }
    }

    public float y1() {
        return this.Y0;
    }

    public void y2(int i) {
        x2(this.c1.getResources().getDimension(i));
    }

    public final void z0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        fy5.m27739m(drawable, fy5.m27732f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.J0) {
            if (drawable.isStateful()) {
                drawable.setState(l1());
            }
            drawable.setTintList(this.L0);
            return;
        }
        Drawable drawable2 = this.E0;
        if (drawable == drawable2 && this.H0) {
            drawable2.setTintList(this.F0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float z1() {
        return this.X0;
    }

    public void z2(float f) {
        if (this.Z0 != f) {
            this.Z0 = f;
            invalidateSelf();
            if (f3()) {
                K1();
            }
        }
    }
}
