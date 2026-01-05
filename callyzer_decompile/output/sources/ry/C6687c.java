package ry;

import iz.C3382o;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5027g;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.connection.ConnectionException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import sy.C6966b;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ry.c */
/* loaded from: classes3.dex */
public final class C6687c extends OutputStream implements InterfaceC5027g {

    /* renamed from: a */
    public final C6966b f31984a;

    /* renamed from: b */
    public final C7833j f31985b;

    /* renamed from: c */
    public final C6689e f31986c;

    /* renamed from: d */
    public final C3382o f31987d = new C3382o(this);

    /* renamed from: e */
    public final byte[] f31988e = new byte[1];

    /* renamed from: f */
    public final AtomicBoolean f31989f = new AtomicBoolean(false);

    /* renamed from: g */
    public SSHException f31990g;

    public C6687c(C6966b c6966b, C7833j c7833j, C6689e c6689e) {
        this.f31984a = c6966b;
        this.f31985b = c7833j;
        this.f31986c = c6689e;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f31989f.getAndSet(true)) {
            C6966b c6966b = this.f31984a;
            ReentrantLock reentrantLock = c6966b.f33735k;
            reentrantLock.lock();
            try {
                if (c6966b.isOpen()) {
                    C3382o c3382o = this.f31987d;
                    c3382o.m7752f(((C5035o) c3382o.f17965c).f24777c - c3382o.f17964b, false);
                    C7833j c7833j = this.f31985b;
                    C5035o c5035o = new C5035o(EnumC5034n.CHANNEL_EOF);
                    c5035o.m9918m(this.f31984a.f33732g);
                    c7833j.m14819i(c5035o);
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        if (!this.f31989f.get() && this.f31984a.isOpen()) {
            C3382o c3382o = this.f31987d;
            c3382o.m7752f(((C5035o) c3382o.f17965c).f24777c - c3382o.f17964b, true);
        }
        SSHException sSHException = this.f31990g;
        if (sSHException == null) {
            throw new ConnectionException("Stream closed");
        }
        throw sSHException;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5027g
    /* renamed from: j */
    public final synchronized void mo5499j(SSHException sSHException) {
        this.f31990g = sSHException;
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f31984a.f33731f, " >", new StringBuilder("< ChannelOutputStream for Channel #"));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        byte[] bArr = this.f31988e;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        int iMin;
        if (!this.f31989f.get() && this.f31984a.isOpen()) {
            while (i11 > 0) {
                C3382o c3382o = this.f31987d;
                C5035o c5035o = (C5035o) c3382o.f17965c;
                int i12 = c5035o.f24777c - c3382o.f17964b;
                int i13 = ((C6687c) c3382o.f17968f).f31986c.f31996c;
                if (i12 >= i13) {
                    c3382o.m7752f(i12, true);
                    iMin = 0;
                } else {
                    iMin = Math.min(i11, i13 - i12);
                    c5035o.m9914i(i10, iMin, bArr);
                }
                i10 += iMin;
                i11 -= iMin;
            }
        }
        SSHException sSHException = this.f31990g;
        if (sSHException != null) {
            throw sSHException;
        }
        throw new ConnectionException("Stream closed");
    }
}
