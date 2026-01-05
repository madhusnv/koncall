package w4;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import p005f.C2153b;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.b */
/* loaded from: classes.dex */
public final class C7910b extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f38073a;

    /* renamed from: b */
    public final /* synthetic */ DialogC7924p f38074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7910b(DialogC7924p dialogC7924p, int i10) {
        super(1);
        this.f38073a = i10;
        this.f38074b = dialogC7924p;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f38073a) {
            case 0:
                DialogC7924p dialogC7924p = this.f38074b;
                dialogC7924p.show();
                return new C2153b(10, dialogC7924p);
            default:
                DialogC7924p dialogC7924p2 = this.f38074b;
                if (dialogC7924p2.f38117e.f38110a) {
                    dialogC7924p2.f38116d.invoke();
                }
                return a0.f30746a;
        }
    }
}
