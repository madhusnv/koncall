package zd;

import b00.AbstractC0533r;
import b00.C0526k;
import b00.h0;
import java.io.EOFException;
import java.io.IOException;
import zc.C8932i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zd.e */
/* loaded from: classes.dex */
public final class C8941e extends AbstractC0533r {

    /* renamed from: b */
    public final C8932i f42943b;

    /* renamed from: c */
    public boolean f42944c;

    public C8941e(h0 h0Var, C8932i c8932i) {
        super(h0Var);
        this.f42943b = c8932i;
    }

    @Override // b00.AbstractC0533r, b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        try {
            super.close();
        } catch (IOException e2) {
            this.f42944c = true;
            this.f42943b.invoke(e2);
        }
    }

    @Override // b00.AbstractC0533r, b00.h0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e2) {
            this.f42944c = true;
            this.f42943b.invoke(e2);
        }
    }

    @Override // b00.AbstractC0533r, b00.h0
    public final void h0(C0526k c0526k, long j6) throws EOFException {
        if (this.f42944c) {
            c0526k.skip(j6);
            return;
        }
        try {
            super.h0(c0526k, j6);
        } catch (IOException e2) {
            this.f42944c = true;
            this.f42943b.invoke(e2);
        }
    }
}
