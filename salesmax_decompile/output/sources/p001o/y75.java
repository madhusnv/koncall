package p001o;

/* loaded from: classes2.dex */
public final class y75 {

    /* renamed from: a */
    public int f55013a;

    /* renamed from: b */
    public int f55014b;

    /* renamed from: c */
    public int f55015c;

    /* renamed from: d */
    public int f55016d;

    /* renamed from: e */
    public int f55017e;

    /* renamed from: f */
    public int f55018f;

    /* renamed from: g */
    public int f55019g;

    /* renamed from: h */
    public int f55020h;

    /* renamed from: i */
    public int f55021i;

    /* renamed from: j */
    public int f55022j;

    /* renamed from: k */
    public long f55023k;

    /* renamed from: l */
    public int f55024l;

    /* renamed from: a */
    public void m57333a(long j) {
        m57334b(j, 1);
    }

    /* renamed from: b */
    public final void m57334b(long j, int i) {
        this.f55023k += j;
        this.f55024l += i;
    }

    /* renamed from: c */
    public synchronized void m57335c() {
    }

    public String toString() {
        return sqi.m48702G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f55013a), Integer.valueOf(this.f55014b), Integer.valueOf(this.f55015c), Integer.valueOf(this.f55016d), Integer.valueOf(this.f55017e), Integer.valueOf(this.f55018f), Integer.valueOf(this.f55019g), Integer.valueOf(this.f55020h), Integer.valueOf(this.f55021i), Integer.valueOf(this.f55022j), Long.valueOf(this.f55023k), Integer.valueOf(this.f55024l));
    }
}
