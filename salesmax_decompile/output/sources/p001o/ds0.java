package p001o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.common.C2181a;
import java.nio.ByteBuffer;
import p001o.ds0;
import p001o.m1b;

/* loaded from: classes2.dex */
public final class ds0 implements m1b {

    /* renamed from: a */
    public final MediaCodec f20454a;

    /* renamed from: b */
    public final is0 f20455b;

    /* renamed from: c */
    public final o1b f20456c;

    /* renamed from: d */
    public boolean f20457d;

    /* renamed from: e */
    public int f20458e;

    /* renamed from: o.ds0$b */
    public static final class C13023b implements m1b.InterfaceC15199b {

        /* renamed from: a */
        public final hdg f20459a;

        /* renamed from: b */
        public final hdg f20460b;

        /* renamed from: c */
        public boolean f20461c;

        public C13023b(final int i) {
            this(new hdg() { // from class: o.es0
                @Override // p001o.hdg
                public final Object get() {
                    return ds0.C13023b.m23736f(i);
                }
            }, new hdg() { // from class: o.fs0
                @Override // p001o.hdg
                public final Object get() {
                    return ds0.C13023b.m23737g(i);
                }
            });
        }

        /* renamed from: f */
        public static /* synthetic */ HandlerThread m23736f(int i) {
            return new HandlerThread(ds0.m23714t(i));
        }

        /* renamed from: g */
        public static /* synthetic */ HandlerThread m23737g(int i) {
            return new HandlerThread(ds0.m23715u(i));
        }

        /* renamed from: h */
        public static boolean m23738h(C2181a c2181a) {
            int i = sqi.f45790a;
            if (i < 34) {
                return false;
            }
            return i >= 35 || xeb.m56189q(c2181a.f7943n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [o.ds0$a] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.ds0] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // p001o.m1b.InterfaceC15199b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ds0 mo16985a(m1b.C15198a c15198a) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            int i;
            o1b gs0Var;
            ds0 ds0Var;
            String str = c15198a.f34636a.f41088a;
            ?? r1 = 0;
            r1 = 0;
            try {
                gth.m29480a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    i = c15198a.f34641f;
                    if (this.f20461c && m23738h(c15198a.f34638c)) {
                        gs0Var = new lhg(mediaCodecCreateByCodecName);
                        i |= 4;
                    } else {
                        gs0Var = new gs0(mediaCodecCreateByCodecName, (HandlerThread) this.f20460b.get());
                    }
                    ds0Var = new ds0(mediaCodecCreateByCodecName, (HandlerThread) this.f20459a.get(), gs0Var);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                gth.m29481b();
                ds0Var.m23733w(c15198a.f34637b, c15198a.f34639d, c15198a.f34640e, i);
                return ds0Var;
            } catch (Exception e3) {
                e = e3;
                r1 = ds0Var;
                if (r1 != 0) {
                    r1.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }

        /* renamed from: e */
        public void m23740e(boolean z) {
            this.f20461c = z;
        }

        public C13023b(hdg hdgVar, hdg hdgVar2) {
            this.f20459a = hdgVar;
            this.f20460b = hdgVar2;
            this.f20461c = true;
        }
    }

    /* renamed from: t */
    public static String m23714t(int i) {
        return m23716v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: u */
    public static String m23715u(int i) {
        return m23716v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: v */
    public static String m23716v(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m23717x(m1b.InterfaceC15201d interfaceC15201d, MediaCodec mediaCodec, long j, long j2) {
        interfaceC15201d.mo36457a(this, j, j2);
    }

    @Override // p001o.m1b
    /* renamed from: a */
    public void mo23718a(int i, int i2, int i3, long j, int i4) {
        this.f20456c.mo29434a(i, i2, i3, j, i4);
    }

    @Override // p001o.m1b
    /* renamed from: b */
    public void mo23719b(Bundle bundle) {
        this.f20456c.mo29435b(bundle);
    }

    @Override // p001o.m1b
    /* renamed from: c */
    public void mo23720c(int i, int i2, xc4 xc4Var, long j, int i3) {
        this.f20456c.mo29436c(i, i2, xc4Var, j, i3);
    }

    @Override // p001o.m1b
    /* renamed from: d */
    public void mo23721d(final m1b.InterfaceC15201d interfaceC15201d, Handler handler) {
        this.f20454a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.cs0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f18567a.m23717x(interfaceC15201d, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p001o.m1b
    /* renamed from: e */
    public MediaFormat mo23722e() {
        return this.f20455b.m32658g();
    }

    @Override // p001o.m1b
    /* renamed from: f */
    public void mo23723f(int i) {
        this.f20454a.setVideoScalingMode(i);
    }

    @Override // p001o.m1b
    public void flush() {
        this.f20456c.flush();
        this.f20454a.flush();
        this.f20455b.m32656e();
        this.f20454a.start();
    }

    @Override // p001o.m1b
    /* renamed from: g */
    public ByteBuffer mo23724g(int i) {
        return this.f20454a.getInputBuffer(i);
    }

    @Override // p001o.m1b
    /* renamed from: h */
    public void mo23725h(Surface surface) {
        this.f20454a.setOutputSurface(surface);
    }

    @Override // p001o.m1b
    /* renamed from: i */
    public boolean mo23726i() {
        return false;
    }

    @Override // p001o.m1b
    /* renamed from: j */
    public boolean mo23727j(m1b.InterfaceC15200c interfaceC15200c) {
        this.f20455b.m32667p(interfaceC15200c);
        return true;
    }

    @Override // p001o.m1b
    /* renamed from: k */
    public void mo23728k(int i, long j) {
        this.f20454a.releaseOutputBuffer(i, j);
    }

    @Override // p001o.m1b
    /* renamed from: l */
    public int mo23729l() {
        this.f20456c.mo29437d();
        return this.f20455b.m32654c();
    }

    @Override // p001o.m1b
    /* renamed from: m */
    public int mo23730m(MediaCodec.BufferInfo bufferInfo) {
        this.f20456c.mo29437d();
        return this.f20455b.m32655d(bufferInfo);
    }

    @Override // p001o.m1b
    /* renamed from: n */
    public void mo23731n(int i, boolean z) {
        this.f20454a.releaseOutputBuffer(i, z);
    }

    @Override // p001o.m1b
    /* renamed from: o */
    public ByteBuffer mo23732o(int i) {
        return this.f20454a.getOutputBuffer(i);
    }

    @Override // p001o.m1b
    public void release() {
        try {
            if (this.f20458e == 1) {
                this.f20456c.shutdown();
                this.f20455b.m32668q();
            }
            this.f20458e = 2;
            if (this.f20457d) {
                return;
            }
            try {
                int i = sqi.f45790a;
                if (i >= 30 && i < 33) {
                    this.f20454a.stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f20457d) {
                try {
                    int i2 = sqi.f45790a;
                    if (i2 >= 30 && i2 < 33) {
                        this.f20454a.stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    /* renamed from: w */
    public final void m23733w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f20455b.m32659h(this.f20454a);
        gth.m29480a("configureCodec");
        this.f20454a.configure(mediaFormat, surface, mediaCrypto, i);
        gth.m29481b();
        this.f20456c.start();
        gth.m29480a("startCodec");
        this.f20454a.start();
        gth.m29481b();
        this.f20458e = 1;
    }

    public ds0(MediaCodec mediaCodec, HandlerThread handlerThread, o1b o1bVar) {
        this.f20454a = mediaCodec;
        this.f20455b = new is0(handlerThread);
        this.f20456c = o1bVar;
        this.f20458e = 0;
    }
}
