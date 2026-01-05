package b00;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.t */
/* loaded from: classes3.dex */
public final class C0535t extends k0 {

    /* renamed from: e */
    public k0 f3666e;

    public C0535t(k0 delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f3666e = delegate;
    }

    @Override // b00.k0
    /* renamed from: a */
    public final k0 mo1596a() {
        return this.f3666e.mo1596a();
    }

    @Override // b00.k0
    /* renamed from: b */
    public final k0 mo1597b() {
        return this.f3666e.mo1597b();
    }

    @Override // b00.k0
    /* renamed from: c */
    public final long mo1598c() {
        return this.f3666e.mo1598c();
    }

    @Override // b00.k0
    /* renamed from: d */
    public final k0 mo1583d(long j6) {
        return this.f3666e.mo1583d(j6);
    }

    @Override // b00.k0
    /* renamed from: e */
    public final boolean mo1599e() {
        return this.f3666e.mo1599e();
    }

    @Override // b00.k0
    /* renamed from: f */
    public final void mo1584f() throws InterruptedIOException {
        this.f3666e.mo1584f();
    }

    @Override // b00.k0
    /* renamed from: g */
    public final k0 mo1585g(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        AbstractC4154l.m8923f(unit, "unit");
        return this.f3666e.mo1585g(j6);
    }
}
