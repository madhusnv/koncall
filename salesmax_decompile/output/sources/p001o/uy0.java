package p001o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class uy0 {

    /* renamed from: a */
    public final nf8 f49625a;

    /* renamed from: b */
    public final List f49626b = new ArrayList();

    /* renamed from: c */
    public ByteBuffer[] f49627c = new ByteBuffer[0];

    /* renamed from: d */
    public vy0.C17692a f49628d;

    /* renamed from: e */
    public vy0.C17692a f49629e;

    /* renamed from: f */
    public boolean f49630f;

    public uy0(nf8 nf8Var) {
        this.f49625a = nf8Var;
        vy0.C17692a c17692a = vy0.C17692a.f51020e;
        this.f49628d = c17692a;
        this.f49629e = c17692a;
        this.f49630f = false;
    }

    /* renamed from: a */
    public vy0.C17692a m52123a(vy0.C17692a c17692a) throws vy0.C17693b {
        if (c17692a.equals(vy0.C17692a.f51020e)) {
            throw new vy0.C17693b(c17692a);
        }
        for (int i = 0; i < this.f49625a.size(); i++) {
            vy0 vy0Var = (vy0) this.f49625a.get(i);
            vy0.C17692a c17692aMo32952d = vy0Var.mo32952d(c17692a);
            if (vy0Var.mo21720a()) {
                op0.m42517g(!c17692aMo32952d.equals(vy0.C17692a.f51020e));
                c17692a = c17692aMo32952d;
            }
        }
        this.f49629e = c17692a;
        return c17692a;
    }

    /* renamed from: b */
    public void m52124b() {
        this.f49626b.clear();
        this.f49628d = this.f49629e;
        this.f49630f = false;
        for (int i = 0; i < this.f49625a.size(); i++) {
            vy0 vy0Var = (vy0) this.f49625a.get(i);
            vy0Var.flush();
            if (vy0Var.mo21720a()) {
                this.f49626b.add(vy0Var);
            }
        }
        this.f49627c = new ByteBuffer[this.f49626b.size()];
        for (int i2 = 0; i2 <= m52125c(); i2++) {
            this.f49627c[i2] = ((vy0) this.f49626b.get(i2)).mo32951c();
        }
    }

    /* renamed from: c */
    public final int m52125c() {
        return this.f49627c.length - 1;
    }

    /* renamed from: d */
    public ByteBuffer m52126d() {
        if (!m52128f()) {
            return vy0.f51019a;
        }
        ByteBuffer byteBuffer = this.f49627c[m52125c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m52129g(vy0.f51019a);
        return this.f49627c[m52125c()];
    }

    /* renamed from: e */
    public boolean m52127e() {
        return this.f49630f && ((vy0) this.f49626b.get(m52125c())).mo32950b() && !this.f49627c[m52125c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy0)) {
            return false;
        }
        uy0 uy0Var = (uy0) obj;
        if (this.f49625a.size() != uy0Var.f49625a.size()) {
            return false;
        }
        for (int i = 0; i < this.f49625a.size(); i++) {
            if (this.f49625a.get(i) != uy0Var.f49625a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m52128f() {
        return !this.f49626b.isEmpty();
    }

    /* renamed from: g */
    public final void m52129g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= m52125c()) {
                if (!this.f49627c[i].hasRemaining()) {
                    vy0 vy0Var = (vy0) this.f49626b.get(i);
                    if (!vy0Var.mo32950b()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f49627c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : vy0.f51019a;
                        long jRemaining = byteBuffer2.remaining();
                        vy0Var.mo21721e(byteBuffer2);
                        this.f49627c[i] = vy0Var.mo32951c();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f49627c[i].hasRemaining();
                    } else if (!this.f49627c[i].hasRemaining() && i < m52125c()) {
                        ((vy0) this.f49626b.get(i + 1)).mo32953f();
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: h */
    public void m52130h() {
        if (!m52128f() || this.f49630f) {
            return;
        }
        this.f49630f = true;
        ((vy0) this.f49626b.get(0)).mo32953f();
    }

    public int hashCode() {
        return this.f49625a.hashCode();
    }

    /* renamed from: i */
    public void m52131i(ByteBuffer byteBuffer) {
        if (!m52128f() || this.f49630f) {
            return;
        }
        m52129g(byteBuffer);
    }

    /* renamed from: j */
    public void m52132j() {
        for (int i = 0; i < this.f49625a.size(); i++) {
            vy0 vy0Var = (vy0) this.f49625a.get(i);
            vy0Var.flush();
            vy0Var.reset();
        }
        this.f49627c = new ByteBuffer[0];
        vy0.C17692a c17692a = vy0.C17692a.f51020e;
        this.f49628d = c17692a;
        this.f49629e = c17692a;
        this.f49630f = false;
    }
}
