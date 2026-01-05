package p001o;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes2.dex */
public abstract class r56 extends ReplacementSpan {

    /* renamed from: b */
    public final nzh f43018b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f43017a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public short f43019c = -1;

    /* renamed from: d */
    public short f43020d = -1;

    /* renamed from: e */
    public float f43021e = 1.0f;

    public r56(nzh nzhVar) {
        fgd.m26664h(nzhVar, "rasterizer cannot be null");
        this.f43018b = nzhVar;
    }

    /* renamed from: a */
    public final nzh m46236a() {
        return this.f43018b;
    }

    /* renamed from: b */
    public final int m46237b() {
        return this.f43019c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f43017a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f43017a;
        this.f43021e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f43018b.m41329e();
        this.f43020d = (short) (this.f43018b.m41329e() * this.f43021e);
        short sM41333i = (short) (this.f43018b.m41333i() * this.f43021e);
        this.f43019c = sM41333i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f43017a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM41333i;
    }
}
