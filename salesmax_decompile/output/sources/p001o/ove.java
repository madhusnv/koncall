package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ove {

    /* renamed from: h */
    public static int f38969h;

    /* renamed from: c */
    public r8j f38972c;

    /* renamed from: d */
    public r8j f38973d;

    /* renamed from: f */
    public int f38975f;

    /* renamed from: g */
    public int f38976g;

    /* renamed from: a */
    public int f38970a = 0;

    /* renamed from: b */
    public boolean f38971b = false;

    /* renamed from: e */
    public ArrayList f38974e = new ArrayList();

    public ove(r8j r8jVar, int i) {
        this.f38972c = null;
        this.f38973d = null;
        int i2 = f38969h;
        this.f38975f = i2;
        f38969h = i2 + 1;
        this.f38972c = r8jVar;
        this.f38973d = r8jVar;
        this.f38976g = i;
    }

    /* renamed from: a */
    public void m42719a(r8j r8jVar) {
        this.f38974e.add(r8jVar);
        this.f38973d = r8jVar;
    }

    /* renamed from: b */
    public long m42720b(au3 au3Var, int i) {
        long jMo46358j;
        int i2;
        r8j r8jVar = this.f38972c;
        if (r8jVar instanceof zf2) {
            if (((zf2) r8jVar).f43166f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(r8jVar instanceof x08)) {
                return 0L;
            }
        } else if (!(r8jVar instanceof bui)) {
            return 0L;
        }
        em5 em5Var = (i == 0 ? au3Var.f57645e : au3Var.f57646f).f43168h;
        em5 em5Var2 = (i == 0 ? au3Var.f57645e : au3Var.f57646f).f43169i;
        boolean zContains = r8jVar.f43168h.f21871l.contains(em5Var);
        boolean zContains2 = this.f38972c.f43169i.f21871l.contains(em5Var2);
        long jMo46358j2 = this.f38972c.mo46358j();
        if (zContains && zContains2) {
            long jM42722d = m42722d(this.f38972c.f43168h, 0L);
            long jM42721c = m42721c(this.f38972c.f43169i, 0L);
            long j = jM42722d - jMo46358j2;
            r8j r8jVar2 = this.f38972c;
            int i3 = r8jVar2.f43169i.f21865f;
            if (j >= (-i3)) {
                j += i3;
            }
            int i4 = r8jVar2.f43168h.f21865f;
            long j2 = ((-jM42721c) - jMo46358j2) - i4;
            if (j2 >= i4) {
                j2 -= i4;
            }
            float fM59859s = r8jVar2.f43162b.m59859s(i);
            float f = fM59859s > 0.0f ? (long) ((j2 / fM59859s) + (j / (1.0f - fM59859s))) : 0L;
            long j3 = ((long) ((f * fM59859s) + 0.5f)) + jMo46358j2 + ((long) ((f * (1.0f - fM59859s)) + 0.5f));
            jMo46358j = r12.f43168h.f21865f + j3;
            i2 = this.f38972c.f43169i.f21865f;
        } else {
            if (zContains) {
                return Math.max(m42722d(this.f38972c.f43168h, r12.f21865f), this.f38972c.f43168h.f21865f + jMo46358j2);
            }
            if (zContains2) {
                return Math.max(-m42721c(this.f38972c.f43169i, r12.f21865f), (-this.f38972c.f43169i.f21865f) + jMo46358j2);
            }
            jMo46358j = r12.f43168h.f21865f + this.f38972c.mo46358j();
            i2 = this.f38972c.f43169i.f21865f;
        }
        return jMo46358j - i2;
    }

    /* renamed from: c */
    public final long m42721c(em5 em5Var, long j) {
        r8j r8jVar = em5Var.f21863d;
        if (r8jVar instanceof cy7) {
            return j;
        }
        int size = em5Var.f21870k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            cm5 cm5Var = (cm5) em5Var.f21870k.get(i);
            if (cm5Var instanceof em5) {
                em5 em5Var2 = (em5) cm5Var;
                if (em5Var2.f21863d != r8jVar) {
                    jMin = Math.min(jMin, m42721c(em5Var2, em5Var2.f21865f + j));
                }
            }
        }
        if (em5Var != r8jVar.f43169i) {
            return jMin;
        }
        long jMo46358j = j - r8jVar.mo46358j();
        return Math.min(Math.min(jMin, m42721c(r8jVar.f43168h, jMo46358j)), jMo46358j - r8jVar.f43168h.f21865f);
    }

    /* renamed from: d */
    public final long m42722d(em5 em5Var, long j) {
        r8j r8jVar = em5Var.f21863d;
        if (r8jVar instanceof cy7) {
            return j;
        }
        int size = em5Var.f21870k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            cm5 cm5Var = (cm5) em5Var.f21870k.get(i);
            if (cm5Var instanceof em5) {
                em5 em5Var2 = (em5) cm5Var;
                if (em5Var2.f21863d != r8jVar) {
                    jMax = Math.max(jMax, m42722d(em5Var2, em5Var2.f21865f + j));
                }
            }
        }
        if (em5Var != r8jVar.f43168h) {
            return jMax;
        }
        long jMo46358j = j + r8jVar.mo46358j();
        return Math.max(Math.max(jMax, m42722d(r8jVar.f43169i, jMo46358j)), jMo46358j - r8jVar.f43169i.f21865f);
    }
}
