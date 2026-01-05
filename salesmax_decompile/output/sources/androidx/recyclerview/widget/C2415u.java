package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p001o.ged;
import p001o.ied;
import p001o.ktf;
import p001o.rla;

/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes2.dex */
public class C2415u {

    /* renamed from: a */
    public final ktf f10203a = new ktf();

    /* renamed from: b */
    public final rla f10204b = new rla();

    /* renamed from: androidx.recyclerview.widget.u$a */
    public static class a {

        /* renamed from: d */
        public static ged f10205d = new ied(20);

        /* renamed from: a */
        public int f10206a;

        /* renamed from: b */
        public RecyclerView.AbstractC2376m.c f10207b;

        /* renamed from: c */
        public RecyclerView.AbstractC2376m.c f10208c;

        /* renamed from: a */
        public static void m9710a() {
            while (f10205d.mo28526b() != null) {
            }
        }

        /* renamed from: b */
        public static a m9711b() {
            a aVar = (a) f10205d.mo28526b();
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: c */
        public static void m9712c(a aVar) {
            aVar.f10206a = 0;
            aVar.f10207b = null;
            aVar.f10208c = null;
            f10205d.mo28525a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$b */
    public interface b {
        /* renamed from: a */
        void mo9119a(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2);

        /* renamed from: b */
        void mo9120b(RecyclerView.d0 d0Var);

        /* renamed from: c */
        void mo9121c(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2);

        /* renamed from: d */
        void mo9122d(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar, RecyclerView.AbstractC2376m.c cVar2);
    }

    /* renamed from: a */
    public void m9693a(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar) {
        a aVarM9711b = (a) this.f10203a.get(d0Var);
        if (aVarM9711b == null) {
            aVarM9711b = a.m9711b();
            this.f10203a.put(d0Var, aVarM9711b);
        }
        aVarM9711b.f10206a |= 2;
        aVarM9711b.f10207b = cVar;
    }

    /* renamed from: b */
    public void m9694b(RecyclerView.d0 d0Var) {
        a aVarM9711b = (a) this.f10203a.get(d0Var);
        if (aVarM9711b == null) {
            aVarM9711b = a.m9711b();
            this.f10203a.put(d0Var, aVarM9711b);
        }
        aVarM9711b.f10206a |= 1;
    }

    /* renamed from: c */
    public void m9695c(long j, RecyclerView.d0 d0Var) {
        this.f10204b.m46936i(j, d0Var);
    }

    /* renamed from: d */
    public void m9696d(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar) {
        a aVarM9711b = (a) this.f10203a.get(d0Var);
        if (aVarM9711b == null) {
            aVarM9711b = a.m9711b();
            this.f10203a.put(d0Var, aVarM9711b);
        }
        aVarM9711b.f10208c = cVar;
        aVarM9711b.f10206a |= 8;
    }

    /* renamed from: e */
    public void m9697e(RecyclerView.d0 d0Var, RecyclerView.AbstractC2376m.c cVar) {
        a aVarM9711b = (a) this.f10203a.get(d0Var);
        if (aVarM9711b == null) {
            aVarM9711b = a.m9711b();
            this.f10203a.put(d0Var, aVarM9711b);
        }
        aVarM9711b.f10207b = cVar;
        aVarM9711b.f10206a |= 4;
    }

    /* renamed from: f */
    public void m9698f() {
        this.f10203a.clear();
        this.f10204b.clear();
    }

    /* renamed from: g */
    public RecyclerView.d0 m9699g(long j) {
        return (RecyclerView.d0) this.f10204b.m46932c(j);
    }

    /* renamed from: h */
    public boolean m9700h(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f10203a.get(d0Var);
        return (aVar == null || (aVar.f10206a & 1) == 0) ? false : true;
    }

    /* renamed from: i */
    public boolean m9701i(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f10203a.get(d0Var);
        return (aVar == null || (aVar.f10206a & 4) == 0) ? false : true;
    }

    /* renamed from: j */
    public void m9702j() {
        a.m9710a();
    }

    /* renamed from: k */
    public void m9703k(RecyclerView.d0 d0Var) {
        m9708p(d0Var);
    }

    /* renamed from: l */
    public final RecyclerView.AbstractC2376m.c m9704l(RecyclerView.d0 d0Var, int i) {
        a aVar;
        RecyclerView.AbstractC2376m.c cVar;
        int iM36225e = this.f10203a.m36225e(d0Var);
        if (iM36225e >= 0 && (aVar = (a) this.f10203a.m36228o(iM36225e)) != null) {
            int i2 = aVar.f10206a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.f10206a = i3;
                if (i == 4) {
                    cVar = aVar.f10207b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f10208c;
                }
                if ((i3 & 12) == 0) {
                    this.f10203a.mo32670k(iM36225e);
                    a.m9712c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public RecyclerView.AbstractC2376m.c m9705m(RecyclerView.d0 d0Var) {
        return m9704l(d0Var, 8);
    }

    /* renamed from: n */
    public RecyclerView.AbstractC2376m.c m9706n(RecyclerView.d0 d0Var) {
        return m9704l(d0Var, 4);
    }

    /* renamed from: o */
    public void m9707o(b bVar) {
        for (int size = this.f10203a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.f10203a.m36227g(size);
            a aVar = (a) this.f10203a.mo32670k(size);
            int i = aVar.f10206a;
            if ((i & 3) == 3) {
                bVar.mo9120b(d0Var);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC2376m.c cVar = aVar.f10207b;
                if (cVar == null) {
                    bVar.mo9120b(d0Var);
                } else {
                    bVar.mo9121c(d0Var, cVar, aVar.f10208c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo9119a(d0Var, aVar.f10207b, aVar.f10208c);
            } else if ((i & 12) == 12) {
                bVar.mo9122d(d0Var, aVar.f10207b, aVar.f10208c);
            } else if ((i & 4) != 0) {
                bVar.mo9121c(d0Var, aVar.f10207b, null);
            } else if ((i & 8) != 0) {
                bVar.mo9119a(d0Var, aVar.f10207b, aVar.f10208c);
            }
            a.m9712c(aVar);
        }
    }

    /* renamed from: p */
    public void m9708p(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f10203a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f10206a &= -2;
    }

    /* renamed from: q */
    public void m9709q(RecyclerView.d0 d0Var) {
        int iM46940m = this.f10204b.m46940m() - 1;
        while (true) {
            if (iM46940m < 0) {
                break;
            }
            if (d0Var == this.f10204b.m46941n(iM46940m)) {
                this.f10204b.m46939l(iM46940m);
                break;
            }
            iM46940m--;
        }
        a aVar = (a) this.f10203a.remove(d0Var);
        if (aVar != null) {
            a.m9712c(aVar);
        }
    }
}
