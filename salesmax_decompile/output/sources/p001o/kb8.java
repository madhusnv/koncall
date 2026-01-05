package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes2.dex */
public final class kb8 {

    /* renamed from: a */
    public Object[] f31889a;

    /* renamed from: b */
    public Object[] f31890b;

    /* renamed from: c */
    public int f31891c;

    public kb8(int i) {
        this.f31889a = new Object[i];
        this.f31890b = new Object[i];
    }

    /* renamed from: b */
    public final void m35349b() {
        this.f31891c = 0;
        fp0.m27273v(this.f31889a, null, 0, 0, 6, null);
        fp0.m27273v(this.f31890b, null, 0, 0, 6, null);
    }

    /* renamed from: c */
    public final boolean m35350c(Object obj) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        return m35351d(obj) >= 0;
    }

    /* renamed from: d */
    public final int m35351d(Object obj) {
        int iM42710a = ov.m42710a(obj);
        int i = this.f31891c - 1;
        Object[] objArr = this.f31889a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int iM42710a2 = ov.m42710a(obj2);
            if (iM42710a2 < iM42710a) {
                i2 = i3 + 1;
            } else {
                if (iM42710a2 <= iM42710a) {
                    return obj == obj2 ? i3 : m35352e(i3, obj, iM42710a);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: e */
    public final int m35352e(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.f31889a;
        int i3 = this.f31891c;
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

    /* renamed from: f */
    public final Object m35353f(Object obj) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        int iM35351d = m35351d(obj);
        if (iM35351d >= 0) {
            return this.f31890b[iM35351d];
        }
        return null;
    }

    /* renamed from: g */
    public final Object[] m35354g() {
        return this.f31889a;
    }

    /* renamed from: h */
    public final int m35355h() {
        return this.f31891c;
    }

    /* renamed from: i */
    public final Object[] m35356i() {
        return this.f31890b;
    }

    /* renamed from: j */
    public final boolean m35357j() {
        return this.f31891c > 0;
    }

    /* renamed from: k */
    public final Object m35358k(Object obj) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        int iM35351d = m35351d(obj);
        if (iM35351d < 0) {
            return null;
        }
        Object[] objArr = this.f31890b;
        Object obj2 = objArr[iM35351d];
        int i = this.f31891c;
        Object[] objArr2 = this.f31889a;
        int i2 = iM35351d + 1;
        fp0.m27260i(objArr2, objArr2, iM35351d, i2, i);
        fp0.m27260i(objArr, objArr, iM35351d, i2, i);
        int i3 = i - 1;
        objArr2[i3] = null;
        objArr[i3] = null;
        this.f31891c = i3;
        return obj2;
    }

    /* renamed from: l */
    public final void m35359l(Object obj, Object obj2) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        Object[] objArr = this.f31889a;
        Object[] objArr2 = this.f31890b;
        int i = this.f31891c;
        int iM35351d = m35351d(obj);
        if (iM35351d >= 0) {
            objArr2[iM35351d] = obj2;
            return;
        }
        int i2 = -(iM35351d + 1);
        boolean z = i == objArr.length;
        Object[] objArr3 = z ? new Object[i * 2] : objArr;
        int i3 = i2 + 1;
        fp0.m27260i(objArr, objArr3, i3, i2, i);
        if (z) {
            fp0.m27264m(objArr, objArr3, 0, 0, i2, 6, null);
        }
        objArr3[i2] = obj;
        this.f31889a = objArr3;
        Object[] objArr4 = z ? new Object[i * 2] : objArr2;
        fp0.m27260i(objArr2, objArr4, i3, i2, i);
        if (z) {
            fp0.m27264m(objArr2, objArr4, 0, 0, i2, 6, null);
        }
        objArr4[i2] = obj2;
        this.f31890b = objArr4;
        this.f31891c++;
    }

    public /* synthetic */ kb8(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
