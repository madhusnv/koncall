package i1;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1550d;
import f3.C2196b;
import gx.AbstractC2747a;
import v3.AbstractC7642n;
import v3.InterfaceC7644p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC7642n implements InterfaceC7644p {

    /* renamed from: s */
    public final C3128g f16882s;

    /* renamed from: t */
    public final d0 f16883t;

    /* renamed from: v */
    public final o1.h1 f16884v;

    public i0(p3.h0 h0Var, C3128g c3128g, d0 d0Var, o1.h1 h1Var) {
        this.f16882s = c3128g;
        this.f16883t = d0Var;
        this.f16884v = h1Var;
        L0(h0Var);
    }

    public static boolean O0(float f6, long j6, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f6);
        canvas.translate(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        boolean zO0;
        char c2;
        long j6;
        C2196b c2196b = i0Var.f36917a;
        long jMo5913e = c2196b.mo5913e();
        C3128g c3128g = this.f16882s;
        c3128g.m7505i(jMo5913e);
        if (C0850e.m2294e(c2196b.mo5913e())) {
            i0Var.m14622b();
            return;
        }
        i0Var.m14622b();
        c3128g.f16866d.getValue();
        Canvas canvasM5119a = AbstractC1550d.m5119a(c2196b.f10124b.m75t());
        d0 d0Var = this.f16883t;
        boolean zM7484f = d0.m7484f(d0Var.f16824f);
        o1.h1 h1Var = this.f16884v;
        if (zM7484f) {
            EdgeEffect edgeEffectM7488c = d0Var.m7488c();
            float f6 = -Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L));
            zO0 = O0(270.0f, (Float.floatToRawIntBits(i0Var.mo8435T(h1Var.mo10342b(i0Var.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32), edgeEffectM7488c, canvasM5119a);
        } else {
            zO0 = false;
        }
        if (d0.m7484f(d0Var.f16822d)) {
            c2 = ' ';
            j6 = 4294967295L;
            zO0 = O0(DefinitionKt.NO_Float_VALUE, (((long) Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE)) << 32) | (((long) Float.floatToRawIntBits(i0Var.mo8435T(h1Var.mo10344d()))) & 4294967295L), d0Var.m7490e(), canvasM5119a) || zO0;
        } else {
            c2 = ' ';
            j6 = 4294967295L;
        }
        if (d0.m7484f(d0Var.f16825g)) {
            zO0 = O0(90.0f, (((long) Float.floatToRawIntBits(i0Var.mo8435T(h1Var.mo10343c(i0Var.getLayoutDirection())) + (-((float) AbstractC2747a.m6747k(Float.intBitsToFloat((int) (c2196b.mo5913e() >> c2))))))) & j6) | (((long) Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE)) << c2), d0Var.m7489d(), canvasM5119a) || zO0;
        }
        if (d0.m7484f(d0Var.f16823e)) {
            EdgeEffect edgeEffectM7487b = d0Var.m7487b();
            zO0 = O0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c2196b.mo5913e() & j6))) + i0Var.mo8435T(h1Var.mo10341a()))) & j6) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2196b.mo5913e() >> c2)))) << c2), edgeEffectM7487b, canvasM5119a) || zO0;
        }
        if (zO0) {
            c3128g.m7500d();
        }
    }
}
