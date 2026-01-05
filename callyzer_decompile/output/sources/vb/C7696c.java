package vb;

import bd.C0645a;
import ec.C2003a;
import j$.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import l4.C4367l;
import nd.EnumC5011b;
import og.bb;
import og.pe;
import og.u1;
import ox.C5770a;
import ox.EnumC5772c;
import qc.C6158d;
import qc.C6166l;
import qc.C6167m;
import qc.C6169o;
import qc.C6170p;
import sc.AbstractC6791k;
import td.C7124a;
import td.C7126c;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vb.c */
/* loaded from: classes.dex */
public final class C7696c implements InterfaceC8909c {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37197b;

    /* renamed from: c */
    public static final long f37198c;

    /* renamed from: d */
    public static final List f37199d;

    /* renamed from: e */
    public static final List f37200e;

    /* renamed from: a */
    public volatile /* synthetic */ Object f37201a = null;

    static {
        int i10 = C5770a.f28335d;
        f37198c = bb.m10551g(4, EnumC5772c.MINUTES);
        f37199d = pe.m10834i("RequestTimeTooSkewed", "RequestExpired", "RequestInTheFuture");
        f37200e = pe.m10834i("InvalidSignatureException", "SignatureDoesNotMatch", "AuthFailure");
        f37197b = AtomicReferenceFieldUpdater.newUpdater(C7696c.class, Object.class, "a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (ox.C5770a.m11292c(r5, vb.C7696c.f37198c) >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        r2 = (java.lang.String) r2.f35159b.get("Date");
     */
    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo16556modifyBeforeAttemptCompletiongIAlus(zb.InterfaceC8916j r10, uw.InterfaceC7559c r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.C7696c.mo16556modifyBeforeAttemptCompletiongIAlus(zb.j, uw.c):java.lang.Object");
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public final Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c) {
        return ((C6166l) interfaceC8916j).f30045b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c interfaceC7559c) {
        return ((C6170p) interfaceC8914h).f30062c;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c interfaceC7559c) {
        return ((C6167m) interfaceC8915i).f30049a;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        InterfaceC7564h context = interfaceC7559c.getContext();
        String strM8913b = a0.m8901a(C7696c.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
        }
        C4367l c4367lM10949h = u1.m10949h(context, strM8913b);
        C5770a c5770a = (C5770a) this.f37201a;
        if (c5770a != null) {
            C6158d c6158d = new C6158d(12, c5770a);
            InterfaceC7564h interfaceC7564h = (InterfaceC7564h) c4367lM10949h.f21921b;
            String str = (String) c4367lM10949h.f21923d;
            AbstractC4154l.m8923f(interfaceC7564h, "<this>");
            u1.m10948g(interfaceC7564h, EnumC5011b.Info, str, null, c6158d);
            ((C6169o) interfaceC8913g).f30059c.mo1862b(AbstractC6791k.f32298g, c5770a);
        }
        C0645a c0645a = ((C6169o) interfaceC8913g).f30059c;
        C2003a c2003a = AbstractC6791k.f32299h;
        DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
        c0645a.mo1862b(c2003a, C7124a.m13407e());
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterExecution(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
    }
}
