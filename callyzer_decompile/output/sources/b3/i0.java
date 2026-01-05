package b3;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4154l;
import v3.AbstractC7634f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements Comparator {

    /* renamed from: a */
    public static final i0 f3918a = new i0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        e0 e0Var2 = (e0) obj2;
        int i10 = 0;
        if (AbstractC0574f.m1734s(e0Var) && AbstractC0574f.m1734s(e0Var2)) {
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0Var);
            v3.g0 g0VarM14563x2 = AbstractC7634f.m14563x(e0Var2);
            if (!AbstractC4154l.m8918a(g0VarM14563x, g0VarM14563x2)) {
                v3.g0[] g0VarArr = new v3.g0[16];
                int i11 = 0;
                while (g0VarM14563x != null) {
                    int i12 = i11 + 1;
                    if (g0VarArr.length < i12) {
                        int length = g0VarArr.length;
                        ?? r52 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(g0VarArr, 0, r52, 0, length);
                        g0VarArr = r52;
                    }
                    if (i11 != 0) {
                        System.arraycopy(g0VarArr, 0, g0VarArr, 0 + 1, i11 + 0);
                    }
                    g0VarArr[0] = g0VarM14563x;
                    i11++;
                    g0VarM14563x = g0VarM14563x.m14609v();
                }
                v3.g0[] g0VarArr2 = new v3.g0[16];
                int i13 = 0;
                while (g0VarM14563x2 != null) {
                    int i14 = i13 + 1;
                    if (g0VarArr2.length < i14) {
                        int length2 = g0VarArr2.length;
                        ?? r53 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(g0VarArr2, 0, r53, 0, length2);
                        g0VarArr2 = r53;
                    }
                    if (i13 != 0) {
                        System.arraycopy(g0VarArr2, 0, g0VarArr2, 0 + 1, i13 + 0);
                    }
                    g0VarArr2[0] = g0VarM14563x2;
                    i13++;
                    g0VarM14563x2 = g0VarM14563x2.m14609v();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (AbstractC4154l.m8918a(g0VarArr[i10], g0VarArr2[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return AbstractC4154l.m8924g(g0VarArr[i10].m14610w(), g0VarArr2[i10].m14610w());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC0574f.m1734s(e0Var)) {
                return -1;
            }
            if (AbstractC0574f.m1734s(e0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
