package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;
import p001o.h5c;
import p001o.n7d;

/* loaded from: classes6.dex */
public class t6d {

    /* renamed from: A */
    public static final String f46508A;

    /* renamed from: B */
    public static final Pattern f46509B;

    /* renamed from: C */
    public static final Pattern f46510C;

    /* renamed from: D */
    public static final Pattern f46511D;

    /* renamed from: E */
    public static final Pattern f46512E;

    /* renamed from: F */
    public static final Pattern f46513F;

    /* renamed from: G */
    public static t6d f46514G;

    /* renamed from: h */
    public static final Logger f46515h = Logger.getLogger(t6d.class.getName());

    /* renamed from: i */
    public static final Map f46516i;

    /* renamed from: j */
    public static final Set f46517j;

    /* renamed from: k */
    public static final Set f46518k;

    /* renamed from: l */
    public static final Map f46519l;

    /* renamed from: m */
    public static final Map f46520m;

    /* renamed from: n */
    public static final Map f46521n;

    /* renamed from: o */
    public static final Map f46522o;

    /* renamed from: p */
    public static final Pattern f46523p;

    /* renamed from: q */
    public static final String f46524q;

    /* renamed from: r */
    public static final Pattern f46525r;

    /* renamed from: s */
    public static final Pattern f46526s;

    /* renamed from: t */
    public static final Pattern f46527t;

    /* renamed from: u */
    public static final Pattern f46528u;

    /* renamed from: v */
    public static final Pattern f46529v;

    /* renamed from: w */
    public static final Pattern f46530w;

    /* renamed from: x */
    public static final Pattern f46531x;

    /* renamed from: y */
    public static final String f46532y;

    /* renamed from: z */
    public static final String f46533z;

    /* renamed from: a */
    public final zdb f46534a;

    /* renamed from: b */
    public final Map f46535b;

    /* renamed from: c */
    public final lta f46536c = oge.m42225b();

    /* renamed from: d */
    public final Set f46537d = new HashSet(35);

    /* renamed from: e */
    public final qge f46538e = new qge(100);

    /* renamed from: f */
    public final Set f46539f = new HashSet(320);

    /* renamed from: g */
    public final Set f46540g = new HashSet();

    /* renamed from: o.t6d$a */
    public static /* synthetic */ class C17005a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46541a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46542b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46543c;

        static {
            int[] iArr = new int[EnumC17007c.values().length];
            f46543c = iArr;
            try {
                iArr[EnumC17007c.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46543c[EnumC17007c.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46543c[EnumC17007c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46543c[EnumC17007c.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46543c[EnumC17007c.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46543c[EnumC17007c.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46543c[EnumC17007c.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46543c[EnumC17007c.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46543c[EnumC17007c.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f46543c[EnumC17007c.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f46543c[EnumC17007c.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[EnumC17006b.values().length];
            f46542b = iArr2;
            try {
                iArr2[EnumC17006b.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f46542b[EnumC17006b.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f46542b[EnumC17006b.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f46542b[EnumC17006b.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[n7d.EnumC15525a.values().length];
            f46541a = iArr3;
            try {
                iArr3[n7d.EnumC15525a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f46541a[n7d.EnumC15525a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f46541a[n7d.EnumC15525a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f46541a[n7d.EnumC15525a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* renamed from: o.t6d$b */
    public enum EnumC17006b {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* renamed from: o.t6d$c */
    public enum EnumC17007c {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* renamed from: o.t6d$d */
    public enum EnumC17008d {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        f46516i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f46517j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f46518k = Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        f46520m = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f46521n = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        f46519l = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char cCharValue = ((Character) it.next()).charValue();
            map6.put(Character.valueOf(Character.toLowerCase(cCharValue)), Character.valueOf(cCharValue));
            map6.put(Character.valueOf(cCharValue), Character.valueOf(cCharValue));
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(Character.valueOf(TokenParser.SP), Character.valueOf(TokenParser.SP));
        map6.put((char) 12288, Character.valueOf(TokenParser.SP));
        map6.put((char) 8288, Character.valueOf(TokenParser.SP));
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        f46522o = Collections.unmodifiableMap(map6);
        f46523p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = f46520m;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        f46524q = string;
        f46525r = Pattern.compile("[+＋]+");
        f46526s = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f46527t = Pattern.compile("(\\p{Nd})");
        f46528u = Pattern.compile("[+＋\\p{Nd}]");
        f46529v = Pattern.compile("[\\\\/] *x");
        f46530w = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f46531x = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + string + "\\p{Nd}]*";
        f46532y = str;
        String strM49445d = m49445d(",;xｘ#＃~～");
        f46533z = strM49445d;
        f46508A = m49445d("xｘ#＃~～");
        f46509B = Pattern.compile("(?:" + strM49445d + ")$", 66);
        f46510C = Pattern.compile(str + "(?:" + strM49445d + ")?", 66);
        f46511D = Pattern.compile("(\\D+)");
        f46512E = Pattern.compile("(\\$\\d)");
        f46513F = Pattern.compile("\\(?\\$1\\)?");
        f46514G = null;
    }

    public t6d(zdb zdbVar, Map map) {
        this.f46534a = zdbVar;
        this.f46535b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f46540g.add(entry.getKey());
            } else {
                this.f46539f.addAll(list);
            }
        }
        if (this.f46539f.remove("001")) {
            f46515h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f46537d.addAll((Collection) map.get(1));
    }

    /* renamed from: E */
    public static boolean m49438E(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f46510C.matcher(charSequence).matches();
    }

    /* renamed from: K */
    public static StringBuilder m49439K(StringBuilder sb) {
        if (f46531x.matcher(sb).matches()) {
            sb.replace(0, sb.length(), m49442N(sb, f46521n, true));
        } else {
            sb.replace(0, sb.length(), m49441M(sb));
        }
        return sb;
    }

    /* renamed from: L */
    public static StringBuilder m49440L(CharSequence charSequence, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            int iDigit = Character.digit(cCharAt, 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            } else if (z) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    /* renamed from: M */
    public static String m49441M(CharSequence charSequence) {
        return m49440L(charSequence, false).toString();
    }

    /* renamed from: N */
    public static String m49442N(CharSequence charSequence, Map map, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(cCharAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: T */
    public static synchronized void m49443T(t6d t6dVar) {
        f46514G = t6dVar;
    }

    /* renamed from: U */
    public static void m49444U(CharSequence charSequence, n7d n7dVar) {
        if (charSequence.length() <= 1 || charSequence.charAt(0) != '0') {
            return;
        }
        n7dVar.m40226u(true);
        int i = 1;
        while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
            i++;
        }
        if (i != 1) {
            n7dVar.m40228y(i);
        }
    }

    /* renamed from: d */
    public static String m49445d(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#";
    }

    /* renamed from: e */
    public static t6d m49446e(rdb rdbVar) {
        if (rdbVar != null) {
            return m49447f(new wnb(rdbVar));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    /* renamed from: f */
    public static t6d m49447f(zdb zdbVar) {
        if (zdbVar != null) {
            return new t6d(zdbVar, u84.m51203a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    /* renamed from: g */
    public static boolean m49448g(m7d m7dVar) {
        return (m7dVar.m38486c() == 1 && m7dVar.m38485b(0) == -1) ? false : true;
    }

    /* renamed from: i */
    public static CharSequence m49449i(CharSequence charSequence) {
        Matcher matcher = f46528u.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = f46530w.matcher(charSequenceSubSequence);
        if (matcher2.find()) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = f46529v.matcher(charSequenceSubSequence);
        return matcher3.find() ? charSequenceSubSequence.subSequence(0, matcher3.start()) : charSequenceSubSequence;
    }

    /* renamed from: p */
    public static synchronized t6d m49450p() {
        if (f46514G == null) {
            m49443T(m49446e(sdb.f45283a));
        }
        return f46514G;
    }

    /* renamed from: A */
    public boolean m49451A(String str, m7d m7dVar) {
        int length = str.length();
        List listM38487d = m7dVar.m38487d();
        if (listM38487d.size() <= 0 || listM38487d.contains(Integer.valueOf(length))) {
            return this.f46536c.mo37880a(str, m7dVar, false);
        }
        return false;
    }

    /* renamed from: B */
    public boolean m49452B(n7d n7dVar) {
        return m49453C(n7dVar, m49484x(n7dVar));
    }

    /* renamed from: C */
    public boolean m49453C(n7d n7dVar, String str) {
        int iM40209c = n7dVar.m40209c();
        i7d i7dVarM49479s = m49479s(iM40209c, str);
        if (i7dVarM49479s != null) {
            return ("001".equals(str) || iM40209c == m49476o(str)) && m49482v(m49480t(n7dVar), i7dVarM49479s) != EnumC17007c.UNKNOWN;
        }
        return false;
    }

    /* renamed from: D */
    public final boolean m49454D(String str) {
        return str != null && this.f46539f.contains(str);
    }

    /* renamed from: F */
    public final void m49455F(n7d n7dVar, i7d i7dVar, EnumC17006b enumC17006b, StringBuilder sb) {
        if (!n7dVar.m40217k() || n7dVar.m40211e().length() <= 0) {
            return;
        }
        if (enumC17006b == EnumC17006b.RFC3966) {
            sb.append(";ext=");
            sb.append(n7dVar.m40211e());
        } else if (i7dVar.m31690u()) {
            sb.append(i7dVar.m31681k());
            sb.append(n7dVar.m40211e());
        } else {
            sb.append(" ext. ");
            sb.append(n7dVar.m40211e());
        }
    }

    /* renamed from: G */
    public int m49456G(CharSequence charSequence, i7d i7dVar, StringBuilder sb, boolean z, n7d n7dVar) throws h5c, NumberFormatException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        n7d.EnumC15525a enumC15525aM49458I = m49458I(sb2, i7dVar != null ? i7dVar.m31674d() : "NonMatch");
        if (z) {
            n7dVar.m40224s(enumC15525aM49458I);
        }
        if (enumC15525aM49458I != n7d.EnumC15525a.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new h5c(h5c.EnumC13852a.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iM49470h = m49470h(sb2, sb);
            if (iM49470h == 0) {
                throw new h5c(h5c.EnumC13852a.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            n7dVar.m40223r(iM49470h);
            return iM49470h;
        }
        if (i7dVar != null) {
            int iM31671a = i7dVar.m31671a();
            String strValueOf = String.valueOf(iM31671a);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                m7d m7dVarM31673c = i7dVar.m31673c();
                m49459J(sb3, i7dVar, null);
                if ((!this.f46536c.mo37880a(sb2, m7dVarM31673c, false) && this.f46536c.mo37880a(sb3, m7dVarM31673c, false)) || m49465V(sb2, i7dVar) == EnumC17008d.TOO_LONG) {
                    sb.append((CharSequence) sb3);
                    if (z) {
                        n7dVar.m40224s(n7d.EnumC15525a.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    n7dVar.m40223r(iM31671a);
                    return iM31671a;
                }
            }
        }
        n7dVar.m40223r(0);
        return 0;
    }

    /* renamed from: H */
    public String m49457H(StringBuilder sb) {
        Matcher matcher = f46509B.matcher(sb);
        if (!matcher.find() || !m49438E(sb.substring(0, matcher.start()))) {
            return "";
        }
        int iGroupCount = matcher.groupCount();
        for (int i = 1; i <= iGroupCount; i++) {
            if (matcher.group(i) != null) {
                String strGroup = matcher.group(i);
                sb.delete(matcher.start(), sb.length());
                return strGroup;
            }
        }
        return "";
    }

    /* renamed from: I */
    public n7d.EnumC15525a m49458I(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return n7d.EnumC15525a.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f46525r.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            m49439K(sb);
            return n7d.EnumC15525a.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern patternM45436a = this.f46538e.m45436a(str);
        m49439K(sb);
        return m49463R(patternM45436a, sb) ? n7d.EnumC15525a.FROM_NUMBER_WITH_IDD : n7d.EnumC15525a.FROM_DEFAULT_COUNTRY;
    }

    /* renamed from: J */
    public boolean m49459J(StringBuilder sb, i7d i7dVar, StringBuilder sb2) {
        int length = sb.length();
        String strM31677g = i7dVar.m31677g();
        if (length != 0 && strM31677g.length() != 0) {
            Matcher matcher = this.f46538e.m45436a(strM31677g).matcher(sb);
            if (matcher.lookingAt()) {
                m7d m7dVarM31673c = i7dVar.m31673c();
                boolean zMo37880a = this.f46536c.mo37880a(sb, m7dVarM31673c, false);
                int iGroupCount = matcher.groupCount();
                String strM31678h = i7dVar.m31678h();
                if (strM31678h == null || strM31678h.length() == 0 || matcher.group(iGroupCount) == null) {
                    if (zMo37880a && !this.f46536c.mo37880a(sb.substring(matcher.end()), m7dVarM31673c, false)) {
                        return false;
                    }
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
                StringBuilder sb3 = new StringBuilder(sb);
                sb3.replace(0, length, matcher.replaceFirst(strM31678h));
                if (zMo37880a && !this.f46536c.mo37880a(sb3.toString(), m7dVarM31673c, false)) {
                    return false;
                }
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public n7d m49460O(CharSequence charSequence, String str) {
        n7d n7dVar = new n7d();
        m49461P(charSequence, str, n7dVar);
        return n7dVar;
    }

    /* renamed from: P */
    public void m49461P(CharSequence charSequence, String str, n7d n7dVar) throws h5c, NumberFormatException {
        m49462Q(charSequence, str, false, true, n7dVar);
    }

    /* renamed from: Q */
    public final void m49462Q(CharSequence charSequence, String str, boolean z, boolean z2, n7d n7dVar) throws h5c, NumberFormatException {
        int iM49456G;
        if (charSequence == null) {
            throw new h5c(h5c.EnumC13852a.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new h5c(h5c.EnumC13852a.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = charSequence.toString();
        m49467a(string, sb);
        if (!m49438E(sb)) {
            throw new h5c(h5c.EnumC13852a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        if (z2 && !m49468b(sb, str)) {
            throw new h5c(h5c.EnumC13852a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z) {
            n7dVar.m40206A(string);
        }
        String strM49457H = m49457H(sb);
        if (strM49457H.length() > 0) {
            n7dVar.m40225t(strM49457H);
        }
        i7d i7dVarM49478r = m49478r(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            iM49456G = m49456G(sb, i7dVarM49478r, sb2, z, n7dVar);
        } catch (h5c e) {
            Matcher matcher = f46525r.matcher(sb);
            if (e.m29824a() != h5c.EnumC13852a.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                throw new h5c(e.m29824a(), e.getMessage());
            }
            iM49456G = m49456G(sb.substring(matcher.end()), i7dVarM49478r, sb2, z, n7dVar);
            if (iM49456G == 0) {
                throw new h5c(h5c.EnumC13852a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iM49456G != 0) {
            String strM49483w = m49483w(iM49456G);
            if (!strM49483w.equals(str)) {
                i7dVarM49478r = m49479s(iM49456G, strM49483w);
            }
        } else {
            sb2.append((CharSequence) m49439K(sb));
            if (str != null) {
                n7dVar.m40223r(i7dVarM49478r.m31671a());
            } else if (z) {
                n7dVar.m40207a();
            }
        }
        if (sb2.length() < 2) {
            throw new h5c(h5c.EnumC13852a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (i7dVarM49478r != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            m49459J(sb4, i7dVarM49478r, sb3);
            EnumC17008d enumC17008dM49465V = m49465V(sb4, i7dVarM49478r);
            if (enumC17008dM49465V != EnumC17008d.TOO_SHORT && enumC17008dM49465V != EnumC17008d.IS_POSSIBLE_LOCAL_ONLY && enumC17008dM49465V != EnumC17008d.INVALID_LENGTH) {
                if (z && sb3.length() > 0) {
                    n7dVar.m40229z(sb3.toString());
                }
                sb2 = sb4;
            }
        }
        int length = sb2.length();
        if (length < 2) {
            throw new h5c(h5c.EnumC13852a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new h5c(h5c.EnumC13852a.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        m49444U(sb2, n7dVar);
        n7dVar.m40227x(Long.parseLong(sb2.toString()));
    }

    /* renamed from: R */
    public final boolean m49463R(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int iEnd = matcher.end();
        Matcher matcher2 = f46527t.matcher(sb.substring(iEnd));
        if (matcher2.find() && m49441M(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, iEnd);
        return true;
    }

    /* renamed from: S */
    public final void m49464S(int i, EnumC17006b enumC17006b, StringBuilder sb) {
        int i2 = C17005a.f46542b[enumC17006b.ordinal()];
        if (i2 == 1) {
            sb.insert(0, i).insert(0, '+');
        } else if (i2 == 2) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        } else {
            if (i2 != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }

    /* renamed from: V */
    public final EnumC17008d m49465V(CharSequence charSequence, i7d i7dVar) {
        return m49466W(charSequence, i7dVar, EnumC17007c.UNKNOWN);
    }

    /* renamed from: W */
    public final EnumC17008d m49466W(CharSequence charSequence, i7d i7dVar, EnumC17007c enumC17007c) {
        m7d m7dVarM49481u = m49481u(i7dVar, enumC17007c);
        List listM38487d = m7dVarM49481u.m38487d().isEmpty() ? i7dVar.m31673c().m38487d() : m7dVarM49481u.m38487d();
        List listM38489f = m7dVarM49481u.m38489f();
        if (enumC17007c == EnumC17007c.FIXED_LINE_OR_MOBILE) {
            if (!m49448g(m49481u(i7dVar, EnumC17007c.FIXED_LINE))) {
                return m49466W(charSequence, i7dVar, EnumC17007c.MOBILE);
            }
            m7d m7dVarM49481u2 = m49481u(i7dVar, EnumC17007c.MOBILE);
            if (m49448g(m7dVarM49481u2)) {
                ArrayList arrayList = new ArrayList(listM38487d);
                arrayList.addAll(m7dVarM49481u2.m38487d().size() == 0 ? i7dVar.m31673c().m38487d() : m7dVarM49481u2.m38487d());
                Collections.sort(arrayList);
                if (listM38489f.isEmpty()) {
                    listM38489f = m7dVarM49481u2.m38489f();
                } else {
                    ArrayList arrayList2 = new ArrayList(listM38489f);
                    arrayList2.addAll(m7dVarM49481u2.m38489f());
                    Collections.sort(arrayList2);
                    listM38489f = arrayList2;
                }
                listM38487d = arrayList;
            }
        }
        if (((Integer) listM38487d.get(0)).intValue() == -1) {
            return EnumC17008d.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (listM38489f.contains(Integer.valueOf(length))) {
            return EnumC17008d.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) listM38487d.get(0)).intValue();
        return iIntValue == length ? EnumC17008d.IS_POSSIBLE : iIntValue > length ? EnumC17008d.TOO_SHORT : ((Integer) listM38487d.get(listM38487d.size() - 1)).intValue() < length ? EnumC17008d.TOO_LONG : listM38487d.subList(1, listM38487d.size()).contains(Integer.valueOf(length)) ? EnumC17008d.IS_POSSIBLE : EnumC17008d.INVALID_LENGTH;
    }

    /* renamed from: a */
    public final void m49467a(String str, StringBuilder sb) {
        int iIndexOf = str.indexOf(";phone-context=");
        if (iIndexOf >= 0) {
            int i = iIndexOf + 15;
            if (i < str.length() - 1 && str.charAt(i) == '+') {
                int iIndexOf2 = str.indexOf(59, i);
                if (iIndexOf2 > 0) {
                    sb.append(str.substring(i, iIndexOf2));
                } else {
                    sb.append(str.substring(i));
                }
            }
            int iIndexOf3 = str.indexOf("tel:");
            sb.append(str.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            sb.append(m49449i(str));
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
    }

    /* renamed from: b */
    public final boolean m49468b(CharSequence charSequence, String str) {
        if (m49454D(str)) {
            return true;
        }
        return (charSequence == null || charSequence.length() == 0 || !f46525r.matcher(charSequence).lookingAt()) ? false : true;
    }

    /* renamed from: c */
    public g7d m49469c(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g7d g7dVar = (g7d) it.next();
            int iM28147f = g7dVar.m28147f();
            if (iM28147f == 0 || this.f46538e.m45436a(g7dVar.m28144c(iM28147f - 1)).matcher(str).lookingAt()) {
                if (this.f46538e.m45436a(g7dVar.m28146e()).matcher(str).matches()) {
                    return g7dVar;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m49470h(StringBuilder sb, StringBuilder sb2) throws NumberFormatException {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i = 1; i <= 3 && i <= length; i++) {
                int i2 = Integer.parseInt(sb.substring(0, i));
                if (this.f46535b.containsKey(Integer.valueOf(i2))) {
                    sb2.append(sb.substring(i));
                    return i2;
                }
            }
        }
        return 0;
    }

    /* renamed from: j */
    public String m49471j(n7d n7dVar, EnumC17006b enumC17006b) {
        if (n7dVar.m40212f() == 0 && n7dVar.m40221p()) {
            String strM40215i = n7dVar.m40215i();
            if (strM40215i.length() > 0) {
                return strM40215i;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        m49472k(n7dVar, enumC17006b, sb);
        return sb.toString();
    }

    /* renamed from: k */
    public void m49472k(n7d n7dVar, EnumC17006b enumC17006b, StringBuilder sb) {
        sb.setLength(0);
        int iM40209c = n7dVar.m40209c();
        String strM49480t = m49480t(n7dVar);
        EnumC17006b enumC17006b2 = EnumC17006b.E164;
        if (enumC17006b == enumC17006b2) {
            sb.append(strM49480t);
            m49464S(iM40209c, enumC17006b2, sb);
        } else {
            if (!m49486z(iM40209c)) {
                sb.append(strM49480t);
                return;
            }
            i7d i7dVarM49479s = m49479s(iM40209c, m49483w(iM40209c));
            sb.append(m49473l(strM49480t, i7dVarM49479s, enumC17006b));
            m49455F(n7dVar, i7dVarM49479s, enumC17006b, sb);
            m49464S(iM40209c, enumC17006b, sb);
        }
    }

    /* renamed from: l */
    public final String m49473l(String str, i7d i7dVar, EnumC17006b enumC17006b) {
        return m49474m(str, i7dVar, enumC17006b, null);
    }

    /* renamed from: m */
    public final String m49474m(String str, i7d i7dVar, EnumC17006b enumC17006b, CharSequence charSequence) {
        g7d g7dVarM49469c = m49469c((i7dVar.m31692y().size() == 0 || enumC17006b == EnumC17006b.NATIONAL) ? i7dVar.m31648A() : i7dVar.m31692y(), str);
        return g7dVarM49469c == null ? str : m49475n(str, g7dVarM49469c, enumC17006b, charSequence);
    }

    /* renamed from: n */
    public final String m49475n(String str, g7d g7dVar, EnumC17006b enumC17006b, CharSequence charSequence) {
        String strReplaceAll;
        String strM28143b = g7dVar.m28143b();
        Matcher matcher = this.f46538e.m45436a(g7dVar.m28146e()).matcher(str);
        EnumC17006b enumC17006b2 = EnumC17006b.NATIONAL;
        if (enumC17006b != enumC17006b2 || charSequence == null || charSequence.length() <= 0 || g7dVar.m28142a().length() <= 0) {
            String strM28145d = g7dVar.m28145d();
            strReplaceAll = (enumC17006b != enumC17006b2 || strM28145d == null || strM28145d.length() <= 0) ? matcher.replaceAll(strM28143b) : matcher.replaceAll(f46512E.matcher(strM28143b).replaceFirst(strM28145d));
        } else {
            strReplaceAll = matcher.replaceAll(f46512E.matcher(strM28143b).replaceFirst(g7dVar.m28142a().replace("$CC", charSequence)));
        }
        if (enumC17006b != EnumC17006b.RFC3966) {
            return strReplaceAll;
        }
        Matcher matcher2 = f46526s.matcher(strReplaceAll);
        if (matcher2.lookingAt()) {
            strReplaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(strReplaceAll).replaceAll("-");
    }

    /* renamed from: o */
    public final int m49476o(String str) {
        i7d i7dVarM49478r = m49478r(str);
        if (i7dVarM49478r != null) {
            return i7dVarM49478r.m31671a();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    /* renamed from: q */
    public i7d m49477q(int i) {
        if (this.f46535b.containsKey(Integer.valueOf(i))) {
            return this.f46534a.mo54747b(i);
        }
        return null;
    }

    /* renamed from: r */
    public i7d m49478r(String str) {
        if (m49454D(str)) {
            return this.f46534a.mo54746a(str);
        }
        return null;
    }

    /* renamed from: s */
    public final i7d m49479s(int i, String str) {
        return "001".equals(str) ? m49477q(i) : m49478r(str);
    }

    /* renamed from: t */
    public String m49480t(n7d n7dVar) {
        StringBuilder sb = new StringBuilder();
        if (n7dVar.m40222q() && n7dVar.m40213g() > 0) {
            char[] cArr = new char[n7dVar.m40213g()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(n7dVar.m40212f());
        return sb.toString();
    }

    /* renamed from: u */
    public m7d m49481u(i7d i7dVar, EnumC17007c enumC17007c) {
        switch (C17005a.f46543c[enumC17007c.ordinal()]) {
            case 1:
                return i7dVar.m31682l();
            case 2:
                return i7dVar.m31685p();
            case 3:
                return i7dVar.m31676f();
            case 4:
            case 5:
                return i7dVar.m31672b();
            case 6:
                return i7dVar.m31684o();
            case 7:
                return i7dVar.m31688s();
            case 8:
                return i7dVar.m31680j();
            case 9:
                return i7dVar.m31679i();
            case 10:
                return i7dVar.m31686q();
            case 11:
                return i7dVar.m31687r();
            default:
                return i7dVar.m31673c();
        }
    }

    /* renamed from: v */
    public final EnumC17007c m49482v(String str, i7d i7dVar) {
        return !m49451A(str, i7dVar.m31673c()) ? EnumC17007c.UNKNOWN : m49451A(str, i7dVar.m31682l()) ? EnumC17007c.PREMIUM_RATE : m49451A(str, i7dVar.m31685p()) ? EnumC17007c.TOLL_FREE : m49451A(str, i7dVar.m31684o()) ? EnumC17007c.SHARED_COST : m49451A(str, i7dVar.m31688s()) ? EnumC17007c.VOIP : m49451A(str, i7dVar.m31680j()) ? EnumC17007c.PERSONAL_NUMBER : m49451A(str, i7dVar.m31679i()) ? EnumC17007c.PAGER : m49451A(str, i7dVar.m31686q()) ? EnumC17007c.UAN : m49451A(str, i7dVar.m31687r()) ? EnumC17007c.VOICEMAIL : m49451A(str, i7dVar.m31672b()) ? i7dVar.m31683m() ? EnumC17007c.FIXED_LINE_OR_MOBILE : m49451A(str, i7dVar.m31676f()) ? EnumC17007c.FIXED_LINE_OR_MOBILE : EnumC17007c.FIXED_LINE : (i7dVar.m31683m() || !m49451A(str, i7dVar.m31676f())) ? EnumC17007c.UNKNOWN : EnumC17007c.MOBILE;
    }

    /* renamed from: w */
    public String m49483w(int i) {
        List list = (List) this.f46535b.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    /* renamed from: x */
    public String m49484x(n7d n7dVar) {
        int iM40209c = n7dVar.m40209c();
        List list = (List) this.f46535b.get(Integer.valueOf(iM40209c));
        if (list != null) {
            return list.size() == 1 ? (String) list.get(0) : m49485y(n7dVar, list);
        }
        f46515h.log(Level.INFO, "Missing/invalid country_code (" + iM40209c + ")");
        return null;
    }

    /* renamed from: y */
    public final String m49485y(n7d n7dVar, List list) {
        String strM49480t = m49480t(n7dVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i7d i7dVarM49478r = m49478r(str);
            if (i7dVarM49478r.m31689t()) {
                if (this.f46538e.m45436a(i7dVarM49478r.m31675e()).matcher(strM49480t).lookingAt()) {
                    return str;
                }
            } else if (m49482v(strM49480t, i7dVarM49478r) != EnumC17007c.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: z */
    public final boolean m49486z(int i) {
        return this.f46535b.containsKey(Integer.valueOf(i));
    }
}
