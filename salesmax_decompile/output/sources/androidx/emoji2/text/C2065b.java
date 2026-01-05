package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C2066c;
import p001o.fwc;

/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes2.dex */
public class C2065b implements C2066c.e {

    /* renamed from: b */
    public static final ThreadLocal f7257b = new ThreadLocal();

    /* renamed from: a */
    public final TextPaint f7258a;

    public C2065b() {
        TextPaint textPaint = new TextPaint();
        this.f7258a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    public static StringBuilder m6060b() {
        ThreadLocal threadLocal = f7257b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.C2066c.e
    /* renamed from: a */
    public boolean mo6061a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbM6060b = m6060b();
        sbM6060b.setLength(0);
        while (i < i2) {
            sbM6060b.append(charSequence.charAt(i));
            i++;
        }
        return fwc.m27577a(this.f7258a, sbM6060b.toString());
    }
}
