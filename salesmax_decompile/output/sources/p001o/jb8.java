package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes2.dex */
public final class jb8 {

    /* renamed from: a */
    public int f30086a;

    /* renamed from: b */
    public Object[] f30087b = new Object[4];

    /* renamed from: c */
    public int[] f30088c = new int[4];

    /* renamed from: b */
    public final int m33467b(Object obj, int i) {
        int iM33468c;
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        int[] iArr = this.f30088c;
        if (this.f30086a > 0) {
            iM33468c = m33468c(obj);
            if (iM33468c >= 0) {
                int i2 = iArr[iM33468c];
                iArr[iM33468c] = i;
                return i2;
            }
        } else {
            iM33468c = -1;
        }
        int i3 = -(iM33468c + 1);
        Object[] objArr = this.f30087b;
        int i4 = this.f30086a;
        if (i4 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i5 = i3 + 1;
            fp0.m27260i(objArr, objArr2, i5, i3, i4);
            fp0.m27258g(iArr, iArr2, i5, i3, i4);
            fp0.m27264m(objArr, objArr2, 0, 0, i3, 6, null);
            fp0.m27263l(iArr, iArr2, 0, 0, i3, 6, null);
            this.f30087b = objArr2;
            this.f30088c = iArr2;
        } else {
            int i6 = i3 + 1;
            fp0.m27260i(objArr, objArr, i6, i3, i4);
            fp0.m27258g(iArr, iArr, i6, i3, i4);
        }
        this.f30087b[i3] = obj;
        this.f30088c[i3] = i;
        this.f30086a++;
        return -1;
    }

    /* renamed from: c */
    public final int m33468c(Object obj) {
        int i = this.f30086a - 1;
        int iM42710a = ov.m42710a(obj);
        Object[] objArr = this.f30087b;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int iM42710a2 = ov.m42710a(obj2);
            if (iM42710a2 < iM42710a) {
                i2 = i3 + 1;
            } else {
                if (iM42710a2 <= iM42710a) {
                    return obj2 == obj ? i3 : m33469d(i3, obj, iM42710a);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: d */
    public final int m33469d(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.f30087b;
        int i3 = this.f30086a;
        for (int i4 = i - 1; -1 < i4; i4--) {
            Object obj3 = objArr[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (ov.m42710a(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -(i3 + 1);
            }
            obj2 = objArr[i];
            if (obj2 == obj) {
                return i;
            }
        } while (ov.m42710a(obj2) == i2);
        return -(i + 1);
    }

    /* renamed from: e */
    public final Object[] m33470e() {
        return this.f30087b;
    }

    /* renamed from: f */
    public final int m33471f() {
        return this.f30086a;
    }

    /* renamed from: g */
    public final int[] m33472g() {
        return this.f30088c;
    }
}
