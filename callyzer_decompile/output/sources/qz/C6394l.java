package qz;

import ex.InterfaceC2137a;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6394l implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30834a;

    /* renamed from: b */
    public final /* synthetic */ C6398p f30835b;

    /* renamed from: c */
    public final /* synthetic */ int f30836c;

    public /* synthetic */ C6394l(C6398p c6398p, int i10, Object obj, int i11) {
        this.f30834a = i11;
        this.f30835b = c6398p;
        this.f30836c = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f30834a) {
            case 0:
                C6398p c6398p = this.f30835b;
                int i10 = this.f30836c;
                c6398p.f30855l.getClass();
                try {
                    c6398p.f30842B.m12411A(i10, EnumC6384b.CANCEL);
                    synchronized (c6398p) {
                        c6398p.f30844D.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused) {
                }
                return qw.a0.f30746a;
            case 1:
                C6398p c6398p2 = this.f30835b;
                int i11 = this.f30836c;
                c6398p2.f30855l.getClass();
                synchronized (c6398p2) {
                    c6398p2.f30844D.remove(Integer.valueOf(i11));
                }
                return qw.a0.f30746a;
            default:
                C6398p c6398p3 = this.f30835b;
                int i12 = this.f30836c;
                c6398p3.f30855l.getClass();
                try {
                    c6398p3.f30842B.m12411A(i12, EnumC6384b.CANCEL);
                    synchronized (c6398p3) {
                        c6398p3.f30844D.remove(Integer.valueOf(i12));
                    }
                } catch (IOException unused2) {
                }
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ C6394l(C6398p c6398p, int i10, List list, boolean z6) {
        this.f30834a = 2;
        this.f30835b = c6398p;
        this.f30836c = i10;
    }
}
