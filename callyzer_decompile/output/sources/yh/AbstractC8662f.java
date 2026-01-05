package yh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import pg.n8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.f */
/* loaded from: classes.dex */
public abstract class AbstractC8662f extends AbstractC8657a implements Set {

    /* renamed from: c */
    public static final /* synthetic */ int f41966c = 0;

    /* renamed from: b */
    public transient AbstractC8660d f41967b;

    /* renamed from: j */
    public static int m16003j(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* renamed from: k */
    public static AbstractC8662f m16004k(int i10, Object... objArr) {
        if (i10 == 0) {
            return C8670n.f41990k;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C8671o(obj);
        }
        int iM16003j = m16003j(i10);
        Object[] objArr2 = new Object[iM16003j];
        int i11 = iM16003j - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i14);
                throw new NullPointerException(sb2.toString());
            }
            int iHashCode = obj2.hashCode();
            int iM11802a = n8.m11802a(iHashCode);
            while (true) {
                int i15 = iM11802a & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM11802a++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C8671o(obj4);
        }
        if (m16003j(i13) < iM16003j / 2) {
            return m16004k(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C8670n(i12, i11, i13, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8662f) && (this instanceof C8670n) && (((AbstractC8662f) obj) instanceof C8670n) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public AbstractC8660d mo16005h() {
        AbstractC8660d abstractC8660d = this.f41967b;
        if (abstractC8660d != null) {
            return abstractC8660d;
        }
        AbstractC8660d abstractC8660dMo16006m = mo16006m();
        this.f41967b = abstractC8660dMo16006m;
        return abstractC8660dMo16006m;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* renamed from: m */
    public AbstractC8660d mo16006m() {
        Object[] array = toArray(AbstractC8657a.f41955a);
        C8658b c8658b = AbstractC8660d.f41962b;
        return AbstractC8660d.m16000h(array.length, array);
    }
}
