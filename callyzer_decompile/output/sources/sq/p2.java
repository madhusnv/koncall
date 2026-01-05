package sq;

import g2.h4;
import g2.z9;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p2 implements z9 {

    /* renamed from: a */
    public final /* synthetic */ int f33131a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f33132b;

    public /* synthetic */ p2(k2.w0 w0Var, int i10) {
        this.f33131a = i10;
        this.f33132b = w0Var;
    }

    @Override // g2.z9
    /* renamed from: a */
    public final boolean mo1460a(long j6) {
        switch (this.f33131a) {
            case 0:
                Long lM6170e = ((h4) this.f33132b.getValue()).m6170e();
                AbstractC4154l.m8920c(lM6170e);
                long jLongValue = lM6170e.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jLongValue < jCurrentTimeMillis) {
                    long j10 = jCurrentTimeMillis % 1;
                    if (j10 < 0) {
                        j10++;
                    }
                    long j11 = jLongValue % 1;
                    if (j11 < 0) {
                        j11++;
                    }
                    long j12 = (j10 - j11) % 1;
                    if (j12 < 0) {
                        j12++;
                    }
                    jCurrentTimeMillis -= j12;
                }
                if (jLongValue > j6 || j6 > jCurrentTimeMillis) {
                }
                break;
            default:
                Long lM6170e2 = ((h4) this.f33132b.getValue()).m6170e();
                AbstractC4154l.m8920c(lM6170e2);
                long jLongValue2 = lM6170e2.longValue();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jLongValue2 < jCurrentTimeMillis2) {
                    long j13 = jCurrentTimeMillis2 % 1;
                    if (j13 < 0) {
                        j13++;
                    }
                    long j14 = jLongValue2 % 1;
                    if (j14 < 0) {
                        j14++;
                    }
                    long j15 = (j13 - j14) % 1;
                    if (j15 < 0) {
                        j15++;
                    }
                    jCurrentTimeMillis2 -= j15;
                }
                if (jLongValue2 > j6 || j6 > jCurrentTimeMillis2) {
                }
                break;
        }
        return false;
    }
}
