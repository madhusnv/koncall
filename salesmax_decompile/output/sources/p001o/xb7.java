package p001o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class xb7 {

    /* renamed from: o.xb7$a */
    public static class C18098a {
        /* renamed from: a */
        public static int m55930a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: o.xb7$b */
    public interface InterfaceC18099b {
    }

    /* renamed from: o.xb7$c */
    public static final class C18100c implements InterfaceC18099b {

        /* renamed from: a */
        public final C18101d[] f53445a;

        public C18100c(C18101d[] c18101dArr) {
            this.f53445a = c18101dArr;
        }

        /* renamed from: a */
        public C18101d[] m55931a() {
            return this.f53445a;
        }
    }

    /* renamed from: o.xb7$d */
    public static final class C18101d {

        /* renamed from: a */
        public final String f53446a;

        /* renamed from: b */
        public final int f53447b;

        /* renamed from: c */
        public final boolean f53448c;

        /* renamed from: d */
        public final String f53449d;

        /* renamed from: e */
        public final int f53450e;

        /* renamed from: f */
        public final int f53451f;

        public C18101d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f53446a = str;
            this.f53447b = i;
            this.f53448c = z;
            this.f53449d = str2;
            this.f53450e = i2;
            this.f53451f = i3;
        }

        /* renamed from: a */
        public String m55932a() {
            return this.f53446a;
        }

        /* renamed from: b */
        public int m55933b() {
            return this.f53451f;
        }

        /* renamed from: c */
        public int m55934c() {
            return this.f53450e;
        }

        /* renamed from: d */
        public String m55935d() {
            return this.f53449d;
        }

        /* renamed from: e */
        public int m55936e() {
            return this.f53447b;
        }

        /* renamed from: f */
        public boolean m55937f() {
            return this.f53448c;
        }
    }

    /* renamed from: o.xb7$e */
    public static final class C18102e implements InterfaceC18099b {

        /* renamed from: a */
        public final ub7 f53452a;

        /* renamed from: b */
        public final int f53453b;

        /* renamed from: c */
        public final int f53454c;

        /* renamed from: d */
        public final String f53455d;

        public C18102e(ub7 ub7Var, int i, int i2, String str) {
            this.f53452a = ub7Var;
            this.f53454c = i;
            this.f53453b = i2;
            this.f53455d = str;
        }

        /* renamed from: a */
        public int m55938a() {
            return this.f53454c;
        }

        /* renamed from: b */
        public ub7 m55939b() {
            return this.f53452a;
        }

        /* renamed from: c */
        public String m55940c() {
            return this.f53455d;
        }

        /* renamed from: d */
        public int m55941d() {
            return this.f53453b;
        }
    }

    /* renamed from: a */
    public static int m55922a(TypedArray typedArray, int i) {
        return C18098a.m55930a(typedArray, i);
    }

    /* renamed from: b */
    public static InterfaceC18099b m55923b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m55925d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List m55924c(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m55922a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m55929h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m55929h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static InterfaceC18099b m55925d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m55926e(xmlPullParser, resources);
        }
        m55928g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static InterfaceC18099b m55926e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), obe.FontFamily);
        String string = typedArrayObtainAttributes.getString(obe.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(obe.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(obe.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(obe.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(obe.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(obe.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(obe.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m55928g(xmlPullParser);
            }
            return new C18102e(new ub7(string, string2, string3, m55924c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m55927f(xmlPullParser, resources));
                } else {
                    m55928g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C18100c((C18101d[]) arrayList.toArray(new C18101d[0]));
    }

    /* renamed from: f */
    public static C18101d m55927f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), obe.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(obe.FontFamilyFont_fontWeight) ? obe.FontFamilyFont_fontWeight : obe.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(obe.FontFamilyFont_fontStyle) ? obe.FontFamilyFont_fontStyle : obe.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(obe.FontFamilyFont_ttcIndex) ? obe.FontFamilyFont_ttcIndex : obe.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(obe.FontFamilyFont_fontVariationSettings) ? obe.FontFamilyFont_fontVariationSettings : obe.FontFamilyFont_android_fontVariationSettings);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(obe.FontFamilyFont_font) ? obe.FontFamilyFont_font : obe.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m55928g(xmlPullParser);
        }
        return new C18101d(string2, i, z, string, i3, resourceId);
    }

    /* renamed from: g */
    public static void m55928g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static List m55929h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
