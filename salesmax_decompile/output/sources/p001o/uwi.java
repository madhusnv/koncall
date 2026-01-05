package p001o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class uwi {

    /* renamed from: a */
    public List f49582a;

    /* renamed from: b */
    public boolean f49583b;

    public uwi(List list, boolean z) {
        sq8.m48649h(list, "items");
        this.f49582a = list;
        this.f49583b = z;
    }

    /* renamed from: a */
    public final boolean m52093a() {
        return this.f49583b;
    }

    /* renamed from: b */
    public final List m52094b() {
        return this.f49582a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uwi(List list, boolean z, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            list = Collections.emptyList();
            sq8.m48648g(list, "emptyList(...)");
        }
        this(list, (i & 2) != 0 ? true : z);
    }
}
