package p001o;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public final class k5g {

    /* renamed from: o */
    public static final int f31499o = 1;

    /* renamed from: a */
    public CharSequence f31500a;

    /* renamed from: b */
    public final TextPaint f31501b;

    /* renamed from: c */
    public final int f31502c;

    /* renamed from: e */
    public int f31504e;

    /* renamed from: l */
    public boolean f31511l;

    /* renamed from: n */
    public l5g f31513n;

    /* renamed from: d */
    public int f31503d = 0;

    /* renamed from: f */
    public Layout.Alignment f31505f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    public int f31506g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: h */
    public float f31507h = 0.0f;

    /* renamed from: i */
    public float f31508i = 1.0f;

    /* renamed from: j */
    public int f31509j = f31499o;

    /* renamed from: k */
    public boolean f31510k = true;

    /* renamed from: m */
    public TextUtils.TruncateAt f31512m = null;

    /* renamed from: o.k5g$a */
    public static class C14716a extends Exception {
    }

    public k5g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f31500a = charSequence;
        this.f31501b = textPaint;
        this.f31502c = i;
        this.f31504e = charSequence.length();
    }

    /* renamed from: b */
    public static k5g m35016b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new k5g(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m35017a() {
        if (this.f31500a == null) {
            this.f31500a = "";
        }
        int iMax = Math.max(0, this.f31502c);
        CharSequence charSequenceEllipsize = this.f31500a;
        if (this.f31506g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f31501b, iMax, this.f31512m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f31504e);
        this.f31504e = iMin;
        if (this.f31511l && this.f31506g == 1) {
            this.f31505f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f31503d, iMin, this.f31501b, iMax);
        builderObtain.setAlignment(this.f31505f);
        builderObtain.setIncludePad(this.f31510k);
        builderObtain.setTextDirection(this.f31511l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f31512m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f31506g);
        float f = this.f31507h;
        if (f != 0.0f || this.f31508i != 1.0f) {
            builderObtain.setLineSpacing(f, this.f31508i);
        }
        if (this.f31506g > 1) {
            builderObtain.setHyphenationFrequency(this.f31509j);
        }
        l5g l5gVar = this.f31513n;
        if (l5gVar != null) {
            l5gVar.mo36597a(builderObtain);
        }
        return builderObtain.build();
    }

    /* renamed from: c */
    public k5g m35018c(Layout.Alignment alignment) {
        this.f31505f = alignment;
        return this;
    }

    /* renamed from: d */
    public k5g m35019d(TextUtils.TruncateAt truncateAt) {
        this.f31512m = truncateAt;
        return this;
    }

    /* renamed from: e */
    public k5g m35020e(int i) {
        this.f31509j = i;
        return this;
    }

    /* renamed from: f */
    public k5g m35021f(boolean z) {
        this.f31510k = z;
        return this;
    }

    /* renamed from: g */
    public k5g m35022g(boolean z) {
        this.f31511l = z;
        return this;
    }

    /* renamed from: h */
    public k5g m35023h(float f, float f2) {
        this.f31507h = f;
        this.f31508i = f2;
        return this;
    }

    /* renamed from: i */
    public k5g m35024i(int i) {
        this.f31506g = i;
        return this;
    }

    /* renamed from: j */
    public k5g m35025j(l5g l5gVar) {
        this.f31513n = l5gVar;
        return this;
    }
}
