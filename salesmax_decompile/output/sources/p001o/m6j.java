package p001o;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;
import p001o.cd4;
import p001o.m6j;

/* loaded from: classes2.dex */
public abstract class m6j {

    /* renamed from: a */
    public static final Pattern f34878a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f34879b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map f34880c;

    /* renamed from: d */
    public static final Map f34881d;

    /* renamed from: o.m6j$b */
    public static class C15237b {

        /* renamed from: c */
        public static final Comparator f34882c = new Comparator() { // from class: o.n6j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m6j.C15237b.m38452e((m6j.C15237b) obj, (m6j.C15237b) obj2);
            }
        };

        /* renamed from: a */
        public final C15238c f34883a;

        /* renamed from: b */
        public final int f34884b;

        /* renamed from: e */
        public static /* synthetic */ int m38452e(C15237b c15237b, C15237b c15237b2) {
            return Integer.compare(c15237b.f34883a.f34886b, c15237b2.f34883a.f34886b);
        }

        public C15237b(C15238c c15238c, int i) {
            this.f34883a = c15238c;
            this.f34884b = i;
        }
    }

    /* renamed from: o.m6j$c */
    public static final class C15238c {

        /* renamed from: a */
        public final String f34885a;

        /* renamed from: b */
        public final int f34886b;

        /* renamed from: c */
        public final String f34887c;

        /* renamed from: d */
        public final Set f34888d;

        public C15238c(String str, int i, String str2, Set set) {
            this.f34886b = i;
            this.f34885a = str;
            this.f34887c = str2;
            this.f34888d = set;
        }

        /* renamed from: a */
        public static C15238c m38453a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            op0.m42511a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrI1 = sqi.i1(strTrim, "\\.");
            String str3 = strArrI1[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrI1.length; i2++) {
                hashSet.add(strArrI1[i2]);
            }
            return new C15238c(str3, i, str2, hashSet);
        }

        /* renamed from: b */
        public static C15238c m38454b() {
            return new C15238c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: o.m6j$d */
    public static final class C15239d implements Comparable {

        /* renamed from: a */
        public final int f34889a;

        /* renamed from: b */
        public final k6j f34890b;

        public C15239d(int i, k6j k6jVar) {
            this.f34889a = i;
            this.f34890b = k6jVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15239d c15239d) {
            return Integer.compare(this.f34889a, c15239d.f34889a);
        }
    }

    /* renamed from: o.m6j$e */
    public static final class C15240e {

        /* renamed from: c */
        public CharSequence f34893c;

        /* renamed from: a */
        public long f34891a = 0;

        /* renamed from: b */
        public long f34892b = 0;

        /* renamed from: d */
        public int f34894d = 2;

        /* renamed from: e */
        public float f34895e = -3.4028235E38f;

        /* renamed from: f */
        public int f34896f = 1;

        /* renamed from: g */
        public int f34897g = 0;

        /* renamed from: h */
        public float f34898h = -3.4028235E38f;

        /* renamed from: i */
        public int f34899i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f34900j = 1.0f;

        /* renamed from: k */
        public int f34901k = Integer.MIN_VALUE;

        /* renamed from: b */
        public static float m38456b(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        public static Layout.Alignment m38457c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ria.m46824h("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        public static float m38458d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        /* renamed from: e */
        public static float m38459e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public static int m38460f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public l6j m38461a() {
            return new l6j(m38462g().m20919a(), this.f34891a, this.f34892b);
        }

        /* renamed from: g */
        public cd4.C12641b m38462g() {
            float fM38459e = this.f34898h;
            if (fM38459e == -3.4028235E38f) {
                fM38459e = m38459e(this.f34894d);
            }
            int iM38460f = this.f34899i;
            if (iM38460f == Integer.MIN_VALUE) {
                iM38460f = m38460f(this.f34894d);
            }
            cd4.C12641b c12641bM20936r = new cd4.C12641b().m20934p(m38457c(this.f34894d)).m20926h(m38456b(this.f34895e, this.f34896f), this.f34896f).m20927i(this.f34897g).m20929k(fM38459e).m20930l(iM38460f).m20932n(Math.min(this.f34900j, m38458d(iM38460f, fM38459e))).m20936r(this.f34901k);
            CharSequence charSequence = this.f34893c;
            if (charSequence != null) {
                c12641bM20936r.m20933o(charSequence);
            }
            return c12641bM20936r;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH)));
        map.put("lime", Integer.valueOf(Color.rgb(0, Constants.MAX_HOST_LENGTH, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH)));
        map.put("red", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, 0, Constants.MAX_HOST_LENGTH)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, Constants.MAX_HOST_LENGTH)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f34880c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, Constants.MAX_HOST_LENGTH, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, Constants.MAX_HOST_LENGTH, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(Constants.MAX_HOST_LENGTH, 0, Constants.MAX_HOST_LENGTH)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, Constants.MAX_HOST_LENGTH)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f34881d = Collections.unmodifiableMap(map2);
    }

    /* renamed from: a */
    public static void m38425a(SpannableStringBuilder spannableStringBuilder, Set set, int i, int i2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f34880c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i, i2, 33);
            } else {
                Map map2 = f34881d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m38426b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(TokenParser.SP);
                break;
            default:
                ria.m46824h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    /* renamed from: c */
    public static void m38427c(SpannableStringBuilder spannableStringBuilder, String str, C15238c c15238c, List list, List list2) {
        int iM38433i = m38433i(list2, str, c15238c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C15237b.f34882c);
        int i = c15238c.f34886b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((C15237b) arrayList.get(i2)).f34883a.f34885a)) {
                C15237b c15237b = (C15237b) arrayList.get(i2);
                int iM38431g = m38431g(m38433i(list2, str, c15237b.f34883a), iM38433i, 1);
                int i3 = c15237b.f34883a.f34886b - length;
                int i4 = c15237b.f34884b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new kve(charSequenceSubSequence.toString(), iM38431g), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    /* renamed from: d */
    public static void m38428d(String str, C15238c c15238c, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        i = c15238c.f34886b;
        length = spannableStringBuilder.length();
        String str2 = c15238c.f34885a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                m38425a(spannableStringBuilder, c15238c.f34888d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                m38427c(spannableStringBuilder, str, c15238c, list, list2);
                break;
            default:
                return;
        }
        List listM38432h = m38432h(list2, str, c15238c);
        for (int i2 = 0; i2 < listM38432h.size(); i2++) {
            m38429e(spannableStringBuilder, ((C15239d) listM38432h.get(i2)).f34890b, i, length);
        }
    }

    /* renamed from: e */
    public static void m38429e(SpannableStringBuilder spannableStringBuilder, k6j k6jVar, int i, int i2) {
        if (k6jVar == null) {
            return;
        }
        if (k6jVar.m35070i() != -1) {
            xzf.m57046b(spannableStringBuilder, new StyleSpan(k6jVar.m35070i()), i, i2, 33);
        }
        if (k6jVar.m35073l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (k6jVar.m35074m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (k6jVar.m35072k()) {
            xzf.m57046b(spannableStringBuilder, new ForegroundColorSpan(k6jVar.m35064c()), i, i2, 33);
        }
        if (k6jVar.m35071j()) {
            xzf.m57046b(spannableStringBuilder, new BackgroundColorSpan(k6jVar.m35062a()), i, i2, 33);
        }
        if (k6jVar.m35065d() != null) {
            xzf.m57046b(spannableStringBuilder, new TypefaceSpan(k6jVar.m35065d()), i, i2, 33);
        }
        int iM35067f = k6jVar.m35067f();
        if (iM35067f == 1) {
            xzf.m57046b(spannableStringBuilder, new AbsoluteSizeSpan((int) k6jVar.m35066e(), true), i, i2, 33);
        } else if (iM35067f == 2) {
            xzf.m57046b(spannableStringBuilder, new RelativeSizeSpan(k6jVar.m35066e()), i, i2, 33);
        } else if (iM35067f == 3) {
            xzf.m57046b(spannableStringBuilder, new RelativeSizeSpan(k6jVar.m35066e() / 100.0f), i, i2, 33);
        }
        if (k6jVar.m35063b()) {
            spannableStringBuilder.setSpan(new w08(), i, i2, 33);
        }
    }

    /* renamed from: f */
    public static int m38430f(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* renamed from: g */
    public static int m38431g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static List m38432h(List list, String str, C15238c c15238c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            k6j k6jVar = (k6j) list.get(i);
            int iM35069h = k6jVar.m35069h(str, c15238c.f34885a, c15238c.f34888d, c15238c.f34887c);
            if (iM35069h > 0) {
                arrayList.add(new C15239d(iM35069h, k6jVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static int m38433i(List list, String str, C15238c c15238c) {
        List listM38432h = m38432h(list, str, c15238c);
        for (int i = 0; i < listM38432h.size(); i++) {
            k6j k6jVar = ((C15239d) listM38432h.get(i)).f34890b;
            if (k6jVar.m35068g() != -1) {
                return k6jVar.m35068g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static String m38434j(String str) {
        String strTrim = str.trim();
        op0.m42511a(!strTrim.isEmpty());
        return sqi.j1(strTrim, "[ \\.]")[0];
    }

    /* renamed from: k */
    public static boolean m38435k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static cd4 m38436l(CharSequence charSequence) {
        C15240e c15240e = new C15240e();
        c15240e.f34893c = charSequence;
        return c15240e.m38462g().m20919a();
    }

    /* renamed from: m */
    public static l6j m38437m(String str, Matcher matcher, zwc zwcVar, List list) {
        C15240e c15240e = new C15240e();
        try {
            c15240e.f34891a = p6j.m43015c((String) op0.m42515e(matcher.group(1)));
            c15240e.f34892b = p6j.m43015c((String) op0.m42515e(matcher.group(2)));
            m38440p((String) op0.m42515e(matcher.group(3)), c15240e);
            StringBuilder sb = new StringBuilder();
            String strM60038s = zwcVar.m60038s();
            while (!TextUtils.isEmpty(strM60038s)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM60038s.trim());
                strM60038s = zwcVar.m60038s();
            }
            c15240e.f34893c = m38441q(str, sb.toString(), list);
            return c15240e.m38461a();
        } catch (NumberFormatException unused) {
            ria.m46824h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: n */
    public static l6j m38438n(zwc zwcVar, List list) {
        String strM60038s = zwcVar.m60038s();
        if (strM60038s == null) {
            return null;
        }
        Pattern pattern = f34878a;
        Matcher matcher = pattern.matcher(strM60038s);
        if (matcher.matches()) {
            return m38437m(null, matcher, zwcVar, list);
        }
        String strM60038s2 = zwcVar.m60038s();
        if (strM60038s2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strM60038s2);
        if (matcher2.matches()) {
            return m38437m(strM60038s.trim(), matcher2, zwcVar, list);
        }
        return null;
    }

    /* renamed from: o */
    public static cd4.C12641b m38439o(String str) {
        C15240e c15240e = new C15240e();
        m38440p(str, c15240e);
        return c15240e.m38462g();
    }

    /* renamed from: p */
    public static void m38440p(String str, C15240e c15240e) {
        Matcher matcher = f34879b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) op0.m42515e(matcher.group(1));
            String str3 = (String) op0.m42515e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m38443s(str3, c15240e);
                } else if ("align".equals(str2)) {
                    c15240e.f34894d = m38446v(str3);
                } else if ("position".equals(str2)) {
                    m38445u(str3, c15240e);
                } else if ("size".equals(str2)) {
                    c15240e.f34900j = p6j.m43014b(str3);
                } else if ("vertical".equals(str2)) {
                    c15240e.f34901k = m38447w(str3);
                } else {
                    ria.m46824h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                ria.m46824h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    public static SpannedString m38441q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    m38426b(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iM38430f = i + 1;
                if (iM38430f < str2.length()) {
                    boolean z = str2.charAt(iM38430f) == '/';
                    iM38430f = m38430f(str2, iM38430f);
                    int i2 = iM38430f - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iM38430f - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strM38434j = m38434j(strSubstring);
                        if (m38435k(strM38434j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C15238c c15238c = (C15238c) arrayDeque.pop();
                                    m38428d(str, c15238c, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new C15237b(c15238c, spannableStringBuilder.length()));
                                    }
                                    if (c15238c.f34885a.equals(strM38434j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C15238c.m38453a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iM38430f;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m38428d(str, (C15238c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m38428d(str, C15238c.m38454b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    public static int m38442r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                ria.m46824h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    public static void m38443s(String str, C15240e c15240e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c15240e.f34897g = m38442r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c15240e.f34895e = p6j.m43014b(str);
            c15240e.f34896f = 0;
        } else {
            c15240e.f34895e = Integer.parseInt(str);
            c15240e.f34896f = 1;
        }
    }

    /* renamed from: t */
    public static int m38444t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                ria.m46824h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    public static void m38445u(String str, C15240e c15240e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c15240e.f34899i = m38444t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c15240e.f34898h = p6j.m43014b(str);
    }

    /* renamed from: v */
    public static int m38446v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                ria.m46824h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    public static int m38447w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        ria.m46824h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
