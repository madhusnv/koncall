package b2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4155m;
import n1.AbstractC4941a;
import og.pe;
import s4.C6754j;
import t1.C6982g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3792a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, ArrayList arrayList) {
        super(1);
        this.f3792a = i10;
        this.f3793b = arrayList;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3792a) {
            case 0:
                t3.v0 v0Var = (t3.v0) obj;
                ArrayList arrayList = this.f3793b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v0Var.m13324d((t3.w0) arrayList.get(i10), 0, 0, DefinitionKt.NO_Float_VALUE);
                }
                break;
            case 1:
                t3.v0 v0Var2 = (t3.v0) obj;
                ArrayList arrayList2 = this.f3793b;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    v0Var2.m13324d((t3.w0) arrayList2.get(i11), 0, 0, DefinitionKt.NO_Float_VALUE);
                }
                break;
            case 2:
                this.f3793b.get(((Number) obj).intValue());
                break;
            case 3:
                this.f3793b.get(((Number) obj).intValue());
                break;
            case 4:
                this.f3793b.get(((Number) obj).intValue());
                break;
            case 5:
                t3.v0 v0Var3 = (t3.v0) obj;
                ArrayList arrayList3 = this.f3793b;
                int size3 = arrayList3.size();
                int i12 = 0;
                while (i12 < size3) {
                    C6982g c6982g = (C6982g) arrayList3.get(i12);
                    List list = c6982g.f33790b;
                    boolean z6 = c6982g.f33797i;
                    if (c6982g.f33801m == Integer.MIN_VALUE) {
                        AbstractC4941a.m9884a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        t3.w0 w0Var = (t3.w0) list.get(i13);
                        int[] iArr = c6982g.f33799k;
                        int i14 = i13 * 2;
                        int i15 = i12;
                        long j6 = (iArr[i14 + 1] & 4294967295L) | (iArr[i14] << 32);
                        if (c6982g.f33796h) {
                            int i16 = z6 ? (int) (j6 >> 32) : (c6982g.f33801m - ((int) (j6 >> 32))) - (z6 ? w0Var.f34031b : w0Var.f34030a);
                            j6 = ((z6 ? (c6982g.f33801m - ((int) (j6 & 4294967295L))) - (z6 ? w0Var.f34031b : w0Var.f34030a) : (int) (j6 & 4294967295L)) & 4294967295L) | (i16 << 32);
                        }
                        long jM12942c = C6754j.m12942c(j6, c6982g.f33791c);
                        if (z6) {
                            t3.v0.m13323l(v0Var3, w0Var, jM12942c);
                        } else {
                            t3.v0.m13321i(v0Var3, w0Var, jM12942c);
                        }
                        i13++;
                        i12 = i15;
                    }
                    i12++;
                }
                break;
            case 6:
                t3.v0 v0Var4 = (t3.v0) obj;
                ArrayList arrayList4 = this.f3793b;
                int size5 = arrayList4.size();
                for (int i17 = 0; i17 < size5; i17++) {
                    t3.v0.m13320h(v0Var4, (t3.w0) arrayList4.get(i17), 0, 0);
                }
                break;
            case 7:
                this.f3793b.get(((Number) obj).intValue());
                break;
            case 8:
                t3.v0 v0Var5 = (t3.v0) obj;
                ArrayList arrayList5 = this.f3793b;
                int size6 = arrayList5.size();
                for (int i18 = 0; i18 < size6; i18++) {
                    t3.v0.m13319g(v0Var5, (t3.w0) arrayList5.get(i18), 0, 0);
                }
                break;
            case 9:
                t3.v0 v0Var6 = (t3.v0) obj;
                ArrayList arrayList6 = this.f3793b;
                int iM10832g = pe.m10832g(arrayList6);
                if (iM10832g >= 0) {
                    int i19 = 0;
                    while (true) {
                        t3.v0.m13319g(v0Var6, (t3.w0) arrayList6.get(i19), 0, 0);
                        if (i19 != iM10832g) {
                            i19++;
                        }
                    }
                }
                break;
            default:
                t3.v0 v0Var7 = (t3.v0) obj;
                ArrayList arrayList7 = this.f3793b;
                int size7 = arrayList7.size();
                for (int i20 = 0; i20 < size7; i20++) {
                    t3.v0.m13319g(v0Var7, (t3.w0) arrayList7.get(i20), 0, 0);
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
