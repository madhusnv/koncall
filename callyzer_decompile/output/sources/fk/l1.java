package fk;

import com.sun.mail.imap.IMAPStore;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 {
    public static final k1 Companion = new k1();

    /* renamed from: a */
    public final long f10453a;

    /* renamed from: b */
    public final long f10454b;

    /* renamed from: c */
    public final long f10455c;

    public /* synthetic */ l1(int i10, long j6, long j10, long j11) {
        if (1 != (i10 & 1)) {
            jy.n0.m8426g(i10, 1, j1.f10443a.getDescriptor());
            throw null;
        }
        this.f10453a = j6;
        this.f10454b = (i10 & 2) == 0 ? IMAPStore.RESPONSE * j6 : j10;
        if ((i10 & 4) == 0) {
            this.f10455c = j6 / IMAPStore.RESPONSE;
        } else {
            this.f10455c = j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && this.f10453a == ((l1) obj).f10453a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10453a);
    }

    public final String toString() {
        return "Time(ms=" + this.f10453a + ')';
    }

    public l1(long j6) {
        this.f10453a = j6;
        long j10 = IMAPStore.RESPONSE;
        this.f10454b = j6 * j10;
        this.f10455c = j6 / j10;
    }
}
