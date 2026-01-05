package p001o;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes6.dex */
public final class v47 extends s47 {

    /* renamed from: b */
    public final s47 f49841b;

    /* renamed from: c */
    public final Collector f49842c;

    /* renamed from: o.v47$a */
    public static final class C17506a extends jk5 implements h67 {

        /* renamed from: c */
        public final BiConsumer f49843c;

        /* renamed from: d */
        public final Function f49844d;

        /* renamed from: e */
        public rag f49845e;

        /* renamed from: f */
        public boolean f49846f;

        /* renamed from: g */
        public Object f49847g;

        public C17506a(qag qagVar, Object obj, BiConsumer biConsumer, Function function) {
            super(qagVar);
            this.f49847g = obj;
            this.f49843c = biConsumer;
            this.f49844d = function;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f49845e, ragVar)) {
                this.f49845e = ragVar;
                this.f30542a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f49845e.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f49846f) {
                return;
            }
            try {
                this.f49843c.accept(this.f49847g, obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f49845e.cancel();
                onError(th);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f49846f) {
                return;
            }
            this.f49846f = true;
            this.f49845e = wag.CANCELLED;
            Object obj = this.f49847g;
            this.f49847g = null;
            try {
                Object objApply = this.f49844d.apply(obj);
                Objects.requireNonNull(objApply, "The finisher returned a null value");
                m33899c(objApply);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f30542a.onError(th);
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f49846f) {
                fwe.m27599r(th);
                return;
            }
            this.f49846f = true;
            this.f49845e = wag.CANCELLED;
            this.f49847g = null;
            this.f30542a.onError(th);
        }
    }

    public v47(s47 s47Var, Collector collector) {
        this.f49841b = s47Var;
        this.f49842c = collector;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        try {
            this.f49841b.b0(new C17506a(qagVar, this.f49842c.supplier().get(), this.f49842c.accumulator(), this.f49842c.finisher()));
        } catch (Throwable th) {
            zk6.m59526b(th);
            u66.error(th, qagVar);
        }
    }
}
