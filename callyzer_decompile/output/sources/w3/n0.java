package w3;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aw.C0473m;
import ay.C0496f;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.o7;
import pg.x5;
import uw.InterfaceC7559c;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: B */
    public static final n0 f37866B;

    /* renamed from: C */
    public static final n0 f37867C;

    /* renamed from: D */
    public static final n0 f37868D;

    /* renamed from: E */
    public static final n0 f37869E;

    /* renamed from: F */
    public static final n0 f37870F;

    /* renamed from: G */
    public static final n0 f37871G;

    /* renamed from: H */
    public static final n0 f37872H;

    /* renamed from: I */
    public static final n0 f37873I;

    /* renamed from: b */
    public static final n0 f37874b;

    /* renamed from: c */
    public static final n0 f37875c;

    /* renamed from: d */
    public static final n0 f37876d;

    /* renamed from: e */
    public static final n0 f37877e;

    /* renamed from: f */
    public static final n0 f37878f;

    /* renamed from: g */
    public static final n0 f37879g;

    /* renamed from: h */
    public static final n0 f37880h;

    /* renamed from: j */
    public static final n0 f37881j;

    /* renamed from: k */
    public static final n0 f37882k;

    /* renamed from: l */
    public static final n0 f37883l;

    /* renamed from: m */
    public static final n0 f37884m;

    /* renamed from: n */
    public static final n0 f37885n;

    /* renamed from: p */
    public static final n0 f37886p;

    /* renamed from: q */
    public static final n0 f37887q;

    /* renamed from: r */
    public static final n0 f37888r;

    /* renamed from: s */
    public static final n0 f37889s;

    /* renamed from: t */
    public static final n0 f37890t;

    /* renamed from: v */
    public static final n0 f37891v;

    /* renamed from: w */
    public static final n0 f37892w;

    /* renamed from: x */
    public static final n0 f37893x;

    /* renamed from: y */
    public static final n0 f37894y;

    /* renamed from: z */
    public static final n0 f37895z;

    /* renamed from: a */
    public final /* synthetic */ int f37896a;

    static {
        int i10 = 0;
        f37874b = new n0(i10, 0);
        f37875c = new n0(i10, 1);
        f37876d = new n0(i10, 2);
        f37877e = new n0(i10, 3);
        f37878f = new n0(i10, 4);
        f37879g = new n0(i10, 5);
        f37880h = new n0(i10, 6);
        f37881j = new n0(i10, 7);
        f37882k = new n0(i10, 8);
        f37883l = new n0(i10, 9);
        f37884m = new n0(i10, 10);
        f37885n = new n0(i10, 11);
        f37886p = new n0(i10, 12);
        f37887q = new n0(i10, 13);
        f37888r = new n0(i10, 14);
        f37889s = new n0(i10, 15);
        f37890t = new n0(i10, 16);
        f37891v = new n0(i10, 17);
        f37892w = new n0(i10, 18);
        f37893x = new n0(i10, 19);
        f37894y = new n0(i10, 20);
        f37895z = new n0(i10, 21);
        f37866B = new n0(i10, 22);
        f37867C = new n0(i10, 23);
        f37868D = new n0(i10, 24);
        f37869E = new n0(i10, 25);
        f37870F = new n0(i10, 26);
        f37871G = new n0(i10, 27);
        f37872H = new n0(i10, 28);
        f37873I = new n0(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i10, int i11) {
        super(i10);
        this.f37896a = i11;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        Choreographer choreographer;
        InterfaceC7559c interfaceC7559c = null;
        switch (this.f37896a) {
            case 0:
                AndroidCompositionLocals_androidKt.m726b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.m726b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.m726b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.m726b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.m726b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.m726b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C0496f c0496f = tx.m0.f34659a;
                    choreographer = (Choreographer) tx.c0.m13468D(AbstractC8819m.f42514a, new C0473m(2, 13, interfaceC7559c));
                }
                u0 u0Var = new u0(choreographer, o7.m11807b(Looper.getMainLooper()));
                return x5.m11928d(u0Var, u0Var.f37979m);
            case 7:
            case 8:
                return null;
            case 9:
                k1.m14971b("LocalAutofillManager");
                throw null;
            case 10:
                k1.m14971b("LocalAutofillTree");
                throw null;
            case 11:
                k1.m14971b("LocalClipboard");
                throw null;
            case 12:
                k1.m14971b("LocalClipboardManager");
                throw null;
            case 13:
                return Boolean.TRUE;
            case 14:
                k1.m14971b("LocalDensity");
                throw null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                k1.m14971b("LocalFocusManager");
                throw null;
            case 16:
                k1.m14971b("LocalFontFamilyResolver");
                throw null;
            case 17:
                k1.m14971b("LocalFontLoader");
                throw null;
            case 18:
                k1.m14971b("LocalGraphicsContext");
                throw null;
            case 19:
                k1.m14971b("LocalHapticFeedback");
                throw null;
            case 20:
                k1.m14971b("LocalInputManager");
                throw null;
            case 21:
                k1.m14971b("LocalLayoutDirection");
                throw null;
            case 22:
                return null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case 25:
                return null;
            case 26:
                k1.m14971b("LocalTextToolbar");
                throw null;
            case 27:
                k1.m14971b("LocalUriHandler");
                throw null;
            case 28:
                k1.m14971b("LocalViewConfiguration");
                throw null;
            default:
                k1.m14971b("LocalWindowInfo");
                throw null;
        }
    }
}
