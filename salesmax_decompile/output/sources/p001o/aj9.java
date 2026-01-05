package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
import p001o.xej;
import p001o.xig;

/* loaded from: classes3.dex */
public final class aj9 {

    /* renamed from: a */
    public final boolean f14839a;

    /* renamed from: b */
    public final int f14840b;

    /* renamed from: c */
    public final xej.C18137d f14841c;

    /* renamed from: d */
    public final Map f14842d;

    /* renamed from: e */
    public final Map f14843e;

    /* renamed from: f */
    public final List f14844f;

    /* renamed from: g */
    public final String f14845g;

    /* renamed from: h */
    public final String f14846h;

    public aj9(boolean z, int i, xej.C18137d c18137d, Map map) {
        sq8.m48649h(c18137d, "qName");
        sq8.m48649h(map, "nsAttributes");
        this.f14839a = z;
        this.f14840b = i;
        this.f14841c = c18137d;
        this.f14842d = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14843e = linkedHashMap;
        this.f14844f = new ArrayList();
        this.f14845g = e9g.m24589C("    ", i);
        this.f14846h = e9g.m24589C("    ", i + 1);
        linkedHashMap.putAll(map);
    }

    /* renamed from: a */
    public final StringBuilder m17204a(StringBuilder sb, String str) {
        if (this.f14839a) {
            sb.append(str);
        }
        return sb;
    }

    /* renamed from: b */
    public final StringBuilder m17205b(StringBuilder sb) {
        if (this.f14839a) {
            sb.append('\n');
            sq8.m48648g(sb, "append(...)");
        }
        return sb;
    }

    /* renamed from: c */
    public final StringBuilder m17206c(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt >= 0 && cCharAt < ' ') {
                sb.append("&#x" + bj9.m19247b(cCharAt) + ';');
            } else if (cCharAt == 133) {
                sb.append("&#x85;");
            } else if (cCharAt == 8232) {
                sb.append("&#x2028;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    /* renamed from: d */
    public final StringBuilder m17207d(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt >= 0 && cCharAt < ' ') {
                sb.append("&#x" + bj9.m19247b(cCharAt) + ';');
            } else if (cCharAt == 133) {
                sb.append("&#x85;");
            } else if (cCharAt == 8232) {
                sb.append("&#x2028;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    /* renamed from: e */
    public final void m17208e(aj9 aj9Var) {
        sq8.m48649h(aj9Var, "childWriter");
        this.f14844f.add(new xig.C18168a(aj9Var));
    }

    /* renamed from: f */
    public final int m17209f() {
        return this.f14840b;
    }

    /* renamed from: g */
    public final xej.C18137d m17210g() {
        return this.f14841c;
    }

    /* renamed from: h */
    public final void m17211h(String str) {
        sq8.m48649h(str, "text");
        this.f14844f.add(new xig.C18169b(str));
    }

    /* renamed from: i */
    public final void m17212i(StringBuilder sb) {
        sq8.m48649h(sb, "buffer");
        StringBuilder sbM17204a = m17204a(sb, this.f14845g);
        sbM17204a.append('<');
        sbM17204a.append(this.f14841c);
        for (Map.Entry entry : this.f14843e.entrySet()) {
            sb.append(TokenParser.SP);
            sb.append(entry.getKey());
            sb.append("=\"");
            String str = (String) entry.getValue();
            if (str != null) {
                m17207d(sb, str);
            }
            sb.append(TokenParser.DQUOTE);
        }
        if (this.f14844f.isEmpty()) {
            StringBuilder sbM17204a2 = m17204a(sb, " ");
            sbM17204a2.append("/>");
            sq8.m48648g(sbM17204a2, "append(...)");
            m17205b(sbM17204a2);
            return;
        }
        if (this.f14844f.size() == 1 && (kh3.f0(this.f14844f) instanceof xig.C18169b)) {
            sb.append('>');
            sq8.m48648g(sb, "append(...)");
            Object objF0 = kh3.f0(this.f14844f);
            sq8.m48647f(objF0, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.serde.xml.serialization.TagChild.Text");
            StringBuilder sbM17206c = m17206c(sb, ((xig.C18169b) objF0).m56366a());
            sbM17206c.append("</");
            sbM17206c.append(this.f14841c);
            sbM17206c.append('>');
            sq8.m48648g(sbM17206c, "append(...)");
            m17205b(sbM17206c);
            return;
        }
        sb.append('>');
        sq8.m48648g(sb, "append(...)");
        m17205b(sb);
        for (xig xigVar : this.f14844f) {
            if (xigVar instanceof xig.C18169b) {
                m17205b(m17206c(m17204a(sb, this.f14846h), ((xig.C18169b) xigVar).m56366a()));
            } else {
                if (!(xigVar instanceof xig.C18168a)) {
                    throw new szb();
                }
                ((xig.C18168a) xigVar).m56365a().m17212i(sb);
            }
        }
        StringBuilder sbM17204a3 = m17204a(sb, this.f14845g);
        sbM17204a3.append("</");
        sbM17204a3.append(this.f14841c);
        sbM17204a3.append('>');
        sq8.m48648g(sbM17204a3, "append(...)");
        m17205b(sbM17204a3);
    }
}
