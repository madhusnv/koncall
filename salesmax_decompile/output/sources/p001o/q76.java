package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class q76 {

    /* renamed from: a */
    public static final C16313a f41423a = new C16313a(null);

    /* renamed from: b */
    public static final List f41424b = bh3.m18963e(C16315c.f41426c);

    /* renamed from: o.q76$a */
    public static final class C16313a {
        public C16313a() {
        }

        public /* synthetic */ C16313a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final q76 m44925a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, ImagesContract.URL) ? C16315c.f41426c : new C16314b(str);
        }
    }

    /* renamed from: o.q76$b */
    public static final class C16314b extends q76 {

        /* renamed from: c */
        public final String f41425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16314b(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f41425c = str;
        }

        @Override // p001o.q76
        /* renamed from: a */
        public String mo44924a() {
            return this.f41425c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16314b) && sq8.m48644c(this.f41425c, ((C16314b) obj).f41425c);
        }

        public int hashCode() {
            return this.f41425c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo44924a() + ')';
        }
    }

    /* renamed from: o.q76$c */
    public static final class C16315c extends q76 {

        /* renamed from: c */
        public static final C16315c f41426c = new C16315c();

        /* renamed from: d */
        public static final String f41427d = ImagesContract.URL;

        public C16315c() {
            super(null);
        }

        @Override // p001o.q76
        /* renamed from: a */
        public String mo44924a() {
            return f41427d;
        }

        public String toString() {
            return "Url";
        }
    }

    public q76() {
    }

    public /* synthetic */ q76(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo44924a();
}
