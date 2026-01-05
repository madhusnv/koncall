package jakarta.mail.internet;

import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.PropUtil;
import jakarta.mail.AbstractC3633a;
import jakarta.mail.c0;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.d */
/* loaded from: classes3.dex */
public class C3655d extends AbstractC3633a implements Cloneable {
    private static final long serialVersionUID = -7507595530758302903L;
    private static final String specialsNoDot = "()<>,;:\\\"[]@";
    private static final String specialsNoDotNoAt = "()<>,;:\\\"[]";
    protected String address;
    protected String encodedPersonal;
    protected String personal;
    private static final boolean ignoreBogusGroupName = PropUtil.getBooleanSystemProperty("mail.mime.address.ignorebogusgroupname", true);
    private static final boolean useCanonicalHostName = PropUtil.getBooleanSystemProperty("mail.mime.address.usecanonicalhostname", true);
    private static final boolean allowUtf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static final String rfc822phrase = "()<>@,;:\\\"\t .[]".replace(' ', (char) 0).replace('\t', (char) 0);

    public C3655d(String str) throws AddressException {
        C3655d[] c3655dArr = parse(str, true);
        if (c3655dArr.length != 1) {
            throw new AddressException("Illegal address", str);
        }
        C3655d c3655d = c3655dArr[0];
        this.address = c3655d.address;
        this.personal = c3655d.personal;
        this.encodedPersonal = c3655d.encodedPersonal;
    }

    public static C3655d _getLocalAddress(c0 c0Var) throws UnknownHostException {
        String property;
        String property2;
        String strM8208b;
        if (c0Var == null) {
            property2 = System.getProperty("user.name");
            strM8208b = m8208b();
            property = null;
        } else {
            Properties properties = c0Var.f19287a;
            property = properties.getProperty("mail.from");
            if (property == null) {
                String property3 = properties.getProperty("mail.user");
                if (property3 == null || property3.length() == 0) {
                    property3 = properties.getProperty("user.name");
                }
                String property4 = (property3 == null || property3.length() == 0) ? System.getProperty("user.name") : property3;
                String property5 = properties.getProperty("mail.host");
                if (property5 == null || property5.length() == 0) {
                    property5 = m8208b();
                }
                String str = property4;
                strM8208b = property5;
                property2 = str;
            } else {
                property2 = null;
                strM8208b = null;
            }
        }
        if (property == null && property2 != null && property2.length() != 0 && strM8208b != null && strM8208b.length() != 0) {
            property = AbstractC3670s.m8255s(property2.trim(), "()<>,;:\\\"[]@\t ") + "@" + strM8208b;
        }
        if (property == null) {
            return null;
        }
        return new C3655d(property);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0124, code lost:
    
        if (r9 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0126, code lost:
    
        if (r6 == '@') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0128, code lost:
    
        if (r18 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0133, code lost:
    
        throw new jakarta.mail.internet.AddressException("Missing final '@domain'", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0134, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0135, code lost:
    
        if (r8 >= r1) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x013b, code lost:
    
        if (r16.charAt(r8) == '.') goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x013d, code lost:
    
        r5 = false;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013f, code lost:
    
        if (r2 >= r1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0141, code lost:
    
        r6 = r16.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0147, code lost:
    
        if (r6 != '[') goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        if (r2 != r8) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain literal not at start of domain", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0157, code lost:
    
        if (r6 != ']') goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x015b, code lost:
    
        if (r2 != (r1 - 1)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x015d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0166, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain literal end not at end of domain", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0167, code lost:
    
        if (r6 <= ' ') goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0169, code lost:
    
        if (r6 == 127) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016b, code lost:
    
        if (r5 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0171, code lost:
    
        if (java.lang.Character.isLetterOrDigit(r6) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0175, code lost:
    
        if (r6 == '-') goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0177, code lost:
    
        if (r6 != '.') goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0181, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain contains illegal character", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0182, code lost:
    
        if (r6 != '.') goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0184, code lost:
    
        if (r7 == '.') goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x018e, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain contains dot-dot", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x018f, code lost:
    
        r2 = r2 + 1;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x019a, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain contains control or whitespace", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x019b, code lost:
    
        if (r7 == '.') goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x019d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01a5, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain ends with dot", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ad, code lost:
    
        throw new jakarta.mail.internet.AddressException("Domain starts with dot", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01b5, code lost:
    
        throw new jakarta.mail.internet.AddressException("Missing domain", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01bd, code lost:
    
        throw new jakarta.mail.internet.AddressException("Unterminated quote", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011c, code lost:
    
        throw new jakarta.mail.internet.AddressException("Local address contains control or whitespace", r16);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8207a(java.lang.String r16, boolean r17, boolean r18) throws jakarta.mail.internet.AddressException {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3655d.m8207a(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: b */
    public static String m8208b() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        if (localHost != null) {
            canonicalHostName = useCanonicalHostName ? localHost.getCanonicalHostName() : null;
            if (canonicalHostName == null) {
                canonicalHostName = localHost.getHostName();
            }
            if (canonicalHostName == null) {
                canonicalHostName = localHost.getHostAddress();
            }
            if (canonicalHostName != null && canonicalHostName.length() > 0) {
                int i10 = 0;
                boolean z6 = false;
                boolean z10 = false;
                while (true) {
                    if (i10 < canonicalHostName.length()) {
                        char cCharAt = canonicalHostName.charAt(i10);
                        if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.') {
                            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                                z6 = true;
                            } else {
                                if (cCharAt != ':') {
                                    break;
                                }
                                z10 = true;
                            }
                        }
                        i10++;
                    } else if (!z6 || z10) {
                        return a1.m14328h(']', "[", canonicalHostName);
                    }
                }
            }
        }
        return canonicalHostName;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0237 A[PHI: r2 r8 r9 r13
      0x0237: PHI (r2v15 int) = (r2v11 int), (r2v27 int), (r2v34 int) binds: [B:263:0x031e, B:203:0x0255, B:188:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v5 int) = (r8v3 int), (r8v14 int), (r8v1 int) binds: [B:263:0x031e, B:203:0x0255, B:188:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v11 int) binds: [B:263:0x031e, B:203:0x0255, B:188:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v6 int) binds: [B:263:0x031e, B:203:0x0255, B:188:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jakarta.mail.internet.C3655d[] m8209c(java.lang.String r20, boolean r21, boolean r22) throws jakarta.mail.internet.AddressException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3655d.m8209c(java.lang.String, boolean, boolean):jakarta.mail.internet.d[]");
    }

    /* renamed from: d */
    public static String m8210d(String str) {
        int length = str.length();
        boolean z6 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\') {
                StringBuilder sb2 = new StringBuilder(length + 3);
                sb2.append('\"');
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 == '\"' || cCharAt2 == '\\') {
                        sb2.append('\\');
                    }
                    sb2.append(cCharAt2);
                }
                sb2.append('\"');
                return sb2.toString();
            }
            if ((cCharAt < ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') || ((cCharAt >= 127 && !allowUtf8) || rfc822phrase.indexOf(cCharAt) >= 0)) {
                z6 = true;
            }
        }
        if (!z6) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(length + 2);
        sb3.append('\"');
        sb3.append(str);
        sb3.append('\"');
        return sb3.toString();
    }

    /* renamed from: e */
    public static String m8211e(String str) {
        if (!str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) || !str.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) || str.length() <= 1) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        if (strSubstring.indexOf(92) < 0) {
            return strSubstring;
        }
        StringBuilder sb2 = new StringBuilder(strSubstring.length());
        int i10 = 0;
        while (i10 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i10);
            if (cCharAt == '\\' && i10 < strSubstring.length() - 1) {
                i10++;
                cCharAt = strSubstring.charAt(i10);
            }
            sb2.append(cCharAt);
            i10++;
        }
        return sb2.toString();
    }

    public static C3655d getLocalAddress(c0 c0Var) {
        try {
            return _getLocalAddress(c0Var);
        } catch (AddressException | SecurityException | UnknownHostException unused) {
            return null;
        }
    }

    public static C3655d[] parse(String str) {
        return parse(str, true);
    }

    public static C3655d[] parseHeader(String str, boolean z6) {
        return m8209c(AbstractC3670s.m8256t(str), z6, true);
    }

    public Object clone() {
        try {
            return (C3655d) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // jakarta.mail.AbstractC3633a
    public boolean equals(Object obj) {
        if (!(obj instanceof C3655d)) {
            return false;
        }
        String address = ((C3655d) obj).getAddress();
        String str = this.address;
        if (address == str) {
            return true;
        }
        return str != null && str.equalsIgnoreCase(address);
    }

    public String getAddress() {
        return this.address;
    }

    public C3655d[] getGroup(boolean z6) {
        int iIndexOf;
        String address = getAddress();
        if (address != null && address.endsWith(";") && (iIndexOf = address.indexOf(58)) >= 0) {
            return parseHeader(address.substring(iIndexOf + 1, address.length() - 1), true);
        }
        return null;
    }

    public String getPersonal() {
        String str = this.personal;
        if (str != null) {
            return str;
        }
        String str2 = this.encodedPersonal;
        if (str2 == null) {
            return null;
        }
        try {
            String strM8240d = AbstractC3670s.m8240d(str2);
            this.personal = strM8240d;
            return strM8240d;
        } catch (Exception unused) {
            return this.encodedPersonal;
        }
    }

    @Override // jakarta.mail.AbstractC3633a
    public String getType() {
        return "rfc822";
    }

    public int hashCode() {
        String str = this.address;
        if (str == null) {
            return 0;
        }
        return str.toLowerCase(Locale.ENGLISH).hashCode();
    }

    public boolean isGroup() {
        String str = this.address;
        return str != null && str.endsWith(";") && this.address.indexOf(58) > 0;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPersonal(String str, String str2) {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = AbstractC3670s.m8244h(str, str2, true);
        } else {
            this.encodedPersonal = null;
        }
    }

    @Override // jakarta.mail.AbstractC3633a
    public String toString() {
        int i10;
        String str;
        String str2 = this.address;
        if (str2 == null) {
            str2 = "";
        }
        boolean z6 = true;
        if (this.encodedPersonal == null && (str = this.personal) != null) {
            try {
                this.encodedPersonal = AbstractC3670s.m8244h(str, null, true);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (this.encodedPersonal != null) {
            return m8210d(this.encodedPersonal) + " <" + str2 + ">";
        }
        if (isGroup()) {
            return str2;
        }
        String str3 = this.address;
        if (str3 != null) {
            try {
                int length = str3.length();
                i10 = 0;
                while (i10 < length) {
                    if (specialsNoDotNoAt.indexOf(str3.charAt(i10)) >= 0) {
                        break;
                    }
                    i10++;
                }
            } catch (StringIndexOutOfBoundsException unused2) {
            }
            i10 = -1;
            if (i10 >= 0) {
                z6 = false;
            }
        }
        return z6 ? str2 : AbstractC5601a.m11238i("<", str2, ">");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toUnicodeString() {
        /*
            r7 = this;
            java.lang.String r0 = r7.getPersonal()
            java.lang.String r1 = ">"
            if (r0 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = m8210d(r0)
            r2.append(r0)
            java.lang.String r0 = " <"
            r2.append(r0)
            java.lang.String r0 = r7.address
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4564k(r2, r0, r1)
            return r0
        L20:
            boolean r0 = r7.isGroup()
            if (r0 != 0) goto L57
            java.lang.String r0 = r7.address
            if (r0 == 0) goto L45
            java.lang.String r2 = "()<>,;:\\\"[]"
            r3 = 0
            int r4 = r0.length()     // Catch: java.lang.StringIndexOutOfBoundsException -> L42
            r5 = r3
        L32:
            if (r5 >= r4) goto L42
            char r6 = r0.charAt(r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L42
            int r6 = r2.indexOf(r6)     // Catch: java.lang.StringIndexOutOfBoundsException -> L42
            if (r6 < 0) goto L3f
            goto L43
        L3f:
            int r5 = r5 + 1
            goto L32
        L42:
            r5 = -1
        L43:
            if (r5 >= 0) goto L46
        L45:
            r3 = 1
        L46:
            if (r3 == 0) goto L49
            goto L57
        L49:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "<"
            r0.<init>(r2)
            java.lang.String r2 = r7.address
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4564k(r0, r2, r1)
            return r0
        L57:
            java.lang.String r0 = r7.address
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3655d.toUnicodeString():java.lang.String");
    }

    public void validate() throws AddressException {
        if (isGroup()) {
            getGroup(true);
        } else {
            m8207a(getAddress(), true, true);
        }
    }

    public static C3655d[] parse(String str, boolean z6) {
        return m8209c(str, z6, false);
    }

    public void setPersonal(String str) {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = AbstractC3670s.m8244h(str, null, true);
        } else {
            this.encodedPersonal = null;
        }
    }

    public static String toString(AbstractC3633a[] abstractC3633aArr) {
        return toString(abstractC3633aArr, 0);
    }

    public static String toUnicodeString(AbstractC3633a[] abstractC3633aArr) {
        return toUnicodeString(abstractC3633aArr, 0);
    }

    public static String toString(AbstractC3633a[] abstractC3633aArr, int i10) {
        if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < abstractC3633aArr.length; i11++) {
            if (i11 != 0) {
                sb2.append(", ");
                i10 += 2;
            }
            String strM8245i = AbstractC3670s.m8245i(0, abstractC3633aArr[i11].toString());
            int iIndexOf = strM8245i.indexOf("\r\n");
            if (iIndexOf == -1) {
                iIndexOf = strM8245i.length();
            }
            if (iIndexOf + i10 > 76) {
                int length = sb2.length();
                if (length > 0) {
                    int i12 = length - 1;
                    if (sb2.charAt(i12) == ' ') {
                        sb2.setLength(i12);
                    }
                }
                sb2.append("\r\n\t");
                i10 = 8;
            }
            sb2.append(strM8245i);
            int iLastIndexOf = strM8245i.lastIndexOf("\r\n");
            i10 = iLastIndexOf != -1 ? (strM8245i.length() - iLastIndexOf) - 2 : strM8245i.length() + i10;
        }
        return sb2.toString();
    }

    public static String toUnicodeString(AbstractC3633a[] abstractC3633aArr, int i10) {
        if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z6 = false;
        for (int i11 = 0; i11 < abstractC3633aArr.length; i11++) {
            if (i11 != 0) {
                sb2.append(", ");
                i10 += 2;
            }
            String unicodeString = ((C3655d) abstractC3633aArr[i11]).toUnicodeString();
            if (AbstractC3670s.m8237a(unicodeString) != 1) {
                unicodeString = new String(unicodeString.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
                z6 = true;
            }
            String strM8245i = AbstractC3670s.m8245i(0, unicodeString);
            int iIndexOf = strM8245i.indexOf("\r\n");
            if (iIndexOf == -1) {
                iIndexOf = strM8245i.length();
            }
            if (iIndexOf + i10 > 76) {
                int length = sb2.length();
                if (length > 0) {
                    int i12 = length - 1;
                    if (sb2.charAt(i12) == ' ') {
                        sb2.setLength(i12);
                    }
                }
                sb2.append("\r\n\t");
                i10 = 8;
            }
            sb2.append(strM8245i);
            int iLastIndexOf = strM8245i.lastIndexOf("\r\n");
            i10 = iLastIndexOf != -1 ? (strM8245i.length() - iLastIndexOf) - 2 : strM8245i.length() + i10;
        }
        String string = sb2.toString();
        return z6 ? new String(string.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8) : string;
    }
}
