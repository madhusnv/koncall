package p001o;

import com.google.android.gms.common.internal.ImagesContract;

/* loaded from: classes3.dex */
public abstract class u2e {

    /* renamed from: o.u2e$a */
    public static final class C17285a extends u2e {

        /* renamed from: a */
        public static final C17285a f48217a = new C17285a();

        public C17285a() {
            super(null);
        }
    }

    /* renamed from: o.u2e$b */
    public static final class C17286b extends u2e {

        /* renamed from: a */
        public final l8i f48218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17286b(l8i l8iVar) {
            super(null);
            sq8.m48649h(l8iVar, ImagesContract.URL);
            this.f48218a = l8iVar;
        }

        /* renamed from: a */
        public final l8i m50869a() {
            return this.f48218a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17286b) && sq8.m48644c(this.f48218a, ((C17286b) obj).f48218a);
        }

        public int hashCode() {
            return this.f48218a.hashCode();
        }

        public String toString() {
            return "Http(url=" + this.f48218a + ')';
        }
    }

    public u2e() {
    }

    public /* synthetic */ u2e(id5 id5Var) {
        this();
    }
}
