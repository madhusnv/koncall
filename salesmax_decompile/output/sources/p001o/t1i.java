package p001o;

import com.google.firebase.perf.util.Constants;
import java.util.Random;

/* loaded from: classes5.dex */
public class t1i {

    /* renamed from: h */
    public static final vja f46237h = yja.m57896k(t1i.class);

    /* renamed from: a */
    public final Random f46238a;

    /* renamed from: b */
    public final r1i f46239b;

    /* renamed from: c */
    public int f46240c;

    /* renamed from: d */
    public long f46241d;

    /* renamed from: e */
    public long f46242e;

    /* renamed from: f */
    public long f46243f;

    /* renamed from: g */
    public int f46244g;

    public t1i(Random random, wmh wmhVar) {
        this(random, wmhVar, new r1i());
    }

    /* renamed from: d */
    public static void m49175d(long j, long j2) throws InterruptedException {
        long j3 = j2 / 100;
        long j4 = 2;
        if (j3 < 2) {
            j4 = 1;
        } else if (j3 >= 10) {
            j4 = j3 < 600 ? 3L : 5L;
        }
        f46237h.mo20738k("Need to wait for {} milliseconds; virtual clock advanced too far in the future", Long.valueOf(j4));
        long j5 = j + j4;
        int i = 0;
        while (true) {
            try {
                Thread.sleep(j4);
            } catch (InterruptedException unused) {
            }
            i++;
            if (i > 50 || System.currentTimeMillis() >= j5) {
                return;
            } else {
                j4 = 1;
            }
        }
    }

    /* renamed from: a */
    public int m49176a() {
        return this.f46240c & 65535;
    }

    /* renamed from: b */
    public synchronized long m49177b() {
        long j;
        long jM46057a = this.f46239b.m46057a();
        if (jM46057a < this.f46241d) {
            f46237h.mo20728a("System time going backwards! (got value {}, last {}", Long.valueOf(jM46057a), Long.valueOf(this.f46241d));
            this.f46241d = jM46057a;
        }
        long j2 = this.f46242e;
        if (jM46057a <= j2) {
            if (this.f46244g >= 10000) {
                long j3 = j2 - jM46057a;
                j2++;
                f46237h.warn("Timestamp over-run: need to reinitialize random sequence");
                m49178c(this.f46238a);
                if (j3 >= 100) {
                    m49175d(jM46057a, j3);
                }
            }
            jM46057a = j2;
        } else {
            this.f46244g &= Constants.MAX_HOST_LENGTH;
        }
        this.f46242e = jM46057a;
        int i = this.f46244g;
        j = (jM46057a * 10000) + 122192928000000000L + i;
        this.f46244g = i + 1;
        return j;
    }

    /* renamed from: c */
    public final void m49178c(Random random) {
        int iNextInt = random.nextInt();
        this.f46240c = iNextInt;
        this.f46244g = (iNextInt >> 16) & Constants.MAX_HOST_LENGTH;
    }

    public t1i(Random random, wmh wmhVar, r1i r1iVar) {
        this.f46241d = 0L;
        this.f46242e = 0L;
        this.f46243f = Long.MAX_VALUE;
        this.f46244g = 0;
        this.f46238a = random;
        this.f46239b = r1iVar;
        m49178c(random);
        this.f46241d = 0L;
        this.f46242e = 0L;
        this.f46243f = 0L;
    }
}
