package androidx.work;

import java.util.concurrent.ExecutionException;
import p001o.bj8;
import p001o.n64;
import p001o.n75;
import p001o.tq8;
import p001o.uq8;
import p001o.y3i;
import p001o.zb2;
import p001o.zfa;

/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    public static final <R> Object await(zfa zfaVar, n64 n64Var) throws Throwable {
        if (zfaVar.isDone()) {
            try {
                return zfaVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        zfaVar.addListener(new ListenableFutureKt$await$2$1(zb2Var, zfaVar), DirectExecutor.INSTANCE);
        zb2Var.mo48694y(new ListenableFutureKt$await$2$2(zfaVar));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    private static final <R> Object await$$forInline(zfa zfaVar, n64 n64Var) throws Throwable {
        if (zfaVar.isDone()) {
            try {
                return zfaVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        }
        bj8.m19245c(0);
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        zfaVar.addListener(new ListenableFutureKt$await$2$1(zb2Var, zfaVar), DirectExecutor.INSTANCE);
        zb2Var.mo48694y(new ListenableFutureKt$await$2$2(zfaVar));
        y3i y3iVar = y3i.f54824a;
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        bj8.m19245c(1);
        return objM59140v;
    }
}
