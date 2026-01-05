package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p001o.lv7;
import p001o.o4d;
import p001o.ree;

/* loaded from: classes2.dex */
public final class fo3 implements un3 {

    /* renamed from: A */
    public int f23756A;

    /* renamed from: B */
    public int f23757B;

    /* renamed from: C */
    public int f23758C;

    /* renamed from: D */
    public boolean f23759D;

    /* renamed from: E */
    public final C13499a f23760E;

    /* renamed from: F */
    public final r2g f23761F;

    /* renamed from: G */
    public boolean f23762G;

    /* renamed from: H */
    public boolean f23763H;

    /* renamed from: I */
    public cwf f23764I;

    /* renamed from: J */
    public dwf f23765J;

    /* renamed from: K */
    public gwf f23766K;

    /* renamed from: L */
    public boolean f23767L;

    /* renamed from: M */
    public o4d f23768M;

    /* renamed from: N */
    public List f23769N;

    /* renamed from: O */
    public sc0 f23770O;

    /* renamed from: P */
    public final List f23771P;

    /* renamed from: Q */
    public boolean f23772Q;

    /* renamed from: R */
    public int f23773R;

    /* renamed from: S */
    public int f23774S;

    /* renamed from: T */
    public r2g f23775T;

    /* renamed from: U */
    public int f23776U;

    /* renamed from: V */
    public boolean f23777V;

    /* renamed from: W */
    public boolean f23778W;

    /* renamed from: X */
    public final pl8 f23779X;

    /* renamed from: Y */
    public final r2g f23780Y;

    /* renamed from: Z */
    public int f23781Z;
    public int a0;

    /* renamed from: b */
    public final ao0 f23782b;
    public int b0;

    /* renamed from: c */
    public final bp3 f23783c;
    public int c0;

    /* renamed from: d */
    public final dwf f23784d;

    /* renamed from: e */
    public final Set f23785e;

    /* renamed from: f */
    public List f23786f;

    /* renamed from: g */
    public List f23787g;

    /* renamed from: h */
    public final u64 f23788h;

    /* renamed from: i */
    public final r2g f23789i;

    /* renamed from: j */
    public c3d f23790j;

    /* renamed from: k */
    public int f23791k;

    /* renamed from: l */
    public pl8 f23792l;

    /* renamed from: m */
    public int f23793m;

    /* renamed from: n */
    public pl8 f23794n;

    /* renamed from: o */
    public int[] f23795o;

    /* renamed from: p */
    public HashMap f23796p;

    /* renamed from: q */
    public boolean f23797q;

    /* renamed from: r */
    public boolean f23798r;

    /* renamed from: s */
    public boolean f23799s;

    /* renamed from: t */
    public final List f23800t;

    /* renamed from: u */
    public final pl8 f23801u;

    /* renamed from: v */
    public o4d f23802v;

    /* renamed from: w */
    public final el8 f23803w;

    /* renamed from: x */
    public boolean f23804x;

    /* renamed from: y */
    public final pl8 f23805y;

    /* renamed from: z */
    public boolean f23806z;

    /* renamed from: o.fo3$a */
    public static final class C13499a implements jm5 {
        public C13499a() {
        }

        @Override // p001o.jm5
        /* renamed from: a */
        public void mo27217a(im5 im5Var) {
            sq8.m48649h(im5Var, "derivedState");
            fo3.this.f23757B++;
        }

        @Override // p001o.jm5
        /* renamed from: b */
        public void mo27218b(im5 im5Var) {
            sq8.m48649h(im5Var, "derivedState");
            fo3 fo3Var = fo3.this;
            fo3Var.f23757B--;
        }
    }

    /* renamed from: o.fo3$b */
    public static final class C13500b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(Integer.valueOf(((kv8) obj).m36254b()), Integer.valueOf(((kv8) obj2).m36254b()));
        }
    }

    /* renamed from: o.fo3$c */
    public static final class C13501c extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f23808a;

        /* renamed from: b */
        public final /* synthetic */ fo3 f23809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13501c(xk7 xk7Var, fo3 fo3Var) {
            super(3);
            this.f23808a = xk7Var;
            this.f23809b = fo3Var;
        }

        /* renamed from: a */
        public final void m27219a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            this.f23808a.invoke(this.f23809b.a0());
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27219a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$d */
    public static final class C13502d extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ ege f23810a;

        /* renamed from: b */
        public final /* synthetic */ sc0 f23811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13502d(ege egeVar, sc0 sc0Var) {
            super(3);
            this.f23810a = egeVar;
            this.f23811b = sc0Var;
        }

        /* renamed from: a */
        public final void m27220a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            this.f23810a.f21602a = fo3.i0(gwfVar, this.f23811b, ao0Var);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27220a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$e */
    public static final class C13503e extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ List f23813b;

        /* renamed from: c */
        public final /* synthetic */ cwf f23814c;

        /* renamed from: d */
        public final /* synthetic */ zmb f23815d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13503e(List list, cwf cwfVar, zmb zmbVar) {
            super(0);
            this.f23813b = list;
            this.f23814c = cwfVar;
            this.f23815d = zmbVar;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69005invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69005invoke() {
            fo3 fo3Var = fo3.this;
            List list = this.f23813b;
            cwf cwfVar = this.f23814c;
            zmb zmbVar = this.f23815d;
            List list2 = fo3Var.f23786f;
            try {
                fo3Var.f23786f = list;
                cwf cwfVar2 = fo3Var.f23764I;
                int[] iArr = fo3Var.f23795o;
                fo3Var.f23795o = null;
                try {
                    fo3Var.f23764I = cwfVar;
                    zmbVar.m59618c();
                    fo3Var.m0(null, zmbVar.m59620e(), zmbVar.m59621f(), true);
                    y3i y3iVar = y3i.f54824a;
                } finally {
                    fo3Var.f23764I = cwfVar2;
                    fo3Var.f23795o = iArr;
                }
            } finally {
                fo3Var.f23786f = list2;
            }
        }
    }

    /* renamed from: o.fo3$f */
    public static final class C13504f extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ ege f23816a;

        /* renamed from: b */
        public final /* synthetic */ List f23817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13504f(ege egeVar, List list) {
            super(3);
            this.f23816a = egeVar;
            this.f23817b = list;
        }

        /* renamed from: a */
        public final void m27221a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "rememberManager");
            int i = this.f23816a.f21602a;
            if (i > 0) {
                ao0Var = new t9c(ao0Var, i);
            }
            List list = this.f23817b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ql7) list.get(i2)).invoke(ao0Var, gwfVar, xheVar);
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27221a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$g */
    public static final class C13505g extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ ege f23818a;

        /* renamed from: b */
        public final /* synthetic */ List f23819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13505g(ege egeVar, List list) {
            super(3);
            this.f23818a = egeVar;
            this.f23819b = list;
        }

        /* renamed from: a */
        public final void m27222a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            int i = this.f23818a.f21602a;
            List list = this.f23819b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                ao0Var.mo17551e(i3, obj);
                ao0Var.mo17549c(i3, obj);
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27222a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$h */
    public static final class C13506h extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ ymb f23820a;

        /* renamed from: b */
        public final /* synthetic */ fo3 f23821b;

        /* renamed from: c */
        public final /* synthetic */ zmb f23822c;

        /* renamed from: d */
        public final /* synthetic */ zmb f23823d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13506h(ymb ymbVar, fo3 fo3Var, zmb zmbVar, zmb zmbVar2) {
            super(3);
            this.f23820a = ymbVar;
            this.f23821b = fo3Var;
            this.f23822c = zmbVar;
            this.f23823d = zmbVar2;
        }

        /* renamed from: a */
        public final void m27223a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            ymb ymbVarMo19510i = this.f23820a;
            if (ymbVarMo19510i == null && (ymbVarMo19510i = this.f23821b.f23783c.mo19510i(this.f23822c)) == null) {
                go3.m29222v("Could not resolve state for movable content");
                throw new qe9();
            }
            List listS0 = gwfVar.s0(1, ymbVarMo19510i.m58000a(), 2);
            ree.C16595a c16595a = ree.f43446h;
            u64 u64VarM59617b = this.f23823d.m59617b();
            sq8.m48647f(u64VarM59617b, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            c16595a.m46619a(gwfVar, listS0, (tee) u64VarM59617b);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27223a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$i */
    public static final class C13507i extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ zmb f23825b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13507i(zmb zmbVar) {
            super(0);
            this.f23825b = zmbVar;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69006invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69006invoke() {
            fo3 fo3Var = fo3.this;
            this.f23825b.m59618c();
            fo3Var.m0(null, this.f23825b.m59620e(), this.f23825b.m59621f(), true);
        }
    }

    /* renamed from: o.fo3$j */
    public static final class C13508j extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ ege f23826a;

        /* renamed from: b */
        public final /* synthetic */ List f23827b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13508j(ege egeVar, List list) {
            super(3);
            this.f23826a = egeVar;
            this.f23827b = list;
        }

        /* renamed from: a */
        public final void m27224a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "rememberManager");
            int i = this.f23826a.f21602a;
            if (i > 0) {
                ao0Var = new t9c(ao0Var, i);
            }
            List list = this.f23827b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ql7) list.get(i2)).invoke(ao0Var, gwfVar, xheVar);
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27224a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$k */
    public static final class C13509k extends kf9 implements ql7 {

        /* renamed from: a */
        public static final C13509k f23828a = new C13509k();

        public C13509k() {
            super(3);
        }

        /* renamed from: a */
        public final void m27225a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            fo3.j0(gwfVar, ao0Var, 0);
            gwfVar.m29592O();
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27225a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$l */
    public static final class C13510l extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ Object f23829a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13510l(xmb xmbVar, Object obj) {
            super(2);
            this.f23829a = obj;
        }

        /* renamed from: a */
        public final void m27226a(un3 un3Var, int i) {
            if ((i & 11) == 2 && un3Var.mo27201c()) {
                un3Var.mo27211m();
            } else {
                if (go3.m29189I()) {
                    go3.m29200T(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2946)");
                }
                throw null;
            }
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m27226a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$m */
    public static final class C13511m extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ Object[] f23830a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13511m(Object[] objArr) {
            super(3);
            this.f23830a = objArr;
        }

        /* renamed from: a */
        public final void m27227a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            int length = this.f23830a.length;
            for (int i = 0; i < length; i++) {
                ao0Var.mo17552f(this.f23830a[i]);
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27227a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$n */
    public static final class C13512n extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ int f23831a;

        /* renamed from: b */
        public final /* synthetic */ int f23832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13512n(int i, int i2) {
            super(3);
            this.f23831a = i;
            this.f23832b = i2;
        }

        /* renamed from: a */
        public final void m27228a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            ao0Var.mo17547a(this.f23831a, this.f23832b);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27228a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$o */
    public static final class C13513o extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ int f23833a;

        /* renamed from: b */
        public final /* synthetic */ int f23834b;

        /* renamed from: c */
        public final /* synthetic */ int f23835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13513o(int i, int i2, int i3) {
            super(3);
            this.f23833a = i;
            this.f23834b = i2;
            this.f23835c = i3;
        }

        /* renamed from: a */
        public final void m27229a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            ao0Var.mo17548b(this.f23833a, this.f23834b, this.f23835c);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27229a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$p */
    public static final class C13514p extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ int f23836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13514p(int i) {
            super(3);
            this.f23836a = i;
        }

        /* renamed from: a */
        public final void m27230a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            gwfVar.m29604z(this.f23836a);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27230a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$q */
    public static final class C13515q extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ int f23837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13515q(int i) {
            super(3);
            this.f23837a = i;
        }

        /* renamed from: a */
        public final void m27231a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            int i = this.f23837a;
            for (int i2 = 0; i2 < i; i2++) {
                ao0Var.mo17554h();
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27231a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$r */
    public static final class C13516r extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ dwf f23838a;

        /* renamed from: b */
        public final /* synthetic */ sc0 f23839b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13516r(dwf dwfVar, sc0 sc0Var) {
            super(3);
            this.f23838a = dwfVar;
            this.f23839b = sc0Var;
        }

        /* renamed from: a */
        public final void m27232a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            gwfVar.m29581D();
            dwf dwfVar = this.f23838a;
            gwfVar.p0(dwfVar, this.f23839b.m48147d(dwfVar), false);
            gwfVar.m29593P();
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27232a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$s */
    public static final class C13517s extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ dwf f23840a;

        /* renamed from: b */
        public final /* synthetic */ sc0 f23841b;

        /* renamed from: c */
        public final /* synthetic */ List f23842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13517s(dwf dwfVar, sc0 sc0Var, List list) {
            super(3);
            this.f23840a = dwfVar;
            this.f23841b = sc0Var;
            this.f23842c = list;
        }

        /* renamed from: a */
        public final void m27233a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "applier");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "rememberManager");
            dwf dwfVar = this.f23840a;
            List list = this.f23842c;
            gwf gwfVarM23902G = dwfVar.m23902G();
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((ql7) list.get(i)).invoke(ao0Var, gwfVarM23902G, xheVar);
                }
                y3i y3iVar = y3i.f54824a;
                gwfVarM23902G.m29584G();
                gwfVar.m29581D();
                dwf dwfVar2 = this.f23840a;
                gwfVar.p0(dwfVar2, this.f23841b.m48147d(dwfVar2), false);
                gwfVar.m29593P();
            } catch (Throwable th) {
                gwfVarM23902G.m29584G();
                throw th;
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27233a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$t */
    public static final class C13518t extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ sc0 f23843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13518t(sc0 sc0Var) {
            super(3);
            this.f23843a = sc0Var;
        }

        /* renamed from: a */
        public final void m27234a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            gwfVar.m29595R(this.f23843a);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27234a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$u */
    public static final class C13519u extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ int f23844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13519u(int i) {
            super(3);
            this.f23844a = i;
        }

        /* renamed from: a */
        public final void m27235a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            gwfVar.q0(this.f23844a);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27235a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$v */
    public static final class C13520v extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ k2e[] f23845a;

        /* renamed from: b */
        public final /* synthetic */ o4d f23846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13520v(k2e[] k2eVarArr, o4d o4dVar) {
            super(2);
            this.f23845a = k2eVarArr;
            this.f23846b = o4dVar;
        }

        /* renamed from: a */
        public final o4d m27236a(un3 un3Var, int i) {
            un3Var.mo27207i(-948105361);
            if (go3.m29189I()) {
                go3.m29200T(-948105361, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1994)");
            }
            o4d o4dVarM37576a = lp3.m37576a(this.f23845a, this.f23846b, un3Var, 8);
            if (go3.m29189I()) {
                go3.m29199S();
            }
            un3Var.mo27214p();
            return o4dVarM37576a;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m27236a((un3) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.fo3$w */
    public static final class C13521w extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ Object f23847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13521w(Object obj) {
            super(3);
            this.f23847a = obj;
        }

        /* renamed from: a */
        public final void m27237a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "<anonymous parameter 2>");
            gwfVar.Y0(this.f23847a);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27237a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$x */
    public static final class C13522x extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ Object f23848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13522x(Object obj) {
            super(3);
            this.f23848a = obj;
        }

        /* renamed from: a */
        public final void m27238a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "<anonymous parameter 1>");
            sq8.m48649h(xheVar, "rememberManager");
            xheVar.mo27310b((yhe) this.f23848a);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27238a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fo3$y */
    public static final class C13523y extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ Object f23849a;

        /* renamed from: b */
        public final /* synthetic */ int f23850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13523y(Object obj, int i) {
            super(3);
            this.f23849a = obj;
            this.f23850b = i;
        }

        /* renamed from: a */
        public final void m27239a(ao0 ao0Var, gwf gwfVar, xhe xheVar) {
            sq8.m48649h(ao0Var, "<anonymous parameter 0>");
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(xheVar, "rememberManager");
            Object obj = this.f23849a;
            if (obj instanceof yhe) {
                xheVar.mo27310b((yhe) obj);
            }
            Object objJ0 = gwfVar.J0(this.f23850b, this.f23849a);
            if (objJ0 instanceof yhe) {
                xheVar.mo27309a((yhe) objJ0);
            } else if (objJ0 instanceof ree) {
                ((ree) objJ0).m46614v();
            }
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m27239a((ao0) obj, (gwf) obj2, (xhe) obj3);
            return y3i.f54824a;
        }
    }

    public fo3(ao0 ao0Var, bp3 bp3Var, dwf dwfVar, Set set, List list, List list2, u64 u64Var) {
        sq8.m48649h(ao0Var, "applier");
        sq8.m48649h(bp3Var, "parentContext");
        sq8.m48649h(dwfVar, "slotTable");
        sq8.m48649h(set, "abandonSet");
        sq8.m48649h(list, "changes");
        sq8.m48649h(list2, "lateChanges");
        sq8.m48649h(u64Var, "composition");
        this.f23782b = ao0Var;
        this.f23783c = bp3Var;
        this.f23784d = dwfVar;
        this.f23785e = set;
        this.f23786f = list;
        this.f23787g = list2;
        this.f23788h = u64Var;
        this.f23789i = new r2g();
        this.f23792l = new pl8();
        this.f23794n = new pl8();
        this.f23800t = new ArrayList();
        this.f23801u = new pl8();
        this.f23802v = p4d.m42969a();
        this.f23803w = new el8(0, 1, null);
        this.f23805y = new pl8();
        this.f23756A = -1;
        this.f23759D = true;
        this.f23760E = new C13499a();
        this.f23761F = new r2g();
        cwf cwfVarM23901F = dwfVar.m23901F();
        cwfVarM23901F.m21918d();
        this.f23764I = cwfVarM23901F;
        dwf dwfVar2 = new dwf();
        this.f23765J = dwfVar2;
        gwf gwfVarM23902G = dwfVar2.m23902G();
        gwfVarM23902G.m29584G();
        this.f23766K = gwfVarM23902G;
        cwf cwfVarM23901F2 = this.f23765J.m23901F();
        try {
            sc0 sc0VarM21915a = cwfVarM23901F2.m21915a(0);
            cwfVarM23901F2.m21918d();
            this.f23770O = sc0VarM21915a;
            this.f23771P = new ArrayList();
            this.f23775T = new r2g();
            this.f23778W = true;
            this.f23779X = new pl8();
            this.f23780Y = new r2g();
            this.f23781Z = -1;
            this.a0 = -1;
            this.b0 = -1;
        } catch (Throwable th) {
            cwfVarM23901F2.m21918d();
            throw th;
        }
    }

    public static /* synthetic */ Object A0(fo3 fo3Var, u64 u64Var, u64 u64Var2, Integer num, List list, uk7 uk7Var, int i, Object obj) {
        u64 u64Var3 = (i & 1) != 0 ? null : u64Var;
        u64 u64Var4 = (i & 2) != 0 ? null : u64Var2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = ch3.m21246k();
        }
        return fo3Var.z0(u64Var3, u64Var4, num2, list, uk7Var);
    }

    public static /* synthetic */ void P0(fo3 fo3Var, boolean z, ql7 ql7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        fo3Var.O0(z, ql7Var);
    }

    public static final int U0(fo3 fo3Var, int i, boolean z, int i2) {
        if (fo3Var.f23764I.m21898B(i)) {
            int iM21939y = fo3Var.f23764I.m21939y(i);
            Object objM21940z = fo3Var.f23764I.m21940z(i);
            if (iM21939y != 206 || !sq8.m48644c(objM21940z, go3.m29187G())) {
                return fo3Var.f23764I.m21906J(i);
            }
            fo3Var.f23764I.m21938x(i, 0);
            return fo3Var.f23764I.m21906J(i);
        }
        if (!fo3Var.f23764I.m21919e(i)) {
            return fo3Var.f23764I.m21906J(i);
        }
        int iM21897A = fo3Var.f23764I.m21897A(i) + i;
        int iM21897A2 = i + 1;
        int iU0 = 0;
        while (iM21897A2 < iM21897A) {
            boolean zM21902F = fo3Var.f23764I.m21902F(iM21897A2);
            if (zM21902F) {
                fo3Var.u0();
                fo3Var.F0(fo3Var.f23764I.m21904H(iM21897A2));
            }
            iU0 += U0(fo3Var, iM21897A2, zM21902F || z, zM21902F ? 0 : i2 + iU0);
            if (zM21902F) {
                fo3Var.u0();
                fo3Var.Q0();
            }
            iM21897A2 += fo3Var.f23764I.m21897A(iM21897A2);
        }
        return iU0;
    }

    public static final int h0(gwf gwfVar) {
        int iM29599V = gwfVar.m29599V();
        int iM29600W = gwfVar.m29600W();
        while (iM29600W >= 0 && !gwfVar.l0(iM29600W)) {
            iM29600W = gwfVar.x0(iM29600W);
        }
        int iD0 = iM29600W + 1;
        int iV0 = 0;
        while (iD0 < iM29599V) {
            if (gwfVar.g0(iM29599V, iD0)) {
                if (gwfVar.l0(iD0)) {
                    iV0 = 0;
                }
                iD0++;
            } else {
                iV0 += gwfVar.l0(iD0) ? 1 : gwfVar.v0(iD0);
                iD0 += gwfVar.d0(iD0);
            }
        }
        return iV0;
    }

    public static final int i0(gwf gwfVar, sc0 sc0Var, ao0 ao0Var) {
        int iM29579B = gwfVar.m29579B(sc0Var);
        go3.m29198R(gwfVar.m29599V() < iM29579B);
        j0(gwfVar, ao0Var, iM29579B);
        int iH0 = h0(gwfVar);
        while (gwfVar.m29599V() < iM29579B) {
            if (gwfVar.f0(iM29579B)) {
                if (gwfVar.k0()) {
                    ao0Var.mo17552f(gwfVar.u0(gwfVar.m29599V()));
                    iH0 = 0;
                }
                gwfVar.S0();
            } else {
                iH0 += gwfVar.M0();
            }
        }
        go3.m29198R(gwfVar.m29599V() == iM29579B);
        return iH0;
    }

    public static final void j0(gwf gwfVar, ao0 ao0Var, int i) {
        while (!gwfVar.h0(i)) {
            gwfVar.N0();
            if (gwfVar.l0(gwfVar.m29600W())) {
                ao0Var.mo17554h();
            }
            gwfVar.m29592O();
        }
    }

    public static /* synthetic */ void w0(fo3 fo3Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        fo3Var.v0(z);
    }

    public final void B0() {
        boolean z = this.f23762G;
        this.f23762G = true;
        int iM21932r = this.f23764I.m21932r();
        int iM21897A = this.f23764I.m21897A(iM21932r) + iM21932r;
        int i = this.f23791k;
        int iB0 = b0();
        int i2 = this.f23793m;
        kv8 kv8VarM29226z = go3.m29226z(this.f23800t, this.f23764I.m21924j(), iM21897A);
        boolean z2 = false;
        int i3 = iM21932r;
        while (kv8VarM29226z != null) {
            int iM36254b = kv8VarM29226z.m36254b();
            go3.m29196P(this.f23800t, iM36254b);
            if (kv8VarM29226z.m36256d()) {
                this.f23764I.m21909M(iM36254b);
                int iM21924j = this.f23764I.m21924j();
                R0(i3, iM21924j, iM21932r);
                this.f23791k = q0(iM36254b, iM21924j, iM21932r, i);
                this.f23773R = m27182J(this.f23764I.m21908L(iM21924j), iM21932r, iB0);
                this.f23768M = null;
                kv8VarM29226z.m36255c().m46600h(this);
                this.f23768M = null;
                this.f23764I.m21910N(iM21932r);
                i3 = iM21924j;
                z2 = true;
            } else {
                this.f23761F.m46077h(kv8VarM29226z.m36255c());
                kv8VarM29226z.m36255c().m46615w();
                this.f23761F.m46076g();
            }
            kv8VarM29226z = go3.m29226z(this.f23800t, this.f23764I.m21924j(), iM21897A);
        }
        if (z2) {
            R0(i3, iM21932r, iM21932r);
            this.f23764I.m21912P();
            int iN1 = n1(iM21932r);
            this.f23791k = i + iN1;
            this.f23793m = i2 + iN1;
        } else {
            X0();
        }
        this.f23773R = iB0;
        this.f23762G = z;
    }

    public final void C0(ql7 ql7Var) {
        this.f23786f.add(ql7Var);
    }

    public final void D0(ql7 ql7Var) {
        x0();
        s0();
        C0(ql7Var);
    }

    /* renamed from: E */
    public final void m27177E() {
        ree reeVar;
        if (e0()) {
            u64 u64VarA0 = a0();
            sq8.m48647f(u64VarA0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            ree reeVar2 = new ree((fp3) u64VarA0);
            this.f23761F.m46077h(reeVar2);
            m1(reeVar2);
            reeVar2.m46598E(this.f23758C);
            return;
        }
        kv8 kv8VarM29196P = go3.m29196P(this.f23800t, this.f23764I.m21932r());
        Object objM21903G = this.f23764I.m21903G();
        if (sq8.m48644c(objM21903G, un3.f49155a.m51802a())) {
            u64 u64VarA02 = a0();
            sq8.m48647f(u64VarA02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            reeVar = new ree((fp3) u64VarA02);
            m1(reeVar);
        } else {
            sq8.m48647f(objM21903G, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            reeVar = (ree) objM21903G;
        }
        reeVar.m46594A(kv8VarM29196P != null);
        this.f23761F.m46077h(reeVar);
        reeVar.m46598E(this.f23758C);
    }

    public final void E0() {
        T0(this.f23764I.m21924j());
        N0(go3.f25588a);
        this.f23776U += this.f23764I.m21929o();
    }

    /* renamed from: F */
    public final void m27178F() {
        m27183K();
        this.f23803w.m25205a();
    }

    public final void F0(Object obj) {
        this.f23775T.m46077h(obj);
    }

    /* renamed from: G */
    public final void m27179G() {
        this.f23790j = null;
        this.f23791k = 0;
        this.f23793m = 0;
        this.f23776U = 0;
        this.f23773R = 0;
        this.f23799s = false;
        this.f23777V = false;
        this.f23779X.m43828a();
        this.f23761F.m46070a();
        m27180H();
    }

    public final void G0() {
        int iM21932r = this.f23764I.m21932r();
        if (!(this.f23779X.m43834g(-1) <= iM21932r)) {
            go3.m29222v("Missed recording an endGroup".toString());
            throw new qe9();
        }
        if (this.f23779X.m43834g(-1) == iM21932r) {
            this.f23779X.m43835h();
            P0(this, false, go3.f25590c, 1, null);
        }
    }

    /* renamed from: H */
    public final void m27180H() {
        this.f23795o = null;
        this.f23796p = null;
    }

    public final void H0() {
        if (this.f23777V) {
            P0(this, false, go3.f25590c, 1, null);
            this.f23777V = false;
        }
    }

    /* renamed from: I */
    public final void m27181I(kb8 kb8Var, nl7 nl7Var) {
        sq8.m48649h(kb8Var, "invalidationsRequested");
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        if (this.f23786f.isEmpty()) {
            m27187O(kb8Var, nl7Var);
        } else {
            go3.m29222v("Expected applyChanges() to have been called".toString());
            throw new qe9();
        }
    }

    public final void I0(sc0 sc0Var) {
        if (this.f23771P.isEmpty()) {
            N0(new C13516r(this.f23765J, sc0Var));
            return;
        }
        List listT0 = kh3.T0(this.f23771P);
        this.f23771P.clear();
        x0();
        s0();
        N0(new C13517s(this.f23765J, sc0Var, listT0));
    }

    /* renamed from: J */
    public final int m27182J(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int iF0 = f0(this.f23764I, i);
        return iF0 == 126665345 ? iF0 : Integer.rotateLeft(m27182J(this.f23764I.m21908L(i), i2, i3), 3) ^ iF0;
    }

    public final void J0(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.c0;
            if (i4 > 0 && this.a0 == i - i4 && this.b0 == i2 - i4) {
                this.c0 = i4 + i3;
                return;
            }
            u0();
            this.a0 = i;
            this.b0 = i2;
            this.c0 = i3;
        }
    }

    /* renamed from: K */
    public final void m27183K() {
        go3.m29198R(this.f23766K.m29598U());
        dwf dwfVar = new dwf();
        this.f23765J = dwfVar;
        gwf gwfVarM23902G = dwfVar.m23902G();
        gwfVarM23902G.m29584G();
        this.f23766K = gwfVarM23902G;
    }

    public final void K0(int i) {
        this.f23776U = i - (this.f23764I.m21924j() - this.f23776U);
    }

    /* renamed from: L */
    public final o4d m27184L() {
        o4d o4dVar = this.f23768M;
        return o4dVar != null ? o4dVar : m27185M(this.f23764I.m21932r());
    }

    public final void L0(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                go3.m29222v(("Invalid remove index " + i).toString());
                throw new qe9();
            }
            if (this.f23781Z == i) {
                this.c0 += i2;
                return;
            }
            u0();
            this.f23781Z = i;
            this.c0 = i2;
        }
    }

    /* renamed from: M */
    public final o4d m27185M(int i) {
        if (e0() && this.f23767L) {
            int iM29600W = this.f23766K.m29600W();
            while (iM29600W > 0) {
                if (this.f23766K.b0(iM29600W) == 202 && sq8.m48644c(this.f23766K.c0(iM29600W), go3.m29181A())) {
                    Object objM29603Z = this.f23766K.m29603Z(iM29600W);
                    sq8.m48647f(objM29603Z, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    o4d o4dVar = (o4d) objM29603Z;
                    this.f23768M = o4dVar;
                    return o4dVar;
                }
                iM29600W = this.f23766K.x0(iM29600W);
            }
        }
        if (this.f23764I.m21934t() > 0) {
            while (i > 0) {
                if (this.f23764I.m21939y(i) == 202 && sq8.m48644c(this.f23764I.m21940z(i), go3.m29181A())) {
                    o4d o4dVar2 = (o4d) this.f23803w.m25206b(i);
                    if (o4dVar2 == null) {
                        Object objM21936v = this.f23764I.m21936v(i);
                        sq8.m48647f(objM21936v, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        o4dVar2 = (o4d) objM21936v;
                    }
                    this.f23768M = o4dVar2;
                    return o4dVar2;
                }
                i = this.f23764I.m21908L(i);
            }
        }
        o4d o4dVar3 = this.f23802v;
        this.f23768M = o4dVar3;
        return o4dVar3;
    }

    public final void M0() {
        cwf cwfVar;
        int iM21932r;
        if (this.f23764I.m21934t() <= 0 || this.f23779X.m43834g(-2) == (iM21932r = (cwfVar = this.f23764I).m21932r())) {
            return;
        }
        if (!this.f23777V && this.f23778W) {
            P0(this, false, go3.f25591d, 1, null);
            this.f23777V = true;
        }
        if (iM21932r > 0) {
            sc0 sc0VarM21915a = cwfVar.m21915a(iM21932r);
            this.f23779X.m43836i(iM21932r);
            P0(this, false, new C13518t(sc0VarM21915a), 1, null);
        }
    }

    /* renamed from: N */
    public final void m27186N() {
        wsh wshVar = wsh.f52622a;
        Object objM54953a = wshVar.m54953a("Compose:Composer.dispose");
        try {
            this.f23783c.m19514m(this);
            this.f23761F.m46070a();
            this.f23800t.clear();
            this.f23786f.clear();
            this.f23803w.m25205a();
            m27197Y().clear();
            this.f23763H = true;
            y3i y3iVar = y3i.f54824a;
            wshVar.m54954b(objM54953a);
        } catch (Throwable th) {
            wsh.f52622a.m54954b(objM54953a);
            throw th;
        }
    }

    public final void N0(ql7 ql7Var) {
        w0(this, false, 1, null);
        M0();
        C0(ql7Var);
    }

    /* renamed from: O */
    public final void m27187O(kb8 kb8Var, nl7 nl7Var) {
        if (!(!this.f23762G)) {
            go3.m29222v("Reentrant composition is not supported".toString());
            throw new qe9();
        }
        Object objM54953a = wsh.f52622a.m54953a("Compose:recompose");
        try {
            this.f23758C = exf.m25774F().mo39744f();
            this.f23803w.m25205a();
            int iM35355h = kb8Var.m35355h();
            for (int i = 0; i < iM35355h; i++) {
                Object obj = kb8Var.m35354g()[i];
                sq8.m48647f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                lb8 lb8Var = (lb8) kb8Var.m35356i()[i];
                ree reeVar = (ree) obj;
                sc0 sc0VarM46602j = reeVar.m46602j();
                if (sc0VarM46602j == null) {
                    return;
                }
                this.f23800t.add(new kv8(reeVar, sc0VarM46602j.m48144a(), lb8Var));
            }
            List list = this.f23800t;
            if (list.size() > 1) {
                gh3.m28657z(list, new C13500b());
            }
            this.f23791k = 0;
            this.f23762G = true;
            try {
                d1();
                Object objO0 = o0();
                if (objO0 != nl7Var && nl7Var != null) {
                    m1(nl7Var);
                }
                C13499a c13499a = this.f23760E;
                fqb fqbVarM45950a = qxf.m45950a();
                try {
                    fqbVarM45950a.m27344c(c13499a);
                    if (nl7Var != null) {
                        a1(200, go3.m29182B());
                        ov.m42711b(this, nl7Var);
                        m27190R();
                    } else if (!(this.f23798r || this.f23804x) || objO0 == null || sq8.m48644c(objO0, un3.f49155a.m51802a())) {
                        V0();
                    } else {
                        a1(200, go3.m29182B());
                        ov.m42711b(this, (nl7) azh.m18052e(objO0, 2));
                        m27190R();
                    }
                    fqbVarM45950a.m27361v(fqbVarM45950a.m27354o() - 1);
                    m27192T();
                    this.f23762G = false;
                    this.f23800t.clear();
                    y3i y3iVar = y3i.f54824a;
                } catch (Throwable th) {
                    fqbVarM45950a.m27361v(fqbVarM45950a.m27354o() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f23762G = false;
                this.f23800t.clear();
                m27216r();
                throw th2;
            }
        } finally {
            wsh.f52622a.m54954b(objM54953a);
        }
    }

    public final void O0(boolean z, ql7 ql7Var) {
        v0(z);
        C0(ql7Var);
    }

    /* renamed from: P */
    public final void m27188P(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m27188P(this.f23764I.m21908L(i), i2);
        if (this.f23764I.m21902F(i)) {
            F0(p0(this.f23764I, i));
        }
    }

    /* renamed from: Q */
    public final void m27189Q(boolean z) {
        List list;
        if (e0()) {
            int iM29600W = this.f23766K.m29600W();
            h1(this.f23766K.b0(iM29600W), this.f23766K.c0(iM29600W), this.f23766K.m29603Z(iM29600W));
        } else {
            int iM21932r = this.f23764I.m21932r();
            h1(this.f23764I.m21939y(iM21932r), this.f23764I.m21940z(iM21932r), this.f23764I.m21936v(iM21932r));
        }
        int i = this.f23793m;
        c3d c3dVar = this.f23790j;
        int i2 = 0;
        if (c3dVar != null && c3dVar.m20170b().size() > 0) {
            List listM20170b = c3dVar.m20170b();
            List listM20174f = c3dVar.m20174f();
            Set setM42200e = ofa.m42200e(listM20174f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listM20174f.size();
            int size2 = listM20170b.size();
            int i3 = 0;
            int i4 = 0;
            int iM20183o = 0;
            while (i3 < size2) {
                tc9 tc9Var = (tc9) listM20170b.get(i3);
                if (setM42200e.contains(tc9Var)) {
                    if (!linkedHashSet.contains(tc9Var)) {
                        if (i4 < size) {
                            tc9 tc9Var2 = (tc9) listM20174f.get(i4);
                            if (tc9Var2 != tc9Var) {
                                int iM20175g = c3dVar.m20175g(tc9Var2);
                                linkedHashSet.add(tc9Var2);
                                if (iM20175g != iM20183o) {
                                    int iM20183o2 = c3dVar.m20183o(tc9Var2);
                                    list = listM20174f;
                                    J0(c3dVar.m20173e() + iM20175g, iM20183o + c3dVar.m20173e(), iM20183o2);
                                    c3dVar.m20178j(iM20175g, iM20183o, iM20183o2);
                                } else {
                                    list = listM20174f;
                                }
                            } else {
                                list = listM20174f;
                                i3++;
                            }
                            i4++;
                            iM20183o += c3dVar.m20183o(tc9Var2);
                            listM20174f = list;
                        }
                    }
                    i2 = 0;
                } else {
                    L0(c3dVar.m20175g(tc9Var) + c3dVar.m20173e(), tc9Var.m49708c());
                    c3dVar.m20182n(tc9Var.m49707b(), i2);
                    K0(tc9Var.m49707b());
                    this.f23764I.m21909M(tc9Var.m49707b());
                    E0();
                    this.f23764I.m21911O();
                    go3.m29197Q(this.f23800t, tc9Var.m49707b(), tc9Var.m49707b() + this.f23764I.m21897A(tc9Var.m49707b()));
                }
                i3++;
                i2 = 0;
            }
            u0();
            if (listM20170b.size() > 0) {
                K0(this.f23764I.m21926l());
                this.f23764I.m21912P();
            }
        }
        int i5 = this.f23791k;
        while (!this.f23764I.m21900D()) {
            int iM21924j = this.f23764I.m21924j();
            E0();
            L0(i5, this.f23764I.m21911O());
            go3.m29197Q(this.f23800t, iM21924j, this.f23764I.m21924j());
        }
        boolean zE0 = e0();
        if (zE0) {
            if (z) {
                S0();
                i = 1;
            }
            this.f23764I.m21920f();
            int iM29600W2 = this.f23766K.m29600W();
            this.f23766K.m29592O();
            if (!this.f23764I.m21931q()) {
                int iL0 = l0(iM29600W2);
                this.f23766K.m29593P();
                this.f23766K.m29584G();
                I0(this.f23770O);
                this.f23772Q = false;
                if (!this.f23784d.isEmpty()) {
                    j1(iL0, 0);
                    k1(iL0, i);
                }
            }
        } else {
            if (z) {
                Q0();
            }
            G0();
            int iM21932r2 = this.f23764I.m21932r();
            if (i != n1(iM21932r2)) {
                k1(iM21932r2, i);
            }
            if (z) {
                i = 1;
            }
            this.f23764I.m21921g();
            u0();
        }
        m27195W(i, zE0);
    }

    public final void Q0() {
        if (this.f23775T.m46073d()) {
            this.f23775T.m46076g();
        } else {
            this.f23774S++;
        }
    }

    /* renamed from: R */
    public final void m27190R() {
        m27189Q(false);
    }

    public final void R0(int i, int i2, int i3) {
        cwf cwfVar = this.f23764I;
        int iM29191K = go3.m29191K(cwfVar, i, i2, i3);
        while (i > 0 && i != iM29191K) {
            if (cwfVar.m21902F(i)) {
                Q0();
            }
            i = cwfVar.m21908L(i);
        }
        m27188P(i2, iM29191K);
    }

    /* renamed from: S */
    public void m27191S() {
        m27190R();
    }

    public final void S0() {
        this.f23771P.add(this.f23780Y.m46076g());
    }

    /* renamed from: T */
    public final void m27192T() {
        m27190R();
        this.f23783c.m19503b();
        m27190R();
        H0();
        m27196X();
        this.f23764I.m21918d();
        this.f23798r = false;
    }

    public final void T0(int i) {
        U0(this, i, false, 0);
        u0();
    }

    /* renamed from: U */
    public final void m27193U() {
        if (this.f23766K.m29598U()) {
            gwf gwfVarM23902G = this.f23765J.m23902G();
            this.f23766K = gwfVarM23902G;
            gwfVarM23902G.N0();
            this.f23767L = false;
            this.f23768M = null;
        }
    }

    /* renamed from: V */
    public final void m27194V(boolean z, c3d c3dVar) {
        this.f23789i.m46077h(this.f23790j);
        this.f23790j = c3dVar;
        this.f23792l.m43836i(this.f23791k);
        if (z) {
            this.f23791k = 0;
        }
        this.f23794n.m43836i(this.f23793m);
        this.f23793m = 0;
    }

    public void V0() {
        if (this.f23800t.isEmpty()) {
            W0();
            return;
        }
        cwf cwfVar = this.f23764I;
        int iM21927m = cwfVar.m21927m();
        Object objM21928n = cwfVar.m21928n();
        Object objM21925k = cwfVar.m21925k();
        f1(iM21927m, objM21928n, objM21925k);
        c1(cwfVar.m21901E(), null);
        B0();
        cwfVar.m21921g();
        h1(iM21927m, objM21928n, objM21925k);
    }

    /* renamed from: W */
    public final void m27195W(int i, boolean z) {
        c3d c3dVar = (c3d) this.f23789i.m46076g();
        if (c3dVar != null && !z) {
            c3dVar.m20180l(c3dVar.m20169a() + 1);
        }
        this.f23790j = c3dVar;
        this.f23791k = this.f23792l.m43835h() + i;
        this.f23793m = this.f23794n.m43835h() + i;
    }

    public final void W0() {
        this.f23793m += this.f23764I.m21911O();
    }

    /* renamed from: X */
    public final void m27196X() {
        x0();
        if (!this.f23789i.m46072c()) {
            go3.m29222v("Start/end imbalance".toString());
            throw new qe9();
        }
        if (this.f23779X.m43831d()) {
            m27179G();
        } else {
            go3.m29222v("Missed recording an endGroup()".toString());
            throw new qe9();
        }
    }

    public final void X0() {
        this.f23793m = this.f23764I.m21933s();
        this.f23764I.m21912P();
    }

    /* renamed from: Y */
    public ao0 m27197Y() {
        return this.f23782b;
    }

    public final void Y0(int i, Object obj, int i2, Object obj2) {
        Object objM51802a = obj;
        o1();
        f1(i, obj, obj2);
        lv7.C15158a c15158a = lv7.f34416a;
        boolean z = i2 != c15158a.m37983a();
        c3d c3dVar = null;
        if (e0()) {
            this.f23764I.m21917c();
            int iM29599V = this.f23766K.m29599V();
            if (z) {
                this.f23766K.V0(i, un3.f49155a.m51802a());
            } else if (obj2 != null) {
                gwf gwfVar = this.f23766K;
                if (objM51802a == null) {
                    objM51802a = un3.f49155a.m51802a();
                }
                gwfVar.R0(i, objM51802a, obj2);
            } else {
                gwf gwfVar2 = this.f23766K;
                if (objM51802a == null) {
                    objM51802a = un3.f49155a.m51802a();
                }
                gwfVar2.T0(i, objM51802a);
            }
            c3d c3dVar2 = this.f23790j;
            if (c3dVar2 != null) {
                tc9 tc9Var = new tc9(i, -1, l0(iM29599V), -1, 0);
                c3dVar2.m20177i(tc9Var, this.f23791k - c3dVar2.m20173e());
                c3dVar2.m20176h(tc9Var);
            }
            m27194V(z, null);
            return;
        }
        boolean z2 = !(i2 != c15158a.m37984b()) && this.f23806z;
        if (this.f23790j == null) {
            int iM21927m = this.f23764I.m21927m();
            if (!z2 && iM21927m == i && sq8.m48644c(obj, this.f23764I.m21928n())) {
                c1(z, obj2);
            } else {
                this.f23790j = new c3d(this.f23764I.m21922h(), this.f23791k);
            }
        }
        c3d c3dVar3 = this.f23790j;
        if (c3dVar3 != null) {
            tc9 tc9VarM20172d = c3dVar3.m20172d(i, obj);
            if (z2 || tc9VarM20172d == null) {
                this.f23764I.m21917c();
                this.f23772Q = true;
                this.f23768M = null;
                m27193U();
                this.f23766K.m29581D();
                int iM29599V2 = this.f23766K.m29599V();
                if (z) {
                    this.f23766K.V0(i, un3.f49155a.m51802a());
                } else if (obj2 != null) {
                    gwf gwfVar3 = this.f23766K;
                    if (objM51802a == null) {
                        objM51802a = un3.f49155a.m51802a();
                    }
                    gwfVar3.R0(i, objM51802a, obj2);
                } else {
                    gwf gwfVar4 = this.f23766K;
                    if (objM51802a == null) {
                        objM51802a = un3.f49155a.m51802a();
                    }
                    gwfVar4.T0(i, objM51802a);
                }
                this.f23770O = this.f23766K.m29578A(iM29599V2);
                tc9 tc9Var2 = new tc9(i, -1, l0(iM29599V2), -1, 0);
                c3dVar3.m20177i(tc9Var2, this.f23791k - c3dVar3.m20173e());
                c3dVar3.m20176h(tc9Var2);
                c3dVar = new c3d(new ArrayList(), z ? 0 : this.f23791k);
            } else {
                c3dVar3.m20176h(tc9VarM20172d);
                int iM49707b = tc9VarM20172d.m49707b();
                this.f23791k = c3dVar3.m20175g(tc9VarM20172d) + c3dVar3.m20173e();
                int iM20181m = c3dVar3.m20181m(tc9VarM20172d);
                int iM20169a = iM20181m - c3dVar3.m20169a();
                c3dVar3.m20179k(iM20181m, c3dVar3.m20169a());
                K0(iM49707b);
                this.f23764I.m21909M(iM49707b);
                if (iM20169a > 0) {
                    N0(new C13519u(iM20169a));
                }
                c1(z, obj2);
            }
        }
        m27194V(z, c3dVar);
    }

    /* renamed from: Z */
    public final boolean m27198Z() {
        return this.f23757B > 0;
    }

    public final void Z0(int i) {
        Y0(i, null, lv7.f34416a.m37983a(), null);
    }

    @Override // p001o.un3
    /* renamed from: a */
    public void mo27199a(qee qeeVar) {
        sq8.m48649h(qeeVar, "scope");
        ree reeVar = qeeVar instanceof ree ? (ree) qeeVar : null;
        if (reeVar == null) {
            return;
        }
        reeVar.m46597D(true);
    }

    public u64 a0() {
        return this.f23788h;
    }

    public final void a1(int i, Object obj) {
        Y0(i, obj, lv7.f34416a.m37983a(), null);
    }

    @Override // p001o.un3
    /* renamed from: b */
    public un3 mo27200b(int i) {
        Y0(i, null, lv7.f34416a.m37983a(), null);
        m27177E();
        return this;
    }

    public int b0() {
        return this.f23773R;
    }

    public void b1(int i, Object obj) {
        Y0(i, obj, lv7.f34416a.m37983a(), null);
    }

    @Override // p001o.un3
    /* renamed from: c */
    public boolean mo27201c() {
        if (e0() || this.f23806z || this.f23804x) {
            return false;
        }
        ree reeVarC0 = c0();
        return (reeVarC0 != null && !reeVarC0.m46605m()) && !this.f23798r;
    }

    public final ree c0() {
        r2g r2gVar = this.f23761F;
        if (this.f23757B == 0 && r2gVar.m46073d()) {
            return (ree) r2gVar.m46074e();
        }
        return null;
    }

    public final void c1(boolean z, Object obj) {
        if (z) {
            this.f23764I.m21914R();
            return;
        }
        if (obj != null && this.f23764I.m21925k() != obj) {
            P0(this, false, new C13521w(obj), 1, null);
        }
        this.f23764I.m21913Q();
    }

    @Override // p001o.un3
    /* renamed from: d */
    public g6f mo27202d() {
        sc0 sc0VarM21915a;
        xk7 xk7VarM46601i;
        ree reeVar = null;
        ree reeVar2 = this.f23761F.m46073d() ? (ree) this.f23761F.m46076g() : null;
        if (reeVar2 != null) {
            reeVar2.m46594A(false);
        }
        if (reeVar2 != null && (xk7VarM46601i = reeVar2.m46601i(this.f23758C)) != null) {
            C0(new C13501c(xk7VarM46601i, this));
        }
        if (reeVar2 != null && !reeVar2.m46607o() && (reeVar2.m46608p() || this.f23797q)) {
            if (reeVar2.m46602j() == null) {
                if (e0()) {
                    gwf gwfVar = this.f23766K;
                    sc0VarM21915a = gwfVar.m29578A(gwfVar.m29600W());
                } else {
                    cwf cwfVar = this.f23764I;
                    sc0VarM21915a = cwfVar.m21915a(cwfVar.m21932r());
                }
                reeVar2.m46617y(sc0VarM21915a);
            }
            reeVar2.m46618z(false);
            reeVar = reeVar2;
        }
        m27189Q(false);
        return reeVar;
    }

    public final List d0() {
        return this.f23769N;
    }

    public final void d1() {
        this.f23764I = this.f23784d.m23901F();
        Z0(100);
        this.f23783c.m19513l();
        this.f23802v = this.f23783c.m19505d();
        this.f23805y.m43836i(go3.m29219s(this.f23804x));
        this.f23804x = mo27215q(this.f23802v);
        this.f23768M = null;
        if (!this.f23797q) {
            this.f23797q = this.f23783c.mo19504c();
        }
        Set set = (Set) lp3.m37579d(this.f23802v, vj8.m52890a());
        if (set != null) {
            set.add(this.f23784d);
            this.f23783c.mo19511j(set);
        }
        Z0(this.f23783c.mo19506e());
    }

    @Override // p001o.un3
    /* renamed from: e */
    public q74 mo27203e() {
        return this.f23783c.mo19507f();
    }

    public boolean e0() {
        return this.f23772Q;
    }

    public final boolean e1(ree reeVar, Object obj) {
        sq8.m48649h(reeVar, "scope");
        sc0 sc0VarM46602j = reeVar.m46602j();
        if (sc0VarM46602j == null) {
            return false;
        }
        int iM48147d = sc0VarM46602j.m48147d(this.f23764I.m21935u());
        if (!this.f23762G || iM48147d < this.f23764I.m21924j()) {
            return false;
        }
        go3.m29188H(this.f23800t, iM48147d, reeVar, obj);
        return true;
    }

    @Override // p001o.un3
    /* renamed from: f */
    public void mo27204f(Object obj) {
        m1(obj);
    }

    public final int f0(cwf cwfVar, int i) {
        Object objM21936v;
        if (cwfVar.m21899C(i)) {
            Object objM21940z = cwfVar.m21940z(i);
            if (objM21940z != null) {
                return objM21940z instanceof Enum ? ((Enum) objM21940z).ordinal() : objM21940z.hashCode();
            }
            return 0;
        }
        int iM21939y = cwfVar.m21939y(i);
        if (iM21939y == 207 && (objM21936v = cwfVar.m21936v(i)) != null && !sq8.m48644c(objM21936v, un3.f49155a.m51802a())) {
            iM21939y = objM21936v.hashCode();
        }
        return iM21939y;
    }

    public final void f1(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                g1(((Enum) obj).ordinal());
                return;
            } else {
                g1(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i != 207 || sq8.m48644c(obj2, un3.f49155a.m51802a())) {
            g1(i);
        } else {
            g1(obj2.hashCode());
        }
    }

    @Override // p001o.un3
    /* renamed from: g */
    public void mo27205g() {
        this.f23797q = true;
    }

    public final void g0(List list) {
        dwf dwfVarM59622g;
        sc0 sc0VarM59616a;
        cwf cwfVarM23901F;
        List list2;
        dwf dwfVarM58000a;
        List list3 = this.f23787g;
        List list4 = this.f23786f;
        try {
            this.f23786f = list3;
            C0(go3.f25592e);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                hwc hwcVar = (hwc) list.get(i2);
                zmb zmbVar = (zmb) hwcVar.m31227a();
                zmb zmbVar2 = (zmb) hwcVar.m31228b();
                sc0 sc0VarM59616a2 = zmbVar.m59616a();
                int iM23906e = zmbVar.m59622g().m23906e(sc0VarM59616a2);
                ege egeVar = new ege();
                x0();
                C0(new C13502d(egeVar, sc0VarM59616a2));
                if (zmbVar2 == null) {
                    if (sq8.m48644c(zmbVar.m59622g(), this.f23765J)) {
                        m27183K();
                    }
                    cwfVarM23901F = zmbVar.m59622g().m23901F();
                    try {
                        cwfVarM23901F.m21909M(iM23906e);
                        this.f23776U = iM23906e;
                        ArrayList arrayList = new ArrayList();
                        A0(this, null, null, null, null, new C13503e(arrayList, cwfVarM23901F, zmbVar), 15, null);
                        if (!arrayList.isEmpty()) {
                            C0(new C13504f(egeVar, arrayList));
                        }
                        y3i y3iVar = y3i.f54824a;
                        cwfVarM23901F.m21918d();
                    } finally {
                    }
                } else {
                    ymb ymbVarMo19510i = this.f23783c.mo19510i(zmbVar2);
                    if (ymbVarMo19510i == null || (dwfVarM59622g = ymbVarMo19510i.m58000a()) == null) {
                        dwfVarM59622g = zmbVar2.m59622g();
                    }
                    if (ymbVarMo19510i == null || (dwfVarM58000a = ymbVarMo19510i.m58000a()) == null || (sc0VarM59616a = dwfVarM58000a.m23905d(i)) == null) {
                        sc0VarM59616a = zmbVar2.m59616a();
                    }
                    List listM29220t = go3.m29220t(dwfVarM59622g, sc0VarM59616a);
                    if (!listM29220t.isEmpty()) {
                        C0(new C13505g(egeVar, listM29220t));
                        if (sq8.m48644c(zmbVar.m59622g(), this.f23784d)) {
                            int iM23906e2 = this.f23784d.m23906e(sc0VarM59616a2);
                            j1(iM23906e2, n1(iM23906e2) + listM29220t.size());
                        }
                    }
                    C0(new C13506h(ymbVarMo19510i, this, zmbVar2, zmbVar));
                    cwfVarM23901F = dwfVarM59622g.m23901F();
                    try {
                        cwf cwfVar = this.f23764I;
                        int[] iArr = this.f23795o;
                        this.f23795o = null;
                        try {
                            this.f23764I = cwfVarM23901F;
                            int iM23906e3 = dwfVarM59622g.m23906e(sc0VarM59616a);
                            cwfVarM23901F.m21909M(iM23906e3);
                            this.f23776U = iM23906e3;
                            ArrayList arrayList2 = new ArrayList();
                            List list5 = this.f23786f;
                            try {
                                this.f23786f = arrayList2;
                                list2 = list5;
                                try {
                                    z0(zmbVar2.m59617b(), zmbVar.m59617b(), Integer.valueOf(cwfVarM23901F.m21924j()), zmbVar2.m59619d(), new C13507i(zmbVar));
                                    y3i y3iVar2 = y3i.f54824a;
                                    this.f23786f = list2;
                                    if (!arrayList2.isEmpty()) {
                                        C0(new C13508j(egeVar, arrayList2));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    this.f23786f = list2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list2 = list5;
                            }
                        } finally {
                            this.f23764I = cwfVar;
                            this.f23795o = iArr;
                        }
                    } finally {
                    }
                }
                C0(go3.f25589b);
                i2++;
                i = 0;
            }
            C0(C13509k.f23828a);
            this.f23776U = 0;
            y3i y3iVar3 = y3i.f54824a;
        } finally {
            this.f23786f = list4;
        }
    }

    public final void g1(int i) {
        this.f23773R = i ^ Integer.rotateLeft(b0(), 3);
    }

    @Override // p001o.un3
    /* renamed from: h */
    public qee mo27206h() {
        return c0();
    }

    public final void h1(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                i1(((Enum) obj).ordinal());
                return;
            } else {
                i1(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i != 207 || sq8.m48644c(obj2, un3.f49155a.m51802a())) {
            i1(i);
        } else {
            i1(obj2.hashCode());
        }
    }

    @Override // p001o.un3
    /* renamed from: i */
    public void mo27207i(int i) {
        Y0(i, null, lv7.f34416a.m37983a(), null);
    }

    public final void i1(int i) {
        this.f23773R = Integer.rotateRight(Integer.hashCode(i) ^ b0(), 3);
    }

    @Override // p001o.un3
    /* renamed from: j */
    public Object mo27208j() {
        return o0();
    }

    public final void j1(int i, int i2) {
        if (n1(i) != i2) {
            if (i < 0) {
                HashMap map = this.f23796p;
                if (map == null) {
                    map = new HashMap();
                    this.f23796p = map;
                }
                map.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.f23795o;
            if (iArr == null) {
                iArr = new int[this.f23764I.m21934t()];
                fp0.m27271t(iArr, -1, 0, 0, 6, null);
                this.f23795o = iArr;
            }
            iArr[i] = i2;
        }
    }

    @Override // p001o.un3
    /* renamed from: k */
    public dp3 mo27209k() {
        return this.f23784d;
    }

    public void k0(List list) {
        sq8.m48649h(list, "references");
        try {
            g0(list);
            m27179G();
        } catch (Throwable th) {
            m27216r();
            throw th;
        }
    }

    public final void k1(int i, int i2) {
        int iN1 = n1(i);
        if (iN1 != i2) {
            int i3 = i2 - iN1;
            int iM46071b = this.f23789i.m46071b() - 1;
            while (i != -1) {
                int iN12 = n1(i) + i3;
                j1(i, iN12);
                int i4 = iM46071b;
                while (true) {
                    if (-1 < i4) {
                        c3d c3dVar = (c3d) this.f23789i.m46075f(i4);
                        if (c3dVar != null && c3dVar.m20182n(i, iN12)) {
                            iM46071b = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f23764I.m21932r();
                } else if (this.f23764I.m21902F(i)) {
                    return;
                } else {
                    i = this.f23764I.m21908L(i);
                }
            }
        }
    }

    @Override // p001o.un3
    /* renamed from: l */
    public boolean mo27210l(Object obj) {
        if (o0() == obj) {
            return false;
        }
        m1(obj);
        return true;
    }

    public final int l0(int i) {
        return (-2) - i;
    }

    public final o4d l1(o4d o4dVar, o4d o4dVar2) {
        o4d.InterfaceC15711a interfaceC15711aMo40065o = o4dVar.mo40065o();
        interfaceC15711aMo40065o.putAll(o4dVar2);
        o4d o4dVarBuild = interfaceC15711aMo40065o.build();
        a1(204, go3.m29185E());
        mo27215q(o4dVarBuild);
        mo27215q(o4dVar2);
        m27190R();
        return o4dVarBuild;
    }

    @Override // p001o.un3
    /* renamed from: m */
    public void mo27211m() {
        if (!(this.f23793m == 0)) {
            go3.m29222v("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new qe9();
        }
        ree reeVarC0 = c0();
        if (reeVarC0 != null) {
            reeVarC0.m46616x();
        }
        if (this.f23800t.isEmpty()) {
            X0();
        } else {
            B0();
        }
    }

    public final void m0(xmb xmbVar, o4d o4dVar, Object obj, boolean z) {
        b1(126665345, xmbVar);
        mo27215q(obj);
        int iB0 = b0();
        try {
            this.f23773R = 126665345;
            boolean z2 = false;
            if (e0()) {
                gwf.n0(this.f23766K, 0, 1, null);
            }
            if (!e0() && !sq8.m48644c(this.f23764I.m21925k(), o4dVar)) {
                z2 = true;
            }
            if (z2) {
                this.f23803w.m25207c(this.f23764I.m21924j(), o4dVar);
            }
            Y0(202, go3.m29181A(), lv7.f34416a.m37983a(), o4dVar);
            if (!e0() || z) {
                boolean z3 = this.f23804x;
                this.f23804x = z2;
                ov.m42711b(this, pn3.m43904c(316014703, true, new C13510l(xmbVar, obj)));
                this.f23804x = z3;
            } else {
                this.f23767L = true;
                this.f23768M = null;
                gwf gwfVar = this.f23766K;
                this.f23783c.mo19508g(new zmb(xmbVar, obj, a0(), this.f23765J, gwfVar.m29578A(gwfVar.x0(gwfVar.m29600W())), ch3.m21246k(), m27184L()));
            }
        } finally {
            m27190R();
            this.f23773R = iB0;
            m27191S();
        }
    }

    public final void m1(Object obj) {
        if (!e0()) {
            int iM21930p = this.f23764I.m21930p() - 1;
            if (obj instanceof yhe) {
                this.f23785e.add(obj);
            }
            O0(true, new C13523y(obj, iM21930p));
            return;
        }
        this.f23766K.W0(obj);
        if (obj instanceof yhe) {
            C0(new C13522x(obj));
            this.f23785e.add(obj);
        }
    }

    @Override // p001o.un3
    /* renamed from: n */
    public void mo27212n() {
        m27190R();
        m27190R();
        this.f23804x = go3.m29218r(this.f23805y.m43835h());
        this.f23768M = null;
    }

    public final boolean n0() {
        return this.f23762G;
    }

    public final int n1(int i) {
        int i2;
        Integer num;
        if (i >= 0) {
            int[] iArr = this.f23795o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f23764I.m21906J(i) : i2;
        }
        HashMap map = this.f23796p;
        if (map == null || (num = (Integer) map.get(Integer.valueOf(i))) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p001o.un3
    /* renamed from: o */
    public void mo27213o(k2e[] k2eVarArr) {
        o4d o4dVarL1;
        sq8.m48649h(k2eVarArr, "values");
        o4d o4dVarM27184L = m27184L();
        a1(201, go3.m29184D());
        a1(203, go3.m29186F());
        o4d o4dVar = (o4d) ov.m42712c(this, new C13520v(k2eVarArr, o4dVarM27184L));
        m27190R();
        boolean z = false;
        if (e0()) {
            o4dVarL1 = l1(o4dVarM27184L, o4dVar);
            this.f23767L = true;
        } else {
            Object objM21937w = this.f23764I.m21937w(0);
            sq8.m48647f(objM21937w, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            o4d o4dVar2 = (o4d) objM21937w;
            Object objM21937w2 = this.f23764I.m21937w(1);
            sq8.m48647f(objM21937w2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            o4d o4dVar3 = (o4d) objM21937w2;
            if (mo27201c() && sq8.m48644c(o4dVar3, o4dVar)) {
                W0();
                o4dVarL1 = o4dVar2;
            } else {
                o4dVarL1 = l1(o4dVarM27184L, o4dVar);
                z = !sq8.m48644c(o4dVarL1, o4dVar2);
            }
        }
        if (z && !e0()) {
            this.f23803w.m25207c(this.f23764I.m21924j(), o4dVarL1);
        }
        this.f23805y.m43836i(go3.m29219s(this.f23804x));
        this.f23804x = z;
        this.f23768M = o4dVarL1;
        Y0(202, go3.m29181A(), lv7.f34416a.m37983a(), o4dVarL1);
    }

    public final Object o0() {
        if (!e0()) {
            return this.f23806z ? un3.f49155a.m51802a() : this.f23764I.m21903G();
        }
        o1();
        return un3.f49155a.m51802a();
    }

    public final void o1() {
        if (!this.f23799s) {
            return;
        }
        go3.m29222v("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new qe9();
    }

    @Override // p001o.un3
    /* renamed from: p */
    public void mo27214p() {
        m27190R();
    }

    public final Object p0(cwf cwfVar, int i) {
        return cwfVar.m21904H(i);
    }

    @Override // p001o.un3
    /* renamed from: q */
    public boolean mo27215q(Object obj) {
        if (sq8.m48644c(o0(), obj)) {
            return false;
        }
        m1(obj);
        return true;
    }

    public final int q0(int i, int i2, int i3, int i4) {
        int iM21908L = this.f23764I.m21908L(i2);
        while (iM21908L != i3 && !this.f23764I.m21902F(iM21908L)) {
            iM21908L = this.f23764I.m21908L(iM21908L);
        }
        if (this.f23764I.m21902F(iM21908L)) {
            i4 = 0;
        }
        if (iM21908L == i2) {
            return i4;
        }
        int iN1 = (n1(iM21908L) - this.f23764I.m21906J(i2)) + i4;
        loop1: while (i4 < iN1 && iM21908L != i) {
            iM21908L++;
            while (iM21908L < i) {
                int iM21897A = this.f23764I.m21897A(iM21908L) + iM21908L;
                if (i >= iM21897A) {
                    i4 += n1(iM21908L);
                    iM21908L = iM21897A;
                }
            }
            break loop1;
        }
        return i4;
    }

    /* renamed from: r */
    public final void m27216r() {
        m27179G();
        this.f23789i.m46070a();
        this.f23792l.m43828a();
        this.f23794n.m43828a();
        this.f23801u.m43828a();
        this.f23805y.m43828a();
        this.f23803w.m25205a();
        if (!this.f23764I.m21923i()) {
            this.f23764I.m21918d();
        }
        if (!this.f23766K.m29598U()) {
            this.f23766K.m29584G();
        }
        this.f23771P.clear();
        m27183K();
        this.f23773R = 0;
        this.f23757B = 0;
        this.f23799s = false;
        this.f23772Q = false;
        this.f23806z = false;
        this.f23762G = false;
        this.f23798r = false;
        this.f23756A = -1;
    }

    public final void r0(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "block");
        if (!(!this.f23762G)) {
            go3.m29222v("Preparing a composition while composing is not supported".toString());
            throw new qe9();
        }
        this.f23762G = true;
        try {
            uk7Var.invoke();
        } finally {
            this.f23762G = false;
        }
    }

    public final void s0() {
        if (this.f23775T.m46073d()) {
            t0(this.f23775T.m46078i());
            this.f23775T.m46070a();
        }
    }

    public final void t0(Object[] objArr) {
        C0(new C13511m(objArr));
    }

    public final void u0() {
        int i = this.c0;
        this.c0 = 0;
        if (i > 0) {
            int i2 = this.f23781Z;
            if (i2 >= 0) {
                this.f23781Z = -1;
                D0(new C13512n(i2, i));
                return;
            }
            int i3 = this.a0;
            this.a0 = -1;
            int i4 = this.b0;
            this.b0 = -1;
            D0(new C13513o(i3, i4, i));
        }
    }

    public final void v0(boolean z) {
        int iM21932r = z ? this.f23764I.m21932r() : this.f23764I.m21924j();
        int i = iM21932r - this.f23776U;
        if (!(i >= 0)) {
            go3.m29222v("Tried to seek backward".toString());
            throw new qe9();
        }
        if (i > 0) {
            C0(new C13514p(i));
            this.f23776U = iM21932r;
        }
    }

    public final void x0() {
        int i = this.f23774S;
        if (i > 0) {
            this.f23774S = 0;
            C0(new C13515q(i));
        }
    }

    public final boolean y0(kb8 kb8Var) {
        sq8.m48649h(kb8Var, "invalidationsRequested");
        if (!this.f23786f.isEmpty()) {
            go3.m29222v("Expected applyChanges() to have been called".toString());
            throw new qe9();
        }
        if (!kb8Var.m35357j() && !(!this.f23800t.isEmpty()) && !this.f23798r) {
            return false;
        }
        m27187O(kb8Var, null);
        return !this.f23786f.isEmpty();
    }

    public final Object z0(u64 u64Var, u64 u64Var2, Integer num, List list, uk7 uk7Var) {
        Object objInvoke;
        boolean z = this.f23778W;
        boolean z2 = this.f23762G;
        int i = this.f23791k;
        try {
            this.f23778W = false;
            this.f23762G = true;
            this.f23791k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                hwc hwcVar = (hwc) list.get(i2);
                ree reeVar = (ree) hwcVar.m31227a();
                lb8 lb8Var = (lb8) hwcVar.m31228b();
                if (lb8Var != null) {
                    Object[] objArrM36856p = lb8Var.m36856p();
                    int size2 = lb8Var.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj = objArrM36856p[i3];
                        sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        e1(reeVar, obj);
                    }
                } else {
                    e1(reeVar, null);
                }
            }
            if (u64Var != null) {
                objInvoke = u64Var.mo27301s(u64Var2, num != null ? num.intValue() : -1, uk7Var);
                if (objInvoke == null) {
                }
                return objInvoke;
            }
            objInvoke = uk7Var.invoke();
            return objInvoke;
        } finally {
            this.f23778W = z;
            this.f23762G = z2;
            this.f23791k = i;
        }
    }
}
