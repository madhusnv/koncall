package g2;

import c6.C0892v;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t9 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f12785a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f12786b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f12787c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f12788d;

    /* renamed from: e */
    public final /* synthetic */ C0892v f12789e;

    /* renamed from: f */
    public final /* synthetic */ int f12790f;

    /* renamed from: g */
    public final /* synthetic */ int f12791g;

    /* renamed from: h */
    public final /* synthetic */ o1.v1 f12792h;

    /* renamed from: j */
    public final /* synthetic */ t3.g1 f12793j;

    /* renamed from: k */
    public final /* synthetic */ int f12794k;

    /* renamed from: l */
    public final /* synthetic */ int f12795l;

    /* renamed from: m */
    public final /* synthetic */ Integer f12796m;

    /* renamed from: n */
    public final /* synthetic */ ArrayList f12797n;

    /* renamed from: p */
    public final /* synthetic */ Integer f12798p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0892v c0892v, int i10, int i11, o1.v1 v1Var, t3.g1 g1Var, int i12, int i13, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f12785a = arrayList;
        this.f12786b = arrayList2;
        this.f12787c = arrayList3;
        this.f12788d = arrayList4;
        this.f12789e = c0892v;
        this.f12790f = i10;
        this.f12791g = i11;
        this.f12792h = v1Var;
        this.f12793j = g1Var;
        this.f12794k = i12;
        this.f12795l = i13;
        this.f12796m = num;
        this.f12797n = arrayList5;
        this.f12798p = num2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10;
        t3.v0 v0Var = (t3.v0) obj;
        ArrayList arrayList = this.f12785a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            v0Var.m13324d((t3.w0) arrayList.get(i11), 0, 0, DefinitionKt.NO_Float_VALUE);
        }
        ArrayList arrayList2 = this.f12786b;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            v0Var.m13324d((t3.w0) arrayList2.get(i12), 0, 0, DefinitionKt.NO_Float_VALUE);
        }
        ArrayList arrayList3 = this.f12787c;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (true) {
            i10 = this.f12794k;
            if (i13 >= size3) {
                break;
            }
            t3.w0 w0Var = (t3.w0) arrayList3.get(i13);
            int i14 = (this.f12790f - this.f12791g) / 2;
            t3.g1 g1Var = this.f12793j;
            v0Var.m13324d(w0Var, this.f12792h.mo6893a(g1Var, g1Var.getLayoutDirection()) + i14, i10 - this.f12795l, DefinitionKt.NO_Float_VALUE);
            i13++;
        }
        ArrayList arrayList4 = this.f12788d;
        int size4 = arrayList4.size();
        for (int i15 = 0; i15 < size4; i15++) {
            t3.w0 w0Var2 = (t3.w0) arrayList4.get(i15);
            Integer num = this.f12796m;
            v0Var.m13324d(w0Var2, 0, i10 - (num != null ? num.intValue() : 0), DefinitionKt.NO_Float_VALUE);
        }
        C0892v c0892v = this.f12789e;
        if (c0892v != null) {
            ArrayList arrayList5 = this.f12797n;
            int size5 = arrayList5.size();
            for (int i16 = 0; i16 < size5; i16++) {
                t3.w0 w0Var3 = (t3.w0) arrayList5.get(i16);
                int i17 = c0892v.f5525a;
                Integer num2 = this.f12798p;
                AbstractC4154l.m8920c(num2);
                v0Var.m13324d(w0Var3, i17, i10 - num2.intValue(), DefinitionKt.NO_Float_VALUE);
            }
        }
        return qw.a0.f30746a;
    }
}
