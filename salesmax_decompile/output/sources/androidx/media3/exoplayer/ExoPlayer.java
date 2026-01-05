package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.C2194d;
import androidx.media3.exoplayer.C2207e;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.gms.location.DeviceOrientationRequest;
import p001o.abf;
import p001o.auh;
import p001o.be5;
import p001o.fj5;
import p001o.hdg;
import p001o.hf5;
import p001o.ig5;
import p001o.jb3;
import p001o.mad;
import p001o.oke;
import p001o.ol7;
import p001o.op0;
import p001o.qga;
import p001o.sqi;
import p001o.wx0;
import p001o.x8b;

/* loaded from: classes2.dex */
public interface ExoPlayer extends mad {

    /* renamed from: androidx.media3.exoplayer.ExoPlayer$a */
    public interface InterfaceC2188a {
        /* renamed from: C */
        default void m6830C(boolean z) {
        }

        /* renamed from: F */
        void mo6831F(boolean z);
    }

    /* renamed from: androidx.media3.exoplayer.ExoPlayer$b */
    public static final class C2189b {

        /* renamed from: A */
        public long f8087A;

        /* renamed from: B */
        public boolean f8088B;

        /* renamed from: C */
        public boolean f8089C;

        /* renamed from: D */
        public Looper f8090D;

        /* renamed from: E */
        public boolean f8091E;

        /* renamed from: F */
        public boolean f8092F;

        /* renamed from: G */
        public String f8093G;

        /* renamed from: H */
        public boolean f8094H;

        /* renamed from: a */
        public final Context f8095a;

        /* renamed from: b */
        public jb3 f8096b;

        /* renamed from: c */
        public long f8097c;

        /* renamed from: d */
        public hdg f8098d;

        /* renamed from: e */
        public hdg f8099e;

        /* renamed from: f */
        public hdg f8100f;

        /* renamed from: g */
        public hdg f8101g;

        /* renamed from: h */
        public hdg f8102h;

        /* renamed from: i */
        public ol7 f8103i;

        /* renamed from: j */
        public Looper f8104j;

        /* renamed from: k */
        public int f8105k;

        /* renamed from: l */
        public wx0 f8106l;

        /* renamed from: m */
        public boolean f8107m;

        /* renamed from: n */
        public int f8108n;

        /* renamed from: o */
        public boolean f8109o;

        /* renamed from: p */
        public boolean f8110p;

        /* renamed from: q */
        public boolean f8111q;

        /* renamed from: r */
        public int f8112r;

        /* renamed from: s */
        public int f8113s;

        /* renamed from: t */
        public boolean f8114t;

        /* renamed from: u */
        public abf f8115u;

        /* renamed from: v */
        public long f8116v;

        /* renamed from: w */
        public long f8117w;

        /* renamed from: x */
        public long f8118x;

        /* renamed from: y */
        public qga f8119y;

        /* renamed from: z */
        public long f8120z;

        public C2189b(final Context context) {
            this(context, new hdg() { // from class: o.rm6
                @Override // p001o.hdg
                public final Object get() {
                    return ExoPlayer.C2189b.m6837g(context);
                }
            }, new hdg() { // from class: o.sm6
                @Override // p001o.hdg
                public final Object get() {
                    return ExoPlayer.C2189b.m6838h(context);
                }
            });
        }

        /* renamed from: g */
        public static /* synthetic */ oke m6837g(Context context) {
            return new ig5(context);
        }

        /* renamed from: h */
        public static /* synthetic */ x8b.InterfaceC18075a m6838h(Context context) {
            return new hf5(context, new be5());
        }

        /* renamed from: i */
        public static /* synthetic */ auh m6839i(Context context) {
            return new fj5(context);
        }

        /* renamed from: k */
        public static /* synthetic */ x8b.InterfaceC18075a m6841k(x8b.InterfaceC18075a interfaceC18075a) {
            return interfaceC18075a;
        }

        /* renamed from: f */
        public ExoPlayer m6842f() {
            op0.m42517g(!this.f8091E);
            this.f8091E = true;
            return new C2209g(this, null);
        }

        /* renamed from: l */
        public C2189b m6843l(wx0 wx0Var, boolean z) {
            op0.m42517g(!this.f8091E);
            this.f8106l = (wx0) op0.m42515e(wx0Var);
            this.f8107m = z;
            return this;
        }

        /* renamed from: m */
        public C2189b m6844m(final x8b.InterfaceC18075a interfaceC18075a) {
            op0.m42517g(!this.f8091E);
            op0.m42515e(interfaceC18075a);
            this.f8099e = new hdg() { // from class: o.tm6
                @Override // p001o.hdg
                public final Object get() {
                    return ExoPlayer.C2189b.m6841k(interfaceC18075a);
                }
            };
            return this;
        }

        public C2189b(final Context context, hdg hdgVar, hdg hdgVar2) {
            this(context, hdgVar, hdgVar2, new hdg() { // from class: o.um6
                @Override // p001o.hdg
                public final Object get() {
                    return ExoPlayer.C2189b.m6839i(context);
                }
            }, new hdg() { // from class: o.vm6
                @Override // p001o.hdg
                public final Object get() {
                    return new C2207e();
                }
            }, new hdg() { // from class: o.wm6
                @Override // p001o.hdg
                public final Object get() {
                    return ec5.m24753n(context);
                }
            }, new ol7() { // from class: o.xm6
                @Override // p001o.ol7
                public final Object apply(Object obj) {
                    return new ya5((jb3) obj);
                }
            });
        }

        public C2189b(Context context, hdg hdgVar, hdg hdgVar2, hdg hdgVar3, hdg hdgVar4, hdg hdgVar5, ol7 ol7Var) {
            this.f8095a = (Context) op0.m42515e(context);
            this.f8098d = hdgVar;
            this.f8099e = hdgVar2;
            this.f8100f = hdgVar3;
            this.f8101g = hdgVar4;
            this.f8102h = hdgVar5;
            this.f8103i = ol7Var;
            this.f8104j = sqi.m48716U();
            this.f8106l = wx0.f52810g;
            this.f8108n = 0;
            this.f8112r = 1;
            this.f8113s = 0;
            this.f8114t = true;
            this.f8115u = abf.f14452g;
            this.f8116v = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            this.f8117w = 15000L;
            this.f8118x = 3000L;
            this.f8119y = new C2194d.b().m6906a();
            this.f8096b = jb3.f30077a;
            this.f8120z = 500L;
            this.f8087A = 2000L;
            this.f8089C = true;
            this.f8093G = "";
            this.f8105k = -1000;
        }
    }

    /* renamed from: androidx.media3.exoplayer.ExoPlayer$c */
    public static class C2190c {

        /* renamed from: b */
        public static final C2190c f8121b = new C2190c(-9223372036854775807L);

        /* renamed from: a */
        public final long f8122a;

        public C2190c(long j) {
            this.f8122a = j;
        }
    }

    /* renamed from: q */
    void mo6829q(x8b x8bVar);

    void release();

    void setImageOutput(ImageOutput imageOutput);
}
