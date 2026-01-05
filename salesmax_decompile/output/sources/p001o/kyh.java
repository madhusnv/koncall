package p001o;

import android.text.Layout;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class kyh implements qbg {

    /* renamed from: b */
    public static final Pattern f32838b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c */
    public static final Pattern f32839c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d */
    public static final Pattern f32840d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e */
    public static final Pattern f32841e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f */
    public static final Pattern f32842f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: g */
    public static final Pattern f32843g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: h */
    public static final Pattern f32844h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i */
    public static final C14935a f32845i = new C14935a(30.0f, 1, 1);

    /* renamed from: a */
    public final XmlPullParserFactory f32846a;

    /* renamed from: o.kyh$a */
    public static final class C14935a {

        /* renamed from: a */
        public final float f32847a;

        /* renamed from: b */
        public final int f32848b;

        /* renamed from: c */
        public final int f32849c;

        public C14935a(float f, int i, int i2) {
            this.f32847a = f;
            this.f32848b = i;
            this.f32849c = i2;
        }
    }

    /* renamed from: o.kyh$b */
    public static final class C14936b {

        /* renamed from: a */
        public final int f32850a;

        /* renamed from: b */
        public final int f32851b;

        public C14936b(int i, int i2) {
            this.f32850a = i;
            this.f32851b = i2;
        }
    }

    public kyh() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f32846a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: d */
    public static nyh m36340d(nyh nyhVar) {
        return nyhVar == null ? new nyh() : nyhVar;
    }

    /* renamed from: e */
    public static boolean m36341e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(TransferTable.COLUMN_REGION) || str.equals("metadata") || str.equals("image") || str.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) || str.equals("information");
    }

    /* renamed from: f */
    public static Layout.Alignment m36342f(String str) {
        String strM35995e = kp0.m35995e(str);
        strM35995e.hashCode();
        switch (strM35995e) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static int m36343g(XmlPullParser xmlPullParser, int i) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        Matcher matcher = f32844h.matcher(attributeValue);
        if (!matcher.matches()) {
            ria.m46824h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
        boolean z = true;
        try {
            int i2 = Integer.parseInt((String) op0.m42515e(matcher.group(1)));
            int i3 = Integer.parseInt((String) op0.m42515e(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            op0.m42512b(z, "Invalid cell resolution " + i2 + " " + i3);
            return i3;
        } catch (NumberFormatException unused) {
            ria.m46824h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
    }

    /* renamed from: h */
    public static void m36344h(String str, nyh nyhVar) throws ibg {
        Matcher matcher;
        String str2;
        String[] strArrI1 = sqi.i1(str, "\\s+");
        if (strArrI1.length == 1) {
            matcher = f32840d.matcher(str);
        } else {
            if (strArrI1.length != 2) {
                throw new ibg("Invalid number of entries for fontSize: " + strArrI1.length + ".");
            }
            matcher = f32840d.matcher(strArrI1[1]);
            ria.m46824h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new ibg("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) op0.m42515e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                nyhVar.m41266z(3);
                break;
            case "em":
                nyhVar.m41266z(2);
                break;
            case "px":
                nyhVar.m41266z(1);
                break;
            default:
                throw new ibg("Invalid unit for fontSize: '" + str2 + "'.");
        }
        nyhVar.m41265y(Float.parseFloat((String) op0.m42515e(matcher.group(1))));
    }

    /* renamed from: i */
    public static C14935a m36345i(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            op0.m42512b(sqi.i1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        C14935a c14935a = f32845i;
        int i2 = c14935a.f32848b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c14935a.f32849c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C14935a(i * f, i2, i3);
    }

    /* renamed from: j */
    public static Map m36346j(XmlPullParser xmlPullParser, Map map, int i, C14936b c14936b, Map map2, Map map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "style")) {
                String strM37047a = lej.m37047a(xmlPullParser, "style");
                nyh nyhVarM36351o = m36351o(xmlPullParser, new nyh());
                if (strM37047a != null) {
                    for (String str : m36352p(strM37047a)) {
                        nyhVarM36351o.m41241a((nyh) map.get(str));
                    }
                }
                String strM41247g = nyhVarM36351o.m41247g();
                if (strM41247g != null) {
                    map.put(strM41247g, nyhVarM36351o);
                }
            } else if (lej.m37052f(xmlPullParser, TransferTable.COLUMN_REGION)) {
                lyh lyhVarM36349m = m36349m(xmlPullParser, i, c14936b);
                if (lyhVarM36349m != null) {
                    map2.put(lyhVarM36349m.f34531a, lyhVarM36349m);
                }
            } else if (lej.m37052f(xmlPullParser, "metadata")) {
                m36347k(xmlPullParser, map3);
            }
        } while (!lej.m37050d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: k */
    public static void m36347k(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strM37047a;
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "image") && (strM37047a = lej.m37047a(xmlPullParser, OutcomeConstants.OUTCOME_ID)) != null) {
                map.put(strM37047a, xmlPullParser.nextText());
            }
        } while (!lej.m37050d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jyh m36348l(XmlPullParser xmlPullParser, jyh jyhVar, Map map, C14935a c14935a) throws NumberFormatException, ibg {
        long j;
        long j2;
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        nyh nyhVarM36351o = m36351o(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long jM36353q = -9223372036854775807L;
        long jM36353q2 = -9223372036854775807L;
        long jM36353q3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                case "dur":
                    jM36353q3 = m36353q(attributeValue, c14935a);
                    break;
                case "end":
                    jM36353q2 = m36353q(attributeValue, c14935a);
                    break;
                case "begin":
                    jM36353q = m36353q(attributeValue, c14935a);
                    break;
                case "style":
                    String[] strArrM36352p = m36352p(attributeValue);
                    if (strArrM36352p.length > 0) {
                        strArr = strArrM36352p;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (jyhVar != null) {
            long j3 = jyhVar.f31266d;
            j = -9223372036854775807L;
            if (j3 != -9223372036854775807L) {
                if (jM36353q != -9223372036854775807L) {
                    jM36353q += j3;
                }
                if (jM36353q2 != -9223372036854775807L) {
                    jM36353q2 += j3;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j4 = jM36353q;
        if (jM36353q2 != j) {
            j2 = jM36353q2;
        } else if (jM36353q3 != j) {
            j2 = j4 + jM36353q3;
        } else if (jyhVar != null) {
            long j5 = jyhVar.f31267e;
            if (j5 != j) {
                j2 = j5;
            }
        }
        return jyh.m34723c(xmlPullParser.getName(), j4, j2, nyhVarM36351o, strArr, str, strSubstring, jyhVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lyh m36349m(XmlPullParser xmlPullParser, int i, C14936b c14936b) throws NumberFormatException {
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        float f5;
        int i3;
        String strM37047a = lej.m37047a(xmlPullParser, OutcomeConstants.OUTCOME_ID);
        if (strM37047a == null) {
            return null;
        }
        String strM37047a2 = lej.m37047a(xmlPullParser, "origin");
        if (strM37047a2 == null) {
            ria.m46824h("TtmlParser", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f32842f;
        Matcher matcher = pattern.matcher(strM37047a2);
        Pattern pattern2 = f32843g;
        Matcher matcher2 = pattern2.matcher(strM37047a2);
        if (matcher.matches()) {
            try {
                float f6 = Float.parseFloat((String) op0.m42515e(matcher.group(1))) / 100.0f;
                f = Float.parseFloat((String) op0.m42515e(matcher.group(2))) / 100.0f;
                f2 = f6;
            } catch (NumberFormatException unused) {
                ria.m46824h("TtmlParser", "Ignoring region with malformed origin: " + strM37047a2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                ria.m46824h("TtmlParser", "Ignoring region with unsupported origin: " + strM37047a2);
                return null;
            }
            if (c14936b == null) {
                ria.m46824h("TtmlParser", "Ignoring region with missing tts:extent: " + strM37047a2);
                return null;
            }
            try {
                int i4 = Integer.parseInt((String) op0.m42515e(matcher2.group(1)));
                f2 = i4 / c14936b.f32850a;
                f = Integer.parseInt((String) op0.m42515e(matcher2.group(2))) / c14936b.f32851b;
            } catch (NumberFormatException unused2) {
                ria.m46824h("TtmlParser", "Ignoring region with malformed origin: " + strM37047a2);
                return null;
            }
        }
        String strM37047a3 = lej.m37047a(xmlPullParser, "extent");
        if (strM37047a3 == null) {
            ria.m46824h("TtmlParser", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strM37047a3);
        Matcher matcher4 = pattern2.matcher(strM37047a3);
        if (matcher3.matches()) {
            try {
                f3 = Float.parseFloat((String) op0.m42515e(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) op0.m42515e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                ria.m46824h("TtmlParser", "Ignoring region with malformed extent: " + strM37047a2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                ria.m46824h("TtmlParser", "Ignoring region with unsupported extent: " + strM37047a2);
                return null;
            }
            if (c14936b == null) {
                ria.m46824h("TtmlParser", "Ignoring region with missing tts:extent: " + strM37047a2);
                return null;
            }
            try {
                int i5 = Integer.parseInt((String) op0.m42515e(matcher4.group(1)));
                f3 = i5 / c14936b.f32850a;
                f4 = Integer.parseInt((String) op0.m42515e(matcher4.group(2))) / c14936b.f32851b;
            } catch (NumberFormatException unused4) {
                ria.m46824h("TtmlParser", "Ignoring region with malformed extent: " + strM37047a2);
                return null;
            }
        }
        String strM37047a4 = lej.m37047a(xmlPullParser, "displayAlign");
        boolean z = false;
        if (strM37047a4 != null) {
            String strM35995e = kp0.m35995e(strM37047a4);
            strM35995e.hashCode();
            if (strM35995e.equals("center")) {
                f5 = f + (f4 / 2.0f);
                i2 = 1;
            } else if (strM35995e.equals("after")) {
                f5 = f + f4;
                i2 = 2;
            } else {
                i2 = 0;
                f5 = f;
            }
        }
        float f7 = 1.0f / i;
        String strM37047a5 = lej.m37047a(xmlPullParser, "writingMode");
        if (strM37047a5 != null) {
            String strM35995e2 = kp0.m35995e(strM37047a5);
            strM35995e2.hashCode();
            switch (strM35995e2.hashCode()) {
                case 3694:
                    if (!strM35995e2.equals("tb")) {
                        z = -1;
                        break;
                    }
                    break;
                case 3553396:
                    if (strM35995e2.equals("tblr")) {
                        z = true;
                        break;
                    }
                    break;
                case 3553576:
                    if (strM35995e2.equals("tbrl")) {
                        z = 2;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                case true:
                    i3 = 2;
                    break;
                case true:
                    i3 = 1;
                    break;
                default:
                    i3 = Integer.MIN_VALUE;
                    break;
            }
        }
        return new lyh(strM37047a, f2, f5, 0, i2, f3, f4, 1, f7, i3);
    }

    /* renamed from: n */
    public static float m36350n(String str) {
        Matcher matcher = f32841e.matcher(str);
        if (!matcher.matches()) {
            ria.m46824h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) op0.m42515e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            ria.m46825i("TtmlParser", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nyh m36351o(XmlPullParser xmlPullParser, nyh nyhVar) {
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            char c2 = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 2;
                        break;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 3;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals(OutcomeConstants.OUTCOME_ID)) {
                        c = 5;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = 6;
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = TokenParser.CR;
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    nyhVar = m36340d(nyhVar).m41231B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    nyhVar = m36340d(nyhVar).m41264x(attributeValue);
                    break;
                case 2:
                    nyhVar = m36340d(nyhVar).m41237H(m36342f(attributeValue));
                    break;
                case 3:
                    String strM35995e = kp0.m35995e(attributeValue);
                    strM35995e.hashCode();
                    switch (strM35995e) {
                        case "nounderline":
                            nyhVar = m36340d(nyhVar).m41240K(false);
                            break;
                        case "underline":
                            nyhVar = m36340d(nyhVar).m41240K(true);
                            break;
                        case "nolinethrough":
                            nyhVar = m36340d(nyhVar).m41232C(false);
                            break;
                        case "linethrough":
                            nyhVar = m36340d(nyhVar).m41232C(true);
                            break;
                    }
                case 4:
                    nyhVar = m36340d(nyhVar).m41262v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        nyhVar = m36340d(nyhVar).m41230A(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String strM35995e2 = kp0.m35995e(attributeValue);
                    strM35995e2.hashCode();
                    switch (strM35995e2.hashCode()) {
                        case -618561360:
                            if (strM35995e2.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            } else {
                                c2 = 65535;
                                break;
                            }
                        case -410956671:
                            if (strM35995e2.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -250518009:
                            if (strM35995e2.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (strM35995e2.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (strM35995e2.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (!strM35995e2.equals("text")) {
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 4:
                            nyhVar = m36340d(nyhVar).m41235F(2);
                            break;
                        case 1:
                            nyhVar = m36340d(nyhVar).m41235F(1);
                            break;
                        case 2:
                            nyhVar = m36340d(nyhVar).m41235F(4);
                            break;
                        case 3:
                        case 5:
                            nyhVar = m36340d(nyhVar).m41235F(3);
                            break;
                    }
                case 7:
                    nyhVar = m36340d(nyhVar);
                    try {
                        nyhVar.m41263w(vh3.m52769c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        ria.m46824h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    nyhVar = m36340d(nyhVar).m41236G(m36350n(attributeValue));
                    break;
                case '\t':
                    String strM35995e3 = kp0.m35995e(attributeValue);
                    strM35995e3.hashCode();
                    if (strM35995e3.equals("all")) {
                        nyhVar = m36340d(nyhVar).m41238I(true);
                        break;
                    } else if (strM35995e3.equals(DevicePublicKeyStringDef.NONE)) {
                        nyhVar = m36340d(nyhVar).m41238I(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        nyhVar = m36340d(nyhVar);
                        m36344h(attributeValue, nyhVar);
                        break;
                    } catch (ibg unused2) {
                        ria.m46824h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    nyhVar = m36340d(nyhVar).m41239J(zgh.m59389a(attributeValue));
                    break;
                case '\f':
                    String strM35995e4 = kp0.m35995e(attributeValue);
                    strM35995e4.hashCode();
                    if (strM35995e4.equals("before")) {
                        nyhVar = m36340d(nyhVar).m41234E(1);
                        break;
                    } else if (strM35995e4.equals("after")) {
                        nyhVar = m36340d(nyhVar).m41234E(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    nyhVar = m36340d(nyhVar);
                    try {
                        nyhVar.m41261u(vh3.m52769c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        ria.m46824h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    nyhVar = m36340d(nyhVar).m41233D(m36342f(attributeValue));
                    break;
            }
        }
        return nyhVar;
    }

    /* renamed from: p */
    public static String[] m36352p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : sqi.i1(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m36353q(String str, C14935a c14935a) throws NumberFormatException, ibg {
        double d;
        double d2;
        Matcher matcher = f32838b.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) op0.m42515e(matcher.group(1))) * 3600) + (Long.parseLong((String) op0.m42515e(matcher.group(2))) * 60) + Long.parseLong((String) op0.m42515e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d5 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c14935a.f32847a : 0.0d);
            if (matcher.group(6) != null) {
                d4 = (Long.parseLong(r13) / c14935a.f32848b) / c14935a.f32847a;
            }
            return (long) ((d5 + d4) * 1000000.0d);
        }
        Matcher matcher2 = f32839c.matcher(str);
        if (!matcher2.matches()) {
            throw new ibg("Malformed time expression: " + str);
        }
        double d6 = Double.parseDouble((String) op0.m42515e(matcher2.group(1)));
        String str2 = (String) op0.m42515e(matcher2.group(2));
        str2.hashCode();
        switch (str2.hashCode()) {
            case 102:
                if (!str2.equals("f")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 104:
                if (str2.equals("h")) {
                    c = 1;
                    break;
                }
                break;
            case Opcodes.LDIV /* 109 */:
                if (str2.equals("m")) {
                    c = 2;
                    break;
                }
                break;
            case 116:
                if (str2.equals("t")) {
                    c = 3;
                    break;
                }
                break;
            case 3494:
                if (!str2.equals("ms")) {
                }
                break;
        }
        switch (c) {
            case 0:
                d = c14935a.f32847a;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = c14935a.f32849c;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case 4:
                d = 1000.0d;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            default:
                return (long) (d6 * 1000000.0d);
        }
        d6 *= d2;
        return (long) (d6 * 1000000.0d);
    }

    /* renamed from: r */
    public static C14936b m36354r(XmlPullParser xmlPullParser) {
        String strM37047a = lej.m37047a(xmlPullParser, "extent");
        if (strM37047a == null) {
            return null;
        }
        Matcher matcher = f32843g.matcher(strM37047a);
        if (!matcher.matches()) {
            ria.m46824h("TtmlParser", "Ignoring non-pixel tts extent: " + strM37047a);
            return null;
        }
        try {
            return new C14936b(Integer.parseInt((String) op0.m42515e(matcher.group(1))), Integer.parseInt((String) op0.m42515e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            ria.m46824h("TtmlParser", "Ignoring malformed tts extent: " + strM37047a);
            return null;
        }
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        rba.m46486c(mo36355b(bArr, i, i2), c16330b, fu3Var);
    }

    @Override // p001o.qbg
    /* renamed from: b */
    public gbg mo36355b(byte[] bArr, int i, int i2) throws XmlPullParserException, NumberFormatException, IOException {
        char c;
        C14935a c14935a;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f32846a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new lyh(""));
            C14936b c14936bM36354r = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C14935a c14935aM36345i = f32845i;
            oyh oyhVar = null;
            int i3 = 0;
            int iM36343g = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                jyh jyhVar = (jyh) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c14935aM36345i = m36345i(xmlPullParserNewPullParser);
                            c = 15;
                            iM36343g = m36343g(xmlPullParserNewPullParser, 15);
                            c14936bM36354r = m36354r(xmlPullParserNewPullParser);
                        } else {
                            c = 15;
                        }
                        C14936b c14936b = c14936bM36354r;
                        C14935a c14935a2 = c14935aM36345i;
                        int i4 = iM36343g;
                        if (m36341e(name)) {
                            if ("head".equals(name)) {
                                c14935a = c14935a2;
                                m36346j(xmlPullParserNewPullParser, map, i4, c14936b, map2, map3);
                            } else {
                                c14935a = c14935a2;
                                try {
                                    jyh jyhVarM36348l = m36348l(xmlPullParserNewPullParser, jyhVar, map2, c14935a);
                                    arrayDeque.push(jyhVarM36348l);
                                    if (jyhVar != null) {
                                        jyhVar.m34727a(jyhVarM36348l);
                                    }
                                } catch (ibg e) {
                                    ria.m46825i("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            c14935aM36345i = c14935a;
                            c14936bM36354r = c14936b;
                            iM36343g = i4;
                        } else {
                            ria.m46822f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            c14935aM36345i = c14935a2;
                            c14936bM36354r = c14936b;
                            iM36343g = i4;
                        }
                    } else if (eventType == 4) {
                        ((jyh) op0.m42515e(jyhVar)).m34727a(jyh.m34724d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            oyhVar = new oyh((jyh) op0.m42515e((jyh) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (gbg) op0.m42515e(oyhVar);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 1;
    }
}
