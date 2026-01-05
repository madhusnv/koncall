package j$.time.format;

import j$.time.C3401c;
import j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.i */
/* loaded from: classes2.dex */
public class C3439i implements InterfaceC3435e {

    /* renamed from: f */
    public static final long[] f18159f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    public final TemporalField f18160a;

    /* renamed from: b */
    public final int f18161b;

    /* renamed from: c */
    public final int f18162c;

    /* renamed from: d */
    public final SignStyle f18163d;

    /* renamed from: e */
    public final int f18164e;

    /* renamed from: a */
    public long mo7969a(C3453w c3453w, long j6) {
        return j6;
    }

    public C3439i(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        this.f18160a = temporalField;
        this.f18161b = i10;
        this.f18162c = i11;
        this.f18163d = signStyle;
        this.f18164e = 0;
    }

    public C3439i(TemporalField temporalField, int i10, int i11, SignStyle signStyle, int i12) {
        this.f18160a = temporalField;
        this.f18161b = i10;
        this.f18162c = i11;
        this.f18163d = signStyle;
        this.f18164e = i12;
    }

    /* renamed from: d */
    public C3439i mo7965d() {
        if (this.f18164e == -1) {
            return this;
        }
        return new C3439i(this.f18160a, this.f18161b, this.f18162c, this.f18163d, -1);
    }

    /* renamed from: e */
    public C3439i mo7966e(int i10) {
        return new C3439i(this.f18160a, this.f18161b, this.f18162c, this.f18163d, this.f18164e + i10);
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        TemporalField temporalField = this.f18160a;
        Long lM7991a = c3453w.m7991a(temporalField);
        if (lM7991a == null) {
            return false;
        }
        long jMo7969a = mo7969a(c3453w, lM7991a.longValue());
        DecimalStyle decimalStyle = c3453w.f18212b.f18113c;
        String string = jMo7969a == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jMo7969a));
        int length = string.length();
        int i10 = this.f18162c;
        if (length > i10) {
            throw new C3401c("Field " + temporalField + " cannot be printed as the value " + jMo7969a + " exceeds the maximum print width of " + i10);
        }
        String strM7949a = decimalStyle.m7949a(string);
        int i11 = this.f18161b;
        SignStyle signStyle = this.f18163d;
        if (jMo7969a >= 0) {
            int i12 = AbstractC3432b.f18144a[signStyle.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jMo7969a >= f18159f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = AbstractC3432b.f18144a[signStyle.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append(decimalStyle.f18129b);
            } else if (i13 == 4) {
                throw new C3401c("Field " + temporalField + " cannot be printed as the value " + jMo7969a + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - strM7949a.length(); i14++) {
            sb2.append(decimalStyle.f18128a);
        }
        sb2.append(strM7949a);
        return true;
    }

    /* renamed from: b */
    public boolean mo7964b(C3451u c3451u) {
        int i10 = this.f18164e;
        if (i10 != -1) {
            return i10 > 0 && this.f18161b == this.f18162c && this.f18163d == SignStyle.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0169, code lost:
    
        if (r7 <= r11) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0192  */
    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo7962C(j$.time.format.C3451u r29, java.lang.CharSequence r30, int r31) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C3439i.mo7962C(j$.time.format.u, java.lang.CharSequence, int):int");
    }

    /* renamed from: c */
    public int mo7970c(C3451u c3451u, long j6, int i10, int i11) {
        return c3451u.m7989f(this.f18160a, j6, i10, i11);
    }

    public String toString() {
        int i10 = this.f18162c;
        TemporalField temporalField = this.f18160a;
        SignStyle signStyle = this.f18163d;
        int i11 = this.f18161b;
        if (i11 == 1 && i10 == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i11 == i10 && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i11 + ")";
        }
        return "Value(" + temporalField + "," + i11 + "," + i10 + "," + signStyle + ")";
    }
}
