package androidx.lifecycle;

import android.app.Application;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.lang.reflect.InvocationTargetException;
import p001o.dxi;
import p001o.gxi;
import p001o.hb9;
import p001o.id5;
import p001o.ixi;
import p001o.kxi;
import p001o.lb9;
import p001o.lxi;
import p001o.ob9;
import p001o.sq8;
import p001o.ya4;
import p001o.zf0;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: b */
    public static final C2130b f7653b = new C2130b(null);

    /* renamed from: c */
    public static final ya4.InterfaceC18362b f7654c = ixi.C14401a.f29352a;

    /* renamed from: a */
    public final gxi f7655a;

    /* renamed from: androidx.lifecycle.b0$b */
    public static final class C2130b {
        public C2130b() {
        }

        public /* synthetic */ C2130b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final b0 m6512a(kxi kxiVar, InterfaceC2131c interfaceC2131c, ya4 ya4Var) {
            sq8.m48649h(kxiVar, "store");
            sq8.m48649h(interfaceC2131c, "factory");
            sq8.m48649h(ya4Var, "extras");
            return new b0(kxiVar, interfaceC2131c, ya4Var);
        }
    }

    /* renamed from: androidx.lifecycle.b0$c */
    public interface InterfaceC2131c {

        /* renamed from: a */
        public static final a f7660a = a.f7661a;

        /* renamed from: androidx.lifecycle.b0$c$a */
        public static final class a {

            /* renamed from: a */
            public static final /* synthetic */ a f7661a = new a();
        }

        /* renamed from: a */
        default dxi mo6513a(ob9 ob9Var, ya4 ya4Var) {
            sq8.m48649h(ob9Var, "modelClass");
            sq8.m48649h(ya4Var, "extras");
            return mo6492b(hb9.m30150a(ob9Var), ya4Var);
        }

        /* renamed from: b */
        default dxi mo6492b(Class cls, ya4 ya4Var) {
            sq8.m48649h(cls, "modelClass");
            sq8.m48649h(ya4Var, "extras");
            return mo6367c(cls);
        }

        /* renamed from: c */
        default dxi mo6367c(Class cls) {
            sq8.m48649h(cls, "modelClass");
            return ixi.f29351a.m32903f();
        }
    }

    /* renamed from: androidx.lifecycle.b0$d */
    public static class C2132d implements InterfaceC2131c {

        /* renamed from: c */
        public static C2132d f7663c;

        /* renamed from: b */
        public static final a f7662b = new a(null);

        /* renamed from: d */
        public static final ya4.InterfaceC18362b f7664d = ixi.C14401a.f29352a;

        /* renamed from: androidx.lifecycle.b0$d$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C2132d m6516a() {
                if (C2132d.f7663c == null) {
                    C2132d.f7663c = new C2132d();
                }
                C2132d c2132d = C2132d.f7663c;
                sq8.m48646e(c2132d);
                return c2132d;
            }
        }

        @Override // androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: a */
        public dxi mo6513a(ob9 ob9Var, ya4 ya4Var) {
            sq8.m48649h(ob9Var, "modelClass");
            sq8.m48649h(ya4Var, "extras");
            return mo6492b(hb9.m30150a(ob9Var), ya4Var);
        }

        @Override // androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: b */
        public dxi mo6492b(Class cls, ya4 ya4Var) {
            sq8.m48649h(cls, "modelClass");
            sq8.m48649h(ya4Var, "extras");
            return mo6367c(cls);
        }

        @Override // androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: c */
        public dxi mo6367c(Class cls) {
            sq8.m48649h(cls, "modelClass");
            return lb9.f33547a.m36859a(cls);
        }
    }

    /* renamed from: androidx.lifecycle.b0$e */
    public static class C2133e {
        /* renamed from: d */
        public abstract void mo6493d(dxi dxiVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(kxi kxiVar, InterfaceC2131c interfaceC2131c) {
        this(kxiVar, interfaceC2131c, null, 4, null);
        sq8.m48649h(kxiVar, "store");
        sq8.m48649h(interfaceC2131c, "factory");
    }

    /* renamed from: a */
    public dxi m6505a(Class cls) {
        sq8.m48649h(cls, "modelClass");
        return m6507c(hb9.m30152c(cls));
    }

    /* renamed from: b */
    public dxi m6506b(String str, Class cls) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(cls, "modelClass");
        return this.f7655a.m29635a(hb9.m30152c(cls), str);
    }

    /* renamed from: c */
    public final dxi m6507c(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "modelClass");
        return gxi.m29634b(this.f7655a, ob9Var, null, 2, null);
    }

    /* renamed from: androidx.lifecycle.b0$a */
    public static class C2129a extends C2132d {

        /* renamed from: g */
        public static C2129a f7657g;

        /* renamed from: e */
        public final Application f7659e;

        /* renamed from: f */
        public static final b f7656f = new b(null);

        /* renamed from: h */
        public static final ya4.InterfaceC18362b f7658h = new a();

        /* renamed from: androidx.lifecycle.b0$a$a */
        public static final class a implements ya4.InterfaceC18362b {
        }

        /* renamed from: androidx.lifecycle.b0$a$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C2129a m6511a(Application application) {
                sq8.m48649h(application, "application");
                if (C2129a.f7657g == null) {
                    C2129a.f7657g = new C2129a(application);
                }
                C2129a c2129a = C2129a.f7657g;
                sq8.m48646e(c2129a);
                return c2129a;
            }
        }

        public C2129a(Application application, int i) {
            this.f7659e = application;
        }

        @Override // androidx.lifecycle.b0.C2132d, androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: b */
        public dxi mo6492b(Class cls, ya4 ya4Var) {
            sq8.m48649h(cls, "modelClass");
            sq8.m48649h(ya4Var, "extras");
            if (this.f7659e != null) {
                return mo6367c(cls);
            }
            Application application = (Application) ya4Var.mo54752a(f7658h);
            if (application != null) {
                return m6510h(cls, application);
            }
            if (zf0.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.mo6367c(cls);
        }

        @Override // androidx.lifecycle.b0.C2132d, androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: c */
        public dxi mo6367c(Class cls) {
            sq8.m48649h(cls, "modelClass");
            Application application = this.f7659e;
            if (application != null) {
                return m6510h(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* renamed from: h */
        public final dxi m6510h(Class cls, Application application) {
            if (!zf0.class.isAssignableFrom(cls)) {
                return super.mo6367c(cls);
            }
            try {
                dxi dxiVar = (dxi) cls.getConstructor(Application.class).newInstance(application);
                sq8.m48648g(dxiVar, "{\n                try {\n…          }\n            }");
                return dxiVar;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        public C2129a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C2129a(Application application) {
            this(application, 0);
            sq8.m48649h(application, "application");
        }
    }

    public b0(gxi gxiVar) {
        this.f7655a = gxiVar;
    }

    public /* synthetic */ b0(kxi kxiVar, InterfaceC2131c interfaceC2131c, ya4 ya4Var, int i, id5 id5Var) {
        this(kxiVar, interfaceC2131c, (i & 4) != 0 ? ya4.C18361a.f55136b : ya4Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(kxi kxiVar, InterfaceC2131c interfaceC2131c, ya4 ya4Var) {
        this(new gxi(kxiVar, interfaceC2131c, ya4Var));
        sq8.m48649h(kxiVar, "store");
        sq8.m48649h(interfaceC2131c, "factory");
        sq8.m48649h(ya4Var, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(lxi lxiVar) {
        sq8.m48649h(lxiVar, "owner");
        kxi viewModelStore = lxiVar.getViewModelStore();
        ixi ixiVar = ixi.f29351a;
        this(viewModelStore, ixiVar.m32901d(lxiVar), ixiVar.m32900c(lxiVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(lxi lxiVar, InterfaceC2131c interfaceC2131c) {
        this(lxiVar.getViewModelStore(), interfaceC2131c, ixi.f29351a.m32900c(lxiVar));
        sq8.m48649h(lxiVar, "owner");
        sq8.m48649h(interfaceC2131c, "factory");
    }
}
