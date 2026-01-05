package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class em5 implements cm5 {

    /* renamed from: d */
    public r8j f21863d;

    /* renamed from: f */
    public int f21865f;

    /* renamed from: g */
    public int f21866g;

    /* renamed from: a */
    public cm5 f21860a = null;

    /* renamed from: b */
    public boolean f21861b = false;

    /* renamed from: c */
    public boolean f21862c = false;

    /* renamed from: e */
    public EnumC13217a f21864e = EnumC13217a.UNKNOWN;

    /* renamed from: h */
    public int f21867h = 1;

    /* renamed from: i */
    public gt5 f21868i = null;

    /* renamed from: j */
    public boolean f21869j = false;

    /* renamed from: k */
    public List f21870k = new ArrayList();

    /* renamed from: l */
    public List f21871l = new ArrayList();

    /* renamed from: o.em5$a */
    public enum EnumC13217a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public em5(r8j r8jVar) {
        this.f21863d = r8jVar;
    }

    @Override // p001o.cm5
    /* renamed from: a */
    public void mo19843a(cm5 cm5Var) {
        Iterator it = this.f21871l.iterator();
        while (it.hasNext()) {
            if (!((em5) it.next()).f21869j) {
                return;
            }
        }
        this.f21862c = true;
        cm5 cm5Var2 = this.f21860a;
        if (cm5Var2 != null) {
            cm5Var2.mo19843a(this);
        }
        if (this.f21861b) {
            this.f21863d.mo19843a(this);
            return;
        }
        em5 em5Var = null;
        int i = 0;
        for (em5 em5Var2 : this.f21871l) {
            if (!(em5Var2 instanceof gt5)) {
                i++;
                em5Var = em5Var2;
            }
        }
        if (em5Var != null && i == 1 && em5Var.f21869j) {
            gt5 gt5Var = this.f21868i;
            if (gt5Var != null) {
                if (!gt5Var.f21869j) {
                    return;
                } else {
                    this.f21865f = this.f21867h * gt5Var.f21866g;
                }
            }
            mo25285d(em5Var.f21866g + this.f21865f);
        }
        cm5 cm5Var3 = this.f21860a;
        if (cm5Var3 != null) {
            cm5Var3.mo19843a(this);
        }
    }

    /* renamed from: b */
    public void m25283b(cm5 cm5Var) {
        this.f21870k.add(cm5Var);
        if (this.f21869j) {
            cm5Var.mo19843a(cm5Var);
        }
    }

    /* renamed from: c */
    public void m25284c() {
        this.f21871l.clear();
        this.f21870k.clear();
        this.f21869j = false;
        this.f21866g = 0;
        this.f21862c = false;
        this.f21861b = false;
    }

    /* renamed from: d */
    public void mo25285d(int i) {
        if (this.f21869j) {
            return;
        }
        this.f21869j = true;
        this.f21866g = i;
        for (cm5 cm5Var : this.f21870k) {
            cm5Var.mo19843a(cm5Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21863d.f43162b.m59862v());
        sb.append(":");
        sb.append(this.f21864e);
        sb.append("(");
        sb.append(this.f21869j ? Integer.valueOf(this.f21866g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f21871l.size());
        sb.append(":d=");
        sb.append(this.f21870k.size());
        sb.append(">");
        return sb.toString();
    }
}
