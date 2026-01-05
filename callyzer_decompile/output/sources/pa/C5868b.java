package pa;

import java.io.EOFException;
import jc.AbstractC3740p;
import jc.AbstractC3741q;
import jc.AbstractC3744t;
import jc.AbstractC3745u;
import jc.C3743s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.yc;
import pg.AbstractC5945z;
import pg.f8;
import qc.C6165k;
import qc.C6166l;
import qc.C6167m;
import qc.C6169o;
import qc.C6170p;
import qc.C6179y;
import qc.C6180z;
import uc.C7394a;
import uw.InterfaceC7559c;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pa.b */
/* loaded from: classes.dex */
public final class C5868b implements InterfaceC8909c {

    /* renamed from: a */
    public final /* synthetic */ int f28646a;

    public /* synthetic */ C5868b(int i10) {
        this.f28646a = i10;
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public final Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c) {
        switch (this.f28646a) {
        }
        return ((C6165k) interfaceC8916j).f30040b;
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public final Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c) {
        switch (this.f28646a) {
        }
        return ((C6166l) interfaceC8916j).f30045b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c interfaceC7559c) throws NumberFormatException, EOFException {
        switch (this.f28646a) {
            case 0:
                return ((C6170p) interfaceC8914h).f30062c;
            default:
                C7394a c7394a = ((C6170p) interfaceC8914h).f30062c;
                String str = (String) c7394a.f35159b.get("Content-Length");
                if (str == null) {
                    return c7394a;
                }
                AbstractC3745u abstractC3745uM11624e = c7394a.f35160c;
                long j6 = Long.parseLong(str);
                if (abstractC3745uM11624e instanceof AbstractC3744t) {
                    abstractC3745uM11624e = f8.m11625f(abstractC3745uM11624e.getContentLength(), new C6180z(((AbstractC3744t) abstractC3745uM11624e).readFrom(), j6));
                } else if (abstractC3745uM11624e instanceof AbstractC3741q) {
                    abstractC3745uM11624e = f8.m11624e(abstractC3745uM11624e.getContentLength(), new C6179y(((AbstractC3741q) abstractC3745uM11624e).readFrom(), j6));
                } else if (abstractC3745uM11624e instanceof AbstractC3740p) {
                    yc.m11066b(j6, abstractC3745uM11624e.getContentLength());
                } else {
                    if (!AbstractC4154l.m8918a(abstractC3745uM11624e, C3743s.f19596a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yc.m11066b(j6, 0L);
                }
                return AbstractC5945z.m11958c(c7394a, null, abstractC3745uM11624e, 3);
        }
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        switch (this.f28646a) {
        }
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c interfaceC7559c) {
        switch (this.f28646a) {
        }
        return ((C6167m) interfaceC8915i).f30049a;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        switch (this.f28646a) {
        }
        return ((C6169o) interfaceC8913g).f30058b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    @Override // zb.InterfaceC8909c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object modifyBeforeTransmit(zb.InterfaceC8913g r10, uw.InterfaceC7559c r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.C5868b.modifyBeforeTransmit(zb.g, uw.c):java.lang.Object");
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterExecution(InterfaceC8916j interfaceC8916j) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSigning(InterfaceC8913g interfaceC8913g) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
        int i10 = this.f28646a;
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
        int i10 = this.f28646a;
    }

    /* renamed from: a */
    private final void m11474a(InterfaceC8916j interfaceC8916j) {
    }

    /* renamed from: b */
    private final void m11475b(InterfaceC8916j interfaceC8916j) {
    }

    /* renamed from: c */
    private final void m11476c(InterfaceC8916j interfaceC8916j) {
    }

    /* renamed from: d */
    private final void m11477d(InterfaceC8916j interfaceC8916j) {
    }

    /* renamed from: e */
    private final void m11478e(InterfaceC8916j interfaceC8916j) {
    }

    /* renamed from: f */
    private final void m11479f(InterfaceC8916j interfaceC8916j) {
    }

    /* renamed from: g */
    private final void m11480g(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: h */
    private final void m11481h(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: i */
    private final void m11482i(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: j */
    private final void m11483j(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: k */
    private final void m11484k(InterfaceC8914h interfaceC8914h) {
    }

    /* renamed from: l */
    private final void m11485l(InterfaceC8914h interfaceC8914h) {
    }

    /* renamed from: m */
    private final void m11486m(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: n */
    private final void m11487n(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: o */
    private final void m11488o(InterfaceC8914h interfaceC8914h) {
    }

    /* renamed from: p */
    private final void m11489p(InterfaceC8914h interfaceC8914h) {
    }

    /* renamed from: q */
    private final void m11490q(InterfaceC8915i interfaceC8915i) {
    }

    /* renamed from: r */
    private final void m11491r(InterfaceC8915i interfaceC8915i) {
    }

    /* renamed from: s */
    private final void m11492s(InterfaceC8915i interfaceC8915i) {
    }

    /* renamed from: t */
    private final void m11493t(InterfaceC8915i interfaceC8915i) {
    }

    /* renamed from: u */
    private final void m11494u(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: v */
    private final void m11495v(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: w */
    private final void m11496w(InterfaceC8913g interfaceC8913g) {
    }

    /* renamed from: x */
    private final void m11497x(InterfaceC8913g interfaceC8913g) {
    }
}
