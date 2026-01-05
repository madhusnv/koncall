package q1;

import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import t3.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.q */
/* loaded from: classes.dex */
public final class C6089q extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f29711a;

    /* renamed from: b */
    public final /* synthetic */ w0 f29712b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f29713c;

    /* renamed from: d */
    public final /* synthetic */ Object f29714d;

    /* renamed from: e */
    public final /* synthetic */ boolean f29715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6089q(w0 w0Var, ArrayList arrayList, List list, boolean z6, int i10) {
        super(1);
        this.f29711a = i10;
        this.f29712b = w0Var;
        this.f29713c = arrayList;
        this.f29714d = list;
        this.f29715e = z6;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f29711a) {
            case 0:
                v0 v0Var = (v0) obj;
                C6088p c6088p = new C6088p(this.f29713c, this.f29714d, this.f29715e, 0);
                v0Var.f34028a = true;
                c6088p.invoke(v0Var);
                v0Var.f34028a = false;
                this.f29712b.getValue();
                break;
            default:
                v0 v0Var2 = (v0) obj;
                C6088p c6088p2 = new C6088p(this.f29713c, this.f29714d, this.f29715e, 1);
                v0Var2.f34028a = true;
                c6088p2.invoke(v0Var2);
                v0Var2.f34028a = false;
                this.f29712b.getValue();
                break;
        }
        return qw.a0.f30746a;
    }
}
