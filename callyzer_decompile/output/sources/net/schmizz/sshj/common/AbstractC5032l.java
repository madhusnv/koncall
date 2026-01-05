package net.schmizz.sshj.common;

import bz.C0802a;
import i0.m0;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import uy.AbstractC7571a;
import yl.C8688a;
import yl.C8689b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5032l {

    /* renamed from: a */
    public static final List f24783a;

    static {
        int i10 = 5;
        int i11 = 6;
        int i12 = 7;
        int i13 = 8;
        int i14 = 4;
        f24783a = Arrays.asList(new C0802a(12), new C0802a(9), new C0802a(10), new C0802a(11), new C0802a(i10), new C0802a(i10), new C0802a(i11), new C0802a(i11), new C0802a(i12), new C0802a(i12), new C0802a(i13), new C0802a(i13), new C0802a(i14), new C0802a(i14));
    }

    /* renamed from: a */
    public static Date m9941a(BigInteger bigInteger) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(9223372036854775L);
        return bigInteger.compareTo(bigIntegerValueOf) > 0 ? new Date(bigIntegerValueOf.longValue() * 1000) : new Date(bigInteger.longValue() * 1000);
    }

    /* renamed from: b */
    public static boolean m9942b(Key key, EnumC5031k enumC5031k) {
        if (key instanceof C8689b) {
            return enumC5031k.isMyType(((C8689b) key).f42050a);
        }
        return false;
    }

    /* renamed from: c */
    public static byte[] m9943c(Map map) {
        byte[] bytes;
        C5021a c5021a = new C5021a();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            c5021a.m9916k(str);
            String str2 = (String) map.get(str);
            if (str2 == null || str2.isEmpty()) {
                bytes = "".getBytes();
            } else {
                C5021a c5021a2 = new C5021a();
                byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
                c5021a2.m9912g(bytes2.length, bytes2);
                bytes = c5021a2.m9910d();
            }
            c5021a.m9912g(bytes.length, bytes);
        }
        return c5021a.m9910d();
    }

    /* renamed from: d */
    public static C8689b m9944d(AbstractC5022b abstractC5022b, EnumC5031k enumC5031k) throws GeneralSecurityException {
        C8688a c8688a = new C8688a();
        try {
            c8688a.f42039b = abstractC5022b.m9925t();
            c8688a.f42038a = enumC5031k.readPubKeyFromBuffer(abstractC5022b);
            byte[] bArr = new byte[8];
            abstractC5022b.m9928w(bArr);
            c8688a.f42040c = new BigInteger(1, bArr);
            c8688a.f42041d = abstractC5022b.m9930y();
            c8688a.f42042e = abstractC5022b.m9929x();
            byte[] bArrM9925t = abstractC5022b.m9925t();
            ArrayList arrayList = new ArrayList();
            C5021a c5021a = new C5021a(bArrM9925t, true);
            while (c5021a.m9907a() > 0) {
                arrayList.add(c5021a.m9929x());
            }
            c8688a.f42043f = arrayList;
            byte[] bArr2 = new byte[8];
            abstractC5022b.m9928w(bArr2);
            c8688a.f42044g = m9941a(new BigInteger(1, bArr2));
            byte[] bArr3 = new byte[8];
            abstractC5022b.m9928w(bArr3);
            c8688a.f42045h = m9941a(new BigInteger(1, bArr3));
            c8688a.f42046i = m9945e(abstractC5022b.m9925t());
            c8688a.f42047j = m9945e(abstractC5022b.m9925t());
            abstractC5022b.m9929x();
            c8688a.f42048k = abstractC5022b.m9925t();
            c8688a.f42049l = abstractC5022b.m9925t();
            return new C8689b(c8688a);
        } catch (Buffer$BufferException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    /* renamed from: e */
    public static LinkedHashMap m9945e(byte[] bArr) throws Buffer$BufferException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5021a c5021a = new C5021a(bArr, true);
        while (c5021a.m9907a() > 0) {
            String strM9929x = c5021a.m9929x();
            byte[] bArrM9925t = c5021a.m9925t();
            linkedHashMap.put(strM9929x, bArrM9925t.length == 0 ? "" : new C5021a(bArrM9925t, true).m9929x());
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public static String m9946f(byte[] bArr, C8689b c8689b, String str) {
        String str2;
        byte[] bArr2 = c8689b.f42061m;
        Date date = c8689b.f42057h;
        Date date2 = c8689b.f42056g;
        ArrayList arrayList = c8689b.f42055f;
        String strM9929x = new C5021a(bArr2, true).m9929x();
        AbstractC7571a abstractC7571a = (AbstractC7571a) AbstractC5030j.m9937b(strM9929x, f24783a);
        if (abstractC7571a == null) {
            return AbstractC5601a.m11238i("Unknown signature algorithm `", strM9929x, "`");
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean zMatches = false;
            int i10 = 0;
            while (true) {
                str2 = "";
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                String str3 = (String) obj;
                StringBuilder sb2 = new StringBuilder();
                String str4 = "";
                int i11 = 0;
                while (i11 < str3.length()) {
                    char cCharAt = str3.charAt(i11);
                    int i12 = size;
                    if (cCharAt == '?' || cCharAt == '*') {
                        sb2.append(str4);
                        if (cCharAt == '?') {
                            sb2.append('.');
                        } else {
                            sb2.append(".*");
                        }
                        str4 = "";
                    } else {
                        if (str4.isEmpty()) {
                            sb2.append("\\Q");
                            str4 = "\\E";
                        }
                        sb2.append(cCharAt);
                    }
                    i11++;
                    size = i12;
                }
                int i13 = size;
                zMatches = Pattern.compile(sb2.toString()).matcher(str).matches();
                if (zMatches) {
                    break;
                }
                size = i13;
            }
            if (!zMatches) {
                StringBuilder sbM7383p = m0.m7383p("Hostname `", str, "` doesn't match any of the principals: `");
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    sbM7383p.append(str2);
                    sbM7383p.append((String) obj2);
                    str2 = "`, `";
                }
                sbM7383p.append("`");
                return sbM7383p.toString();
            }
        }
        Date date3 = new Date();
        if (date2 != null && date3.before(date2)) {
            return "Certificate is valid after " + date2 + ", today is " + date3;
        }
        if (date == null || !date3.after(date)) {
            abstractC7571a.mo14306b(new C5021a(c8689b.f42060l, true).m9927v());
            abstractC7571a.m14307c((bArr.length - bArr2.length) - 4, bArr);
            if (abstractC7571a.mo13437d(bArr2)) {
                return null;
            }
            return "Signature verification failed";
        }
        return "Certificate is valid before " + date + ", today is " + date3;
    }

    /* renamed from: g */
    public static void m9947g(PublicKey publicKey, EnumC5031k enumC5031k, AbstractC5022b abstractC5022b) {
        if (!(publicKey instanceof C8689b)) {
            throw new UnsupportedOperationException("Can't convert non-certificate key " + publicKey.getAlgorithm() + " to certificate");
        }
        C8689b c8689b = (C8689b) publicKey;
        byte[] bArr = c8689b.f42051b;
        abstractC5022b.getClass();
        abstractC5022b.m9912g(bArr.length, bArr);
        enumC5031k.writePubKeyContentsIntoBuffer(c8689b.f42050a, abstractC5022b);
        abstractC5022b.m9921p(c8689b.f42052c);
        abstractC5022b.m9918m(c8689b.f42053d);
        abstractC5022b.m9917l(c8689b.f42054e, StandardCharsets.UTF_8);
        ArrayList arrayList = c8689b.f42055f;
        C5021a c5021a = new C5021a();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c5021a.m9916k((String) obj);
        }
        byte[] bArrM9910d = c5021a.m9910d();
        abstractC5022b.m9912g(bArrM9910d.length, bArrM9910d);
        long time = c8689b.f42056g.getTime() / 1000;
        abstractC5022b.m9921p(time >= 9223372036854775L ? AbstractC5022b.f24774d : BigInteger.valueOf(time));
        long time2 = c8689b.f42057h.getTime() / 1000;
        abstractC5022b.m9921p(time2 >= 9223372036854775L ? AbstractC5022b.f24774d : BigInteger.valueOf(time2));
        byte[] bArrM9943c = m9943c(c8689b.f42058j);
        abstractC5022b.m9912g(bArrM9943c.length, bArrM9943c);
        byte[] bArrM9943c2 = m9943c(c8689b.f42059k);
        abstractC5022b.m9912g(bArrM9943c2.length, bArrM9943c2);
        byte[] bytes = "".getBytes(StandardCharsets.UTF_8);
        abstractC5022b.m9912g(bytes.length, bytes);
        byte[] bArr2 = c8689b.f42060l;
        abstractC5022b.m9912g(bArr2.length, bArr2);
        byte[] bArr3 = c8689b.f42061m;
        abstractC5022b.m9912g(bArr3.length, bArr3);
    }
}
