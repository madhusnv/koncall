package p001o;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public class y54 {

    /* renamed from: d */
    public static final Logger f54903d = Logger.getLogger(y54.class.getName());

    /* renamed from: e */
    public static final q4d f54904e;

    /* renamed from: f */
    public static final y54 f54905f;

    /* renamed from: a */
    public InterfaceC18320b f54906a = new C18323e(this, null);

    /* renamed from: b */
    public final q4d f54907b;

    /* renamed from: c */
    public final int f54908c;

    /* renamed from: o.y54$a */
    public static final class C18319a extends y54 implements Closeable {
    }

    /* renamed from: o.y54$b */
    public interface InterfaceC18320b {
    }

    /* renamed from: o.y54$c */
    public static final class C18321c {

        /* renamed from: a */
        public final String f54909a;

        /* renamed from: b */
        public final Object f54910b;

        public C18321c(String str) {
            this(str, null);
        }

        /* renamed from: a */
        public Object m57225a(y54 y54Var) {
            Object objM57223k = y54Var.m57223k(this);
            return objM57223k == null ? this.f54910b : objM57223k;
        }

        public String toString() {
            return this.f54909a;
        }

        public C18321c(String str, Object obj) {
            this.f54909a = (String) y54.m57216d(str, "name");
            this.f54910b = obj;
        }
    }

    /* renamed from: o.y54$d */
    public static final class C18322d {

        /* renamed from: a */
        public static final AbstractC18324f f54911a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f54911a = m57226a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                y54.f54903d.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* renamed from: a */
        public static AbstractC18324f m57226a(AtomicReference atomicReference) {
            try {
                return (AbstractC18324f) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC18324f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new nkh();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* renamed from: o.y54$e */
    public final class C18323e implements InterfaceC18320b {
        public C18323e() {
        }

        public /* synthetic */ C18323e(y54 y54Var, w54 w54Var) {
            this();
        }
    }

    /* renamed from: o.y54$f */
    public static abstract class AbstractC18324f {
        /* renamed from: a */
        public abstract y54 mo40729a();

        /* renamed from: b */
        public abstract void mo40730b(y54 y54Var, y54 y54Var2);

        /* renamed from: c */
        public abstract y54 mo40731c(y54 y54Var);
    }

    static {
        q4d q4dVar = new q4d();
        f54904e = q4dVar;
        f54905f = new y54(null, q4dVar);
    }

    public y54(y54 y54Var, q4d q4dVar) {
        m57215c(y54Var);
        this.f54907b = q4dVar;
        int i = y54Var == null ? 0 : y54Var.f54908c + 1;
        this.f54908c = i;
        m57220r(i);
    }

    /* renamed from: c */
    public static C18319a m57215c(y54 y54Var) {
        return null;
    }

    /* renamed from: d */
    public static Object m57216d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: f */
    public static y54 m57217f() {
        y54 y54VarMo40729a = m57219o().mo40729a();
        return y54VarMo40729a == null ? f54905f : y54VarMo40729a;
    }

    /* renamed from: h */
    public static C18321c m57218h(String str) {
        return new C18321c(str);
    }

    /* renamed from: o */
    public static AbstractC18324f m57219o() {
        return C18322d.f54911a;
    }

    /* renamed from: r */
    public static void m57220r(int i) {
        if (i == 1000) {
            f54903d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    /* renamed from: a */
    public y54 m57221a() {
        y54 y54VarMo40731c = m57219o().mo40731c(this);
        return y54VarMo40731c == null ? f54905f : y54VarMo40731c;
    }

    /* renamed from: g */
    public void m57222g(y54 y54Var) {
        m57216d(y54Var, "toAttach");
        m57219o().mo40730b(this, y54Var);
    }

    /* renamed from: k */
    public Object m57223k(C18321c c18321c) {
        return this.f54907b.m44805a(c18321c);
    }

    /* renamed from: s */
    public y54 m57224s(C18321c c18321c, Object obj) {
        return new y54(this, this.f54907b.m44806b(c18321c, obj));
    }
}
