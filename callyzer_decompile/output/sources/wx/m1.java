package wx;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import tx.C7251k;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vx.EnumC7799a;
import xx.AbstractC8495a;
import xx.AbstractC8496b;
import xx.AbstractC8497c;
import xx.InterfaceC8510p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m1 extends AbstractC8495a implements u0, InterfaceC8209j, InterfaceC8510p {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39275f = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e */
    public int f39276e;

    public m1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // wx.t0
    /* renamed from: a */
    public final void mo15351a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // wx.t0
    /* renamed from: b */
    public final boolean mo15352b(Object obj) {
        m15398j(obj);
        return true;
    }

    @Override // xx.InterfaceC8510p
    /* renamed from: c */
    public final InterfaceC8209j mo15353c(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC7799a != EnumC7799a.DROP_OLDEST) ? c1.m15388s(this, interfaceC7564h, i10, enumC7799a) : this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x00f8, B:59:0x00f9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    @Override // wx.InterfaceC8209j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(wx.InterfaceC8210k r18, uw.InterfaceC7559c r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.m1.collect(wx.k, uw.c):java.lang.Object");
    }

    @Override // xx.AbstractC8495a
    /* renamed from: e */
    public final AbstractC8497c mo15354e() {
        return new n1();
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        m15398j(obj);
        return qw.a0.f30746a;
    }

    @Override // xx.AbstractC8495a
    /* renamed from: f */
    public final AbstractC8497c[] mo15355f() {
        return new n1[2];
    }

    @Override // wx.k1
    public final Object getValue() {
        C4417q c4417q = AbstractC8496b.f41395b;
        Object obj = f39275f.get(this);
        if (obj == c4417q) {
            return null;
        }
        return obj;
    }

    /* renamed from: i */
    public final boolean m15397i(Object obj, Object obj2) {
        C4417q c4417q = AbstractC8496b.f41395b;
        if (obj == null) {
            obj = c4417q;
        }
        if (obj2 == null) {
            obj2 = c4417q;
        }
        return m15399k(obj, obj2);
    }

    /* renamed from: j */
    public final void m15398j(Object obj) {
        if (obj == null) {
            obj = AbstractC8496b.f41395b;
        }
        m15399k(null, obj);
    }

    /* renamed from: k */
    public final boolean m15399k(Object obj, Object obj2) {
        int i10;
        AbstractC8497c[] abstractC8497cArr;
        C4417q c4417q;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39275f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC4154l.m8918a(obj3, obj)) {
                return false;
            }
            if (AbstractC4154l.m8918a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f39276e;
            if ((i11 & 1) != 0) {
                this.f39276e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f39276e = i12;
            AbstractC8497c[] abstractC8497cArr2 = this.f41390a;
            while (true) {
                n1[] n1VarArr = (n1[]) abstractC8497cArr2;
                if (n1VarArr != null) {
                    for (n1 n1Var : n1VarArr) {
                        if (n1Var != null) {
                            AtomicReference atomicReference = n1Var.f39284a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c4417q = c1.f39199c)) {
                                    C4417q c4417q2 = c1.f39198b;
                                    if (obj4 != c4417q2) {
                                        while (!atomicReference.compareAndSet(obj4, c4417q2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C7251k) obj4).resumeWith(qw.a0.f30746a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c4417q)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f39276e;
                    if (i10 == i12) {
                        this.f39276e = i12 + 1;
                        return true;
                    }
                    abstractC8497cArr = this.f41390a;
                }
                abstractC8497cArr2 = abstractC8497cArr;
                i12 = i10;
            }
        }
    }
}
