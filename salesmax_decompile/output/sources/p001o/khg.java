package p001o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p001o.m1b;

/* loaded from: classes2.dex */
public final class khg implements m1b {

    /* renamed from: a */
    public final MediaCodec f32257a;

    /* renamed from: b */
    public ByteBuffer[] f32258b;

    /* renamed from: c */
    public ByteBuffer[] f32259c;

    /* renamed from: o.khg$b */
    public static class C14838b implements m1b.InterfaceC15199b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.khg$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p001o.m1b.InterfaceC15199b
        /* renamed from: a */
        public m1b mo16985a(m1b.C15198a c15198a) throws Throwable {
            MediaCodec mediaCodecM35721b;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                mediaCodecM35721b = m35721b(c15198a);
            } catch (IOException e) {
                e = e;
            } catch (RuntimeException e2) {
                e = e2;
            }
            try {
                gth.m29480a("configureCodec");
                mediaCodecM35721b.configure(c15198a.f34637b, c15198a.f34639d, c15198a.f34640e, c15198a.f34641f);
                gth.m29481b();
                gth.m29480a("startCodec");
                mediaCodecM35721b.start();
                gth.m29481b();
                return new khg(mediaCodecM35721b);
            } catch (IOException | RuntimeException e3) {
                e = e3;
                mediaCodec = mediaCodecM35721b;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        /* renamed from: b */
        public MediaCodec m35721b(m1b.C15198a c15198a) throws IOException {
            op0.m42515e(c15198a.f34636a);
            String str = c15198a.f34636a.f41088a;
            gth.m29480a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            gth.m29481b();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m35720q(m1b.InterfaceC15201d interfaceC15201d, MediaCodec mediaCodec, long j, long j2) {
        interfaceC15201d.mo36457a(this, j, j2);
    }

    @Override // p001o.m1b
    /* renamed from: a */
    public void mo23718a(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.f32257a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p001o.m1b
    /* renamed from: b */
    public void mo23719b(Bundle bundle) {
        this.f32257a.setParameters(bundle);
    }

    @Override // p001o.m1b
    /* renamed from: c */
    public void mo23720c(int i, int i2, xc4 xc4Var, long j, int i3) throws MediaCodec.CryptoException {
        this.f32257a.queueSecureInputBuffer(i, i2, xc4Var.m55966a(), j, i3);
    }

    @Override // p001o.m1b
    /* renamed from: d */
    public void mo23721d(final m1b.InterfaceC15201d interfaceC15201d, Handler handler) {
        this.f32257a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.jhg
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f30459a.m35720q(interfaceC15201d, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p001o.m1b
    /* renamed from: e */
    public MediaFormat mo23722e() {
        return this.f32257a.getOutputFormat();
    }

    @Override // p001o.m1b
    /* renamed from: f */
    public void mo23723f(int i) {
        this.f32257a.setVideoScalingMode(i);
    }

    @Override // p001o.m1b
    public void flush() {
        this.f32257a.flush();
    }

    @Override // p001o.m1b
    /* renamed from: g */
    public ByteBuffer mo23724g(int i) {
        return sqi.f45790a >= 21 ? this.f32257a.getInputBuffer(i) : ((ByteBuffer[]) sqi.m48729h(this.f32258b))[i];
    }

    @Override // p001o.m1b
    /* renamed from: h */
    public void mo23725h(Surface surface) {
        this.f32257a.setOutputSurface(surface);
    }

    @Override // p001o.m1b
    /* renamed from: i */
    public boolean mo23726i() {
        return false;
    }

    @Override // p001o.m1b
    /* renamed from: k */
    public void mo23728k(int i, long j) {
        this.f32257a.releaseOutputBuffer(i, j);
    }

    @Override // p001o.m1b
    /* renamed from: l */
    public int mo23729l() {
        return this.f32257a.dequeueInputBuffer(0L);
    }

    @Override // p001o.m1b
    /* renamed from: m */
    public int mo23730m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f32257a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && sqi.f45790a < 21) {
                this.f32259c = this.f32257a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p001o.m1b
    /* renamed from: n */
    public void mo23731n(int i, boolean z) {
        this.f32257a.releaseOutputBuffer(i, z);
    }

    @Override // p001o.m1b
    /* renamed from: o */
    public ByteBuffer mo23732o(int i) {
        return sqi.f45790a >= 21 ? this.f32257a.getOutputBuffer(i) : ((ByteBuffer[]) sqi.m48729h(this.f32259c))[i];
    }

    @Override // p001o.m1b
    public void release() {
        this.f32258b = null;
        this.f32259c = null;
        try {
            int i = sqi.f45790a;
            if (i >= 30 && i < 33) {
                this.f32257a.stop();
            }
        } finally {
            this.f32257a.release();
        }
    }

    public khg(MediaCodec mediaCodec) {
        this.f32257a = mediaCodec;
        if (sqi.f45790a < 21) {
            this.f32258b = mediaCodec.getInputBuffers();
            this.f32259c = mediaCodec.getOutputBuffers();
        }
    }
}
