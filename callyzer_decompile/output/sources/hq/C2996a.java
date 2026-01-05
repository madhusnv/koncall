package hq;

import ex.InterfaceC2137a;
import java.util.ArrayList;
import java.util.List;
import k2.h2;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import lq.C4506a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2996a implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16145a;

    /* renamed from: b */
    public final /* synthetic */ h2 f16146b;

    public /* synthetic */ C2996a(w0 w0Var, int i10) {
        this.f16145a = i10;
        this.f16146b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16145a) {
            case 0:
                return Integer.valueOf(((C4506a) this.f16146b.getValue()).f22414a.size());
            default:
                List list = (List) this.f16146b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC4154l.m8918a(((C4409i) obj).f22046b.f22134a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }
}
