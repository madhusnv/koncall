package mh;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import com.skydoves.balloon.internals.DefinitionKt;
import og.y0;
import og.z0;
import t5.AbstractC7052j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mh.d */
/* loaded from: classes.dex */
public final class C4751d {

    /* renamed from: a */
    public final ColorStateList f23732a;

    /* renamed from: b */
    public final ColorStateList f23733b;

    /* renamed from: c */
    public final String f23734c;

    /* renamed from: d */
    public final int f23735d;

    /* renamed from: e */
    public final int f23736e;

    /* renamed from: f */
    public final float f23737f;

    /* renamed from: g */
    public final float f23738g;

    /* renamed from: h */
    public final float f23739h;

    /* renamed from: i */
    public final boolean f23740i;

    /* renamed from: j */
    public final float f23741j;

    /* renamed from: k */
    public float f23742k;

    /* renamed from: l */
    public final int f23743l;

    /* renamed from: m */
    public boolean f23744m = false;

    /* renamed from: n */
    public Typeface f23745n;

    public C4751d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC0143a.f473v);
        this.f23742k = typedArrayObtainStyledAttributes.getDimension(0, DefinitionKt.NO_Float_VALUE);
        this.f23732a = y0.m11057g(context, typedArrayObtainStyledAttributes, 3);
        y0.m11057g(context, typedArrayObtainStyledAttributes, 4);
        y0.m11057g(context, typedArrayObtainStyledAttributes, 5);
        this.f23735d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f23736e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f23743l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f23734c = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f23733b = y0.m11057g(context, typedArrayObtainStyledAttributes, 6);
        this.f23737f = typedArrayObtainStyledAttributes.getFloat(7, DefinitionKt.NO_Float_VALUE);
        this.f23738g = typedArrayObtainStyledAttributes.getFloat(8, DefinitionKt.NO_Float_VALUE);
        this.f23739h = typedArrayObtainStyledAttributes.getFloat(9, DefinitionKt.NO_Float_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, AbstractC0143a.f466o);
        this.f23740i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f23741j = typedArrayObtainStyledAttributes2.getFloat(0, DefinitionKt.NO_Float_VALUE);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m9655a() {
        String str;
        Typeface typeface = this.f23745n;
        int i10 = this.f23735d;
        if (typeface == null && (str = this.f23734c) != null) {
            this.f23745n = Typeface.create(str, i10);
        }
        if (this.f23745n == null) {
            int i11 = this.f23736e;
            if (i11 == 1) {
                this.f23745n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f23745n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f23745n = Typeface.DEFAULT;
            } else {
                this.f23745n = Typeface.MONOSPACE;
            }
            this.f23745n = Typeface.create(this.f23745n, i10);
        }
    }

    /* renamed from: b */
    public final Typeface m9656b(Context context) {
        if (this.f23744m) {
            return this.f23745n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM13343a = AbstractC7052j.m13343a(context, this.f23743l);
                this.f23745n = typefaceM13343a;
                if (typefaceM13343a != null) {
                    this.f23745n = Typeface.create(typefaceM13343a, this.f23735d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        m9655a();
        this.f23744m = true;
        return this.f23745n;
    }

    /* renamed from: c */
    public final void m9657c(Context context, z0 z0Var) {
        if (m9658d(context)) {
            m9656b(context);
        } else {
            m9655a();
        }
        int i10 = this.f23743l;
        if (i10 == 0) {
            this.f23744m = true;
        }
        if (this.f23744m) {
            z0Var.mo7030c(this.f23745n, true);
            return;
        }
        try {
            C4749b c4749b = new C4749b(this, z0Var);
            ThreadLocal threadLocal = AbstractC7052j.f34088a;
            if (context.isRestricted()) {
                c4749b.m13340a(-4);
            } else {
                AbstractC7052j.m13344b(context, i10, new TypedValue(), 0, c4749b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f23744m = true;
            z0Var.mo7029b(1);
        } catch (Exception unused2) {
            this.f23744m = true;
            z0Var.mo7029b(-3);
        }
    }

    /* renamed from: d */
    public final boolean m9658d(Context context) throws Resources.NotFoundException {
        Typeface typefaceM13344b = null;
        int i10 = this.f23743l;
        if (i10 != 0) {
            ThreadLocal threadLocal = AbstractC7052j.f34088a;
            if (!context.isRestricted()) {
                typefaceM13344b = AbstractC7052j.m13344b(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM13344b != null;
    }

    /* renamed from: e */
    public final void m9659e(Context context, TextPaint textPaint, z0 z0Var) {
        m9660f(context, textPaint, z0Var);
        ColorStateList colorStateList = this.f23732a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f23733b;
        textPaint.setShadowLayer(this.f23739h, this.f23737f, this.f23738g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m9660f(Context context, TextPaint textPaint, z0 z0Var) {
        if (m9658d(context)) {
            m9661g(textPaint, m9656b(context));
            return;
        }
        m9655a();
        m9661g(textPaint, this.f23745n);
        m9657c(context, new C4750c(this, textPaint, z0Var));
    }

    /* renamed from: g */
    public final void m9661g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f23735d;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : DefinitionKt.NO_Float_VALUE);
        textPaint.setTextSize(this.f23742k);
        if (this.f23740i) {
            textPaint.setLetterSpacing(this.f23741j);
        }
    }
}
