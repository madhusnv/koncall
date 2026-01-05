package p001o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class g3d {

    /* renamed from: a */
    public final String f24526a;

    /* renamed from: b */
    public final long f24527b;

    /* renamed from: c */
    public final List f24528c;

    /* renamed from: d */
    public final List f24529d;

    /* renamed from: e */
    public final rm5 f24530e;

    public g3d(String str, long j, List list, List list2) {
        this(str, j, list, list2, null);
    }

    /* renamed from: a */
    public int m28024a(int i) {
        int size = this.f24528c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((tv) this.f24528c.get(i2)).f47941b == i) {
                return i2;
            }
        }
        return -1;
    }

    public g3d(String str, long j, List list, List list2, rm5 rm5Var) {
        this.f24526a = str;
        this.f24527b = j;
        this.f24528c = Collections.unmodifiableList(list);
        this.f24529d = Collections.unmodifiableList(list2);
        this.f24530e = rm5Var;
    }
}
