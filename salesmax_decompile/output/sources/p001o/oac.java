package p001o;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001o.dk6;
import p001o.et3;
import p001o.hac;

/* loaded from: classes3.dex */
public abstract class oac {

    /* renamed from: o.oac$a */
    public /* synthetic */ class C15744a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38008a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38009b;

        static {
            int[] iArr = new int[pb0.values().length];
            try {
                iArr[pb0.HTTP1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pb0.HTTP2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pb0.H2_PRIOR_KNOWLEDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38008a = iArr;
            int[] iArr2 = new int[enh.values().length];
            try {
                iArr2[enh.TLS_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[enh.TLS_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[enh.TLS_1_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[enh.TLS_1_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f38009b = iArr2;
        }
    }

    /* renamed from: c */
    public static final hac m41880c(final mac macVar, final d28 d28Var, final ct3 ct3Var) {
        hac.C13902a c13902a = new hac.C13902a();
        c13902a.m30125l(false);
        c13902a.m30126m(false);
        c13902a.m30120g(ch3.m21249n(m41883f(macVar.m58650l()), et3.f22137k));
        c13902a.m30113Z(false);
        Duration durationOfSeconds = Duration.ofSeconds(k16.m34856B(macVar.m58641c()), k16.m34858D(r1));
        sq8.m48648g(durationOfSeconds, "toComponents-impl(...)");
        c13902a.m30118e(durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(k16.m34856B(macVar.m58647i()), k16.m34858D(r3));
        sq8.m48648g(durationOfSeconds2, "toComponents-impl(...)");
        c13902a.m30112Y(durationOfSeconds2);
        Duration durationOfSeconds3 = Duration.ofSeconds(k16.m34856B(macVar.m58648j()), k16.m34858D(r3));
        sq8.m48648g(durationOfSeconds3, "toComponents-impl(...)");
        c13902a.c0(durationOfSeconds3);
        if (ct3Var == null) {
            ct3Var = new ct3(5, k16.m34894y(macVar.m58643e()), TimeUnit.MILLISECONDS);
        }
        c13902a.m30119f(ct3Var);
        final du5 du5Var = new du5();
        du5Var.m23831k(macVar.m58645g());
        du5Var.m23832l(macVar.m38634q());
        c13902a.m30121h(du5Var);
        c13902a.m30124k(new dk6.InterfaceC12980c() { // from class: o.nac
            @Override // p001o.dk6.InterfaceC12980c
            /* renamed from: a */
            public final dk6 mo23359a(bt1 bt1Var) {
                return oac.m41881d(ct3Var, macVar, du5Var, d28Var, bt1Var);
            }
        });
        if (!macVar.m58650l().m21484b().isEmpty()) {
            List listM21484b = macVar.m58650l().m21484b();
            ArrayList arrayList = new ArrayList();
            Iterator it = listM21484b.iterator();
            while (it.hasNext()) {
                int i = C15744a.f38008a[((pb0) it.next()).ordinal()];
                a2e a2eVar = i != 1 ? i != 2 ? i != 3 ? null : a2e.H2_PRIOR_KNOWLEDGE : a2e.HTTP_2 : a2e.HTTP_1_1;
                if (a2eVar != null) {
                    arrayList.add(a2eVar);
                }
            }
            c13902a.m30108U(arrayList);
        }
        c13902a.m30110W(new rac(macVar.m58646h()));
        c13902a.m30109V(new qac(macVar.m58646h()));
        c13902a.m30122i(new iac(macVar.m58644f()));
        c13902a.m30114a(neb.f36754a);
        return c13902a.m30116c();
    }

    /* renamed from: d */
    public static final dk6 m41881d(ct3 ct3Var, mac macVar, du5 du5Var, d28 d28Var, bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        return new w28(ct3Var, macVar.m58644f(), du5Var, d28Var, bt1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [o.bt3] */
    /* renamed from: e */
    public static final hac m41882e(mac macVar, d28 d28Var, at3 at3Var) {
        long jM34894y = k16.m34894y(macVar.m58643e());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        at3 at3VarM19709a = at3Var;
        if (at3Var == null) {
            at3VarM19709a = bt3.f16779a.m19709a();
        }
        return m41880c(macVar, d28Var, new ct3(5, jM34894y, timeUnit, at3VarM19709a));
    }

    /* renamed from: f */
    public static final et3 m41883f(cnh cnhVar) {
        enh enhVarM21485c = cnhVar.m21485c();
        if (enhVarM21485c == null) {
            enhVarM21485c = enh.TLS_1_2;
        }
        enh[] enhVarArrValues = enh.values();
        ArrayList arrayList = new ArrayList();
        for (enh enhVar : enhVarArrValues) {
            if (enhVar.compareTo(enhVarM21485c) >= 0) {
                arrayList.add(enhVar);
            }
        }
        List listH0 = kh3.H0(arrayList);
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList2.add(m41884g((enh) it.next()));
        }
        dnh[] dnhVarArr = (dnh[]) arrayList2.toArray(new dnh[0]);
        return new et3.C13257a(et3.f22135i).m25570f((dnh[]) Arrays.copyOf(dnhVarArr, dnhVarArr.length)).m25565a();
    }

    /* renamed from: g */
    public static final dnh m41884g(enh enhVar) {
        int i = C15744a.f38009b[enhVar.ordinal()];
        if (i == 1) {
            return dnh.TLS_1_0;
        }
        if (i == 2) {
            return dnh.TLS_1_1;
        }
        if (i == 3) {
            return dnh.TLS_1_2;
        }
        if (i == 4) {
            return dnh.TLS_1_3;
        }
        throw new szb();
    }
}
