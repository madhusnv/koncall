package cy;

import a1.RunnableC0012k;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import tx.c0;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cy.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1530a extends AbstractC4152j implements InterfaceC2142f {

    /* renamed from: a */
    public static final C1530a f7699a = new C1530a(3, C1531b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1531b c1531b = (C1531b) obj;
        InterfaceC1535f interfaceC1535f = (InterfaceC1535f) obj2;
        long j6 = c1531b.f7700a;
        a0 a0Var = a0.f30746a;
        if (j6 <= 0) {
            ((C1534e) interfaceC1535f).f7719e = a0Var;
            return a0Var;
        }
        RunnableC0012k runnableC0012k = new RunnableC0012k(14, interfaceC1535f, c1531b);
        AbstractC4154l.m8921d(interfaceC1535f, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C1534e c1534e = (C1534e) interfaceC1535f;
        InterfaceC7564h interfaceC7564h = c1534e.f7715a;
        c1534e.f7717c = c0.m13493p(interfaceC7564h).mo13506R(j6, runnableC0012k, interfaceC7564h);
        return a0Var;
    }
}
