package v4;

import androidx.compose.ui.viewinterop.AbstractC0265a;
import d7.InterfaceC1649u;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g8.InterfaceC2547g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import v3.g0;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.l */
/* loaded from: classes.dex */
public final class C7666l extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C7666l f37131b;

    /* renamed from: c */
    public static final C7666l f37132c;

    /* renamed from: d */
    public static final C7666l f37133d;

    /* renamed from: e */
    public static final C7666l f37134e;

    /* renamed from: f */
    public static final C7666l f37135f;

    /* renamed from: g */
    public static final C7666l f37136g;

    /* renamed from: h */
    public static final C7666l f37137h;

    /* renamed from: a */
    public final /* synthetic */ int f37138a;

    static {
        int i10 = 2;
        f37131b = new C7666l(i10, 0);
        f37132c = new C7666l(i10, 1);
        f37133d = new C7666l(i10, 2);
        f37134e = new C7666l(i10, 3);
        f37135f = new C7666l(i10, 4);
        f37136g = new C7666l(i10, 5);
        f37137h = new C7666l(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7666l(int i10, int i11) {
        super(i10);
        this.f37138a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37138a) {
            case 0:
                AbstractC0265a.m730c((g0) obj).setUpdateBlock((InterfaceC2139c) obj2);
                return a0.f30746a;
            case 1:
                AbstractC0265a.m730c((g0) obj).setReleaseBlock((InterfaceC2139c) obj2);
                return a0.f30746a;
            case 2:
                AbstractC0265a.m730c((g0) obj).setModifier((InterfaceC7879r) obj2);
                return a0.f30746a;
            case 3:
                AbstractC0265a.m730c((g0) obj).setDensity((InterfaceC6747c) obj2);
                return a0.f30746a;
            case 4:
                AbstractC0265a.m730c((g0) obj).setLifecycleOwner((InterfaceC1649u) obj2);
                return a0.f30746a;
            case 5:
                AbstractC0265a.m730c((g0) obj).setSavedStateRegistryOwner((InterfaceC2547g) obj2);
                return a0.f30746a;
            default:
                C7672r c7672rM730c = AbstractC0265a.m730c((g0) obj);
                int i10 = AbstractC7668n.f37145a[((EnumC6757m) obj2).ordinal()];
                int i11 = 1;
                if (i10 == 1) {
                    i11 = 0;
                } else if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c7672rM730c.setLayoutDirection(i11);
                return a0.f30746a;
        }
    }
}
