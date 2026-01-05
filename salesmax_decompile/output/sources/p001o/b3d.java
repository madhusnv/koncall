package p001o;

/* loaded from: classes6.dex */
public final class b3d implements lzf {

    /* renamed from: a */
    public final im1 f15513a;

    /* renamed from: b */
    public final rl1 f15514b;

    /* renamed from: c */
    public hbf f15515c;

    /* renamed from: d */
    public int f15516d;

    /* renamed from: e */
    public boolean f15517e;

    /* renamed from: f */
    public long f15518f;

    public b3d(im1 im1Var) {
        sq8.m48649h(im1Var, "upstream");
        this.f15513a = im1Var;
        rl1 buffer = im1Var.getBuffer();
        this.f15514b = buffer;
        hbf hbfVar = buffer.f43757a;
        this.f15515c = hbfVar;
        this.f15516d = hbfVar != null ? hbfVar.f26588b : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // p001o.lzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long N0(rl1 rl1Var, long j) {
        hbf hbfVar;
        sq8.m48649h(rl1Var, "sink");
        boolean z = false;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f15517e)) {
            throw new IllegalStateException("closed".toString());
        }
        hbf hbfVar2 = this.f15515c;
        if (hbfVar2 == null) {
            z = true;
        } else {
            hbf hbfVar3 = this.f15514b.f43757a;
            if (hbfVar2 == hbfVar3) {
                int i = this.f15516d;
                sq8.m48646e(hbfVar3);
                if (i == hbfVar3.f26588b) {
                }
            }
        }
        if (!z) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f15513a.request(this.f15518f + 1)) {
            return -1L;
        }
        if (this.f15515c == null && (hbfVar = this.f15514b.f43757a) != null) {
            this.f15515c = hbfVar;
            sq8.m48646e(hbfVar);
            this.f15516d = hbfVar.f26588b;
        }
        long jMin = Math.min(j, this.f15514b.f0() - this.f15518f);
        this.f15514b.m46915g(rl1Var, this.f15518f, jMin);
        this.f15518f += jMin;
        return jMin;
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15517e = true;
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f15513a.timeout();
    }
}
