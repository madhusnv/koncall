package j3;

import android.graphics.Path;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1558l;
import d3.AbstractC1561o;
import d3.C1555i;
import d3.C1556j;
import f3.C2202h;
import f3.InterfaceC2198d;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.EnumC6359i;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.i */
/* loaded from: classes.dex */
public final class C3555i extends d0 {

    /* renamed from: b */
    public AbstractC1561o f19026b;

    /* renamed from: c */
    public float f19027c = 1.0f;

    /* renamed from: d */
    public List f19028d;

    /* renamed from: e */
    public float f19029e;

    /* renamed from: f */
    public float f19030f;

    /* renamed from: g */
    public AbstractC1561o f19031g;

    /* renamed from: h */
    public int f19032h;

    /* renamed from: i */
    public int f19033i;

    /* renamed from: j */
    public float f19034j;

    /* renamed from: k */
    public float f19035k;

    /* renamed from: l */
    public float f19036l;

    /* renamed from: m */
    public float f19037m;

    /* renamed from: n */
    public boolean f19038n;

    /* renamed from: o */
    public boolean f19039o;

    /* renamed from: p */
    public boolean f19040p;

    /* renamed from: q */
    public C2202h f19041q;

    /* renamed from: r */
    public final C1555i f19042r;

    /* renamed from: s */
    public C1555i f19043s;

    /* renamed from: t */
    public final Object f19044t;

    public C3555i() {
        int i10 = h0.f19025a;
        this.f19028d = C6668r.f31943a;
        this.f19029e = 1.0f;
        this.f19032h = 0;
        this.f19033i = 0;
        this.f19034j = 4.0f;
        this.f19036l = 1.0f;
        this.f19038n = true;
        this.f19039o = true;
        C1555i c1555iM5178a = AbstractC1558l.m5178a();
        this.f19042r = c1555iM5178a;
        this.f19043s = c1555iM5178a;
        this.f19044t = nd.m10781b(EnumC6359i.NONE, C3554h.f19022b);
    }

    @Override // j3.d0
    /* renamed from: a */
    public final void mo8083a(InterfaceC2198d interfaceC2198d) {
        InterfaceC2198d interfaceC2198d2;
        C2202h c2202h;
        if (this.f19038n) {
            AbstractC3548b.m8082d(this.f19028d, this.f19042r);
            m8105e();
        } else if (this.f19040p) {
            m8105e();
        }
        this.f19038n = false;
        this.f19040p = false;
        AbstractC1561o abstractC1561o = this.f19026b;
        if (abstractC1561o != null) {
            interfaceC2198d2 = interfaceC2198d;
            InterfaceC2198d.m5908P(interfaceC2198d2, this.f19043s, abstractC1561o, this.f19027c, null, 56);
        } else {
            interfaceC2198d2 = interfaceC2198d;
        }
        AbstractC1561o abstractC1561o2 = this.f19031g;
        if (abstractC1561o2 != null) {
            C2202h c2202h2 = this.f19041q;
            if (this.f19039o || c2202h2 == null) {
                C2202h c2202h3 = new C2202h(this.f19030f, this.f19034j, this.f19032h, this.f19033i, 16);
                this.f19041q = c2202h3;
                this.f19039o = false;
                c2202h = c2202h3;
            } else {
                c2202h = c2202h2;
            }
            InterfaceC2198d.m5908P(interfaceC2198d2, this.f19043s, abstractC1561o2, this.f19029e, c2202h, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qw.g] */
    /* renamed from: e */
    public final void m8105e() {
        float f6 = this.f19035k;
        C1555i c1555i = this.f19042r;
        if (f6 == DefinitionKt.NO_Float_VALUE && this.f19036l == 1.0f) {
            this.f19043s = c1555i;
            return;
        }
        if (AbstractC4154l.m8918a(this.f19043s, c1555i)) {
            this.f19043s = AbstractC1558l.m5178a();
        } else {
            int i10 = this.f19043s.f7752a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f19043s.f7752a.rewind();
            this.f19043s.m5159h(i10);
        }
        ?? r02 = this.f19044t;
        ((C1556j) r02.getValue()).f7777a.setPath(c1555i != null ? c1555i.f7752a : null, false);
        float length = ((C1556j) r02.getValue()).f7777a.getLength();
        float f10 = this.f19035k;
        float f11 = this.f19037m;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f19036l + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((C1556j) r02.getValue()).m5175a(f12, f13, this.f19043s);
        } else {
            ((C1556j) r02.getValue()).m5175a(f12, length, this.f19043s);
            ((C1556j) r02.getValue()).m5175a(DefinitionKt.NO_Float_VALUE, f13, this.f19043s);
        }
    }

    public final String toString() {
        return this.f19042r.toString();
    }
}
