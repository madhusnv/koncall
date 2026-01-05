package l5;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.f */
/* loaded from: classes.dex */
public class C4387f implements InterfaceC4385d {

    /* renamed from: d */
    public final AbstractC4398q f21963d;

    /* renamed from: f */
    public int f21965f;

    /* renamed from: g */
    public int f21966g;

    /* renamed from: a */
    public AbstractC4398q f21960a = null;

    /* renamed from: b */
    public boolean f21961b = false;

    /* renamed from: c */
    public boolean f21962c = false;

    /* renamed from: e */
    public EnumC4386e f21964e = EnumC4386e.UNKNOWN;

    /* renamed from: h */
    public int f21967h = 1;

    /* renamed from: i */
    public C4388g f21968i = null;

    /* renamed from: j */
    public boolean f21969j = false;

    /* renamed from: k */
    public final ArrayList f21970k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f21971l = new ArrayList();

    public C4387f(AbstractC4398q abstractC4398q) {
        this.f21963d = abstractC4398q;
    }

    @Override // l5.InterfaceC4385d
    /* renamed from: a */
    public final void mo9155a(InterfaceC4385d interfaceC4385d) {
        ArrayList arrayList = this.f21971l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (!((C4387f) obj).f21969j) {
                return;
            }
        }
        this.f21962c = true;
        AbstractC4398q abstractC4398q = this.f21960a;
        if (abstractC4398q != null) {
            abstractC4398q.mo9155a(this);
        }
        if (this.f21961b) {
            this.f21963d.mo9155a(this);
            return;
        }
        int size2 = arrayList.size();
        C4387f c4387f = null;
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            C4387f c4387f2 = (C4387f) obj2;
            if (!(c4387f2 instanceof C4388g)) {
                i10++;
                c4387f = c4387f2;
            }
        }
        if (c4387f != null && i10 == 1 && c4387f.f21969j) {
            C4388g c4388g = this.f21968i;
            if (c4388g != null) {
                if (!c4388g.f21969j) {
                    return;
                } else {
                    this.f21965f = this.f21967h * c4388g.f21966g;
                }
            }
            mo9165d(c4387f.f21966g + this.f21965f);
        }
        AbstractC4398q abstractC4398q2 = this.f21960a;
        if (abstractC4398q2 != null) {
            abstractC4398q2.mo9155a(this);
        }
    }

    /* renamed from: b */
    public final void m9163b(AbstractC4398q abstractC4398q) {
        this.f21970k.add(abstractC4398q);
        if (this.f21969j) {
            abstractC4398q.mo9155a(abstractC4398q);
        }
    }

    /* renamed from: c */
    public final void m9164c() {
        this.f21971l.clear();
        this.f21970k.clear();
        this.f21969j = false;
        this.f21966g = 0;
        this.f21962c = false;
        this.f21961b = false;
    }

    /* renamed from: d */
    public void mo9165d(int i10) {
        if (this.f21969j) {
            return;
        }
        this.f21969j = true;
        this.f21966g = i10;
        ArrayList arrayList = this.f21970k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            InterfaceC4385d interfaceC4385d = (InterfaceC4385d) obj;
            interfaceC4385d.mo9155a(interfaceC4385d);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21963d.f21982b.f20756X);
        sb2.append(":");
        sb2.append(this.f21964e);
        sb2.append("(");
        sb2.append(this.f21969j ? Integer.valueOf(this.f21966g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f21971l.size());
        sb2.append(":d=");
        sb2.append(this.f21970k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
