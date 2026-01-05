package p001o;

import p001o.sc8;

/* loaded from: classes2.dex */
public final class l6f implements sc8.InterfaceC16805i {

    /* renamed from: e */
    public static final C15006a f33323e = new C15006a(null);

    /* renamed from: a */
    public final sc8.InterfaceC16805i f33324a;

    /* renamed from: b */
    public final Object f33325b;

    /* renamed from: c */
    public boolean f33326c;

    /* renamed from: d */
    public sc8.InterfaceC16806j f33327d;

    /* renamed from: o.l6f$a */
    public static final class C15006a {
        public C15006a() {
        }

        public /* synthetic */ C15006a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final l6f m36633a(sc8.InterfaceC16805i interfaceC16805i) {
            return new l6f(interfaceC16805i, null);
        }
    }

    public /* synthetic */ l6f(sc8.InterfaceC16805i interfaceC16805i, id5 id5Var) {
        this(interfaceC16805i);
    }

    /* renamed from: c */
    public static final void m36627c(l6f l6fVar) {
        sq8.m48649h(l6fVar, "this$0");
        synchronized (l6fVar.f33325b) {
            if (l6fVar.f33327d == null) {
                wja.m54638l("ScreenFlashWrapper", "apply: pendingListener is null!");
            }
            l6fVar.m36630e();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: g */
    public static final l6f m36628g(sc8.InterfaceC16805i interfaceC16805i) {
        return f33323e.m36633a(interfaceC16805i);
    }

    @Override // p001o.sc8.InterfaceC16805i
    /* renamed from: a */
    public void mo4747a(long j, sc8.InterfaceC16806j interfaceC16806j) {
        y3i y3iVar;
        sq8.m48649h(interfaceC16806j, "screenFlashListener");
        synchronized (this.f33325b) {
            this.f33326c = true;
            this.f33327d = interfaceC16806j;
            y3i y3iVar2 = y3i.f54824a;
        }
        sc8.InterfaceC16805i interfaceC16805i = this.f33324a;
        if (interfaceC16805i != null) {
            interfaceC16805i.mo4747a(j, new sc8.InterfaceC16806j() { // from class: o.k6f
                @Override // p001o.sc8.InterfaceC16806j
                public final void onCompleted() {
                    l6f.m36627c(this.f31546a);
                }
            });
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            wja.m54629c("ScreenFlashWrapper", "apply: screenFlash is null!");
            m36630e();
        }
    }

    @Override // p001o.sc8.InterfaceC16805i
    public void clear() {
        m36629d();
    }

    /* renamed from: d */
    public final void m36629d() {
        y3i y3iVar;
        synchronized (this.f33325b) {
            if (this.f33326c) {
                sc8.InterfaceC16805i interfaceC16805i = this.f33324a;
                if (interfaceC16805i != null) {
                    interfaceC16805i.clear();
                    y3iVar = y3i.f54824a;
                } else {
                    y3iVar = null;
                }
                if (y3iVar == null) {
                    wja.m54629c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                wja.m54638l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            this.f33326c = false;
            y3i y3iVar2 = y3i.f54824a;
        }
    }

    /* renamed from: e */
    public final void m36630e() {
        synchronized (this.f33325b) {
            sc8.InterfaceC16806j interfaceC16806j = this.f33327d;
            if (interfaceC16806j != null) {
                interfaceC16806j.onCompleted();
            }
            this.f33327d = null;
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: f */
    public final void m36631f() {
        m36630e();
        m36629d();
    }

    /* renamed from: h */
    public final sc8.InterfaceC16805i m36632h() {
        return this.f33324a;
    }

    public l6f(sc8.InterfaceC16805i interfaceC16805i) {
        this.f33324a = interfaceC16805i;
        this.f33325b = new Object();
    }
}
