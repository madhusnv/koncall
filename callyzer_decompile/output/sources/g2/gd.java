package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class gd extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11689a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f11690b;

    /* renamed from: c */
    public final /* synthetic */ t3.w0 f11691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd(ArrayList arrayList, t3.w0 w0Var, int i10) {
        super(1);
        this.f11689a = i10;
        this.f11690b = arrayList;
        this.f11691c = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11689a) {
            case 0:
                t3.v0 v0Var = (t3.v0) obj;
                ArrayList arrayList = this.f11690b;
                v0Var.m13324d((t3.w0) arrayList.get(0), 0, 0, DefinitionKt.NO_Float_VALUE);
                v0Var.m13324d((t3.w0) arrayList.get(1), ((t3.w0) arrayList.get(0)).f34030a, 0, DefinitionKt.NO_Float_VALUE);
                int i10 = ((t3.w0) arrayList.get(0)).f34030a;
                t3.w0 w0Var = this.f11691c;
                v0Var.m13324d(w0Var, i10 - (w0Var.f34030a / 2), 0, DefinitionKt.NO_Float_VALUE);
                break;
            default:
                t3.v0 v0Var2 = (t3.v0) obj;
                ArrayList arrayList2 = this.f11690b;
                v0Var2.m13324d((t3.w0) arrayList2.get(0), 0, 0, DefinitionKt.NO_Float_VALUE);
                v0Var2.m13324d((t3.w0) arrayList2.get(1), 0, ((t3.w0) arrayList2.get(0)).f34031b, DefinitionKt.NO_Float_VALUE);
                int i11 = ((t3.w0) arrayList2.get(0)).f34031b;
                t3.w0 w0Var2 = this.f11691c;
                v0Var2.m13324d(w0Var2, 0, i11 - (w0Var2.f34031b / 2), DefinitionKt.NO_Float_VALUE);
                break;
        }
        return qw.a0.f30746a;
    }
}
