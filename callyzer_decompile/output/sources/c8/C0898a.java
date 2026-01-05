package c8;

import java.io.IOException;
import java.util.Locale;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4427a;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.a */
/* loaded from: classes.dex */
public final class C0898a implements InterfaceC4024a {

    /* renamed from: a */
    public final InterfaceC4427a f5551a;

    public C0898a(InterfaceC4427a db2) {
        AbstractC4154l.m8923f(db2, "db");
        this.f5551a = db2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5551a.close();
    }

    @Override // k8.InterfaceC4024a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final AbstractC0905h y0(String sql) {
        String strSubstring;
        int i10;
        AbstractC4154l.m8923f(sql, "sql");
        InterfaceC4427a db2 = this.f5551a;
        AbstractC4154l.m8923f(db2, "db");
        String upperCase = AbstractC5178p.g0(sql).toString().toUpperCase(Locale.ROOT);
        AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i11 = -1;
        if (length >= 0) {
            int iM10098I = 0;
            loop0: while (iM10098I < length) {
                char cCharAt = upperCase.charAt(iM10098I);
                if (AbstractC4154l.m8924g(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iM10098I2 = iM10098I + 1;
                            if (upperCase.charAt(iM10098I2) == '*') {
                                do {
                                    iM10098I2 = AbstractC5178p.m10098I(upperCase, '*', iM10098I2 + 1, 4);
                                    if (iM10098I2 >= 0) {
                                        i10 = iM10098I2 + 1;
                                        if (i10 >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i10) != '/');
                                iM10098I = iM10098I2 + 2;
                            }
                        }
                        i11 = iM10098I;
                        break;
                    }
                    if (upperCase.charAt(iM10098I + 1) == '-') {
                        iM10098I = AbstractC5178p.m10098I(upperCase, '\n', iM10098I + 2, 4);
                        if (iM10098I < 0) {
                            break;
                        }
                    } else {
                        i11 = iM10098I;
                        break;
                    }
                }
                iM10098I++;
            }
        }
        if (i11 < 0 || i11 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i11, Math.min(i11 + 3, upperCase.length()));
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new C0904g(db2, sql);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new C0904g(db2, sql);
        }
        C0903f c0903f = new C0903f(db2, sql);
        c0903f.f5560d = new int[0];
        c0903f.f5561e = new long[0];
        c0903f.f5562f = new double[0];
        c0903f.f5563g = new String[0];
        c0903f.f5564h = new byte[0][];
        return c0903f;
    }
}
