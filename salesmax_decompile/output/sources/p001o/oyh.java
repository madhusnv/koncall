package p001o;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oyh implements gbg {

    /* renamed from: a */
    public final jyh f39080a;

    /* renamed from: b */
    public final long[] f39081b;

    /* renamed from: c */
    public final Map f39082c;

    /* renamed from: d */
    public final Map f39083d;

    /* renamed from: e */
    public final Map f39084e;

    public oyh(jyh jyhVar, Map map, Map map2, Map map3) {
        this.f39080a = jyhVar;
        this.f39083d = map2;
        this.f39084e = map3;
        this.f39082c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f39081b = jyhVar.m34733j();
    }

    @Override // p001o.gbg
    /* renamed from: a */
    public int mo21115a(long j) {
        int iM48725d = sqi.m48725d(this.f39081b, j, false, false);
        if (iM48725d < this.f39081b.length) {
            return iM48725d;
        }
        return -1;
    }

    @Override // p001o.gbg
    /* renamed from: c */
    public List mo21116c(long j) {
        return this.f39080a.m34731h(j, this.f39082c, this.f39083d, this.f39084e);
    }

    @Override // p001o.gbg
    /* renamed from: d */
    public long mo21117d(int i) {
        return this.f39081b[i];
    }

    @Override // p001o.gbg
    /* renamed from: e */
    public int mo21118e() {
        return this.f39081b.length;
    }
}
