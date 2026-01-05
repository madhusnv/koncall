package f2;

import a2.C0036i;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d3.AbstractC1550d;
import d3.InterfaceC1563q;
import dr.C1770t;
import e1.e0;
import g2.x4;
import g2.y4;
import gx.AbstractC2747a;
import java.util.LinkedHashMap;
import m1.C4632n;
import m1.C4633o;
import m1.C4634p;
import m1.InterfaceC4629k;
import m1.InterfaceC4635q;
import og.ne;
import og.ze;
import s4.InterfaceC6747c;
import tb.C7105p;
import tx.c0;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import v3.InterfaceC7640l;
import v3.InterfaceC7644p;
import v3.InterfaceC7651w;
import v3.i0;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C2179b extends AbstractC7878q implements InterfaceC2185h, InterfaceC7640l, InterfaceC7644p, InterfaceC7651w {

    /* renamed from: C */
    public C2184g f10066C;

    /* renamed from: D */
    public C2186i f10067D;

    /* renamed from: q */
    public final InterfaceC4629k f10068q;

    /* renamed from: r */
    public final boolean f10069r;

    /* renamed from: s */
    public final float f10070s;

    /* renamed from: t */
    public final x4 f10071t;

    /* renamed from: v */
    public final y4 f10072v;

    /* renamed from: w */
    public C2193p f10073w;

    /* renamed from: x */
    public float f10074x;

    /* renamed from: z */
    public boolean f10076z;

    /* renamed from: y */
    public long f10075y = 0;

    /* renamed from: B */
    public final e0 f10065B = new e0();

    public C2179b(InterfaceC4629k interfaceC4629k, boolean z6, float f6, x4 x4Var, y4 y4Var) {
        this.f10068q = interfaceC4629k;
        this.f10069r = z6;
        this.f10070s = f6;
        this.f10071t = x4Var;
        this.f10072v = y4Var;
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        c0.m13502y(z0(), null, null, new C1770t(this, (InterfaceC7559c) null, 8), 3);
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        C2184g c2184g = this.f10066C;
        if (c2184g != null) {
            mo5877z();
            C7105p c7105p = c2184g.f10089d;
            C2186i c2186i = (C2186i) ((LinkedHashMap) c7105p.f34290b).get(this);
            if (c2186i != null) {
                c2186i.m5886c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c7105p.f34290b;
                C2186i c2186i2 = (C2186i) linkedHashMap.get(this);
                if (c2186i2 != null) {
                }
                linkedHashMap.remove(this);
                c2184g.f10088c.add(c2186i);
            }
        }
    }

    public final void L0(InterfaceC4635q interfaceC4635q) {
        C2186i c2186i;
        if (!(interfaceC4635q instanceof C4633o)) {
            if (interfaceC4635q instanceof C4634p) {
                C2186i c2186i2 = this.f10067D;
                if (c2186i2 != null) {
                    c2186i2.m5887d();
                    return;
                }
                return;
            }
            if (!(interfaceC4635q instanceof C4632n) || (c2186i = this.f10067D) == null) {
                return;
            }
            c2186i.m5887d();
            return;
        }
        C4633o c4633o = (C4633o) interfaceC4635q;
        long j6 = this.f10075y;
        float f6 = this.f10074x;
        C2184g c2184gM10783a = this.f10066C;
        if (c2184gM10783a == null) {
            c2184gM10783a = ne.m10783a(ne.m10784b((View) AbstractC7634f.m14548i(this, AndroidCompositionLocals_androidKt.f2138f)));
            this.f10066C = c2184gM10783a;
        }
        C2186i c2186iM5883a = c2184gM10783a.m5883a(this);
        int iM6747k = AbstractC2747a.m6747k(f6);
        long jMo5194a = this.f10071t.mo5194a();
        this.f10072v.invoke();
        c2186iM5883a.m5885b(c4633o, this.f10069r, j6, iM6747k, jMo5194a, 0.1f, new C0036i(5, this));
        this.f10067D = c2186iM5883a;
        AbstractC7634f.m14552m(this);
    }

    @Override // v3.InterfaceC7644p
    public final void h0(i0 i0Var) {
        i0Var.m14622b();
        C2193p c2193p = this.f10073w;
        if (c2193p != null) {
            c2193p.m5892d(i0Var, this.f10074x, this.f10071t.mo5194a());
        }
        InterfaceC1563q interfaceC1563qM75t = i0Var.f36917a.f10124b.m75t();
        C2186i c2186i = this.f10067D;
        if (c2186i != null) {
            long j6 = this.f10075y;
            int iM6747k = AbstractC2747a.m6747k(this.f10074x);
            long jMo5194a = this.f10071t.mo5194a();
            this.f10072v.invoke();
            c2186i.m5888e(j6, iM6747k, jMo5194a, 0.1f);
            c2186i.draw(AbstractC1550d.m5119a(interfaceC1563qM75t));
        }
    }

    @Override // v3.InterfaceC7651w
    /* renamed from: k */
    public final void mo5878k(long j6) {
        this.f10076z = true;
        InterfaceC6747c interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
        this.f10075y = ze.m11098d(j6);
        float f6 = this.f10070s;
        this.f10074x = Float.isNaN(f6) ? AbstractC2183f.m5882a(interfaceC6747c, this.f10069r, this.f10075y) : interfaceC6747c.mo8435T(f6);
        e0 e0Var = this.f10065B;
        Object[] objArr = e0Var.f8956a;
        int i10 = e0Var.f8957b;
        for (int i11 = 0; i11 < i10; i11++) {
            L0((InterfaceC4635q) objArr[i11]);
        }
        e0Var.m5545c();
    }

    @Override // f2.InterfaceC2185h
    /* renamed from: z */
    public final void mo5877z() {
        this.f10067D = null;
        AbstractC7634f.m14552m(this);
    }
}
