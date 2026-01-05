package mg;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.p */
/* loaded from: classes.dex */
public abstract class AbstractC4737p extends AbstractC4730i implements Set {

    /* renamed from: c */
    public static final /* synthetic */ int f23685c = 0;

    /* renamed from: b */
    public transient AbstractC4735n f23686b;

    /* renamed from: h */
    public static AbstractC4737p m9632h(int i10, Object... objArr) {
        if (i10 == 0) {
            return C4747z.f23717k;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new c0(obj);
        }
        int iM9633j = m9633j(i10);
        Object[] objArr2 = new Object[iM9633j];
        int i11 = iM9633j - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC4801l.m9730d(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (Integer.rotateLeft((int) (iHashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i15 = iRotateLeft & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new c0(obj4);
        }
        if (m9633j(i13) < iM9633j / 2) {
            return m9632h(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C4747z(i12, i11, i13, objArr, objArr2);
    }

    /* renamed from: j */
    public static int m9633j(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4737p) && (this instanceof C4747z) && (((AbstractC4737p) obj) instanceof C4747z) && ((C4747z) this).f23719e != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC4723b.m9600b(this);
    }

    /* renamed from: k */
    public AbstractC4735n mo9593k() {
        AbstractC4735n abstractC4735n = this.f23686b;
        if (abstractC4735n != null) {
            return abstractC4735n;
        }
        AbstractC4735n abstractC4735nMo9634m = mo9634m();
        this.f23686b = abstractC4735nMo9634m;
        return abstractC4735nMo9634m;
    }

    /* renamed from: m */
    public AbstractC4735n mo9634m() {
        Object[] array = toArray(AbstractC4730i.f23649a);
        C4731j c4731j = AbstractC4735n.f23678b;
        return AbstractC4735n.m9626k(array.length, array);
    }
}
