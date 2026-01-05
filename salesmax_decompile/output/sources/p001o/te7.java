package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p001o.u6f;

/* loaded from: classes3.dex */
public final class te7 implements yra, zhd {

    /* renamed from: a */
    public final ye7 f46921a;

    /* renamed from: b */
    public final h7f f46922b;

    /* renamed from: c */
    public final t6f f46923c;

    /* renamed from: d */
    public int f46924d;

    /* renamed from: e */
    public final re7 f46925e;

    public te7(ye7 ye7Var, h7f h7fVar) {
        Object next;
        sq8.m48649h(ye7Var, "parent");
        sq8.m48649h(h7fVar, "descriptor");
        this.f46921a = ye7Var;
        this.f46922b = h7fVar;
        this.f46923c = ye7Var.m57685v();
        Iterator it = h7fVar.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((hu6) next).getClass() == re7.class) {
                    break;
                }
            }
        }
        hu6 hu6Var = (hu6) next;
        re7 re7Var = (re7) (hu6Var instanceof re7 ? hu6Var : null);
        this.f46925e = re7Var == null ? re7.f43439c.m46579a() : re7Var;
    }

    /* renamed from: t */
    public static final y3i m49766t(String str, te7 te7Var) {
        if (str == null) {
            throw new hff("sparse collections are not supported by form-url encoding");
        }
        te7Var.mo21108d(str);
        return y3i.f54824a;
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(String str) {
        sq8.m48649h(str, "value");
        this.f46921a.mo21108d(str);
    }

    @Override // p001o.yra
    /* renamed from: k */
    public void mo33675k(String str, final String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        m49768v(str, new uk7() { // from class: o.se7
            @Override // p001o.uk7
            public final Object invoke() {
                return te7.m49766t(str2, this);
            }
        });
    }

    @Override // p001o.yra
    /* renamed from: l */
    public void mo33676l() {
    }

    /* renamed from: u */
    public final String m49767u() {
        Set<hu6> setM29948c = this.f46922b.m29948c();
        if (!(setM29948c instanceof Collection) || !setM29948c.isEmpty()) {
            for (hu6 hu6Var : setM29948c) {
            }
        }
        return ze7.m59343j(this.f46922b) + ".entry." + this.f46924d;
    }

    /* renamed from: v */
    public final void m49768v(String str, uk7 uk7Var) {
        m49769w(str);
        u6f.C17307a.m51045b(this.f46923c, "&", 0, 0, 6, null);
        u6f.C17307a.m51045b(this.f46923c, m49767u() + '.' + this.f46925e.m46578c() + '=', 0, 0, 6, null);
        uk7Var.invoke();
    }

    /* renamed from: w */
    public final void m49769w(String str) {
        this.f46924d++;
        if (this.f46923c.m49489c() > 0) {
            u6f.C17307a.m51045b(this.f46923c, "&", 0, 0, 6, null);
        }
        u6f.C17307a.m51045b(this.f46923c, m49767u() + '.' + this.f46925e.m46577b() + '=' + ze7.m59342i(str), 0, 0, 6, null);
    }
}
