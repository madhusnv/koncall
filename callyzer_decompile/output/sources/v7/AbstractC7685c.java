package v7;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import h6.ExecutorC2852h;
import lu.C4525k;
import pg.h6;
import pg.n6;
import qw.a0;
import tx.C7251k;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import x5.C8306b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v7.c */
/* loaded from: classes.dex */
public abstract class AbstractC7685c extends h6 {

    /* renamed from: a */
    public final MeasurementManager f37173a;

    public AbstractC7685c(MeasurementManager measurementManager) {
        this.f37173a = measurementManager;
    }

    /* renamed from: f */
    public static Object m14687f(AbstractC7685c abstractC7685c, AbstractC7683a abstractC7683a, InterfaceC7559c<? super a0> interfaceC7559c) {
        new C7251k(1, n6.m11797c(interfaceC7559c)).m13540p();
        MeasurementManager measurementManager = abstractC7685c.f37173a;
        throw null;
    }

    /* renamed from: g */
    public static Object m14688g(AbstractC7685c abstractC7685c, InterfaceC7559c<? super Integer> interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        abstractC7685c.f37173a.getMeasurementApiStatus(new ExecutorC2852h(0), new C8306b(c7251k));
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* renamed from: i */
    public static Object m14689i(AbstractC7685c abstractC7685c, Uri uri, InputEvent inputEvent, InterfaceC7559c<? super a0> interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        abstractC7685c.f37173a.registerSource(uri, inputEvent, new ExecutorC2852h(0), new C8306b(c7251k));
        Object objM13539o = c7251k.m13539o();
        return objM13539o == EnumC7794a.COROUTINE_SUSPENDED ? objM13539o : a0.f30746a;
    }

    /* renamed from: j */
    public static Object m14690j(AbstractC7685c abstractC7685c, AbstractC7686d abstractC7686d, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objM13488k = c0.m13488k(new C4525k(abstractC7685c, null, 25), interfaceC7559c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : a0.f30746a;
    }

    /* renamed from: k */
    public static Object m14691k(AbstractC7685c abstractC7685c, Uri uri, InterfaceC7559c<? super a0> interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        abstractC7685c.f37173a.registerTrigger(uri, new ExecutorC2852h(0), new C8306b(c7251k));
        Object objM13539o = c7251k.m13539o();
        return objM13539o == EnumC7794a.COROUTINE_SUSPENDED ? objM13539o : a0.f30746a;
    }

    /* renamed from: m */
    public static Object m14692m(AbstractC7685c abstractC7685c, AbstractC7687e abstractC7687e, InterfaceC7559c<? super a0> interfaceC7559c) {
        new C7251k(1, n6.m11797c(interfaceC7559c)).m13540p();
        MeasurementManager measurementManager = abstractC7685c.f37173a;
        throw null;
    }

    /* renamed from: o */
    public static Object m14693o(AbstractC7685c abstractC7685c, AbstractC7688f abstractC7688f, InterfaceC7559c<? super a0> interfaceC7559c) {
        new C7251k(1, n6.m11797c(interfaceC7559c)).m13540p();
        MeasurementManager measurementManager = abstractC7685c.f37173a;
        throw null;
    }

    @Override // pg.h6
    /* renamed from: a */
    public Object mo11673a(InterfaceC7559c<? super Integer> interfaceC7559c) {
        return m14688g(this, interfaceC7559c);
    }

    @Override // pg.h6
    /* renamed from: c */
    public Object mo11674c(Uri uri, InputEvent inputEvent, InterfaceC7559c<? super a0> interfaceC7559c) {
        return m14689i(this, uri, inputEvent, interfaceC7559c);
    }

    @Override // pg.h6
    /* renamed from: d */
    public Object mo11675d(Uri uri, InterfaceC7559c<? super a0> interfaceC7559c) {
        return m14691k(this, uri, interfaceC7559c);
    }

    /* renamed from: e */
    public Object m14694e(AbstractC7683a abstractC7683a, InterfaceC7559c<? super a0> interfaceC7559c) {
        return m14687f(this, abstractC7683a, interfaceC7559c);
    }

    /* renamed from: h */
    public Object m14695h(AbstractC7686d abstractC7686d, InterfaceC7559c<? super a0> interfaceC7559c) {
        return m14690j(this, abstractC7686d, interfaceC7559c);
    }

    /* renamed from: l */
    public Object m14696l(AbstractC7687e abstractC7687e, InterfaceC7559c<? super a0> interfaceC7559c) {
        return m14692m(this, abstractC7687e, interfaceC7559c);
    }

    /* renamed from: n */
    public Object m14697n(AbstractC7688f abstractC7688f, InterfaceC7559c<? super a0> interfaceC7559c) {
        return m14693o(this, abstractC7688f, interfaceC7559c);
    }
}
