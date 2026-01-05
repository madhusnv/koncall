package p001o;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class lej {
    /* renamed from: a */
    public static String m37047a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m37048b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m37054h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m37049c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m37050d(XmlPullParser xmlPullParser, String str) {
        return m37049c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m37051e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m37052f(XmlPullParser xmlPullParser, String str) {
        return m37051e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m37053g(XmlPullParser xmlPullParser, String str) {
        return m37051e(xmlPullParser) && m37054h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    public static String m37054h(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
