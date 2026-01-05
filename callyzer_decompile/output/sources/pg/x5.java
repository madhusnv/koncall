package pg;

import i4.InterfaceC3170d;
import kotlin.jvm.internal.AbstractC4154l;
import uw.C7565i;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x5 implements InterfaceC3170d {
    /* renamed from: a */
    public static InterfaceC7562f m11926a(InterfaceC7562f interfaceC7562f, InterfaceC7563g key) {
        AbstractC4154l.m8923f(key, "key");
        if (AbstractC4154l.m8918a(interfaceC7562f.getKey(), key)) {
            return interfaceC7562f;
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC7564h m11927b(InterfaceC7562f interfaceC7562f, InterfaceC7563g key) {
        AbstractC4154l.m8923f(key, "key");
        return AbstractC4154l.m8918a(interfaceC7562f.getKey(), key) ? C7565i.f36440a : interfaceC7562f;
    }

    /* renamed from: d */
    public static InterfaceC7564h m11928d(InterfaceC7562f interfaceC7562f, InterfaceC7564h context) {
        AbstractC4154l.m8923f(context, "context");
        return context == C7565i.f36440a ? interfaceC7562f : (InterfaceC7564h) context.A0(interfaceC7562f, new sq.i2(26));
    }

    /* renamed from: c */
    public abstract int mo7537c(int i10);

    /* renamed from: e */
    public abstract int mo7538e(int i10);

    @Override // i4.InterfaceC3170d
    /* renamed from: i */
    public int mo2599i(int i10) {
        int iMo7537c = mo7537c(i10);
        if (iMo7537c == -1 || mo7537c(iMo7537c) == -1) {
            return -1;
        }
        return iMo7537c;
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: j */
    public int mo2600j(int i10) {
        int iMo7538e = mo7538e(i10);
        if (iMo7538e == -1 || mo7538e(iMo7538e) == -1) {
            return -1;
        }
        return iMo7538e;
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: l */
    public int mo2602l(int i10) {
        return mo7538e(i10);
    }

    @Override // i4.InterfaceC3170d
    /* renamed from: m */
    public int mo2603m(int i10) {
        return mo7537c(i10);
    }
}
