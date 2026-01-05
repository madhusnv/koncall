package u2;

import ex.InterfaceC2139c;
import l4.C4367l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.h */
/* loaded from: classes.dex */
public abstract class AbstractC7311h {

    /* renamed from: a */
    public C7315l f34873a;

    /* renamed from: b */
    public long f34874b;

    /* renamed from: c */
    public boolean f34875c;

    /* renamed from: d */
    public int f34876d;

    public AbstractC7311h(long j6, C7315l c7315l) {
        int iM12862a;
        int iNumberOfTrailingZeros;
        this.f34873a = c7315l;
        this.f34874b = j6;
        C4367l c4367l = AbstractC7316m.f34889a;
        if (j6 != 0) {
            C7315l c7315lMo13649d = mo13649d();
            long j10 = c7315lMo13649d.f34887c;
            long[] jArr = c7315lMo13649d.f34888d;
            if (jArr != null) {
                j6 = jArr[0];
            } else {
                long j11 = c7315lMo13649d.f34886b;
                if (j11 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                } else {
                    long j12 = c7315lMo13649d.f34885a;
                    if (j12 != 0) {
                        j10 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j6 = iNumberOfTrailingZeros + j10;
            }
            synchronized (AbstractC7316m.f34890b) {
                iM12862a = AbstractC7316m.f34893e.m12862a(j6);
            }
        } else {
            iM12862a = -1;
        }
        this.f34876d = iM12862a;
    }

    /* renamed from: q */
    public static void m13667q(AbstractC7311h abstractC7311h) {
        AbstractC7316m.f34889a.m9125J(abstractC7311h);
    }

    /* renamed from: a */
    public final void m13668a() {
        synchronized (AbstractC7316m.f34890b) {
            mo13662b();
            mo13663p();
        }
    }

    /* renamed from: b */
    public void mo13662b() {
        AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13672h(mo13652g());
    }

    /* renamed from: c */
    public abstract void mo13641c();

    /* renamed from: d */
    public C7315l mo13649d() {
        return this.f34873a;
    }

    /* renamed from: e */
    public abstract InterfaceC2139c mo13650e();

    /* renamed from: f */
    public abstract boolean mo13651f();

    /* renamed from: g */
    public long mo13652g() {
        return this.f34874b;
    }

    /* renamed from: h */
    public int mo13653h() {
        return 0;
    }

    /* renamed from: i */
    public abstract InterfaceC2139c mo13654i();

    /* renamed from: j */
    public final AbstractC7311h m13669j() {
        C4367l c4367l = AbstractC7316m.f34889a;
        AbstractC7311h abstractC7311h = (AbstractC7311h) c4367l.m9138r();
        c4367l.m9125J(this);
        return abstractC7311h;
    }

    /* renamed from: k */
    public abstract void mo13642k();

    /* renamed from: l */
    public abstract void mo13643l();

    /* renamed from: m */
    public abstract void mo13644m();

    /* renamed from: n */
    public abstract void mo13655n(InterfaceC7328y interfaceC7328y);

    /* renamed from: o */
    public final void m13670o() {
        int i10 = this.f34876d;
        if (i10 >= 0) {
            AbstractC7316m.m13696u(i10);
            this.f34876d = -1;
        }
    }

    /* renamed from: p */
    public void mo13663p() {
        m13670o();
    }

    /* renamed from: r */
    public void mo13656r(C7315l c7315l) {
        this.f34873a = c7315l;
    }

    /* renamed from: s */
    public void mo13657s(long j6) {
        this.f34874b = j6;
    }

    /* renamed from: t */
    public void mo13658t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* renamed from: u */
    public abstract AbstractC7311h mo13645u(InterfaceC2139c interfaceC2139c);
}
