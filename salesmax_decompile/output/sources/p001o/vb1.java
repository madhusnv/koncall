package p001o;

import java.io.Serializable;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class vb1 implements n64, k84, Serializable {
    private final n64 completion;

    public vb1(n64 n64Var) {
        this.completion = n64Var;
    }

    public n64 create(n64 n64Var) {
        sq8.m48649h(n64Var, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p001o.k84
    public k84 getCallerFrame() {
        n64 n64Var = this.completion;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    public final n64 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return m75.m38478d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // p001o.n64
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        n64 n64Var = this;
        while (true) {
            n75.m40200b(n64Var);
            vb1 vb1Var = (vb1) n64Var;
            n64 n64Var2 = vb1Var.completion;
            sq8.m48646e(n64Var2);
            try {
                objInvokeSuspend = vb1Var.invokeSuspend(obj);
            } catch (Throwable th) {
                vre.C17665a c17665a = vre.f50797b;
                obj = vre.m53351b(wre.m54933a(th));
            }
            if (objInvokeSuspend == uq8.m51918f()) {
                return;
            }
            obj = vre.m53351b(objInvokeSuspend);
            vb1Var.releaseIntercepted();
            if (!(n64Var2 instanceof vb1)) {
                n64Var2.resumeWith(obj);
                return;
            }
            n64Var = n64Var2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public n64 create(Object obj, n64 n64Var) {
        sq8.m48649h(n64Var, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
