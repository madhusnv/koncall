package w4;

import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import lx.InterfaceC4574m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.c */
/* loaded from: classes.dex */
public final class C7911c extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C7911c f38075b;

    /* renamed from: c */
    public static final C7911c f38076c;

    /* renamed from: d */
    public static final C7911c f38077d;

    /* renamed from: e */
    public static final C7911c f38078e;

    /* renamed from: f */
    public static final C7911c f38079f;

    /* renamed from: g */
    public static final C7911c f38080g;

    /* renamed from: a */
    public final /* synthetic */ int f38081a;

    static {
        int i10 = 1;
        f38075b = new C7911c(i10, 0);
        f38076c = new C7911c(i10, 1);
        f38077d = new C7911c(i10, 2);
        f38078e = new C7911c(i10, 3);
        f38079f = new C7911c(i10, 4);
        f38080g = new C7911c(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7911c(int i10, int i11) {
        super(i10);
        this.f38081a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f38081a;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
                ((C1583k) ((InterfaceC1596x) obj)).m5202q(AbstractC1592t.f7938v, a0Var);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC4574m[] interfaceC4574mArr2 = AbstractC1594v.f7944a;
                ((C1583k) ((InterfaceC1596x) obj)).m5202q(AbstractC1592t.f7937u, a0Var);
                break;
            case 4:
                break;
            default:
                C7927s c7927s = (C7927s) obj;
                if (c7927s.isAttachedToWindow()) {
                    c7927s.m15057j();
                    break;
                }
                break;
        }
        return a0Var;
    }
}
