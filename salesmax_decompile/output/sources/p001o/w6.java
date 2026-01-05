package p001o;

import p001o.x6;

/* loaded from: classes6.dex */
public class w6 extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ x6 f51520a;

    public w6(x6 x6Var) {
        this.f51520a = x6Var;
    }

    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        return new x6.C18061a(this.f51520a.f53254d[0], this.f51520a.f53254d[1], this.f51520a.f53254d[2], this.f51520a.f53254d[3]);
    }
}
