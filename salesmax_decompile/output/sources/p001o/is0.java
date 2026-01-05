package p001o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p001o.m1b;

/* loaded from: classes2.dex */
public final class is0 extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f29173b;

    /* renamed from: c */
    public Handler f29174c;

    /* renamed from: h */
    public MediaFormat f29179h;

    /* renamed from: i */
    public MediaFormat f29180i;

    /* renamed from: j */
    public MediaCodec.CodecException f29181j;

    /* renamed from: k */
    public MediaCodec.CryptoException f29182k;

    /* renamed from: l */
    public long f29183l;

    /* renamed from: m */
    public boolean f29184m;

    /* renamed from: n */
    public IllegalStateException f29185n;

    /* renamed from: o */
    public m1b.InterfaceC15200c f29186o;

    /* renamed from: a */
    public final Object f29172a = new Object();

    /* renamed from: d */
    public final z93 f29175d = new z93();

    /* renamed from: e */
    public final z93 f29176e = new z93();

    /* renamed from: f */
    public final ArrayDeque f29177f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f29178g = new ArrayDeque();

    public is0(HandlerThread handlerThread) {
        this.f29173b = handlerThread;
    }

    /* renamed from: b */
    public final void m32653b(MediaFormat mediaFormat) {
        this.f29176e.m58966a(-2);
        this.f29178g.add(mediaFormat);
    }

    /* renamed from: c */
    public int m32654c() {
        synchronized (this.f29172a) {
            m32661j();
            int iM58970e = -1;
            if (m32660i()) {
                return -1;
            }
            if (!this.f29175d.m58969d()) {
                iM58970e = this.f29175d.m58970e();
            }
            return iM58970e;
        }
    }

    /* renamed from: d */
    public int m32655d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f29172a) {
            m32661j();
            if (m32660i()) {
                return -1;
            }
            if (this.f29176e.m58969d()) {
                return -1;
            }
            int iM58970e = this.f29176e.m58970e();
            if (iM58970e >= 0) {
                op0.m42519i(this.f29179h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f29177f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iM58970e == -2) {
                this.f29179h = (MediaFormat) this.f29178g.remove();
            }
            return iM58970e;
        }
    }

    /* renamed from: e */
    public void m32656e() {
        synchronized (this.f29172a) {
            this.f29183l++;
            ((Handler) sqi.m48729h(this.f29174c)).post(new Runnable() { // from class: o.hs0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27416a.m32665n();
                }
            });
        }
    }

    /* renamed from: f */
    public final void m32657f() {
        if (!this.f29178g.isEmpty()) {
            this.f29180i = (MediaFormat) this.f29178g.getLast();
        }
        this.f29175d.m58967b();
        this.f29176e.m58967b();
        this.f29177f.clear();
        this.f29178g.clear();
    }

    /* renamed from: g */
    public MediaFormat m32658g() {
        MediaFormat mediaFormat;
        synchronized (this.f29172a) {
            mediaFormat = this.f29179h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m32659h(MediaCodec mediaCodec) {
        op0.m42517g(this.f29174c == null);
        this.f29173b.start();
        Handler handler = new Handler(this.f29173b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f29174c = handler;
    }

    /* renamed from: i */
    public final boolean m32660i() {
        return this.f29183l > 0 || this.f29184m;
    }

    /* renamed from: j */
    public final void m32661j() {
        m32662k();
        m32664m();
        m32663l();
    }

    /* renamed from: k */
    public final void m32662k() {
        IllegalStateException illegalStateException = this.f29185n;
        if (illegalStateException == null) {
            return;
        }
        this.f29185n = null;
        throw illegalStateException;
    }

    /* renamed from: l */
    public final void m32663l() {
        MediaCodec.CryptoException cryptoException = this.f29182k;
        if (cryptoException == null) {
            return;
        }
        this.f29182k = null;
        throw cryptoException;
    }

    /* renamed from: m */
    public final void m32664m() {
        MediaCodec.CodecException codecException = this.f29181j;
        if (codecException == null) {
            return;
        }
        this.f29181j = null;
        throw codecException;
    }

    /* renamed from: n */
    public final void m32665n() {
        synchronized (this.f29172a) {
            if (this.f29184m) {
                return;
            }
            long j = this.f29183l - 1;
            this.f29183l = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                m32666o(new IllegalStateException());
            } else {
                m32657f();
            }
        }
    }

    /* renamed from: o */
    public final void m32666o(IllegalStateException illegalStateException) {
        synchronized (this.f29172a) {
            this.f29185n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f29172a) {
            this.f29182k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f29172a) {
            this.f29181j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f29172a) {
            this.f29175d.m58966a(i);
            m1b.InterfaceC15200c interfaceC15200c = this.f29186o;
            if (interfaceC15200c != null) {
                interfaceC15200c.mo38181a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f29172a) {
            MediaFormat mediaFormat = this.f29180i;
            if (mediaFormat != null) {
                m32653b(mediaFormat);
                this.f29180i = null;
            }
            this.f29176e.m58966a(i);
            this.f29177f.add(bufferInfo);
            m1b.InterfaceC15200c interfaceC15200c = this.f29186o;
            if (interfaceC15200c != null) {
                interfaceC15200c.mo38182b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f29172a) {
            m32653b(mediaFormat);
            this.f29180i = null;
        }
    }

    /* renamed from: p */
    public void m32667p(m1b.InterfaceC15200c interfaceC15200c) {
        synchronized (this.f29172a) {
            this.f29186o = interfaceC15200c;
        }
    }

    /* renamed from: q */
    public void m32668q() {
        synchronized (this.f29172a) {
            this.f29184m = true;
            this.f29173b.quit();
            m32657f();
        }
    }
}
