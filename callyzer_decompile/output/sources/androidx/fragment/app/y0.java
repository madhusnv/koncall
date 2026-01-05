package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Map;
import p007h.C2749a;
import p007h.InterfaceC2750b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 implements InterfaceC2750b {

    /* renamed from: a */
    public final /* synthetic */ int f2752a;

    /* renamed from: b */
    public final /* synthetic */ j1 f2753b;

    public /* synthetic */ y0(j1 j1Var, int i10) {
        this.f2752a = i10;
        this.f2753b = j1Var;
    }

    @Override // p007h.InterfaceC2750b
    /* renamed from: a */
    public final void mo24a(Object obj) {
        switch (this.f2752a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                j1 j1Var = this.f2753b;
                e1 e1Var = (e1) j1Var.f2568F.pollFirst();
                if (e1Var != null) {
                    String str = e1Var.f2503a;
                    int i11 = e1Var.f2504b;
                    j0 j0VarM1262c = j1Var.f2581c.m1262c(str);
                    if (j0VarM1262c != null) {
                        j0VarM1262c.onRequestPermissionsResult(i11, strArr, iArr);
                        break;
                    }
                }
                break;
            case 1:
                C2749a c2749a = (C2749a) obj;
                j1 j1Var2 = this.f2753b;
                e1 e1Var2 = (e1) j1Var2.f2568F.pollLast();
                if (e1Var2 != null) {
                    String str2 = e1Var2.f2503a;
                    int i12 = e1Var2.f2504b;
                    j0 j0VarM1262c2 = j1Var2.f2581c.m1262c(str2);
                    if (j0VarM1262c2 != null) {
                        j0VarM1262c2.onActivityResult(i12, c2749a.f15293a, c2749a.f15294b);
                        break;
                    }
                }
                break;
            default:
                C2749a c2749a2 = (C2749a) obj;
                j1 j1Var3 = this.f2753b;
                e1 e1Var3 = (e1) j1Var3.f2568F.pollFirst();
                if (e1Var3 != null) {
                    String str3 = e1Var3.f2503a;
                    int i13 = e1Var3.f2504b;
                    j0 j0VarM1262c3 = j1Var3.f2581c.m1262c(str3);
                    if (j0VarM1262c3 != null) {
                        j0VarM1262c3.onActivityResult(i13, c2749a2.f15293a, c2749a2.f15294b);
                        break;
                    }
                }
                break;
        }
    }
}
