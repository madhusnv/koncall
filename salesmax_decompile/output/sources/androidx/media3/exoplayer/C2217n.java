package androidx.media3.exoplayer;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p001o.jb3;
import p001o.lmh;
import p001o.op0;

/* renamed from: androidx.media3.exoplayer.n */
/* loaded from: classes2.dex */
public final class C2217n {

    /* renamed from: a */
    public final b f8480a;

    /* renamed from: b */
    public final a f8481b;

    /* renamed from: c */
    public final jb3 f8482c;

    /* renamed from: d */
    public final lmh f8483d;

    /* renamed from: e */
    public int f8484e;

    /* renamed from: f */
    public Object f8485f;

    /* renamed from: g */
    public Looper f8486g;

    /* renamed from: h */
    public int f8487h;

    /* renamed from: i */
    public long f8488i = -9223372036854775807L;

    /* renamed from: j */
    public boolean f8489j = true;

    /* renamed from: k */
    public boolean f8490k;

    /* renamed from: l */
    public boolean f8491l;

    /* renamed from: m */
    public boolean f8492m;

    /* renamed from: n */
    public boolean f8493n;

    /* renamed from: androidx.media3.exoplayer.n$a */
    public interface a {
        /* renamed from: d */
        void mo7239d(C2217n c2217n);
    }

    /* renamed from: androidx.media3.exoplayer.n$b */
    public interface b {
        /* renamed from: u */
        void mo6894u(int i, Object obj);
    }

    public C2217n(a aVar, b bVar, lmh lmhVar, int i, jb3 jb3Var, Looper looper) {
        this.f8481b = aVar;
        this.f8480a = bVar;
        this.f8483d = lmhVar;
        this.f8486g = looper;
        this.f8482c = jb3Var;
        this.f8487h = i;
    }

    /* renamed from: a */
    public synchronized boolean m7413a(long j) {
        boolean z;
        op0.m42517g(this.f8490k);
        op0.m42517g(this.f8486g.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.f8482c.elapsedRealtime() + j;
        while (true) {
            z = this.f8492m;
            if (z || j <= 0) {
                break;
            }
            this.f8482c.mo21306c();
            wait(j);
            j = jElapsedRealtime - this.f8482c.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f8491l;
    }

    /* renamed from: b */
    public boolean m7414b() {
        return this.f8489j;
    }

    /* renamed from: c */
    public Looper m7415c() {
        return this.f8486g;
    }

    /* renamed from: d */
    public int m7416d() {
        return this.f8487h;
    }

    /* renamed from: e */
    public Object m7417e() {
        return this.f8485f;
    }

    /* renamed from: f */
    public long m7418f() {
        return this.f8488i;
    }

    /* renamed from: g */
    public b m7419g() {
        return this.f8480a;
    }

    /* renamed from: h */
    public lmh m7420h() {
        return this.f8483d;
    }

    /* renamed from: i */
    public int m7421i() {
        return this.f8484e;
    }

    /* renamed from: j */
    public synchronized boolean m7422j() {
        return this.f8493n;
    }

    /* renamed from: k */
    public synchronized void m7423k(boolean z) {
        this.f8491l = z | this.f8491l;
        this.f8492m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C2217n m7424l() {
        op0.m42517g(!this.f8490k);
        if (this.f8488i == -9223372036854775807L) {
            op0.m42511a(this.f8489j);
        }
        this.f8490k = true;
        this.f8481b.mo7239d(this);
        return this;
    }

    /* renamed from: m */
    public C2217n m7425m(Object obj) {
        op0.m42517g(!this.f8490k);
        this.f8485f = obj;
        return this;
    }

    /* renamed from: n */
    public C2217n m7426n(int i) {
        op0.m42517g(!this.f8490k);
        this.f8484e = i;
        return this;
    }
}
