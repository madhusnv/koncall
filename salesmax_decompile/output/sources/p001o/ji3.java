package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class ji3 {

    /* renamed from: a */
    public static final ThreadLocal f30473a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m33846a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m33847b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m33847b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m33850e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    public static TypedValue m33848c() {
        ThreadLocal threadLocal = f30473a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m33849d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m33846a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static ColorStateList m33850e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM44236a = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM33853h = m33853h(resources2, theme, attributeSet, obe.ColorStateListItem);
                int resourceId = typedArrayM33853h.getResourceId(obe.ColorStateListItem_android_color, -1);
                if (resourceId == -1 || m33851f(resources2, resourceId)) {
                    color = typedArrayM33853h.getColor(obe.ColorStateListItem_android_color, -65281);
                } else {
                    try {
                        color = m33846a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM33853h.getColor(obe.ColorStateListItem_android_color, -65281);
                    }
                }
                float f = 1.0f;
                if (typedArrayM33853h.hasValue(obe.ColorStateListItem_android_alpha)) {
                    f = typedArrayM33853h.getFloat(obe.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayM33853h.hasValue(obe.ColorStateListItem_alpha)) {
                    f = typedArrayM33853h.getFloat(obe.ColorStateListItem_alpha, 1.0f);
                }
                float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayM33853h.hasValue(obe.ColorStateListItem_android_lStar)) ? typedArrayM33853h.getFloat(obe.ColorStateListItem_lStar, -1.0f) : typedArrayM33853h.getFloat(obe.ColorStateListItem_android_lStar, -1.0f);
                typedArrayM33853h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != c6e.alpha && attributeNameResource != c6e.lStar) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i3);
                iArrM44236a = pv7.m44236a(iArrM44236a, i2, m33852g(color, f, f2));
                iArr = (int[][]) pv7.m44237b(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrM44236a, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    /* renamed from: f */
    public static boolean m33851f(Resources resources, int i) throws Resources.NotFoundException {
        TypedValue typedValueM33848c = m33848c();
        resources.getValue(i, typedValueM33848c, true);
        int i2 = typedValueM33848c.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: g */
    public static int m33852g(int i, float f, float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iM44556b = pza.m44556b((int) ((Color.alpha(i) * f) + 0.5f), 0, Constants.MAX_HOST_LENGTH);
        if (z) {
            o32 o32VarM41480c = o32.m41480c(i);
            i = o32.m41484m(o32VarM41480c.m41490j(), o32VarM41480c.m41489i(), f2);
        }
        return (i & 16777215) | (iM44556b << 24);
    }

    /* renamed from: h */
    public static TypedArray m33853h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
