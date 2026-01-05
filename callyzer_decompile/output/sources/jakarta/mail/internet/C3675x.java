package jakarta.mail.internet;

import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.PropUtil;
import ee.C2039g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.x */
/* loaded from: classes3.dex */
public final class C3675x {

    /* renamed from: e */
    public static final boolean f19391e = PropUtil.getBooleanSystemProperty("mail.mime.encodeparameters", true);

    /* renamed from: f */
    public static final boolean f19392f = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters", true);

    /* renamed from: g */
    public static final boolean f19393g = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters.strict", false);

    /* renamed from: h */
    public static final boolean f19394h = PropUtil.getBooleanSystemProperty("mail.mime.applefilenames", false);

    /* renamed from: i */
    public static final boolean f19395i = PropUtil.getBooleanSystemProperty("mail.mime.windowsfilenames", false);

    /* renamed from: j */
    public static final boolean f19396j = PropUtil.getBooleanSystemProperty("mail.mime.parameters.strict", true);

    /* renamed from: k */
    public static final boolean f19397k = PropUtil.getBooleanSystemProperty("mail.mime.splitlongparameters", true);

    /* renamed from: l */
    public static final char[] f19398l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final LinkedHashMap f19399a;

    /* renamed from: b */
    public final HashSet f19400b;

    /* renamed from: c */
    public final HashMap f19401c;

    /* renamed from: d */
    public final String f19402d;

    public C3675x() {
        this.f19399a = new LinkedHashMap();
        this.f19402d = null;
        if (f19392f) {
            this.f19400b = new HashSet();
            this.f19401c = new HashMap();
        }
    }

    /* renamed from: b */
    public static String m8257b(String str, String str2) throws ParseException {
        boolean z6 = f19393g;
        byte[] bArr = new byte[str.length()];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                try {
                    cCharAt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                } catch (NumberFormatException e2) {
                    if (z6) {
                        throw new ParseException(e2.toString());
                    }
                } catch (StringIndexOutOfBoundsException e10) {
                    if (z6) {
                        throw new ParseException(e10.toString());
                    }
                }
            }
            bArr[i11] = (byte) cCharAt;
            i10++;
            i11++;
        }
        if (str2 != null) {
            str2 = AbstractC3670s.m8249m(str2);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = AbstractC3670s.m8246j();
        }
        return new String(bArr, 0, i11, str2);
    }

    /* renamed from: c */
    public static void m8258c(String str, ByteArrayOutputStream byteArrayOutputStream) throws ParseException, IOException {
        boolean z6 = f19393g;
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                try {
                    cCharAt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                } catch (NumberFormatException e2) {
                    if (z6) {
                        throw new ParseException(e2.toString());
                    }
                } catch (StringIndexOutOfBoundsException e10) {
                    if (z6) {
                        throw new ParseException(e10.toString());
                    }
                }
            }
            byteArrayOutputStream.write((byte) cCharAt);
            i10++;
        }
    }

    /* renamed from: d */
    public static C3674w m8259d(String str) throws ParseException {
        boolean z6 = f19393g;
        C3674w c3674w = new C3674w();
        c3674w.f19390c = str;
        c3674w.f19388a = str;
        try {
            int iIndexOf = str.indexOf(39);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                int iIndexOf2 = str.indexOf(39, iIndexOf + 1);
                if (iIndexOf2 >= 0) {
                    c3674w.f19388a = str.substring(iIndexOf2 + 1);
                    c3674w.f19389b = strSubstring;
                    return c3674w;
                }
                if (z6) {
                    throw new ParseException("Missing language in encoded value: ".concat(str));
                }
            } else if (z6) {
                throw new ParseException("Missing charset in encoded value: ".concat(str));
            }
        } catch (NumberFormatException e2) {
            if (z6) {
                throw new ParseException(e2.toString());
            }
        } catch (StringIndexOutOfBoundsException e10) {
            if (z6) {
                throw new ParseException(e10.toString());
            }
        }
        return c3674w;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: all -> 0x004d, UnsupportedEncodingException -> 0x0062, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:24:0x005d, B:28:0x0066, B:32:0x0072, B:33:0x0079, B:30:0x006c), top: B:83:0x005d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: all -> 0x004d, UnsupportedEncodingException -> 0x0062, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:24:0x005d, B:28:0x0066, B:32:0x0072, B:33:0x0079, B:30:0x006c), top: B:83:0x005d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x004d, UnsupportedEncodingException -> 0x0062, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:24:0x005d, B:28:0x0066, B:32:0x0072, B:33:0x0079, B:30:0x006c), top: B:83:0x005d, outer: #5 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8260a(boolean r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3675x.m8260a(boolean):void");
    }

    /* renamed from: e */
    public final String m8261e(String str) {
        Object obj = this.f19399a.get(str.trim().toLowerCase(Locale.ENGLISH));
        return obj instanceof C3673v ? ((C3673v) obj).f19387a : obj instanceof C3672u ? ((C3672u) obj).f19386a : obj instanceof C3674w ? ((C3674w) obj).f19388a : (String) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [jakarta.mail.internet.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [jakarta.mail.internet.w] */
    /* renamed from: f */
    public final void m8262f(String str, String str2) throws ParseException {
        String strM8259d;
        int iIndexOf = str.indexOf(42);
        LinkedHashMap linkedHashMap = this.f19399a;
        if (iIndexOf < 0) {
            linkedHashMap.put(str, str2);
            return;
        }
        if (iIndexOf == str.length() - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            C3674w c3674wM8259d = m8259d(str2);
            try {
                c3674wM8259d.f19388a = m8257b(c3674wM8259d.f19388a, c3674wM8259d.f19389b);
            } catch (UnsupportedEncodingException e2) {
                if (f19393g) {
                    throw new ParseException(e2.toString());
                }
            }
            linkedHashMap.put(strSubstring, c3674wM8259d);
            return;
        }
        String strSubstring2 = str.substring(0, iIndexOf);
        this.f19400b.add(strSubstring2);
        linkedHashMap.put(strSubstring2, "");
        String str3 = str2;
        if (str.endsWith("*")) {
            if (str.endsWith("*0*")) {
                strM8259d = m8259d(str2);
            } else {
                ?? c3674w = new C3674w();
                c3674w.f19390c = str2;
                c3674w.f19388a = str2;
                strM8259d = c3674w;
            }
            str = str.substring(0, str.length() - 1);
            str3 = strM8259d;
        }
        this.f19401c.put(str, str3);
    }

    /* renamed from: g */
    public final void m8263g(String str, String str2) {
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        boolean z6 = f19392f;
        LinkedHashMap linkedHashMap = this.f19399a;
        if (!z6) {
            linkedHashMap.put(lowerCase, str2);
            return;
        }
        try {
            m8262f(lowerCase, str2);
        } catch (ParseException unused) {
            linkedHashMap.put(lowerCase, str2);
        }
    }

    /* renamed from: h */
    public final void m8264h(String str, String str2, String str3) {
        if (!f19391e) {
            m8263g(str, str2);
            return;
        }
        C3674w c3674w = null;
        if (AbstractC3670s.m8237a(str2) != 1) {
            try {
                byte[] bytes = str2.getBytes(AbstractC3670s.m8249m(str3));
                StringBuffer stringBuffer = new StringBuffer(str3.length() + bytes.length + 2);
                stringBuffer.append(str3);
                stringBuffer.append("''");
                for (byte b10 : bytes) {
                    char c2 = (char) (b10 & 255);
                    if (c2 <= ' ' || c2 >= 127 || c2 == '*' || c2 == '\'' || c2 == '%' || "()<>@,;:\\\"\t []/?=".indexOf(c2) >= 0) {
                        stringBuffer.append('%');
                        char[] cArr = f19398l;
                        stringBuffer.append(cArr[c2 >> 4]);
                        stringBuffer.append(cArr[c2 & 15]);
                    } else {
                        stringBuffer.append(c2);
                    }
                }
                c3674w = new C3674w();
                c3674w.f19389b = str3;
                c3674w.f19388a = str2;
                c3674w.f19390c = stringBuffer.toString();
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (c3674w == null) {
            m8263g(str, str2);
        } else {
            this.f19399a.put(str.trim().toLowerCase(Locale.ENGLISH), c3674w);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final String m8265i(int i10) {
        String str;
        String str2;
        C2039g c2039g = new C2039g(3, (char) 0);
        c2039g.f9606c = new StringBuilder();
        c2039g.f9605b = i10;
        for (Map.Entry entry : this.f19399a.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C3673v) {
                C3673v c3673v = (C3673v) value;
                String strM4561h = AbstractC1452a.m4561h(str3, "*");
                for (int i11 = 0; i11 < c3673v.size(); i11++) {
                    E e2 = c3673v.get(i11);
                    if (e2 instanceof C3674w) {
                        str = strM4561h + i11 + "*";
                        str2 = ((C3674w) e2).f19390c;
                    } else {
                        str = strM4561h + i11;
                        str2 = (String) e2;
                    }
                    c2039g.m5756d(str, AbstractC3670s.m8255s(str2, "()<>@,;:\\\"\t []/?="));
                }
            } else if (value instanceof C3672u) {
                c2039g.m5756d(str3, AbstractC3670s.m8255s(((C3672u) value).f19386a, "()<>@,;:\\\"\t []/?="));
            } else if (value instanceof C3674w) {
                c2039g.m5756d(AbstractC1452a.m4561h(str3, "*"), AbstractC3670s.m8255s(((C3674w) value).f19390c, "()<>@,;:\\\"\t []/?="));
            } else {
                String strSubstring = (String) value;
                if (strSubstring.length() > 60 && f19397k && f19391e) {
                    String strM4561h2 = AbstractC1452a.m4561h(str3, "*");
                    int i12 = 0;
                    while (strSubstring.length() > 60) {
                        c2039g.m5756d(strM4561h2 + i12, AbstractC3670s.m8255s(strSubstring.substring(0, 60), "()<>@,;:\\\"\t []/?="));
                        strSubstring = strSubstring.substring(60);
                        i12++;
                    }
                    if (strSubstring.length() > 0) {
                        c2039g.m5756d(strM4561h2 + i12, AbstractC3670s.m8255s(strSubstring, "()<>@,;:\\\"\t []/?="));
                    }
                } else {
                    c2039g.m5756d(str3, AbstractC3670s.m8255s(strSubstring, "()<>@,;:\\\"\t []/?="));
                }
            }
        }
        return ((StringBuilder) c2039g.f9606c).toString();
    }

    public final String toString() {
        return m8265i(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r4 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        m8260a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3675x(java.lang.String r15) throws jakarta.mail.internet.ParseException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3675x.<init>(java.lang.String):void");
    }
}
