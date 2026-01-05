package i0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a */
    public final ArrayList f16514a;

    public k2() {
        this.f16514a = new ArrayList();
    }

    /* renamed from: b */
    public static void m7355b(ArrayList arrayList, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    m7355b(arrayList, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m7356a(p2 p2Var) {
        this.f16514a.add(p2Var);
    }

    /* renamed from: c */
    public final List m7357c(List list) {
        j2 j2Var;
        j2 j2Var2;
        j2 j2Var3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f16514a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z6 = false;
        m7355b(arrayList2, size2, new int[size2], 0);
        p2[] p2VarArr = new p2[list.size()];
        int size3 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                break;
            }
            Object obj = arrayList2.get(i10);
            i10++;
            int[] iArr = (int[]) obj;
            boolean z10 = true;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (iArr[i11] < list.size()) {
                    p2 p2Var = (p2) arrayList.get(i11);
                    p2 other = (p2) list.get(iArr[i11]);
                    p2Var.getClass();
                    AbstractC4154l.m8923f(other, "other");
                    z10 &= other.f16559b.getId() <= p2Var.f16559b.getId() && other.f16558a == p2Var.f16558a && ((j2Var = p2Var.f16560c) == (j2Var2 = j2.DEFAULT) || (j2Var3 = other.f16560c) == j2Var2 || j2Var3 == j2Var);
                    if (!z10) {
                        break;
                    }
                    p2VarArr[iArr[i11]] = (p2) arrayList.get(i11);
                }
            }
            if (z10) {
                z6 = true;
                break;
            }
        }
        if (z6) {
            return Arrays.asList(p2VarArr);
        }
        return null;
    }

    public k2(p2... p2VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f16514a = arrayList;
        Collections.addAll(arrayList, p2VarArr);
    }
}
