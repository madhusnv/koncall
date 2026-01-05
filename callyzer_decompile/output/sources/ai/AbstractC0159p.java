package ai;

import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import hi.n1;
import hi.r1;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import oj.C5392d;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.p */
/* loaded from: classes.dex */
public abstract class AbstractC0159p {

    /* renamed from: a */
    public static final Logger f493a = Logger.getLogger(AbstractC0159p.class.getName());

    /* renamed from: b */
    public static final ConcurrentHashMap f494b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentHashMap f495c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentHashMap f496d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentHashMap f497e;

    static {
        new ConcurrentHashMap();
        f497e = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static synchronized void m364a(String str, Class cls, boolean z6) {
        ConcurrentHashMap concurrentHashMap = f494b;
        if (concurrentHashMap.containsKey(str)) {
            C0158o c0158o = (C0158o) concurrentHashMap.get(str);
            if (c0158o.f492a.getClass().equals(cls)) {
                if (z6 && !((Boolean) f496d.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            f493a.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + c0158o.f492a.getClass().getName() + ", cannot be re-registered with " + cls.getName());
        }
    }

    /* renamed from: b */
    public static synchronized C0158o m365b(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = f494b;
        if (!concurrentHashMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (C0158o) concurrentHashMap.get(str);
    }

    /* renamed from: c */
    public static Object m366c(String str, byte[] bArr) {
        C1381h c1381h = AbstractC1382i.f7044b;
        return m367d(str, AbstractC1382i.m4277c(0, bArr.length, bArr), InterfaceC0144a.class);
    }

    /* renamed from: d */
    public static Object m367d(String str, AbstractC1382i abstractC1382i, Class cls) {
        C0158o c0158oM365b = m365b(str);
        Set setKeySet = ((Map) c0158oM365b.f492a.f485c).keySet();
        AbstractC0152i abstractC0152i = c0158oM365b.f492a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb2 = new StringBuilder("Primitive type ");
            sb2.append(cls.getName());
            sb2.append(" not supported by key manager of type ");
            sb2.append(abstractC0152i.getClass());
            sb2.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) abstractC0152i.f485c).keySet();
            StringBuilder sb3 = new StringBuilder();
            boolean z6 = true;
            for (Class cls2 : setKeySet2) {
                if (!z6) {
                    sb3.append(", ");
                }
                sb3.append(cls2.getCanonicalName());
                z6 = false;
            }
            sb2.append(sb3.toString());
            throw new GeneralSecurityException(sb2.toString());
        }
        try {
            if (!((Map) abstractC0152i.f485c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC0152i.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC1374a abstractC1374aMo354h = abstractC0152i.mo354h(abstractC1382i);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                abstractC0152i.mo356j(abstractC1374aMo354h);
                return abstractC0152i.m351e(abstractC1374aMo354h, cls);
            } catch (InvalidProtocolBufferException e2) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC0152i.f483a).getName()), e2);
            }
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    /* renamed from: e */
    public static synchronized n1 m368e(r1 r1Var) {
        C8989c c8989c;
        AbstractC0152i abstractC0152i = m365b(r1Var.m7191r()).f492a;
        c8989c = new C8989c(abstractC0152i, (Class) abstractC0152i.f484b);
        if (!((Boolean) f496d.get(r1Var.m7191r())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + r1Var.m7191r());
        }
        return c8989c.c0(r1Var.m7192s());
    }

    /* renamed from: f */
    public static synchronized void m369f(AbstractC0152i abstractC0152i, boolean z6) {
        try {
            String strMo350d = abstractC0152i.mo350d();
            m364a(strMo350d, abstractC0152i.getClass(), z6);
            ConcurrentHashMap concurrentHashMap = f494b;
            if (!concurrentHashMap.containsKey(strMo350d)) {
                concurrentHashMap.put(strMo350d, new C0158o(abstractC0152i));
                f495c.put(strMo350d, new C5392d(1));
            }
            f496d.put(strMo350d, Boolean.valueOf(z6));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g */
    public static synchronized void m370g(InterfaceC0157n interfaceC0157n) {
        try {
            Class clsMo362b = interfaceC0157n.mo362b();
            ConcurrentHashMap concurrentHashMap = f497e;
            if (concurrentHashMap.containsKey(clsMo362b)) {
                InterfaceC0157n interfaceC0157n2 = (InterfaceC0157n) concurrentHashMap.get(clsMo362b);
                if (!interfaceC0157n.getClass().equals(interfaceC0157n2.getClass())) {
                    f493a.warning("Attempted overwrite of a registered SetWrapper for type " + clsMo362b);
                    throw new GeneralSecurityException("SetWrapper for primitive (" + clsMo362b.getName() + ") is already registered to be " + interfaceC0157n2.getClass().getName() + ", cannot be re-registered with " + interfaceC0157n.getClass().getName());
                }
            }
            concurrentHashMap.put(clsMo362b, interfaceC0157n);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
