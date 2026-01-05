package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.RemoteCoroutineWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.objectweb.asm.TypeReference;
import p001o.a79;
import p001o.eu5;
import p001o.h84;
import p001o.i84;
import p001o.jgg;
import p001o.kl3;
import p001o.l75;
import p001o.n64;
import p001o.n75;
import p001o.nl7;
import p001o.p69;
import p001o.rm1;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.xb2;
import p001o.y3i;
import p001o.zb2;
import p001o.zfa;

/* loaded from: classes2.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {
    private final SettableFuture<ListenableWorker.Result> future;
    private final kl3 job;

    @l75(m36647c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", m36648f = "RemoteCoroutineWorker.kt", m36649l = {TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT}, m36650m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1 */
    public static final class C26371 extends jgg implements nl7 {
        int label;

        public C26371(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return RemoteCoroutineWorker.this.new C26371(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    RemoteCoroutineWorker remoteCoroutineWorker = RemoteCoroutineWorker.this;
                    this.label = 1;
                    obj = remoteCoroutineWorker.doRemoteWork(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                RemoteCoroutineWorker.this.future.set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                RemoteCoroutineWorker.this.future.setException(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C26371) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "parameters");
        this.job = a79.m16544b(null, 1, null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        sq8.m48648g(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: o.fie
            @Override // java.lang.Runnable
            public final void run() {
                RemoteCoroutineWorker._init_$lambda$0(this.f23414a);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RemoteCoroutineWorker remoteCoroutineWorker) {
        sq8.m48649h(remoteCoroutineWorker, "this$0");
        if (remoteCoroutineWorker.future.isCancelled()) {
            p69.C15966a.m42999a(remoteCoroutineWorker.job, null, 1, null);
        }
    }

    public abstract Object doRemoteWork(n64 n64Var);

    @Override // androidx.work.multiprocess.RemoteListenableWorker, androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(true);
    }

    public final Object setProgress(Data data, n64 n64Var) throws Throwable {
        final zfa progressAsync = setProgressAsync(data);
        sq8.m48648g(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            final zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
            zb2Var.m59116E();
            progressAsync.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        xb2 xb2Var = zb2Var;
                        vre.C17665a c17665a = vre.f50797b;
                        xb2Var.resumeWith(vre.m53351b(progressAsync.get()));
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            cause2 = th;
                        }
                        if (th instanceof CancellationException) {
                            zb2Var.cancel(cause2);
                            return;
                        }
                        xb2 xb2Var2 = zb2Var;
                        vre.C17665a c17665a2 = vre.f50797b;
                        xb2Var2.resumeWith(vre.m53351b(wre.m54933a(cause2)));
                    }
                }
            }, DirectExecutor.INSTANCE);
            zb2Var.mo48694y(new RemoteCoroutineWorker$setProgress$$inlined$await$2(progressAsync));
            Object objM59140v = zb2Var.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            if (objM59140v == uq8.m51918f()) {
                return objM59140v;
            }
        }
        return y3i.f54824a;
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    public zfa startRemoteWork() {
        rm1.m46952d(i84.m31707a(eu5.m25610a().plus(this.job)), null, null, new C26371(null), 3, null);
        return this.future;
    }
}
