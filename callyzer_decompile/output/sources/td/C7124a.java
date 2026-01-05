package td;

import aws.smithy.kotlin.runtime.time.ParseException;
import bt.f0;
import com.sun.mail.util.AbstractC1452a;
import cv.C1515k;
import ex.InterfaceC2141e;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5172j;
import nx.C5174l;
import nx.C5176n;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.AbstractC5928i;
import qw.C6361k;
import sq.i2;
import sq.y1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.a */
/* loaded from: classes.dex */
public final class C7124a {

    /* renamed from: a */
    public static final C7124a f34340a = new C7124a();

    /* renamed from: a */
    public static C7126c m13403a(int i10, long j6) {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j6, i10);
        AbstractC4154l.m8922e(instantOfEpochSecond, "ofEpochSecond(...)");
        return new C7126c(instantOfEpochSecond);
    }

    /* renamed from: b */
    public static C7126c m13404b(String ts2) {
        C6361k c6361k;
        C6361k c6361k2;
        CharSequence charSequenceSubSequence;
        AbstractC4154l.m8923f(ts2, "ts");
        C5174l c5174lM10086b = AbstractC7142s.f34375a.m10086b(ts2);
        int i10 = 1;
        if (c5174lM10086b != null) {
            String str = (String) ((C5172j) c5174lM10086b.m10082a()).get(1);
            String str2 = (String) ((C5172j) c5174lM10086b.m10082a()).get(2);
            String str3 = (String) ((C5172j) c5174lM10086b.m10082a()).get(5);
            StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
            if (AbstractC5178p.m10117y(str2, '.')) {
                int iM10098I = AbstractC5178p.m10098I(str2, '.', 0, 6);
                String strSubstring = str2.substring(0, iM10098I);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(iM10098I + 1);
                AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                c6361k = new C6361k(strSubstring.concat(strSubstring2), Integer.valueOf(iM10098I));
            } else {
                c6361k = new C6361k(str2, Integer.valueOf(str2.length()));
            }
            String str4 = (String) c6361k.f30755a;
            int iIntValue = ((Number) c6361k.f30756b).intValue();
            Integer numM10140v = AbstractC5185w.m10140v(str3);
            if (numM10140v == null) {
                throw new ParseException(ts2, "Failed to read exponent", 0);
            }
            int iIntValue2 = numM10140v.intValue() + iIntValue;
            if (iIntValue2 <= 0) {
                c6361k2 = new C6361k(String.valueOf('0'), AbstractC5178p.m10105P(str4.length() - iIntValue2, str4));
            } else if (iIntValue2 < str4.length()) {
                String strSubstring3 = str4.substring(0, iIntValue2);
                AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                String strSubstring4 = str4.substring(iIntValue2);
                AbstractC4154l.m8922e(strSubstring4, "substring(...)");
                c6361k2 = new C6361k(strSubstring3, strSubstring4);
            } else {
                if (iIntValue2 < 0) {
                    throw new IllegalArgumentException(AbstractC5601a.m11232c(iIntValue2, "Desired length ", " is less than zero."));
                }
                if (iIntValue2 <= str4.length()) {
                    charSequenceSubSequence = str4.subSequence(0, str4.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(iIntValue2);
                    sb2.append((CharSequence) str4);
                    int length = iIntValue2 - str4.length();
                    if (1 <= length) {
                        int i11 = 1;
                        while (true) {
                            sb2.append('0');
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                        }
                    }
                    charSequenceSubSequence = sb2;
                }
                c6361k2 = new C6361k(charSequenceSubSequence.toString(), String.valueOf('0'));
            }
            String str5 = (String) c6361k2.f30755a;
            String str6 = (String) c6361k2.f30756b;
            sbM4568o.append(str5);
            sbM4568o.append('.');
            sbM4568o.append(str6);
            String string = sbM4568o.toString();
            if (string != null) {
                ts2 = string;
            }
        }
        C7129f c7129f = (C7129f) new C1515k(i10, 19, new i2(8)).invoke(ts2, 0);
        int i12 = c7129f.f34349a;
        long jLongValue = ((Number) c7129f.f34350b).longValue();
        if (i12 == ts2.length()) {
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            return m13403a(0, jLongValue);
        }
        i2 i2Var = new i2(9);
        AbstractC7136m.m13412b(i12, 1, ts2);
        char cCharAt = ts2.charAt(i12);
        if (cCharAt == '.') {
            int iIntValue3 = ((Number) ((C7129f) i2Var.invoke(ts2, Integer.valueOf(new C7129f(i12 + 1, Character.valueOf(cCharAt)).f34349a))).f34350b).intValue();
            DateTimeFormatter dateTimeFormatter2 = C7126c.f34342b;
            return m13403a(iIntValue3, jLongValue);
        }
        throw new ParseException(ts2, "expected `.` found `" + cCharAt + '`', i12);
    }

    /* renamed from: c */
    public static C7126c m13405c(String ts2) {
        C7132i c7132i;
        AbstractC4154l.m8923f(ts2, "ts");
        C5176n c5176n = AbstractC7142s.f34375a;
        byte b10 = 0;
        C7129f c7129f = (C7129f) new i2(12).invoke(ts2, 0);
        int i10 = c7129f.f34349a;
        C7130g c7130g = (C7130g) c7129f.f34350b;
        if (i10 == ts2.length()) {
            c7132i = new C7132i(0, 0, 0, 0, 0);
        } else {
            c7132i = (C7132i) ((C7129f) new i2(13).invoke(ts2, Integer.valueOf(((C7129f) new y1("Tt", 3, b10).invoke(ts2, Integer.valueOf(i10))).f34349a))).f34350b;
        }
        return AbstractC5928i.m11690a(new C7131h(c7130g.f34351a, c7130g.f34352b, c7130g.f34353c, c7132i.f34362a, c7132i.f34363b, c7132i.f34364c, c7132i.f34365d, c7132i.f34366e));
    }

    /* renamed from: d */
    public static C7126c m13406d(String ts2) {
        C7129f c7129f;
        char cCharAt;
        C7129f c7129f2;
        AbstractC4154l.m8923f(ts2, "ts");
        C5176n c5176n = AbstractC7142s.f34375a;
        int i10 = 4;
        int i11 = 1;
        byte b10 = 0;
        if (AbstractC5178p.m10101L(ts2) || ('0' <= (cCharAt = ts2.charAt(0)) && cCharAt < ':')) {
            c7129f = new C7129f(0, null);
        } else {
            int i12 = 2;
            InterfaceC2141e[] interfaceC2141eArr = {new y1("Mon", i12, b10), new y1("Tue", i12, b10), new y1("Wed", i12, b10), new y1("Thu", i12, b10), new y1("Fri", i12, b10), new y1("Sat", i12, b10), new y1("Sun", i12, b10)};
            C7137n c7137n = C7137n.f34370a;
            int length = interfaceC2141eArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    c7129f2 = null;
                    break;
                }
                try {
                    c7129f2 = (C7129f) interfaceC2141eArr[i13].invoke(ts2, 0);
                    break;
                } catch (ParseException unused) {
                    i13++;
                }
            }
            if (c7129f2 == null) {
                throw new ParseException(ts2, "no alternatives matched", 0);
            }
            int i14 = c7129f2.f34349a;
            Object obj = c7129f2.f34350b;
            AbstractC7136m.m13412b(i14, 1, ts2);
            char cCharAt2 = ts2.charAt(i14);
            if (cCharAt2 != ',') {
                throw new ParseException(ts2, "expected `,` found `" + cCharAt2 + '`', i14);
            }
            C7129f c7129f3 = new C7129f(i14 + 1, Character.valueOf(cCharAt2));
            C7129f c7129f4 = new C7129f(c7129f3.f34349a, new C6361k(obj, c7129f3.f34350b));
            C7129f c7129f5 = (C7129f) c7137n.invoke(ts2, Integer.valueOf(c7129f4.f34349a));
            C7129f c7129f6 = new C7129f(c7129f5.f34349a, new C6361k(c7129f4.f34350b, c7129f5.f34350b));
            C6361k it = (C6361k) c7129f6.f34350b;
            AbstractC4154l.m8923f(it, "it");
            c7129f = new C7129f(c7129f6.f34349a, null);
        }
        C7129f c7129f7 = (C7129f) new f0(i11, new C4266h(1, 31, 1)).invoke(ts2, Integer.valueOf(c7129f.f34349a));
        int i15 = c7129f7.f34349a;
        int iIntValue = ((Number) c7129f7.f34350b).intValue();
        C7129f c7129f8 = (C7129f) new i2(11).invoke(ts2, Integer.valueOf(((C7129f) C7138o.f34371a.invoke(ts2, Integer.valueOf(i15))).f34349a));
        int i16 = c7129f8.f34349a;
        int iIntValue2 = ((Number) c7129f8.f34350b).intValue();
        C7129f c7129f9 = (C7129f) new C1515k(i10, i10, new i2(10)).invoke(ts2, Integer.valueOf(((C7129f) C7139p.f34372a.invoke(ts2, Integer.valueOf(i16))).f34349a));
        int i17 = c7129f9.f34349a;
        int iIntValue3 = ((Number) c7129f9.f34350b).intValue();
        C7132i c7132i = (C7132i) ((C7129f) new i2(14).invoke(ts2, Integer.valueOf(((C7129f) C7140q.f34373a.invoke(ts2, Integer.valueOf(i17))).f34349a))).f34350b;
        return AbstractC5928i.m11690a(new C7131h(iIntValue3, iIntValue2, iIntValue, c7132i.f34362a, c7132i.f34363b, c7132i.f34364c, c7132i.f34365d, c7132i.f34366e));
    }

    /* renamed from: e */
    public static C7126c m13407e() {
        Instant instantNow = Instant.now();
        AbstractC4154l.m8922e(instantNow, "now(...)");
        return new C7126c(instantNow);
    }
}
