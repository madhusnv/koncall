package p001o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public class ukf {

    /* renamed from: i */
    public static final int[] f49034i = new int[3];

    /* renamed from: j */
    public static final float[] f49035j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f49036k = new int[4];

    /* renamed from: l */
    public static final float[] f49037l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f49038a;

    /* renamed from: b */
    public final Paint f49039b;

    /* renamed from: c */
    public final Paint f49040c;

    /* renamed from: d */
    public int f49041d;

    /* renamed from: e */
    public int f49042e;

    /* renamed from: f */
    public int f49043f;

    /* renamed from: g */
    public final Path f49044g;

    /* renamed from: h */
    public final Paint f49045h;

    public ukf() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m51684a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f49044g;
        if (z) {
            int[] iArr = f49036k;
            iArr[0] = 0;
            iArr[1] = this.f49043f;
            iArr[2] = this.f49042e;
            iArr[3] = this.f49041d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f49036k;
            iArr2[0] = 0;
            iArr2[1] = this.f49041d;
            iArr2[2] = this.f49042e;
            iArr2[3] = this.f49043f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = f49037l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f49039b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f49036k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f49045h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f49039b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m51685b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f49034i;
        iArr[0] = this.f49043f;
        iArr[1] = this.f49042e;
        iArr[2] = this.f49041d;
        Paint paint = this.f49040c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f49035j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f49040c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m51686c() {
        return this.f49038a;
    }

    /* renamed from: d */
    public void m51687d(int i) {
        this.f49041d = ni3.m40624p(i, 68);
        this.f49042e = ni3.m40624p(i, 20);
        this.f49043f = ni3.m40624p(i, 0);
        this.f49038a.setColor(this.f49041d);
    }

    public ukf(int i) {
        this.f49044g = new Path();
        Paint paint = new Paint();
        this.f49045h = paint;
        this.f49038a = new Paint();
        m51687d(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f49039b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f49040c = new Paint(paint2);
    }
}
