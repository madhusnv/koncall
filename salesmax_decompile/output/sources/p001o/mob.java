package p001o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class mob {

    /* renamed from: o.mob$a */
    public class C15375a extends AbstractC15379e {

        /* renamed from: a */
        public final /* synthetic */ int f35783a;

        public C15375a(int i) {
            this.f35783a = i;
        }

        @Override // p001o.mob.AbstractC15379e
        /* renamed from: c */
        public Map mo39460c() {
            return c9d.m20513c(this.f35783a);
        }
    }

    /* renamed from: o.mob$b */
    public class C15376b extends AbstractC15379e {

        /* renamed from: a */
        public final /* synthetic */ Comparator f35784a;

        public C15376b(Comparator comparator) {
            this.f35784a = comparator;
        }

        @Override // p001o.mob.AbstractC15379e
        /* renamed from: c */
        public Map mo39460c() {
            return new TreeMap(this.f35784a);
        }
    }

    /* renamed from: o.mob$c */
    public static final class C15377c implements hdg, Serializable {

        /* renamed from: a */
        public final int f35785a;

        public C15377c(int i) {
            this.f35785a = rg3.m46690b(i, "expectedValuesPerKey");
        }

        @Override // p001o.hdg
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f35785a);
        }
    }

    /* renamed from: o.mob$d */
    public static abstract class AbstractC15378d extends mob {
        public AbstractC15378d() {
            super(null);
        }

        /* renamed from: e */
        public abstract zea mo39462e();
    }

    /* renamed from: o.mob$e */
    public static abstract class AbstractC15379e {

        /* renamed from: o.mob$e$a */
        public class a extends AbstractC15378d {

            /* renamed from: a */
            public final /* synthetic */ int f35786a;

            public a(int i) {
                this.f35786a = i;
            }

            @Override // p001o.mob.AbstractC15378d
            /* renamed from: e */
            public zea mo39462e() {
                return nob.m40868b(AbstractC15379e.this.mo39460c(), new C15377c(this.f35786a));
            }
        }

        /* renamed from: a */
        public AbstractC15378d m39463a() {
            return m39464b(2);
        }

        /* renamed from: b */
        public AbstractC15378d m39464b(int i) {
            rg3.m46690b(i, "expectedValuesPerKey");
            return new a(i);
        }

        /* renamed from: c */
        public abstract Map mo39460c();
    }

    public mob() {
    }

    public /* synthetic */ mob(C15375a c15375a) {
        this();
    }

    /* renamed from: a */
    public static AbstractC15379e m39456a() {
        return m39457b(8);
    }

    /* renamed from: b */
    public static AbstractC15379e m39457b(int i) {
        rg3.m46690b(i, "expectedKeys");
        return new C15375a(i);
    }

    /* renamed from: c */
    public static AbstractC15379e m39458c() {
        return m39459d(mfc.m38937c());
    }

    /* renamed from: d */
    public static AbstractC15379e m39459d(Comparator comparator) {
        dgd.m23062o(comparator);
        return new C15376b(comparator);
    }
}
