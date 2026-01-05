package h4;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.q */
/* loaded from: classes.dex */
public final class C2840q extends Canvas {

    /* renamed from: a */
    public Canvas f15826a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2828e.m6934a(canvas, path);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2828e.m6938e(canvas, rectF);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op2) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipPath(path, op2);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op2) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op2);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6940a(canvas);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawARGB(i10, i11, i12, i13);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f6, float f10, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawArc(rectF, f6, f10, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f10, float f11, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawCircle(f6, f10, f11, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawColor(i10);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f6, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6944e(canvas, rectF, f6, f10, rectF2, f11, f12, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2831h.m6953a(canvas, iArr, i10, fArr, i11, i12, font, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawLine(f6, f10, f11, f12, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawLines(fArr, i10, i11, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2831h.m6954b(canvas, ninePatch, rect, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPoint(f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i10, i11, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i10, i11, fArr, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawRGB(i10, i11, i12);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6946g(canvas, renderNode);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawText(cArr, i10, i11, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i10, i11, path, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f6, float f10, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i10, i11, i12, i13, f6, f10, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6948i(canvas);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f15826a;
        if (canvas == null) {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.restore();
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.restoreToCount(i10);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.rotate(f6);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.save();
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i10);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10, i11);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.scale(f6, f10);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.setDensity(i10);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.skew(f6, f10);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.translate(f6, f10);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2828e.m6937d(canvas, rect);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op2) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(rect, op2);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f10, float f11, float f12, float f13, float f14, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawArc(f6, f10, f11, f12, f13, f14, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j6) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6942c(canvas, j6);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawOval(f6, f10, f11, f12, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2831h.m6955c(canvas, ninePatch, rectF, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawRoundRect(f6, f10, f11, f12, f13, f14, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawText(str, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2830g.m6952c(canvas, rectF);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f10, float f11, float f12) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2828e.m6935b(canvas, f6, f10, f11, f12);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawColor(i10, mode);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawRect(f6, f10, f11, f12, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawText(str, i10, i11, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint, int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayer(f6, f10, f11, f12, paint, i10);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i10, int i11) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f6, f10, f11, f12, i10, i11);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2828e.m6936c(canvas, i10, i11, i12, i13);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f6, float f10, int i12, int i13, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, f6, f10, i12, i13, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6941b(canvas, i10, blendMode);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6945f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f6, float f10, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawText(charSequence, i10, i11, f6, f10, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f6, float f10, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i10, i11, i12, i13, f6, f10, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2830g.m6951b(canvas, path);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayer(f6, f10, f11, f12, paint);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i10) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f6, f10, f11, f12, i10);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12, Region.Op op2) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(f6, f10, f11, f12, op2);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j6, BlendMode blendMode) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6943d(canvas, j6, blendMode);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.quickReject(f6, f10, f11, f12, edgeType);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(f6, f10, f11, f12);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f10, float f11, float f12) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return AbstractC2830g.m6950a(canvas, f6, f10, f11, f12);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            return canvas.clipRect(i10, i11, i12, i13);
        }
        AbstractC4154l.m8928k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f6, float f10, boolean z6, Paint paint) {
        Canvas canvas = this.f15826a;
        if (canvas != null) {
            AbstractC2829f.m6947h(canvas, measuredText, i10, i11, i12, i13, f6, f10, z6, paint);
        } else {
            AbstractC4154l.m8928k("nativeCanvas");
            throw null;
        }
    }
}
