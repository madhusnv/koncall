package i1;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import com.skydoves.balloon.internals.DefinitionKt;
import v3.AbstractC7642n;
import v3.InterfaceC7644p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 extends AbstractC7642n implements InterfaceC7644p {

    /* renamed from: s */
    public final C3128g f16983s;

    /* renamed from: t */
    public final d0 f16984t;

    /* renamed from: v */
    public RenderNode f16985v;

    public r1(p3.h0 h0Var, C3128g c3128g, d0 d0Var) {
        this.f16983s = c3128g;
        this.f16984t = d0Var;
        L0(h0Var);
    }

    public static boolean O0(float f6, EdgeEffect edgeEffect, Canvas canvas) {
        if (f6 == DefinitionKt.NO_Float_VALUE) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f6);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode P0() {
        RenderNode renderNode = this.f16985v;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM2437b = c6.k1.m2437b();
        this.f16985v = renderNodeM2437b;
        return renderNodeM2437b;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01eb A[PHI: r16
      0x01eb: PHI (r16v2 boolean) = (r16v1 boolean), (r16v12 boolean) binds: [B:93:0x01a1, B:101:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v3.InterfaceC7644p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(v3.i0 r25) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.r1.h0(v3.i0):void");
    }
}
