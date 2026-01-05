package p001o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import p001o.ygh;

/* loaded from: classes3.dex */
public class nsh extends zya implements ygh.InterfaceC18403b {
    public static final int N0 = pae.Widget_MaterialComponents_Tooltip;
    public static final int O0 = x5e.tooltipStyle;
    public final Rect A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public CharSequence v0;
    public final Context w0;
    public final Paint.FontMetrics x0;
    public final ygh y0;
    public final View.OnLayoutChangeListener z0;

    /* renamed from: o.nsh$a */
    public class ViewOnLayoutChangeListenerC15665a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC15665a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            nsh.this.O0(view);
        }
    }

    public nsh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.x0 = new Paint.FontMetrics();
        ygh yghVar = new ygh(this);
        this.y0 = yghVar;
        this.z0 = new ViewOnLayoutChangeListenerC15665a();
        this.A0 = new Rect();
        this.I0 = 1.0f;
        this.J0 = 1.0f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        this.M0 = 1.0f;
        this.w0 = context;
        yghVar.m57789g().density = context.getResources().getDisplayMetrics().density;
        yghVar.m57789g().setTextAlign(Paint.Align.CENTER);
    }

    public static nsh D0(Context context, AttributeSet attributeSet, int i, int i2) {
        nsh nshVar = new nsh(context, attributeSet, i, i2);
        nshVar.I0(attributeSet, i, i2);
        return nshVar;
    }

    public final float A0() {
        int i;
        if (((this.A0.right - getBounds().right) - this.H0) - this.E0 < 0) {
            i = ((this.A0.right - getBounds().right) - this.H0) - this.E0;
        } else {
            if (((this.A0.left - getBounds().left) - this.H0) + this.E0 <= 0) {
                return 0.0f;
            }
            i = ((this.A0.left - getBounds().left) - this.H0) + this.E0;
        }
        return i;
    }

    public final float B0() {
        this.y0.m57789g().getFontMetrics(this.x0);
        Paint.FontMetrics fontMetrics = this.x0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public final float C0(Rect rect) {
        return rect.centerY() - B0();
    }

    public final e36 E0() {
        float f = -A0();
        float fWidth = (float) ((getBounds().width() - (this.G0 * Math.sqrt(2.0d))) / 2.0d);
        return new u9c(new qsa(this.G0), Math.min(Math.max(f, -fWidth), fWidth));
    }

    public void F0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.z0);
    }

    public final void G0(Canvas canvas) {
        if (this.v0 == null) {
            return;
        }
        int iC0 = (int) C0(getBounds());
        if (this.y0.m57787e() != null) {
            this.y0.m57789g().drawableState = getState();
            this.y0.m57796n(this.w0);
            this.y0.m57789g().setAlpha((int) (this.M0 * 255.0f));
        }
        CharSequence charSequence = this.v0;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iC0, this.y0.m57789g());
    }

    public final float H0() {
        CharSequence charSequence = this.v0;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.y0.m57790h(charSequence.toString());
    }

    public final void I0(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayM19305i = bkh.m19305i(this.w0, attributeSet, ebe.Tooltip, i, i2, new int[0]);
        this.G0 = this.w0.getResources().getDimensionPixelSize(x6e.mtrl_tooltip_arrowSize);
        boolean z = typedArrayM19305i.getBoolean(ebe.Tooltip_showMarker, true);
        this.F0 = z;
        if (z) {
            setShapeAppearanceModel(m60103I().m57943w().m57975s(E0()).m57970m());
        } else {
            this.G0 = 0;
        }
        M0(typedArrayM19305i.getText(ebe.Tooltip_android_text));
        mgh mghVarM58501h = yya.m58501h(this.w0, typedArrayM19305i, ebe.Tooltip_android_textAppearance);
        if (mghVarM58501h != null && typedArrayM19305i.hasValue(ebe.Tooltip_android_textColor)) {
            mghVarM58501h.m39031n(yya.m58494a(this.w0, typedArrayM19305i, ebe.Tooltip_android_textColor));
        }
        N0(mghVarM58501h);
        g0(ColorStateList.valueOf(typedArrayM19305i.getColor(ebe.Tooltip_backgroundTint, gua.m29511j(ni3.m40624p(gua.m29504c(this.w0, R.attr.colorBackground, nsh.class.getCanonicalName()), 229), ni3.m40624p(gua.m29504c(this.w0, x5e.colorOnBackground, nsh.class.getCanonicalName()), 153)))));
        r0(ColorStateList.valueOf(gua.m29504c(this.w0, x5e.colorSurface, nsh.class.getCanonicalName())));
        this.B0 = typedArrayM19305i.getDimensionPixelSize(ebe.Tooltip_android_padding, 0);
        this.C0 = typedArrayM19305i.getDimensionPixelSize(ebe.Tooltip_android_minWidth, 0);
        this.D0 = typedArrayM19305i.getDimensionPixelSize(ebe.Tooltip_android_minHeight, 0);
        this.E0 = typedArrayM19305i.getDimensionPixelSize(ebe.Tooltip_android_layout_margin, 0);
        typedArrayM19305i.recycle();
    }

    public void J0(float f, float f2) {
        this.K0 = f;
        this.L0 = f2;
        invalidateSelf();
    }

    public void K0(View view) {
        if (view == null) {
            return;
        }
        O0(view);
        view.addOnLayoutChangeListener(this.z0);
    }

    public void L0(float f) {
        this.I0 = f;
        this.J0 = f;
        this.M0 = gh0.m28648b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void M0(CharSequence charSequence) {
        if (TextUtils.equals(this.v0, charSequence)) {
            return;
        }
        this.v0 = charSequence;
        this.y0.m57795m(true);
        invalidateSelf();
    }

    public void N0(mgh mghVar) {
        this.y0.m57793k(mghVar, this.w0);
    }

    public final void O0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.H0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.A0);
    }

    @Override // p001o.ygh.InterfaceC18403b
    /* renamed from: a */
    public void mo14045a() {
        invalidateSelf();
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fA0 = A0();
        float f = (float) (-((this.G0 * Math.sqrt(2.0d)) - this.G0));
        canvas.scale(this.I0, this.J0, getBounds().left + (getBounds().width() * this.K0), getBounds().top + (getBounds().height() * this.L0));
        canvas.translate(fA0, f);
        super.draw(canvas);
        G0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.y0.m57789g().getTextSize(), this.D0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.B0 * 2) + H0(), this.C0);
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.F0) {
            setShapeAppearanceModel(m60103I().m57943w().m57975s(E0()).m57970m());
        }
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable, p001o.ygh.InterfaceC18403b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
