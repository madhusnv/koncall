package j4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.k */
/* loaded from: classes.dex */
public final class C3583k extends CharacterStyle {

    /* renamed from: a */
    public final boolean f19151a;

    /* renamed from: b */
    public final boolean f19152b;

    public C3583k(boolean z6, boolean z10) {
        this.f19151a = z6;
        this.f19152b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f19151a);
        textPaint.setStrikeThruText(this.f19152b);
    }
}
