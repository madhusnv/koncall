package p001o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class edf extends ibf {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f21460e;

    public edf(long j, edf edfVar, int i) {
        super(j, edfVar, i);
        this.f21460e = new AtomicReferenceArray(ddf.f19624f);
    }

    @Override // p001o.ibf
    /* renamed from: r */
    public int mo24826r() {
        return ddf.f19624f;
    }

    @Override // p001o.ibf
    /* renamed from: s */
    public void mo24827s(int i, Throwable th, q74 q74Var) {
        m24828v().set(i, ddf.f19623e);
        m31890t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f28439c + ", hashCode=" + hashCode() + ']';
    }

    /* renamed from: v */
    public final /* synthetic */ AtomicReferenceArray m24828v() {
        return this.f21460e;
    }
}
