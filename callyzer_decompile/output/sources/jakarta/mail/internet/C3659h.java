package jakarta.mail.internet;

import a1.C0005d;
import com.sun.mail.util.MailLogger;
import java.text.ParsePosition;
import java.util.logging.Level;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.h */
/* loaded from: classes3.dex */
public final class C3659h extends C0005d {

    /* renamed from: e */
    public Boolean f19359e;

    @Override // a1.C0005d
    /* renamed from: D */
    public final boolean mo37D(int i10) {
        return true;
    }

    @Override // a1.C0005d
    /* renamed from: L */
    public final int mo44L() {
        i0();
        return m42J(1, 3, false);
    }

    @Override // a1.C0005d
    /* renamed from: O */
    public final void mo47O() {
        i0();
    }

    @Override // a1.C0005d
    /* renamed from: P */
    public final void mo48P() throws java.text.ParseException {
        Boolean bool = this.f19359e;
        if (bool == null) {
            this.f19359e = Boolean.valueOf(!h0('-'));
            i0();
        } else if (bool.booleanValue()) {
            i0();
        } else {
            m43K('-');
        }
    }

    @Override // a1.C0005d
    /* renamed from: Q */
    public final int mo49Q() {
        return m42J(1, 2, false);
    }

    @Override // a1.C0005d
    /* renamed from: R */
    public final int mo50R() {
        return m42J(1, 2, false);
    }

    @Override // a1.C0005d
    /* renamed from: S */
    public final int mo51S() {
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        while (parsePosition.getIndex() < ((String) this.f24b).length() && !m56X()) {
            parsePosition.setIndex(parsePosition.getIndex() + 1);
        }
        return -1;
    }

    @Override // a1.C0005d
    /* renamed from: T */
    public final int mo52T() {
        return m42J(1, 2, false);
    }

    @Override // a1.C0005d
    /* renamed from: U */
    public final int mo53U() throws java.text.ParseException {
        int iM42J = m42J(1, 8, false);
        return iM42J >= 1000 ? iM42J : iM42J >= 50 ? iM42J + 1900 : iM42J + 2000;
    }

    @Override // a1.C0005d
    /* renamed from: V */
    public final int mo54V() throws java.text.ParseException {
        int i10;
        String str = (String) this.f24b;
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        try {
        } catch (java.text.ParseException e2) {
            MailLogger mailLogger = C3660i.f19360a;
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                mailLogger.log(level, AbstractC5601a.m11238i("No timezone? : '", str, "'"), (Throwable) e2);
            }
        }
        if (parsePosition.getIndex() >= str.length()) {
            throw new java.text.ParseException("Missing zone", parsePosition.getIndex());
        }
        if (!(parsePosition.getIndex() < str.length() && str.charAt(parsePosition.getIndex()) == '+')) {
            if (!(parsePosition.getIndex() < str.length() && str.charAt(parsePosition.getIndex()) == '-')) {
                if (!g0(Matrix.MATRIX_TYPE_RANDOM_UT, 'u', 'T', 't')) {
                    if (g0('G', 'g', 'M', 'm')) {
                        if (!f0('T', 't')) {
                            parsePosition.setIndex(parsePosition.getIndex() - 2);
                        }
                    }
                    if (f0('E', 'e')) {
                        i10 = 4;
                    } else if (f0('C', 'c')) {
                        i10 = 5;
                    } else if (f0('M', 'm')) {
                        i10 = 6;
                    } else {
                        if (!f0('P', 'p')) {
                            throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
                        }
                        i10 = 7;
                    }
                    if (g0('S', 's', 'T', 't')) {
                        i10++;
                    } else if (!g0('D', 'd', 'T', 't')) {
                        parsePosition.setIndex(parsePosition.getIndex() - 1);
                        throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
                    }
                    return i10 * 60;
                }
                return 0;
            }
        }
        return m55W();
    }

    @Override // a1.C0005d
    /* renamed from: Y */
    public final boolean mo57Y() {
        String str = (String) this.f24b;
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        if (super.mo57Y()) {
            return true;
        }
        return parsePosition.getIndex() < str.length() && str.charAt(parsePosition.getIndex()) == '\n';
    }

    @Override // a1.C0005d
    public final boolean i0() {
        char cCharAt;
        String str = (String) this.f24b;
        ParsePosition parsePosition = (ParsePosition) this.f25c;
        boolean zMo57Y = mo57Y();
        while (parsePosition.getIndex() < str.length() && ((cCharAt = str.charAt(parsePosition.getIndex())) == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ')) {
            parsePosition.setIndex(parsePosition.getIndex() + 1);
        }
        return zMo57Y;
    }
}
