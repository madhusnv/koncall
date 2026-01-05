package p001o;

import java.util.Map;
import p001o.q74;

/* loaded from: classes3.dex */
public final class cka extends i7 {

    /* renamed from: c */
    public static final C12699a f18274c = new C12699a(null);

    /* renamed from: b */
    public final Map f18275b;

    /* renamed from: o.cka$a */
    public static final class C12699a implements q74.InterfaceC16312c {
        public C12699a() {
        }

        public /* synthetic */ C12699a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cka(Map map) {
        super(f18274c);
        sq8.m48649h(map, "kvPairs");
        this.f18275b = map;
    }

    /* renamed from: K */
    public final Map m21346K() {
        return this.f18275b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cka) && sq8.m48644c(this.f18275b, ((cka) obj).f18275b);
    }

    public int hashCode() {
        return this.f18275b.hashCode();
    }

    public String toString() {
        return "LoggingContextElement(" + this.f18275b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cka(hwc... hwcVarArr) {
        this(isa.m32694u(hwcVarArr));
        sq8.m48649h(hwcVarArr, "pairs");
    }
}
