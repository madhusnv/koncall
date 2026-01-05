package androidx.work;

import java.util.concurrent.ExecutionException;
import p001o.bj8;
import p001o.l75;
import p001o.n64;
import p001o.n75;
import p001o.o64;
import p001o.sq8;
import p001o.tq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;
import p001o.zb2;
import p001o.zfa;

/* loaded from: classes2.dex */
public final class OperationKt {

    @l75(m36647c = "androidx.work.OperationKt", m36648f = "Operation.kt", m36649l = {um5.SWIFT_PREFIX_FIELD_NUMBER}, m36650m = "await")
    /* renamed from: androidx.work.OperationKt$await$1 */
    public static final class C25731 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25731(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object await(Operation operation, n64 n64Var) throws Throwable {
        C25731 c25731;
        Object obj;
        if (n64Var instanceof C25731) {
            c25731 = (C25731) n64Var;
            int i = c25731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25731.label = i - Integer.MIN_VALUE;
            } else {
                c25731 = new C25731(n64Var);
            }
        }
        Object objM59140v = c25731.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c25731.label;
        if (i2 == 0) {
            wre.m54934b(objM59140v);
            zfa result = operation.getResult();
            sq8.m48648g(result, "result");
            if (result.isDone()) {
                try {
                    obj = result.get();
                    sq8.m48648g(obj, "result.await()");
                    return obj;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            }
            c25731.L$0 = result;
            c25731.label = 1;
            zb2 zb2Var = new zb2(tq8.m50336c(c25731), 1);
            zb2Var.m59116E();
            result.addListener(new ListenableFutureKt$await$2$1(zb2Var, result), DirectExecutor.INSTANCE);
            zb2Var.mo48694y(new ListenableFutureKt$await$2$2(result));
            objM59140v = zb2Var.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(c25731);
            }
            if (objM59140v == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objM59140v);
        }
        obj = objM59140v;
        sq8.m48648g(obj, "result.await()");
        return obj;
    }

    private static final Object await$$forInline(Operation operation, n64 n64Var) throws Throwable {
        Object objM59140v;
        zfa result = operation.getResult();
        sq8.m48648g(result, "result");
        if (result.isDone()) {
            try {
                objM59140v = result.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        } else {
            bj8.m19245c(0);
            zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
            zb2Var.m59116E();
            result.addListener(new ListenableFutureKt$await$2$1(zb2Var, result), DirectExecutor.INSTANCE);
            zb2Var.mo48694y(new ListenableFutureKt$await$2$2(result));
            y3i y3iVar = y3i.f54824a;
            objM59140v = zb2Var.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            bj8.m19245c(1);
        }
        sq8.m48648g(objM59140v, "result.await()");
        return objM59140v;
    }
}
