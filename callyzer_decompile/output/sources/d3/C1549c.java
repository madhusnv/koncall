package d3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import c3.C0848c;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.c */
/* loaded from: classes.dex */
public final class C1549c implements InterfaceC1563q {

    /* renamed from: a */
    public Canvas f7733a = AbstractC1550d.f7737a;

    /* renamed from: b */
    public Rect f7734b;

    /* renamed from: c */
    public Rect f7735c;

    @Override // d3.InterfaceC1563q
    /* renamed from: a */
    public final void mo5100a(float f6, float f10, float f11, float f12, C5359n c5359n) {
        this.f7733a.drawRect(f6, f10, f11, f12, (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: b */
    public final void mo5101b(C1552f c1552f, long j6, long j10, long j11, C5359n c5359n) {
        if (this.f7734b == null) {
            this.f7734b = new Rect();
            this.f7735c = new Rect();
        }
        Canvas canvas = this.f7733a;
        Bitmap bitmapM5123a = AbstractC1553g.m5123a(c1552f);
        Rect rect = this.f7734b;
        AbstractC4154l.m8920c(rect);
        int i10 = (int) (j6 >> 32);
        rect.left = i10;
        int i11 = (int) (j6 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j10 >> 32));
        rect.bottom = i11 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f7735c;
        AbstractC4154l.m8920c(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j11 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j11));
        canvas.drawBitmap(bitmapM5123a, rect, rect2, (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: c */
    public final void mo5102c(float f6, float f10) {
        this.f7733a.scale(f6, f10);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: e */
    public final void mo5103e(float f6) {
        this.f7733a.rotate(f6);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: f */
    public final void mo5104f(C0848c c0848c, C5359n c5359n) {
        this.f7733a.saveLayer(c0848c.f5354a, c0848c.f5355b, c0848c.f5356c, c0848c.f5357d, (Paint) c5359n.f26304b, 31);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: g */
    public final void mo5105g(long j6, long j10, C5359n c5359n) {
        this.f7733a.drawLine(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: h */
    public final void mo5106h(float f6, float f10, float f11, float f12, float f13, float f14, C5359n c5359n) {
        this.f7733a.drawArc(f6, f10, f11, f12, f13, f14, false, (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: i */
    public final void mo5107i() {
        this.f7733a.save();
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: j */
    public final void mo5108j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h0.m5140l(this.f7733a, false);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: k */
    public final void mo5109k(float[] fArr) {
        if (h0.m5141m(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        h0.m5144p(matrix, fArr);
        this.f7733a.concat(matrix);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: l */
    public final void mo5110l(g0 g0Var) {
        Canvas canvas = this.f7733a;
        if (!(g0Var instanceof C1555i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C1555i) g0Var).f7752a, Region.Op.INTERSECT);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: m */
    public final void mo5111m(float f6, float f10, float f11, float f12, int i10) {
        this.f7733a.clipRect(f6, f10, f11, f12, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: n */
    public final void mo5112n(float f6, float f10) {
        this.f7733a.translate(f6, f10);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: o */
    public final void mo5113o() {
        this.f7733a.restore();
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: p */
    public final void mo5114p(float f6, long j6, C5359n c5359n) {
        this.f7733a.drawCircle(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), f6, (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: q */
    public final void mo5115q(g0 g0Var, C5359n c5359n) {
        Canvas canvas = this.f7733a;
        if (!(g0Var instanceof C1555i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C1555i) g0Var).f7752a, (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: r */
    public final void mo5116r(C1552f c1552f, C5359n c5359n) {
        this.f7733a.drawBitmap(AbstractC1553g.m5123a(c1552f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: s */
    public final void mo5117s(float f6, float f10, float f11, float f12, float f13, float f14, C5359n c5359n) {
        this.f7733a.drawRoundRect(f6, f10, f11, f12, f13, f14, (Paint) c5359n.f26304b);
    }

    @Override // d3.InterfaceC1563q
    /* renamed from: t */
    public final void mo5118t() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h0.m5140l(this.f7733a, true);
    }
}
