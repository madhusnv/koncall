package b2;

import androidx.recyclerview.widget.RecyclerView;
import b8.C0612g;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import ji.AbstractC3768b;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.p */
/* loaded from: classes.dex */
public final class C0558p {

    /* renamed from: a */
    public final /* synthetic */ int f3794a;

    /* renamed from: b */
    public int f3795b;

    /* renamed from: c */
    public int f3796c;

    /* renamed from: d */
    public int f3797d;

    /* renamed from: e */
    public Object f3798e;

    public /* synthetic */ C0558p(int i10) {
        this.f3794a = i10;
    }

    /* renamed from: a */
    public void m1653a(C0612g c0612g) {
        Object[] objArr = (Object[]) this.f3798e;
        int i10 = this.f3796c;
        objArr[i10] = c0612g;
        int i11 = this.f3797d & (i10 + 1);
        this.f3796c = i11;
        int i12 = this.f3795b;
        if (i11 == i12) {
            int length = objArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i14];
            AbstractC6662l.m12715e(0, i12, length, objArr, objArr2);
            AbstractC6662l.m12715e(i13, 0, this.f3795b, (Object[]) this.f3798e, objArr2);
            this.f3798e = objArr2;
            this.f3795b = 0;
            this.f3796c = length;
            this.f3797d = i14 - 1;
        }
    }

    /* renamed from: b */
    public void m1654b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f3797d;
        int i13 = i12 * 2;
        int[] iArr = (int[]) this.f3798e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3798e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f3798e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f3798e;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f3797d++;
    }

    /* renamed from: c */
    public C0559q m1655c(int i10) {
        return new C0559q(AbstractC3768b.m8290b((g4.l0) this.f3798e, i10), i10, 1L);
    }

    /* renamed from: d */
    public void m1656d(RecyclerView recyclerView, boolean z6) {
        this.f3797d = 0;
        int[] iArr = (int[]) this.f3798e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        y7.f0 f0Var = recyclerView.f2824m;
        if (recyclerView.f2823l == null || f0Var == null || !f0Var.f41627i) {
            return;
        }
        if (z6) {
            if (!recyclerView.f2816d.m15565k()) {
                f0Var.mo1308i(recyclerView.f2823l.mo4090a(), this);
            }
        } else if (!recyclerView.m1326J()) {
            f0Var.mo1307h(this.f3795b, this.f3796c, recyclerView.f43699i1, this);
        }
        int i10 = this.f3797d;
        if (i10 > f0Var.f41628j) {
            f0Var.f41628j = i10;
            f0Var.f41629k = z6;
            recyclerView.f2814b.m15885k();
        }
    }

    /* renamed from: e */
    public int m1657e() {
        return this.f3797d - this.f3796c;
    }

    /* renamed from: f */
    public int m1658f(int i10) {
        return ((l2.j0) this.f3798e).f21823c[this.f3796c + i10];
    }

    /* renamed from: g */
    public Object m1659g(int i10) {
        return ((l2.j0) this.f3798e).f21825e[this.f3797d + i10];
    }

    public String toString() {
        switch (this.f3794a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i10 = this.f3795b;
                sb2.append(i10);
                sb2.append('-');
                g4.l0 l0Var = (g4.l0) this.f3798e;
                sb2.append(AbstractC3768b.m8290b(l0Var, i10));
                sb2.append(',');
                int i11 = this.f3796c;
                sb2.append(i11);
                sb2.append('-');
                sb2.append(AbstractC3768b.m8290b(l0Var, i11));
                sb2.append("), prevOffset=");
                return AbstractC1452a.m4563j(sb2, this.f3797d, ')');
            case 3:
                return "";
            default:
                return super.toString();
        }
    }

    public C0558p(l2.j0 j0Var) {
        this.f3794a = 2;
        this.f3798e = j0Var;
    }

    public C0558p(int i10, int i11, int i12, g4.l0 l0Var) {
        this.f3794a = 0;
        this.f3795b = i10;
        this.f3796c = i11;
        this.f3797d = i12;
        this.f3798e = l0Var;
    }
}
