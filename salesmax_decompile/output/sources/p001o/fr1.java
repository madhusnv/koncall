package p001o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public final class fr1 implements b76 {

    /* renamed from: c */
    public static final String f23953c;

    /* renamed from: d */
    public static final String f23954d;

    /* renamed from: e */
    public static final String f23955e;

    /* renamed from: f */
    public static final Set f23956f;

    /* renamed from: g */
    public static final fr1 f23957g;

    /* renamed from: h */
    public static final fr1 f23958h;

    /* renamed from: a */
    public final String f23959a;

    /* renamed from: b */
    public final String f23960b;

    static {
        String strM40249a = n8g.m40249a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f23953c = strM40249a;
        String strM40249a2 = n8g.m40249a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f23954d = strM40249a2;
        String strM40249a3 = n8g.m40249a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f23955e = strM40249a3;
        f23956f = Collections.unmodifiableSet(new HashSet(Arrays.asList(n76.m40202b("proto"), n76.m40202b("json"))));
        f23957g = new fr1(strM40249a, null);
        f23958h = new fr1(strM40249a2, strM40249a3);
    }

    public fr1(String str, String str2) {
        this.f23959a = str;
        this.f23960b = str2;
    }

    /* renamed from: c */
    public static fr1 m27371c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(HTTP.UTF_8));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new fr1(str2, str3);
    }

    @Override // p001o.b76
    /* renamed from: a */
    public Set mo18214a() {
        return f23956f;
    }

    /* renamed from: b */
    public byte[] m27372b() {
        String str = this.f23960b;
        if (str == null && this.f23959a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f23959a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(HTTP.UTF_8));
    }

    /* renamed from: d */
    public String m27373d() {
        return this.f23960b;
    }

    /* renamed from: e */
    public String m27374e() {
        return this.f23959a;
    }

    @Override // p001o.fn5
    public byte[] getExtras() {
        return m27372b();
    }

    @Override // p001o.fn5
    public String getName() {
        return "cct";
    }
}
