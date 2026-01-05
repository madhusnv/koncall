package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public final class f84 extends i7 {

    /* renamed from: c */
    public static final C13363a f22941c = new C13363a(null);

    /* renamed from: b */
    public final String f22942b;

    /* renamed from: o.f84$a */
    public static final class C13363a implements q74.InterfaceC16312c {
        public C13363a() {
        }

        public /* synthetic */ C13363a(id5 id5Var) {
            this();
        }
    }

    public f84(String str) {
        super(f22941c);
        this.f22942b = str;
    }

    /* renamed from: K */
    public final String m26280K() {
        return this.f22942b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f84) && sq8.m48644c(this.f22942b, ((f84) obj).f22942b);
    }

    public int hashCode() {
        return this.f22942b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f22942b + ')';
    }
}
