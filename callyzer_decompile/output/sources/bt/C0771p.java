package bt;

import dt.C1804j;
import ex.InterfaceC2137a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import zs.C9041f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0771p implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4891a;

    /* renamed from: b */
    public final /* synthetic */ C1804j f4892b;

    /* renamed from: c */
    public final /* synthetic */ String f4893c;

    public /* synthetic */ C0771p(C1804j c1804j, String str, int i10) {
        this.f4891a = i10;
        this.f4892b = c1804j;
        this.f4893c = str;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4891a) {
            case 0:
                this.f4892b.m5477h(new C9041f(AbstractC5601a.m11238i("create_call_note_templates/", this.f4893c, "/-1")));
                break;
            case 1:
                this.f4892b.m5477h(new C9041f(AbstractC5601a.m11238i("create_call_note_templates/", this.f4893c, "/-1")));
                break;
            default:
                this.f4892b.m5477h(new C9041f(AbstractC5601a.m11238i("create_call_note_templates/", this.f4893c, "/-1")));
                break;
        }
        return qw.a0.f30746a;
    }
}
