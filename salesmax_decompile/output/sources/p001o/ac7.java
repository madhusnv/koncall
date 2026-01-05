package p001o;

import com.google.android.gms.cast.MediaError;
import com.google.firebase.perf.util.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class ac7 implements Comparable {

    /* renamed from: H */
    public static final ac7 f14470H;

    /* renamed from: L */
    public static final ac7 f14471L;

    /* renamed from: M */
    public static final ac7 f14472M;

    /* renamed from: Q */
    public static final ac7 f14473Q;

    /* renamed from: X */
    public static final ac7 f14474X;

    /* renamed from: Y */
    public static final ac7 f14475Y;

    /* renamed from: Z */
    public static final ac7 f14476Z;

    /* renamed from: b */
    public static final C12136a f14477b = new C12136a(null);

    /* renamed from: c */
    public static final ac7 f14478c;

    /* renamed from: d */
    public static final ac7 f14479d;

    /* renamed from: e */
    public static final ac7 f14480e;

    /* renamed from: f */
    public static final ac7 f14481f;

    /* renamed from: g */
    public static final ac7 f14482g;

    /* renamed from: h */
    public static final ac7 f14483h;
    public static final ac7 h0;
    public static final List i0;

    /* renamed from: q */
    public static final ac7 f14484q;

    /* renamed from: s */
    public static final ac7 f14485s;

    /* renamed from: x */
    public static final ac7 f14486x;

    /* renamed from: y */
    public static final ac7 f14487y;

    /* renamed from: a */
    public final int f14488a;

    /* renamed from: o.ac7$a */
    public static final class C12136a {
        public C12136a() {
        }

        public /* synthetic */ C12136a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ac7 m16853a() {
            return ac7.f14472M;
        }

        /* renamed from: b */
        public final ac7 m16854b() {
            return ac7.f14483h;
        }
    }

    static {
        ac7 ac7Var = new ac7(100);
        f14478c = ac7Var;
        ac7 ac7Var2 = new ac7(200);
        f14479d = ac7Var2;
        ac7 ac7Var3 = new ac7(300);
        f14480e = ac7Var3;
        ac7 ac7Var4 = new ac7(400);
        f14481f = ac7Var4;
        ac7 ac7Var5 = new ac7(500);
        f14482g = ac7Var5;
        ac7 ac7Var6 = new ac7(MediaError.DetailedErrorCode.TEXT_UNKNOWN);
        f14483h = ac7Var6;
        ac7 ac7Var7 = new ac7(Constants.FROZEN_FRAME_TIME);
        f14484q = ac7Var7;
        ac7 ac7Var8 = new ac7(800);
        f14485s = ac7Var8;
        ac7 ac7Var9 = new ac7(900);
        f14486x = ac7Var9;
        f14487y = ac7Var;
        f14470H = ac7Var2;
        f14471L = ac7Var3;
        f14472M = ac7Var4;
        f14473Q = ac7Var5;
        f14474X = ac7Var6;
        f14475Y = ac7Var7;
        f14476Z = ac7Var8;
        h0 = ac7Var9;
        i0 = ch3.m21249n(ac7Var, ac7Var2, ac7Var3, ac7Var4, ac7Var5, ac7Var6, ac7Var7, ac7Var8, ac7Var9);
    }

    public ac7(int i) {
        this.f14488a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(ac7 ac7Var) {
        sq8.m48649h(ac7Var, "other");
        return sq8.m48651j(this.f14488a, ac7Var.f14488a);
    }

    /* renamed from: e */
    public final int m16852e() {
        return this.f14488a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac7) && this.f14488a == ((ac7) obj).f14488a;
    }

    public int hashCode() {
        return this.f14488a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f14488a + ')';
    }
}
