package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.bre;
import p001o.lri;
import p001o.nmh;
import p001o.ule;
import retrofit2.CallAdapter;

/* renamed from: retrofit2.c */
/* loaded from: classes6.dex */
public final class C18792c extends CallAdapter.AbstractC18788a {

    /* renamed from: a */
    public final Executor f58014a;

    /* renamed from: retrofit2.c$a */
    public class a implements CallAdapter {

        /* renamed from: a */
        public final /* synthetic */ Type f58015a;

        /* renamed from: b */
        public final /* synthetic */ Executor f58016b;

        public a(Type type2, Executor executor) {
            this.f58015a = type2;
            this.f58016b = executor;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Call adapt(Call call) {
            Executor executor = this.f58016b;
            return executor == null ? call : new b(executor, call);
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.f58015a;
        }
    }

    /* renamed from: retrofit2.c$b */
    public static final class b implements Call {

        /* renamed from: a */
        public final Executor f58018a;

        /* renamed from: b */
        public final Call f58019b;

        /* renamed from: retrofit2.c$b$a */
        public class a implements Callback {

            /* renamed from: a */
            public final /* synthetic */ Callback f58020a;

            public a(Callback callback) {
                this.f58020a = callback;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m60246c(Callback callback, Throwable th) {
                callback.onFailure(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m60247d(Callback callback, bre breVar) {
                if (b.this.f58019b.isCanceled()) {
                    callback.onFailure(b.this, new IOException("Canceled"));
                } else {
                    callback.onResponse(b.this, breVar);
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call call, final Throwable th) {
                Executor executor = b.this.f58018a;
                final Callback callback = this.f58020a;
                executor.execute(new Runnable() { // from class: o.hc5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26648a.m60246c(callback, th);
                    }
                });
            }

            @Override // retrofit2.Callback
            public void onResponse(Call call, final bre breVar) {
                Executor executor = b.this.f58018a;
                final Callback callback = this.f58020a;
                executor.execute(new Runnable() { // from class: o.gc5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24919a.m60247d(callback, breVar);
                    }
                });
            }
        }

        public b(Executor executor, Call call) {
            this.f58018a = executor;
            this.f58019b = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.f58019b.cancel();
        }

        @Override // retrofit2.Call
        public void enqueue(Callback callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.f58019b.enqueue(new a(callback));
        }

        @Override // retrofit2.Call
        public bre execute() {
            return this.f58019b.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.f58019b.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.f58019b.isExecuted();
        }

        @Override // retrofit2.Call
        public ule request() {
            return this.f58019b.request();
        }

        @Override // retrofit2.Call
        public nmh timeout() {
            return this.f58019b.timeout();
        }

        @Override // retrofit2.Call
        public Call clone() {
            return new b(this.f58018a, this.f58019b.clone());
        }
    }

    public C18792c(Executor executor) {
        this.f58014a = executor;
    }

    @Override // retrofit2.CallAdapter.AbstractC18788a
    /* renamed from: a */
    public CallAdapter mo60229a(Type type2, Annotation[] annotationArr, C18795f c18795f) {
        if (CallAdapter.AbstractC18788a.m60228c(type2) != Call.class) {
            return null;
        }
        if (type2 instanceof ParameterizedType) {
            return new a(lri.m37838g(0, (ParameterizedType) type2), lri.m37843l(annotationArr, SkipCallbackExecutor.class) ? null : this.f58014a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
