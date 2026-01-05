package p001o;

import android.content.Context;
import p001o.ds0;
import p001o.khg;
import p001o.m1b;

/* loaded from: classes2.dex */
public final class af5 implements m1b.InterfaceC15199b {

    /* renamed from: a */
    public final Context f14591a;

    /* renamed from: b */
    public int f14592b = 0;

    /* renamed from: c */
    public boolean f14593c = true;

    public af5(Context context) {
        this.f14591a = context;
    }

    @Override // p001o.m1b.InterfaceC15199b
    /* renamed from: a */
    public m1b mo16985a(m1b.C15198a c15198a) {
        int i;
        if (sqi.f45790a < 23 || !((i = this.f14592b) == 1 || (i == 0 && m16986b()))) {
            return new khg.C14838b().mo16985a(c15198a);
        }
        int iM56181i = xeb.m56181i(c15198a.f34638c.f7943n);
        ria.m46822f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + sqi.s0(iM56181i));
        ds0.C13023b c13023b = new ds0.C13023b(iM56181i);
        c13023b.m23740e(this.f14593c);
        return c13023b.mo16985a(c15198a);
    }

    /* renamed from: b */
    public final boolean m16986b() {
        int i = sqi.f45790a;
        if (i >= 31) {
            return true;
        }
        Context context = this.f14591a;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
