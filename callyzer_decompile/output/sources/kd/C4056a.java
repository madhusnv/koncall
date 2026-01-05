package kd;

import id.C3241k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.d2;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kd.a */
/* loaded from: classes.dex */
public final class C4056a {

    /* renamed from: a */
    public final int f20905a;

    /* renamed from: b */
    public final C3241k f20906b;

    /* renamed from: c */
    public final LinkedHashMap f20907c;

    /* renamed from: d */
    public final ArrayList f20908d;

    public C4056a(int i10, C3241k c3241k, LinkedHashMap nsAttributes) {
        AbstractC4154l.m8923f(nsAttributes, "nsAttributes");
        this.f20905a = i10;
        this.f20906b = c3241k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f20907c = linkedHashMap;
        this.f20908d = new ArrayList();
        AbstractC5185w.m10134p(i10, "    ");
        AbstractC5185w.m10134p(i10 + 1, "    ");
        linkedHashMap.putAll(nsAttributes);
    }

    /* renamed from: a */
    public static void m8837a(StringBuilder sb2, String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else if (cCharAt >= 0 && cCharAt < ' ') {
                StringBuilder sb3 = new StringBuilder("&#x");
                d2.m10599b(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC4154l.m8922e(string, "toString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
                sb3.append(upperCase);
                sb3.append(';');
                sb2.append(sb3.toString());
            } else if (cCharAt == 133) {
                sb2.append("&#x85;");
            } else if (cCharAt == 8232) {
                sb2.append("&#x2028;");
            } else {
                sb2.append(cCharAt);
            }
        }
    }

    /* renamed from: b */
    public final void m8838b(StringBuilder sb2) {
        int i10;
        sb2.append('<');
        C3241k c3241k = this.f20906b;
        sb2.append(c3241k);
        Iterator it = this.f20907c.entrySet().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(' ');
            sb2.append(entry.getKey());
            sb2.append("=\"");
            String str = (String) entry.getValue();
            if (str != null) {
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '<') {
                        sb2.append("&lt;");
                    } else if (cCharAt == '>') {
                        sb2.append("&gt;");
                    } else if (cCharAt == '&') {
                        sb2.append("&amp;");
                    } else if (cCharAt == '\"') {
                        sb2.append("&quot;");
                    } else if (cCharAt >= 0 && cCharAt < ' ') {
                        StringBuilder sb3 = new StringBuilder("&#x");
                        d2.m10599b(16);
                        String string = Integer.toString(cCharAt, 16);
                        AbstractC4154l.m8922e(string, "toString(...)");
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
                        sb3.append(upperCase);
                        sb3.append(';');
                        sb2.append(sb3.toString());
                    } else if (cCharAt == 133) {
                        sb2.append("&#x85;");
                    } else if (cCharAt == 8232) {
                        sb2.append("&#x2028;");
                    } else {
                        sb2.append(cCharAt);
                    }
                    i10++;
                }
            }
            sb2.append('\"');
        }
        ArrayList arrayList = this.f20908d;
        if (arrayList.isEmpty()) {
            sb2.append("/>");
            return;
        }
        if (arrayList.size() == 1 && (AbstractC6663m.m12742F(arrayList) instanceof C4058c)) {
            sb2.append('>');
            Object objM12742F = AbstractC6663m.m12742F(arrayList);
            AbstractC4154l.m8921d(objM12742F, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.serde.xml.serialization.TagChild.Text");
            m8837a(sb2, ((C4058c) objM12742F).f20910a);
            sb2.append("</");
            sb2.append(c3241k);
            sb2.append('>');
            return;
        }
        sb2.append('>');
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AbstractC4059d abstractC4059d = (AbstractC4059d) obj;
            if (abstractC4059d instanceof C4058c) {
                m8837a(sb2, ((C4058c) abstractC4059d).f20910a);
            } else {
                if (!(abstractC4059d instanceof C4057b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((C4057b) abstractC4059d).f20909a.m8838b(sb2);
            }
        }
        sb2.append("</");
        sb2.append(c3241k);
        sb2.append('>');
    }
}
