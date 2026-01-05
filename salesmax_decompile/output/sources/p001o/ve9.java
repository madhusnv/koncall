package p001o;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public abstract class ve9 {

    /* renamed from: a */
    public static boolean f50232a = false;

    /* renamed from: b */
    public static boolean f50233b = false;

    /* renamed from: c */
    public static String[] f50234c;

    /* renamed from: d */
    public static long[] f50235d;

    /* renamed from: e */
    public static int f50236e;

    /* renamed from: f */
    public static int f50237f;

    /* renamed from: g */
    public static lma f50238g;

    /* renamed from: h */
    public static kma f50239h;

    /* renamed from: i */
    public static volatile wtb f50240i;

    /* renamed from: j */
    public static volatile ktb f50241j;

    /* renamed from: o.ve9$a */
    public class C17565a implements kma {

        /* renamed from: a */
        public final /* synthetic */ Context f50242a;

        public C17565a(Context context) {
            this.f50242a = context;
        }

        @Override // p001o.kma
        /* renamed from: a */
        public File mo35930a() {
            return new File(this.f50242a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m52656a(String str) {
        if (f50233b) {
            int i = f50236e;
            if (i == 20) {
                f50237f++;
                return;
            }
            f50234c[i] = str;
            f50235d[i] = System.nanoTime();
            zsh.m59821a(str);
            f50236e++;
        }
    }

    /* renamed from: b */
    public static float m52657b(String str) {
        int i = f50237f;
        if (i > 0) {
            f50237f = i - 1;
            return 0.0f;
        }
        if (!f50233b) {
            return 0.0f;
        }
        int i2 = f50236e - 1;
        f50236e = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f50234c[i2])) {
            zsh.m59822b();
            return (System.nanoTime() - f50235d[f50236e]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f50234c[f50236e] + ".");
    }

    /* renamed from: c */
    public static ktb m52658c(Context context) {
        Context applicationContext = context.getApplicationContext();
        ktb ktbVar = f50241j;
        if (ktbVar == null) {
            synchronized (ktb.class) {
                ktbVar = f50241j;
                if (ktbVar == null) {
                    kma c17565a = f50239h;
                    if (c17565a == null) {
                        c17565a = new C17565a(applicationContext);
                    }
                    ktbVar = new ktb(c17565a);
                    f50241j = ktbVar;
                }
            }
        }
        return ktbVar;
    }

    /* renamed from: d */
    public static wtb m52659d(Context context) {
        wtb wtbVar = f50240i;
        if (wtbVar == null) {
            synchronized (wtb.class) {
                wtbVar = f50240i;
                if (wtbVar == null) {
                    ktb ktbVarM52658c = m52658c(context);
                    lma ze5Var = f50238g;
                    if (ze5Var == null) {
                        ze5Var = new ze5();
                    }
                    wtbVar = new wtb(ktbVarM52658c, ze5Var);
                    f50240i = wtbVar;
                }
            }
        }
        return wtbVar;
    }
}
