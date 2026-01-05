package p001o;

import java.util.Iterator;
import p001o.dn5;
import p001o.xa9;

/* loaded from: classes3.dex */
public final class y89 implements dn5.InterfaceC12997c, dn5, uhd {

    /* renamed from: a */
    public final /* synthetic */ i89 f55060a;

    /* renamed from: b */
    public final /* synthetic */ i89 f55061b;

    /* renamed from: c */
    public final qa9 f55062c;

    /* renamed from: d */
    public final t7f f55063d;

    public y89(qa9 qa9Var, t7f t7fVar, i89 i89Var) {
        sq8.m48649h(qa9Var, "reader");
        sq8.m48649h(t7fVar, "descriptor");
        sq8.m48649h(i89Var, "deserializer");
        this.f55060a = i89Var;
        this.f55061b = i89Var;
        this.f55062c = qa9Var;
        this.f55063d = t7fVar;
    }

    @Override // p001o.uhd
    /* renamed from: b */
    public int mo31724b() {
        return this.f55061b.mo31724b();
    }

    @Override // p001o.dn5
    /* renamed from: c */
    public dn5.InterfaceC12995a mo23577c(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return this.f55060a.mo23577c(h7fVar);
    }

    @Override // p001o.dn5
    /* renamed from: g */
    public dn5.InterfaceC12996b mo23578g(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return this.f55060a.mo23578g(h7fVar);
    }

    @Override // p001o.dn5
    /* renamed from: h */
    public dn5.InterfaceC12997c mo23579h(t7f t7fVar) {
        sq8.m48649h(t7fVar, "descriptor");
        return this.f55060a.mo23579h(t7fVar);
    }

    @Override // p001o.uhd
    /* renamed from: i */
    public String mo31726i() {
        return this.f55061b.mo31726i();
    }

    @Override // p001o.uhd
    /* renamed from: j */
    public vv5 mo31727j() {
        return this.f55061b.mo31727j();
    }

    @Override // p001o.uhd
    /* renamed from: k */
    public float mo31728k() {
        return this.f55061b.mo31728k();
    }

    @Override // p001o.uhd
    /* renamed from: l */
    public gk8 mo31729l(vmh vmhVar) {
        sq8.m48649h(vmhVar, "format");
        return this.f55061b.mo31729l(vmhVar);
    }

    @Override // p001o.dn5.InterfaceC12997c
    /* renamed from: m */
    public Integer mo23583m() {
        xa9 xa9VarPeek = this.f55062c.peek();
        Integer numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        Object obj = null;
        if (sq8.m48644c(xa9VarPeek, xa9.C18090f.f53428a)) {
            xa9 xa9VarNextToken = this.f55062c.nextToken();
            if (xa9VarNextToken.getClass() != xa9.C18090f.class) {
                throw new an5("expected " + kge.m35689b(xa9.C18090f.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
            }
        } else if (!sq8.m48644c(xa9VarPeek, xa9.C18089e.f53427a)) {
            if (sq8.m48644c(xa9VarPeek, xa9.C18092h.f53430a)) {
                xa9 xa9VarNextToken2 = this.f55062c.nextToken();
                if (xa9VarNextToken2.getClass() != xa9.C18092h.class) {
                    throw new an5("expected " + kge.m35689b(xa9.C18092h.class) + "; found " + kge.m35689b(xa9VarNextToken2.getClass()));
                }
            } else {
                xa9 xa9VarNextToken3 = this.f55062c.nextToken();
                if (xa9VarNextToken3.getClass() != xa9.C18091g.class) {
                    throw new an5("expected " + kge.m35689b(xa9.C18091g.class) + "; found " + kge.m35689b(xa9VarNextToken3.getClass()));
                }
                String strM55892a = ((xa9.C18091g) xa9VarNextToken3).m55892a();
                Iterator it = this.f55063d.m49537e().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (sq8.m48644c(z89.m58938a((h7f) next), strM55892a)) {
                        obj = next;
                        break;
                    }
                }
                h7f h7fVar = (h7f) obj;
                if (this.f55063d.m29948c().contains(new cc8(strM55892a))) {
                    this.f55062c.mo41841a();
                    return mo23583m();
                }
                numValueOf = Integer.valueOf(h7fVar != null ? h7fVar.m29946a() : -1);
            }
        }
        if (numValueOf == null || !sq8.m48644c(this.f55062c.peek(), xa9.C18092h.f53430a)) {
            return numValueOf;
        }
        xa9 xa9VarNextToken4 = this.f55062c.nextToken();
        if (xa9VarNextToken4.getClass() == xa9.C18092h.class) {
            return mo23583m();
        }
        throw new an5("expected " + kge.m35689b(xa9.C18092h.class) + "; found " + kge.m35689b(xa9VarNextToken4.getClass()));
    }

    @Override // p001o.uhd
    /* renamed from: n */
    public boolean mo31730n() {
        return this.f55061b.mo31730n();
    }

    @Override // p001o.uhd
    /* renamed from: o */
    public long mo31731o() {
        return this.f55061b.mo31731o();
    }

    @Override // p001o.dn5.InterfaceC12997c
    public void skipValue() {
        this.f55062c.mo41841a();
    }
}
