package nk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kk.AbstractC4092l;
import kk.C4090j;
import kk.C4093m;
import kk.C4094n;
import kk.C4095o;
import kk.EnumC4099s;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.s */
/* loaded from: classes.dex */
public final class C5096s extends C6566c {

    /* renamed from: t */
    public static final C5095r f24976t = new C5095r();

    /* renamed from: v */
    public static final C4095o f24977v = new C4095o("closed");

    /* renamed from: q */
    public final ArrayList f24978q;

    /* renamed from: r */
    public String f24979r;

    /* renamed from: s */
    public AbstractC4092l f24980s;

    public C5096s() {
        super(f24976t);
        this.f24978q = new ArrayList();
        this.f24980s = C4093m.f20997a;
    }

    @Override // rk.C6566c
    /* renamed from: A */
    public final void mo10028A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f24978q.isEmpty() || this.f24979r != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(B0() instanceof C4094n)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f24979r = str;
    }

    public final AbstractC4092l B0() {
        return (AbstractC4092l) this.f24978q.get(r0.size() - 1);
    }

    public final void C0(AbstractC4092l abstractC4092l) {
        if (this.f24979r != null) {
            if (!(abstractC4092l instanceof C4093m) || this.f31452l) {
                C4094n c4094n = (C4094n) B0();
                c4094n.f20998a.put(this.f24979r, abstractC4092l);
            }
            this.f24979r = null;
            return;
        }
        if (this.f24978q.isEmpty()) {
            this.f24980s = abstractC4092l;
            return;
        }
        AbstractC4092l abstractC4092lB0 = B0();
        if (!(abstractC4092lB0 instanceof C4090j)) {
            throw new IllegalStateException();
        }
        ((C4090j) abstractC4092lB0).f20996a.add(abstractC4092l);
    }

    @Override // rk.C6566c
    /* renamed from: J */
    public final C6566c mo10029J() {
        C0(C4093m.f20997a);
        return this;
    }

    @Override // rk.C6566c
    public final void a0(double d2) {
        if (this.f31449h == EnumC4099s.LENIENT || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            C0(new C4095o(Double.valueOf(d2)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
    }

    @Override // rk.C6566c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f24978q;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f24977v);
    }

    @Override // rk.C6566c
    public final void f0(long j6) {
        C0(new C4095o(Long.valueOf(j6)));
    }

    @Override // rk.C6566c
    /* renamed from: j */
    public final void mo10030j() {
        C4090j c4090j = new C4090j();
        C0(c4090j);
        this.f24978q.add(c4090j);
    }

    @Override // rk.C6566c
    /* renamed from: n */
    public final void mo10031n() {
        C4094n c4094n = new C4094n();
        C0(c4094n);
        this.f24978q.add(c4094n);
    }

    @Override // rk.C6566c
    public final void o0(Boolean bool) {
        if (bool == null) {
            C0(C4093m.f20997a);
        } else {
            C0(new C4095o(bool));
        }
    }

    @Override // rk.C6566c
    public final void t0(Number number) {
        if (number == null) {
            C0(C4093m.f20997a);
            return;
        }
        if (this.f31449h != EnumC4099s.LENIENT) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        C0(new C4095o(number));
    }

    @Override // rk.C6566c
    public final void v0(String str) {
        if (str == null) {
            C0(C4093m.f20997a);
        } else {
            C0(new C4095o(str));
        }
    }

    @Override // rk.C6566c
    /* renamed from: w */
    public final void mo10032w() {
        ArrayList arrayList = this.f24978q;
        if (arrayList.isEmpty() || this.f24979r != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof C4090j)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // rk.C6566c
    public final void w0(boolean z6) {
        C0(new C4095o(Boolean.valueOf(z6)));
    }

    @Override // rk.C6566c
    /* renamed from: z */
    public final void mo10033z() {
        ArrayList arrayList = this.f24978q;
        if (arrayList.isEmpty() || this.f24979r != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof C4094n)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // rk.C6566c, java.io.Flushable
    public final void flush() {
    }
}
