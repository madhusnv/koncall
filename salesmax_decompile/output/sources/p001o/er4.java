package p001o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p001o.jbf;
import p001o.qyc;

/* loaded from: classes2.dex */
public class er4 extends DefaultHandler implements qyc.InterfaceC16488a {

    /* renamed from: b */
    public static final Pattern f22065b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    public static final Pattern f22066c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    public static final Pattern f22067d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    public static final int[] f22068e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    public final XmlPullParserFactory f22069a;

    /* renamed from: o.er4$a */
    public static final class C13250a {

        /* renamed from: a */
        public final C2181a f22070a;

        /* renamed from: b */
        public final nf8 f22071b;

        /* renamed from: c */
        public final jbf f22072c;

        /* renamed from: d */
        public final String f22073d;

        /* renamed from: e */
        public final ArrayList f22074e;

        /* renamed from: f */
        public final ArrayList f22075f;

        /* renamed from: g */
        public final long f22076g;

        /* renamed from: h */
        public final List f22077h;

        /* renamed from: i */
        public final List f22078i;

        public C13250a(C2181a c2181a, List list, jbf jbfVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j) {
            this.f22070a = c2181a;
            this.f22071b = nf8.m40511y(list);
            this.f22072c = jbfVar;
            this.f22073d = str;
            this.f22074e = arrayList;
            this.f22075f = arrayList2;
            this.f22077h = list2;
            this.f22078i = list3;
            this.f22076g = j;
        }
    }

    public er4() {
        try {
            this.f22069a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: D */
    public static int m25462D(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(rm5Var.f43794a) && (str = rm5Var.f43795b) != null) {
                Matcher matcher = f22066c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                ria.m46824h("MpdParser", "Unable to parse CEA-608 channel number from: " + rm5Var.f43795b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    public static int m25463E(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(rm5Var.f43794a) && (str = rm5Var.f43795b) != null) {
                Matcher matcher = f22067d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                ria.m46824h("MpdParser", "Unable to parse CEA-708 service block number from: " + rm5Var.f43795b);
            }
        }
        return -1;
    }

    /* renamed from: H */
    public static long m25464H(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : sqi.U0(attributeValue);
    }

    /* renamed from: I */
    public static rm5 m25465I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strR0 = r0(xmlPullParser, "schemeIdUri", "");
        String strR02 = r0(xmlPullParser, "value", null);
        String strR03 = r0(xmlPullParser, OutcomeConstants.OUTCOME_ID, null);
        do {
            xmlPullParser.next();
        } while (!lej.m37050d(xmlPullParser, str));
        return new rm5(strR0, strR02, strR03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m25466J(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strM35995e = kp0.m35995e(attributeValue);
        strM35995e.hashCode();
        switch (strM35995e) {
        }
        return -1;
    }

    /* renamed from: K */
    public static int m25467K(XmlPullParser xmlPullParser) {
        int iM25473U = m25473U(xmlPullParser, "value", -1);
        if (iM25473U <= 0 || iM25473U >= 33) {
            return -1;
        }
        return iM25473U;
    }

    /* renamed from: L */
    public static int m25468L(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    /* renamed from: M */
    public static long m25469M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : sqi.V0(attributeValue);
    }

    /* renamed from: N */
    public static String m25470N(List list) {
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            String str = rm5Var.f43794a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(rm5Var.f43795b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(rm5Var.f43795b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    public static float m25471R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    /* renamed from: S */
    public static float m25472S(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f22065b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    /* renamed from: U */
    public static int m25473U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: W */
    public static long m25474W(List list) {
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if (kp0.m35991a("http://dashif.org/guidelines/last-segment-number", rm5Var.f43794a)) {
                return Long.parseLong(rm5Var.f43795b);
            }
        }
        return -1L;
    }

    /* renamed from: X */
    public static long m25475X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    public static int m25476Z(XmlPullParser xmlPullParser) {
        int iM25473U = m25473U(xmlPullParser, "value", -1);
        if (iM25473U < 0) {
            return -1;
        }
        int[] iArr = f22068e;
        if (iM25473U < iArr.length) {
            return iArr[iM25473U];
        }
        return -1;
    }

    /* renamed from: p */
    public static int m25477p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        op0.m42517g(i == i2);
        return i;
    }

    /* renamed from: q */
    public static String m25478q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        op0.m42517g(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    public static void m25479r(ArrayList arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i);
            if (dr1.f20425c.equals(schemeData.f7892b) && (str = schemeData.f7893c) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i2);
            if (dr1.f20424b.equals(schemeData2.f7892b) && schemeData2.f7893c == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(dr1.f20425c, str, schemeData2.f7894d, schemeData2.f7895e));
            }
        }
    }

    public static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: s */
    public static void m25480s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(size);
            if (!schemeData.m6687c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((DrmInitData.SchemeData) arrayList.get(i)).m6685a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m25483w(xmlPullParser);
            }
        } while (!lej.m37050d(xmlPullParser, str));
        return text;
    }

    /* renamed from: t */
    public static long m25481t(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: u */
    public static String m25482u(String str, String str2) {
        if (xeb.m56185m(str)) {
            return xeb.m56174b(str2);
        }
        if (xeb.m56189q(str)) {
            return xeb.m56184l(str2);
        }
        if (xeb.m56188p(str) || xeb.m56186n(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strM56177e = xeb.m56177e(str2);
        return "text/vtt".equals(strM56177e) ? "application/x-mp4-vtt" : strM56177e;
    }

    /* renamed from: w */
    public static void m25483w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (lej.m37051e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (lej.m37051e(xmlPullParser)) {
                    i++;
                } else if (lej.m37049c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m25484A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iM25467K;
        String strR0 = r0(xmlPullParser, "schemeIdUri", null);
        strR0.hashCode();
        iM25467K = -1;
        switch (strR0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iM25467K = m25467K(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iM25467K = m25473U(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iM25467K = m25466J(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iM25467K = m25476Z(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iM25467K = m25468L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!lej.m37050d(xmlPullParser, "AudioChannelConfiguration"));
        return iM25467K;
    }

    /* renamed from: B */
    public long m25485B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: C */
    public List m25486C(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strS0 = s0(xmlPullParser, "BaseURL");
        if (a8i.m16685c(strS0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strS0;
            }
            return fga.m26654j(new ef1(strS0, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ef1 ef1Var = (ef1) list.get(i3);
            String strM16687e = a8i.m16687e(ef1Var.f21518a, strS0);
            String str = attributeValue3 == null ? strM16687e : attributeValue3;
            if (z) {
                i = ef1Var.f21520c;
                i2 = ef1Var.f21521d;
                str = ef1Var.f21519b;
            }
            arrayList.add(new ef1(strM16687e, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair m25487F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        ?? r4;
        String str;
        String text;
        ?? M22308b;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            String strM35995e = kp0.m35995e(attributeValue2);
            strM35995e.hashCode();
            switch (strM35995e) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    r4 = dr1.f20425c;
                    attributeValue = null;
                    str = null;
                    text = str;
                    M22308b = str;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    r4 = dr1.f20427e;
                    attributeValue = null;
                    str = null;
                    text = str;
                    M22308b = str;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    r4 = dr1.f20426d;
                    attributeValue = null;
                    str = null;
                    text = str;
                    M22308b = str;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strM37048b = lej.m37048b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strM37048b) && !"00000000-0000-0000-0000-000000000000".equals(strM37048b)) {
                        String[] strArrSplit = strM37048b.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        r4 = dr1.f20424b;
                        text = null;
                        M22308b = d3e.m22308b(r4, uuidArr, null);
                        break;
                    } else {
                        ria.m46824h("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r4 = null;
                        str = r4;
                        text = str;
                        M22308b = str;
                        break;
                    }
                default:
                    attributeValue = null;
                    r4 = null;
                    str = r4;
                    text = str;
                    M22308b = str;
                    break;
            }
        }
        do {
            xmlPullParser.next();
            if ((lej.m37052f(xmlPullParser, "clearkey:Laurl") || lej.m37052f(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                text = xmlPullParser.getText();
                M22308b = M22308b;
            } else if (lej.m37052f(xmlPullParser, "ms:laurl")) {
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
                M22308b = M22308b;
            } else if (M22308b == 0 && lej.m37053g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidM22312f = d3e.m22312f(bArrDecode);
                if (uuidM22312f == null) {
                    ria.m46824h("MpdParser", "Skipping malformed cenc:pssh data");
                    r4 = uuidM22312f;
                    M22308b = 0;
                } else {
                    M22308b = bArrDecode;
                    r4 = uuidM22312f;
                }
            } else if (M22308b == 0) {
                ?? r7 = dr1.f20427e;
                if (r7.equals(r4) && lej.m37052f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    M22308b = d3e.m22307a(r7, Base64.decode(xmlPullParser.getText(), 0));
                } else {
                    m25483w(xmlPullParser);
                    M22308b = M22308b;
                }
            }
        } while (!lej.m37050d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, r4 != null ? new DrmInitData.SchemeData(r4, text, "video/mp4", M22308b) : null);
    }

    /* renamed from: G */
    public int m25488G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: O */
    public Pair m25489O(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        long jM25475X = m25475X(xmlPullParser, OutcomeConstants.OUTCOME_ID, 0L);
        long jM25475X2 = m25475X(xmlPullParser, "duration", -9223372036854775807L);
        long jM25475X3 = m25475X(xmlPullParser, "presentationTime", 0L);
        long jA1 = sqi.a1(jM25475X2, 1000L, j);
        long jA12 = sqi.a1(jM25475X3 - j2, 1000000L, j);
        String strR0 = r0(xmlPullParser, "messageData", null);
        byte[] bArrM25490P = m25490P(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jA12);
        if (strR0 != null) {
            bArrM25490P = sqi.t0(strR0);
        }
        return Pair.create(lValueOf, m25497d(str, str2, jM25475X, jA1, bArrM25490P));
    }

    /* renamed from: P */
    public byte[] m25490P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, uh2.f48931c.name());
        xmlPullParser.nextToken();
        while (!lej.m37050d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: Q */
    public uk6 m25491Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        ArrayList arrayList;
        String strR0 = r0(xmlPullParser, "schemeIdUri", "");
        String strR02 = r0(xmlPullParser, "value", "");
        long jM25475X = m25475X(xmlPullParser, "timescale", 1L);
        long jM25475X2 = m25475X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j2 = jM25475X2;
                j = jM25475X2;
                arrayList = arrayList2;
                arrayList.add(m25489O(xmlPullParser, strR0, strR02, jM25475X, j2, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = jM25475X2;
                arrayList = arrayList2;
                m25483w(xmlPullParser);
            }
            if (lej.m37050d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            jM25475X2 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return m25498e(strR0, strR02, jM25475X, jArr, eventMessageArr);
    }

    /* renamed from: T */
    public zbe m25492T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: V */
    public bf9 m25493V(XmlPullParser xmlPullParser) {
        return new bf9(xmlPullParser.getAttributeValue(null, "lang"), s0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5 A[LOOP:0: B:24:0x00a2->B:81:0x01e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1 A[SYNTHETIC] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dr4 m25494Y(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException, NumberFormatException {
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        long j2;
        Throwable th;
        ArrayList arrayList3;
        long j3;
        boolean z2;
        long j4;
        er4 er4Var = this;
        boolean zM25509v = er4Var.m25509v(er4Var.b0(xmlPullParser, "profiles", new String[0]));
        long j5 = -9223372036854775807L;
        long jM25464H = m25464H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jM25469M = m25469M(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jM25469M2 = m25469M(xmlPullParser, "minBufferTime", -9223372036854775807L);
        Throwable th2 = null;
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jM25469M3 = zEquals ? m25469M(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jM25469M4 = zEquals ? m25469M(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jM25469M5 = zEquals ? m25469M(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jM25464H2 = m25464H(xmlPullParser, "publishTime", -9223372036854775807L);
        long jM25485B = zEquals ? 0L : -9223372036854775807L;
        boolean z3 = true;
        ArrayList arrayListM26654j = fga.m26654j(new ef1(uri.toString(), uri.toString(), zM25509v ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j6 = zEquals ? -9223372036854775807L : 0L;
        ymd ymdVarC0 = null;
        hqi hqiVarW0 = null;
        Uri uriM16688f = null;
        fgf fgfVarQ0 = null;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "BaseURL")) {
                if (!z5) {
                    jM25485B = er4Var.m25485B(xmlPullParser, jM25485B);
                    z5 = z3;
                }
                arrayList5.addAll(er4Var.m25486C(xmlPullParser, arrayListM26654j, zM25509v));
            } else if (lej.m37052f(xmlPullParser, "ProgramInformation")) {
                ymdVarC0 = c0(xmlPullParser);
            } else if (lej.m37052f(xmlPullParser, "UTCTiming")) {
                hqiVarW0 = w0(xmlPullParser);
            } else if (lej.m37052f(xmlPullParser, "Location")) {
                uriM16688f = a8i.m16688f(uri.toString(), xmlPullParser.nextText());
            } else if (lej.m37052f(xmlPullParser, "ServiceDescription")) {
                fgfVarQ0 = q0(xmlPullParser);
            } else {
                if (!lej.m37052f(xmlPullParser, "Period") || z4) {
                    j = jM25485B;
                    arrayList = arrayList5;
                    arrayList2 = arrayListM26654j;
                    z = z3;
                    j2 = j5;
                    th = th2;
                    arrayList3 = arrayList4;
                    m25483w(xmlPullParser);
                } else {
                    j = jM25485B;
                    ArrayList arrayList6 = arrayList4;
                    arrayList = arrayList5;
                    arrayList2 = arrayListM26654j;
                    z = z3;
                    j2 = j5;
                    th = th2;
                    Pair pairA0 = a0(xmlPullParser, !arrayList5.isEmpty() ? arrayList5 : arrayListM26654j, j6, j, jM25464H, jM25469M4, zM25509v);
                    g3d g3dVar = (g3d) pairA0.first;
                    if (g3dVar.f24527b != j2) {
                        long jLongValue = ((Long) pairA0.second).longValue();
                        if (jLongValue == j2) {
                            arrayList3 = arrayList6;
                            j3 = j2;
                        } else {
                            j3 = g3dVar.f24527b + jLongValue;
                            arrayList3 = arrayList6;
                        }
                        arrayList3.add(g3dVar);
                        j6 = j3;
                        z2 = z4;
                    } else {
                        if (!zEquals) {
                            throw byc.m19923c("Unable to determine start of period " + arrayList6.size(), th);
                        }
                        arrayList3 = arrayList6;
                        z2 = z;
                    }
                    z4 = z2;
                }
                jM25485B = j;
                if (!lej.m37050d(xmlPullParser, "MPD")) {
                    if (jM25469M != j2) {
                        j4 = jM25469M;
                    } else if (j6 != j2) {
                        j4 = j6;
                    } else {
                        if (!zEquals) {
                            throw byc.m19923c("Unable to determine duration of static manifest.", th);
                        }
                        j4 = jM25469M;
                    }
                    if (arrayList3.isEmpty()) {
                        throw byc.m19923c("No periods found.", th);
                    }
                    return m25500g(jM25464H, j4, jM25469M2, zEquals, jM25469M3, jM25469M4, jM25469M5, jM25464H2, ymdVarC0, hqiVarW0, fgfVarQ0, uriM16688f, arrayList3);
                }
                arrayList4 = arrayList3;
                th2 = th;
                arrayList5 = arrayList;
                z3 = z;
                arrayListM26654j = arrayList2;
                j5 = j2;
                er4Var = this;
            }
            arrayList = arrayList5;
            arrayList2 = arrayListM26654j;
            z = z3;
            j2 = j5;
            th = th2;
            arrayList3 = arrayList4;
            if (!lej.m37050d(xmlPullParser, "MPD")) {
            }
        }
    }

    public Pair a0(XmlPullParser xmlPullParser, List list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException, NumberFormatException {
        long j5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j6;
        jbf jbfVarL0;
        er4 er4Var = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, OutcomeConstants.OUTCOME_ID);
        long jM25469M = m25469M(xmlPullParser2, "start", j);
        long j7 = -9223372036854775807L;
        long j8 = j3 != -9223372036854775807L ? j3 + jM25469M : -9223372036854775807L;
        long jM25469M2 = m25469M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jM25485B = j2;
        boolean z2 = false;
        long j9 = -9223372036854775807L;
        jbf jbfVarJ0 = null;
        rm5 rm5VarM25465I = null;
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM25485B = er4Var.m25485B(xmlPullParser2, jM25485B);
                    z2 = true;
                }
                arrayList6.addAll(er4Var.m25486C(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j6 = j7;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (lej.m37052f(xmlPullParser2, "AdaptationSet")) {
                    j5 = jM25485B;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(m25511y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, jbfVarJ0, jM25469M2, jM25485B, j9, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j5 = jM25485B;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (lej.m37052f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(m25491Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (lej.m37052f(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        jbfVarJ0 = j0(xmlPullParser2, null);
                        obj = null;
                        jM25485B = j5;
                        j6 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (lej.m37052f(xmlPullParser2, "SegmentList")) {
                            long jM25485B2 = m25485B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            jbfVarL0 = k0(xmlPullParser, null, j8, jM25469M2, j5, jM25485B2, j4);
                            j9 = jM25485B2;
                            jM25485B = j5;
                            j6 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (lej.m37052f(xmlPullParser2, "SegmentTemplate")) {
                                long jM25485B3 = m25485B(xmlPullParser2, -9223372036854775807L);
                                j6 = -9223372036854775807L;
                                jbfVarL0 = l0(xmlPullParser, null, nf8.m40499E(), j8, jM25469M2, j5, jM25485B3, j4);
                                j9 = jM25485B3;
                                jM25485B = j5;
                            } else {
                                j6 = -9223372036854775807L;
                                if (lej.m37052f(xmlPullParser2, "AssetIdentifier")) {
                                    rm5VarM25465I = m25465I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    m25483w(xmlPullParser);
                                }
                                jM25485B = j5;
                            }
                        }
                        jbfVarJ0 = jbfVarL0;
                    }
                }
                obj = null;
                j6 = -9223372036854775807L;
                jM25485B = j5;
            }
            if (lej.m37050d(xmlPullParser2, "Period")) {
                return Pair.create(m25501h(attributeValue, jM25469M, arrayList2, arrayList3, rm5VarM25465I), Long.valueOf(jM25469M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j7 = j6;
            er4Var = this;
        }
    }

    /* renamed from: b */
    public final long m25495b(List list, long j, long j2, int i, long j3) {
        int iM48732k = i >= 0 ? i + 1 : (int) sqi.m48732k(j3 - j, j2);
        for (int i2 = 0; i2 < iM48732k; i2++) {
            list.add(m25506m(j, j2));
            j += j2;
        }
        return j;
    }

    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    /* renamed from: c */
    public tv m25496c(long j, int i, List list, List list2, List list3, List list4) {
        return new tv(j, i, list, list2, list3, list4);
    }

    public ymd c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strR0 = r0(xmlPullParser, "moreInformationURL", null);
        String strR02 = r0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (lej.m37052f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (lej.m37052f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                m25483w(xmlPullParser);
            }
            String str = strNextText3;
            if (lej.m37050d(xmlPullParser, "ProgramInformation")) {
                return new ymd(strNextText, strNextText2, str, strR0, strR02);
            }
            strNextText3 = str;
        }
    }

    /* renamed from: d */
    public EventMessage m25497d(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    public zbe d0(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return m25502i(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return m25502i(attributeValue, j, j2);
    }

    /* renamed from: e */
    public uk6 m25498e(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new uk6(str, str2, j, jArr, eventMessageArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C13250a e0(XmlPullParser xmlPullParser, List list, String str, String str2, int i, int i2, float f, int i3, int i4, String str3, List list2, List list3, List list4, List list5, jbf jbfVar, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int iM25484A;
        long jM25485B;
        ArrayList arrayList7;
        jbf c14491e;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        er4 er4Var = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, OutcomeConstants.OUTCOME_ID);
        int iM25473U = m25473U(xmlPullParser, "bandwidth", -1);
        String strR0 = r0(xmlPullParser, "mimeType", str);
        String strR02 = r0(xmlPullParser, "codecs", str2);
        int iM25473U2 = m25473U(xmlPullParser, "width", i);
        int iM25473U3 = m25473U(xmlPullParser, "height", i2);
        float fM25472S = m25472S(xmlPullParser, f);
        int iM25473U4 = m25473U(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(list4);
        ArrayList arrayList15 = new ArrayList(list5);
        ArrayList arrayList16 = new ArrayList();
        int i5 = i3;
        long jM25485B2 = j3;
        boolean z2 = false;
        String str4 = null;
        jbf jbfVarL0 = jbfVar;
        long j7 = j4;
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    jM25485B2 = er4Var.m25485B(xmlPullParser, jM25485B2);
                    z2 = true;
                }
                arrayList16.addAll(er4Var.m25486C(xmlPullParser, list, z));
            } else if (lej.m37052f(xmlPullParser, "AudioChannelConfiguration")) {
                c14491e = jbfVarL0;
                arrayList10 = arrayList16;
                arrayList4 = arrayList12;
                iM25484A = m25484A(xmlPullParser);
                arrayList5 = arrayList13;
                arrayList6 = arrayList15;
                arrayList11 = arrayList10;
                if (lej.m37050d(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList15 = arrayList6;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                jbfVarL0 = c14491e;
                er4Var = this;
                i5 = iM25484A;
                arrayList16 = arrayList11;
            } else if (lej.m37052f(xmlPullParser, "SegmentBase")) {
                jbfVarL0 = er4Var.j0(xmlPullParser, (jbf.C14491e) jbfVarL0);
            } else {
                if (lej.m37052f(xmlPullParser, "SegmentList")) {
                    jM25485B = er4Var.m25485B(xmlPullParser, j7);
                    j6 = jM25485B2;
                    arrayList9 = arrayList16;
                    arrayList = arrayList15;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    jbfVarL0 = k0(xmlPullParser, (jbf.C14488b) jbfVarL0, j, j2, j6, jM25485B, j5);
                    arrayList4 = arrayList12;
                } else {
                    j6 = jM25485B2;
                    ArrayList arrayList17 = arrayList16;
                    arrayList = arrayList15;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    if (lej.m37052f(xmlPullParser, "SegmentTemplate")) {
                        jM25485B = er4Var.m25485B(xmlPullParser, j7);
                        arrayList4 = arrayList12;
                        jbfVarL0 = l0(xmlPullParser, (jbf.C14489c) jbfVarL0, list5, j, j2, j6, jM25485B, j5);
                        arrayList9 = arrayList17;
                    } else {
                        arrayList4 = arrayList12;
                        if (lej.m37052f(xmlPullParser, "ContentProtection")) {
                            Pair pairM25487F = m25487F(xmlPullParser);
                            Object obj = pairM25487F.first;
                            if (obj != null) {
                                str4 = (String) obj;
                            }
                            Object obj2 = pairM25487F.second;
                            if (obj2 != null) {
                                arrayList4.add((DrmInitData.SchemeData) obj2);
                            }
                            iM25484A = i5;
                            arrayList8 = arrayList17;
                            jM25485B2 = j6;
                            arrayList6 = arrayList;
                            arrayList5 = arrayList2;
                            arrayList14 = arrayList3;
                            arrayList7 = arrayList8;
                            c14491e = jbfVarL0;
                            arrayList11 = arrayList7;
                            if (lej.m37050d(xmlPullParser, "Representation")) {
                            }
                        } else {
                            if (lej.m37052f(xmlPullParser, "InbandEventStream")) {
                                arrayList5 = arrayList2;
                                arrayList5.add(m25465I(xmlPullParser, "InbandEventStream"));
                                arrayList6 = arrayList;
                                arrayList14 = arrayList3;
                            } else {
                                arrayList5 = arrayList2;
                                if (lej.m37052f(xmlPullParser, "EssentialProperty")) {
                                    arrayList14 = arrayList3;
                                    arrayList14.add(m25465I(xmlPullParser, "EssentialProperty"));
                                    arrayList6 = arrayList;
                                } else {
                                    arrayList14 = arrayList3;
                                    if (lej.m37052f(xmlPullParser, "SupplementalProperty")) {
                                        arrayList6 = arrayList;
                                        arrayList6.add(m25465I(xmlPullParser, "SupplementalProperty"));
                                    } else {
                                        arrayList6 = arrayList;
                                        m25483w(xmlPullParser);
                                    }
                                }
                            }
                            iM25484A = i5;
                            jM25485B2 = j6;
                            arrayList7 = arrayList17;
                            c14491e = jbfVarL0;
                            arrayList11 = arrayList7;
                            if (lej.m37050d(xmlPullParser, "Representation")) {
                            }
                        }
                    }
                }
                iM25484A = i5;
                j7 = jM25485B;
                arrayList8 = arrayList9;
                jM25485B2 = j6;
                arrayList6 = arrayList;
                arrayList5 = arrayList2;
                arrayList14 = arrayList3;
                arrayList7 = arrayList8;
                c14491e = jbfVarL0;
                arrayList11 = arrayList7;
                if (lej.m37050d(xmlPullParser, "Representation")) {
                }
            }
            arrayList10 = arrayList16;
            arrayList4 = arrayList12;
            iM25484A = i5;
            c14491e = jbfVarL0;
            arrayList5 = arrayList13;
            arrayList6 = arrayList15;
            arrayList11 = arrayList10;
            if (lej.m37050d(xmlPullParser, "Representation")) {
            }
        }
        ArrayList arrayList18 = arrayList6;
        ArrayList arrayList19 = arrayList14;
        ArrayList arrayList20 = arrayList5;
        C2181a c2181aM25499f = m25499f(attributeValue, strR0, iM25473U2, iM25473U3, fM25472S, iM25484A, iM25473U4, iM25473U, str3, list2, list3, strR02, arrayList19, arrayList18);
        if (c14491e == null) {
            c14491e = new jbf.C14491e();
        }
        boolean zIsEmpty = arrayList11.isEmpty();
        List list6 = arrayList11;
        if (zIsEmpty) {
            list6 = list;
        }
        return new C13250a(c2181aM25499f, list6, c14491e, str4, arrayList4, arrayList20, arrayList19, arrayList18, -1L);
    }

    /* renamed from: f */
    public C2181a m25499f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String strM25482u = m25482u(str2, str5);
        if ("audio/eac3".equals(strM25482u)) {
            strM25482u = m25470N(list4);
            if ("audio/eac3-joc".equals(strM25482u)) {
                str5 = "ec+3";
            }
        }
        int iP0 = p0(list);
        int iI0 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair pairT0 = t0(list3);
        C2181a.b bVarE0 = new C2181a.b().a0(str).m6754Q(str2).o0(strM25482u).m6752O(str5).j0(i5).q0(iP0).m0(iI0).e0(str3);
        int iM25463E = -1;
        C2181a.b bVarU0 = bVarE0.t0(pairT0 != null ? ((Integer) pairT0.first).intValue() : -1).u0(pairT0 != null ? ((Integer) pairT0.second).intValue() : -1);
        if (xeb.m56189q(strM25482u)) {
            bVarU0.v0(i).m6762Y(i2).m6761X(f);
        } else if (xeb.m56185m(strM25482u)) {
            bVarU0.m6751N(i3).p0(i4);
        } else if (xeb.m56188p(strM25482u)) {
            if ("application/cea-608".equals(strM25482u)) {
                iM25463E = m25462D(list2);
            } else if ("application/cea-708".equals(strM25482u)) {
                iM25463E = m25463E(list2);
            }
            bVarU0.m6749L(iM25463E);
        } else if (xeb.m56186n(strM25482u)) {
            bVarU0.v0(i).m6762Y(i2);
        }
        return bVarU0.m6748K();
    }

    public int f0(List list) {
        int iU0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            rm5 rm5Var = (rm5) list.get(i2);
            if (kp0.m35991a("urn:mpeg:dash:role:2011", rm5Var.f43794a)) {
                iU0 = g0(rm5Var.f43795b);
            } else if (kp0.m35991a("urn:tva:metadata:cs:AudioPurposeCS:2007", rm5Var.f43794a)) {
                iU0 = u0(rm5Var.f43795b);
            }
            i |= iU0;
        }
        return i;
    }

    /* renamed from: g */
    public dr4 m25500g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ymd ymdVar, hqi hqiVar, fgf fgfVar, Uri uri, List list) {
        return new dr4(j, j2, j3, z, j4, j5, j6, j7, ymdVar, hqiVar, fgfVar, uri, list);
    }

    public int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: h */
    public g3d m25501h(String str, long j, List list, List list2, rm5 rm5Var) {
        return new g3d(str, j, list, list2, rm5Var);
    }

    public int h0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (kp0.m35991a("http://dashif.org/guidelines/trickmode", ((rm5) list.get(i2)).f43794a)) {
                i |= Opcodes.ACC_ENUM;
            }
        }
        return i;
    }

    /* renamed from: i */
    public zbe m25502i(String str, long j, long j2) {
        return new zbe(str, j, j2);
    }

    public int i0(List list) {
        int iG0 = 0;
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if (kp0.m35991a("urn:mpeg:dash:role:2011", rm5Var.f43794a)) {
                iG0 |= g0(rm5Var.f43795b);
            }
        }
        return iG0;
    }

    /* renamed from: j */
    public tle m25503j(C13250a c13250a, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C2181a.b bVarM6707a = c13250a.f22070a.m6707a();
        if (str == null || !list.isEmpty()) {
            bVarM6707a.d0(list);
        } else {
            bVarM6707a.c0(str);
        }
        String str3 = c13250a.f22073d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList arrayList3 = c13250a.f22074e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m25479r(arrayList3);
            m25480s(arrayList3);
            bVarM6707a.m6758U(new DrmInitData(str3, arrayList3));
        }
        ArrayList arrayList4 = c13250a.f22075f;
        arrayList4.addAll(arrayList2);
        return tle.m50164o(c13250a.f22076g, bVarM6707a.m6748K(), c13250a.f22071b, c13250a.f22072c, arrayList4, c13250a.f22077h, c13250a.f22078i, null);
    }

    public jbf.C14491e j0(XmlPullParser xmlPullParser, jbf.C14491e c14491e) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jM25475X = m25475X(xmlPullParser, "timescale", c14491e != null ? c14491e.f30108b : 1L);
        long jM25475X2 = m25475X(xmlPullParser, "presentationTimeOffset", c14491e != null ? c14491e.f30109c : 0L);
        long j3 = c14491e != null ? c14491e.f30122d : 0L;
        long j4 = c14491e != null ? c14491e.f30123e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        zbe zbeVarM25492T = c14491e != null ? c14491e.f30107a : null;
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "Initialization")) {
                zbeVarM25492T = m25492T(xmlPullParser);
            } else {
                m25483w(xmlPullParser);
            }
        } while (!lej.m37050d(xmlPullParser, "SegmentBase"));
        return m25507n(zbeVarM25492T, jM25475X, jM25475X2, j2, j);
    }

    /* renamed from: k */
    public jbf.C14488b m25504k(zbe zbeVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        return new jbf.C14488b(zbeVar, j, j2, j3, j4, list, j5, list2, sqi.O0(j6), sqi.O0(j7));
    }

    public jbf.C14488b k0(XmlPullParser xmlPullParser, jbf.C14488b c14488b, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jM25475X = m25475X(xmlPullParser, "timescale", c14488b != null ? c14488b.f30108b : 1L);
        long jM25475X2 = m25475X(xmlPullParser, "presentationTimeOffset", c14488b != null ? c14488b.f30109c : 0L);
        long jM25475X3 = m25475X(xmlPullParser, "duration", c14488b != null ? c14488b.f30111e : -9223372036854775807L);
        long jM25475X4 = m25475X(xmlPullParser, "startNumber", c14488b != null ? c14488b.f30110d : 1L);
        long jM25481t = m25481t(j3, j4);
        List listM0 = null;
        List arrayList = null;
        zbe zbeVarM25492T = null;
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "Initialization")) {
                zbeVarM25492T = m25492T(xmlPullParser);
            } else if (lej.m37052f(xmlPullParser, "SegmentTimeline")) {
                listM0 = m0(xmlPullParser, jM25475X, j2);
            } else if (lej.m37052f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(n0(xmlPullParser));
            } else {
                m25483w(xmlPullParser);
            }
        } while (!lej.m37050d(xmlPullParser, "SegmentList"));
        if (c14488b != null) {
            if (zbeVarM25492T == null) {
                zbeVarM25492T = c14488b.f30107a;
            }
            if (listM0 == null) {
                listM0 = c14488b.f30112f;
            }
            if (arrayList == null) {
                arrayList = c14488b.f30116j;
            }
        }
        return m25504k(zbeVarM25492T, jM25475X, jM25475X2, jM25475X4, jM25475X3, listM0, jM25481t, arrayList, j5, j);
    }

    /* renamed from: l */
    public jbf.C14489c m25505l(zbe zbeVar, long j, long j2, long j3, long j4, long j5, List list, long j6, u8i u8iVar, u8i u8iVar2, long j7, long j8) {
        return new jbf.C14489c(zbeVar, j, j2, j3, j4, j5, list, j6, u8iVar, u8iVar2, sqi.O0(j7), sqi.O0(j8));
    }

    public jbf.C14489c l0(XmlPullParser xmlPullParser, jbf.C14489c c14489c, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jM25475X = m25475X(xmlPullParser, "timescale", c14489c != null ? c14489c.f30108b : 1L);
        long jM25475X2 = m25475X(xmlPullParser, "presentationTimeOffset", c14489c != null ? c14489c.f30109c : 0L);
        long jM25475X3 = m25475X(xmlPullParser, "duration", c14489c != null ? c14489c.f30111e : -9223372036854775807L);
        long jM25475X4 = m25475X(xmlPullParser, "startNumber", c14489c != null ? c14489c.f30110d : 1L);
        long jM25474W = m25474W(list);
        long jM25481t = m25481t(j3, j4);
        List listM0 = null;
        u8i u8iVarV0 = v0(xmlPullParser, "media", c14489c != null ? c14489c.f30118k : null);
        u8i u8iVarV02 = v0(xmlPullParser, "initialization", c14489c != null ? c14489c.f30117j : null);
        zbe zbeVarM25492T = null;
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "Initialization")) {
                zbeVarM25492T = m25492T(xmlPullParser);
            } else if (lej.m37052f(xmlPullParser, "SegmentTimeline")) {
                listM0 = m0(xmlPullParser, jM25475X, j2);
            } else {
                m25483w(xmlPullParser);
            }
        } while (!lej.m37050d(xmlPullParser, "SegmentTemplate"));
        if (c14489c != null) {
            if (zbeVarM25492T == null) {
                zbeVarM25492T = c14489c.f30107a;
            }
            if (listM0 == null) {
                listM0 = c14489c.f30112f;
            }
        }
        return m25505l(zbeVarM25492T, jM25475X, jM25475X2, jM25475X4, jM25474W, jM25475X3, listM0, jM25481t, u8iVarV02, u8iVarV0, j5, j);
    }

    /* renamed from: m */
    public jbf.C14490d m25506m(long j, long j2) {
        return new jbf.C14490d(j, j2);
    }

    public List m0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jM25495b = 0;
        long jM25475X = -9223372036854775807L;
        boolean z = false;
        int iM25473U = 0;
        do {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "S")) {
                long jM25475X2 = m25475X(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jM25495b = m25495b(arrayList, jM25495b, jM25475X, iM25473U, jM25475X2);
                }
                if (jM25475X2 == -9223372036854775807L) {
                    jM25475X2 = jM25495b;
                }
                jM25475X = m25475X(xmlPullParser, "d", -9223372036854775807L);
                iM25473U = m25473U(xmlPullParser, "r", 0);
                z = true;
                jM25495b = jM25475X2;
            } else {
                m25483w(xmlPullParser);
            }
        } while (!lej.m37050d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m25495b(arrayList, jM25495b, jM25475X, iM25473U, sqi.a1(j2, j, 1000L));
        }
        return arrayList;
    }

    /* renamed from: n */
    public jbf.C14491e m25507n(zbe zbeVar, long j, long j2, long j3, long j4) {
        return new jbf.C14491e(zbeVar, j, j2, j3, j4);
    }

    public zbe n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: o */
    public hqi m25508o(String str, String str2) {
        return new hqi(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals(MediaTrack.ROLE_FORCED_SUBTITLE) || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int p0(List list) {
        int iO0 = 0;
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if (kp0.m35991a("urn:mpeg:dash:role:2011", rm5Var.f43794a)) {
                iO0 |= o0(rm5Var.f43795b);
            }
        }
        return iO0;
    }

    public fgf q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jM25475X = -9223372036854775807L;
        long jM25475X2 = -9223372036854775807L;
        long jM25475X3 = -9223372036854775807L;
        float fM25471R = -3.4028235E38f;
        float fM25471R2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser, "Latency")) {
                jM25475X = m25475X(xmlPullParser, "target", -9223372036854775807L);
                jM25475X2 = m25475X(xmlPullParser, "min", -9223372036854775807L);
                jM25475X3 = m25475X(xmlPullParser, "max", -9223372036854775807L);
            } else if (lej.m37052f(xmlPullParser, "PlaybackRate")) {
                fM25471R = m25471R(xmlPullParser, "min", -3.4028235E38f);
                fM25471R2 = m25471R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j = jM25475X;
            long j2 = jM25475X2;
            long j3 = jM25475X3;
            float f = fM25471R;
            float f2 = fM25471R2;
            if (lej.m37050d(xmlPullParser, "ServiceDescription")) {
                return new fgf(j, j2, j3, f, f2);
            }
            jM25475X = j;
            jM25475X2 = j2;
            jM25475X3 = j3;
            fM25471R = f;
            fM25471R2 = f2;
        }
    }

    public Pair t0(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if ((kp0.m35991a("http://dashif.org/thumbnail_tile", rm5Var.f43794a) || kp0.m35991a("http://dashif.org/guidelines/thumbnail_tile", rm5Var.f43794a)) && (str = rm5Var.f43795b) != null) {
                String[] strArrI1 = sqi.i1(str, "x");
                if (strArrI1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrI1[0])), Integer.valueOf(Integer.parseInt(strArrI1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: v */
    public final boolean m25509v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public u8i v0(XmlPullParser xmlPullParser, String str, u8i u8iVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? u8i.m51212b(attributeValue) : u8iVar;
    }

    public hqi w0(XmlPullParser xmlPullParser) {
        return m25508o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // p001o.qyc.InterfaceC16488a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public dr4 mo6958a(Uri uri, InputStream inputStream) throws XmlPullParserException, byc {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f22069a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m25494Y(xmlPullParserNewPullParser, uri);
            }
            throw byc.m19923c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw byc.m19923c(null, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0353 A[LOOP:0: B:3:0x007f->B:74:0x0353, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0311 A[EDGE_INSN: B:75:0x0311->B:68:0x0311 BREAK  A[LOOP:0: B:3:0x007f->B:74:0x0353], SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tv m25511y(XmlPullParser xmlPullParser, List list, jbf jbfVar, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, NumberFormatException, IOException {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str;
        String str2;
        ArrayList arrayList8;
        long j6;
        ArrayList arrayList9;
        long j7;
        int i;
        ArrayList arrayList10;
        ArrayList arrayList11;
        long jM25485B;
        int i2;
        List list2;
        er4 er4Var = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long jM25475X = m25475X(xmlPullParser2, OutcomeConstants.OUTCOME_ID, -1L);
        int iM25488G = m25488G(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iM25473U = m25473U(xmlPullParser2, "width", -1);
        int iM25473U2 = m25473U(xmlPullParser2, "height", -1);
        float fM25472S = m25472S(xmlPullParser2, -1.0f);
        int iM25473U3 = m25473U(xmlPullParser2, "audioSamplingRate", -1);
        String str3 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, Constants.ScionAnalytics.PARAM_LABEL);
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        jbf jbfVarL0 = jbfVar;
        String str4 = attributeValue3;
        int iM25484A = -1;
        String str5 = null;
        boolean z2 = false;
        long jM25485B2 = j2;
        long j8 = j3;
        while (true) {
            xmlPullParser.next();
            if (lej.m37052f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM25485B2 = er4Var.m25485B(xmlPullParser2, jM25485B2);
                    z2 = true;
                }
                arrayList20.addAll(er4Var.m25486C(xmlPullParser2, list, z));
                jM25485B2 = jM25485B2;
                arrayList9 = arrayList19;
                arrayList2 = arrayList18;
                arrayList3 = arrayList17;
                arrayList4 = arrayList16;
                arrayList5 = arrayList15;
                arrayList7 = arrayList13;
                str = str3;
                arrayList11 = arrayList12;
            } else {
                long j9 = jM25485B2;
                ArrayList arrayList21 = arrayList12;
                if (lej.m37052f(xmlPullParser2, "ContentProtection")) {
                    Pair pairM25487F = m25487F(xmlPullParser);
                    Object obj2 = pairM25487F.first;
                    if (obj2 != null) {
                        str5 = (String) obj2;
                    }
                    Object obj3 = pairM25487F.second;
                    if (obj3 != null) {
                        arrayList13.add((DrmInitData.SchemeData) obj3);
                    }
                    arrayList9 = arrayList19;
                    arrayList2 = arrayList18;
                    arrayList3 = arrayList17;
                    arrayList4 = arrayList16;
                    arrayList5 = arrayList15;
                    arrayList7 = arrayList13;
                    str = str3;
                    arrayList11 = arrayList21;
                    jM25485B2 = j9;
                } else {
                    if (lej.m37052f(xmlPullParser2, "ContentComponent")) {
                        String strM25478q = m25478q(str4, xmlPullParser2.getAttributeValue(null, str3));
                        iM25488G = m25477p(iM25488G, m25488G(xmlPullParser));
                        str2 = strM25478q;
                        obj = null;
                        arrayList = arrayList20;
                        arrayList9 = arrayList19;
                        arrayList2 = arrayList18;
                        arrayList3 = arrayList17;
                        arrayList4 = arrayList16;
                        arrayList5 = arrayList15;
                        arrayList10 = arrayList14;
                        arrayList7 = arrayList13;
                        str = str3;
                        arrayList11 = arrayList21;
                        jM25485B2 = j9;
                    } else {
                        String str6 = str4;
                        if (lej.m37052f(xmlPullParser2, "Role")) {
                            arrayList16.add(m25465I(xmlPullParser2, "Role"));
                        } else if (lej.m37052f(xmlPullParser2, "AudioChannelConfiguration")) {
                            iM25484A = m25484A(xmlPullParser);
                            obj = null;
                            arrayList = arrayList20;
                            arrayList2 = arrayList18;
                            arrayList3 = arrayList17;
                            arrayList4 = arrayList16;
                            arrayList5 = arrayList15;
                            arrayList10 = arrayList14;
                            arrayList7 = arrayList13;
                            str = str3;
                            str2 = str6;
                            jM25485B2 = j9;
                            arrayList9 = arrayList19;
                            arrayList11 = arrayList21;
                        } else if (lej.m37052f(xmlPullParser2, "Accessibility")) {
                            arrayList15.add(m25465I(xmlPullParser2, "Accessibility"));
                        } else if (lej.m37052f(xmlPullParser2, "EssentialProperty")) {
                            arrayList17.add(m25465I(xmlPullParser2, "EssentialProperty"));
                        } else if (lej.m37052f(xmlPullParser2, "SupplementalProperty")) {
                            arrayList18.add(m25465I(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (lej.m37052f(xmlPullParser2, "Representation")) {
                                if (arrayList20.isEmpty()) {
                                    i2 = iM25488G;
                                    list2 = list;
                                } else {
                                    i2 = iM25488G;
                                    list2 = arrayList20;
                                }
                                arrayList = arrayList20;
                                arrayList2 = arrayList18;
                                arrayList3 = arrayList17;
                                arrayList4 = arrayList16;
                                arrayList5 = arrayList15;
                                arrayList6 = arrayList14;
                                arrayList7 = arrayList13;
                                arrayList8 = arrayList21;
                                str = str3;
                                obj = null;
                                str2 = str6;
                                C13250a c13250aE0 = e0(xmlPullParser, list2, attributeValue, attributeValue2, iM25473U, iM25473U2, fM25472S, iM25484A, iM25473U3, str6, arrayList4, arrayList5, arrayList3, arrayList2, jbfVarL0, j4, j, j9, j8, j5, z);
                                int iM25477p = m25477p(i2, xeb.m56181i(c13250aE0.f22070a.f7943n));
                                arrayList9 = arrayList19;
                                arrayList9.add(c13250aE0);
                                xmlPullParser2 = xmlPullParser;
                                jM25485B = j8;
                                iM25488G = iM25477p;
                                jM25485B2 = j9;
                            } else {
                                int i3 = iM25488G;
                                obj = null;
                                arrayList = arrayList20;
                                arrayList2 = arrayList18;
                                arrayList3 = arrayList17;
                                arrayList4 = arrayList16;
                                arrayList5 = arrayList15;
                                arrayList6 = arrayList14;
                                arrayList7 = arrayList13;
                                str = str3;
                                str2 = str6;
                                arrayList8 = arrayList21;
                                j6 = j9;
                                arrayList9 = arrayList19;
                                if (lej.m37052f(xmlPullParser, "SegmentBase")) {
                                    jM25485B = j8;
                                    jbfVarL0 = j0(xmlPullParser, (jbf.C14491e) jbfVarL0);
                                    iM25488G = i3;
                                    jM25485B2 = j6;
                                    arrayList10 = arrayList6;
                                    arrayList11 = arrayList8;
                                    xmlPullParser2 = xmlPullParser;
                                    if (!lej.m37050d(xmlPullParser2, "AdaptationSet")) {
                                        break;
                                    }
                                    arrayList14 = arrayList10;
                                    arrayList12 = arrayList11;
                                    arrayList19 = arrayList9;
                                    j8 = jM25485B;
                                    arrayList20 = arrayList;
                                    arrayList18 = arrayList2;
                                    arrayList17 = arrayList3;
                                    arrayList16 = arrayList4;
                                    arrayList15 = arrayList5;
                                    arrayList13 = arrayList7;
                                    str3 = str;
                                    str4 = str2;
                                    er4Var = this;
                                } else {
                                    if (lej.m37052f(xmlPullParser, "SegmentList")) {
                                        jM25485B = m25485B(xmlPullParser, j8);
                                        i = i3;
                                        jbfVarL0 = k0(xmlPullParser, (jbf.C14488b) jbfVarL0, j4, j, j6, jM25485B, j5);
                                        xmlPullParser2 = xmlPullParser;
                                    } else {
                                        j7 = j8;
                                        i = i3;
                                        if (lej.m37052f(xmlPullParser, "SegmentTemplate")) {
                                            jM25485B = m25485B(xmlPullParser, j7);
                                            xmlPullParser2 = xmlPullParser;
                                            jbfVarL0 = l0(xmlPullParser, (jbf.C14489c) jbfVarL0, arrayList2, j4, j, j6, jM25485B, j5);
                                        } else {
                                            xmlPullParser2 = xmlPullParser;
                                            if (lej.m37052f(xmlPullParser2, "InbandEventStream")) {
                                                arrayList10 = arrayList6;
                                                arrayList10.add(m25465I(xmlPullParser2, "InbandEventStream"));
                                                arrayList11 = arrayList8;
                                            } else {
                                                arrayList10 = arrayList6;
                                                if (lej.m37052f(xmlPullParser2, "Label")) {
                                                    arrayList11 = arrayList8;
                                                    arrayList11.add(m25493V(xmlPullParser));
                                                } else {
                                                    arrayList11 = arrayList8;
                                                    if (lej.m37051e(xmlPullParser)) {
                                                        m25512z(xmlPullParser);
                                                    }
                                                }
                                            }
                                            jM25485B = j7;
                                            jM25485B2 = j6;
                                            iM25488G = i;
                                            if (!lej.m37050d(xmlPullParser2, "AdaptationSet")) {
                                            }
                                        }
                                    }
                                    jM25485B2 = j6;
                                    iM25488G = i;
                                }
                            }
                            arrayList10 = arrayList6;
                            arrayList11 = arrayList8;
                            if (!lej.m37050d(xmlPullParser2, "AdaptationSet")) {
                            }
                        }
                        i = iM25488G;
                        obj = null;
                        arrayList = arrayList20;
                        arrayList2 = arrayList18;
                        arrayList3 = arrayList17;
                        arrayList4 = arrayList16;
                        arrayList5 = arrayList15;
                        arrayList10 = arrayList14;
                        arrayList7 = arrayList13;
                        str = str3;
                        str2 = str6;
                        j6 = j9;
                        j7 = j8;
                        arrayList9 = arrayList19;
                        arrayList11 = arrayList21;
                        jM25485B = j7;
                        jM25485B2 = j6;
                        iM25488G = i;
                        if (!lej.m37050d(xmlPullParser2, "AdaptationSet")) {
                        }
                    }
                    jM25485B = j8;
                    if (!lej.m37050d(xmlPullParser2, "AdaptationSet")) {
                    }
                }
            }
            str2 = str4;
            obj = null;
            jM25485B = j8;
            arrayList = arrayList20;
            arrayList10 = arrayList14;
            if (!lej.m37050d(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList22 = new ArrayList(arrayList9.size());
        for (int i4 = 0; i4 < arrayList9.size(); i4++) {
            arrayList22.add(m25503j((C13250a) arrayList9.get(i4), attributeValue4, arrayList11, str5, arrayList7, arrayList10));
        }
        return m25496c(jM25475X, iM25488G, arrayList22, arrayList5, arrayList3, arrayList2);
    }

    /* renamed from: z */
    public void m25512z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m25483w(xmlPullParser);
    }
}
