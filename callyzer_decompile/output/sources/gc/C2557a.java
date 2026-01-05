package gc;

import bg.AbstractC0656a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import qv.AbstractC6327b;
import qw.a0;
import tr.C7208d;
import tr.C7209e;
import uq.C7504j;
import vv.AbstractC7792d;
import wr.AbstractC8154j;
import xt.AbstractC8450a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gc.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C2557a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f13955a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f13956b;

    public /* synthetic */ C2557a(int i10, int i11, InterfaceC2139c interfaceC2139c) {
        this.f13955a = i11;
        this.f13956b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13955a) {
            case 0:
                String sysProp = (String) obj;
                String envVar = (String) obj2;
                AbstractC4154l.m8923f(sysProp, "sysProp");
                AbstractC4154l.m8923f(envVar, "envVar");
                return new C2558b(this.f13956b, sysProp, envVar, null);
            case 1:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(7);
                AbstractC0656a.m1894c(this.f13956b, (InterfaceC3962k) obj, iM8496A);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM8496A2 = C3953b.m8496A(1);
                AbstractC6327b.m12337b(this.f13956b, (InterfaceC3962k) obj, iM8496A2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM8496A3 = C3953b.m8496A(1);
                AbstractC6327b.m12338c(this.f13956b, (InterfaceC3962k) obj, iM8496A3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM8496A4 = C3953b.m8496A(1);
                AbstractC6327b.m12355t(this.f13956b, (InterfaceC3962k) obj, iM8496A4);
                break;
            case 5:
                this.f13956b.invoke(new C7209e((LocalDate) obj, (LocalDate) obj2));
                break;
            case 6:
                String name = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC4154l.m8923f(name, "name");
                this.f13956b.invoke(new C7208d(name, zBooleanValue));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iM8496A5 = C3953b.m8496A(1);
                AbstractC7792d.m14749a(this.f13956b, (InterfaceC3962k) obj, iM8496A5);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iM8496A6 = C3953b.m8496A(1);
                AbstractC8154j.m15328g(this.f13956b, (InterfaceC3962k) obj, iM8496A6);
                break;
            case 9:
                LocalDateTime startDate = (LocalDateTime) obj;
                LocalDateTime toDate = (LocalDateTime) obj2;
                AbstractC4154l.m8923f(startDate, "startDate");
                AbstractC4154l.m8923f(toDate, "toDate");
                LocalDate localDateMo7846m = startDate.mo7846m();
                AbstractC4154l.m8922e(localDateMo7846m, "toLocalDate(...)");
                C7504j c7504j = new C7504j(true, localDateMo7846m);
                InterfaceC2139c interfaceC2139c = this.f13956b;
                interfaceC2139c.invoke(c7504j);
                LocalDate localDateMo7846m2 = toDate.mo7846m();
                AbstractC4154l.m8922e(localDateMo7846m2, "toLocalDate(...)");
                interfaceC2139c.invoke(new C7504j(false, localDateMo7846m2));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A7 = C3953b.m8496A(7);
                AbstractC8450a.m15754a(this.f13956b, (InterfaceC3962k) obj, iM8496A7);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C2557a(int i10, InterfaceC2139c interfaceC2139c) {
        this.f13955a = i10;
        this.f13956b = interfaceC2139c;
    }
}
