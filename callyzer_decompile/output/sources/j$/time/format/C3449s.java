package j$.time.format;

import j$.time.C3401c;
import j$.time.C3429e;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.zone.C3498i;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* renamed from: j$.time.format.s */
/* loaded from: classes2.dex */
public class C3449s implements InterfaceC3435e {

    /* renamed from: c */
    public static volatile Map.Entry f18193c;

    /* renamed from: d */
    public static volatile Map.Entry f18194d;

    /* renamed from: a */
    public final C3429e f18195a;

    /* renamed from: b */
    public final String f18196b;

    /* renamed from: a */
    public C3443m mo7983a(C3451u c3451u) {
        Set<String> set = C3498i.f18337d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = c3451u.f18203b ? f18193c : f18194d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = c3451u.f18203b ? f18193c : f18194d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        C3443m c3443m = c3451u.f18203b ? new C3443m("", null, null) : new C3442l("", null, null);
                        for (String str : set) {
                            c3443m.m7979a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c3443m);
                        if (c3451u.f18203b) {
                            f18193c = simpleImmutableEntry;
                        } else {
                            f18194d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (C3443m) simpleImmutableEntry.getValue();
    }

    public C3449s(C3429e c3429e, String str) {
        this.f18195a = c3429e;
        this.f18196b = str;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) c3453w.m7992b(this.f18195a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.mo7867r());
        return true;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == length) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            return m7982b(c3451u, charSequence, i10, i10, C3440j.f18166e);
        }
        int i12 = i10 + 2;
        if (length >= i12) {
            char cCharAt2 = charSequence.charAt(i10 + 1);
            if (c3451u.m7985a(cCharAt, Matrix.MATRIX_TYPE_RANDOM_UT) && c3451u.m7985a(cCharAt2, 'T')) {
                int i13 = i10 + 3;
                if (length >= i13 && c3451u.m7985a(charSequence.charAt(i12), 'C')) {
                    return m7982b(c3451u, charSequence, i10, i13, C3440j.f18167f);
                }
                return m7982b(c3451u, charSequence, i10, i12, C3440j.f18167f);
            }
            if (c3451u.m7985a(cCharAt, 'G') && length >= (i11 = i10 + 3) && c3451u.m7985a(cCharAt2, 'M') && c3451u.m7985a(charSequence.charAt(i12), 'T')) {
                int i14 = i10 + 4;
                if (length >= i14 && c3451u.m7985a(charSequence.charAt(i11), '0')) {
                    c3451u.m7988e(ZoneId.of("GMT0"));
                    return i14;
                }
                return m7982b(c3451u, charSequence, i10, i11, C3440j.f18167f);
            }
        }
        C3443m c3443mMo7983a = mo7983a(c3451u);
        ParsePosition parsePosition = new ParsePosition(i10);
        String strM7980c = c3443mMo7983a.m7980c(charSequence, parsePosition);
        if (strM7980c == null) {
            if (!c3451u.m7985a(cCharAt, Matrix.MATRIX_TYPE_ZERO)) {
                return ~i10;
            }
            c3451u.m7988e(ZoneOffset.UTC);
            return i10 + 1;
        }
        c3451u.m7988e(ZoneId.of(strM7980c));
        return parsePosition.getIndex();
    }

    /* renamed from: b */
    public static int m7982b(C3451u c3451u, CharSequence charSequence, int i10, int i11, C3440j c3440j) {
        String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
        if (i11 >= charSequence.length()) {
            c3451u.m7988e(ZoneId.of(upperCase));
            return i11;
        }
        if (charSequence.charAt(i11) != '0' && !c3451u.m7985a(charSequence.charAt(i11), Matrix.MATRIX_TYPE_ZERO)) {
            C3451u c3451u2 = new C3451u(c3451u.f18202a);
            c3451u2.f18203b = c3451u.f18203b;
            c3451u2.f18204c = c3451u.f18204c;
            int iMo7962C = c3440j.mo7962C(c3451u2, charSequence, i11);
            try {
                if (iMo7962C < 0) {
                    if (c3440j == C3440j.f18166e) {
                        return ~i10;
                    }
                    c3451u.m7988e(ZoneId.of(upperCase));
                    return i11;
                }
                c3451u.m7988e(ZoneId.m7862K(upperCase, ZoneOffset.ofTotalSeconds((int) c3451u2.m7987d(ChronoField.OFFSET_SECONDS).longValue())));
                return iMo7962C;
            } catch (C3401c unused) {
                return ~i10;
            }
        }
        c3451u.m7988e(ZoneId.of(upperCase));
        return i11;
    }

    public final String toString() {
        return this.f18196b;
    }
}
