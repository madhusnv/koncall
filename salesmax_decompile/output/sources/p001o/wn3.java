package p001o;

/* loaded from: classes6.dex */
public final class wn3 extends vn3 {

    /* renamed from: c */
    public final boolean f52370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn3(up8 up8Var, boolean z) {
        super(up8Var);
        sq8.m48649h(up8Var, "writer");
        this.f52370c = z;
    }

    @Override // p001o.vn3
    /* renamed from: n */
    public void mo53032n(String str) {
        sq8.m48649h(str, "value");
        if (this.f52370c) {
            super.mo53032n(str);
        } else {
            super.m53030k(str);
        }
    }
}
