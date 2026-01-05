package p001o;

import android.os.SystemClock;
import p001o.ab2;
import p001o.sse;

/* loaded from: classes2.dex */
public final class ia2 implements sse.InterfaceC16911b {

    /* renamed from: a */
    public final int f28317a;

    /* renamed from: b */
    public final int f28318b;

    /* renamed from: c */
    public final long f28319c;

    /* renamed from: d */
    public final Throwable f28320d;

    public ia2(long j, int i, Throwable th) {
        this.f28319c = SystemClock.elapsedRealtime() - j;
        this.f28318b = i;
        if (th instanceof ab2.C12130b) {
            this.f28317a = 2;
            this.f28320d = th;
            return;
        }
        if (!(th instanceof li8)) {
            this.f28317a = 0;
            this.f28320d = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.f28320d = th;
        if (th instanceof va2) {
            this.f28317a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.f28317a = 1;
        } else {
            this.f28317a = 0;
        }
    }

    @Override // p001o.sse.InterfaceC16911b
    /* renamed from: a */
    public long mo31785a() {
        return this.f28319c;
    }

    @Override // p001o.sse.InterfaceC16911b
    public Throwable getCause() {
        return this.f28320d;
    }

    @Override // p001o.sse.InterfaceC16911b
    public int getStatus() {
        return this.f28317a;
    }
}
