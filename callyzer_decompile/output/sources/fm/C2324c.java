package fm;

import com.sun.activation.registries.MailcapParseException;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fm.c */
/* loaded from: classes.dex */
public final class C2324c {

    /* renamed from: d */
    public static final boolean f10544d;

    /* renamed from: a */
    public final HashMap f10545a = new HashMap();

    /* renamed from: b */
    public final HashMap f10546b = new HashMap();

    /* renamed from: c */
    public final HashMap f10547c = new HashMap();

    static {
        try {
            f10544d = Boolean.getBoolean("jakarta.activation.addreverse") || Boolean.getBoolean("javax.activation.addreverse");
        } catch (Throwable unused) {
        }
    }

    public C2324c(String str) throws Throwable {
        if (AbstractC2323b.m6004a()) {
            AbstractC2323b.m6005b("new MailcapFile: file " + str);
        }
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(str);
            try {
                m6012d(new BufferedReader(fileReader2));
                try {
                    fileReader2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileReader = fileReader2;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: c */
    public static HashMap m6007c(Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        for (String str : map2.keySet()) {
            List list = (List) map3.get(str);
            if (list == null) {
                map3.put(str, map2.get(str));
            } else {
                List list2 = (List) map2.get(str);
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                map3.put(str, arrayList);
            }
        }
        return map3;
    }

    /* renamed from: f */
    public static void m6008f(int i10, int i11, String str) throws MailcapParseException {
        throw new MailcapParseException("Encountered a " + C2325d.m6015b(i11) + " token (" + str + ") while expecting a " + C2325d.m6015b(i10) + " token.");
    }

    /* renamed from: g */
    public static void m6009g(int i10, int i11, String str) throws MailcapParseException {
        throw new MailcapParseException("Encountered a " + C2325d.m6015b(i11) + " token (" + str + ") while expecting a " + C2325d.m6015b(i10) + " or a " + C2325d.m6015b(59) + " token.");
    }

    /* renamed from: a */
    public final Map m6010a(String str) {
        HashMap map = this.f10546b;
        Map map2 = (Map) map.get(str);
        int iIndexOf = str.indexOf(47) + 1;
        if (!str.substring(iIndexOf).equals("*")) {
            Map map3 = (Map) map.get(str.substring(0, iIndexOf) + "*");
            if (map3 != null) {
                return map2 != null ? m6007c(map2, map3) : map3;
            }
        }
        return map2;
    }

    /* renamed from: b */
    public final Map m6011b(String str) {
        HashMap map = this.f10545a;
        Map map2 = (Map) map.get(str);
        int iIndexOf = str.indexOf(47) + 1;
        if (!str.substring(iIndexOf).equals("*")) {
            Map map3 = (Map) map.get(str.substring(0, iIndexOf) + "*");
            if (map3 != null) {
                return map2 != null ? m6007c(map2, map3) : map3;
            }
        }
        return map2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        m6013e(r1 + r2);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6012d(java.io.BufferedReader r7) throws java.io.IOException {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r7)
            r7 = 0
        L6:
            r1 = r7
        L7:
            java.lang.String r2 = r0.readLine()
            if (r2 == 0) goto L69
            java.lang.String r2 = r2.trim()
            r3 = 0
            char r4 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L7
            r5 = 35
            if (r4 != r5) goto L1b
            goto L7
        L1b:
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L7
            int r4 = r4 + (-1)
            char r4 = r2.charAt(r4)     // Catch: java.lang.Throwable -> L7
            r5 = 92
            if (r4 != r5) goto L50
            if (r1 == 0) goto L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7
            r4.<init>()     // Catch: java.lang.Throwable -> L7
            r4.append(r1)     // Catch: java.lang.Throwable -> L7
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L7
            int r5 = r5 + (-1)
            java.lang.String r2 = r2.substring(r3, r5)     // Catch: java.lang.Throwable -> L7
            r4.append(r2)     // Catch: java.lang.Throwable -> L7
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7
            goto L7
        L45:
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L7
            int r4 = r4 + (-1)
            java.lang.String r1 = r2.substring(r3, r4)     // Catch: java.lang.Throwable -> L7
            goto L7
        L50:
            if (r1 == 0) goto L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7
            r3.<init>()     // Catch: java.lang.Throwable -> L7
            r3.append(r1)     // Catch: java.lang.Throwable -> L7
            r3.append(r2)     // Catch: java.lang.Throwable -> L7
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L7
            r6.m6013e(r1)     // Catch: com.sun.activation.registries.MailcapParseException -> L6 java.lang.Throwable -> L7
            goto L6
        L65:
            r6.m6013e(r2)     // Catch: java.lang.Throwable -> L7
            goto L7
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fm.C2324c.m6012d(java.io.BufferedReader):void");
    }

    /* renamed from: e */
    public final void m6013e(String str) throws MailcapParseException {
        String lowerCase;
        int i10 = 61;
        String strM6015b = C2325d.m6015b(61);
        String strM6015b2 = C2325d.m6015b(5);
        C2325d c2325d = new C2325d();
        c2325d.f10548a = str;
        c2325d.f10549b = 0;
        c2325d.f10550c = str.length();
        boolean z6 = true;
        c2325d.f10551d = 1;
        c2325d.f10552e = "";
        String strM6015b3 = C2325d.m6015b(59);
        c2325d.f10553f = false;
        if (AbstractC2323b.m6004a()) {
            AbstractC2323b.m6005b("parse: ".concat(str));
        }
        int iM6016c = c2325d.m6016c();
        if (iM6016c != 2) {
            m6008f(2, iM6016c, c2325d.f10552e);
            throw null;
        }
        String str2 = c2325d.f10552e;
        Locale locale = Locale.ENGLISH;
        String lowerCase2 = str2.toLowerCase(locale);
        int iM6016c2 = c2325d.m6016c();
        if (iM6016c2 != 47 && iM6016c2 != 59) {
            m6009g(47, iM6016c2, c2325d.f10552e);
            throw null;
        }
        if (iM6016c2 == 47) {
            int iM6016c3 = c2325d.m6016c();
            if (iM6016c3 != 2) {
                m6008f(2, iM6016c3, c2325d.f10552e);
                throw null;
            }
            lowerCase = c2325d.f10552e.toLowerCase(locale);
            iM6016c2 = c2325d.m6016c();
        } else {
            lowerCase = "*";
        }
        String strM7379l = m0.m7379l(lowerCase2, "/", lowerCase);
        if (AbstractC2323b.m6004a()) {
            AbstractC2323b.m6005b("  Type: " + strM7379l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iM6016c2 != 59) {
            m6008f(59, iM6016c2, c2325d.f10552e);
            throw null;
        }
        c2325d.f10553f = true;
        int iM6016c4 = c2325d.m6016c();
        c2325d.f10553f = false;
        if (iM6016c4 != 2 && iM6016c4 != 59) {
            m6009g(2, iM6016c4, c2325d.f10552e);
            throw null;
        }
        if (iM6016c4 == 2) {
            HashMap map = this.f10547c;
            List list = (List) map.get(strM7379l);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                map.put(strM7379l, arrayList);
            } else {
                list.add(str);
            }
        }
        if (iM6016c4 != 59) {
            iM6016c4 = c2325d.m6016c();
        }
        if (iM6016c4 != 59) {
            if (iM6016c4 == 5) {
                return;
            }
            m6009g(5, iM6016c4, c2325d.f10552e);
            throw null;
        }
        boolean z10 = false;
        while (true) {
            int iM6016c5 = c2325d.m6016c();
            if (iM6016c5 != 2) {
                m6008f(2, iM6016c5, c2325d.f10552e);
                throw null;
            }
            String lowerCase3 = c2325d.f10552e.toLowerCase(Locale.ENGLISH);
            int iM6016c6 = c2325d.m6016c();
            if (iM6016c6 != i10 && iM6016c6 != 59 && iM6016c6 != 5) {
                String str3 = c2325d.f10552e;
                if (AbstractC2323b.m6004a()) {
                    StringBuilder sb2 = new StringBuilder("PARSE ERROR: Encountered a ");
                    sb2.append(C2325d.m6015b(iM6016c6));
                    sb2.append(" token (");
                    sb2.append(str3);
                    sb2.append(") while expecting a ");
                    a1.m14319B(sb2, strM6015b, ", a ", strM6015b3, ", or a ");
                    sb2.append(strM6015b2);
                    sb2.append(" token.");
                    AbstractC2323b.m6005b(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("Encountered a ");
                sb3.append(C2325d.m6015b(iM6016c6));
                sb3.append(" token (");
                sb3.append(str3);
                sb3.append(") while expecting a ");
                a1.m14319B(sb3, strM6015b, ", a ", strM6015b3, ", or a ");
                throw new MailcapParseException(AbstractC1452a.m4564k(sb3, strM6015b2, " token."));
            }
            boolean z11 = f10544d;
            if (iM6016c6 == i10) {
                c2325d.f10553f = z6;
                int iM6016c7 = c2325d.m6016c();
                c2325d.f10553f = false;
                if (iM6016c7 != 2) {
                    m6008f(2, iM6016c7, c2325d.f10552e);
                    throw null;
                }
                String str4 = c2325d.f10552e;
                if (lowerCase3.startsWith("x-java-")) {
                    String strSubstring = lowerCase3.substring(7);
                    if (strSubstring.equals("fallback-entry") && str4.equalsIgnoreCase("true")) {
                        z10 = z6;
                    } else {
                        if (AbstractC2323b.m6004a()) {
                            AbstractC2323b.m6005b("    Command: " + strSubstring + ", Class: " + str4);
                        }
                        List arrayList2 = (List) linkedHashMap.get(strSubstring);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(strSubstring, arrayList2);
                        }
                        if (z11) {
                            arrayList2.add(0, str4);
                        } else {
                            arrayList2.add(str4);
                        }
                    }
                }
                iM6016c6 = c2325d.m6016c();
            }
            if (iM6016c6 != 59) {
                HashMap map2 = z10 ? this.f10546b : this.f10545a;
                Map map3 = (Map) map2.get(strM7379l);
                if (map3 == null) {
                    map2.put(strM7379l, linkedHashMap);
                    return;
                }
                if (AbstractC2323b.m6004a()) {
                    AbstractC2323b.m6005b("Merging commands for type " + strM7379l);
                }
                for (String str5 : map3.keySet()) {
                    List list2 = (List) map3.get(str5);
                    List<String> list3 = (List) linkedHashMap.get(str5);
                    if (list3 != null) {
                        for (String str6 : list3) {
                            if (!list2.contains(str6)) {
                                if (z11) {
                                    list2.add(0, str6);
                                } else {
                                    list2.add(str6);
                                }
                            }
                        }
                    }
                }
                for (String str7 : linkedHashMap.keySet()) {
                    if (!map3.containsKey(str7)) {
                        map3.put(str7, (List) linkedHashMap.get(str7));
                    }
                }
                return;
            }
            i10 = 61;
            z6 = true;
        }
    }

    public C2324c(InputStream inputStream) throws IOException {
        if (AbstractC2323b.m6004a()) {
            AbstractC2323b.m6005b("new MailcapFile: InputStream");
        }
        m6012d(new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1")));
    }
}
