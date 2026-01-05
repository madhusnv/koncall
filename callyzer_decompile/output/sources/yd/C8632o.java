package yd;

import b00.AbstractC0517b;
import b00.AbstractC0532q;
import b00.InterfaceC0528m;
import b00.a0;
import b00.d0;
import java.io.Closeable;
import ke.AbstractC4066g;
import pg.k8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.o */
/* loaded from: classes.dex */
public final class C8632o extends AbstractC8633p {

    /* renamed from: a */
    public final a0 f41906a;

    /* renamed from: b */
    public final AbstractC0532q f41907b;

    /* renamed from: c */
    public final String f41908c;

    /* renamed from: d */
    public final Closeable f41909d;

    /* renamed from: e */
    public boolean f41910e;

    /* renamed from: f */
    public d0 f41911f;

    public C8632o(a0 a0Var, AbstractC0532q abstractC0532q, String str, Closeable closeable) {
        this.f41906a = a0Var;
        this.f41907b = abstractC0532q;
        this.f41908c = str;
        this.f41909d = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f41910e = true;
            d0 d0Var = this.f41911f;
            if (d0Var != null) {
                AbstractC4066g.m8840a(d0Var);
            }
            Closeable closeable = this.f41909d;
            if (closeable != null) {
                AbstractC4066g.m8840a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yd.AbstractC8633p
    /* renamed from: h */
    public final k8 mo15961h() {
        return null;
    }

    @Override // yd.AbstractC8633p
    /* renamed from: j */
    public final synchronized InterfaceC0528m mo15962j() {
        if (this.f41910e) {
            throw new IllegalStateException("closed");
        }
        d0 d0Var = this.f41911f;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0VarM1524c = AbstractC0517b.m1524c(this.f41907b.mo1604S(this.f41906a));
        this.f41911f = d0VarM1524c;
        return d0VarM1524c;
    }
}
