package androidx.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.concurrent.ExecutionException;
import org.objectweb.asm.Opcodes;
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
import p001o.wre;
import p001o.y3i;
import p001o.z74;
import p001o.zb2;
import p001o.zfa;

/* loaded from: classes2.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final z74 coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final kl3 job;

    @l75(m36647c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m36648f = "CoroutineWorker.kt", m36649l = {Opcodes.I2F}, m36650m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1 */
    public static final class C25681 extends jgg implements nl7 {
        final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25681(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, n64 n64Var) {
            super(2, n64Var);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C25681(this.$jobFuture, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            JobListenableFuture jobListenableFuture;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
                CoroutineWorker coroutineWorker = this.this$0;
                this.L$0 = jobListenableFuture2;
                this.label = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == objM51918f) {
                    return objM51918f;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = (JobListenableFuture) this.L$0;
                wre.m54934b(obj);
            }
            jobListenableFuture.complete(obj);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C25681) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "androidx.work.CoroutineWorker$startWork$1", m36648f = "CoroutineWorker.kt", m36649l = {TypeReference.NEW}, m36650m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$startWork$1 */
    public static final class C25691 extends jgg implements nl7 {
        int label;

        public C25691(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return CoroutineWorker.this.new C25691(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().setException(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C25691) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "appContext");
        sq8.m48649h(workerParameters, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        this.job = a79.m16544b(null, 1, null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        sq8.m48648g(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: o.q84
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker._init_$lambda$0(this.f41456a);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = eu5.m25610a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker coroutineWorker) {
        sq8.m48649h(coroutineWorker, "this$0");
        if (coroutineWorker.future.isCancelled()) {
            p69.C15966a.m42999a(coroutineWorker.job, null, 1, null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, n64 n64Var) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(n64 n64Var);

    public z74 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(n64 n64Var) {
        return getForegroundInfo$suspendImpl(this, n64Var);
    }

    @Override // androidx.work.ListenableWorker
    public final zfa getForegroundInfoAsync() {
        kl3 kl3VarM16544b = a79.m16544b(null, 1, null);
        h84 h84VarM31707a = i84.m31707a(getCoroutineContext().plus(kl3VarM16544b));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(kl3VarM16544b, null, 2, null);
        rm1.m46952d(h84VarM31707a, null, null, new C25681(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final kl3 getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, n64 n64Var) throws Throwable {
        zfa foregroundAsync = setForegroundAsync(foregroundInfo);
        sq8.m48648g(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
            zb2Var.m59116E();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(zb2Var, foregroundAsync), DirectExecutor.INSTANCE);
            zb2Var.mo48694y(new ListenableFutureKt$await$2$2(foregroundAsync));
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

    public final Object setProgress(Data data, n64 n64Var) throws Throwable {
        zfa progressAsync = setProgressAsync(data);
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
            zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
            zb2Var.m59116E();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(zb2Var, progressAsync), DirectExecutor.INSTANCE);
            zb2Var.mo48694y(new ListenableFutureKt$await$2$2(progressAsync));
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

    @Override // androidx.work.ListenableWorker
    public final zfa startWork() {
        rm1.m46952d(i84.m31707a(getCoroutineContext().plus(this.job)), null, null, new C25691(null), 3, null);
        return this.future;
    }
}
