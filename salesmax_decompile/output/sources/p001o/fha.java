package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;

/* loaded from: classes3.dex */
public class fha {

    /* renamed from: d */
    public static final zue[] f23332d;

    /* renamed from: e */
    public static final dmb[] f23333e;

    /* renamed from: a */
    public LoadingIndicatorSpec f23334a;

    /* renamed from: b */
    public final Path f23335b = new Path();

    /* renamed from: c */
    public final Matrix f23336c = new Matrix();

    /* renamed from: o.fha$a */
    public static class C13431a {

        /* renamed from: a */
        public int f23337a;

        /* renamed from: b */
        public float f23338b;

        /* renamed from: c */
        public float f23339c;
    }

    static {
        zue[] zueVarArr = {bza.m19945Q(bza.f16991E, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), bza.m19945Q(bza.f17025y, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), bza.m19945Q(bza.f17018r, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), bza.m19945Q(bza.f17014n, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), bza.m19945Q(bza.f17020t, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), bza.m19945Q(bza.f17022v, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), bza.m19945Q(bza.f17013m, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
        f23332d = zueVarArr;
        f23333e = new dmb[zueVarArr.length];
        int i = 0;
        while (true) {
            zue[] zueVarArr2 = f23332d;
            if (i >= zueVarArr2.length) {
                return;
            }
            int i2 = i + 1;
            f23333e[i] = new dmb(zueVarArr2[i], zueVarArr2[i2 % zueVarArr2.length]);
            i = i2;
        }
    }

    public fha(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f23334a = loadingIndicatorSpec;
    }

    /* renamed from: a */
    public void m26698a(Canvas canvas, Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.f23334a.f12705a) {
            float fMin = Math.min(rect.width() / m26702e(), rect.height() / m26701d());
            canvas.scale(fMin, fMin);
        }
        canvas.clipRect((-m26702e()) / 2.0f, (-m26701d()) / 2.0f, m26702e() / 2.0f, m26701d() / 2.0f);
        canvas.rotate(-90.0f);
    }

    /* renamed from: b */
    public void m26699b(Canvas canvas, Paint paint, int i, int i2) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f23334a;
        float fMin = Math.min(loadingIndicatorSpec.f12707c, loadingIndicatorSpec.f12708d) / 2.0f;
        paint.setColor(gua.m29502a(i, i2));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.f23334a;
        canvas.drawRoundRect(new RectF((-r2) / 2.0f, (-r9) / 2.0f, loadingIndicatorSpec2.f12707c / 2.0f, loadingIndicatorSpec2.f12708d / 2.0f), fMin, fMin, paint);
    }

    /* renamed from: c */
    public void m26700c(Canvas canvas, Paint paint, C13431a c13431a, int i) {
        paint.setColor(gua.m29502a(c13431a.f23337a, i));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(c13431a.f23339c);
        this.f23335b.rewind();
        int iFloor = (int) Math.floor(c13431a.f23338b);
        dmb[] dmbVarArr = f23333e;
        wlf.m54688b(dmbVarArr[oza.m42805d(iFloor, dmbVarArr.length)], c13431a.f23338b - iFloor, this.f23335b);
        Matrix matrix = this.f23336c;
        int i2 = this.f23334a.f12706b;
        matrix.setScale(i2 / 2.0f, i2 / 2.0f);
        this.f23335b.transform(this.f23336c);
        canvas.drawPath(this.f23335b, paint);
        canvas.restore();
    }

    /* renamed from: d */
    public int m26701d() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f23334a;
        return Math.max(loadingIndicatorSpec.f12707c, loadingIndicatorSpec.f12706b);
    }

    /* renamed from: e */
    public int m26702e() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f23334a;
        return Math.max(loadingIndicatorSpec.f12708d, loadingIndicatorSpec.f12706b);
    }
}
