package i1;

import android.view.View;
import android.widget.Magnifier;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 implements g1 {

    /* renamed from: b */
    public static final i1 f16885b = new i1(0);

    /* renamed from: c */
    public static final i1 f16886c = new i1(1);

    /* renamed from: a */
    public final /* synthetic */ int f16887a;

    public /* synthetic */ i1(int i10) {
        this.f16887a = i10;
    }

    @Override // i1.g1
    /* renamed from: a */
    public final boolean mo7506a() {
        switch (this.f16887a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // i1.g1
    /* renamed from: b */
    public final f1 mo7507b(View view, InterfaceC6747c interfaceC6747c) {
        switch (this.f16887a) {
            case 0:
                return new h1(new Magnifier(view));
            default:
                return new j1(new Magnifier(view));
        }
    }
}
