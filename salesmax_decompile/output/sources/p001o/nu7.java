package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class nu7 extends td9 {

    /* renamed from: i */
    public final lu7 f37314i;

    public nu7(List list) {
        super(list);
        lu7 lu7Var = (lu7) ((sd9) list.get(0)).f45243b;
        int iM37895c = lu7Var != null ? lu7Var.m37895c() : 0;
        this.f37314i = new lu7(new float[iM37895c], new int[iM37895c]);
    }

    @Override // p001o.gc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public lu7 mo20015i(sd9 sd9Var, float f) {
        this.f37314i.m37896d((lu7) sd9Var.f45243b, (lu7) sd9Var.f45244c, f);
        return this.f37314i;
    }
}
