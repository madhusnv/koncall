package p001o;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class sk3 {

    /* renamed from: a */
    public static final sk3 f45509a = new C16853a();

    /* renamed from: b */
    public static final sk3 f45510b = new C16854b(-1);

    /* renamed from: c */
    public static final sk3 f45511c = new C16854b(1);

    /* renamed from: o.sk3$a */
    public class C16853a extends sk3 {
        public C16853a() {
            super(null);
        }

        @Override // p001o.sk3
        /* renamed from: d */
        public sk3 mo48422d(int i, int i2) {
            return m48428k(br8.m19638e(i, i2));
        }

        @Override // p001o.sk3
        /* renamed from: e */
        public sk3 mo48423e(long j, long j2) {
            return m48428k(tla.m50159a(j, j2));
        }

        @Override // p001o.sk3
        /* renamed from: f */
        public sk3 mo48424f(Object obj, Object obj2, Comparator comparator) {
            return m48428k(comparator.compare(obj, obj2));
        }

        @Override // p001o.sk3
        /* renamed from: g */
        public sk3 mo48425g(boolean z, boolean z2) {
            return m48428k(ik1.m32229a(z, z2));
        }

        @Override // p001o.sk3
        /* renamed from: h */
        public sk3 mo48426h(boolean z, boolean z2) {
            return m48428k(ik1.m32229a(z2, z));
        }

        @Override // p001o.sk3
        /* renamed from: i */
        public int mo48427i() {
            return 0;
        }

        /* renamed from: k */
        public sk3 m48428k(int i) {
            return i < 0 ? sk3.f45510b : i > 0 ? sk3.f45511c : sk3.f45509a;
        }
    }

    /* renamed from: o.sk3$b */
    public static final class C16854b extends sk3 {

        /* renamed from: d */
        public final int f45512d;

        public C16854b(int i) {
            super(null);
            this.f45512d = i;
        }

        @Override // p001o.sk3
        /* renamed from: d */
        public sk3 mo48422d(int i, int i2) {
            return this;
        }

        @Override // p001o.sk3
        /* renamed from: e */
        public sk3 mo48423e(long j, long j2) {
            return this;
        }

        @Override // p001o.sk3
        /* renamed from: f */
        public sk3 mo48424f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // p001o.sk3
        /* renamed from: g */
        public sk3 mo48425g(boolean z, boolean z2) {
            return this;
        }

        @Override // p001o.sk3
        /* renamed from: h */
        public sk3 mo48426h(boolean z, boolean z2) {
            return this;
        }

        @Override // p001o.sk3
        /* renamed from: i */
        public int mo48427i() {
            return this.f45512d;
        }
    }

    public sk3() {
    }

    public /* synthetic */ sk3(C16853a c16853a) {
        this();
    }

    /* renamed from: j */
    public static sk3 m48421j() {
        return f45509a;
    }

    /* renamed from: d */
    public abstract sk3 mo48422d(int i, int i2);

    /* renamed from: e */
    public abstract sk3 mo48423e(long j, long j2);

    /* renamed from: f */
    public abstract sk3 mo48424f(Object obj, Object obj2, Comparator comparator);

    /* renamed from: g */
    public abstract sk3 mo48425g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract sk3 mo48426h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo48427i();
}
