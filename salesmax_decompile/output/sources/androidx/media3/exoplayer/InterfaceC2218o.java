package androidx.media3.exoplayer;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2217n;
import p001o.jb3;
import p001o.jbd;
import p001o.l1b;
import p001o.lmh;
import p001o.nke;
import p001o.t0f;
import p001o.x8b;

/* renamed from: androidx.media3.exoplayer.o */
/* loaded from: classes2.dex */
public interface InterfaceC2218o extends C2217n.b {

    /* renamed from: androidx.media3.exoplayer.o$a */
    public interface a {
        /* renamed from: a */
        void mo7253a();

        /* renamed from: b */
        void mo7254b();
    }

    /* renamed from: B */
    void mo6869B(nke nkeVar, C2181a[] c2181aArr, t0f t0fVar, long j, boolean z, boolean z2, long j2, long j3, x8b.C18076b c18076b);

    /* renamed from: C */
    default long mo7427C(long j, long j2) {
        return 10000L;
    }

    /* renamed from: E */
    InterfaceC2221p mo6870E();

    /* renamed from: H */
    default void mo7428H(float f, float f2) {
    }

    /* renamed from: K */
    long mo6873K();

    /* renamed from: L */
    void mo6874L(int i, jbd jbdVar, jb3 jb3Var);

    /* renamed from: M */
    void mo6875M(long j);

    /* renamed from: N */
    l1b mo6876N();

    /* renamed from: b */
    boolean mo7429b();

    /* renamed from: c */
    default void mo7430c() {
    }

    void disable();

    /* renamed from: f */
    int mo6888f();

    /* renamed from: g */
    void mo7431g(long j, long j2);

    String getName();

    int getState();

    t0f getStream();

    /* renamed from: i */
    boolean mo6890i();

    boolean isReady();

    /* renamed from: l */
    void mo6891l(C2181a[] c2181aArr, t0f t0fVar, long j, long j2, x8b.C18076b c18076b);

    /* renamed from: m */
    void mo6892m();

    /* renamed from: q */
    void mo6893q(lmh lmhVar);

    void release();

    void reset();

    void start();

    void stop();

    /* renamed from: v */
    void mo6895v();

    /* renamed from: y */
    boolean mo6896y();
}
