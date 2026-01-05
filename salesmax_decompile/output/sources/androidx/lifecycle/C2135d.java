package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import p001o.sq8;
import p001o.te5;
import p001o.xca;

/* renamed from: androidx.lifecycle.d */
/* loaded from: classes2.dex */
public final class C2135d implements InterfaceC2142k {

    /* renamed from: a */
    public final te5 f7666a;

    /* renamed from: b */
    public final InterfaceC2142k f7667b;

    /* renamed from: androidx.lifecycle.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7668a;

        static {
            int[] iArr = new int[AbstractC2139h.a.values().length];
            try {
                iArr[AbstractC2139h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2139h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2139h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2139h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2139h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2139h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2139h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7668a = iArr;
        }
    }

    public C2135d(te5 te5Var, InterfaceC2142k interfaceC2142k) {
        sq8.m48649h(te5Var, "defaultLifecycleObserver");
        this.f7666a = te5Var;
        this.f7667b = interfaceC2142k;
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        switch (a.f7668a[aVar.ordinal()]) {
            case 1:
                this.f7666a.mo49764g(xcaVar);
                break;
            case 2:
                this.f7666a.onStart(xcaVar);
                break;
            case 3:
                this.f7666a.onResume(xcaVar);
                break;
            case 4:
                this.f7666a.onPause(xcaVar);
                break;
            case 5:
                this.f7666a.onStop(xcaVar);
                break;
            case 6:
                this.f7666a.onDestroy(xcaVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC2142k interfaceC2142k = this.f7667b;
        if (interfaceC2142k != null) {
            interfaceC2142k.mo3717o(xcaVar, aVar);
        }
    }
}
