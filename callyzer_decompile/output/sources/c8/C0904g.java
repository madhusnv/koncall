package c8;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4427a;
import m8.C4680j;
import pg.a9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.g */
/* loaded from: classes.dex */
public final class C0904g extends AbstractC0905h {

    /* renamed from: d */
    public final C4680j f5566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904g(InterfaceC4427a db2, String sql) {
        super(db2, sql);
        AbstractC4154l.m8923f(db2, "db");
        AbstractC4154l.m8923f(sql, "sql");
        this.f5566d = db2.mo9264t(sql);
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: B */
    public final void mo1776B(int i10, String value) {
        AbstractC4154l.m8923f(value, "value");
        m2545h();
        this.f5566d.mo9278q(i10, value);
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: W */
    public final String mo1777W(int i10) {
        m2545h();
        a9.m11540c(21, "no row");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5566d.close();
        this.f5569c = true;
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: g */
    public final void mo1778g(int i10, long j6) {
        m2545h();
        this.f5566d.mo9276g(i10, j6);
    }

    @Override // k8.InterfaceC4026c
    public final int getColumnCount() {
        m2545h();
        return 0;
    }

    @Override // k8.InterfaceC4026c
    public final String getColumnName(int i10) {
        m2545h();
        a9.m11540c(21, "no row");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    public final long getLong(int i10) {
        m2545h();
        a9.m11540c(21, "no row");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: i */
    public final void mo1779i(int i10) {
        m2545h();
        this.f5566d.mo9277i(i10);
    }

    @Override // k8.InterfaceC4026c
    public final boolean isNull(int i10) {
        m2545h();
        a9.m11540c(21, "no row");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    public final boolean r0() {
        m2545h();
        this.f5566d.f23137b.execute();
        return false;
    }

    @Override // k8.InterfaceC4026c
    public final void reset() {
    }
}
