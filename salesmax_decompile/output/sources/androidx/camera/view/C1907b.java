package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.PreviewView;
import p001o.bgg;
import p001o.fgd;
import p001o.ha2;
import p001o.wja;
import p001o.wuh;

/* renamed from: androidx.camera.view.b */
/* loaded from: classes2.dex */
public final class C1907b {

    /* renamed from: i */
    public static final PreviewView.EnumC1902e f6170i = PreviewView.EnumC1902e.FILL_CENTER;

    /* renamed from: a */
    public Size f6171a;

    /* renamed from: b */
    public Rect f6172b;

    /* renamed from: c */
    public int f6173c;

    /* renamed from: d */
    public Matrix f6174d;

    /* renamed from: e */
    public int f6175e;

    /* renamed from: f */
    public boolean f6176f;

    /* renamed from: g */
    public boolean f6177g;

    /* renamed from: h */
    public PreviewView.EnumC1902e f6178h = f6170i;

    /* renamed from: androidx.camera.view.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6179a;

        static {
            int[] iArr = new int[PreviewView.EnumC1902e.values().length];
            f6179a = iArr;
            try {
                iArr[PreviewView.EnumC1902e.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6179a[PreviewView.EnumC1902e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6179a[PreviewView.EnumC1902e.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6179a[PreviewView.EnumC1902e.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6179a[PreviewView.EnumC1902e.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6179a[PreviewView.EnumC1902e.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: b */
    public static RectF m4763b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    /* renamed from: p */
    public static void m4764p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.EnumC1902e enumC1902e) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f6179a[enumC1902e.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                wja.m54629c("PreviewTransform", "Unexpected crop rect: " + enumC1902e);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (enumC1902e == PreviewView.EnumC1902e.FIT_CENTER || enumC1902e == PreviewView.EnumC1902e.FIT_START || enumC1902e == PreviewView.EnumC1902e.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    /* renamed from: a */
    public Bitmap m4765a(Bitmap bitmap, Size size, int i) {
        if (!m4776m()) {
            return bitmap;
        }
        Matrix matrixM4774k = m4774k();
        RectF rectFM4775l = m4775l(size, i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM4774k);
        matrix.postScale(rectFM4775l.width() / this.f6171a.getWidth(), rectFM4775l.height() / this.f6171a.getHeight());
        matrix.postTranslate(rectFM4775l.left, rectFM4775l.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    /* renamed from: c */
    public Matrix m4766c(Size size, int i, Rect rect) {
        if (!m4776m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m4771h(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: d */
    public RectF m4767d(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeM4769f = m4769f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeM4769f.getWidth(), sizeM4769f.getHeight());
        Matrix matrix = new Matrix();
        m4764p(matrix, rectF2, rectF, this.f6178h);
        matrix.mapRect(rectF2);
        return i == 1 ? m4763b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    /* renamed from: e */
    public final int m4768e() {
        return !this.f6177g ? this.f6173c : -ha2.m30029b(this.f6175e);
    }

    /* renamed from: f */
    public final Size m4769f() {
        return wuh.m55040i(this.f6173c) ? new Size(this.f6172b.height(), this.f6172b.width()) : new Size(this.f6172b.width(), this.f6172b.height());
    }

    /* renamed from: g */
    public PreviewView.EnumC1902e m4770g() {
        return this.f6178h;
    }

    /* renamed from: h */
    public Matrix m4771h(Size size, int i) {
        if (!m4776m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f6174d);
        matrix.postConcat(m4773j(size, i));
        return matrix;
    }

    /* renamed from: i */
    public Rect m4772i() {
        return this.f6172b;
    }

    /* renamed from: j */
    public Matrix m4773j(Size size, int i) {
        fgd.m26665i(m4776m());
        Matrix matrixM55035d = wuh.m55035d(new RectF(this.f6172b), m4777n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : m4767d(size, i), this.f6173c);
        if (this.f6176f && this.f6177g) {
            if (wuh.m55040i(this.f6173c)) {
                matrixM55035d.preScale(1.0f, -1.0f, this.f6172b.centerX(), this.f6172b.centerY());
            } else {
                matrixM55035d.preScale(-1.0f, 1.0f, this.f6172b.centerX(), this.f6172b.centerY());
            }
        }
        return matrixM55035d;
    }

    /* renamed from: k */
    public Matrix m4774k() {
        fgd.m26665i(m4776m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f6171a.getWidth(), this.f6171a.getHeight());
        return wuh.m55035d(rectF, rectF, m4768e());
    }

    /* renamed from: l */
    public final RectF m4775l(Size size, int i) {
        fgd.m26665i(m4776m());
        Matrix matrixM4773j = m4773j(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f6171a.getWidth(), this.f6171a.getHeight());
        matrixM4773j.mapRect(rectF);
        return rectF;
    }

    /* renamed from: m */
    public final boolean m4776m() {
        return (this.f6172b == null || this.f6171a == null || !(!this.f6177g || this.f6175e != -1)) ? false : true;
    }

    /* renamed from: n */
    public boolean m4777n(Size size) {
        return wuh.m55042k(size, true, m4769f(), false);
    }

    /* renamed from: o */
    public void m4778o(int i, int i2) {
        if (this.f6177g) {
            this.f6173c = i;
            this.f6175e = i2;
        }
    }

    /* renamed from: q */
    public void m4779q(PreviewView.EnumC1902e enumC1902e) {
        this.f6178h = enumC1902e;
    }

    /* renamed from: r */
    public void m4780r(bgg.AbstractC12390h abstractC12390h, Size size, boolean z) {
        wja.m54627a("PreviewTransform", "Transformation info set: " + abstractC12390h + " " + size + " " + z);
        this.f6172b = abstractC12390h.mo18943a();
        this.f6173c = abstractC12390h.mo18944b();
        this.f6175e = abstractC12390h.mo18946d();
        this.f6171a = size;
        this.f6176f = z;
        this.f6177g = abstractC12390h.mo18947e();
        this.f6174d = abstractC12390h.mo18945c();
    }

    /* renamed from: s */
    public void m4781s(Size size, int i, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            wja.m54638l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m4776m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(m4774k());
            } else {
                Display display = view.getDisplay();
                boolean z = (!this.f6177g || display == null || display.getRotation() == this.f6175e) ? false : true;
                boolean z2 = (this.f6177g || m4768e() == 0) ? false : true;
                if (z || z2) {
                    wja.m54629c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFM4775l = m4775l(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFM4775l.width() / this.f6171a.getWidth());
            view.setScaleY(rectFM4775l.height() / this.f6171a.getHeight());
            view.setTranslationX(rectFM4775l.left - view.getLeft());
            view.setTranslationY(rectFM4775l.top - view.getTop());
        }
    }
}
