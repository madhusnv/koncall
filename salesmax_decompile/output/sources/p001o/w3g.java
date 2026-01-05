package p001o;

import p001o.zaf;

/* loaded from: classes2.dex */
public final class w3g implements vq6 {

    /* renamed from: a */
    public final long f51385a;

    /* renamed from: b */
    public final vq6 f51386b;

    /* renamed from: o.w3g$a */
    public class C17770a extends rf7 {

        /* renamed from: b */
        public final /* synthetic */ zaf f51387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17770a(zaf zafVar, zaf zafVar2) {
            super(zafVar);
            this.f51387b = zafVar2;
        }

        @Override // p001o.rf7, p001o.zaf
        /* renamed from: e */
        public zaf.C18603a mo25530e(long j) {
            zaf.C18603a c18603aMo25530e = this.f51387b.mo25530e(j);
            bbf bbfVar = c18603aMo25530e.f56857a;
            bbf bbfVar2 = new bbf(bbfVar.f15877a, bbfVar.f15878b + w3g.this.f51385a);
            bbf bbfVar3 = c18603aMo25530e.f56858b;
            return new zaf.C18603a(bbfVar2, new bbf(bbfVar3.f15877a, bbfVar3.f15878b + w3g.this.f51385a));
        }
    }

    public w3g(long j, vq6 vq6Var) {
        this.f51385a = j;
        this.f51386b = vq6Var;
    }

    @Override // p001o.vq6
    /* renamed from: f */
    public uth mo32487f(int i, int i2) {
        return this.f51386b.mo32487f(i, i2);
    }

    @Override // p001o.vq6
    /* renamed from: p */
    public void mo32489p() {
        this.f51386b.mo32489p();
    }

    @Override // p001o.vq6
    /* renamed from: r */
    public void mo32490r(zaf zafVar) {
        this.f51386b.mo32490r(new C17770a(zafVar, zafVar));
    }
}
