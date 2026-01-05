package qr;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import p005f.C2153b;
import ur.AbstractC7524q;
import ur.C7511d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.x */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6300x implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f30623a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7524q f30624b;

    public /* synthetic */ C6300x(AbstractC7524q abstractC7524q, int i10) {
        this.f30623a = i10;
        this.f30624b = abstractC7524q;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f30623a) {
            case 0:
                k2.f0 DisposableEffect = (k2.f0) obj;
                AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
                return new C2153b(5, this.f30624b);
            default:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f30624b.mo2033e(new C7511d(it));
                return qw.a0.f30746a;
        }
    }
}
