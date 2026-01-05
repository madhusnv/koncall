package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C2395a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes2.dex */
public class C2407m {

    /* renamed from: a */
    public final a f10179a;

    /* renamed from: androidx.recyclerview.widget.m$a */
    public interface a {
        /* renamed from: a */
        C2395a.b mo9399a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo9400b(C2395a.b bVar);
    }

    public C2407m(a aVar) {
        this.f10179a = aVar;
    }

    /* renamed from: a */
    public final int m9618a(List list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C2395a.b) list.get(size)).f9940a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m9619b(List list) {
        while (true) {
            int iM9618a = m9618a(list);
            if (iM9618a == -1) {
                return;
            } else {
                m9621d(list, iM9618a, iM9618a + 1);
            }
        }
    }

    /* renamed from: c */
    public final void m9620c(List list, int i, C2395a.b bVar, int i2, C2395a.b bVar2) {
        int i3 = bVar.f9943d;
        int i4 = bVar2.f9941b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f9941b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f9941b = i6 + bVar2.f9943d;
        }
        int i7 = bVar2.f9941b;
        if (i7 <= i3) {
            bVar.f9943d = i3 + bVar2.f9943d;
        }
        bVar2.f9941b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    public final void m9621d(List list, int i, int i2) {
        C2395a.b bVar = (C2395a.b) list.get(i);
        C2395a.b bVar2 = (C2395a.b) list.get(i2);
        int i3 = bVar2.f9940a;
        if (i3 == 1) {
            m9620c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            m9622e(list, i, bVar, i2, bVar2);
        } else {
            if (i3 != 4) {
                return;
            }
            m9623f(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: e */
    public void m9622e(List list, int i, C2395a.b bVar, int i2, C2395a.b bVar2) {
        boolean z;
        int i3 = bVar.f9941b;
        int i4 = bVar.f9943d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.f9941b == i3 && bVar2.f9943d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f9941b == i4 + 1 && bVar2.f9943d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.f9941b;
        if (i4 < i5) {
            bVar2.f9941b = i5 - 1;
        } else {
            int i6 = bVar2.f9943d;
            if (i4 < i5 + i6) {
                bVar2.f9943d = i6 - 1;
                bVar.f9940a = 2;
                bVar.f9943d = 1;
                if (bVar2.f9943d == 0) {
                    list.remove(i2);
                    this.f10179a.mo9400b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f9941b;
        int i8 = bVar2.f9941b;
        C2395a.b bVarMo9399a = null;
        if (i7 <= i8) {
            bVar2.f9941b = i8 + 1;
        } else {
            int i9 = bVar2.f9943d;
            if (i7 < i8 + i9) {
                bVarMo9399a = this.f10179a.mo9399a(2, i7 + 1, (i8 + i9) - i7, null);
                bVar2.f9943d = bVar.f9941b - bVar2.f9941b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f10179a.mo9400b(bVar);
            return;
        }
        if (z) {
            if (bVarMo9399a != null) {
                int i10 = bVar.f9941b;
                if (i10 > bVarMo9399a.f9941b) {
                    bVar.f9941b = i10 - bVarMo9399a.f9943d;
                }
                int i11 = bVar.f9943d;
                if (i11 > bVarMo9399a.f9941b) {
                    bVar.f9943d = i11 - bVarMo9399a.f9943d;
                }
            }
            int i12 = bVar.f9941b;
            if (i12 > bVar2.f9941b) {
                bVar.f9941b = i12 - bVar2.f9943d;
            }
            int i13 = bVar.f9943d;
            if (i13 > bVar2.f9941b) {
                bVar.f9943d = i13 - bVar2.f9943d;
            }
        } else {
            if (bVarMo9399a != null) {
                int i14 = bVar.f9941b;
                if (i14 >= bVarMo9399a.f9941b) {
                    bVar.f9941b = i14 - bVarMo9399a.f9943d;
                }
                int i15 = bVar.f9943d;
                if (i15 >= bVarMo9399a.f9941b) {
                    bVar.f9943d = i15 - bVarMo9399a.f9943d;
                }
            }
            int i16 = bVar.f9941b;
            if (i16 >= bVar2.f9941b) {
                bVar.f9941b = i16 - bVar2.f9943d;
            }
            int i17 = bVar.f9943d;
            if (i17 >= bVar2.f9941b) {
                bVar.f9943d = i17 - bVar2.f9943d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f9941b != bVar.f9943d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVarMo9399a != null) {
            list.add(i, bVarMo9399a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m9623f(List list, int i, C2395a.b bVar, int i2, C2395a.b bVar2) {
        C2395a.b bVarMo9399a;
        int i3;
        int i4;
        int i5 = bVar.f9943d;
        int i6 = bVar2.f9941b;
        C2395a.b bVarMo9399a2 = null;
        if (i5 >= i6) {
            int i7 = bVar2.f9943d;
            if (i5 < i6 + i7) {
                bVar2.f9943d = i7 - 1;
                bVarMo9399a = this.f10179a.mo9399a(4, bVar.f9941b, 1, bVar2.f9942c);
            }
            i3 = bVar.f9941b;
            i4 = bVar2.f9941b;
            if (i3 > i4) {
                bVar2.f9941b = i4 + 1;
            } else {
                int i8 = bVar2.f9943d;
                if (i3 < i4 + i8) {
                    int i9 = (i4 + i8) - i3;
                    bVarMo9399a2 = this.f10179a.mo9399a(4, i3 + 1, i9, bVar2.f9942c);
                    bVar2.f9943d -= i9;
                }
            }
            list.set(i2, bVar);
            if (bVar2.f9943d <= 0) {
                list.set(i, bVar2);
            } else {
                list.remove(i);
                this.f10179a.mo9400b(bVar2);
            }
            if (bVarMo9399a != null) {
                list.add(i, bVarMo9399a);
            }
            if (bVarMo9399a2 == null) {
                list.add(i, bVarMo9399a2);
                return;
            }
            return;
        }
        bVar2.f9941b = i6 - 1;
        bVarMo9399a = null;
        i3 = bVar.f9941b;
        i4 = bVar2.f9941b;
        if (i3 > i4) {
        }
        list.set(i2, bVar);
        if (bVar2.f9943d <= 0) {
        }
        if (bVarMo9399a != null) {
        }
        if (bVarMo9399a2 == null) {
        }
    }
}
