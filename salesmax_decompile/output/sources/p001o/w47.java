package p001o;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes6.dex */
public final class w47 extends wtf implements nm7 {

    /* renamed from: a */
    public final s47 f51407a;

    /* renamed from: b */
    public final Collector f51408b;

    /* renamed from: o.w47$a */
    public static final class C17773a implements h67, su5 {

        /* renamed from: a */
        public final luf f51409a;

        /* renamed from: b */
        public final BiConsumer f51410b;

        /* renamed from: c */
        public final Function f51411c;

        /* renamed from: d */
        public rag f51412d;

        /* renamed from: e */
        public boolean f51413e;

        /* renamed from: f */
        public Object f51414f;

        public C17773a(luf lufVar, Object obj, BiConsumer biConsumer, Function function) {
            this.f51409a = lufVar;
            this.f51414f = obj;
            this.f51410b = biConsumer;
            this.f51411c = function;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f51412d, ragVar)) {
                this.f51412d = ragVar;
                this.f51409a.mo17881a(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f51412d.cancel();
            this.f51412d = wag.CANCELLED;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f51413e) {
                return;
            }
            try {
                this.f51410b.accept(this.f51414f, obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f51412d.cancel();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f51412d == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f51413e) {
                return;
            }
            this.f51413e = true;
            this.f51412d = wag.CANCELLED;
            Object obj = this.f51414f;
            this.f51414f = null;
            try {
                Object objApply = this.f51411c.apply(obj);
                Objects.requireNonNull(objApply, "The finisher returned a null value");
                this.f51409a.onSuccess(objApply);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f51409a.onError(th);
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f51413e) {
                fwe.m27599r(th);
                return;
            }
            this.f51413e = true;
            this.f51412d = wag.CANCELLED;
            this.f51414f = null;
            this.f51409a.onError(th);
        }
    }

    public w47(s47 s47Var, Collector collector) {
        this.f51407a = s47Var;
        this.f51408b = collector;
    }

    @Override // p001o.nm7
    /* renamed from: c */
    public s47 mo26167c() {
        return new v47(this.f51407a, this.f51408b);
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        try {
            this.f51407a.b0(new C17773a(lufVar, this.f51408b.supplier().get(), this.f51408b.accumulator(), this.f51408b.finisher()));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, lufVar);
        }
    }
}
