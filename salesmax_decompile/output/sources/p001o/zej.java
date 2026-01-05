package p001o;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p001o.nf8;
import p001o.rmb;

/* loaded from: classes2.dex */
public abstract class zej {

    /* renamed from: a */
    public static final String[] f57114a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f57115b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f57116c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static rmb m59360a(String str) {
        try {
            return m59361b(str);
        } catch (NumberFormatException | byc | XmlPullParserException unused) {
            ria.m46824h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    public static rmb m59361b(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!lej.m37052f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw byc.m19921a("Couldn't find xmp metadata", null);
        }
        nf8 nf8VarM40499E = nf8.m40499E();
        long jM59364e = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (lej.m37052f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!m59363d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jM59364e = m59364e(xmlPullParserNewPullParser);
                nf8VarM40499E = m59362c(xmlPullParserNewPullParser);
            } else if (lej.m37052f(xmlPullParserNewPullParser, "Container:Directory")) {
                nf8VarM40499E = m59365f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (lej.m37052f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                nf8VarM40499E = m59365f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!lej.m37050d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (nf8VarM40499E.isEmpty()) {
            return null;
        }
        return new rmb(jM59364e, nf8VarM40499E);
    }

    /* renamed from: c */
    public static nf8 m59362c(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f57116c) {
            String strM37047a = lej.m37047a(xmlPullParser, str);
            if (strM37047a != null) {
                return nf8.m40501G(new rmb.C16627a("image/jpeg", "Primary", 0L, 0L), new rmb.C16627a("video/mp4", "MotionPhoto", Long.parseLong(strM37047a), 0L));
            }
        }
        return nf8.m40499E();
    }

    /* renamed from: d */
    public static boolean m59363d(XmlPullParser xmlPullParser) {
        for (String str : f57114a) {
            String strM37047a = lej.m37047a(xmlPullParser, str);
            if (strM37047a != null) {
                return Integer.parseInt(strM37047a) == 1;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m59364e(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f57115b) {
            String strM37047a = lej.m37047a(xmlPullParser, str);
            if (strM37047a != null) {
                long j = Long.parseLong(strM37047a);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public static nf8 m59365f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        nf8.C15566a c15566aM40508q = nf8.m40508q();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, str3)) {
                String strM37047a = lej.m37047a(xmlPullParser, str2 + ":Mime");
                String strM37047a2 = lej.m37047a(xmlPullParser, str2 + ":Semantic");
                String strM37047a3 = lej.m37047a(xmlPullParser, str2 + ":Length");
                String strM37047a4 = lej.m37047a(xmlPullParser, str2 + ":Padding");
                if (strM37047a == null || strM37047a2 == null) {
                    return nf8.m40499E();
                }
                c15566aM40508q.mo32056a(new rmb.C16627a(strM37047a, strM37047a2, strM37047a3 != null ? Long.parseLong(strM37047a3) : 0L, strM37047a4 != null ? Long.parseLong(strM37047a4) : 0L));
            }
        } while (!lej.m37050d(xmlPullParser, str4));
        return c15566aM40508q.m40520k();
    }
}
