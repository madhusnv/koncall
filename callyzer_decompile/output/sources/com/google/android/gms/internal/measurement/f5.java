package com.google.android.gms.internal.measurement;

import a3.C0043b;
import a4.InterfaceC0051a;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import lv.C4535g;
import m2.C4640e;
import s3.AbstractC6744a;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7641m;
import vw.EnumC7794a;
import w2.AbstractC7878q;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f5 {

    /* renamed from: a */
    public static final /* synthetic */ int f6192a = 0;

    /* renamed from: a */
    public static final Object m3267a(InterfaceC7641m interfaceC7641m, InterfaceC2137a interfaceC2137a, AbstractC8193c abstractC8193c) {
        Object obj;
        v3.h1 h1VarM14562w;
        Object objU0;
        C4535g c4535g;
        AbstractC7878q abstractC7878q = (AbstractC7878q) interfaceC7641m;
        boolean z6 = abstractC7878q.f37670a.f37683p;
        if (z6) {
            if (!z6) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a.f37674e;
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(interfaceC7641m);
            loop0: while (true) {
                obj = null;
                if (g0VarM14563x == null) {
                    break;
                }
                if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 524288) != 0) {
                    while (abstractC7878q2 != null) {
                        if ((abstractC7878q2.f37672c & 524288) != 0) {
                            AbstractC7878q abstractC7878qM14545f = abstractC7878q2;
                            C4640e c4640e = null;
                            while (abstractC7878qM14545f != null) {
                                if (abstractC7878qM14545f instanceof InterfaceC0051a) {
                                    obj = abstractC7878qM14545f;
                                    break loop0;
                                }
                                if ((abstractC7878qM14545f.f37672c & 524288) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                    int i10 = 0;
                                    for (AbstractC7878q abstractC7878q3 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
                                        if ((abstractC7878q3.f37672c & 524288) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC7878qM14545f = abstractC7878q3;
                                            } else {
                                                if (c4640e == null) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7878qM14545f != null) {
                                                    c4640e.m9506b(abstractC7878qM14545f);
                                                    abstractC7878qM14545f = null;
                                                }
                                                c4640e.m9506b(abstractC7878q3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        abstractC7878q2 = abstractC7878q2.f37674e;
                    }
                }
                g0VarM14563x = g0VarM14563x.m14609v();
                abstractC7878q2 = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (v3.x1) c4535g.f22541e;
            }
            InterfaceC0051a interfaceC0051a = (InterfaceC0051a) obj;
            if (interfaceC0051a != null && (objU0 = interfaceC0051a.u0((h1VarM14562w = AbstractC7634f.m14562w(interfaceC7641m)), new C0043b(1, interfaceC2137a, h1VarM14562w), abstractC8193c)) == EnumC7794a.COROUTINE_SUSPENDED) {
                return objU0;
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: b */
    public static b5 m3268b() {
        String str;
        ClassLoader classLoader = f5.class.getClassLoader();
        if (b5.class.equals(b5.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!b5.class.getPackage().equals(f5.class.getPackage())) {
                throw new IllegalArgumentException(b5.class.getName());
            }
            str = b5.class.getPackage().getName() + ".BlazeGenerated" + b5.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    AbstractC1452a.m4578y(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException(e2);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new f5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e13) {
                        Logger.getLogger(a5.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(b5.class.getSimpleName()), (Throwable) e13);
                    }
                }
                if (arrayList.size() == 1) {
                    return (b5) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (b5) b5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(e14);
                } catch (NoSuchMethodException e15) {
                    throw new IllegalStateException(e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(e16);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }
}
