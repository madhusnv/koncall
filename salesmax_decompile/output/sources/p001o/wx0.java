package p001o;

import android.media.AudioAttributes;

/* loaded from: classes2.dex */
public final class wx0 {

    /* renamed from: g */
    public static final wx0 f52810g = new C17995e().m55317a();

    /* renamed from: h */
    public static final String f52811h = sqi.B0(0);

    /* renamed from: i */
    public static final String f52812i = sqi.B0(1);

    /* renamed from: j */
    public static final String f52813j = sqi.B0(2);

    /* renamed from: k */
    public static final String f52814k = sqi.B0(3);

    /* renamed from: l */
    public static final String f52815l = sqi.B0(4);

    /* renamed from: a */
    public final int f52816a;

    /* renamed from: b */
    public final int f52817b;

    /* renamed from: c */
    public final int f52818c;

    /* renamed from: d */
    public final int f52819d;

    /* renamed from: e */
    public final int f52820e;

    /* renamed from: f */
    public C17994d f52821f;

    /* renamed from: o.wx0$b */
    public static final class C17992b {
        /* renamed from: a */
        public static void m55315a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* renamed from: o.wx0$c */
    public static final class C17993c {
        /* renamed from: a */
        public static void m55316a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* renamed from: o.wx0$d */
    public static final class C17994d {

        /* renamed from: a */
        public final AudioAttributes f52822a;

        public C17994d(wx0 wx0Var) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(wx0Var.f52816a).setFlags(wx0Var.f52817b).setUsage(wx0Var.f52818c);
            int i = sqi.f45790a;
            if (i >= 29) {
                C17992b.m55315a(usage, wx0Var.f52819d);
            }
            if (i >= 32) {
                C17993c.m55316a(usage, wx0Var.f52820e);
            }
            this.f52822a = usage.build();
        }
    }

    /* renamed from: o.wx0$e */
    public static final class C17995e {

        /* renamed from: a */
        public int f52823a = 0;

        /* renamed from: b */
        public int f52824b = 0;

        /* renamed from: c */
        public int f52825c = 1;

        /* renamed from: d */
        public int f52826d = 1;

        /* renamed from: e */
        public int f52827e = 0;

        /* renamed from: a */
        public wx0 m55317a() {
            return new wx0(this.f52823a, this.f52824b, this.f52825c, this.f52826d, this.f52827e);
        }
    }

    /* renamed from: a */
    public C17994d m55314a() {
        if (this.f52821f == null) {
            this.f52821f = new C17994d();
        }
        return this.f52821f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wx0.class != obj.getClass()) {
            return false;
        }
        wx0 wx0Var = (wx0) obj;
        return this.f52816a == wx0Var.f52816a && this.f52817b == wx0Var.f52817b && this.f52818c == wx0Var.f52818c && this.f52819d == wx0Var.f52819d && this.f52820e == wx0Var.f52820e;
    }

    public int hashCode() {
        return ((((((((527 + this.f52816a) * 31) + this.f52817b) * 31) + this.f52818c) * 31) + this.f52819d) * 31) + this.f52820e;
    }

    public wx0(int i, int i2, int i3, int i4, int i5) {
        this.f52816a = i;
        this.f52817b = i2;
        this.f52818c = i3;
        this.f52819d = i4;
        this.f52820e = i5;
    }
}
