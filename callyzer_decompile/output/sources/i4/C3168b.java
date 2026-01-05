package i4;

import android.text.TextPaint;
import pg.x5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i4.b */
/* loaded from: classes.dex */
public final class C3168b extends x5 {

    /* renamed from: a */
    public final CharSequence f17095a;

    /* renamed from: b */
    public final TextPaint f17096b;

    public C3168b(CharSequence charSequence, TextPaint textPaint) {
        this.f17095a = charSequence;
        this.f17096b = textPaint;
    }

    @Override // pg.x5
    /* renamed from: c */
    public final int mo7537c(int i10) {
        CharSequence charSequence = this.f17095a;
        return this.f17096b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // pg.x5
    /* renamed from: e */
    public final int mo7538e(int i10) {
        CharSequence charSequence = this.f17095a;
        return this.f17096b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
