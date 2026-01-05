package p001o;

import android.graphics.Paint;
import java.util.List;

/* loaded from: classes3.dex */
public class nlf implements z24 {

    /* renamed from: a */
    public final String f37005a;

    /* renamed from: b */
    public final fg0 f37006b;

    /* renamed from: c */
    public final List f37007c;

    /* renamed from: d */
    public final eg0 f37008d;

    /* renamed from: e */
    public final hg0 f37009e;

    /* renamed from: f */
    public final fg0 f37010f;

    /* renamed from: g */
    public final EnumC15608b f37011g;

    /* renamed from: h */
    public final EnumC15609c f37012h;

    /* renamed from: i */
    public final float f37013i;

    /* renamed from: j */
    public final boolean f37014j;

    /* renamed from: o.nlf$a */
    public static /* synthetic */ class C15607a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37015a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f37016b;

        static {
            int[] iArr = new int[EnumC15609c.values().length];
            f37016b = iArr;
            try {
                iArr[EnumC15609c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37016b[EnumC15609c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37016b[EnumC15609c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC15608b.values().length];
            f37015a = iArr2;
            try {
                iArr2[EnumC15608b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37015a[EnumC15608b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37015a[EnumC15608b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.nlf$b */
    public enum EnumC15608b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = C15607a.f37015a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* renamed from: o.nlf$c */
    public enum EnumC15609c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = C15607a.f37016b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public nlf(String str, fg0 fg0Var, List list, eg0 eg0Var, hg0 hg0Var, fg0 fg0Var2, EnumC15608b enumC15608b, EnumC15609c enumC15609c, float f, boolean z) {
        this.f37005a = str;
        this.f37006b = fg0Var;
        this.f37007c = list;
        this.f37008d = eg0Var;
        this.f37009e = hg0Var;
        this.f37010f = fg0Var2;
        this.f37011g = enumC15608b;
        this.f37012h = enumC15609c;
        this.f37013i = f;
        this.f37014j = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new j9g(emaVar, hc1Var, this);
    }

    /* renamed from: b */
    public EnumC15608b m40756b() {
        return this.f37011g;
    }

    /* renamed from: c */
    public eg0 m40757c() {
        return this.f37008d;
    }

    /* renamed from: d */
    public fg0 m40758d() {
        return this.f37006b;
    }

    /* renamed from: e */
    public EnumC15609c m40759e() {
        return this.f37012h;
    }

    /* renamed from: f */
    public List m40760f() {
        return this.f37007c;
    }

    /* renamed from: g */
    public float m40761g() {
        return this.f37013i;
    }

    /* renamed from: h */
    public String m40762h() {
        return this.f37005a;
    }

    /* renamed from: i */
    public hg0 m40763i() {
        return this.f37009e;
    }

    /* renamed from: j */
    public fg0 m40764j() {
        return this.f37010f;
    }

    /* renamed from: k */
    public boolean m40765k() {
        return this.f37014j;
    }
}
