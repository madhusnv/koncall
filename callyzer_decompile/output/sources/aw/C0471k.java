package aw;

import a2.AbstractC0030c;
import as.C0429b;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import ct.C1502a;
import dt.C1804j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import iz.C3391x;
import ja.C3619m;
import ja.C3632z;
import java.io.File;
import java.io.IOException;
import java.util.List;
import jp.C3831l;
import kotlin.jvm.internal.C4168z;
import kz.AbstractC4297c;
import ms.C4868c;
import ns.C5136b;
import or.AbstractC5453p;
import pg.a8;
import pg.d8;
import pq.C5996a;
import qz.C6398p;
import qz.C6402t;
import qz.EnumC6384b;
import rt.C6619c;
import tq.AbstractC7201m;
import tr.C7207c;
import vc.InterfaceC7700c;
import zp.C9005e;
import zs.C9046k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.k */
/* loaded from: classes3.dex */
public final class C0471k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3384a;

    /* renamed from: b */
    public final Object f3385b;

    /* renamed from: c */
    public final /* synthetic */ Object f3386c;

    public /* synthetic */ C0471k(int i10, Object obj, Object obj2) {
        this.f3384a = i10;
        this.f3385b = obj;
        this.f3386c = obj2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        EnumC6384b enumC6384b;
        Throwable th2;
        switch (this.f3384a) {
            case 0:
                RecordingCompressManager recordingCompressManager = (RecordingCompressManager) this.f3385b;
                File file = (File) this.f3386c;
                recordingCompressManager.m5047f("File is corrupt for call : " + file + ", so deleting...", null);
                if (file.exists()) {
                    try {
                        file.delete();
                    } catch (Exception e2) {
                        recordingCompressManager.m5047f("file already exists >>>> error deleting corrupt file: " + e2, null);
                        recordingCompressManager.f7453b.m16238m("file already exists >>>> error deleting corrupt file: " + e2.getMessage(), e2);
                    }
                }
                return qw.a0.f30746a;
            case 1:
                ((C1804j) this.f3385b).m5477h(new C9046k((C1502a) this.f3386c));
                return qw.a0.f30746a;
            case 2:
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f3385b;
                C9005e c9005e = (C9005e) this.f3386c;
                interfaceC2141e.invoke(Integer.valueOf(c9005e.f43370c), c9005e.f43381n);
                return qw.a0.f30746a;
            case 3:
                StringBuilder sb2 = new StringBuilder("Ignoring property under invalid ");
                C4168z c4168z = (C4168z) this.f3386c;
                sb2.append(a8.m11536a((C3632z) c4168z.f21164a));
                sb2.append(" '");
                return d8.m11583a(AbstractC0030c.m123n(sb2, ((C3632z) c4168z.f21164a).f19273a, '\''), Integer.valueOf(((C3619m) this.f3385b).f19260a));
            case 4:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f3385b;
                C5136b c5136b = (C5136b) this.f3386c;
                interfaceC2139c.invoke(new C4868c(c5136b.f25145h, c5136b.f25143f));
                return qw.a0.f30746a;
            case 5:
                ((InterfaceC2139c) this.f3385b).invoke(Integer.valueOf(((C5996a) this.f3386c).f29313b.f23832a));
                return qw.a0.f30746a;
            case 6:
                return "dns resolved: domain=" + ((String) this.f3385b) + "; records=" + ((List) this.f3386c);
            case 7:
                return "proxy select end: url=" + ((C3391x) this.f3385b) + "; proxies=" + ((List) this.f3386c);
            case 8:
                ((InterfaceC2139c) this.f3385b).invoke((AbstractC7201m) this.f3386c);
                return qw.a0.f30746a;
            case 9:
                C6398p c6398p = (C6398p) this.f3386c;
                C6402t c6402t = (C6402t) this.f3385b;
                EnumC6384b enumC6384b2 = EnumC6384b.INTERNAL_ERROR;
                IOException e10 = null;
                try {
                    try {
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    enumC6384b = enumC6384b2;
                }
                if (!c6402t.m12395h(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th4) {
                        th2 = th4;
                        enumC6384b = enumC6384b2;
                        c6398p.m12388h(enumC6384b, enumC6384b2, e10);
                        AbstractC4297c.m8998b(c6402t);
                        throw th2;
                    }
                } while (c6402t.m12395h(false, this));
                enumC6384b = EnumC6384b.NO_ERROR;
                try {
                    try {
                        c6398p.m12388h(enumC6384b, EnumC6384b.CANCEL, null);
                    } catch (IOException e12) {
                        e10 = e12;
                        EnumC6384b enumC6384b3 = EnumC6384b.PROTOCOL_ERROR;
                        c6398p.m12388h(enumC6384b3, enumC6384b3, e10);
                        AbstractC4297c.m8998b(c6402t);
                        return qw.a0.f30746a;
                    }
                    AbstractC4297c.m8998b(c6402t);
                    return qw.a0.f30746a;
                } catch (Throwable th5) {
                    th2 = th5;
                    c6398p.m12388h(enumC6384b, enumC6384b2, e10);
                    AbstractC4297c.m8998b(c6402t);
                    throw th2;
                }
            case 10:
                ((InterfaceC2139c) this.f3385b).invoke((String) this.f3386c);
                return qw.a0.f30746a;
            case 11:
                ((InterfaceC2139c) this.f3385b).invoke(new C7207c((AbstractC5453p) this.f3386c));
                return qw.a0.f30746a;
            case 12:
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) this.f3385b;
                C6619c c6619c = (C6619c) this.f3386c;
                interfaceC2141e2.invoke(c6619c.f31803d, c6619c.f31801b);
                return qw.a0.f30746a;
            case 13:
                StringBuilder sb3 = new StringBuilder("unable to resolve identity from ");
                sb3.append((InterfaceC7700c) this.f3385b);
                sb3.append(": ");
                return AbstractC0030c.m117h((Exception) this.f3386c, sb3);
            case 14:
                ((InterfaceC2139c) this.f3385b).invoke(Boolean.valueOf(!((C0429b) this.f3386c).f3152b));
                return qw.a0.f30746a;
            default:
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f3385b;
                C9005e c9005e2 = (C9005e) this.f3386c;
                interfaceC2139c2.invoke(new C3831l(c9005e2.f43370c, c9005e2.f43381n));
                return qw.a0.f30746a;
        }
    }

    public C0471k(C6398p c6398p, C6402t c6402t) {
        this.f3384a = 9;
        this.f3386c = c6398p;
        this.f3385b = c6402t;
    }
}
