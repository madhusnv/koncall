package ps;

import android.content.Context;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import p005f.C2162k;
import rs.C6612b;
import us.C7536c;
import yv.C8787b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.s */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6019s implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f29420a;

    /* renamed from: b */
    public final /* synthetic */ C2162k f29421b;

    /* renamed from: c */
    public final /* synthetic */ Context f29422c;

    /* renamed from: d */
    public final /* synthetic */ C7536c f29423d;

    public /* synthetic */ C6019s(int i10, Context context, C2162k c2162k, C7536c c7536c) {
        this.f29420a = i10;
        this.f29421b = c2162k;
        this.f29422c = context;
        this.f29423d = c7536c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String selectedPath = (String) obj;
        switch (this.f29420a) {
            case 0:
                AbstractC4154l.m8923f(selectedPath, "selectedPath");
                this.f29421b.mo1274a(C8787b.m16153d(this.f29422c, selectedPath));
                this.f29423d.m14297e(C6612b.f31767a);
                break;
            default:
                AbstractC4154l.m8923f(selectedPath, "selectedPath");
                this.f29421b.mo1274a(C8787b.m16153d(this.f29422c, selectedPath));
                this.f29423d.m14297e(C6612b.f31767a);
                break;
        }
        return qw.a0.f30746a;
    }
}
