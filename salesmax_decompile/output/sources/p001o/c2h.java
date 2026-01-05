package p001o;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import p001o.vre;
import p001o.xb2;

/* loaded from: classes6.dex */
public abstract class c2h {

    /* renamed from: o.c2h$a */
    public static final class C12540a implements OnCompleteListener {

        /* renamed from: a */
        public final /* synthetic */ xb2 f17204a;

        public C12540a(xb2 xb2Var) {
            this.f17204a = xb2Var;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                xb2 xb2Var = this.f17204a;
                vre.C17665a c17665a = vre.f50797b;
                xb2Var.resumeWith(vre.m53351b(wre.m54933a(exception)));
            } else {
                if (task.isCanceled()) {
                    xb2.C18097a.m55920a(this.f17204a, null, 1, null);
                    return;
                }
                xb2 xb2Var2 = this.f17204a;
                vre.C17665a c17665a2 = vre.f50797b;
                xb2Var2.resumeWith(vre.m53351b(task.getResult()));
            }
        }
    }

    /* renamed from: o.c2h$b */
    public static final class C12541b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ CancellationTokenSource f17205a;

        public C12541b(CancellationTokenSource cancellationTokenSource) {
            this.f17205a = cancellationTokenSource;
        }

        /* renamed from: a */
        public final void m20153a(Throwable th) {
            this.f17205a.cancel();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20153a((Throwable) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final Object m20151a(Task task, n64 n64Var) {
        return m20152b(task, null, n64Var);
    }

    /* renamed from: b */
    public static final Object m20152b(Task task, CancellationTokenSource cancellationTokenSource, n64 n64Var) throws Exception {
        if (!task.isComplete()) {
            zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
            zb2Var.m59116E();
            task.addOnCompleteListener(kt5.f32695a, new C12540a(zb2Var));
            if (cancellationTokenSource != null) {
                zb2Var.mo48694y(new C12541b(cancellationTokenSource));
            }
            Object objM59140v = zb2Var.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM59140v;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
