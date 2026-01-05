package j4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.j */
/* loaded from: classes.dex */
public final class C3582j extends CharacterStyle {

    /* renamed from: a */
    public final int f19147a;

    /* renamed from: b */
    public final float f19148b;

    /* renamed from: c */
    public final float f19149c;

    /* renamed from: d */
    public final float f19150d;

    public C3582j(float f6, float f10, float f11, int i10) {
        this.f19147a = i10;
        this.f19148b = f6;
        this.f19149c = f10;
        this.f19150d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f19150d, this.f19148b, this.f19149c, this.f19147a);
    }
}
