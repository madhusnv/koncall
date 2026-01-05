package iz;

import b00.C0526k;
import b00.InterfaceC0527l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nx.C5176n;
import pg.h7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.t */
/* loaded from: classes3.dex */
public final class C3387t extends i0 {

    /* renamed from: d */
    public static final C3393z f17973d;

    /* renamed from: b */
    public final List f17974b;

    /* renamed from: c */
    public final List f17975c;

    static {
        C5176n c5176n = C3393z.f18000e;
        f17973d = h7.m11676d("application/x-www-form-urlencoded");
    }

    public C3387t(ArrayList encodedNames, ArrayList encodedValues) {
        AbstractC4154l.m8923f(encodedNames, "encodedNames");
        AbstractC4154l.m8923f(encodedValues, "encodedValues");
        this.f17974b = AbstractC4299e.m9021j(encodedNames);
        this.f17975c = AbstractC4299e.m9021j(encodedValues);
    }

    @Override // iz.i0
    /* renamed from: a */
    public final long mo7445a() {
        return m7785f(null, true);
    }

    @Override // iz.i0
    /* renamed from: b */
    public final C3393z mo7446b() {
        return f17973d;
    }

    @Override // iz.i0
    /* renamed from: e */
    public final void mo7447e(InterfaceC0527l interfaceC0527l) throws EOFException {
        m7785f(interfaceC0527l, false);
    }

    /* renamed from: f */
    public final long m7785f(InterfaceC0527l interfaceC0527l, boolean z6) throws EOFException {
        C0526k c0526kMo1536a;
        if (z6) {
            c0526kMo1536a = new C0526k();
        } else {
            AbstractC4154l.m8920c(interfaceC0527l);
            c0526kMo1536a = interfaceC0527l.mo1536a();
        }
        List list = this.f17974b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c0526kMo1536a.B0(38);
            }
            c0526kMo1536a.H0((String) list.get(i10));
            c0526kMo1536a.B0(61);
            c0526kMo1536a.H0((String) this.f17975c.get(i10));
        }
        if (!z6) {
            return 0L;
        }
        long j6 = c0526kMo1536a.f3638b;
        c0526kMo1536a.m1593n();
        return j6;
    }
}
