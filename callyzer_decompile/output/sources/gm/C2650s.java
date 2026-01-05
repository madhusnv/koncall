package gm;

import an.C0214u;
import an.e4;
import an.g4;
import an.g5;
import an.h3;
import an.h5;
import an.i5;
import an.m4;
import an.o5;
import an.t4;
import an.w4;
import android.content.Context;
import android.net.ConnectivityManager;
import ay.C0496f;
import ay.ExecutorC0495e;
import bn.C0709a;
import bn.C0711c;
import bn.C0712d;
import bn.C0713e;
import bn.C0714f;
import bn.C0715g;
import co.C0984a;
import com.websoptimization.callyzerbiz.data.room.CallyzerDatabase;
import fn.C2336i;
import gn.x2;
import hn.C2984a;
import hn.C2985b;
import hn.C2987d;
import iz.InterfaceC3392y;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jn.AbstractC3802a;
import jw.InterfaceC3861d;
import k2.C3953b;
import kk.C4088h;
import kk.C4089i;
import kk.EnumC4099s;
import km.C4120o;
import km.InterfaceC4106a;
import kn.C4124d;
import kn.C4125e;
import kn.C4129i;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import ln.C4493f;
import ng.C5070u;
import no.C5122i;
import oj.C5392d;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import oz.C5778a;
import pg.r8;
import pg.t9;
import ph.C5950e;
import po.C5984e;
import rn.h0;
import rn.q0;
import tx.m0;
import u8.C7357e;
import ug.C7439j;
import uo.C7476a;
import uo.C7481f;
import uo.C7485j;
import vm.EnumC7725b;
import wo.C8134s;
import xm.C8418z;
import xm.d4;
import xm.g0;
import xm.o4;
import xm.q4;
import xm.s2;
import xm.x1;
import xm.y5;
import yk.C8687a;
import ym.C8692c;
import ym.C8693d;
import ym.C8694e;
import ym.C8695f;
import ym.C8699j;
import ym.C8702m;
import ym.InterfaceC8690a;
import ym.InterfaceC8698i;
import yv.C8803r;
import yv.C8805t;
import z7.C8892u;
import zz.C9112c;
import zz.EnumC9110a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.s */
/* loaded from: classes3.dex */
public final class C2650s implements InterfaceC3861d {

    /* renamed from: a */
    public final C2651t f14275a;

    /* renamed from: b */
    public final int f14276b;

    public C2650s(C2651t c2651t, int i10) {
        this.f14275a = c2651t;
        this.f14276b = i10;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        int i10 = 2;
        switch (this.f14276b) {
            case 0:
                return new C2649r(this, 0);
            case 1:
                return new x2((h3) this.f14275a.f14310h.get(), (C0214u) this.f14275a.f14311i.get(), (w4) this.f14275a.f14312j.get(), (o5) this.f14275a.f14313k.get(), (e4) this.f14275a.f14314l.get(), (t4) this.f14275a.f14315m.get(), (i5) this.f14275a.f14316n.get(), (g5) this.f14275a.f14317o.get(), (m4) this.f14275a.f14318p.get(), (C0711c) this.f14275a.f14319q.get(), (C0709a) this.f14275a.f14320r.get(), (C0714f) this.f14275a.f14321s.get(), (C0713e) this.f14275a.f14322t.get(), (C0712d) this.f14275a.f14323u.get(), (C0715g) this.f14275a.f14324v.get(), (h5) this.f14275a.f14325w.get(), this.f14275a.m6633w(), (g4) this.f14275a.f14326x.get());
            case 2:
                C2651t c2651t = this.f14275a;
                C8687a c8687a = c2651t.f14303a;
                CallyzerDatabase callyzerDb = (CallyzerDatabase) c2651t.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb, "callyzerDb");
                h3 h3VarMo5018y = callyzerDb.mo5018y();
                r8.m11853a(h3VarMo5018y);
                return h3VarMo5018y;
            case 3:
                C2651t c2651t2 = this.f14275a;
                C5392d c5392d = c2651t2.f14304b;
                Context context = c2651t2.f14305c.f15864a;
                C8805t c8805tM6633w = c2651t2.m6633w();
                C8892u c8892uM11876a = t9.m11876a(context, CallyzerDatabase.class, "CallDetails");
                c8892uM11876a.f42828p = false;
                c8892uM11876a.f42829q = true;
                c8892uM11876a.m16385a(new C7357e(c8805tM6633w));
                return (CallyzerDatabase) c8892uM11876a.m16386b();
            case 4:
                C2651t c2651t3 = this.f14275a;
                C8687a c8687a2 = c2651t3.f14303a;
                CallyzerDatabase callyzerDb2 = (CallyzerDatabase) c2651t3.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb2, "callyzerDb");
                C0214u c0214uMo5017x = callyzerDb2.mo5017x();
                r8.m11853a(c0214uMo5017x);
                return c0214uMo5017x;
            case 5:
                C2651t c2651t4 = this.f14275a;
                C8687a c8687a3 = c2651t4.f14303a;
                CallyzerDatabase callyzerDb3 = (CallyzerDatabase) c2651t4.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb3, "callyzerDb");
                w4 w4VarMo5004B = callyzerDb3.mo5004B();
                r8.m11853a(w4VarMo5004B);
                return w4VarMo5004B;
            case 6:
                C2651t c2651t5 = this.f14275a;
                C8687a c8687a4 = c2651t5.f14303a;
                CallyzerDatabase callyzerDb4 = (CallyzerDatabase) c2651t5.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb4, "callyzerDb");
                o5 o5VarMo5016N = callyzerDb4.mo5016N();
                r8.m11853a(o5VarMo5016N);
                return o5VarMo5016N;
            case 7:
                C2651t c2651t6 = this.f14275a;
                C8687a c8687a5 = c2651t6.f14303a;
                CallyzerDatabase callyzerDb5 = (CallyzerDatabase) c2651t6.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb5, "callyzerDb");
                e4 e4VarMo5019z = callyzerDb5.mo5019z();
                r8.m11853a(e4VarMo5019z);
                return e4VarMo5019z;
            case 8:
                C2651t c2651t7 = this.f14275a;
                C8687a c8687a6 = c2651t7.f14303a;
                CallyzerDatabase callyzerDb6 = (CallyzerDatabase) c2651t7.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb6, "callyzerDb");
                t4 t4VarMo5015M = callyzerDb6.mo5015M();
                r8.m11853a(t4VarMo5015M);
                return t4VarMo5015M;
            case 9:
                C2651t c2651t8 = this.f14275a;
                C8687a c8687a7 = c2651t8.f14303a;
                CallyzerDatabase callyzerDb7 = (CallyzerDatabase) c2651t8.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb7, "callyzerDb");
                i5 i5VarMo5007E = callyzerDb7.mo5007E();
                r8.m11853a(i5VarMo5007E);
                return i5VarMo5007E;
            case 10:
                C2651t c2651t9 = this.f14275a;
                C8687a c8687a8 = c2651t9.f14303a;
                CallyzerDatabase callyzerDb8 = (CallyzerDatabase) c2651t9.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb8, "callyzerDb");
                g5 g5VarMo5005C = callyzerDb8.mo5005C();
                r8.m11853a(g5VarMo5005C);
                return g5VarMo5005C;
            case 11:
                C2651t c2651t10 = this.f14275a;
                C8687a c8687a9 = c2651t10.f14303a;
                CallyzerDatabase callyzerDb9 = (CallyzerDatabase) c2651t10.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb9, "callyzerDb");
                m4 m4VarMo5003A = callyzerDb9.mo5003A();
                r8.m11853a(m4VarMo5003A);
                return m4VarMo5003A;
            case 12:
                C2651t c2651t11 = this.f14275a;
                C8687a c8687a10 = c2651t11.f14303a;
                CallyzerDatabase callyzerDb10 = (CallyzerDatabase) c2651t11.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb10, "callyzerDb");
                C0711c c0711cMo5009G = callyzerDb10.mo5009G();
                r8.m11853a(c0711cMo5009G);
                return c0711cMo5009G;
            case 13:
                C2651t c2651t12 = this.f14275a;
                C8687a c8687a11 = c2651t12.f14303a;
                CallyzerDatabase callyzerDb11 = (CallyzerDatabase) c2651t12.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb11, "callyzerDb");
                C0709a c0709aMo5008F = callyzerDb11.mo5008F();
                r8.m11853a(c0709aMo5008F);
                return c0709aMo5008F;
            case 14:
                C2651t c2651t13 = this.f14275a;
                C8687a c8687a12 = c2651t13.f14303a;
                CallyzerDatabase callyzerDb12 = (CallyzerDatabase) c2651t13.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb12, "callyzerDb");
                C0714f c0714fMo5012J = callyzerDb12.mo5012J();
                r8.m11853a(c0714fMo5012J);
                return c0714fMo5012J;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C2651t c2651t14 = this.f14275a;
                C8687a c8687a13 = c2651t14.f14303a;
                CallyzerDatabase callyzerDb13 = (CallyzerDatabase) c2651t14.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb13, "callyzerDb");
                C0713e c0713eMo5011I = callyzerDb13.mo5011I();
                r8.m11853a(c0713eMo5011I);
                return c0713eMo5011I;
            case 16:
                C2651t c2651t15 = this.f14275a;
                C8687a c8687a14 = c2651t15.f14303a;
                CallyzerDatabase callyzerDb14 = (CallyzerDatabase) c2651t15.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb14, "callyzerDb");
                C0712d c0712dMo5010H = callyzerDb14.mo5010H();
                r8.m11853a(c0712dMo5010H);
                return c0712dMo5010H;
            case 17:
                C2651t c2651t16 = this.f14275a;
                C8687a c8687a15 = c2651t16.f14303a;
                CallyzerDatabase callyzerDb15 = (CallyzerDatabase) c2651t16.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb15, "callyzerDb");
                C0715g c0715gMo5013K = callyzerDb15.mo5013K();
                r8.m11853a(c0715gMo5013K);
                return c0715gMo5013K;
            case 18:
                C2651t c2651t17 = this.f14275a;
                C8687a c8687a16 = c2651t17.f14303a;
                CallyzerDatabase callyzerDb16 = (CallyzerDatabase) c2651t17.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb16, "callyzerDb");
                h5 h5VarMo5006D = callyzerDb16.mo5006D();
                r8.m11853a(h5VarMo5006D);
                return h5VarMo5006D;
            case 19:
                C2651t c2651t18 = this.f14275a;
                C8687a c8687a17 = c2651t18.f14303a;
                CallyzerDatabase callyzerDb17 = (CallyzerDatabase) c2651t18.f14309g.get();
                AbstractC4154l.m8923f(callyzerDb17, "callyzerDb");
                g4 g4VarMo5014L = callyzerDb17.mo5014L();
                r8.m11853a(g4VarMo5014L);
                return g4VarMo5014L;
            case 20:
                return new C2336i((InterfaceC4106a) this.f14275a.f14328z.get());
            case 21:
                C2651t c2651t19 = this.f14275a;
                return new C4120o(c2651t19.f14305c.f15864a, c2651t19.m6633w());
            case 22:
                return new C2987d((InterfaceC8690a) this.f14275a.f14292P.get());
            case 23:
                C2651t c2651t20 = this.f14275a;
                C5070u c5070u = c2651t20.f14306d;
                iz.d0 okHttpClient = (iz.d0) c2651t20.f14291O.get();
                C2651t c2651t21 = this.f14275a;
                InterfaceC3861d deviceDeleteManager = c2651t21.f14282F;
                InterfaceC3861d leadSubscriptionExpireManager = c2651t21.f14283G;
                AbstractC4154l.m8923f(okHttpClient, "okHttpClient");
                AbstractC4154l.m8923f(deviceDeleteManager, "deviceDeleteManager");
                AbstractC4154l.m8923f(leadSubscriptionExpireManager, "leadSubscriptionExpireManager");
                C4089i c4089i = new C4089i();
                EnumC4099s enumC4099s = EnumC4099s.LENIENT;
                Objects.requireNonNull(enumC4099s);
                c4089i.f20991k = enumC4099s;
                c4089i.f20985e.add(new C8702m());
                c4089i.m8865b(LocalDateTime.class, C8694e.f42063a);
                c4089i.m8865b(LocalDate.class, C8695f.f42064a);
                c4089i.m8865b(EnumC7725b.class, C8693d.f42062a);
                c4089i.m8866c(new C8692c());
                C4088h c4088hM8864a = c4089i.m8864a();
                try {
                    try {
                        InterfaceC8690a interfaceC8690aM10001k = C5070u.m10001k(c4088hM8864a, deviceDeleteManager, leadSubscriptionExpireManager, okHttpClient);
                        AbstractC4154l.m8920c(interfaceC8690aM10001k);
                        return interfaceC8690aM10001k;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        throw new RuntimeException("Failed to create provideRetrofit instance after retry", e2);
                    }
                } catch (Exception unused) {
                    InterfaceC8690a interfaceC8690aM10001k2 = C5070u.m10001k(c4088hM8864a, deviceDeleteManager, leadSubscriptionExpireManager, okHttpClient);
                    AbstractC4154l.m8920c(interfaceC8690aM10001k2);
                    return interfaceC8690aM10001k2;
                }
            case 24:
                C2651t c2651t22 = this.f14275a;
                C5070u c5070u2 = c2651t22.f14306d;
                InterfaceC3392y headerSettingInterceptor = (InterfaceC3392y) c2651t22.f14289M.get();
                InterfaceC3392y responseInterceptor = (InterfaceC3392y) this.f14275a.f14290N.get();
                C9112c httpLoggingInterceptor = (C9112c) this.f14275a.f14278B.get();
                AbstractC4154l.m8923f(headerSettingInterceptor, "headerSettingInterceptor");
                AbstractC4154l.m8923f(responseInterceptor, "responseInterceptor");
                AbstractC4154l.m8923f(httpLoggingInterceptor, "httpLoggingInterceptor");
                iz.c0 c0Var = new iz.c0();
                c0Var.f17814f = true;
                TimeUnit unit = TimeUnit.SECONDS;
                AbstractC4154l.m8923f(unit, "unit");
                c0Var.f17828t = AbstractC4299e.m9013b(60L, unit);
                c0Var.f17829u = AbstractC4299e.m9013b(60L, unit);
                c0Var.f17830v = AbstractC4299e.m9013b(60L, unit);
                c0Var.f17811c.add(responseInterceptor);
                c0Var.f17811c.add(headerSettingInterceptor);
                return new iz.d0(c0Var);
            case 25:
                C2651t c2651t23 = this.f14275a;
                C5070u c5070u3 = c2651t23.f14306d;
                g0 authTokenStatusRepository = (g0) c2651t23.f14288L.get();
                AbstractC4154l.m8923f(authTokenStatusRepository, "authTokenStatusRepository");
                return new C5778a(i10, authTokenStatusRepository);
            case 26:
                C2651t c2651t24 = this.f14275a;
                return new g0(c2651t24.f14305c.f15864a, (C2336i) c2651t24.f14277A.get(), (C2984a) this.f14275a.f14285I.get(), (C2985b) this.f14275a.f14287K.get(), (x2) this.f14275a.f14327y.get(), this.f14275a.m6633w());
            case 27:
                return new C2984a((InterfaceC8690a) this.f14275a.f14284H.get());
            case 28:
                C2651t c2651t25 = this.f14275a;
                C5070u c5070u4 = c2651t25.f14306d;
                iz.d0 okHttpClient2 = (iz.d0) c2651t25.f14279C.get();
                C2651t c2651t26 = this.f14275a;
                InterfaceC3861d deviceDeleteManager2 = c2651t26.f14282F;
                InterfaceC3861d leadSubscriptionExpireManager2 = c2651t26.f14283G;
                AbstractC4154l.m8923f(okHttpClient2, "okHttpClient");
                AbstractC4154l.m8923f(deviceDeleteManager2, "deviceDeleteManager");
                AbstractC4154l.m8923f(leadSubscriptionExpireManager2, "leadSubscriptionExpireManager");
                C4089i c4089i2 = new C4089i();
                EnumC4099s enumC4099s2 = EnumC4099s.LENIENT;
                Objects.requireNonNull(enumC4099s2);
                c4089i2.f20991k = enumC4099s2;
                c4089i2.f20985e.add(new C8702m());
                c4089i2.m8865b(LocalDateTime.class, C8694e.f42063a);
                c4089i2.m8865b(LocalDate.class, C8695f.f42064a);
                c4089i2.m8865b(EnumC7725b.class, C8693d.f42062a);
                c4089i2.m8866c(new C8692c());
                C4088h c4088hM8864a2 = c4089i2.m8864a();
                try {
                    try {
                        InterfaceC8690a interfaceC8690aM10003m = C5070u.m10003m(c4088hM8864a2, deviceDeleteManager2, leadSubscriptionExpireManager2, okHttpClient2);
                        AbstractC4154l.m8920c(interfaceC8690aM10003m);
                        return interfaceC8690aM10003m;
                    } catch (Exception unused2) {
                        InterfaceC8690a interfaceC8690aM10003m2 = C5070u.m10003m(c4088hM8864a2, deviceDeleteManager2, leadSubscriptionExpireManager2, okHttpClient2);
                        AbstractC4154l.m8920c(interfaceC8690aM10003m2);
                        return interfaceC8690aM10003m2;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    throw new RuntimeException("Failed to create provideRetrofitNoAuthToken instance after retry", e10);
                }
            case 29:
                C2651t c2651t27 = this.f14275a;
                C5070u c5070u5 = c2651t27.f14306d;
                C9112c httpLoggingInterceptor2 = (C9112c) c2651t27.f14278B.get();
                AbstractC4154l.m8923f(httpLoggingInterceptor2, "httpLoggingInterceptor");
                iz.c0 c0Var2 = new iz.c0();
                c0Var2.f17814f = true;
                TimeUnit unit2 = TimeUnit.SECONDS;
                AbstractC4154l.m8923f(unit2, "unit");
                c0Var2.f17828t = AbstractC4299e.m9013b(60L, unit2);
                c0Var2.f17829u = AbstractC4299e.m9013b(60L, unit2);
                c0Var2.f17830v = AbstractC4299e.m9013b(60L, unit2);
                c0Var2.f17812d.add(httpLoggingInterceptor2);
                return new iz.d0(c0Var2);
            case 30:
                C5070u c5070u6 = this.f14275a.f14306d;
                C9112c c9112c = new C9112c();
                EnumC9110a level = EnumC9110a.BODY;
                AbstractC4154l.m8923f(level, "level");
                c9112c.f43680b = level;
                return c9112c;
            case BERTags.DATE /* 31 */:
                return new C4124d((y5) this.f14275a.f14281E.get(), this.f14275a.m6633w());
            case 32:
                return new y5((C2336i) this.f14275a.f14277A.get(), (x2) this.f14275a.f14327y.get(), (C2987d) this.f14275a.f14280D.get(), this.f14275a.m6633w(), AbstractC3802a.m8397a(this.f14275a.f14307e));
            case BERTags.DATE_TIME /* 33 */:
                return new C4125e((y5) this.f14275a.f14281E.get(), this.f14275a.m6633w(), AbstractC3802a.m8397a(this.f14275a.f14307e));
            case BERTags.DURATION /* 34 */:
                return new C2985b((InterfaceC8698i) this.f14275a.f14286J.get());
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                C2651t c2651t28 = this.f14275a;
                C5070u c5070u7 = c2651t28.f14306d;
                iz.d0 okHttpClient3 = (iz.d0) c2651t28.f14279C.get();
                C2651t c2651t29 = this.f14275a;
                InterfaceC3861d deviceDeleteManager3 = c2651t29.f14282F;
                InterfaceC3861d leadSubscriptionExpireManager3 = c2651t29.f14283G;
                AbstractC4154l.m8923f(okHttpClient3, "okHttpClient");
                AbstractC4154l.m8923f(deviceDeleteManager3, "deviceDeleteManager");
                AbstractC4154l.m8923f(leadSubscriptionExpireManager3, "leadSubscriptionExpireManager");
                C4089i c4089i3 = new C4089i();
                EnumC4099s enumC4099s3 = EnumC4099s.LENIENT;
                Objects.requireNonNull(enumC4099s3);
                c4089i3.f20991k = enumC4099s3;
                c4089i3.f20985e.add(new C8702m());
                c4089i3.m8865b(LocalDateTime.class, C8694e.f42063a);
                c4089i3.m8865b(LocalDate.class, C8695f.f42064a);
                c4089i3.m8865b(EnumC7725b.class, C8693d.f42062a);
                c4089i3.m8866c(new C8692c());
                C4088h c4088hM8864a3 = c4089i3.m8864a();
                try {
                    try {
                        InterfaceC8698i interfaceC8698iM10002l = C5070u.m10002l(c4088hM8864a3, deviceDeleteManager3, leadSubscriptionExpireManager3, okHttpClient3);
                        AbstractC4154l.m8920c(interfaceC8698iM10002l);
                        return interfaceC8698iM10002l;
                    } catch (Exception unused3) {
                        InterfaceC8698i interfaceC8698iM10002l2 = C5070u.m10002l(c4088hM8864a3, deviceDeleteManager3, leadSubscriptionExpireManager3, okHttpClient3);
                        AbstractC4154l.m8920c(interfaceC8698iM10002l2);
                        return interfaceC8698iM10002l2;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    throw new RuntimeException("Failed to create provideRetrofitNoAuth instance after retry", e11);
                }
            case BERTags.RELATIVE_OID_IRI /* 36 */:
                C2651t c2651t30 = this.f14275a;
                C5070u c5070u8 = c2651t30.f14306d;
                g0 authTokenStatusRepository2 = (g0) c2651t30.f14288L.get();
                C8805t c8805tM6633w2 = this.f14275a.m6633w();
                AbstractC4154l.m8923f(authTokenStatusRepository2, "authTokenStatusRepository");
                return new C8699j(authTokenStatusRepository2, c8805tM6633w2);
            case 37:
                Context context2 = this.f14275a.f14305c.f15864a;
                Object systemService = context2.getSystemService("connectivity");
                AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return new C8803r(context2, (ConnectivityManager) systemService);
            case 38:
                return new C2649r(this, 1);
            case 39:
                return new q4((C2336i) this.f14275a.f14277A.get(), this.f14275a.m6633w(), AbstractC3802a.m8397a(this.f14275a.f14307e));
            case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                C2336i c2336i = (C2336i) this.f14275a.f14277A.get();
                C2987d c2987d = (C2987d) this.f14275a.f14280D.get();
                y5 y5Var = (y5) this.f14275a.f14281E.get();
                C2651t c2651t31 = this.f14275a;
                return new C8418z(c2336i, c2987d, y5Var, c2651t31.f14305c.f15864a, AbstractC3802a.m8397a(c2651t31.f14307e), this.f14275a.m6633w(), (q4) this.f14275a.f14295S.get());
            case 41:
                return new C2649r(this, 2);
            case 42:
                return new C2649r(this, 3);
            case 43:
                C2651t c2651t32 = this.f14275a;
                Context context3 = c2651t32.f14305c.f15864a;
                y5 y5Var2 = (y5) c2651t32.f14281E.get();
                C8418z c8418z = (C8418z) this.f14275a.f14296T.get();
                x1 x1VarM6614d = this.f14275a.m6614d();
                s2 s2Var = (s2) this.f14275a.f14300X.get();
                q0 q0VarM6620j = this.f14275a.m6620j();
                C8803r c8803r = (C8803r) this.f14275a.f14293Q.get();
                C8134s c8134sM6631u = this.f14275a.m6631u();
                C5984e c5984eM6624n = this.f14275a.m6624n();
                C7485j c7485jM6627q = this.f14275a.m6627q();
                this.f14275a.m6624n();
                C0984a c0984a = new C0984a();
                C2651t c2651t33 = this.f14275a;
                return new h0(context3, y5Var2, c8418z, x1VarM6614d, s2Var, q0VarM6620j, c8803r, c8134sM6631u, c5984eM6624n, c7485jM6627q, c0984a, new C4493f(c2651t33.f14305c.f15864a, c2651t33.m6633w()), AbstractC3802a.m8397a(this.f14275a.f14307e), this.f14275a.m6633w());
            case 44:
                C5950e c5950e = this.f14275a.f14307e;
                C0496f c0496f = m0.f34659a;
                return tx.c0.m13479b(ExecutorC0495e.f3538c.E0(1));
            case 45:
                C2651t c2651t34 = this.f14275a;
                return new s2(c2651t34.f14305c.f15864a, (C2987d) c2651t34.f14280D.get(), (x2) this.f14275a.f14327y.get(), (C2336i) this.f14275a.f14277A.get(), this.f14275a.m6614d(), (y5) this.f14275a.f14281E.get(), AbstractC3802a.m8397a(this.f14275a.f14307e), (C2985b) this.f14275a.f14287K.get(), this.f14275a.m6633w());
            case 46:
                C2651t c2651t35 = this.f14275a;
                return new C5122i(c2651t35.f14305c.f15864a, c2651t35.m6614d(), this.f14275a.m6631u(), (y5) this.f14275a.f14281E.get(), this.f14275a.m6633w(), this.f14275a.m6622l(), AbstractC3802a.m8397a(this.f14275a.f14307e), (C8803r) this.f14275a.f14293Q.get(), this.f14275a.m6634x(), this.f14275a.m6624n(), (C8418z) this.f14275a.f14296T.get());
            case 47:
                return new C2649r(this, 4);
            case 48:
                return new C2649r(this, 5);
            case 49:
                return new C2649r(this, 6);
            case 50:
                return new C2649r(this, 7);
            case 51:
                return new o4((C2336i) this.f14275a.f14277A.get(), this.f14275a.m6633w(), AbstractC3802a.m8397a(this.f14275a.f14307e));
            case 52:
                return new C2649r(this, 8);
            case 53:
                return new C7481f(new C7439j((C2336i) this.f14275a.f14277A.get()), this.f14275a.m6633w(), this.f14275a.f14305c.f15864a);
            case 54:
                C2651t c2651t36 = this.f14275a;
                return new C7476a(c2651t36.f14305c.f15864a, (d4) c2651t36.f44294i0.get(), new C7439j((C2336i) this.f14275a.f14277A.get()), this.f14275a.m6633w());
            case 55:
                d4 d4Var = new d4();
                d4Var.f40225a = C3953b.m8517t(new C4129i("", ""));
                return d4Var;
            default:
                throw new AssertionError(this.f14276b);
        }
    }
}
