package p001o;

import android.content.Context;
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
import p001o.i5c;
import p001o.o7d;

/* loaded from: classes6.dex */
public class u6d {

    /* renamed from: A */
    public static final String f48395A;

    /* renamed from: B */
    public static final Pattern f48396B;

    /* renamed from: C */
    public static final Pattern f48397C;

    /* renamed from: D */
    public static final Pattern f48398D;

    /* renamed from: E */
    public static final Pattern f48399E;

    /* renamed from: F */
    public static final Pattern f48400F;

    /* renamed from: h */
    public static final Logger f48401h = Logger.getLogger(u6d.class.getName());

    /* renamed from: i */
    public static final Map f48402i;

    /* renamed from: j */
    public static final Set f48403j;

    /* renamed from: k */
    public static final Set f48404k;

    /* renamed from: l */
    public static final Map f48405l;

    /* renamed from: m */
    public static final Map f48406m;

    /* renamed from: n */
    public static final Map f48407n;

    /* renamed from: o */
    public static final Map f48408o;

    /* renamed from: p */
    public static final Pattern f48409p;

    /* renamed from: q */
    public static final String f48410q;

    /* renamed from: r */
    public static final Pattern f48411r;

    /* renamed from: s */
    public static final Pattern f48412s;

    /* renamed from: t */
    public static final Pattern f48413t;

    /* renamed from: u */
    public static final Pattern f48414u;

    /* renamed from: v */
    public static final Pattern f48415v;

    /* renamed from: w */
    public static final Pattern f48416w;

    /* renamed from: x */
    public static final Pattern f48417x;

    /* renamed from: y */
    public static final String f48418y;

    /* renamed from: z */
    public static final String f48419z;

    /* renamed from: a */
    public final ydb f48420a;

    /* renamed from: b */
    public final Map f48421b;

    /* renamed from: c */
    public final kta f48422c = nge.m40546b();

    /* renamed from: d */
    public final Set f48423d = new HashSet(35);

    /* renamed from: e */
    public final pge f48424e = new pge(100);

    /* renamed from: f */
    public final Set f48425f = new HashSet(320);

    /* renamed from: g */
    public final Set f48426g = new HashSet();

    /* renamed from: o.u6d$a */
    public static /* synthetic */ class C17303a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48427a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f48428b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f48429c;

        static {
            int[] iArr = new int[EnumC17305c.values().length];
            f48429c = iArr;
            try {
                iArr[EnumC17305c.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48429c[EnumC17305c.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48429c[EnumC17305c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48429c[EnumC17305c.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48429c[EnumC17305c.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48429c[EnumC17305c.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48429c[EnumC17305c.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f48429c[EnumC17305c.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f48429c[EnumC17305c.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f48429c[EnumC17305c.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f48429c[EnumC17305c.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[EnumC17304b.values().length];
            f48428b = iArr2;
            try {
                iArr2[EnumC17304b.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f48428b[EnumC17304b.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f48428b[EnumC17304b.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f48428b[EnumC17304b.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[o7d.EnumC15723a.values().length];
            f48427a = iArr3;
            try {
                iArr3[o7d.EnumC15723a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f48427a[o7d.EnumC15723a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f48427a[o7d.EnumC15723a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f48427a[o7d.EnumC15723a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* renamed from: o.u6d$b */
    public enum EnumC17304b {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* renamed from: o.u6d$c */
    public enum EnumC17305c {
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

    /* renamed from: o.u6d$d */
    public enum EnumC17306d {
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
        f48402i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f48403j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f48404k = Collections.unmodifiableSet(hashSet2);
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
        f48406m = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f48407n = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        f48405l = Collections.unmodifiableMap(map5);
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
        f48408o = Collections.unmodifiableMap(map6);
        f48409p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = f48406m;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        f48410q = string;
        f48411r = Pattern.compile("[+＋]+");
        f48412s = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f48413t = Pattern.compile("(\\p{Nd})");
        f48414u = Pattern.compile("[+＋\\p{Nd}]");
        f48415v = Pattern.compile("[\\\\/] *x");
        f48416w = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f48417x = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + string + "\\p{Nd}]*";
        f48418y = str;
        String strM50999d = m50999d(",;xｘ#＃~～");
        f48419z = strM50999d;
        f48395A = m50999d("xｘ#＃~～");
        f48396B = Pattern.compile("(?:" + strM50999d + ")$", 66);
        f48397C = Pattern.compile(str + "(?:" + strM50999d + ")?", 66);
        f48398D = Pattern.compile("(\\D+)");
        f48399E = Pattern.compile("(\\$\\d)");
        f48400F = Pattern.compile("\\(?\\$1\\)?");
    }

    public u6d(ydb ydbVar, Map map) {
        this.f48420a = ydbVar;
        this.f48421b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f48426g.add((Integer) entry.getKey());
            } else {
                this.f48425f.addAll(list);
            }
        }
        if (this.f48425f.remove("001")) {
            f48401h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f48423d.addAll((Collection) map.get(1));
    }

    /* renamed from: I */
    public static boolean m50992I(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f48397C.matcher(charSequence).matches();
    }

    /* renamed from: O */
    public static StringBuilder m50993O(StringBuilder sb) {
        if (f48417x.matcher(sb).matches()) {
            sb.replace(0, sb.length(), m50997S(sb, f48407n, true));
        } else {
            sb.replace(0, sb.length(), m50996R(sb));
        }
        return sb;
    }

    /* renamed from: P */
    public static String m50994P(CharSequence charSequence) {
        return m50997S(charSequence, f48405l, true);
    }

    /* renamed from: Q */
    public static StringBuilder m50995Q(CharSequence charSequence, boolean z) {
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

    /* renamed from: R */
    public static String m50996R(CharSequence charSequence) {
        return m50995Q(charSequence, false).toString();
    }

    /* renamed from: S */
    public static String m50997S(CharSequence charSequence, Map map, boolean z) {
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

    /* renamed from: Y */
    public static void m50998Y(CharSequence charSequence, o7d o7dVar) {
        if (charSequence.length() <= 1 || charSequence.charAt(0) != '0') {
            return;
        }
        o7dVar.m41709u(true);
        int i = 1;
        while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
            i++;
        }
        if (i != 1) {
            o7dVar.m41711y(i);
        }
    }

    /* renamed from: d */
    public static String m50999d(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#";
    }

    /* renamed from: e */
    public static u6d m51000e(Context context) {
        if (context != null) {
            return m51001f(new up0(context.getAssets()));
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    /* renamed from: f */
    public static u6d m51001f(qdb qdbVar) {
        if (qdbVar != null) {
            return m51002g(new vnb(qdbVar));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    /* renamed from: g */
    public static u6d m51002g(ydb ydbVar) {
        if (ydbVar != null) {
            return new u6d(ydbVar, t84.m49558a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    /* renamed from: h */
    public static boolean m51003h(l7d l7dVar) {
        return (l7dVar.m36660d() == 1 && l7dVar.m36659c(0) == -1) ? false : true;
    }

    /* renamed from: j */
    public static CharSequence m51004j(CharSequence charSequence) {
        Matcher matcher = f48414u.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = f48416w.matcher(charSequenceSubSequence);
        if (matcher2.find()) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = f48415v.matcher(charSequenceSubSequence);
        return matcher3.find() ? charSequenceSubSequence.subSequence(0, matcher3.start()) : charSequenceSubSequence;
    }

    /* renamed from: p */
    public static boolean m51005p(String str) {
        return str.length() == 0 || f48400F.matcher(str).matches();
    }

    /* renamed from: A */
    public String m51006A(int i) {
        List list = (List) this.f48421b.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    /* renamed from: B */
    public String m51007B(o7d o7dVar) {
        int iM41692c = o7dVar.m41692c();
        List list = (List) this.f48421b.get(Integer.valueOf(iM41692c));
        if (list != null) {
            return list.size() == 1 ? (String) list.get(0) : m51008C(o7dVar, list);
        }
        f48401h.log(Level.INFO, "Missing/invalid country_code (" + iM41692c + ")");
        return null;
    }

    /* renamed from: C */
    public final String m51008C(o7d o7dVar, List list) {
        String strM51041x = m51041x(o7dVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h7d h7dVarM51039v = m51039v(str);
            if (h7dVarM51039v.m29941t()) {
                if (this.f48424e.m43607a(h7dVarM51039v.m29927e()).matcher(strM51041x).lookingAt()) {
                    return str;
                }
            } else if (m51043z(strM51041x, h7dVarM51039v) != EnumC17305c.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final boolean m51009D(int i) {
        return this.f48421b.containsKey(Integer.valueOf(i));
    }

    /* renamed from: E */
    public boolean m51010E(String str, l7d l7dVar) {
        int length = str.length();
        List listM36661e = l7dVar.m36661e();
        if (listM36661e.size() <= 0 || listM36661e.contains(Integer.valueOf(length))) {
            return this.f48422c.mo36214a(str, l7dVar, false);
        }
        return false;
    }

    /* renamed from: F */
    public boolean m51011F(o7d o7dVar) {
        return m51012G(o7dVar, m51007B(o7dVar));
    }

    /* renamed from: G */
    public boolean m51012G(o7d o7dVar, String str) {
        int iM41692c = o7dVar.m41692c();
        h7d h7dVarM51040w = m51040w(iM41692c, str);
        if (h7dVarM51040w != null) {
            return ("001".equals(str) || iM41692c == m51036s(str)) && m51043z(m51041x(o7dVar), h7dVarM51040w) != EnumC17305c.UNKNOWN;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m51013H(String str) {
        return str != null && this.f48425f.contains(str);
    }

    /* renamed from: J */
    public final void m51014J(o7d o7dVar, h7d h7dVar, EnumC17304b enumC17304b, StringBuilder sb) {
        if (!o7dVar.m41700k() || o7dVar.m41694e().length() <= 0) {
            return;
        }
        if (enumC17304b == EnumC17304b.RFC3966) {
            sb.append(";ext=");
            sb.append(o7dVar.m41694e());
        } else if (h7dVar.m29943x()) {
            sb.append(h7dVar.m29933k());
            sb.append(o7dVar.m41694e());
        } else {
            sb.append(" ext. ");
            sb.append(o7dVar.m41694e());
        }
    }

    /* renamed from: K */
    public int m51015K(CharSequence charSequence, h7d h7dVar, StringBuilder sb, boolean z, o7d o7dVar) throws NumberFormatException, i5c {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        o7d.EnumC15723a enumC15723aM51017M = m51017M(sb2, h7dVar != null ? h7dVar.m29926d() : "NonMatch");
        if (z) {
            o7dVar.m41707s(enumC15723aM51017M);
        }
        if (enumC15723aM51017M != o7d.EnumC15723a.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new i5c(i5c.EnumC14187a.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iM51028i = m51028i(sb2, sb);
            if (iM51028i == 0) {
                throw new i5c(i5c.EnumC14187a.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            o7dVar.m41706r(iM51028i);
            return iM51028i;
        }
        if (h7dVar != null) {
            int iM29923a = h7dVar.m29923a();
            String strValueOf = String.valueOf(iM29923a);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                l7d l7dVarM29925c = h7dVar.m29925c();
                m51018N(sb3, h7dVar, null);
                if ((!this.f48422c.mo36214a(sb2, l7dVarM29925c, false) && this.f48422c.mo36214a(sb3, l7dVarM29925c, false)) || m51024Z(sb2, h7dVar) == EnumC17306d.TOO_LONG) {
                    sb.append((CharSequence) sb3);
                    if (z) {
                        o7dVar.m41707s(o7d.EnumC15723a.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    o7dVar.m41706r(iM29923a);
                    return iM29923a;
                }
            }
        }
        o7dVar.m41706r(0);
        return 0;
    }

    /* renamed from: L */
    public String m51016L(StringBuilder sb) {
        Matcher matcher = f48396B.matcher(sb);
        if (!matcher.find() || !m50992I(sb.substring(0, matcher.start()))) {
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

    /* renamed from: M */
    public o7d.EnumC15723a m51017M(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return o7d.EnumC15723a.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f48411r.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            m50993O(sb);
            return o7d.EnumC15723a.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern patternM43607a = this.f48424e.m43607a(str);
        m50993O(sb);
        return m51022W(patternM43607a, sb) ? o7d.EnumC15723a.FROM_NUMBER_WITH_IDD : o7d.EnumC15723a.FROM_DEFAULT_COUNTRY;
    }

    /* renamed from: N */
    public boolean m51018N(StringBuilder sb, h7d h7dVar, StringBuilder sb2) {
        int length = sb.length();
        String strM29929g = h7dVar.m29929g();
        if (length != 0 && strM29929g.length() != 0) {
            Matcher matcher = this.f48424e.m43607a(strM29929g).matcher(sb);
            if (matcher.lookingAt()) {
                l7d l7dVarM29925c = h7dVar.m29925c();
                boolean zMo36214a = this.f48422c.mo36214a(sb, l7dVarM29925c, false);
                int iGroupCount = matcher.groupCount();
                String strM29930h = h7dVar.m29930h();
                if (strM29930h == null || strM29930h.length() == 0 || matcher.group(iGroupCount) == null) {
                    if (zMo36214a && !this.f48422c.mo36214a(sb.substring(matcher.end()), l7dVarM29925c, false)) {
                        return false;
                    }
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
                StringBuilder sb3 = new StringBuilder(sb);
                sb3.replace(0, length, matcher.replaceFirst(strM29930h));
                if (zMo36214a && !this.f48422c.mo36214a(sb3.toString(), l7dVarM29925c, false)) {
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

    /* renamed from: T */
    public o7d m51019T(CharSequence charSequence, String str) {
        o7d o7dVar = new o7d();
        m51020U(charSequence, str, o7dVar);
        return o7dVar;
    }

    /* renamed from: U */
    public void m51020U(CharSequence charSequence, String str, o7d o7dVar) throws i5c, NumberFormatException {
        m51021V(charSequence, str, false, true, o7dVar);
    }

    /* renamed from: V */
    public final void m51021V(CharSequence charSequence, String str, boolean z, boolean z2, o7d o7dVar) throws i5c, NumberFormatException {
        int iM51015K;
        if (charSequence == null) {
            throw new i5c(i5c.EnumC14187a.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new i5c(i5c.EnumC14187a.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = charSequence.toString();
        m51025a(string, sb);
        if (!m50992I(sb)) {
            throw new i5c(i5c.EnumC14187a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        if (z2 && !m51026b(sb, str)) {
            throw new i5c(i5c.EnumC14187a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z) {
            o7dVar.m41689A(string);
        }
        String strM51016L = m51016L(sb);
        if (strM51016L.length() > 0) {
            o7dVar.m41708t(strM51016L);
        }
        h7d h7dVarM51039v = m51039v(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            iM51015K = m51015K(sb, h7dVarM51039v, sb2, z, o7dVar);
        } catch (i5c e) {
            Matcher matcher = f48411r.matcher(sb);
            if (e.m31574a() != i5c.EnumC14187a.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                throw new i5c(e.m31574a(), e.getMessage());
            }
            iM51015K = m51015K(sb.substring(matcher.end()), h7dVarM51039v, sb2, z, o7dVar);
            if (iM51015K == 0) {
                throw new i5c(i5c.EnumC14187a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iM51015K != 0) {
            String strM51006A = m51006A(iM51015K);
            if (!strM51006A.equals(str)) {
                h7dVarM51039v = m51040w(iM51015K, strM51006A);
            }
        } else {
            sb2.append((CharSequence) m50993O(sb));
            if (str != null) {
                o7dVar.m41706r(h7dVarM51039v.m29923a());
            } else if (z) {
                o7dVar.m41690a();
            }
        }
        if (sb2.length() < 2) {
            throw new i5c(i5c.EnumC14187a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (h7dVarM51039v != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            m51018N(sb4, h7dVarM51039v, sb3);
            EnumC17306d enumC17306dM51024Z = m51024Z(sb4, h7dVarM51039v);
            if (enumC17306dM51024Z != EnumC17306d.TOO_SHORT && enumC17306dM51024Z != EnumC17306d.IS_POSSIBLE_LOCAL_ONLY && enumC17306dM51024Z != EnumC17306d.INVALID_LENGTH) {
                if (z && sb3.length() > 0) {
                    o7dVar.m41712z(sb3.toString());
                }
                sb2 = sb4;
            }
        }
        int length = sb2.length();
        if (length < 2) {
            throw new i5c(i5c.EnumC14187a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new i5c(i5c.EnumC14187a.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        m50998Y(sb2, o7dVar);
        o7dVar.m41710x(Long.parseLong(sb2.toString()));
    }

    /* renamed from: W */
    public final boolean m51022W(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int iEnd = matcher.end();
        Matcher matcher2 = f48413t.matcher(sb.substring(iEnd));
        if (matcher2.find() && m50996R(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, iEnd);
        return true;
    }

    /* renamed from: X */
    public final void m51023X(int i, EnumC17304b enumC17304b, StringBuilder sb) {
        int i2 = C17303a.f48428b[enumC17304b.ordinal()];
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

    /* renamed from: Z */
    public final EnumC17306d m51024Z(CharSequence charSequence, h7d h7dVar) {
        return a0(charSequence, h7dVar, EnumC17305c.UNKNOWN);
    }

    /* renamed from: a */
    public final void m51025a(String str, StringBuilder sb) {
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
            sb.append(m51004j(str));
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
    }

    public final EnumC17306d a0(CharSequence charSequence, h7d h7dVar, EnumC17305c enumC17305c) {
        l7d l7dVarM51042y = m51042y(h7dVar, enumC17305c);
        List listM36661e = l7dVarM51042y.m36661e().isEmpty() ? h7dVar.m29925c().m36661e() : l7dVarM51042y.m36661e();
        List listM36663g = l7dVarM51042y.m36663g();
        if (enumC17305c == EnumC17305c.FIXED_LINE_OR_MOBILE) {
            if (!m51003h(m51042y(h7dVar, EnumC17305c.FIXED_LINE))) {
                return a0(charSequence, h7dVar, EnumC17305c.MOBILE);
            }
            l7d l7dVarM51042y2 = m51042y(h7dVar, EnumC17305c.MOBILE);
            if (m51003h(l7dVarM51042y2)) {
                ArrayList arrayList = new ArrayList(listM36661e);
                arrayList.addAll(l7dVarM51042y2.m36661e().size() == 0 ? h7dVar.m29925c().m36661e() : l7dVarM51042y2.m36661e());
                Collections.sort(arrayList);
                if (listM36663g.isEmpty()) {
                    listM36663g = l7dVarM51042y2.m36663g();
                } else {
                    ArrayList arrayList2 = new ArrayList(listM36663g);
                    arrayList2.addAll(l7dVarM51042y2.m36663g());
                    Collections.sort(arrayList2);
                    listM36663g = arrayList2;
                }
                listM36661e = arrayList;
            }
        }
        if (((Integer) listM36661e.get(0)).intValue() == -1) {
            return EnumC17306d.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (listM36663g.contains(Integer.valueOf(length))) {
            return EnumC17306d.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) listM36661e.get(0)).intValue();
        return iIntValue == length ? EnumC17306d.IS_POSSIBLE : iIntValue > length ? EnumC17306d.TOO_SHORT : ((Integer) listM36661e.get(listM36661e.size() - 1)).intValue() < length ? EnumC17306d.TOO_LONG : listM36661e.subList(1, listM36661e.size()).contains(Integer.valueOf(length)) ? EnumC17306d.IS_POSSIBLE : EnumC17306d.INVALID_LENGTH;
    }

    /* renamed from: b */
    public final boolean m51026b(CharSequence charSequence, String str) {
        if (m51013H(str)) {
            return true;
        }
        return (charSequence == null || charSequence.length() == 0 || !f48411r.matcher(charSequence).lookingAt()) ? false : true;
    }

    /* renamed from: c */
    public f7d m51027c(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f7d f7dVar = (f7d) it.next();
            int iM26251h = f7dVar.m26251h();
            if (iM26251h == 0 || this.f48424e.m43607a(f7dVar.m26246c(iM26251h - 1)).matcher(str).lookingAt()) {
                if (this.f48424e.m43607a(f7dVar.m26249f()).matcher(str).matches()) {
                    return f7dVar;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public int m51028i(StringBuilder sb, StringBuilder sb2) throws NumberFormatException {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i = 1; i <= 3 && i <= length; i++) {
                int i2 = Integer.parseInt(sb.substring(0, i));
                if (this.f48421b.containsKey(Integer.valueOf(i2))) {
                    sb2.append(sb.substring(i));
                    return i2;
                }
            }
        }
        return 0;
    }

    /* renamed from: k */
    public String m51029k(o7d o7dVar, EnumC17304b enumC17304b) {
        if (o7dVar.m41695f() == 0 && o7dVar.m41704p()) {
            String strM41698i = o7dVar.m41698i();
            if (strM41698i.length() > 0) {
                return strM41698i;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        m51030l(o7dVar, enumC17304b, sb);
        return sb.toString();
    }

    /* renamed from: l */
    public void m51030l(o7d o7dVar, EnumC17304b enumC17304b, StringBuilder sb) {
        sb.setLength(0);
        int iM41692c = o7dVar.m41692c();
        String strM51041x = m51041x(o7dVar);
        EnumC17304b enumC17304b2 = EnumC17304b.E164;
        if (enumC17304b == enumC17304b2) {
            sb.append(strM51041x);
            m51023X(iM41692c, enumC17304b2, sb);
        } else {
            if (!m51009D(iM41692c)) {
                sb.append(strM51041x);
                return;
            }
            h7d h7dVarM51040w = m51040w(iM41692c, m51006A(iM41692c));
            sb.append(m51031m(strM51041x, h7dVarM51040w, enumC17304b));
            m51014J(o7dVar, h7dVarM51040w, enumC17304b, sb);
            m51023X(iM41692c, enumC17304b, sb);
        }
    }

    /* renamed from: m */
    public final String m51031m(String str, h7d h7dVar, EnumC17304b enumC17304b) {
        return m51032n(str, h7dVar, enumC17304b, null);
    }

    /* renamed from: n */
    public final String m51032n(String str, h7d h7dVar, EnumC17304b enumC17304b, CharSequence charSequence) {
        f7d f7dVarM51027c = m51027c((h7dVar.m29945z().size() == 0 || enumC17304b == EnumC17304b.NATIONAL) ? h7dVar.m29901B() : h7dVar.m29945z(), str);
        return f7dVarM51027c == null ? str : m51033o(str, f7dVarM51027c, enumC17304b, charSequence);
    }

    /* renamed from: o */
    public final String m51033o(String str, f7d f7dVar, EnumC17304b enumC17304b, CharSequence charSequence) {
        String strReplaceAll;
        String strM26245b = f7dVar.m26245b();
        Matcher matcher = this.f48424e.m43607a(f7dVar.m26249f()).matcher(str);
        EnumC17304b enumC17304b2 = EnumC17304b.NATIONAL;
        if (enumC17304b != enumC17304b2 || charSequence == null || charSequence.length() <= 0 || f7dVar.m26244a().length() <= 0) {
            String strM26247d = f7dVar.m26247d();
            strReplaceAll = (enumC17304b != enumC17304b2 || strM26247d == null || strM26247d.length() <= 0) ? matcher.replaceAll(strM26245b) : matcher.replaceAll(f48399E.matcher(strM26245b).replaceFirst(strM26247d));
        } else {
            strReplaceAll = matcher.replaceAll(f48399E.matcher(strM26245b).replaceFirst(f7dVar.m26244a().replace("$CC", charSequence)));
        }
        if (enumC17304b != EnumC17304b.RFC3966) {
            return strReplaceAll;
        }
        Matcher matcher2 = f48412s.matcher(strReplaceAll);
        if (matcher2.lookingAt()) {
            strReplaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(strReplaceAll).replaceAll("-");
    }

    /* renamed from: q */
    public jp0 m51034q(String str) {
        return new jp0(this, str);
    }

    /* renamed from: r */
    public int m51035r(String str) {
        if (m51013H(str)) {
            return m51036s(str);
        }
        Logger logger = f48401h;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        logger.log(level, sb.toString());
        return 0;
    }

    /* renamed from: s */
    public final int m51036s(String str) {
        h7d h7dVarM51039v = m51039v(str);
        if (h7dVarM51039v != null) {
            return h7dVarM51039v.m29923a();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    /* renamed from: t */
    public o7d m51037t(String str, EnumC17305c enumC17305c) {
        if (m51013H(str)) {
            l7d l7dVarM51042y = m51042y(m51039v(str), enumC17305c);
            try {
                if (l7dVarM51042y.m36664h()) {
                    return m51019T(l7dVarM51042y.m36657a(), str);
                }
            } catch (i5c e) {
                f48401h.log(Level.SEVERE, e.toString());
            }
            return null;
        }
        f48401h.log(Level.WARNING, "Invalid or unknown region code provided: " + str);
        return null;
    }

    /* renamed from: u */
    public h7d m51038u(int i) {
        if (this.f48421b.containsKey(Integer.valueOf(i))) {
            return this.f48420a.mo53071b(i);
        }
        return null;
    }

    /* renamed from: v */
    public h7d m51039v(String str) {
        if (m51013H(str)) {
            return this.f48420a.mo53070a(str);
        }
        return null;
    }

    /* renamed from: w */
    public final h7d m51040w(int i, String str) {
        return "001".equals(str) ? m51038u(i) : m51039v(str);
    }

    /* renamed from: x */
    public String m51041x(o7d o7dVar) {
        StringBuilder sb = new StringBuilder();
        if (o7dVar.m41705q() && o7dVar.m41696g() > 0) {
            char[] cArr = new char[o7dVar.m41696g()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(o7dVar.m41695f());
        return sb.toString();
    }

    /* renamed from: y */
    public l7d m51042y(h7d h7dVar, EnumC17305c enumC17305c) {
        switch (C17303a.f48429c[enumC17305c.ordinal()]) {
            case 1:
                return h7dVar.m29934l();
            case 2:
                return h7dVar.m29937p();
            case 3:
                return h7dVar.m29928f();
            case 4:
            case 5:
                return h7dVar.m29924b();
            case 6:
                return h7dVar.m29936o();
            case 7:
                return h7dVar.m29940s();
            case 8:
                return h7dVar.m29932j();
            case 9:
                return h7dVar.m29931i();
            case 10:
                return h7dVar.m29938q();
            case 11:
                return h7dVar.m29939r();
            default:
                return h7dVar.m29925c();
        }
    }

    /* renamed from: z */
    public final EnumC17305c m51043z(String str, h7d h7dVar) {
        return !m51010E(str, h7dVar.m29925c()) ? EnumC17305c.UNKNOWN : m51010E(str, h7dVar.m29934l()) ? EnumC17305c.PREMIUM_RATE : m51010E(str, h7dVar.m29937p()) ? EnumC17305c.TOLL_FREE : m51010E(str, h7dVar.m29936o()) ? EnumC17305c.SHARED_COST : m51010E(str, h7dVar.m29940s()) ? EnumC17305c.VOIP : m51010E(str, h7dVar.m29932j()) ? EnumC17305c.PERSONAL_NUMBER : m51010E(str, h7dVar.m29931i()) ? EnumC17305c.PAGER : m51010E(str, h7dVar.m29938q()) ? EnumC17305c.UAN : m51010E(str, h7dVar.m29939r()) ? EnumC17305c.VOICEMAIL : m51010E(str, h7dVar.m29924b()) ? h7dVar.m29935m() ? EnumC17305c.FIXED_LINE_OR_MOBILE : m51010E(str, h7dVar.m29928f()) ? EnumC17305c.FIXED_LINE_OR_MOBILE : EnumC17305c.FIXED_LINE : (h7dVar.m29935m() || !m51010E(str, h7dVar.m29928f())) ? EnumC17305c.UNKNOWN : EnumC17305c.MOBILE;
    }
}
