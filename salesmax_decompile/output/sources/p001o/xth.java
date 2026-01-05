package p001o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class xth {

    /* renamed from: c */
    public static final String f54289c = sqi.B0(0);

    /* renamed from: d */
    public static final String f54290d = sqi.B0(1);

    /* renamed from: a */
    public final qth f54291a;

    /* renamed from: b */
    public final nf8 f54292b;

    public xth(qth qthVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= qthVar.f42400a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f54291a = qthVar;
        this.f54292b = nf8.m40511y(list);
    }

    /* renamed from: a */
    public int m56834a() {
        return this.f54291a.f42402c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xth.class != obj.getClass()) {
            return false;
        }
        xth xthVar = (xth) obj;
        return this.f54291a.equals(xthVar.f54291a) && this.f54292b.equals(xthVar.f54292b);
    }

    public int hashCode() {
        return this.f54291a.hashCode() + (this.f54292b.hashCode() * 31);
    }
}
