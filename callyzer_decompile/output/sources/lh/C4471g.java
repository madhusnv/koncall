package lh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.g */
/* loaded from: classes.dex */
public final class C4471g {

    /* renamed from: a */
    public CharSequence f22281a;

    /* renamed from: b */
    public final TextPaint f22282b;

    /* renamed from: c */
    public final int f22283c;

    /* renamed from: d */
    public int f22284d;

    /* renamed from: j */
    public boolean f22290j;

    /* renamed from: e */
    public Layout.Alignment f22285e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f22286f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f22287g = 1.0f;

    /* renamed from: h */
    public int f22288h = 1;

    /* renamed from: i */
    public boolean f22289i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f22291k = null;

    public C4471g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f22281a = charSequence;
        this.f22282b = textPaint;
        this.f22283c = i10;
        this.f22284d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m9323a() {
        if (this.f22281a == null) {
            this.f22281a = "";
        }
        int iMax = Math.max(0, this.f22283c);
        CharSequence charSequenceEllipsize = this.f22281a;
        int i10 = this.f22286f;
        TextPaint textPaint = this.f22282b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f22291k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f22284d);
        this.f22284d = iMin;
        if (this.f22290j && this.f22286f == 1) {
            this.f22285e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f22285e);
        builderObtain.setIncludePad(this.f22289i);
        builderObtain.setTextDirection(this.f22290j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f22291k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f22286f);
        float f6 = this.f22287g;
        if (f6 != 1.0f) {
            builderObtain.setLineSpacing(DefinitionKt.NO_Float_VALUE, f6);
        }
        if (this.f22286f > 1) {
            builderObtain.setHyphenationFrequency(this.f22288h);
        }
        return builderObtain.build();
    }
}
