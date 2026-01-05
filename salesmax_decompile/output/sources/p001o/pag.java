package p001o;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.cd4;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class pag implements qbg {

    /* renamed from: d */
    public static final Pattern f39753d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e */
    public static final Pattern f39754e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a */
    public final StringBuilder f39755a = new StringBuilder();

    /* renamed from: b */
    public final ArrayList f39756b = new ArrayList();

    /* renamed from: c */
    public final zwc f39757c = new zwc();

    /* renamed from: f */
    public static float m43276f(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static long m43277g(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) op0.m42515e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) op0.m42515e(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) throws NumberFormatException {
        String str;
        fu3 fu3Var2;
        String strM60039t;
        String str2;
        String str3;
        fu3 fu3Var3;
        fu3 fu3Var4 = fu3Var;
        String str4 = "SubripParser";
        this.f39757c.m60015S(bArr, i + i2);
        this.f39757c.m60017U(i);
        Charset charsetM43279e = m43279e(this.f39757c);
        ArrayList arrayList = (c16330b.f41602a == -9223372036854775807L || !c16330b.f41603b) ? null : new ArrayList();
        while (true) {
            String strM60039t2 = this.f39757c.m60039t(charsetM43279e);
            if (strM60039t2 == null) {
                break;
            }
            if (strM60039t2.length() != 0) {
                try {
                    Integer.parseInt(strM60039t2);
                    strM60039t = this.f39757c.m60039t(charsetM43279e);
                } catch (NumberFormatException unused) {
                    str = str4;
                    fu3Var2 = fu3Var4;
                    ria.m46824h(str, "Skipping invalid index: " + strM60039t2);
                }
                if (strM60039t == null) {
                    ria.m46824h(str4, "Unexpected end");
                    break;
                }
                Matcher matcher = f39753d.matcher(strM60039t);
                if (matcher.matches()) {
                    long jM43277g = m43277g(matcher, 1);
                    long jM43277g2 = m43277g(matcher, 6);
                    int i3 = 0;
                    this.f39755a.setLength(0);
                    this.f39756b.clear();
                    String strM60039t3 = this.f39757c.m60039t(charsetM43279e);
                    while (!TextUtils.isEmpty(strM60039t3)) {
                        if (this.f39755a.length() > 0) {
                            this.f39755a.append("<br>");
                        }
                        this.f39755a.append(m43280h(strM60039t3, this.f39756b));
                        strM60039t3 = this.f39757c.m60039t(charsetM43279e);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f39755a.toString());
                    while (true) {
                        if (i3 >= this.f39756b.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = (String) this.f39756b.get(i3);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i3++;
                        }
                    }
                    long j = c16330b.f41602a;
                    if (j == -9223372036854775807L || jM43277g >= j) {
                        fu3Var3 = fu3Var;
                        fu3Var3.accept(new jd4(nf8.m40500F(m43278d(spannedFromHtml, str3)), jM43277g, jM43277g2 - jM43277g));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new jd4(nf8.m40500F(m43278d(spannedFromHtml, str3)), jM43277g, jM43277g2 - jM43277g));
                        }
                        fu3Var3 = fu3Var;
                    }
                    fu3Var4 = fu3Var3;
                    str4 = str2;
                } else {
                    String str5 = str4;
                    fu3Var2 = fu3Var4;
                    str = str5;
                    ria.m46824h(str, "Skipping invalid timing: " + strM60039t);
                    fu3Var4 = fu3Var2;
                    str4 = str;
                }
            }
        }
        fu3 fu3Var5 = fu3Var4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fu3Var5.accept((jd4) it.next());
            }
        }
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cd4 m43278d(Spanned spanned, String str) {
        char c;
        char c2;
        cd4.C12641b c12641bM20933o = new cd4.C12641b().m20933o(spanned);
        if (str == null) {
            return c12641bM20933o.m20919a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            c12641bM20933o.m20930l(0);
        } else if (c == 3 || c == 4 || c == 5) {
            c12641bM20933o.m20930l(2);
        } else {
            c12641bM20933o.m20930l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c2 = 65535;
                    break;
                } else {
                    c2 = 0;
                    break;
                }
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            c12641bM20933o.m20927i(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            c12641bM20933o.m20927i(0);
        } else {
            c12641bM20933o.m20927i(1);
        }
        return c12641bM20933o.m20929k(m43276f(c12641bM20933o.m20922d())).m20926h(m43276f(c12641bM20933o.m20921c()), 0).m20919a();
    }

    /* renamed from: e */
    public final Charset m43279e(zwc zwcVar) {
        Charset charsetM60012P = zwcVar.m60012P();
        return charsetM60012P != null ? charsetM60012P : uh2.f48931c;
    }

    /* renamed from: h */
    public final String m43280h(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f39754e.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }
}
