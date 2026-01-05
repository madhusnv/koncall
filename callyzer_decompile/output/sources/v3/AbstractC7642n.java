package v3;

import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import s3.AbstractC6744a;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.n */
/* loaded from: classes.dex */
public abstract class AbstractC7642n extends AbstractC7878q {

    /* renamed from: q */
    public final int f36952q = i1.m14628e(this);

    /* renamed from: r */
    public AbstractC7878q f36953r;

    @Override // w2.AbstractC7878q
    public final void B0() {
        super.B0();
        for (AbstractC7878q abstractC7878q = this.f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.K0(this.f37677h);
            if (!abstractC7878q.f37683p) {
                abstractC7878q.B0();
            }
        }
    }

    @Override // w2.AbstractC7878q
    public final void C0() {
        for (AbstractC7878q abstractC7878q = this.f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.C0();
        }
        super.C0();
    }

    @Override // w2.AbstractC7878q
    public final void G0() {
        super.G0();
        for (AbstractC7878q abstractC7878q = this.f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.G0();
        }
    }

    @Override // w2.AbstractC7878q
    public final void H0() {
        for (AbstractC7878q abstractC7878q = this.f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.H0();
        }
        super.H0();
    }

    @Override // w2.AbstractC7878q
    public final void I0() {
        super.I0();
        for (AbstractC7878q abstractC7878q = this.f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.I0();
        }
    }

    @Override // w2.AbstractC7878q
    public final void J0(AbstractC7878q abstractC7878q) {
        this.f37670a = abstractC7878q;
        for (AbstractC7878q abstractC7878q2 = this.f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
            abstractC7878q2.J0(abstractC7878q);
        }
    }

    @Override // w2.AbstractC7878q
    public final void K0(h1 h1Var) {
        this.f37677h = h1Var;
        for (AbstractC7878q abstractC7878q = this.f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.K0(h1Var);
        }
    }

    public final InterfaceC7641m L0(InterfaceC7641m interfaceC7641m) {
        AbstractC7878q abstractC7878q = ((AbstractC7878q) interfaceC7641m).f37670a;
        if (abstractC7878q != interfaceC7641m) {
            AbstractC7878q abstractC7878q2 = interfaceC7641m instanceof AbstractC7878q ? (AbstractC7878q) interfaceC7641m : null;
            AbstractC7878q abstractC7878q3 = abstractC7878q2 != null ? abstractC7878q2.f37674e : null;
            if (abstractC7878q != this.f37670a || !AbstractC4154l.m8918a(abstractC7878q3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC7878q.f37683p) {
                AbstractC6744a.m12907b("Cannot delegate to an already attached node");
            }
            abstractC7878q.J0(this.f37670a);
            int i10 = this.f37672c;
            int iM14629f = i1.m14629f(abstractC7878q);
            abstractC7878q.f37672c = iM14629f;
            int i11 = this.f37672c;
            int i12 = iM14629f & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof InterfaceC7652x)) {
                AbstractC6744a.m12907b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC7878q);
            }
            abstractC7878q.f37675f = this.f36953r;
            this.f36953r = abstractC7878q;
            abstractC7878q.f37674e = this;
            N0(iM14629f | this.f37672c, false);
            if (this.f37683p) {
                if (i12 == 0 || (i10 & 2) != 0) {
                    K0(this.f37677h);
                } else {
                    C4535g c4535g = AbstractC7634f.m14563x(this).f36832K;
                    this.f37670a.K0(null);
                    c4535g.m9395m();
                }
                abstractC7878q.B0();
                abstractC7878q.H0();
                if (!abstractC7878q.f37683p) {
                    AbstractC6744a.m12907b("autoInvalidateInsertedNode called on unattached node");
                }
                i1.m14624a(abstractC7878q, -1, 1);
            }
        }
        return interfaceC7641m;
    }

    public final void M0(InterfaceC7641m interfaceC7641m) {
        AbstractC7878q abstractC7878q = null;
        for (AbstractC7878q abstractC7878q2 = this.f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
            if (abstractC7878q2 == interfaceC7641m) {
                boolean z6 = abstractC7878q2.f37683p;
                if (z6) {
                    e1.d0 d0Var = i1.f36919a;
                    if (!z6) {
                        AbstractC6744a.m12907b("autoInvalidateRemovedNode called on unattached node");
                    }
                    i1.m14624a(abstractC7878q2, -1, 2);
                    abstractC7878q2.I0();
                    abstractC7878q2.C0();
                }
                abstractC7878q2.J0(abstractC7878q2);
                abstractC7878q2.f37673d = 0;
                if (abstractC7878q == null) {
                    this.f36953r = abstractC7878q2.f37675f;
                } else {
                    abstractC7878q.f37675f = abstractC7878q2.f37675f;
                }
                abstractC7878q2.f37675f = null;
                abstractC7878q2.f37674e = null;
                int i10 = this.f37672c;
                int iM14629f = i1.m14629f(this);
                N0(iM14629f, true);
                if (this.f37683p && (i10 & 2) != 0 && (iM14629f & 2) == 0) {
                    C4535g c4535g = AbstractC7634f.m14563x(this).f36832K;
                    this.f37670a.K0(null);
                    c4535g.m9395m();
                    return;
                }
                return;
            }
            abstractC7878q = abstractC7878q2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC7641m).toString());
    }

    public final void N0(int i10, boolean z6) {
        AbstractC7878q abstractC7878q;
        int i11 = this.f37672c;
        this.f37672c = i10;
        if (i11 != i10) {
            AbstractC7878q abstractC7878q2 = this.f37670a;
            if (abstractC7878q2 == this) {
                this.f37673d = i10;
            }
            if (this.f37683p) {
                AbstractC7878q abstractC7878q3 = this;
                while (abstractC7878q3 != null) {
                    i10 |= abstractC7878q3.f37672c;
                    abstractC7878q3.f37672c = i10;
                    if (abstractC7878q3 == abstractC7878q2) {
                        break;
                    } else {
                        abstractC7878q3 = abstractC7878q3.f37674e;
                    }
                }
                if (z6 && abstractC7878q3 == abstractC7878q2) {
                    i10 = i1.m14629f(abstractC7878q2);
                    abstractC7878q2.f37672c = i10;
                }
                int i12 = i10 | ((abstractC7878q3 == null || (abstractC7878q = abstractC7878q3.f37675f) == null) ? 0 : abstractC7878q.f37673d);
                while (abstractC7878q3 != null) {
                    i12 |= abstractC7878q3.f37672c;
                    abstractC7878q3.f37673d = i12;
                    abstractC7878q3 = abstractC7878q3.f37674e;
                }
            }
        }
    }
}
