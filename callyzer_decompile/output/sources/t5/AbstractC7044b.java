package t5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.amplifyframework.storage.s3.transfer.RunnableC1257d;
import ee.C2039g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p5.AbstractC5829a;
import u5.AbstractC7339a;
import y5.C8557c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t5.b */
/* loaded from: classes.dex */
public abstract class AbstractC7044b {

    /* renamed from: a */
    public static final float[][] f34066a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f34067b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f34068c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f34069d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: b */
    public static C2039g m13331b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        C2039g c2039gM5754j;
        if (m13332c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new C2039g((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c2039gM5754j = C2039g.m5754j(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception unused) {
                c2039gM5754j = null;
            }
            if (c2039gM5754j != null) {
                return c2039gM5754j;
            }
        }
        return new C2039g((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: c */
    public static boolean m13332c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: d */
    public static int m13333d(float f6) {
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f10 = (f6 + 16.0f) / 116.0f;
        float f11 = f6 > 8.0f ? f10 * f10 * f10 : f6 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z6 = f12 > 0.008856452f;
        float f13 = z6 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z6) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f34068c;
        return AbstractC7339a.m13731a(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    /* renamed from: e */
    public static float m13334e(int i10) {
        float f6 = i10 / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: f */
    public static TypedArray m13335f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: i */
    public static InterfaceC7046d m13336i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m13338k(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC5829a.f28515b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m13338k(xmlResourceParser);
            }
            List listM13337j = m13337j(resources, resourceId);
            return new C7049g(new C8557c(string, string2, string3, listM13337j), string4 != null ? new C8557c(string, string2, string4, listM13337j) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC5829a.f28516c);
                    int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z6 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                    int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i13);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m13338k(xmlResourceParser);
                    }
                    arrayList.add(new C7048f(i10, i12, resourceId2, string7, string6, z6));
                } else {
                    m13338k(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7047e((C7048f[]) arrayList.toArray(new C7048f[0]));
    }

    /* renamed from: j */
    public static List m13337j(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: k */
    public static void m13338k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* renamed from: l */
    public static float m13339l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* renamed from: a */
    public void m13340a(int i10) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1257d(this, i10, 1));
    }

    /* renamed from: g */
    public abstract void mo9653g(int i10);

    /* renamed from: h */
    public abstract void mo9654h(Typeface typeface);
}
