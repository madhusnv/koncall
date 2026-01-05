package p001o;

import java.util.Arrays;
import p001o.ob0;

/* loaded from: classes2.dex */
public final class k85 implements ob0 {

    /* renamed from: a */
    public final boolean f31613a;

    /* renamed from: b */
    public final int f31614b;

    /* renamed from: c */
    public final byte[] f31615c;

    /* renamed from: d */
    public int f31616d;

    /* renamed from: e */
    public int f31617e;

    /* renamed from: f */
    public int f31618f;

    /* renamed from: g */
    public nb0[] f31619g;

    public k85(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // p001o.ob0
    /* renamed from: a */
    public synchronized void mo35159a(ob0.InterfaceC15750a interfaceC15750a) {
        while (interfaceC15750a != null) {
            nb0[] nb0VarArr = this.f31619g;
            int i = this.f31618f;
            this.f31618f = i + 1;
            nb0VarArr[i] = interfaceC15750a.mo41907a();
            this.f31617e--;
            interfaceC15750a = interfaceC15750a.next();
        }
        notifyAll();
    }

    @Override // p001o.ob0
    /* renamed from: b */
    public synchronized nb0 mo35160b() {
        nb0 nb0Var;
        this.f31617e++;
        int i = this.f31618f;
        if (i > 0) {
            nb0[] nb0VarArr = this.f31619g;
            int i2 = i - 1;
            this.f31618f = i2;
            nb0Var = (nb0) op0.m42515e(nb0VarArr[i2]);
            this.f31619g[this.f31618f] = null;
        } else {
            nb0Var = new nb0(new byte[this.f31614b], 0);
            int i3 = this.f31617e;
            nb0[] nb0VarArr2 = this.f31619g;
            if (i3 > nb0VarArr2.length) {
                this.f31619g = (nb0[]) Arrays.copyOf(nb0VarArr2, nb0VarArr2.length * 2);
            }
        }
        return nb0Var;
    }

    @Override // p001o.ob0
    /* renamed from: c */
    public synchronized void mo35161c(nb0 nb0Var) {
        nb0[] nb0VarArr = this.f31619g;
        int i = this.f31618f;
        this.f31618f = i + 1;
        nb0VarArr[i] = nb0Var;
        this.f31617e--;
        notifyAll();
    }

    @Override // p001o.ob0
    /* renamed from: d */
    public synchronized void mo35162d() {
        int i = 0;
        int iMax = Math.max(0, sqi.m48731j(this.f31616d, this.f31614b) - this.f31617e);
        int i2 = this.f31618f;
        if (iMax >= i2) {
            return;
        }
        if (this.f31615c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                nb0 nb0Var = (nb0) op0.m42515e(this.f31619g[i]);
                if (nb0Var.f36636a == this.f31615c) {
                    i++;
                } else {
                    nb0 nb0Var2 = (nb0) op0.m42515e(this.f31619g[i3]);
                    if (nb0Var2.f36636a != this.f31615c) {
                        i3--;
                    } else {
                        nb0[] nb0VarArr = this.f31619g;
                        nb0VarArr[i] = nb0Var2;
                        nb0VarArr[i3] = nb0Var;
                        i3--;
                        i++;
                    }
                }
            }
            iMax = Math.max(iMax, i);
            if (iMax >= this.f31618f) {
                return;
            }
        }
        Arrays.fill(this.f31619g, iMax, this.f31618f, (Object) null);
        this.f31618f = iMax;
    }

    @Override // p001o.ob0
    /* renamed from: e */
    public int mo35163e() {
        return this.f31614b;
    }

    /* renamed from: f */
    public synchronized int m35164f() {
        return this.f31617e * this.f31614b;
    }

    /* renamed from: g */
    public synchronized void m35165g() {
        if (this.f31613a) {
            m35166h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m35166h(int i) {
        boolean z = i < this.f31616d;
        this.f31616d = i;
        if (z) {
            mo35162d();
        }
    }

    public k85(boolean z, int i, int i2) {
        op0.m42511a(i > 0);
        op0.m42511a(i2 >= 0);
        this.f31613a = z;
        this.f31614b = i;
        this.f31618f = i2;
        this.f31619g = new nb0[i2 + 100];
        if (i2 <= 0) {
            this.f31615c = null;
            return;
        }
        this.f31615c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f31619g[i3] = new nb0(this.f31615c, i3 * i);
        }
    }
}
