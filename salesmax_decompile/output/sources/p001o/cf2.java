package p001o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class cf2 implements gbg {

    /* renamed from: a */
    public final List f18023a;

    public cf2(List list) {
        this.f18023a = list;
    }

    @Override // p001o.gbg
    /* renamed from: a */
    public int mo21115a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p001o.gbg
    /* renamed from: c */
    public List mo21116c(long j) {
        return j >= 0 ? this.f18023a : Collections.emptyList();
    }

    @Override // p001o.gbg
    /* renamed from: d */
    public long mo21117d(int i) {
        op0.m42511a(i == 0);
        return 0L;
    }

    @Override // p001o.gbg
    /* renamed from: e */
    public int mo21118e() {
        return 1;
    }
}
