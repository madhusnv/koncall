package og;

import d3.C1565s;
import j3.C3551e;
import j3.C3552f;
import j3.C3557k;
import j3.C3561o;
import j3.C3568v;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class rb {

    /* renamed from: a */
    public static C3552f f26784a;

    /* renamed from: a */
    public static final C3552f m10871a() {
        C3552f c3552f = f26784a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C3561o(7.0f, 10.0f));
        arrayList.add(new C3568v(5.0f, 5.0f));
        arrayList.add(new C3568v(5.0f, -5.0f));
        arrayList.add(C3557k.f19059c);
        C3551e.m8090a(c3551e, arrayList, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26784a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: b */
    public static int m10872b(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }
}
