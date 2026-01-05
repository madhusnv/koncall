package k1;

import ao.C0381t;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import n1.AbstractC4941a;
import nf.C5047i;
import og.ze;
import s4.C6756l;
import t3.InterfaceC7033t;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import v3.InterfaceC7640l;
import v3.InterfaceC7651w;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.i */
/* loaded from: classes.dex */
public final class C3934i extends AbstractC7878q implements InterfaceC7651w, InterfaceC7640l {

    /* renamed from: B */
    public boolean f20113B;

    /* renamed from: q */
    public x0 f20114q;

    /* renamed from: r */
    public final x1 f20115r;

    /* renamed from: s */
    public boolean f20116s;

    /* renamed from: t */
    public InterfaceC3928c f20117t;

    /* renamed from: w */
    public InterfaceC7033t f20119w;

    /* renamed from: x */
    public boolean f20120x;

    /* renamed from: y */
    public boolean f20121y;

    /* renamed from: v */
    public final C5047i f20118v = new C5047i();

    /* renamed from: z */
    public long f20122z = 0;

    public C3934i(x0 x0Var, x1 x1Var, boolean z6, InterfaceC3928c interfaceC3928c) {
        this.f20114q = x0Var;
        this.f20115r = x1Var;
        this.f20116s = z6;
        this.f20117t = interfaceC3928c;
    }

    public static final float L0(C3934i c3934i, InterfaceC3928c interfaceC3928c) {
        char c2;
        C0848c c0848c;
        int iCompare;
        if (C6756l.m12948a(c3934i.f20122z, 0L)) {
            return DefinitionKt.NO_Float_VALUE;
        }
        C4640e c4640e = (C4640e) c3934i.f20118v.f24823b;
        int i10 = c4640e.f22886c - 1;
        Object[] objArr = c4640e.f22884a;
        if (i10 < objArr.length) {
            c0848c = null;
            while (true) {
                if (i10 < 0) {
                    c2 = ' ';
                    break;
                }
                C0848c c0848c2 = (C0848c) ((C3932g) objArr[i10]).f20100a.invoke();
                if (c0848c2 != null) {
                    long jM2281c = c0848c2.m2281c();
                    long jM11098d = ze.m11098d(c3934i.f20122z);
                    c2 = ' ';
                    int i11 = AbstractC3933h.f20106a[c3934i.f20114q.ordinal()];
                    if (i11 == 1) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM2281c & 4294967295L)), Float.intBitsToFloat((int) (jM11098d & 4294967295L)));
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM2281c >> 32)), Float.intBitsToFloat((int) (jM11098d >> 32)));
                    }
                    if (iCompare <= 0) {
                        c0848c = c0848c2;
                    } else if (c0848c == null) {
                        c0848c = c0848c2;
                    }
                }
                i10--;
            }
        } else {
            c2 = ' ';
            c0848c = null;
        }
        if (c0848c == null) {
            C0848c c0848cM0 = c3934i.f20120x ? c3934i.M0() : null;
            if (c0848cM0 == null) {
                return DefinitionKt.NO_Float_VALUE;
            }
            c0848c = c0848cM0;
        }
        long jM11098d2 = ze.m11098d(c3934i.f20122z);
        int i12 = AbstractC3933h.f20106a[c3934i.f20114q.ordinal()];
        if (i12 == 1) {
            float f6 = c0848c.f5355b;
            return interfaceC3928c.mo8444a(f6, c0848c.f5357d - f6, Float.intBitsToFloat((int) (jM11098d2 & 4294967295L)));
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f10 = c0848c.f5354a;
        return interfaceC3928c.mo8444a(f10, c0848c.f5356c - f10, Float.intBitsToFloat((int) (jM11098d2 >> c2)));
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    public final C0848c M0() {
        if (this.f37683p) {
            v3.h1 h1VarM14562w = AbstractC7634f.m14562w(this);
            InterfaceC7033t interfaceC7033t = this.f20119w;
            if (interfaceC7033t != null) {
                if (!interfaceC7033t.mo13305s()) {
                    interfaceC7033t = null;
                }
                if (interfaceC7033t != null) {
                    return h1VarM14562w.mo13298S(interfaceC7033t, false);
                }
            }
        }
        return null;
    }

    public final boolean N0(C0848c c0848c, long j6) {
        long jP0 = P0(c0848c, j6);
        return Math.abs(Float.intBitsToFloat((int) (jP0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jP0 & 4294967295L))) <= 0.5f;
    }

    public final void O0() {
        InterfaceC3928c interfaceC3928c = this.f20117t;
        if (interfaceC3928c == null) {
            interfaceC3928c = (InterfaceC3928c) AbstractC7634f.m14548i(this, AbstractC3931f.f20079a);
        }
        InterfaceC3928c interfaceC3928c2 = interfaceC3928c;
        if (this.f20113B) {
            AbstractC4941a.m9886c("launchAnimation called when previous animation was running");
        }
        InterfaceC3928c.f20031a.getClass();
        tx.c0.m13502y(z0(), null, tx.b0.UNDISPATCHED, new C0381t(this, new l2(C3927b.f20020b), interfaceC3928c2, (InterfaceC7559c) null, 17), 1);
    }

    public final long P0(C0848c c0848c, long j6) {
        long jFloatToRawIntBits;
        long j10;
        long jM11098d = ze.m11098d(j6);
        int i10 = AbstractC3933h.f20106a[this.f20114q.ordinal()];
        if (i10 == 1) {
            InterfaceC3928c interfaceC3928c = this.f20117t;
            if (interfaceC3928c == null) {
                interfaceC3928c = (InterfaceC3928c) AbstractC7634f.m14548i(this, AbstractC3931f.f20079a);
            }
            float f6 = c0848c.f5355b;
            float fMo8444a = interfaceC3928c.mo8444a(f6, c0848c.f5357d - f6, Float.intBitsToFloat((int) (jM11098d & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE);
            jFloatToRawIntBits = Float.floatToRawIntBits(fMo8444a);
            j10 = jFloatToRawIntBits2 << 32;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC3928c interfaceC3928c2 = this.f20117t;
            if (interfaceC3928c2 == null) {
                interfaceC3928c2 = (InterfaceC3928c) AbstractC7634f.m14548i(this, AbstractC3931f.f20079a);
            }
            float f10 = c0848c.f5354a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(interfaceC3928c2.mo8444a(f10, c0848c.f5356c - f10, Float.intBitsToFloat((int) (jM11098d >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE);
            j10 = jFloatToRawIntBits3 << 32;
        }
        return j10 | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // v3.InterfaceC7651w
    /* renamed from: k */
    public final void mo5878k(long j6) {
        int iM8924g;
        C0848c c0848cM0;
        long j10 = this.f20122z;
        this.f20122z = j6;
        int i10 = AbstractC3933h.f20106a[this.f20114q.ordinal()];
        if (i10 == 1) {
            iM8924g = AbstractC4154l.m8924g((int) (j6 & 4294967295L), (int) (4294967295L & j10));
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM8924g = AbstractC4154l.m8924g((int) (j6 >> 32), (int) (j10 >> 32));
        }
        if (iM8924g >= 0 || this.f20113B || this.f20120x || (c0848cM0 = M0()) == null || !N0(c0848cM0, j10)) {
            return;
        }
        this.f20121y = true;
    }
}
