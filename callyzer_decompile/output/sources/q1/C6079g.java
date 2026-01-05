package q1;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import ex.InterfaceC2142f;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.g */
/* loaded from: classes.dex */
public final class C6079g extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ C6734c f29650a;

    /* renamed from: b */
    public final /* synthetic */ int f29651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6079g(C6734c c6734c, int i10) {
        super(3);
        this.f29650a = c6734c;
        this.f29651b = i10;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
            this.f29650a.mo1450c(interfaceC0246a, Integer.valueOf(this.f29651b), c3966o, Integer.valueOf(iIntValue & 14));
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
