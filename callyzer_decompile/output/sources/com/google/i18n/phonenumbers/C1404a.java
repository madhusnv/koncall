package com.google.i18n.phonenumbers;

import c9.C0908c;
import c9.C0910e;
import c9.C0917l;
import c9.C0919n;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.i18n.phonenumbers.NumberParseException;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.C4001v;
import l4.d0;
import l7.C4417q;
import mm.AbstractC4801l;
import og.lf;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import p020v.a1;
import sk.C6860h;
import sk.C6861i;
import sk.C6863k;
import sk.EnumC6856d;
import sk.EnumC6857e;
import sk.EnumC6862j;
import uk.C7472a;
import vk.C7715a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.i18n.phonenumbers.a */
/* loaded from: classes.dex */
public final class C1404a {

    /* renamed from: h */
    public static final Logger f7185h = Logger.getLogger(C1404a.class.getName());

    /* renamed from: i */
    public static final Map f7186i;

    /* renamed from: j */
    public static final Map f7187j;

    /* renamed from: k */
    public static final Map f7188k;

    /* renamed from: l */
    public static final Pattern f7189l;

    /* renamed from: m */
    public static final Pattern f7190m;

    /* renamed from: n */
    public static final Pattern f7191n;

    /* renamed from: o */
    public static final Pattern f7192o;

    /* renamed from: p */
    public static final Pattern f7193p;

    /* renamed from: q */
    public static final Pattern f7194q;

    /* renamed from: r */
    public static final Pattern f7195r;

    /* renamed from: s */
    public static final Pattern f7196s;

    /* renamed from: t */
    public static final Pattern f7197t;

    /* renamed from: u */
    public static final Pattern f7198u;

    /* renamed from: v */
    public static final Pattern f7199v;

    /* renamed from: w */
    public static C1404a f7200w;

    /* renamed from: a */
    public final C0917l f7201a;

    /* renamed from: b */
    public final HashMap f7202b;

    /* renamed from: c */
    public final d0 f7203c = new d0(20);

    /* renamed from: d */
    public final HashSet f7204d = new HashSet(35);

    /* renamed from: e */
    public final C4001v f7205e = new C4001v(100);

    /* renamed from: f */
    public final HashSet f7206f = new HashSet(DilithiumEngine.DilithiumPolyT1PackedBytes);

    /* renamed from: g */
    public final HashSet f7207g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
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
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        f7187j = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f7188k = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        f7186i = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch2 : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch2.charValue())), ch2);
            map6.put(ch2, ch2);
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
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map map7 = f7187j;
        sb2.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb2.toString();
        f7189l = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f7190m = Pattern.compile("(\\p{Nd})");
        f7191n = Pattern.compile("[+＋\\p{Nd}]");
        f7192o = Pattern.compile("[\\\\/] *x");
        f7193p = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f7194q = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strM11238i = AbstractC5601a.m11238i("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strM4497a = m4497a(true);
        m4497a(false);
        f7195r = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strM4561h = AbstractC1452a.m4561h(string, "\\p{Nd}");
        f7196s = Pattern.compile("^(" + a1.m14333m("[", strM4561h, "]+((\\-)*[", strM4561h, "])*") + "\\.)*" + a1.m14333m("[", string, "]+((\\-)*[", strM4561h, "])*") + "\\.?$");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(strM4497a);
        sb3.append(")$");
        f7197t = Pattern.compile(sb3.toString(), 66);
        f7198u = Pattern.compile(strM11238i + "(?:" + strM4497a + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        f7199v = Pattern.compile("\\(?\\$1\\)?");
        f7200w = null;
    }

    public C1404a(C0917l c0917l, HashMap map) {
        this.f7201a = c0917l;
        this.f7202b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f7207g.add((Integer) entry.getKey());
            } else {
                this.f7206f.addAll(list);
            }
        }
        if (this.f7206f.remove("001")) {
            f7185h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f7204d.addAll((Collection) map.get(1));
    }

    /* renamed from: a */
    public static String m4497a(boolean z6) {
        String str = ";ext=" + m4498b(20);
        String str2 = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + m4498b(20) + "#?";
        String str3 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + m4498b(9) + "#?";
        String str4 = "[- ]+" + m4498b(6) + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        String strM4564k = AbstractC1452a.m4564k(sb2, "|", str4);
        if (!z6) {
            return strM4564k;
        }
        return strM4564k + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + m4498b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + m4498b(9) + "#?");
    }

    /* renamed from: b */
    public static String m4498b(int i10) {
        return AbstractC5601a.m11232c(i10, "(\\p{Nd}{1,", "})");
    }

    /* renamed from: e */
    public static synchronized C1404a m4499e() {
        try {
            if (f7200w == null) {
                C7472a c7472a = C7472a.f36074d;
                C7715a c7715a = c7472a.f36076b;
                if (c7715a == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                C1404a c1404a = new C1404a(new C0917l(c7472a.f36077c, c7715a, c7472a.f36075a), lf.m10751a());
                synchronized (C1404a.class) {
                    f7200w = c1404a;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7200w;
    }

    /* renamed from: h */
    public static String m4500h(C6863k c6863k) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (c6863k.f32615f && (i10 = c6863k.f32617h) > 0) {
            char[] cArr = new char[i10];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(c6863k.f32611b);
        return sb2.toString();
    }

    /* renamed from: i */
    public static C6861i m4501i(C6860h c6860h, EnumC6856d enumC6856d) {
        switch (enumC6856d.ordinal()) {
            case 0:
            case 2:
                return c6860h.f32584d;
            case 1:
                return c6860h.f32586f;
            case 3:
                return c6860h.f32588h;
            case 4:
                return c6860h.f32590k;
            case 5:
                return c6860h.f32592m;
            case 6:
                return c6860h.f32596r;
            case 7:
                return c6860h.f32594p;
            case 8:
                return c6860h.f32598t;
            case 9:
                return c6860h.f32600w;
            case 10:
                return c6860h.f32563B;
            default:
                return c6860h.f32582b;
        }
    }

    /* renamed from: q */
    public static void m4502q(StringBuilder sb2) {
        if (f7194q.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), m4504s(sb2, f7188k));
        } else {
            sb2.replace(0, sb2.length(), m4503r(sb2));
        }
    }

    /* renamed from: r */
    public static String m4503r(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            int iDigit = Character.digit(charSequence.charAt(i10), 10);
            if (iDigit != -1) {
                sb2.append(iDigit);
            }
        }
        return sb2.toString();
    }

    /* renamed from: s */
    public static String m4504s(CharSequence charSequence, Map map) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Character ch2 = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i10))));
            if (ch2 != null) {
                sb2.append(ch2);
            }
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public static EnumC6857e m4505u(StringBuilder sb2, C6860h c6860h, EnumC6856d enumC6856d) {
        C6861i c6861iM4501i = m4501i(c6860h, enumC6856d);
        ArrayList arrayList = c6861iM4501i.f32606c.isEmpty() ? c6860h.f32582b.f32606c : c6861iM4501i.f32606c;
        ArrayList arrayList2 = c6861iM4501i.f32607d;
        if (enumC6856d == EnumC6856d.FIXED_LINE_OR_MOBILE) {
            C6861i c6861iM4501i2 = m4501i(c6860h, EnumC6856d.FIXED_LINE);
            if (c6861iM4501i2.f32606c.size() == 1 && ((Integer) c6861iM4501i2.f32606c.get(0)).intValue() == -1) {
                return m4505u(sb2, c6860h, EnumC6856d.MOBILE);
            }
            C6861i c6861iM4501i3 = m4501i(c6860h, EnumC6856d.MOBILE);
            ArrayList arrayList3 = c6861iM4501i3.f32606c;
            ArrayList arrayList4 = c6861iM4501i3.f32606c;
            boolean z6 = (arrayList3.size() == 1 && ((Integer) arrayList4.get(0)).intValue() == -1) ? false : true;
            ArrayList arrayList5 = c6861iM4501i3.f32607d;
            if (z6) {
                ArrayList arrayList6 = new ArrayList(arrayList);
                if (arrayList4.size() == 0) {
                    arrayList4 = c6860h.f32582b.f32606c;
                }
                arrayList6.addAll(arrayList4);
                Collections.sort(arrayList6);
                if (arrayList2.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    arrayList7.addAll(arrayList5);
                    Collections.sort(arrayList7);
                    arrayList2 = arrayList7;
                }
                arrayList = arrayList6;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return EnumC6857e.INVALID_LENGTH;
        }
        int length = sb2.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return EnumC6857e.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        return iIntValue == length ? EnumC6857e.IS_POSSIBLE : iIntValue > length ? EnumC6857e.TOO_SHORT : ((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length ? EnumC6857e.TOO_LONG : arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? EnumC6857e.IS_POSSIBLE : EnumC6857e.INVALID_LENGTH;
    }

    /* renamed from: c */
    public final int m4506c(StringBuilder sb2, StringBuilder sb3) throws NumberFormatException {
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            for (int i10 = 1; i10 <= 3 && i10 <= length; i10++) {
                int i11 = Integer.parseInt(sb2.substring(0, i10));
                if (this.f7202b.containsKey(Integer.valueOf(i11))) {
                    sb3.append(sb2.substring(i10));
                    return i11;
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int m4507d(String str) {
        if (str != null && this.f7206f.contains(str)) {
            C6860h c6860hM4509g = m4509g(str);
            if (c6860hM4509g != null) {
                return c6860hM4509g.f32575O;
            }
            throw new IllegalArgumentException(m0.m7378k("Invalid region code: ", str));
        }
        Level level = Level.WARNING;
        StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb2.append(str);
        sb2.append(") provided.");
        f7185h.log(level, sb2.toString());
        return 0;
    }

    /* renamed from: f */
    public final C6860h m4508f(int i10) {
        if (!this.f7207g.contains(Integer.valueOf(i10))) {
            return null;
        }
        C0917l c0917l = this.f7201a;
        c0917l.getClass();
        List list = (List) lf.m10751a().get(Integer.valueOf(i10));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i10 + " calling code belongs to a geo entity");
        }
        C6860h c6860h = (C6860h) ((ConcurrentHashMap) ((C0910e) ((C0908c) ((C0919n) c0917l.f5595c).m2658d(((C4417q) c0917l.f5594b).m9234a(Integer.valueOf(i10)))).f5574b).f5579b).get(Integer.valueOf(i10));
        String strM9730d = AbstractC4801l.m9730d(i10, "Missing metadata for country code ");
        if (c6860h != null) {
            return c6860h;
        }
        throw new MissingMetadataException(strM9730d);
    }

    /* renamed from: g */
    public final C6860h m4509g(String str) {
        if (str == null || !this.f7206f.contains(str)) {
            return null;
        }
        C0917l c0917l = this.f7201a;
        c0917l.getClass();
        if (str.equals("001")) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        C6860h c6860h = (C6860h) ((ConcurrentHashMap) ((C0910e) ((C0908c) ((C0919n) c0917l.f5595c).m2658d(((C4417q) c0917l.f5594b).m9234a(str))).f5575c).f5579b).get(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (c6860h != null) {
            return c6860h;
        }
        throw new MissingMetadataException(strConcat);
    }

    /* renamed from: j */
    public final EnumC6856d m4510j(String str, C6860h c6860h) {
        return !m4513m(str, c6860h.f32582b) ? EnumC6856d.UNKNOWN : m4513m(str, c6860h.f32590k) ? EnumC6856d.PREMIUM_RATE : m4513m(str, c6860h.f32588h) ? EnumC6856d.TOLL_FREE : m4513m(str, c6860h.f32592m) ? EnumC6856d.SHARED_COST : m4513m(str, c6860h.f32596r) ? EnumC6856d.VOIP : m4513m(str, c6860h.f32594p) ? EnumC6856d.PERSONAL_NUMBER : m4513m(str, c6860h.f32598t) ? EnumC6856d.PAGER : m4513m(str, c6860h.f32600w) ? EnumC6856d.UAN : m4513m(str, c6860h.f32563B) ? EnumC6856d.VOICEMAIL : m4513m(str, c6860h.f32584d) ? c6860h.f44789b1 ? EnumC6856d.FIXED_LINE_OR_MOBILE : m4513m(str, c6860h.f32586f) ? EnumC6856d.FIXED_LINE_OR_MOBILE : EnumC6856d.FIXED_LINE : (c6860h.f44789b1 || !m4513m(str, c6860h.f32586f)) ? EnumC6856d.UNKNOWN : EnumC6856d.MOBILE;
    }

    /* renamed from: k */
    public final String m4511k(int i10) {
        List list = (List) this.f7202b.get(Integer.valueOf(i10));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    /* renamed from: l */
    public final String m4512l(C6863k c6863k) {
        int i10 = c6863k.f32610a;
        List<String> list = (List) this.f7202b.get(Integer.valueOf(i10));
        if (list == null) {
            f7185h.log(Level.INFO, "Missing/invalid country_code (" + i10 + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        String strM4500h = m4500h(c6863k);
        for (String str : list) {
            C6860h c6860hM4509g = m4509g(str);
            if (c6860hM4509g.f44793f1) {
                if (this.f7205e.m8777r(c6860hM4509g.f44794g1).matcher(strM4500h).lookingAt()) {
                    return str;
                }
            } else if (m4510j(strM4500h, c6860hM4509g) != EnumC6856d.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: m */
    public final boolean m4513m(String str, C6861i c6861i) {
        int length = str.length();
        ArrayList arrayList = c6861i.f32606c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.f7203c.m9087t(str, c6861i);
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m4514n(C6863k c6863k) {
        String strM4512l = m4512l(c6863k);
        int i10 = c6863k.f32610a;
        C6860h c6860hM4508f = "001".equals(strM4512l) ? m4508f(i10) : m4509g(strM4512l);
        if (c6860hM4508f == null) {
            return false;
        }
        if (!"001".equals(strM4512l)) {
            C6860h c6860hM4509g = m4509g(strM4512l);
            if (c6860hM4509g == null) {
                throw new IllegalArgumentException(m0.m7378k("Invalid region code: ", strM4512l));
            }
            if (i10 != c6860hM4509g.f32575O) {
                return false;
            }
        }
        return m4510j(m4500h(c6863k), c6860hM4508f) != EnumC6856d.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4515o(java.lang.CharSequence r7, sk.C6860h r8, java.lang.StringBuilder r9, sk.C6863k r10) throws com.google.i18n.phonenumbers.NumberParseException, java.lang.NumberFormatException {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            if (r8 == 0) goto L12
            java.lang.String r7 = r8.f32576T
            goto L14
        L12:
            java.lang.String r7 = "NonMatch"
        L14:
            int r2 = r0.length()
            if (r2 != 0) goto L1d
            sk.j r7 = sk.EnumC6862j.FROM_DEFAULT_COUNTRY
            goto L77
        L1d:
            java.util.regex.Pattern r2 = com.google.i18n.phonenumbers.C1404a.f7189l
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r3 = r2.lookingAt()
            if (r3 == 0) goto L36
            int r7 = r2.end()
            r0.delete(r1, r7)
            m4502q(r0)
            sk.j r7 = sk.EnumC6862j.FROM_NUMBER_WITH_PLUS_SIGN
            goto L77
        L36:
            k4.v r2 = r6.f7205e
            java.util.regex.Pattern r7 = r2.m8777r(r7)
            m4502q(r0)
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r2 = r7.lookingAt()
            if (r2 == 0) goto L75
            int r7 = r7.end()
            java.util.regex.Pattern r2 = com.google.i18n.phonenumbers.C1404a.f7190m
            java.lang.String r3 = r0.substring(r7)
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.find()
            if (r3 == 0) goto L6f
            r3 = 1
            java.lang.String r2 = r2.group(r3)
            java.lang.String r2 = m4503r(r2)
            java.lang.String r3 = "0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6f
            goto L75
        L6f:
            r0.delete(r1, r7)
            sk.j r7 = sk.EnumC6862j.FROM_NUMBER_WITH_IDD
            goto L77
        L75:
            sk.j r7 = sk.EnumC6862j.FROM_DEFAULT_COUNTRY
        L77:
            sk.j r2 = sk.EnumC6862j.FROM_DEFAULT_COUNTRY
            if (r7 == r2) goto L9f
            int r7 = r0.length()
            r8 = 2
            if (r7 <= r8) goto L95
            int r7 = r6.m4506c(r0, r9)
            if (r7 == 0) goto L8b
            r10.f32610a = r7
            return r7
        L8b:
            com.google.i18n.phonenumbers.NumberParseException r7 = new com.google.i18n.phonenumbers.NumberParseException
            com.google.i18n.phonenumbers.NumberParseException$a r8 = com.google.i18n.phonenumbers.NumberParseException.EnumC1403a.INVALID_COUNTRY_CODE
            java.lang.String r9 = "Country calling code supplied was not recognised."
            r7.<init>(r8, r9)
            throw r7
        L95:
            com.google.i18n.phonenumbers.NumberParseException r7 = new com.google.i18n.phonenumbers.NumberParseException
            com.google.i18n.phonenumbers.NumberParseException$a r8 = com.google.i18n.phonenumbers.NumberParseException.EnumC1403a.TOO_SHORT_AFTER_IDD
            java.lang.String r9 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            r7.<init>(r8, r9)
            throw r7
        L9f:
            if (r8 == 0) goto Le2
            int r7 = r8.f32575O
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = r0.toString()
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto Le2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2.length()
            java.lang.String r2 = r3.substring(r2)
            r4.<init>(r2)
            sk.i r2 = r8.f32582b
            r3 = 0
            r6.m4516p(r4, r8, r3)
            l4.d0 r3 = r6.f7203c
            boolean r5 = r3.m9087t(r0, r2)
            if (r5 != 0) goto Ld2
            boolean r2 = r3.m9087t(r4, r2)
            if (r2 != 0) goto Ldc
        Ld2:
            sk.d r2 = sk.EnumC6856d.UNKNOWN
            sk.e r8 = m4505u(r0, r8, r2)
            sk.e r0 = sk.EnumC6857e.TOO_LONG
            if (r8 != r0) goto Le2
        Ldc:
            r9.append(r4)
            r10.f32610a = r7
            return r7
        Le2:
            r10.f32610a = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.C1404a.m4515o(java.lang.CharSequence, sk.h, java.lang.StringBuilder, sk.k):int");
    }

    /* renamed from: p */
    public final void m4516p(StringBuilder sb2, C6860h c6860h, StringBuilder sb3) {
        int length = sb2.length();
        String str = c6860h.Y0;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.f7205e.m8777r(str).matcher(sb2);
        if (matcher.lookingAt()) {
            C6861i c6861i = c6860h.f32582b;
            d0 d0Var = this.f7203c;
            boolean zM9087t = d0Var.m9087t(sb2, c6861i);
            int iGroupCount = matcher.groupCount();
            String str2 = c6860h.f44788a1;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zM9087t || d0Var.m9087t(sb2.substring(matcher.end()), c6861i)) {
                    if (sb3 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder(sb2);
            sb4.replace(0, length, matcher.replaceFirst(str2));
            if (!zM9087t || d0Var.m9087t(sb4.toString(), c6861i)) {
                if (sb3 != null && iGroupCount > 1) {
                    sb3.append(matcher.group(1));
                }
                sb2.replace(0, sb2.length(), sb4.toString());
            }
        }
    }

    /* renamed from: t */
    public final C6863k m4517t(CharSequence charSequence, String str) throws NumberParseException, NumberFormatException {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iM4515o;
        C6863k c6863k = new C6863k();
        c6863k.f32610a = 0;
        c6863k.f32611b = 0L;
        String strGroup = "";
        c6863k.f32613d = "";
        c6863k.f32615f = false;
        c6863k.f32617h = 1;
        c6863k.f32618j = "";
        c6863k.f32620l = "";
        c6863k.f32619k = EnumC6862j.UNSPECIFIED;
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.EnumC1403a.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(NumberParseException.EnumC1403a.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i10 = iIndexOf + 15;
            if (i10 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i10);
                strSubstring = iIndexOf2 != -1 ? string.substring(i10, iIndexOf2) : string.substring(i10);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(f7195r.matcher(strSubstring).matches() || f7196s.matcher(strSubstring).matches()))) {
            throw new NumberParseException(NumberParseException.EnumC1403a.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb2.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb2.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = f7191n.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = f7193p.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = f7192o.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb2.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb2.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb2.delete(iIndexOf4, sb2.length());
        }
        int length = sb2.length();
        Pattern pattern = f7198u;
        if (!(length < 2 ? false : pattern.matcher(sb2).matches())) {
            throw new NumberParseException(NumberParseException.EnumC1403a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        boolean z6 = str != null && this.f7206f.contains(str);
        Pattern pattern2 = f7189l;
        if (!z6 && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
            throw new NumberParseException(NumberParseException.EnumC1403a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        Matcher matcher4 = f7197t.matcher(sb2);
        if (matcher4.find()) {
            String strSubstring2 = sb2.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i11 = 1;
                while (true) {
                    if (i11 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i11) != null) {
                        strGroup = matcher4.group(i11);
                        sb2.delete(matcher4.start(), sb2.length());
                        break;
                    }
                    i11++;
                }
            }
        }
        if (strGroup.length() > 0) {
            c6863k.f32612c = true;
            c6863k.f32613d = strGroup;
        }
        C6860h c6860hM4509g = m4509g(str);
        StringBuilder sb3 = new StringBuilder();
        try {
            iM4515o = m4515o(sb2, c6860hM4509g, sb3, c6863k);
        } catch (NumberParseException e2) {
            Matcher matcher5 = pattern2.matcher(sb2);
            NumberParseException.EnumC1403a enumC1403a = NumberParseException.EnumC1403a.INVALID_COUNTRY_CODE;
            NumberParseException.EnumC1403a enumC1403a2 = e2.f7183a;
            if (enumC1403a2 != enumC1403a || !matcher5.lookingAt()) {
                throw new NumberParseException(enumC1403a2, e2.getMessage());
            }
            iM4515o = m4515o(sb2.substring(matcher5.end()), c6860hM4509g, sb3, c6863k);
            if (iM4515o == 0) {
                throw new NumberParseException(NumberParseException.EnumC1403a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iM4515o != 0) {
            String strM4511k = m4511k(iM4515o);
            if (!strM4511k.equals(str)) {
                c6860hM4509g = "001".equals(strM4511k) ? m4508f(iM4515o) : m4509g(strM4511k);
            }
        } else {
            m4502q(sb2);
            sb3.append((CharSequence) sb2);
            if (str != null) {
                c6863k.f32610a = c6860hM4509g.f32575O;
            }
        }
        if (sb3.length() < 2) {
            throw new NumberParseException(NumberParseException.EnumC1403a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (c6860hM4509g != null) {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder(sb3);
            m4516p(sb5, c6860hM4509g, sb4);
            EnumC6857e enumC6857eM4505u = m4505u(sb5, c6860hM4509g, EnumC6856d.UNKNOWN);
            if (enumC6857eM4505u != EnumC6857e.TOO_SHORT && enumC6857eM4505u != EnumC6857e.IS_POSSIBLE_LOCAL_ONLY && enumC6857eM4505u != EnumC6857e.INVALID_LENGTH) {
                sb3 = sb5;
            }
        }
        int length2 = sb3.length();
        if (length2 < 2) {
            throw new NumberParseException(NumberParseException.EnumC1403a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(NumberParseException.EnumC1403a.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb3.length() > 1 && sb3.charAt(0) == '0') {
            c6863k.f32614e = true;
            c6863k.f32615f = true;
            int i12 = 1;
            while (i12 < sb3.length() - 1 && sb3.charAt(i12) == '0') {
                i12++;
            }
            if (i12 != 1) {
                c6863k.f32616g = true;
                c6863k.f32617h = i12;
            }
        }
        c6863k.f32611b = Long.parseLong(sb3.toString());
        return c6863k;
    }
}
