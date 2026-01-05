package hc;

import java.io.File;
import wc.C7976j;
import wc.e0;
import xc.C8326g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hc.k */
/* loaded from: classes.dex */
public final class C2888k extends AbstractC2879b {

    /* renamed from: a */
    public final File f15914a;

    /* renamed from: b */
    public final long f15915b;

    /* renamed from: c */
    public final long f15916c;

    public C2888k(File file, long j6, long j10) {
        this.f15914a = file;
        this.f15915b = j6;
        this.f15916c = j10;
    }

    @Override // hc.AbstractC2880c
    /* renamed from: a */
    public final Long mo6995a() {
        return Long.valueOf((this.f15916c - this.f15915b) + 1);
    }

    @Override // hc.AbstractC2880c
    /* renamed from: b */
    public final boolean mo6996b() {
        return false;
    }

    @Override // hc.AbstractC2879b
    /* renamed from: c */
    public final e0 mo6994c() {
        return new C8326g(new C7976j(this.f15914a, this.f15915b, this.f15916c));
    }
}
