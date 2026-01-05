package p001o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class mu7 {
    /* renamed from: a */
    public static C15434a m39694a(C15434a c15434a, int i, int i2, boolean z, int i3) {
        return c15434a != null ? c15434a : z ? new C15434a(i, i3, i2) : new C15434a(i, i2);
    }

    /* renamed from: b */
    public static Shader m39695b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, obe.GradientColor);
        float fM23977f = dzh.m23977f(typedArrayM23982k, xmlPullParser, "startX", obe.GradientColor_android_startX, 0.0f);
        float fM23977f2 = dzh.m23977f(typedArrayM23982k, xmlPullParser, "startY", obe.GradientColor_android_startY, 0.0f);
        float fM23977f3 = dzh.m23977f(typedArrayM23982k, xmlPullParser, "endX", obe.GradientColor_android_endX, 0.0f);
        float fM23977f4 = dzh.m23977f(typedArrayM23982k, xmlPullParser, "endY", obe.GradientColor_android_endY, 0.0f);
        float fM23977f5 = dzh.m23977f(typedArrayM23982k, xmlPullParser, "centerX", obe.GradientColor_android_centerX, 0.0f);
        float fM23977f6 = dzh.m23977f(typedArrayM23982k, xmlPullParser, "centerY", obe.GradientColor_android_centerY, 0.0f);
        int iM23978g = dzh.m23978g(typedArrayM23982k, xmlPullParser, "type", obe.GradientColor_android_type, 0);
        int iM23973b = dzh.m23973b(typedArrayM23982k, xmlPullParser, "startColor", obe.GradientColor_android_startColor, 0);
        boolean zM23981j = dzh.m23981j(xmlPullParser, "centerColor");
        int iM23973b2 = dzh.m23973b(typedArrayM23982k, xmlPullParser, "centerColor", obe.GradientColor_android_centerColor, 0);
        int iM23973b3 = dzh.m23973b(typedArrayM23982k, xmlPullParser, "endColor", obe.GradientColor_android_endColor, 0);
        int iM23978g2 = dzh.m23978g(typedArrayM23982k, xmlPullParser, "tileMode", obe.GradientColor_android_tileMode, 0);
        float fM23977f7 = dzh.m23977f(typedArrayM23982k, xmlPullParser, "gradientRadius", obe.GradientColor_android_gradientRadius, 0.0f);
        typedArrayM23982k.recycle();
        C15434a c15434aM39694a = m39694a(m39696c(resources, xmlPullParser, attributeSet, theme), iM23973b, iM23973b3, zM23981j, iM23973b2);
        if (iM23978g != 1) {
            return iM23978g != 2 ? new LinearGradient(fM23977f, fM23977f2, fM23977f3, fM23977f4, c15434aM39694a.f35999a, c15434aM39694a.f36000b, m39697d(iM23978g2)) : new SweepGradient(fM23977f5, fM23977f6, c15434aM39694a.f35999a, c15434aM39694a.f36000b);
        }
        if (fM23977f7 > 0.0f) {
            return new RadialGradient(fM23977f5, fM23977f6, fM23977f7, c15434aM39694a.f35999a, c15434aM39694a.f36000b, m39697d(iM23978g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new p001o.mu7.C15434a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C15434a m39696c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, obe.GradientColorItem);
                boolean zHasValue = typedArrayM23982k.hasValue(obe.GradientColorItem_android_color);
                boolean zHasValue2 = typedArrayM23982k.hasValue(obe.GradientColorItem_android_offset);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color = typedArrayM23982k.getColor(obe.GradientColorItem_android_color, 0);
                float f = typedArrayM23982k.getFloat(obe.GradientColorItem_android_offset, 0.0f);
                typedArrayM23982k.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* renamed from: d */
    public static Shader.TileMode m39697d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* renamed from: o.mu7$a */
    public static final class C15434a {

        /* renamed from: a */
        public final int[] f35999a;

        /* renamed from: b */
        public final float[] f36000b;

        public C15434a(List list, List list2) {
            int size = list.size();
            this.f35999a = new int[size];
            this.f36000b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f35999a[i] = ((Integer) list.get(i)).intValue();
                this.f36000b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        public C15434a(int i, int i2) {
            this.f35999a = new int[]{i, i2};
            this.f36000b = new float[]{0.0f, 1.0f};
        }

        public C15434a(int i, int i2, int i3) {
            this.f35999a = new int[]{i, i2, i3};
            this.f36000b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
