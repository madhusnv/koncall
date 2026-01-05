package jakarta.mail;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.BitSet;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: l */
    public static final boolean f19310l;

    /* renamed from: m */
    public static final BitSet f19311m;

    /* renamed from: a */
    public String f19312a;

    /* renamed from: b */
    public final String f19313b;

    /* renamed from: c */
    public final String f19314c;

    /* renamed from: d */
    public final String f19315d;

    /* renamed from: e */
    public final String f19316e;

    /* renamed from: f */
    public InetAddress f19317f;

    /* renamed from: h */
    public final int f19319h;

    /* renamed from: i */
    public final String f19320i;

    /* renamed from: j */
    public final String f19321j;

    /* renamed from: g */
    public boolean f19318g = false;

    /* renamed from: k */
    public int f19322k = 0;

    static {
        try {
            f19310l = !Boolean.getBoolean("mail.URLName.dontencode");
        } catch (Exception unused) {
        }
        f19311m = new BitSet(256);
        for (int i10 = 97; i10 <= 122; i10++) {
            f19311m.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f19311m.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f19311m.set(i12);
        }
        BitSet bitSet = f19311m;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
    }

    public h0(int i10, String str, String str2, String str3, String str4, String str5) {
        int iIndexOf;
        this.f19313b = str;
        this.f19316e = str2;
        this.f19319h = i10;
        if (str3 == null || (iIndexOf = str3.indexOf(35)) == -1) {
            this.f19320i = str3;
            this.f19321j = null;
        } else {
            this.f19320i = str3.substring(0, iIndexOf);
            this.f19321j = str3.substring(iIndexOf + 1);
        }
        boolean z6 = f19310l;
        this.f19314c = z6 ? m8197b(str4) : str4;
        this.f19315d = z6 ? m8197b(str5) : str5;
    }

    /* renamed from: a */
    public static String m8196a(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        int i11 = 0;
        try {
            int length = str.length();
            i10 = 0;
            while (i10 < length) {
                if ("+%".indexOf(str.charAt(i10)) >= 0) {
                    break;
                }
                i10++;
            }
        } catch (StringIndexOutOfBoundsException unused) {
        }
        i10 = -1;
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '%') {
                int i12 = i11 + 3;
                try {
                    sb2.append((char) Integer.parseInt(str.substring(i11 + 1, i12), 16));
                    i11 += 2;
                } catch (NumberFormatException unused2) {
                    throw new IllegalArgumentException("Illegal URL encoded value: " + str.substring(i11, i12));
                }
            } else if (cCharAt != '+') {
                sb2.append(cCharAt);
            } else {
                sb2.append(' ');
            }
            i11++;
        }
        String string = sb2.toString();
        try {
            return new String(string.getBytes("8859_1"));
        } catch (UnsupportedEncodingException unused3) {
            return string;
        }
    }

    /* renamed from: b */
    public static String m8197b(String str) throws IOException {
        if (str == null) {
            return null;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            BitSet bitSet = f19311m;
            if (cCharAt == ' ' || !bitSet.get(cCharAt)) {
                StringBuilder sb2 = new StringBuilder(str.length());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char cCharAt2 = str.charAt(i11);
                    if (bitSet.get(cCharAt2)) {
                        if (cCharAt2 == ' ') {
                            cCharAt2 = '+';
                        }
                        sb2.append(cCharAt2);
                    } else {
                        try {
                            outputStreamWriter.write(cCharAt2);
                            outputStreamWriter.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            for (int i12 = 0; i12 < byteArray.length; i12++) {
                                sb2.append('%');
                                char cForDigit = Character.forDigit((byteArray[i12] >> 4) & 15, 16);
                                if (Character.isLetter(cForDigit)) {
                                    cForDigit = (char) (cForDigit - ' ');
                                }
                                sb2.append(cForDigit);
                                char cForDigit2 = Character.forDigit(byteArray[i12] & 15, 16);
                                if (Character.isLetter(cForDigit2)) {
                                    cForDigit2 = (char) (cForDigit2 - ' ');
                                }
                                sb2.append(cForDigit2);
                            }
                            byteArrayOutputStream.reset();
                        } catch (IOException unused) {
                            byteArrayOutputStream.reset();
                        }
                    }
                }
                return sb2.toString();
            }
        }
        return str;
    }

    /* renamed from: c */
    public final synchronized InetAddress m8198c() {
        if (this.f19318g) {
            return this.f19317f;
        }
        String str = this.f19316e;
        if (str == null) {
            return null;
        }
        try {
            this.f19317f = InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            this.f19317f = null;
        }
        this.f19318g = true;
        return this.f19317f;
    }

    /* renamed from: d */
    public final String m8199d() {
        boolean z6 = f19310l;
        String str = this.f19314c;
        return z6 ? m8196a(str) : str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        String str = h0Var.f19316e;
        Object obj2 = h0Var.f19313b;
        String str2 = this.f19313b;
        if (str2 != obj2 && (str2 == null || !str2.equals(obj2))) {
            return false;
        }
        InetAddress inetAddressM8198c = m8198c();
        InetAddress inetAddressM8198c2 = h0Var.m8198c();
        if (inetAddressM8198c == null || inetAddressM8198c2 == null) {
            String str3 = this.f19316e;
            if (str3 == null || str == null) {
                if (str3 != str) {
                    return false;
                }
            } else if (!str3.equalsIgnoreCase(str)) {
                return false;
            }
        } else if (!inetAddressM8198c.equals(inetAddressM8198c2)) {
            return false;
        }
        Object obj3 = h0Var.f19314c;
        String str4 = this.f19314c;
        if (str4 != obj3 && (str4 == null || !str4.equals(obj3))) {
            return false;
        }
        String str5 = this.f19320i;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = h0Var.f19320i;
        return str5.equals(str6 != null ? str6 : "") && this.f19319h == h0Var.f19319h;
    }

    public final int hashCode() {
        int i10 = this.f19322k;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f19313b;
        if (str != null) {
            this.f19322k = str.hashCode() + i10;
        }
        InetAddress inetAddressM8198c = m8198c();
        if (inetAddressM8198c != null) {
            this.f19322k = inetAddressM8198c.hashCode() + this.f19322k;
        } else {
            String str2 = this.f19316e;
            if (str2 != null) {
                this.f19322k = str2.toLowerCase(Locale.ENGLISH).hashCode() + this.f19322k;
            }
        }
        String str3 = this.f19314c;
        if (str3 != null) {
            this.f19322k = str3.hashCode() + this.f19322k;
        }
        String str4 = this.f19320i;
        if (str4 != null) {
            this.f19322k = str4.hashCode() + this.f19322k;
        }
        int i11 = this.f19322k + this.f19319h;
        this.f19322k = i11;
        return i11;
    }

    public final String toString() {
        if (this.f19312a == null) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f19313b;
            if (str != null) {
                sb2.append(str);
                sb2.append(":");
            }
            String str2 = this.f19320i;
            String str3 = this.f19316e;
            String str4 = this.f19314c;
            if (str4 != null || str3 != null) {
                sb2.append("//");
                if (str4 != null) {
                    sb2.append(str4);
                    String str5 = this.f19315d;
                    if (str5 != null) {
                        sb2.append(":");
                        sb2.append(str5);
                    }
                    sb2.append("@");
                }
                if (str3 != null) {
                    sb2.append(str3);
                }
                int i10 = this.f19319h;
                if (i10 != -1) {
                    sb2.append(":");
                    sb2.append(Integer.toString(i10));
                }
                if (str2 != null) {
                    sb2.append("/");
                }
            }
            if (str2 != null) {
                sb2.append(str2);
            }
            String str6 = this.f19321j;
            if (str6 != null) {
                sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
                sb2.append(str6);
            }
            this.f19312a = sb2.toString();
        }
        return this.f19312a;
    }
}
