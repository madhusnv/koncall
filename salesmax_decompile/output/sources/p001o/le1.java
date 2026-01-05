package p001o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public abstract class le1 implements Cloneable {

    /* renamed from: H */
    public boolean f33669H;

    /* renamed from: M */
    public Drawable f33671M;

    /* renamed from: Q */
    public int f33672Q;

    /* renamed from: a */
    public int f33676a;

    /* renamed from: e */
    public Drawable f33680e;

    /* renamed from: f */
    public int f33681f;

    /* renamed from: g */
    public Drawable f33682g;

    /* renamed from: h */
    public int f33683h;
    public boolean h0;
    public Resources.Theme i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean n0;

    /* renamed from: b */
    public float f33677b = 1.0f;

    /* renamed from: c */
    public qt5 f33678c = qt5.f42386e;

    /* renamed from: d */
    public gid f33679d = gid.NORMAL;

    /* renamed from: q */
    public boolean f33684q = true;

    /* renamed from: s */
    public int f33685s = -1;

    /* renamed from: x */
    public int f33686x = -1;

    /* renamed from: y */
    public ic9 f33687y = t66.m49427c();

    /* renamed from: L */
    public boolean f33670L = true;

    /* renamed from: X */
    public rec f33673X = new rec();

    /* renamed from: Y */
    public Map f33674Y = new is1();

    /* renamed from: Z */
    public Class f33675Z = Object.class;
    public boolean m0 = true;

    /* renamed from: K */
    public static boolean m36991K(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final float m36992A() {
        return this.f33677b;
    }

    /* renamed from: B */
    public final Resources.Theme m36993B() {
        return this.i0;
    }

    /* renamed from: C */
    public final Map m36994C() {
        return this.f33674Y;
    }

    /* renamed from: D */
    public final boolean m36995D() {
        return this.n0;
    }

    /* renamed from: E */
    public final boolean m36996E() {
        return this.k0;
    }

    /* renamed from: F */
    public final boolean m36997F() {
        return this.j0;
    }

    /* renamed from: G */
    public final boolean m36998G() {
        return this.f33684q;
    }

    /* renamed from: H */
    public final boolean m36999H() {
        return m37001J(8);
    }

    /* renamed from: I */
    public boolean m37000I() {
        return this.m0;
    }

    /* renamed from: J */
    public final boolean m37001J(int i) {
        return m36991K(this.f33676a, i);
    }

    /* renamed from: L */
    public final boolean m37002L() {
        return this.f33670L;
    }

    /* renamed from: M */
    public final boolean m37003M() {
        return this.f33669H;
    }

    /* renamed from: N */
    public final boolean m37004N() {
        return m37001J(2048);
    }

    /* renamed from: O */
    public final boolean m37005O() {
        return uqi.m51938s(this.f33686x, this.f33685s);
    }

    /* renamed from: P */
    public le1 mo17809P() {
        this.h0 = true;
        return m37009Y();
    }

    /* renamed from: Q */
    public le1 mo17810Q() {
        return m37007U(mx5.f36067e, new lf2());
    }

    /* renamed from: R */
    public le1 mo17811R() {
        return m37006T(mx5.f36066d, new mf2());
    }

    /* renamed from: S */
    public le1 mo17812S() {
        return m37006T(mx5.f36065c, new u17());
    }

    /* renamed from: T */
    public final le1 m37006T(mx5 mx5Var, xuh xuhVar) {
        return m37008X(mx5Var, xuhVar, false);
    }

    /* renamed from: U */
    public final le1 m37007U(mx5 mx5Var, xuh xuhVar) {
        if (this.j0) {
            return clone().m37007U(mx5Var, xuhVar);
        }
        mo17820j(mx5Var);
        return i0(xuhVar, false);
    }

    /* renamed from: V */
    public le1 mo17813V(int i, int i2) {
        if (this.j0) {
            return clone().mo17813V(i, i2);
        }
        this.f33686x = i;
        this.f33685s = i2;
        this.f33676a |= 512;
        return m37010Z();
    }

    /* renamed from: W */
    public le1 mo17814W(gid gidVar) {
        if (this.j0) {
            return clone().mo17814W(gidVar);
        }
        this.f33679d = (gid) bgd.m18886d(gidVar);
        this.f33676a |= 8;
        return m37010Z();
    }

    /* renamed from: X */
    public final le1 m37008X(mx5 mx5Var, xuh xuhVar, boolean z) {
        le1 le1VarG0 = z ? g0(mx5Var, xuhVar) : m37007U(mx5Var, xuhVar);
        le1VarG0.m0 = true;
        return le1VarG0;
    }

    /* renamed from: Y */
    public final le1 m37009Y() {
        return this;
    }

    /* renamed from: Z */
    public final le1 m37010Z() {
        if (this.h0) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m37009Y();
    }

    /* renamed from: a */
    public le1 mo17815a(le1 le1Var) {
        if (this.j0) {
            return clone().mo17815a(le1Var);
        }
        if (m36991K(le1Var.f33676a, 2)) {
            this.f33677b = le1Var.f33677b;
        }
        if (m36991K(le1Var.f33676a, 262144)) {
            this.k0 = le1Var.k0;
        }
        if (m36991K(le1Var.f33676a, 1048576)) {
            this.n0 = le1Var.n0;
        }
        if (m36991K(le1Var.f33676a, 4)) {
            this.f33678c = le1Var.f33678c;
        }
        if (m36991K(le1Var.f33676a, 8)) {
            this.f33679d = le1Var.f33679d;
        }
        if (m36991K(le1Var.f33676a, 16)) {
            this.f33680e = le1Var.f33680e;
            this.f33681f = 0;
            this.f33676a &= -33;
        }
        if (m36991K(le1Var.f33676a, 32)) {
            this.f33681f = le1Var.f33681f;
            this.f33680e = null;
            this.f33676a &= -17;
        }
        if (m36991K(le1Var.f33676a, 64)) {
            this.f33682g = le1Var.f33682g;
            this.f33683h = 0;
            this.f33676a &= -129;
        }
        if (m36991K(le1Var.f33676a, 128)) {
            this.f33683h = le1Var.f33683h;
            this.f33682g = null;
            this.f33676a &= -65;
        }
        if (m36991K(le1Var.f33676a, 256)) {
            this.f33684q = le1Var.f33684q;
        }
        if (m36991K(le1Var.f33676a, 512)) {
            this.f33686x = le1Var.f33686x;
            this.f33685s = le1Var.f33685s;
        }
        if (m36991K(le1Var.f33676a, 1024)) {
            this.f33687y = le1Var.f33687y;
        }
        if (m36991K(le1Var.f33676a, 4096)) {
            this.f33675Z = le1Var.f33675Z;
        }
        if (m36991K(le1Var.f33676a, 8192)) {
            this.f33671M = le1Var.f33671M;
            this.f33672Q = 0;
            this.f33676a &= -16385;
        }
        if (m36991K(le1Var.f33676a, Opcodes.ACC_ENUM)) {
            this.f33672Q = le1Var.f33672Q;
            this.f33671M = null;
            this.f33676a &= -8193;
        }
        if (m36991K(le1Var.f33676a, 32768)) {
            this.i0 = le1Var.i0;
        }
        if (m36991K(le1Var.f33676a, 65536)) {
            this.f33670L = le1Var.f33670L;
        }
        if (m36991K(le1Var.f33676a, Opcodes.ACC_DEPRECATED)) {
            this.f33669H = le1Var.f33669H;
        }
        if (m36991K(le1Var.f33676a, 2048)) {
            this.f33674Y.putAll(le1Var.f33674Y);
            this.m0 = le1Var.m0;
        }
        if (m36991K(le1Var.f33676a, Opcodes.ASM8)) {
            this.l0 = le1Var.l0;
        }
        if (!this.f33670L) {
            this.f33674Y.clear();
            int i = this.f33676a & (-2049);
            this.f33669H = false;
            this.f33676a = i & (-131073);
            this.m0 = true;
        }
        this.f33676a |= le1Var.f33676a;
        this.f33673X.m46586d(le1Var.f33673X);
        return m37010Z();
    }

    public le1 a0(mec mecVar, Object obj) {
        if (this.j0) {
            return clone().a0(mecVar, obj);
        }
        bgd.m18886d(mecVar);
        bgd.m18886d(obj);
        this.f33673X.m46587e(mecVar, obj);
        return m37010Z();
    }

    /* renamed from: b */
    public le1 mo17816b() {
        if (this.h0 && !this.j0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.j0 = true;
        return mo17809P();
    }

    public le1 b0(ic9 ic9Var) {
        if (this.j0) {
            return clone().b0(ic9Var);
        }
        this.f33687y = (ic9) bgd.m18886d(ic9Var);
        this.f33676a |= 1024;
        return m37010Z();
    }

    /* renamed from: c */
    public le1 m37011c() {
        return g0(mx5.f36067e, new lf2());
    }

    public le1 c0(float f) {
        if (this.j0) {
            return clone().c0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f33677b = f;
        this.f33676a |= 2;
        return m37010Z();
    }

    public le1 e0(boolean z) {
        if (this.j0) {
            return clone().e0(true);
        }
        this.f33684q = !z;
        this.f33676a |= 256;
        return m37010Z();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof le1)) {
            return false;
        }
        le1 le1Var = (le1) obj;
        return Float.compare(le1Var.f33677b, this.f33677b) == 0 && this.f33681f == le1Var.f33681f && uqi.m51922c(this.f33680e, le1Var.f33680e) && this.f33683h == le1Var.f33683h && uqi.m51922c(this.f33682g, le1Var.f33682g) && this.f33672Q == le1Var.f33672Q && uqi.m51922c(this.f33671M, le1Var.f33671M) && this.f33684q == le1Var.f33684q && this.f33685s == le1Var.f33685s && this.f33686x == le1Var.f33686x && this.f33669H == le1Var.f33669H && this.f33670L == le1Var.f33670L && this.k0 == le1Var.k0 && this.l0 == le1Var.l0 && this.f33678c.equals(le1Var.f33678c) && this.f33679d == le1Var.f33679d && this.f33673X.equals(le1Var.f33673X) && this.f33674Y.equals(le1Var.f33674Y) && this.f33675Z.equals(le1Var.f33675Z) && uqi.m51922c(this.f33687y, le1Var.f33687y) && uqi.m51922c(this.i0, le1Var.i0);
    }

    /* renamed from: f */
    public le1 mo19715f() {
        return g0(mx5.f36066d, new s93());
    }

    public le1 f0(Class cls, xuh xuhVar, boolean z) {
        if (this.j0) {
            return clone().f0(cls, xuhVar, z);
        }
        bgd.m18886d(cls);
        bgd.m18886d(xuhVar);
        this.f33674Y.put(cls, xuhVar);
        int i = this.f33676a | 2048;
        this.f33670L = true;
        int i2 = i | 65536;
        this.f33676a = i2;
        this.m0 = false;
        if (z) {
            this.f33676a = i2 | Opcodes.ACC_DEPRECATED;
            this.f33669H = true;
        }
        return m37010Z();
    }

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public le1 clone() {
        try {
            le1 le1Var = (le1) super.clone();
            rec recVar = new rec();
            le1Var.f33673X = recVar;
            recVar.m46586d(this.f33673X);
            is1 is1Var = new is1();
            le1Var.f33674Y = is1Var;
            is1Var.putAll(this.f33674Y);
            le1Var.h0 = false;
            le1Var.j0 = false;
            return le1Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final le1 g0(mx5 mx5Var, xuh xuhVar) {
        if (this.j0) {
            return clone().g0(mx5Var, xuhVar);
        }
        mo17820j(mx5Var);
        return h0(xuhVar);
    }

    /* renamed from: h */
    public le1 mo17818h(Class cls) {
        if (this.j0) {
            return clone().mo17818h(cls);
        }
        this.f33675Z = (Class) bgd.m18886d(cls);
        this.f33676a |= 4096;
        return m37010Z();
    }

    public le1 h0(xuh xuhVar) {
        return i0(xuhVar, true);
    }

    public int hashCode() {
        return uqi.m51933n(this.i0, uqi.m51933n(this.f33687y, uqi.m51933n(this.f33675Z, uqi.m51933n(this.f33674Y, uqi.m51933n(this.f33673X, uqi.m51933n(this.f33679d, uqi.m51933n(this.f33678c, uqi.m51934o(this.l0, uqi.m51934o(this.k0, uqi.m51934o(this.f33670L, uqi.m51934o(this.f33669H, uqi.m51932m(this.f33686x, uqi.m51932m(this.f33685s, uqi.m51934o(this.f33684q, uqi.m51933n(this.f33671M, uqi.m51932m(this.f33672Q, uqi.m51933n(this.f33682g, uqi.m51932m(this.f33683h, uqi.m51933n(this.f33680e, uqi.m51932m(this.f33681f, uqi.m51930k(this.f33677b)))))))))))))))))))));
    }

    /* renamed from: i */
    public le1 mo17819i(qt5 qt5Var) {
        if (this.j0) {
            return clone().mo17819i(qt5Var);
        }
        this.f33678c = (qt5) bgd.m18886d(qt5Var);
        this.f33676a |= 4;
        return m37010Z();
    }

    public le1 i0(xuh xuhVar, boolean z) {
        if (this.j0) {
            return clone().i0(xuhVar, z);
        }
        my5 my5Var = new my5(xuhVar, z);
        f0(Bitmap.class, xuhVar, z);
        f0(Drawable.class, my5Var, z);
        f0(BitmapDrawable.class, my5Var.m39816c(), z);
        f0(js7.class, new ns7(xuhVar), z);
        return m37010Z();
    }

    /* renamed from: j */
    public le1 mo17820j(mx5 mx5Var) {
        return a0(mx5.f36070h, bgd.m18886d(mx5Var));
    }

    /* renamed from: k */
    public final qt5 m37012k() {
        return this.f33678c;
    }

    /* renamed from: l */
    public final int m37013l() {
        return this.f33681f;
    }

    public le1 l0(boolean z) {
        if (this.j0) {
            return clone().l0(z);
        }
        this.n0 = z;
        this.f33676a |= 1048576;
        return m37010Z();
    }

    /* renamed from: m */
    public final Drawable m37014m() {
        return this.f33680e;
    }

    /* renamed from: n */
    public final Drawable m37015n() {
        return this.f33671M;
    }

    /* renamed from: p */
    public final int m37016p() {
        return this.f33672Q;
    }

    /* renamed from: q */
    public final boolean m37017q() {
        return this.l0;
    }

    /* renamed from: s */
    public final rec m37018s() {
        return this.f33673X;
    }

    /* renamed from: t */
    public final int m37019t() {
        return this.f33685s;
    }

    /* renamed from: u */
    public final int m37020u() {
        return this.f33686x;
    }

    /* renamed from: v */
    public final Drawable m37021v() {
        return this.f33682g;
    }

    /* renamed from: w */
    public final int m37022w() {
        return this.f33683h;
    }

    /* renamed from: x */
    public final gid m37023x() {
        return this.f33679d;
    }

    /* renamed from: y */
    public final Class m37024y() {
        return this.f33675Z;
    }

    /* renamed from: z */
    public final ic9 m37025z() {
        return this.f33687y;
    }
}
