package p001o;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class lhg implements o1b {

    /* renamed from: a */
    public final MediaCodec f33866a;

    public lhg(MediaCodec mediaCodec) {
        this.f33866a = mediaCodec;
    }

    @Override // p001o.o1b
    /* renamed from: a */
    public void mo29434a(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.f33866a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p001o.o1b
    /* renamed from: b */
    public void mo29435b(Bundle bundle) {
        this.f33866a.setParameters(bundle);
    }

    @Override // p001o.o1b
    /* renamed from: c */
    public void mo29436c(int i, int i2, xc4 xc4Var, long j, int i3) throws MediaCodec.CryptoException {
        this.f33866a.queueSecureInputBuffer(i, i2, xc4Var.m55966a(), j, i3);
    }

    @Override // p001o.o1b
    /* renamed from: d */
    public void mo29437d() {
    }

    @Override // p001o.o1b
    public void flush() {
    }

    @Override // p001o.o1b
    public void shutdown() {
    }

    @Override // p001o.o1b
    public void start() {
    }
}
