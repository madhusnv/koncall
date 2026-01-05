package p001o;

import p001o.zaf;

/* loaded from: classes2.dex */
public final class uuf implements zaf {

    /* renamed from: a */
    public final long f49516a;

    /* renamed from: b */
    public final long f49517b;

    public uuf(long j) {
        this(j, 0L);
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        return new zaf.C18603a(new bbf(j, this.f49517b));
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f49516a;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }

    public uuf(long j, long j2) {
        this.f49516a = j;
        this.f49517b = j2;
    }
}
