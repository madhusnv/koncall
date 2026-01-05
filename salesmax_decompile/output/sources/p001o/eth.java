package p001o;

import p001o.q74;

/* loaded from: classes3.dex */
public final class eth extends i7 {

    /* renamed from: c */
    public static final C13259a f22157c = new C13259a(null);

    /* renamed from: b */
    public final dth f22158b;

    /* renamed from: o.eth$a */
    public static final class C13259a implements q74.InterfaceC16312c {
        public C13259a() {
        }

        public /* synthetic */ C13259a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eth(dth dthVar) {
        super(f22157c);
        sq8.m48649h(dthVar, "traceSpan");
        this.f22158b = dthVar;
    }

    /* renamed from: K */
    public final dth m25605K() {
        return this.f22158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eth) && sq8.m48644c(this.f22158b, ((eth) obj).f22158b);
    }

    public int hashCode() {
        return this.f22158b.hashCode();
    }

    public String toString() {
        return "TraceSpanContextElement(" + this.f22158b + ')';
    }
}
