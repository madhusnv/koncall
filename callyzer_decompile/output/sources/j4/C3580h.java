package j4;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.skydoves.balloon.internals.DefinitionKt;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.h */
/* loaded from: classes.dex */
public final class C3580h implements LineHeightSpan {

    /* renamed from: a */
    public final float f19131a;

    /* renamed from: b */
    public final int f19132b;

    /* renamed from: c */
    public final boolean f19133c;

    /* renamed from: d */
    public final boolean f19134d;

    /* renamed from: e */
    public final float f19135e;

    /* renamed from: f */
    public final boolean f19136f;

    /* renamed from: g */
    public int f19137g = Integer.MIN_VALUE;

    /* renamed from: h */
    public int f19138h = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f19139j = Integer.MIN_VALUE;

    /* renamed from: k */
    public int f19140k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f19141l;

    /* renamed from: m */
    public int f19142m;

    public C3580h(float f6, int i10, boolean z6, boolean z10, float f10, boolean z11) {
        this.f19131a = f6;
        this.f19132b = i10;
        this.f19133c = z6;
        this.f19134d = z10;
        this.f19135e = f10;
        this.f19136f = z11;
        if ((DefinitionKt.NO_Float_VALUE > f10 || f10 > 1.0f) && f10 != -1.0f) {
            AbstractC4646a.m9526b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z6 = i10 == 0;
        boolean z10 = i11 == this.f19132b;
        boolean z11 = this.f19134d;
        boolean z12 = this.f19133c;
        if (z6 && z10 && z12 && z11) {
            return;
        }
        if (this.f19137g == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f19131a);
            int i17 = iCeil - i16;
            if (!this.f19136f || i17 > 0) {
                float fAbs = this.f19135e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f19139j = i19;
                int i20 = i19 - iCeil;
                this.f19138h = i20;
                if (z12) {
                    i20 = fontMetricsInt.ascent;
                }
                this.f19137g = i20;
                if (z11) {
                    i19 = i18;
                }
                this.f19140k = i19;
                this.f19141l = fontMetricsInt.ascent - i20;
                this.f19142m = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f19138h = i21;
                int i22 = fontMetricsInt.descent;
                this.f19139j = i22;
                this.f19137g = i21;
                this.f19140k = i22;
                this.f19141l = 0;
                this.f19142m = 0;
            }
        }
        fontMetricsInt.ascent = z6 ? this.f19137g : this.f19138h;
        fontMetricsInt.descent = z10 ? this.f19140k : this.f19139j;
    }
}
