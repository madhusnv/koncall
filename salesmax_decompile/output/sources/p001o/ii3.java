package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public final class ii3 {

    /* renamed from: a */
    public static final ii3 f28698a = new ii3();

    /* renamed from: b */
    public static final float[] f28699b;

    /* renamed from: c */
    public static final float[] f28700c;

    /* renamed from: d */
    public static final nuh f28701d;

    /* renamed from: e */
    public static final nuh f28702e;

    /* renamed from: f */
    public static final zte f28703f;

    /* renamed from: g */
    public static final zte f28704g;

    /* renamed from: h */
    public static final zte f28705h;

    /* renamed from: i */
    public static final zte f28706i;

    /* renamed from: j */
    public static final zte f28707j;

    /* renamed from: k */
    public static final zte f28708k;

    /* renamed from: l */
    public static final zte f28709l;

    /* renamed from: m */
    public static final zte f28710m;

    /* renamed from: n */
    public static final zte f28711n;

    /* renamed from: o */
    public static final zte f28712o;

    /* renamed from: p */
    public static final zte f28713p;

    /* renamed from: q */
    public static final zte f28714q;

    /* renamed from: r */
    public static final zte f28715r;

    /* renamed from: s */
    public static final zte f28716s;

    /* renamed from: t */
    public static final ei3 f28717t;

    /* renamed from: u */
    public static final ei3 f28718u;

    /* renamed from: v */
    public static final zte f28719v;

    /* renamed from: w */
    public static final ei3 f28720w;

    /* renamed from: x */
    public static final ei3[] f28721x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f28699b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f28700c = fArr2;
        nuh nuhVar = new nuh(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null);
        f28701d = nuhVar;
        nuh nuhVar2 = new nuh(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null);
        f28702e = nuhVar2;
        ec8 ec8Var = ec8.f21384a;
        zte zteVar = new zte("sRGB IEC61966-2.1", fArr, ec8Var.m24774e(), nuhVar, 0);
        f28703f = zteVar;
        zte zteVar2 = new zte("sRGB IEC61966-2.1 (Linear)", fArr, ec8Var.m24774e(), 1.0d, 0.0f, 1.0f, 1);
        f28704g = zteVar2;
        zte zteVar3 = new zte("scRGB-nl IEC 61966-2-2:2003", fArr, ec8Var.m24774e(), null, new gx5() { // from class: o.gi3
            @Override // p001o.gx5
            /* renamed from: a */
            public final double mo28788a(double d) {
                return ii3.m32162c(d);
            }
        }, new gx5() { // from class: o.hi3
            @Override // p001o.gx5
            /* renamed from: a */
            public final double mo28788a(double d) {
                return ii3.m32163d(d);
            }
        }, -0.799f, 2.399f, nuhVar, 2);
        f28705h = zteVar3;
        zte zteVar4 = new zte("scRGB IEC 61966-2-2:2003", fArr, ec8Var.m24774e(), 1.0d, -0.5f, 7.499f, 3);
        f28706i = zteVar4;
        zte zteVar5 = new zte("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, ec8Var.m24774e(), new nuh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null), 4);
        f28707j = zteVar5;
        zte zteVar6 = new zte("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, ec8Var.m24774e(), new nuh(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null), 5);
        f28708k = zteVar6;
        zte zteVar7 = new zte("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new m8j(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f28709l = zteVar7;
        zte zteVar8 = new zte("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, ec8Var.m24774e(), nuhVar, 7);
        f28710m = zteVar8;
        zte zteVar9 = new zte("NTSC (1953)", fArr2, ec8Var.m24770a(), new nuh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null), 8);
        f28711n = zteVar9;
        zte zteVar10 = new zte("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, ec8Var.m24774e(), new nuh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null), 9);
        f28712o = zteVar10;
        zte zteVar11 = new zte("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, ec8Var.m24774e(), 2.2d, 0.0f, 1.0f, 10);
        f28713p = zteVar11;
        zte zteVar12 = new zte("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, ec8Var.m24771b(), new nuh(1.8d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0.0625d, 0.031248d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 96, null), 11);
        f28714q = zteVar12;
        zte zteVar13 = new zte("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, ec8Var.m24773d(), 1.0d, -65504.0f, 65504.0f, 12);
        f28715r = zteVar13;
        zte zteVar14 = new zte("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, ec8Var.m24773d(), 1.0d, -65504.0f, 65504.0f, 13);
        f28716s = zteVar14;
        afj afjVar = new afj("Generic XYZ", 14);
        f28717t = afjVar;
        xe9 xe9Var = new xe9("Generic L*a*b*", 15);
        f28718u = xe9Var;
        zte zteVar15 = new zte("None", fArr, ec8Var.m24774e(), nuhVar2, 16);
        f28719v = zteVar15;
        bbc bbcVar = new bbc("Oklab", 17);
        f28720w = bbcVar;
        f28721x = new ei3[]{zteVar, zteVar2, zteVar3, zteVar4, zteVar5, zteVar6, zteVar7, zteVar8, zteVar9, zteVar10, zteVar11, zteVar12, zteVar13, zteVar14, afjVar, xe9Var, zteVar15, bbcVar};
    }

    /* renamed from: c */
    public static final double m32162c(double d) {
        return fi3.m26713a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* renamed from: d */
    public static final double m32163d(double d) {
        return fi3.m26714b(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* renamed from: e */
    public final ei3[] m32164e() {
        return f28721x;
    }

    /* renamed from: f */
    public final float[] m32165f() {
        return f28700c;
    }

    /* renamed from: g */
    public final ei3 m32166g() {
        return f28720w;
    }

    /* renamed from: h */
    public final zte m32167h() {
        return f28703f;
    }

    /* renamed from: i */
    public final float[] m32168i() {
        return f28699b;
    }

    /* renamed from: j */
    public final zte m32169j() {
        return f28719v;
    }
}
