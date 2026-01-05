package p001o;

/* loaded from: classes6.dex */
public abstract class ii8 extends x6c {

    /* renamed from: o.ii8$a */
    public final class C14300a extends x6c {
        public C14300a() {
        }

        @Override // p001o.x6c
        public void x0(m9c m9cVar) {
            sq8.m48650i(m9cVar, "observer");
            ii8.this.N0(m9cVar);
        }
    }

    public abstract Object L0();

    public final x6c M0() {
        return new C14300a();
    }

    public abstract void N0(m9c m9cVar);

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        sq8.m48650i(m9cVar, "observer");
        N0(m9cVar);
        m9cVar.mo16560e(L0());
    }
}
