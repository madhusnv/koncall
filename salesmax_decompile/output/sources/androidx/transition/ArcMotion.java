package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p001o.dzh;
import p001o.kag;

/* loaded from: classes2.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g */
    public static final float f10277g = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a */
    public float f10278a;

    /* renamed from: b */
    public float f10279b;

    /* renamed from: c */
    public float f10280c;

    /* renamed from: d */
    public float f10281d;

    /* renamed from: e */
    public float f10282e;

    /* renamed from: f */
    public float f10283f;

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10278a = 0.0f;
        this.f10279b = 0.0f;
        this.f10280c = 70.0f;
        this.f10281d = 0.0f;
        this.f10282e = 0.0f;
        this.f10283f = f10277g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31780j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        m9804d(dzh.m23977f(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        m9803c(dzh.m23977f(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        m9802b(dzh.m23977f(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public static float m9800e(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo9801a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float fAbs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = fAbs + f4;
                f5 = f3;
            } else {
                f6 = fAbs + f2;
                f5 = f;
            }
            f7 = this.f10282e;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f10281d;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f10283f;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * fSqrt) + f11;
            f6 = f12 + (fSqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public void m9802b(float f) {
        this.f10280c = f;
        this.f10283f = m9800e(f);
    }

    /* renamed from: c */
    public void m9803c(float f) {
        this.f10278a = f;
        this.f10281d = m9800e(f);
    }

    /* renamed from: d */
    public void m9804d(float f) {
        this.f10279b = f;
        this.f10282e = m9800e(f);
    }
}
