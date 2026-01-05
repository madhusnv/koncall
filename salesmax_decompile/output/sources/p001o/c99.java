package p001o;

import org.objectweb.asm.Opcodes;
import p001o.b99;

/* loaded from: classes5.dex */
public abstract class c99 extends ao7 {

    /* renamed from: y */
    public static final int[] f17530y = mh2.m39049f();

    /* renamed from: g */
    public final q68 f17531g;

    /* renamed from: h */
    public int[] f17532h;

    /* renamed from: q */
    public int f17533q;

    /* renamed from: s */
    public eff f17534s;

    /* renamed from: x */
    public boolean f17535x;

    public c99(q68 q68Var, int i, i6c i6cVar) {
        super(i, i6cVar);
        this.f17532h = f17530y;
        this.f17534s = cg5.f18129h;
        this.f17531g = q68Var;
        if (b99.EnumC12329a.ESCAPE_NON_ASCII.enabledIn(i)) {
            this.f17533q = Opcodes.LAND;
        }
        this.f17535x = !b99.EnumC12329a.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    public void r0(String str) throws a99 {
        m18448a(String.format("Can not %s, expecting field name (context: %s)", str, this.f15068d.m43274g()));
    }

    public void u0(String str, int i) throws a99 {
        if (i == 0) {
            if (this.f15068d.m43271d()) {
                this.f15796a.mo21180j(this);
                return;
            } else {
                if (this.f15068d.m43272e()) {
                    this.f15796a.mo21173c(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            this.f15796a.mo21174d(this);
            return;
        }
        if (i == 2) {
            this.f15796a.mo21177g(this);
            return;
        }
        if (i == 3) {
            this.f15796a.mo21171a(this);
        } else if (i != 5) {
            m18449c();
        } else {
            r0(str);
        }
    }

    public b99 v0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f17533q = i;
        return this;
    }

    public b99 y0(eff effVar) {
        this.f17534s = effVar;
        return this;
    }
}
