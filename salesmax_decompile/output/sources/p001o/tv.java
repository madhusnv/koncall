package p001o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class tv {

    /* renamed from: a */
    public final long f47940a;

    /* renamed from: b */
    public final int f47941b;

    /* renamed from: c */
    public final List f47942c;

    /* renamed from: d */
    public final List f47943d;

    /* renamed from: e */
    public final List f47944e;

    /* renamed from: f */
    public final List f47945f;

    public tv(long j, int i, List list, List list2, List list3, List list4) {
        this.f47940a = j;
        this.f47941b = i;
        this.f47942c = Collections.unmodifiableList(list);
        this.f47943d = Collections.unmodifiableList(list2);
        this.f47944e = Collections.unmodifiableList(list3);
        this.f47945f = Collections.unmodifiableList(list4);
    }
}
