package ai.salesmax.model;

import ai.salesmax.model.ConnectionAwareObservable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import p001o.bub;
import p001o.f3e;
import p001o.gu3;
import p001o.idg;
import p001o.jga;
import p001o.jm;
import p001o.js3;
import p001o.n9c;
import p001o.su5;
import p001o.ttb;
import p001o.x6c;
import p001o.x8c;

/* loaded from: classes.dex */
public class ConnectionAwareObservable<T> {
    private String awareConnectionName;
    private AtomicBoolean isInternetConnected;
    private jga liveDataInternetConnections;
    private n9c liveDataInternetConnectionsObserver;
    private final Object lock;
    private final x6c middleObservable;
    private ttb.InterfaceC17206b networkConnectivityStatusChangeListener;
    private Runnable onPauseCallback;
    private Runnable onResumeCallback;
    private final f3e publishSubject;
    private AtomicInteger retryOnErrorCount;
    private su5 subscription;

    public ConnectionAwareObservable(AppCompatActivity appCompatActivity, x6c x6cVar, String str) {
        this(appCompatActivity, x6cVar, new Runnable() { // from class: o.as3
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionAwareObservable.lambda$new$0();
            }
        }, new Runnable() { // from class: o.bs3
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionAwareObservable.lambda$new$1();
            }
        }, str);
    }

    private void clear() {
        ttb.InterfaceC17206b interfaceC17206b = this.networkConnectivityStatusChangeListener;
        if (interfaceC17206b != null) {
            ttb.m50578q(interfaceC17206b);
        }
        this.subscription = null;
        this.networkConnectivityStatusChangeListener = null;
        this.onResumeCallback = null;
        this.onPauseCallback = null;
    }

    public static <T> x6c getConnectionAwareObservable(AppCompatActivity appCompatActivity, final x6c x6cVar, String str) {
        return appCompatActivity == null ? x6cVar : new ConnectionAwareObservable(appCompatActivity, x6c.m55707t(new idg() { // from class: o.zr3
            @Override // p001o.idg
            public final Object get() {
                return ConnectionAwareObservable.lambda$getConnectionAwareObservable$11(x6cVar);
            }
        }), str).middleObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x8c lambda$getConnectionAwareObservable$11(x6c x6cVar) {
        return x6cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x8c lambda$getConnectionAwareObservable$12(x6c x6cVar) {
        return x6cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(AppCompatActivity appCompatActivity, x6c x6cVar, ttb.C17205a c17205a) {
        synchronized (this.lock) {
            String.format("%s - %s : NetworkConnectivityStatusChangeEvent Received %s %s", this, this.awareConnectionName, c17205a.getClass().getSimpleName(), c17205a.m50583a());
            boolean zM19823b = bub.m19823b(appCompatActivity.getApplicationContext());
            if (this.isInternetConnected.getAndSet(zM19823b) != zM19823b || ((Boolean) Optional.ofNullable(this.subscription).map(new Function() { // from class: o.cs3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((su5) obj).isDisposed());
                }
            }).orElse(Boolean.FALSE)).booleanValue()) {
                String.format("Inside ConnectionAwareObservable of %s: NetworkConnectivityStatusChangeEvent Connection Status Change Detected %s", this.awareConnectionName, Boolean.valueOf(zM19823b));
                if (zM19823b) {
                    if (bub.m19823b(appCompatActivity.getApplicationContext())) {
                        String.format("Inside ConnectionAwareObservable of %s: Invoking onResumeCallback %s", this.awareConnectionName, Boolean.valueOf(zM19823b));
                        this.onResumeCallback.run();
                        resubscribe(x6cVar);
                    }
                } else if (this.subscription != null) {
                    String.format("Inside ConnectionAwareObservable of %s: Invoking OnPauseCallback %s", this.awareConnectionName, Boolean.valueOf(zM19823b));
                    if (!this.subscription.isDisposed()) {
                        String.format("Inside ConnectionAwareObservable of %s: Invoking Subscription Dispose After OnPauseCallback %s", this.awareConnectionName, Boolean.valueOf(zM19823b));
                        this.subscription.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(x6c x6cVar, su5 su5Var) {
        subscribe(x6cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4() {
        synchronized (this.lock) {
            String.format("Inside ConnectionAwareObservable of %s: Invoking onDispose Subscription of middleObservable", this.awareConnectionName);
            su5 su5Var = this.subscription;
            if (su5Var != null && !su5Var.isDisposed()) {
                this.subscription.dispose();
            }
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribe$10(Throwable th) {
        String.format("Inside ConnectionAwareObservable of %s: Error Occurred", this.awareConnectionName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x8c lambda$subscribe$5(x6c x6cVar) {
        return x6cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribe$6(su5 su5Var) {
        String.format("Inside ConnectionAwareObservable of %s: Invoking Subscribe Subscription", this.awareConnectionName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribe$7(Throwable th) {
        this.onPauseCallback.run();
        String.format("Inside ConnectionAwareObservable of %s: Resubscribing as Exception occurred inside connection aware observable %s", this.awareConnectionName, this.middleObservable);
        String.format("Exception occurred inside ConnectionAwareObservable of %s though internet connection available, will not retry resubscribe %s - %s", this.awareConnectionName, String.valueOf(this.retryOnErrorCount.get()), this.middleObservable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribe$8() {
        String.format("Subscription Completed Unexpectedly Inside ConnectionAwareObservable of %s though internet connection available, will not retry reconnect", this.awareConnectionName, this.middleObservable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribe$9(Object obj) {
        this.publishSubject.mo16560e(obj);
        this.retryOnErrorCount.set(0);
    }

    private void resubscribe(x6c x6cVar) {
        this.retryOnErrorCount.set(0);
        String.format("Inside ConnectionAwareObservable of %s: Invoking Resubscribe Subscription", this.awareConnectionName);
        if (this.subscription != null) {
            String.format("Inside ConnectionAwareObservable of %s: Invoking Resubscribe Subscription Old Subscription is not null", this.awareConnectionName);
            subscribe(x6cVar);
        }
    }

    private void subscribe(final x6c x6cVar) {
        su5 su5Var = this.subscription;
        if (su5Var != null && !su5Var.isDisposed()) {
            String.format("Inside ConnectionAwareObservable of %s : Invoking Subscribe Subscription old subscription is not null and not disposed", this.awareConnectionName);
            this.subscription.dispose();
        }
        x6c x6cVarM55740x = x6c.m55707t(new idg() { // from class: o.yr3
            @Override // p001o.idg
            public final Object get() {
                return ConnectionAwareObservable.lambda$subscribe$5(x6cVar);
            }
        }).m55711D(new gu3() { // from class: o.es3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f22103a.lambda$subscribe$6((su5) obj);
            }
        }).m55708A(new gu3() { // from class: o.fs3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f24015a.lambda$subscribe$7((Throwable) obj);
            }
        }).m55740x(new jm() { // from class: o.gs3
            @Override // p001o.jm
            public final void run() {
                this.f25763a.lambda$subscribe$8();
            }
        });
        gu3 gu3Var = new gu3() { // from class: o.hs3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f27427a.lambda$subscribe$9(obj);
            }
        };
        gu3 gu3Var2 = new gu3() { // from class: o.is3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f29189a.lambda$subscribe$10((Throwable) obj);
            }
        };
        f3e f3eVar = this.publishSubject;
        Objects.requireNonNull(f3eVar);
        this.subscription = x6cVarM55740x.w0(gu3Var, gu3Var2, new js3(f3eVar));
    }

    public ConnectionAwareObservable(final AppCompatActivity appCompatActivity, final x6c x6cVar, Runnable runnable, Runnable runnable2, String str) {
        this.lock = new Object();
        this.awareConnectionName = str;
        this.onPauseCallback = runnable;
        this.onResumeCallback = runnable2;
        f3e f3eVarN0 = f3e.N0();
        this.publishSubject = f3eVarN0;
        this.retryOnErrorCount = new AtomicInteger(0);
        this.isInternetConnected = new AtomicBoolean(bub.m19823b(appCompatActivity.getApplicationContext()));
        this.networkConnectivityStatusChangeListener = new ttb.InterfaceC17206b() { // from class: o.ks3
            @Override // p001o.ttb.InterfaceC17206b
            /* renamed from: a */
            public final void mo36185a(ttb.C17205a c17205a) {
                this.f32657a.lambda$new$2(appCompatActivity, x6cVar, c17205a);
            }
        };
        ttb.m50572j(appCompatActivity).m50582p(this.networkConnectivityStatusChangeListener);
        this.middleObservable = f3eVarN0.m55711D(new gu3() { // from class: o.ls3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f34332a.lambda$new$3(x6cVar, (su5) obj);
            }
        }).m55741y(new jm() { // from class: o.ms3
            @Override // p001o.jm
            public final void run() {
                this.f35901a.lambda$new$4();
            }
        });
    }

    public static <T> x6c getConnectionAwareObservable(AppCompatActivity appCompatActivity, final x6c x6cVar, Runnable runnable, Runnable runnable2, String str) {
        return appCompatActivity == null ? x6cVar : new ConnectionAwareObservable(appCompatActivity, x6c.m55707t(new idg() { // from class: o.ds3
            @Override // p001o.idg
            public final Object get() {
                return ConnectionAwareObservable.lambda$getConnectionAwareObservable$12(x6cVar);
            }
        }), runnable, runnable2, str).middleObservable;
    }
}
