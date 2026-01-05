package ry;

import ch.C0972b;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.CircularBuffer$CircularBufferException;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5027g;
import net.schmizz.sshj.common.SSHException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import sy.C6966b;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ry.b */
/* loaded from: classes3.dex */
public final class C6686b extends InputStream implements InterfaceC5027g {

    /* renamed from: a */
    public final InterfaceC2173b f31976a;

    /* renamed from: b */
    public final C6966b f31977b;

    /* renamed from: c */
    public final C7833j f31978c;

    /* renamed from: d */
    public final C6688d f31979d;

    /* renamed from: e */
    public final C0972b f31980e;

    /* renamed from: f */
    public final byte[] f31981f = new byte[1];

    /* renamed from: g */
    public boolean f31982g;

    /* renamed from: h */
    public SSHException f31983h;

    public C6686b(C6966b c6966b, C7833j c7833j, C6688d c6688d) {
        int i10 = 1;
        this.f31977b = c6966b;
        c6966b.f33726a.getClass();
        this.f31976a = AbstractC2175d.m5852b(C6686b.class);
        this.f31978c = c7833j;
        this.f31979d = c6688d;
        int i11 = c6966b.f33739p.f31996c;
        c7833j.f37569d.getClass();
        C0972b c0972b = new C0972b(5);
        int iMin = 16777216;
        if (i11 > 16777216) {
            throw new IllegalArgumentException(String.format("Initial requested size %d larger than maximum size %d", Integer.valueOf(i11), 16777216));
        }
        while (true) {
            if (i10 >= i11) {
                iMin = Math.min(i10, 16777216);
                break;
            } else {
                i10 <<= 1;
                if (i10 <= 0) {
                    break;
                }
            }
        }
        c0972b.f5785d = new byte[iMin];
        c0972b.f5783b = 0;
        c0972b.f5784c = 0;
        this.f31980e = c0972b;
    }

    @Override // java.io.InputStream
    public final int available() {
        int iM2743l;
        synchronized (this.f31980e) {
            iM2743l = this.f31980e.m2743l();
        }
        return iM2743l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m12825n();
    }

    /* renamed from: h */
    public final void m12824h() {
        long j6;
        long j10;
        C0972b c0972b = this.f31980e;
        int length = (c0972b.f5783b - c0972b.f5784c) - 1;
        if (length < 0) {
            length += ((byte[]) c0972b.f5785d).length;
        }
        long length2 = (length + 16777216) - ((byte[]) c0972b.f5785d).length;
        C6688d c6688d = this.f31979d;
        synchronized (c6688d.f31995b) {
            j6 = c6688d.f31997d;
        }
        long j11 = length2 - j6;
        C6688d c6688d2 = this.f31979d;
        synchronized (c6688d2.f31995b) {
            try {
                long j12 = c6688d2.f31997d;
                j10 = j12 <= c6688d2.f31992f ? c6688d2.f31991e - j12 : 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long jMin = Math.min(j10, j11);
        if (jMin > 0) {
            this.f31976a.mo5828d("Sending SSH_MSG_CHANNEL_WINDOW_ADJUST to #{} for {} bytes", Integer.valueOf(this.f31977b.f33732g), Long.valueOf(jMin));
            C7833j c7833j = this.f31978c;
            C5035o c5035o = new C5035o(EnumC5034n.CHANNEL_WINDOW_ADJUST);
            c5035o.m9919n(this.f31977b.f33732g);
            c5035o.m9918m(jMin);
            c7833j.m14819i(c5035o);
            this.f31979d.m12827b(jMin);
        }
    }

    @Override // net.schmizz.sshj.common.InterfaceC5027g
    /* renamed from: j */
    public final synchronized void mo5499j(SSHException sSHException) {
        this.f31983h = sSHException;
        m12825n();
    }

    /* renamed from: n */
    public final void m12825n() {
        synchronized (this.f31980e) {
            try {
                if (!this.f31982g) {
                    this.f31982g = true;
                    this.f31980e.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10;
        synchronized (this.f31981f) {
            i10 = -1;
            if (read(this.f31981f, 0, 1) != -1) {
                i10 = this.f31981f[0] & 255;
            }
        }
        return i10;
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f31977b.f33731f, " >", new StringBuilder("< ChannelInputStream for Channel #"));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        synchronized (this.f31980e) {
            while (this.f31980e.m2743l() <= 0) {
                try {
                    if (this.f31982g) {
                        SSHException sSHException = this.f31983h;
                        if (sSHException == null) {
                            return -1;
                        }
                        throw sSHException;
                    }
                    try {
                        this.f31980e.wait();
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw ((IOException) new InterruptedIOException().initCause(e2));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i11 > this.f31980e.m2743l()) {
                i11 = this.f31980e.m2743l();
            }
            C0972b c0972b = this.f31980e;
            if (c0972b.m2743l() >= i11) {
                int i12 = c0972b.f5783b;
                int i13 = i12 + i11;
                byte[] bArr2 = (byte[]) c0972b.f5785d;
                if (i13 <= bArr2.length) {
                    System.arraycopy(bArr2, i12, bArr, i10, i11);
                } else {
                    int length = bArr2.length - i12;
                    System.arraycopy(bArr2, i12, bArr, i10, length);
                    int i14 = i11 - length;
                    System.arraycopy((byte[]) c0972b.f5785d, 0, bArr, i10 + length, i14);
                    i13 = i14;
                }
                c0972b.f5783b = i13;
                this.f31977b.getClass();
                m12824h();
                return i11;
            }
            throw new CircularBuffer$CircularBufferException("Underflow");
        }
    }
}
