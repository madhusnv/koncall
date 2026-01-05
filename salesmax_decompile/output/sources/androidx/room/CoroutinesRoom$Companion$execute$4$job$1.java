package androidx.room;

import java.util.concurrent.Callable;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.xb2;
import p001o.y3i;

@l75(m36647c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m36648f = "CoroutinesRoom.kt", m36649l = {}, m36650m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CoroutinesRoom$Companion$execute$4$job$1 extends jgg implements nl7 {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ xb2 $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, xb2 xb2Var, n64 n64Var) {
        super(2, n64Var);
        this.$callable = callable;
        this.$continuation = xb2Var;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        uq8.m51918f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(obj);
        try {
            this.$continuation.resumeWith(vre.m53351b(this.$callable.call()));
        } catch (Throwable th) {
            xb2 xb2Var = this.$continuation;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(th)));
        }
        return y3i.f54824a;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
