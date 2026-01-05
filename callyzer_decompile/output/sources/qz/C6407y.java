package qz;

import b00.C0526k;
import b00.InterfaceC0527l;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import mm.AbstractC4801l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.y */
/* loaded from: classes3.dex */
public final class C6407y implements Closeable {

    /* renamed from: f */
    public static final Logger f30910f = Logger.getLogger(AbstractC6390h.class.getName());

    /* renamed from: a */
    public final InterfaceC0527l f30911a;

    /* renamed from: b */
    public final C0526k f30912b;

    /* renamed from: c */
    public int f30913c;

    /* renamed from: d */
    public boolean f30914d;

    /* renamed from: e */
    public final C6388f f30915e;

    public C6407y(InterfaceC0527l sink) {
        AbstractC4154l.m8923f(sink, "sink");
        this.f30911a = sink;
        C0526k c0526k = new C0526k();
        this.f30912b = c0526k;
        this.f30913c = 16384;
        this.f30915e = new C6388f(c0526k);
    }

    /* renamed from: A */
    public final void m12411A(int i10, EnumC6384b errorCode) {
        AbstractC4154l.m8923f(errorCode, "errorCode");
        synchronized (this) {
            if (this.f30914d) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m12415n(i10, 4, 3, 0);
            this.f30911a.writeInt(errorCode.getHttpCode());
            this.f30911a.flush();
        }
    }

    /* renamed from: H */
    public final void m12412H(int i10, long j6) {
        synchronized (this) {
            try {
                if (this.f30914d) {
                    throw new IOException("closed");
                }
                if (j6 == 0 || j6 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
                }
                Logger logger = f30910f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC6390h.m12385c(false, i10, 4, j6));
                }
                m12415n(i10, 4, 8, 0);
                this.f30911a.writeInt((int) j6);
                this.f30911a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f30914d = true;
            this.f30911a.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f30914d) {
                throw new IOException("closed");
            }
            this.f30911a.flush();
        }
    }

    /* renamed from: h */
    public final void m12413h(b0 peerSettings) {
        AbstractC4154l.m8923f(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f30914d) {
                    throw new IOException("closed");
                }
                int i10 = this.f30913c;
                int i11 = peerSettings.f30791a;
                if ((i11 & 32) != 0) {
                    i10 = peerSettings.f30792b[5];
                }
                this.f30913c = i10;
                if (((i11 & 2) != 0 ? peerSettings.f30792b[1] : -1) != -1) {
                    C6388f c6388f = this.f30915e;
                    int i12 = (i11 & 2) != 0 ? peerSettings.f30792b[1] : -1;
                    c6388f.getClass();
                    int iMin = Math.min(i12, 16384);
                    int i13 = c6388f.f30813d;
                    if (i13 != iMin) {
                        if (iMin < i13) {
                            c6388f.f30811b = Math.min(c6388f.f30811b, iMin);
                        }
                        c6388f.f30812c = true;
                        c6388f.f30813d = iMin;
                        int i14 = c6388f.f30817h;
                        if (iMin < i14) {
                            if (iMin == 0) {
                                C6386d[] c6386dArr = c6388f.f30814e;
                                AbstractC6662l.m12726p(c6386dArr, 0, c6386dArr.length, null);
                                c6388f.f30815f = c6388f.f30814e.length - 1;
                                c6388f.f30816g = 0;
                                c6388f.f30817h = 0;
                            } else {
                                c6388f.m12377a(i14 - iMin);
                            }
                        }
                    }
                }
                m12415n(0, 0, 4, 1);
                this.f30911a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m12414j(boolean z6, int i10, C0526k c0526k, int i11) {
        synchronized (this) {
            if (this.f30914d) {
                throw new IOException("closed");
            }
            m12415n(i10, i11, 0, z6 ? 1 : 0);
            if (i11 > 0) {
                InterfaceC0527l interfaceC0527l = this.f30911a;
                AbstractC4154l.m8920c(c0526k);
                interfaceC0527l.h0(c0526k, i11);
            }
        }
    }

    /* renamed from: n */
    public final void m12415n(int i10, int i11, int i12, int i13) {
        if (i12 != 8) {
            Level level = Level.FINE;
            Logger logger = f30910f;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC6390h.m12384b(false, i10, i11, i12, i13));
            }
        }
        if (i11 > this.f30913c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f30913c + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC4297c.f21703a;
        InterfaceC0527l interfaceC0527l = this.f30911a;
        AbstractC4154l.m8923f(interfaceC0527l, "<this>");
        interfaceC0527l.writeByte((i11 >>> 16) & 255);
        interfaceC0527l.writeByte((i11 >>> 8) & 255);
        interfaceC0527l.writeByte(i11 & 255);
        interfaceC0527l.writeByte(i12 & 255);
        interfaceC0527l.writeByte(i13 & 255);
        interfaceC0527l.writeInt(i10 & Integer.MAX_VALUE);
    }

    /* renamed from: u */
    public final void m12416u(int i10, EnumC6384b errorCode, byte[] bArr) {
        AbstractC4154l.m8923f(errorCode, "errorCode");
        synchronized (this) {
            if (this.f30914d) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m12415n(0, bArr.length + 8, 7, 0);
            this.f30911a.writeInt(i10);
            this.f30911a.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.f30911a.write(bArr);
            }
            this.f30911a.flush();
        }
    }

    /* renamed from: w */
    public final void m12417w(boolean z6, int i10, ArrayList arrayList) {
        synchronized (this) {
            if (this.f30914d) {
                throw new IOException("closed");
            }
            this.f30915e.m12380d(arrayList);
            long j6 = this.f30912b.f3638b;
            long jMin = Math.min(this.f30913c, j6);
            int i11 = j6 == jMin ? 4 : 0;
            if (z6) {
                i11 |= 1;
            }
            m12415n(i10, (int) jMin, 1, i11);
            this.f30911a.h0(this.f30912b, jMin);
            if (j6 > jMin) {
                long j10 = j6 - jMin;
                while (j10 > 0) {
                    long jMin2 = Math.min(this.f30913c, j10);
                    j10 -= jMin2;
                    m12415n(i10, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                    this.f30911a.h0(this.f30912b, jMin2);
                }
            }
        }
    }

    /* renamed from: z */
    public final void m12418z(int i10, int i11, boolean z6) {
        synchronized (this) {
            if (this.f30914d) {
                throw new IOException("closed");
            }
            m12415n(0, 8, 6, z6 ? 1 : 0);
            this.f30911a.writeInt(i10);
            this.f30911a.writeInt(i11);
            this.f30911a.flush();
        }
    }
}
