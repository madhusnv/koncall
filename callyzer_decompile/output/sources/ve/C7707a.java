package ve;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import pg.k6;
import ue.C7421c;
import xe.InterfaceC8359k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ve.a */
/* loaded from: classes.dex */
public final class C7707a implements InterfaceC8359k {

    /* renamed from: c */
    public static final String f37225c;

    /* renamed from: d */
    public static final Set f37226d;

    /* renamed from: e */
    public static final C7707a f37227e;

    /* renamed from: f */
    public static final C7707a f37228f;

    /* renamed from: a */
    public final String f37229a;

    /* renamed from: b */
    public final String f37230b;

    static {
        String strM11731a = k6.m11731a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f37225c = strM11731a;
        String strM11731a2 = k6.m11731a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM11731a3 = k6.m11731a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f37226d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C7421c("proto"), new C7421c("json"))));
        f37227e = new C7707a(strM11731a, null);
        f37228f = new C7707a(strM11731a2, strM11731a3);
    }

    public C7707a(String str, String str2) {
        this.f37229a = str;
        this.f37230b = str2;
    }

    /* renamed from: a */
    public static C7707a m14705a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
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
        return new C7707a(str2, str3);
    }
}
