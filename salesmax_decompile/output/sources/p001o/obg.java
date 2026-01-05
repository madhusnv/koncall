package p001o;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes2.dex */
public final class obg {

    /* renamed from: A */
    public int f38054A;

    /* renamed from: B */
    public int f38055B;

    /* renamed from: C */
    public int f38056C;

    /* renamed from: D */
    public int f38057D;

    /* renamed from: E */
    public StaticLayout f38058E;

    /* renamed from: F */
    public StaticLayout f38059F;

    /* renamed from: G */
    public int f38060G;

    /* renamed from: H */
    public int f38061H;

    /* renamed from: I */
    public int f38062I;

    /* renamed from: J */
    public Rect f38063J;

    /* renamed from: a */
    public final float f38064a;

    /* renamed from: b */
    public final float f38065b;

    /* renamed from: c */
    public final float f38066c;

    /* renamed from: d */
    public final float f38067d;

    /* renamed from: e */
    public final float f38068e;

    /* renamed from: f */
    public final TextPaint f38069f;

    /* renamed from: g */
    public final Paint f38070g;

    /* renamed from: h */
    public final Paint f38071h;

    /* renamed from: i */
    public CharSequence f38072i;

    /* renamed from: j */
    public Layout.Alignment f38073j;

    /* renamed from: k */
    public Bitmap f38074k;

    /* renamed from: l */
    public float f38075l;

    /* renamed from: m */
    public int f38076m;

    /* renamed from: n */
    public int f38077n;

    /* renamed from: o */
    public float f38078o;

    /* renamed from: p */
    public int f38079p;

    /* renamed from: q */
    public float f38080q;

    /* renamed from: r */
    public float f38081r;

    /* renamed from: s */
    public int f38082s;

    /* renamed from: t */
    public int f38083t;

    /* renamed from: u */
    public int f38084u;

    /* renamed from: v */
    public int f38085v;

    /* renamed from: w */
    public int f38086w;

    /* renamed from: x */
    public float f38087x;

    /* renamed from: y */
    public float f38088y;

    /* renamed from: z */
    public float f38089z;

    public obg(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f38068e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f38067d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f38064a = fRound;
        this.f38065b = fRound;
        this.f38066c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f38069f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f38070g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f38071h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public static boolean m41925a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: b */
    public void m41926b(cd4 cd4Var, wc2 wc2Var, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = cd4Var.f17900d == null;
        if (!z) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(cd4Var.f17897a)) {
            return;
        } else {
            i5 = cd4Var.f17908l ? cd4Var.f17909m : wc2Var.f51763c;
        }
        if (m41925a(this.f38072i, cd4Var.f17897a) && sqi.m48724c(this.f38073j, cd4Var.f17898b) && this.f38074k == cd4Var.f17900d && this.f38075l == cd4Var.f17901e && this.f38076m == cd4Var.f17902f && sqi.m48724c(Integer.valueOf(this.f38077n), Integer.valueOf(cd4Var.f17903g)) && this.f38078o == cd4Var.f17904h && sqi.m48724c(Integer.valueOf(this.f38079p), Integer.valueOf(cd4Var.f17905i)) && this.f38080q == cd4Var.f17906j && this.f38081r == cd4Var.f17907k && this.f38082s == wc2Var.f51761a && this.f38083t == wc2Var.f51762b && this.f38084u == i5 && this.f38086w == wc2Var.f51764d && this.f38085v == wc2Var.f51765e && sqi.m48724c(this.f38069f.getTypeface(), wc2Var.f51766f) && this.f38087x == f && this.f38088y == f2 && this.f38089z == f3 && this.f38054A == i && this.f38055B == i2 && this.f38056C == i3 && this.f38057D == i4) {
            m41928d(canvas, z);
            return;
        }
        this.f38072i = cd4Var.f17897a;
        this.f38073j = cd4Var.f17898b;
        this.f38074k = cd4Var.f17900d;
        this.f38075l = cd4Var.f17901e;
        this.f38076m = cd4Var.f17902f;
        this.f38077n = cd4Var.f17903g;
        this.f38078o = cd4Var.f17904h;
        this.f38079p = cd4Var.f17905i;
        this.f38080q = cd4Var.f17906j;
        this.f38081r = cd4Var.f17907k;
        this.f38082s = wc2Var.f51761a;
        this.f38083t = wc2Var.f51762b;
        this.f38084u = i5;
        this.f38086w = wc2Var.f51764d;
        this.f38085v = wc2Var.f51765e;
        this.f38069f.setTypeface(wc2Var.f51766f);
        this.f38087x = f;
        this.f38088y = f2;
        this.f38089z = f3;
        this.f38054A = i;
        this.f38055B = i2;
        this.f38056C = i3;
        this.f38057D = i4;
        if (z) {
            op0.m42515e(this.f38072i);
            m41931g();
        } else {
            op0.m42515e(this.f38074k);
            m41930f();
        }
        m41928d(canvas, z);
    }

    /* renamed from: c */
    public final void m41927c(Canvas canvas) {
        canvas.drawBitmap(this.f38074k, (Rect) null, this.f38063J, this.f38071h);
    }

    /* renamed from: d */
    public final void m41928d(Canvas canvas, boolean z) {
        if (z) {
            m41929e(canvas);
            return;
        }
        op0.m42515e(this.f38063J);
        op0.m42515e(this.f38074k);
        m41927c(canvas);
    }

    /* renamed from: e */
    public final void m41929e(Canvas canvas) {
        StaticLayout staticLayout = this.f38058E;
        StaticLayout staticLayout2 = this.f38059F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f38060G, this.f38061H);
        if (Color.alpha(this.f38084u) > 0) {
            this.f38070g.setColor(this.f38084u);
            canvas.drawRect(-this.f38062I, 0.0f, staticLayout.getWidth() + this.f38062I, staticLayout.getHeight(), this.f38070g);
        }
        int i = this.f38086w;
        if (i == 1) {
            this.f38069f.setStrokeJoin(Paint.Join.ROUND);
            this.f38069f.setStrokeWidth(this.f38064a);
            this.f38069f.setColor(this.f38085v);
            this.f38069f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f38069f;
            float f = this.f38065b;
            float f2 = this.f38066c;
            textPaint.setShadowLayer(f, f2, f2, this.f38085v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.f38085v;
            int i3 = z ? this.f38085v : -1;
            float f3 = this.f38065b / 2.0f;
            this.f38069f.setColor(this.f38082s);
            this.f38069f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f38069f.setShadowLayer(this.f38065b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f38069f.setShadowLayer(this.f38065b, f3, f3, i3);
        }
        this.f38069f.setColor(this.f38082s);
        this.f38069f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f38069f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41930f() {
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.f38074k;
        int i2 = this.f38056C;
        int i3 = this.f38054A;
        int i4 = this.f38057D;
        int i5 = this.f38055B;
        float f3 = i2 - i3;
        float f4 = i3 + (this.f38078o * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.f38075l * f5);
        int iRound = Math.round(f3 * this.f38080q);
        float f7 = this.f38081r;
        int iRound2 = f7 != -3.4028235E38f ? Math.round(f5 * f7) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i6 = this.f38079p;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound / 2;
            }
            int iRound3 = Math.round(f4);
            i = this.f38077n;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound2 / 2;
                }
                int iRound4 = Math.round(f6);
                this.f38063J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f2 = iRound2;
            f6 -= f2;
            int iRound42 = Math.round(f6);
            this.f38063J = new Rect(iRound3, iRound42, iRound + iRound3, iRound2 + iRound42);
        }
        f = iRound;
        f4 -= f;
        int iRound32 = Math.round(f4);
        i = this.f38077n;
        if (i == 2) {
        }
        f6 -= f2;
        int iRound422 = Math.round(f6);
        this.f38063J = new Rect(iRound32, iRound422, iRound + iRound32, iRound2 + iRound422);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41931g() {
        int i;
        int i2;
        int iMax;
        int iMin;
        int iRound;
        int i3;
        int i4;
        int i5;
        CharSequence charSequence = this.f38072i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f38072i);
        int i6 = this.f38056C - this.f38054A;
        int i7 = this.f38057D - this.f38055B;
        this.f38069f.setTextSize(this.f38087x);
        int i8 = (int) ((this.f38087x * 0.125f) + 0.5f);
        int i9 = i8 * 2;
        int i10 = i6 - i9;
        float f = this.f38080q;
        if (f != -3.4028235E38f) {
            i10 = (int) (i10 * f);
        }
        int i11 = i10;
        if (i11 <= 0) {
            ria.m46824h("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f38088y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f38088y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f38086w == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.f38083t) > 0) {
            int i12 = this.f38086w;
            if (i12 == 0 || i12 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f38083t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f38083t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f38073j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f38069f, i11, alignment2, this.f38067d, this.f38068e, true);
        this.f38058E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.f38058E.getLineCount();
        int iMax2 = 0;
        for (int i13 = 0; i13 < lineCount; i13++) {
            iMax2 = Math.max((int) Math.ceil(this.f38058E.getLineWidth(i13)), iMax2);
        }
        if (this.f38080q == -3.4028235E38f || iMax2 >= i11) {
            i11 = iMax2;
        }
        int i14 = i11 + i9;
        float f2 = this.f38078o;
        if (f2 != -3.4028235E38f) {
            int iRound2 = Math.round(i6 * f2);
            int i15 = this.f38054A;
            int i16 = iRound2 + i15;
            int i17 = this.f38079p;
            i = 1;
            if (i17 != 1) {
                i2 = 2;
                if (i17 == 2) {
                    i16 -= i14;
                }
            } else {
                i2 = 2;
                i16 = ((i16 * 2) - i14) / 2;
            }
            iMax = Math.max(i16, i15);
            iMin = Math.min(i14 + iMax, this.f38056C);
        } else {
            i = 1;
            i2 = 2;
            iMax = ((i6 - i14) / 2) + this.f38054A;
            iMin = iMax + i14;
        }
        int i18 = iMin - iMax;
        if (i18 <= 0) {
            ria.m46824h("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.f38075l;
        if (f3 != -3.4028235E38f) {
            if (this.f38076m == 0) {
                iRound = Math.round(i7 * f3) + this.f38055B;
                int i19 = this.f38077n;
                if (i19 == i2) {
                    iRound -= height;
                } else if (i19 == i) {
                    iRound = ((iRound * 2) - height) / i2;
                }
                i4 = iRound + height;
                i5 = this.f38057D;
                if (i4 > i5) {
                    iRound = i5 - height;
                } else {
                    int i20 = this.f38055B;
                    if (iRound < i20) {
                        i3 = i20;
                    }
                }
            } else {
                int lineBottom = this.f38058E.getLineBottom(0) - this.f38058E.getLineTop(0);
                float f4 = this.f38075l;
                if (f4 >= 0.0f) {
                    iRound = Math.round(f4 * lineBottom) + this.f38055B;
                    i4 = iRound + height;
                    i5 = this.f38057D;
                    if (i4 > i5) {
                    }
                } else {
                    iRound = Math.round((f4 + 1.0f) * lineBottom) + this.f38057D;
                    iRound -= height;
                    i4 = iRound + height;
                    i5 = this.f38057D;
                    if (i4 > i5) {
                    }
                }
            }
            this.f38058E = new StaticLayout(spannableStringBuilder, this.f38069f, i18, alignment2, this.f38067d, this.f38068e, true);
            this.f38059F = new StaticLayout(spannableStringBuilder2, this.f38069f, i18, alignment2, this.f38067d, this.f38068e, true);
            this.f38060G = iMax;
            this.f38061H = i3;
            this.f38062I = i8;
        }
        iRound = (this.f38057D - height) - ((int) (i7 * this.f38089z));
        i3 = iRound;
        this.f38058E = new StaticLayout(spannableStringBuilder, this.f38069f, i18, alignment2, this.f38067d, this.f38068e, true);
        this.f38059F = new StaticLayout(spannableStringBuilder2, this.f38069f, i18, alignment2, this.f38067d, this.f38068e, true);
        this.f38060G = iMax;
        this.f38061H = i3;
        this.f38062I = i8;
    }
}
