package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.xba;
import p001o.xej;

/* loaded from: classes3.dex */
public final class ydj {

    /* renamed from: a */
    public final q8g f55330a;

    /* renamed from: b */
    public xba f55331b;

    public ydj(q8g q8gVar) {
        sq8.m48649h(q8gVar, "source");
        this.f55330a = q8gVar;
        this.f55331b = xba.C18105c.f53460a;
    }

    /* renamed from: a */
    public final boolean m57662a() {
        return sq8.m48644c(this.f55331b, xba.C18104b.f53458a);
    }

    /* renamed from: b */
    public final q8g m57663b() {
        return this.f55330a;
    }

    /* renamed from: c */
    public final xej m57664c() {
        xba xbaVar = this.f55331b;
        xba xbaVar2 = xba.C18104b.f53458a;
        if (sq8.m48644c(xbaVar, xbaVar2)) {
            return null;
        }
        if (xbaVar instanceof xba.AbstractC18106d.a) {
            xba.AbstractC18106d.a aVar = (xba.AbstractC18106d.a) xbaVar;
            xba xbaVarM55945c = aVar.m55945c();
            if (xbaVarM55945c != null) {
                xbaVar2 = xbaVarM55945c;
            }
            this.f55331b = xbaVar2;
            return new xej.C18135b(aVar.mo55943a(), aVar.m55944b());
        }
        if (xbaVar instanceof xba.AbstractC18106d.b) {
            return (!this.f55330a.m45010h("<") || this.f55330a.m45010h("<![CDATA[")) ? m57672k() : m57671j();
        }
        if (sq8.m48644c(xbaVar, xba.C18105c.f53460a)) {
            m57674m();
            this.f55331b = xba.C18103a.f53456a;
            return m57664c();
        }
        if (!sq8.m48644c(xbaVar, xba.C18103a.f53456a)) {
            throw new szb();
        }
        m57675n();
        return m57671j();
    }

    /* renamed from: d */
    public final xej.C18137d m57665d(String str) {
        boolean z;
        List listC0 = f9g.C0(str, new char[]{':'}, false, 0, 6, null);
        if ((listC0 instanceof Collection) && listC0.isEmpty()) {
            z = false;
        } else {
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            String str2 = "Cannot understand qualified name '" + str + '\'';
            q8g q8gVarM57663b = m57663b();
            int iMax = Math.max(0, q8gVarM57663b.f41485c - 3);
            int iMin = Math.min(q8gVarM57663b.f41484b - 1, q8gVarM57663b.f41485c + 3);
            String strSubstring = q8gVarM57663b.f41483a.substring(iMax, iMin + 1);
            sq8.m48648g(strSubstring, "substring(...)");
            throw new an5(str2 + '\n' + ("At offset " + q8gVarM57663b.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b.f41485c - iMax) + '^')));
        }
        int size = listC0.size();
        if (size == 1) {
            return new xej.C18137d((String) listC0.get(0), null, 2, null);
        }
        if (size == 2) {
            return new xej.C18137d((String) listC0.get(1), (String) listC0.get(0));
        }
        String str3 = "Cannot understand qualified name '" + str + '\'';
        q8g q8gVarM57663b2 = m57663b();
        int iMax2 = Math.max(0, q8gVarM57663b2.f41485c - 3);
        int iMin2 = Math.min(q8gVarM57663b2.f41484b - 1, q8gVarM57663b2.f41485c + 3);
        String strSubstring2 = q8gVarM57663b2.f41483a.substring(iMax2, iMin2 + 1);
        sq8.m48648g(strSubstring2, "substring(...)");
        throw new an5(str3 + '\n' + ("At offset " + q8gVarM57663b2.f41485c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + r8g.f43158a.m38996h(strSubstring2, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b2.f41485c - iMax2) + '^')));
    }

    /* renamed from: e */
    public final hwc m57666e() {
        xej.C18137d c18137dM57668g = m57668g();
        m57675n();
        char cM45011i = this.f55330a.m45011i("trying to read attribute equals");
        if (cM45011i == '=') {
            m57675n();
            return vyh.m53620a(c18137dM57668g, m57669h());
        }
        String str = "Unexpected '" + cM45011i + "' while trying to read attribute equals";
        q8g q8gVarM57663b = m57663b();
        int iMax = Math.max(0, q8gVarM57663b.f41485c - 3);
        int iMin = Math.min(q8gVarM57663b.f41484b - 1, q8gVarM57663b.f41485c + 3);
        String strSubstring = q8gVarM57663b.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str + '\n' + ("At offset " + q8gVarM57663b.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b.f41485c - iMax) + '^')));
    }

    /* renamed from: f */
    public final String m57667f() {
        String strM45013k = this.f55330a.m45013k("]]>", "trying to read CDATA content");
        this.f55330a.m45006d(3, "trying to read end of CATA");
        return strM45013k;
    }

    /* renamed from: g */
    public final xej.C18137d m57668g() {
        return m57665d(this.f55330a.m45014l());
    }

    /* renamed from: h */
    public final String m57669h() {
        char cM45011i = this.f55330a.m45011i("trying to read attribute value");
        if (cM45011i != '\'' && cM45011i != '\"') {
            String str = "Unexpected '" + cM45011i + "' while trying to read attribute value";
            q8g q8gVarM57663b = m57663b();
            int iMax = Math.max(0, q8gVarM57663b.f41485c - 3);
            int iMin = Math.min(q8gVarM57663b.f41484b - 1, q8gVarM57663b.f41485c + 3);
            String strSubstring = q8gVarM57663b.f41483a.substring(iMax, iMin + 1);
            sq8.m48648g(strSubstring, "substring(...)");
            throw new an5(str + '\n' + ("At offset " + q8gVarM57663b.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b.f41485c - iMax) + '^')));
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            char cM45011i2 = this.f55330a.m45011i("trying to read a string");
            if (cM45011i2 == '&') {
                sb.append(m57670i());
            } else {
                if (cM45011i2 == '<') {
                    q8g q8gVarM57663b2 = m57663b();
                    int iMax2 = Math.max(0, q8gVarM57663b2.f41485c - 3);
                    int iMin2 = Math.min(q8gVarM57663b2.f41484b - 1, q8gVarM57663b2.f41485c + 3);
                    String strSubstring2 = q8gVarM57663b2.f41483a.substring(iMax2, iMin2 + 1);
                    sq8.m48648g(strSubstring2, "substring(...)");
                    throw new an5("Unexpected '<' while trying to read a string\n" + ("At offset " + q8gVarM57663b2.f41485c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + r8g.f43158a.m38996h(strSubstring2, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b2.f41485c - iMax2) + '^')));
                }
                if (cM45011i2 == cM45011i) {
                    String string = sb.toString();
                    sq8.m48648g(string, "toString(...)");
                    return string;
                }
                sb.append(cM45011i2);
            }
        }
    }

    /* renamed from: i */
    public final char[] m57670i() throws NumberFormatException {
        String strM45013k = this.f55330a.m45013k(";", "trying to read a char/entity reference");
        this.f55330a.m45006d(1, "trying to read the end of a char/entity reference");
        jta jtaVarM38994f = zdj.f57040a.m38994f(strM45013k);
        if (jtaVarM38994f != null) {
            return mqi.m39513a(eh2.f21610a, Integer.parseInt((String) jtaVarM38994f.mo34493b().get(1)));
        }
        jta jtaVarM38994f2 = zdj.f57041b.m38994f(strM45013k);
        if (jtaVarM38994f2 != null) {
            return mqi.m39513a(eh2.f21610a, Integer.parseInt((String) jtaVarM38994f2.mo34493b().get(1), ph2.m43651a(16)));
        }
        Object obj = zdj.f57042c.get(strM45013k);
        if (obj != null) {
            return (char[]) obj;
        }
        String str = "Unknown reference '" + strM45013k + '\'';
        q8g q8gVarM57663b = m57663b();
        int iMax = Math.max(0, q8gVarM57663b.f41485c - 3);
        int iMin = Math.min(q8gVarM57663b.f41484b - 1, q8gVarM57663b.f41485c + 3);
        String strSubstring = q8gVarM57663b.f41483a.substring(iMax, iMin + 1);
        sq8.m48648g(strSubstring, "substring(...)");
        throw new an5(str + '\n' + ("At offset " + q8gVarM57663b.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b.f41485c - iMax) + '^')));
    }

    /* renamed from: j */
    public final xej m57671j() {
        boolean z;
        xba bVar;
        char cM45011i = this.f55330a.m45011i("looking for the start of a tag");
        if (cM45011i != '<') {
            String str = "Unexpected character '" + cM45011i + "' while looking for the start of a tag";
            q8g q8gVarM57663b = m57663b();
            int iMax = Math.max(0, q8gVarM57663b.f41485c - 3);
            int iMin = Math.min(q8gVarM57663b.f41484b - 1, q8gVarM57663b.f41485c + 3);
            String strSubstring = q8gVarM57663b.f41483a.substring(iMax, iMin + 1);
            sq8.m48648g(strSubstring, "substring(...)");
            throw new an5(str + '\n' + ("At offset " + q8gVarM57663b.f41485c + " (showing range " + iMax + '-' + iMin + "):\n" + r8g.f43158a.m38996h(strSubstring, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b.f41485c - iMax) + '^')));
        }
        if (this.f55330a.m45007e("!--")) {
            m57673l();
            xej xejVarM57664c = m57664c();
            sq8.m48646e(xejVarM57664c);
            return xejVarM57664c;
        }
        if (!this.f55330a.m45007e("/")) {
            xba xbaVar = this.f55331b;
            xba.AbstractC18106d.b bVar2 = xbaVar instanceof xba.AbstractC18106d.b ? (xba.AbstractC18106d.b) xbaVar : null;
            xba.AbstractC18106d.b bVarM55946c = bVar2 != null ? xba.AbstractC18106d.b.m55946c(bVar2, null, null, true, 3, null) : null;
            xej.C18137d c18137dM57668g = m57668g();
            m57675n();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                char cM45011i2 = this.f55330a.m45011i("looking for the end of a tag");
                if (cM45011i2 == '/') {
                    z = true;
                    break;
                }
                if (cM45011i2 == '>') {
                    z = false;
                    break;
                }
                this.f55330a.m45015m(1, "looking for the beginning of an attribute");
                hwc hwcVarM57666e = m57666e();
                linkedHashMap.put(hwcVarM57666e.m31229c(), hwcVarM57666e.m31230d());
                m57675n();
            }
            hwc hwcVarM59281e = zdj.m59281e(linkedHashMap);
            Map map = (Map) hwcVarM59281e.m31227a();
            List list = (List) hwcVarM59281e.m31228b();
            if (!z) {
                bVar = new xba.AbstractC18106d.b(c18137dM57668g, bVarM55946c, false);
            } else {
                if (this.f55330a.m45011i("looking for the end of a tag") != '>') {
                    q8g q8gVarM57663b2 = m57663b();
                    int iMax2 = Math.max(0, q8gVarM57663b2.f41485c - 3);
                    int iMin2 = Math.min(q8gVarM57663b2.f41484b - 1, q8gVarM57663b2.f41485c + 3);
                    String strSubstring2 = q8gVarM57663b2.f41483a.substring(iMax2, iMin2 + 1);
                    sq8.m48648g(strSubstring2, "substring(...)");
                    throw new an5("Unexpected characters while looking for the end of a tag\n" + ("At offset " + q8gVarM57663b2.f41485c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + r8g.f43158a.m38996h(strSubstring2, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b2.f41485c - iMax2) + '^')));
                }
                bVar = new xba.AbstractC18106d.a(c18137dM57668g, bVarM55946c);
            }
            this.f55331b = bVar;
            return new xej.C18134a(bVar.mo55943a(), c18137dM57668g, map, list);
        }
        xba xbaVar2 = this.f55331b;
        sq8.m48647f(xbaVar2, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.serde.xml.deserialization.LexerState.Tag.OpenTag");
        xba.AbstractC18106d.b bVar3 = (xba.AbstractC18106d.b) xbaVar2;
        xej.C18137d c18137dM55948d = bVar3.m55948d();
        xej.C18137d c18137dM57668g2 = m57668g();
        if (!sq8.m48644c(c18137dM57668g2, c18137dM55948d)) {
            String str2 = "Unexpected '/" + c18137dM57668g2 + "' tag while looking for '/" + c18137dM55948d + "' tag";
            q8g q8gVarM57663b3 = m57663b();
            int iMax3 = Math.max(0, q8gVarM57663b3.f41485c - 3);
            int iMin3 = Math.min(q8gVarM57663b3.f41484b - 1, q8gVarM57663b3.f41485c + 3);
            String strSubstring3 = q8gVarM57663b3.f41483a.substring(iMax3, iMin3 + 1);
            sq8.m48648g(strSubstring3, "substring(...)");
            throw new an5(str2 + '\n' + ("At offset " + q8gVarM57663b3.f41485c + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + r8g.f43158a.m38996h(strSubstring3, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b3.f41485c - iMax3) + '^')));
        }
        m57675n();
        char cM45011i3 = this.f55330a.m45011i("looking for the end of a tag");
        if (cM45011i3 == '>') {
            xba xbaVarM55949e = bVar3.m55949e();
            if (xbaVarM55949e == null) {
                xbaVarM55949e = xba.C18104b.f53458a;
            }
            this.f55331b = xbaVarM55949e;
            return new xej.C18135b(bVar3.mo55943a(), c18137dM57668g2);
        }
        String str3 = "Unexpected character '" + cM45011i3 + "' while looking for the end of a tag";
        q8g q8gVarM57663b4 = m57663b();
        int iMax4 = Math.max(0, q8gVarM57663b4.f41485c - 3);
        int iMin4 = Math.min(q8gVarM57663b4.f41484b - 1, q8gVarM57663b4.f41485c + 3);
        String strSubstring4 = q8gVarM57663b4.f41483a.substring(iMax4, iMin4 + 1);
        sq8.m48648g(strSubstring4, "substring(...)");
        throw new an5(str3 + '\n' + ("At offset " + q8gVarM57663b4.f41485c + " (showing range " + iMax4 + '-' + iMin4 + "):\n" + r8g.f43158a.m38996h(strSubstring4, "·") + '\n' + (e9g.m24589C(" ", q8gVarM57663b4.f41485c - iMax4) + '^')));
    }

    /* renamed from: k */
    public final xej m57672k() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (true) {
            char cM45011i = this.f55330a.m45011i("reading text node");
            if (cM45011i == '\t' || cM45011i == '\n' || cM45011i == '\r' || cM45011i == ' ') {
                sb.append(cM45011i);
            } else {
                if (cM45011i == '&') {
                    sb.append(m57670i());
                } else if (cM45011i != '<') {
                    sb.append(cM45011i);
                } else {
                    if (!this.f55330a.m45007e("!--")) {
                        if (!this.f55330a.m45007e("![CDATA[")) {
                            break;
                        }
                        sb.append(m57667f());
                        z = false;
                    } else {
                        m57673l();
                    }
                    y3i y3iVar = y3i.f54824a;
                }
                z = false;
            }
        }
        this.f55330a.m45015m(1, "looking for the beginning of a tag");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        xba xbaVar = this.f55331b;
        sq8.m48647f(xbaVar, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.serde.xml.deserialization.LexerState.Tag.OpenTag");
        xba.AbstractC18106d.b bVar = (xba.AbstractC18106d.b) xbaVar;
        boolean zM55950f = bVar.m55950f();
        boolean zM45010h = this.f55330a.m45010h("</");
        xba.AbstractC18106d.b bVarM55946c = xba.AbstractC18106d.b.m55946c(bVar, null, null, true, 3, null);
        this.f55331b = bVarM55946c;
        if (!z || (!zM55950f && zM45010h)) {
            return new xej.C18138e(bVarM55946c.mo55943a(), string);
        }
        xej xejVarM57664c = m57664c();
        sq8.m48646e(xejVarM57664c);
        return xejVarM57664c;
    }

    /* renamed from: l */
    public final void m57673l() {
        this.f55330a.m45012j("-->", "looking for the end of a comment");
    }

    /* renamed from: m */
    public final void m57674m() {
        m57675n();
        while (this.f55330a.m45007e("<?")) {
            this.f55330a.m45008f();
            m57675n();
            while (!this.f55330a.m45007e("?>")) {
                m57666e();
                m57675n();
            }
            m57675n();
        }
    }

    /* renamed from: n */
    public final void m57675n() {
        this.f55330a.m45009g();
    }
}
