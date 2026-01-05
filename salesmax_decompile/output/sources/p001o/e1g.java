package p001o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p001o.d1g;
import p001o.qyc;

/* loaded from: classes2.dex */
public class e1g implements qyc.InterfaceC16488a {

    /* renamed from: a */
    public final XmlPullParserFactory f20763a;

    /* renamed from: o.e1g$a */
    public static abstract class AbstractC13079a {

        /* renamed from: a */
        public final String f20764a;

        /* renamed from: b */
        public final String f20765b;

        /* renamed from: c */
        public final AbstractC13079a f20766c;

        /* renamed from: d */
        public final List f20767d = new LinkedList();

        public AbstractC13079a(AbstractC13079a abstractC13079a, String str, String str2) {
            this.f20766c = abstractC13079a;
            this.f20764a = str;
            this.f20765b = str2;
        }

        /* renamed from: a */
        public void mo24094a(Object obj) {
        }

        /* renamed from: b */
        public abstract Object mo24095b();

        /* renamed from: c */
        public final Object m24096c(String str) {
            for (int i = 0; i < this.f20767d.size(); i++) {
                Pair pair = (Pair) this.f20767d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            AbstractC13079a abstractC13079a = this.f20766c;
            if (abstractC13079a == null) {
                return null;
            }
            return abstractC13079a.m24096c(str);
        }

        /* renamed from: d */
        public boolean mo24097d(String str) {
            return false;
        }

        /* renamed from: e */
        public final AbstractC13079a m24098e(AbstractC13079a abstractC13079a, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C13082d(abstractC13079a, str2);
            }
            if ("Protection".equals(str)) {
                return new C13081c(abstractC13079a, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C13084f(abstractC13079a, str2);
            }
            return null;
        }

        /* renamed from: f */
        public final Object m24099f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f20765b.equals(name)) {
                        mo24107n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo24097d(name)) {
                            mo24107n(xmlPullParser);
                        } else {
                            AbstractC13079a abstractC13079aM24098e = m24098e(this, name, this.f20764a);
                            if (abstractC13079aM24098e == null) {
                                i = 1;
                            } else {
                                mo24094a(abstractC13079aM24098e.m24099f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo24108o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo24101h(xmlPullParser);
                    if (!mo24097d(name2)) {
                        return mo24095b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        public final boolean m24100g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* renamed from: h */
        public void mo24101h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        public final int m24102i(XmlPullParser xmlPullParser, String str, int i) throws byc {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw byc.m19923c(null, e);
            }
        }

        /* renamed from: j */
        public final long m24103j(XmlPullParser xmlPullParser, String str, long j) throws byc {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw byc.m19923c(null, e);
            }
        }

        /* renamed from: k */
        public final int m24104k(XmlPullParser xmlPullParser, String str) throws byc {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C13080b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw byc.m19923c(null, e);
            }
        }

        /* renamed from: l */
        public final long m24105l(XmlPullParser xmlPullParser, String str) throws byc {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C13080b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw byc.m19923c(null, e);
            }
        }

        /* renamed from: m */
        public final String m24106m(XmlPullParser xmlPullParser, String str) throws C13080b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C13080b(str);
        }

        /* renamed from: n */
        public abstract void mo24107n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        public void mo24108o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        public final void m24109p(String str, Object obj) {
            this.f20767d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: o.e1g$b */
    public static class C13080b extends byc {
        public C13080b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* renamed from: o.e1g$c */
    public static class C13081c extends AbstractC13079a {

        /* renamed from: e */
        public boolean f20768e;

        /* renamed from: f */
        public UUID f20769f;

        /* renamed from: g */
        public byte[] f20770g;

        public C13081c(AbstractC13079a abstractC13079a, String str) {
            super(abstractC13079a, str, "Protection");
        }

        /* renamed from: q */
        public static nth[] m24110q(byte[] bArr) {
            return new nth[]{new nth(true, null, 8, m24111r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        public static byte[] m24111r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            m24113t(bArrDecode, 0, 3);
            m24113t(bArrDecode, 1, 2);
            m24113t(bArrDecode, 4, 5);
            m24113t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        /* renamed from: s */
        public static String m24112s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* renamed from: t */
        public static void m24113t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: b */
        public Object mo24095b() {
            UUID uuid = this.f20769f;
            return new d1g.C12782a(uuid, d3e.m22307a(uuid, this.f20770g), m24110q(this.f20770g));
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: d */
        public boolean mo24097d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: h */
        public void mo24101h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f20768e = false;
            }
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: n */
        public void mo24107n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f20768e = true;
                this.f20769f = UUID.fromString(m24112s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: o */
        public void mo24108o(XmlPullParser xmlPullParser) {
            if (this.f20768e) {
                this.f20770g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: o.e1g$d */
    public static class C13082d extends AbstractC13079a {

        /* renamed from: e */
        public C2181a f20771e;

        public C13082d(AbstractC13079a abstractC13079a, String str) {
            super(abstractC13079a, str, "QualityLevel");
        }

        /* renamed from: q */
        public static List m24114q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrM48711P = sqi.m48711P(str);
                byte[][] bArrM30326i = hf3.m30326i(bArrM48711P);
                if (bArrM30326i == null) {
                    arrayList.add(bArrM48711P);
                } else {
                    Collections.addAll(arrayList, bArrM30326i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        public static String m24115r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: b */
        public Object mo24095b() {
            return this.f20771e;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo24107n(XmlPullParser xmlPullParser) throws byc {
            int i;
            C2181a.b bVar = new C2181a.b();
            String strM24115r = m24115r(m24106m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) m24096c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.m6754Q("video/mp4").v0(m24104k(xmlPullParser, "MaxWidth")).m6762Y(m24104k(xmlPullParser, "MaxHeight")).b0(m24114q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strM24115r == null) {
                    strM24115r = "audio/mp4a-latm";
                }
                int iM24104k = m24104k(xmlPullParser, "Channels");
                int iM24104k2 = m24104k(xmlPullParser, "SamplingRate");
                List listM24114q = m24114q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listM24114q.isEmpty() && "audio/mp4a-latm".equals(strM24115r)) {
                    listM24114q = Collections.singletonList(w5.m53962a(iM24104k2, iM24104k));
                }
                bVar.m6754Q("audio/mp4").m6751N(iM24104k).p0(iM24104k2).b0(listM24114q);
            } else if (iIntValue == 3) {
                String str = (String) m24096c("Subtype");
                if (str == null) {
                    i = 0;
                    bVar.m6754Q("application/mp4").m0(i);
                } else {
                    if (str.equals("CAPT")) {
                        i = 64;
                    } else if (str.equals("DESC")) {
                        i = 1024;
                    }
                    bVar.m6754Q("application/mp4").m0(i);
                }
            } else {
                bVar.m6754Q("application/mp4");
            }
            this.f20771e = bVar.a0(xmlPullParser.getAttributeValue(null, "Index")).c0((String) m24096c("Name")).o0(strM24115r).m6750M(m24104k(xmlPullParser, "Bitrate")).e0((String) m24096c("Language")).m6748K();
        }
    }

    /* renamed from: o.e1g$e */
    public static class C13083e extends AbstractC13079a {

        /* renamed from: e */
        public final List f20772e;

        /* renamed from: f */
        public int f20773f;

        /* renamed from: g */
        public int f20774g;

        /* renamed from: h */
        public long f20775h;

        /* renamed from: i */
        public long f20776i;

        /* renamed from: j */
        public long f20777j;

        /* renamed from: k */
        public int f20778k;

        /* renamed from: l */
        public boolean f20779l;

        /* renamed from: m */
        public d1g.C12782a f20780m;

        public C13083e(AbstractC13079a abstractC13079a, String str) {
            super(abstractC13079a, str, "SmoothStreamingMedia");
            this.f20778k = -1;
            this.f20780m = null;
            this.f20772e = new LinkedList();
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: a */
        public void mo24094a(Object obj) {
            if (obj instanceof d1g.C12783b) {
                this.f20772e.add((d1g.C12783b) obj);
            } else if (obj instanceof d1g.C12782a) {
                op0.m42517g(this.f20780m == null);
                this.f20780m = (d1g.C12782a) obj;
            }
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: b */
        public Object mo24095b() {
            int size = this.f20772e.size();
            d1g.C12783b[] c12783bArr = new d1g.C12783b[size];
            this.f20772e.toArray(c12783bArr);
            if (this.f20780m != null) {
                d1g.C12782a c12782a = this.f20780m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c12782a.f18985a, "video/mp4", c12782a.f18986b));
                for (int i = 0; i < size; i++) {
                    d1g.C12783b c12783b = c12783bArr[i];
                    int i2 = c12783b.f18988a;
                    if (i2 == 2 || i2 == 1) {
                        C2181a[] c2181aArr = c12783b.f18997j;
                        for (int i3 = 0; i3 < c2181aArr.length; i3++) {
                            c2181aArr[i3] = c2181aArr[i3].m6707a().m6758U(drmInitData).m6748K();
                        }
                    }
                }
            }
            return new d1g(this.f20773f, this.f20774g, this.f20775h, this.f20776i, this.f20777j, this.f20778k, this.f20779l, this.f20780m, c12783bArr);
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: n */
        public void mo24107n(XmlPullParser xmlPullParser) {
            this.f20773f = m24104k(xmlPullParser, "MajorVersion");
            this.f20774g = m24104k(xmlPullParser, "MinorVersion");
            this.f20775h = m24103j(xmlPullParser, "TimeScale", 10000000L);
            this.f20776i = m24105l(xmlPullParser, "Duration");
            this.f20777j = m24103j(xmlPullParser, "DVRWindowLength", 0L);
            this.f20778k = m24102i(xmlPullParser, "LookaheadCount", -1);
            this.f20779l = m24100g(xmlPullParser, "IsLive", false);
            m24109p("TimeScale", Long.valueOf(this.f20775h));
        }
    }

    /* renamed from: o.e1g$f */
    public static class C13084f extends AbstractC13079a {

        /* renamed from: e */
        public final String f20781e;

        /* renamed from: f */
        public final List f20782f;

        /* renamed from: g */
        public int f20783g;

        /* renamed from: h */
        public String f20784h;

        /* renamed from: i */
        public long f20785i;

        /* renamed from: j */
        public String f20786j;

        /* renamed from: k */
        public String f20787k;

        /* renamed from: l */
        public int f20788l;

        /* renamed from: m */
        public int f20789m;

        /* renamed from: n */
        public int f20790n;

        /* renamed from: o */
        public int f20791o;

        /* renamed from: p */
        public String f20792p;

        /* renamed from: q */
        public ArrayList f20793q;

        /* renamed from: r */
        public long f20794r;

        public C13084f(AbstractC13079a abstractC13079a, String str) {
            super(abstractC13079a, str, "StreamIndex");
            this.f20781e = str;
            this.f20782f = new LinkedList();
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: a */
        public void mo24094a(Object obj) {
            if (obj instanceof C2181a) {
                this.f20782f.add((C2181a) obj);
            }
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: b */
        public Object mo24095b() {
            C2181a[] c2181aArr = new C2181a[this.f20782f.size()];
            this.f20782f.toArray(c2181aArr);
            return new d1g.C12783b(this.f20781e, this.f20787k, this.f20783g, this.f20784h, this.f20785i, this.f20786j, this.f20788l, this.f20789m, this.f20790n, this.f20791o, this.f20792p, c2181aArr, this.f20793q, this.f20794r);
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: d */
        public boolean mo24097d(String str) {
            return "c".equals(str);
        }

        @Override // p001o.e1g.AbstractC13079a
        /* renamed from: n */
        public void mo24107n(XmlPullParser xmlPullParser) throws byc {
            if ("c".equals(xmlPullParser.getName())) {
                m24117r(xmlPullParser);
            } else {
                m24116q(xmlPullParser);
            }
        }

        /* renamed from: q */
        public final void m24116q(XmlPullParser xmlPullParser) throws byc {
            int iM24118s = m24118s(xmlPullParser);
            this.f20783g = iM24118s;
            m24109p("Type", Integer.valueOf(iM24118s));
            if (this.f20783g == 3) {
                this.f20784h = m24106m(xmlPullParser, "Subtype");
            } else {
                this.f20784h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m24109p("Subtype", this.f20784h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f20786j = attributeValue;
            m24109p("Name", attributeValue);
            this.f20787k = m24106m(xmlPullParser, "Url");
            this.f20788l = m24102i(xmlPullParser, "MaxWidth", -1);
            this.f20789m = m24102i(xmlPullParser, "MaxHeight", -1);
            this.f20790n = m24102i(xmlPullParser, "DisplayWidth", -1);
            this.f20791o = m24102i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f20792p = attributeValue2;
            m24109p("Language", attributeValue2);
            long jM24102i = m24102i(xmlPullParser, "TimeScale", -1);
            this.f20785i = jM24102i;
            if (jM24102i == -1) {
                this.f20785i = ((Long) m24096c("TimeScale")).longValue();
            }
            this.f20793q = new ArrayList();
        }

        /* renamed from: r */
        public final void m24117r(XmlPullParser xmlPullParser) throws byc {
            int size = this.f20793q.size();
            long jM24103j = m24103j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (jM24103j == -9223372036854775807L) {
                if (size == 0) {
                    jM24103j = 0;
                } else {
                    if (this.f20794r == -1) {
                        throw byc.m19923c("Unable to infer start time", null);
                    }
                    jM24103j = this.f20794r + ((Long) this.f20793q.get(size - 1)).longValue();
                }
            }
            this.f20793q.add(Long.valueOf(jM24103j));
            this.f20794r = m24103j(xmlPullParser, "d", -9223372036854775807L);
            long jM24103j2 = m24103j(xmlPullParser, "r", 1L);
            if (jM24103j2 > 1 && this.f20794r == -9223372036854775807L) {
                throw byc.m19923c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i;
                if (j >= jM24103j2) {
                    return;
                }
                this.f20793q.add(Long.valueOf((this.f20794r * j) + jM24103j));
                i++;
            }
        }

        /* renamed from: s */
        public final int m24118s(XmlPullParser xmlPullParser) throws byc {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C13080b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw byc.m19923c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public e1g() {
        try {
            this.f20763a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // p001o.qyc.InterfaceC16488a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d1g mo6958a(Uri uri, InputStream inputStream) throws XmlPullParserException, byc {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f20763a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (d1g) new C13083e(null, uri.toString()).m24099f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e) {
            throw byc.m19923c(null, e);
        }
    }
}
