package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class oth {

    /* renamed from: a */
    public tg5 f38903a;

    /* renamed from: b */
    public long f38904b;

    /* renamed from: c */
    public long f38905c;

    /* renamed from: d */
    public long f38906d;

    /* renamed from: e */
    public int f38907e;

    /* renamed from: f */
    public int f38908f;

    /* renamed from: l */
    public boolean f38914l;

    /* renamed from: n */
    public nth f38916n;

    /* renamed from: p */
    public boolean f38918p;

    /* renamed from: q */
    public long f38919q;

    /* renamed from: r */
    public boolean f38920r;

    /* renamed from: g */
    public long[] f38909g = new long[0];

    /* renamed from: h */
    public int[] f38910h = new int[0];

    /* renamed from: i */
    public int[] f38911i = new int[0];

    /* renamed from: j */
    public long[] f38912j = new long[0];

    /* renamed from: k */
    public boolean[] f38913k = new boolean[0];

    /* renamed from: m */
    public boolean[] f38915m = new boolean[0];

    /* renamed from: o */
    public final zwc f38917o = new zwc();

    /* renamed from: a */
    public void m42682a(uq6 uq6Var) {
        uq6Var.readFully(this.f38917o.m60024e(), 0, this.f38917o.m60026g());
        this.f38917o.m60017U(0);
        this.f38918p = false;
    }

    /* renamed from: b */
    public void m42683b(zwc zwcVar) {
        zwcVar.m60031l(this.f38917o.m60024e(), 0, this.f38917o.m60026g());
        this.f38917o.m60017U(0);
        this.f38918p = false;
    }

    /* renamed from: c */
    public long m42684c(int i) {
        return this.f38912j[i];
    }

    /* renamed from: d */
    public void m42685d(int i) {
        this.f38917o.m60013Q(i);
        this.f38914l = true;
        this.f38918p = true;
    }

    /* renamed from: e */
    public void m42686e(int i, int i2) {
        this.f38907e = i;
        this.f38908f = i2;
        if (this.f38910h.length < i) {
            this.f38909g = new long[i];
            this.f38910h = new int[i];
        }
        if (this.f38911i.length < i2) {
            int i3 = (i2 * Opcodes.LUSHR) / 100;
            this.f38911i = new int[i3];
            this.f38912j = new long[i3];
            this.f38913k = new boolean[i3];
            this.f38915m = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void m42687f() {
        this.f38907e = 0;
        this.f38919q = 0L;
        this.f38920r = false;
        this.f38914l = false;
        this.f38918p = false;
        this.f38916n = null;
    }

    /* renamed from: g */
    public boolean m42688g(int i) {
        return this.f38914l && this.f38915m[i];
    }
}
