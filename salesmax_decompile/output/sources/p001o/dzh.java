package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class dzh {
    /* renamed from: a */
    public static boolean m23972a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m23981j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m23973b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m23981j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m23974c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m23981j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? ji3.m33849d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m23975d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* renamed from: d */
    public static ColorStateList m23975d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static sm3 m23976e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m23981j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return sm3.m48533b(typedValue.data);
            }
            sm3 sm3VarM48536g = sm3.m48536g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (sm3VarM48536g != null) {
                return sm3VarM48536g;
            }
        }
        return sm3.m48533b(i2);
    }

    /* renamed from: f */
    public static float m23977f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m23981j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m23978g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m23981j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m23979h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m23981j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m23980i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m23981j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m23981j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m23982k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
