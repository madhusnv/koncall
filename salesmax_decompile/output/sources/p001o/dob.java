package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public class dob implements gjb {

    /* renamed from: a */
    public final List f20350a;

    /* renamed from: b */
    public final ged f20351b;

    /* renamed from: o.dob$a */
    public static class C13009a implements lu4, lu4.InterfaceC15153a {

        /* renamed from: a */
        public final List f20352a;

        /* renamed from: b */
        public final ged f20353b;

        /* renamed from: c */
        public int f20354c;

        /* renamed from: d */
        public gid f20355d;

        /* renamed from: e */
        public lu4.InterfaceC15153a f20356e;

        /* renamed from: f */
        public List f20357f;

        /* renamed from: g */
        public boolean f20358g;

        public C13009a(List list, ged gedVar) {
            this.f20353b = gedVar;
            bgd.m18885c(list);
            this.f20352a = list;
            this.f20354c = 0;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return ((lu4) this.f20352a.get(0)).mo18153a();
        }

        @Override // p001o.lu4
        /* renamed from: b */
        public void mo18154b() {
            List list = this.f20357f;
            if (list != null) {
                this.f20353b.mo28525a(list);
            }
            this.f20357f = null;
            Iterator it = this.f20352a.iterator();
            while (it.hasNext()) {
                ((lu4) it.next()).mo18154b();
            }
        }

        @Override // p001o.lu4.InterfaceC15153a
        /* renamed from: c */
        public void mo17835c(Exception exc) {
            ((List) bgd.m18886d(this.f20357f)).add(exc);
            m23649g();
        }

        @Override // p001o.lu4
        public void cancel() {
            this.f20358g = true;
            Iterator it = this.f20352a.iterator();
            while (it.hasNext()) {
                ((lu4) it.next()).cancel();
            }
        }

        @Override // p001o.lu4
        /* renamed from: d */
        public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
            this.f20355d = gidVar;
            this.f20356e = interfaceC15153a;
            this.f20357f = (List) this.f20353b.mo28526b();
            ((lu4) this.f20352a.get(this.f20354c)).mo18155d(gidVar, this);
            if (this.f20358g) {
                cancel();
            }
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ((lu4) this.f20352a.get(0)).mo18156e();
        }

        @Override // p001o.lu4.InterfaceC15153a
        /* renamed from: f */
        public void mo17836f(Object obj) {
            if (obj != null) {
                this.f20356e.mo17836f(obj);
            } else {
                m23649g();
            }
        }

        /* renamed from: g */
        public final void m23649g() {
            if (this.f20358g) {
                return;
            }
            if (this.f20354c < this.f20352a.size() - 1) {
                this.f20354c++;
                mo18155d(this.f20355d, this.f20356e);
            } else {
                bgd.m18886d(this.f20357f);
                this.f20356e.mo17835c(new xs7("Fetch failed", new ArrayList(this.f20357f)));
            }
        }
    }

    public dob(List list, ged gedVar) {
        this.f20350a = list;
        this.f20351b = gedVar;
    }

    @Override // p001o.gjb
    /* renamed from: a */
    public boolean mo18149a(Object obj) {
        Iterator it = this.f20350a.iterator();
        while (it.hasNext()) {
            if (((gjb) it.next()).mo18149a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.gjb
    /* renamed from: b */
    public gjb.C13758a mo18150b(Object obj, int i, int i2, rec recVar) {
        gjb.C13758a c13758aMo18150b;
        int size = this.f20350a.size();
        ArrayList arrayList = new ArrayList(size);
        ic9 ic9Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            gjb gjbVar = (gjb) this.f20350a.get(i3);
            if (gjbVar.mo18149a(obj) && (c13758aMo18150b = gjbVar.mo18150b(obj, i, i2, recVar)) != null) {
                ic9Var = c13758aMo18150b.f25337a;
                arrayList.add(c13758aMo18150b.f25339c);
            }
        }
        if (arrayList.isEmpty() || ic9Var == null) {
            return null;
        }
        return new gjb.C13758a(ic9Var, new C13009a(arrayList, this.f20351b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f20350a.toArray()) + '}';
    }
}
