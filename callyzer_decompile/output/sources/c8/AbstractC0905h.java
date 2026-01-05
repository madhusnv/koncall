package c8;

import k8.InterfaceC4026c;
import l8.InterfaceC4427a;
import pg.a9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.h */
/* loaded from: classes.dex */
public abstract class AbstractC0905h implements InterfaceC4026c {

    /* renamed from: a */
    public final InterfaceC4427a f5567a;

    /* renamed from: b */
    public final String f5568b;

    /* renamed from: c */
    public boolean f5569c;

    public AbstractC0905h(InterfaceC4427a interfaceC4427a, String str) {
        this.f5567a = interfaceC4427a;
        this.f5568b = str;
    }

    /* renamed from: h */
    public final void m2545h() {
        if (this.f5569c) {
            a9.m11540c(21, "statement is closed");
            throw null;
        }
    }
}
