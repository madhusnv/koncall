package p001o;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class gs0 implements o1b {

    /* renamed from: g */
    public static final ArrayDeque f25747g = new ArrayDeque();

    /* renamed from: h */
    public static final Object f25748h = new Object();

    /* renamed from: a */
    public final MediaCodec f25749a;

    /* renamed from: b */
    public final HandlerThread f25750b;

    /* renamed from: c */
    public Handler f25751c;

    /* renamed from: d */
    public final AtomicReference f25752d;

    /* renamed from: e */
    public final jq3 f25753e;

    /* renamed from: f */
    public boolean f25754f;

    /* renamed from: o.gs0$a */
    public class HandlerC13820a extends Handler {
        public HandlerC13820a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws MediaCodec.CryptoException {
            gs0.this.m29439j(message);
        }
    }

    /* renamed from: o.gs0$b */
    public static class C13821b {

        /* renamed from: a */
        public int f25756a;

        /* renamed from: b */
        public int f25757b;

        /* renamed from: c */
        public int f25758c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f25759d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f25760e;

        /* renamed from: f */
        public int f25761f;

        /* renamed from: a */
        public void m29444a(int i, int i2, int i3, long j, int i4) {
            this.f25756a = i;
            this.f25757b = i2;
            this.f25758c = i3;
            this.f25760e = j;
            this.f25761f = i4;
        }
    }

    public gs0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new jq3());
    }

    /* renamed from: g */
    public static void m29429g(xc4 xc4Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = xc4Var.f53490f;
        cryptoInfo.numBytesOfClearData = m29431i(xc4Var.f53488d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m29431i(xc4Var.f53489e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) op0.m42515e(m29430h(xc4Var.f53486b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) op0.m42515e(m29430h(xc4Var.f53485a, cryptoInfo.iv));
        cryptoInfo.mode = xc4Var.f53487c;
        if (sqi.f45790a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(xc4Var.f53491g, xc4Var.f53492h));
        }
    }

    /* renamed from: h */
    public static byte[] m29430h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: i */
    public static int[] m29431i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: o */
    public static C13821b m29432o() {
        ArrayDeque arrayDeque = f25747g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C13821b();
            }
            return (C13821b) arrayDeque.removeFirst();
        }
    }

    /* renamed from: p */
    public static void m29433p(C13821b c13821b) {
        ArrayDeque arrayDeque = f25747g;
        synchronized (arrayDeque) {
            arrayDeque.add(c13821b);
        }
    }

    @Override // p001o.o1b
    /* renamed from: a */
    public void mo29434a(int i, int i2, int i3, long j, int i4) {
        mo29437d();
        C13821b c13821bM29432o = m29432o();
        c13821bM29432o.m29444a(i, i2, i3, j, i4);
        ((Handler) sqi.m48729h(this.f25751c)).obtainMessage(1, c13821bM29432o).sendToTarget();
    }

    @Override // p001o.o1b
    /* renamed from: b */
    public void mo29435b(Bundle bundle) {
        mo29437d();
        ((Handler) sqi.m48729h(this.f25751c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p001o.o1b
    /* renamed from: c */
    public void mo29436c(int i, int i2, xc4 xc4Var, long j, int i3) {
        mo29437d();
        C13821b c13821bM29432o = m29432o();
        c13821bM29432o.m29444a(i, i2, 0, j, i3);
        m29429g(xc4Var, c13821bM29432o.f25759d);
        ((Handler) sqi.m48729h(this.f25751c)).obtainMessage(2, c13821bM29432o).sendToTarget();
    }

    @Override // p001o.o1b
    /* renamed from: d */
    public void mo29437d() {
        RuntimeException runtimeException = (RuntimeException) this.f25752d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* renamed from: f */
    public final void m29438f() {
        this.f25753e.m34268c();
        ((Handler) op0.m42515e(this.f25751c)).obtainMessage(3).sendToTarget();
        this.f25753e.m34266a();
    }

    @Override // p001o.o1b
    public void flush() {
        if (this.f25754f) {
            try {
                m29443n();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: j */
    public final void m29439j(Message message) throws MediaCodec.CryptoException {
        C13821b c13821b;
        int i = message.what;
        if (i == 1) {
            c13821b = (C13821b) message.obj;
            m29440k(c13821b.f25756a, c13821b.f25757b, c13821b.f25758c, c13821b.f25760e, c13821b.f25761f);
        } else if (i != 2) {
            c13821b = null;
            if (i == 3) {
                this.f25753e.m34270e();
            } else if (i != 4) {
                ec3.m24748a(this.f25752d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                m29442m((Bundle) message.obj);
            }
        } else {
            c13821b = (C13821b) message.obj;
            m29441l(c13821b.f25756a, c13821b.f25757b, c13821b.f25759d, c13821b.f25760e, c13821b.f25761f);
        }
        if (c13821b != null) {
            m29433p(c13821b);
        }
    }

    /* renamed from: k */
    public final void m29440k(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        try {
            this.f25749a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            ec3.m24748a(this.f25752d, null, e);
        }
    }

    /* renamed from: l */
    public final void m29441l(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f25748h) {
                this.f25749a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            ec3.m24748a(this.f25752d, null, e);
        }
    }

    /* renamed from: m */
    public final void m29442m(Bundle bundle) {
        try {
            this.f25749a.setParameters(bundle);
        } catch (RuntimeException e) {
            ec3.m24748a(this.f25752d, null, e);
        }
    }

    /* renamed from: n */
    public final void m29443n() {
        ((Handler) op0.m42515e(this.f25751c)).removeCallbacksAndMessages(null);
        m29438f();
    }

    @Override // p001o.o1b
    public void shutdown() {
        if (this.f25754f) {
            flush();
            this.f25750b.quit();
        }
        this.f25754f = false;
    }

    @Override // p001o.o1b
    public void start() {
        if (this.f25754f) {
            return;
        }
        this.f25750b.start();
        this.f25751c = new HandlerC13820a(this.f25750b.getLooper());
        this.f25754f = true;
    }

    public gs0(MediaCodec mediaCodec, HandlerThread handlerThread, jq3 jq3Var) {
        this.f25749a = mediaCodec;
        this.f25750b = handlerThread;
        this.f25753e = jq3Var;
        this.f25752d = new AtomicReference();
    }
}
