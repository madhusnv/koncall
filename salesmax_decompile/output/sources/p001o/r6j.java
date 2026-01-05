package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class r6j implements gbg {

    /* renamed from: a */
    public final List f43061a;

    /* renamed from: b */
    public final long[] f43062b;

    /* renamed from: c */
    public final long[] f43063c;

    public r6j(List list) {
        this.f43061a = Collections.unmodifiableList(new ArrayList(list));
        this.f43062b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            l6j l6jVar = (l6j) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f43062b;
            jArr[i2] = l6jVar.f33331b;
            jArr[i2 + 1] = l6jVar.f33332c;
        }
        long[] jArr2 = this.f43062b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f43063c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* renamed from: f */
    public static /* synthetic */ int m46277f(l6j l6jVar, l6j l6jVar2) {
        return Long.compare(l6jVar.f33331b, l6jVar2.f33331b);
    }

    @Override // p001o.gbg
    /* renamed from: a */
    public int mo21115a(long j) {
        int iM48725d = sqi.m48725d(this.f43063c, j, false, false);
        if (iM48725d < this.f43063c.length) {
            return iM48725d;
        }
        return -1;
    }

    @Override // p001o.gbg
    /* renamed from: c */
    public List mo21116c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f43061a.size(); i++) {
            long[] jArr = this.f43062b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                l6j l6jVar = (l6j) this.f43061a.get(i);
                cd4 cd4Var = l6jVar.f33330a;
                if (cd4Var.f17901e == -3.4028235E38f) {
                    arrayList2.add(l6jVar);
                } else {
                    arrayList.add(cd4Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: o.q6j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r6j.m46277f((l6j) obj, (l6j) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((l6j) arrayList2.get(i3)).f33330a.m20916a().m20926h((-1) - i3, 1).m20919a());
        }
        return arrayList;
    }

    @Override // p001o.gbg
    /* renamed from: d */
    public long mo21117d(int i) {
        op0.m42511a(i >= 0);
        op0.m42511a(i < this.f43063c.length);
        return this.f43063c[i];
    }

    @Override // p001o.gbg
    /* renamed from: e */
    public int mo21118e() {
        return this.f43063c.length;
    }
}
