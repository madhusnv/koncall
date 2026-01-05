package ps;

import android.net.Uri;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import p007h.C2749a;
import ss.C6926o;
import ss.C6928q;
import ss.C6936y;
import ss.z0;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6012l implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f29391a;

    /* renamed from: b */
    public final /* synthetic */ z0 f29392b;

    public /* synthetic */ C6012l(z0 z0Var, int i10) {
        this.f29391a = i10;
        this.f29392b = z0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f29391a) {
            case 0:
                EnumC7204p simSelectionMode = (EnumC7204p) obj;
                AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
                this.f29392b.m13196s(new C6936y(simSelectionMode, "callHistory"));
                break;
            case 1:
                EnumC7204p simSelectionMode2 = (EnumC7204p) obj;
                AbstractC4154l.m8923f(simSelectionMode2, "simSelectionMode");
                this.f29392b.m13196s(new C6936y(simSelectionMode2, "lead"));
                break;
            case 2:
                C2749a it = (C2749a) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f29392b.m13196s(C6926o.f33466a);
                break;
            default:
                Uri uriPath = (Uri) obj;
                AbstractC4154l.m8923f(uriPath, "uriPath");
                String string = uriPath.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                this.f29392b.m13196s(new C6928q(string));
                break;
        }
        return qw.a0.f30746a;
    }
}
