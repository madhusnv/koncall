package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class zd1 implements k1b {

    /* renamed from: b */
    public final long f56967b;

    /* renamed from: c */
    public final long f56968c;

    /* renamed from: d */
    public long f56969d;

    public zd1(long j, long j2) {
        this.f56967b = j;
        this.f56968c = j2;
        m59219f();
    }

    /* renamed from: c */
    public final void m59216c() {
        long j = this.f56969d;
        if (j < this.f56967b || j > this.f56968c) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final long m59217d() {
        return this.f56969d;
    }

    /* renamed from: e */
    public boolean m59218e() {
        return this.f56969d > this.f56968c;
    }

    /* renamed from: f */
    public void m59219f() {
        this.f56969d = this.f56967b - 1;
    }

    @Override // p001o.k1b
    public boolean next() {
        this.f56969d++;
        return !m59218e();
    }
}
