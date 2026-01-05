package p001o;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.cd4;
import p001o.j1g;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class i1g implements qbg {

    /* renamed from: g */
    public static final Pattern f27934g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a */
    public final boolean f27935a;

    /* renamed from: b */
    public final h1g f27936b;

    /* renamed from: d */
    public Map f27938d;

    /* renamed from: e */
    public float f27939e = -3.4028235E38f;

    /* renamed from: f */
    public float f27940f = -3.4028235E38f;

    /* renamed from: c */
    public final zwc f27937c = new zwc();

    public i1g(List list) {
        if (list == null || list.isEmpty()) {
            this.f27935a = false;
            this.f27936b = null;
            return;
        }
        this.f27935a = true;
        String strM48703H = sqi.m48703H((byte[]) list.get(0));
        op0.m42511a(strM48703H.startsWith("Format:"));
        this.f27936b = (h1g) op0.m42515e(h1g.m29751a(strM48703H));
        m31401j(new zwc((byte[]) list.get(1)), uh2.f48931c);
    }

    /* renamed from: d */
    public static int m31390d(long j, List list, List list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* renamed from: e */
    public static float m31391e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: f */
    public static cd4 m31392f(String str, j1g j1gVar, j1g.C14431b c14431b, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        cd4.C12641b c12641bM20933o = new cd4.C12641b().m20933o(spannableString);
        if (j1gVar != null) {
            if (j1gVar.f29574c != null) {
                spannableString.setSpan(new ForegroundColorSpan(j1gVar.f29574c.intValue()), 0, spannableString.length(), 33);
            }
            if (j1gVar.f29581j == 3 && j1gVar.f29575d != null) {
                spannableString.setSpan(new BackgroundColorSpan(j1gVar.f29575d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = j1gVar.f29576e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                c12641bM20933o.m20935q(f3 / f2, 1);
            }
            boolean z = j1gVar.f29577f;
            if (z && j1gVar.f29578g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (j1gVar.f29578g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (j1gVar.f29579h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (j1gVar.f29580i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = c14431b.f29597a;
        if (i == -1) {
            i = j1gVar != null ? j1gVar.f29573b : -1;
        }
        c12641bM20933o.m20934p(m31397p(i)).m20930l(m31396o(i)).m20927i(m31395n(i));
        PointF pointF = c14431b.f29598b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            c12641bM20933o.m20929k(m31391e(c12641bM20933o.m20922d()));
            c12641bM20933o.m20926h(m31391e(c12641bM20933o.m20921c()), 0);
        } else {
            c12641bM20933o.m20929k(pointF.x / f);
            c12641bM20933o.m20926h(c14431b.f29598b.y / f2, 0);
        }
        return c12641bM20933o.m20919a();
    }

    /* renamed from: l */
    public static Map m31393l(zwc zwcVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j1g.C14430a c14430aM33080a = null;
        while (true) {
            String strM60039t = zwcVar.m60039t(charset);
            if (strM60039t == null || (zwcVar.m60020a() != 0 && zwcVar.m60027h(charset) == '[')) {
                break;
            }
            if (strM60039t.startsWith("Format:")) {
                c14430aM33080a = j1g.C14430a.m33080a(strM60039t);
            } else if (strM60039t.startsWith("Style:")) {
                if (c14430aM33080a == null) {
                    ria.m46824h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strM60039t);
                } else {
                    j1g j1gVarM33072b = j1g.m33072b(strM60039t, c14430aM33080a);
                    if (j1gVarM33072b != null) {
                        linkedHashMap.put(j1gVarM33072b.f29572a, j1gVarM33072b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: m */
    public static long m31394m(String str) {
        Matcher matcher = f27934g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) sqi.m48729h(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) sqi.m48729h(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) sqi.m48729h(matcher.group(3))) * 1000000) + (Long.parseLong((String) sqi.m48729h(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: n */
    public static int m31395n(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                ria.m46824h("SsaParser", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: o */
    public static int m31396o(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                ria.m46824h("SsaParser", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: p */
    public static Layout.Alignment m31397p(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                ria.m46824h("SsaParser", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f27937c.m60015S(bArr, i + i2);
        this.f27937c.m60017U(i);
        Charset charsetM31398g = m31398g(this.f27937c);
        if (!this.f27935a) {
            m31401j(this.f27937c, charsetM31398g);
        }
        m31400i(this.f27937c, arrayList3, arrayList4, charsetM31398g);
        ArrayList arrayList5 = (c16330b.f41602a == -9223372036854775807L || !c16330b.f41603b) ? null : new ArrayList();
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            List list = (List) arrayList3.get(i3);
            if (list.isEmpty() && i3 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i3 == arrayList3.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList4.get(i3)).longValue();
                long jLongValue2 = ((Long) arrayList4.get(i3 + 1)).longValue() - ((Long) arrayList4.get(i3)).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                long j = c16330b.f41602a;
                if (j == -9223372036854775807L || jLongValue >= j) {
                    fu3Var.accept(new jd4(list, jLongValue, jLongValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new jd4(list, jLongValue, jLongValue2));
                }
            }
            i3++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                fu3Var.accept((jd4) it.next());
            }
        }
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 1;
    }

    /* renamed from: g */
    public final Charset m31398g(zwc zwcVar) {
        Charset charsetM60012P = zwcVar.m60012P();
        return charsetM60012P != null ? charsetM60012P : uh2.f48931c;
    }

    /* renamed from: h */
    public final void m31399h(String str, h1g h1gVar, List list, List list2) {
        int i;
        op0.m42511a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", h1gVar.f26105e);
        if (strArrSplit.length != h1gVar.f26105e) {
            ria.m46824h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jM31394m = m31394m(strArrSplit[h1gVar.f26101a]);
        if (jM31394m == -9223372036854775807L) {
            ria.m46824h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM31394m2 = m31394m(strArrSplit[h1gVar.f26102b]);
        if (jM31394m2 == -9223372036854775807L) {
            ria.m46824h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f27938d;
        j1g j1gVar = (map == null || (i = h1gVar.f26103c) == -1) ? null : (j1g) map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[h1gVar.f26104d];
        cd4 cd4VarM31392f = m31392f(j1g.C14431b.m33084d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), j1gVar, j1g.C14431b.m33082b(str2), this.f27939e, this.f27940f);
        int iM31390d = m31390d(jM31394m2, list2, list);
        for (int iM31390d2 = m31390d(jM31394m, list2, list); iM31390d2 < iM31390d; iM31390d2++) {
            ((List) list.get(iM31390d2)).add(cd4VarM31392f);
        }
    }

    /* renamed from: i */
    public final void m31400i(zwc zwcVar, List list, List list2, Charset charset) {
        h1g h1gVarM29751a = this.f27935a ? this.f27936b : null;
        while (true) {
            String strM60039t = zwcVar.m60039t(charset);
            if (strM60039t == null) {
                return;
            }
            if (strM60039t.startsWith("Format:")) {
                h1gVarM29751a = h1g.m29751a(strM60039t);
            } else if (strM60039t.startsWith("Dialogue:")) {
                if (h1gVarM29751a == null) {
                    ria.m46824h("SsaParser", "Skipping dialogue line before complete format: " + strM60039t);
                } else {
                    m31399h(strM60039t, h1gVarM29751a, list, list2);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m31401j(zwc zwcVar, Charset charset) {
        while (true) {
            String strM60039t = zwcVar.m60039t(charset);
            if (strM60039t == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM60039t)) {
                m31402k(zwcVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM60039t)) {
                this.f27938d = m31393l(zwcVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strM60039t)) {
                ria.m46822f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM60039t)) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m31402k(zwc zwcVar, Charset charset) {
        while (true) {
            String strM60039t = zwcVar.m60039t(charset);
            if (strM60039t == null) {
                return;
            }
            if (zwcVar.m60020a() != 0 && zwcVar.m60027h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strM60039t.split(":");
            if (strArrSplit.length == 2) {
                String strM35995e = kp0.m35995e(strArrSplit[0].trim());
                strM35995e.hashCode();
                if (strM35995e.equals("playresx")) {
                    this.f27939e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strM35995e.equals("playresy")) {
                    try {
                        this.f27940f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }
}
