package qc;

import android.os.SystemClock;
import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.C7611u;
import wc.InterfaceC7989w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.y */
/* loaded from: classes.dex */
public final class C6179y implements InterfaceC7989w {

    /* renamed from: a */
    public final long f30135a;

    /* renamed from: b */
    public long f30136b;

    /* renamed from: c */
    public final Object f30137c;

    public C6179y(InterfaceC7989w chan, long j6) {
        AbstractC4154l.m8923f(chan, "chan");
        this.f30137c = chan;
        this.f30135a = j6;
    }

    /* renamed from: a */
    public int m12206a() {
        if (!((C7611u) this.f30137c).m14432c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f30136b == -1) {
            this.f30136b = jUptimeMillis;
        }
        long j6 = jUptimeMillis - this.f30136b;
        return j6 <= 120000 ? IMAPStore.RESPONSE : j6 <= 300000 ? 2000 : 4000;
    }

    /* renamed from: b */
    public int m12207b() {
        boolean zM14432c = ((C7611u) this.f30137c).m14432c();
        long j6 = this.f30135a;
        if (zM14432c) {
            if (j6 > 0) {
                return Math.min((int) j6, 1800000);
            }
            return 1800000;
        }
        if (j6 > 0) {
            return Math.min((int) j6, 10000);
        }
        return 10000;
    }

    @Override // wc.InterfaceC7989w
    public boolean cancel(Throwable th2) {
        return ((InterfaceC7989w) this.f30137c).cancel(th2);
    }

    @Override // wc.InterfaceC7989w
    public int getAvailableForRead() {
        return ((InterfaceC7989w) this.f30137c).getAvailableForRead();
    }

    @Override // wc.InterfaceC7989w
    public Throwable getClosedCause() {
        return ((InterfaceC7989w) this.f30137c).getClosedCause();
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForRead() {
        return ((InterfaceC7989w) this.f30137c).isClosedForRead();
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForWrite() {
        return ((InterfaceC7989w) this.f30137c).isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // wc.InterfaceC7989w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object read(wc.C7985s r6, long r7, uw.InterfaceC7559c r9) throws java.io.EOFException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f30137c
            wc.w r0 = (wc.InterfaceC7989w) r0
            boolean r1 = r9 instanceof qc.C6178x
            if (r1 == 0) goto L17
            r1 = r9
            qc.x r1 = (qc.C6178x) r1
            int r2 = r1.f30134c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f30134c = r2
            goto L1e
        L17:
            qc.x r1 = new qc.x
            ww.c r9 = (ww.AbstractC8193c) r9
            r1.<init>(r5, r9)
        L1e:
            java.lang.Object r9 = r1.f30132a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f30134c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            og.od.m10798c(r9)
            goto L41
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            og.od.m10798c(r9)
            r1.f30134c = r4
            java.lang.Object r9 = r0.read(r6, r7, r1)
            if (r9 != r2) goto L41
            return r2
        L41:
            r6 = r9
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            boolean r8 = r0.isClosedForRead()
            long r0 = r5.f30135a
            if (r8 != 0) goto L5b
            long r2 = r5.f30136b
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L57
            goto L5b
        L57:
            long r2 = r2 + r6
            r5.f30136b = r2
            return r9
        L5b:
            r2 = -1
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L66
            long r2 = r5.f30136b
            long r2 = r2 + r6
            r5.f30136b = r2
        L66:
            long r6 = r5.f30136b
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            og.yc.m11066b(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.C6179y.read(wc.s, long, uw.c):java.lang.Object");
    }

    public C6179y(C7611u c7611u, long j6) {
        this.f30137c = c7611u;
        this.f30136b = -1L;
        this.f30135a = j6;
    }
}
