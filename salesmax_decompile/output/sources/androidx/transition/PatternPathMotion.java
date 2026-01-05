package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p001o.dzh;
import p001o.e0d;
import p001o.kag;

/* loaded from: classes2.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public Path f10342a;

    /* renamed from: b */
    public final Path f10343b = new Path();

    /* renamed from: c */
    public final Matrix f10344c = new Matrix();

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31781k);
        try {
            String strM23980i = dzh.m23980i(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM23980i == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            m9845c(e0d.m24040e(strM23980i));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static float m9844b(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo9801a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fM9844b = m9844b(f5, f6);
        double dAtan2 = Math.atan2(f6, f5);
        this.f10344c.setScale(fM9844b, fM9844b);
        this.f10344c.postRotate((float) Math.toDegrees(dAtan2));
        this.f10344c.postTranslate(f, f2);
        Path path = new Path();
        this.f10343b.transform(this.f10344c, path);
        return path;
    }

    /* renamed from: c */
    public void m9845c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f10344c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fM9844b = 1.0f / m9844b(f5, f6);
        this.f10344c.postScale(fM9844b, fM9844b);
        this.f10344c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f10344c, this.f10343b);
        this.f10342a = path;
    }
}
