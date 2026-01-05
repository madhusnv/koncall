package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p001o.b38;
import p001o.bre;
import retrofit2.CallAdapter;

/* renamed from: retrofit2.b */
/* loaded from: classes6.dex */
public final class C18791b extends CallAdapter.AbstractC18788a {

    /* renamed from: a */
    public static final CallAdapter.AbstractC18788a f58006a = new C18791b();

    /* renamed from: retrofit2.b$a */
    public static final class a implements CallAdapter {

        /* renamed from: a */
        public final Type f58007a;

        /* renamed from: retrofit2.b$a$a, reason: collision with other inner class name */
        public class C19597a implements Callback {

            /* renamed from: a */
            public final CompletableFuture f58008a;

            public C19597a(CompletableFuture completableFuture) {
                this.f58008a = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable th) {
                this.f58008a.completeExceptionally(th);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call call, bre breVar) {
                if (breVar.m19665d()) {
                    this.f58008a.complete(breVar.m19663a());
                } else {
                    this.f58008a.completeExceptionally(new b38(breVar));
                }
            }
        }

        public a(Type type2) {
            this.f58007a = type2;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompletableFuture adapt(Call call) {
            b bVar = new b(call);
            call.enqueue(new C19597a(bVar));
            return bVar;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.f58007a;
        }
    }

    /* renamed from: retrofit2.b$b */
    public static final class b extends CompletableFuture {

        /* renamed from: a */
        public final Call f58010a;

        public b(Call call) {
            this.f58010a = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f58010a.cancel();
            }
            return super.cancel(z);
        }
    }

    /* renamed from: retrofit2.b$c */
    public static final class c implements CallAdapter {

        /* renamed from: a */
        public final Type f58011a;

        /* renamed from: retrofit2.b$c$a */
        public class a implements Callback {

            /* renamed from: a */
            public final CompletableFuture f58012a;

            public a(CompletableFuture completableFuture) {
                this.f58012a = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable th) {
                this.f58012a.completeExceptionally(th);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call call, bre breVar) {
                this.f58012a.complete(breVar);
            }
        }

        public c(Type type2) {
            this.f58011a = type2;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompletableFuture adapt(Call call) {
            b bVar = new b(call);
            call.enqueue(new a(bVar));
            return bVar;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.f58011a;
        }
    }

    @Override // retrofit2.CallAdapter.AbstractC18788a
    /* renamed from: a */
    public CallAdapter mo60229a(Type type2, Annotation[] annotationArr, C18795f c18795f) {
        if (CallAdapter.AbstractC18788a.m60228c(type2) != CompletableFuture.class) {
            return null;
        }
        if (!(type2 instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM60227b = CallAdapter.AbstractC18788a.m60227b(0, (ParameterizedType) type2);
        if (CallAdapter.AbstractC18788a.m60228c(typeM60227b) != bre.class) {
            return new a(typeM60227b);
        }
        if (typeM60227b instanceof ParameterizedType) {
            return new c(CallAdapter.AbstractC18788a.m60227b(0, (ParameterizedType) typeM60227b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
