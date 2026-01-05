package p001o;

import com.google.android.gms.cast.MediaError;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class hti {

    /* renamed from: a */
    public static final C14074a f27542a = new C14074a(null);

    /* renamed from: b */
    public static final List f27543b = ch3.m21249n(C14075b.f27544c, C14077d.f27547c);

    /* renamed from: o.hti$a */
    public static final class C14074a {
        public C14074a() {
        }

        public /* synthetic */ C14074a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final hti m31129a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, MediaError.ERROR_TYPE_ERROR) ? C14075b.f27544c : sq8.m48644c(str, "SUCCESS") ? C14077d.f27547c : new C14076c(str);
        }
    }

    /* renamed from: o.hti$b */
    public static final class C14075b extends hti {

        /* renamed from: c */
        public static final C14075b f27544c = new C14075b();

        /* renamed from: d */
        public static final String f27545d = MediaError.ERROR_TYPE_ERROR;

        public C14075b() {
            super(null);
        }

        public String toString() {
            return "Error";
        }
    }

    /* renamed from: o.hti$c */
    public static final class C14076c extends hti {

        /* renamed from: c */
        public final String f27546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14076c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f27546c = str;
        }

        /* renamed from: a */
        public String m31130a() {
            return this.f27546c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14076c) && sq8.m48644c(this.f27546c, ((C14076c) obj).f27546c);
        }

        public int hashCode() {
            return this.f27546c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m31130a() + ')';
        }
    }

    /* renamed from: o.hti$d */
    public static final class C14077d extends hti {

        /* renamed from: c */
        public static final C14077d f27547c = new C14077d();

        /* renamed from: d */
        public static final String f27548d = "SUCCESS";

        public C14077d() {
            super(null);
        }

        public String toString() {
            return "Success";
        }
    }

    public hti() {
    }

    public /* synthetic */ hti(id5 id5Var) {
        this();
    }
}
