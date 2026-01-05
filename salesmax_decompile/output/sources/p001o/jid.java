package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jid {

    /* renamed from: a */
    public final List f30492a;

    public jid(List list) {
        sq8.m48649h(list, "list");
        this.f30492a = list;
    }

    /* renamed from: a */
    public final void m33863a(int i) {
        if (!this.f30492a.isEmpty()) {
            if (((Number) this.f30492a.get(0)).intValue() == i) {
                return;
            }
            if (((Number) this.f30492a.get(r0.size() - 1)).intValue() == i) {
                return;
            }
        }
        int size = this.f30492a.size();
        this.f30492a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) this.f30492a.get(i2)).intValue();
            if (i <= iIntValue) {
                break;
            }
            this.f30492a.set(size, Integer.valueOf(iIntValue));
            size = i2;
        }
        this.f30492a.set(size, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean m33864b() {
        return !this.f30492a.isEmpty();
    }

    /* renamed from: c */
    public final int m33865c() {
        return ((Number) kh3.f0(this.f30492a)).intValue();
    }

    /* renamed from: d */
    public final int m33866d() {
        int iIntValue;
        if (!(this.f30492a.size() > 0)) {
            go3.m29222v("Set is empty".toString());
            throw new qe9();
        }
        int iIntValue2 = ((Number) this.f30492a.get(0)).intValue();
        while ((!this.f30492a.isEmpty()) && ((Number) this.f30492a.get(0)).intValue() == iIntValue2) {
            List list = this.f30492a;
            list.set(0, kh3.r0(list));
            List list2 = this.f30492a;
            list2.remove(list2.size() - 1);
            int size = this.f30492a.size();
            int size2 = this.f30492a.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = ((Number) this.f30492a.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = ((Number) this.f30492a.get(i3)).intValue();
                if (i2 >= size || (iIntValue = ((Number) this.f30492a.get(i2)).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.f30492a.set(i, Integer.valueOf(iIntValue4));
                        this.f30492a.set(i3, Integer.valueOf(iIntValue3));
                        i = i3;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.f30492a.set(i, Integer.valueOf(iIntValue));
                    this.f30492a.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                }
            }
        }
        return iIntValue2;
    }

    public /* synthetic */ jid(List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
