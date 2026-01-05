package p001o;

import androidx.lifecycle.AbstractC2145n;
import java.util.Objects;
import p001o.pa2;
import p001o.v92;

/* loaded from: classes2.dex */
public class qa2 {

    /* renamed from: a */
    public final ta2 f41524a;

    /* renamed from: b */
    public final hpb f41525b;

    /* renamed from: o.qa2$a */
    public static /* synthetic */ class C16327a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41526a;

        static {
            int[] iArr = new int[v92.EnumC17532a.values().length];
            f41526a = iArr;
            try {
                iArr[v92.EnumC17532a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41526a[v92.EnumC17532a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41526a[v92.EnumC17532a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41526a[v92.EnumC17532a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41526a[v92.EnumC17532a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41526a[v92.EnumC17532a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41526a[v92.EnumC17532a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41526a[v92.EnumC17532a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public qa2(ta2 ta2Var) {
        this.f41524a = ta2Var;
        hpb hpbVar = new hpb();
        this.f41525b = hpbVar;
        hpbVar.postValue(pa2.m43261a(pa2.EnumC16044b.CLOSED));
    }

    /* renamed from: a */
    public AbstractC2145n m45038a() {
        return this.f41525b;
    }

    /* renamed from: b */
    public final pa2 m45039b() {
        return this.f41524a.m49599c() ? pa2.m43261a(pa2.EnumC16044b.OPENING) : pa2.m43261a(pa2.EnumC16044b.PENDING_OPEN);
    }

    /* renamed from: c */
    public void m45040c(v92.EnumC17532a enumC17532a, pa2.AbstractC16043a abstractC16043a) {
        pa2 pa2VarM45039b;
        switch (C16327a.f41526a[enumC17532a.ordinal()]) {
            case 1:
                pa2VarM45039b = m45039b();
                break;
            case 2:
                pa2VarM45039b = pa2.m43262b(pa2.EnumC16044b.OPENING, abstractC16043a);
                break;
            case 3:
            case 4:
                pa2VarM45039b = pa2.m43262b(pa2.EnumC16044b.OPEN, abstractC16043a);
                break;
            case 5:
            case 6:
                pa2VarM45039b = pa2.m43262b(pa2.EnumC16044b.CLOSING, abstractC16043a);
                break;
            case 7:
            case 8:
                pa2VarM45039b = pa2.m43262b(pa2.EnumC16044b.CLOSED, abstractC16043a);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC17532a);
        }
        wja.m54627a("CameraStateMachine", "New public camera state " + pa2VarM45039b + " from " + enumC17532a + " and " + abstractC16043a);
        if (Objects.equals((pa2) this.f41525b.getValue(), pa2VarM45039b)) {
            return;
        }
        wja.m54627a("CameraStateMachine", "Publishing new public camera state " + pa2VarM45039b);
        this.f41525b.postValue(pa2VarM45039b);
    }
}
