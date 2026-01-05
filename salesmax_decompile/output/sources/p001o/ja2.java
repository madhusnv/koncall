package p001o;

import p001o.ab2;
import p001o.sse;

/* loaded from: classes2.dex */
public final class ja2 implements use {

    /* renamed from: d */
    public final sse f30024d;

    /* renamed from: o.ja2$a */
    public class C14479a implements sse {

        /* renamed from: d */
        public final /* synthetic */ long f30025d;

        public C14479a(long j) {
            this.f30025d = j;
        }

        @Override // p001o.sse
        /* renamed from: a */
        public long mo33435a() {
            return this.f30025d;
        }

        @Override // p001o.sse
        /* renamed from: e */
        public sse.C16912c mo33437e(sse.InterfaceC16911b interfaceC16911b) {
            return interfaceC16911b.getStatus() == 1 ? sse.C16912c.f45882d : sse.C16912c.f45883e;
        }
    }

    /* renamed from: o.ja2$b */
    public static final class C14480b implements use {

        /* renamed from: d */
        public final sse f30027d;

        public C14480b(long j) {
            this.f30027d = new ja2(j);
        }

        @Override // p001o.sse
        /* renamed from: a */
        public long mo33435a() {
            return this.f30027d.mo33435a();
        }

        @Override // p001o.use
        /* renamed from: b */
        public sse mo33436b(long j) {
            return new C14480b(j);
        }

        @Override // p001o.sse
        /* renamed from: e */
        public sse.C16912c mo33437e(sse.InterfaceC16911b interfaceC16911b) {
            if (this.f30027d.mo33437e(interfaceC16911b).m48887d()) {
                return sse.C16912c.f45883e;
            }
            Throwable cause = interfaceC16911b.getCause();
            if (cause instanceof ab2.C12130b) {
                wja.m54629c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((ab2.C12130b) cause).m16805a() > 0) {
                    return sse.C16912c.f45885g;
                }
            }
            return sse.C16912c.f45882d;
        }
    }

    public ja2(long j) {
        this.f30024d = new smh(j, new C14479a(j));
    }

    @Override // p001o.sse
    /* renamed from: a */
    public long mo33435a() {
        return this.f30024d.mo33435a();
    }

    @Override // p001o.use
    /* renamed from: b */
    public sse mo33436b(long j) {
        return new ja2(j);
    }

    @Override // p001o.sse
    /* renamed from: e */
    public sse.C16912c mo33437e(sse.InterfaceC16911b interfaceC16911b) {
        return this.f30024d.mo33437e(interfaceC16911b);
    }
}
