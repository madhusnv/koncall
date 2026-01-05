package e1;

import a3.C0045d;
import com.sun.mail.util.AbstractC1452a;
import f1.AbstractC2176a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import pg.w9;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public Object[] f8956a;

    /* renamed from: b */
    public int f8957b;

    public e0(int i10) {
        this.f8956a = i10 == 0 ? p0.f9035a : new Object[i10];
    }

    /* renamed from: a */
    public final void m5543a(Object obj) {
        int i10 = this.f8957b + 1;
        Object[] objArr = this.f8956a;
        if (objArr.length < i10) {
            m5554l(i10, objArr);
        }
        Object[] objArr2 = this.f8956a;
        int i11 = this.f8957b;
        objArr2[i11] = obj;
        this.f8957b = i11 + 1;
    }

    /* renamed from: b */
    public final void m5544b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f8957b;
        int size = list.size() + i10;
        Object[] objArr = this.f8956a;
        if (objArr.length < size) {
            m5554l(size, objArr);
        }
        Object[] objArr2 = this.f8956a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f8957b = list.size() + this.f8957b;
    }

    /* renamed from: c */
    public final void m5545c() {
        AbstractC6662l.m12726p(this.f8956a, 0, this.f8957b, null);
        this.f8957b = 0;
    }

    /* renamed from: d */
    public final Object m5546d() {
        if (!m5549g()) {
            return this.f8956a[0];
        }
        AbstractC2176a.m5864e("ObjectList is empty.");
        throw null;
    }

    /* renamed from: e */
    public final Object m5547e(int i10) {
        if (i10 >= 0 && i10 < this.f8957b) {
            return this.f8956a[i10];
        }
        m5555m(i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            int i10 = e0Var.f8957b;
            int i11 = this.f8957b;
            if (i10 == i11) {
                Object[] objArr = this.f8956a;
                Object[] objArr2 = e0Var.f8956a;
                C4266h c4266hM11919j = w9.m11919j(0, i11);
                int i12 = c4266hM11919j.f21646a;
                int i13 = c4266hM11919j.f21647b;
                if (i12 > i13) {
                    return true;
                }
                while (AbstractC4154l.m8918a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m5548f(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f8956a;
            int i11 = this.f8957b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f8956a;
        int i12 = this.f8957b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: g */
    public final boolean m5549g() {
        return this.f8957b == 0;
    }

    /* renamed from: h */
    public final boolean m5550h() {
        return this.f8957b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f8956a;
        int i10 = this.f8957b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final boolean m5551i(Object obj) {
        int iM5548f = m5548f(obj);
        if (iM5548f < 0) {
            return false;
        }
        m5552j(iM5548f);
        return true;
    }

    /* renamed from: j */
    public final Object m5552j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f8957b)) {
            m5555m(i10);
            throw null;
        }
        Object[] objArr = this.f8956a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            AbstractC6662l.m12715e(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f8957b - 1;
        this.f8957b = i12;
        objArr[i12] = null;
        return obj;
    }

    /* renamed from: k */
    public final void m5553k(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f8957b) || i11 < 0 || i11 > i12) {
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "Start (", ") and end (", ") must be in 0..");
            sbM4566m.append(this.f8957b);
            AbstractC2176a.m5863d(sbM4566m.toString());
            throw null;
        }
        if (i11 < i10) {
            AbstractC2176a.m5862c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f8956a;
                AbstractC6662l.m12715e(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f8957b;
            int i14 = i13 - (i11 - i10);
            AbstractC6662l.m12726p(this.f8956a, i14, i13, null);
            this.f8957b = i14;
        }
    }

    /* renamed from: l */
    public final void m5554l(int i10, Object[] oldContent) {
        AbstractC4154l.m8923f(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i10, (length * 3) / 2)];
        AbstractC6662l.m12715e(0, 0, length, oldContent, objArr);
        this.f8956a = objArr;
    }

    /* renamed from: m */
    public final void m5555m(int i10) {
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index ", " must be in 0..");
        sbM4567n.append(this.f8957b - 1);
        AbstractC2176a.m5863d(sbM4567n.toString());
        throw null;
    }

    public final String toString() {
        C0045d c0045d = new C0045d(5, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f8956a;
        int i10 = this.f8957b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c0045d.invoke(obj));
            i11++;
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ e0() {
        this(16);
    }
}
