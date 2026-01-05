package q4;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import c3.C0850e;
import d3.j0;
import k2.C3953b;
import k2.c0;
import k2.e1;
import o6.b0;
import og.la;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q4.b */
/* loaded from: classes.dex */
public final class C6107b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a */
    public final j0 f29814a;

    /* renamed from: b */
    public final float f29815b;

    /* renamed from: c */
    public final e1 f29816c = C3953b.m8517t(new C0850e(9205357640488583168L));

    /* renamed from: d */
    public final c0 f29817d = C3953b.m8512o(new b0(2, this));

    public C6107b(j0 j0Var, float f6) {
        this.f29814a = j0Var;
        this.f29815b = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        la.m10744a(textPaint, this.f29815b);
        textPaint.setShader((Shader) this.f29817d.getValue());
    }
}
