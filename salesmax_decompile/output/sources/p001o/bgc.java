package p001o;

/* loaded from: classes2.dex */
public abstract class bgc {

    /* renamed from: o.bgc$a */
    public static final class C12381a extends bgc {

        /* renamed from: a */
        public final mfe f16146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12381a(mfe mfeVar) {
            super(null);
            sq8.m48649h(mfeVar, "rect");
            this.f16146a = mfeVar;
        }

        /* renamed from: a */
        public final mfe m18882a() {
            return this.f16146a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12381a) && sq8.m48644c(this.f16146a, ((C12381a) obj).f16146a);
        }

        public int hashCode() {
            return this.f16146a.hashCode();
        }
    }

    public bgc() {
    }

    public /* synthetic */ bgc(id5 id5Var) {
        this();
    }
}
