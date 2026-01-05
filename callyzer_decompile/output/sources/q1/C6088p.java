package q1;

import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4155m;
import r1.C6434s;
import t3.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.p */
/* loaded from: classes.dex */
public final class C6088p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f29708a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f29709b;

    /* renamed from: c */
    public final /* synthetic */ Object f29710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6088p(ArrayList arrayList, List list, boolean z6, int i10) {
        super(1);
        this.f29708a = i10;
        this.f29709b = arrayList;
        this.f29710c = list;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f29708a) {
            case 0:
                v0 v0Var = (v0) obj;
                ArrayList arrayList = this.f29709b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C6091s) arrayList.get(i10)).m12123k(v0Var);
                }
                ?? r02 = this.f29710c;
                int size2 = r02.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((C6091s) r02.get(i11)).m12123k(v0Var);
                }
                break;
            default:
                v0 v0Var2 = (v0) obj;
                ArrayList arrayList2 = this.f29709b;
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((C6434s) arrayList2.get(i12)).m12429k(v0Var2);
                }
                ?? r03 = this.f29710c;
                int size4 = r03.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ((C6434s) r03.get(i13)).m12429k(v0Var2);
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
