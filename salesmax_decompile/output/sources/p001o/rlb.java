package p001o;

import p001o.fmh;

/* loaded from: classes6.dex */
public final class rlb implements fmh.InterfaceC13490b {

    /* renamed from: a */
    public static final rlb f43779a = new rlb();

    /* renamed from: b */
    public static final long f43780b = System.nanoTime();

    @Override // p001o.fmh.InterfaceC13490b, p001o.fmh
    /* renamed from: a */
    public /* bridge */ /* synthetic */ dk3 mo27091a() {
        return fmh.C13489a.a.m27093d(m46945e());
    }

    /* renamed from: b */
    public final long m46942b(long j, long j2) {
        return fmh.C13489a.a.m27094g(pla.m43839c(j, o16.NANOSECONDS, j2));
    }

    /* renamed from: c */
    public final long m46943c(long j, long j2) {
        return pla.m43843g(j, j2, o16.NANOSECONDS);
    }

    /* renamed from: d */
    public final long m46944d(long j) {
        return pla.m43841e(m46946f(), j, o16.NANOSECONDS);
    }

    /* renamed from: e */
    public long m46945e() {
        return fmh.C13489a.a.m27094g(m46946f());
    }

    /* renamed from: f */
    public final long m46946f() {
        return System.nanoTime() - f43780b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // p001o.fmh
    /* renamed from: a */
    public /* bridge */ /* synthetic */ ulh mo27091a() {
        return fmh.C13489a.a.m27093d(m46945e());
    }
}
