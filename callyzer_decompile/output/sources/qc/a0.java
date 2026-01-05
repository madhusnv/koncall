package qc;

import bd.C0645a;
import ec.C2003a;
import ec.C2005c;
import kotlin.jvm.internal.AbstractC4154l;
import ld.InterfaceC4447g;
import nc.AbstractC4993d;
import og.pb;
import og.ud;
import ox.C5770a;
import ox.C5774e;
import ox.C5775f;
import ox.InterfaceC5776g;
import pd.C5896b;
import pd.C5897c;
import qw.C6364n;
import sc.C6801u;
import uw.InterfaceC7559c;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements InterfaceC8909c {

    /* renamed from: a */
    public final C6801u f30004a;

    /* renamed from: b */
    public final InterfaceC5776g f30005b;

    /* renamed from: c */
    public C5774e f30006c;

    /* renamed from: d */
    public C5774e f30007d;

    /* renamed from: e */
    public C5774e f30008e;

    /* renamed from: f */
    public C5774e f30009f;

    /* renamed from: g */
    public final C2005c f30010g;

    public a0(C6801u metrics, String str, String str2) {
        AbstractC4154l.m8923f(metrics, "metrics");
        this.f30004a = metrics;
        this.f30005b = C5775f.f28341a;
        C2005c c2005cM10980f = ud.m10980f();
        c2005cM10980f.mo1862b(new C2003a("rpc.service"), str);
        c2005cM10980f.mo1862b(new C2003a("rpc.method"), str2);
        this.f30010g = c2005cM10980f;
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public final Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c) {
        return ((C6165k) interfaceC8916j).f30040b;
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
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
        C6801u c6801u = this.f30004a;
        C5897c c5897c = c6801u.f32320c;
        InterfaceC4447g interfaceC4447g = c6801u.f32318a;
        interfaceC4447g.mo9306b().getClass();
        c5897c.getClass();
        C2005c attributes = this.f30010g;
        AbstractC4154l.m8923f(attributes, "attributes");
        C5774e c5774e = this.f30009f;
        if (c5774e != null) {
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            C5896b recordSeconds = c6801u.f32322e;
            interfaceC4447g.mo9306b().getClass();
            AbstractC4154l.m8923f(recordSeconds, "$this$recordSeconds");
            AbstractC4154l.m8923f(attributes, "attributes");
            C5770a.m11294e(jM11306a);
            C0645a c0645a = ((C6165k) interfaceC8916j).f30043e;
            C2003a key = AbstractC4993d.f24735a;
            AbstractC4154l.m8923f(c0645a, "<this>");
            AbstractC4154l.m8923f(key, "key");
            Object objMo1864e = c0645a.mo1864e(key);
            c0645a.f4116a.m5741d(key);
            C5770a c5770a = (C5770a) objMo1864e;
            if (c5770a != null) {
                pb.m10822d(c6801u.f32323f, C5770a.m11299j(jM11306a, C5770a.m11304o(c5770a.f28336a)), attributes, 4);
            }
        }
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
        C5774e c5774e = this.f30008e;
        if (c5774e != null) {
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            C6801u c6801u = this.f30004a;
            C5896b recordSeconds = c6801u.f32325h;
            c6801u.f32318a.mo9306b().getClass();
            AbstractC4154l.m8923f(recordSeconds, "$this$recordSeconds");
            C2005c attributes = this.f30010g;
            AbstractC4154l.m8923f(attributes, "attributes");
            C5770a.m11294e(jM11306a);
        }
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterExecution(InterfaceC8916j interfaceC8916j) {
        C6801u c6801u = this.f30004a;
        c6801u.f32318a.mo9306b().getClass();
        C5774e c5774e = this.f30006c;
        C2005c attributes = this.f30010g;
        if (c5774e != null) {
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            C5896b recordSeconds = c6801u.f32319b;
            AbstractC4154l.m8923f(recordSeconds, "$this$recordSeconds");
            AbstractC4154l.m8923f(attributes, "attributes");
            C5770a.m11294e(jM11306a);
        }
        Throwable thM12363a = C6364n.m12363a(((C6166l) interfaceC8916j).f30045b);
        if (thM12363a != null) {
            String strM8914c = kotlin.jvm.internal.a0.m8901a(thM12363a.getClass()).m8914c();
            if (strM8914c != null) {
                C2005c c2005cM10980f = ud.m10980f();
                c2005cM10980f.mo1862b(new C2003a("exception.type"), strM8914c);
                ud.m10979e(c2005cM10980f, attributes);
                attributes = c2005cM10980f;
            }
            c6801u.f32321d.getClass();
            AbstractC4154l.m8923f(attributes, "attributes");
        }
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
        C5774e c5774e = this.f30007d;
        if (c5774e != null) {
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            C6801u c6801u = this.f30004a;
            C5896b recordSeconds = c6801u.f32324g;
            c6801u.f32318a.mo9306b().getClass();
            AbstractC4154l.m8923f(recordSeconds, "$this$recordSeconds");
            C2005c attributes = this.f30010g;
            AbstractC4154l.m8923f(attributes, "attributes");
            C5770a.m11294e(jM11306a);
        }
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
        pb.m10820b(this.f30004a.f32330m, ((C6170p) interfaceC8914h).f30062c.f35160c.getContentLength());
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
        this.f30009f = this.f30005b.mo11308a();
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
        this.f30008e = this.f30005b.mo11308a();
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
        this.f30006c = this.f30005b.mo11308a();
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
        this.f30007d = this.f30005b.mo11308a();
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
        pb.m10820b(this.f30004a.f32329l, ((C6169o) interfaceC8913g).f30058b.mo13400c().getContentLength());
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
    }
}
